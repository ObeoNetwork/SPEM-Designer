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
import org.obeonetwork.dsl.spem.MethodConfiguration;
import org.obeonetwork.dsl.spem.MethodContentPackage;
import org.obeonetwork.dsl.spem.MethodContentPackageableElement;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.uma.ConfigurationPackage;
import org.obeonetwork.dsl.spem.uma.UmaPackage;
import org.obeonetwork.dsl.spem.uma.parts.ConfigurationPackagePropertiesEditionPart;
import org.obeonetwork.dsl.spem.uma.parts.UmaViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ConfigurationPackagePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for ownedConfiguration ReferencesTable
	 */
	protected ReferencesTableSettings ownedConfigurationSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ConfigurationPackagePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject configurationPackage, String editing_mode) {
		super(editingContext, configurationPackage, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = UmaViewsRepository.class;
		partKey = UmaViewsRepository.ConfigurationPackage.class;
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
			final ConfigurationPackage configurationPackage = (ConfigurationPackage)elt;
			final ConfigurationPackagePropertiesEditionPart basePart = (ConfigurationPackagePropertiesEditionPart)editingPart;
			// init values
			if (configurationPackage.getName() != null && isAccessible(UmaViewsRepository.ConfigurationPackage.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), configurationPackage.getName()));
			
			if (isAccessible(UmaViewsRepository.ConfigurationPackage.Properties.ownedMethodContentMember)) {
				ownedMethodContentMemberSettings = new ReferencesTableSettings(configurationPackage, SpemPackage.eINSTANCE.getMethodContentPackage_OwnedMethodContentMember());
				basePart.initOwnedMethodContentMember(ownedMethodContentMemberSettings);
			}
			if (isAccessible(UmaViewsRepository.ConfigurationPackage.Properties.reusedPackage)) {
				reusedPackageSettings = new ReferencesTableSettings(configurationPackage, SpemPackage.eINSTANCE.getMethodContentPackage_ReusedPackage());
				basePart.initReusedPackage(reusedPackageSettings);
			}
			if (isAccessible(UmaViewsRepository.ConfigurationPackage.Properties.ownedConfiguration)) {
				ownedConfigurationSettings = new ReferencesTableSettings(configurationPackage, UmaPackage.eINSTANCE.getConfigurationPackage_OwnedConfiguration());
				basePart.initOwnedConfiguration(ownedConfigurationSettings);
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
			
			basePart.addFilterToOwnedConfiguration(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof MethodConfiguration); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for ownedConfiguration
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
		if (editorKey == UmaViewsRepository.ConfigurationPackage.Properties.name) {
			return SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name();
		}
		if (editorKey == UmaViewsRepository.ConfigurationPackage.Properties.ownedMethodContentMember) {
			return SpemPackage.eINSTANCE.getMethodContentPackage_OwnedMethodContentMember();
		}
		if (editorKey == UmaViewsRepository.ConfigurationPackage.Properties.reusedPackage) {
			return SpemPackage.eINSTANCE.getMethodContentPackage_ReusedPackage();
		}
		if (editorKey == UmaViewsRepository.ConfigurationPackage.Properties.ownedConfiguration) {
			return UmaPackage.eINSTANCE.getConfigurationPackage_OwnedConfiguration();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ConfigurationPackage configurationPackage = (ConfigurationPackage)semanticObject;
		if (UmaViewsRepository.ConfigurationPackage.Properties.name == event.getAffectedEditor()) {
			configurationPackage.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (UmaViewsRepository.ConfigurationPackage.Properties.ownedMethodContentMember == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.ConfigurationPackage.Properties.reusedPackage == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.ConfigurationPackage.Properties.ownedConfiguration == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, ownedConfigurationSettings, editingContext.getAdapterFactory());
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
				ownedConfigurationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				ownedConfigurationSettings.move(event.getNewIndex(), (MethodConfiguration) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ConfigurationPackagePropertiesEditionPart basePart = (ConfigurationPackagePropertiesEditionPart)editingPart;
			if (SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.ConfigurationPackage.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SpemPackage.eINSTANCE.getMethodContentPackage_OwnedMethodContentMember().equals(msg.getFeature()) && isAccessible(UmaViewsRepository.ConfigurationPackage.Properties.ownedMethodContentMember))
				basePart.updateOwnedMethodContentMember();
			if (SpemPackage.eINSTANCE.getMethodContentPackage_ReusedPackage().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.ConfigurationPackage.Properties.reusedPackage))
				basePart.updateReusedPackage();
			if (UmaPackage.eINSTANCE.getConfigurationPackage_OwnedConfiguration().equals(msg.getFeature()) && isAccessible(UmaViewsRepository.ConfigurationPackage.Properties.ownedConfiguration))
				basePart.updateOwnedConfiguration();
			
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
				if (UmaViewsRepository.ConfigurationPackage.Properties.name == event.getAffectedEditor()) {
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
