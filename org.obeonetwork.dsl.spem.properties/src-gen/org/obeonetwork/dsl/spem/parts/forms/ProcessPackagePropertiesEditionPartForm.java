/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.obeonetwork.dsl.spem.parts.ProcessPackagePropertiesEditionPart;
import org.obeonetwork.dsl.spem.parts.SpemViewsRepository;
import org.obeonetwork.dsl.spem.providers.SpemMessages;


// End of user code

/**
 * 
 * 
 */
public class ProcessPackagePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ProcessPackagePropertiesEditionPart {

	protected Text name;
	protected ReferencesTable ownedProcessMember;
	protected List<ViewerFilter> ownedProcessMemberBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedProcessMemberFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ProcessPackagePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence processPackageStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = processPackageStep.addStep(SpemViewsRepository.ProcessPackage.Properties.class);
		propertiesStep.addStep(SpemViewsRepository.ProcessPackage.Properties.name);
		propertiesStep.addStep(SpemViewsRepository.ProcessPackage.Properties.ownedProcessMember);
		
		
		composer = new PartComposer(processPackageStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SpemViewsRepository.ProcessPackage.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.ProcessPackage.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.ProcessPackage.Properties.ownedProcessMember) {
					return createOwnedProcessMemberTableComposition(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(SpemMessages.ProcessPackagePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, SpemMessages.ProcessPackagePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.ProcessPackage.Properties.name, SpemViewsRepository.FORM_KIND));
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPackagePropertiesEditionPartForm.this, SpemViewsRepository.ProcessPackage.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPackagePropertiesEditionPartForm.this, SpemViewsRepository.ProcessPackage.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, SpemViewsRepository.ProcessPackage.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.ProcessPackage.Properties.name, SpemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedProcessMemberTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.ownedProcessMember = new ReferencesTable(SpemMessages.ProcessPackagePropertiesEditionPart_OwnedProcessMemberLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPackagePropertiesEditionPartForm.this, SpemViewsRepository.ProcessPackage.Properties.ownedProcessMember, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ownedProcessMember.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPackagePropertiesEditionPartForm.this, SpemViewsRepository.ProcessPackage.Properties.ownedProcessMember, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ownedProcessMember.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPackagePropertiesEditionPartForm.this, SpemViewsRepository.ProcessPackage.Properties.ownedProcessMember, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ownedProcessMember.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPackagePropertiesEditionPartForm.this, SpemViewsRepository.ProcessPackage.Properties.ownedProcessMember, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ownedProcessMember.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.ownedProcessMemberFilters) {
			this.ownedProcessMember.addFilter(filter);
		}
		this.ownedProcessMember.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.ProcessPackage.Properties.ownedProcessMember, SpemViewsRepository.FORM_KIND));
		this.ownedProcessMember.createControls(parent, widgetFactory);
		this.ownedProcessMember.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPackagePropertiesEditionPartForm.this, SpemViewsRepository.ProcessPackage.Properties.ownedProcessMember, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ownedProcessMemberData = new GridData(GridData.FILL_HORIZONTAL);
		ownedProcessMemberData.horizontalSpan = 3;
		this.ownedProcessMember.setLayoutData(ownedProcessMemberData);
		this.ownedProcessMember.setLowerBound(0);
		this.ownedProcessMember.setUpperBound(-1);
		ownedProcessMember.setID(SpemViewsRepository.ProcessPackage.Properties.ownedProcessMember);
		ownedProcessMember.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.ProcessPackagePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.ProcessPackagePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.ProcessPackagePropertiesEditionPart#initOwnedProcessMember(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedProcessMember(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedProcessMember.setContentProvider(contentProvider);
		ownedProcessMember.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.ProcessPackagePropertiesEditionPart#updateOwnedProcessMember()
	 * 
	 */
	public void updateOwnedProcessMember() {
	ownedProcessMember.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.ProcessPackagePropertiesEditionPart#addFilterOwnedProcessMember(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOwnedProcessMember(ViewerFilter filter) {
		ownedProcessMemberFilters.add(filter);
		if (this.ownedProcessMember != null) {
			this.ownedProcessMember.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.ProcessPackagePropertiesEditionPart#addBusinessFilterOwnedProcessMember(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwnedProcessMember(ViewerFilter filter) {
		ownedProcessMemberBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.ProcessPackagePropertiesEditionPart#isContainedInOwnedProcessMemberTable(EObject element)
	 * 
	 */
	public boolean isContainedInOwnedProcessMemberTable(EObject element) {
		return ((ReferencesTableSettings)ownedProcessMember.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SpemMessages.ProcessPackage_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
