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
import org.obeonetwork.dsl.spem.VariabilityElement;
import org.obeonetwork.dsl.spem.VariabilityType;
import org.obeonetwork.dsl.spem.uma.DisciplineGrouping;
import org.obeonetwork.dsl.spem.uma.parts.DisciplineGroupingPropertiesEditionPart;
import org.obeonetwork.dsl.spem.uma.parts.UmaViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class DisciplineGroupingPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Default constructor
	 * 
	 */
	public DisciplineGroupingPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject disciplineGrouping, String editing_mode) {
		super(editingContext, disciplineGrouping, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = UmaViewsRepository.class;
		partKey = UmaViewsRepository.DisciplineGrouping.class;
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
			final DisciplineGrouping disciplineGrouping = (DisciplineGrouping)elt;
			final DisciplineGroupingPropertiesEditionPart basePart = (DisciplineGroupingPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.kind)) {
				// init part
				kindSettings = new EObjectFlatComboSettings(disciplineGrouping, SpemPackage.eINSTANCE.getExtensibleElement_Kind());
				basePart.initKind(kindSettings);
				// set the button mode
				basePart.setKindButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (disciplineGrouping.getPresentationName() != null && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.presentationName))
				basePart.setPresentationName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), disciplineGrouping.getPresentationName()));
			
			if (disciplineGrouping.getBriefDescription() != null && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.briefDescription))
				basePart.setBriefDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), disciplineGrouping.getBriefDescription()));
			
			if (disciplineGrouping.getMainDescription() != null && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.mainDescription))
				basePart.setMainDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), disciplineGrouping.getMainDescription()));
			
			if (disciplineGrouping.getPurpose() != null && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.purpose))
				basePart.setPurpose(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), disciplineGrouping.getPurpose()));
			
			if (isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.guidance)) {
				guidanceSettings = new ReferencesTableSettings(disciplineGrouping, SpemPackage.eINSTANCE.getDescribableElement_Guidance());
				basePart.initGuidance(guidanceSettings);
			}
			if (isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.metric)) {
				metricSettings = new ReferencesTableSettings(disciplineGrouping, SpemPackage.eINSTANCE.getDescribableElement_Metric());
				basePart.initMetric(metricSettings);
			}
			if (isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.category)) {
				categorySettings = new ReferencesTableSettings(disciplineGrouping, SpemPackage.eINSTANCE.getDescribableElement_Category());
				basePart.initCategory(categorySettings);
			}
			if (disciplineGrouping.getCopyright() != null && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.copyright))
				basePart.setCopyright(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), disciplineGrouping.getCopyright()));
			
			if (disciplineGrouping.getAuthor() != null && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.author))
				basePart.setAuthor(disciplineGrouping.getAuthor());
			
			if (disciplineGrouping.getChangeDate() != null && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.changeDate))
				basePart.setChangeDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), disciplineGrouping.getChangeDate()));
			
			if (disciplineGrouping.getChangeDescription() != null && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.changeDescription))
				basePart.setChangeDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), disciplineGrouping.getChangeDescription()));
			
			if (disciplineGrouping.getVersion() != null && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.version))
				basePart.setVersion(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), disciplineGrouping.getVersion()));
			
			if (disciplineGrouping.getName() != null && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), disciplineGrouping.getName()));
			
			if (isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.variabilityType)) {
				basePart.initVariabilityType((EEnum) SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().getEType(), disciplineGrouping.getVariabilityType());
			}
			if (isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.variabilityBasedOnElement)) {
				// init part
				variabilityBasedOnElementSettings = new EObjectFlatComboSettings(disciplineGrouping, SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement());
				basePart.initVariabilityBasedOnElement(variabilityBasedOnElementSettings);
				// set the button mode
				basePart.setVariabilityBasedOnElementButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.methodContentKind)) {
				// init part
				methodContentKindSettings = new EObjectFlatComboSettings(disciplineGrouping, SpemPackage.eINSTANCE.getMethodContentElement_MethodContentKind());
				basePart.initMethodContentKind(methodContentKindSettings);
				// set the button mode
				basePart.setMethodContentKindButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.subCategory)) {
				subCategorySettings = new ReferencesTableSettings(disciplineGrouping, SpemPackage.eINSTANCE.getCategory_SubCategory());
				basePart.initSubCategory(subCategorySettings);
			}
			if (isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.categorizedElement)) {
				categorizedElementSettings = new ReferencesTableSettings(disciplineGrouping, SpemPackage.eINSTANCE.getCategory_CategorizedElement());
				basePart.initCategorizedElement(categorizedElementSettings);
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
		if (editorKey == UmaViewsRepository.DisciplineGrouping.Properties.kind) {
			return SpemPackage.eINSTANCE.getExtensibleElement_Kind();
		}
		if (editorKey == UmaViewsRepository.DisciplineGrouping.Properties.presentationName) {
			return SpemPackage.eINSTANCE.getDescribableElement_PresentationName();
		}
		if (editorKey == UmaViewsRepository.DisciplineGrouping.Properties.briefDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_BriefDescription();
		}
		if (editorKey == UmaViewsRepository.DisciplineGrouping.Properties.mainDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_MainDescription();
		}
		if (editorKey == UmaViewsRepository.DisciplineGrouping.Properties.purpose) {
			return SpemPackage.eINSTANCE.getDescribableElement_Purpose();
		}
		if (editorKey == UmaViewsRepository.DisciplineGrouping.Properties.guidance) {
			return SpemPackage.eINSTANCE.getDescribableElement_Guidance();
		}
		if (editorKey == UmaViewsRepository.DisciplineGrouping.Properties.metric) {
			return SpemPackage.eINSTANCE.getDescribableElement_Metric();
		}
		if (editorKey == UmaViewsRepository.DisciplineGrouping.Properties.category) {
			return SpemPackage.eINSTANCE.getDescribableElement_Category();
		}
		if (editorKey == UmaViewsRepository.DisciplineGrouping.Properties.copyright) {
			return SpemPackage.eINSTANCE.getDescribableElement_Copyright();
		}
		if (editorKey == UmaViewsRepository.DisciplineGrouping.Properties.author) {
			return SpemPackage.eINSTANCE.getDescribableElement_Author();
		}
		if (editorKey == UmaViewsRepository.DisciplineGrouping.Properties.changeDate) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDate();
		}
		if (editorKey == UmaViewsRepository.DisciplineGrouping.Properties.changeDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription();
		}
		if (editorKey == UmaViewsRepository.DisciplineGrouping.Properties.version) {
			return SpemPackage.eINSTANCE.getDescribableElement_Version();
		}
		if (editorKey == UmaViewsRepository.DisciplineGrouping.Properties.name) {
			return SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name();
		}
		if (editorKey == UmaViewsRepository.DisciplineGrouping.Properties.variabilityType) {
			return SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType();
		}
		if (editorKey == UmaViewsRepository.DisciplineGrouping.Properties.variabilityBasedOnElement) {
			return SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement();
		}
		if (editorKey == UmaViewsRepository.DisciplineGrouping.Properties.methodContentKind) {
			return SpemPackage.eINSTANCE.getMethodContentElement_MethodContentKind();
		}
		if (editorKey == UmaViewsRepository.DisciplineGrouping.Properties.subCategory) {
			return SpemPackage.eINSTANCE.getCategory_SubCategory();
		}
		if (editorKey == UmaViewsRepository.DisciplineGrouping.Properties.categorizedElement) {
			return SpemPackage.eINSTANCE.getCategory_CategorizedElement();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		DisciplineGrouping disciplineGrouping = (DisciplineGrouping)semanticObject;
		if (UmaViewsRepository.DisciplineGrouping.Properties.kind == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.DisciplineGrouping.Properties.presentationName == event.getAffectedEditor()) {
			disciplineGrouping.setPresentationName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.DisciplineGrouping.Properties.briefDescription == event.getAffectedEditor()) {
			disciplineGrouping.setBriefDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.DisciplineGrouping.Properties.mainDescription == event.getAffectedEditor()) {
			disciplineGrouping.setMainDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.DisciplineGrouping.Properties.purpose == event.getAffectedEditor()) {
			disciplineGrouping.setPurpose((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.DisciplineGrouping.Properties.guidance == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.DisciplineGrouping.Properties.metric == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.DisciplineGrouping.Properties.category == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.DisciplineGrouping.Properties.copyright == event.getAffectedEditor()) {
			disciplineGrouping.setCopyright((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.DisciplineGrouping.Properties.author == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				disciplineGrouping.getAuthor().clear();
				disciplineGrouping.getAuthor().addAll(((List) event.getNewValue()));
			}
		}
		if (UmaViewsRepository.DisciplineGrouping.Properties.changeDate == event.getAffectedEditor()) {
			disciplineGrouping.setChangeDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.DisciplineGrouping.Properties.changeDescription == event.getAffectedEditor()) {
			disciplineGrouping.setChangeDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.DisciplineGrouping.Properties.version == event.getAffectedEditor()) {
			disciplineGrouping.setVersion((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.DisciplineGrouping.Properties.name == event.getAffectedEditor()) {
			disciplineGrouping.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.DisciplineGrouping.Properties.variabilityType == event.getAffectedEditor()) {
			disciplineGrouping.setVariabilityType((VariabilityType)event.getNewValue());
		}
		if (UmaViewsRepository.DisciplineGrouping.Properties.variabilityBasedOnElement == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.DisciplineGrouping.Properties.methodContentKind == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.DisciplineGrouping.Properties.subCategory == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.DisciplineGrouping.Properties.categorizedElement == event.getAffectedEditor()) {
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
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			DisciplineGroupingPropertiesEditionPart basePart = (DisciplineGroupingPropertiesEditionPart)editingPart;
			if (SpemPackage.eINSTANCE.getExtensibleElement_Kind().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.kind))
				basePart.setKind((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getDescribableElement_PresentationName().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.presentationName)) {
				if (msg.getNewValue() != null) {
					basePart.setPresentationName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPresentationName("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.briefDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setBriefDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setBriefDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_MainDescription().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.mainDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setMainDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setMainDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Purpose().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.purpose)) {
				if (msg.getNewValue() != null) {
					basePart.setPurpose(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPurpose("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Guidance().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.guidance))
				basePart.updateGuidance();
			if (SpemPackage.eINSTANCE.getDescribableElement_Metric().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.metric))
				basePart.updateMetric();
			if (SpemPackage.eINSTANCE.getDescribableElement_Category().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.category))
				basePart.updateCategory();
			if (SpemPackage.eINSTANCE.getDescribableElement_Copyright().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.copyright)) {
				if (msg.getNewValue() != null) {
					basePart.setCopyright(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCopyright("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Author().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.author)) {
				basePart.setAuthor(((DisciplineGrouping)semanticObject).getAuthor());
			}
			
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.changeDate)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setChangeDate("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.changeDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setChangeDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Version().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.version)) {
				if (msg.getNewValue() != null) {
					basePart.setVersion(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setVersion("");
				}
			}
			if (SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().equals(msg.getFeature()) && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.variabilityType))
				basePart.setVariabilityType((Enumerator)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.variabilityBasedOnElement))
				basePart.setVariabilityBasedOnElement((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getMethodContentElement_MethodContentKind().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.methodContentKind))
				basePart.setMethodContentKind((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getCategory_SubCategory().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.subCategory))
				basePart.updateSubCategory();
			if (SpemPackage.eINSTANCE.getCategory_CategorizedElement().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.DisciplineGrouping.Properties.categorizedElement))
				basePart.updateCategorizedElement();
			
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
				if (UmaViewsRepository.DisciplineGrouping.Properties.presentationName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DisciplineGrouping.Properties.briefDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DisciplineGrouping.Properties.mainDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DisciplineGrouping.Properties.purpose == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DisciplineGrouping.Properties.copyright == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DisciplineGrouping.Properties.author == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Author().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (UmaViewsRepository.DisciplineGrouping.Properties.changeDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DisciplineGrouping.Properties.changeDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DisciplineGrouping.Properties.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DisciplineGrouping.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DisciplineGrouping.Properties.variabilityType == event.getAffectedEditor()) {
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
