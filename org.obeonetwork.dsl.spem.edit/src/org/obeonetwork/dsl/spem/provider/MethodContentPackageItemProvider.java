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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.obeonetwork.dsl.spem.MethodContentPackage;
import org.obeonetwork.dsl.spem.SpemFactory;
import org.obeonetwork.dsl.spem.SpemPackage;

import org.obeonetwork.dsl.spem.uma.UmaFactory;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.spem.MethodContentPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MethodContentPackageItemProvider
	extends MethodContentPackageableElementItemProvider
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
	public MethodContentPackageItemProvider(AdapterFactory adapterFactory) {
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

			addReusedPackagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Reused Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReusedPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MethodContentPackage_reusedPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MethodContentPackage_reusedPackage_feature", "_UI_MethodContentPackage_type"),
				 SpemPackage.Literals.METHOD_CONTENT_PACKAGE__REUSED_PACKAGE,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER);
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
	 * This returns MethodContentPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MethodContentPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MethodContentPackage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MethodContentPackage_type") :
			getString("_UI_MethodContentPackage_type") + " " + label;
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

		switch (notification.getFeatureID(MethodContentPackage.class)) {
			case SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER:
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
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 SpemFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 SpemFactory.eINSTANCE.createGuidance()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 SpemFactory.eINSTANCE.createToolDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 SpemFactory.eINSTANCE.createTaskDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 SpemFactory.eINSTANCE.createWorkProductDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 SpemFactory.eINSTANCE.createRoleDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 SpemFactory.eINSTANCE.createWorkProductDefinitionRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 SpemFactory.eINSTANCE.createDefault_TaskDefinitionPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 SpemFactory.eINSTANCE.createDefault_ResponsibilityAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 SpemFactory.eINSTANCE.createQualification()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 SpemFactory.eINSTANCE.createMethodContentPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createChecklist()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createConcept()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createCategoryPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createCustomCategory()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createDiscipline()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createDisciplineGrouping()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createDomain()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createEstimatingConsideration()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createExample()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createPractice()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createReport()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createReusableAsset()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createRoadmap()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createTermDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createToolMentor()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createWhitepaper()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createGuideline()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createSupportingMaterial()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createRoleDefinitionPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createTaskDefinitionPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createWorkProductDefinitionPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createGuidancePackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createDisciplinePackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createDomainPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createWorkProductKindPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createRoleSetPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createToolDefinitionPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createConfigurationPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createRoleSet()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createQualificationPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createWorkProductKind()));
	}

}
