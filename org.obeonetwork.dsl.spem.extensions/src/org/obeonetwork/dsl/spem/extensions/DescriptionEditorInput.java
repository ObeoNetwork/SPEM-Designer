/**
 * @author Ali Koudri - ali.koudri@thalesgroup.com
 */

package org.obeonetwork.dsl.spem.extensions;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IStorageEditorInput;

import org.obeonetwork.dsl.spem.DescribableElement;

public class DescriptionEditorInput implements IStorageEditorInput {
	
	private DescribableElement element;
	
	public DescriptionEditorInput(DescribableElement element)
	{
		this.element = element;
	}

	public IStorage getStorage() throws CoreException {
		return null;
	}

	public boolean exists() {
		return false;
	}

	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	public String getName() {
		return "DescribableElement";
	}

	public IPersistableElement getPersistable() {
		return null;
	}

	public String getToolTipText() {
		return "Element Description";
	}

	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		return null;
	}

	public DescribableElement getElement() {
		return element;
	}

	public void setElement(DescribableElement element) {
		this.element = element;
	}

}
