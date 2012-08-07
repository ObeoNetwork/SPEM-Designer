/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.obeonetwork.dsl.spem.Default_TaskDefinitionParameter;
import org.obeonetwork.dsl.spem.OptionalityKind;
import org.obeonetwork.dsl.spem.ParameterDirectionKind;
import org.obeonetwork.dsl.spem.SpemFactory;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.WorkProductDefinition;
import org.obeonetwork.dsl.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart;
import org.obeonetwork.dsl.spem.parts.SpemViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class Default_TaskDefinitionParameterPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for parameterType EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings parameterTypeSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public Default_TaskDefinitionParameterPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject default_TaskDefinitionParameter, String editing_mode) {
		super(editingContext, default_TaskDefinitionParameter, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SpemViewsRepository.class;
		partKey = SpemViewsRepository.Default_TaskDefinitionParameter.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final Default_TaskDefinitionParameter default_TaskDefinitionParameter = (Default_TaskDefinitionParameter)elt;
			final Default_TaskDefinitionParameterPropertiesEditionPart basePart = (Default_TaskDefinitionParameterPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.direction)) {
				basePart.initDirection((EEnum) SpemPackage.eINSTANCE.getWorkDefinitionParameter_Direction().getEType(), default_TaskDefinitionParameter.getDirection());
			}
			if (default_TaskDefinitionParameter.getName() != null && isAccessible(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), default_TaskDefinitionParameter.getName()));
			
			if (isAccessible(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.parameterType)) {
				// init part
				parameterTypeSettings = new EObjectFlatComboSettings(default_TaskDefinitionParameter, SpemPackage.eINSTANCE.getDefault_TaskDefinitionParameter_ParameterType());
				basePart.initParameterType(parameterTypeSettings);
				// set the button mode
				basePart.setParameterTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.optionality)) {
				basePart.initOptionality((EEnum) SpemPackage.eINSTANCE.getDefault_TaskDefinitionParameter_Optionality().getEType(), default_TaskDefinitionParameter.getOptionality());
			}
			// init filters
			
			
			basePart.addFilterToParameterType(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof WorkProductDefinition); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for parameterType
			// End of user code
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}







	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == SpemViewsRepository.Default_TaskDefinitionParameter.Properties.direction) {
			return SpemPackage.eINSTANCE.getWorkDefinitionParameter_Direction();
		}
		if (editorKey == SpemViewsRepository.Default_TaskDefinitionParameter.Properties.name) {
			return SpemPackage.eINSTANCE.getDefault_TaskDefinitionParameter_Name();
		}
		if (editorKey == SpemViewsRepository.Default_TaskDefinitionParameter.Properties.parameterType) {
			return SpemPackage.eINSTANCE.getDefault_TaskDefinitionParameter_ParameterType();
		}
		if (editorKey == SpemViewsRepository.Default_TaskDefinitionParameter.Properties.optionality) {
			return SpemPackage.eINSTANCE.getDefault_TaskDefinitionParameter_Optionality();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Default_TaskDefinitionParameter default_TaskDefinitionParameter = (Default_TaskDefinitionParameter)semanticObject;
		if (SpemViewsRepository.Default_TaskDefinitionParameter.Properties.direction == event.getAffectedEditor()) {
			default_TaskDefinitionParameter.setDirection((ParameterDirectionKind)event.getNewValue());
		}
		if (SpemViewsRepository.Default_TaskDefinitionParameter.Properties.name == event.getAffectedEditor()) {
			default_TaskDefinitionParameter.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.Default_TaskDefinitionParameter.Properties.parameterType == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				parameterTypeSettings.setToReference((WorkProductDefinition)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				WorkProductDefinition eObject = SpemFactory.eINSTANCE.createWorkProductDefinition();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				parameterTypeSettings.setToReference(eObject);
			}
		}
		if (SpemViewsRepository.Default_TaskDefinitionParameter.Properties.optionality == event.getAffectedEditor()) {
			default_TaskDefinitionParameter.setOptionality((OptionalityKind)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			Default_TaskDefinitionParameterPropertiesEditionPart basePart = (Default_TaskDefinitionParameterPropertiesEditionPart)editingPart;
			if (SpemPackage.eINSTANCE.getWorkDefinitionParameter_Direction().equals(msg.getFeature()) && isAccessible(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.direction))
				basePart.setDirection((Enumerator)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getDefault_TaskDefinitionParameter_Name().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SpemPackage.eINSTANCE.getDefault_TaskDefinitionParameter_ParameterType().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.parameterType))
				basePart.setParameterType((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getDefault_TaskDefinitionParameter_Optionality().equals(msg.getFeature()) && isAccessible(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.optionality))
				basePart.setOptionality((Enumerator)msg.getNewValue());
			
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (SpemViewsRepository.Default_TaskDefinitionParameter.Properties.direction == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getWorkDefinitionParameter_Direction().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkDefinitionParameter_Direction().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.Default_TaskDefinitionParameter.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDefault_TaskDefinitionParameter_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDefault_TaskDefinitionParameter_Name().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.Default_TaskDefinitionParameter.Properties.optionality == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDefault_TaskDefinitionParameter_Optionality().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDefault_TaskDefinitionParameter_Optionality().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
