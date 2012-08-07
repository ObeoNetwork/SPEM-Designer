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
import org.eclipse.emf.common.util.WrappedException;
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
import org.obeonetwork.dsl.spem.Qualification;
import org.obeonetwork.dsl.spem.SpemFactory;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.Step;
import org.obeonetwork.dsl.spem.TaskDefinition;
import org.obeonetwork.dsl.spem.TaskUse;
import org.obeonetwork.dsl.spem.WorkSequence;
import org.obeonetwork.dsl.spem.parts.SpemViewsRepository;
import org.obeonetwork.dsl.spem.parts.TaskUsePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class TaskUsePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for task EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings taskSettings;
	
	/**
	 * Settings for usedQualification ReferencesTable
	 */
	private	ReferencesTableSettings usedQualificationSettings;
	
	/**
	 * Settings for selectedStep ReferencesTable
	 */
	private	ReferencesTableSettings selectedStepSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public TaskUsePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject taskUse, String editing_mode) {
		super(editingContext, taskUse, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SpemViewsRepository.class;
		partKey = SpemViewsRepository.TaskUse.class;
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
			final TaskUse taskUse = (TaskUse)elt;
			final TaskUsePropertiesEditionPart basePart = (TaskUsePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SpemViewsRepository.TaskUse.Properties.kind)) {
				// init part
				kindSettings = new EObjectFlatComboSettings(taskUse, SpemPackage.eINSTANCE.getExtensibleElement_Kind());
				basePart.initKind(kindSettings);
				// set the button mode
				basePart.setKindButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (taskUse.getPresentationName() != null && isAccessible(SpemViewsRepository.TaskUse.Properties.presentationName))
				basePart.setPresentationName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), taskUse.getPresentationName()));
			
			if (taskUse.getBriefDescription() != null && isAccessible(SpemViewsRepository.TaskUse.Properties.briefDescription))
				basePart.setBriefDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), taskUse.getBriefDescription()));
			
			if (taskUse.getMainDescription() != null && isAccessible(SpemViewsRepository.TaskUse.Properties.mainDescription))
				basePart.setMainDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), taskUse.getMainDescription()));
			
			if (taskUse.getPurpose() != null && isAccessible(SpemViewsRepository.TaskUse.Properties.purpose))
				basePart.setPurpose(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), taskUse.getPurpose()));
			
			if (isAccessible(SpemViewsRepository.TaskUse.Properties.guidance)) {
				guidanceSettings = new ReferencesTableSettings(taskUse, SpemPackage.eINSTANCE.getDescribableElement_Guidance());
				basePart.initGuidance(guidanceSettings);
			}
			if (isAccessible(SpemViewsRepository.TaskUse.Properties.metric)) {
				metricSettings = new ReferencesTableSettings(taskUse, SpemPackage.eINSTANCE.getDescribableElement_Metric());
				basePart.initMetric(metricSettings);
			}
			if (isAccessible(SpemViewsRepository.TaskUse.Properties.category)) {
				categorySettings = new ReferencesTableSettings(taskUse, SpemPackage.eINSTANCE.getDescribableElement_Category());
				basePart.initCategory(categorySettings);
			}
			if (taskUse.getCopyright() != null && isAccessible(SpemViewsRepository.TaskUse.Properties.copyright))
				basePart.setCopyright(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), taskUse.getCopyright()));
			
			if (taskUse.getAuthor() != null && isAccessible(SpemViewsRepository.TaskUse.Properties.author))
				basePart.setAuthor(taskUse.getAuthor());
			
			if (taskUse.getChangeDate() != null && isAccessible(SpemViewsRepository.TaskUse.Properties.changeDate))
				basePart.setChangeDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), taskUse.getChangeDate()));
			
			if (taskUse.getChangeDescription() != null && isAccessible(SpemViewsRepository.TaskUse.Properties.changeDescription))
				basePart.setChangeDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), taskUse.getChangeDescription()));
			
			if (taskUse.getVersion() != null && isAccessible(SpemViewsRepository.TaskUse.Properties.version))
				basePart.setVersion(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), taskUse.getVersion()));
			
			if (taskUse.getName() != null && isAccessible(SpemViewsRepository.TaskUse.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), taskUse.getName()));
			
			if (isAccessible(SpemViewsRepository.TaskUse.Properties.hasMultipleOccurrences)) {
				basePart.setHasMultipleOccurrences(taskUse.isHasMultipleOccurrences());
			}
			if (isAccessible(SpemViewsRepository.TaskUse.Properties.isOptional)) {
				basePart.setIsOptional(taskUse.isIsOptional());
			}
			if (isAccessible(SpemViewsRepository.TaskUse.Properties.isPlanned)) {
				basePart.setIsPlanned(taskUse.isIsPlanned());
			}
			if (isAccessible(SpemViewsRepository.TaskUse.Properties.isSynchronizedWithSource)) {
				basePart.setIsSynchronizedWithSource(taskUse.isIsSynchronizedWithSource());
			}
			if (isAccessible(SpemViewsRepository.TaskUse.Properties.isRepeatable)) {
				basePart.setIsRepeatable(taskUse.isIsRepeatable());
			}
			if (isAccessible(SpemViewsRepository.TaskUse.Properties.isOngoing)) {
				basePart.setIsOngoing(taskUse.isIsOngoing());
			}
			if (isAccessible(SpemViewsRepository.TaskUse.Properties.isEventDriven)) {
				basePart.setIsEventDriven(taskUse.isIsEventDriven());
			}
			if (isAccessible(SpemViewsRepository.TaskUse.Properties.linkToPredecessor)) {
				linkToPredecessorSettings = new ReferencesTableSettings(taskUse, SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToPredecessor());
				basePart.initLinkToPredecessor(linkToPredecessorSettings);
			}
			if (isAccessible(SpemViewsRepository.TaskUse.Properties.linkToSuccessor)) {
				linkToSuccessorSettings = new ReferencesTableSettings(taskUse, SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToSuccessor());
				basePart.initLinkToSuccessor(linkToSuccessorSettings);
			}
			if (isAccessible(SpemViewsRepository.TaskUse.Properties.task)) {
				// init part
				taskSettings = new EObjectFlatComboSettings(taskUse, SpemPackage.eINSTANCE.getTaskUse_Task());
				basePart.initTask(taskSettings);
				// set the button mode
				basePart.setTaskButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SpemViewsRepository.TaskUse.Properties.usedQualification)) {
				usedQualificationSettings = new ReferencesTableSettings(taskUse, SpemPackage.eINSTANCE.getTaskUse_UsedQualification());
				basePart.initUsedQualification(usedQualificationSettings);
			}
			if (isAccessible(SpemViewsRepository.TaskUse.Properties.selectedStep)) {
				selectedStepSettings = new ReferencesTableSettings(taskUse, SpemPackage.eINSTANCE.getTaskUse_SelectedStep());
				basePart.initSelectedStep(selectedStepSettings);
			}
			if (taskUse.getPreCondition() != null && isAccessible(SpemViewsRepository.TaskUse.Properties.preCondition))
				basePart.setPreCondition(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), taskUse.getPreCondition()));
			
			if (taskUse.getPostCondition() != null && isAccessible(SpemViewsRepository.TaskUse.Properties.postCondition))
				basePart.setPostCondition(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), taskUse.getPostCondition()));
			
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
			
			basePart.addFilterToTask(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof TaskDefinition); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for task
			// End of user code
			
			basePart.addFilterToUsedQualification(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInUsedQualificationTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToUsedQualification(new EObjectFilter(SpemPackage.eINSTANCE.getQualification()));
			// Start of user code for additional businessfilters for usedQualification
			// End of user code
			
			basePart.addFilterToSelectedStep(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInSelectedStepTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToSelectedStep(new EObjectFilter(SpemPackage.eINSTANCE.getStep()));
			// Start of user code for additional businessfilters for selectedStep
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
		if (editorKey == SpemViewsRepository.TaskUse.Properties.kind) {
			return SpemPackage.eINSTANCE.getExtensibleElement_Kind();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.presentationName) {
			return SpemPackage.eINSTANCE.getDescribableElement_PresentationName();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.briefDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_BriefDescription();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.mainDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_MainDescription();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.purpose) {
			return SpemPackage.eINSTANCE.getDescribableElement_Purpose();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.guidance) {
			return SpemPackage.eINSTANCE.getDescribableElement_Guidance();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.metric) {
			return SpemPackage.eINSTANCE.getDescribableElement_Metric();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.category) {
			return SpemPackage.eINSTANCE.getDescribableElement_Category();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.copyright) {
			return SpemPackage.eINSTANCE.getDescribableElement_Copyright();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.author) {
			return SpemPackage.eINSTANCE.getDescribableElement_Author();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.changeDate) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDate();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.changeDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.version) {
			return SpemPackage.eINSTANCE.getDescribableElement_Version();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.name) {
			return SpemPackage.eINSTANCE.getProcessPackageableElement_Name();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.hasMultipleOccurrences) {
			return SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.isOptional) {
			return SpemPackage.eINSTANCE.getBreakdownElement_IsOptional();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.isPlanned) {
			return SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.isSynchronizedWithSource) {
			return SpemPackage.eINSTANCE.getMethodContentUse_IsSynchronizedWithSource();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.isRepeatable) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_IsRepeatable();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.isOngoing) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_IsOngoing();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.isEventDriven) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_IsEventDriven();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.linkToPredecessor) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToPredecessor();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.linkToSuccessor) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToSuccessor();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.task) {
			return SpemPackage.eINSTANCE.getTaskUse_Task();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.usedQualification) {
			return SpemPackage.eINSTANCE.getTaskUse_UsedQualification();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.selectedStep) {
			return SpemPackage.eINSTANCE.getTaskUse_SelectedStep();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.preCondition) {
			return SpemPackage.eINSTANCE.getTaskUse_PreCondition();
		}
		if (editorKey == SpemViewsRepository.TaskUse.Properties.postCondition) {
			return SpemPackage.eINSTANCE.getTaskUse_PostCondition();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TaskUse taskUse = (TaskUse)semanticObject;
		if (SpemViewsRepository.TaskUse.Properties.kind == event.getAffectedEditor()) {
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
		if (SpemViewsRepository.TaskUse.Properties.presentationName == event.getAffectedEditor()) {
			taskUse.setPresentationName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.TaskUse.Properties.briefDescription == event.getAffectedEditor()) {
			taskUse.setBriefDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.TaskUse.Properties.mainDescription == event.getAffectedEditor()) {
			taskUse.setMainDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.TaskUse.Properties.purpose == event.getAffectedEditor()) {
			taskUse.setPurpose((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.TaskUse.Properties.guidance == event.getAffectedEditor()) {
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
		if (SpemViewsRepository.TaskUse.Properties.metric == event.getAffectedEditor()) {
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
		if (SpemViewsRepository.TaskUse.Properties.category == event.getAffectedEditor()) {
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
		if (SpemViewsRepository.TaskUse.Properties.copyright == event.getAffectedEditor()) {
			taskUse.setCopyright((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.TaskUse.Properties.author == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				taskUse.getAuthor().clear();
				taskUse.getAuthor().addAll(((List) event.getNewValue()));
			}
		}
		if (SpemViewsRepository.TaskUse.Properties.changeDate == event.getAffectedEditor()) {
			taskUse.setChangeDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.TaskUse.Properties.changeDescription == event.getAffectedEditor()) {
			taskUse.setChangeDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.TaskUse.Properties.version == event.getAffectedEditor()) {
			taskUse.setVersion((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.TaskUse.Properties.name == event.getAffectedEditor()) {
			taskUse.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.TaskUse.Properties.hasMultipleOccurrences == event.getAffectedEditor()) {
			taskUse.setHasMultipleOccurrences((Boolean)event.getNewValue());
		}
		if (SpemViewsRepository.TaskUse.Properties.isOptional == event.getAffectedEditor()) {
			taskUse.setIsOptional((Boolean)event.getNewValue());
		}
		if (SpemViewsRepository.TaskUse.Properties.isPlanned == event.getAffectedEditor()) {
			taskUse.setIsPlanned((Boolean)event.getNewValue());
		}
		if (SpemViewsRepository.TaskUse.Properties.isSynchronizedWithSource == event.getAffectedEditor()) {
			taskUse.setIsSynchronizedWithSource((Boolean)event.getNewValue());
		}
		if (SpemViewsRepository.TaskUse.Properties.isRepeatable == event.getAffectedEditor()) {
			taskUse.setIsRepeatable((Boolean)event.getNewValue());
		}
		if (SpemViewsRepository.TaskUse.Properties.isOngoing == event.getAffectedEditor()) {
			taskUse.setIsOngoing((Boolean)event.getNewValue());
		}
		if (SpemViewsRepository.TaskUse.Properties.isEventDriven == event.getAffectedEditor()) {
			taskUse.setIsEventDriven((Boolean)event.getNewValue());
		}
		if (SpemViewsRepository.TaskUse.Properties.linkToPredecessor == event.getAffectedEditor()) {
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
		if (SpemViewsRepository.TaskUse.Properties.linkToSuccessor == event.getAffectedEditor()) {
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
		if (SpemViewsRepository.TaskUse.Properties.task == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				taskSettings.setToReference((TaskDefinition)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				TaskDefinition eObject = SpemFactory.eINSTANCE.createTaskDefinition();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				taskSettings.setToReference(eObject);
			}
		}
		if (SpemViewsRepository.TaskUse.Properties.usedQualification == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Qualification) {
					usedQualificationSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				usedQualificationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				usedQualificationSettings.move(event.getNewIndex(), (Qualification) event.getNewValue());
			}
		}
		if (SpemViewsRepository.TaskUse.Properties.selectedStep == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Step) {
					selectedStepSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				selectedStepSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				selectedStepSettings.move(event.getNewIndex(), (Step) event.getNewValue());
			}
		}
		if (SpemViewsRepository.TaskUse.Properties.preCondition == event.getAffectedEditor()) {
			taskUse.setPreCondition((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.TaskUse.Properties.postCondition == event.getAffectedEditor()) {
			taskUse.setPostCondition((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			TaskUsePropertiesEditionPart basePart = (TaskUsePropertiesEditionPart)editingPart;
			if (SpemPackage.eINSTANCE.getExtensibleElement_Kind().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.TaskUse.Properties.kind))
				basePart.setKind((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getDescribableElement_PresentationName().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.TaskUse.Properties.presentationName)) {
				if (msg.getNewValue() != null) {
					basePart.setPresentationName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPresentationName("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.TaskUse.Properties.briefDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setBriefDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setBriefDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_MainDescription().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.TaskUse.Properties.mainDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setMainDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setMainDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Purpose().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.TaskUse.Properties.purpose)) {
				if (msg.getNewValue() != null) {
					basePart.setPurpose(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPurpose("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Guidance().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.TaskUse.Properties.guidance))
				basePart.updateGuidance();
			if (SpemPackage.eINSTANCE.getDescribableElement_Metric().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.TaskUse.Properties.metric))
				basePart.updateMetric();
			if (SpemPackage.eINSTANCE.getDescribableElement_Category().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.TaskUse.Properties.category))
				basePart.updateCategory();
			if (SpemPackage.eINSTANCE.getDescribableElement_Copyright().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.TaskUse.Properties.copyright)) {
				if (msg.getNewValue() != null) {
					basePart.setCopyright(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCopyright("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Author().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.TaskUse.Properties.author)) {
				basePart.setAuthor(((TaskUse)semanticObject).getAuthor());
			}
			
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.TaskUse.Properties.changeDate)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setChangeDate("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.TaskUse.Properties.changeDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setChangeDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Version().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.TaskUse.Properties.version)) {
				if (msg.getNewValue() != null) {
					basePart.setVersion(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setVersion("");
				}
			}
			if (SpemPackage.eINSTANCE.getProcessPackageableElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.TaskUse.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.TaskUse.Properties.hasMultipleOccurrences))
				basePart.setHasMultipleOccurrences((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.TaskUse.Properties.isOptional))
				basePart.setIsOptional((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.TaskUse.Properties.isPlanned))
				basePart.setIsPlanned((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getMethodContentUse_IsSynchronizedWithSource().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.TaskUse.Properties.isSynchronizedWithSource))
				basePart.setIsSynchronizedWithSource((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_IsRepeatable().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.TaskUse.Properties.isRepeatable))
				basePart.setIsRepeatable((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_IsOngoing().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.TaskUse.Properties.isOngoing))
				basePart.setIsOngoing((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_IsEventDriven().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.TaskUse.Properties.isEventDriven))
				basePart.setIsEventDriven((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToPredecessor().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.TaskUse.Properties.linkToPredecessor))
				basePart.updateLinkToPredecessor();
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToSuccessor().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.TaskUse.Properties.linkToSuccessor))
				basePart.updateLinkToSuccessor();
			if (SpemPackage.eINSTANCE.getTaskUse_Task().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.TaskUse.Properties.task))
				basePart.setTask((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getTaskUse_UsedQualification().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.TaskUse.Properties.usedQualification))
				basePart.updateUsedQualification();
			if (SpemPackage.eINSTANCE.getTaskUse_SelectedStep().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.TaskUse.Properties.selectedStep))
				basePart.updateSelectedStep();
			if (SpemPackage.eINSTANCE.getTaskUse_PreCondition().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.TaskUse.Properties.preCondition)) {
				if (msg.getNewValue() != null) {
					basePart.setPreCondition(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPreCondition("");
				}
			}
			if (SpemPackage.eINSTANCE.getTaskUse_PostCondition().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.TaskUse.Properties.postCondition)) {
				if (msg.getNewValue() != null) {
					basePart.setPostCondition(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPostCondition("");
				}
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
		return key == SpemViewsRepository.TaskUse.Properties.hasMultipleOccurrences || key == SpemViewsRepository.TaskUse.Properties.isOptional || key == SpemViewsRepository.TaskUse.Properties.isPlanned || key == SpemViewsRepository.TaskUse.Properties.isRepeatable || key == SpemViewsRepository.TaskUse.Properties.isOngoing || key == SpemViewsRepository.TaskUse.Properties.isEventDriven;
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
				if (SpemViewsRepository.TaskUse.Properties.presentationName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.TaskUse.Properties.briefDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.TaskUse.Properties.mainDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.TaskUse.Properties.purpose == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.TaskUse.Properties.copyright == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.TaskUse.Properties.author == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Author().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (SpemViewsRepository.TaskUse.Properties.changeDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.TaskUse.Properties.changeDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.TaskUse.Properties.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.TaskUse.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getProcessPackageableElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getProcessPackageableElement_Name().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.TaskUse.Properties.hasMultipleOccurrences == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.TaskUse.Properties.isOptional == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.TaskUse.Properties.isPlanned == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.TaskUse.Properties.isSynchronizedWithSource == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getMethodContentUse_IsSynchronizedWithSource().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getMethodContentUse_IsSynchronizedWithSource().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.TaskUse.Properties.isRepeatable == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsRepeatable().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsRepeatable().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.TaskUse.Properties.isOngoing == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsOngoing().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsOngoing().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.TaskUse.Properties.isEventDriven == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsEventDriven().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsEventDriven().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.TaskUse.Properties.preCondition == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getTaskUse_PreCondition().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getTaskUse_PreCondition().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.TaskUse.Properties.postCondition == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getTaskUse_PostCondition().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getTaskUse_PostCondition().getEAttributeType(), newValue);
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
