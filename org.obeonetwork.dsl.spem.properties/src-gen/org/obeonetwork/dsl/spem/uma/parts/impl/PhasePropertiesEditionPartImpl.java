/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.uma.parts.impl;

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
import org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart;
import org.obeonetwork.dsl.spem.uma.parts.UmaViewsRepository;
import org.obeonetwork.dsl.spem.uma.providers.UmaMessages;


// End of user code

/**
 * 
 * 
 */
public class PhasePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, PhasePropertiesEditionPart {

	protected Text preCondition;
	protected Button editPreCondition;
	private EList preConditionList;
	protected Text postCondition;
	protected Button editPostCondition;
	private EList postConditionList;
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
	protected Button hasMultipleOccurrences;
	protected Button isOptional;
	protected Button isPlanned;
	protected Button isRepeatable;
	protected Button isOngoing;
	protected Button isEventDriven;
	protected ReferencesTable linkToPredecessor;
	protected List<ViewerFilter> linkToPredecessorBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> linkToPredecessorFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable linkToSuccessor;
	protected List<ViewerFilter> linkToSuccessorBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> linkToSuccessorFilters = new ArrayList<ViewerFilter>();
	protected EMFComboViewer variabilityType;
	protected EObjectFlatComboViewer variabilityBasedOnElement;
	protected EMFComboViewer useKind;
	protected EObjectFlatComboViewer usedActivity;
	protected ReferencesTable suppressedBreakdownElement;
	protected List<ViewerFilter> suppressedBreakdownElementBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> suppressedBreakdownElementFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer defaultContext;
	protected ReferencesTable validContext;
	protected List<ViewerFilter> validContextBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> validContextFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PhasePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence phaseStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = phaseStep.addStep(UmaViewsRepository.Phase.Properties.class);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.preCondition);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.postCondition);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.kind);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.presentationName);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.briefDescription);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.mainDescription);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.purpose);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.guidance);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.metric);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.category);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.copyright);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.author);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.changeDate);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.changeDescription);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.version);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.name);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.hasMultipleOccurrences);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.isOptional);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.isPlanned);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.isRepeatable);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.isOngoing);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.isEventDriven);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.linkToPredecessor);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.linkToSuccessor);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.variabilityType);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.variabilityBasedOnElement);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.useKind);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.usedActivity);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.suppressedBreakdownElement);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.defaultContext);
		propertiesStep.addStep(UmaViewsRepository.Phase.Properties.validContext);
		
		
		composer = new PartComposer(phaseStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == UmaViewsRepository.Phase.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.preCondition) {
					return createPreConditionMultiValuedEditor(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.postCondition) {
					return createPostConditionMultiValuedEditor(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.kind) {
					return createKindFlatComboViewer(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.presentationName) {
					return createPresentationNameText(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.briefDescription) {
					return createBriefDescriptionText(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.mainDescription) {
					return createMainDescriptionText(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.purpose) {
					return createPurposeText(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.guidance) {
					return createGuidanceAdvancedReferencesTable(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.metric) {
					return createMetricAdvancedReferencesTable(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.category) {
					return createCategoryAdvancedReferencesTable(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.copyright) {
					return createCopyrightText(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.author) {
					return createAuthorMultiValuedEditor(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.changeDate) {
					return createChangeDateText(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.changeDescription) {
					return createChangeDescriptionText(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.version) {
					return createVersionText(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.name) {
					return createNameText(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.hasMultipleOccurrences) {
					return createHasMultipleOccurrencesCheckbox(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.isOptional) {
					return createIsOptionalCheckbox(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.isPlanned) {
					return createIsPlannedCheckbox(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.isRepeatable) {
					return createIsRepeatableCheckbox(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.isOngoing) {
					return createIsOngoingCheckbox(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.isEventDriven) {
					return createIsEventDrivenCheckbox(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.linkToPredecessor) {
					return createLinkToPredecessorAdvancedReferencesTable(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.linkToSuccessor) {
					return createLinkToSuccessorAdvancedReferencesTable(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.variabilityType) {
					return createVariabilityTypeEMFComboViewer(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.variabilityBasedOnElement) {
					return createVariabilityBasedOnElementFlatComboViewer(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.useKind) {
					return createUseKindEMFComboViewer(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.usedActivity) {
					return createUsedActivityFlatComboViewer(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.suppressedBreakdownElement) {
					return createSuppressedBreakdownElementAdvancedReferencesTable(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.defaultContext) {
					return createDefaultContextFlatComboViewer(parent);
				}
				if (key == UmaViewsRepository.Phase.Properties.validContext) {
					return createValidContextAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(UmaMessages.PhasePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	protected Composite createPreConditionMultiValuedEditor(Composite parent) {
		preCondition = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData preConditionData = new GridData(GridData.FILL_HORIZONTAL);
		preConditionData.horizontalSpan = 2;
		preCondition.setLayoutData(preConditionData);
		EditingUtils.setID(preCondition, UmaViewsRepository.Phase.Properties.preCondition);
		EditingUtils.setEEFtype(preCondition, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editPreCondition = new Button(parent, SWT.NONE);
		editPreCondition.setText(UmaMessages.PhasePropertiesEditionPart_PreConditionLabel);
		GridData editPreConditionData = new GridData();
		editPreCondition.setLayoutData(editPreConditionData);
		editPreCondition.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						preCondition.getShell(), "Phase", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						preConditionList, SpemPackage.eINSTANCE.getWorkDefinition_PreCondition().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					preConditionList = dialog.getResult();
					if (preConditionList == null) {
						preConditionList = new BasicEList();
					}
					preCondition.setText(preConditionList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.preCondition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(preConditionList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editPreCondition, UmaViewsRepository.Phase.Properties.preCondition);
		EditingUtils.setEEFtype(editPreCondition, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}

	protected Composite createPostConditionMultiValuedEditor(Composite parent) {
		postCondition = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData postConditionData = new GridData(GridData.FILL_HORIZONTAL);
		postConditionData.horizontalSpan = 2;
		postCondition.setLayoutData(postConditionData);
		EditingUtils.setID(postCondition, UmaViewsRepository.Phase.Properties.postCondition);
		EditingUtils.setEEFtype(postCondition, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editPostCondition = new Button(parent, SWT.NONE);
		editPostCondition.setText(UmaMessages.PhasePropertiesEditionPart_PostConditionLabel);
		GridData editPostConditionData = new GridData();
		editPostCondition.setLayoutData(editPostConditionData);
		editPostCondition.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						postCondition.getShell(), "Phase", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						postConditionList, SpemPackage.eINSTANCE.getWorkDefinition_PostCondition().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					postConditionList = dialog.getResult();
					if (postConditionList == null) {
						postConditionList = new BasicEList();
					}
					postCondition.setText(postConditionList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.postCondition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(postConditionList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editPostCondition, UmaViewsRepository.Phase.Properties.postCondition);
		EditingUtils.setEEFtype(editPostCondition, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createKindFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, UmaMessages.PhasePropertiesEditionPart_KindLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Phase.Properties.kind, UmaViewsRepository.SWT_KIND));
		kind = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmaViewsRepository.Phase.Properties.kind, UmaViewsRepository.SWT_KIND));
		kind.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		kind.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.kind, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getKind()));
			}

		});
		GridData kindData = new GridData(GridData.FILL_HORIZONTAL);
		kind.setLayoutData(kindData);
		kind.setID(UmaViewsRepository.Phase.Properties.kind);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.kind, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPresentationNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, UmaMessages.PhasePropertiesEditionPart_PresentationNameLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Phase.Properties.presentationName, UmaViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.presentationName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, presentationName.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.presentationName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, presentationName.getText()));
				}
			}

		});
		EditingUtils.setID(presentationName, UmaViewsRepository.Phase.Properties.presentationName);
		EditingUtils.setEEFtype(presentationName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.presentationName, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBriefDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, UmaMessages.PhasePropertiesEditionPart_BriefDescriptionLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Phase.Properties.briefDescription, UmaViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.briefDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, briefDescription.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.briefDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, briefDescription.getText()));
				}
			}

		});
		EditingUtils.setID(briefDescription, UmaViewsRepository.Phase.Properties.briefDescription);
		EditingUtils.setEEFtype(briefDescription, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.briefDescription, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createMainDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, UmaMessages.PhasePropertiesEditionPart_MainDescriptionLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Phase.Properties.mainDescription, UmaViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.mainDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mainDescription.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.mainDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mainDescription.getText()));
				}
			}

		});
		EditingUtils.setID(mainDescription, UmaViewsRepository.Phase.Properties.mainDescription);
		EditingUtils.setEEFtype(mainDescription, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.mainDescription, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPurposeText(Composite parent) {
		SWTUtils.createPartLabel(parent, UmaMessages.PhasePropertiesEditionPart_PurposeLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Phase.Properties.purpose, UmaViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.purpose, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, purpose.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.purpose, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, purpose.getText()));
				}
			}

		});
		EditingUtils.setID(purpose, UmaViewsRepository.Phase.Properties.purpose);
		EditingUtils.setEEFtype(purpose, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.purpose, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createGuidanceAdvancedReferencesTable(Composite parent) {
		this.guidance = new ReferencesTable(UmaMessages.PhasePropertiesEditionPart_GuidanceLabel, new ReferencesTableListener() {
			public void handleAdd() { addGuidance(); }
			public void handleEdit(EObject element) { editGuidance(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveGuidance(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromGuidance(element); }
			public void navigateTo(EObject element) { }
		});
		this.guidance.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.guidance, UmaViewsRepository.SWT_KIND));
		this.guidance.createControls(parent);
		this.guidance.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.guidance, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData guidanceData = new GridData(GridData.FILL_HORIZONTAL);
		guidanceData.horizontalSpan = 3;
		this.guidance.setLayoutData(guidanceData);
		this.guidance.disableMove();
		guidance.setID(UmaViewsRepository.Phase.Properties.guidance);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.guidance,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.guidance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		guidance.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromGuidance(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.guidance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.metric = new ReferencesTable(UmaMessages.PhasePropertiesEditionPart_MetricLabel, new ReferencesTableListener() {
			public void handleAdd() { addMetric(); }
			public void handleEdit(EObject element) { editMetric(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveMetric(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromMetric(element); }
			public void navigateTo(EObject element) { }
		});
		this.metric.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.metric, UmaViewsRepository.SWT_KIND));
		this.metric.createControls(parent);
		this.metric.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.metric, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData metricData = new GridData(GridData.FILL_HORIZONTAL);
		metricData.horizontalSpan = 3;
		this.metric.setLayoutData(metricData);
		this.metric.disableMove();
		metric.setID(UmaViewsRepository.Phase.Properties.metric);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.metric,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.metric, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		metric.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMetric(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.metric, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.category = new ReferencesTable(UmaMessages.PhasePropertiesEditionPart_CategoryLabel, new ReferencesTableListener() {
			public void handleAdd() { addCategory(); }
			public void handleEdit(EObject element) { editCategory(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCategory(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCategory(element); }
			public void navigateTo(EObject element) { }
		});
		this.category.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.category, UmaViewsRepository.SWT_KIND));
		this.category.createControls(parent);
		this.category.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.category, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData categoryData = new GridData(GridData.FILL_HORIZONTAL);
		categoryData.horizontalSpan = 3;
		this.category.setLayoutData(categoryData);
		this.category.disableMove();
		category.setID(UmaViewsRepository.Phase.Properties.category);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.category,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		category.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCategory(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		SWTUtils.createPartLabel(parent, UmaMessages.PhasePropertiesEditionPart_CopyrightLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Phase.Properties.copyright, UmaViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.copyright, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, copyright.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.copyright, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, copyright.getText()));
				}
			}

		});
		EditingUtils.setID(copyright, UmaViewsRepository.Phase.Properties.copyright);
		EditingUtils.setEEFtype(copyright, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.copyright, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createAuthorMultiValuedEditor(Composite parent) {
		author = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData authorData = new GridData(GridData.FILL_HORIZONTAL);
		authorData.horizontalSpan = 2;
		author.setLayoutData(authorData);
		EditingUtils.setID(author, UmaViewsRepository.Phase.Properties.author);
		EditingUtils.setEEFtype(author, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editAuthor = new Button(parent, SWT.NONE);
		editAuthor.setText(UmaMessages.PhasePropertiesEditionPart_AuthorLabel);
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
						author.getShell(), "Phase", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						authorList, SpemPackage.eINSTANCE.getDescribableElement_Author().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					authorList = dialog.getResult();
					if (authorList == null) {
						authorList = new BasicEList();
					}
					author.setText(authorList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.author, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(authorList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editAuthor, UmaViewsRepository.Phase.Properties.author);
		EditingUtils.setEEFtype(editAuthor, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createChangeDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, UmaMessages.PhasePropertiesEditionPart_ChangeDateLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Phase.Properties.changeDate, UmaViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.changeDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.changeDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDate.getText()));
				}
			}

		});
		EditingUtils.setID(changeDate, UmaViewsRepository.Phase.Properties.changeDate);
		EditingUtils.setEEFtype(changeDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.changeDate, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createChangeDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, UmaMessages.PhasePropertiesEditionPart_ChangeDescriptionLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Phase.Properties.changeDescription, UmaViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.changeDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDescription.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.changeDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDescription.getText()));
				}
			}

		});
		EditingUtils.setID(changeDescription, UmaViewsRepository.Phase.Properties.changeDescription);
		EditingUtils.setEEFtype(changeDescription, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.changeDescription, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createVersionText(Composite parent) {
		SWTUtils.createPartLabel(parent, UmaMessages.PhasePropertiesEditionPart_VersionLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Phase.Properties.version, UmaViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
				}
			}

		});
		EditingUtils.setID(version, UmaViewsRepository.Phase.Properties.version);
		EditingUtils.setEEFtype(version, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.version, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, UmaMessages.PhasePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Phase.Properties.name, UmaViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, UmaViewsRepository.Phase.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.name, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createHasMultipleOccurrencesCheckbox(Composite parent) {
		hasMultipleOccurrences = new Button(parent, SWT.CHECK);
		hasMultipleOccurrences.setText(UmaMessages.PhasePropertiesEditionPart_HasMultipleOccurrencesLabel);
		hasMultipleOccurrences.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.hasMultipleOccurrences, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(hasMultipleOccurrences.getSelection())));
			}

		});
		GridData hasMultipleOccurrencesData = new GridData(GridData.FILL_HORIZONTAL);
		hasMultipleOccurrencesData.horizontalSpan = 2;
		hasMultipleOccurrences.setLayoutData(hasMultipleOccurrencesData);
		EditingUtils.setID(hasMultipleOccurrences, UmaViewsRepository.Phase.Properties.hasMultipleOccurrences);
		EditingUtils.setEEFtype(hasMultipleOccurrences, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.hasMultipleOccurrences, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsOptionalCheckbox(Composite parent) {
		isOptional = new Button(parent, SWT.CHECK);
		isOptional.setText(UmaMessages.PhasePropertiesEditionPart_IsOptionalLabel);
		isOptional.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.isOptional, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isOptional.getSelection())));
			}

		});
		GridData isOptionalData = new GridData(GridData.FILL_HORIZONTAL);
		isOptionalData.horizontalSpan = 2;
		isOptional.setLayoutData(isOptionalData);
		EditingUtils.setID(isOptional, UmaViewsRepository.Phase.Properties.isOptional);
		EditingUtils.setEEFtype(isOptional, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.isOptional, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsPlannedCheckbox(Composite parent) {
		isPlanned = new Button(parent, SWT.CHECK);
		isPlanned.setText(UmaMessages.PhasePropertiesEditionPart_IsPlannedLabel);
		isPlanned.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.isPlanned, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isPlanned.getSelection())));
			}

		});
		GridData isPlannedData = new GridData(GridData.FILL_HORIZONTAL);
		isPlannedData.horizontalSpan = 2;
		isPlanned.setLayoutData(isPlannedData);
		EditingUtils.setID(isPlanned, UmaViewsRepository.Phase.Properties.isPlanned);
		EditingUtils.setEEFtype(isPlanned, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.isPlanned, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsRepeatableCheckbox(Composite parent) {
		isRepeatable = new Button(parent, SWT.CHECK);
		isRepeatable.setText(UmaMessages.PhasePropertiesEditionPart_IsRepeatableLabel);
		isRepeatable.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.isRepeatable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isRepeatable.getSelection())));
			}

		});
		GridData isRepeatableData = new GridData(GridData.FILL_HORIZONTAL);
		isRepeatableData.horizontalSpan = 2;
		isRepeatable.setLayoutData(isRepeatableData);
		EditingUtils.setID(isRepeatable, UmaViewsRepository.Phase.Properties.isRepeatable);
		EditingUtils.setEEFtype(isRepeatable, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.isRepeatable, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsOngoingCheckbox(Composite parent) {
		isOngoing = new Button(parent, SWT.CHECK);
		isOngoing.setText(UmaMessages.PhasePropertiesEditionPart_IsOngoingLabel);
		isOngoing.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.isOngoing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isOngoing.getSelection())));
			}

		});
		GridData isOngoingData = new GridData(GridData.FILL_HORIZONTAL);
		isOngoingData.horizontalSpan = 2;
		isOngoing.setLayoutData(isOngoingData);
		EditingUtils.setID(isOngoing, UmaViewsRepository.Phase.Properties.isOngoing);
		EditingUtils.setEEFtype(isOngoing, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.isOngoing, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsEventDrivenCheckbox(Composite parent) {
		isEventDriven = new Button(parent, SWT.CHECK);
		isEventDriven.setText(UmaMessages.PhasePropertiesEditionPart_IsEventDrivenLabel);
		isEventDriven.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.isEventDriven, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isEventDriven.getSelection())));
			}

		});
		GridData isEventDrivenData = new GridData(GridData.FILL_HORIZONTAL);
		isEventDrivenData.horizontalSpan = 2;
		isEventDriven.setLayoutData(isEventDrivenData);
		EditingUtils.setID(isEventDriven, UmaViewsRepository.Phase.Properties.isEventDriven);
		EditingUtils.setEEFtype(isEventDriven, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.isEventDriven, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createLinkToPredecessorAdvancedReferencesTable(Composite parent) {
		this.linkToPredecessor = new ReferencesTable(UmaMessages.PhasePropertiesEditionPart_LinkToPredecessorLabel, new ReferencesTableListener() {
			public void handleAdd() { addLinkToPredecessor(); }
			public void handleEdit(EObject element) { editLinkToPredecessor(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveLinkToPredecessor(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromLinkToPredecessor(element); }
			public void navigateTo(EObject element) { }
		});
		this.linkToPredecessor.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.linkToPredecessor, UmaViewsRepository.SWT_KIND));
		this.linkToPredecessor.createControls(parent);
		this.linkToPredecessor.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.linkToPredecessor, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData linkToPredecessorData = new GridData(GridData.FILL_HORIZONTAL);
		linkToPredecessorData.horizontalSpan = 3;
		this.linkToPredecessor.setLayoutData(linkToPredecessorData);
		this.linkToPredecessor.disableMove();
		linkToPredecessor.setID(UmaViewsRepository.Phase.Properties.linkToPredecessor);
		linkToPredecessor.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addLinkToPredecessor() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(linkToPredecessor.getInput(), linkToPredecessorFilters, linkToPredecessorBusinessFilters,
		"linkToPredecessor", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.linkToPredecessor,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				linkToPredecessor.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveLinkToPredecessor(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.linkToPredecessor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		linkToPredecessor.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromLinkToPredecessor(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.linkToPredecessor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		linkToPredecessor.refresh();
	}

	/**
	 * 
	 */
	protected void editLinkToPredecessor(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				linkToPredecessor.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createLinkToSuccessorAdvancedReferencesTable(Composite parent) {
		this.linkToSuccessor = new ReferencesTable(UmaMessages.PhasePropertiesEditionPart_LinkToSuccessorLabel, new ReferencesTableListener() {
			public void handleAdd() { addLinkToSuccessor(); }
			public void handleEdit(EObject element) { editLinkToSuccessor(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveLinkToSuccessor(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromLinkToSuccessor(element); }
			public void navigateTo(EObject element) { }
		});
		this.linkToSuccessor.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.linkToSuccessor, UmaViewsRepository.SWT_KIND));
		this.linkToSuccessor.createControls(parent);
		this.linkToSuccessor.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.linkToSuccessor, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData linkToSuccessorData = new GridData(GridData.FILL_HORIZONTAL);
		linkToSuccessorData.horizontalSpan = 3;
		this.linkToSuccessor.setLayoutData(linkToSuccessorData);
		this.linkToSuccessor.disableMove();
		linkToSuccessor.setID(UmaViewsRepository.Phase.Properties.linkToSuccessor);
		linkToSuccessor.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addLinkToSuccessor() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(linkToSuccessor.getInput(), linkToSuccessorFilters, linkToSuccessorBusinessFilters,
		"linkToSuccessor", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.linkToSuccessor,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				linkToSuccessor.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveLinkToSuccessor(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.linkToSuccessor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		linkToSuccessor.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromLinkToSuccessor(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.linkToSuccessor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		linkToSuccessor.refresh();
	}

	/**
	 * 
	 */
	protected void editLinkToSuccessor(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				linkToSuccessor.refresh();
			}
		}
	}

	
	protected Composite createVariabilityTypeEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, UmaMessages.PhasePropertiesEditionPart_VariabilityTypeLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Phase.Properties.variabilityType, UmaViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.variabilityType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVariabilityType()));
			}

		});
		variabilityType.setID(UmaViewsRepository.Phase.Properties.variabilityType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.variabilityType, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createVariabilityBasedOnElementFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, UmaMessages.PhasePropertiesEditionPart_VariabilityBasedOnElementLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Phase.Properties.variabilityBasedOnElement, UmaViewsRepository.SWT_KIND));
		variabilityBasedOnElement = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmaViewsRepository.Phase.Properties.variabilityBasedOnElement, UmaViewsRepository.SWT_KIND));
		variabilityBasedOnElement.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		variabilityBasedOnElement.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.variabilityBasedOnElement, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getVariabilityBasedOnElement()));
			}

		});
		GridData variabilityBasedOnElementData = new GridData(GridData.FILL_HORIZONTAL);
		variabilityBasedOnElement.setLayoutData(variabilityBasedOnElementData);
		variabilityBasedOnElement.setID(UmaViewsRepository.Phase.Properties.variabilityBasedOnElement);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.variabilityBasedOnElement, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createUseKindEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, UmaMessages.PhasePropertiesEditionPart_UseKindLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Phase.Properties.useKind, UmaViewsRepository.SWT_KIND));
		useKind = new EMFComboViewer(parent);
		useKind.setContentProvider(new ArrayContentProvider());
		useKind.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData useKindData = new GridData(GridData.FILL_HORIZONTAL);
		useKind.getCombo().setLayoutData(useKindData);
		useKind.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.useKind, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getUseKind()));
			}

		});
		useKind.setID(UmaViewsRepository.Phase.Properties.useKind);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.useKind, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createUsedActivityFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, UmaMessages.PhasePropertiesEditionPart_UsedActivityLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Phase.Properties.usedActivity, UmaViewsRepository.SWT_KIND));
		usedActivity = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmaViewsRepository.Phase.Properties.usedActivity, UmaViewsRepository.SWT_KIND));
		usedActivity.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		usedActivity.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.usedActivity, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getUsedActivity()));
			}

		});
		GridData usedActivityData = new GridData(GridData.FILL_HORIZONTAL);
		usedActivity.setLayoutData(usedActivityData);
		usedActivity.setID(UmaViewsRepository.Phase.Properties.usedActivity);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.usedActivity, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSuppressedBreakdownElementAdvancedReferencesTable(Composite parent) {
		this.suppressedBreakdownElement = new ReferencesTable(UmaMessages.PhasePropertiesEditionPart_SuppressedBreakdownElementLabel, new ReferencesTableListener() {
			public void handleAdd() { addSuppressedBreakdownElement(); }
			public void handleEdit(EObject element) { editSuppressedBreakdownElement(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSuppressedBreakdownElement(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSuppressedBreakdownElement(element); }
			public void navigateTo(EObject element) { }
		});
		this.suppressedBreakdownElement.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.suppressedBreakdownElement, UmaViewsRepository.SWT_KIND));
		this.suppressedBreakdownElement.createControls(parent);
		this.suppressedBreakdownElement.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.suppressedBreakdownElement, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData suppressedBreakdownElementData = new GridData(GridData.FILL_HORIZONTAL);
		suppressedBreakdownElementData.horizontalSpan = 3;
		this.suppressedBreakdownElement.setLayoutData(suppressedBreakdownElementData);
		this.suppressedBreakdownElement.disableMove();
		suppressedBreakdownElement.setID(UmaViewsRepository.Phase.Properties.suppressedBreakdownElement);
		suppressedBreakdownElement.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSuppressedBreakdownElement() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(suppressedBreakdownElement.getInput(), suppressedBreakdownElementFilters, suppressedBreakdownElementBusinessFilters,
		"suppressedBreakdownElement", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.suppressedBreakdownElement,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				suppressedBreakdownElement.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSuppressedBreakdownElement(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.suppressedBreakdownElement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		suppressedBreakdownElement.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSuppressedBreakdownElement(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.suppressedBreakdownElement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		suppressedBreakdownElement.refresh();
	}

	/**
	 * 
	 */
	protected void editSuppressedBreakdownElement(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				suppressedBreakdownElement.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createDefaultContextFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, UmaMessages.PhasePropertiesEditionPart_DefaultContextLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Phase.Properties.defaultContext, UmaViewsRepository.SWT_KIND));
		defaultContext = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmaViewsRepository.Phase.Properties.defaultContext, UmaViewsRepository.SWT_KIND));
		defaultContext.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		defaultContext.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.defaultContext, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getDefaultContext()));
			}

		});
		GridData defaultContextData = new GridData(GridData.FILL_HORIZONTAL);
		defaultContext.setLayoutData(defaultContextData);
		defaultContext.setID(UmaViewsRepository.Phase.Properties.defaultContext);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.defaultContext, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createValidContextAdvancedReferencesTable(Composite parent) {
		this.validContext = new ReferencesTable(UmaMessages.PhasePropertiesEditionPart_ValidContextLabel, new ReferencesTableListener() {
			public void handleAdd() { addValidContext(); }
			public void handleEdit(EObject element) { editValidContext(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveValidContext(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromValidContext(element); }
			public void navigateTo(EObject element) { }
		});
		this.validContext.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.Phase.Properties.validContext, UmaViewsRepository.SWT_KIND));
		this.validContext.createControls(parent);
		this.validContext.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.validContext, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData validContextData = new GridData(GridData.FILL_HORIZONTAL);
		validContextData.horizontalSpan = 3;
		this.validContext.setLayoutData(validContextData);
		this.validContext.disableMove();
		validContext.setID(UmaViewsRepository.Phase.Properties.validContext);
		validContext.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addValidContext() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(validContext.getInput(), validContextFilters, validContextBusinessFilters,
		"validContext", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.validContext,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				validContext.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveValidContext(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.validContext, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		validContext.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromValidContext(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhasePropertiesEditionPartImpl.this, UmaViewsRepository.Phase.Properties.validContext, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		validContext.refresh();
	}

	/**
	 * 
	 */
	protected void editValidContext(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				validContext.refresh();
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#getPreCondition()
	 * 
	 */
	public EList getPreCondition() {
		return preConditionList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setPreCondition(EList newValue)
	 * 
	 */
	public void setPreCondition(EList newValue) {
		preConditionList = newValue;
		if (newValue != null) {
			preCondition.setText(preConditionList.toString());
		} else {
			preCondition.setText(""); //$NON-NLS-1$
		}
	}

	public void addToPreCondition(Object newValue) {
		preConditionList.add(newValue);
		if (newValue != null) {
			preCondition.setText(preConditionList.toString());
		} else {
			preCondition.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToPreCondition(Object newValue) {
		preConditionList.remove(newValue);
		if (newValue != null) {
			preCondition.setText(preConditionList.toString());
		} else {
			preCondition.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#getPostCondition()
	 * 
	 */
	public EList getPostCondition() {
		return postConditionList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setPostCondition(EList newValue)
	 * 
	 */
	public void setPostCondition(EList newValue) {
		postConditionList = newValue;
		if (newValue != null) {
			postCondition.setText(postConditionList.toString());
		} else {
			postCondition.setText(""); //$NON-NLS-1$
		}
	}

	public void addToPostCondition(Object newValue) {
		postConditionList.add(newValue);
		if (newValue != null) {
			postCondition.setText(postConditionList.toString());
		} else {
			postCondition.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToPostCondition(Object newValue) {
		postConditionList.remove(newValue);
		if (newValue != null) {
			postCondition.setText(postConditionList.toString());
		} else {
			postCondition.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#getKind()
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#initKind(EObjectFlatComboSettings)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setKind(EObject newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setKindButtonMode(ButtonsModeEnum newValue)
	 */
	public void setKindButtonMode(ButtonsModeEnum newValue) {
		kind.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#addFilterKind(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKind(ViewerFilter filter) {
		kind.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#addBusinessFilterKind(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKind(ViewerFilter filter) {
		kind.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#getPresentationName()
	 * 
	 */
	public String getPresentationName() {
		return presentationName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setPresentationName(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#getBriefDescription()
	 * 
	 */
	public String getBriefDescription() {
		return briefDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setBriefDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#getMainDescription()
	 * 
	 */
	public String getMainDescription() {
		return mainDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setMainDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#getPurpose()
	 * 
	 */
	public String getPurpose() {
		return purpose.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setPurpose(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#initGuidance(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#updateGuidance()
	 * 
	 */
	public void updateGuidance() {
	guidance.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#addFilterGuidance(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGuidance(ViewerFilter filter) {
		guidanceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#addBusinessFilterGuidance(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGuidance(ViewerFilter filter) {
		guidanceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#isContainedInGuidanceTable(EObject element)
	 * 
	 */
	public boolean isContainedInGuidanceTable(EObject element) {
		return ((ReferencesTableSettings)guidance.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#initMetric(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#updateMetric()
	 * 
	 */
	public void updateMetric() {
	metric.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#addFilterMetric(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMetric(ViewerFilter filter) {
		metricFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#addBusinessFilterMetric(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMetric(ViewerFilter filter) {
		metricBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#isContainedInMetricTable(EObject element)
	 * 
	 */
	public boolean isContainedInMetricTable(EObject element) {
		return ((ReferencesTableSettings)metric.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#initCategory(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#updateCategory()
	 * 
	 */
	public void updateCategory() {
	category.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#addFilterCategory(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCategory(ViewerFilter filter) {
		categoryFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#addBusinessFilterCategory(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCategory(ViewerFilter filter) {
		categoryBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#isContainedInCategoryTable(EObject element)
	 * 
	 */
	public boolean isContainedInCategoryTable(EObject element) {
		return ((ReferencesTableSettings)category.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#getCopyright()
	 * 
	 */
	public String getCopyright() {
		return copyright.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setCopyright(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#getAuthor()
	 * 
	 */
	public EList getAuthor() {
		return authorList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setAuthor(EList newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#getChangeDate()
	 * 
	 */
	public String getChangeDate() {
		return changeDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setChangeDate(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#getChangeDescription()
	 * 
	 */
	public String getChangeDescription() {
		return changeDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setChangeDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#getVersion()
	 * 
	 */
	public String getVersion() {
		return version.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setVersion(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#getHasMultipleOccurrences()
	 * 
	 */
	public Boolean getHasMultipleOccurrences() {
		return Boolean.valueOf(hasMultipleOccurrences.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setHasMultipleOccurrences(Boolean newValue)
	 * 
	 */
	public void setHasMultipleOccurrences(Boolean newValue) {
		if (newValue != null) {
			hasMultipleOccurrences.setSelection(newValue.booleanValue());
		} else {
			hasMultipleOccurrences.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#getIsOptional()
	 * 
	 */
	public Boolean getIsOptional() {
		return Boolean.valueOf(isOptional.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setIsOptional(Boolean newValue)
	 * 
	 */
	public void setIsOptional(Boolean newValue) {
		if (newValue != null) {
			isOptional.setSelection(newValue.booleanValue());
		} else {
			isOptional.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#getIsPlanned()
	 * 
	 */
	public Boolean getIsPlanned() {
		return Boolean.valueOf(isPlanned.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setIsPlanned(Boolean newValue)
	 * 
	 */
	public void setIsPlanned(Boolean newValue) {
		if (newValue != null) {
			isPlanned.setSelection(newValue.booleanValue());
		} else {
			isPlanned.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#getIsRepeatable()
	 * 
	 */
	public Boolean getIsRepeatable() {
		return Boolean.valueOf(isRepeatable.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setIsRepeatable(Boolean newValue)
	 * 
	 */
	public void setIsRepeatable(Boolean newValue) {
		if (newValue != null) {
			isRepeatable.setSelection(newValue.booleanValue());
		} else {
			isRepeatable.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#getIsOngoing()
	 * 
	 */
	public Boolean getIsOngoing() {
		return Boolean.valueOf(isOngoing.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setIsOngoing(Boolean newValue)
	 * 
	 */
	public void setIsOngoing(Boolean newValue) {
		if (newValue != null) {
			isOngoing.setSelection(newValue.booleanValue());
		} else {
			isOngoing.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#getIsEventDriven()
	 * 
	 */
	public Boolean getIsEventDriven() {
		return Boolean.valueOf(isEventDriven.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setIsEventDriven(Boolean newValue)
	 * 
	 */
	public void setIsEventDriven(Boolean newValue) {
		if (newValue != null) {
			isEventDriven.setSelection(newValue.booleanValue());
		} else {
			isEventDriven.setSelection(false);
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#initLinkToPredecessor(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initLinkToPredecessor(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		linkToPredecessor.setContentProvider(contentProvider);
		linkToPredecessor.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#updateLinkToPredecessor()
	 * 
	 */
	public void updateLinkToPredecessor() {
	linkToPredecessor.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#addFilterLinkToPredecessor(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLinkToPredecessor(ViewerFilter filter) {
		linkToPredecessorFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#addBusinessFilterLinkToPredecessor(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLinkToPredecessor(ViewerFilter filter) {
		linkToPredecessorBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#isContainedInLinkToPredecessorTable(EObject element)
	 * 
	 */
	public boolean isContainedInLinkToPredecessorTable(EObject element) {
		return ((ReferencesTableSettings)linkToPredecessor.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#initLinkToSuccessor(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initLinkToSuccessor(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		linkToSuccessor.setContentProvider(contentProvider);
		linkToSuccessor.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#updateLinkToSuccessor()
	 * 
	 */
	public void updateLinkToSuccessor() {
	linkToSuccessor.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#addFilterLinkToSuccessor(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLinkToSuccessor(ViewerFilter filter) {
		linkToSuccessorFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#addBusinessFilterLinkToSuccessor(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLinkToSuccessor(ViewerFilter filter) {
		linkToSuccessorBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#isContainedInLinkToSuccessorTable(EObject element)
	 * 
	 */
	public boolean isContainedInLinkToSuccessorTable(EObject element) {
		return ((ReferencesTableSettings)linkToSuccessor.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#getVariabilityType()
	 * 
	 */
	public Enumerator getVariabilityType() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) variabilityType.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#initVariabilityType(EEnum eenum, Enumerator current)
	 */
	public void initVariabilityType(EEnum eenum, Enumerator current) {
		variabilityType.setInput(eenum.getELiterals());
		variabilityType.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setVariabilityType(Enumerator newValue)
	 * 
	 */
	public void setVariabilityType(Enumerator newValue) {
		variabilityType.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#getVariabilityBasedOnElement()
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#initVariabilityBasedOnElement(EObjectFlatComboSettings)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setVariabilityBasedOnElement(EObject newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setVariabilityBasedOnElementButtonMode(ButtonsModeEnum newValue)
	 */
	public void setVariabilityBasedOnElementButtonMode(ButtonsModeEnum newValue) {
		variabilityBasedOnElement.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#addFilterVariabilityBasedOnElement(ViewerFilter filter)
	 * 
	 */
	public void addFilterToVariabilityBasedOnElement(ViewerFilter filter) {
		variabilityBasedOnElement.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#addBusinessFilterVariabilityBasedOnElement(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToVariabilityBasedOnElement(ViewerFilter filter) {
		variabilityBasedOnElement.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#getUseKind()
	 * 
	 */
	public Enumerator getUseKind() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) useKind.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#initUseKind(EEnum eenum, Enumerator current)
	 */
	public void initUseKind(EEnum eenum, Enumerator current) {
		useKind.setInput(eenum.getELiterals());
		useKind.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setUseKind(Enumerator newValue)
	 * 
	 */
	public void setUseKind(Enumerator newValue) {
		useKind.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#getUsedActivity()
	 * 
	 */
	public EObject getUsedActivity() {
		if (usedActivity.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) usedActivity.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#initUsedActivity(EObjectFlatComboSettings)
	 */
	public void initUsedActivity(EObjectFlatComboSettings settings) {
		usedActivity.setInput(settings);
		if (current != null) {
			usedActivity.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setUsedActivity(EObject newValue)
	 * 
	 */
	public void setUsedActivity(EObject newValue) {
		if (newValue != null) {
			usedActivity.setSelection(new StructuredSelection(newValue));
		} else {
			usedActivity.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setUsedActivityButtonMode(ButtonsModeEnum newValue)
	 */
	public void setUsedActivityButtonMode(ButtonsModeEnum newValue) {
		usedActivity.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#addFilterUsedActivity(ViewerFilter filter)
	 * 
	 */
	public void addFilterToUsedActivity(ViewerFilter filter) {
		usedActivity.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#addBusinessFilterUsedActivity(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToUsedActivity(ViewerFilter filter) {
		usedActivity.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#initSuppressedBreakdownElement(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSuppressedBreakdownElement(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		suppressedBreakdownElement.setContentProvider(contentProvider);
		suppressedBreakdownElement.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#updateSuppressedBreakdownElement()
	 * 
	 */
	public void updateSuppressedBreakdownElement() {
	suppressedBreakdownElement.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#addFilterSuppressedBreakdownElement(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSuppressedBreakdownElement(ViewerFilter filter) {
		suppressedBreakdownElementFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#addBusinessFilterSuppressedBreakdownElement(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSuppressedBreakdownElement(ViewerFilter filter) {
		suppressedBreakdownElementBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#isContainedInSuppressedBreakdownElementTable(EObject element)
	 * 
	 */
	public boolean isContainedInSuppressedBreakdownElementTable(EObject element) {
		return ((ReferencesTableSettings)suppressedBreakdownElement.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#getDefaultContext()
	 * 
	 */
	public EObject getDefaultContext() {
		if (defaultContext.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) defaultContext.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#initDefaultContext(EObjectFlatComboSettings)
	 */
	public void initDefaultContext(EObjectFlatComboSettings settings) {
		defaultContext.setInput(settings);
		if (current != null) {
			defaultContext.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setDefaultContext(EObject newValue)
	 * 
	 */
	public void setDefaultContext(EObject newValue) {
		if (newValue != null) {
			defaultContext.setSelection(new StructuredSelection(newValue));
		} else {
			defaultContext.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#setDefaultContextButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDefaultContextButtonMode(ButtonsModeEnum newValue) {
		defaultContext.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#addFilterDefaultContext(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDefaultContext(ViewerFilter filter) {
		defaultContext.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#addBusinessFilterDefaultContext(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDefaultContext(ViewerFilter filter) {
		defaultContext.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#initValidContext(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initValidContext(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		validContext.setContentProvider(contentProvider);
		validContext.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#updateValidContext()
	 * 
	 */
	public void updateValidContext() {
	validContext.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#addFilterValidContext(ViewerFilter filter)
	 * 
	 */
	public void addFilterToValidContext(ViewerFilter filter) {
		validContextFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#addBusinessFilterValidContext(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToValidContext(ViewerFilter filter) {
		validContextBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PhasePropertiesEditionPart#isContainedInValidContextTable(EObject element)
	 * 
	 */
	public boolean isContainedInValidContextTable(EObject element) {
		return ((ReferencesTableSettings)validContext.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return UmaMessages.Phase_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
