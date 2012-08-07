/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
import org.obeonetwork.dsl.spem.provider.KindItemProvider;
import org.obeonetwork.dsl.spem.provider.Spem2EditPlugin;
import org.obeonetwork.dsl.spem.uma.UmaPackage;
import org.obeonetwork.dsl.spem.uma.WorkProductKind;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.spem.uma.WorkProductKind} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkProductKindItemProvider
	extends KindItemProvider
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
	public WorkProductKindItemProvider(AdapterFactory adapterFactory) {
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

			addPresentationNamePropertyDescriptor(object);
			addBriefDescriptionPropertyDescriptor(object);
			addMainDescriptionPropertyDescriptor(object);
			addPurposePropertyDescriptor(object);
			addGuidancePropertyDescriptor(object);
			addMetricPropertyDescriptor(object);
			addCategoryPropertyDescriptor(object);
			addCopyrightPropertyDescriptor(object);
			addAuthorPropertyDescriptor(object);
			addChangeDatePropertyDescriptor(object);
			addChangeDescriptionPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addVariabilityTypePropertyDescriptor(object);
			addVariabilityBasedOnElementPropertyDescriptor(object);
			addMethodContentKindPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Presentation Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPresentationNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescribableElement_presentationName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescribableElement_presentationName_feature", "_UI_DescribableElement_type"),
				 SpemPackage.Literals.DESCRIBABLE_ELEMENT__PRESENTATION_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Brief Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBriefDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescribableElement_briefDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescribableElement_briefDescription_feature", "_UI_DescribableElement_type"),
				 SpemPackage.Literals.DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Main Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMainDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescribableElement_mainDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescribableElement_mainDescription_feature", "_UI_DescribableElement_type"),
				 SpemPackage.Literals.DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Purpose feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPurposePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescribableElement_purpose_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescribableElement_purpose_feature", "_UI_DescribableElement_type"),
				 SpemPackage.Literals.DESCRIBABLE_ELEMENT__PURPOSE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guidance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuidancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescribableElement_guidance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescribableElement_guidance_feature", "_UI_DescribableElement_type"),
				 SpemPackage.Literals.DESCRIBABLE_ELEMENT__GUIDANCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Metric feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetricPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescribableElement_metric_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescribableElement_metric_feature", "_UI_DescribableElement_type"),
				 SpemPackage.Literals.DESCRIBABLE_ELEMENT__METRIC,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescribableElement_category_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescribableElement_category_feature", "_UI_DescribableElement_type"),
				 SpemPackage.Literals.DESCRIBABLE_ELEMENT__CATEGORY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Copyright feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCopyrightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescribableElement_copyright_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescribableElement_copyright_feature", "_UI_DescribableElement_type"),
				 SpemPackage.Literals.DESCRIBABLE_ELEMENT__COPYRIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Author feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescribableElement_author_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescribableElement_author_feature", "_UI_DescribableElement_type"),
				 SpemPackage.Literals.DESCRIBABLE_ELEMENT__AUTHOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Change Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChangeDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescribableElement_changeDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescribableElement_changeDate_feature", "_UI_DescribableElement_type"),
				 SpemPackage.Literals.DESCRIBABLE_ELEMENT__CHANGE_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Change Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChangeDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescribableElement_changeDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescribableElement_changeDescription_feature", "_UI_DescribableElement_type"),
				 SpemPackage.Literals.DESCRIBABLE_ELEMENT__CHANGE_DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescribableElement_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescribableElement_version_feature", "_UI_DescribableElement_type"),
				 SpemPackage.Literals.DESCRIBABLE_ELEMENT__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MethodContentPackageableElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MethodContentPackageableElement_name_feature", "_UI_MethodContentPackageableElement_type"),
				 SpemPackage.Literals.METHOD_CONTENT_PACKAGEABLE_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Variability Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariabilityTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariabilityElement_variabilityType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariabilityElement_variabilityType_feature", "_UI_VariabilityElement_type"),
				 SpemPackage.Literals.VARIABILITY_ELEMENT__VARIABILITY_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Variability Based On Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariabilityBasedOnElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariabilityElement_variabilityBasedOnElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariabilityElement_variabilityBasedOnElement_feature", "_UI_VariabilityElement_type"),
				 SpemPackage.Literals.VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Method Content Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMethodContentKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MethodContentElement_methodContentKind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MethodContentElement_methodContentKind_feature", "_UI_MethodContentElement_type"),
				 SpemPackage.Literals.METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns WorkProductKind.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WorkProductKind"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WorkProductKind)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_WorkProductKind_type") :
			getString("_UI_WorkProductKind_type") + " " + label;
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

		switch (notification.getFeatureID(WorkProductKind.class)) {
			case UmaPackage.WORK_PRODUCT_KIND__PRESENTATION_NAME:
			case UmaPackage.WORK_PRODUCT_KIND__BRIEF_DESCRIPTION:
			case UmaPackage.WORK_PRODUCT_KIND__MAIN_DESCRIPTION:
			case UmaPackage.WORK_PRODUCT_KIND__PURPOSE:
			case UmaPackage.WORK_PRODUCT_KIND__COPYRIGHT:
			case UmaPackage.WORK_PRODUCT_KIND__AUTHOR:
			case UmaPackage.WORK_PRODUCT_KIND__CHANGE_DATE:
			case UmaPackage.WORK_PRODUCT_KIND__CHANGE_DESCRIPTION:
			case UmaPackage.WORK_PRODUCT_KIND__VERSION:
			case UmaPackage.WORK_PRODUCT_KIND__NAME:
			case UmaPackage.WORK_PRODUCT_KIND__VARIABILITY_TYPE:
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
