/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
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
import org.obeonetwork.dsl.spem.parts.MethodPluginPropertiesEditionPart;
import org.obeonetwork.dsl.spem.parts.SpemViewsRepository;
import org.obeonetwork.dsl.spem.providers.SpemMessages;


// End of user code

/**
 * 
 * 
 */
public class MethodPluginPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, MethodPluginPropertiesEditionPart {

	protected Text name;
protected ReferencesTable ownedMethodContentPackage;
protected List<ViewerFilter> ownedMethodContentPackageBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> ownedMethodContentPackageFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable ownedProcessPackage;
protected List<ViewerFilter> ownedProcessPackageBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> ownedProcessPackageFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable basePlugin;
	protected List<ViewerFilter> basePluginBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> basePluginFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MethodPluginPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence methodPluginStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = methodPluginStep.addStep(SpemViewsRepository.MethodPlugin.Properties.class);
		propertiesStep.addStep(SpemViewsRepository.MethodPlugin.Properties.name);
		propertiesStep.addStep(SpemViewsRepository.MethodPlugin.Properties.ownedMethodContentPackage);
		propertiesStep.addStep(SpemViewsRepository.MethodPlugin.Properties.ownedProcessPackage);
		propertiesStep.addStep(SpemViewsRepository.MethodPlugin.Properties.basePlugin);
		
		
		composer = new PartComposer(methodPluginStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SpemViewsRepository.MethodPlugin.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == SpemViewsRepository.MethodPlugin.Properties.name) {
					return createNameText(parent);
				}
				if (key == SpemViewsRepository.MethodPlugin.Properties.ownedMethodContentPackage) {
					return createOwnedMethodContentPackageAdvancedTableComposition(parent);
				}
				if (key == SpemViewsRepository.MethodPlugin.Properties.ownedProcessPackage) {
					return createOwnedProcessPackageAdvancedTableComposition(parent);
				}
				if (key == SpemViewsRepository.MethodPlugin.Properties.basePlugin) {
					return createBasePluginAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(SpemMessages.MethodPluginPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.MethodPluginPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.MethodPlugin.Properties.name, SpemViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartImpl.this, SpemViewsRepository.MethodPlugin.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartImpl.this, SpemViewsRepository.MethodPlugin.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, SpemViewsRepository.MethodPlugin.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.MethodPlugin.Properties.name, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedMethodContentPackageAdvancedTableComposition(Composite parent) {
		this.ownedMethodContentPackage = new ReferencesTable(SpemMessages.MethodPluginPropertiesEditionPart_OwnedMethodContentPackageLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartImpl.this, SpemViewsRepository.MethodPlugin.Properties.ownedMethodContentPackage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ownedMethodContentPackage.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartImpl.this, SpemViewsRepository.MethodPlugin.Properties.ownedMethodContentPackage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ownedMethodContentPackage.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartImpl.this, SpemViewsRepository.MethodPlugin.Properties.ownedMethodContentPackage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ownedMethodContentPackage.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartImpl.this, SpemViewsRepository.MethodPlugin.Properties.ownedMethodContentPackage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ownedMethodContentPackage.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.ownedMethodContentPackageFilters) {
			this.ownedMethodContentPackage.addFilter(filter);
		}
		this.ownedMethodContentPackage.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.MethodPlugin.Properties.ownedMethodContentPackage, SpemViewsRepository.SWT_KIND));
		this.ownedMethodContentPackage.createControls(parent);
		this.ownedMethodContentPackage.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartImpl.this, SpemViewsRepository.MethodPlugin.Properties.ownedMethodContentPackage, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ownedMethodContentPackageData = new GridData(GridData.FILL_HORIZONTAL);
		ownedMethodContentPackageData.horizontalSpan = 3;
		this.ownedMethodContentPackage.setLayoutData(ownedMethodContentPackageData);
		this.ownedMethodContentPackage.setLowerBound(0);
		this.ownedMethodContentPackage.setUpperBound(-1);
		ownedMethodContentPackage.setID(SpemViewsRepository.MethodPlugin.Properties.ownedMethodContentPackage);
		ownedMethodContentPackage.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedProcessPackageAdvancedTableComposition(Composite parent) {
		this.ownedProcessPackage = new ReferencesTable(SpemMessages.MethodPluginPropertiesEditionPart_OwnedProcessPackageLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartImpl.this, SpemViewsRepository.MethodPlugin.Properties.ownedProcessPackage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ownedProcessPackage.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartImpl.this, SpemViewsRepository.MethodPlugin.Properties.ownedProcessPackage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ownedProcessPackage.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartImpl.this, SpemViewsRepository.MethodPlugin.Properties.ownedProcessPackage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ownedProcessPackage.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartImpl.this, SpemViewsRepository.MethodPlugin.Properties.ownedProcessPackage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ownedProcessPackage.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.ownedProcessPackageFilters) {
			this.ownedProcessPackage.addFilter(filter);
		}
		this.ownedProcessPackage.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.MethodPlugin.Properties.ownedProcessPackage, SpemViewsRepository.SWT_KIND));
		this.ownedProcessPackage.createControls(parent);
		this.ownedProcessPackage.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartImpl.this, SpemViewsRepository.MethodPlugin.Properties.ownedProcessPackage, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ownedProcessPackageData = new GridData(GridData.FILL_HORIZONTAL);
		ownedProcessPackageData.horizontalSpan = 3;
		this.ownedProcessPackage.setLayoutData(ownedProcessPackageData);
		this.ownedProcessPackage.setLowerBound(0);
		this.ownedProcessPackage.setUpperBound(-1);
		ownedProcessPackage.setID(SpemViewsRepository.MethodPlugin.Properties.ownedProcessPackage);
		ownedProcessPackage.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createBasePluginAdvancedReferencesTable(Composite parent) {
		this.basePlugin = new ReferencesTable(SpemMessages.MethodPluginPropertiesEditionPart_BasePluginLabel, new ReferencesTableListener() {
			public void handleAdd() { addBasePlugin(); }
			public void handleEdit(EObject element) { editBasePlugin(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveBasePlugin(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromBasePlugin(element); }
			public void navigateTo(EObject element) { }
		});
		this.basePlugin.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.MethodPlugin.Properties.basePlugin, SpemViewsRepository.SWT_KIND));
		this.basePlugin.createControls(parent);
		this.basePlugin.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartImpl.this, SpemViewsRepository.MethodPlugin.Properties.basePlugin, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData basePluginData = new GridData(GridData.FILL_HORIZONTAL);
		basePluginData.horizontalSpan = 3;
		this.basePlugin.setLayoutData(basePluginData);
		this.basePlugin.disableMove();
		basePlugin.setID(SpemViewsRepository.MethodPlugin.Properties.basePlugin);
		basePlugin.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addBasePlugin() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(basePlugin.getInput(), basePluginFilters, basePluginBusinessFilters,
		"basePlugin", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartImpl.this, SpemViewsRepository.MethodPlugin.Properties.basePlugin,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				basePlugin.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveBasePlugin(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartImpl.this, SpemViewsRepository.MethodPlugin.Properties.basePlugin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		basePlugin.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromBasePlugin(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartImpl.this, SpemViewsRepository.MethodPlugin.Properties.basePlugin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		basePlugin.refresh();
	}

	/**
	 * 
	 */
	protected void editBasePlugin(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				basePlugin.refresh();
			}
		}
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
	 * @see org.obeonetwork.dsl.spem.parts.MethodPluginPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.MethodPluginPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.parts.MethodPluginPropertiesEditionPart#initOwnedMethodContentPackage(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedMethodContentPackage(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedMethodContentPackage.setContentProvider(contentProvider);
		ownedMethodContentPackage.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.MethodPluginPropertiesEditionPart#updateOwnedMethodContentPackage()
	 * 
	 */
	public void updateOwnedMethodContentPackage() {
	ownedMethodContentPackage.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.MethodPluginPropertiesEditionPart#addFilterOwnedMethodContentPackage(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOwnedMethodContentPackage(ViewerFilter filter) {
		ownedMethodContentPackageFilters.add(filter);
		if (this.ownedMethodContentPackage != null) {
			this.ownedMethodContentPackage.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.MethodPluginPropertiesEditionPart#addBusinessFilterOwnedMethodContentPackage(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwnedMethodContentPackage(ViewerFilter filter) {
		ownedMethodContentPackageBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.MethodPluginPropertiesEditionPart#isContainedInOwnedMethodContentPackageTable(EObject element)
	 * 
	 */
	public boolean isContainedInOwnedMethodContentPackageTable(EObject element) {
		return ((ReferencesTableSettings)ownedMethodContentPackage.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.MethodPluginPropertiesEditionPart#initOwnedProcessPackage(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedProcessPackage(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedProcessPackage.setContentProvider(contentProvider);
		ownedProcessPackage.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.MethodPluginPropertiesEditionPart#updateOwnedProcessPackage()
	 * 
	 */
	public void updateOwnedProcessPackage() {
	ownedProcessPackage.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.MethodPluginPropertiesEditionPart#addFilterOwnedProcessPackage(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOwnedProcessPackage(ViewerFilter filter) {
		ownedProcessPackageFilters.add(filter);
		if (this.ownedProcessPackage != null) {
			this.ownedProcessPackage.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.MethodPluginPropertiesEditionPart#addBusinessFilterOwnedProcessPackage(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwnedProcessPackage(ViewerFilter filter) {
		ownedProcessPackageBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.MethodPluginPropertiesEditionPart#isContainedInOwnedProcessPackageTable(EObject element)
	 * 
	 */
	public boolean isContainedInOwnedProcessPackageTable(EObject element) {
		return ((ReferencesTableSettings)ownedProcessPackage.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.MethodPluginPropertiesEditionPart#initBasePlugin(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initBasePlugin(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		basePlugin.setContentProvider(contentProvider);
		basePlugin.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.MethodPluginPropertiesEditionPart#updateBasePlugin()
	 * 
	 */
	public void updateBasePlugin() {
	basePlugin.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.MethodPluginPropertiesEditionPart#addFilterBasePlugin(ViewerFilter filter)
	 * 
	 */
	public void addFilterToBasePlugin(ViewerFilter filter) {
		basePluginFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.MethodPluginPropertiesEditionPart#addBusinessFilterBasePlugin(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToBasePlugin(ViewerFilter filter) {
		basePluginBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.MethodPluginPropertiesEditionPart#isContainedInBasePluginTable(EObject element)
	 * 
	 */
	public boolean isContainedInBasePluginTable(EObject element) {
		return ((ReferencesTableSettings)basePlugin.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SpemMessages.MethodPlugin_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
