/**
 * @author Ali Koudri - ali.koudri@thalesgroup.com
 */

package org.obeonetwork.dsl.spem.extensions;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.obeonetwork.dsl.spem.DescribableElement;

public class DescriptionEditor extends EditorPart implements  ModifyListener {
	
	private boolean dirty = false;
	private Text modelTitle, modelShortDesc, modelDesc;
	private DescribableElement element;
	
	public DescriptionEditor(){}

	@Override
	public void doSave(IProgressMonitor monitor) {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(element);
		if (domain == null) return;
		CommandStack stack = domain.getCommandStack();
		stack.execute(new RecordingCommand(domain) {
			
			@Override
			protected void doExecute() {
				element.setPresentationName(modelTitle.getText());
				element.setBriefDescription(modelShortDesc.getText());
				element.setMainDescription(modelDesc.getText());				
			}
		});
		setDirty(false);
	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		setSite(site);
		setInput(input);
		element = ((DescriptionEditorInput) input).getElement();
	}

	@Override
	public boolean isDirty() {
		return dirty;
	}
	
	@Override
	public void doSaveAs() {}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public void createPartControl(Composite parent) {
		//Composite nécessaire ? Pourquoi ne pas ajouter directement sur le parent ?
		Composite page = new Composite(parent, SWT.NONE);
		page.setLayout(new GridLayout(2, false));
		Label label;
		GridData gd;
		//Ajout du label title
		label = new Label(page, SWT.NONE);
		label.setText("Presentation Name: ");
		gd = new GridData(SWT.RIGHT, SWT.TOP, false, false, 1, 1);
		label.setLayoutData(gd);
		//Ajout du champs title
		String presentationName = element.getPresentationName();
		if (presentationName == null) presentationName = "";
		modelTitle = new Text(page, SWT.SINGLE | SWT.BORDER);
		gd = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		modelTitle.setLayoutData(gd);
		modelTitle.setText(presentationName);
		modelTitle.addModifyListener(this);
		//Ajout du label short desc
		label = new Label(page, SWT.NONE);
		label.setText("Short Description: ");
		gd = new GridData(SWT.RIGHT, SWT.TOP, false, false, 1, 1);
		label.setLayoutData(gd);
		//Ajout du champs short description
		String briefDescription = element.getBriefDescription();
		if (briefDescription == null) briefDescription = "";
		modelShortDesc = new Text(page, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		gd = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd.heightHint = 100;
		modelShortDesc.setLayoutData(gd);
		modelShortDesc.setText(briefDescription);
		modelShortDesc.addModifyListener(this);
		//Ajout du label desc
		label = new Label(page, SWT.NONE);
		label.setText("Description: ");
		gd = new GridData(SWT.RIGHT, SWT.TOP, false, false, 1, 1);
		label.setLayoutData(gd);
		//Ajout du champs description
		String description = element.getMainDescription();
		if (description == null) description = "";
		modelDesc = new Text(page, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		gd = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd.heightHint = 400;
		modelDesc.setLayoutData(gd);
		modelDesc.setText(description);
		modelDesc.addModifyListener(this);
	}

	@Override
	public void setFocus() {}
	
	protected void setDirty(boolean dirty)
	{
		this.dirty = dirty;
		firePropertyChange(PROP_DIRTY);
	}

	public void modifyText(ModifyEvent e) {
		if (! dirty)
			setDirty(true);
	}

}
