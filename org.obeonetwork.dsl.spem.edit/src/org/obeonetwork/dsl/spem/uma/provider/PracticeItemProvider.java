/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

import org.obeonetwork.dsl.spem.provider.GuidanceItemProvider;
import org.obeonetwork.dsl.spem.provider.Spem2EditPlugin;

import org.obeonetwork.dsl.spem.uma.Practice;
import org.obeonetwork.dsl.spem.uma.UmaFactory;
import org.obeonetwork.dsl.spem.uma.UmaPackage;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.spem.uma.Practice} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PracticeItemProvider
	extends GuidanceItemProvider
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
	public PracticeItemProvider(AdapterFactory adapterFactory) {
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

			addReferencedActivityPropertyDescriptor(object);
			addContentReferencePropertyDescriptor(object);
			addAdditionalInfoPropertyDescriptor(object);
			addApplicationPropertyDescriptor(object);
			addBackgroundPropertyDescriptor(object);
			addGoalPropertyDescriptor(object);
			addLevelOfAdoptionPropertyDescriptor(object);
			addProblemPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Referenced Activity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencedActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Practice_referencedActivity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Practice_referencedActivity_feature", "_UI_Practice_type"),
				 UmaPackage.Literals.PRACTICE__REFERENCED_ACTIVITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Content Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Practice_contentReference_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Practice_contentReference_feature", "_UI_Practice_type"),
				 UmaPackage.Literals.PRACTICE__CONTENT_REFERENCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Additional Info feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdditionalInfoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Practice_additionalInfo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Practice_additionalInfo_feature", "_UI_Practice_type"),
				 UmaPackage.Literals.PRACTICE__ADDITIONAL_INFO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Application feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApplicationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Practice_application_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Practice_application_feature", "_UI_Practice_type"),
				 UmaPackage.Literals.PRACTICE__APPLICATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Background feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackgroundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Practice_background_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Practice_background_feature", "_UI_Practice_type"),
				 UmaPackage.Literals.PRACTICE__BACKGROUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Goal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGoalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Practice_goal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Practice_goal_feature", "_UI_Practice_type"),
				 UmaPackage.Literals.PRACTICE__GOAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Level Of Adoption feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLevelOfAdoptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Practice_levelOfAdoption_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Practice_levelOfAdoption_feature", "_UI_Practice_type"),
				 UmaPackage.Literals.PRACTICE__LEVEL_OF_ADOPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Problem feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProblemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Practice_problem_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Practice_problem_feature", "_UI_Practice_type"),
				 UmaPackage.Literals.PRACTICE__PROBLEM,
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
			childrenFeatures.add(UmaPackage.Literals.PRACTICE__SUB_PRACTICE);
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
	 * This returns Practice.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Practice"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Practice)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Practice_type") :
			getString("_UI_Practice_type") + " " + label;
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

		switch (notification.getFeatureID(Practice.class)) {
			case UmaPackage.PRACTICE__ADDITIONAL_INFO:
			case UmaPackage.PRACTICE__APPLICATION:
			case UmaPackage.PRACTICE__BACKGROUND:
			case UmaPackage.PRACTICE__GOAL:
			case UmaPackage.PRACTICE__LEVEL_OF_ADOPTION:
			case UmaPackage.PRACTICE__PROBLEM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UmaPackage.PRACTICE__SUB_PRACTICE:
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
				(UmaPackage.Literals.PRACTICE__SUB_PRACTICE,
				 UmaFactory.eINSTANCE.createPractice()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Spem2EditPlugin.INSTANCE;
	}

}
