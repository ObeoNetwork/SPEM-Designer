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
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart;
import org.obeonetwork.dsl.spem.parts.SpemViewsRepository;
import org.obeonetwork.dsl.spem.providers.SpemMessages;


// End of user code

/**
 * 
 * 
 */
public class PlanningDataPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, PlanningDataPropertiesEditionPart {

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
	protected Text startDate;
	protected Text finishDate;
	protected Text rank;
	protected Text duration;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PlanningDataPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence planningDataStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = planningDataStep.addStep(SpemViewsRepository.PlanningData.Properties.class);
		propertiesStep.addStep(SpemViewsRepository.PlanningData.Properties.kind);
		propertiesStep.addStep(SpemViewsRepository.PlanningData.Properties.presentationName);
		propertiesStep.addStep(SpemViewsRepository.PlanningData.Properties.briefDescription);
		propertiesStep.addStep(SpemViewsRepository.PlanningData.Properties.mainDescription);
		propertiesStep.addStep(SpemViewsRepository.PlanningData.Properties.purpose);
		propertiesStep.addStep(SpemViewsRepository.PlanningData.Properties.guidance);
		propertiesStep.addStep(SpemViewsRepository.PlanningData.Properties.metric);
		propertiesStep.addStep(SpemViewsRepository.PlanningData.Properties.category);
		propertiesStep.addStep(SpemViewsRepository.PlanningData.Properties.copyright);
		propertiesStep.addStep(SpemViewsRepository.PlanningData.Properties.author);
		propertiesStep.addStep(SpemViewsRepository.PlanningData.Properties.changeDate);
		propertiesStep.addStep(SpemViewsRepository.PlanningData.Properties.changeDescription);
		propertiesStep.addStep(SpemViewsRepository.PlanningData.Properties.version);
		propertiesStep.addStep(SpemViewsRepository.PlanningData.Properties.name);
		propertiesStep.addStep(SpemViewsRepository.PlanningData.Properties.startDate);
		propertiesStep.addStep(SpemViewsRepository.PlanningData.Properties.finishDate);
		propertiesStep.addStep(SpemViewsRepository.PlanningData.Properties.rank);
		propertiesStep.addStep(SpemViewsRepository.PlanningData.Properties.duration);
		
		
		composer = new PartComposer(planningDataStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SpemViewsRepository.PlanningData.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == SpemViewsRepository.PlanningData.Properties.kind) {
					return createKindFlatComboViewer(parent);
				}
				if (key == SpemViewsRepository.PlanningData.Properties.presentationName) {
					return createPresentationNameText(parent);
				}
				if (key == SpemViewsRepository.PlanningData.Properties.briefDescription) {
					return createBriefDescriptionText(parent);
				}
				if (key == SpemViewsRepository.PlanningData.Properties.mainDescription) {
					return createMainDescriptionText(parent);
				}
				if (key == SpemViewsRepository.PlanningData.Properties.purpose) {
					return createPurposeText(parent);
				}
				if (key == SpemViewsRepository.PlanningData.Properties.guidance) {
					return createGuidanceAdvancedReferencesTable(parent);
				}
				if (key == SpemViewsRepository.PlanningData.Properties.metric) {
					return createMetricAdvancedReferencesTable(parent);
				}
				if (key == SpemViewsRepository.PlanningData.Properties.category) {
					return createCategoryAdvancedReferencesTable(parent);
				}
				if (key == SpemViewsRepository.PlanningData.Properties.copyright) {
					return createCopyrightText(parent);
				}
				if (key == SpemViewsRepository.PlanningData.Properties.author) {
					return createAuthorMultiValuedEditor(parent);
				}
				if (key == SpemViewsRepository.PlanningData.Properties.changeDate) {
					return createChangeDateText(parent);
				}
				if (key == SpemViewsRepository.PlanningData.Properties.changeDescription) {
					return createChangeDescriptionText(parent);
				}
				if (key == SpemViewsRepository.PlanningData.Properties.version) {
					return createVersionText(parent);
				}
				if (key == SpemViewsRepository.PlanningData.Properties.name) {
					return createNameText(parent);
				}
				if (key == SpemViewsRepository.PlanningData.Properties.startDate) {
					return createStartDateText(parent);
				}
				if (key == SpemViewsRepository.PlanningData.Properties.finishDate) {
					return createFinishDateText(parent);
				}
				if (key == SpemViewsRepository.PlanningData.Properties.rank) {
					return createRankText(parent);
				}
				if (key == SpemViewsRepository.PlanningData.Properties.duration) {
					return createDurationText(parent);
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
		propertiesGroup.setText(SpemMessages.PlanningDataPropertiesEditionPart_PropertiesGroupLabel);
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
		SWTUtils.createPartLabel(parent, SpemMessages.PlanningDataPropertiesEditionPart_KindLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.PlanningData.Properties.kind, SpemViewsRepository.SWT_KIND));
		kind = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SpemViewsRepository.PlanningData.Properties.kind, SpemViewsRepository.SWT_KIND));
		kind.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		kind.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.kind, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getKind()));
			}

		});
		GridData kindData = new GridData(GridData.FILL_HORIZONTAL);
		kind.setLayoutData(kindData);
		kind.setID(SpemViewsRepository.PlanningData.Properties.kind);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.PlanningData.Properties.kind, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPresentationNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.PlanningDataPropertiesEditionPart_PresentationNameLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.PlanningData.Properties.presentationName, SpemViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.presentationName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, presentationName.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.presentationName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, presentationName.getText()));
				}
			}

		});
		EditingUtils.setID(presentationName, SpemViewsRepository.PlanningData.Properties.presentationName);
		EditingUtils.setEEFtype(presentationName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.PlanningData.Properties.presentationName, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBriefDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.PlanningDataPropertiesEditionPart_BriefDescriptionLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.PlanningData.Properties.briefDescription, SpemViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.briefDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, briefDescription.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.briefDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, briefDescription.getText()));
				}
			}

		});
		EditingUtils.setID(briefDescription, SpemViewsRepository.PlanningData.Properties.briefDescription);
		EditingUtils.setEEFtype(briefDescription, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.PlanningData.Properties.briefDescription, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createMainDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.PlanningDataPropertiesEditionPart_MainDescriptionLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.PlanningData.Properties.mainDescription, SpemViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.mainDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mainDescription.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.mainDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mainDescription.getText()));
				}
			}

		});
		EditingUtils.setID(mainDescription, SpemViewsRepository.PlanningData.Properties.mainDescription);
		EditingUtils.setEEFtype(mainDescription, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.PlanningData.Properties.mainDescription, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPurposeText(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.PlanningDataPropertiesEditionPart_PurposeLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.PlanningData.Properties.purpose, SpemViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.purpose, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, purpose.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.purpose, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, purpose.getText()));
				}
			}

		});
		EditingUtils.setID(purpose, SpemViewsRepository.PlanningData.Properties.purpose);
		EditingUtils.setEEFtype(purpose, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.PlanningData.Properties.purpose, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createGuidanceAdvancedReferencesTable(Composite parent) {
		this.guidance = new ReferencesTable(SpemMessages.PlanningDataPropertiesEditionPart_GuidanceLabel, new ReferencesTableListener() {
			public void handleAdd() { addGuidance(); }
			public void handleEdit(EObject element) { editGuidance(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveGuidance(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromGuidance(element); }
			public void navigateTo(EObject element) { }
		});
		this.guidance.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.PlanningData.Properties.guidance, SpemViewsRepository.SWT_KIND));
		this.guidance.createControls(parent);
		this.guidance.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.guidance, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData guidanceData = new GridData(GridData.FILL_HORIZONTAL);
		guidanceData.horizontalSpan = 3;
		this.guidance.setLayoutData(guidanceData);
		this.guidance.disableMove();
		guidance.setID(SpemViewsRepository.PlanningData.Properties.guidance);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.guidance,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.guidance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		guidance.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromGuidance(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.guidance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.metric = new ReferencesTable(SpemMessages.PlanningDataPropertiesEditionPart_MetricLabel, new ReferencesTableListener() {
			public void handleAdd() { addMetric(); }
			public void handleEdit(EObject element) { editMetric(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveMetric(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromMetric(element); }
			public void navigateTo(EObject element) { }
		});
		this.metric.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.PlanningData.Properties.metric, SpemViewsRepository.SWT_KIND));
		this.metric.createControls(parent);
		this.metric.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.metric, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData metricData = new GridData(GridData.FILL_HORIZONTAL);
		metricData.horizontalSpan = 3;
		this.metric.setLayoutData(metricData);
		this.metric.disableMove();
		metric.setID(SpemViewsRepository.PlanningData.Properties.metric);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.metric,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.metric, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		metric.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMetric(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.metric, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.category = new ReferencesTable(SpemMessages.PlanningDataPropertiesEditionPart_CategoryLabel, new ReferencesTableListener() {
			public void handleAdd() { addCategory(); }
			public void handleEdit(EObject element) { editCategory(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCategory(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCategory(element); }
			public void navigateTo(EObject element) { }
		});
		this.category.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.PlanningData.Properties.category, SpemViewsRepository.SWT_KIND));
		this.category.createControls(parent);
		this.category.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.category, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData categoryData = new GridData(GridData.FILL_HORIZONTAL);
		categoryData.horizontalSpan = 3;
		this.category.setLayoutData(categoryData);
		this.category.disableMove();
		category.setID(SpemViewsRepository.PlanningData.Properties.category);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.category,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		category.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCategory(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		SWTUtils.createPartLabel(parent, SpemMessages.PlanningDataPropertiesEditionPart_CopyrightLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.PlanningData.Properties.copyright, SpemViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.copyright, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, copyright.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.copyright, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, copyright.getText()));
				}
			}

		});
		EditingUtils.setID(copyright, SpemViewsRepository.PlanningData.Properties.copyright);
		EditingUtils.setEEFtype(copyright, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.PlanningData.Properties.copyright, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createAuthorMultiValuedEditor(Composite parent) {
		author = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData authorData = new GridData(GridData.FILL_HORIZONTAL);
		authorData.horizontalSpan = 2;
		author.setLayoutData(authorData);
		EditingUtils.setID(author, SpemViewsRepository.PlanningData.Properties.author);
		EditingUtils.setEEFtype(author, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editAuthor = new Button(parent, SWT.NONE);
		editAuthor.setText(SpemMessages.PlanningDataPropertiesEditionPart_AuthorLabel);
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
						author.getShell(), "PlanningData", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						authorList, SpemPackage.eINSTANCE.getDescribableElement_Author().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					authorList = dialog.getResult();
					if (authorList == null) {
						authorList = new BasicEList();
					}
					author.setText(authorList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.author, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(authorList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editAuthor, SpemViewsRepository.PlanningData.Properties.author);
		EditingUtils.setEEFtype(editAuthor, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createChangeDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.PlanningDataPropertiesEditionPart_ChangeDateLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.PlanningData.Properties.changeDate, SpemViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.changeDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.changeDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDate.getText()));
				}
			}

		});
		EditingUtils.setID(changeDate, SpemViewsRepository.PlanningData.Properties.changeDate);
		EditingUtils.setEEFtype(changeDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.PlanningData.Properties.changeDate, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createChangeDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.PlanningDataPropertiesEditionPart_ChangeDescriptionLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.PlanningData.Properties.changeDescription, SpemViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.changeDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDescription.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.changeDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDescription.getText()));
				}
			}

		});
		EditingUtils.setID(changeDescription, SpemViewsRepository.PlanningData.Properties.changeDescription);
		EditingUtils.setEEFtype(changeDescription, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.PlanningData.Properties.changeDescription, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createVersionText(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.PlanningDataPropertiesEditionPart_VersionLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.PlanningData.Properties.version, SpemViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
				}
			}

		});
		EditingUtils.setID(version, SpemViewsRepository.PlanningData.Properties.version);
		EditingUtils.setEEFtype(version, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.PlanningData.Properties.version, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.PlanningDataPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.PlanningData.Properties.name, SpemViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, SpemViewsRepository.PlanningData.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.PlanningData.Properties.name, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createStartDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.PlanningDataPropertiesEditionPart_StartDateLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.PlanningData.Properties.startDate, SpemViewsRepository.SWT_KIND));
		startDate = new Text(parent, SWT.BORDER);
		GridData startDateData = new GridData(GridData.FILL_HORIZONTAL);
		startDate.setLayoutData(startDateData);
		startDate.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.startDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, startDate.getText()));
			}

		});
		startDate.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.startDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, startDate.getText()));
				}
			}

		});
		EditingUtils.setID(startDate, SpemViewsRepository.PlanningData.Properties.startDate);
		EditingUtils.setEEFtype(startDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.PlanningData.Properties.startDate, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createFinishDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.PlanningDataPropertiesEditionPart_FinishDateLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.PlanningData.Properties.finishDate, SpemViewsRepository.SWT_KIND));
		finishDate = new Text(parent, SWT.BORDER);
		GridData finishDateData = new GridData(GridData.FILL_HORIZONTAL);
		finishDate.setLayoutData(finishDateData);
		finishDate.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.finishDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, finishDate.getText()));
			}

		});
		finishDate.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.finishDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, finishDate.getText()));
				}
			}

		});
		EditingUtils.setID(finishDate, SpemViewsRepository.PlanningData.Properties.finishDate);
		EditingUtils.setEEFtype(finishDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.PlanningData.Properties.finishDate, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRankText(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.PlanningDataPropertiesEditionPart_RankLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.PlanningData.Properties.rank, SpemViewsRepository.SWT_KIND));
		rank = new Text(parent, SWT.BORDER);
		GridData rankData = new GridData(GridData.FILL_HORIZONTAL);
		rank.setLayoutData(rankData);
		rank.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.rank, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rank.getText()));
			}

		});
		rank.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.rank, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rank.getText()));
				}
			}

		});
		EditingUtils.setID(rank, SpemViewsRepository.PlanningData.Properties.rank);
		EditingUtils.setEEFtype(rank, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.PlanningData.Properties.rank, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDurationText(Composite parent) {
		SWTUtils.createPartLabel(parent, SpemMessages.PlanningDataPropertiesEditionPart_DurationLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.PlanningData.Properties.duration, SpemViewsRepository.SWT_KIND));
		duration = new Text(parent, SWT.BORDER);
		GridData durationData = new GridData(GridData.FILL_HORIZONTAL);
		duration.setLayoutData(durationData);
		duration.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.duration, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, duration.getText()));
			}

		});
		duration.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlanningDataPropertiesEditionPartImpl.this, SpemViewsRepository.PlanningData.Properties.duration, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, duration.getText()));
				}
			}

		});
		EditingUtils.setID(duration, SpemViewsRepository.PlanningData.Properties.duration);
		EditingUtils.setEEFtype(duration, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.PlanningData.Properties.duration, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#getKind()
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
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#initKind(EObjectFlatComboSettings)
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
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#setKind(EObject newValue)
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
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#setKindButtonMode(ButtonsModeEnum newValue)
	 */
	public void setKindButtonMode(ButtonsModeEnum newValue) {
		kind.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#addFilterKind(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKind(ViewerFilter filter) {
		kind.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#addBusinessFilterKind(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKind(ViewerFilter filter) {
		kind.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#getPresentationName()
	 * 
	 */
	public String getPresentationName() {
		return presentationName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#setPresentationName(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#getBriefDescription()
	 * 
	 */
	public String getBriefDescription() {
		return briefDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#setBriefDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#getMainDescription()
	 * 
	 */
	public String getMainDescription() {
		return mainDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#setMainDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#getPurpose()
	 * 
	 */
	public String getPurpose() {
		return purpose.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#setPurpose(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#initGuidance(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#updateGuidance()
	 * 
	 */
	public void updateGuidance() {
	guidance.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#addFilterGuidance(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGuidance(ViewerFilter filter) {
		guidanceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#addBusinessFilterGuidance(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGuidance(ViewerFilter filter) {
		guidanceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#isContainedInGuidanceTable(EObject element)
	 * 
	 */
	public boolean isContainedInGuidanceTable(EObject element) {
		return ((ReferencesTableSettings)guidance.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#initMetric(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#updateMetric()
	 * 
	 */
	public void updateMetric() {
	metric.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#addFilterMetric(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMetric(ViewerFilter filter) {
		metricFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#addBusinessFilterMetric(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMetric(ViewerFilter filter) {
		metricBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#isContainedInMetricTable(EObject element)
	 * 
	 */
	public boolean isContainedInMetricTable(EObject element) {
		return ((ReferencesTableSettings)metric.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#initCategory(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#updateCategory()
	 * 
	 */
	public void updateCategory() {
	category.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#addFilterCategory(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCategory(ViewerFilter filter) {
		categoryFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#addBusinessFilterCategory(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCategory(ViewerFilter filter) {
		categoryBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#isContainedInCategoryTable(EObject element)
	 * 
	 */
	public boolean isContainedInCategoryTable(EObject element) {
		return ((ReferencesTableSettings)category.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#getCopyright()
	 * 
	 */
	public String getCopyright() {
		return copyright.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#setCopyright(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#getAuthor()
	 * 
	 */
	public EList getAuthor() {
		return authorList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#setAuthor(EList newValue)
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
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#getChangeDate()
	 * 
	 */
	public String getChangeDate() {
		return changeDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#setChangeDate(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#getChangeDescription()
	 * 
	 */
	public String getChangeDescription() {
		return changeDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#setChangeDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#getVersion()
	 * 
	 */
	public String getVersion() {
		return version.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#setVersion(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#getStartDate()
	 * 
	 */
	public String getStartDate() {
		return startDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#setStartDate(String newValue)
	 * 
	 */
	public void setStartDate(String newValue) {
		if (newValue != null) {
			startDate.setText(newValue);
		} else {
			startDate.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#getFinishDate()
	 * 
	 */
	public String getFinishDate() {
		return finishDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#setFinishDate(String newValue)
	 * 
	 */
	public void setFinishDate(String newValue) {
		if (newValue != null) {
			finishDate.setText(newValue);
		} else {
			finishDate.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#getRank()
	 * 
	 */
	public String getRank() {
		return rank.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#setRank(String newValue)
	 * 
	 */
	public void setRank(String newValue) {
		if (newValue != null) {
			rank.setText(newValue);
		} else {
			rank.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#getDuration()
	 * 
	 */
	public String getDuration() {
		return duration.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.PlanningDataPropertiesEditionPart#setDuration(String newValue)
	 * 
	 */
	public void setDuration(String newValue) {
		if (newValue != null) {
			duration.setText(newValue);
		} else {
			duration.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SpemMessages.PlanningData_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
