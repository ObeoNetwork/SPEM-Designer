package org.obeonetwork.dsl.spem.dashboard;

import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

public class DashboardPart extends ViewPart {

	private FigureCanvas canvas;
	private DashboardMediator mediator;
	private ISelectionListener projectUpdater;
	private IProject activeProject;
	private IStructuredSelection vselection;

	@Override
	public void createPartControl(Composite parent) {
		canvas = new FigureCanvas(parent);
		mediator = new DashboardMediator(this);
		DashboardFigure contents = new DashboardFigure();
		mediator.setView(contents);
		canvas.setContents(contents);
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(projectUpdater = new ISelectionListener() {
			
			public void selectionChanged(IWorkbenchPart part, ISelection selection) {
				if (selection instanceof IStructuredSelection)
					vselection = (IStructuredSelection)selection;
				updateActiveProject(selection);				
			}			
		});
		updateActiveProject(getSite().getWorkbenchWindow().getSelectionService().getSelection());
	}
	
	public IStructuredSelection getSelection()
	{
		return vselection;
	}
	
	@Override
	public void dispose() {
		if (mediator != null) {
			mediator = null;
		}
		if (projectUpdater != null)
		{
			getSite().getWorkbenchWindow().getSelectionService().removeSelectionListener(projectUpdater);
			projectUpdater = null;
		}
		super.dispose();
	}

	protected void updateActiveProject(ISelection selection) {
		if (!(selection instanceof IStructuredSelection)) {
			return;
		}
		IProject newActiveProject = null;
		for (Iterator<?> it = ((IStructuredSelection) selection).iterator(); it.hasNext();) {
			Object element = it.next();
			IProject project = null;
			if (element instanceof IResource) {
				project = ((IResource) element).getProject();
			} else if (element instanceof IAdaptable) {
				IResource resource = (IResource) ((IAdaptable) element).getAdapter(IResource.class);
				if (resource != null) {
					project = resource.getProject();
				}
			}
			if (project == null) {
				continue;
			}
			if (project.equals(activeProject)) {
				// if current active project is selected do not change it
				return;
			}
			if (newActiveProject == null) {
				// new active project is the first selected project
				newActiveProject = project;
			}
		}	
	}

	@Override
	public void setFocus() {
		if (canvas != null) {
			canvas.setFocus();
		}
	}

	@Override
	public void init(IViewSite site, IMemento memento) throws PartInitException {
		super.init(site, memento);
	}

}
