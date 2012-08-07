package org.obeonetwork.dsl.spem.design.actions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.obeonetwork.dsl.spem.DescribableElement;
import org.obeonetwork.dsl.spem.extensions.DescriptionEditorInput;

import fr.obeo.dsl.viewpoint.tools.api.ui.IExternalJavaAction;

public class OpenDescriptionAction implements IExternalJavaAction {
	
	private DescribableElement element = null;

	public boolean canExecute(Collection<? extends EObject> selections) {
		if (selections.size() != 1) return false;
		EObject o = selections.iterator().next();
		if (! (o instanceof DescribableElement)) return false;
		element = (DescribableElement)o;
		return true;
	}

	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {
		if (element == null) return;
		IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().findEditor("org.obeonetwork.dsl.spem.design.descriptionEditor");
		if (desc == null) return;
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		try {
			page.openEditor(new DescriptionEditorInput(element), desc.getId());
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}

}
