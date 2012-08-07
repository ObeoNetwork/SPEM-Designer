/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.obeonetwork.dsl.spem.parts.MethodPluginPropertiesEditionPart;
import org.obeonetwork.dsl.spem.parts.SpemViewsRepository;
import org.obeonetwork.dsl.spem.providers.SpemMessages;


// End of user code

/**
 * 
 * 
 */
public class MethodPluginPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, MethodPluginPropertiesEditionPart {

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
	public MethodPluginPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.MethodPlugin.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.MethodPlugin.Properties.ownedMethodContentPackage) {
					return createOwnedMethodContentPackageTableComposition(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.MethodPlugin.Properties.ownedProcessPackage) {
					return createOwnedProcessPackageTableComposition(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.MethodPlugin.Properties.basePlugin) {
					return createBasePluginReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(SpemMessages.MethodPluginPropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, SpemMessages.MethodPluginPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.MethodPlugin.Properties.name, SpemViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartForm.this, SpemViewsRepository.MethodPlugin.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartForm.this, SpemViewsRepository.MethodPlugin.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, SpemViewsRepository.MethodPlugin.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.MethodPlugin.Properties.name, SpemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedMethodContentPackageTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.ownedMethodContentPackage = new ReferencesTable(SpemMessages.MethodPluginPropertiesEditionPart_OwnedMethodContentPackageLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartForm.this, SpemViewsRepository.MethodPlugin.Properties.ownedMethodContentPackage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ownedMethodContentPackage.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartForm.this, SpemViewsRepository.MethodPlugin.Properties.ownedMethodContentPackage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ownedMethodContentPackage.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartForm.this, SpemViewsRepository.MethodPlugin.Properties.ownedMethodContentPackage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ownedMethodContentPackage.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartForm.this, SpemViewsRepository.MethodPlugin.Properties.ownedMethodContentPackage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ownedMethodContentPackage.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.ownedMethodContentPackageFilters) {
			this.ownedMethodContentPackage.addFilter(filter);
		}
		this.ownedMethodContentPackage.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.MethodPlugin.Properties.ownedMethodContentPackage, SpemViewsRepository.FORM_KIND));
		this.ownedMethodContentPackage.createControls(parent, widgetFactory);
		this.ownedMethodContentPackage.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartForm.this, SpemViewsRepository.MethodPlugin.Properties.ownedMethodContentPackage, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
	protected Composite createOwnedProcessPackageTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.ownedProcessPackage = new ReferencesTable(SpemMessages.MethodPluginPropertiesEditionPart_OwnedProcessPackageLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartForm.this, SpemViewsRepository.MethodPlugin.Properties.ownedProcessPackage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ownedProcessPackage.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartForm.this, SpemViewsRepository.MethodPlugin.Properties.ownedProcessPackage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ownedProcessPackage.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartForm.this, SpemViewsRepository.MethodPlugin.Properties.ownedProcessPackage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ownedProcessPackage.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartForm.this, SpemViewsRepository.MethodPlugin.Properties.ownedProcessPackage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ownedProcessPackage.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.ownedProcessPackageFilters) {
			this.ownedProcessPackage.addFilter(filter);
		}
		this.ownedProcessPackage.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.MethodPlugin.Properties.ownedProcessPackage, SpemViewsRepository.FORM_KIND));
		this.ownedProcessPackage.createControls(parent, widgetFactory);
		this.ownedProcessPackage.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartForm.this, SpemViewsRepository.MethodPlugin.Properties.ownedProcessPackage, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
	protected Composite createBasePluginReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.basePlugin = new ReferencesTable(SpemMessages.MethodPluginPropertiesEditionPart_BasePluginLabel, new ReferencesTableListener	() {
			public void handleAdd() { addBasePlugin(); }
			public void handleEdit(EObject element) { editBasePlugin(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveBasePlugin(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromBasePlugin(element); }
			public void navigateTo(EObject element) { }
		});
		this.basePlugin.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.MethodPlugin.Properties.basePlugin, SpemViewsRepository.FORM_KIND));
		this.basePlugin.createControls(parent, widgetFactory);
		this.basePlugin.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartForm.this, SpemViewsRepository.MethodPlugin.Properties.basePlugin, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartForm.this, SpemViewsRepository.MethodPlugin.Properties.basePlugin,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartForm.this, SpemViewsRepository.MethodPlugin.Properties.basePlugin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		basePlugin.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromBasePlugin(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPluginPropertiesEditionPartForm.this, SpemViewsRepository.MethodPlugin.Properties.basePlugin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
