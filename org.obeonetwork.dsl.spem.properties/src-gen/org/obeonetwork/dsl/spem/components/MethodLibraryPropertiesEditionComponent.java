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
import org.obeonetwork.dsl.spem.MethodConfiguration;
import org.obeonetwork.dsl.spem.MethodLibrary;
import org.obeonetwork.dsl.spem.MethodPlugin;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.parts.MethodLibraryPropertiesEditionPart;
import org.obeonetwork.dsl.spem.parts.SpemViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class MethodLibraryPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for ownedMethodPlugin ReferencesTable
	 */
	protected ReferencesTableSettings ownedMethodPluginSettings;
	
	/**
	 * Settings for predefinedConfiguration ReferencesTable
	 */
	protected ReferencesTableSettings predefinedConfigurationSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public MethodLibraryPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject methodLibrary, String editing_mode) {
		super(editingContext, methodLibrary, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SpemViewsRepository.class;
		partKey = SpemViewsRepository.MethodLibrary.class;
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
			final MethodLibrary methodLibrary = (MethodLibrary)elt;
			final MethodLibraryPropertiesEditionPart basePart = (MethodLibraryPropertiesEditionPart)editingPart;
			// init values
			if (methodLibrary.getName() != null && isAccessible(SpemViewsRepository.MethodLibrary.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), methodLibrary.getName()));
			
			if (isAccessible(SpemViewsRepository.MethodLibrary.Properties.ownedMethodPlugin)) {
				ownedMethodPluginSettings = new ReferencesTableSettings(methodLibrary, SpemPackage.eINSTANCE.getMethodLibrary_OwnedMethodPlugin());
				basePart.initOwnedMethodPlugin(ownedMethodPluginSettings);
			}
			if (isAccessible(SpemViewsRepository.MethodLibrary.Properties.predefinedConfiguration)) {
				predefinedConfigurationSettings = new ReferencesTableSettings(methodLibrary, SpemPackage.eINSTANCE.getMethodLibrary_PredefinedConfiguration());
				basePart.initPredefinedConfiguration(predefinedConfigurationSettings);
			}
			// init filters
			
			basePart.addFilterToOwnedMethodPlugin(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof MethodPlugin); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for ownedMethodPlugin
			// End of user code
			
			basePart.addFilterToPredefinedConfiguration(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof MethodConfiguration); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for predefinedConfiguration
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
		if (editorKey == SpemViewsRepository.MethodLibrary.Properties.name) {
			return SpemPackage.eINSTANCE.getMethodLibrary_Name();
		}
		if (editorKey == SpemViewsRepository.MethodLibrary.Properties.ownedMethodPlugin) {
			return SpemPackage.eINSTANCE.getMethodLibrary_OwnedMethodPlugin();
		}
		if (editorKey == SpemViewsRepository.MethodLibrary.Properties.predefinedConfiguration) {
			return SpemPackage.eINSTANCE.getMethodLibrary_PredefinedConfiguration();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		MethodLibrary methodLibrary = (MethodLibrary)semanticObject;
		if (SpemViewsRepository.MethodLibrary.Properties.name == event.getAffectedEditor()) {
			methodLibrary.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.MethodLibrary.Properties.ownedMethodPlugin == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, ownedMethodPluginSettings, editingContext.getAdapterFactory());
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
				ownedMethodPluginSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				ownedMethodPluginSettings.move(event.getNewIndex(), (MethodPlugin) event.getNewValue());
			}
		}
		if (SpemViewsRepository.MethodLibrary.Properties.predefinedConfiguration == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, predefinedConfigurationSettings, editingContext.getAdapterFactory());
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
				predefinedConfigurationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				predefinedConfigurationSettings.move(event.getNewIndex(), (MethodConfiguration) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			MethodLibraryPropertiesEditionPart basePart = (MethodLibraryPropertiesEditionPart)editingPart;
			if (SpemPackage.eINSTANCE.getMethodLibrary_Name().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.MethodLibrary.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SpemPackage.eINSTANCE.getMethodLibrary_OwnedMethodPlugin().equals(msg.getFeature()) && isAccessible(SpemViewsRepository.MethodLibrary.Properties.ownedMethodPlugin))
				basePart.updateOwnedMethodPlugin();
			if (SpemPackage.eINSTANCE.getMethodLibrary_PredefinedConfiguration().equals(msg.getFeature()) && isAccessible(SpemViewsRepository.MethodLibrary.Properties.predefinedConfiguration))
				basePart.updatePredefinedConfiguration();
			
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
				if (SpemViewsRepository.MethodLibrary.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getMethodLibrary_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getMethodLibrary_Name().getEAttributeType(), newValue);
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
