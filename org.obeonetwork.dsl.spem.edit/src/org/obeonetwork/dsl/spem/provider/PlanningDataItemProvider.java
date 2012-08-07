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

import org.obeonetwork.dsl.spem.PlanningData;
import org.obeonetwork.dsl.spem.SpemPackage;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.spem.PlanningData} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlanningDataItemProvider
	extends ProcessElementItemProvider
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
	public PlanningDataItemProvider(AdapterFactory adapterFactory) {
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

			addStartDatePropertyDescriptor(object);
			addFinishDatePropertyDescriptor(object);
			addRankPropertyDescriptor(object);
			addDurationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Start Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlanningData_startDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlanningData_startDate_feature", "_UI_PlanningData_type"),
				 SpemPackage.Literals.PLANNING_DATA__START_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Finish Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinishDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlanningData_finishDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlanningData_finishDate_feature", "_UI_PlanningData_type"),
				 SpemPackage.Literals.PLANNING_DATA__FINISH_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rank feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRankPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlanningData_rank_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlanningData_rank_feature", "_UI_PlanningData_type"),
				 SpemPackage.Literals.PLANNING_DATA__RANK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlanningData_duration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlanningData_duration_feature", "_UI_PlanningData_type"),
				 SpemPackage.Literals.PLANNING_DATA__DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns PlanningData.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PlanningData"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PlanningData)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PlanningData_type") :
			getString("_UI_PlanningData_type") + " " + label;
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

		switch (notification.getFeatureID(PlanningData.class)) {
			case SpemPackage.PLANNING_DATA__START_DATE:
			case SpemPackage.PLANNING_DATA__FINISH_DATE:
			case SpemPackage.PLANNING_DATA__RANK:
			case SpemPackage.PLANNING_DATA__DURATION:
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
