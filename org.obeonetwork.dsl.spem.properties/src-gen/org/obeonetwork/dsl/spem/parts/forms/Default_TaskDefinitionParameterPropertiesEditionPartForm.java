/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.parts.forms;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.obeonetwork.dsl.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart;
import org.obeonetwork.dsl.spem.parts.SpemViewsRepository;
import org.obeonetwork.dsl.spem.providers.SpemMessages;


// End of user code

/**
 * 
 * 
 */
public class Default_TaskDefinitionParameterPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, Default_TaskDefinitionParameterPropertiesEditionPart {

	protected EMFComboViewer direction;
	protected Text name;
	protected EObjectFlatComboViewer parameterType;
	protected EMFComboViewer optionality;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public Default_TaskDefinitionParameterPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence default_TaskDefinitionParameterStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = default_TaskDefinitionParameterStep.addStep(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.class);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.direction);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.name);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.parameterType);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.optionality);
		
		
		composer = new PartComposer(default_TaskDefinitionParameterStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SpemViewsRepository.Default_TaskDefinitionParameter.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionParameter.Properties.direction) {
					return createDirectionEMFComboViewer(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionParameter.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionParameter.Properties.parameterType) {
					return createParameterTypeFlatComboViewer(parent, widgetFactory);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionParameter.Properties.optionality) {
					return createOptionalityEMFComboViewer(widgetFactory, parent);
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
		propertiesSection.setText(SpemMessages.Default_TaskDefinitionParameterPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createDirectionEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, SpemMessages.Default_TaskDefinitionParameterPropertiesEditionPart_DirectionLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.direction, SpemViewsRepository.FORM_KIND));
		direction = new EMFComboViewer(parent);
		direction.setContentProvider(new ArrayContentProvider());
		direction.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData directionData = new GridData(GridData.FILL_HORIZONTAL);
		direction.getCombo().setLayoutData(directionData);
		direction.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionParameterPropertiesEditionPartForm.this, SpemViewsRepository.Default_TaskDefinitionParameter.Properties.direction, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getDirection()));
			}

		});
		direction.setID(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.direction);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.direction, SpemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, SpemMessages.Default_TaskDefinitionParameterPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.name, SpemViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionParameterPropertiesEditionPartForm.this, SpemViewsRepository.Default_TaskDefinitionParameter.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionParameterPropertiesEditionPartForm.this, SpemViewsRepository.Default_TaskDefinitionParameter.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, SpemViewsRepository.Default_TaskDefinitionParameter.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.name, SpemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createParameterTypeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, SpemMessages.Default_TaskDefinitionParameterPropertiesEditionPart_ParameterTypeLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.parameterType, SpemViewsRepository.FORM_KIND));
		parameterType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.parameterType, SpemViewsRepository.FORM_KIND));
		widgetFactory.adapt(parameterType);
		parameterType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData parameterTypeData = new GridData(GridData.FILL_HORIZONTAL);
		parameterType.setLayoutData(parameterTypeData);
		parameterType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionParameterPropertiesEditionPartForm.this, SpemViewsRepository.Default_TaskDefinitionParameter.Properties.parameterType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getParameterType()));
			}

		});
		parameterType.setID(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.parameterType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.parameterType, SpemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOptionalityEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, SpemMessages.Default_TaskDefinitionParameterPropertiesEditionPart_OptionalityLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.optionality, SpemViewsRepository.FORM_KIND));
		optionality = new EMFComboViewer(parent);
		optionality.setContentProvider(new ArrayContentProvider());
		optionality.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData optionalityData = new GridData(GridData.FILL_HORIZONTAL);
		optionality.getCombo().setLayoutData(optionalityData);
		optionality.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionParameterPropertiesEditionPartForm.this, SpemViewsRepository.Default_TaskDefinitionParameter.Properties.optionality, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOptionality()));
			}

		});
		optionality.setID(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.optionality);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.optionality, SpemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#getDirection()
	 * 
	 */
	public Enumerator getDirection() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) direction.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#initDirection(EEnum eenum, Enumerator current)
	 */
	public void initDirection(EEnum eenum, Enumerator current) {
		direction.setInput(eenum.getELiterals());
		direction.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#setDirection(Enumerator newValue)
	 * 
	 */
	public void setDirection(Enumerator newValue) {
		direction.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#getParameterType()
	 * 
	 */
	public EObject getParameterType() {
		if (parameterType.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) parameterType.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#initParameterType(EObjectFlatComboSettings)
	 */
	public void initParameterType(EObjectFlatComboSettings settings) {
		parameterType.setInput(settings);
		if (current != null) {
			parameterType.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#setParameterType(EObject newValue)
	 * 
	 */
	public void setParameterType(EObject newValue) {
		if (newValue != null) {
			parameterType.setSelection(new StructuredSelection(newValue));
		} else {
			parameterType.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#setParameterTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParameterTypeButtonMode(ButtonsModeEnum newValue) {
		parameterType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#addFilterParameterType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParameterType(ViewerFilter filter) {
		parameterType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#addBusinessFilterParameterType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParameterType(ViewerFilter filter) {
		parameterType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#getOptionality()
	 * 
	 */
	public Enumerator getOptionality() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) optionality.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#initOptionality(EEnum eenum, Enumerator current)
	 */
	public void initOptionality(EEnum eenum, Enumerator current) {
		optionality.setInput(eenum.getELiterals());
		optionality.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#setOptionality(Enumerator newValue)
	 * 
	 */
	public void setOptionality(Enumerator newValue) {
		optionality.modelUpdating(new StructuredSelection(newValue));
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SpemMessages.Default_TaskDefinitionParameter_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
