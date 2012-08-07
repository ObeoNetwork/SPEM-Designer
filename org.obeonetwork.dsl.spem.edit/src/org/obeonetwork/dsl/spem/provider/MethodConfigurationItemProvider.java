/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.obeonetwork.dsl.spem.MethodConfiguration;
import org.obeonetwork.dsl.spem.SpemPackage;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.spem.MethodConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MethodConfigurationItemProvider
	extends MethodLibraryPackageableElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodConfigurationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addBaseConfigurationPropertyDescriptor(object);
			addMethodPluginSelectionPropertyDescriptor(object);
			addProcessPackageSelectionPropertyDescriptor(object);
			addContentPackageSelectionPropertyDescriptor(object);
			addSubstractedCategoryPropertyDescriptor(object);
			addDefaultViewPropertyDescriptor(object);
			addProcessViewPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Base Configuration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseConfigurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MethodConfiguration_baseConfiguration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MethodConfiguration_baseConfiguration_feature", "_UI_MethodConfiguration_type"),
				 SpemPackage.Literals.METHOD_CONFIGURATION__BASE_CONFIGURATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Method Plugin Selection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMethodPluginSelectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MethodConfiguration_methodPluginSelection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MethodConfiguration_methodPluginSelection_feature", "_UI_MethodConfiguration_type"),
				 SpemPackage.Literals.METHOD_CONFIGURATION__METHOD_PLUGIN_SELECTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Process Package Selection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessPackageSelectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MethodConfiguration_processPackageSelection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MethodConfiguration_processPackageSelection_feature", "_UI_MethodConfiguration_type"),
				 SpemPackage.Literals.METHOD_CONFIGURATION__PROCESS_PACKAGE_SELECTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Content Package Selection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentPackageSelectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MethodConfiguration_contentPackageSelection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MethodConfiguration_contentPackageSelection_feature", "_UI_MethodConfiguration_type"),
				 SpemPackage.Literals.METHOD_CONFIGURATION__CONTENT_PACKAGE_SELECTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Substracted Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubstractedCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MethodConfiguration_substractedCategory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MethodConfiguration_substractedCategory_feature", "_UI_MethodConfiguration_type"),
				 SpemPackage.Literals.METHOD_CONFIGURATION__SUBSTRACTED_CATEGORY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default View feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultViewPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MethodConfiguration_defaultView_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MethodConfiguration_defaultView_feature", "_UI_MethodConfiguration_type"),
				 SpemPackage.Literals.METHOD_CONFIGURATION__DEFAULT_VIEW,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Process View feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessViewPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MethodConfiguration_processView_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MethodConfiguration_processView_feature", "_UI_MethodConfiguration_type"),
				 SpemPackage.Literals.METHOD_CONFIGURATION__PROCESS_VIEW,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns MethodConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MethodConfiguration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MethodConfiguration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MethodConfiguration_type") :
			getString("_UI_MethodConfiguration_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
