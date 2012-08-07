/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart;
import org.obeonetwork.dsl.spem.parts.SpemViewsRepository;
import org.obeonetwork.dsl.spem.providers.SpemMessages;


// End of user code

/**
 * 
 * 
 */
public class RoleDefinitionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RoleDefinitionPropertiesEditionPart {

	protected EObjectFlatComboViewer kind;
	protected Text presentationName;
	protected Text briefDescription;
	protected Text mainDescription;
	protected Text purpose;
	protected ReferencesTable guidance;
	protected List<ViewerFilter> guidanceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> guidanceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable metric;
	protected List<ViewerFilter> metricBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> metricFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable category;
	protected List<ViewerFilter> categoryBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> categoryFilters = new ArrayList<ViewerFilter>();
	protected Text copyright;
	protected Text author;
	protected Button editAuthor;
	private EList authorList;
	protected Text changeDate;
	protected Text changeDescription;
	protected Text version;
	protected Text name;
	protected EMFComboViewer variabilityType;
	protected EObjectFlatComboViewer variabilityBasedOnElement;
	protected EObjectFlatComboViewer methodContentKind;
	protected Text synonym;
	protected Button editSynonym;
	private EList synonymList;
	protected ReferencesTable providedQualification;
	protected List<ViewerFilter> providedQualificationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> providedQualificationFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RoleDefinitionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence roleDefinitionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = roleDefinitionStep.addStep(SpemViewsRepository.RoleDefinition.Properties.class);
		propertiesStep.addStep(SpemViewsRepository.RoleDefinition.Properties.kind);
		propertiesStep.addStep(SpemViewsRepository.RoleDefinition.Properties.presentationName);
		propertiesStep.addStep(SpemViewsRepository.RoleDefinition.Properties.briefDescription);
		propertiesStep.addStep(SpemViewsRepository.RoleDefinition.Properties.mainDescription);
		propertiesStep.addStep(SpemViewsRepository.RoleDefinition.Properties.purpose);
		propertiesStep.addStep(SpemViewsRepository.RoleDefinition.Properties.guidance);
		propertiesStep.addStep(SpemViewsRepository.RoleDefinition.Properties.metric);
		propertiesStep.addStep(SpemViewsRepository.RoleDefinition.Properties.category);
		propertiesStep.addStep(SpemViewsRepository.RoleDefinition.Properties.copyright);
		propertiesStep.addStep(SpemViewsRepository.RoleDefinition.Properties.author);
		propertiesStep.addStep(SpemViewsRepository.RoleDefinition.Properties.changeDate);
		propertiesStep.addStep(SpemViewsRepository.RoleDefinition.Properties.changeDescription);
		propertiesStep.addStep(SpemViewsRepository.RoleDefinition.Properties.version);
		propertiesStep.addStep(SpemViewsRepository.RoleDefinition.Properties.name);
		propertiesStep.addStep(SpemViewsRepository.RoleDefinition.Properties.variabilityType);
		propertiesStep.addStep(SpemViewsRepository.RoleDefinition.Properties.variabilityBasedOnElement);
		propertiesStep.addStep(SpemViewsRepository.RoleDefinition.Properties.methodContentKind);
		propertiesStep.addStep(SpemViewsRepository.RoleDefinition.Properties.synonym);
		propertiesStep.addStep(SpemViewsRepository.RoleDefinition.Properties.providedQualification);
		
		
		composer = new PartComposer(roleDefinitionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SpemViewsRepository.RoleDefinition.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == SpemViewsRepository.RoleDefinition.Properties.kind) {
					return createKindFlatComboViewer(parent);
				}
				if (key == SpemViewsRepository.RoleDefinition.Properties.presentationName) {
					return createPresentationNameText(parent);
				}
				if (key == SpemViewsRepository.RoleDefinition.Properties.briefDescription) {
					return createBriefDescriptionText(parent);
				}
				if (key == SpemViewsRepository.RoleDefinition.Properties.mainDescription) {
					return createMainDescriptionText(parent);
				}
				if (key == SpemViewsRepository.RoleDefinition.Properties.purpose) {
					return createPurposeText(parent);
				}
				if (key == SpemViewsRepository.RoleDefinition.Properties.guidance) {
					return createGuidanceAdvancedReferencesTable(parent);
				}
				if (key == SpemViewsRepository.RoleDefinition.Properties.metric) {
					return createMetricAdvancedReferencesTable(parent);
				}
				if (key == SpemViewsRepository.RoleDefinition.Properties.category) {
					return createCategoryAdvancedReferencesTable(parent);
				}
				if (key == SpemViewsRepository.RoleDefinition.Properties.copyright) {
					return createCopyrightText(parent);
				}
				if (key == SpemViewsRepository.RoleDefinition.Properties.author) {
					return createAuthorMultiValuedEditor(parent);
				}
				if (key == SpemViewsRepository.RoleDefinition.Properties.changeDate) {
					return createChangeDateText(parent);
				}
				if (key == SpemViewsRepository.RoleDefinition.Properties.changeDescription) {
					return createChangeDescriptionText(parent);
				}
				if (key == SpemViewsRepository.RoleDefinition.Properties.version) {
					return createVersionText(parent);
				}
				if (key == SpemViewsRepository.RoleDefinition.Properties.name) {
					return createNameText(parent);
				}
				if (key == SpemViewsRepository.RoleDefinition.Properties.variabilityType) {
					return createVariabilityTypeEMFComboViewer(parent);
				}
				if (key == SpemViewsRepository.RoleDefinition.Properties.variabilityBasedOnElement) {
					return createVariabilityBasedOnElementFlatComboViewer(parent);
				}
				if (key == SpemViewsRepository.RoleDefinition.Properties.methodContentKind) {
					return createMethodContentKindFlatComboViewer(parent);
				}
				if (key == SpemViewsRepository.RoleDefinition.Properties.synonym) {
					return createSynonymMultiValuedEditor(parent);
				}
				if (key == SpemViewsRepository.RoleDefinition.Properties.providedQualification) {
					return createProvidedQualificationAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(SpemMessages.RoleDefinitionPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createKindFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.RoleDefinitionPropertiesEditionPart_KindLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.RoleDefinition.Properties.kind, SpemViewsRepository.SWT_KIND));
		kind = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SpemViewsRepository.RoleDefinition.Properties.kind, SpemViewsRepository.SWT_KIND));
		kind.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		kind.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.kind, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getKind()));
			}

		});
		GridData kindData = new GridData(GridData.FILL_HORIZONTAL);
		kind.setLayoutData(kindData);
		kind.setID(SpemViewsRepository.RoleDefinition.Properties.kind);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.RoleDefinition.Properties.kind, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPresentationNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.RoleDefinitionPropertiesEditionPart_PresentationNameLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.RoleDefinition.Properties.presentationName, SpemViewsRepository.SWT_KIND));
		presentationName = new Text(parent, SWT.BORDER);
		GridData presentationNameData = new GridData(GridData.FILL_HORIZONTAL);
		presentationName.setLayoutData(presentationNameData);
		presentationName.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.presentationName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, presentationName.getText()));
			}

		});
		presentationName.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.presentationName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, presentationName.getText()));
				}
			}

		});
		EditingUtils.setID(presentationName, SpemViewsRepository.RoleDefinition.Properties.presentationName);
		EditingUtils.setEEFtype(presentationName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.RoleDefinition.Properties.presentationName, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBriefDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.RoleDefinitionPropertiesEditionPart_BriefDescriptionLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.RoleDefinition.Properties.briefDescription, SpemViewsRepository.SWT_KIND));
		briefDescription = new Text(parent, SWT.BORDER);
		GridData briefDescriptionData = new GridData(GridData.FILL_HORIZONTAL);
		briefDescription.setLayoutData(briefDescriptionData);
		briefDescription.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.briefDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, briefDescription.getText()));
			}

		});
		briefDescription.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.briefDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, briefDescription.getText()));
				}
			}

		});
		EditingUtils.setID(briefDescription, SpemViewsRepository.RoleDefinition.Properties.briefDescription);
		EditingUtils.setEEFtype(briefDescription, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.RoleDefinition.Properties.briefDescription, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createMainDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.RoleDefinitionPropertiesEditionPart_MainDescriptionLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.RoleDefinition.Properties.mainDescription, SpemViewsRepository.SWT_KIND));
		mainDescription = new Text(parent, SWT.BORDER);
		GridData mainDescriptionData = new GridData(GridData.FILL_HORIZONTAL);
		mainDescription.setLayoutData(mainDescriptionData);
		mainDescription.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.mainDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mainDescription.getText()));
			}

		});
		mainDescription.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.mainDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mainDescription.getText()));
				}
			}

		});
		EditingUtils.setID(mainDescription, SpemViewsRepository.RoleDefinition.Properties.mainDescription);
		EditingUtils.setEEFtype(mainDescription, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.RoleDefinition.Properties.mainDescription, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPurposeText(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.RoleDefinitionPropertiesEditionPart_PurposeLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.RoleDefinition.Properties.purpose, SpemViewsRepository.SWT_KIND));
		purpose = new Text(parent, SWT.BORDER);
		GridData purposeData = new GridData(GridData.FILL_HORIZONTAL);
		purpose.setLayoutData(purposeData);
		purpose.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.purpose, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, purpose.getText()));
			}

		});
		purpose.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.purpose, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, purpose.getText()));
				}
			}

		});
		EditingUtils.setID(purpose, SpemViewsRepository.RoleDefinition.Properties.purpose);
		EditingUtils.setEEFtype(purpose, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.RoleDefinition.Properties.purpose, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createGuidanceAdvancedReferencesTable(Composite parent) {
		this.guidance = new ReferencesTable(SpemMessages.RoleDefinitionPropertiesEditionPart_GuidanceLabel, new ReferencesTableListener() {
			public void handleAdd() { addGuidance(); }
			public void handleEdit(EObject element) { editGuidance(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveGuidance(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromGuidance(element); }
			public void navigateTo(EObject element) { }
		});
		this.guidance.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.RoleDefinition.Properties.guidance, SpemViewsRepository.SWT_KIND));
		this.guidance.createControls(parent);
		this.guidance.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.guidance, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData guidanceData = new GridData(GridData.FILL_HORIZONTAL);
		guidanceData.horizontalSpan = 3;
		this.guidance.setLayoutData(guidanceData);
		this.guidance.disableMove();
		guidance.setID(SpemViewsRepository.RoleDefinition.Properties.guidance);
		guidance.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addGuidance() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(guidance.getInput(), guidanceFilters, guidanceBusinessFilters,
		"guidance", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.guidance,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				guidance.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveGuidance(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.guidance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		guidance.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromGuidance(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.guidance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		guidance.refresh();
	}

	/**
	 * 
	 */
	protected void editGuidance(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				guidance.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createMetricAdvancedReferencesTable(Composite parent) {
		this.metric = new ReferencesTable(SpemMessages.RoleDefinitionPropertiesEditionPart_MetricLabel, new ReferencesTableListener() {
			public void handleAdd() { addMetric(); }
			public void handleEdit(EObject element) { editMetric(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveMetric(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromMetric(element); }
			public void navigateTo(EObject element) { }
		});
		this.metric.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.RoleDefinition.Properties.metric, SpemViewsRepository.SWT_KIND));
		this.metric.createControls(parent);
		this.metric.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.metric, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData metricData = new GridData(GridData.FILL_HORIZONTAL);
		metricData.horizontalSpan = 3;
		this.metric.setLayoutData(metricData);
		this.metric.disableMove();
		metric.setID(SpemViewsRepository.RoleDefinition.Properties.metric);
		metric.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addMetric() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(metric.getInput(), metricFilters, metricBusinessFilters,
		"metric", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.metric,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				metric.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveMetric(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.metric, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		metric.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMetric(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.metric, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		metric.refresh();
	}

	/**
	 * 
	 */
	protected void editMetric(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				metric.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createCategoryAdvancedReferencesTable(Composite parent) {
		this.category = new ReferencesTable(SpemMessages.RoleDefinitionPropertiesEditionPart_CategoryLabel, new ReferencesTableListener() {
			public void handleAdd() { addCategory(); }
			public void handleEdit(EObject element) { editCategory(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCategory(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCategory(element); }
			public void navigateTo(EObject element) { }
		});
		this.category.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.RoleDefinition.Properties.category, SpemViewsRepository.SWT_KIND));
		this.category.createControls(parent);
		this.category.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.category, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData categoryData = new GridData(GridData.FILL_HORIZONTAL);
		categoryData.horizontalSpan = 3;
		this.category.setLayoutData(categoryData);
		this.category.disableMove();
		category.setID(SpemViewsRepository.RoleDefinition.Properties.category);
		category.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addCategory() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(category.getInput(), categoryFilters, categoryBusinessFilters,
		"category", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.category,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				category.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveCategory(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		category.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCategory(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		category.refresh();
	}

	/**
	 * 
	 */
	protected void editCategory(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				category.refresh();
			}
		}
	}

	
	protected Composite createCopyrightText(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.RoleDefinitionPropertiesEditionPart_CopyrightLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.RoleDefinition.Properties.copyright, SpemViewsRepository.SWT_KIND));
		copyright = new Text(parent, SWT.BORDER);
		GridData copyrightData = new GridData(GridData.FILL_HORIZONTAL);
		copyright.setLayoutData(copyrightData);
		copyright.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.copyright, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, copyright.getText()));
			}

		});
		copyright.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.copyright, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, copyright.getText()));
				}
			}

		});
		EditingUtils.setID(copyright, SpemViewsRepository.RoleDefinition.Properties.copyright);
		EditingUtils.setEEFtype(copyright, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.RoleDefinition.Properties.copyright, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createAuthorMultiValuedEditor(Composite parent) {
		author = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData authorData = new GridData(GridData.FILL_HORIZONTAL);
		authorData.horizontalSpan = 2;
		author.setLayoutData(authorData);
		EditingUtils.setID(author, SpemViewsRepository.RoleDefinition.Properties.author);
		EditingUtils.setEEFtype(author, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editAuthor = new Button(parent, SWT.NONE);
		editAuthor.setText(SpemMessages.RoleDefinitionPropertiesEditionPart_AuthorLabel);
		GridData editAuthorData = new GridData();
		editAuthor.setLayoutData(editAuthorData);
		editAuthor.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						author.getShell(), "RoleDefinition", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						authorList, SpemPackage.eINSTANCE.getDescribableElement_Author().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					authorList = dialog.getResult();
					if (authorList == null) {
						authorList = new BasicEList();
					}
					author.setText(authorList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.author, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(authorList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editAuthor, SpemViewsRepository.RoleDefinition.Properties.author);
		EditingUtils.setEEFtype(editAuthor, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createChangeDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.RoleDefinitionPropertiesEditionPart_ChangeDateLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.RoleDefinition.Properties.changeDate, SpemViewsRepository.SWT_KIND));
		changeDate = new Text(parent, SWT.BORDER);
		GridData changeDateData = new GridData(GridData.FILL_HORIZONTAL);
		changeDate.setLayoutData(changeDateData);
		changeDate.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.changeDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDate.getText()));
			}

		});
		changeDate.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.changeDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDate.getText()));
				}
			}

		});
		EditingUtils.setID(changeDate, SpemViewsRepository.RoleDefinition.Properties.changeDate);
		EditingUtils.setEEFtype(changeDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.RoleDefinition.Properties.changeDate, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createChangeDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.RoleDefinitionPropertiesEditionPart_ChangeDescriptionLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.RoleDefinition.Properties.changeDescription, SpemViewsRepository.SWT_KIND));
		changeDescription = new Text(parent, SWT.BORDER);
		GridData changeDescriptionData = new GridData(GridData.FILL_HORIZONTAL);
		changeDescription.setLayoutData(changeDescriptionData);
		changeDescription.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.changeDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDescription.getText()));
			}

		});
		changeDescription.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.changeDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDescription.getText()));
				}
			}

		});
		EditingUtils.setID(changeDescription, SpemViewsRepository.RoleDefinition.Properties.changeDescription);
		EditingUtils.setEEFtype(changeDescription, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.RoleDefinition.Properties.changeDescription, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createVersionText(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.RoleDefinitionPropertiesEditionPart_VersionLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.RoleDefinition.Properties.version, SpemViewsRepository.SWT_KIND));
		version = new Text(parent, SWT.BORDER);
		GridData versionData = new GridData(GridData.FILL_HORIZONTAL);
		version.setLayoutData(versionData);
		version.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
			}

		});
		version.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
				}
			}

		});
		EditingUtils.setID(version, SpemViewsRepository.RoleDefinition.Properties.version);
		EditingUtils.setEEFtype(version, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.RoleDefinition.Properties.version, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.RoleDefinitionPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.RoleDefinition.Properties.name, SpemViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, SpemViewsRepository.RoleDefinition.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.RoleDefinition.Properties.name, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createVariabilityTypeEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.RoleDefinitionPropertiesEditionPart_VariabilityTypeLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.RoleDefinition.Properties.variabilityType, SpemViewsRepository.SWT_KIND));
		variabilityType = new EMFComboViewer(parent);
		variabilityType.setContentProvider(new ArrayContentProvider());
		variabilityType.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData variabilityTypeData = new GridData(GridData.FILL_HORIZONTAL);
		variabilityType.getCombo().setLayoutData(variabilityTypeData);
		variabilityType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.variabilityType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVariabilityType()));
			}

		});
		variabilityType.setID(SpemViewsRepository.RoleDefinition.Properties.variabilityType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.RoleDefinition.Properties.variabilityType, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createVariabilityBasedOnElementFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.RoleDefinitionPropertiesEditionPart_VariabilityBasedOnElementLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.RoleDefinition.Properties.variabilityBasedOnElement, SpemViewsRepository.SWT_KIND));
		variabilityBasedOnElement = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SpemViewsRepository.RoleDefinition.Properties.variabilityBasedOnElement, SpemViewsRepository.SWT_KIND));
		variabilityBasedOnElement.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		variabilityBasedOnElement.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.variabilityBasedOnElement, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getVariabilityBasedOnElement()));
			}

		});
		GridData variabilityBasedOnElementData = new GridData(GridData.FILL_HORIZONTAL);
		variabilityBasedOnElement.setLayoutData(variabilityBasedOnElementData);
		variabilityBasedOnElement.setID(SpemViewsRepository.RoleDefinition.Properties.variabilityBasedOnElement);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.RoleDefinition.Properties.variabilityBasedOnElement, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createMethodContentKindFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.RoleDefinitionPropertiesEditionPart_MethodContentKindLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.RoleDefinition.Properties.methodContentKind, SpemViewsRepository.SWT_KIND));
		methodContentKind = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SpemViewsRepository.RoleDefinition.Properties.methodContentKind, SpemViewsRepository.SWT_KIND));
		methodContentKind.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		methodContentKind.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.methodContentKind, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getMethodContentKind()));
			}

		});
		GridData methodContentKindData = new GridData(GridData.FILL_HORIZONTAL);
		methodContentKind.setLayoutData(methodContentKindData);
		methodContentKind.setID(SpemViewsRepository.RoleDefinition.Properties.methodContentKind);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.RoleDefinition.Properties.methodContentKind, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createSynonymMultiValuedEditor(Composite parent) {
		synonym = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData synonymData = new GridData(GridData.FILL_HORIZONTAL);
		synonymData.horizontalSpan = 2;
		synonym.setLayoutData(synonymData);
		EditingUtils.setID(synonym, SpemViewsRepository.RoleDefinition.Properties.synonym);
		EditingUtils.setEEFtype(synonym, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editSynonym = new Button(parent, SWT.NONE);
		editSynonym.setText(SpemMessages.RoleDefinitionPropertiesEditionPart_SynonymLabel);
		GridData editSynonymData = new GridData();
		editSynonym.setLayoutData(editSynonymData);
		editSynonym.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						synonym.getShell(), "RoleDefinition", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						synonymList, SpemPackage.eINSTANCE.getRoleDefinition_Synonym().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					synonymList = dialog.getResult();
					if (synonymList == null) {
						synonymList = new BasicEList();
					}
					synonym.setText(synonymList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.synonym, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(synonymList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editSynonym, SpemViewsRepository.RoleDefinition.Properties.synonym);
		EditingUtils.setEEFtype(editSynonym, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createProvidedQualificationAdvancedReferencesTable(Composite parent) {
		this.providedQualification = new ReferencesTable(SpemMessages.RoleDefinitionPropertiesEditionPart_ProvidedQualificationLabel, new ReferencesTableListener() {
			public void handleAdd() { addProvidedQualification(); }
			public void handleEdit(EObject element) { editProvidedQualification(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProvidedQualification(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProvidedQualification(element); }
			public void navigateTo(EObject element) { }
		});
		this.providedQualification.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.RoleDefinition.Properties.providedQualification, SpemViewsRepository.SWT_KIND));
		this.providedQualification.createControls(parent);
		this.providedQualification.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.providedQualification, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData providedQualificationData = new GridData(GridData.FILL_HORIZONTAL);
		providedQualificationData.horizontalSpan = 3;
		this.providedQualification.setLayoutData(providedQualificationData);
		this.providedQualification.disableMove();
		providedQualification.setID(SpemViewsRepository.RoleDefinition.Properties.providedQualification);
		providedQualification.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addProvidedQualification() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(providedQualification.getInput(), providedQualificationFilters, providedQualificationBusinessFilters,
		"providedQualification", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.providedQualification,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				providedQualification.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveProvidedQualification(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.providedQualification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		providedQualification.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProvidedQualification(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleDefinitionPropertiesEditionPartImpl.this, SpemViewsRepository.RoleDefinition.Properties.providedQualification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		providedQualification.refresh();
	}

	/**
	 * 
	 */
	protected void editProvidedQualification(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				providedQualification.refresh();
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
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#getKind()
	 * 
	 */
	public EObject getKind() {
		if (kind.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) kind.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#initKind(EObjectFlatComboSettings)
	 */
	public void initKind(EObjectFlatComboSettings settings) {
		kind.setInput(settings);
		if (current != null) {
			kind.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#setKind(EObject newValue)
	 * 
	 */
	public void setKind(EObject newValue) {
		if (newValue != null) {
			kind.setSelection(new StructuredSelection(newValue));
		} else {
			kind.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#setKindButtonMode(ButtonsModeEnum newValue)
	 */
	public void setKindButtonMode(ButtonsModeEnum newValue) {
		kind.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#addFilterKind(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKind(ViewerFilter filter) {
		kind.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#addBusinessFilterKind(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKind(ViewerFilter filter) {
		kind.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#getPresentationName()
	 * 
	 */
	public String getPresentationName() {
		return presentationName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#setPresentationName(String newValue)
	 * 
	 */
	public void setPresentationName(String newValue) {
		if (newValue != null) {
			presentationName.setText(newValue);
		} else {
			presentationName.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#getBriefDescription()
	 * 
	 */
	public String getBriefDescription() {
		return briefDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#setBriefDescription(String newValue)
	 * 
	 */
	public void setBriefDescription(String newValue) {
		if (newValue != null) {
			briefDescription.setText(newValue);
		} else {
			briefDescription.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#getMainDescription()
	 * 
	 */
	public String getMainDescription() {
		return mainDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#setMainDescription(String newValue)
	 * 
	 */
	public void setMainDescription(String newValue) {
		if (newValue != null) {
			mainDescription.setText(newValue);
		} else {
			mainDescription.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#getPurpose()
	 * 
	 */
	public String getPurpose() {
		return purpose.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#setPurpose(String newValue)
	 * 
	 */
	public void setPurpose(String newValue) {
		if (newValue != null) {
			purpose.setText(newValue);
		} else {
			purpose.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#initGuidance(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initGuidance(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		guidance.setContentProvider(contentProvider);
		guidance.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#updateGuidance()
	 * 
	 */
	public void updateGuidance() {
	guidance.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#addFilterGuidance(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGuidance(ViewerFilter filter) {
		guidanceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#addBusinessFilterGuidance(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGuidance(ViewerFilter filter) {
		guidanceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#isContainedInGuidanceTable(EObject element)
	 * 
	 */
	public boolean isContainedInGuidanceTable(EObject element) {
		return ((ReferencesTableSettings)guidance.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#initMetric(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMetric(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		metric.setContentProvider(contentProvider);
		metric.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#updateMetric()
	 * 
	 */
	public void updateMetric() {
	metric.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#addFilterMetric(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMetric(ViewerFilter filter) {
		metricFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#addBusinessFilterMetric(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMetric(ViewerFilter filter) {
		metricBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#isContainedInMetricTable(EObject element)
	 * 
	 */
	public boolean isContainedInMetricTable(EObject element) {
		return ((ReferencesTableSettings)metric.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#initCategory(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initCategory(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		category.setContentProvider(contentProvider);
		category.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#updateCategory()
	 * 
	 */
	public void updateCategory() {
	category.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#addFilterCategory(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCategory(ViewerFilter filter) {
		categoryFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#addBusinessFilterCategory(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCategory(ViewerFilter filter) {
		categoryBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#isContainedInCategoryTable(EObject element)
	 * 
	 */
	public boolean isContainedInCategoryTable(EObject element) {
		return ((ReferencesTableSettings)category.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#getCopyright()
	 * 
	 */
	public String getCopyright() {
		return copyright.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#setCopyright(String newValue)
	 * 
	 */
	public void setCopyright(String newValue) {
		if (newValue != null) {
			copyright.setText(newValue);
		} else {
			copyright.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#getAuthor()
	 * 
	 */
	public EList getAuthor() {
		return authorList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#setAuthor(EList newValue)
	 * 
	 */
	public void setAuthor(EList newValue) {
		authorList = newValue;
		if (newValue != null) {
			author.setText(authorList.toString());
		} else {
			author.setText(""); //$NON-NLS-1$
		}
	}

	public void addToAuthor(Object newValue) {
		authorList.add(newValue);
		if (newValue != null) {
			author.setText(authorList.toString());
		} else {
			author.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToAuthor(Object newValue) {
		authorList.remove(newValue);
		if (newValue != null) {
			author.setText(authorList.toString());
		} else {
			author.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#getChangeDate()
	 * 
	 */
	public String getChangeDate() {
		return changeDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#setChangeDate(String newValue)
	 * 
	 */
	public void setChangeDate(String newValue) {
		if (newValue != null) {
			changeDate.setText(newValue);
		} else {
			changeDate.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#getChangeDescription()
	 * 
	 */
	public String getChangeDescription() {
		return changeDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#setChangeDescription(String newValue)
	 * 
	 */
	public void setChangeDescription(String newValue) {
		if (newValue != null) {
			changeDescription.setText(newValue);
		} else {
			changeDescription.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#getVersion()
	 * 
	 */
	public String getVersion() {
		return version.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#setVersion(String newValue)
	 * 
	 */
	public void setVersion(String newValue) {
		if (newValue != null) {
			version.setText(newValue);
		} else {
			version.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#getVariabilityType()
	 * 
	 */
	public Enumerator getVariabilityType() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) variabilityType.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#initVariabilityType(EEnum eenum, Enumerator current)
	 */
	public void initVariabilityType(EEnum eenum, Enumerator current) {
		variabilityType.setInput(eenum.getELiterals());
		variabilityType.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#setVariabilityType(Enumerator newValue)
	 * 
	 */
	public void setVariabilityType(Enumerator newValue) {
		variabilityType.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#getVariabilityBasedOnElement()
	 * 
	 */
	public EObject getVariabilityBasedOnElement() {
		if (variabilityBasedOnElement.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) variabilityBasedOnElement.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#initVariabilityBasedOnElement(EObjectFlatComboSettings)
	 */
	public void initVariabilityBasedOnElement(EObjectFlatComboSettings settings) {
		variabilityBasedOnElement.setInput(settings);
		if (current != null) {
			variabilityBasedOnElement.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#setVariabilityBasedOnElement(EObject newValue)
	 * 
	 */
	public void setVariabilityBasedOnElement(EObject newValue) {
		if (newValue != null) {
			variabilityBasedOnElement.setSelection(new StructuredSelection(newValue));
		} else {
			variabilityBasedOnElement.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#setVariabilityBasedOnElementButtonMode(ButtonsModeEnum newValue)
	 */
	public void setVariabilityBasedOnElementButtonMode(ButtonsModeEnum newValue) {
		variabilityBasedOnElement.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#addFilterVariabilityBasedOnElement(ViewerFilter filter)
	 * 
	 */
	public void addFilterToVariabilityBasedOnElement(ViewerFilter filter) {
		variabilityBasedOnElement.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#addBusinessFilterVariabilityBasedOnElement(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToVariabilityBasedOnElement(ViewerFilter filter) {
		variabilityBasedOnElement.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#getMethodContentKind()
	 * 
	 */
	public EObject getMethodContentKind() {
		if (methodContentKind.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) methodContentKind.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#initMethodContentKind(EObjectFlatComboSettings)
	 */
	public void initMethodContentKind(EObjectFlatComboSettings settings) {
		methodContentKind.setInput(settings);
		if (current != null) {
			methodContentKind.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#setMethodContentKind(EObject newValue)
	 * 
	 */
	public void setMethodContentKind(EObject newValue) {
		if (newValue != null) {
			methodContentKind.setSelection(new StructuredSelection(newValue));
		} else {
			methodContentKind.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#setMethodContentKindButtonMode(ButtonsModeEnum newValue)
	 */
	public void setMethodContentKindButtonMode(ButtonsModeEnum newValue) {
		methodContentKind.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#addFilterMethodContentKind(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMethodContentKind(ViewerFilter filter) {
		methodContentKind.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#addBusinessFilterMethodContentKind(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMethodContentKind(ViewerFilter filter) {
		methodContentKind.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#getSynonym()
	 * 
	 */
	public EList getSynonym() {
		return synonymList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#setSynonym(EList newValue)
	 * 
	 */
	public void setSynonym(EList newValue) {
		synonymList = newValue;
		if (newValue != null) {
			synonym.setText(synonymList.toString());
		} else {
			synonym.setText(""); //$NON-NLS-1$
		}
	}

	public void addToSynonym(Object newValue) {
		synonymList.add(newValue);
		if (newValue != null) {
			synonym.setText(synonymList.toString());
		} else {
			synonym.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToSynonym(Object newValue) {
		synonymList.remove(newValue);
		if (newValue != null) {
			synonym.setText(synonymList.toString());
		} else {
			synonym.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#initProvidedQualification(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initProvidedQualification(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		providedQualification.setContentProvider(contentProvider);
		providedQualification.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#updateProvidedQualification()
	 * 
	 */
	public void updateProvidedQualification() {
	providedQualification.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#addFilterProvidedQualification(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProvidedQualification(ViewerFilter filter) {
		providedQualificationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#addBusinessFilterProvidedQualification(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProvidedQualification(ViewerFilter filter) {
		providedQualificationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart#isContainedInProvidedQualificationTable(EObject element)
	 * 
	 */
	public boolean isContainedInProvidedQualificationTable(EObject element) {
		return ((ReferencesTableSettings)providedQualification.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SpemMessages.RoleDefinition_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
