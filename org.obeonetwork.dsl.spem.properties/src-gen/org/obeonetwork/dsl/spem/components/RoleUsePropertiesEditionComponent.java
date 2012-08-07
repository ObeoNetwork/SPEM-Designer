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
import org.obeonetwork.dsl.spem.RoleDefinition;
import org.obeonetwork.dsl.spem.RoleUse;
import org.obeonetwork.dsl.spem.SpemFactory;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.parts.RoleUsePropertiesEditionPart;
import org.obeonetwork.dsl.spem.parts.SpemViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class RoleUsePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for role EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings roleSettings;
	
	/**
	 * Settings for appliedQualification ReferencesTable
	 */
	private	ReferencesTableSettings appliedQualificationSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public RoleUsePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject roleUse, String editing_mode) {
		super(editingContext, roleUse, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SpemViewsRepository.class;
		partKey = SpemViewsRepository.RoleUse.class;
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
			final RoleUse roleUse = (RoleUse)elt;
			final RoleUsePropertiesEditionPart basePart = (RoleUsePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SpemViewsRepository.RoleUse.Properties.kind)) {
				// init part
				kindSettings = new EObjectFlatComboSettings(roleUse, SpemPackage.eINSTANCE.getExtensibleElement_Kind());
				basePart.initKind(kindSettings);
				// set the button mode
				basePart.setKindButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (roleUse.getPresentationName() != null && isAccessible(SpemViewsRepository.RoleUse.Properties.presentationName))
				basePart.setPresentationName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), roleUse.getPresentationName()));
			
			if (roleUse.getBriefDescription() != null && isAccessible(SpemViewsRepository.RoleUse.Properties.briefDescription))
				basePart.setBriefDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), roleUse.getBriefDescription()));
			
			if (roleUse.getMainDescription() != null && isAccessible(SpemViewsRepository.RoleUse.Properties.mainDescription))
				basePart.setMainDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), roleUse.getMainDescription()));
			
			if (roleUse.getPurpose() != null && isAccessible(SpemViewsRepository.RoleUse.Properties.purpose))
				basePart.setPurpose(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), roleUse.getPurpose()));
			
			if (isAccessible(SpemViewsRepository.RoleUse.Properties.guidance)) {
				guidanceSettings = new ReferencesTableSettings(roleUse, SpemPackage.eINSTANCE.getDescribableElement_Guidance());
				basePart.initGuidance(guidanceSettings);
			}
			if (isAccessible(SpemViewsRepository.RoleUse.Properties.metric)) {
				metricSettings = new ReferencesTableSettings(roleUse, SpemPackage.eINSTANCE.getDescribableElement_Metric());
				basePart.initMetric(metricSettings);
			}
			if (isAccessible(SpemViewsRepository.RoleUse.Properties.category)) {
				categorySettings = new ReferencesTableSettings(roleUse, SpemPackage.eINSTANCE.getDescribableElement_Category());
				basePart.initCategory(categorySettings);
			}
			if (roleUse.getCopyright() != null && isAccessible(SpemViewsRepository.RoleUse.Properties.copyright))
				basePart.setCopyright(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), roleUse.getCopyright()));
			
			if (roleUse.getAuthor() != null && isAccessible(SpemViewsRepository.RoleUse.Properties.author))
				basePart.setAuthor(roleUse.getAuthor());
			
			if (roleUse.getChangeDate() != null && isAccessible(SpemViewsRepository.RoleUse.Properties.changeDate))
				basePart.setChangeDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), roleUse.getChangeDate()));
			
			if (roleUse.getChangeDescription() != null && isAccessible(SpemViewsRepository.RoleUse.Properties.changeDescription))
				basePart.setChangeDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), roleUse.getChangeDescription()));
			
			if (roleUse.getVersion() != null && isAccessible(SpemViewsRepository.RoleUse.Properties.version))
				basePart.setVersion(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), roleUse.getVersion()));
			
			if (roleUse.getName() != null && isAccessible(SpemViewsRepository.RoleUse.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), roleUse.getName()));
			
			if (isAccessible(SpemViewsRepository.RoleUse.Properties.hasMultipleOccurrences)) {
				basePart.setHasMultipleOccurrences(roleUse.isHasMultipleOccurrences());
			}
			if (isAccessible(SpemViewsRepository.RoleUse.Properties.isOptional)) {
				basePart.setIsOptional(roleUse.isIsOptional());
			}
			if (isAccessible(SpemViewsRepository.RoleUse.Properties.isPlanned)) {
				basePart.setIsPlanned(roleUse.isIsPlanned());
			}
			if (isAccessible(SpemViewsRepository.RoleUse.Properties.isSynchronizedWithSource)) {
				basePart.setIsSynchronizedWithSource(roleUse.isIsSynchronizedWithSource());
			}
			if (isAccessible(SpemViewsRepository.RoleUse.Properties.role)) {
				// init part
				roleSettings = new EObjectFlatComboSettings(roleUse, SpemPackage.eINSTANCE.getRoleUse_Role());
				basePart.initRole(roleSettings);
				// set the button mode
				basePart.setRoleButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SpemViewsRepository.RoleUse.Properties.appliedQualification)) {
				appliedQualificationSettings = new ReferencesTableSettings(roleUse, SpemPackage.eINSTANCE.getRoleUse_AppliedQualification());
				basePart.initAppliedQualification(appliedQualificationSettings);
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
			
			
			
			
			
			
			
			
			
			
			
			basePart.addFilterToRole(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof RoleDefinition); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for role
			// End of user code
			
			basePart.addFilterToAppliedQualification(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInAppliedQualificationTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToAppliedQualification(new EObjectFilter(SpemPackage.eINSTANCE.getQualification()));
			// Start of user code for additional businessfilters for appliedQualification
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
		if (editorKey == SpemViewsRepository.RoleUse.Properties.kind) {
			return SpemPackage.eINSTANCE.getExtensibleElement_Kind();
		}
		if (editorKey == SpemViewsRepository.RoleUse.Properties.presentationName) {
			return SpemPackage.eINSTANCE.getDescribableElement_PresentationName();
		}
		if (editorKey == SpemViewsRepository.RoleUse.Properties.briefDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_BriefDescription();
		}
		if (editorKey == SpemViewsRepository.RoleUse.Properties.mainDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_MainDescription();
		}
		if (editorKey == SpemViewsRepository.RoleUse.Properties.purpose) {
			return SpemPackage.eINSTANCE.getDescribableElement_Purpose();
		}
		if (editorKey == SpemViewsRepository.RoleUse.Properties.guidance) {
			return SpemPackage.eINSTANCE.getDescribableElement_Guidance();
		}
		if (editorKey == SpemViewsRepository.RoleUse.Properties.metric) {
			return SpemPackage.eINSTANCE.getDescribableElement_Metric();
		}
		if (editorKey == SpemViewsRepository.RoleUse.Properties.category) {
			return SpemPackage.eINSTANCE.getDescribableElement_Category();
		}
		if (editorKey == SpemViewsRepository.RoleUse.Properties.copyright) {
			return SpemPackage.eINSTANCE.getDescribableElement_Copyright();
		}
		if (editorKey == SpemViewsRepository.RoleUse.Properties.author) {
			return SpemPackage.eINSTANCE.getDescribableElement_Author();
		}
		if (editorKey == SpemViewsRepository.RoleUse.Properties.changeDate) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDate();
		}
		if (editorKey == SpemViewsRepository.RoleUse.Properties.changeDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription();
		}
		if (editorKey == SpemViewsRepository.RoleUse.Properties.version) {
			return SpemPackage.eINSTANCE.getDescribableElement_Version();
		}
		if (editorKey == SpemViewsRepository.RoleUse.Properties.name) {
			return SpemPackage.eINSTANCE.getProcessPackageableElement_Name();
		}
		if (editorKey == SpemViewsRepository.RoleUse.Properties.hasMultipleOccurrences) {
			return SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences();
		}
		if (editorKey == SpemViewsRepository.RoleUse.Properties.isOptional) {
			return SpemPackage.eINSTANCE.getBreakdownElement_IsOptional();
		}
		if (editorKey == SpemViewsRepository.RoleUse.Properties.isPlanned) {
			return SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned();
		}
		if (editorKey == SpemViewsRepository.RoleUse.Properties.isSynchronizedWithSource) {
			return SpemPackage.eINSTANCE.getMethodContentUse_IsSynchronizedWithSource();
		}
		if (editorKey == SpemViewsRepository.RoleUse.Properties.role) {
			return SpemPackage.eINSTANCE.getRoleUse_Role();
		}
		if (editorKey == SpemViewsRepository.RoleUse.Properties.appliedQualification) {
			return SpemPackage.eINSTANCE.getRoleUse_AppliedQualification();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		RoleUse roleUse = (RoleUse)semanticObject;
		if (SpemViewsRepository.RoleUse.Properties.kind == event.getAffectedEditor()) {
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
		if (SpemViewsRepository.RoleUse.Properties.presentationName == event.getAffectedEditor()) {
			roleUse.setPresentationName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.RoleUse.Properties.briefDescription == event.getAffectedEditor()) {
			roleUse.setBriefDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.RoleUse.Properties.mainDescription == event.getAffectedEditor()) {
			roleUse.setMainDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.RoleUse.Properties.purpose == event.getAffectedEditor()) {
			roleUse.setPurpose((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.RoleUse.Properties.guidance == event.getAffectedEditor()) {
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
		if (SpemViewsRepository.RoleUse.Properties.metric == event.getAffectedEditor()) {
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
		if (SpemViewsRepository.RoleUse.Properties.category == event.getAffectedEditor()) {
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
		if (SpemViewsRepository.RoleUse.Properties.copyright == event.getAffectedEditor()) {
			roleUse.setCopyright((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.RoleUse.Properties.author == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				roleUse.getAuthor().clear();
				roleUse.getAuthor().addAll(((List) event.getNewValue()));
			}
		}
		if (SpemViewsRepository.RoleUse.Properties.changeDate == event.getAffectedEditor()) {
			roleUse.setChangeDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.RoleUse.Properties.changeDescription == event.getAffectedEditor()) {
			roleUse.setChangeDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.RoleUse.Properties.version == event.getAffectedEditor()) {
			roleUse.setVersion((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.RoleUse.Properties.name == event.getAffectedEditor()) {
			roleUse.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.RoleUse.Properties.hasMultipleOccurrences == event.getAffectedEditor()) {
			roleUse.setHasMultipleOccurrences((Boolean)event.getNewValue());
		}
		if (SpemViewsRepository.RoleUse.Properties.isOptional == event.getAffectedEditor()) {
			roleUse.setIsOptional((Boolean)event.getNewValue());
		}
		if (SpemViewsRepository.RoleUse.Properties.isPlanned == event.getAffectedEditor()) {
			roleUse.setIsPlanned((Boolean)event.getNewValue());
		}
		if (SpemViewsRepository.RoleUse.Properties.isSynchronizedWithSource == event.getAffectedEditor()) {
			roleUse.setIsSynchronizedWithSource((Boolean)event.getNewValue());
		}
		if (SpemViewsRepository.RoleUse.Properties.role == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				roleSettings.setToReference((RoleDefinition)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				RoleDefinition eObject = SpemFactory.eINSTANCE.createRoleDefinition();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				roleSettings.setToReference(eObject);
			}
		}
		if (SpemViewsRepository.RoleUse.Properties.appliedQualification == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Qualification) {
					appliedQualificationSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				appliedQualificationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				appliedQualificationSettings.move(event.getNewIndex(), (Qualification) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			RoleUsePropertiesEditionPart basePart = (RoleUsePropertiesEditionPart)editingPart;
			if (SpemPackage.eINSTANCE.getExtensibleElement_Kind().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleUse.Properties.kind))
				basePart.setKind((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getDescribableElement_PresentationName().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleUse.Properties.presentationName)) {
				if (msg.getNewValue() != null) {
					basePart.setPresentationName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPresentationName("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleUse.Properties.briefDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setBriefDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setBriefDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_MainDescription().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleUse.Properties.mainDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setMainDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setMainDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Purpose().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleUse.Properties.purpose)) {
				if (msg.getNewValue() != null) {
					basePart.setPurpose(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPurpose("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Guidance().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.RoleUse.Properties.guidance))
				basePart.updateGuidance();
			if (SpemPackage.eINSTANCE.getDescribableElement_Metric().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.RoleUse.Properties.metric))
				basePart.updateMetric();
			if (SpemPackage.eINSTANCE.getDescribableElement_Category().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.RoleUse.Properties.category))
				basePart.updateCategory();
			if (SpemPackage.eINSTANCE.getDescribableElement_Copyright().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleUse.Properties.copyright)) {
				if (msg.getNewValue() != null) {
					basePart.setCopyright(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCopyright("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Author().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleUse.Properties.author)) {
				basePart.setAuthor(((RoleUse)semanticObject).getAuthor());
			}
			
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleUse.Properties.changeDate)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setChangeDate("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleUse.Properties.changeDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setChangeDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Version().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleUse.Properties.version)) {
				if (msg.getNewValue() != null) {
					basePart.setVersion(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setVersion("");
				}
			}
			if (SpemPackage.eINSTANCE.getProcessPackageableElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleUse.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleUse.Properties.hasMultipleOccurrences))
				basePart.setHasMultipleOccurrences((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleUse.Properties.isOptional))
				basePart.setIsOptional((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleUse.Properties.isPlanned))
				basePart.setIsPlanned((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getMethodContentUse_IsSynchronizedWithSource().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleUse.Properties.isSynchronizedWithSource))
				basePart.setIsSynchronizedWithSource((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getRoleUse_Role().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.RoleUse.Properties.role))
				basePart.setRole((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getRoleUse_AppliedQualification().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.RoleUse.Properties.appliedQualification))
				basePart.updateAppliedQualification();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SpemViewsRepository.RoleUse.Properties.hasMultipleOccurrences || key == SpemViewsRepository.RoleUse.Properties.isOptional || key == SpemViewsRepository.RoleUse.Properties.isPlanned;
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
				if (SpemViewsRepository.RoleUse.Properties.presentationName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.RoleUse.Properties.briefDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.RoleUse.Properties.mainDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.RoleUse.Properties.purpose == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.RoleUse.Properties.copyright == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.RoleUse.Properties.author == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Author().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (SpemViewsRepository.RoleUse.Properties.changeDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.RoleUse.Properties.changeDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.RoleUse.Properties.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.RoleUse.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getProcessPackageableElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getProcessPackageableElement_Name().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.RoleUse.Properties.hasMultipleOccurrences == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.RoleUse.Properties.isOptional == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.RoleUse.Properties.isPlanned == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().getEAttributeType(), newValue);
				}
				if (SpemViewsRepository.RoleUse.Properties.isSynchronizedWithSource == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getMethodContentUse_IsSynchronizedWithSource().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getMethodContentUse_IsSynchronizedWithSource().getEAttributeType(), newValue);
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
