/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.obeonetwork.dsl.spem.Category;
import org.obeonetwork.dsl.spem.Guidance;
import org.obeonetwork.dsl.spem.Kind;
import org.obeonetwork.dsl.spem.Metric;
import org.obeonetwork.dsl.spem.OptionalityKind;
import org.obeonetwork.dsl.spem.ParameterDirectionKind;
import org.obeonetwork.dsl.spem.ProcessParameter;
import org.obeonetwork.dsl.spem.SpemFactory;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.WorkProductUse;
import org.obeonetwork.dsl.spem.parts.ProcessParameterPropertiesEditionPart;
import org.obeonetwork.dsl.spem.parts.SpemViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ProcessParameterPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for kind EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings kindSettings;
	
	/**
	 * Settings for guidance ReferencesTable
	 */
	private	ReferencesTableSettings guidanceSettings;
	
	/**
	 * Settings for metric ReferencesTable
	 */
	private	ReferencesTableSettings metricSettings;
	
	/**
	 * Settings for category ReferencesTable
	 */
	private	ReferencesTableSettings categorySettings;
	
	/**
	 * Settings for parameterType EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings parameterTypeSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ProcessParameterPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject processParameter, String editing_mode) {
		super(editingContext, processParameter, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SpemViewsRepository.class;
		partKey = SpemViewsRepository.ProcessParameter.class;
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
			final ProcessParameter processParameter = (ProcessParameter)elt;
			final ProcessParameterPropertiesEditionPart basePart = (ProcessParameterPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SpemViewsRepository.ProcessParameter.Properties.direction)) {
				basePart.initDirection((EEnum) SpemPackage.eINSTANCE.getWorkDefinitionParameter_Direction().getEType(), processParameter.getDirection());
			}
			if (isAccessible(SpemViewsRepository.ProcessParameter.Properties.kind)) {
				// init part
				kindSettings = new EObjectFlatComboSettings(processParameter, SpemPackage.eINSTANCE.getExtensibleElement_Kind());
				basePart.initKind(kindSettings);
				// set the button mode
				basePart.setKindButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (processParameter.getPresentationName() != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.presentationName))
				basePart.setPresentationName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), processParameter.getPresentationName()));
			
			if (processParameter.getBriefDescription() != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.briefDescription))
				basePart.setBriefDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), processParameter.getBriefDescription()));
			
			if (processParameter.getMainDescription() != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.mainDescription))
				basePart.setMainDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), processParameter.getMainDescription()));
			
			if (processParameter.getPurpose() != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.purpose))
				basePart.setPurpose(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), processParameter.getPurpose()));
			
			if (isAccessible(SpemViewsRepository.ProcessParameter.Properties.guidance)) {
				guidanceSettings = new ReferencesTableSettings(processParameter, SpemPackage.eINSTANCE.getDescribableElement_Guidance());
				basePart.initGuidance(guidanceSettings);
			}
			if (isAccessible(SpemViewsRepository.ProcessParameter.Properties.metric)) {
				metricSettings = new ReferencesTableSettings(processParameter, SpemPackage.eINSTANCE.getDescribableElement_Metric());
				basePart.initMetric(metricSettings);
			}
			if (isAccessible(SpemViewsRepository.ProcessParameter.Properties.category)) {
				categorySettings = new ReferencesTableSettings(processParameter, SpemPackage.eINSTANCE.getDescribableElement_Category());
				basePart.initCategory(categorySettings);
			}
			if (processParameter.getCopyright() != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.copyright))
				basePart.setCopyright(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), processParameter.getCopyright()));
			
			if (processParameter.getAuthor() != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.author))
				basePart.setAuthor(processParameter.getAuthor());
			
			if (processParameter.getChangeDate() != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.changeDate))
				basePart.setChangeDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), processParameter.getChangeDate()));
			
			if (processParameter.getChangeDescription() != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.changeDescription))
				basePart.setChangeDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), processParameter.getChangeDescription()));
			
			if (processParameter.getVersion() != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.version))
				basePart.setVersion(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), processParameter.getVersion()));
			
			if (processParameter.getName() != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), processParameter.getName()));
			
			if (isAccessible(SpemViewsRepository.ProcessParameter.Properties.hasMultipleOccurrences)) {
				basePart.setHasMultipleOccurrences(processParameter.isHasMultipleOccurrences());
			}
			if (isAccessible(SpemViewsRepository.ProcessParameter.Properties.isOptional)) {
				basePart.setIsOptional(processParameter.isIsOptional());
			}
			if (isAccessible(SpemViewsRepository.ProcessParameter.Properties.isPlanned)) {
				basePart.setIsPlanned(processParameter.isIsPlanned());
			}
			if (isAccessible(SpemViewsRepository.ProcessParameter.Properties.parameterType)) {
				// init part
				parameterTypeSettings = new EObjectFlatComboSettings(processParameter, SpemPackage.eINSTANCE.getProcessParameter_ParameterType());
				basePart.initParameterType(parameterTypeSettings);
				// set the button mode
				basePart.setParameterTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SpemViewsRepository.ProcessParameter.Properties.optionality)) {
				basePart.initOptionality((EEnum) SpemPackage.eINSTANCE.getProcessParameter_Optionality().getEType(), processParameter.getOptionality());
			}
			// init filters
			
			basePart.addFilterToKind(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Kind); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for kind
			// End of user code
			
			
			
			
			
			basePart.addFilterToGuidance(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInGuidanceTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToGuidance(new EObjectFilter(SpemPackage.eINSTANCE.getGuidance()));
			// Start of user code for additional businessfilters for guidance
			// End of user code
			
			basePart.addFilterToMetric(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInMetricTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToMetric(new EObjectFilter(SpemPackage.eINSTANCE.getMetric()));
			// Start of user code for additional businessfilters for metric
			// End of user code
			
			basePart.addFilterToCategory(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInCategoryTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToCategory(new EObjectFilter(SpemPackage.eINSTANCE.getCategory()));
			// Start of user code for additional businessfilters for category
			// End of user code
			
			
			
			
			
			
			
			
			
			
			basePart.addFilterToParameterType(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof WorkProductUse); //$NON-NLS-1$ 
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
		if (editorKey == SpemViewsRepository.ProcessParameter.Properties.direction) {
			return SpemPackage.eINSTANCE.getWorkDefinitionParameter_Direction();
		}
		if (editorKey == SpemViewsRepository.ProcessParameter.Properties.kind) {
			return SpemPackage.eINSTANCE.getExtensibleElement_Kind();
		}
		if (editorKey == SpemViewsRepository.ProcessParameter.Properties.presentationName) {
			return SpemPackage.eINSTANCE.getDescribableElement_PresentationName();
		}
		if (editorKey == SpemViewsRepository.ProcessParameter.Properties.briefDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_BriefDescription();
		}
		if (editorKey == SpemViewsRepository.ProcessParameter.Properties.mainDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_MainDescription();
		}
		if (editorKey == SpemViewsRepository.ProcessParameter.Properties.purpose) {
			return SpemPackage.eINSTANCE.getDescribableElement_Purpose();
		}
		if (editorKey == SpemViewsRepository.ProcessParameter.Properties.guidance) {
			return SpemPackage.eINSTANCE.getDescribableElement_Guidance();
		}
		if (editorKey == SpemViewsRepository.ProcessParameter.Properties.metric) {
			return SpemPackage.eINSTANCE.getDescribableElement_Metric();
		}
		if (editorKey == SpemViewsRepository.ProcessParameter.Properties.category) {
			return SpemPackage.eINSTANCE.getDescribableElement_Category();
		}
		if (editorKey == SpemViewsRepository.ProcessParameter.Properties.copyright) {
			return SpemPackage.eINSTANCE.getDescribableElement_Copyright();
		}
		if (editorKey == SpemViewsRepository.ProcessParameter.Properties.author) {
			return SpemPackage.eINSTANCE.getDescribableElement_Author();
		}
		if (editorKey == SpemViewsRepository.ProcessParameter.Properties.changeDate) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDate();
		}
		if (editorKey == SpemViewsRepository.ProcessParameter.Properties.changeDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription();
		}
		if (editorKey == SpemViewsRepository.ProcessParameter.Properties.version) {
			return SpemPackage.eINSTANCE.getDescribableElement_Version();
		}
		if (editorKey == SpemViewsRepository.ProcessParameter.Properties.name) {
			return SpemPackage.eINSTANCE.getProcessPackageableElement_Name();
		}
		if (editorKey == SpemViewsRepository.ProcessParameter.Properties.hasMultipleOccurrences) {
			return SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences();
		}
		if (editorKey == SpemViewsRepository.ProcessParameter.Properties.isOptional) {
			return SpemPackage.eINSTANCE.getBreakdownElement_IsOptional();
		}
		if (editorKey == SpemViewsRepository.ProcessParameter.Properties.isPlanned) {
			return SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned();
		}
		if (editorKey == SpemViewsRepository.ProcessParameter.Properties.parameterType) {
			return SpemPackage.eINSTANCE.getProcessParameter_ParameterType();
		}
		if (editorKey == SpemViewsRepository.ProcessParameter.Properties.optionality) {
			return SpemPackage.eINSTANCE.getProcessParameter_Optionality();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ProcessParameter processParameter = (ProcessParameter)semanticObject;
		if (SpemViewsRepository.ProcessParameter.Properties.direction == event.getAffectedEditor()) {
			processParameter.setDirection((ParameterDirectionKind)event.getNewValue());
		}
		if (SpemViewsRepository.ProcessParameter.Properties.kind == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				kindSettings.setToReference((Kind)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Kind eObject = SpemFactory.eINSTANCE.createKind();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				kindSettings.setToReference(eObject);
			}
		}
		if (SpemViewsRepository.ProcessParameter.Properties.presentationName == event.getAffectedEditor()) {
			processParameter.setPresentationName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.ProcessParameter.Properties.briefDescription == event.getAffectedEditor()) {
			processParameter.setBriefDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.ProcessParameter.Properties.mainDescription == event.getAffectedEditor()) {
			processParameter.setMainDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.ProcessParameter.Properties.purpose == event.getAffectedEditor()) {
			processParameter.setPurpose((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.ProcessParameter.Properties.guidance == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Guidance) {
					guidanceSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				guidanceSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				guidanceSettings.move(event.getNewIndex(), (Guidance) event.getNewValue());
			}
		}
		if (SpemViewsRepository.ProcessParameter.Properties.metric == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Metric) {
					metricSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				metricSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				metricSettings.move(event.getNewIndex(), (Metric) event.getNewValue());
			}
		}
		if (SpemViewsRepository.ProcessParameter.Properties.category == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Category) {
					categorySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				categorySettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				categorySettings.move(event.getNewIndex(), (Category) event.getNewValue());
			}
		}
		if (SpemViewsRepository.ProcessParameter.Properties.copyright == event.getAffectedEditor()) {
			processParameter.setCopyright((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.ProcessParameter.Properties.author == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				processParameter.getAuthor().clear();
				processParameter.getAuthor().addAll(((List) event.getNewValue()));
			}
		}
		if (SpemViewsRepository.ProcessParameter.Properties.changeDate == event.getAffectedEditor()) {
			processParameter.setChangeDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.ProcessParameter.Properties.changeDescription == event.getAffectedEditor()) {
			processParameter.setChangeDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.ProcessParameter.Properties.version == event.getAffectedEditor()) {
			processParameter.setVersion((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.ProcessParameter.Properties.name == event.getAffectedEditor()) {
			processParameter.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.ProcessParameter.Properties.hasMultipleOccurrences == event.getAffectedEditor()) {
			processParameter.setHasMultipleOccurrences((Boolean)event.getNewValue());
		}
		if (SpemViewsRepository.ProcessParameter.Properties.isOptional == event.getAffectedEditor()) {
			processParameter.setIsOptional((Boolean)event.getNewValue());
		}
		if (SpemViewsRepository.ProcessParameter.Properties.isPlanned == event.getAffectedEditor()) {
			processParameter.setIsPlanned((Boolean)event.getNewValue());
		}
		if (SpemViewsRepository.ProcessParameter.Properties.parameterType == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				parameterTypeSettings.setToReference((WorkProductUse)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				WorkProductUse eObject = SpemFactory.eINSTANCE.createWorkProductUse();
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
		if (SpemViewsRepository.ProcessParameter.Properties.optionality == event.getAffectedEditor()) {
			processParameter.setOptionality((OptionalityKind)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ProcessParameterPropertiesEditionPart basePart = (ProcessParameterPropertiesEditionPart)editingPart;
			if (SpemPackage.eINSTANCE.getWorkDefinitionParameter_Direction().equals(msg.getFeature()) && isAccessible(SpemViewsRepository.ProcessParameter.Properties.direction))
				basePart.setDirection((Enumerator)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getExtensibleElement_Kind().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.kind))
				basePart.setKind((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getDescribableElement_PresentationName().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.presentationName)) {
				if (msg.getNewValue() != null) {
					basePart.setPresentationName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPresentationName("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.briefDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setBriefDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setBriefDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_MainDescription().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.mainDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setMainDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setMainDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Purpose().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.purpose)) {
				if (msg.getNewValue() != null) {
					basePart.setPurpose(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPurpose("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Guidance().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.ProcessParameter.Properties.guidance))
				basePart.updateGuidance();
			if (SpemPackage.eINSTANCE.getDescribableElement_Metric().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.ProcessParameter.Properties.metric))
				basePart.updateMetric();
			if (SpemPackage.eINSTANCE.getDescribableElement_Category().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.ProcessParameter.Properties.category))
				basePart.updateCategory();
			if (SpemPackage.eINSTANCE.getDescribableElement_Copyright().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.copyright)) {
				if (msg.getNewValue() != null) {
					basePart.setCopyright(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCopyright("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Author().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.author)) {
				basePart.setAuthor(((ProcessParameter)semanticObject).getAuthor());
			}
			
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.changeDate)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setChangeDate("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.changeDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setChangeDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Version().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.version)) {
				if (msg.getNewValue() != null) {
					basePart.setVersion(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setVersion("");
				}
			}
			if (SpemPackage.eINSTANCE.getProcessPackageableElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.hasMultipleOccurrences))
				basePart.setHasMultipleOccurrences((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.isOptional))
				basePart.setIsOptional((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.isPlanned))
				basePart.setIsPlanned((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getProcessParameter_ParameterType().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.ProcessParameter.Properties.parameterType))
				basePart.setParameterType((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getProcessParameter_Optionality().equals(msg.getFeature()) && isAccessible(SpemViewsRepository.ProcessParameter.Properties.optionality))
				basePart.setOptionality((Enumerator)msg.getNewValue());
			
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SpemViewsRepository.ProcessParameter.Properties.hasMultipleOccurrences || key == SpemViewsRepository.ProcessParameter.Properties.isOptional || key == SpemViewsRepository.ProcessParameter.Properties.isPlanned;
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
				if (SpemViewsRepository.ProcessParameter.Properties.direction == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getWorkDefinitionParameter_Direction().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkDefinitionParameter_Direction().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.ProcessParameter.Properties.presentationName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.ProcessParameter.Properties.briefDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.ProcessParameter.Properties.mainDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.ProcessParameter.Properties.purpose == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.ProcessParameter.Properties.copyright == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.ProcessParameter.Properties.author == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Author().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (SpemViewsRepository.ProcessParameter.Properties.changeDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.ProcessParameter.Properties.changeDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.ProcessParameter.Properties.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.ProcessParameter.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getProcessPackageableElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getProcessPackageableElement_Name().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.ProcessParameter.Properties.hasMultipleOccurrences == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.ProcessParameter.Properties.isOptional == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.ProcessParameter.Properties.isPlanned == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.ProcessParameter.Properties.optionality == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getProcessParameter_Optionality().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getProcessParameter_Optionality().getEAttributeType(), newValue);
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
