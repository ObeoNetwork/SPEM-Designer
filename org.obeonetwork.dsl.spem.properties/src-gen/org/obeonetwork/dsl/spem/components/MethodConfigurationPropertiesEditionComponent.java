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
import org.obeonetwork.dsl.spem.MethodConfiguration;
import org.obeonetwork.dsl.spem.MethodContentPackage;
import org.obeonetwork.dsl.spem.ProcessPackage;
import org.obeonetwork.dsl.spem.SpemFactory;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.parts.MethodConfigurationPropertiesEditionPart;
import org.obeonetwork.dsl.spem.parts.SpemViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class MethodConfigurationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for baseConfiguration ReferencesTable
	 */
	private	ReferencesTableSettings baseConfigurationSettings;
	
	/**
	 * Settings for processPackageSelection ReferencesTable
	 */
	private	ReferencesTableSettings processPackageSelectionSettings;
	
	/**
	 * Settings for contentPackageSelection ReferencesTable
	 */
	private	ReferencesTableSettings contentPackageSelectionSettings;
	
	/**
	 * Settings for substractedCategory ReferencesTable
	 */
	private	ReferencesTableSettings substractedCategorySettings;
	
	/**
	 * Settings for defaultView EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings defaultViewSettings;
	
	/**
	 * Settings for processView ReferencesTable
	 */
	private	ReferencesTableSettings processViewSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public MethodConfigurationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject methodConfiguration, String editing_mode) {
		super(editingContext, methodConfiguration, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SpemViewsRepository.class;
		partKey = SpemViewsRepository.MethodConfiguration.class;
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
			final MethodConfiguration methodConfiguration = (MethodConfiguration)elt;
			final MethodConfigurationPropertiesEditionPart basePart = (MethodConfigurationPropertiesEditionPart)editingPart;
			// init values
			if (methodConfiguration.getName() != null && isAccessible(SpemViewsRepository.MethodConfiguration.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), methodConfiguration.getName()));
			
			if (isAccessible(SpemViewsRepository.MethodConfiguration.Properties.baseConfiguration)) {
				baseConfigurationSettings = new ReferencesTableSettings(methodConfiguration, SpemPackage.eINSTANCE.getMethodConfiguration_BaseConfiguration());
				basePart.initBaseConfiguration(baseConfigurationSettings);
			}
			if (isAccessible(SpemViewsRepository.MethodConfiguration.Properties.processPackageSelection)) {
				processPackageSelectionSettings = new ReferencesTableSettings(methodConfiguration, SpemPackage.eINSTANCE.getMethodConfiguration_ProcessPackageSelection());
				basePart.initProcessPackageSelection(processPackageSelectionSettings);
			}
			if (isAccessible(SpemViewsRepository.MethodConfiguration.Properties.contentPackageSelection)) {
				contentPackageSelectionSettings = new ReferencesTableSettings(methodConfiguration, SpemPackage.eINSTANCE.getMethodConfiguration_ContentPackageSelection());
				basePart.initContentPackageSelection(contentPackageSelectionSettings);
			}
			if (isAccessible(SpemViewsRepository.MethodConfiguration.Properties.substractedCategory)) {
				substractedCategorySettings = new ReferencesTableSettings(methodConfiguration, SpemPackage.eINSTANCE.getMethodConfiguration_SubstractedCategory());
				basePart.initSubstractedCategory(substractedCategorySettings);
			}
			if (isAccessible(SpemViewsRepository.MethodConfiguration.Properties.defaultView)) {
				// init part
				defaultViewSettings = new EObjectFlatComboSettings(methodConfiguration, SpemPackage.eINSTANCE.getMethodConfiguration_DefaultView());
				basePart.initDefaultView(defaultViewSettings);
				// set the button mode
				basePart.setDefaultViewButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SpemViewsRepository.MethodConfiguration.Properties.processView)) {
				processViewSettings = new ReferencesTableSettings(methodConfiguration, SpemPackage.eINSTANCE.getMethodConfiguration_ProcessView());
				basePart.initProcessView(processViewSettings);
			}
			// init filters
			
			basePart.addFilterToBaseConfiguration(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInBaseConfigurationTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToBaseConfiguration(new EObjectFilter(SpemPackage.eINSTANCE.getMethodConfiguration()));
			// Start of user code for additional businessfilters for baseConfiguration
			// End of user code
			
			basePart.addFilterToProcessPackageSelection(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInProcessPackageSelectionTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToProcessPackageSelection(new EObjectFilter(SpemPackage.eINSTANCE.getProcessPackage()));
			// Start of user code for additional businessfilters for processPackageSelection
			// End of user code
			
			basePart.addFilterToContentPackageSelection(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInContentPackageSelectionTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToContentPackageSelection(new EObjectFilter(SpemPackage.eINSTANCE.getMethodContentPackage()));
			// Start of user code for additional businessfilters for contentPackageSelection
			// End of user code
			
			basePart.addFilterToSubstractedCategory(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInSubstractedCategoryTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToSubstractedCategory(new EObjectFilter(SpemPackage.eINSTANCE.getCategory()));
			// Start of user code for additional businessfilters for substractedCategory
			// End of user code
			
			basePart.addFilterToDefaultView(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof Category);
				}
			
			});
			// Start of user code for additional businessfilters for defaultView
			// End of user code
			
			basePart.addFilterToProcessView(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInProcessViewTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToProcessView(new EObjectFilter(SpemPackage.eINSTANCE.getCategory()));
			// Start of user code for additional businessfilters for processView
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
		if (editorKey == SpemViewsRepository.MethodConfiguration.Properties.name) {
			return SpemPackage.eINSTANCE.getMethodLibraryPackageableElement_Name();
		}
		if (editorKey == SpemViewsRepository.MethodConfiguration.Properties.baseConfiguration) {
			return SpemPackage.eINSTANCE.getMethodConfiguration_BaseConfiguration();
		}
		if (editorKey == SpemViewsRepository.MethodConfiguration.Properties.processPackageSelection) {
			return SpemPackage.eINSTANCE.getMethodConfiguration_ProcessPackageSelection();
		}
		if (editorKey == SpemViewsRepository.MethodConfiguration.Properties.contentPackageSelection) {
			return SpemPackage.eINSTANCE.getMethodConfiguration_ContentPackageSelection();
		}
		if (editorKey == SpemViewsRepository.MethodConfiguration.Properties.substractedCategory) {
			return SpemPackage.eINSTANCE.getMethodConfiguration_SubstractedCategory();
		}
		if (editorKey == SpemViewsRepository.MethodConfiguration.Properties.defaultView) {
			return SpemPackage.eINSTANCE.getMethodConfiguration_DefaultView();
		}
		if (editorKey == SpemViewsRepository.MethodConfiguration.Properties.processView) {
			return SpemPackage.eINSTANCE.getMethodConfiguration_ProcessView();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		MethodConfiguration methodConfiguration = (MethodConfiguration)semanticObject;
		if (SpemViewsRepository.MethodConfiguration.Properties.name == event.getAffectedEditor()) {
			methodConfiguration.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (SpemViewsRepository.MethodConfiguration.Properties.baseConfiguration == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof MethodConfiguration) {
					baseConfigurationSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				baseConfigurationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				baseConfigurationSettings.move(event.getNewIndex(), (MethodConfiguration) event.getNewValue());
			}
		}
		if (SpemViewsRepository.MethodConfiguration.Properties.processPackageSelection == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ProcessPackage) {
					processPackageSelectionSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				processPackageSelectionSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				processPackageSelectionSettings.move(event.getNewIndex(), (ProcessPackage) event.getNewValue());
			}
		}
		if (SpemViewsRepository.MethodConfiguration.Properties.contentPackageSelection == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof MethodContentPackage) {
					contentPackageSelectionSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				contentPackageSelectionSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				contentPackageSelectionSettings.move(event.getNewIndex(), (MethodContentPackage) event.getNewValue());
			}
		}
		if (SpemViewsRepository.MethodConfiguration.Properties.substractedCategory == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Category) {
					substractedCategorySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				substractedCategorySettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				substractedCategorySettings.move(event.getNewIndex(), (Category) event.getNewValue());
			}
		}
		if (SpemViewsRepository.MethodConfiguration.Properties.defaultView == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				defaultViewSettings.setToReference((Category)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Category eObject = SpemFactory.eINSTANCE.createCategory();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				defaultViewSettings.setToReference(eObject);
			}
		}
		if (SpemViewsRepository.MethodConfiguration.Properties.processView == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Category) {
					processViewSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				processViewSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				processViewSettings.move(event.getNewIndex(), (Category) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			MethodConfigurationPropertiesEditionPart basePart = (MethodConfigurationPropertiesEditionPart)editingPart;
			if (SpemPackage.eINSTANCE.getMethodLibraryPackageableElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.MethodConfiguration.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SpemPackage.eINSTANCE.getMethodConfiguration_BaseConfiguration().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.MethodConfiguration.Properties.baseConfiguration))
				basePart.updateBaseConfiguration();
			if (SpemPackage.eINSTANCE.getMethodConfiguration_ProcessPackageSelection().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.MethodConfiguration.Properties.processPackageSelection))
				basePart.updateProcessPackageSelection();
			if (SpemPackage.eINSTANCE.getMethodConfiguration_ContentPackageSelection().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.MethodConfiguration.Properties.contentPackageSelection))
				basePart.updateContentPackageSelection();
			if (SpemPackage.eINSTANCE.getMethodConfiguration_SubstractedCategory().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.MethodConfiguration.Properties.substractedCategory))
				basePart.updateSubstractedCategory();
			if (SpemPackage.eINSTANCE.getMethodConfiguration_DefaultView().equals(msg.getFeature()) && basePart != null && isAccessible(SpemViewsRepository.MethodConfiguration.Properties.defaultView))
				basePart.setDefaultView((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getMethodConfiguration_ProcessView().equals(msg.getFeature())  && isAccessible(SpemViewsRepository.MethodConfiguration.Properties.processView))
				basePart.updateProcessView();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SpemViewsRepository.MethodConfiguration.Properties.defaultView;
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
				if (SpemViewsRepository.MethodConfiguration.Properties.name == event.getAffectedEditor()) {
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
