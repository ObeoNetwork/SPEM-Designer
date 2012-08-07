/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.uma.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.obeonetwork.dsl.spem.ProcessPackageableElement;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.uma.ProcessComponentPackage;
import org.obeonetwork.dsl.spem.uma.parts.ProcessComponentPackagePropertiesEditionPart;
import org.obeonetwork.dsl.spem.uma.parts.UmaViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ProcessComponentPackagePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for ownedProcessMember ReferencesTable
	 */
	protected ReferencesTableSettings ownedProcessMemberSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ProcessComponentPackagePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject processComponentPackage, String editing_mode) {
		super(editingContext, processComponentPackage, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = UmaViewsRepository.class;
		partKey = UmaViewsRepository.ProcessComponentPackage.class;
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
			final ProcessComponentPackage processComponentPackage = (ProcessComponentPackage)elt;
			final ProcessComponentPackagePropertiesEditionPart basePart = (ProcessComponentPackagePropertiesEditionPart)editingPart;
			// init values
			if (processComponentPackage.getName() != null && isAccessible(UmaViewsRepository.ProcessComponentPackage.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), processComponentPackage.getName()));
			
			if (isAccessible(UmaViewsRepository.ProcessComponentPackage.Properties.ownedProcessMember)) {
				ownedProcessMemberSettings = new ReferencesTableSettings(processComponentPackage, SpemPackage.eINSTANCE.getProcessPackage_OwnedProcessMember());
				basePart.initOwnedProcessMember(ownedProcessMemberSettings);
			}
			// init filters
			
			basePart.addFilterToOwnedProcessMember(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ProcessPackageableElement); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for ownedProcessMember
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
		if (editorKey == UmaViewsRepository.ProcessComponentPackage.Properties.name) {
			return SpemPackage.eINSTANCE.getProcessPackageableElement_Name();
		}
		if (editorKey == UmaViewsRepository.ProcessComponentPackage.Properties.ownedProcessMember) {
			return SpemPackage.eINSTANCE.getProcessPackage_OwnedProcessMember();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ProcessComponentPackage processComponentPackage = (ProcessComponentPackage)semanticObject;
		if (UmaViewsRepository.ProcessComponentPackage.Properties.name == event.getAffectedEditor()) {
			processComponentPackage.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.ProcessComponentPackage.Properties.ownedProcessMember == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, ownedProcessMemberSettings, editingContext.getAdapterFactory());
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
				ownedProcessMemberSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				ownedProcessMemberSettings.move(event.getNewIndex(), (ProcessPackageableElement) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ProcessComponentPackagePropertiesEditionPart basePart = (ProcessComponentPackagePropertiesEditionPart)editingPart;
			if (SpemPackage.eINSTANCE.getProcessPackageableElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ProcessComponentPackage.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SpemPackage.eINSTANCE.getProcessPackage_OwnedProcessMember().equals(msg.getFeature()) && isAccessible(UmaViewsRepository.ProcessComponentPackage.Properties.ownedProcessMember))
				basePart.updateOwnedProcessMember();
			
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
				if (UmaViewsRepository.ProcessComponentPackage.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getProcessPackageableElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getProcessPackageableElement_Name().getEAttributeType(), newValue);
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
