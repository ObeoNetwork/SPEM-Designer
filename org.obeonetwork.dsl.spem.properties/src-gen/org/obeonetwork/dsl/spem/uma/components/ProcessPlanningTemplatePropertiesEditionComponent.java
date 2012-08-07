/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.uma.components;

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
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.obeonetwork.dsl.spem.Activity;
import org.obeonetwork.dsl.spem.ActivityUseKind;
import org.obeonetwork.dsl.spem.BreakdownElement;
import org.obeonetwork.dsl.spem.Category;
import org.obeonetwork.dsl.spem.Guidance;
import org.obeonetwork.dsl.spem.Kind;
import org.obeonetwork.dsl.spem.MethodConfiguration;
import org.obeonetwork.dsl.spem.Metric;
import org.obeonetwork.dsl.spem.SpemFactory;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.VariabilityElement;
import org.obeonetwork.dsl.spem.VariabilityType;
import org.obeonetwork.dsl.spem.WorkSequence;
import org.obeonetwork.dsl.spem.uma.Process;
import org.obeonetwork.dsl.spem.uma.ProcessPlanningTemplate;
import org.obeonetwork.dsl.spem.uma.UmaPackage;
import org.obeonetwork.dsl.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart;
import org.obeonetwork.dsl.spem.uma.parts.UmaViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ProcessPlanningTemplatePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for linkToPredecessor ReferencesTable
	 */
	private	ReferencesTableSettings linkToPredecessorSettings;
	
	/**
	 * Settings for linkToSuccessor ReferencesTable
	 */
	private	ReferencesTableSettings linkToSuccessorSettings;
	
	/**
	 * Settings for variabilityBasedOnElement EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings variabilityBasedOnElementSettings;
	
	/**
	 * Settings for usedActivity EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings usedActivitySettings;
	
	/**
	 * Settings for suppressedBreakdownElement ReferencesTable
	 */
	private	ReferencesTableSettings suppressedBreakdownElementSettings;
	
	/**
	 * Settings for defaultContext EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings defaultContextSettings;
	
	/**
	 * Settings for validContext ReferencesTable
	 */
	private	ReferencesTableSettings validContextSettings;
	
	/**
	 * Settings for baseProcess ReferencesTable
	 */
	private	ReferencesTableSettings baseProcessSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ProcessPlanningTemplatePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject processPlanningTemplate, String editing_mode) {
		super(editingContext, processPlanningTemplate, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = UmaViewsRepository.class;
		partKey = UmaViewsRepository.ProcessPlanningTemplate.class;
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
			final ProcessPlanningTemplate processPlanningTemplate = (ProcessPlanningTemplate)elt;
			final ProcessPlanningTemplatePropertiesEditionPart basePart = (ProcessPlanningTemplatePropertiesEditionPart)editingPart;
			// init values
			if (processPlanningTemplate.getPreCondition() != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.preCondition))
				basePart.setPreCondition(processPlanningTemplate.getPreCondition());
			
			if (processPlanningTemplate.getPostCondition() != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.postCondition))
				basePart.setPostCondition(processPlanningTemplate.getPostCondition());
			
			if (isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.kind)) {
				// init part
				kindSettings = new EObjectFlatComboSettings(processPlanningTemplate, SpemPackage.eINSTANCE.getExtensibleElement_Kind());
				basePart.initKind(kindSettings);
				// set the button mode
				basePart.setKindButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (processPlanningTemplate.getPresentationName() != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.presentationName))
				basePart.setPresentationName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), processPlanningTemplate.getPresentationName()));
			
			if (processPlanningTemplate.getBriefDescription() != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.briefDescription))
				basePart.setBriefDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), processPlanningTemplate.getBriefDescription()));
			
			if (processPlanningTemplate.getMainDescription() != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.mainDescription))
				basePart.setMainDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), processPlanningTemplate.getMainDescription()));
			
			if (processPlanningTemplate.getPurpose() != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.purpose))
				basePart.setPurpose(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), processPlanningTemplate.getPurpose()));
			
			if (isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.guidance)) {
				guidanceSettings = new ReferencesTableSettings(processPlanningTemplate, SpemPackage.eINSTANCE.getDescribableElement_Guidance());
				basePart.initGuidance(guidanceSettings);
			}
			if (isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.metric)) {
				metricSettings = new ReferencesTableSettings(processPlanningTemplate, SpemPackage.eINSTANCE.getDescribableElement_Metric());
				basePart.initMetric(metricSettings);
			}
			if (isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.category)) {
				categorySettings = new ReferencesTableSettings(processPlanningTemplate, SpemPackage.eINSTANCE.getDescribableElement_Category());
				basePart.initCategory(categorySettings);
			}
			if (processPlanningTemplate.getCopyright() != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.copyright))
				basePart.setCopyright(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), processPlanningTemplate.getCopyright()));
			
			if (processPlanningTemplate.getAuthor() != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.author))
				basePart.setAuthor(processPlanningTemplate.getAuthor());
			
			if (processPlanningTemplate.getChangeDate() != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDate))
				basePart.setChangeDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), processPlanningTemplate.getChangeDate()));
			
			if (processPlanningTemplate.getChangeDescription() != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDescription))
				basePart.setChangeDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), processPlanningTemplate.getChangeDescription()));
			
			if (processPlanningTemplate.getVersion() != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.version))
				basePart.setVersion(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), processPlanningTemplate.getVersion()));
			
			if (processPlanningTemplate.getName() != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), processPlanningTemplate.getName()));
			
			if (isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.hasMultipleOccurrences)) {
				basePart.setHasMultipleOccurrences(processPlanningTemplate.isHasMultipleOccurrences());
			}
			if (isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.isOptional)) {
				basePart.setIsOptional(processPlanningTemplate.isIsOptional());
			}
			if (isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.isPlanned)) {
				basePart.setIsPlanned(processPlanningTemplate.isIsPlanned());
			}
			if (isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.isRepeatable)) {
				basePart.setIsRepeatable(processPlanningTemplate.isIsRepeatable());
			}
			if (isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.isOngoing)) {
				basePart.setIsOngoing(processPlanningTemplate.isIsOngoing());
			}
			if (isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.isEventDriven)) {
				basePart.setIsEventDriven(processPlanningTemplate.isIsEventDriven());
			}
			if (isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToPredecessor)) {
				linkToPredecessorSettings = new ReferencesTableSettings(processPlanningTemplate, SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToPredecessor());
				basePart.initLinkToPredecessor(linkToPredecessorSettings);
			}
			if (isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToSuccessor)) {
				linkToSuccessorSettings = new ReferencesTableSettings(processPlanningTemplate, SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToSuccessor());
				basePart.initLinkToSuccessor(linkToSuccessorSettings);
			}
			if (isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityType)) {
				basePart.initVariabilityType((EEnum) SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().getEType(), processPlanningTemplate.getVariabilityType());
			}
			if (isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityBasedOnElement)) {
				// init part
				variabilityBasedOnElementSettings = new EObjectFlatComboSettings(processPlanningTemplate, SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement());
				basePart.initVariabilityBasedOnElement(variabilityBasedOnElementSettings);
				// set the button mode
				basePart.setVariabilityBasedOnElementButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.useKind)) {
				basePart.initUseKind((EEnum) SpemPackage.eINSTANCE.getActivity_UseKind().getEType(), processPlanningTemplate.getUseKind());
			}
			if (isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.usedActivity)) {
				// init part
				usedActivitySettings = new EObjectFlatComboSettings(processPlanningTemplate, SpemPackage.eINSTANCE.getActivity_UsedActivity());
				basePart.initUsedActivity(usedActivitySettings);
				// set the button mode
				basePart.setUsedActivityButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.suppressedBreakdownElement)) {
				suppressedBreakdownElementSettings = new ReferencesTableSettings(processPlanningTemplate, SpemPackage.eINSTANCE.getActivity_SuppressedBreakdownElement());
				basePart.initSuppressedBreakdownElement(suppressedBreakdownElementSettings);
			}
			if (isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.defaultContext)) {
				// init part
				defaultContextSettings = new EObjectFlatComboSettings(processPlanningTemplate, SpemPackage.eINSTANCE.getActivity_DefaultContext());
				basePart.initDefaultContext(defaultContextSettings);
				// set the button mode
				basePart.setDefaultContextButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.validContext)) {
				validContextSettings = new ReferencesTableSettings(processPlanningTemplate, SpemPackage.eINSTANCE.getActivity_ValidContext());
				basePart.initValidContext(validContextSettings);
			}
			if (processPlanningTemplate.getScope() != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.scope))
				basePart.setScope(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), processPlanningTemplate.getScope()));
			
			if (processPlanningTemplate.getUsageNote() != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.usageNote))
				basePart.setUsageNote(processPlanningTemplate.getUsageNote());
			
			if (isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.baseProcess)) {
				baseProcessSettings = new ReferencesTableSettings(processPlanningTemplate, UmaPackage.eINSTANCE.getProcessPlanningTemplate_BaseProcess());
				basePart.initBaseProcess(baseProcessSettings);
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
			
			
			
			
			
			
			
			
			
			
			
			
			
			basePart.addFilterToLinkToPredecessor(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInLinkToPredecessorTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToLinkToPredecessor(new EObjectFilter(SpemPackage.eINSTANCE.getWorkSequence()));
			// Start of user code for additional businessfilters for linkToPredecessor
			// End of user code
			
			basePart.addFilterToLinkToSuccessor(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInLinkToSuccessorTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToLinkToSuccessor(new EObjectFilter(SpemPackage.eINSTANCE.getWorkSequence()));
			// Start of user code for additional businessfilters for linkToSuccessor
			// End of user code
			
			
			basePart.addFilterToVariabilityBasedOnElement(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof VariabilityElement); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for variabilityBasedOnElement
			// End of user code
			
			
			basePart.addFilterToUsedActivity(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Activity); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for usedActivity
			// End of user code
			
			basePart.addFilterToSuppressedBreakdownElement(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInSuppressedBreakdownElementTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToSuppressedBreakdownElement(new EObjectFilter(SpemPackage.eINSTANCE.getBreakdownElement()));
			// Start of user code for additional businessfilters for suppressedBreakdownElement
			// End of user code
			
			basePart.addFilterToDefaultContext(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof MethodConfiguration); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for defaultContext
			// End of user code
			
			basePart.addFilterToValidContext(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInValidContextTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToValidContext(new EObjectFilter(SpemPackage.eINSTANCE.getMethodConfiguration()));
			// Start of user code for additional businessfilters for validContext
			// End of user code
			
			
			
			basePart.addFilterToBaseProcess(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInBaseProcessTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToBaseProcess(new EObjectFilter(UmaPackage.eINSTANCE.getProcess()));
			// Start of user code for additional businessfilters for baseProcess
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
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.preCondition) {
			return SpemPackage.eINSTANCE.getWorkDefinition_PreCondition();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.postCondition) {
			return SpemPackage.eINSTANCE.getWorkDefinition_PostCondition();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.kind) {
			return SpemPackage.eINSTANCE.getExtensibleElement_Kind();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.presentationName) {
			return SpemPackage.eINSTANCE.getDescribableElement_PresentationName();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.briefDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_BriefDescription();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.mainDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_MainDescription();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.purpose) {
			return SpemPackage.eINSTANCE.getDescribableElement_Purpose();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.guidance) {
			return SpemPackage.eINSTANCE.getDescribableElement_Guidance();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.metric) {
			return SpemPackage.eINSTANCE.getDescribableElement_Metric();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.category) {
			return SpemPackage.eINSTANCE.getDescribableElement_Category();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.copyright) {
			return SpemPackage.eINSTANCE.getDescribableElement_Copyright();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.author) {
			return SpemPackage.eINSTANCE.getDescribableElement_Author();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDate) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDate();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.version) {
			return SpemPackage.eINSTANCE.getDescribableElement_Version();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.name) {
			return SpemPackage.eINSTANCE.getProcessPackageableElement_Name();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.hasMultipleOccurrences) {
			return SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.isOptional) {
			return SpemPackage.eINSTANCE.getBreakdownElement_IsOptional();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.isPlanned) {
			return SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.isRepeatable) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_IsRepeatable();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.isOngoing) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_IsOngoing();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.isEventDriven) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_IsEventDriven();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToPredecessor) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToPredecessor();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToSuccessor) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToSuccessor();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityType) {
			return SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityBasedOnElement) {
			return SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.useKind) {
			return SpemPackage.eINSTANCE.getActivity_UseKind();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.usedActivity) {
			return SpemPackage.eINSTANCE.getActivity_UsedActivity();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.suppressedBreakdownElement) {
			return SpemPackage.eINSTANCE.getActivity_SuppressedBreakdownElement();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.defaultContext) {
			return SpemPackage.eINSTANCE.getActivity_DefaultContext();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.validContext) {
			return SpemPackage.eINSTANCE.getActivity_ValidContext();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.scope) {
			return UmaPackage.eINSTANCE.getProcess_Scope();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.usageNote) {
			return UmaPackage.eINSTANCE.getProcess_UsageNote();
		}
		if (editorKey == UmaViewsRepository.ProcessPlanningTemplate.Properties.baseProcess) {
			return UmaPackage.eINSTANCE.getProcessPlanningTemplate_BaseProcess();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ProcessPlanningTemplate processPlanningTemplate = (ProcessPlanningTemplate)semanticObject;
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.preCondition == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				processPlanningTemplate.getPreCondition().clear();
				processPlanningTemplate.getPreCondition().addAll(((List) event.getNewValue()));
			}
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.postCondition == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				processPlanningTemplate.getPostCondition().clear();
				processPlanningTemplate.getPostCondition().addAll(((List) event.getNewValue()));
			}
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.kind == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.presentationName == event.getAffectedEditor()) {
			processPlanningTemplate.setPresentationName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.briefDescription == event.getAffectedEditor()) {
			processPlanningTemplate.setBriefDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.mainDescription == event.getAffectedEditor()) {
			processPlanningTemplate.setMainDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.purpose == event.getAffectedEditor()) {
			processPlanningTemplate.setPurpose((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.guidance == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.metric == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.category == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.copyright == event.getAffectedEditor()) {
			processPlanningTemplate.setCopyright((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.author == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				processPlanningTemplate.getAuthor().clear();
				processPlanningTemplate.getAuthor().addAll(((List) event.getNewValue()));
			}
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDate == event.getAffectedEditor()) {
			processPlanningTemplate.setChangeDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDescription == event.getAffectedEditor()) {
			processPlanningTemplate.setChangeDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.version == event.getAffectedEditor()) {
			processPlanningTemplate.setVersion((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.name == event.getAffectedEditor()) {
			processPlanningTemplate.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.hasMultipleOccurrences == event.getAffectedEditor()) {
			processPlanningTemplate.setHasMultipleOccurrences((Boolean)event.getNewValue());
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.isOptional == event.getAffectedEditor()) {
			processPlanningTemplate.setIsOptional((Boolean)event.getNewValue());
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.isPlanned == event.getAffectedEditor()) {
			processPlanningTemplate.setIsPlanned((Boolean)event.getNewValue());
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.isRepeatable == event.getAffectedEditor()) {
			processPlanningTemplate.setIsRepeatable((Boolean)event.getNewValue());
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.isOngoing == event.getAffectedEditor()) {
			processPlanningTemplate.setIsOngoing((Boolean)event.getNewValue());
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.isEventDriven == event.getAffectedEditor()) {
			processPlanningTemplate.setIsEventDriven((Boolean)event.getNewValue());
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToPredecessor == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof WorkSequence) {
					linkToPredecessorSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				linkToPredecessorSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				linkToPredecessorSettings.move(event.getNewIndex(), (WorkSequence) event.getNewValue());
			}
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToSuccessor == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof WorkSequence) {
					linkToSuccessorSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				linkToSuccessorSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				linkToSuccessorSettings.move(event.getNewIndex(), (WorkSequence) event.getNewValue());
			}
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityType == event.getAffectedEditor()) {
			processPlanningTemplate.setVariabilityType((VariabilityType)event.getNewValue());
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityBasedOnElement == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				variabilityBasedOnElementSettings.setToReference((VariabilityElement)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, variabilityBasedOnElementSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.useKind == event.getAffectedEditor()) {
			processPlanningTemplate.setUseKind((ActivityUseKind)event.getNewValue());
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.usedActivity == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				usedActivitySettings.setToReference((Activity)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Activity eObject = SpemFactory.eINSTANCE.createActivity();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				usedActivitySettings.setToReference(eObject);
			}
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.suppressedBreakdownElement == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof BreakdownElement) {
					suppressedBreakdownElementSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				suppressedBreakdownElementSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				suppressedBreakdownElementSettings.move(event.getNewIndex(), (BreakdownElement) event.getNewValue());
			}
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.defaultContext == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				defaultContextSettings.setToReference((MethodConfiguration)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				MethodConfiguration eObject = SpemFactory.eINSTANCE.createMethodConfiguration();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				defaultContextSettings.setToReference(eObject);
			}
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.validContext == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof MethodConfiguration) {
					validContextSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				validContextSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				validContextSettings.move(event.getNewIndex(), (MethodConfiguration) event.getNewValue());
			}
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.scope == event.getAffectedEditor()) {
			processPlanningTemplate.setScope((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.usageNote == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				processPlanningTemplate.getUsageNote().clear();
				processPlanningTemplate.getUsageNote().addAll(((List) event.getNewValue()));
			}
		}
		if (UmaViewsRepository.ProcessPlanningTemplate.Properties.baseProcess == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Process) {
					baseProcessSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				baseProcessSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				baseProcessSettings.move(event.getNewIndex(), (Process) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ProcessPlanningTemplatePropertiesEditionPart basePart = (ProcessPlanningTemplatePropertiesEditionPart)editingPart;
			if (SpemPackage.eINSTANCE.getWorkDefinition_PreCondition().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.preCondition)) {
				basePart.setPreCondition(((ProcessPlanningTemplate)semanticObject).getPreCondition());
			}
			
			if (SpemPackage.eINSTANCE.getWorkDefinition_PostCondition().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.postCondition)) {
				basePart.setPostCondition(((ProcessPlanningTemplate)semanticObject).getPostCondition());
			}
			
			if (SpemPackage.eINSTANCE.getExtensibleElement_Kind().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.kind))
				basePart.setKind((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getDescribableElement_PresentationName().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.presentationName)) {
				if (msg.getNewValue() != null) {
					basePart.setPresentationName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPresentationName("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.briefDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setBriefDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setBriefDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_MainDescription().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.mainDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setMainDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setMainDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Purpose().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.purpose)) {
				if (msg.getNewValue() != null) {
					basePart.setPurpose(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPurpose("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Guidance().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.guidance))
				basePart.updateGuidance();
			if (SpemPackage.eINSTANCE.getDescribableElement_Metric().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.metric))
				basePart.updateMetric();
			if (SpemPackage.eINSTANCE.getDescribableElement_Category().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.category))
				basePart.updateCategory();
			if (SpemPackage.eINSTANCE.getDescribableElement_Copyright().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.copyright)) {
				if (msg.getNewValue() != null) {
					basePart.setCopyright(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCopyright("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Author().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.author)) {
				basePart.setAuthor(((ProcessPlanningTemplate)semanticObject).getAuthor());
			}
			
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDate)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setChangeDate("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setChangeDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Version().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.version)) {
				if (msg.getNewValue() != null) {
					basePart.setVersion(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setVersion("");
				}
			}
			if (SpemPackage.eINSTANCE.getProcessPackageableElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.hasMultipleOccurrences))
				basePart.setHasMultipleOccurrences((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.isOptional))
				basePart.setIsOptional((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.isPlanned))
				basePart.setIsPlanned((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_IsRepeatable().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.isRepeatable))
				basePart.setIsRepeatable((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_IsOngoing().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.isOngoing))
				basePart.setIsOngoing((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_IsEventDriven().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.isEventDriven))
				basePart.setIsEventDriven((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToPredecessor().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToPredecessor))
				basePart.updateLinkToPredecessor();
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToSuccessor().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToSuccessor))
				basePart.updateLinkToSuccessor();
			if (SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().equals(msg.getFeature()) && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityType))
				basePart.setVariabilityType((Enumerator)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityBasedOnElement))
				basePart.setVariabilityBasedOnElement((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getActivity_UseKind().equals(msg.getFeature()) && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.useKind))
				basePart.setUseKind((Enumerator)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getActivity_UsedActivity().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.usedActivity))
				basePart.setUsedActivity((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getActivity_SuppressedBreakdownElement().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.suppressedBreakdownElement))
				basePart.updateSuppressedBreakdownElement();
			if (SpemPackage.eINSTANCE.getActivity_DefaultContext().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.defaultContext))
				basePart.setDefaultContext((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getActivity_ValidContext().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.validContext))
				basePart.updateValidContext();
			if (UmaPackage.eINSTANCE.getProcess_Scope().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.scope)) {
				if (msg.getNewValue() != null) {
					basePart.setScope(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setScope("");
				}
			}
			if (UmaPackage.eINSTANCE.getProcess_UsageNote().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.usageNote)) {
				basePart.setUsageNote(((ProcessPlanningTemplate)semanticObject).getUsageNote());
			}
			
			if (UmaPackage.eINSTANCE.getProcessPlanningTemplate_BaseProcess().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.ProcessPlanningTemplate.Properties.baseProcess))
				basePart.updateBaseProcess();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == UmaViewsRepository.ProcessPlanningTemplate.Properties.hasMultipleOccurrences || key == UmaViewsRepository.ProcessPlanningTemplate.Properties.isOptional || key == UmaViewsRepository.ProcessPlanningTemplate.Properties.isPlanned || key == UmaViewsRepository.ProcessPlanningTemplate.Properties.isRepeatable || key == UmaViewsRepository.ProcessPlanningTemplate.Properties.isOngoing || key == UmaViewsRepository.ProcessPlanningTemplate.Properties.isEventDriven || key == UmaViewsRepository.ProcessPlanningTemplate.Properties.useKind;
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
				if (UmaViewsRepository.ProcessPlanningTemplate.Properties.preCondition == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkDefinition_PreCondition().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (UmaViewsRepository.ProcessPlanningTemplate.Properties.postCondition == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkDefinition_PostCondition().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (UmaViewsRepository.ProcessPlanningTemplate.Properties.presentationName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.ProcessPlanningTemplate.Properties.briefDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.ProcessPlanningTemplate.Properties.mainDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.ProcessPlanningTemplate.Properties.purpose == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.ProcessPlanningTemplate.Properties.copyright == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.ProcessPlanningTemplate.Properties.author == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Author().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.ProcessPlanningTemplate.Properties.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.ProcessPlanningTemplate.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getProcessPackageableElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getProcessPackageableElement_Name().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.ProcessPlanningTemplate.Properties.hasMultipleOccurrences == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.ProcessPlanningTemplate.Properties.isOptional == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.ProcessPlanningTemplate.Properties.isPlanned == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.ProcessPlanningTemplate.Properties.isRepeatable == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsRepeatable().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsRepeatable().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.ProcessPlanningTemplate.Properties.isOngoing == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsOngoing().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsOngoing().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.ProcessPlanningTemplate.Properties.isEventDriven == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsEventDriven().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsEventDriven().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.ProcessPlanningTemplate.Properties.useKind == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getActivity_UseKind().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getActivity_UseKind().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.ProcessPlanningTemplate.Properties.scope == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(UmaPackage.eINSTANCE.getProcess_Scope().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(UmaPackage.eINSTANCE.getProcess_Scope().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.ProcessPlanningTemplate.Properties.usageNote == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(UmaPackage.eINSTANCE.getProcess_UsageNote().getEAttributeType(), iterator.next()));
					}
					ret = chain;
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
