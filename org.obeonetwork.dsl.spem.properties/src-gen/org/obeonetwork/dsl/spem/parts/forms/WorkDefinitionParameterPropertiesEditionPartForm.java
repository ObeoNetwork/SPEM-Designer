/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.parts.forms;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.obeonetwork.dsl.spem.parts.SpemViewsRepository;
import org.obeonetwork.dsl.spem.parts.WorkDefinitionParameterPropertiesEditionPart;
import org.obeonetwork.dsl.spem.providers.SpemMessages;


// End of user code

/**
 * 
 * 
 */
public class WorkDefinitionParameterPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, WorkDefinitionParameterPropertiesEditionPart {

	protected EMFComboViewer direction;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public WorkDefinitionParameterPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence workDefinitionParameterStep = new BindingCompositionSequence(propertiesEditionComponent);
		workDefinitionParameterStep
			.addStep(SpemViewsRepository.WorkDefinitionParameter.Properties.class)
			.addStep(SpemViewsRepository.WorkDefinitionParameter.Properties.direction);
		
		
		composer = new PartComposer(workDefinitionParameterStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SpemViewsRepository.WorkDefinitionParameter.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.WorkDefinitionParameter.Properties.direction) {
					return createDirectionEMFComboViewer(widgetFactory, parent);
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
		propertiesSection.setText(SpemMessages.WorkDefinitionParameterPropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, SpemMessages.WorkDefinitionParameterPropertiesEditionPart_DirectionLabel, propertiesEditionComponent.isRequired(SpemViewsRepository.WorkDefinitionParameter.Properties.direction, SpemViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WorkDefinitionParameterPropertiesEditionPartForm.this, SpemViewsRepository.WorkDefinitionParameter.Properties.direction, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getDirection()));
			}

		});
		direction.setID(SpemViewsRepository.WorkDefinitionParameter.Properties.direction);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.WorkDefinitionParameter.Properties.direction, SpemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.spem.parts.WorkDefinitionParameterPropertiesEditionPart#getDirection()
	 * 
	 */
	public Enumerator getDirection() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) direction.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.WorkDefinitionParameterPropertiesEditionPart#initDirection(EEnum eenum, Enumerator current)
	 */
	public void initDirection(EEnum eenum, Enumerator current) {
		direction.setInput(eenum.getELiterals());
		direction.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.parts.WorkDefinitionParameterPropertiesEditionPart#setDirection(Enumerator newValue)
	 * 
	 */
	public void setDirection(Enumerator newValue) {
		direction.modelUpdating(new StructuredSelection(newValue));
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SpemMessages.WorkDefinitionParameter_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
