/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.uma.parts.forms;

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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.uma.UmaPackage;
import org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart;
import org.obeonetwork.dsl.spem.uma.parts.UmaViewsRepository;
import org.obeonetwork.dsl.spem.uma.providers.UmaMessages;


// End of user code

/**
 * 
 * 
 */
public class PracticePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, PracticePropertiesEditionPart {

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
		protected ReferencesTable referencedActivity;
		protected List<ViewerFilter> referencedActivityBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> referencedActivityFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable contentReference;
		protected List<ViewerFilter> contentReferenceBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> contentReferenceFilters = new ArrayList<ViewerFilter>();
	protected Text additionalInfo;
	protected Text application;
	protected Text background;
	protected Text goal;
		protected Button editGoal;
		private EList goalList;
	protected Text levelOfAdoption;
		protected Button editLevelOfAdoption;
		private EList levelOfAdoptionList;
	protected Text problem;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PracticePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence practiceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = practiceStep.addStep(UmaViewsRepository.Practice.Properties.class);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.kind);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.presentationName);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.briefDescription);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.mainDescription);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.purpose);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.guidance);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.metric);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.category);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.copyright);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.author);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.changeDate);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.changeDescription);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.version);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.name);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.variabilityType);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.variabilityBasedOnElement);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.methodContentKind);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.referencedActivity);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.contentReference);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.additionalInfo);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.application);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.background);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.goal);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.levelOfAdoption);
		propertiesStep.addStep(UmaViewsRepository.Practice.Properties.problem);
		
		
		composer = new PartComposer(practiceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == UmaViewsRepository.Practice.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Practice.Properties.kind) {
					return createKindFlatComboViewer(parent, widgetFactory);
				}
				if (key == UmaViewsRepository.Practice.Properties.presentationName) {
					return 		createPresentationNameText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Practice.Properties.briefDescription) {
					return 		createBriefDescriptionText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Practice.Properties.mainDescription) {
					return 		createMainDescriptionText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Practice.Properties.purpose) {
					return 		createPurposeText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Practice.Properties.guidance) {
					return createGuidanceReferencesTable(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Practice.Properties.metric) {
					return createMetricReferencesTable(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Practice.Properties.category) {
					return createCategoryReferencesTable(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Practice.Properties.copyright) {
					return 		createCopyrightText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Practice.Properties.author) {
					return createAuthorMultiValuedEditor(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Practice.Properties.changeDate) {
					return 		createChangeDateText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Practice.Properties.changeDescription) {
					return 		createChangeDescriptionText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Practice.Properties.version) {
					return 		createVersionText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Practice.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Practice.Properties.variabilityType) {
					return createVariabilityTypeEMFComboViewer(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Practice.Properties.variabilityBasedOnElement) {
					return createVariabilityBasedOnElementFlatComboViewer(parent, widgetFactory);
				}
				if (key == UmaViewsRepository.Practice.Properties.methodContentKind) {
					return createMethodContentKindFlatComboViewer(parent, widgetFactory);
				}
				if (key == UmaViewsRepository.Practice.Properties.referencedActivity) {
					return createReferencedActivityReferencesTable(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Practice.Properties.contentReference) {
					return createContentReferenceReferencesTable(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Practice.Properties.additionalInfo) {
					return 		createAdditionalInfoText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Practice.Properties.application) {
					return 		createApplicationText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Practice.Properties.background) {
					return 		createBackgroundText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Practice.Properties.goal) {
					return createGoalMultiValuedEditor(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Practice.Properties.levelOfAdoption) {
					return createLevelOfAdoptionMultiValuedEditor(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Practice.Properties.problem) {
					return 		createProblemText(widgetFactory, parent);
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
		propertiesSection.setText(UmaMessages.PracticePropertiesEditionPart_PropertiesGroupLabel);
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

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createKindFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.PracticePropertiesEditionPart_KindLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Practice.Properties.kind, UmaViewsRepository.FORM_KIND));
		kind = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmaViewsRepository.Practice.Properties.kind, UmaViewsRepository.FORM_KIND));
		widgetFactory.adapt(kind);
		kind.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData kindData = new GridData(GridData.FILL_HORIZONTAL);
		kind.setLayoutData(kindData);
		kind.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.kind, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getKind()));
			}

		});
		kind.setID(UmaViewsRepository.Practice.Properties.kind);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Practice.Properties.kind, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPresentationNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.PracticePropertiesEditionPart_PresentationNameLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Practice.Properties.presentationName, UmaViewsRepository.FORM_KIND));
		presentationName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		presentationName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData presentationNameData = new GridData(GridData.FILL_HORIZONTAL);
		presentationName.setLayoutData(presentationNameData);
		presentationName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.presentationName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, presentationName.getText()));
			}
		});
		presentationName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.presentationName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, presentationName.getText()));
				}
			}
		});
		EditingUtils.setID(presentationName, UmaViewsRepository.Practice.Properties.presentationName);
		EditingUtils.setEEFtype(presentationName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Practice.Properties.presentationName, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBriefDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.PracticePropertiesEditionPart_BriefDescriptionLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Practice.Properties.briefDescription, UmaViewsRepository.FORM_KIND));
		briefDescription = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		briefDescription.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData briefDescriptionData = new GridData(GridData.FILL_HORIZONTAL);
		briefDescription.setLayoutData(briefDescriptionData);
		briefDescription.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.briefDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, briefDescription.getText()));
			}
		});
		briefDescription.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.briefDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, briefDescription.getText()));
				}
			}
		});
		EditingUtils.setID(briefDescription, UmaViewsRepository.Practice.Properties.briefDescription);
		EditingUtils.setEEFtype(briefDescription, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Practice.Properties.briefDescription, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createMainDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.PracticePropertiesEditionPart_MainDescriptionLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Practice.Properties.mainDescription, UmaViewsRepository.FORM_KIND));
		mainDescription = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		mainDescription.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData mainDescriptionData = new GridData(GridData.FILL_HORIZONTAL);
		mainDescription.setLayoutData(mainDescriptionData);
		mainDescription.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.mainDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mainDescription.getText()));
			}
		});
		mainDescription.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.mainDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mainDescription.getText()));
				}
			}
		});
		EditingUtils.setID(mainDescription, UmaViewsRepository.Practice.Properties.mainDescription);
		EditingUtils.setEEFtype(mainDescription, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Practice.Properties.mainDescription, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPurposeText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.PracticePropertiesEditionPart_PurposeLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Practice.Properties.purpose, UmaViewsRepository.FORM_KIND));
		purpose = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		purpose.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData purposeData = new GridData(GridData.FILL_HORIZONTAL);
		purpose.setLayoutData(purposeData);
		purpose.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.purpose, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, purpose.getText()));
			}
		});
		purpose.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.purpose, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, purpose.getText()));
				}
			}
		});
		EditingUtils.setID(purpose, UmaViewsRepository.Practice.Properties.purpose);
		EditingUtils.setEEFtype(purpose, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Practice.Properties.purpose, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createGuidanceReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.guidance = new ReferencesTable(UmaMessages.PracticePropertiesEditionPart_GuidanceLabel, new ReferencesTableListener	() {
			public void handleAdd() { addGuidance(); }
			public void handleEdit(EObject element) { editGuidance(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveGuidance(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromGuidance(element); }
			public void navigateTo(EObject element) { }
		});
		this.guidance.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.Practice.Properties.guidance, UmaViewsRepository.FORM_KIND));
		this.guidance.createControls(parent, widgetFactory);
		this.guidance.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.guidance, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData guidanceData = new GridData(GridData.FILL_HORIZONTAL);
		guidanceData.horizontalSpan = 3;
		this.guidance.setLayoutData(guidanceData);
		this.guidance.disableMove();
		guidance.setID(UmaViewsRepository.Practice.Properties.guidance);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.guidance,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.guidance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		guidance.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromGuidance(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.guidance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createMetricReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.metric = new ReferencesTable(UmaMessages.PracticePropertiesEditionPart_MetricLabel, new ReferencesTableListener	() {
			public void handleAdd() { addMetric(); }
			public void handleEdit(EObject element) { editMetric(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveMetric(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromMetric(element); }
			public void navigateTo(EObject element) { }
		});
		this.metric.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.Practice.Properties.metric, UmaViewsRepository.FORM_KIND));
		this.metric.createControls(parent, widgetFactory);
		this.metric.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.metric, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData metricData = new GridData(GridData.FILL_HORIZONTAL);
		metricData.horizontalSpan = 3;
		this.metric.setLayoutData(metricData);
		this.metric.disableMove();
		metric.setID(UmaViewsRepository.Practice.Properties.metric);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.metric,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.metric, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		metric.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMetric(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.metric, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createCategoryReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.category = new ReferencesTable(UmaMessages.PracticePropertiesEditionPart_CategoryLabel, new ReferencesTableListener	() {
			public void handleAdd() { addCategory(); }
			public void handleEdit(EObject element) { editCategory(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCategory(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCategory(element); }
			public void navigateTo(EObject element) { }
		});
		this.category.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.Practice.Properties.category, UmaViewsRepository.FORM_KIND));
		this.category.createControls(parent, widgetFactory);
		this.category.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.category, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData categoryData = new GridData(GridData.FILL_HORIZONTAL);
		categoryData.horizontalSpan = 3;
		this.category.setLayoutData(categoryData);
		this.category.disableMove();
		category.setID(UmaViewsRepository.Practice.Properties.category);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.category,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		category.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCategory(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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

	
	protected Composite createCopyrightText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.PracticePropertiesEditionPart_CopyrightLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Practice.Properties.copyright, UmaViewsRepository.FORM_KIND));
		copyright = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		copyright.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData copyrightData = new GridData(GridData.FILL_HORIZONTAL);
		copyright.setLayoutData(copyrightData);
		copyright.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.copyright, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, copyright.getText()));
			}
		});
		copyright.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.copyright, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, copyright.getText()));
				}
			}
		});
		EditingUtils.setID(copyright, UmaViewsRepository.Practice.Properties.copyright);
		EditingUtils.setEEFtype(copyright, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Practice.Properties.copyright, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createAuthorMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		author = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData authorData = new GridData(GridData.FILL_HORIZONTAL);
		authorData.horizontalSpan = 2;
		author.setLayoutData(authorData);
		EditingUtils.setID(author, UmaViewsRepository.Practice.Properties.author);
		EditingUtils.setEEFtype(author, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editAuthor = widgetFactory.createButton(parent, UmaMessages.PracticePropertiesEditionPart_AuthorLabel, SWT.NONE);
		GridData editAuthorData = new GridData();
		editAuthor.setLayoutData(editAuthorData);
		editAuthor.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						author.getShell(), "Practice", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						authorList, SpemPackage.eINSTANCE.getDescribableElement_Author().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					authorList = dialog.getResult();
					if (authorList == null) {
						authorList = new BasicEList();
					}
					author.setText(authorList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.author, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(authorList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editAuthor, UmaViewsRepository.Practice.Properties.author);
		EditingUtils.setEEFtype(editAuthor, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createChangeDateText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.PracticePropertiesEditionPart_ChangeDateLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Practice.Properties.changeDate, UmaViewsRepository.FORM_KIND));
		changeDate = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		changeDate.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData changeDateData = new GridData(GridData.FILL_HORIZONTAL);
		changeDate.setLayoutData(changeDateData);
		changeDate.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.changeDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDate.getText()));
			}
		});
		changeDate.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.changeDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDate.getText()));
				}
			}
		});
		EditingUtils.setID(changeDate, UmaViewsRepository.Practice.Properties.changeDate);
		EditingUtils.setEEFtype(changeDate, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Practice.Properties.changeDate, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createChangeDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.PracticePropertiesEditionPart_ChangeDescriptionLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Practice.Properties.changeDescription, UmaViewsRepository.FORM_KIND));
		changeDescription = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		changeDescription.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData changeDescriptionData = new GridData(GridData.FILL_HORIZONTAL);
		changeDescription.setLayoutData(changeDescriptionData);
		changeDescription.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.changeDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDescription.getText()));
			}
		});
		changeDescription.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.changeDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDescription.getText()));
				}
			}
		});
		EditingUtils.setID(changeDescription, UmaViewsRepository.Practice.Properties.changeDescription);
		EditingUtils.setEEFtype(changeDescription, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Practice.Properties.changeDescription, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createVersionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.PracticePropertiesEditionPart_VersionLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Practice.Properties.version, UmaViewsRepository.FORM_KIND));
		version = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		version.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData versionData = new GridData(GridData.FILL_HORIZONTAL);
		version.setLayoutData(versionData);
		version.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
			}
		});
		version.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
				}
			}
		});
		EditingUtils.setID(version, UmaViewsRepository.Practice.Properties.version);
		EditingUtils.setEEFtype(version, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Practice.Properties.version, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.PracticePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Practice.Properties.name, UmaViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, UmaViewsRepository.Practice.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Practice.Properties.name, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createVariabilityTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.PracticePropertiesEditionPart_VariabilityTypeLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Practice.Properties.variabilityType, UmaViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.variabilityType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVariabilityType()));
			}

		});
		variabilityType.setID(UmaViewsRepository.Practice.Properties.variabilityType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Practice.Properties.variabilityType, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createVariabilityBasedOnElementFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.PracticePropertiesEditionPart_VariabilityBasedOnElementLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Practice.Properties.variabilityBasedOnElement, UmaViewsRepository.FORM_KIND));
		variabilityBasedOnElement = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmaViewsRepository.Practice.Properties.variabilityBasedOnElement, UmaViewsRepository.FORM_KIND));
		widgetFactory.adapt(variabilityBasedOnElement);
		variabilityBasedOnElement.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData variabilityBasedOnElementData = new GridData(GridData.FILL_HORIZONTAL);
		variabilityBasedOnElement.setLayoutData(variabilityBasedOnElementData);
		variabilityBasedOnElement.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.variabilityBasedOnElement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVariabilityBasedOnElement()));
			}

		});
		variabilityBasedOnElement.setID(UmaViewsRepository.Practice.Properties.variabilityBasedOnElement);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Practice.Properties.variabilityBasedOnElement, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createMethodContentKindFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.PracticePropertiesEditionPart_MethodContentKindLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Practice.Properties.methodContentKind, UmaViewsRepository.FORM_KIND));
		methodContentKind = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmaViewsRepository.Practice.Properties.methodContentKind, UmaViewsRepository.FORM_KIND));
		widgetFactory.adapt(methodContentKind);
		methodContentKind.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData methodContentKindData = new GridData(GridData.FILL_HORIZONTAL);
		methodContentKind.setLayoutData(methodContentKindData);
		methodContentKind.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.methodContentKind, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getMethodContentKind()));
			}

		});
		methodContentKind.setID(UmaViewsRepository.Practice.Properties.methodContentKind);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Practice.Properties.methodContentKind, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createReferencedActivityReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.referencedActivity = new ReferencesTable(UmaMessages.PracticePropertiesEditionPart_ReferencedActivityLabel, new ReferencesTableListener	() {
			public void handleAdd() { addReferencedActivity(); }
			public void handleEdit(EObject element) { editReferencedActivity(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveReferencedActivity(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromReferencedActivity(element); }
			public void navigateTo(EObject element) { }
		});
		this.referencedActivity.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.Practice.Properties.referencedActivity, UmaViewsRepository.FORM_KIND));
		this.referencedActivity.createControls(parent, widgetFactory);
		this.referencedActivity.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.referencedActivity, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData referencedActivityData = new GridData(GridData.FILL_HORIZONTAL);
		referencedActivityData.horizontalSpan = 3;
		this.referencedActivity.setLayoutData(referencedActivityData);
		this.referencedActivity.disableMove();
		referencedActivity.setID(UmaViewsRepository.Practice.Properties.referencedActivity);
		referencedActivity.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addReferencedActivity() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(referencedActivity.getInput(), referencedActivityFilters, referencedActivityBusinessFilters,
		"referencedActivity", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.referencedActivity,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				referencedActivity.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveReferencedActivity(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.referencedActivity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		referencedActivity.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromReferencedActivity(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.referencedActivity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		referencedActivity.refresh();
	}

	/**
	 * 
	 */
	protected void editReferencedActivity(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				referencedActivity.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createContentReferenceReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.contentReference = new ReferencesTable(UmaMessages.PracticePropertiesEditionPart_ContentReferenceLabel, new ReferencesTableListener	() {
			public void handleAdd() { addContentReference(); }
			public void handleEdit(EObject element) { editContentReference(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveContentReference(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromContentReference(element); }
			public void navigateTo(EObject element) { }
		});
		this.contentReference.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.Practice.Properties.contentReference, UmaViewsRepository.FORM_KIND));
		this.contentReference.createControls(parent, widgetFactory);
		this.contentReference.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.contentReference, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData contentReferenceData = new GridData(GridData.FILL_HORIZONTAL);
		contentReferenceData.horizontalSpan = 3;
		this.contentReference.setLayoutData(contentReferenceData);
		this.contentReference.disableMove();
		contentReference.setID(UmaViewsRepository.Practice.Properties.contentReference);
		contentReference.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addContentReference() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(contentReference.getInput(), contentReferenceFilters, contentReferenceBusinessFilters,
		"contentReference", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.contentReference,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				contentReference.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveContentReference(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.contentReference, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		contentReference.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromContentReference(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.contentReference, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		contentReference.refresh();
	}

	/**
	 * 
	 */
	protected void editContentReference(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				contentReference.refresh();
			}
		}
	}

	
	protected Composite createAdditionalInfoText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.PracticePropertiesEditionPart_AdditionalInfoLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Practice.Properties.additionalInfo, UmaViewsRepository.FORM_KIND));
		additionalInfo = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		additionalInfo.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData additionalInfoData = new GridData(GridData.FILL_HORIZONTAL);
		additionalInfo.setLayoutData(additionalInfoData);
		additionalInfo.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.additionalInfo, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, additionalInfo.getText()));
			}
		});
		additionalInfo.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.additionalInfo, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, additionalInfo.getText()));
				}
			}
		});
		EditingUtils.setID(additionalInfo, UmaViewsRepository.Practice.Properties.additionalInfo);
		EditingUtils.setEEFtype(additionalInfo, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Practice.Properties.additionalInfo, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createApplicationText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.PracticePropertiesEditionPart_ApplicationLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Practice.Properties.application, UmaViewsRepository.FORM_KIND));
		application = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		application.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData applicationData = new GridData(GridData.FILL_HORIZONTAL);
		application.setLayoutData(applicationData);
		application.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.application, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, application.getText()));
			}
		});
		application.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.application, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, application.getText()));
				}
			}
		});
		EditingUtils.setID(application, UmaViewsRepository.Practice.Properties.application);
		EditingUtils.setEEFtype(application, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Practice.Properties.application, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBackgroundText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.PracticePropertiesEditionPart_BackgroundLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Practice.Properties.background, UmaViewsRepository.FORM_KIND));
		background = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		background.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData backgroundData = new GridData(GridData.FILL_HORIZONTAL);
		background.setLayoutData(backgroundData);
		background.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.background, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, background.getText()));
			}
		});
		background.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.background, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, background.getText()));
				}
			}
		});
		EditingUtils.setID(background, UmaViewsRepository.Practice.Properties.background);
		EditingUtils.setEEFtype(background, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Practice.Properties.background, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createGoalMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		goal = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData goalData = new GridData(GridData.FILL_HORIZONTAL);
		goalData.horizontalSpan = 2;
		goal.setLayoutData(goalData);
		EditingUtils.setID(goal, UmaViewsRepository.Practice.Properties.goal);
		EditingUtils.setEEFtype(goal, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editGoal = widgetFactory.createButton(parent, UmaMessages.PracticePropertiesEditionPart_GoalLabel, SWT.NONE);
		GridData editGoalData = new GridData();
		editGoal.setLayoutData(editGoalData);
		editGoal.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						goal.getShell(), "Practice", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						goalList, UmaPackage.eINSTANCE.getPractice_Goal().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					goalList = dialog.getResult();
					if (goalList == null) {
						goalList = new BasicEList();
					}
					goal.setText(goalList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.goal, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(goalList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editGoal, UmaViewsRepository.Practice.Properties.goal);
		EditingUtils.setEEFtype(editGoal, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createLevelOfAdoptionMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		levelOfAdoption = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData levelOfAdoptionData = new GridData(GridData.FILL_HORIZONTAL);
		levelOfAdoptionData.horizontalSpan = 2;
		levelOfAdoption.setLayoutData(levelOfAdoptionData);
		EditingUtils.setID(levelOfAdoption, UmaViewsRepository.Practice.Properties.levelOfAdoption);
		EditingUtils.setEEFtype(levelOfAdoption, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editLevelOfAdoption = widgetFactory.createButton(parent, UmaMessages.PracticePropertiesEditionPart_LevelOfAdoptionLabel, SWT.NONE);
		GridData editLevelOfAdoptionData = new GridData();
		editLevelOfAdoption.setLayoutData(editLevelOfAdoptionData);
		editLevelOfAdoption.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						levelOfAdoption.getShell(), "Practice", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						levelOfAdoptionList, UmaPackage.eINSTANCE.getPractice_LevelOfAdoption().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					levelOfAdoptionList = dialog.getResult();
					if (levelOfAdoptionList == null) {
						levelOfAdoptionList = new BasicEList();
					}
					levelOfAdoption.setText(levelOfAdoptionList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.levelOfAdoption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(levelOfAdoptionList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editLevelOfAdoption, UmaViewsRepository.Practice.Properties.levelOfAdoption);
		EditingUtils.setEEFtype(editLevelOfAdoption, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createProblemText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.PracticePropertiesEditionPart_ProblemLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Practice.Properties.problem, UmaViewsRepository.FORM_KIND));
		problem = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		problem.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData problemData = new GridData(GridData.FILL_HORIZONTAL);
		problem.setLayoutData(problemData);
		problem.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.problem, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, problem.getText()));
			}
		});
		problem.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PracticePropertiesEditionPartForm.this, UmaViewsRepository.Practice.Properties.problem, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, problem.getText()));
				}
			}
		});
		EditingUtils.setID(problem, UmaViewsRepository.Practice.Properties.problem);
		EditingUtils.setEEFtype(problem, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Practice.Properties.problem, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#getKind()
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#initKind(EObjectFlatComboSettings)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#setKind(EObject newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#setKindButtonMode(ButtonsModeEnum newValue)
	 */
	public void setKindButtonMode(ButtonsModeEnum newValue) {
		kind.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#addFilterKind(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKind(ViewerFilter filter) {
		kind.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#addBusinessFilterKind(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKind(ViewerFilter filter) {
		kind.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#getPresentationName()
	 * 
	 */
	public String getPresentationName() {
		return presentationName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#setPresentationName(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#getBriefDescription()
	 * 
	 */
	public String getBriefDescription() {
		return briefDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#setBriefDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#getMainDescription()
	 * 
	 */
	public String getMainDescription() {
		return mainDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#setMainDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#getPurpose()
	 * 
	 */
	public String getPurpose() {
		return purpose.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#setPurpose(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#initGuidance(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#updateGuidance()
	 * 
	 */
	public void updateGuidance() {
	guidance.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#addFilterGuidance(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGuidance(ViewerFilter filter) {
		guidanceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#addBusinessFilterGuidance(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGuidance(ViewerFilter filter) {
		guidanceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#isContainedInGuidanceTable(EObject element)
	 * 
	 */
	public boolean isContainedInGuidanceTable(EObject element) {
		return ((ReferencesTableSettings)guidance.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#initMetric(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#updateMetric()
	 * 
	 */
	public void updateMetric() {
	metric.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#addFilterMetric(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMetric(ViewerFilter filter) {
		metricFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#addBusinessFilterMetric(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMetric(ViewerFilter filter) {
		metricBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#isContainedInMetricTable(EObject element)
	 * 
	 */
	public boolean isContainedInMetricTable(EObject element) {
		return ((ReferencesTableSettings)metric.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#initCategory(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#updateCategory()
	 * 
	 */
	public void updateCategory() {
	category.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#addFilterCategory(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCategory(ViewerFilter filter) {
		categoryFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#addBusinessFilterCategory(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCategory(ViewerFilter filter) {
		categoryBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#isContainedInCategoryTable(EObject element)
	 * 
	 */
	public boolean isContainedInCategoryTable(EObject element) {
		return ((ReferencesTableSettings)category.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#getCopyright()
	 * 
	 */
	public String getCopyright() {
		return copyright.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#setCopyright(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#getAuthor()
	 * 
	 */
	public EList getAuthor() {
		return authorList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#setAuthor(EList newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#getChangeDate()
	 * 
	 */
	public String getChangeDate() {
		return changeDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#setChangeDate(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#getChangeDescription()
	 * 
	 */
	public String getChangeDescription() {
		return changeDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#setChangeDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#getVersion()
	 * 
	 */
	public String getVersion() {
		return version.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#setVersion(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#getVariabilityType()
	 * 
	 */
	public Enumerator getVariabilityType() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) variabilityType.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#initVariabilityType(EEnum eenum, Enumerator current)
	 */
	public void initVariabilityType(EEnum eenum, Enumerator current) {
		variabilityType.setInput(eenum.getELiterals());
		variabilityType.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#setVariabilityType(Enumerator newValue)
	 * 
	 */
	public void setVariabilityType(Enumerator newValue) {
		variabilityType.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#getVariabilityBasedOnElement()
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#initVariabilityBasedOnElement(EObjectFlatComboSettings)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#setVariabilityBasedOnElement(EObject newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#setVariabilityBasedOnElementButtonMode(ButtonsModeEnum newValue)
	 */
	public void setVariabilityBasedOnElementButtonMode(ButtonsModeEnum newValue) {
		variabilityBasedOnElement.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#addFilterVariabilityBasedOnElement(ViewerFilter filter)
	 * 
	 */
	public void addFilterToVariabilityBasedOnElement(ViewerFilter filter) {
		variabilityBasedOnElement.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#addBusinessFilterVariabilityBasedOnElement(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToVariabilityBasedOnElement(ViewerFilter filter) {
		variabilityBasedOnElement.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#getMethodContentKind()
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#initMethodContentKind(EObjectFlatComboSettings)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#setMethodContentKind(EObject newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#setMethodContentKindButtonMode(ButtonsModeEnum newValue)
	 */
	public void setMethodContentKindButtonMode(ButtonsModeEnum newValue) {
		methodContentKind.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#addFilterMethodContentKind(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMethodContentKind(ViewerFilter filter) {
		methodContentKind.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#addBusinessFilterMethodContentKind(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMethodContentKind(ViewerFilter filter) {
		methodContentKind.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#initReferencedActivity(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initReferencedActivity(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		referencedActivity.setContentProvider(contentProvider);
		referencedActivity.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#updateReferencedActivity()
	 * 
	 */
	public void updateReferencedActivity() {
	referencedActivity.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#addFilterReferencedActivity(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReferencedActivity(ViewerFilter filter) {
		referencedActivityFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#addBusinessFilterReferencedActivity(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReferencedActivity(ViewerFilter filter) {
		referencedActivityBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#isContainedInReferencedActivityTable(EObject element)
	 * 
	 */
	public boolean isContainedInReferencedActivityTable(EObject element) {
		return ((ReferencesTableSettings)referencedActivity.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#initContentReference(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initContentReference(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		contentReference.setContentProvider(contentProvider);
		contentReference.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#updateContentReference()
	 * 
	 */
	public void updateContentReference() {
	contentReference.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#addFilterContentReference(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContentReference(ViewerFilter filter) {
		contentReferenceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#addBusinessFilterContentReference(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContentReference(ViewerFilter filter) {
		contentReferenceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#isContainedInContentReferenceTable(EObject element)
	 * 
	 */
	public boolean isContainedInContentReferenceTable(EObject element) {
		return ((ReferencesTableSettings)contentReference.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#getAdditionalInfo()
	 * 
	 */
	public String getAdditionalInfo() {
		return additionalInfo.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#setAdditionalInfo(String newValue)
	 * 
	 */
	public void setAdditionalInfo(String newValue) {
		if (newValue != null) {
			additionalInfo.setText(newValue);
		} else {
			additionalInfo.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#getApplication()
	 * 
	 */
	public String getApplication() {
		return application.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#setApplication(String newValue)
	 * 
	 */
	public void setApplication(String newValue) {
		if (newValue != null) {
			application.setText(newValue);
		} else {
			application.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#getBackground()
	 * 
	 */
	public String getBackground() {
		return background.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#setBackground(String newValue)
	 * 
	 */
	public void setBackground(String newValue) {
		if (newValue != null) {
			background.setText(newValue);
		} else {
			background.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#getGoal()
	 * 
	 */
	public EList getGoal() {
		return goalList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#setGoal(EList newValue)
	 * 
	 */
	public void setGoal(EList newValue) {
		goalList = newValue;
		if (newValue != null) {
			goal.setText(goalList.toString());
		} else {
			goal.setText(""); //$NON-NLS-1$
		}
	}

	public void addToGoal(Object newValue) {
		goalList.add(newValue);
		if (newValue != null) {
			goal.setText(goalList.toString());
		} else {
			goal.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToGoal(Object newValue) {
		goalList.remove(newValue);
		if (newValue != null) {
			goal.setText(goalList.toString());
		} else {
			goal.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#getLevelOfAdoption()
	 * 
	 */
	public EList getLevelOfAdoption() {
		return levelOfAdoptionList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#setLevelOfAdoption(EList newValue)
	 * 
	 */
	public void setLevelOfAdoption(EList newValue) {
		levelOfAdoptionList = newValue;
		if (newValue != null) {
			levelOfAdoption.setText(levelOfAdoptionList.toString());
		} else {
			levelOfAdoption.setText(""); //$NON-NLS-1$
		}
	}

	public void addToLevelOfAdoption(Object newValue) {
		levelOfAdoptionList.add(newValue);
		if (newValue != null) {
			levelOfAdoption.setText(levelOfAdoptionList.toString());
		} else {
			levelOfAdoption.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToLevelOfAdoption(Object newValue) {
		levelOfAdoptionList.remove(newValue);
		if (newValue != null) {
			levelOfAdoption.setText(levelOfAdoptionList.toString());
		} else {
			levelOfAdoption.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#getProblem()
	 * 
	 */
	public String getProblem() {
		return problem.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.PracticePropertiesEditionPart#setProblem(String newValue)
	 * 
	 */
	public void setProblem(String newValue) {
		if (newValue != null) {
			problem.setText(newValue);
		} else {
			problem.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return UmaMessages.Practice_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
