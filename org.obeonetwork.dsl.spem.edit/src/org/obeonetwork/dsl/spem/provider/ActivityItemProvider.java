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

import org.obeonetwork.dsl.spem.Activity;
import org.obeonetwork.dsl.spem.SpemFactory;
import org.obeonetwork.dsl.spem.SpemPackage;

import org.obeonetwork.dsl.spem.uma.UmaFactory;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.spem.Activity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityItemProvider
	extends WorkDefinitionItemProvider
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
	public ActivityItemProvider(AdapterFactory adapterFactory) {
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
			addIsRepeatablePropertyDescriptor(object);
			addIsOngoingPropertyDescriptor(object);
			addIsEventDrivenPropertyDescriptor(object);
			addLinkToPredecessorPropertyDescriptor(object);
			addLinkToSuccessorPropertyDescriptor(object);
			addVariabilityTypePropertyDescriptor(object);
			addVariabilityBasedOnElementPropertyDescriptor(object);
			addUseKindPropertyDescriptor(object);
			addUsedActivityPropertyDescriptor(object);
			addSuppressedBreakdownElementPropertyDescriptor(object);
			addDefaultContextPropertyDescriptor(object);
			addValidContextPropertyDescriptor(object);
			addIsEnactablePropertyDescriptor(object);
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
	 * This adds a property descriptor for the Use Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_useKind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_useKind_feature", "_UI_Activity_type"),
				 SpemPackage.Literals.ACTIVITY__USE_KIND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Used Activity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsedActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_usedActivity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_usedActivity_feature", "_UI_Activity_type"),
				 SpemPackage.Literals.ACTIVITY__USED_ACTIVITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Suppressed Breakdown Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuppressedBreakdownElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_suppressedBreakdownElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_suppressedBreakdownElement_feature", "_UI_Activity_type"),
				 SpemPackage.Literals.ACTIVITY__SUPPRESSED_BREAKDOWN_ELEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_defaultContext_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_defaultContext_feature", "_UI_Activity_type"),
				 SpemPackage.Literals.ACTIVITY__DEFAULT_CONTEXT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Valid Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_validContext_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_validContext_feature", "_UI_Activity_type"),
				 SpemPackage.Literals.ACTIVITY__VALID_CONTEXT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Enactable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsEnactablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_isEnactable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_isEnactable_feature", "_UI_Activity_type"),
				 SpemPackage.Literals.ACTIVITY__IS_ENACTABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(SpemPackage.Literals.ACTIVITY__NESTED_BREAKDOWN_ELEMENT);
			childrenFeatures.add(SpemPackage.Literals.ACTIVITY__OWNED_PROCESS_PARAMETER);
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
	 * This returns Activity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Activity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Activity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Activity_type") :
			getString("_UI_Activity_type") + " " + label;
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

		switch (notification.getFeatureID(Activity.class)) {
			case SpemPackage.ACTIVITY__PRESENTATION_NAME:
			case SpemPackage.ACTIVITY__BRIEF_DESCRIPTION:
			case SpemPackage.ACTIVITY__MAIN_DESCRIPTION:
			case SpemPackage.ACTIVITY__PURPOSE:
			case SpemPackage.ACTIVITY__COPYRIGHT:
			case SpemPackage.ACTIVITY__AUTHOR:
			case SpemPackage.ACTIVITY__CHANGE_DATE:
			case SpemPackage.ACTIVITY__CHANGE_DESCRIPTION:
			case SpemPackage.ACTIVITY__VERSION:
			case SpemPackage.ACTIVITY__NAME:
			case SpemPackage.ACTIVITY__HAS_MULTIPLE_OCCURRENCES:
			case SpemPackage.ACTIVITY__IS_OPTIONAL:
			case SpemPackage.ACTIVITY__IS_PLANNED:
			case SpemPackage.ACTIVITY__IS_REPEATABLE:
			case SpemPackage.ACTIVITY__IS_ONGOING:
			case SpemPackage.ACTIVITY__IS_EVENT_DRIVEN:
			case SpemPackage.ACTIVITY__VARIABILITY_TYPE:
			case SpemPackage.ACTIVITY__USE_KIND:
			case SpemPackage.ACTIVITY__IS_ENACTABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SpemPackage.ACTIVITY__PLANNING_DATA:
			case SpemPackage.ACTIVITY__NESTED_BREAKDOWN_ELEMENT:
			case SpemPackage.ACTIVITY__OWNED_PROCESS_PARAMETER:
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

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.ACTIVITY__NESTED_BREAKDOWN_ELEMENT,
				 SpemFactory.eINSTANCE.createWorkSequence()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.ACTIVITY__NESTED_BREAKDOWN_ELEMENT,
				 SpemFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.ACTIVITY__NESTED_BREAKDOWN_ELEMENT,
				 SpemFactory.eINSTANCE.createProcessPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.ACTIVITY__NESTED_BREAKDOWN_ELEMENT,
				 SpemFactory.eINSTANCE.createRoleUse()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.ACTIVITY__NESTED_BREAKDOWN_ELEMENT,
				 SpemFactory.eINSTANCE.createProcessResponsibilityAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.ACTIVITY__NESTED_BREAKDOWN_ELEMENT,
				 SpemFactory.eINSTANCE.createWorkProductUse()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.ACTIVITY__NESTED_BREAKDOWN_ELEMENT,
				 SpemFactory.eINSTANCE.createWorkProductUseRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.ACTIVITY__NESTED_BREAKDOWN_ELEMENT,
				 SpemFactory.eINSTANCE.createProcessParameter()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.ACTIVITY__NESTED_BREAKDOWN_ELEMENT,
				 SpemFactory.eINSTANCE.createMilestone()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.ACTIVITY__NESTED_BREAKDOWN_ELEMENT,
				 SpemFactory.eINSTANCE.createTaskUse()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.ACTIVITY__NESTED_BREAKDOWN_ELEMENT,
				 SpemFactory.eINSTANCE.createCompositeRole()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.ACTIVITY__NESTED_BREAKDOWN_ELEMENT,
				 SpemFactory.eINSTANCE.createTeamProfile()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.ACTIVITY__NESTED_BREAKDOWN_ELEMENT,
				 SpemFactory.eINSTANCE.createProcessComponentUse()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.ACTIVITY__NESTED_BREAKDOWN_ELEMENT,
				 UmaFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.ACTIVITY__NESTED_BREAKDOWN_ELEMENT,
				 UmaFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.ACTIVITY__NESTED_BREAKDOWN_ELEMENT,
				 UmaFactory.eINSTANCE.createCapabilityPattern()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.ACTIVITY__NESTED_BREAKDOWN_ELEMENT,
				 UmaFactory.eINSTANCE.createDeliverable()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.ACTIVITY__NESTED_BREAKDOWN_ELEMENT,
				 UmaFactory.eINSTANCE.createDeliveryProcess()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.ACTIVITY__NESTED_BREAKDOWN_ELEMENT,
				 UmaFactory.eINSTANCE.createIteration()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.ACTIVITY__NESTED_BREAKDOWN_ELEMENT,
				 UmaFactory.eINSTANCE.createOutcome()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.ACTIVITY__NESTED_BREAKDOWN_ELEMENT,
				 UmaFactory.eINSTANCE.createPhase()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.ACTIVITY__NESTED_BREAKDOWN_ELEMENT,
				 UmaFactory.eINSTANCE.createProcessPlanningTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.ACTIVITY__OWNED_PROCESS_PARAMETER,
				 SpemFactory.eINSTANCE.createProcessParameter()));
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
			childFeature == SpemPackage.Literals.ACTIVITY__OWNED_PROCESS_PARAMETER;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
