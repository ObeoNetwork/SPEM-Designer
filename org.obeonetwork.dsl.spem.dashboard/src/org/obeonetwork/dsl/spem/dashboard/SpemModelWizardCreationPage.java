/**
 * @author Ali Koudri - ali.koudri@thalesgroup.com
 */

package org.obeonetwork.dsl.spem.dashboard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class SpemModelWizardCreationPage extends WizardNewFileCreationPage {

	public SpemModelWizardCreationPage(String pageName,
			IStructuredSelection selection) {
		super(pageName, selection);
	}

	@Override
	protected boolean validatePage() {
		if (super.validatePage())
		{
			String extension = new Path(getFileName()).getFileExtension();
			if (extension == null)
			{
				if (getModelFile().exists())
				{
					setMessage("This file already exists", ERROR);
					return false;
				}
				return true;
			}
		}
		return false;
	}
	
	public IFile getModelFile()
	{
		return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName().concat(".spem")));
	}

}
