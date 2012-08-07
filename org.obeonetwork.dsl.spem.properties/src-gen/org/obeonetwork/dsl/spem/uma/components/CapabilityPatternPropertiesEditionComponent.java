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
import org.obeonetwork.dsl.spem.uma.CapabilityPattern;
import org.obeonetwork.dsl.spem.uma.UmaPackage;
import org.obeonetwork.dsl.spem.uma.parts.CapabilityPatternPropertiesEditionPart;
import org.obeonetwork.dsl.spem.uma.parts.UmaViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class CapabilityPatternPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Default constructor
	 * 
	 */
	public CapabilityPatternPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject capabilityPattern, String editing_mode) {
		super(editingContext, capabilityPattern, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = UmaViewsRepository.class;
		partKey = UmaViewsRepository.CapabilityPattern.class;
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
			final CapabilityPattern capabilityPattern = (CapabilityPattern)elt;
			final CapabilityPatternPropertiesEditionPart basePart = (CapabilityPatternPropertiesEditionPart)editingPart;
			// init values
			if (capabilityPattern.getPreCondition() != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.preCondition))
				basePart.setPreCondition(capabilityPattern.getPreCondition());
			
			if (capabilityPattern.getPostCondition() != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.postCondition))
				basePart.setPostCondition(capabilityPattern.getPostCondition());
			
			if (isAccessible(UmaViewsRepository.CapabilityPattern.Properties.kind)) {
				// init part
				kindSettings = new EObjectFlatComboSettings(capabilityPattern, SpemPackage.eINSTANCE.getExtensibleElement_Kind());
				basePart.initKind(kindSettings);
				// set the button mode
				basePart.setKindButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (capabilityPattern.getPresentationName() != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.presentationName))
				basePart.setPresentationName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), capabilityPattern.getPresentationName()));
			
			if (capabilityPattern.getBriefDescription() != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.briefDescription))
				basePart.setBriefDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), capabilityPattern.getBriefDescription()));
			
			if (capabilityPattern.getMainDescription() != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.mainDescription))
				basePart.setMainDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), capabilityPattern.getMainDescription()));
			
			if (capabilityPattern.getPurpose() != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.purpose))
				basePart.setPurpose(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), capabilityPattern.getPurpose()));
			
			if (isAccessible(UmaViewsRepository.CapabilityPattern.Properties.guidance)) {
				guidanceSettings = new ReferencesTableSettings(capabilityPattern, SpemPackage.eINSTANCE.getDescribableElement_Guidance());
				basePart.initGuidance(guidanceSettings);
			}
			if (isAccessible(UmaViewsRepository.CapabilityPattern.Properties.metric)) {
				metricSettings = new ReferencesTableSettings(capabilityPattern, SpemPackage.eINSTANCE.getDescribableElement_Metric());
				basePart.initMetric(metricSettings);
			}
			if (isAccessible(UmaViewsRepository.CapabilityPattern.Properties.category)) {
				categorySettings = new ReferencesTableSettings(capabilityPattern, SpemPackage.eINSTANCE.getDescribableElement_Category());
				basePart.initCategory(categorySettings);
			}
			if (capabilityPattern.getCopyright() != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.copyright))
				basePart.setCopyright(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), capabilityPattern.getCopyright()));
			
			if (capabilityPattern.getAuthor() != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.author))
				basePart.setAuthor(capabilityPattern.getAuthor());
			
			if (capabilityPattern.getChangeDate() != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.changeDate))
				basePart.setChangeDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), capabilityPattern.getChangeDate()));
			
			if (capabilityPattern.getChangeDescription() != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.changeDescription))
				basePart.setChangeDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), capabilityPattern.getChangeDescription()));
			
			if (capabilityPattern.getVersion() != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.version))
				basePart.setVersion(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), capabilityPattern.getVersion()));
			
			if (capabilityPattern.getName() != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), capabilityPattern.getName()));
			
			if (isAccessible(UmaViewsRepository.CapabilityPattern.Properties.hasMultipleOccurrences)) {
				basePart.setHasMultipleOccurrences(capabilityPattern.isHasMultipleOccurrences());
			}
			if (isAccessible(UmaViewsRepository.CapabilityPattern.Properties.isOptional)) {
				basePart.setIsOptional(capabilityPattern.isIsOptional());
			}
			if (isAccessible(UmaViewsRepository.CapabilityPattern.Properties.isPlanned)) {
				basePart.setIsPlanned(capabilityPattern.isIsPlanned());
			}
			if (isAccessible(UmaViewsRepository.CapabilityPattern.Properties.isRepeatable)) {
				basePart.setIsRepeatable(capabilityPattern.isIsRepeatable());
			}
			if (isAccessible(UmaViewsRepository.CapabilityPattern.Properties.isOngoing)) {
				basePart.setIsOngoing(capabilityPattern.isIsOngoing());
			}
			if (isAccessible(UmaViewsRepository.CapabilityPattern.Properties.isEventDriven)) {
				basePart.setIsEventDriven(capabilityPattern.isIsEventDriven());
			}
			if (isAccessible(UmaViewsRepository.CapabilityPattern.Properties.linkToPredecessor)) {
				linkToPredecessorSettings = new ReferencesTableSettings(capabilityPattern, SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToPredecessor());
				basePart.initLinkToPredecessor(linkToPredecessorSettings);
			}
			if (isAccessible(UmaViewsRepository.CapabilityPattern.Properties.linkToSuccessor)) {
				linkToSuccessorSettings = new ReferencesTableSettings(capabilityPattern, SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToSuccessor());
				basePart.initLinkToSuccessor(linkToSuccessorSettings);
			}
			if (isAccessible(UmaViewsRepository.CapabilityPattern.Properties.variabilityType)) {
				basePart.initVariabilityType((EEnum) SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().getEType(), capabilityPattern.getVariabilityType());
			}
			if (isAccessible(UmaViewsRepository.CapabilityPattern.Properties.variabilityBasedOnElement)) {
				// init part
				variabilityBasedOnElementSettings = new EObjectFlatComboSettings(capabilityPattern, SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement());
				basePart.initVariabilityBasedOnElement(variabilityBasedOnElementSettings);
				// set the button mode
				basePart.setVariabilityBasedOnElementButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(UmaViewsRepository.CapabilityPattern.Properties.useKind)) {
				basePart.initUseKind((EEnum) SpemPackage.eINSTANCE.getActivity_UseKind().getEType(), capabilityPattern.getUseKind());
			}
			if (isAccessible(UmaViewsRepository.CapabilityPattern.Properties.usedActivity)) {
				// init part
				usedActivitySettings = new EObjectFlatComboSettings(capabilityPattern, SpemPackage.eINSTANCE.getActivity_UsedActivity());
				basePart.initUsedActivity(usedActivitySettings);
				// set the button mode
				basePart.setUsedActivityButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(UmaViewsRepository.CapabilityPattern.Properties.suppressedBreakdownElement)) {
				suppressedBreakdownElementSettings = new ReferencesTableSettings(capabilityPattern, SpemPackage.eINSTANCE.getActivity_SuppressedBreakdownElement());
				basePart.initSuppressedBreakdownElement(suppressedBreakdownElementSettings);
			}
			if (isAccessible(UmaViewsRepository.CapabilityPattern.Properties.defaultContext)) {
				// init part
				defaultContextSettings = new EObjectFlatComboSettings(capabilityPattern, SpemPackage.eINSTANCE.getActivity_DefaultContext());
				basePart.initDefaultContext(defaultContextSettings);
				// set the button mode
				basePart.setDefaultContextButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(UmaViewsRepository.CapabilityPattern.Properties.validContext)) {
				validContextSettings = new ReferencesTableSettings(capabilityPattern, SpemPackage.eINSTANCE.getActivity_ValidContext());
				basePart.initValidContext(validContextSettings);
			}
			if (capabilityPattern.getScope() != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.scope))
				basePart.setScope(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), capabilityPattern.getScope()));
			
			if (capabilityPattern.getUsageNote() != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.usageNote))
				basePart.setUsageNote(capabilityPattern.getUsageNote());
			
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
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.preCondition) {
			return SpemPackage.eINSTANCE.getWorkDefinition_PreCondition();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.postCondition) {
			return SpemPackage.eINSTANCE.getWorkDefinition_PostCondition();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.kind) {
			return SpemPackage.eINSTANCE.getExtensibleElement_Kind();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.presentationName) {
			return SpemPackage.eINSTANCE.getDescribableElement_PresentationName();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.briefDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_BriefDescription();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.mainDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_MainDescription();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.purpose) {
			return SpemPackage.eINSTANCE.getDescribableElement_Purpose();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.guidance) {
			return SpemPackage.eINSTANCE.getDescribableElement_Guidance();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.metric) {
			return SpemPackage.eINSTANCE.getDescribableElement_Metric();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.category) {
			return SpemPackage.eINSTANCE.getDescribableElement_Category();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.copyright) {
			return SpemPackage.eINSTANCE.getDescribableElement_Copyright();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.author) {
			return SpemPackage.eINSTANCE.getDescribableElement_Author();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.changeDate) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDate();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.changeDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.version) {
			return SpemPackage.eINSTANCE.getDescribableElement_Version();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.name) {
			return SpemPackage.eINSTANCE.getProcessPackageableElement_Name();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.hasMultipleOccurrences) {
			return SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.isOptional) {
			return SpemPackage.eINSTANCE.getBreakdownElement_IsOptional();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.isPlanned) {
			return SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.isRepeatable) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_IsRepeatable();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.isOngoing) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_IsOngoing();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.isEventDriven) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_IsEventDriven();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.linkToPredecessor) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToPredecessor();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.linkToSuccessor) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToSuccessor();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.variabilityType) {
			return SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.variabilityBasedOnElement) {
			return SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.useKind) {
			return SpemPackage.eINSTANCE.getActivity_UseKind();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.usedActivity) {
			return SpemPackage.eINSTANCE.getActivity_UsedActivity();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.suppressedBreakdownElement) {
			return SpemPackage.eINSTANCE.getActivity_SuppressedBreakdownElement();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.defaultContext) {
			return SpemPackage.eINSTANCE.getActivity_DefaultContext();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.validContext) {
			return SpemPackage.eINSTANCE.getActivity_ValidContext();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.scope) {
			return UmaPackage.eINSTANCE.getProcess_Scope();
		}
		if (editorKey == UmaViewsRepository.CapabilityPattern.Properties.usageNote) {
			return UmaPackage.eINSTANCE.getProcess_UsageNote();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		CapabilityPattern capabilityPattern = (CapabilityPattern)semanticObject;
		if (UmaViewsRepository.CapabilityPattern.Properties.preCondition == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				capabilityPattern.getPreCondition().clear();
				capabilityPattern.getPreCondition().addAll(((List) event.getNewValue()));
			}
		}
		if (UmaViewsRepository.CapabilityPattern.Properties.postCondition == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				capabilityPattern.getPostCondition().clear();
				capabilityPattern.getPostCondition().addAll(((List) event.getNewValue()));
			}
		}
		if (UmaViewsRepository.CapabilityPattern.Properties.kind == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.CapabilityPattern.Properties.presentationName == event.getAffectedEditor()) {
			capabilityPattern.setPresentationName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.CapabilityPattern.Properties.briefDescription == event.getAffectedEditor()) {
			capabilityPattern.setBriefDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.CapabilityPattern.Properties.mainDescription == event.getAffectedEditor()) {
			capabilityPattern.setMainDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.CapabilityPattern.Properties.purpose == event.getAffectedEditor()) {
			capabilityPattern.setPurpose((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.CapabilityPattern.Properties.guidance == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.CapabilityPattern.Properties.metric == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.CapabilityPattern.Properties.category == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.CapabilityPattern.Properties.copyright == event.getAffectedEditor()) {
			capabilityPattern.setCopyright((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.CapabilityPattern.Properties.author == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				capabilityPattern.getAuthor().clear();
				capabilityPattern.getAuthor().addAll(((List) event.getNewValue()));
			}
		}
		if (UmaViewsRepository.CapabilityPattern.Properties.changeDate == event.getAffectedEditor()) {
			capabilityPattern.setChangeDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.CapabilityPattern.Properties.changeDescription == event.getAffectedEditor()) {
			capabilityPattern.setChangeDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.CapabilityPattern.Properties.version == event.getAffectedEditor()) {
			capabilityPattern.setVersion((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.CapabilityPattern.Properties.name == event.getAffectedEditor()) {
			capabilityPattern.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.CapabilityPattern.Properties.hasMultipleOccurrences == event.getAffectedEditor()) {
			capabilityPattern.setHasMultipleOccurrences((Boolean)event.getNewValue());
		}
		if (UmaViewsRepository.CapabilityPattern.Properties.isOptional == event.getAffectedEditor()) {
			capabilityPattern.setIsOptional((Boolean)event.getNewValue());
		}
		if (UmaViewsRepository.CapabilityPattern.Properties.isPlanned == event.getAffectedEditor()) {
			capabilityPattern.setIsPlanned((Boolean)event.getNewValue());
		}
		if (UmaViewsRepository.CapabilityPattern.Properties.isRepeatable == event.getAffectedEditor()) {
			capabilityPattern.setIsRepeatable((Boolean)event.getNewValue());
		}
		if (UmaViewsRepository.CapabilityPattern.Properties.isOngoing == event.getAffectedEditor()) {
			capabilityPattern.setIsOngoing((Boolean)event.getNewValue());
		}
		if (UmaViewsRepository.CapabilityPattern.Properties.isEventDriven == event.getAffectedEditor()) {
			capabilityPattern.setIsEventDriven((Boolean)event.getNewValue());
		}
		if (UmaViewsRepository.CapabilityPattern.Properties.linkToPredecessor == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.CapabilityPattern.Properties.linkToSuccessor == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.CapabilityPattern.Properties.variabilityType == event.getAffectedEditor()) {
			capabilityPattern.setVariabilityType((VariabilityType)event.getNewValue());
		}
		if (UmaViewsRepository.CapabilityPattern.Properties.variabilityBasedOnElement == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.CapabilityPattern.Properties.useKind == event.getAffectedEditor()) {
			capabilityPattern.setUseKind((ActivityUseKind)event.getNewValue());
		}
		if (UmaViewsRepository.CapabilityPattern.Properties.usedActivity == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.CapabilityPattern.Properties.suppressedBreakdownElement == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.CapabilityPattern.Properties.defaultContext == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.CapabilityPattern.Properties.validContext == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.CapabilityPattern.Properties.scope == event.getAffectedEditor()) {
			capabilityPattern.setScope((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.CapabilityPattern.Properties.usageNote == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				capabilityPattern.getUsageNote().clear();
				capabilityPattern.getUsageNote().addAll(((List) event.getNewValue()));
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			CapabilityPatternPropertiesEditionPart basePart = (CapabilityPatternPropertiesEditionPart)editingPart;
			if (SpemPackage.eINSTANCE.getWorkDefinition_PreCondition().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.preCondition)) {
				basePart.setPreCondition(((CapabilityPattern)semanticObject).getPreCondition());
			}
			
			if (SpemPackage.eINSTANCE.getWorkDefinition_PostCondition().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.postCondition)) {
				basePart.setPostCondition(((CapabilityPattern)semanticObject).getPostCondition());
			}
			
			if (SpemPackage.eINSTANCE.getExtensibleElement_Kind().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.kind))
				basePart.setKind((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getDescribableElement_PresentationName().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.presentationName)) {
				if (msg.getNewValue() != null) {
					basePart.setPresentationName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPresentationName("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.briefDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setBriefDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setBriefDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_MainDescription().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.mainDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setMainDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setMainDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Purpose().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.purpose)) {
				if (msg.getNewValue() != null) {
					basePart.setPurpose(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPurpose("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Guidance().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.guidance))
				basePart.updateGuidance();
			if (SpemPackage.eINSTANCE.getDescribableElement_Metric().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.metric))
				basePart.updateMetric();
			if (SpemPackage.eINSTANCE.getDescribableElement_Category().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.category))
				basePart.updateCategory();
			if (SpemPackage.eINSTANCE.getDescribableElement_Copyright().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.copyright)) {
				if (msg.getNewValue() != null) {
					basePart.setCopyright(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCopyright("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Author().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.author)) {
				basePart.setAuthor(((CapabilityPattern)semanticObject).getAuthor());
			}
			
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.changeDate)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setChangeDate("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.changeDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setChangeDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Version().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.version)) {
				if (msg.getNewValue() != null) {
					basePart.setVersion(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setVersion("");
				}
			}
			if (SpemPackage.eINSTANCE.getProcessPackageableElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.hasMultipleOccurrences))
				basePart.setHasMultipleOccurrences((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.isOptional))
				basePart.setIsOptional((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.isPlanned))
				basePart.setIsPlanned((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_IsRepeatable().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.isRepeatable))
				basePart.setIsRepeatable((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_IsOngoing().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.isOngoing))
				basePart.setIsOngoing((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_IsEventDriven().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.isEventDriven))
				basePart.setIsEventDriven((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToPredecessor().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.linkToPredecessor))
				basePart.updateLinkToPredecessor();
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToSuccessor().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.linkToSuccessor))
				basePart.updateLinkToSuccessor();
			if (SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().equals(msg.getFeature()) && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.variabilityType))
				basePart.setVariabilityType((Enumerator)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.variabilityBasedOnElement))
				basePart.setVariabilityBasedOnElement((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getActivity_UseKind().equals(msg.getFeature()) && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.useKind))
				basePart.setUseKind((Enumerator)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getActivity_UsedActivity().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.usedActivity))
				basePart.setUsedActivity((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getActivity_SuppressedBreakdownElement().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.suppressedBreakdownElement))
				basePart.updateSuppressedBreakdownElement();
			if (SpemPackage.eINSTANCE.getActivity_DefaultContext().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.defaultContext))
				basePart.setDefaultContext((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getActivity_ValidContext().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.validContext))
				basePart.updateValidContext();
			if (UmaPackage.eINSTANCE.getProcess_Scope().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.scope)) {
				if (msg.getNewValue() != null) {
					basePart.setScope(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setScope("");
				}
			}
			if (UmaPackage.eINSTANCE.getProcess_UsageNote().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.CapabilityPattern.Properties.usageNote)) {
				basePart.setUsageNote(((CapabilityPattern)semanticObject).getUsageNote());
			}
			
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == UmaViewsRepository.CapabilityPattern.Properties.hasMultipleOccurrences || key == UmaViewsRepository.CapabilityPattern.Properties.isOptional || key == UmaViewsRepository.CapabilityPattern.Properties.isPlanned || key == UmaViewsRepository.CapabilityPattern.Properties.isRepeatable || key == UmaViewsRepository.CapabilityPattern.Properties.isOngoing || key == UmaViewsRepository.CapabilityPattern.Properties.isEventDriven || key == UmaViewsRepository.CapabilityPattern.Properties.useKind;
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
				if (UmaViewsRepository.CapabilityPattern.Properties.preCondition == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkDefinition_PreCondition().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (UmaViewsRepository.CapabilityPattern.Properties.postCondition == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkDefinition_PostCondition().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (UmaViewsRepository.CapabilityPattern.Properties.presentationName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.CapabilityPattern.Properties.briefDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.CapabilityPattern.Properties.mainDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.CapabilityPattern.Properties.purpose == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.CapabilityPattern.Properties.copyright == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.CapabilityPattern.Properties.author == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Author().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (UmaViewsRepository.CapabilityPattern.Properties.changeDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.CapabilityPattern.Properties.changeDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.CapabilityPattern.Properties.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.CapabilityPattern.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getProcessPackageableElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getProcessPackageableElement_Name().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.CapabilityPattern.Properties.hasMultipleOccurrences == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.CapabilityPattern.Properties.isOptional == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.CapabilityPattern.Properties.isPlanned == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.CapabilityPattern.Properties.isRepeatable == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsRepeatable().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsRepeatable().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.CapabilityPattern.Properties.isOngoing == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsOngoing().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsOngoing().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.CapabilityPattern.Properties.isEventDriven == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsEventDriven().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsEventDriven().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.CapabilityPattern.Properties.variabilityType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.CapabilityPattern.Properties.useKind == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getActivity_UseKind().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getActivity_UseKind().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.CapabilityPattern.Properties.scope == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(UmaPackage.eINSTANCE.getProcess_Scope().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(UmaPackage.eINSTANCE.getProcess_Scope().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.CapabilityPattern.Properties.usageNote == event.getAffectedEditor()) {
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
