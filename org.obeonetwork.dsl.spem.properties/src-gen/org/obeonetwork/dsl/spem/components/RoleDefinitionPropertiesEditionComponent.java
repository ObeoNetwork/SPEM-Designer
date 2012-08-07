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
import org.obeonetwork.dsl.spem.Guidance;
import org.obeonetwork.dsl.spem.Kind;
import org.obeonetwork.dsl.spem.MethodContentKind;
import org.obeonetwork.dsl.spem.Metric;
import org.obeonetwork.dsl.spem.Qualification;
import org.obeonetwork.dsl.spem.RoleDefinition;
import org.obeonetwork.dsl.spem.SpemFactory;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.VariabilityElement;
import org.obeonetwork.dsl.spem.VariabilityType;
import org.obeonetwork.dsl.spem.parts.RoleDefinitionPropertiesEditionPart;
import org.obeonetwork.dsl.spem.parts.SpemViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class RoleDefinitionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for providedQualification ReferencesTable
	 */
	private	ReferencesTableSettings providedQualificationSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public RoleDefinitionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject roleDefinition, String editing_mode) {
		super(editingContext, roleDefinition, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SpemViewsRepository.class;
		partKey = SpemViewsRepository.RoleDefinition.class;
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
			final RoleDefinition roleDefinition = (RoleDefinition)elt;
			final RoleDefinitionPropertiesEditionPart basePart = (RoleDefinitionPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SpemViewsRepository.RoleDefinition.Properties.kind)) {
				// init part
				kindSettings = new EObjectFlatComboSettings(roleDefinition, SpemPackage.eINSTANCE.getExtensibleElement_Kind());
				basePart.initKind(kindSettings);
				// set the button mode
				basePart.setKindButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (roleDefinition.getPresentationName() != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.presentationName))
				basePart.setPresentationName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), roleDefinition.getPresentationName()));
			
			if (roleDefinition.getBriefDescription() != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.briefDescription))
				basePart.setBriefDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), roleDefinition.getBriefDescription()));
			
			if (roleDefinition.getMainDescription() != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.mainDescription))
				basePart.setMainDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), roleDefinition.getMainDescription()));
			
			if (roleDefinition.getPurpose() != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.purpose))
				basePart.setPurpose(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), roleDefinition.getPurpose()));
			
			if (isAccessible(SpemViewsRepository.RoleDefinition.Properties.guidance)) {
				guidanceSettings = new ReferencesTableSettings(roleDefinition, SpemPackage.eINSTANCE.getDescribableElement_Guidance());
				basePart.initGuidance(guidanceSettings);
			}
			if (isAccessible(SpemViewsRepository.RoleDefinition.Properties.metric)) {
				metricSettings = new ReferencesTableSettings(roleDefinition, SpemPackage.eINSTANCE.getDescribableElement_Metric());
				basePart.initMetric(metricSettings);
			}
			if (isAccessible(SpemViewsRepository.RoleDefinition.Properties.category)) {
				categorySettings = new ReferencesTableSettings(roleDefinition, SpemPackage.eINSTANCE.getDescribableElement_Category());
				basePart.initCategory(categorySettings);
			}
			if (roleDefinition.getCopyright() != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.copyright))
				basePart.setCopyright(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), roleDefinition.getCopyright()));
			
			if (roleDefinition.getAuthor() != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.author))
				basePart.setAuthor(roleDefinition.getAuthor());
			
			if (roleDefinition.getChangeDate() != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.changeDate))
				basePart.setChangeDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), roleDefinition.getChangeDate()));
			
			if (roleDefinition.getChangeDescription() != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.changeDescription))
				basePart.setChangeDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), roleDefinition.getChangeDescription()));
			
			if (roleDefinition.getVersion() != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.version))
				basePart.setVersion(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), roleDefinition.getVersion()));
			
			if (roleDefinition.getName() != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), roleDefinition.getName()));
			
			if (isAccessible(SpemViewsRepository.RoleDefinition.Properties.variabilityType)) {
				basePart.initVariabilityType((EEnum) SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().getEType(), roleDefinition.getVariabilityType());
			}
			if (isAccessible(SpemViewsRepository.RoleDefinition.Properties.variabilityBasedOnElement)) {
				// init part
				variabilityBasedOnElementSettings = new EObjectFlatComboSettings(roleDefinition, SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement());
				basePart.initVariabilityBasedOnElement(variabilityBasedOnElementSettings);
				// set the button mode
				basePart.setVariabilityBasedOnElementButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SpemViewsRepository.RoleDefinition.Properties.methodContentKind)) {
				// init part
				methodContentKindSettings = new EObjectFlatComboSettings(roleDefinition, SpemPackage.eINSTANCE.getMethodContentElement_MethodContentKind());
				basePart.initMethodContentKind(methodContentKindSettings);
				// set the button mode
				basePart.setMethodContentKindButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (roleDefinition.getSynonym() != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.synonym))
				basePart.setSynonym(roleDefinition.getSynonym());
			
			if (isAccessible(SpemViewsRepository.RoleDefinition.Properties.providedQualification)) {
				providedQualificationSettings = new ReferencesTableSettings(roleDefinition, SpemPackage.eINSTANCE.getRoleDefinition_ProvidedQualification());
				basePart.initProvidedQualification(providedQualificationSettings);
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
			
			
			basePart.addFilterToProvidedQualification(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInProvidedQualificationTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToProvidedQualification(new EObjectFilter(SpemPackage.eINSTANCE.getQualification()));
			// Start of user code for additional businessfilters for providedQualification
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
		if (editorKey == SpemViewsRepository.RoleDefinition.Properties.kind) {
			return SpemPackage.eINSTANCE.getExtensibleElement_Kind();
		}
		if (editorKey == SpemViewsRepository.RoleDefinition.Properties.presentationName) {
			return SpemPackage.eINSTANCE.getDescribableElement_PresentationName();
		}
		if (editorKey == SpemViewsRepository.RoleDefinition.Properties.briefDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_BriefDescription();
		}
		if (editorKey == SpemViewsRepository.RoleDefinition.Properties.mainDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_MainDescription();
		}
		if (editorKey == SpemViewsRepository.RoleDefinition.Properties.purpose) {
			return SpemPackage.eINSTANCE.getDescribableElement_Purpose();
		}
		if (editorKey == SpemViewsRepository.RoleDefinition.Properties.guidance) {
			return SpemPackage.eINSTANCE.getDescribableElement_Guidance();
		}
		if (editorKey == SpemViewsRepository.RoleDefinition.Properties.metric) {
			return SpemPackage.eINSTANCE.getDescribableElement_Metric();
		}
		if (editorKey == SpemViewsRepository.RoleDefinition.Properties.category) {
			return SpemPackage.eINSTANCE.getDescribableElement_Category();
		}
		if (editorKey == SpemViewsRepository.RoleDefinition.Properties.copyright) {
			return SpemPackage.eINSTANCE.getDescribableElement_Copyright();
		}
		if (editorKey == SpemViewsRepository.RoleDefinition.Properties.author) {
			return SpemPackage.eINSTANCE.getDescribableElement_Author();
		}
		if (editorKey == SpemViewsRepository.RoleDefinition.Properties.changeDate) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDate();
		}
		if (editorKey == SpemViewsRepository.RoleDefinition.Properties.changeDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription();
		}
		if (editorKey == SpemViewsRepository.RoleDefinition.Properties.version) {
			return SpemPackage.eINSTANCE.getDescribableElement_Version();
		}
		if (editorKey == SpemViewsRepository.RoleDefinition.Properties.name) {
			return SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name();
		}
		if (editorKey == SpemViewsRepository.RoleDefinition.Properties.variabilityType) {
			return SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType();
		}
		if (editorKey == SpemViewsRepository.RoleDefinition.Properties.variabilityBasedOnElement) {
			return SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement();
		}
		if (editorKey == SpemViewsRepository.RoleDefinition.Properties.methodContentKind) {
			return SpemPackage.eINSTANCE.getMethodContentElement_MethodContentKind();
		}
		if (editorKey == SpemViewsRepository.RoleDefinition.Properties.synonym) {
			return SpemPackage.eINSTANCE.getRoleDefinition_Synonym();
		}
		if (editorKey == SpemViewsRepository.RoleDefinition.Properties.providedQualification) {
			return SpemPackage.eINSTANCE.getRoleDefinition_ProvidedQualification();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		RoleDefinition roleDefinition = (RoleDefinition)semanticObject;
		if (SpemViewsRepository.RoleDefinition.Properties.kind == event.getAffectedEditor()) {
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
		if (SpemViewsRepository.RoleDefinition.Properties.presentationName == event.getAffectedEditor()) {
			roleDefinition.setPresentationName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.RoleDefinition.Properties.briefDescription == event.getAffectedEditor()) {
			roleDefinition.setBriefDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.RoleDefinition.Properties.mainDescription == event.getAffectedEditor()) {
			roleDefinition.setMainDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.RoleDefinition.Properties.purpose == event.getAffectedEditor()) {
			roleDefinition.setPurpose((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.RoleDefinition.Properties.guidance == event.getAffectedEditor()) {
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
		if (SpemViewsRepository.RoleDefinition.Properties.metric == event.getAffectedEditor()) {
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
		if (SpemViewsRepository.RoleDefinition.Properties.category == event.getAffectedEditor()) {
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
		if (SpemViewsRepository.RoleDefinition.Properties.copyright == event.getAffectedEditor()) {
			roleDefinition.setCopyright((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.RoleDefinition.Properties.author == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				roleDefinition.getAuthor().clear();
				roleDefinition.getAuthor().addAll(((List) event.getNewValue()));
			}
		}
		if (SpemViewsRepository.RoleDefinition.Properties.changeDate == event.getAffectedEditor()) {
			roleDefinition.setChangeDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.RoleDefinition.Properties.changeDescription == event.getAffectedEditor()) {
			roleDefinition.setChangeDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.RoleDefinition.Properties.version == event.getAffectedEditor()) {
			roleDefinition.setVersion((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.RoleDefinition.Properties.name == event.getAffectedEditor()) {
			roleDefinition.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.RoleDefinition.Properties.variabilityType == event.getAffectedEditor()) {
			roleDefinition.setVariabilityType((VariabilityType)event.getNewValue());
		}
		if (SpemViewsRepository.RoleDefinition.Properties.variabilityBasedOnElement == event.getAffectedEditor()) {
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
		if (SpemViewsRepository.RoleDefinition.Properties.methodContentKind == event.getAffectedEditor()) {
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
		if (SpemViewsRepository.RoleDefinition.Properties.synonym == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				roleDefinition.getSynonym().clear();
				roleDefinition.getSynonym().addAll(((List) event.getNewValue()));
			}
		}
		if (SpemViewsRepository.RoleDefinition.Properties.providedQualification == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Qualification) {
					providedQualificationSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				providedQualificationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				providedQualificationSettings.move(event.getNewIndex(), (Qualification) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			RoleDefinitionPropertiesEditionPart basePart = (RoleDefinitionPropertiesEditionPart)editingPart;
			if (SpemPackage.eINSTANCE.getExtensibleElement_Kind().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.kind))
				basePart.setKind((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getDescribableElement_PresentationName().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.presentationName)) {
				if (msg.getNewValue() != null) {
					basePart.setPresentationName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPresentationName("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.briefDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setBriefDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setBriefDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_MainDescription().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.mainDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setMainDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setMainDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Purpose().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.purpose)) {
				if (msg.getNewValue() != null) {
					basePart.setPurpose(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPurpose("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Guidance().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.RoleDefinition.Properties.guidance))
				basePart.updateGuidance();
			if (SpemPackage.eINSTANCE.getDescribableElement_Metric().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.RoleDefinition.Properties.metric))
				basePart.updateMetric();
			if (SpemPackage.eINSTANCE.getDescribableElement_Category().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.RoleDefinition.Properties.category))
				basePart.updateCategory();
			if (SpemPackage.eINSTANCE.getDescribableElement_Copyright().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.copyright)) {
				if (msg.getNewValue() != null) {
					basePart.setCopyright(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCopyright("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Author().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.author)) {
				basePart.setAuthor(((RoleDefinition)semanticObject).getAuthor());
			}
			
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.changeDate)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setChangeDate("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.changeDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setChangeDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Version().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.version)) {
				if (msg.getNewValue() != null) {
					basePart.setVersion(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setVersion("");
				}
			}
			if (SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().equals(msg.getFeature()) && isAccessible(SpemViewsRepository.RoleDefinition.Properties.variabilityType))
				basePart.setVariabilityType((Enumerator)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.variabilityBasedOnElement))
				basePart.setVariabilityBasedOnElement((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getMethodContentElement_MethodContentKind().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.methodContentKind))
				basePart.setMethodContentKind((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getRoleDefinition_Synonym().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleDefinition.Properties.synonym)) {
				basePart.setSynonym(((RoleDefinition)semanticObject).getSynonym());
			}
			
			if (SpemPackage.eINSTANCE.getRoleDefinition_ProvidedQualification().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.RoleDefinition.Properties.providedQualification))
				basePart.updateProvidedQualification();
			
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
				if (SpemViewsRepository.RoleDefinition.Properties.presentationName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.RoleDefinition.Properties.briefDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.RoleDefinition.Properties.mainDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.RoleDefinition.Properties.purpose == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.RoleDefinition.Properties.copyright == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.RoleDefinition.Properties.author == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Author().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (SpemViewsRepository.RoleDefinition.Properties.changeDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.RoleDefinition.Properties.changeDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.RoleDefinition.Properties.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.RoleDefinition.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.RoleDefinition.Properties.variabilityType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.RoleDefinition.Properties.synonym == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getRoleDefinition_Synonym().getEAttributeType(), iterator.next()));
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
