/**
 * @author Ali Koudri - ali.koudri@thalesgroup.com
 */


package org.obeonetwork.dsl.spem.dashboard;

import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

public class DashboardFigure extends RectangleFigure {

	private static final int LINE_WIDTH = 6;

	private static final int ARROW_LENGTH = 15;

	private static final Color DASHBOARD_BG = ColorConstants.white;

	private static final Color DASHBOARD_FG = new Color(null, 102, 128, 184);

	private ImageFigure logoFigure;

	private IFigure statusFigure;

	// nodes
	
	private Ellipse initFigure = new Ellipse();

	private MethodologyFigure methodoFigure;

	private ProcessFigure processFigure;
	
	private RectangleFigure endFigure = new RectangleFigure();

	// flows

	private FlowFigure init2methoFlow;

	private FlowFigure metho2processFlow;

	private FlowFigure process2endFlow;
	
	// reference to the image registry
	
	private ImageRegistry imgReg;

	public DashboardFigure() {
		imgReg = Activator.getDefault().getImageRegistry();
		add(logoFigure = new ImageFigure() {

			@Override
			protected void paintFigure(Graphics graphics) {
				if (getImage() != null) {
					graphics.drawImage(getImage(), new Rectangle(getImage().getBounds()), getBounds());
				}
			}
		});
		Image logoImage = imgReg.get(Activator.IMG_MDA_ID);
		if (logoImage != null) {
			logoFigure.setImage(logoImage);
		}
		initFigure.setSize(20,20);
		initFigure.setBackgroundColor(DASHBOARD_FG);
		add(initFigure);
		add(methodoFigure = createMethodologyFigure("Methodology"));
		add(processFigure = createProcessFigure("Process"));
		endFigure.setSize(20, 20);
		endFigure.setBackgroundColor(DASHBOARD_FG);
		add(endFigure);
		add(init2methoFlow = createFlowFigure(true));
		add(metho2processFlow = createFlowFigure(true));
		add(process2endFlow = createFlowFigure(true));
		add(statusFigure = new Figure());
		statusFigure.setFont(JFaceResources.getBannerFont());
		ToolbarLayout statusLayout = new ToolbarLayout();
		statusLayout.setStretchMinorAxis(false);
		statusFigure.setLayoutManager(statusLayout);
		statusFigure.add(new Label());
		statusFigure.add(new Label());
		setLayoutManager(new DashboardLayout());
		setBorder(new MarginBorder(10));
		setBackgroundColor(DASHBOARD_BG);
		setForegroundColor(DASHBOARD_FG);
	}

	public Label getStatusLine(int i) {
		return (Label) statusFigure.getChildren().get(i);
	}

	protected MethodologyFigure createMethodologyFigure(String description) {
		MethodologyFigure modelFigure = new MethodologyFigure();
		return modelFigure;
	}
	
	protected ProcessFigure createProcessFigure(String description) {
		ProcessFigure modelFigure = new ProcessFigure();
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
		flowFigure.setForegroundColor(DASHBOARD_FG);
		flowFigure.setLineWidth(LINE_WIDTH);
		return flowFigure;
	}

	@Override
	protected void outlineShape(Graphics graphics) {
	}

	public MethodologyFigure getMethodoFigure() {
		return methodoFigure;
	}

	public ProcessFigure getProcessFigure() {
		return processFigure;
	}

	private class DashboardLayout extends AbstractLayout {

		private static final int MAX_BOX_WIDTH = 800;

		private static final int BOX_SPACING = 40;

		@Override
		protected Dimension calculatePreferredSize(IFigure container, int wHint, int hHint) {
			Dimension d = getLayoutData().getSize();
			Insets insets = container.getInsets();
			d = new Dimension(d.width + insets.getWidth(), d.height + insets.getHeight());
			return d.union(getBorderPreferredSize(container));
		}

		public void layout(IFigure container) {
			getLayoutData().apply(container.getClientArea().getLocation());
		}

		protected LayoutData getLayoutData() {
			Dimension initSize = initFigure.getPreferredSize();
			initSize.width = Math.min(initSize.width, MAX_BOX_WIDTH);
			Dimension methodoSize = methodoFigure.getPreferredSize();
			methodoSize.width = Math.min(methodoSize.width, MAX_BOX_WIDTH);
			Dimension processSize = processFigure.getPreferredSize();
			processSize.width = Math.min(processSize.width, MAX_BOX_WIDTH);
			Dimension endSize = endFigure.getPreferredSize();
			endSize.width = Math.min(endSize.width, MAX_BOX_WIDTH);

			LayoutData data = new LayoutData();

			// boxes
			int initY = BOX_SPACING;
			int methodoY = initY + initSize.height + BOX_SPACING;
			int processY = methodoY + methodoSize.height + BOX_SPACING;
			int endY = processY + processSize.height + BOX_SPACING;
			int gap = processSize.width - methodoSize.width;
			data.initBox = new Rectangle(processSize.width / 2, initY, initSize.width, initSize.height);
			data.methodoBox = new Rectangle(gap / 2, methodoY, methodoSize.width, methodoSize.height);
			data.processBox = new Rectangle(0, processY, processSize.width, processSize.height);
			data.endBox = new Rectangle(processSize.width / 2, endY, endSize.width, endSize.height);
			// points
			int pointH = data.initBox.x + data.initBox.width / 2;
			data.init2methodoPoints = new PointList(2);
			data.init2methodoPoints.addPoint(pointH, data.initBox.y + data.initBox.height);
			data.init2methodoPoints.addPoint(pointH, data.methodoBox.y);
			data.methodo2processPoints = new PointList(2);
			data.methodo2processPoints.addPoint(pointH, data.methodoBox.y + data.methodoBox.height);
			data.methodo2processPoints.addPoint(pointH, data.processBox.y);
			data.process2endPoints = new PointList(2);
			data.process2endPoints.addPoint(pointH, data.processBox.y + data.processBox.height);
			data.process2endPoints.addPoint(pointH, data.endBox.y);
			// logo and status
			Dimension logoSize = logoFigure.getPreferredSize();
			data.logoBox = new Rectangle(0, 0, logoSize.width, logoSize.height);
			Dimension statusSize = statusFigure.getPreferredSize();
			int statusX = Math.max(data.methodoBox.x + data.methodoBox.width - statusSize.width, data.processBox.x + data.processBox.width + BOX_SPACING);
			data.statusBox = new Rectangle(statusX, 0, statusSize.width, statusSize.height);
			return data;
		}

		private class LayoutData {

			public Rectangle logoBox;

			public Rectangle statusBox;

			public Rectangle initBox;

			public Rectangle methodoBox;

			public Rectangle processBox;

			public Rectangle endBox;

			public PointList init2methodoPoints;

			public PointList methodo2processPoints;

			public PointList process2endPoints;

			public void apply(Point offset) {
				logoFigure.setBounds(logoBox.getTranslated(offset));
				statusFigure.setBounds(statusBox.getTranslated(offset));
				initFigure.setBounds(initBox.getTranslated(offset));
				methodoFigure.setBounds(methodoBox.getTranslated(offset));
				processFigure.setBounds(processBox.getTranslated(offset));
				endFigure.setBounds(endBox.getTranslated(offset));
				init2methoFlow.setPoints(getTranslated(init2methodoPoints, offset));
				metho2processFlow.setPoints(getTranslated(methodo2processPoints, offset));
				process2endFlow.setPoints(getTranslated(process2endPoints, offset));
			}

			private PointList getTranslated(PointList source, Point offset) {
				PointList target = new PointList(source.size());
				target.addAll(source);
				target.translate(offset);
				return target;
			}

			public Dimension getSize() {
				Rectangle bounds = logoBox.getCopy();
				bounds.union(statusBox);
				bounds.union(initBox);
				bounds.union(methodoBox);
				bounds.union(processBox);
				bounds.union(endBox);
				return bounds.getSize();
			}
		}
	}

}
