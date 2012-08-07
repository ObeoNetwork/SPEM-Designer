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
import org.obeonetwork.dsl.spem.MethodPlugin;
import org.obeonetwork.dsl.spem.ProcessPackage;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.parts.MethodPluginPropertiesEditionPart;
import org.obeonetwork.dsl.spem.parts.SpemViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class MethodPluginPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for ownedMethodContentPackage ReferencesTable
	 */
	protected ReferencesTableSettings ownedMethodContentPackageSettings;
	
	/**
	 * Settings for ownedProcessPackage ReferencesTable
	 */
	protected ReferencesTableSettings ownedProcessPackageSettings;
	
	/**
	 * Settings for basePlugin ReferencesTable
	 */
	private	ReferencesTableSettings basePluginSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public MethodPluginPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject methodPlugin, String editing_mode) {
		super(editingContext, methodPlugin, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SpemViewsRepository.class;
		partKey = SpemViewsRepository.MethodPlugin.class;
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
			final MethodPlugin methodPlugin = (MethodPlugin)elt;
			final MethodPluginPropertiesEditionPart basePart = (MethodPluginPropertiesEditionPart)editingPart;
			// init values
			if (methodPlugin.getName() != null && isAccessible(SpemViewsRepository.MethodPlugin.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), methodPlugin.getName()));
			
			if (isAccessible(SpemViewsRepository.MethodPlugin.Properties.ownedMethodContentPackage)) {
				ownedMethodContentPackageSettings = new ReferencesTableSettings(methodPlugin, SpemPackage.eINSTANCE.getMethodPlugin_OwnedMethodContentPackage());
				basePart.initOwnedMethodContentPackage(ownedMethodContentPackageSettings);
			}
			if (isAccessible(SpemViewsRepository.MethodPlugin.Properties.ownedProcessPackage)) {
				ownedProcessPackageSettings = new ReferencesTableSettings(methodPlugin, SpemPackage.eINSTANCE.getMethodPlugin_OwnedProcessPackage());
				basePart.initOwnedProcessPackage(ownedProcessPackageSettings);
			}
			if (isAccessible(SpemViewsRepository.MethodPlugin.Properties.basePlugin)) {
				basePluginSettings = new ReferencesTableSettings(methodPlugin, SpemPackage.eINSTANCE.getMethodPlugin_BasePlugin());
				basePart.initBasePlugin(basePluginSettings);
			}
			// init filters
			
			basePart.addFilterToOwnedMethodContentPackage(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof MethodContentPackage); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for ownedMethodContentPackage
			// End of user code
			
			basePart.addFilterToOwnedProcessPackage(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ProcessPackage); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for ownedProcessPackage
			// End of user code
			
			basePart.addFilterToBasePlugin(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInBasePluginTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToBasePlugin(new EObjectFilter(SpemPackage.eINSTANCE.getMethodPlugin()));
			// Start of user code for additional businessfilters for basePlugin
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
		if (editorKey == SpemViewsRepository.MethodPlugin.Properties.name) {
			return SpemPackage.eINSTANCE.getMethodLibraryPackageableElement_Name();
		}
		if (editorKey == SpemViewsRepository.MethodPlugin.Properties.ownedMethodContentPackage) {
			return SpemPackage.eINSTANCE.getMethodPlugin_OwnedMethodContentPackage();
		}
		if (editorKey == SpemViewsRepository.MethodPlugin.Properties.ownedProcessPackage) {
			return SpemPackage.eINSTANCE.getMethodPlugin_OwnedProcessPackage();
		}
		if (editorKey == SpemViewsRepository.MethodPlugin.Properties.basePlugin) {
			return SpemPackage.eINSTANCE.getMethodPlugin_BasePlugin();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		MethodPlugin methodPlugin = (MethodPlugin)semanticObject;
		if (SpemViewsRepository.MethodPlugin.Properties.name == event.getAffectedEditor()) {
			methodPlugin.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.MethodPlugin.Properties.ownedMethodContentPackage == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, ownedMethodContentPackageSettings, editingContext.getAdapterFactory());
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
				ownedMethodContentPackageSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				ownedMethodContentPackageSettings.move(event.getNewIndex(), (MethodContentPackage) event.getNewValue());
			}
		}
		if (SpemViewsRepository.MethodPlugin.Properties.ownedProcessPackage == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, ownedProcessPackageSettings, editingContext.getAdapterFactory());
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
				ownedProcessPackageSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				ownedProcessPackageSettings.move(event.getNewIndex(), (ProcessPackage) event.getNewValue());
			}
		}
		if (SpemViewsRepository.MethodPlugin.Properties.basePlugin == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof MethodPlugin) {
					basePluginSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				basePluginSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				basePluginSettings.move(event.getNewIndex(), (MethodPlugin) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			MethodPluginPropertiesEditionPart basePart = (MethodPluginPropertiesEditionPart)editingPart;
			if (SpemPackage.eINSTANCE.getMethodLibraryPackageableElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.MethodPlugin.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SpemPackage.eINSTANCE.getMethodPlugin_OwnedMethodContentPackage().equals(msg.getFeature()) && isAccessible(SpemViewsRepository.MethodPlugin.Properties.ownedMethodContentPackage))
				basePart.updateOwnedMethodContentPackage();
			if (SpemPackage.eINSTANCE.getMethodPlugin_OwnedProcessPackage().equals(msg.getFeature()) && isAccessible(SpemViewsRepository.MethodPlugin.Properties.ownedProcessPackage))
				basePart.updateOwnedProcessPackage();
			if (SpemPackage.eINSTANCE.getMethodPlugin_BasePlugin().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.MethodPlugin.Properties.basePlugin))
				basePart.updateBasePlugin();
			
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
				if (SpemViewsRepository.MethodPlugin.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SpemPackage.eINSTANCE.getMethodLibraryPackageableElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getMethodLibraryPackageableElement_Name().getEAttributeType(), newValue);
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
