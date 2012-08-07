/**
 * @author Ali Koudri - ali.koudri@thalesgroup.com
 */

package org.obeonetwork.dsl.spem.dashboard;

import java.text.MessageFormat;

import org.eclipse.core.resources.IProject;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;

public class DashboardMediator {

	private static final boolean STRICT = true;

	private DashboardFigure view;

	private IProject project;
	
	private DashboardPart part;

	public DashboardMediator(DashboardPart part) {
		this.part = part;
	}

	public boolean isStrict() {
		return STRICT;
	}

	public void setView(DashboardFigure view) {
		this.view = view;
		view.getMethodoFigure().getStructureFigure().addAction(createLinkFigure("Create methodology structure", new CreateSpemModelAction()));
		view.getMethodoFigure().getTasksFigure().addAction(createLinkFigure("Define tasks", new NullAction()));
		view.getProcessFigure().getStructureFigure().addAction(createLinkFigure("Create process structure", new NullAction()));
		view.getProcessFigure().getActivitiesFigure().addAction(createLinkFigure("Capture activities", new NullAction()));
		view.getProcessFigure().getWorkflowFigure().addAction(createLinkFigure("Capture workflow", new NullAction()));
		updateStatus();
	}

	/**
	 * Also initializes the action.
	 */
	protected IFigure createLinkFigure(String text, DashboardAction action) {
		HyperlinkFigure linkFigure = new HyperlinkFigure(action);
		linkFigure.setText(text);
		return linkFigure;
	}

	public IProject getProject() {
		return project;
	}

	public void setProjectAndState(IProject project) {
		this.project = project;
		updateStatus();
	}

	public void updateStatus() {
		if (project == null) {
			view.getStatusLine(0).setText("Select the project");
		} else {
			view.getStatusLine(0).setText(MessageFormat.format("Project", new Object[] { project.getName() }));
		}
		view.repaint(); // update hyperlinks
	}

	protected void setModelName(ModelFigure figure, URI uri) {
		figure.setName(uri == null ? null : uri.lastSegment());
		figure.setFullName(uri == null ? null : uri.toString());
	}
	
	protected class CreateSpemModelAction implements DashboardAction
	{
		private boolean enabled = true;

		public boolean isEnabled() {
			// TODO Auto-generated method stub
			return enabled;
		}

		public void run() {
			IStructuredSelection selection = part.getSelection();
			if (selection == null) return;
			//enabled = false;
			SpemModelWizard wizard = new SpemModelWizard();
			wizard.init(part.getSite().getWorkbenchWindow().getWorkbench(), selection);
			WizardDialog dialog = new WizardDialog(part.getSite().getShell(), wizard);
			dialog.create();
			dialog.open();
		}
		
	}
	
	protected class NullAction implements DashboardAction
	{
		public boolean isEnabled() {
			// TODO Auto-generated method stub
			return false;
		}

		public void run() {
			System.out.println("Action not implemented");
		}
		
	}

	public IProject getActiveProject() {
		// TODO Auto-generated method stub
		return null;
	}

}
