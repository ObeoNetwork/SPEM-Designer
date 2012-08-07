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
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
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
import org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart;
import org.obeonetwork.dsl.spem.uma.parts.UmaViewsRepository;
import org.obeonetwork.dsl.spem.uma.providers.UmaMessages;


// End of user code

/**
 * 
 * 
 */
public class ArtifactPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ArtifactPropertiesEditionPart {

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
	protected Button isSynchronizedWithSource;
	protected EObjectFlatComboViewer workProduct;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ArtifactPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence artifactStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = artifactStep.addStep(UmaViewsRepository.Artifact.Properties.class);
		propertiesStep.addStep(UmaViewsRepository.Artifact.Properties.kind);
		propertiesStep.addStep(UmaViewsRepository.Artifact.Properties.presentationName);
		propertiesStep.addStep(UmaViewsRepository.Artifact.Properties.briefDescription);
		propertiesStep.addStep(UmaViewsRepository.Artifact.Properties.mainDescription);
		propertiesStep.addStep(UmaViewsRepository.Artifact.Properties.purpose);
		propertiesStep.addStep(UmaViewsRepository.Artifact.Properties.guidance);
		propertiesStep.addStep(UmaViewsRepository.Artifact.Properties.metric);
		propertiesStep.addStep(UmaViewsRepository.Artifact.Properties.category);
		propertiesStep.addStep(UmaViewsRepository.Artifact.Properties.copyright);
		propertiesStep.addStep(UmaViewsRepository.Artifact.Properties.author);
		propertiesStep.addStep(UmaViewsRepository.Artifact.Properties.changeDate);
		propertiesStep.addStep(UmaViewsRepository.Artifact.Properties.changeDescription);
		propertiesStep.addStep(UmaViewsRepository.Artifact.Properties.version);
		propertiesStep.addStep(UmaViewsRepository.Artifact.Properties.name);
		propertiesStep.addStep(UmaViewsRepository.Artifact.Properties.hasMultipleOccurrences);
		propertiesStep.addStep(UmaViewsRepository.Artifact.Properties.isOptional);
		propertiesStep.addStep(UmaViewsRepository.Artifact.Properties.isPlanned);
		propertiesStep.addStep(UmaViewsRepository.Artifact.Properties.isSynchronizedWithSource);
		propertiesStep.addStep(UmaViewsRepository.Artifact.Properties.workProduct);
		
		
		composer = new PartComposer(artifactStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == UmaViewsRepository.Artifact.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Artifact.Properties.kind) {
					return createKindFlatComboViewer(parent, widgetFactory);
				}
				if (key == UmaViewsRepository.Artifact.Properties.presentationName) {
					return 		createPresentationNameText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Artifact.Properties.briefDescription) {
					return 		createBriefDescriptionText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Artifact.Properties.mainDescription) {
					return 		createMainDescriptionText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Artifact.Properties.purpose) {
					return 		createPurposeText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Artifact.Properties.guidance) {
					return createGuidanceReferencesTable(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Artifact.Properties.metric) {
					return createMetricReferencesTable(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Artifact.Properties.category) {
					return createCategoryReferencesTable(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Artifact.Properties.copyright) {
					return 		createCopyrightText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Artifact.Properties.author) {
					return createAuthorMultiValuedEditor(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Artifact.Properties.changeDate) {
					return 		createChangeDateText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Artifact.Properties.changeDescription) {
					return 		createChangeDescriptionText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Artifact.Properties.version) {
					return 		createVersionText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Artifact.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Artifact.Properties.hasMultipleOccurrences) {
					return createHasMultipleOccurrencesCheckbox(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Artifact.Properties.isOptional) {
					return createIsOptionalCheckbox(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Artifact.Properties.isPlanned) {
					return createIsPlannedCheckbox(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Artifact.Properties.isSynchronizedWithSource) {
					return createIsSynchronizedWithSourceCheckbox(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.Artifact.Properties.workProduct) {
					return createWorkProductFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(UmaMessages.ArtifactPropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.ArtifactPropertiesEditionPart_KindLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Artifact.Properties.kind, UmaViewsRepository.FORM_KIND));
		kind = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmaViewsRepository.Artifact.Properties.kind, UmaViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.kind, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getKind()));
			}

		});
		kind.setID(UmaViewsRepository.Artifact.Properties.kind);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Artifact.Properties.kind, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPresentationNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.ArtifactPropertiesEditionPart_PresentationNameLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Artifact.Properties.presentationName, UmaViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.presentationName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, presentationName.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.presentationName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, presentationName.getText()));
				}
			}
		});
		EditingUtils.setID(presentationName, UmaViewsRepository.Artifact.Properties.presentationName);
		EditingUtils.setEEFtype(presentationName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Artifact.Properties.presentationName, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBriefDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.ArtifactPropertiesEditionPart_BriefDescriptionLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Artifact.Properties.briefDescription, UmaViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.briefDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, briefDescription.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.briefDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, briefDescription.getText()));
				}
			}
		});
		EditingUtils.setID(briefDescription, UmaViewsRepository.Artifact.Properties.briefDescription);
		EditingUtils.setEEFtype(briefDescription, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Artifact.Properties.briefDescription, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createMainDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.ArtifactPropertiesEditionPart_MainDescriptionLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Artifact.Properties.mainDescription, UmaViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.mainDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mainDescription.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.mainDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mainDescription.getText()));
				}
			}
		});
		EditingUtils.setID(mainDescription, UmaViewsRepository.Artifact.Properties.mainDescription);
		EditingUtils.setEEFtype(mainDescription, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Artifact.Properties.mainDescription, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPurposeText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.ArtifactPropertiesEditionPart_PurposeLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Artifact.Properties.purpose, UmaViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.purpose, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, purpose.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.purpose, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, purpose.getText()));
				}
			}
		});
		EditingUtils.setID(purpose, UmaViewsRepository.Artifact.Properties.purpose);
		EditingUtils.setEEFtype(purpose, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Artifact.Properties.purpose, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createGuidanceReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.guidance = new ReferencesTable(UmaMessages.ArtifactPropertiesEditionPart_GuidanceLabel, new ReferencesTableListener	() {
			public void handleAdd() { addGuidance(); }
			public void handleEdit(EObject element) { editGuidance(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveGuidance(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromGuidance(element); }
			public void navigateTo(EObject element) { }
		});
		this.guidance.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.Artifact.Properties.guidance, UmaViewsRepository.FORM_KIND));
		this.guidance.createControls(parent, widgetFactory);
		this.guidance.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.guidance, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData guidanceData = new GridData(GridData.FILL_HORIZONTAL);
		guidanceData.horizontalSpan = 3;
		this.guidance.setLayoutData(guidanceData);
		this.guidance.disableMove();
		guidance.setID(UmaViewsRepository.Artifact.Properties.guidance);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.guidance,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.guidance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		guidance.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromGuidance(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.guidance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.metric = new ReferencesTable(UmaMessages.ArtifactPropertiesEditionPart_MetricLabel, new ReferencesTableListener	() {
			public void handleAdd() { addMetric(); }
			public void handleEdit(EObject element) { editMetric(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveMetric(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromMetric(element); }
			public void navigateTo(EObject element) { }
		});
		this.metric.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.Artifact.Properties.metric, UmaViewsRepository.FORM_KIND));
		this.metric.createControls(parent, widgetFactory);
		this.metric.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.metric, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData metricData = new GridData(GridData.FILL_HORIZONTAL);
		metricData.horizontalSpan = 3;
		this.metric.setLayoutData(metricData);
		this.metric.disableMove();
		metric.setID(UmaViewsRepository.Artifact.Properties.metric);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.metric,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.metric, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		metric.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMetric(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.metric, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.category = new ReferencesTable(UmaMessages.ArtifactPropertiesEditionPart_CategoryLabel, new ReferencesTableListener	() {
			public void handleAdd() { addCategory(); }
			public void handleEdit(EObject element) { editCategory(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCategory(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCategory(element); }
			public void navigateTo(EObject element) { }
		});
		this.category.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.Artifact.Properties.category, UmaViewsRepository.FORM_KIND));
		this.category.createControls(parent, widgetFactory);
		this.category.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.category, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData categoryData = new GridData(GridData.FILL_HORIZONTAL);
		categoryData.horizontalSpan = 3;
		this.category.setLayoutData(categoryData);
		this.category.disableMove();
		category.setID(UmaViewsRepository.Artifact.Properties.category);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.category,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		category.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCategory(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.ArtifactPropertiesEditionPart_CopyrightLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Artifact.Properties.copyright, UmaViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.copyright, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, copyright.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.copyright, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, copyright.getText()));
				}
			}
		});
		EditingUtils.setID(copyright, UmaViewsRepository.Artifact.Properties.copyright);
		EditingUtils.setEEFtype(copyright, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Artifact.Properties.copyright, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
		EditingUtils.setID(author, UmaViewsRepository.Artifact.Properties.author);
		EditingUtils.setEEFtype(author, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editAuthor = widgetFactory.createButton(parent, UmaMessages.ArtifactPropertiesEditionPart_AuthorLabel, SWT.NONE);
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
						author.getShell(), "Artifact", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						authorList, SpemPackage.eINSTANCE.getDescribableElement_Author().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					authorList = dialog.getResult();
					if (authorList == null) {
						authorList = new BasicEList();
					}
					author.setText(authorList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.author, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(authorList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editAuthor, UmaViewsRepository.Artifact.Properties.author);
		EditingUtils.setEEFtype(editAuthor, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createChangeDateText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.ArtifactPropertiesEditionPart_ChangeDateLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Artifact.Properties.changeDate, UmaViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.changeDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.changeDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDate.getText()));
				}
			}
		});
		EditingUtils.setID(changeDate, UmaViewsRepository.Artifact.Properties.changeDate);
		EditingUtils.setEEFtype(changeDate, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Artifact.Properties.changeDate, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createChangeDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.ArtifactPropertiesEditionPart_ChangeDescriptionLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Artifact.Properties.changeDescription, UmaViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.changeDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDescription.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.changeDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDescription.getText()));
				}
			}
		});
		EditingUtils.setID(changeDescription, UmaViewsRepository.Artifact.Properties.changeDescription);
		EditingUtils.setEEFtype(changeDescription, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Artifact.Properties.changeDescription, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createVersionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.ArtifactPropertiesEditionPart_VersionLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Artifact.Properties.version, UmaViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
				}
			}
		});
		EditingUtils.setID(version, UmaViewsRepository.Artifact.Properties.version);
		EditingUtils.setEEFtype(version, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Artifact.Properties.version, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.ArtifactPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Artifact.Properties.name, UmaViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, UmaViewsRepository.Artifact.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Artifact.Properties.name, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createHasMultipleOccurrencesCheckbox(FormToolkit widgetFactory, Composite parent) {
		hasMultipleOccurrences = widgetFactory.createButton(parent, UmaMessages.ArtifactPropertiesEditionPart_HasMultipleOccurrencesLabel, SWT.CHECK);
		hasMultipleOccurrences.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.hasMultipleOccurrences, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(hasMultipleOccurrences.getSelection())));
			}

		});
		GridData hasMultipleOccurrencesData = new GridData(GridData.FILL_HORIZONTAL);
		hasMultipleOccurrencesData.horizontalSpan = 2;
		hasMultipleOccurrences.setLayoutData(hasMultipleOccurrencesData);
		EditingUtils.setID(hasMultipleOccurrences, UmaViewsRepository.Artifact.Properties.hasMultipleOccurrences);
		EditingUtils.setEEFtype(hasMultipleOccurrences, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Artifact.Properties.hasMultipleOccurrences, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsOptionalCheckbox(FormToolkit widgetFactory, Composite parent) {
		isOptional = widgetFactory.createButton(parent, UmaMessages.ArtifactPropertiesEditionPart_IsOptionalLabel, SWT.CHECK);
		isOptional.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.isOptional, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isOptional.getSelection())));
			}

		});
		GridData isOptionalData = new GridData(GridData.FILL_HORIZONTAL);
		isOptionalData.horizontalSpan = 2;
		isOptional.setLayoutData(isOptionalData);
		EditingUtils.setID(isOptional, UmaViewsRepository.Artifact.Properties.isOptional);
		EditingUtils.setEEFtype(isOptional, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Artifact.Properties.isOptional, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsPlannedCheckbox(FormToolkit widgetFactory, Composite parent) {
		isPlanned = widgetFactory.createButton(parent, UmaMessages.ArtifactPropertiesEditionPart_IsPlannedLabel, SWT.CHECK);
		isPlanned.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.isPlanned, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isPlanned.getSelection())));
			}

		});
		GridData isPlannedData = new GridData(GridData.FILL_HORIZONTAL);
		isPlannedData.horizontalSpan = 2;
		isPlanned.setLayoutData(isPlannedData);
		EditingUtils.setID(isPlanned, UmaViewsRepository.Artifact.Properties.isPlanned);
		EditingUtils.setEEFtype(isPlanned, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Artifact.Properties.isPlanned, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsSynchronizedWithSourceCheckbox(FormToolkit widgetFactory, Composite parent) {
		isSynchronizedWithSource = widgetFactory.createButton(parent, UmaMessages.ArtifactPropertiesEditionPart_IsSynchronizedWithSourceLabel, SWT.CHECK);
		isSynchronizedWithSource.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.isSynchronizedWithSource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isSynchronizedWithSource.getSelection())));
			}

		});
		GridData isSynchronizedWithSourceData = new GridData(GridData.FILL_HORIZONTAL);
		isSynchronizedWithSourceData.horizontalSpan = 2;
		isSynchronizedWithSource.setLayoutData(isSynchronizedWithSourceData);
		EditingUtils.setID(isSynchronizedWithSource, UmaViewsRepository.Artifact.Properties.isSynchronizedWithSource);
		EditingUtils.setEEFtype(isSynchronizedWithSource, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Artifact.Properties.isSynchronizedWithSource, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createWorkProductFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, UmaMessages.ArtifactPropertiesEditionPart_WorkProductLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.Artifact.Properties.workProduct, UmaViewsRepository.FORM_KIND));
		workProduct = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmaViewsRepository.Artifact.Properties.workProduct, UmaViewsRepository.FORM_KIND));
		widgetFactory.adapt(workProduct);
		workProduct.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData workProductData = new GridData(GridData.FILL_HORIZONTAL);
		workProduct.setLayoutData(workProductData);
		workProduct.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactPropertiesEditionPartForm.this, UmaViewsRepository.Artifact.Properties.workProduct, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getWorkProduct()));
			}

		});
		workProduct.setID(UmaViewsRepository.Artifact.Properties.workProduct);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.Artifact.Properties.workProduct, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#getKind()
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#initKind(EObjectFlatComboSettings)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#setKind(EObject newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#setKindButtonMode(ButtonsModeEnum newValue)
	 */
	public void setKindButtonMode(ButtonsModeEnum newValue) {
		kind.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#addFilterKind(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKind(ViewerFilter filter) {
		kind.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#addBusinessFilterKind(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKind(ViewerFilter filter) {
		kind.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#getPresentationName()
	 * 
	 */
	public String getPresentationName() {
		return presentationName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#setPresentationName(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#getBriefDescription()
	 * 
	 */
	public String getBriefDescription() {
		return briefDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#setBriefDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#getMainDescription()
	 * 
	 */
	public String getMainDescription() {
		return mainDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#setMainDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#getPurpose()
	 * 
	 */
	public String getPurpose() {
		return purpose.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#setPurpose(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#initGuidance(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#updateGuidance()
	 * 
	 */
	public void updateGuidance() {
	guidance.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#addFilterGuidance(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGuidance(ViewerFilter filter) {
		guidanceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#addBusinessFilterGuidance(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGuidance(ViewerFilter filter) {
		guidanceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#isContainedInGuidanceTable(EObject element)
	 * 
	 */
	public boolean isContainedInGuidanceTable(EObject element) {
		return ((ReferencesTableSettings)guidance.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#initMetric(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#updateMetric()
	 * 
	 */
	public void updateMetric() {
	metric.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#addFilterMetric(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMetric(ViewerFilter filter) {
		metricFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#addBusinessFilterMetric(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMetric(ViewerFilter filter) {
		metricBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#isContainedInMetricTable(EObject element)
	 * 
	 */
	public boolean isContainedInMetricTable(EObject element) {
		return ((ReferencesTableSettings)metric.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#initCategory(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#updateCategory()
	 * 
	 */
	public void updateCategory() {
	category.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#addFilterCategory(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCategory(ViewerFilter filter) {
		categoryFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#addBusinessFilterCategory(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCategory(ViewerFilter filter) {
		categoryBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#isContainedInCategoryTable(EObject element)
	 * 
	 */
	public boolean isContainedInCategoryTable(EObject element) {
		return ((ReferencesTableSettings)category.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#getCopyright()
	 * 
	 */
	public String getCopyright() {
		return copyright.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#setCopyright(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#getAuthor()
	 * 
	 */
	public EList getAuthor() {
		return authorList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#setAuthor(EList newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#getChangeDate()
	 * 
	 */
	public String getChangeDate() {
		return changeDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#setChangeDate(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#getChangeDescription()
	 * 
	 */
	public String getChangeDescription() {
		return changeDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#setChangeDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#getVersion()
	 * 
	 */
	public String getVersion() {
		return version.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#setVersion(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#getHasMultipleOccurrences()
	 * 
	 */
	public Boolean getHasMultipleOccurrences() {
		return Boolean.valueOf(hasMultipleOccurrences.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#setHasMultipleOccurrences(Boolean newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#getIsOptional()
	 * 
	 */
	public Boolean getIsOptional() {
		return Boolean.valueOf(isOptional.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#setIsOptional(Boolean newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#getIsPlanned()
	 * 
	 */
	public Boolean getIsPlanned() {
		return Boolean.valueOf(isPlanned.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#setIsPlanned(Boolean newValue)
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
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#getIsSynchronizedWithSource()
	 * 
	 */
	public Boolean getIsSynchronizedWithSource() {
		return Boolean.valueOf(isSynchronizedWithSource.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#setIsSynchronizedWithSource(Boolean newValue)
	 * 
	 */
	public void setIsSynchronizedWithSource(Boolean newValue) {
		if (newValue != null) {
			isSynchronizedWithSource.setSelection(newValue.booleanValue());
		} else {
			isSynchronizedWithSource.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#getWorkProduct()
	 * 
	 */
	public EObject getWorkProduct() {
		if (workProduct.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) workProduct.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#initWorkProduct(EObjectFlatComboSettings)
	 */
	public void initWorkProduct(EObjectFlatComboSettings settings) {
		workProduct.setInput(settings);
		if (current != null) {
			workProduct.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#setWorkProduct(EObject newValue)
	 * 
	 */
	public void setWorkProduct(EObject newValue) {
		if (newValue != null) {
			workProduct.setSelection(new StructuredSelection(newValue));
		} else {
			workProduct.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#setWorkProductButtonMode(ButtonsModeEnum newValue)
	 */
	public void setWorkProductButtonMode(ButtonsModeEnum newValue) {
		workProduct.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#addFilterWorkProduct(ViewerFilter filter)
	 * 
	 */
	public void addFilterToWorkProduct(ViewerFilter filter) {
		workProduct.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ArtifactPropertiesEditionPart#addBusinessFilterWorkProduct(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToWorkProduct(ViewerFilter filter) {
		workProduct.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return UmaMessages.Artifact_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
