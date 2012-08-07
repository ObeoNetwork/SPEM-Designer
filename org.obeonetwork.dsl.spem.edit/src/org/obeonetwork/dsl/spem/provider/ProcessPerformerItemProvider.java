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

import org.obeonetwork.dsl.spem.ProcessPerformer;
import org.obeonetwork.dsl.spem.SpemFactory;
import org.obeonetwork.dsl.spem.SpemPackage;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.spem.ProcessPerformer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessPerformerItemProvider
	extends WorkDefinitionPerformerItemProvider
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
	public ProcessPerformerItemProvider(AdapterFactory adapterFactory) {
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

			addKindPropertyDescriptor(object);
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
			addProcessKindPropertyDescriptor(object);
			addHasMultipleOccurrencesPropertyDescriptor(object);
			addIsOptionalPropertyDescriptor(object);
			addIsPlannedPropertyDescriptor(object);
			addLinkedRoleUsePropertyDescriptor(object);
			addLinkedActivityPropertyDescriptor(object);
			addLinkedTaskUsePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtensibleElement_kind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtensibleElement_kind_feature", "_UI_ExtensibleElement_type"),
				 SpemPackage.Literals.EXTENSIBLE_ELEMENT__KIND,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
				 getString("_UI_ProcessPackageableElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessPackageableElement_name_feature", "_UI_ProcessPackageableElement_type"),
				 SpemPackage.Literals.PROCESS_PACKAGEABLE_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Process Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessElement_processKind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessElement_processKind_feature", "_UI_ProcessElement_type"),
				 SpemPackage.Literals.PROCESS_ELEMENT__PROCESS_KIND,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Multiple Occurrences feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasMultipleOccurrencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BreakdownElement_hasMultipleOccurrences_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BreakdownElement_hasMultipleOccurrences_feature", "_UI_BreakdownElement_type"),
				 SpemPackage.Literals.BREAKDOWN_ELEMENT__HAS_MULTIPLE_OCCURRENCES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Optional feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsOptionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BreakdownElement_isOptional_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BreakdownElement_isOptional_feature", "_UI_BreakdownElement_type"),
				 SpemPackage.Literals.BREAKDOWN_ELEMENT__IS_OPTIONAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Planned feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsPlannedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BreakdownElement_isPlanned_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BreakdownElement_isPlanned_feature", "_UI_BreakdownElement_type"),
				 SpemPackage.Literals.BREAKDOWN_ELEMENT__IS_PLANNED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linked Role Use feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkedRoleUsePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessPerformer_linkedRoleUse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessPerformer_linkedRoleUse_feature", "_UI_ProcessPerformer_type"),
				 SpemPackage.Literals.PROCESS_PERFORMER__LINKED_ROLE_USE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linked Activity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkedActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessPerformer_linkedActivity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessPerformer_linkedActivity_feature", "_UI_ProcessPerformer_type"),
				 SpemPackage.Literals.PROCESS_PERFORMER__LINKED_ACTIVITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linked Task Use feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkedTaskUsePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessPerformer_linkedTaskUse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessPerformer_linkedTaskUse_feature", "_UI_ProcessPerformer_type"),
				 SpemPackage.Literals.PROCESS_PERFORMER__LINKED_TASK_USE,
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
			childrenFeatures.add(SpemPackage.Literals.BREAKDOWN_ELEMENT__PLANNING_DATA);
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
	 * This returns ProcessPerformer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProcessPerformer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ProcessPerformer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ProcessPerformer_type") :
			getString("_UI_ProcessPerformer_type") + " " + label;
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

		switch (notification.getFeatureID(ProcessPerformer.class)) {
			case SpemPackage.PROCESS_PERFORMER__PRESENTATION_NAME:
			case SpemPackage.PROCESS_PERFORMER__BRIEF_DESCRIPTION:
			case SpemPackage.PROCESS_PERFORMER__MAIN_DESCRIPTION:
			case SpemPackage.PROCESS_PERFORMER__PURPOSE:
			case SpemPackage.PROCESS_PERFORMER__COPYRIGHT:
			case SpemPackage.PROCESS_PERFORMER__AUTHOR:
			case SpemPackage.PROCESS_PERFORMER__CHANGE_DATE:
			case SpemPackage.PROCESS_PERFORMER__CHANGE_DESCRIPTION:
			case SpemPackage.PROCESS_PERFORMER__VERSION:
			case SpemPackage.PROCESS_PERFORMER__NAME:
			case SpemPackage.PROCESS_PERFORMER__HAS_MULTIPLE_OCCURRENCES:
			case SpemPackage.PROCESS_PERFORMER__IS_OPTIONAL:
			case SpemPackage.PROCESS_PERFORMER__IS_PLANNED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SpemPackage.PROCESS_PERFORMER__PLANNING_DATA:
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
				(SpemPackage.Literals.BREAKDOWN_ELEMENT__PLANNING_DATA,
				 SpemFactory.eINSTANCE.createPlanningData()));
	}

}
