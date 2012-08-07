/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.components;

// Start of user code for imports
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
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.obeonetwork.dsl.spem.MethodContentPackage;
import org.obeonetwork.dsl.spem.MethodContentPackageableElement;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.parts.MethodContentPackagePropertiesEditionPart;
import org.obeonetwork.dsl.spem.parts.SpemViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class MethodContentPackagePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for ownedMethodContentMember ReferencesTable
	 */
	protected ReferencesTableSettings ownedMethodContentMemberSettings;
	
	/**
	 * Settings for reusedPackage ReferencesTable
	 */
	private	ReferencesTableSettings reusedPackageSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public MethodContentPackagePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject methodContentPackage, String editing_mode) {
		super(editingContext, methodContentPackage, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SpemViewsRepository.class;
		partKey = SpemViewsRepository.MethodContentPackage.class;
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
			final MethodContentPackage methodContentPackage = (MethodContentPackage)elt;
			final MethodContentPackagePropertiesEditionPart basePart = (MethodContentPackagePropertiesEditionPart)editingPart;
			// init values
			if (methodContentPackage.getName() != null && isAccessible(SpemViewsRepository.MethodContentPackage.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), methodContentPackage.getName()));
			
			if (isAccessible(SpemViewsRepository.MethodContentPackage.Properties.ownedMethodContentMember)) {
				ownedMethodContentMemberSettings = new ReferencesTableSettings(methodContentPackage, SpemPackage.eINSTANCE.getMethodContentPackage_OwnedMethodContentMember());
				basePart.initOwnedMethodContentMember(ownedMethodContentMemberSettings);
			}
			if (isAccessible(SpemViewsRepository.MethodContentPackage.Properties.reusedPackage)) {
				reusedPackageSettings = new ReferencesTableSettings(methodContentPackage, SpemPackage.eINSTANCE.getMethodContentPackage_ReusedPackage());
				basePart.initReusedPackage(reusedPackageSettings);
			}
			// init filters
			
			basePart.addFilterToOwnedMethodContentMember(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof MethodContentPackageableElement); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for ownedMethodContentMember
			// End of user code
			
			basePart.addFilterToReusedPackage(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInReusedPackageTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToReusedPackage(new EObjectFilter(SpemPackage.eINSTANCE.getMethodContentPackage()));
			// Start of user code for additional businessfilters for reusedPackage
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
		if (editorKey == SpemViewsRepository.MethodContentPackage.Properties.name) {
			return SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name();
		}
		if (editorKey == SpemViewsRepository.MethodContentPackage.Properties.ownedMethodContentMember) {
			return SpemPackage.eINSTANCE.getMethodContentPackage_OwnedMethodContentMember();
		}
		if (editorKey == SpemViewsRepository.MethodContentPackage.Properties.reusedPackage) {
			return SpemPackage.eINSTANCE.getMethodContentPackage_ReusedPackage();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		MethodContentPackage methodContentPackage = (MethodContentPackage)semanticObject;
		if (SpemViewsRepository.MethodContentPackage.Properties.name == event.getAffectedEditor()) {
			methodContentPackage.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.MethodContentPackage.Properties.ownedMethodContentMember == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, ownedMethodContentMemberSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				ownedMethodContentMemberSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				ownedMethodContentMemberSettings.move(event.getNewIndex(), (MethodContentPackageableElement) event.getNewValue());
			}
		}
		if (SpemViewsRepository.MethodContentPackage.Properties.reusedPackage == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof MethodContentPackage) {
					reusedPackageSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				reusedPackageSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				reusedPackageSettings.move(event.getNewIndex(), (MethodContentPackage) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			MethodContentPackagePropertiesEditionPart basePart = (MethodContentPackagePropertiesEditionPart)editingPart;
			if (SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.MethodContentPackage.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SpemPackage.eINSTANCE.getMethodContentPackage_OwnedMethodContentMember().equals(msg.getFeature()) && isAccessible(SpemViewsRepository.MethodContentPackage.Properties.ownedMethodContentMember))
				basePart.updateOwnedMethodContentMember();
			if (SpemPackage.eINSTANCE.getMethodContentPackage_ReusedPackage().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.MethodContentPackage.Properties.reusedPackage))
				basePart.updateReusedPackage();
			
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
				if (SpemViewsRepository.MethodContentPackage.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().getEAttributeType(), newValue);
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
