/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.uma.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.obeonetwork.dsl.spem.uma.parts.DeliveryProcessPackagePropertiesEditionPart;
import org.obeonetwork.dsl.spem.uma.parts.UmaViewsRepository;
import org.obeonetwork.dsl.spem.uma.providers.UmaMessages;


// End of user code

/**
 * 
 * 
 */
public class DeliveryProcessPackagePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, DeliveryProcessPackagePropertiesEditionPart {

	protected Text name;
protected ReferencesTable ownedProcessMember;
protected List<ViewerFilter> ownedProcessMemberBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> ownedProcessMemberFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DeliveryProcessPackagePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence deliveryProcessPackageStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = deliveryProcessPackageStep.addStep(UmaViewsRepository.DeliveryProcessPackage.Properties.class);
		propertiesStep.addStep(UmaViewsRepository.DeliveryProcessPackage.Properties.name);
		propertiesStep.addStep(UmaViewsRepository.DeliveryProcessPackage.Properties.ownedProcessMember);
		
		
		composer = new PartComposer(deliveryProcessPackageStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == UmaViewsRepository.DeliveryProcessPackage.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == UmaViewsRepository.DeliveryProcessPackage.Properties.name) {
					return createNameText(parent);
				}
				if (key == UmaViewsRepository.DeliveryProcessPackage.Properties.ownedProcessMember) {
					return createOwnedProcessMemberAdvancedTableComposition(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(UmaMessages.DeliveryProcessPackagePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, UmaMessages.DeliveryProcessPackagePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.DeliveryProcessPackage.Properties.name, UmaViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DeliveryProcessPackagePropertiesEditionPartImpl.this, UmaViewsRepository.DeliveryProcessPackage.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DeliveryProcessPackagePropertiesEditionPartImpl.this, UmaViewsRepository.DeliveryProcessPackage.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, UmaViewsRepository.DeliveryProcessPackage.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.DeliveryProcessPackage.Properties.name, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedProcessMemberAdvancedTableComposition(Composite parent) {
		this.ownedProcessMember = new ReferencesTable(UmaMessages.DeliveryProcessPackagePropertiesEditionPart_OwnedProcessMemberLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DeliveryProcessPackagePropertiesEditionPartImpl.this, UmaViewsRepository.DeliveryProcessPackage.Properties.ownedProcessMember, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ownedProcessMember.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DeliveryProcessPackagePropertiesEditionPartImpl.this, UmaViewsRepository.DeliveryProcessPackage.Properties.ownedProcessMember, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ownedProcessMember.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DeliveryProcessPackagePropertiesEditionPartImpl.this, UmaViewsRepository.DeliveryProcessPackage.Properties.ownedProcessMember, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ownedProcessMember.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DeliveryProcessPackagePropertiesEditionPartImpl.this, UmaViewsRepository.DeliveryProcessPackage.Properties.ownedProcessMember, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ownedProcessMember.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.ownedProcessMemberFilters) {
			this.ownedProcessMember.addFilter(filter);
		}
		this.ownedProcessMember.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.DeliveryProcessPackage.Properties.ownedProcessMember, UmaViewsRepository.SWT_KIND));
		this.ownedProcessMember.createControls(parent);
		this.ownedProcessMember.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DeliveryProcessPackagePropertiesEditionPartImpl.this, UmaViewsRepository.DeliveryProcessPackage.Properties.ownedProcessMember, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ownedProcessMemberData = new GridData(GridData.FILL_HORIZONTAL);
		ownedProcessMemberData.horizontalSpan = 3;
		this.ownedProcessMember.setLayoutData(ownedProcessMemberData);
		this.ownedProcessMember.setLowerBound(0);
		this.ownedProcessMember.setUpperBound(-1);
		ownedProcessMember.setID(UmaViewsRepository.DeliveryProcessPackage.Properties.ownedProcessMember);
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.DeliveryProcessPackagePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.DeliveryProcessPackagePropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.DeliveryProcessPackagePropertiesEditionPart#initOwnedProcessMember(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.DeliveryProcessPackagePropertiesEditionPart#updateOwnedProcessMember()
	 * 
	 */
	public void updateOwnedProcessMember() {
	ownedProcessMember.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.DeliveryProcessPackagePropertiesEditionPart#addFilterOwnedProcessMember(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.DeliveryProcessPackagePropertiesEditionPart#addBusinessFilterOwnedProcessMember(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwnedProcessMember(ViewerFilter filter) {
		ownedProcessMemberBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.DeliveryProcessPackagePropertiesEditionPart#isContainedInOwnedProcessMemberTable(EObject element)
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
		return UmaMessages.DeliveryProcessPackage_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
