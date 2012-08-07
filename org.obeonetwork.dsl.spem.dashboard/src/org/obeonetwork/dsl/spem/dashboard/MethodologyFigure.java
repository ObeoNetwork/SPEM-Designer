/**
 * @author Ali Koudri - ali.koudri@thalesgroup.com
 */

package org.obeonetwork.dsl.spem.dashboard;

import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

public class MethodologyFigure extends RoundedRectangle {

	private static final int LINE_WIDTH = 6;

	private static final int TEXT_GAP = LINE_WIDTH + 3;

	private static final int ARROW_LENGTH = 15;

	private static final Color METHODOLOGY_BG = new Color(null, 171, 189, 248);

	private static final Color METHODOLOGY_FG = new Color(null, 102, 128, 184);

	private static final Color MODEL_BG = ColorConstants.white;

	// nodes
	
	private Ellipse initFigure = new Ellipse();

	private ModelFigure structureFigure;

	private ModelFigure tasksFigure;
	
	private RectangleFigure endFigure = new RectangleFigure();

	// flows

	private FlowFigure init2structFlow;

	private FlowFigure struct2tasksFlow;

	private FlowFigure tasks2endFlow;

	public MethodologyFigure() {
		initFigure.setSize(20,20);
		initFigure.setBackgroundColor(METHODOLOGY_FG);
		add(initFigure);
		add(structureFigure = createModelFigure("Methodology Structure"));
		add(tasksFigure = createModelFigure("Tasks definition"));
		endFigure.setSize(20, 20);
		endFigure.setBackgroundColor(METHODOLOGY_FG);
		add(endFigure);
		add(init2structFlow = createFlowFigure(true));
		add(struct2tasksFlow = createFlowFigure(true));
		add(tasks2endFlow = createFlowFigure(true));
		setLayoutManager(new MethodologyLayout());
		setBorder(new MarginBorder(10));
		setBackgroundColor(METHODOLOGY_BG);
		setForegroundColor(METHODOLOGY_FG);
	}

	protected ModelFigure createModelFigure(String description) {
		ModelFigure modelFigure = new ModelFigure();
		modelFigure.setDescription(description);
		modelFigure.setBackgroundColor(MODEL_BG);
		modelFigure.setForegroundColor(METHODOLOGY_FG);
		modelFigure.setLineWidth(LINE_WIDTH);
		modelFigure.setSpacing(TEXT_GAP);
		return modelFigure;
	}

	protected FlowFigure createFlowFigure(boolean directed) {
		FlowFigure flowFigure = new FlowFigure();
		if (directed) {
			PolygonDecoration decoration = new PolygonDecoration();
			PointList template = new PointList();
			template.addPoint(0, -LINE_WIDTH / 2);
			template.addPoint(0, LINE_WIDTH / 2);
			template.addPoint(-ARROW_LENGTH, LINE_WIDTH / 2 + 10);
			template.addPoint(-ARROW_LENGTH, -(LINE_WIDTH / 2 + 10));
			decoration.setTemplate(template);
			decoration.setScale(1, 1);
			flowFigure.setTargetDecoration(decoration);
		}
		flowFigure.setForegroundColor(METHODOLOGY_FG);
		flowFigure.setLineWidth(LINE_WIDTH);
		return flowFigure;
	}

	@Override
	protected void outlineShape(Graphics graphics) {
	}

	public ModelFigure getStructureFigure() {
		return structureFigure;
	}

	public ModelFigure getTasksFigure() {
		return tasksFigure;
	}

	private class MethodologyLayout extends AbstractLayout {

		private static final int MAX_BOX_WIDTH = 180;

		private static final int BOX_SPACING = 40;
		
		private LayoutData data = null;
		
		private Dimension dim = null;

		@Override
		protected Dimension calculatePreferredSize(IFigure container, int wHint, int hHint) {
			if (dim != null) return dim;
			dim = getLayoutData().getSize();
			Insets insets = container.getInsets();
			dim = new Dimension(dim.width + insets.getWidth(), dim.height + insets.getHeight()).union(getBorderPreferredSize(container));
			return dim;
		}

		public void layout(IFigure container) {
			getLayoutData().apply(container.getClientArea().getLocation());
		}

		protected LayoutData getLayoutData() {
			if (data != null) return data;
			Dimension initSize = initFigure.getPreferredSize();
			initSize.width = Math.min(initSize.width, MAX_BOX_WIDTH);
			Dimension structSize = structureFigure.getPreferredSize();
			structSize.width = Math.min(structSize.width, MAX_BOX_WIDTH);
			Dimension tasksSize = tasksFigure.getPreferredSize();
			tasksSize.width = Math.min(tasksSize.width, MAX_BOX_WIDTH);
			Dimension endSize = endFigure.getPreferredSize();
			endSize.width = Math.min(endSize.width, MAX_BOX_WIDTH);

			data = new LayoutData();

			// boxes
			int initX = 0;
			int structX = initX + initSize.width + BOX_SPACING;
			int tasksX = structX + structSize.width + BOX_SPACING;
			int endX = tasksX + tasksSize.width + BOX_SPACING;
			data.initBox = new Rectangle(initX, structSize.height / 2, initSize.width, initSize.height);
			data.structBox = new Rectangle(structX, 0, structSize.width, structSize.height);
			data.tasksBox = new Rectangle(tasksX, 0, tasksSize.width, tasksSize.height);
			data.endBox = new Rectangle(endX, tasksSize.height / 2, endSize.width, endSize.height);
			// points
			int pointH = data.initBox.y + data.initBox.height / 2;
			data.init2structPoints = new PointList(2);
			data.init2structPoints.addPoint(data.initBox.x + data.initBox.width, pointH);
			data.init2structPoints.addPoint(data.structBox.x, pointH);
			data.struct2tasksPoints = new PointList(2);
			data.struct2tasksPoints.addPoint(data.structBox.x + data.structBox.width, pointH);
			data.struct2tasksPoints.addPoint(data.tasksBox.x, pointH);
			data.tasks2endPoints = new PointList(2);
			data.tasks2endPoints.addPoint(data.tasksBox.x + data.tasksBox.width, pointH);
			data.tasks2endPoints.addPoint(data.endBox.x, pointH);
			return data;
		}

		private class LayoutData {

			public Rectangle initBox;

			public Rectangle structBox;

			public Rectangle tasksBox;

			public Rectangle endBox;

			public PointList init2structPoints;

			public PointList struct2tasksPoints;

			public PointList tasks2endPoints;

			public void apply(Point offset) {
				initFigure.setBounds(initBox.getTranslated(offset));
				structureFigure.setBounds(structBox.getTranslated(offset));
				tasksFigure.setBounds(tasksBox.getTranslated(offset));
				endFigure.setBounds(endBox.getTranslated(offset));
				init2structFlow.setPoints(getTranslated(init2structPoints, offset));
				struct2tasksFlow.setPoints(getTranslated(struct2tasksPoints, offset));
				tasks2endFlow.setPoints(getTranslated(tasks2endPoints, offset));
			}

			private PointList getTranslated(PointList source, Point offset) {
				PointList target = new PointList(source.size());
				target.addAll(source);
				target.translate(offset);
				return target;
			}

			public Dimension getSize() {
				bounds.union(initBox);
				bounds.union(structBox);
				bounds.union(tasksBox);
				bounds.union(endBox);
				return bounds.getSize();
			}
		}
	}

}
