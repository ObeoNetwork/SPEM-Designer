/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.obeonetwork.dsl.spem.SpemFactory;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.TaskUse;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.spem.TaskUse} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskUseItemProvider
	extends MethodContentUseItemProvider
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
	public TaskUseItemProvider(AdapterFactory adapterFactory) {
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
			addTaskPropertyDescriptor(object);
			addUsedQualificationPropertyDescriptor(object);
			addSelectedStepPropertyDescriptor(object);
			addPreConditionPropertyDescriptor(object);
			addPostConditionPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskUse_task_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskUse_task_feature", "_UI_TaskUse_type"),
				 SpemPackage.Literals.TASK_USE__TASK,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Used Qualification feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsedQualificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskUse_usedQualification_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskUse_usedQualification_feature", "_UI_TaskUse_type"),
				 SpemPackage.Literals.TASK_USE__USED_QUALIFICATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected Step feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedStepPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskUse_selectedStep_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskUse_selectedStep_feature", "_UI_TaskUse_type"),
				 SpemPackage.Literals.TASK_USE__SELECTED_STEP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pre Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskUse_preCondition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskUse_preCondition_feature", "_UI_TaskUse_type"),
				 SpemPackage.Literals.TASK_USE__PRE_CONDITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Post Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPostConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskUse_postCondition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskUse_postCondition_feature", "_UI_TaskUse_type"),
				 SpemPackage.Literals.TASK_USE__POST_CONDITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SpemPackage.Literals.TASK_USE__OWNED_PROCESS_PARAMETER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TaskUse.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TaskUse"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TaskUse)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TaskUse_type") :
			getString("_UI_TaskUse_type") + " " + label;
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

		switch (notification.getFeatureID(TaskUse.class)) {
			case SpemPackage.TASK_USE__IS_REPEATABLE:
			case SpemPackage.TASK_USE__IS_ONGOING:
			case SpemPackage.TASK_USE__IS_EVENT_DRIVEN:
			case SpemPackage.TASK_USE__PRE_CONDITION:
			case SpemPackage.TASK_USE__POST_CONDITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SpemPackage.TASK_USE__OWNED_PROCESS_PARAMETER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.TASK_USE__OWNED_PROCESS_PARAMETER,
				 SpemFactory.eINSTANCE.createProcessParameter()));
	}

}
