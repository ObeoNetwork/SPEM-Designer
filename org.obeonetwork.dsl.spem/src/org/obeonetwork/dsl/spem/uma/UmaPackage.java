/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.obeonetwork.dsl.spem.SpemPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.spem.uma.UmaFactory
 * @model kind="package"
 * @generated
 */
public interface UmaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uma";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.thalesgroup.com/spem/2.0/uma";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uma";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UmaPackage eINSTANCE = org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.ArtifactImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__KIND = SpemPackage.WORK_PRODUCT_USE__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PRESENTATION_NAME = SpemPackage.WORK_PRODUCT_USE__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__BRIEF_DESCRIPTION = SpemPackage.WORK_PRODUCT_USE__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__MAIN_DESCRIPTION = SpemPackage.WORK_PRODUCT_USE__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PURPOSE = SpemPackage.WORK_PRODUCT_USE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__GUIDANCE = SpemPackage.WORK_PRODUCT_USE__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__METRIC = SpemPackage.WORK_PRODUCT_USE__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__CATEGORY = SpemPackage.WORK_PRODUCT_USE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__COPYRIGHT = SpemPackage.WORK_PRODUCT_USE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__AUTHOR = SpemPackage.WORK_PRODUCT_USE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__CHANGE_DATE = SpemPackage.WORK_PRODUCT_USE__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__CHANGE_DESCRIPTION = SpemPackage.WORK_PRODUCT_USE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__VERSION = SpemPackage.WORK_PRODUCT_USE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = SpemPackage.WORK_PRODUCT_USE__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PROCESS_KIND = SpemPackage.WORK_PRODUCT_USE__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__HAS_MULTIPLE_OCCURRENCES = SpemPackage.WORK_PRODUCT_USE__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__IS_OPTIONAL = SpemPackage.WORK_PRODUCT_USE__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__IS_PLANNED = SpemPackage.WORK_PRODUCT_USE__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PLANNING_DATA = SpemPackage.WORK_PRODUCT_USE__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Is Synchronized With Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__IS_SYNCHRONIZED_WITH_SOURCE = SpemPackage.WORK_PRODUCT_USE__IS_SYNCHRONIZED_WITH_SOURCE;

	/**
	 * The feature id for the '<em><b>Work Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__WORK_PRODUCT = SpemPackage.WORK_PRODUCT_USE__WORK_PRODUCT;

	/**
	 * The feature id for the '<em><b>Contained Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__CONTAINED_ARTIFACT = SpemPackage.WORK_PRODUCT_USE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = SpemPackage.WORK_PRODUCT_USE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.ProcessImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 7;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PRE_CONDITION = SpemPackage.ACTIVITY__PRE_CONDITION;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__POST_CONDITION = SpemPackage.ACTIVITY__POST_CONDITION;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OWNED_PARAMETER = SpemPackage.ACTIVITY__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__KIND = SpemPackage.ACTIVITY__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PRESENTATION_NAME = SpemPackage.ACTIVITY__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__BRIEF_DESCRIPTION = SpemPackage.ACTIVITY__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__MAIN_DESCRIPTION = SpemPackage.ACTIVITY__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PURPOSE = SpemPackage.ACTIVITY__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__GUIDANCE = SpemPackage.ACTIVITY__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__METRIC = SpemPackage.ACTIVITY__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CATEGORY = SpemPackage.ACTIVITY__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__COPYRIGHT = SpemPackage.ACTIVITY__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__AUTHOR = SpemPackage.ACTIVITY__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CHANGE_DATE = SpemPackage.ACTIVITY__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CHANGE_DESCRIPTION = SpemPackage.ACTIVITY__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__VERSION = SpemPackage.ACTIVITY__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = SpemPackage.ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PROCESS_KIND = SpemPackage.ACTIVITY__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__HAS_MULTIPLE_OCCURRENCES = SpemPackage.ACTIVITY__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IS_OPTIONAL = SpemPackage.ACTIVITY__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IS_PLANNED = SpemPackage.ACTIVITY__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PLANNING_DATA = SpemPackage.ACTIVITY__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Is Repeatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IS_REPEATABLE = SpemPackage.ACTIVITY__IS_REPEATABLE;

	/**
	 * The feature id for the '<em><b>Is Ongoing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IS_ONGOING = SpemPackage.ACTIVITY__IS_ONGOING;

	/**
	 * The feature id for the '<em><b>Is Event Driven</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IS_EVENT_DRIVEN = SpemPackage.ACTIVITY__IS_EVENT_DRIVEN;

	/**
	 * The feature id for the '<em><b>Link To Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__LINK_TO_PREDECESSOR = SpemPackage.ACTIVITY__LINK_TO_PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Link To Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__LINK_TO_SUCCESSOR = SpemPackage.ACTIVITY__LINK_TO_SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__VARIABILITY_TYPE = SpemPackage.ACTIVITY__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.ACTIVITY__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Use Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__USE_KIND = SpemPackage.ACTIVITY__USE_KIND;

	/**
	 * The feature id for the '<em><b>Used Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__USED_ACTIVITY = SpemPackage.ACTIVITY__USED_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Nested Breakdown Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NESTED_BREAKDOWN_ELEMENT = SpemPackage.ACTIVITY__NESTED_BREAKDOWN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Suppressed Breakdown Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SUPPRESSED_BREAKDOWN_ELEMENT = SpemPackage.ACTIVITY__SUPPRESSED_BREAKDOWN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Process Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OWNED_PROCESS_PARAMETER = SpemPackage.ACTIVITY__OWNED_PROCESS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Default Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DEFAULT_CONTEXT = SpemPackage.ACTIVITY__DEFAULT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Valid Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__VALID_CONTEXT = SpemPackage.ACTIVITY__VALID_CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Enactable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IS_ENACTABLE = SpemPackage.ACTIVITY__IS_ENACTABLE;

	/**
	 * The feature id for the '<em><b>Included Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INCLUDED_PATTERN = SpemPackage.ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SCOPE = SpemPackage.ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usage Note</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__USAGE_NOTE = SpemPackage.ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Included Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INCLUDED_CONNECTOR = SpemPackage.ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = SpemPackage.ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.CapabilityPatternImpl <em>Capability Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.CapabilityPatternImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getCapabilityPattern()
	 * @generated
	 */
	int CAPABILITY_PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__PRE_CONDITION = PROCESS__PRE_CONDITION;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__POST_CONDITION = PROCESS__POST_CONDITION;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__OWNED_PARAMETER = PROCESS__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__KIND = PROCESS__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__PRESENTATION_NAME = PROCESS__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__BRIEF_DESCRIPTION = PROCESS__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__MAIN_DESCRIPTION = PROCESS__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__PURPOSE = PROCESS__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__GUIDANCE = PROCESS__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__METRIC = PROCESS__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__CATEGORY = PROCESS__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__COPYRIGHT = PROCESS__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__AUTHOR = PROCESS__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__CHANGE_DATE = PROCESS__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__CHANGE_DESCRIPTION = PROCESS__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__VERSION = PROCESS__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__PROCESS_KIND = PROCESS__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__HAS_MULTIPLE_OCCURRENCES = PROCESS__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__IS_OPTIONAL = PROCESS__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__IS_PLANNED = PROCESS__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__PLANNING_DATA = PROCESS__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Is Repeatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__IS_REPEATABLE = PROCESS__IS_REPEATABLE;

	/**
	 * The feature id for the '<em><b>Is Ongoing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__IS_ONGOING = PROCESS__IS_ONGOING;

	/**
	 * The feature id for the '<em><b>Is Event Driven</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__IS_EVENT_DRIVEN = PROCESS__IS_EVENT_DRIVEN;

	/**
	 * The feature id for the '<em><b>Link To Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__LINK_TO_PREDECESSOR = PROCESS__LINK_TO_PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Link To Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__LINK_TO_SUCCESSOR = PROCESS__LINK_TO_SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__VARIABILITY_TYPE = PROCESS__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__VARIABILITY_BASED_ON_ELEMENT = PROCESS__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Use Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__USE_KIND = PROCESS__USE_KIND;

	/**
	 * The feature id for the '<em><b>Used Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__USED_ACTIVITY = PROCESS__USED_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Nested Breakdown Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__NESTED_BREAKDOWN_ELEMENT = PROCESS__NESTED_BREAKDOWN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Suppressed Breakdown Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__SUPPRESSED_BREAKDOWN_ELEMENT = PROCESS__SUPPRESSED_BREAKDOWN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Process Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__OWNED_PROCESS_PARAMETER = PROCESS__OWNED_PROCESS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Default Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__DEFAULT_CONTEXT = PROCESS__DEFAULT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Valid Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__VALID_CONTEXT = PROCESS__VALID_CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Enactable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__IS_ENACTABLE = PROCESS__IS_ENACTABLE;

	/**
	 * The feature id for the '<em><b>Included Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__INCLUDED_PATTERN = PROCESS__INCLUDED_PATTERN;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__SCOPE = PROCESS__SCOPE;

	/**
	 * The feature id for the '<em><b>Usage Note</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__USAGE_NOTE = PROCESS__USAGE_NOTE;

	/**
	 * The feature id for the '<em><b>Included Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN__INCLUDED_CONNECTOR = PROCESS__INCLUDED_CONNECTOR;

	/**
	 * The number of structural features of the '<em>Capability Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.ChecklistImpl <em>Checklist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.ChecklistImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getChecklist()
	 * @generated
	 */
	int CHECKLIST = 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST__KIND = SpemPackage.GUIDANCE__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST__PRESENTATION_NAME = SpemPackage.GUIDANCE__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST__BRIEF_DESCRIPTION = SpemPackage.GUIDANCE__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST__MAIN_DESCRIPTION = SpemPackage.GUIDANCE__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST__PURPOSE = SpemPackage.GUIDANCE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST__GUIDANCE = SpemPackage.GUIDANCE__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST__METRIC = SpemPackage.GUIDANCE__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST__CATEGORY = SpemPackage.GUIDANCE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST__COPYRIGHT = SpemPackage.GUIDANCE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST__AUTHOR = SpemPackage.GUIDANCE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST__CHANGE_DATE = SpemPackage.GUIDANCE__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST__CHANGE_DESCRIPTION = SpemPackage.GUIDANCE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST__VERSION = SpemPackage.GUIDANCE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST__NAME = SpemPackage.GUIDANCE__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST__VARIABILITY_TYPE = SpemPackage.GUIDANCE__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.GUIDANCE__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST__METHOD_CONTENT_KIND = SpemPackage.GUIDANCE__METHOD_CONTENT_KIND;

	/**
	 * The number of structural features of the '<em>Checklist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST_FEATURE_COUNT = SpemPackage.GUIDANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.ConceptImpl <em>Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.ConceptImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getConcept()
	 * @generated
	 */
	int CONCEPT = 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__KIND = SpemPackage.GUIDANCE__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__PRESENTATION_NAME = SpemPackage.GUIDANCE__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__BRIEF_DESCRIPTION = SpemPackage.GUIDANCE__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__MAIN_DESCRIPTION = SpemPackage.GUIDANCE__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__PURPOSE = SpemPackage.GUIDANCE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__GUIDANCE = SpemPackage.GUIDANCE__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__METRIC = SpemPackage.GUIDANCE__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__CATEGORY = SpemPackage.GUIDANCE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__COPYRIGHT = SpemPackage.GUIDANCE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__AUTHOR = SpemPackage.GUIDANCE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__CHANGE_DATE = SpemPackage.GUIDANCE__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__CHANGE_DESCRIPTION = SpemPackage.GUIDANCE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__VERSION = SpemPackage.GUIDANCE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__NAME = SpemPackage.GUIDANCE__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__VARIABILITY_TYPE = SpemPackage.GUIDANCE__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.GUIDANCE__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__METHOD_CONTENT_KIND = SpemPackage.GUIDANCE__METHOD_CONTENT_KIND;

	/**
	 * The number of structural features of the '<em>Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_FEATURE_COUNT = SpemPackage.GUIDANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.CategoryPackageImpl <em>Category Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.CategoryPackageImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getCategoryPackage()
	 * @generated
	 */
	int CATEGORY_PACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_PACKAGE__NAME = SpemPackage.METHOD_CONTENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Method Content Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_PACKAGE__OWNED_METHOD_CONTENT_MEMBER = SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER;

	/**
	 * The feature id for the '<em><b>Reused Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_PACKAGE__REUSED_PACKAGE = SpemPackage.METHOD_CONTENT_PACKAGE__REUSED_PACKAGE;

	/**
	 * The number of structural features of the '<em>Category Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_PACKAGE_FEATURE_COUNT = SpemPackage.METHOD_CONTENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.CustomCategoryImpl <em>Custom Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.CustomCategoryImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getCustomCategory()
	 * @generated
	 */
	int CUSTOM_CATEGORY = 5;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CATEGORY__KIND = SpemPackage.CATEGORY__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CATEGORY__PRESENTATION_NAME = SpemPackage.CATEGORY__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CATEGORY__BRIEF_DESCRIPTION = SpemPackage.CATEGORY__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CATEGORY__MAIN_DESCRIPTION = SpemPackage.CATEGORY__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CATEGORY__PURPOSE = SpemPackage.CATEGORY__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CATEGORY__GUIDANCE = SpemPackage.CATEGORY__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CATEGORY__METRIC = SpemPackage.CATEGORY__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CATEGORY__CATEGORY = SpemPackage.CATEGORY__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CATEGORY__COPYRIGHT = SpemPackage.CATEGORY__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CATEGORY__AUTHOR = SpemPackage.CATEGORY__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CATEGORY__CHANGE_DATE = SpemPackage.CATEGORY__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CATEGORY__CHANGE_DESCRIPTION = SpemPackage.CATEGORY__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CATEGORY__VERSION = SpemPackage.CATEGORY__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CATEGORY__NAME = SpemPackage.CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CATEGORY__VARIABILITY_TYPE = SpemPackage.CATEGORY__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CATEGORY__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.CATEGORY__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CATEGORY__METHOD_CONTENT_KIND = SpemPackage.CATEGORY__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>Sub Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CATEGORY__SUB_CATEGORY = SpemPackage.CATEGORY__SUB_CATEGORY;

	/**
	 * The feature id for the '<em><b>Categorized Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CATEGORY__CATEGORIZED_ELEMENT = SpemPackage.CATEGORY__CATEGORIZED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Custom Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CATEGORY_FEATURE_COUNT = SpemPackage.CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.DeliverableImpl <em>Deliverable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.DeliverableImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getDeliverable()
	 * @generated
	 */
	int DELIVERABLE = 6;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__KIND = SpemPackage.WORK_PRODUCT_USE__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__PRESENTATION_NAME = SpemPackage.WORK_PRODUCT_USE__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__BRIEF_DESCRIPTION = SpemPackage.WORK_PRODUCT_USE__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__MAIN_DESCRIPTION = SpemPackage.WORK_PRODUCT_USE__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__PURPOSE = SpemPackage.WORK_PRODUCT_USE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__GUIDANCE = SpemPackage.WORK_PRODUCT_USE__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__METRIC = SpemPackage.WORK_PRODUCT_USE__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__CATEGORY = SpemPackage.WORK_PRODUCT_USE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__COPYRIGHT = SpemPackage.WORK_PRODUCT_USE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__AUTHOR = SpemPackage.WORK_PRODUCT_USE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__CHANGE_DATE = SpemPackage.WORK_PRODUCT_USE__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__CHANGE_DESCRIPTION = SpemPackage.WORK_PRODUCT_USE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__VERSION = SpemPackage.WORK_PRODUCT_USE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__NAME = SpemPackage.WORK_PRODUCT_USE__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__PROCESS_KIND = SpemPackage.WORK_PRODUCT_USE__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__HAS_MULTIPLE_OCCURRENCES = SpemPackage.WORK_PRODUCT_USE__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__IS_OPTIONAL = SpemPackage.WORK_PRODUCT_USE__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__IS_PLANNED = SpemPackage.WORK_PRODUCT_USE__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__PLANNING_DATA = SpemPackage.WORK_PRODUCT_USE__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Is Synchronized With Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__IS_SYNCHRONIZED_WITH_SOURCE = SpemPackage.WORK_PRODUCT_USE__IS_SYNCHRONIZED_WITH_SOURCE;

	/**
	 * The feature id for the '<em><b>Work Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__WORK_PRODUCT = SpemPackage.WORK_PRODUCT_USE__WORK_PRODUCT;

	/**
	 * The feature id for the '<em><b>Delivered Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__DELIVERED_PRODUCT = SpemPackage.WORK_PRODUCT_USE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__EXTERNAL_DESCRIPTION = SpemPackage.WORK_PRODUCT_USE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Packaging Guidance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__PACKAGING_GUIDANCE = SpemPackage.WORK_PRODUCT_USE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Deliverable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE_FEATURE_COUNT = SpemPackage.WORK_PRODUCT_USE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.DeliveryProcessImpl <em>Delivery Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.DeliveryProcessImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getDeliveryProcess()
	 * @generated
	 */
	int DELIVERY_PROCESS = 8;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__PRE_CONDITION = PROCESS__PRE_CONDITION;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__POST_CONDITION = PROCESS__POST_CONDITION;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__OWNED_PARAMETER = PROCESS__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__KIND = PROCESS__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__PRESENTATION_NAME = PROCESS__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__BRIEF_DESCRIPTION = PROCESS__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__MAIN_DESCRIPTION = PROCESS__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__PURPOSE = PROCESS__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__GUIDANCE = PROCESS__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__METRIC = PROCESS__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__CATEGORY = PROCESS__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__COPYRIGHT = PROCESS__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__AUTHOR = PROCESS__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__CHANGE_DATE = PROCESS__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__CHANGE_DESCRIPTION = PROCESS__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__VERSION = PROCESS__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__PROCESS_KIND = PROCESS__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__HAS_MULTIPLE_OCCURRENCES = PROCESS__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__IS_OPTIONAL = PROCESS__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__IS_PLANNED = PROCESS__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__PLANNING_DATA = PROCESS__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Is Repeatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__IS_REPEATABLE = PROCESS__IS_REPEATABLE;

	/**
	 * The feature id for the '<em><b>Is Ongoing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__IS_ONGOING = PROCESS__IS_ONGOING;

	/**
	 * The feature id for the '<em><b>Is Event Driven</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__IS_EVENT_DRIVEN = PROCESS__IS_EVENT_DRIVEN;

	/**
	 * The feature id for the '<em><b>Link To Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__LINK_TO_PREDECESSOR = PROCESS__LINK_TO_PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Link To Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__LINK_TO_SUCCESSOR = PROCESS__LINK_TO_SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__VARIABILITY_TYPE = PROCESS__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__VARIABILITY_BASED_ON_ELEMENT = PROCESS__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Use Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__USE_KIND = PROCESS__USE_KIND;

	/**
	 * The feature id for the '<em><b>Used Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__USED_ACTIVITY = PROCESS__USED_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Nested Breakdown Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__NESTED_BREAKDOWN_ELEMENT = PROCESS__NESTED_BREAKDOWN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Suppressed Breakdown Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__SUPPRESSED_BREAKDOWN_ELEMENT = PROCESS__SUPPRESSED_BREAKDOWN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Process Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__OWNED_PROCESS_PARAMETER = PROCESS__OWNED_PROCESS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Default Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__DEFAULT_CONTEXT = PROCESS__DEFAULT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Valid Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__VALID_CONTEXT = PROCESS__VALID_CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Enactable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__IS_ENACTABLE = PROCESS__IS_ENACTABLE;

	/**
	 * The feature id for the '<em><b>Included Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__INCLUDED_PATTERN = PROCESS__INCLUDED_PATTERN;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__SCOPE = PROCESS__SCOPE;

	/**
	 * The feature id for the '<em><b>Usage Note</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__USAGE_NOTE = PROCESS__USAGE_NOTE;

	/**
	 * The feature id for the '<em><b>Included Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__INCLUDED_CONNECTOR = PROCESS__INCLUDED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__SCALE = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Project Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__PROJECT_CHARACTERISTICS = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Risk Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__RISK_LEVEL = PROCESS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Estimating Technique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__ESTIMATING_TECHNIQUE = PROCESS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Project Member Expertise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__PROJECT_MEMBER_EXPERTISE = PROCESS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type Of Contract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__TYPE_OF_CONTRACT = PROCESS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Communication Material</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__COMMUNICATION_MATERIAL = PROCESS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Educational Material</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS__EDUCATIONAL_MATERIAL = PROCESS_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Delivery Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.DisciplineImpl <em>Discipline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.DisciplineImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getDiscipline()
	 * @generated
	 */
	int DISCIPLINE = 9;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE__KIND = SpemPackage.CATEGORY__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE__PRESENTATION_NAME = SpemPackage.CATEGORY__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE__BRIEF_DESCRIPTION = SpemPackage.CATEGORY__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE__MAIN_DESCRIPTION = SpemPackage.CATEGORY__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE__PURPOSE = SpemPackage.CATEGORY__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE__GUIDANCE = SpemPackage.CATEGORY__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE__METRIC = SpemPackage.CATEGORY__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE__CATEGORY = SpemPackage.CATEGORY__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE__COPYRIGHT = SpemPackage.CATEGORY__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE__AUTHOR = SpemPackage.CATEGORY__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE__CHANGE_DATE = SpemPackage.CATEGORY__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE__CHANGE_DESCRIPTION = SpemPackage.CATEGORY__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE__VERSION = SpemPackage.CATEGORY__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE__NAME = SpemPackage.CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE__VARIABILITY_TYPE = SpemPackage.CATEGORY__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.CATEGORY__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE__METHOD_CONTENT_KIND = SpemPackage.CATEGORY__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>Sub Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE__SUB_CATEGORY = SpemPackage.CATEGORY__SUB_CATEGORY;

	/**
	 * The feature id for the '<em><b>Categorized Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE__CATEGORIZED_ELEMENT = SpemPackage.CATEGORY__CATEGORIZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Related Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE__RELATED_TASK = SpemPackage.CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Related Worflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE__RELATED_WORFLOW = SpemPackage.CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Discipline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_FEATURE_COUNT = SpemPackage.CATEGORY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.DisciplineGroupingImpl <em>Discipline Grouping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.DisciplineGroupingImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getDisciplineGrouping()
	 * @generated
	 */
	int DISCIPLINE_GROUPING = 10;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_GROUPING__KIND = SpemPackage.CATEGORY__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_GROUPING__PRESENTATION_NAME = SpemPackage.CATEGORY__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_GROUPING__BRIEF_DESCRIPTION = SpemPackage.CATEGORY__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_GROUPING__MAIN_DESCRIPTION = SpemPackage.CATEGORY__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_GROUPING__PURPOSE = SpemPackage.CATEGORY__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_GROUPING__GUIDANCE = SpemPackage.CATEGORY__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_GROUPING__METRIC = SpemPackage.CATEGORY__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_GROUPING__CATEGORY = SpemPackage.CATEGORY__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_GROUPING__COPYRIGHT = SpemPackage.CATEGORY__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_GROUPING__AUTHOR = SpemPackage.CATEGORY__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_GROUPING__CHANGE_DATE = SpemPackage.CATEGORY__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_GROUPING__CHANGE_DESCRIPTION = SpemPackage.CATEGORY__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_GROUPING__VERSION = SpemPackage.CATEGORY__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_GROUPING__NAME = SpemPackage.CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_GROUPING__VARIABILITY_TYPE = SpemPackage.CATEGORY__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_GROUPING__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.CATEGORY__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_GROUPING__METHOD_CONTENT_KIND = SpemPackage.CATEGORY__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>Sub Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_GROUPING__SUB_CATEGORY = SpemPackage.CATEGORY__SUB_CATEGORY;

	/**
	 * The feature id for the '<em><b>Categorized Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_GROUPING__CATEGORIZED_ELEMENT = SpemPackage.CATEGORY__CATEGORIZED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Discipline Grouping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_GROUPING_FEATURE_COUNT = SpemPackage.CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.RootImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 11;

	/**
	 * The feature id for the '<em><b>Method Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__METHOD_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Method Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__METHOD_LIBRARY = 1;

	/**
	 * The feature id for the '<em><b>Method Plugin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__METHOD_PLUGIN = 2;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.DomainImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 12;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__KIND = SpemPackage.CATEGORY__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__PRESENTATION_NAME = SpemPackage.CATEGORY__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__BRIEF_DESCRIPTION = SpemPackage.CATEGORY__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__MAIN_DESCRIPTION = SpemPackage.CATEGORY__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__PURPOSE = SpemPackage.CATEGORY__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__GUIDANCE = SpemPackage.CATEGORY__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__METRIC = SpemPackage.CATEGORY__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__CATEGORY = SpemPackage.CATEGORY__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__COPYRIGHT = SpemPackage.CATEGORY__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__AUTHOR = SpemPackage.CATEGORY__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__CHANGE_DATE = SpemPackage.CATEGORY__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__CHANGE_DESCRIPTION = SpemPackage.CATEGORY__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__VERSION = SpemPackage.CATEGORY__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = SpemPackage.CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__VARIABILITY_TYPE = SpemPackage.CATEGORY__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.CATEGORY__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__METHOD_CONTENT_KIND = SpemPackage.CATEGORY__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>Sub Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SUB_CATEGORY = SpemPackage.CATEGORY__SUB_CATEGORY;

	/**
	 * The feature id for the '<em><b>Categorized Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__CATEGORIZED_ELEMENT = SpemPackage.CATEGORY__CATEGORIZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Related Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__RELATED_PRODUCT = SpemPackage.CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = SpemPackage.CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.EstimatingConsiderationImpl <em>Estimating Consideration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.EstimatingConsiderationImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getEstimatingConsideration()
	 * @generated
	 */
	int ESTIMATING_CONSIDERATION = 13;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATING_CONSIDERATION__KIND = SpemPackage.GUIDANCE__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATING_CONSIDERATION__PRESENTATION_NAME = SpemPackage.GUIDANCE__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATING_CONSIDERATION__BRIEF_DESCRIPTION = SpemPackage.GUIDANCE__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATING_CONSIDERATION__MAIN_DESCRIPTION = SpemPackage.GUIDANCE__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATING_CONSIDERATION__PURPOSE = SpemPackage.GUIDANCE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATING_CONSIDERATION__GUIDANCE = SpemPackage.GUIDANCE__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATING_CONSIDERATION__METRIC = SpemPackage.GUIDANCE__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATING_CONSIDERATION__CATEGORY = SpemPackage.GUIDANCE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATING_CONSIDERATION__COPYRIGHT = SpemPackage.GUIDANCE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATING_CONSIDERATION__AUTHOR = SpemPackage.GUIDANCE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATING_CONSIDERATION__CHANGE_DATE = SpemPackage.GUIDANCE__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATING_CONSIDERATION__CHANGE_DESCRIPTION = SpemPackage.GUIDANCE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATING_CONSIDERATION__VERSION = SpemPackage.GUIDANCE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATING_CONSIDERATION__NAME = SpemPackage.GUIDANCE__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATING_CONSIDERATION__VARIABILITY_TYPE = SpemPackage.GUIDANCE__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATING_CONSIDERATION__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.GUIDANCE__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATING_CONSIDERATION__METHOD_CONTENT_KIND = SpemPackage.GUIDANCE__METHOD_CONTENT_KIND;

	/**
	 * The number of structural features of the '<em>Estimating Consideration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATING_CONSIDERATION_FEATURE_COUNT = SpemPackage.GUIDANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.ExampleImpl <em>Example</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.ExampleImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getExample()
	 * @generated
	 */
	int EXAMPLE = 14;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__KIND = SpemPackage.GUIDANCE__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__PRESENTATION_NAME = SpemPackage.GUIDANCE__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__BRIEF_DESCRIPTION = SpemPackage.GUIDANCE__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__MAIN_DESCRIPTION = SpemPackage.GUIDANCE__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__PURPOSE = SpemPackage.GUIDANCE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__GUIDANCE = SpemPackage.GUIDANCE__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__METRIC = SpemPackage.GUIDANCE__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__CATEGORY = SpemPackage.GUIDANCE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__COPYRIGHT = SpemPackage.GUIDANCE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__AUTHOR = SpemPackage.GUIDANCE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__CHANGE_DATE = SpemPackage.GUIDANCE__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__CHANGE_DESCRIPTION = SpemPackage.GUIDANCE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__VERSION = SpemPackage.GUIDANCE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__NAME = SpemPackage.GUIDANCE__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__VARIABILITY_TYPE = SpemPackage.GUIDANCE__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.GUIDANCE__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__METHOD_CONTENT_KIND = SpemPackage.GUIDANCE__METHOD_CONTENT_KIND;

	/**
	 * The number of structural features of the '<em>Example</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_FEATURE_COUNT = SpemPackage.GUIDANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.IterationImpl <em>Iteration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.IterationImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getIteration()
	 * @generated
	 */
	int ITERATION = 15;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__PRE_CONDITION = SpemPackage.ACTIVITY__PRE_CONDITION;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__POST_CONDITION = SpemPackage.ACTIVITY__POST_CONDITION;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__OWNED_PARAMETER = SpemPackage.ACTIVITY__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__KIND = SpemPackage.ACTIVITY__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__PRESENTATION_NAME = SpemPackage.ACTIVITY__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__BRIEF_DESCRIPTION = SpemPackage.ACTIVITY__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__MAIN_DESCRIPTION = SpemPackage.ACTIVITY__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__PURPOSE = SpemPackage.ACTIVITY__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__GUIDANCE = SpemPackage.ACTIVITY__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__METRIC = SpemPackage.ACTIVITY__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__CATEGORY = SpemPackage.ACTIVITY__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__COPYRIGHT = SpemPackage.ACTIVITY__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__AUTHOR = SpemPackage.ACTIVITY__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__CHANGE_DATE = SpemPackage.ACTIVITY__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__CHANGE_DESCRIPTION = SpemPackage.ACTIVITY__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__VERSION = SpemPackage.ACTIVITY__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__NAME = SpemPackage.ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__PROCESS_KIND = SpemPackage.ACTIVITY__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__HAS_MULTIPLE_OCCURRENCES = SpemPackage.ACTIVITY__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__IS_OPTIONAL = SpemPackage.ACTIVITY__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__IS_PLANNED = SpemPackage.ACTIVITY__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__PLANNING_DATA = SpemPackage.ACTIVITY__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Is Repeatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__IS_REPEATABLE = SpemPackage.ACTIVITY__IS_REPEATABLE;

	/**
	 * The feature id for the '<em><b>Is Ongoing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__IS_ONGOING = SpemPackage.ACTIVITY__IS_ONGOING;

	/**
	 * The feature id for the '<em><b>Is Event Driven</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__IS_EVENT_DRIVEN = SpemPackage.ACTIVITY__IS_EVENT_DRIVEN;

	/**
	 * The feature id for the '<em><b>Link To Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__LINK_TO_PREDECESSOR = SpemPackage.ACTIVITY__LINK_TO_PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Link To Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__LINK_TO_SUCCESSOR = SpemPackage.ACTIVITY__LINK_TO_SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__VARIABILITY_TYPE = SpemPackage.ACTIVITY__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.ACTIVITY__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Use Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__USE_KIND = SpemPackage.ACTIVITY__USE_KIND;

	/**
	 * The feature id for the '<em><b>Used Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__USED_ACTIVITY = SpemPackage.ACTIVITY__USED_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Nested Breakdown Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__NESTED_BREAKDOWN_ELEMENT = SpemPackage.ACTIVITY__NESTED_BREAKDOWN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Suppressed Breakdown Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__SUPPRESSED_BREAKDOWN_ELEMENT = SpemPackage.ACTIVITY__SUPPRESSED_BREAKDOWN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Process Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__OWNED_PROCESS_PARAMETER = SpemPackage.ACTIVITY__OWNED_PROCESS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Default Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__DEFAULT_CONTEXT = SpemPackage.ACTIVITY__DEFAULT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Valid Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__VALID_CONTEXT = SpemPackage.ACTIVITY__VALID_CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Enactable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__IS_ENACTABLE = SpemPackage.ACTIVITY__IS_ENACTABLE;

	/**
	 * The number of structural features of the '<em>Iteration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_FEATURE_COUNT = SpemPackage.ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.OutcomeImpl <em>Outcome</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.OutcomeImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getOutcome()
	 * @generated
	 */
	int OUTCOME = 16;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__KIND = SpemPackage.WORK_PRODUCT_USE__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__PRESENTATION_NAME = SpemPackage.WORK_PRODUCT_USE__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__BRIEF_DESCRIPTION = SpemPackage.WORK_PRODUCT_USE__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__MAIN_DESCRIPTION = SpemPackage.WORK_PRODUCT_USE__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__PURPOSE = SpemPackage.WORK_PRODUCT_USE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__GUIDANCE = SpemPackage.WORK_PRODUCT_USE__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__METRIC = SpemPackage.WORK_PRODUCT_USE__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__CATEGORY = SpemPackage.WORK_PRODUCT_USE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__COPYRIGHT = SpemPackage.WORK_PRODUCT_USE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__AUTHOR = SpemPackage.WORK_PRODUCT_USE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__CHANGE_DATE = SpemPackage.WORK_PRODUCT_USE__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__CHANGE_DESCRIPTION = SpemPackage.WORK_PRODUCT_USE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__VERSION = SpemPackage.WORK_PRODUCT_USE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__NAME = SpemPackage.WORK_PRODUCT_USE__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__PROCESS_KIND = SpemPackage.WORK_PRODUCT_USE__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__HAS_MULTIPLE_OCCURRENCES = SpemPackage.WORK_PRODUCT_USE__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__IS_OPTIONAL = SpemPackage.WORK_PRODUCT_USE__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__IS_PLANNED = SpemPackage.WORK_PRODUCT_USE__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__PLANNING_DATA = SpemPackage.WORK_PRODUCT_USE__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Is Synchronized With Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__IS_SYNCHRONIZED_WITH_SOURCE = SpemPackage.WORK_PRODUCT_USE__IS_SYNCHRONIZED_WITH_SOURCE;

	/**
	 * The feature id for the '<em><b>Work Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__WORK_PRODUCT = SpemPackage.WORK_PRODUCT_USE__WORK_PRODUCT;

	/**
	 * The number of structural features of the '<em>Outcome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME_FEATURE_COUNT = SpemPackage.WORK_PRODUCT_USE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.PhaseImpl <em>Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.PhaseImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getPhase()
	 * @generated
	 */
	int PHASE = 17;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__PRE_CONDITION = SpemPackage.ACTIVITY__PRE_CONDITION;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__POST_CONDITION = SpemPackage.ACTIVITY__POST_CONDITION;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__OWNED_PARAMETER = SpemPackage.ACTIVITY__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__KIND = SpemPackage.ACTIVITY__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__PRESENTATION_NAME = SpemPackage.ACTIVITY__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__BRIEF_DESCRIPTION = SpemPackage.ACTIVITY__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__MAIN_DESCRIPTION = SpemPackage.ACTIVITY__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__PURPOSE = SpemPackage.ACTIVITY__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__GUIDANCE = SpemPackage.ACTIVITY__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__METRIC = SpemPackage.ACTIVITY__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__CATEGORY = SpemPackage.ACTIVITY__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__COPYRIGHT = SpemPackage.ACTIVITY__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__AUTHOR = SpemPackage.ACTIVITY__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__CHANGE_DATE = SpemPackage.ACTIVITY__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__CHANGE_DESCRIPTION = SpemPackage.ACTIVITY__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__VERSION = SpemPackage.ACTIVITY__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__NAME = SpemPackage.ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__PROCESS_KIND = SpemPackage.ACTIVITY__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__HAS_MULTIPLE_OCCURRENCES = SpemPackage.ACTIVITY__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__IS_OPTIONAL = SpemPackage.ACTIVITY__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__IS_PLANNED = SpemPackage.ACTIVITY__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__PLANNING_DATA = SpemPackage.ACTIVITY__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Is Repeatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__IS_REPEATABLE = SpemPackage.ACTIVITY__IS_REPEATABLE;

	/**
	 * The feature id for the '<em><b>Is Ongoing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__IS_ONGOING = SpemPackage.ACTIVITY__IS_ONGOING;

	/**
	 * The feature id for the '<em><b>Is Event Driven</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__IS_EVENT_DRIVEN = SpemPackage.ACTIVITY__IS_EVENT_DRIVEN;

	/**
	 * The feature id for the '<em><b>Link To Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__LINK_TO_PREDECESSOR = SpemPackage.ACTIVITY__LINK_TO_PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Link To Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__LINK_TO_SUCCESSOR = SpemPackage.ACTIVITY__LINK_TO_SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__VARIABILITY_TYPE = SpemPackage.ACTIVITY__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.ACTIVITY__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Use Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__USE_KIND = SpemPackage.ACTIVITY__USE_KIND;

	/**
	 * The feature id for the '<em><b>Used Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__USED_ACTIVITY = SpemPackage.ACTIVITY__USED_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Nested Breakdown Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__NESTED_BREAKDOWN_ELEMENT = SpemPackage.ACTIVITY__NESTED_BREAKDOWN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Suppressed Breakdown Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__SUPPRESSED_BREAKDOWN_ELEMENT = SpemPackage.ACTIVITY__SUPPRESSED_BREAKDOWN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Process Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__OWNED_PROCESS_PARAMETER = SpemPackage.ACTIVITY__OWNED_PROCESS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Default Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__DEFAULT_CONTEXT = SpemPackage.ACTIVITY__DEFAULT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Valid Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__VALID_CONTEXT = SpemPackage.ACTIVITY__VALID_CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Enactable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__IS_ENACTABLE = SpemPackage.ACTIVITY__IS_ENACTABLE;

	/**
	 * The number of structural features of the '<em>Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_FEATURE_COUNT = SpemPackage.ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.PracticeImpl <em>Practice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.PracticeImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getPractice()
	 * @generated
	 */
	int PRACTICE = 18;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__KIND = SpemPackage.GUIDANCE__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__PRESENTATION_NAME = SpemPackage.GUIDANCE__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__BRIEF_DESCRIPTION = SpemPackage.GUIDANCE__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__MAIN_DESCRIPTION = SpemPackage.GUIDANCE__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__PURPOSE = SpemPackage.GUIDANCE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__GUIDANCE = SpemPackage.GUIDANCE__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__METRIC = SpemPackage.GUIDANCE__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__CATEGORY = SpemPackage.GUIDANCE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__COPYRIGHT = SpemPackage.GUIDANCE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__AUTHOR = SpemPackage.GUIDANCE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__CHANGE_DATE = SpemPackage.GUIDANCE__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__CHANGE_DESCRIPTION = SpemPackage.GUIDANCE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__VERSION = SpemPackage.GUIDANCE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__NAME = SpemPackage.GUIDANCE__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__VARIABILITY_TYPE = SpemPackage.GUIDANCE__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.GUIDANCE__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__METHOD_CONTENT_KIND = SpemPackage.GUIDANCE__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>Sub Practice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__SUB_PRACTICE = SpemPackage.GUIDANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__REFERENCED_ACTIVITY = SpemPackage.GUIDANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Content Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__CONTENT_REFERENCE = SpemPackage.GUIDANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Additional Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__ADDITIONAL_INFO = SpemPackage.GUIDANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__APPLICATION = SpemPackage.GUIDANCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__BACKGROUND = SpemPackage.GUIDANCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__GOAL = SpemPackage.GUIDANCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Level Of Adoption</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__LEVEL_OF_ADOPTION = SpemPackage.GUIDANCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE__PROBLEM = SpemPackage.GUIDANCE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Practice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICE_FEATURE_COUNT = SpemPackage.GUIDANCE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.ProcessPlanningTemplateImpl <em>Process Planning Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.ProcessPlanningTemplateImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getProcessPlanningTemplate()
	 * @generated
	 */
	int PROCESS_PLANNING_TEMPLATE = 19;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__PRE_CONDITION = PROCESS__PRE_CONDITION;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__POST_CONDITION = PROCESS__POST_CONDITION;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__OWNED_PARAMETER = PROCESS__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__KIND = PROCESS__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__PRESENTATION_NAME = PROCESS__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__BRIEF_DESCRIPTION = PROCESS__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__MAIN_DESCRIPTION = PROCESS__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__PURPOSE = PROCESS__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__GUIDANCE = PROCESS__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__METRIC = PROCESS__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__CATEGORY = PROCESS__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__COPYRIGHT = PROCESS__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__AUTHOR = PROCESS__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__CHANGE_DATE = PROCESS__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__CHANGE_DESCRIPTION = PROCESS__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__VERSION = PROCESS__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__PROCESS_KIND = PROCESS__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__HAS_MULTIPLE_OCCURRENCES = PROCESS__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__IS_OPTIONAL = PROCESS__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__IS_PLANNED = PROCESS__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__PLANNING_DATA = PROCESS__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Is Repeatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__IS_REPEATABLE = PROCESS__IS_REPEATABLE;

	/**
	 * The feature id for the '<em><b>Is Ongoing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__IS_ONGOING = PROCESS__IS_ONGOING;

	/**
	 * The feature id for the '<em><b>Is Event Driven</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__IS_EVENT_DRIVEN = PROCESS__IS_EVENT_DRIVEN;

	/**
	 * The feature id for the '<em><b>Link To Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__LINK_TO_PREDECESSOR = PROCESS__LINK_TO_PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Link To Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__LINK_TO_SUCCESSOR = PROCESS__LINK_TO_SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__VARIABILITY_TYPE = PROCESS__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__VARIABILITY_BASED_ON_ELEMENT = PROCESS__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Use Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__USE_KIND = PROCESS__USE_KIND;

	/**
	 * The feature id for the '<em><b>Used Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__USED_ACTIVITY = PROCESS__USED_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Nested Breakdown Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__NESTED_BREAKDOWN_ELEMENT = PROCESS__NESTED_BREAKDOWN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Suppressed Breakdown Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__SUPPRESSED_BREAKDOWN_ELEMENT = PROCESS__SUPPRESSED_BREAKDOWN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Process Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__OWNED_PROCESS_PARAMETER = PROCESS__OWNED_PROCESS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Default Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__DEFAULT_CONTEXT = PROCESS__DEFAULT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Valid Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__VALID_CONTEXT = PROCESS__VALID_CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Enactable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__IS_ENACTABLE = PROCESS__IS_ENACTABLE;

	/**
	 * The feature id for the '<em><b>Included Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__INCLUDED_PATTERN = PROCESS__INCLUDED_PATTERN;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__SCOPE = PROCESS__SCOPE;

	/**
	 * The feature id for the '<em><b>Usage Note</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__USAGE_NOTE = PROCESS__USAGE_NOTE;

	/**
	 * The feature id for the '<em><b>Included Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__INCLUDED_CONNECTOR = PROCESS__INCLUDED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Base Process</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE__BASE_PROCESS = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process Planning Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PLANNING_TEMPLATE_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.ReportImpl <em>Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.ReportImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getReport()
	 * @generated
	 */
	int REPORT = 20;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__KIND = SpemPackage.GUIDANCE__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__PRESENTATION_NAME = SpemPackage.GUIDANCE__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__BRIEF_DESCRIPTION = SpemPackage.GUIDANCE__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__MAIN_DESCRIPTION = SpemPackage.GUIDANCE__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__PURPOSE = SpemPackage.GUIDANCE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__GUIDANCE = SpemPackage.GUIDANCE__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__METRIC = SpemPackage.GUIDANCE__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__CATEGORY = SpemPackage.GUIDANCE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__COPYRIGHT = SpemPackage.GUIDANCE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__AUTHOR = SpemPackage.GUIDANCE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__CHANGE_DATE = SpemPackage.GUIDANCE__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__CHANGE_DESCRIPTION = SpemPackage.GUIDANCE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__VERSION = SpemPackage.GUIDANCE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__NAME = SpemPackage.GUIDANCE__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__VARIABILITY_TYPE = SpemPackage.GUIDANCE__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.GUIDANCE__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__METHOD_CONTENT_KIND = SpemPackage.GUIDANCE__METHOD_CONTENT_KIND;

	/**
	 * The number of structural features of the '<em>Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_FEATURE_COUNT = SpemPackage.GUIDANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.ReusableAssetImpl <em>Reusable Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.ReusableAssetImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getReusableAsset()
	 * @generated
	 */
	int REUSABLE_ASSET = 21;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLE_ASSET__KIND = SpemPackage.GUIDANCE__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLE_ASSET__PRESENTATION_NAME = SpemPackage.GUIDANCE__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLE_ASSET__BRIEF_DESCRIPTION = SpemPackage.GUIDANCE__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLE_ASSET__MAIN_DESCRIPTION = SpemPackage.GUIDANCE__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLE_ASSET__PURPOSE = SpemPackage.GUIDANCE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLE_ASSET__GUIDANCE = SpemPackage.GUIDANCE__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLE_ASSET__METRIC = SpemPackage.GUIDANCE__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLE_ASSET__CATEGORY = SpemPackage.GUIDANCE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLE_ASSET__COPYRIGHT = SpemPackage.GUIDANCE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLE_ASSET__AUTHOR = SpemPackage.GUIDANCE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLE_ASSET__CHANGE_DATE = SpemPackage.GUIDANCE__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLE_ASSET__CHANGE_DESCRIPTION = SpemPackage.GUIDANCE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLE_ASSET__VERSION = SpemPackage.GUIDANCE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLE_ASSET__NAME = SpemPackage.GUIDANCE__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLE_ASSET__VARIABILITY_TYPE = SpemPackage.GUIDANCE__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLE_ASSET__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.GUIDANCE__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLE_ASSET__METHOD_CONTENT_KIND = SpemPackage.GUIDANCE__METHOD_CONTENT_KIND;

	/**
	 * The number of structural features of the '<em>Reusable Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLE_ASSET_FEATURE_COUNT = SpemPackage.GUIDANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.RoadmapImpl <em>Roadmap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.RoadmapImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getRoadmap()
	 * @generated
	 */
	int ROADMAP = 22;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROADMAP__KIND = SpemPackage.GUIDANCE__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROADMAP__PRESENTATION_NAME = SpemPackage.GUIDANCE__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROADMAP__BRIEF_DESCRIPTION = SpemPackage.GUIDANCE__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROADMAP__MAIN_DESCRIPTION = SpemPackage.GUIDANCE__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROADMAP__PURPOSE = SpemPackage.GUIDANCE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROADMAP__GUIDANCE = SpemPackage.GUIDANCE__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROADMAP__METRIC = SpemPackage.GUIDANCE__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROADMAP__CATEGORY = SpemPackage.GUIDANCE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROADMAP__COPYRIGHT = SpemPackage.GUIDANCE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROADMAP__AUTHOR = SpemPackage.GUIDANCE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROADMAP__CHANGE_DATE = SpemPackage.GUIDANCE__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROADMAP__CHANGE_DESCRIPTION = SpemPackage.GUIDANCE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROADMAP__VERSION = SpemPackage.GUIDANCE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROADMAP__NAME = SpemPackage.GUIDANCE__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROADMAP__VARIABILITY_TYPE = SpemPackage.GUIDANCE__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROADMAP__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.GUIDANCE__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROADMAP__METHOD_CONTENT_KIND = SpemPackage.GUIDANCE__METHOD_CONTENT_KIND;

	/**
	 * The number of structural features of the '<em>Roadmap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROADMAP_FEATURE_COUNT = SpemPackage.GUIDANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.TemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.TemplateImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getTemplate()
	 * @generated
	 */
	int TEMPLATE = 23;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__KIND = SpemPackage.GUIDANCE__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__PRESENTATION_NAME = SpemPackage.GUIDANCE__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__BRIEF_DESCRIPTION = SpemPackage.GUIDANCE__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__MAIN_DESCRIPTION = SpemPackage.GUIDANCE__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__PURPOSE = SpemPackage.GUIDANCE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__GUIDANCE = SpemPackage.GUIDANCE__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__METRIC = SpemPackage.GUIDANCE__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__CATEGORY = SpemPackage.GUIDANCE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__COPYRIGHT = SpemPackage.GUIDANCE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__AUTHOR = SpemPackage.GUIDANCE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__CHANGE_DATE = SpemPackage.GUIDANCE__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__CHANGE_DESCRIPTION = SpemPackage.GUIDANCE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__VERSION = SpemPackage.GUIDANCE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__NAME = SpemPackage.GUIDANCE__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__VARIABILITY_TYPE = SpemPackage.GUIDANCE__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.GUIDANCE__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__METHOD_CONTENT_KIND = SpemPackage.GUIDANCE__METHOD_CONTENT_KIND;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FEATURE_COUNT = SpemPackage.GUIDANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.TermDefinitionImpl <em>Term Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.TermDefinitionImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getTermDefinition()
	 * @generated
	 */
	int TERM_DEFINITION = 24;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__KIND = SpemPackage.GUIDANCE__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__PRESENTATION_NAME = SpemPackage.GUIDANCE__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__BRIEF_DESCRIPTION = SpemPackage.GUIDANCE__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__MAIN_DESCRIPTION = SpemPackage.GUIDANCE__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__PURPOSE = SpemPackage.GUIDANCE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__GUIDANCE = SpemPackage.GUIDANCE__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__METRIC = SpemPackage.GUIDANCE__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__CATEGORY = SpemPackage.GUIDANCE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__COPYRIGHT = SpemPackage.GUIDANCE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__AUTHOR = SpemPackage.GUIDANCE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__CHANGE_DATE = SpemPackage.GUIDANCE__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__CHANGE_DESCRIPTION = SpemPackage.GUIDANCE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__VERSION = SpemPackage.GUIDANCE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__NAME = SpemPackage.GUIDANCE__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__VARIABILITY_TYPE = SpemPackage.GUIDANCE__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.GUIDANCE__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__METHOD_CONTENT_KIND = SpemPackage.GUIDANCE__METHOD_CONTENT_KIND;

	/**
	 * The number of structural features of the '<em>Term Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION_FEATURE_COUNT = SpemPackage.GUIDANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.ToolMentorImpl <em>Tool Mentor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.ToolMentorImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getToolMentor()
	 * @generated
	 */
	int TOOL_MENTOR = 25;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MENTOR__KIND = SpemPackage.GUIDANCE__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MENTOR__PRESENTATION_NAME = SpemPackage.GUIDANCE__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MENTOR__BRIEF_DESCRIPTION = SpemPackage.GUIDANCE__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MENTOR__MAIN_DESCRIPTION = SpemPackage.GUIDANCE__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MENTOR__PURPOSE = SpemPackage.GUIDANCE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MENTOR__GUIDANCE = SpemPackage.GUIDANCE__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MENTOR__METRIC = SpemPackage.GUIDANCE__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MENTOR__CATEGORY = SpemPackage.GUIDANCE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MENTOR__COPYRIGHT = SpemPackage.GUIDANCE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MENTOR__AUTHOR = SpemPackage.GUIDANCE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MENTOR__CHANGE_DATE = SpemPackage.GUIDANCE__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MENTOR__CHANGE_DESCRIPTION = SpemPackage.GUIDANCE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MENTOR__VERSION = SpemPackage.GUIDANCE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MENTOR__NAME = SpemPackage.GUIDANCE__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MENTOR__VARIABILITY_TYPE = SpemPackage.GUIDANCE__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MENTOR__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.GUIDANCE__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MENTOR__METHOD_CONTENT_KIND = SpemPackage.GUIDANCE__METHOD_CONTENT_KIND;

	/**
	 * The number of structural features of the '<em>Tool Mentor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MENTOR_FEATURE_COUNT = SpemPackage.GUIDANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.WhitepaperImpl <em>Whitepaper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.WhitepaperImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getWhitepaper()
	 * @generated
	 */
	int WHITEPAPER = 26;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITEPAPER__KIND = CONCEPT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITEPAPER__PRESENTATION_NAME = CONCEPT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITEPAPER__BRIEF_DESCRIPTION = CONCEPT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITEPAPER__MAIN_DESCRIPTION = CONCEPT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITEPAPER__PURPOSE = CONCEPT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITEPAPER__GUIDANCE = CONCEPT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITEPAPER__METRIC = CONCEPT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITEPAPER__CATEGORY = CONCEPT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITEPAPER__COPYRIGHT = CONCEPT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITEPAPER__AUTHOR = CONCEPT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITEPAPER__CHANGE_DATE = CONCEPT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITEPAPER__CHANGE_DESCRIPTION = CONCEPT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITEPAPER__VERSION = CONCEPT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITEPAPER__NAME = CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITEPAPER__VARIABILITY_TYPE = CONCEPT__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITEPAPER__VARIABILITY_BASED_ON_ELEMENT = CONCEPT__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITEPAPER__METHOD_CONTENT_KIND = CONCEPT__METHOD_CONTENT_KIND;

	/**
	 * The number of structural features of the '<em>Whitepaper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITEPAPER_FEATURE_COUNT = CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.GuidelineImpl <em>Guideline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.GuidelineImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getGuideline()
	 * @generated
	 */
	int GUIDELINE = 27;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE__KIND = SpemPackage.GUIDANCE__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE__PRESENTATION_NAME = SpemPackage.GUIDANCE__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE__BRIEF_DESCRIPTION = SpemPackage.GUIDANCE__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE__MAIN_DESCRIPTION = SpemPackage.GUIDANCE__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE__PURPOSE = SpemPackage.GUIDANCE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE__GUIDANCE = SpemPackage.GUIDANCE__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE__METRIC = SpemPackage.GUIDANCE__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE__CATEGORY = SpemPackage.GUIDANCE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE__COPYRIGHT = SpemPackage.GUIDANCE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE__AUTHOR = SpemPackage.GUIDANCE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE__CHANGE_DATE = SpemPackage.GUIDANCE__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE__CHANGE_DESCRIPTION = SpemPackage.GUIDANCE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE__VERSION = SpemPackage.GUIDANCE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE__NAME = SpemPackage.GUIDANCE__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE__VARIABILITY_TYPE = SpemPackage.GUIDANCE__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.GUIDANCE__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE__METHOD_CONTENT_KIND = SpemPackage.GUIDANCE__METHOD_CONTENT_KIND;

	/**
	 * The number of structural features of the '<em>Guideline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE_FEATURE_COUNT = SpemPackage.GUIDANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.SupportingMaterialImpl <em>Supporting Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.SupportingMaterialImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getSupportingMaterial()
	 * @generated
	 */
	int SUPPORTING_MATERIAL = 28;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_MATERIAL__KIND = SpemPackage.GUIDANCE__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_MATERIAL__PRESENTATION_NAME = SpemPackage.GUIDANCE__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_MATERIAL__BRIEF_DESCRIPTION = SpemPackage.GUIDANCE__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_MATERIAL__MAIN_DESCRIPTION = SpemPackage.GUIDANCE__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_MATERIAL__PURPOSE = SpemPackage.GUIDANCE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_MATERIAL__GUIDANCE = SpemPackage.GUIDANCE__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_MATERIAL__METRIC = SpemPackage.GUIDANCE__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_MATERIAL__CATEGORY = SpemPackage.GUIDANCE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_MATERIAL__COPYRIGHT = SpemPackage.GUIDANCE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_MATERIAL__AUTHOR = SpemPackage.GUIDANCE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_MATERIAL__CHANGE_DATE = SpemPackage.GUIDANCE__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_MATERIAL__CHANGE_DESCRIPTION = SpemPackage.GUIDANCE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_MATERIAL__VERSION = SpemPackage.GUIDANCE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_MATERIAL__NAME = SpemPackage.GUIDANCE__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_MATERIAL__VARIABILITY_TYPE = SpemPackage.GUIDANCE__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_MATERIAL__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.GUIDANCE__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_MATERIAL__METHOD_CONTENT_KIND = SpemPackage.GUIDANCE__METHOD_CONTENT_KIND;

	/**
	 * The number of structural features of the '<em>Supporting Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_MATERIAL_FEATURE_COUNT = SpemPackage.GUIDANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.RoleDefinitionPackageImpl <em>Role Definition Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.RoleDefinitionPackageImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getRoleDefinitionPackage()
	 * @generated
	 */
	int ROLE_DEFINITION_PACKAGE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION_PACKAGE__NAME = SpemPackage.METHOD_CONTENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Method Content Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION_PACKAGE__OWNED_METHOD_CONTENT_MEMBER = SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER;

	/**
	 * The feature id for the '<em><b>Reused Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION_PACKAGE__REUSED_PACKAGE = SpemPackage.METHOD_CONTENT_PACKAGE__REUSED_PACKAGE;

	/**
	 * The number of structural features of the '<em>Role Definition Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION_PACKAGE_FEATURE_COUNT = SpemPackage.METHOD_CONTENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.TaskDefinitionPackageImpl <em>Task Definition Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.TaskDefinitionPackageImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getTaskDefinitionPackage()
	 * @generated
	 */
	int TASK_DEFINITION_PACKAGE = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION_PACKAGE__NAME = SpemPackage.METHOD_CONTENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Method Content Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION_PACKAGE__OWNED_METHOD_CONTENT_MEMBER = SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER;

	/**
	 * The feature id for the '<em><b>Reused Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION_PACKAGE__REUSED_PACKAGE = SpemPackage.METHOD_CONTENT_PACKAGE__REUSED_PACKAGE;

	/**
	 * The number of structural features of the '<em>Task Definition Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION_PACKAGE_FEATURE_COUNT = SpemPackage.METHOD_CONTENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.WorkProductDefinitionPackageImpl <em>Work Product Definition Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.WorkProductDefinitionPackageImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getWorkProductDefinitionPackage()
	 * @generated
	 */
	int WORK_PRODUCT_DEFINITION_PACKAGE = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_PACKAGE__NAME = SpemPackage.METHOD_CONTENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Method Content Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_PACKAGE__OWNED_METHOD_CONTENT_MEMBER = SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER;

	/**
	 * The feature id for the '<em><b>Reused Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_PACKAGE__REUSED_PACKAGE = SpemPackage.METHOD_CONTENT_PACKAGE__REUSED_PACKAGE;

	/**
	 * The number of structural features of the '<em>Work Product Definition Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_PACKAGE_FEATURE_COUNT = SpemPackage.METHOD_CONTENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.GuidancePackageImpl <em>Guidance Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.GuidancePackageImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getGuidancePackage()
	 * @generated
	 */
	int GUIDANCE_PACKAGE = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE_PACKAGE__NAME = SpemPackage.METHOD_CONTENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Method Content Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE_PACKAGE__OWNED_METHOD_CONTENT_MEMBER = SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER;

	/**
	 * The feature id for the '<em><b>Reused Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE_PACKAGE__REUSED_PACKAGE = SpemPackage.METHOD_CONTENT_PACKAGE__REUSED_PACKAGE;

	/**
	 * The number of structural features of the '<em>Guidance Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE_PACKAGE_FEATURE_COUNT = SpemPackage.METHOD_CONTENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.DisciplinePackageImpl <em>Discipline Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.DisciplinePackageImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getDisciplinePackage()
	 * @generated
	 */
	int DISCIPLINE_PACKAGE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_PACKAGE__NAME = SpemPackage.METHOD_CONTENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Method Content Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_PACKAGE__OWNED_METHOD_CONTENT_MEMBER = SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER;

	/**
	 * The feature id for the '<em><b>Reused Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_PACKAGE__REUSED_PACKAGE = SpemPackage.METHOD_CONTENT_PACKAGE__REUSED_PACKAGE;

	/**
	 * The number of structural features of the '<em>Discipline Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_PACKAGE_FEATURE_COUNT = SpemPackage.METHOD_CONTENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.DomainPackageImpl <em>Domain Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.DomainPackageImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getDomainPackage()
	 * @generated
	 */
	int DOMAIN_PACKAGE = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PACKAGE__NAME = SpemPackage.METHOD_CONTENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Method Content Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PACKAGE__OWNED_METHOD_CONTENT_MEMBER = SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER;

	/**
	 * The feature id for the '<em><b>Reused Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PACKAGE__REUSED_PACKAGE = SpemPackage.METHOD_CONTENT_PACKAGE__REUSED_PACKAGE;

	/**
	 * The number of structural features of the '<em>Domain Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PACKAGE_FEATURE_COUNT = SpemPackage.METHOD_CONTENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.WorkProductKindPackageImpl <em>Work Product Kind Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.WorkProductKindPackageImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getWorkProductKindPackage()
	 * @generated
	 */
	int WORK_PRODUCT_KIND_PACKAGE = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_KIND_PACKAGE__NAME = SpemPackage.METHOD_CONTENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Method Content Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_KIND_PACKAGE__OWNED_METHOD_CONTENT_MEMBER = SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER;

	/**
	 * The feature id for the '<em><b>Reused Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_KIND_PACKAGE__REUSED_PACKAGE = SpemPackage.METHOD_CONTENT_PACKAGE__REUSED_PACKAGE;

	/**
	 * The number of structural features of the '<em>Work Product Kind Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_KIND_PACKAGE_FEATURE_COUNT = SpemPackage.METHOD_CONTENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.RoleSetPackageImpl <em>Role Set Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.RoleSetPackageImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getRoleSetPackage()
	 * @generated
	 */
	int ROLE_SET_PACKAGE = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SET_PACKAGE__NAME = SpemPackage.METHOD_CONTENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Method Content Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SET_PACKAGE__OWNED_METHOD_CONTENT_MEMBER = SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER;

	/**
	 * The feature id for the '<em><b>Reused Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SET_PACKAGE__REUSED_PACKAGE = SpemPackage.METHOD_CONTENT_PACKAGE__REUSED_PACKAGE;

	/**
	 * The number of structural features of the '<em>Role Set Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SET_PACKAGE_FEATURE_COUNT = SpemPackage.METHOD_CONTENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.ToolDefinitionPackageImpl <em>Tool Definition Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.ToolDefinitionPackageImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getToolDefinitionPackage()
	 * @generated
	 */
	int TOOL_DEFINITION_PACKAGE = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION_PACKAGE__NAME = SpemPackage.METHOD_CONTENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Method Content Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION_PACKAGE__OWNED_METHOD_CONTENT_MEMBER = SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER;

	/**
	 * The feature id for the '<em><b>Reused Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION_PACKAGE__REUSED_PACKAGE = SpemPackage.METHOD_CONTENT_PACKAGE__REUSED_PACKAGE;

	/**
	 * The number of structural features of the '<em>Tool Definition Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION_PACKAGE_FEATURE_COUNT = SpemPackage.METHOD_CONTENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.ConfigurationPackageImpl <em>Configuration Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.ConfigurationPackageImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getConfigurationPackage()
	 * @generated
	 */
	int CONFIGURATION_PACKAGE = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PACKAGE__NAME = SpemPackage.METHOD_CONTENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Method Content Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PACKAGE__OWNED_METHOD_CONTENT_MEMBER = SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER;

	/**
	 * The feature id for the '<em><b>Reused Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PACKAGE__REUSED_PACKAGE = SpemPackage.METHOD_CONTENT_PACKAGE__REUSED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PACKAGE__OWNED_CONFIGURATION = SpemPackage.METHOD_CONTENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Configuration Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PACKAGE_FEATURE_COUNT = SpemPackage.METHOD_CONTENT_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.CapabilityPatternPackageImpl <em>Capability Pattern Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.CapabilityPatternPackageImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getCapabilityPatternPackage()
	 * @generated
	 */
	int CAPABILITY_PATTERN_PACKAGE = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN_PACKAGE__NAME = SpemPackage.PROCESS_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Process Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN_PACKAGE__OWNED_PROCESS_MEMBER = SpemPackage.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER;

	/**
	 * The number of structural features of the '<em>Capability Pattern Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PATTERN_PACKAGE_FEATURE_COUNT = SpemPackage.PROCESS_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.DeliveryProcessPackageImpl <em>Delivery Process Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.DeliveryProcessPackageImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getDeliveryProcessPackage()
	 * @generated
	 */
	int DELIVERY_PROCESS_PACKAGE = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS_PACKAGE__NAME = SpemPackage.PROCESS_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Process Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS_PACKAGE__OWNED_PROCESS_MEMBER = SpemPackage.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER;

	/**
	 * The number of structural features of the '<em>Delivery Process Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_PROCESS_PACKAGE_FEATURE_COUNT = SpemPackage.PROCESS_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.RoleSetImpl <em>Role Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.RoleSetImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getRoleSet()
	 * @generated
	 */
	int ROLE_SET = 41;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SET__KIND = SpemPackage.METHOD_CONTENT_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SET__PRESENTATION_NAME = SpemPackage.METHOD_CONTENT_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SET__BRIEF_DESCRIPTION = SpemPackage.METHOD_CONTENT_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SET__MAIN_DESCRIPTION = SpemPackage.METHOD_CONTENT_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SET__PURPOSE = SpemPackage.METHOD_CONTENT_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SET__GUIDANCE = SpemPackage.METHOD_CONTENT_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SET__METRIC = SpemPackage.METHOD_CONTENT_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SET__CATEGORY = SpemPackage.METHOD_CONTENT_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SET__COPYRIGHT = SpemPackage.METHOD_CONTENT_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SET__AUTHOR = SpemPackage.METHOD_CONTENT_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SET__CHANGE_DATE = SpemPackage.METHOD_CONTENT_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SET__CHANGE_DESCRIPTION = SpemPackage.METHOD_CONTENT_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SET__VERSION = SpemPackage.METHOD_CONTENT_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SET__NAME = SpemPackage.METHOD_CONTENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SET__VARIABILITY_TYPE = SpemPackage.METHOD_CONTENT_ELEMENT__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SET__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.METHOD_CONTENT_ELEMENT__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SET__METHOD_CONTENT_KIND = SpemPackage.METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SET__ROLE = SpemPackage.METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SET_FEATURE_COUNT = SpemPackage.METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.QualificationPackageImpl <em>Qualification Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.QualificationPackageImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getQualificationPackage()
	 * @generated
	 */
	int QUALIFICATION_PACKAGE = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_PACKAGE__NAME = SpemPackage.METHOD_CONTENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Method Content Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_PACKAGE__OWNED_METHOD_CONTENT_MEMBER = SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER;

	/**
	 * The feature id for the '<em><b>Reused Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_PACKAGE__REUSED_PACKAGE = SpemPackage.METHOD_CONTENT_PACKAGE__REUSED_PACKAGE;

	/**
	 * The number of structural features of the '<em>Qualification Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_PACKAGE_FEATURE_COUNT = SpemPackage.METHOD_CONTENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.ProcessComponentPackageImpl <em>Process Component Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.ProcessComponentPackageImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getProcessComponentPackage()
	 * @generated
	 */
	int PROCESS_COMPONENT_PACKAGE = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_PACKAGE__NAME = SpemPackage.PROCESS_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Process Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_PACKAGE__OWNED_PROCESS_MEMBER = SpemPackage.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER;

	/**
	 * The number of structural features of the '<em>Process Component Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_PACKAGE_FEATURE_COUNT = SpemPackage.PROCESS_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.impl.WorkProductKindImpl <em>Work Product Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.impl.WorkProductKindImpl
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getWorkProductKind()
	 * @generated
	 */
	int WORK_PRODUCT_KIND = 44;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_KIND__KIND = SpemPackage.KIND__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_KIND__PRESENTATION_NAME = SpemPackage.KIND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_KIND__BRIEF_DESCRIPTION = SpemPackage.KIND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_KIND__MAIN_DESCRIPTION = SpemPackage.KIND_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_KIND__PURPOSE = SpemPackage.KIND_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_KIND__GUIDANCE = SpemPackage.KIND_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_KIND__METRIC = SpemPackage.KIND_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_KIND__CATEGORY = SpemPackage.KIND_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_KIND__COPYRIGHT = SpemPackage.KIND_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_KIND__AUTHOR = SpemPackage.KIND_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_KIND__CHANGE_DATE = SpemPackage.KIND_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_KIND__CHANGE_DESCRIPTION = SpemPackage.KIND_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_KIND__VERSION = SpemPackage.KIND_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_KIND__NAME = SpemPackage.KIND_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_KIND__VARIABILITY_TYPE = SpemPackage.KIND_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_KIND__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.KIND_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_KIND__METHOD_CONTENT_KIND = SpemPackage.KIND_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Work Product Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_KIND_FEATURE_COUNT = SpemPackage.KIND_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.RiskLevel <em>Risk Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.RiskLevel
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getRiskLevel()
	 * @generated
	 */
	int RISK_LEVEL = 45;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.EstimatingTechnique <em>Estimating Technique</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.EstimatingTechnique
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getEstimatingTechnique()
	 * @generated
	 */
	int ESTIMATING_TECHNIQUE = 46;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.ExpertiseLevel <em>Expertise Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.ExpertiseLevel
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getExpertiseLevel()
	 * @generated
	 */
	int EXPERTISE_LEVEL = 47;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.uma.ContractKind <em>Contract Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.uma.ContractKind
	 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getContractKind()
	 * @generated
	 */
	int CONTRACT_KIND = 48;


	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.spem.uma.Artifact#getContainedArtifact <em>Contained Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Artifact</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Artifact#getContainedArtifact()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_ContainedArtifact();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.CapabilityPattern <em>Capability Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Pattern</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.CapabilityPattern
	 * @generated
	 */
	EClass getCapabilityPattern();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.Checklist <em>Checklist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checklist</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Checklist
	 * @generated
	 */
	EClass getChecklist();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Concept
	 * @generated
	 */
	EClass getConcept();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.CategoryPackage <em>Category Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Package</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.CategoryPackage
	 * @generated
	 */
	EClass getCategoryPackage();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.CustomCategory <em>Custom Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Category</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.CustomCategory
	 * @generated
	 */
	EClass getCustomCategory();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.Deliverable <em>Deliverable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deliverable</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Deliverable
	 * @generated
	 */
	EClass getDeliverable();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.uma.Deliverable#getDeliveredProduct <em>Delivered Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delivered Product</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Deliverable#getDeliveredProduct()
	 * @see #getDeliverable()
	 * @generated
	 */
	EReference getDeliverable_DeliveredProduct();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.uma.Deliverable#getExternalDescription <em>External Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Description</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Deliverable#getExternalDescription()
	 * @see #getDeliverable()
	 * @generated
	 */
	EAttribute getDeliverable_ExternalDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.uma.Deliverable#getPackagingGuidance <em>Packaging Guidance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packaging Guidance</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Deliverable#getPackagingGuidance()
	 * @see #getDeliverable()
	 * @generated
	 */
	EAttribute getDeliverable_PackagingGuidance();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.spem.uma.Process#getIncludedPattern <em>Included Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Included Pattern</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Process#getIncludedPattern()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_IncludedPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.uma.Process#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Process#getScope()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Scope();

	/**
	 * Returns the meta object for the attribute list '{@link org.obeonetwork.dsl.spem.uma.Process#getUsageNote <em>Usage Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Usage Note</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Process#getUsageNote()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_UsageNote();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.spem.uma.Process#getIncludedConnector <em>Included Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Included Connector</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Process#getIncludedConnector()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_IncludedConnector();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.DeliveryProcess <em>Delivery Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delivery Process</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.DeliveryProcess
	 * @generated
	 */
	EClass getDeliveryProcess();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.uma.DeliveryProcess#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.DeliveryProcess#getScale()
	 * @see #getDeliveryProcess()
	 * @generated
	 */
	EAttribute getDeliveryProcess_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.uma.DeliveryProcess#getProjectCharacteristics <em>Project Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Characteristics</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.DeliveryProcess#getProjectCharacteristics()
	 * @see #getDeliveryProcess()
	 * @generated
	 */
	EAttribute getDeliveryProcess_ProjectCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.uma.DeliveryProcess#getRiskLevel <em>Risk Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk Level</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.DeliveryProcess#getRiskLevel()
	 * @see #getDeliveryProcess()
	 * @generated
	 */
	EAttribute getDeliveryProcess_RiskLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.uma.DeliveryProcess#getEstimatingTechnique <em>Estimating Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimating Technique</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.DeliveryProcess#getEstimatingTechnique()
	 * @see #getDeliveryProcess()
	 * @generated
	 */
	EAttribute getDeliveryProcess_EstimatingTechnique();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.uma.DeliveryProcess#getProjectMemberExpertise <em>Project Member Expertise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Member Expertise</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.DeliveryProcess#getProjectMemberExpertise()
	 * @see #getDeliveryProcess()
	 * @generated
	 */
	EAttribute getDeliveryProcess_ProjectMemberExpertise();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.uma.DeliveryProcess#getTypeOfContract <em>Type Of Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Of Contract</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.DeliveryProcess#getTypeOfContract()
	 * @see #getDeliveryProcess()
	 * @generated
	 */
	EAttribute getDeliveryProcess_TypeOfContract();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.uma.DeliveryProcess#getCommunicationMaterial <em>Communication Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communication Material</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.DeliveryProcess#getCommunicationMaterial()
	 * @see #getDeliveryProcess()
	 * @generated
	 */
	EReference getDeliveryProcess_CommunicationMaterial();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.uma.DeliveryProcess#getEducationalMaterial <em>Educational Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Educational Material</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.DeliveryProcess#getEducationalMaterial()
	 * @see #getDeliveryProcess()
	 * @generated
	 */
	EReference getDeliveryProcess_EducationalMaterial();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.Discipline <em>Discipline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discipline</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Discipline
	 * @generated
	 */
	EClass getDiscipline();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.uma.Discipline#getRelatedTask <em>Related Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Task</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Discipline#getRelatedTask()
	 * @see #getDiscipline()
	 * @generated
	 */
	EReference getDiscipline_RelatedTask();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.uma.Discipline#getRelatedWorflow <em>Related Worflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Worflow</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Discipline#getRelatedWorflow()
	 * @see #getDiscipline()
	 * @generated
	 */
	EReference getDiscipline_RelatedWorflow();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.DisciplineGrouping <em>Discipline Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discipline Grouping</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.DisciplineGrouping
	 * @generated
	 */
	EClass getDisciplineGrouping();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.spem.uma.Root#getMethodConfiguration <em>Method Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Configuration</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Root#getMethodConfiguration()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_MethodConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.spem.uma.Root#getMethodLibrary <em>Method Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Library</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Root#getMethodLibrary()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_MethodLibrary();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.spem.uma.Root#getMethodPlugin <em>Method Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Plugin</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Root#getMethodPlugin()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_MethodPlugin();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.uma.Domain#getRelatedProduct <em>Related Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Product</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Domain#getRelatedProduct()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_RelatedProduct();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.EstimatingConsideration <em>Estimating Consideration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Estimating Consideration</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.EstimatingConsideration
	 * @generated
	 */
	EClass getEstimatingConsideration();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.Example <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Example
	 * @generated
	 */
	EClass getExample();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.Iteration <em>Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iteration</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Iteration
	 * @generated
	 */
	EClass getIteration();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.Outcome <em>Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outcome</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Outcome
	 * @generated
	 */
	EClass getOutcome();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.Phase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Phase
	 * @generated
	 */
	EClass getPhase();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.Practice <em>Practice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Practice</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Practice
	 * @generated
	 */
	EClass getPractice();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.spem.uma.Practice#getSubPractice <em>Sub Practice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Practice</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Practice#getSubPractice()
	 * @see #getPractice()
	 * @generated
	 */
	EReference getPractice_SubPractice();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.uma.Practice#getReferencedActivity <em>Referenced Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Activity</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Practice#getReferencedActivity()
	 * @see #getPractice()
	 * @generated
	 */
	EReference getPractice_ReferencedActivity();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.uma.Practice#getContentReference <em>Content Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Content Reference</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Practice#getContentReference()
	 * @see #getPractice()
	 * @generated
	 */
	EReference getPractice_ContentReference();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.uma.Practice#getAdditionalInfo <em>Additional Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Info</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Practice#getAdditionalInfo()
	 * @see #getPractice()
	 * @generated
	 */
	EAttribute getPractice_AdditionalInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.uma.Practice#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Practice#getApplication()
	 * @see #getPractice()
	 * @generated
	 */
	EAttribute getPractice_Application();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.uma.Practice#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Practice#getBackground()
	 * @see #getPractice()
	 * @generated
	 */
	EAttribute getPractice_Background();

	/**
	 * Returns the meta object for the attribute list '{@link org.obeonetwork.dsl.spem.uma.Practice#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Goal</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Practice#getGoal()
	 * @see #getPractice()
	 * @generated
	 */
	EAttribute getPractice_Goal();

	/**
	 * Returns the meta object for the attribute list '{@link org.obeonetwork.dsl.spem.uma.Practice#getLevelOfAdoption <em>Level Of Adoption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Level Of Adoption</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Practice#getLevelOfAdoption()
	 * @see #getPractice()
	 * @generated
	 */
	EAttribute getPractice_LevelOfAdoption();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.uma.Practice#getProblem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Problem</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Practice#getProblem()
	 * @see #getPractice()
	 * @generated
	 */
	EAttribute getPractice_Problem();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.ProcessPlanningTemplate <em>Process Planning Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Planning Template</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.ProcessPlanningTemplate
	 * @generated
	 */
	EClass getProcessPlanningTemplate();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.uma.ProcessPlanningTemplate#getBaseProcess <em>Base Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Process</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.ProcessPlanningTemplate#getBaseProcess()
	 * @see #getProcessPlanningTemplate()
	 * @generated
	 */
	EReference getProcessPlanningTemplate_BaseProcess();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.Report <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Report
	 * @generated
	 */
	EClass getReport();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.ReusableAsset <em>Reusable Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reusable Asset</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.ReusableAsset
	 * @generated
	 */
	EClass getReusableAsset();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.Roadmap <em>Roadmap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roadmap</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Roadmap
	 * @generated
	 */
	EClass getRoadmap();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Template
	 * @generated
	 */
	EClass getTemplate();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.TermDefinition <em>Term Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Definition</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.TermDefinition
	 * @generated
	 */
	EClass getTermDefinition();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.ToolMentor <em>Tool Mentor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Mentor</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.ToolMentor
	 * @generated
	 */
	EClass getToolMentor();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.Whitepaper <em>Whitepaper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Whitepaper</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Whitepaper
	 * @generated
	 */
	EClass getWhitepaper();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.Guideline <em>Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guideline</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.Guideline
	 * @generated
	 */
	EClass getGuideline();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.SupportingMaterial <em>Supporting Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supporting Material</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.SupportingMaterial
	 * @generated
	 */
	EClass getSupportingMaterial();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.RoleDefinitionPackage <em>Role Definition Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Definition Package</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.RoleDefinitionPackage
	 * @generated
	 */
	EClass getRoleDefinitionPackage();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.TaskDefinitionPackage <em>Task Definition Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Definition Package</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.TaskDefinitionPackage
	 * @generated
	 */
	EClass getTaskDefinitionPackage();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.WorkProductDefinitionPackage <em>Work Product Definition Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Product Definition Package</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.WorkProductDefinitionPackage
	 * @generated
	 */
	EClass getWorkProductDefinitionPackage();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.GuidancePackage <em>Guidance Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guidance Package</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.GuidancePackage
	 * @generated
	 */
	EClass getGuidancePackage();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.DisciplinePackage <em>Discipline Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discipline Package</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.DisciplinePackage
	 * @generated
	 */
	EClass getDisciplinePackage();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.DomainPackage <em>Domain Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Package</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.DomainPackage
	 * @generated
	 */
	EClass getDomainPackage();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.WorkProductKindPackage <em>Work Product Kind Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Product Kind Package</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.WorkProductKindPackage
	 * @generated
	 */
	EClass getWorkProductKindPackage();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.RoleSetPackage <em>Role Set Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Set Package</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.RoleSetPackage
	 * @generated
	 */
	EClass getRoleSetPackage();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.ToolDefinitionPackage <em>Tool Definition Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Definition Package</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.ToolDefinitionPackage
	 * @generated
	 */
	EClass getToolDefinitionPackage();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.ConfigurationPackage <em>Configuration Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Package</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.ConfigurationPackage
	 * @generated
	 */
	EClass getConfigurationPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.spem.uma.ConfigurationPackage#getOwnedConfiguration <em>Owned Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Configuration</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.ConfigurationPackage#getOwnedConfiguration()
	 * @see #getConfigurationPackage()
	 * @generated
	 */
	EReference getConfigurationPackage_OwnedConfiguration();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.CapabilityPatternPackage <em>Capability Pattern Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Pattern Package</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.CapabilityPatternPackage
	 * @generated
	 */
	EClass getCapabilityPatternPackage();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.DeliveryProcessPackage <em>Delivery Process Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delivery Process Package</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.DeliveryProcessPackage
	 * @generated
	 */
	EClass getDeliveryProcessPackage();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.RoleSet <em>Role Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Set</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.RoleSet
	 * @generated
	 */
	EClass getRoleSet();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.uma.RoleSet#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.RoleSet#getRole()
	 * @see #getRoleSet()
	 * @generated
	 */
	EReference getRoleSet_Role();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.QualificationPackage <em>Qualification Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualification Package</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.QualificationPackage
	 * @generated
	 */
	EClass getQualificationPackage();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.ProcessComponentPackage <em>Process Component Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Component Package</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.ProcessComponentPackage
	 * @generated
	 */
	EClass getProcessComponentPackage();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.uma.WorkProductKind <em>Work Product Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Product Kind</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.WorkProductKind
	 * @generated
	 */
	EClass getWorkProductKind();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.spem.uma.RiskLevel <em>Risk Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Risk Level</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.RiskLevel
	 * @generated
	 */
	EEnum getRiskLevel();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.spem.uma.EstimatingTechnique <em>Estimating Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Estimating Technique</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.EstimatingTechnique
	 * @generated
	 */
	EEnum getEstimatingTechnique();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.spem.uma.ExpertiseLevel <em>Expertise Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expertise Level</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.ExpertiseLevel
	 * @generated
	 */
	EEnum getExpertiseLevel();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.spem.uma.ContractKind <em>Contract Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Kind</em>'.
	 * @see org.obeonetwork.dsl.spem.uma.ContractKind
	 * @generated
	 */
	EEnum getContractKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UmaFactory getUmaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.ArtifactImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Contained Artifact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__CONTAINED_ARTIFACT = eINSTANCE.getArtifact_ContainedArtifact();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.CapabilityPatternImpl <em>Capability Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.CapabilityPatternImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getCapabilityPattern()
		 * @generated
		 */
		EClass CAPABILITY_PATTERN = eINSTANCE.getCapabilityPattern();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.ChecklistImpl <em>Checklist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.ChecklistImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getChecklist()
		 * @generated
		 */
		EClass CHECKLIST = eINSTANCE.getChecklist();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.ConceptImpl <em>Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.ConceptImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getConcept()
		 * @generated
		 */
		EClass CONCEPT = eINSTANCE.getConcept();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.CategoryPackageImpl <em>Category Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.CategoryPackageImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getCategoryPackage()
		 * @generated
		 */
		EClass CATEGORY_PACKAGE = eINSTANCE.getCategoryPackage();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.CustomCategoryImpl <em>Custom Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.CustomCategoryImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getCustomCategory()
		 * @generated
		 */
		EClass CUSTOM_CATEGORY = eINSTANCE.getCustomCategory();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.DeliverableImpl <em>Deliverable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.DeliverableImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getDeliverable()
		 * @generated
		 */
		EClass DELIVERABLE = eINSTANCE.getDeliverable();

		/**
		 * The meta object literal for the '<em><b>Delivered Product</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELIVERABLE__DELIVERED_PRODUCT = eINSTANCE.getDeliverable_DeliveredProduct();

		/**
		 * The meta object literal for the '<em><b>External Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERABLE__EXTERNAL_DESCRIPTION = eINSTANCE.getDeliverable_ExternalDescription();

		/**
		 * The meta object literal for the '<em><b>Packaging Guidance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERABLE__PACKAGING_GUIDANCE = eINSTANCE.getDeliverable_PackagingGuidance();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.ProcessImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Included Pattern</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__INCLUDED_PATTERN = eINSTANCE.getProcess_IncludedPattern();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__SCOPE = eINSTANCE.getProcess_Scope();

		/**
		 * The meta object literal for the '<em><b>Usage Note</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__USAGE_NOTE = eINSTANCE.getProcess_UsageNote();

		/**
		 * The meta object literal for the '<em><b>Included Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__INCLUDED_CONNECTOR = eINSTANCE.getProcess_IncludedConnector();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.DeliveryProcessImpl <em>Delivery Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.DeliveryProcessImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getDeliveryProcess()
		 * @generated
		 */
		EClass DELIVERY_PROCESS = eINSTANCE.getDeliveryProcess();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_PROCESS__SCALE = eINSTANCE.getDeliveryProcess_Scale();

		/**
		 * The meta object literal for the '<em><b>Project Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_PROCESS__PROJECT_CHARACTERISTICS = eINSTANCE.getDeliveryProcess_ProjectCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Risk Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_PROCESS__RISK_LEVEL = eINSTANCE.getDeliveryProcess_RiskLevel();

		/**
		 * The meta object literal for the '<em><b>Estimating Technique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_PROCESS__ESTIMATING_TECHNIQUE = eINSTANCE.getDeliveryProcess_EstimatingTechnique();

		/**
		 * The meta object literal for the '<em><b>Project Member Expertise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_PROCESS__PROJECT_MEMBER_EXPERTISE = eINSTANCE.getDeliveryProcess_ProjectMemberExpertise();

		/**
		 * The meta object literal for the '<em><b>Type Of Contract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_PROCESS__TYPE_OF_CONTRACT = eINSTANCE.getDeliveryProcess_TypeOfContract();

		/**
		 * The meta object literal for the '<em><b>Communication Material</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELIVERY_PROCESS__COMMUNICATION_MATERIAL = eINSTANCE.getDeliveryProcess_CommunicationMaterial();

		/**
		 * The meta object literal for the '<em><b>Educational Material</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELIVERY_PROCESS__EDUCATIONAL_MATERIAL = eINSTANCE.getDeliveryProcess_EducationalMaterial();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.DisciplineImpl <em>Discipline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.DisciplineImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getDiscipline()
		 * @generated
		 */
		EClass DISCIPLINE = eINSTANCE.getDiscipline();

		/**
		 * The meta object literal for the '<em><b>Related Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCIPLINE__RELATED_TASK = eINSTANCE.getDiscipline_RelatedTask();

		/**
		 * The meta object literal for the '<em><b>Related Worflow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCIPLINE__RELATED_WORFLOW = eINSTANCE.getDiscipline_RelatedWorflow();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.DisciplineGroupingImpl <em>Discipline Grouping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.DisciplineGroupingImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getDisciplineGrouping()
		 * @generated
		 */
		EClass DISCIPLINE_GROUPING = eINSTANCE.getDisciplineGrouping();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.RootImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Method Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__METHOD_CONFIGURATION = eINSTANCE.getRoot_MethodConfiguration();

		/**
		 * The meta object literal for the '<em><b>Method Library</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__METHOD_LIBRARY = eINSTANCE.getRoot_MethodLibrary();

		/**
		 * The meta object literal for the '<em><b>Method Plugin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__METHOD_PLUGIN = eINSTANCE.getRoot_MethodPlugin();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.DomainImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Related Product</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__RELATED_PRODUCT = eINSTANCE.getDomain_RelatedProduct();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.EstimatingConsiderationImpl <em>Estimating Consideration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.EstimatingConsiderationImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getEstimatingConsideration()
		 * @generated
		 */
		EClass ESTIMATING_CONSIDERATION = eINSTANCE.getEstimatingConsideration();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.ExampleImpl <em>Example</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.ExampleImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getExample()
		 * @generated
		 */
		EClass EXAMPLE = eINSTANCE.getExample();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.IterationImpl <em>Iteration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.IterationImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getIteration()
		 * @generated
		 */
		EClass ITERATION = eINSTANCE.getIteration();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.OutcomeImpl <em>Outcome</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.OutcomeImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getOutcome()
		 * @generated
		 */
		EClass OUTCOME = eINSTANCE.getOutcome();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.PhaseImpl <em>Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.PhaseImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getPhase()
		 * @generated
		 */
		EClass PHASE = eINSTANCE.getPhase();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.PracticeImpl <em>Practice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.PracticeImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getPractice()
		 * @generated
		 */
		EClass PRACTICE = eINSTANCE.getPractice();

		/**
		 * The meta object literal for the '<em><b>Sub Practice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRACTICE__SUB_PRACTICE = eINSTANCE.getPractice_SubPractice();

		/**
		 * The meta object literal for the '<em><b>Referenced Activity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRACTICE__REFERENCED_ACTIVITY = eINSTANCE.getPractice_ReferencedActivity();

		/**
		 * The meta object literal for the '<em><b>Content Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRACTICE__CONTENT_REFERENCE = eINSTANCE.getPractice_ContentReference();

		/**
		 * The meta object literal for the '<em><b>Additional Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRACTICE__ADDITIONAL_INFO = eINSTANCE.getPractice_AdditionalInfo();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRACTICE__APPLICATION = eINSTANCE.getPractice_Application();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRACTICE__BACKGROUND = eINSTANCE.getPractice_Background();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRACTICE__GOAL = eINSTANCE.getPractice_Goal();

		/**
		 * The meta object literal for the '<em><b>Level Of Adoption</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRACTICE__LEVEL_OF_ADOPTION = eINSTANCE.getPractice_LevelOfAdoption();

		/**
		 * The meta object literal for the '<em><b>Problem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRACTICE__PROBLEM = eINSTANCE.getPractice_Problem();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.ProcessPlanningTemplateImpl <em>Process Planning Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.ProcessPlanningTemplateImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getProcessPlanningTemplate()
		 * @generated
		 */
		EClass PROCESS_PLANNING_TEMPLATE = eINSTANCE.getProcessPlanningTemplate();

		/**
		 * The meta object literal for the '<em><b>Base Process</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_PLANNING_TEMPLATE__BASE_PROCESS = eINSTANCE.getProcessPlanningTemplate_BaseProcess();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.ReportImpl <em>Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.ReportImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getReport()
		 * @generated
		 */
		EClass REPORT = eINSTANCE.getReport();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.ReusableAssetImpl <em>Reusable Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.ReusableAssetImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getReusableAsset()
		 * @generated
		 */
		EClass REUSABLE_ASSET = eINSTANCE.getReusableAsset();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.RoadmapImpl <em>Roadmap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.RoadmapImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getRoadmap()
		 * @generated
		 */
		EClass ROADMAP = eINSTANCE.getRoadmap();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.TemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.TemplateImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getTemplate()
		 * @generated
		 */
		EClass TEMPLATE = eINSTANCE.getTemplate();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.TermDefinitionImpl <em>Term Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.TermDefinitionImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getTermDefinition()
		 * @generated
		 */
		EClass TERM_DEFINITION = eINSTANCE.getTermDefinition();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.ToolMentorImpl <em>Tool Mentor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.ToolMentorImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getToolMentor()
		 * @generated
		 */
		EClass TOOL_MENTOR = eINSTANCE.getToolMentor();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.WhitepaperImpl <em>Whitepaper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.WhitepaperImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getWhitepaper()
		 * @generated
		 */
		EClass WHITEPAPER = eINSTANCE.getWhitepaper();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.GuidelineImpl <em>Guideline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.GuidelineImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getGuideline()
		 * @generated
		 */
		EClass GUIDELINE = eINSTANCE.getGuideline();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.SupportingMaterialImpl <em>Supporting Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.SupportingMaterialImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getSupportingMaterial()
		 * @generated
		 */
		EClass SUPPORTING_MATERIAL = eINSTANCE.getSupportingMaterial();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.RoleDefinitionPackageImpl <em>Role Definition Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.RoleDefinitionPackageImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getRoleDefinitionPackage()
		 * @generated
		 */
		EClass ROLE_DEFINITION_PACKAGE = eINSTANCE.getRoleDefinitionPackage();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.TaskDefinitionPackageImpl <em>Task Definition Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.TaskDefinitionPackageImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getTaskDefinitionPackage()
		 * @generated
		 */
		EClass TASK_DEFINITION_PACKAGE = eINSTANCE.getTaskDefinitionPackage();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.WorkProductDefinitionPackageImpl <em>Work Product Definition Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.WorkProductDefinitionPackageImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getWorkProductDefinitionPackage()
		 * @generated
		 */
		EClass WORK_PRODUCT_DEFINITION_PACKAGE = eINSTANCE.getWorkProductDefinitionPackage();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.GuidancePackageImpl <em>Guidance Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.GuidancePackageImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getGuidancePackage()
		 * @generated
		 */
		EClass GUIDANCE_PACKAGE = eINSTANCE.getGuidancePackage();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.DisciplinePackageImpl <em>Discipline Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.DisciplinePackageImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getDisciplinePackage()
		 * @generated
		 */
		EClass DISCIPLINE_PACKAGE = eINSTANCE.getDisciplinePackage();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.DomainPackageImpl <em>Domain Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.DomainPackageImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getDomainPackage()
		 * @generated
		 */
		EClass DOMAIN_PACKAGE = eINSTANCE.getDomainPackage();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.WorkProductKindPackageImpl <em>Work Product Kind Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.WorkProductKindPackageImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getWorkProductKindPackage()
		 * @generated
		 */
		EClass WORK_PRODUCT_KIND_PACKAGE = eINSTANCE.getWorkProductKindPackage();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.RoleSetPackageImpl <em>Role Set Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.RoleSetPackageImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getRoleSetPackage()
		 * @generated
		 */
		EClass ROLE_SET_PACKAGE = eINSTANCE.getRoleSetPackage();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.ToolDefinitionPackageImpl <em>Tool Definition Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.ToolDefinitionPackageImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getToolDefinitionPackage()
		 * @generated
		 */
		EClass TOOL_DEFINITION_PACKAGE = eINSTANCE.getToolDefinitionPackage();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.ConfigurationPackageImpl <em>Configuration Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.ConfigurationPackageImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getConfigurationPackage()
		 * @generated
		 */
		EClass CONFIGURATION_PACKAGE = eINSTANCE.getConfigurationPackage();

		/**
		 * The meta object literal for the '<em><b>Owned Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_PACKAGE__OWNED_CONFIGURATION = eINSTANCE.getConfigurationPackage_OwnedConfiguration();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.CapabilityPatternPackageImpl <em>Capability Pattern Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.CapabilityPatternPackageImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getCapabilityPatternPackage()
		 * @generated
		 */
		EClass CAPABILITY_PATTERN_PACKAGE = eINSTANCE.getCapabilityPatternPackage();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.DeliveryProcessPackageImpl <em>Delivery Process Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.DeliveryProcessPackageImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getDeliveryProcessPackage()
		 * @generated
		 */
		EClass DELIVERY_PROCESS_PACKAGE = eINSTANCE.getDeliveryProcessPackage();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.RoleSetImpl <em>Role Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.RoleSetImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getRoleSet()
		 * @generated
		 */
		EClass ROLE_SET = eINSTANCE.getRoleSet();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_SET__ROLE = eINSTANCE.getRoleSet_Role();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.QualificationPackageImpl <em>Qualification Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.QualificationPackageImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getQualificationPackage()
		 * @generated
		 */
		EClass QUALIFICATION_PACKAGE = eINSTANCE.getQualificationPackage();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.ProcessComponentPackageImpl <em>Process Component Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.ProcessComponentPackageImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getProcessComponentPackage()
		 * @generated
		 */
		EClass PROCESS_COMPONENT_PACKAGE = eINSTANCE.getProcessComponentPackage();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.impl.WorkProductKindImpl <em>Work Product Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.impl.WorkProductKindImpl
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getWorkProductKind()
		 * @generated
		 */
		EClass WORK_PRODUCT_KIND = eINSTANCE.getWorkProductKind();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.RiskLevel <em>Risk Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.RiskLevel
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getRiskLevel()
		 * @generated
		 */
		EEnum RISK_LEVEL = eINSTANCE.getRiskLevel();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.EstimatingTechnique <em>Estimating Technique</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.EstimatingTechnique
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getEstimatingTechnique()
		 * @generated
		 */
		EEnum ESTIMATING_TECHNIQUE = eINSTANCE.getEstimatingTechnique();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.ExpertiseLevel <em>Expertise Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.ExpertiseLevel
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getExpertiseLevel()
		 * @generated
		 */
		EEnum EXPERTISE_LEVEL = eINSTANCE.getExpertiseLevel();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.uma.ContractKind <em>Contract Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.uma.ContractKind
		 * @see org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl#getContractKind()
		 * @generated
		 */
		EEnum CONTRACT_KIND = eINSTANCE.getContractKind();

	}

} //UmaPackage
