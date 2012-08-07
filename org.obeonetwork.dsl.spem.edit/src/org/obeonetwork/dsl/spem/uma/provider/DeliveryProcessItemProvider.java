/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma.provider;


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

import org.obeonetwork.dsl.spem.uma.DeliveryProcess;
import org.obeonetwork.dsl.spem.uma.UmaPackage;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.spem.uma.DeliveryProcess} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeliveryProcessItemProvider
	extends ProcessItemProvider
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
	public DeliveryProcessItemProvider(AdapterFactory adapterFactory) {
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

			addScalePropertyDescriptor(object);
			addProjectCharacteristicsPropertyDescriptor(object);
			addRiskLevelPropertyDescriptor(object);
			addEstimatingTechniquePropertyDescriptor(object);
			addProjectMemberExpertisePropertyDescriptor(object);
			addTypeOfContractPropertyDescriptor(object);
			addCommunicationMaterialPropertyDescriptor(object);
			addEducationalMaterialPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Scale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeliveryProcess_scale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeliveryProcess_scale_feature", "_UI_DeliveryProcess_type"),
				 UmaPackage.Literals.DELIVERY_PROCESS__SCALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Project Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProjectCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeliveryProcess_projectCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeliveryProcess_projectCharacteristics_feature", "_UI_DeliveryProcess_type"),
				 UmaPackage.Literals.DELIVERY_PROCESS__PROJECT_CHARACTERISTICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Risk Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRiskLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeliveryProcess_riskLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeliveryProcess_riskLevel_feature", "_UI_DeliveryProcess_type"),
				 UmaPackage.Literals.DELIVERY_PROCESS__RISK_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Estimating Technique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEstimatingTechniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeliveryProcess_estimatingTechnique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeliveryProcess_estimatingTechnique_feature", "_UI_DeliveryProcess_type"),
				 UmaPackage.Literals.DELIVERY_PROCESS__ESTIMATING_TECHNIQUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Project Member Expertise feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProjectMemberExpertisePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeliveryProcess_projectMemberExpertise_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeliveryProcess_projectMemberExpertise_feature", "_UI_DeliveryProcess_type"),
				 UmaPackage.Literals.DELIVERY_PROCESS__PROJECT_MEMBER_EXPERTISE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type Of Contract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeOfContractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeliveryProcess_typeOfContract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeliveryProcess_typeOfContract_feature", "_UI_DeliveryProcess_type"),
				 UmaPackage.Literals.DELIVERY_PROCESS__TYPE_OF_CONTRACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Communication Material feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommunicationMaterialPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeliveryProcess_communicationMaterial_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeliveryProcess_communicationMaterial_feature", "_UI_DeliveryProcess_type"),
				 UmaPackage.Literals.DELIVERY_PROCESS__COMMUNICATION_MATERIAL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Educational Material feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEducationalMaterialPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeliveryProcess_educationalMaterial_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeliveryProcess_educationalMaterial_feature", "_UI_DeliveryProcess_type"),
				 UmaPackage.Literals.DELIVERY_PROCESS__EDUCATIONAL_MATERIAL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns DeliveryProcess.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DeliveryProcess"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DeliveryProcess)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DeliveryProcess_type") :
			getString("_UI_DeliveryProcess_type") + " " + label;
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

		switch (notification.getFeatureID(DeliveryProcess.class)) {
			case UmaPackage.DELIVERY_PROCESS__SCALE:
			case UmaPackage.DELIVERY_PROCESS__PROJECT_CHARACTERISTICS:
			case UmaPackage.DELIVERY_PROCESS__RISK_LEVEL:
			case UmaPackage.DELIVERY_PROCESS__ESTIMATING_TECHNIQUE:
			case UmaPackage.DELIVERY_PROCESS__PROJECT_MEMBER_EXPERTISE:
			case UmaPackage.DELIVERY_PROCESS__TYPE_OF_CONTRACT:
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

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == SpemPackage.Literals.ACTIVITY__NESTED_BREAKDOWN_ELEMENT ||
			childFeature == UmaPackage.Literals.PROCESS__INCLUDED_PATTERN ||
			childFeature == SpemPackage.Literals.ACTIVITY__OWNED_PROCESS_PARAMETER;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
