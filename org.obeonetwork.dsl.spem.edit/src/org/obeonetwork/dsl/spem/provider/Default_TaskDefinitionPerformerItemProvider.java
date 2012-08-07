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

import org.obeonetwork.dsl.spem.Default_TaskDefinitionPerformer;
import org.obeonetwork.dsl.spem.SpemPackage;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.spem.Default_TaskDefinitionPerformer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Default_TaskDefinitionPerformerItemProvider
	extends MethodContentElementItemProvider
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
	public Default_TaskDefinitionPerformerItemProvider(AdapterFactory adapterFactory) {
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

			addLinkedTaskDefinitionPropertyDescriptor(object);
			addLinkedRoleDefinitionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Linked Task Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkedTaskDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Default_TaskDefinitionPerformer_linkedTaskDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Default_TaskDefinitionPerformer_linkedTaskDefinition_feature", "_UI_Default_TaskDefinitionPerformer_type"),
				 SpemPackage.Literals.DEFAULT_TASK_DEFINITION_PERFORMER__LINKED_TASK_DEFINITION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linked Role Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkedRoleDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Default_TaskDefinitionPerformer_linkedRoleDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Default_TaskDefinitionPerformer_linkedRoleDefinition_feature", "_UI_Default_TaskDefinitionPerformer_type"),
				 SpemPackage.Literals.DEFAULT_TASK_DEFINITION_PERFORMER__LINKED_ROLE_DEFINITION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns Default_TaskDefinitionPerformer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Default_TaskDefinitionPerformer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Default_TaskDefinitionPerformer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Default_TaskDefinitionPerformer_type") :
			getString("_UI_Default_TaskDefinitionPerformer_type") + " " + label;
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
