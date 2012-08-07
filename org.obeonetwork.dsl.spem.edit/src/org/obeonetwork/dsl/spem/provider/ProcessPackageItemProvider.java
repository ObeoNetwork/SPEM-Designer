/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.obeonetwork.dsl.spem.ProcessPackage;
import org.obeonetwork.dsl.spem.SpemFactory;
import org.obeonetwork.dsl.spem.SpemPackage;

import org.obeonetwork.dsl.spem.uma.UmaFactory;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.spem.ProcessPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessPackageItemProvider
	extends ProcessPackageableElementItemProvider
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
	public ProcessPackageItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER);
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
	 * This returns ProcessPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProcessPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ProcessPackage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ProcessPackage_type") :
			getString("_UI_ProcessPackage_type") + " " + label;
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

		switch (notification.getFeatureID(ProcessPackage.class)) {
			case SpemPackage.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER:
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
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 SpemFactory.eINSTANCE.createWorkSequence()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 SpemFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 SpemFactory.eINSTANCE.createProcessPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 SpemFactory.eINSTANCE.createRoleUse()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 SpemFactory.eINSTANCE.createProcessResponsibilityAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 SpemFactory.eINSTANCE.createWorkProductUse()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 SpemFactory.eINSTANCE.createWorkProductUseRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 SpemFactory.eINSTANCE.createProcessParameter()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 SpemFactory.eINSTANCE.createMilestone()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 SpemFactory.eINSTANCE.createProcessPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 SpemFactory.eINSTANCE.createPlanningData()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 SpemFactory.eINSTANCE.createTaskUse()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 SpemFactory.eINSTANCE.createCompositeRole()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 SpemFactory.eINSTANCE.createTeamProfile()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 SpemFactory.eINSTANCE.createProcessComponent()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 SpemFactory.eINSTANCE.createProcessComponentUse()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 SpemFactory.eINSTANCE.createWorkProductPort()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 SpemFactory.eINSTANCE.createWorkProductPortConnector()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 UmaFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 UmaFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 UmaFactory.eINSTANCE.createCapabilityPattern()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 UmaFactory.eINSTANCE.createDeliverable()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 UmaFactory.eINSTANCE.createDeliveryProcess()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 UmaFactory.eINSTANCE.createIteration()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 UmaFactory.eINSTANCE.createOutcome()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 UmaFactory.eINSTANCE.createPhase()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 UmaFactory.eINSTANCE.createProcessPlanningTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 UmaFactory.eINSTANCE.createCapabilityPatternPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 UmaFactory.eINSTANCE.createDeliveryProcessPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER,
				 UmaFactory.eINSTANCE.createProcessComponentPackage()));
	}

}
