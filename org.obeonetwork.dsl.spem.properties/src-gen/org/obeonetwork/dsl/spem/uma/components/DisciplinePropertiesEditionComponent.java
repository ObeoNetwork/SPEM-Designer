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
import org.obeonetwork.dsl.spem.Category;
import org.obeonetwork.dsl.spem.DescribableElement;
import org.obeonetwork.dsl.spem.Guidance;
import org.obeonetwork.dsl.spem.Kind;
import org.obeonetwork.dsl.spem.MethodContentKind;
import org.obeonetwork.dsl.spem.Metric;
import org.obeonetwork.dsl.spem.SpemFactory;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.TaskDefinition;
import org.obeonetwork.dsl.spem.VariabilityElement;
import org.obeonetwork.dsl.spem.VariabilityType;
import org.obeonetwork.dsl.spem.uma.Discipline;
import org.obeonetwork.dsl.spem.uma.Process;
import org.obeonetwork.dsl.spem.uma.UmaPackage;
import org.obeonetwork.dsl.spem.uma.parts.DisciplinePropertiesEditionPart;
import org.obeonetwork.dsl.spem.uma.parts.UmaViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class DisciplinePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for variabilityBasedOnElement EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings variabilityBasedOnElementSettings;
	
	/**
	 * Settings for methodContentKind EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings methodContentKindSettings;
	
	/**
	 * Settings for subCategory ReferencesTable
	 */
	private	ReferencesTableSettings subCategorySettings;
	
	/**
	 * Settings for categorizedElement ReferencesTable
	 */
	private	ReferencesTableSettings categorizedElementSettings;
	
	/**
	 * Settings for relatedTask ReferencesTable
	 */
	private	ReferencesTableSettings relatedTaskSettings;
	
	/**
	 * Settings for relatedWorflow ReferencesTable
	 */
	private	ReferencesTableSettings relatedWorflowSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public DisciplinePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject discipline, String editing_mode) {
		super(editingContext, discipline, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = UmaViewsRepository.class;
		partKey = UmaViewsRepository.Discipline.class;
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
			final Discipline discipline = (Discipline)elt;
			final DisciplinePropertiesEditionPart basePart = (DisciplinePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(UmaViewsRepository.Discipline.Properties.kind)) {
				// init part
				kindSettings = new EObjectFlatComboSettings(discipline, SpemPackage.eINSTANCE.getExtensibleElement_Kind());
				basePart.initKind(kindSettings);
				// set the button mode
				basePart.setKindButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (discipline.getPresentationName() != null && isAccessible(UmaViewsRepository.Discipline.Properties.presentationName))
				basePart.setPresentationName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), discipline.getPresentationName()));
			
			if (discipline.getBriefDescription() != null && isAccessible(UmaViewsRepository.Discipline.Properties.briefDescription))
				basePart.setBriefDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), discipline.getBriefDescription()));
			
			if (discipline.getMainDescription() != null && isAccessible(UmaViewsRepository.Discipline.Properties.mainDescription))
				basePart.setMainDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), discipline.getMainDescription()));
			
			if (discipline.getPurpose() != null && isAccessible(UmaViewsRepository.Discipline.Properties.purpose))
				basePart.setPurpose(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), discipline.getPurpose()));
			
			if (isAccessible(UmaViewsRepository.Discipline.Properties.guidance)) {
				guidanceSettings = new ReferencesTableSettings(discipline, SpemPackage.eINSTANCE.getDescribableElement_Guidance());
				basePart.initGuidance(guidanceSettings);
			}
			if (isAccessible(UmaViewsRepository.Discipline.Properties.metric)) {
				metricSettings = new ReferencesTableSettings(discipline, SpemPackage.eINSTANCE.getDescribableElement_Metric());
				basePart.initMetric(metricSettings);
			}
			if (isAccessible(UmaViewsRepository.Discipline.Properties.category)) {
				categorySettings = new ReferencesTableSettings(discipline, SpemPackage.eINSTANCE.getDescribableElement_Category());
				basePart.initCategory(categorySettings);
			}
			if (discipline.getCopyright() != null && isAccessible(UmaViewsRepository.Discipline.Properties.copyright))
				basePart.setCopyright(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), discipline.getCopyright()));
			
			if (discipline.getAuthor() != null && isAccessible(UmaViewsRepository.Discipline.Properties.author))
				basePart.setAuthor(discipline.getAuthor());
			
			if (discipline.getChangeDate() != null && isAccessible(UmaViewsRepository.Discipline.Properties.changeDate))
				basePart.setChangeDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), discipline.getChangeDate()));
			
			if (discipline.getChangeDescription() != null && isAccessible(UmaViewsRepository.Discipline.Properties.changeDescription))
				basePart.setChangeDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), discipline.getChangeDescription()));
			
			if (discipline.getVersion() != null && isAccessible(UmaViewsRepository.Discipline.Properties.version))
				basePart.setVersion(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), discipline.getVersion()));
			
			if (discipline.getName() != null && isAccessible(UmaViewsRepository.Discipline.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), discipline.getName()));
			
			if (isAccessible(UmaViewsRepository.Discipline.Properties.variabilityType)) {
				basePart.initVariabilityType((EEnum) SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().getEType(), discipline.getVariabilityType());
			}
			if (isAccessible(UmaViewsRepository.Discipline.Properties.variabilityBasedOnElement)) {
				// init part
				variabilityBasedOnElementSettings = new EObjectFlatComboSettings(discipline, SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement());
				basePart.initVariabilityBasedOnElement(variabilityBasedOnElementSettings);
				// set the button mode
				basePart.setVariabilityBasedOnElementButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(UmaViewsRepository.Discipline.Properties.methodContentKind)) {
				// init part
				methodContentKindSettings = new EObjectFlatComboSettings(discipline, SpemPackage.eINSTANCE.getMethodContentElement_MethodContentKind());
				basePart.initMethodContentKind(methodContentKindSettings);
				// set the button mode
				basePart.setMethodContentKindButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(UmaViewsRepository.Discipline.Properties.subCategory)) {
				subCategorySettings = new ReferencesTableSettings(discipline, SpemPackage.eINSTANCE.getCategory_SubCategory());
				basePart.initSubCategory(subCategorySettings);
			}
			if (isAccessible(UmaViewsRepository.Discipline.Properties.categorizedElement)) {
				categorizedElementSettings = new ReferencesTableSettings(discipline, SpemPackage.eINSTANCE.getCategory_CategorizedElement());
				basePart.initCategorizedElement(categorizedElementSettings);
			}
			if (isAccessible(UmaViewsRepository.Discipline.Properties.relatedTask)) {
				relatedTaskSettings = new ReferencesTableSettings(discipline, UmaPackage.eINSTANCE.getDiscipline_RelatedTask());
				basePart.initRelatedTask(relatedTaskSettings);
			}
			if (isAccessible(UmaViewsRepository.Discipline.Properties.relatedWorflow)) {
				relatedWorflowSettings = new ReferencesTableSettings(discipline, UmaPackage.eINSTANCE.getDiscipline_RelatedWorflow());
				basePart.initRelatedWorflow(relatedWorflowSettings);
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
			
			basePart.addFilterToMethodContentKind(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof MethodContentKind); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for methodContentKind
			// End of user code
			
			basePart.addFilterToSubCategory(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInSubCategoryTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToSubCategory(new EObjectFilter(SpemPackage.eINSTANCE.getCategory()));
			// Start of user code for additional businessfilters for subCategory
			// End of user code
			
			basePart.addFilterToCategorizedElement(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInCategorizedElementTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToCategorizedElement(new EObjectFilter(SpemPackage.eINSTANCE.getDescribableElement()));
			// Start of user code for additional businessfilters for categorizedElement
			// End of user code
			
			basePart.addFilterToRelatedTask(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInRelatedTaskTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToRelatedTask(new EObjectFilter(SpemPackage.eINSTANCE.getTaskDefinition()));
			// Start of user code for additional businessfilters for relatedTask
			// End of user code
			
			basePart.addFilterToRelatedWorflow(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInRelatedWorflowTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToRelatedWorflow(new EObjectFilter(UmaPackage.eINSTANCE.getProcess()));
			// Start of user code for additional businessfilters for relatedWorflow
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
		if (editorKey == UmaViewsRepository.Discipline.Properties.kind) {
			return SpemPackage.eINSTANCE.getExtensibleElement_Kind();
		}
		if (editorKey == UmaViewsRepository.Discipline.Properties.presentationName) {
			return SpemPackage.eINSTANCE.getDescribableElement_PresentationName();
		}
		if (editorKey == UmaViewsRepository.Discipline.Properties.briefDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_BriefDescription();
		}
		if (editorKey == UmaViewsRepository.Discipline.Properties.mainDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_MainDescription();
		}
		if (editorKey == UmaViewsRepository.Discipline.Properties.purpose) {
			return SpemPackage.eINSTANCE.getDescribableElement_Purpose();
		}
		if (editorKey == UmaViewsRepository.Discipline.Properties.guidance) {
			return SpemPackage.eINSTANCE.getDescribableElement_Guidance();
		}
		if (editorKey == UmaViewsRepository.Discipline.Properties.metric) {
			return SpemPackage.eINSTANCE.getDescribableElement_Metric();
		}
		if (editorKey == UmaViewsRepository.Discipline.Properties.category) {
			return SpemPackage.eINSTANCE.getDescribableElement_Category();
		}
		if (editorKey == UmaViewsRepository.Discipline.Properties.copyright) {
			return SpemPackage.eINSTANCE.getDescribableElement_Copyright();
		}
		if (editorKey == UmaViewsRepository.Discipline.Properties.author) {
			return SpemPackage.eINSTANCE.getDescribableElement_Author();
		}
		if (editorKey == UmaViewsRepository.Discipline.Properties.changeDate) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDate();
		}
		if (editorKey == UmaViewsRepository.Discipline.Properties.changeDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription();
		}
		if (editorKey == UmaViewsRepository.Discipline.Properties.version) {
			return SpemPackage.eINSTANCE.getDescribableElement_Version();
		}
		if (editorKey == UmaViewsRepository.Discipline.Properties.name) {
			return SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name();
		}
		if (editorKey == UmaViewsRepository.Discipline.Properties.variabilityType) {
			return SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType();
		}
		if (editorKey == UmaViewsRepository.Discipline.Properties.variabilityBasedOnElement) {
			return SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement();
		}
		if (editorKey == UmaViewsRepository.Discipline.Properties.methodContentKind) {
			return SpemPackage.eINSTANCE.getMethodContentElement_MethodContentKind();
		}
		if (editorKey == UmaViewsRepository.Discipline.Properties.subCategory) {
			return SpemPackage.eINSTANCE.getCategory_SubCategory();
		}
		if (editorKey == UmaViewsRepository.Discipline.Properties.categorizedElement) {
			return SpemPackage.eINSTANCE.getCategory_CategorizedElement();
		}
		if (editorKey == UmaViewsRepository.Discipline.Properties.relatedTask) {
			return UmaPackage.eINSTANCE.getDiscipline_RelatedTask();
		}
		if (editorKey == UmaViewsRepository.Discipline.Properties.relatedWorflow) {
			return UmaPackage.eINSTANCE.getDiscipline_RelatedWorflow();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Discipline discipline = (Discipline)semanticObject;
		if (UmaViewsRepository.Discipline.Properties.kind == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.Discipline.Properties.presentationName == event.getAffectedEditor()) {
			discipline.setPresentationName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.Discipline.Properties.briefDescription == event.getAffectedEditor()) {
			discipline.setBriefDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.Discipline.Properties.mainDescription == event.getAffectedEditor()) {
			discipline.setMainDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.Discipline.Properties.purpose == event.getAffectedEditor()) {
			discipline.setPurpose((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.Discipline.Properties.guidance == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.Discipline.Properties.metric == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.Discipline.Properties.category == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.Discipline.Properties.copyright == event.getAffectedEditor()) {
			discipline.setCopyright((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.Discipline.Properties.author == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				discipline.getAuthor().clear();
				discipline.getAuthor().addAll(((List) event.getNewValue()));
			}
		}
		if (UmaViewsRepository.Discipline.Properties.changeDate == event.getAffectedEditor()) {
			discipline.setChangeDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.Discipline.Properties.changeDescription == event.getAffectedEditor()) {
			discipline.setChangeDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.Discipline.Properties.version == event.getAffectedEditor()) {
			discipline.setVersion((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.Discipline.Properties.name == event.getAffectedEditor()) {
			discipline.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.Discipline.Properties.variabilityType == event.getAffectedEditor()) {
			discipline.setVariabilityType((VariabilityType)event.getNewValue());
		}
		if (UmaViewsRepository.Discipline.Properties.variabilityBasedOnElement == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.Discipline.Properties.methodContentKind == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				methodContentKindSettings.setToReference((MethodContentKind)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, methodContentKindSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (UmaViewsRepository.Discipline.Properties.subCategory == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Category) {
					subCategorySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				subCategorySettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				subCategorySettings.move(event.getNewIndex(), (Category) event.getNewValue());
			}
		}
		if (UmaViewsRepository.Discipline.Properties.categorizedElement == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof DescribableElement) {
					categorizedElementSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				categorizedElementSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				categorizedElementSettings.move(event.getNewIndex(), (DescribableElement) event.getNewValue());
			}
		}
		if (UmaViewsRepository.Discipline.Properties.relatedTask == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof TaskDefinition) {
					relatedTaskSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				relatedTaskSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				relatedTaskSettings.move(event.getNewIndex(), (TaskDefinition) event.getNewValue());
			}
		}
		if (UmaViewsRepository.Discipline.Properties.relatedWorflow == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Process) {
					relatedWorflowSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				relatedWorflowSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				relatedWorflowSettings.move(event.getNewIndex(), (Process) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			DisciplinePropertiesEditionPart basePart = (DisciplinePropertiesEditionPart)editingPart;
			if (SpemPackage.eINSTANCE.getExtensibleElement_Kind().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.Discipline.Properties.kind))
				basePart.setKind((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getDescribableElement_PresentationName().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.Discipline.Properties.presentationName)) {
				if (msg.getNewValue() != null) {
					basePart.setPresentationName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPresentationName("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.Discipline.Properties.briefDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setBriefDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setBriefDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_MainDescription().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.Discipline.Properties.mainDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setMainDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setMainDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Purpose().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.Discipline.Properties.purpose)) {
				if (msg.getNewValue() != null) {
					basePart.setPurpose(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPurpose("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Guidance().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.Discipline.Properties.guidance))
				basePart.updateGuidance();
			if (SpemPackage.eINSTANCE.getDescribableElement_Metric().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.Discipline.Properties.metric))
				basePart.updateMetric();
			if (SpemPackage.eINSTANCE.getDescribableElement_Category().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.Discipline.Properties.category))
				basePart.updateCategory();
			if (SpemPackage.eINSTANCE.getDescribableElement_Copyright().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.Discipline.Properties.copyright)) {
				if (msg.getNewValue() != null) {
					basePart.setCopyright(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCopyright("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Author().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.Discipline.Properties.author)) {
				basePart.setAuthor(((Discipline)semanticObject).getAuthor());
			}
			
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.Discipline.Properties.changeDate)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setChangeDate("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.Discipline.Properties.changeDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setChangeDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Version().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.Discipline.Properties.version)) {
				if (msg.getNewValue() != null) {
					basePart.setVersion(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setVersion("");
				}
			}
			if (SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.Discipline.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().equals(msg.getFeature()) && isAccessible(UmaViewsRepository.Discipline.Properties.variabilityType))
				basePart.setVariabilityType((Enumerator)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.Discipline.Properties.variabilityBasedOnElement))
				basePart.setVariabilityBasedOnElement((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getMethodContentElement_MethodContentKind().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.Discipline.Properties.methodContentKind))
				basePart.setMethodContentKind((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getCategory_SubCategory().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.Discipline.Properties.subCategory))
				basePart.updateSubCategory();
			if (SpemPackage.eINSTANCE.getCategory_CategorizedElement().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.Discipline.Properties.categorizedElement))
				basePart.updateCategorizedElement();
			if (UmaPackage.eINSTANCE.getDiscipline_RelatedTask().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.Discipline.Properties.relatedTask))
				basePart.updateRelatedTask();
			if (UmaPackage.eINSTANCE.getDiscipline_RelatedWorflow().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.Discipline.Properties.relatedWorflow))
				basePart.updateRelatedWorflow();
			
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
				if (UmaViewsRepository.Discipline.Properties.presentationName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.Discipline.Properties.briefDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.Discipline.Properties.mainDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.Discipline.Properties.purpose == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.Discipline.Properties.copyright == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.Discipline.Properties.author == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Author().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (UmaViewsRepository.Discipline.Properties.changeDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.Discipline.Properties.changeDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.Discipline.Properties.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.Discipline.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.Discipline.Properties.variabilityType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().getEAttributeType(), newValue);
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
