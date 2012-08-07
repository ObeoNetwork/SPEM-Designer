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
import org.obeonetwork.dsl.spem.SpemFactory;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.WorkProductRelationshipKind;
import org.obeonetwork.dsl.spem.WorkProductUse;
import org.obeonetwork.dsl.spem.WorkProductUseRelationship;
import org.obeonetwork.dsl.spem.parts.SpemViewsRepository;
import org.obeonetwork.dsl.spem.parts.WorkProductUseRelationshipPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class WorkProductUseRelationshipPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for source EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings sourceSettings;
	
	/**
	 * Settings for target ReferencesTable
	 */
	private	ReferencesTableSettings targetSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public WorkProductUseRelationshipPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject workProductUseRelationship, String editing_mode) {
		super(editingContext, workProductUseRelationship, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SpemViewsRepository.class;
		partKey = SpemViewsRepository.WorkProductUseRelationship.class;
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
			final WorkProductUseRelationship workProductUseRelationship = (WorkProductUseRelationship)elt;
			final WorkProductUseRelationshipPropertiesEditionPart basePart = (WorkProductUseRelationshipPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.kind)) {
				// init part
				kindSettings = new EObjectFlatComboSettings(workProductUseRelationship, SpemPackage.eINSTANCE.getExtensibleElement_Kind());
				basePart.initKind(kindSettings);
				// set the button mode
				basePart.setKindButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (workProductUseRelationship.getPresentationName() != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.presentationName))
				basePart.setPresentationName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), workProductUseRelationship.getPresentationName()));
			
			if (workProductUseRelationship.getBriefDescription() != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.briefDescription))
				basePart.setBriefDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), workProductUseRelationship.getBriefDescription()));
			
			if (workProductUseRelationship.getMainDescription() != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.mainDescription))
				basePart.setMainDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), workProductUseRelationship.getMainDescription()));
			
			if (workProductUseRelationship.getPurpose() != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.purpose))
				basePart.setPurpose(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), workProductUseRelationship.getPurpose()));
			
			if (isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.guidance)) {
				guidanceSettings = new ReferencesTableSettings(workProductUseRelationship, SpemPackage.eINSTANCE.getDescribableElement_Guidance());
				basePart.initGuidance(guidanceSettings);
			}
			if (isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.metric)) {
				metricSettings = new ReferencesTableSettings(workProductUseRelationship, SpemPackage.eINSTANCE.getDescribableElement_Metric());
				basePart.initMetric(metricSettings);
			}
			if (isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.category)) {
				categorySettings = new ReferencesTableSettings(workProductUseRelationship, SpemPackage.eINSTANCE.getDescribableElement_Category());
				basePart.initCategory(categorySettings);
			}
			if (workProductUseRelationship.getCopyright() != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.copyright))
				basePart.setCopyright(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), workProductUseRelationship.getCopyright()));
			
			if (workProductUseRelationship.getAuthor() != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.author))
				basePart.setAuthor(workProductUseRelationship.getAuthor());
			
			if (workProductUseRelationship.getChangeDate() != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.changeDate))
				basePart.setChangeDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), workProductUseRelationship.getChangeDate()));
			
			if (workProductUseRelationship.getChangeDescription() != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.changeDescription))
				basePart.setChangeDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), workProductUseRelationship.getChangeDescription()));
			
			if (workProductUseRelationship.getVersion() != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.version))
				basePart.setVersion(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), workProductUseRelationship.getVersion()));
			
			if (workProductUseRelationship.getName() != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), workProductUseRelationship.getName()));
			
			if (isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.hasMultipleOccurrences)) {
				basePart.setHasMultipleOccurrences(workProductUseRelationship.isHasMultipleOccurrences());
			}
			if (isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.isOptional)) {
				basePart.setIsOptional(workProductUseRelationship.isIsOptional());
			}
			if (isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.isPlanned)) {
				basePart.setIsPlanned(workProductUseRelationship.isIsPlanned());
			}
			if (isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.source)) {
				// init part
				sourceSettings = new EObjectFlatComboSettings(workProductUseRelationship, SpemPackage.eINSTANCE.getWorkProductUseRelationship_Source());
				basePart.initSource(sourceSettings);
				// set the button mode
				basePart.setSourceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.target)) {
				targetSettings = new ReferencesTableSettings(workProductUseRelationship, SpemPackage.eINSTANCE.getWorkProductUseRelationship_Target());
				basePart.initTarget(targetSettings);
			}
			if (isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.relationshipKind)) {
				basePart.initRelationshipKind((EEnum) SpemPackage.eINSTANCE.getWorkProductUseRelationship_RelationshipKind().getEType(), workProductUseRelationship.getRelationshipKind());
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
			
			
			
			
			
			
			
			
			
			
			basePart.addFilterToSource(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof WorkProductUse);
				}
			
			});
			// Start of user code for additional businessfilters for source
			// End of user code
			
			basePart.addFilterToTarget(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInTargetTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToTarget(new EObjectFilter(SpemPackage.eINSTANCE.getWorkProductUse()));
			// Start of user code for additional businessfilters for target
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
		if (editorKey == SpemViewsRepository.WorkProductUseRelationship.Properties.kind) {
			return SpemPackage.eINSTANCE.getExtensibleElement_Kind();
		}
		if (editorKey == SpemViewsRepository.WorkProductUseRelationship.Properties.presentationName) {
			return SpemPackage.eINSTANCE.getDescribableElement_PresentationName();
		}
		if (editorKey == SpemViewsRepository.WorkProductUseRelationship.Properties.briefDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_BriefDescription();
		}
		if (editorKey == SpemViewsRepository.WorkProductUseRelationship.Properties.mainDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_MainDescription();
		}
		if (editorKey == SpemViewsRepository.WorkProductUseRelationship.Properties.purpose) {
			return SpemPackage.eINSTANCE.getDescribableElement_Purpose();
		}
		if (editorKey == SpemViewsRepository.WorkProductUseRelationship.Properties.guidance) {
			return SpemPackage.eINSTANCE.getDescribableElement_Guidance();
		}
		if (editorKey == SpemViewsRepository.WorkProductUseRelationship.Properties.metric) {
			return SpemPackage.eINSTANCE.getDescribableElement_Metric();
		}
		if (editorKey == SpemViewsRepository.WorkProductUseRelationship.Properties.category) {
			return SpemPackage.eINSTANCE.getDescribableElement_Category();
		}
		if (editorKey == SpemViewsRepository.WorkProductUseRelationship.Properties.copyright) {
			return SpemPackage.eINSTANCE.getDescribableElement_Copyright();
		}
		if (editorKey == SpemViewsRepository.WorkProductUseRelationship.Properties.author) {
			return SpemPackage.eINSTANCE.getDescribableElement_Author();
		}
		if (editorKey == SpemViewsRepository.WorkProductUseRelationship.Properties.changeDate) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDate();
		}
		if (editorKey == SpemViewsRepository.WorkProductUseRelationship.Properties.changeDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription();
		}
		if (editorKey == SpemViewsRepository.WorkProductUseRelationship.Properties.version) {
			return SpemPackage.eINSTANCE.getDescribableElement_Version();
		}
		if (editorKey == SpemViewsRepository.WorkProductUseRelationship.Properties.name) {
			return SpemPackage.eINSTANCE.getProcessPackageableElement_Name();
		}
		if (editorKey == SpemViewsRepository.WorkProductUseRelationship.Properties.hasMultipleOccurrences) {
			return SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences();
		}
		if (editorKey == SpemViewsRepository.WorkProductUseRelationship.Properties.isOptional) {
			return SpemPackage.eINSTANCE.getBreakdownElement_IsOptional();
		}
		if (editorKey == SpemViewsRepository.WorkProductUseRelationship.Properties.isPlanned) {
			return SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned();
		}
		if (editorKey == SpemViewsRepository.WorkProductUseRelationship.Properties.source) {
			return SpemPackage.eINSTANCE.getWorkProductUseRelationship_Source();
		}
		if (editorKey == SpemViewsRepository.WorkProductUseRelationship.Properties.target) {
			return SpemPackage.eINSTANCE.getWorkProductUseRelationship_Target();
		}
		if (editorKey == SpemViewsRepository.WorkProductUseRelationship.Properties.relationshipKind) {
			return SpemPackage.eINSTANCE.getWorkProductUseRelationship_RelationshipKind();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		WorkProductUseRelationship workProductUseRelationship = (WorkProductUseRelationship)semanticObject;
		if (SpemViewsRepository.WorkProductUseRelationship.Properties.kind == event.getAffectedEditor()) {
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
		if (SpemViewsRepository.WorkProductUseRelationship.Properties.presentationName == event.getAffectedEditor()) {
			workProductUseRelationship.setPresentationName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.WorkProductUseRelationship.Properties.briefDescription == event.getAffectedEditor()) {
			workProductUseRelationship.setBriefDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.WorkProductUseRelationship.Properties.mainDescription == event.getAffectedEditor()) {
			workProductUseRelationship.setMainDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.WorkProductUseRelationship.Properties.purpose == event.getAffectedEditor()) {
			workProductUseRelationship.setPurpose((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.WorkProductUseRelationship.Properties.guidance == event.getAffectedEditor()) {
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
		if (SpemViewsRepository.WorkProductUseRelationship.Properties.metric == event.getAffectedEditor()) {
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
		if (SpemViewsRepository.WorkProductUseRelationship.Properties.category == event.getAffectedEditor()) {
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
		if (SpemViewsRepository.WorkProductUseRelationship.Properties.copyright == event.getAffectedEditor()) {
			workProductUseRelationship.setCopyright((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.WorkProductUseRelationship.Properties.author == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				workProductUseRelationship.getAuthor().clear();
				workProductUseRelationship.getAuthor().addAll(((List) event.getNewValue()));
			}
		}
		if (SpemViewsRepository.WorkProductUseRelationship.Properties.changeDate == event.getAffectedEditor()) {
			workProductUseRelationship.setChangeDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.WorkProductUseRelationship.Properties.changeDescription == event.getAffectedEditor()) {
			workProductUseRelationship.setChangeDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.WorkProductUseRelationship.Properties.version == event.getAffectedEditor()) {
			workProductUseRelationship.setVersion((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.WorkProductUseRelationship.Properties.name == event.getAffectedEditor()) {
			workProductUseRelationship.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.WorkProductUseRelationship.Properties.hasMultipleOccurrences == event.getAffectedEditor()) {
			workProductUseRelationship.setHasMultipleOccurrences((Boolean)event.getNewValue());
		}
		if (SpemViewsRepository.WorkProductUseRelationship.Properties.isOptional == event.getAffectedEditor()) {
			workProductUseRelationship.setIsOptional((Boolean)event.getNewValue());
		}
		if (SpemViewsRepository.WorkProductUseRelationship.Properties.isPlanned == event.getAffectedEditor()) {
			workProductUseRelationship.setIsPlanned((Boolean)event.getNewValue());
		}
		if (SpemViewsRepository.WorkProductUseRelationship.Properties.source == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				sourceSettings.setToReference((WorkProductUse)event.getNewValue());
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
				sourceSettings.setToReference(eObject);
			}
		}
		if (SpemViewsRepository.WorkProductUseRelationship.Properties.target == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof WorkProductUse) {
					targetSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				targetSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				targetSettings.move(event.getNewIndex(), (WorkProductUse) event.getNewValue());
			}
		}
		if (SpemViewsRepository.WorkProductUseRelationship.Properties.relationshipKind == event.getAffectedEditor()) {
			workProductUseRelationship.setRelationshipKind((WorkProductRelationshipKind)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			WorkProductUseRelationshipPropertiesEditionPart basePart = (WorkProductUseRelationshipPropertiesEditionPart)editingPart;
			if (SpemPackage.eINSTANCE.getExtensibleElement_Kind().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.kind))
				basePart.setKind((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getDescribableElement_PresentationName().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.presentationName)) {
				if (msg.getNewValue() != null) {
					basePart.setPresentationName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPresentationName("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.briefDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setBriefDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setBriefDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_MainDescription().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.mainDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setMainDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setMainDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Purpose().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.purpose)) {
				if (msg.getNewValue() != null) {
					basePart.setPurpose(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPurpose("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Guidance().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.guidance))
				basePart.updateGuidance();
			if (SpemPackage.eINSTANCE.getDescribableElement_Metric().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.metric))
				basePart.updateMetric();
			if (SpemPackage.eINSTANCE.getDescribableElement_Category().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.category))
				basePart.updateCategory();
			if (SpemPackage.eINSTANCE.getDescribableElement_Copyright().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.copyright)) {
				if (msg.getNewValue() != null) {
					basePart.setCopyright(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCopyright("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Author().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.author)) {
				basePart.setAuthor(((WorkProductUseRelationship)semanticObject).getAuthor());
			}
			
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.changeDate)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setChangeDate("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.changeDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setChangeDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Version().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.version)) {
				if (msg.getNewValue() != null) {
					basePart.setVersion(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setVersion("");
				}
			}
			if (SpemPackage.eINSTANCE.getProcessPackageableElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.hasMultipleOccurrences))
				basePart.setHasMultipleOccurrences((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.isOptional))
				basePart.setIsOptional((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.isPlanned))
				basePart.setIsPlanned((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getWorkProductUseRelationship_Source().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.source))
				basePart.setSource((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getWorkProductUseRelationship_Target().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.target))
				basePart.updateTarget();
			if (SpemPackage.eINSTANCE.getWorkProductUseRelationship_RelationshipKind().equals(msg.getFeature()) && isAccessible(SpemViewsRepository.WorkProductUseRelationship.Properties.relationshipKind))
				basePart.setRelationshipKind((Enumerator)msg.getNewValue());
			
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SpemViewsRepository.WorkProductUseRelationship.Properties.hasMultipleOccurrences || key == SpemViewsRepository.WorkProductUseRelationship.Properties.isOptional || key == SpemViewsRepository.WorkProductUseRelationship.Properties.isPlanned || key == SpemViewsRepository.WorkProductUseRelationship.Properties.source || key == SpemViewsRepository.WorkProductUseRelationship.Properties.target || key == SpemViewsRepository.WorkProductUseRelationship.Properties.relationshipKind;
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
				if (SpemViewsRepository.WorkProductUseRelationship.Properties.presentationName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.WorkProductUseRelationship.Properties.briefDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.WorkProductUseRelationship.Properties.mainDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.WorkProductUseRelationship.Properties.purpose == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.WorkProductUseRelationship.Properties.copyright == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.WorkProductUseRelationship.Properties.author == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Author().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (SpemViewsRepository.WorkProductUseRelationship.Properties.changeDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.WorkProductUseRelationship.Properties.changeDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.WorkProductUseRelationship.Properties.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.WorkProductUseRelationship.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getProcessPackageableElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getProcessPackageableElement_Name().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.WorkProductUseRelationship.Properties.hasMultipleOccurrences == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.WorkProductUseRelationship.Properties.isOptional == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.WorkProductUseRelationship.Properties.isPlanned == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.WorkProductUseRelationship.Properties.relationshipKind == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getWorkProductUseRelationship_RelationshipKind().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkProductUseRelationship_RelationshipKind().getEAttributeType(), newValue);
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
