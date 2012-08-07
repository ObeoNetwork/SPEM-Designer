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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.WorkBreakdownElement;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.spem.WorkBreakdownElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkBreakdownElementItemProvider
	extends BreakdownElementItemProvider
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
	public WorkBreakdownElementItemProvider(AdapterFactory adapterFactory) {
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

			addIsRepeatablePropertyDescriptor(object);
			addIsOngoingPropertyDescriptor(object);
			addIsEventDrivenPropertyDescriptor(object);
			addLinkToPredecessorPropertyDescriptor(object);
			addLinkToSuccessorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Repeatable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsRepeatablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WorkBreakdownElement_isRepeatable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WorkBreakdownElement_isRepeatable_feature", "_UI_WorkBreakdownElement_type"),
				 SpemPackage.Literals.WORK_BREAKDOWN_ELEMENT__IS_REPEATABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Ongoing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsOngoingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WorkBreakdownElement_isOngoing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WorkBreakdownElement_isOngoing_feature", "_UI_WorkBreakdownElement_type"),
				 SpemPackage.Literals.WORK_BREAKDOWN_ELEMENT__IS_ONGOING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Event Driven feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsEventDrivenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WorkBreakdownElement_isEventDriven_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WorkBreakdownElement_isEventDriven_feature", "_UI_WorkBreakdownElement_type"),
				 SpemPackage.Literals.WORK_BREAKDOWN_ELEMENT__IS_EVENT_DRIVEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Link To Predecessor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkToPredecessorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WorkBreakdownElement_linkToPredecessor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WorkBreakdownElement_linkToPredecessor_feature", "_UI_WorkBreakdownElement_type"),
				 SpemPackage.Literals.WORK_BREAKDOWN_ELEMENT__LINK_TO_PREDECESSOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Link To Successor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkToSuccessorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WorkBreakdownElement_linkToSuccessor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WorkBreakdownElement_linkToSuccessor_feature", "_UI_WorkBreakdownElement_type"),
				 SpemPackage.Literals.WORK_BREAKDOWN_ELEMENT__LINK_TO_SUCCESSOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WorkBreakdownElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_WorkBreakdownElement_type") :
			getString("_UI_WorkBreakdownElement_type") + " " + label;
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

		switch (notification.getFeatureID(WorkBreakdownElement.class)) {
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_REPEATABLE:
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_ONGOING:
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_EVENT_DRIVEN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
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
