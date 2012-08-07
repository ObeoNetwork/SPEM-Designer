/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.obeonetwork.dsl.spem.SpemFactory
 * @model kind="package"
 *        annotation="add-ons uma='WorkProductUseRelationship'"
 * @generated
 */
public interface SpemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.thalesgroup.com/spem/2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpemPackage eINSTANCE = org.obeonetwork.dsl.spem.impl.SpemPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.ExtensibleElementImpl <em>Extensible Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.ExtensibleElementImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getExtensibleElement()
	 * @generated
	 */
	int EXTENSIBLE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENT__KIND = 0;

	/**
	 * The number of structural features of the '<em>Extensible Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.KindImpl <em>Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.KindImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getKind()
	 * @generated
	 */
	int KIND = 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__KIND = EXTENSIBLE_ELEMENT__KIND;

	/**
	 * The number of structural features of the '<em>Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.WorkDefinitionPerformerImpl <em>Work Definition Performer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.WorkDefinitionPerformerImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkDefinitionPerformer()
	 * @generated
	 */
	int WORK_DEFINITION_PERFORMER = 2;

	/**
	 * The feature id for the '<em><b>Linked Work Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION_PERFORMER__LINKED_WORK_DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Work Definition Performer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION_PERFORMER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.WorkDefinitionImpl <em>Work Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.WorkDefinitionImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkDefinition()
	 * @generated
	 */
	int WORK_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION__PRE_CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION__POST_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION__OWNED_PARAMETER = 2;

	/**
	 * The number of structural features of the '<em>Work Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.WorkDefinitionParameterImpl <em>Work Definition Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.WorkDefinitionParameterImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkDefinitionParameter()
	 * @generated
	 */
	int WORK_DEFINITION_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION_PARAMETER__DIRECTION = 0;

	/**
	 * The number of structural features of the '<em>Work Definition Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION_PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.DescribableElementImpl <em>Describable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.DescribableElementImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getDescribableElement()
	 * @generated
	 */
	int DESCRIBABLE_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE_ELEMENT__KIND = EXTENSIBLE_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE_ELEMENT__PRESENTATION_NAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE_ELEMENT__PURPOSE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE_ELEMENT__GUIDANCE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE_ELEMENT__METRIC = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE_ELEMENT__CATEGORY = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE_ELEMENT__COPYRIGHT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE_ELEMENT__AUTHOR = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE_ELEMENT__CHANGE_DATE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE_ELEMENT__CHANGE_DESCRIPTION = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE_ELEMENT__VERSION = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Describable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE_ELEMENT_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.ProcessElementImpl <em>Process Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.ProcessElementImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getProcessElement()
	 * @generated
	 */
	int PROCESS_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__KIND = DESCRIBABLE_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__PRESENTATION_NAME = DESCRIBABLE_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__BRIEF_DESCRIPTION = DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__MAIN_DESCRIPTION = DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__PURPOSE = DESCRIBABLE_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__GUIDANCE = DESCRIBABLE_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__METRIC = DESCRIBABLE_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__CATEGORY = DESCRIBABLE_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__COPYRIGHT = DESCRIBABLE_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__AUTHOR = DESCRIBABLE_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__CHANGE_DATE = DESCRIBABLE_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__CHANGE_DESCRIPTION = DESCRIBABLE_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__VERSION = DESCRIBABLE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__NAME = DESCRIBABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__PROCESS_KIND = DESCRIBABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Process Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT_FEATURE_COUNT = DESCRIBABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.BreakdownElementImpl <em>Breakdown Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.BreakdownElementImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getBreakdownElement()
	 * @generated
	 */
	int BREAKDOWN_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKDOWN_ELEMENT__KIND = PROCESS_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKDOWN_ELEMENT__PRESENTATION_NAME = PROCESS_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKDOWN_ELEMENT__BRIEF_DESCRIPTION = PROCESS_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKDOWN_ELEMENT__MAIN_DESCRIPTION = PROCESS_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKDOWN_ELEMENT__PURPOSE = PROCESS_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKDOWN_ELEMENT__GUIDANCE = PROCESS_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKDOWN_ELEMENT__METRIC = PROCESS_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKDOWN_ELEMENT__CATEGORY = PROCESS_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKDOWN_ELEMENT__COPYRIGHT = PROCESS_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKDOWN_ELEMENT__AUTHOR = PROCESS_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKDOWN_ELEMENT__CHANGE_DATE = PROCESS_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKDOWN_ELEMENT__CHANGE_DESCRIPTION = PROCESS_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKDOWN_ELEMENT__VERSION = PROCESS_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKDOWN_ELEMENT__NAME = PROCESS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKDOWN_ELEMENT__PROCESS_KIND = PROCESS_ELEMENT__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKDOWN_ELEMENT__HAS_MULTIPLE_OCCURRENCES = PROCESS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKDOWN_ELEMENT__IS_OPTIONAL = PROCESS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKDOWN_ELEMENT__IS_PLANNED = PROCESS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKDOWN_ELEMENT__PLANNING_DATA = PROCESS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Breakdown Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKDOWN_ELEMENT_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.WorkBreakdownElementImpl <em>Work Breakdown Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.WorkBreakdownElementImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkBreakdownElement()
	 * @generated
	 */
	int WORK_BREAKDOWN_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__KIND = BREAKDOWN_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__PRESENTATION_NAME = BREAKDOWN_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__BRIEF_DESCRIPTION = BREAKDOWN_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__MAIN_DESCRIPTION = BREAKDOWN_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__PURPOSE = BREAKDOWN_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__GUIDANCE = BREAKDOWN_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__METRIC = BREAKDOWN_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__CATEGORY = BREAKDOWN_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__COPYRIGHT = BREAKDOWN_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__AUTHOR = BREAKDOWN_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__CHANGE_DATE = BREAKDOWN_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__CHANGE_DESCRIPTION = BREAKDOWN_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__VERSION = BREAKDOWN_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__NAME = BREAKDOWN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__PROCESS_KIND = BREAKDOWN_ELEMENT__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__HAS_MULTIPLE_OCCURRENCES = BREAKDOWN_ELEMENT__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__IS_OPTIONAL = BREAKDOWN_ELEMENT__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__IS_PLANNED = BREAKDOWN_ELEMENT__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__PLANNING_DATA = BREAKDOWN_ELEMENT__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Is Repeatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__IS_REPEATABLE = BREAKDOWN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Ongoing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__IS_ONGOING = BREAKDOWN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Event Driven</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__IS_EVENT_DRIVEN = BREAKDOWN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Link To Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__LINK_TO_PREDECESSOR = BREAKDOWN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Link To Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT__LINK_TO_SUCCESSOR = BREAKDOWN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Work Breakdown Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BREAKDOWN_ELEMENT_FEATURE_COUNT = BREAKDOWN_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.WorkSequenceImpl <em>Work Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.WorkSequenceImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkSequence()
	 * @generated
	 */
	int WORK_SEQUENCE = 7;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__KIND = BREAKDOWN_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__PRESENTATION_NAME = BREAKDOWN_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__BRIEF_DESCRIPTION = BREAKDOWN_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__MAIN_DESCRIPTION = BREAKDOWN_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__PURPOSE = BREAKDOWN_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__GUIDANCE = BREAKDOWN_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__METRIC = BREAKDOWN_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__CATEGORY = BREAKDOWN_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__COPYRIGHT = BREAKDOWN_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__AUTHOR = BREAKDOWN_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__CHANGE_DATE = BREAKDOWN_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__CHANGE_DESCRIPTION = BREAKDOWN_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__VERSION = BREAKDOWN_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__NAME = BREAKDOWN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__PROCESS_KIND = BREAKDOWN_ELEMENT__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__HAS_MULTIPLE_OCCURRENCES = BREAKDOWN_ELEMENT__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__IS_OPTIONAL = BREAKDOWN_ELEMENT__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__IS_PLANNED = BREAKDOWN_ELEMENT__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__PLANNING_DATA = BREAKDOWN_ELEMENT__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Link Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__LINK_KIND = BREAKDOWN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__PREDECESSOR = BREAKDOWN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__SUCCESSOR = BREAKDOWN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Work Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE_FEATURE_COUNT = BREAKDOWN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.ActivityImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 8;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PRE_CONDITION = WORK_DEFINITION__PRE_CONDITION;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__POST_CONDITION = WORK_DEFINITION__POST_CONDITION;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNED_PARAMETER = WORK_DEFINITION__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__KIND = WORK_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PRESENTATION_NAME = WORK_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__BRIEF_DESCRIPTION = WORK_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__MAIN_DESCRIPTION = WORK_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PURPOSE = WORK_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__GUIDANCE = WORK_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__METRIC = WORK_DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CATEGORY = WORK_DEFINITION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__COPYRIGHT = WORK_DEFINITION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__AUTHOR = WORK_DEFINITION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CHANGE_DATE = WORK_DEFINITION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CHANGE_DESCRIPTION = WORK_DEFINITION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__VERSION = WORK_DEFINITION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = WORK_DEFINITION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PROCESS_KIND = WORK_DEFINITION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__HAS_MULTIPLE_OCCURRENCES = WORK_DEFINITION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_OPTIONAL = WORK_DEFINITION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_PLANNED = WORK_DEFINITION_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PLANNING_DATA = WORK_DEFINITION_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Is Repeatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_REPEATABLE = WORK_DEFINITION_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Is Ongoing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_ONGOING = WORK_DEFINITION_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Is Event Driven</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_EVENT_DRIVEN = WORK_DEFINITION_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Link To Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LINK_TO_PREDECESSOR = WORK_DEFINITION_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Link To Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LINK_TO_SUCCESSOR = WORK_DEFINITION_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__VARIABILITY_TYPE = WORK_DEFINITION_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__VARIABILITY_BASED_ON_ELEMENT = WORK_DEFINITION_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Use Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__USE_KIND = WORK_DEFINITION_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Used Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__USED_ACTIVITY = WORK_DEFINITION_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Nested Breakdown Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NESTED_BREAKDOWN_ELEMENT = WORK_DEFINITION_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Suppressed Breakdown Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SUPPRESSED_BREAKDOWN_ELEMENT = WORK_DEFINITION_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Owned Process Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNED_PROCESS_PARAMETER = WORK_DEFINITION_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Default Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DEFAULT_CONTEXT = WORK_DEFINITION_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Valid Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__VALID_CONTEXT = WORK_DEFINITION_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Is Enactable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_ENACTABLE = WORK_DEFINITION_FEATURE_COUNT + 33;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = WORK_DEFINITION_FEATURE_COUNT + 34;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.ProcessPerformerImpl <em>Process Performer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.ProcessPerformerImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getProcessPerformer()
	 * @generated
	 */
	int PROCESS_PERFORMER = 9;

	/**
	 * The feature id for the '<em><b>Linked Work Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__LINKED_WORK_DEFINITION = WORK_DEFINITION_PERFORMER__LINKED_WORK_DEFINITION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__KIND = WORK_DEFINITION_PERFORMER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__PRESENTATION_NAME = WORK_DEFINITION_PERFORMER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__BRIEF_DESCRIPTION = WORK_DEFINITION_PERFORMER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__MAIN_DESCRIPTION = WORK_DEFINITION_PERFORMER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__PURPOSE = WORK_DEFINITION_PERFORMER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__GUIDANCE = WORK_DEFINITION_PERFORMER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__METRIC = WORK_DEFINITION_PERFORMER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__CATEGORY = WORK_DEFINITION_PERFORMER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__COPYRIGHT = WORK_DEFINITION_PERFORMER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__AUTHOR = WORK_DEFINITION_PERFORMER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__CHANGE_DATE = WORK_DEFINITION_PERFORMER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__CHANGE_DESCRIPTION = WORK_DEFINITION_PERFORMER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__VERSION = WORK_DEFINITION_PERFORMER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__NAME = WORK_DEFINITION_PERFORMER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__PROCESS_KIND = WORK_DEFINITION_PERFORMER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__HAS_MULTIPLE_OCCURRENCES = WORK_DEFINITION_PERFORMER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__IS_OPTIONAL = WORK_DEFINITION_PERFORMER_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__IS_PLANNED = WORK_DEFINITION_PERFORMER_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__PLANNING_DATA = WORK_DEFINITION_PERFORMER_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Linked Role Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__LINKED_ROLE_USE = WORK_DEFINITION_PERFORMER_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Linked Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__LINKED_ACTIVITY = WORK_DEFINITION_PERFORMER_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Linked Task Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__LINKED_TASK_USE = WORK_DEFINITION_PERFORMER_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Process Performer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER_FEATURE_COUNT = WORK_DEFINITION_PERFORMER_FEATURE_COUNT + 22;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.MethodContentUseImpl <em>Method Content Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.MethodContentUseImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getMethodContentUse()
	 * @generated
	 */
	int METHOD_CONTENT_USE = 39;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_USE__KIND = BREAKDOWN_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_USE__PRESENTATION_NAME = BREAKDOWN_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_USE__BRIEF_DESCRIPTION = BREAKDOWN_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_USE__MAIN_DESCRIPTION = BREAKDOWN_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_USE__PURPOSE = BREAKDOWN_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_USE__GUIDANCE = BREAKDOWN_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_USE__METRIC = BREAKDOWN_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_USE__CATEGORY = BREAKDOWN_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_USE__COPYRIGHT = BREAKDOWN_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_USE__AUTHOR = BREAKDOWN_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_USE__CHANGE_DATE = BREAKDOWN_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_USE__CHANGE_DESCRIPTION = BREAKDOWN_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_USE__VERSION = BREAKDOWN_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_USE__NAME = BREAKDOWN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_USE__PROCESS_KIND = BREAKDOWN_ELEMENT__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_USE__HAS_MULTIPLE_OCCURRENCES = BREAKDOWN_ELEMENT__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_USE__IS_OPTIONAL = BREAKDOWN_ELEMENT__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_USE__IS_PLANNED = BREAKDOWN_ELEMENT__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_USE__PLANNING_DATA = BREAKDOWN_ELEMENT__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Is Synchronized With Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_USE__IS_SYNCHRONIZED_WITH_SOURCE = BREAKDOWN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Method Content Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_USE_FEATURE_COUNT = BREAKDOWN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.RoleUseImpl <em>Role Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.RoleUseImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getRoleUse()
	 * @generated
	 */
	int ROLE_USE = 10;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_USE__KIND = METHOD_CONTENT_USE__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_USE__PRESENTATION_NAME = METHOD_CONTENT_USE__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_USE__BRIEF_DESCRIPTION = METHOD_CONTENT_USE__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_USE__MAIN_DESCRIPTION = METHOD_CONTENT_USE__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_USE__PURPOSE = METHOD_CONTENT_USE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_USE__GUIDANCE = METHOD_CONTENT_USE__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_USE__METRIC = METHOD_CONTENT_USE__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_USE__CATEGORY = METHOD_CONTENT_USE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_USE__COPYRIGHT = METHOD_CONTENT_USE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_USE__AUTHOR = METHOD_CONTENT_USE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_USE__CHANGE_DATE = METHOD_CONTENT_USE__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_USE__CHANGE_DESCRIPTION = METHOD_CONTENT_USE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_USE__VERSION = METHOD_CONTENT_USE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_USE__NAME = METHOD_CONTENT_USE__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_USE__PROCESS_KIND = METHOD_CONTENT_USE__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_USE__HAS_MULTIPLE_OCCURRENCES = METHOD_CONTENT_USE__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_USE__IS_OPTIONAL = METHOD_CONTENT_USE__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_USE__IS_PLANNED = METHOD_CONTENT_USE__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_USE__PLANNING_DATA = METHOD_CONTENT_USE__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Is Synchronized With Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_USE__IS_SYNCHRONIZED_WITH_SOURCE = METHOD_CONTENT_USE__IS_SYNCHRONIZED_WITH_SOURCE;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_USE__ROLE = METHOD_CONTENT_USE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applied Qualification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_USE__APPLIED_QUALIFICATION = METHOD_CONTENT_USE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_USE_FEATURE_COUNT = METHOD_CONTENT_USE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.ProcessResponsibilityAssignmentImpl <em>Process Responsibility Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.ProcessResponsibilityAssignmentImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getProcessResponsibilityAssignment()
	 * @generated
	 */
	int PROCESS_RESPONSIBILITY_ASSIGNMENT = 11;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSIBILITY_ASSIGNMENT__KIND = BREAKDOWN_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSIBILITY_ASSIGNMENT__PRESENTATION_NAME = BREAKDOWN_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSIBILITY_ASSIGNMENT__BRIEF_DESCRIPTION = BREAKDOWN_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSIBILITY_ASSIGNMENT__MAIN_DESCRIPTION = BREAKDOWN_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSIBILITY_ASSIGNMENT__PURPOSE = BREAKDOWN_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSIBILITY_ASSIGNMENT__GUIDANCE = BREAKDOWN_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSIBILITY_ASSIGNMENT__METRIC = BREAKDOWN_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSIBILITY_ASSIGNMENT__CATEGORY = BREAKDOWN_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSIBILITY_ASSIGNMENT__COPYRIGHT = BREAKDOWN_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSIBILITY_ASSIGNMENT__AUTHOR = BREAKDOWN_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSIBILITY_ASSIGNMENT__CHANGE_DATE = BREAKDOWN_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSIBILITY_ASSIGNMENT__CHANGE_DESCRIPTION = BREAKDOWN_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSIBILITY_ASSIGNMENT__VERSION = BREAKDOWN_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSIBILITY_ASSIGNMENT__NAME = BREAKDOWN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSIBILITY_ASSIGNMENT__PROCESS_KIND = BREAKDOWN_ELEMENT__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSIBILITY_ASSIGNMENT__HAS_MULTIPLE_OCCURRENCES = BREAKDOWN_ELEMENT__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSIBILITY_ASSIGNMENT__IS_OPTIONAL = BREAKDOWN_ELEMENT__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSIBILITY_ASSIGNMENT__IS_PLANNED = BREAKDOWN_ELEMENT__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSIBILITY_ASSIGNMENT__PLANNING_DATA = BREAKDOWN_ELEMENT__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Linked Role Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSIBILITY_ASSIGNMENT__LINKED_ROLE_USE = BREAKDOWN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Linked Work Product Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSIBILITY_ASSIGNMENT__LINKED_WORK_PRODUCT_USE = BREAKDOWN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Process Responsibility Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSIBILITY_ASSIGNMENT_FEATURE_COUNT = BREAKDOWN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.WorkProductUseImpl <em>Work Product Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.WorkProductUseImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkProductUse()
	 * @generated
	 */
	int WORK_PRODUCT_USE = 12;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__KIND = METHOD_CONTENT_USE__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__PRESENTATION_NAME = METHOD_CONTENT_USE__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__BRIEF_DESCRIPTION = METHOD_CONTENT_USE__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__MAIN_DESCRIPTION = METHOD_CONTENT_USE__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__PURPOSE = METHOD_CONTENT_USE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__GUIDANCE = METHOD_CONTENT_USE__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__METRIC = METHOD_CONTENT_USE__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__CATEGORY = METHOD_CONTENT_USE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__COPYRIGHT = METHOD_CONTENT_USE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__AUTHOR = METHOD_CONTENT_USE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__CHANGE_DATE = METHOD_CONTENT_USE__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__CHANGE_DESCRIPTION = METHOD_CONTENT_USE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__VERSION = METHOD_CONTENT_USE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__NAME = METHOD_CONTENT_USE__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__PROCESS_KIND = METHOD_CONTENT_USE__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__HAS_MULTIPLE_OCCURRENCES = METHOD_CONTENT_USE__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__IS_OPTIONAL = METHOD_CONTENT_USE__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__IS_PLANNED = METHOD_CONTENT_USE__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__PLANNING_DATA = METHOD_CONTENT_USE__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Is Synchronized With Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__IS_SYNCHRONIZED_WITH_SOURCE = METHOD_CONTENT_USE__IS_SYNCHRONIZED_WITH_SOURCE;

	/**
	 * The feature id for the '<em><b>Work Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__WORK_PRODUCT = METHOD_CONTENT_USE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Work Product Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_FEATURE_COUNT = METHOD_CONTENT_USE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.WorkProductUseRelationshipImpl <em>Work Product Use Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.WorkProductUseRelationshipImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkProductUseRelationship()
	 * @generated
	 */
	int WORK_PRODUCT_USE_RELATIONSHIP = 13;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_RELATIONSHIP__KIND = BREAKDOWN_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_RELATIONSHIP__PRESENTATION_NAME = BREAKDOWN_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_RELATIONSHIP__BRIEF_DESCRIPTION = BREAKDOWN_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_RELATIONSHIP__MAIN_DESCRIPTION = BREAKDOWN_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_RELATIONSHIP__PURPOSE = BREAKDOWN_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_RELATIONSHIP__GUIDANCE = BREAKDOWN_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_RELATIONSHIP__METRIC = BREAKDOWN_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_RELATIONSHIP__CATEGORY = BREAKDOWN_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_RELATIONSHIP__COPYRIGHT = BREAKDOWN_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_RELATIONSHIP__AUTHOR = BREAKDOWN_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_RELATIONSHIP__CHANGE_DATE = BREAKDOWN_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_RELATIONSHIP__CHANGE_DESCRIPTION = BREAKDOWN_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_RELATIONSHIP__VERSION = BREAKDOWN_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_RELATIONSHIP__NAME = BREAKDOWN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_RELATIONSHIP__PROCESS_KIND = BREAKDOWN_ELEMENT__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_RELATIONSHIP__HAS_MULTIPLE_OCCURRENCES = BREAKDOWN_ELEMENT__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_RELATIONSHIP__IS_OPTIONAL = BREAKDOWN_ELEMENT__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_RELATIONSHIP__IS_PLANNED = BREAKDOWN_ELEMENT__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_RELATIONSHIP__PLANNING_DATA = BREAKDOWN_ELEMENT__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_RELATIONSHIP__SOURCE = BREAKDOWN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_RELATIONSHIP__TARGET = BREAKDOWN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relationship Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_RELATIONSHIP__RELATIONSHIP_KIND = BREAKDOWN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Work Product Use Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_RELATIONSHIP_FEATURE_COUNT = BREAKDOWN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.ProcessParameterImpl <em>Process Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.ProcessParameterImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getProcessParameter()
	 * @generated
	 */
	int PROCESS_PARAMETER = 14;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__DIRECTION = WORK_DEFINITION_PARAMETER__DIRECTION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__KIND = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__PRESENTATION_NAME = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__BRIEF_DESCRIPTION = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__MAIN_DESCRIPTION = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__PURPOSE = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__GUIDANCE = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__METRIC = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__CATEGORY = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__COPYRIGHT = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__AUTHOR = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__CHANGE_DATE = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__CHANGE_DESCRIPTION = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__VERSION = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__NAME = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__PROCESS_KIND = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__HAS_MULTIPLE_OCCURRENCES = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__IS_OPTIONAL = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__IS_PLANNED = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__PLANNING_DATA = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__PARAMETER_TYPE = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Optionality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__OPTIONALITY = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Process Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER_FEATURE_COUNT = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 21;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.MilestoneImpl <em>Milestone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.MilestoneImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getMilestone()
	 * @generated
	 */
	int MILESTONE = 15;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__KIND = WORK_BREAKDOWN_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__PRESENTATION_NAME = WORK_BREAKDOWN_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__BRIEF_DESCRIPTION = WORK_BREAKDOWN_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__MAIN_DESCRIPTION = WORK_BREAKDOWN_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__PURPOSE = WORK_BREAKDOWN_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__GUIDANCE = WORK_BREAKDOWN_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__METRIC = WORK_BREAKDOWN_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__CATEGORY = WORK_BREAKDOWN_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__COPYRIGHT = WORK_BREAKDOWN_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__AUTHOR = WORK_BREAKDOWN_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__CHANGE_DATE = WORK_BREAKDOWN_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__CHANGE_DESCRIPTION = WORK_BREAKDOWN_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__VERSION = WORK_BREAKDOWN_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__NAME = WORK_BREAKDOWN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__PROCESS_KIND = WORK_BREAKDOWN_ELEMENT__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__HAS_MULTIPLE_OCCURRENCES = WORK_BREAKDOWN_ELEMENT__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__IS_OPTIONAL = WORK_BREAKDOWN_ELEMENT__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__IS_PLANNED = WORK_BREAKDOWN_ELEMENT__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__PLANNING_DATA = WORK_BREAKDOWN_ELEMENT__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Is Repeatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__IS_REPEATABLE = WORK_BREAKDOWN_ELEMENT__IS_REPEATABLE;

	/**
	 * The feature id for the '<em><b>Is Ongoing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__IS_ONGOING = WORK_BREAKDOWN_ELEMENT__IS_ONGOING;

	/**
	 * The feature id for the '<em><b>Is Event Driven</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__IS_EVENT_DRIVEN = WORK_BREAKDOWN_ELEMENT__IS_EVENT_DRIVEN;

	/**
	 * The feature id for the '<em><b>Link To Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__LINK_TO_PREDECESSOR = WORK_BREAKDOWN_ELEMENT__LINK_TO_PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Link To Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__LINK_TO_SUCCESSOR = WORK_BREAKDOWN_ELEMENT__LINK_TO_SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Required Result</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__REQUIRED_RESULT = WORK_BREAKDOWN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Milestone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE_FEATURE_COUNT = WORK_BREAKDOWN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.MethodContentElementImpl <em>Method Content Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.MethodContentElementImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getMethodContentElement()
	 * @generated
	 */
	int METHOD_CONTENT_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_ELEMENT__KIND = DESCRIBABLE_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_ELEMENT__PRESENTATION_NAME = DESCRIBABLE_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_ELEMENT__BRIEF_DESCRIPTION = DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_ELEMENT__MAIN_DESCRIPTION = DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_ELEMENT__PURPOSE = DESCRIBABLE_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_ELEMENT__GUIDANCE = DESCRIBABLE_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_ELEMENT__METRIC = DESCRIBABLE_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_ELEMENT__CATEGORY = DESCRIBABLE_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_ELEMENT__COPYRIGHT = DESCRIBABLE_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_ELEMENT__AUTHOR = DESCRIBABLE_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_ELEMENT__CHANGE_DATE = DESCRIBABLE_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_ELEMENT__CHANGE_DESCRIPTION = DESCRIBABLE_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_ELEMENT__VERSION = DESCRIBABLE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_ELEMENT__NAME = DESCRIBABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_ELEMENT__VARIABILITY_TYPE = DESCRIBABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_ELEMENT__VARIABILITY_BASED_ON_ELEMENT = DESCRIBABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND = DESCRIBABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Method Content Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_ELEMENT_FEATURE_COUNT = DESCRIBABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.CategoryImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 18;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__KIND = METHOD_CONTENT_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__PRESENTATION_NAME = METHOD_CONTENT_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__BRIEF_DESCRIPTION = METHOD_CONTENT_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__MAIN_DESCRIPTION = METHOD_CONTENT_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__PURPOSE = METHOD_CONTENT_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__GUIDANCE = METHOD_CONTENT_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__METRIC = METHOD_CONTENT_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORY = METHOD_CONTENT_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__COPYRIGHT = METHOD_CONTENT_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__AUTHOR = METHOD_CONTENT_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CHANGE_DATE = METHOD_CONTENT_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CHANGE_DESCRIPTION = METHOD_CONTENT_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__VERSION = METHOD_CONTENT_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = METHOD_CONTENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__VARIABILITY_TYPE = METHOD_CONTENT_ELEMENT__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__VARIABILITY_BASED_ON_ELEMENT = METHOD_CONTENT_ELEMENT__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__METHOD_CONTENT_KIND = METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>Sub Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__SUB_CATEGORY = METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Categorized Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORIZED_ELEMENT = METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.GuidanceImpl <em>Guidance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.GuidanceImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getGuidance()
	 * @generated
	 */
	int GUIDANCE = 19;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__KIND = METHOD_CONTENT_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__PRESENTATION_NAME = METHOD_CONTENT_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__BRIEF_DESCRIPTION = METHOD_CONTENT_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__MAIN_DESCRIPTION = METHOD_CONTENT_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__PURPOSE = METHOD_CONTENT_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__GUIDANCE = METHOD_CONTENT_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__METRIC = METHOD_CONTENT_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__CATEGORY = METHOD_CONTENT_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__COPYRIGHT = METHOD_CONTENT_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__AUTHOR = METHOD_CONTENT_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__CHANGE_DATE = METHOD_CONTENT_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__CHANGE_DESCRIPTION = METHOD_CONTENT_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__VERSION = METHOD_CONTENT_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__NAME = METHOD_CONTENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__VARIABILITY_TYPE = METHOD_CONTENT_ELEMENT__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__VARIABILITY_BASED_ON_ELEMENT = METHOD_CONTENT_ELEMENT__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__METHOD_CONTENT_KIND = METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND;

	/**
	 * The number of structural features of the '<em>Guidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE_FEATURE_COUNT = METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.MetricImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 20;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__KIND = DESCRIBABLE_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__PRESENTATION_NAME = DESCRIBABLE_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__BRIEF_DESCRIPTION = DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__MAIN_DESCRIPTION = DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__PURPOSE = DESCRIBABLE_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__GUIDANCE = DESCRIBABLE_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__METRIC = DESCRIBABLE_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__CATEGORY = DESCRIBABLE_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__COPYRIGHT = DESCRIBABLE_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__AUTHOR = DESCRIBABLE_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__CHANGE_DATE = DESCRIBABLE_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__CHANGE_DESCRIPTION = DESCRIBABLE_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__VERSION = DESCRIBABLE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__EXPRESSION = DESCRIBABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = DESCRIBABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.ToolDefinitionImpl <em>Tool Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.ToolDefinitionImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getToolDefinition()
	 * @generated
	 */
	int TOOL_DEFINITION = 22;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__KIND = METHOD_CONTENT_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__PRESENTATION_NAME = METHOD_CONTENT_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__BRIEF_DESCRIPTION = METHOD_CONTENT_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__MAIN_DESCRIPTION = METHOD_CONTENT_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__PURPOSE = METHOD_CONTENT_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__GUIDANCE = METHOD_CONTENT_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__METRIC = METHOD_CONTENT_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__CATEGORY = METHOD_CONTENT_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__COPYRIGHT = METHOD_CONTENT_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__AUTHOR = METHOD_CONTENT_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__CHANGE_DATE = METHOD_CONTENT_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__CHANGE_DESCRIPTION = METHOD_CONTENT_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__VERSION = METHOD_CONTENT_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__NAME = METHOD_CONTENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__VARIABILITY_TYPE = METHOD_CONTENT_ELEMENT__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__VARIABILITY_BASED_ON_ELEMENT = METHOD_CONTENT_ELEMENT__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__METHOD_CONTENT_KIND = METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>Managed Work Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__MANAGED_WORK_PRODUCT = METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tool Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION_FEATURE_COUNT = METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.TaskDefinitionImpl <em>Task Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.TaskDefinitionImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getTaskDefinition()
	 * @generated
	 */
	int TASK_DEFINITION = 23;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__PRE_CONDITION = WORK_DEFINITION__PRE_CONDITION;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__POST_CONDITION = WORK_DEFINITION__POST_CONDITION;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__OWNED_PARAMETER = WORK_DEFINITION__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__KIND = WORK_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__PRESENTATION_NAME = WORK_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__BRIEF_DESCRIPTION = WORK_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__MAIN_DESCRIPTION = WORK_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__PURPOSE = WORK_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__GUIDANCE = WORK_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__METRIC = WORK_DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__CATEGORY = WORK_DEFINITION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__COPYRIGHT = WORK_DEFINITION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__AUTHOR = WORK_DEFINITION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__CHANGE_DATE = WORK_DEFINITION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__CHANGE_DESCRIPTION = WORK_DEFINITION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__VERSION = WORK_DEFINITION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__NAME = WORK_DEFINITION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__VARIABILITY_TYPE = WORK_DEFINITION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__VARIABILITY_BASED_ON_ELEMENT = WORK_DEFINITION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__METHOD_CONTENT_KIND = WORK_DEFINITION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Owned Task Definition Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__OWNED_TASK_DEFINITION_PARAMETER = WORK_DEFINITION_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Used Tool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__USED_TOOL = WORK_DEFINITION_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__STEP = WORK_DEFINITION_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Required Qualification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__REQUIRED_QUALIFICATION = WORK_DEFINITION_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Task Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION_FEATURE_COUNT = WORK_DEFINITION_FEATURE_COUNT + 21;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.StepImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 24;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PRE_CONDITION = WORK_DEFINITION__PRE_CONDITION;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__POST_CONDITION = WORK_DEFINITION__POST_CONDITION;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_PARAMETER = WORK_DEFINITION__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__KIND = WORK_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PRESENTATION_NAME = WORK_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__BRIEF_DESCRIPTION = WORK_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__MAIN_DESCRIPTION = WORK_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PURPOSE = WORK_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__GUIDANCE = WORK_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__METRIC = WORK_DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__CATEGORY = WORK_DEFINITION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__COPYRIGHT = WORK_DEFINITION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__AUTHOR = WORK_DEFINITION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__CHANGE_DATE = WORK_DEFINITION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__CHANGE_DESCRIPTION = WORK_DEFINITION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__VERSION = WORK_DEFINITION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__VARIABILITY_TYPE = WORK_DEFINITION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__VARIABILITY_BASED_ON_ELEMENT = WORK_DEFINITION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = WORK_DEFINITION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PREDECESSOR = WORK_DEFINITION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__SUCCESSOR = WORK_DEFINITION_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = WORK_DEFINITION_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.WorkProductDefinitionImpl <em>Work Product Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.WorkProductDefinitionImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkProductDefinition()
	 * @generated
	 */
	int WORK_PRODUCT_DEFINITION = 25;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__KIND = METHOD_CONTENT_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__PRESENTATION_NAME = METHOD_CONTENT_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__BRIEF_DESCRIPTION = METHOD_CONTENT_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__MAIN_DESCRIPTION = METHOD_CONTENT_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__PURPOSE = METHOD_CONTENT_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__GUIDANCE = METHOD_CONTENT_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__METRIC = METHOD_CONTENT_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__CATEGORY = METHOD_CONTENT_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__COPYRIGHT = METHOD_CONTENT_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__AUTHOR = METHOD_CONTENT_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__CHANGE_DATE = METHOD_CONTENT_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__CHANGE_DESCRIPTION = METHOD_CONTENT_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__VERSION = METHOD_CONTENT_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__NAME = METHOD_CONTENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__VARIABILITY_TYPE = METHOD_CONTENT_ELEMENT__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__VARIABILITY_BASED_ON_ELEMENT = METHOD_CONTENT_ELEMENT__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__METHOD_CONTENT_KIND = METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND;

	/**
	 * The number of structural features of the '<em>Work Product Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_FEATURE_COUNT = METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.RoleDefinitionImpl <em>Role Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.RoleDefinitionImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getRoleDefinition()
	 * @generated
	 */
	int ROLE_DEFINITION = 26;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION__KIND = METHOD_CONTENT_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION__PRESENTATION_NAME = METHOD_CONTENT_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION__BRIEF_DESCRIPTION = METHOD_CONTENT_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION__MAIN_DESCRIPTION = METHOD_CONTENT_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION__PURPOSE = METHOD_CONTENT_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION__GUIDANCE = METHOD_CONTENT_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION__METRIC = METHOD_CONTENT_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION__CATEGORY = METHOD_CONTENT_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION__COPYRIGHT = METHOD_CONTENT_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION__AUTHOR = METHOD_CONTENT_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION__CHANGE_DATE = METHOD_CONTENT_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION__CHANGE_DESCRIPTION = METHOD_CONTENT_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION__VERSION = METHOD_CONTENT_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION__NAME = METHOD_CONTENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION__VARIABILITY_TYPE = METHOD_CONTENT_ELEMENT__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION__VARIABILITY_BASED_ON_ELEMENT = METHOD_CONTENT_ELEMENT__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION__METHOD_CONTENT_KIND = METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>Synonym</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION__SYNONYM = METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Qualification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION__PROVIDED_QUALIFICATION = METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION_FEATURE_COUNT = METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.WorkProductDefinitionRelationshipImpl <em>Work Product Definition Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.WorkProductDefinitionRelationshipImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkProductDefinitionRelationship()
	 * @generated
	 */
	int WORK_PRODUCT_DEFINITION_RELATIONSHIP = 27;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_RELATIONSHIP__KIND = METHOD_CONTENT_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_RELATIONSHIP__PRESENTATION_NAME = METHOD_CONTENT_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_RELATIONSHIP__BRIEF_DESCRIPTION = METHOD_CONTENT_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_RELATIONSHIP__MAIN_DESCRIPTION = METHOD_CONTENT_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_RELATIONSHIP__PURPOSE = METHOD_CONTENT_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_RELATIONSHIP__GUIDANCE = METHOD_CONTENT_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_RELATIONSHIP__METRIC = METHOD_CONTENT_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_RELATIONSHIP__CATEGORY = METHOD_CONTENT_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_RELATIONSHIP__COPYRIGHT = METHOD_CONTENT_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_RELATIONSHIP__AUTHOR = METHOD_CONTENT_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_RELATIONSHIP__CHANGE_DATE = METHOD_CONTENT_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_RELATIONSHIP__CHANGE_DESCRIPTION = METHOD_CONTENT_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_RELATIONSHIP__VERSION = METHOD_CONTENT_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_RELATIONSHIP__NAME = METHOD_CONTENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_RELATIONSHIP__VARIABILITY_TYPE = METHOD_CONTENT_ELEMENT__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_RELATIONSHIP__VARIABILITY_BASED_ON_ELEMENT = METHOD_CONTENT_ELEMENT__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_RELATIONSHIP__METHOD_CONTENT_KIND = METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_RELATIONSHIP__SOURCE = METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_RELATIONSHIP__TARGET = METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Work Product Definition Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_RELATIONSHIP_FEATURE_COUNT = METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.Default_TaskDefinitionPerformerImpl <em>Default Task Definition Performer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.Default_TaskDefinitionPerformerImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getDefault_TaskDefinitionPerformer()
	 * @generated
	 */
	int DEFAULT_TASK_DEFINITION_PERFORMER = 28;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PERFORMER__KIND = METHOD_CONTENT_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PERFORMER__PRESENTATION_NAME = METHOD_CONTENT_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PERFORMER__BRIEF_DESCRIPTION = METHOD_CONTENT_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PERFORMER__MAIN_DESCRIPTION = METHOD_CONTENT_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PERFORMER__PURPOSE = METHOD_CONTENT_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PERFORMER__GUIDANCE = METHOD_CONTENT_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PERFORMER__METRIC = METHOD_CONTENT_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PERFORMER__CATEGORY = METHOD_CONTENT_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PERFORMER__COPYRIGHT = METHOD_CONTENT_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PERFORMER__AUTHOR = METHOD_CONTENT_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PERFORMER__CHANGE_DATE = METHOD_CONTENT_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PERFORMER__CHANGE_DESCRIPTION = METHOD_CONTENT_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PERFORMER__VERSION = METHOD_CONTENT_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PERFORMER__NAME = METHOD_CONTENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PERFORMER__VARIABILITY_TYPE = METHOD_CONTENT_ELEMENT__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PERFORMER__VARIABILITY_BASED_ON_ELEMENT = METHOD_CONTENT_ELEMENT__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PERFORMER__METHOD_CONTENT_KIND = METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>Linked Task Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PERFORMER__LINKED_TASK_DEFINITION = METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Linked Role Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PERFORMER__LINKED_ROLE_DEFINITION = METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Default Task Definition Performer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PERFORMER_FEATURE_COUNT = METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.Default_ResponsibilityAssignmentImpl <em>Default Responsibility Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.Default_ResponsibilityAssignmentImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getDefault_ResponsibilityAssignment()
	 * @generated
	 */
	int DEFAULT_RESPONSIBILITY_ASSIGNMENT = 29;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_RESPONSIBILITY_ASSIGNMENT__KIND = METHOD_CONTENT_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_RESPONSIBILITY_ASSIGNMENT__PRESENTATION_NAME = METHOD_CONTENT_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_RESPONSIBILITY_ASSIGNMENT__BRIEF_DESCRIPTION = METHOD_CONTENT_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_RESPONSIBILITY_ASSIGNMENT__MAIN_DESCRIPTION = METHOD_CONTENT_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_RESPONSIBILITY_ASSIGNMENT__PURPOSE = METHOD_CONTENT_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_RESPONSIBILITY_ASSIGNMENT__GUIDANCE = METHOD_CONTENT_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_RESPONSIBILITY_ASSIGNMENT__METRIC = METHOD_CONTENT_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_RESPONSIBILITY_ASSIGNMENT__CATEGORY = METHOD_CONTENT_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_RESPONSIBILITY_ASSIGNMENT__COPYRIGHT = METHOD_CONTENT_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_RESPONSIBILITY_ASSIGNMENT__AUTHOR = METHOD_CONTENT_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_RESPONSIBILITY_ASSIGNMENT__CHANGE_DATE = METHOD_CONTENT_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_RESPONSIBILITY_ASSIGNMENT__CHANGE_DESCRIPTION = METHOD_CONTENT_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_RESPONSIBILITY_ASSIGNMENT__VERSION = METHOD_CONTENT_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_RESPONSIBILITY_ASSIGNMENT__NAME = METHOD_CONTENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_RESPONSIBILITY_ASSIGNMENT__VARIABILITY_TYPE = METHOD_CONTENT_ELEMENT__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_RESPONSIBILITY_ASSIGNMENT__VARIABILITY_BASED_ON_ELEMENT = METHOD_CONTENT_ELEMENT__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_RESPONSIBILITY_ASSIGNMENT__METHOD_CONTENT_KIND = METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>Linked Role Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_RESPONSIBILITY_ASSIGNMENT__LINKED_ROLE_DEFINITION = METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Linked Work Product Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_RESPONSIBILITY_ASSIGNMENT__LINKED_WORK_PRODUCT_DEFINITION = METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Default Responsibility Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_RESPONSIBILITY_ASSIGNMENT_FEATURE_COUNT = METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.Default_TaskDefinitionParameterImpl <em>Default Task Definition Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.Default_TaskDefinitionParameterImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getDefault_TaskDefinitionParameter()
	 * @generated
	 */
	int DEFAULT_TASK_DEFINITION_PARAMETER = 30;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PARAMETER__DIRECTION = WORK_DEFINITION_PARAMETER__DIRECTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PARAMETER__NAME = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PARAMETER__PARAMETER_TYPE = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Optionality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PARAMETER__OPTIONALITY = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Default Task Definition Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TASK_DEFINITION_PARAMETER_FEATURE_COUNT = WORK_DEFINITION_PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.QualificationImpl <em>Qualification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.QualificationImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getQualification()
	 * @generated
	 */
	int QUALIFICATION = 31;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION__KIND = METHOD_CONTENT_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION__PRESENTATION_NAME = METHOD_CONTENT_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION__BRIEF_DESCRIPTION = METHOD_CONTENT_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION__MAIN_DESCRIPTION = METHOD_CONTENT_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION__PURPOSE = METHOD_CONTENT_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION__GUIDANCE = METHOD_CONTENT_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION__METRIC = METHOD_CONTENT_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION__CATEGORY = METHOD_CONTENT_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION__COPYRIGHT = METHOD_CONTENT_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION__AUTHOR = METHOD_CONTENT_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION__CHANGE_DATE = METHOD_CONTENT_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION__CHANGE_DESCRIPTION = METHOD_CONTENT_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION__VERSION = METHOD_CONTENT_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION__NAME = METHOD_CONTENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION__VARIABILITY_TYPE = METHOD_CONTENT_ELEMENT__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION__VARIABILITY_BASED_ON_ELEMENT = METHOD_CONTENT_ELEMENT__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION__METHOD_CONTENT_KIND = METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND;

	/**
	 * The number of structural features of the '<em>Qualification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_FEATURE_COUNT = METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.MethodContentPackageableElementImpl <em>Method Content Packageable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.MethodContentPackageableElementImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getMethodContentPackageableElement()
	 * @generated
	 */
	int METHOD_CONTENT_PACKAGEABLE_ELEMENT = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_PACKAGEABLE_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Method Content Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_PACKAGEABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.ProcessPackageableElementImpl <em>Process Packageable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.ProcessPackageableElementImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getProcessPackageableElement()
	 * @generated
	 */
	int PROCESS_PACKAGEABLE_ELEMENT = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PACKAGEABLE_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Process Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PACKAGEABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.MethodContentPackageImpl <em>Method Content Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.MethodContentPackageImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getMethodContentPackage()
	 * @generated
	 */
	int METHOD_CONTENT_PACKAGE = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_PACKAGE__NAME = METHOD_CONTENT_PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Method Content Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER = METHOD_CONTENT_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reused Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_PACKAGE__REUSED_PACKAGE = METHOD_CONTENT_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Method Content Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_PACKAGE_FEATURE_COUNT = METHOD_CONTENT_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.ProcessPackageImpl <em>Process Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.ProcessPackageImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getProcessPackage()
	 * @generated
	 */
	int PROCESS_PACKAGE = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PACKAGE__NAME = PROCESS_PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Process Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PACKAGE__OWNED_PROCESS_MEMBER = PROCESS_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PACKAGE_FEATURE_COUNT = PROCESS_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.MethodContentKindImpl <em>Method Content Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.MethodContentKindImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getMethodContentKind()
	 * @generated
	 */
	int METHOD_CONTENT_KIND = 36;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_KIND__KIND = METHOD_CONTENT_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_KIND__PRESENTATION_NAME = METHOD_CONTENT_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_KIND__BRIEF_DESCRIPTION = METHOD_CONTENT_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_KIND__MAIN_DESCRIPTION = METHOD_CONTENT_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_KIND__PURPOSE = METHOD_CONTENT_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_KIND__GUIDANCE = METHOD_CONTENT_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_KIND__METRIC = METHOD_CONTENT_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_KIND__CATEGORY = METHOD_CONTENT_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_KIND__COPYRIGHT = METHOD_CONTENT_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_KIND__AUTHOR = METHOD_CONTENT_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_KIND__CHANGE_DATE = METHOD_CONTENT_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_KIND__CHANGE_DESCRIPTION = METHOD_CONTENT_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_KIND__VERSION = METHOD_CONTENT_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_KIND__NAME = METHOD_CONTENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_KIND__VARIABILITY_TYPE = METHOD_CONTENT_ELEMENT__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_KIND__VARIABILITY_BASED_ON_ELEMENT = METHOD_CONTENT_ELEMENT__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_KIND__METHOD_CONTENT_KIND = METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND;

	/**
	 * The number of structural features of the '<em>Method Content Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONTENT_KIND_FEATURE_COUNT = METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.ProcessKindImpl <em>Process Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.ProcessKindImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getProcessKind()
	 * @generated
	 */
	int PROCESS_KIND = 37;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_KIND__KIND = PROCESS_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_KIND__PRESENTATION_NAME = PROCESS_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_KIND__BRIEF_DESCRIPTION = PROCESS_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_KIND__MAIN_DESCRIPTION = PROCESS_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_KIND__PURPOSE = PROCESS_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_KIND__GUIDANCE = PROCESS_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_KIND__METRIC = PROCESS_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_KIND__CATEGORY = PROCESS_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_KIND__COPYRIGHT = PROCESS_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_KIND__AUTHOR = PROCESS_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_KIND__CHANGE_DATE = PROCESS_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_KIND__CHANGE_DESCRIPTION = PROCESS_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_KIND__VERSION = PROCESS_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_KIND__NAME = PROCESS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_KIND__PROCESS_KIND = PROCESS_ELEMENT__PROCESS_KIND;

	/**
	 * The number of structural features of the '<em>Process Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_KIND_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.PlanningDataImpl <em>Planning Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.PlanningDataImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getPlanningData()
	 * @generated
	 */
	int PLANNING_DATA = 38;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_DATA__KIND = PROCESS_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_DATA__PRESENTATION_NAME = PROCESS_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_DATA__BRIEF_DESCRIPTION = PROCESS_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_DATA__MAIN_DESCRIPTION = PROCESS_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_DATA__PURPOSE = PROCESS_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_DATA__GUIDANCE = PROCESS_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_DATA__METRIC = PROCESS_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_DATA__CATEGORY = PROCESS_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_DATA__COPYRIGHT = PROCESS_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_DATA__AUTHOR = PROCESS_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_DATA__CHANGE_DATE = PROCESS_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_DATA__CHANGE_DESCRIPTION = PROCESS_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_DATA__VERSION = PROCESS_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_DATA__NAME = PROCESS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_DATA__PROCESS_KIND = PROCESS_ELEMENT__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_DATA__START_DATE = PROCESS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Finish Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_DATA__FINISH_DATE = PROCESS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_DATA__RANK = PROCESS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_DATA__DURATION = PROCESS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Planning Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_DATA_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.TaskUseImpl <em>Task Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.TaskUseImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getTaskUse()
	 * @generated
	 */
	int TASK_USE = 40;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__KIND = METHOD_CONTENT_USE__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__PRESENTATION_NAME = METHOD_CONTENT_USE__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__BRIEF_DESCRIPTION = METHOD_CONTENT_USE__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__MAIN_DESCRIPTION = METHOD_CONTENT_USE__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__PURPOSE = METHOD_CONTENT_USE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__GUIDANCE = METHOD_CONTENT_USE__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__METRIC = METHOD_CONTENT_USE__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__CATEGORY = METHOD_CONTENT_USE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__COPYRIGHT = METHOD_CONTENT_USE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__AUTHOR = METHOD_CONTENT_USE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__CHANGE_DATE = METHOD_CONTENT_USE__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__CHANGE_DESCRIPTION = METHOD_CONTENT_USE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__VERSION = METHOD_CONTENT_USE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__NAME = METHOD_CONTENT_USE__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__PROCESS_KIND = METHOD_CONTENT_USE__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__HAS_MULTIPLE_OCCURRENCES = METHOD_CONTENT_USE__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__IS_OPTIONAL = METHOD_CONTENT_USE__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__IS_PLANNED = METHOD_CONTENT_USE__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__PLANNING_DATA = METHOD_CONTENT_USE__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Is Synchronized With Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__IS_SYNCHRONIZED_WITH_SOURCE = METHOD_CONTENT_USE__IS_SYNCHRONIZED_WITH_SOURCE;

	/**
	 * The feature id for the '<em><b>Is Repeatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__IS_REPEATABLE = METHOD_CONTENT_USE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Ongoing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__IS_ONGOING = METHOD_CONTENT_USE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Event Driven</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__IS_EVENT_DRIVEN = METHOD_CONTENT_USE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Link To Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__LINK_TO_PREDECESSOR = METHOD_CONTENT_USE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Link To Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__LINK_TO_SUCCESSOR = METHOD_CONTENT_USE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__TASK = METHOD_CONTENT_USE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Used Qualification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__USED_QUALIFICATION = METHOD_CONTENT_USE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Selected Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__SELECTED_STEP = METHOD_CONTENT_USE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owned Process Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__OWNED_PROCESS_PARAMETER = METHOD_CONTENT_USE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__PRE_CONDITION = METHOD_CONTENT_USE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE__POST_CONDITION = METHOD_CONTENT_USE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Task Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_USE_FEATURE_COUNT = METHOD_CONTENT_USE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.CompositeRoleImpl <em>Composite Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.CompositeRoleImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getCompositeRole()
	 * @generated
	 */
	int COMPOSITE_ROLE = 41;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ROLE__KIND = ROLE_USE__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ROLE__PRESENTATION_NAME = ROLE_USE__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ROLE__BRIEF_DESCRIPTION = ROLE_USE__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ROLE__MAIN_DESCRIPTION = ROLE_USE__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ROLE__PURPOSE = ROLE_USE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ROLE__GUIDANCE = ROLE_USE__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ROLE__METRIC = ROLE_USE__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ROLE__CATEGORY = ROLE_USE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ROLE__COPYRIGHT = ROLE_USE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ROLE__AUTHOR = ROLE_USE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ROLE__CHANGE_DATE = ROLE_USE__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ROLE__CHANGE_DESCRIPTION = ROLE_USE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ROLE__VERSION = ROLE_USE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ROLE__NAME = ROLE_USE__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ROLE__PROCESS_KIND = ROLE_USE__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ROLE__HAS_MULTIPLE_OCCURRENCES = ROLE_USE__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ROLE__IS_OPTIONAL = ROLE_USE__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ROLE__IS_PLANNED = ROLE_USE__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ROLE__PLANNING_DATA = ROLE_USE__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Is Synchronized With Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ROLE__IS_SYNCHRONIZED_WITH_SOURCE = ROLE_USE__IS_SYNCHRONIZED_WITH_SOURCE;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ROLE__ROLE = ROLE_USE__ROLE;

	/**
	 * The feature id for the '<em><b>Applied Qualification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ROLE__APPLIED_QUALIFICATION = ROLE_USE__APPLIED_QUALIFICATION;

	/**
	 * The feature id for the '<em><b>Aggregated Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ROLE__AGGREGATED_ROLE = ROLE_USE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ROLE_FEATURE_COUNT = ROLE_USE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.TeamProfileImpl <em>Team Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.TeamProfileImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getTeamProfile()
	 * @generated
	 */
	int TEAM_PROFILE = 42;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_PROFILE__KIND = BREAKDOWN_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_PROFILE__PRESENTATION_NAME = BREAKDOWN_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_PROFILE__BRIEF_DESCRIPTION = BREAKDOWN_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_PROFILE__MAIN_DESCRIPTION = BREAKDOWN_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_PROFILE__PURPOSE = BREAKDOWN_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_PROFILE__GUIDANCE = BREAKDOWN_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_PROFILE__METRIC = BREAKDOWN_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_PROFILE__CATEGORY = BREAKDOWN_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_PROFILE__COPYRIGHT = BREAKDOWN_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_PROFILE__AUTHOR = BREAKDOWN_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_PROFILE__CHANGE_DATE = BREAKDOWN_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_PROFILE__CHANGE_DESCRIPTION = BREAKDOWN_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_PROFILE__VERSION = BREAKDOWN_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_PROFILE__NAME = BREAKDOWN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_PROFILE__PROCESS_KIND = BREAKDOWN_ELEMENT__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_PROFILE__HAS_MULTIPLE_OCCURRENCES = BREAKDOWN_ELEMENT__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_PROFILE__IS_OPTIONAL = BREAKDOWN_ELEMENT__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_PROFILE__IS_PLANNED = BREAKDOWN_ELEMENT__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_PROFILE__PLANNING_DATA = BREAKDOWN_ELEMENT__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Sub Team</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_PROFILE__SUB_TEAM = BREAKDOWN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Team</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_PROFILE__SUPER_TEAM = BREAKDOWN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Team Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_PROFILE__TEAM_ROLE = BREAKDOWN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Team Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_PROFILE_FEATURE_COUNT = BREAKDOWN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.VariabilityElementImpl <em>Variability Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.VariabilityElementImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getVariabilityElement()
	 * @generated
	 */
	int VARIABILITY_ELEMENT = 43;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_ELEMENT__VARIABILITY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Variability Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.ProcessComponentImpl <em>Process Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.ProcessComponentImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getProcessComponent()
	 * @generated
	 */
	int PROCESS_COMPONENT = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT__NAME = PROCESS_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Process Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT__OWNED_PROCESS_MEMBER = PROCESS_PACKAGE__OWNED_PROCESS_MEMBER;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT__PROCESS = PROCESS_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT__OWNED_PORT = PROCESS_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Process Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_FEATURE_COUNT = PROCESS_PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.ProcessComponentUseImpl <em>Process Component Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.ProcessComponentUseImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getProcessComponentUse()
	 * @generated
	 */
	int PROCESS_COMPONENT_USE = 45;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_USE__KIND = METHOD_CONTENT_USE__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_USE__PRESENTATION_NAME = METHOD_CONTENT_USE__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_USE__BRIEF_DESCRIPTION = METHOD_CONTENT_USE__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_USE__MAIN_DESCRIPTION = METHOD_CONTENT_USE__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_USE__PURPOSE = METHOD_CONTENT_USE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_USE__GUIDANCE = METHOD_CONTENT_USE__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_USE__METRIC = METHOD_CONTENT_USE__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_USE__CATEGORY = METHOD_CONTENT_USE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_USE__COPYRIGHT = METHOD_CONTENT_USE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_USE__AUTHOR = METHOD_CONTENT_USE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_USE__CHANGE_DATE = METHOD_CONTENT_USE__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_USE__CHANGE_DESCRIPTION = METHOD_CONTENT_USE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_USE__VERSION = METHOD_CONTENT_USE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_USE__NAME = METHOD_CONTENT_USE__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_USE__PROCESS_KIND = METHOD_CONTENT_USE__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_USE__HAS_MULTIPLE_OCCURRENCES = METHOD_CONTENT_USE__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_USE__IS_OPTIONAL = METHOD_CONTENT_USE__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_USE__IS_PLANNED = METHOD_CONTENT_USE__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_USE__PLANNING_DATA = METHOD_CONTENT_USE__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Is Synchronized With Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_USE__IS_SYNCHRONIZED_WITH_SOURCE = METHOD_CONTENT_USE__IS_SYNCHRONIZED_WITH_SOURCE;

	/**
	 * The feature id for the '<em><b>Process Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_USE__PROCESS_COMPONENT = METHOD_CONTENT_USE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Used Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_USE__USED_PORT = METHOD_CONTENT_USE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Process Component Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_USE_FEATURE_COUNT = METHOD_CONTENT_USE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.MethodLibraryPackageableElementImpl <em>Method Library Packageable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.MethodLibraryPackageableElementImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getMethodLibraryPackageableElement()
	 * @generated
	 */
	int METHOD_LIBRARY_PACKAGEABLE_ELEMENT = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LIBRARY_PACKAGEABLE_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Method Library Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LIBRARY_PACKAGEABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.MethodPluginPackageableElementImpl <em>Method Plugin Packageable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.MethodPluginPackageableElementImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getMethodPluginPackageableElement()
	 * @generated
	 */
	int METHOD_PLUGIN_PACKAGEABLE_ELEMENT = 47;

	/**
	 * The number of structural features of the '<em>Method Plugin Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PLUGIN_PACKAGEABLE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.MethodConfigurationImpl <em>Method Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.MethodConfigurationImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getMethodConfiguration()
	 * @generated
	 */
	int METHOD_CONFIGURATION = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONFIGURATION__NAME = METHOD_LIBRARY_PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Base Configuration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONFIGURATION__BASE_CONFIGURATION = METHOD_LIBRARY_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method Plugin Selection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONFIGURATION__METHOD_PLUGIN_SELECTION = METHOD_LIBRARY_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Process Package Selection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONFIGURATION__PROCESS_PACKAGE_SELECTION = METHOD_LIBRARY_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Content Package Selection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONFIGURATION__CONTENT_PACKAGE_SELECTION = METHOD_LIBRARY_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Substracted Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONFIGURATION__SUBSTRACTED_CATEGORY = METHOD_LIBRARY_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONFIGURATION__DEFAULT_VIEW = METHOD_LIBRARY_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Process View</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONFIGURATION__PROCESS_VIEW = METHOD_LIBRARY_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Method Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONFIGURATION_FEATURE_COUNT = METHOD_LIBRARY_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.MethodPluginImpl <em>Method Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.MethodPluginImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getMethodPlugin()
	 * @generated
	 */
	int METHOD_PLUGIN = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PLUGIN__NAME = METHOD_LIBRARY_PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Method Content Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE = METHOD_LIBRARY_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Process Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PLUGIN__OWNED_PROCESS_PACKAGE = METHOD_LIBRARY_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Plugin</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PLUGIN__BASE_PLUGIN = METHOD_LIBRARY_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Method Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PLUGIN_FEATURE_COUNT = METHOD_LIBRARY_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.MethodLibraryImpl <em>Method Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.MethodLibraryImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getMethodLibrary()
	 * @generated
	 */
	int METHOD_LIBRARY = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LIBRARY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned Method Plugin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LIBRARY__OWNED_METHOD_PLUGIN = 1;

	/**
	 * The feature id for the '<em><b>Predefined Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LIBRARY__PREDEFINED_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Configuration Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LIBRARY__CONFIGURATION_PACKAGE = 3;

	/**
	 * The number of structural features of the '<em>Method Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LIBRARY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.WorkProductPortImpl <em>Work Product Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.WorkProductPortImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkProductPort()
	 * @generated
	 */
	int WORK_PRODUCT_PORT = 51;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT__KIND = PROCESS_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT__PRESENTATION_NAME = PROCESS_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT__BRIEF_DESCRIPTION = PROCESS_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT__MAIN_DESCRIPTION = PROCESS_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT__PURPOSE = PROCESS_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT__GUIDANCE = PROCESS_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT__METRIC = PROCESS_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT__CATEGORY = PROCESS_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT__COPYRIGHT = PROCESS_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT__AUTHOR = PROCESS_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT__CHANGE_DATE = PROCESS_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT__CHANGE_DESCRIPTION = PROCESS_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT__VERSION = PROCESS_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT__NAME = PROCESS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT__PROCESS_KIND = PROCESS_ELEMENT__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT__IS_OPTIONAL = PROCESS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT__PORT_KIND = PROCESS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT__PORT_TYPE = PROCESS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Work Product Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.impl.WorkProductPortConnectorImpl <em>Work Product Port Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.impl.WorkProductPortConnectorImpl
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkProductPortConnector()
	 * @generated
	 */
	int WORK_PRODUCT_PORT_CONNECTOR = 52;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT_CONNECTOR__KIND = PROCESS_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT_CONNECTOR__PRESENTATION_NAME = PROCESS_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT_CONNECTOR__BRIEF_DESCRIPTION = PROCESS_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT_CONNECTOR__MAIN_DESCRIPTION = PROCESS_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT_CONNECTOR__PURPOSE = PROCESS_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT_CONNECTOR__GUIDANCE = PROCESS_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT_CONNECTOR__METRIC = PROCESS_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT_CONNECTOR__CATEGORY = PROCESS_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT_CONNECTOR__COPYRIGHT = PROCESS_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT_CONNECTOR__AUTHOR = PROCESS_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT_CONNECTOR__CHANGE_DATE = PROCESS_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT_CONNECTOR__CHANGE_DESCRIPTION = PROCESS_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT_CONNECTOR__VERSION = PROCESS_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT_CONNECTOR__NAME = PROCESS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT_CONNECTOR__PROCESS_KIND = PROCESS_ELEMENT__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Connected Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT_CONNECTOR__CONNECTED_PORT = PROCESS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Work Product Port Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_PORT_CONNECTOR_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.ParameterDirectionKind <em>Parameter Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.ParameterDirectionKind
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getParameterDirectionKind()
	 * @generated
	 */
	int PARAMETER_DIRECTION_KIND = 53;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.WorkSequenceKind <em>Work Sequence Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.WorkSequenceKind
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkSequenceKind()
	 * @generated
	 */
	int WORK_SEQUENCE_KIND = 54;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.ActivityUseKind <em>Activity Use Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.ActivityUseKind
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getActivityUseKind()
	 * @generated
	 */
	int ACTIVITY_USE_KIND = 55;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.OptionalityKind <em>Optionality Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.OptionalityKind
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getOptionalityKind()
	 * @generated
	 */
	int OPTIONALITY_KIND = 56;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.VariabilityType <em>Variability Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.VariabilityType
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getVariabilityType()
	 * @generated
	 */
	int VARIABILITY_TYPE = 57;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.WorkProductRelationshipKind <em>Work Product Relationship Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.WorkProductRelationshipKind
	 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkProductRelationshipKind()
	 * @generated
	 */
	int WORK_PRODUCT_RELATIONSHIP_KIND = 58;


	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.ExtensibleElement <em>Extensible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extensible Element</em>'.
	 * @see org.obeonetwork.dsl.spem.ExtensibleElement
	 * @generated
	 */
	EClass getExtensibleElement();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.ExtensibleElement#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Kind</em>'.
	 * @see org.obeonetwork.dsl.spem.ExtensibleElement#getKind()
	 * @see #getExtensibleElement()
	 * @generated
	 */
	EReference getExtensibleElement_Kind();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.Kind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kind</em>'.
	 * @see org.obeonetwork.dsl.spem.Kind
	 * @generated
	 */
	EClass getKind();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.WorkDefinitionPerformer <em>Work Definition Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Definition Performer</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkDefinitionPerformer
	 * @generated
	 */
	EClass getWorkDefinitionPerformer();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.WorkDefinitionPerformer#getLinkedWorkDefinition <em>Linked Work Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked Work Definition</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkDefinitionPerformer#getLinkedWorkDefinition()
	 * @see #getWorkDefinitionPerformer()
	 * @generated
	 */
	EReference getWorkDefinitionPerformer_LinkedWorkDefinition();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.WorkDefinition <em>Work Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Definition</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkDefinition
	 * @generated
	 */
	EClass getWorkDefinition();

	/**
	 * Returns the meta object for the attribute list '{@link org.obeonetwork.dsl.spem.WorkDefinition#getPreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Pre Condition</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkDefinition#getPreCondition()
	 * @see #getWorkDefinition()
	 * @generated
	 */
	EAttribute getWorkDefinition_PreCondition();

	/**
	 * Returns the meta object for the attribute list '{@link org.obeonetwork.dsl.spem.WorkDefinition#getPostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Post Condition</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkDefinition#getPostCondition()
	 * @see #getWorkDefinition()
	 * @generated
	 */
	EAttribute getWorkDefinition_PostCondition();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.WorkDefinition#getOwnedParameter <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Parameter</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkDefinition#getOwnedParameter()
	 * @see #getWorkDefinition()
	 * @generated
	 */
	EReference getWorkDefinition_OwnedParameter();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.WorkDefinitionParameter <em>Work Definition Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Definition Parameter</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkDefinitionParameter
	 * @generated
	 */
	EClass getWorkDefinitionParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.WorkDefinitionParameter#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkDefinitionParameter#getDirection()
	 * @see #getWorkDefinitionParameter()
	 * @generated
	 */
	EAttribute getWorkDefinitionParameter_Direction();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.BreakdownElement <em>Breakdown Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Breakdown Element</em>'.
	 * @see org.obeonetwork.dsl.spem.BreakdownElement
	 * @generated
	 */
	EClass getBreakdownElement();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.BreakdownElement#isHasMultipleOccurrences <em>Has Multiple Occurrences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Multiple Occurrences</em>'.
	 * @see org.obeonetwork.dsl.spem.BreakdownElement#isHasMultipleOccurrences()
	 * @see #getBreakdownElement()
	 * @generated
	 */
	EAttribute getBreakdownElement_HasMultipleOccurrences();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.BreakdownElement#isIsOptional <em>Is Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Optional</em>'.
	 * @see org.obeonetwork.dsl.spem.BreakdownElement#isIsOptional()
	 * @see #getBreakdownElement()
	 * @generated
	 */
	EAttribute getBreakdownElement_IsOptional();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.BreakdownElement#isIsPlanned <em>Is Planned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Planned</em>'.
	 * @see org.obeonetwork.dsl.spem.BreakdownElement#isIsPlanned()
	 * @see #getBreakdownElement()
	 * @generated
	 */
	EAttribute getBreakdownElement_IsPlanned();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.spem.BreakdownElement#getPlanningData <em>Planning Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Planning Data</em>'.
	 * @see org.obeonetwork.dsl.spem.BreakdownElement#getPlanningData()
	 * @see #getBreakdownElement()
	 * @generated
	 */
	EReference getBreakdownElement_PlanningData();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.WorkBreakdownElement <em>Work Breakdown Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Breakdown Element</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkBreakdownElement
	 * @generated
	 */
	EClass getWorkBreakdownElement();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.WorkBreakdownElement#isIsRepeatable <em>Is Repeatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Repeatable</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkBreakdownElement#isIsRepeatable()
	 * @see #getWorkBreakdownElement()
	 * @generated
	 */
	EAttribute getWorkBreakdownElement_IsRepeatable();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.WorkBreakdownElement#isIsOngoing <em>Is Ongoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ongoing</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkBreakdownElement#isIsOngoing()
	 * @see #getWorkBreakdownElement()
	 * @generated
	 */
	EAttribute getWorkBreakdownElement_IsOngoing();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.WorkBreakdownElement#isIsEventDriven <em>Is Event Driven</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Event Driven</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkBreakdownElement#isIsEventDriven()
	 * @see #getWorkBreakdownElement()
	 * @generated
	 */
	EAttribute getWorkBreakdownElement_IsEventDriven();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.WorkBreakdownElement#getLinkToPredecessor <em>Link To Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Link To Predecessor</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkBreakdownElement#getLinkToPredecessor()
	 * @see #getWorkBreakdownElement()
	 * @generated
	 */
	EReference getWorkBreakdownElement_LinkToPredecessor();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.WorkBreakdownElement#getLinkToSuccessor <em>Link To Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Link To Successor</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkBreakdownElement#getLinkToSuccessor()
	 * @see #getWorkBreakdownElement()
	 * @generated
	 */
	EReference getWorkBreakdownElement_LinkToSuccessor();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.WorkSequence <em>Work Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Sequence</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkSequence
	 * @generated
	 */
	EClass getWorkSequence();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.WorkSequence#getLinkKind <em>Link Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Kind</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkSequence#getLinkKind()
	 * @see #getWorkSequence()
	 * @generated
	 */
	EAttribute getWorkSequence_LinkKind();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.WorkSequence#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predecessor</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkSequence#getPredecessor()
	 * @see #getWorkSequence()
	 * @generated
	 */
	EReference getWorkSequence_Predecessor();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.WorkSequence#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Successor</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkSequence#getSuccessor()
	 * @see #getWorkSequence()
	 * @generated
	 */
	EReference getWorkSequence_Successor();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.obeonetwork.dsl.spem.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.Activity#getUseKind <em>Use Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Kind</em>'.
	 * @see org.obeonetwork.dsl.spem.Activity#getUseKind()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_UseKind();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.Activity#getUsedActivity <em>Used Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Used Activity</em>'.
	 * @see org.obeonetwork.dsl.spem.Activity#getUsedActivity()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_UsedActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.spem.Activity#getNestedBreakdownElement <em>Nested Breakdown Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Breakdown Element</em>'.
	 * @see org.obeonetwork.dsl.spem.Activity#getNestedBreakdownElement()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_NestedBreakdownElement();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.Activity#getSuppressedBreakdownElement <em>Suppressed Breakdown Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Suppressed Breakdown Element</em>'.
	 * @see org.obeonetwork.dsl.spem.Activity#getSuppressedBreakdownElement()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_SuppressedBreakdownElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.spem.Activity#getOwnedProcessParameter <em>Owned Process Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Process Parameter</em>'.
	 * @see org.obeonetwork.dsl.spem.Activity#getOwnedProcessParameter()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_OwnedProcessParameter();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.Activity#getDefaultContext <em>Default Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Context</em>'.
	 * @see org.obeonetwork.dsl.spem.Activity#getDefaultContext()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_DefaultContext();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.Activity#getValidContext <em>Valid Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Valid Context</em>'.
	 * @see org.obeonetwork.dsl.spem.Activity#getValidContext()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_ValidContext();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.Activity#isIsEnactable <em>Is Enactable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Enactable</em>'.
	 * @see org.obeonetwork.dsl.spem.Activity#isIsEnactable()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_IsEnactable();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.ProcessPerformer <em>Process Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Performer</em>'.
	 * @see org.obeonetwork.dsl.spem.ProcessPerformer
	 * @generated
	 */
	EClass getProcessPerformer();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.ProcessPerformer#getLinkedRoleUse <em>Linked Role Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Role Use</em>'.
	 * @see org.obeonetwork.dsl.spem.ProcessPerformer#getLinkedRoleUse()
	 * @see #getProcessPerformer()
	 * @generated
	 */
	EReference getProcessPerformer_LinkedRoleUse();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.ProcessPerformer#getLinkedActivity <em>Linked Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked Activity</em>'.
	 * @see org.obeonetwork.dsl.spem.ProcessPerformer#getLinkedActivity()
	 * @see #getProcessPerformer()
	 * @generated
	 */
	EReference getProcessPerformer_LinkedActivity();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.ProcessPerformer#getLinkedTaskUse <em>Linked Task Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked Task Use</em>'.
	 * @see org.obeonetwork.dsl.spem.ProcessPerformer#getLinkedTaskUse()
	 * @see #getProcessPerformer()
	 * @generated
	 */
	EReference getProcessPerformer_LinkedTaskUse();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.RoleUse <em>Role Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Use</em>'.
	 * @see org.obeonetwork.dsl.spem.RoleUse
	 * @generated
	 */
	EClass getRoleUse();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.RoleUse#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see org.obeonetwork.dsl.spem.RoleUse#getRole()
	 * @see #getRoleUse()
	 * @generated
	 */
	EReference getRoleUse_Role();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.RoleUse#getAppliedQualification <em>Applied Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applied Qualification</em>'.
	 * @see org.obeonetwork.dsl.spem.RoleUse#getAppliedQualification()
	 * @see #getRoleUse()
	 * @generated
	 */
	EReference getRoleUse_AppliedQualification();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.ProcessResponsibilityAssignment <em>Process Responsibility Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Responsibility Assignment</em>'.
	 * @see org.obeonetwork.dsl.spem.ProcessResponsibilityAssignment
	 * @generated
	 */
	EClass getProcessResponsibilityAssignment();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.ProcessResponsibilityAssignment#getLinkedRoleUse <em>Linked Role Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Role Use</em>'.
	 * @see org.obeonetwork.dsl.spem.ProcessResponsibilityAssignment#getLinkedRoleUse()
	 * @see #getProcessResponsibilityAssignment()
	 * @generated
	 */
	EReference getProcessResponsibilityAssignment_LinkedRoleUse();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.ProcessResponsibilityAssignment#getLinkedWorkProductUse <em>Linked Work Product Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked Work Product Use</em>'.
	 * @see org.obeonetwork.dsl.spem.ProcessResponsibilityAssignment#getLinkedWorkProductUse()
	 * @see #getProcessResponsibilityAssignment()
	 * @generated
	 */
	EReference getProcessResponsibilityAssignment_LinkedWorkProductUse();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.WorkProductUse <em>Work Product Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Product Use</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkProductUse
	 * @generated
	 */
	EClass getWorkProductUse();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.WorkProductUse#getWorkProduct <em>Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Product</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkProductUse#getWorkProduct()
	 * @see #getWorkProductUse()
	 * @generated
	 */
	EReference getWorkProductUse_WorkProduct();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.WorkProductUseRelationship <em>Work Product Use Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Product Use Relationship</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkProductUseRelationship
	 * @generated
	 */
	EClass getWorkProductUseRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.WorkProductUseRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkProductUseRelationship#getSource()
	 * @see #getWorkProductUseRelationship()
	 * @generated
	 */
	EReference getWorkProductUseRelationship_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.WorkProductUseRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkProductUseRelationship#getTarget()
	 * @see #getWorkProductUseRelationship()
	 * @generated
	 */
	EReference getWorkProductUseRelationship_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.WorkProductUseRelationship#getRelationshipKind <em>Relationship Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Kind</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkProductUseRelationship#getRelationshipKind()
	 * @see #getWorkProductUseRelationship()
	 * @generated
	 */
	EAttribute getWorkProductUseRelationship_RelationshipKind();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.ProcessParameter <em>Process Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Parameter</em>'.
	 * @see org.obeonetwork.dsl.spem.ProcessParameter
	 * @generated
	 */
	EClass getProcessParameter();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.ProcessParameter#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Type</em>'.
	 * @see org.obeonetwork.dsl.spem.ProcessParameter#getParameterType()
	 * @see #getProcessParameter()
	 * @generated
	 */
	EReference getProcessParameter_ParameterType();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.ProcessParameter#getOptionality <em>Optionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optionality</em>'.
	 * @see org.obeonetwork.dsl.spem.ProcessParameter#getOptionality()
	 * @see #getProcessParameter()
	 * @generated
	 */
	EAttribute getProcessParameter_Optionality();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.Milestone <em>Milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Milestone</em>'.
	 * @see org.obeonetwork.dsl.spem.Milestone
	 * @generated
	 */
	EClass getMilestone();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.Milestone#getRequiredResult <em>Required Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Result</em>'.
	 * @see org.obeonetwork.dsl.spem.Milestone#getRequiredResult()
	 * @see #getMilestone()
	 * @generated
	 */
	EReference getMilestone_RequiredResult();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.ProcessElement <em>Process Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Element</em>'.
	 * @see org.obeonetwork.dsl.spem.ProcessElement
	 * @generated
	 */
	EClass getProcessElement();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.ProcessElement#getProcessKind <em>Process Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process Kind</em>'.
	 * @see org.obeonetwork.dsl.spem.ProcessElement#getProcessKind()
	 * @see #getProcessElement()
	 * @generated
	 */
	EReference getProcessElement_ProcessKind();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.DescribableElement <em>Describable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Describable Element</em>'.
	 * @see org.obeonetwork.dsl.spem.DescribableElement
	 * @generated
	 */
	EClass getDescribableElement();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.DescribableElement#getPresentationName <em>Presentation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation Name</em>'.
	 * @see org.obeonetwork.dsl.spem.DescribableElement#getPresentationName()
	 * @see #getDescribableElement()
	 * @generated
	 */
	EAttribute getDescribableElement_PresentationName();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.DescribableElement#getBriefDescription <em>Brief Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brief Description</em>'.
	 * @see org.obeonetwork.dsl.spem.DescribableElement#getBriefDescription()
	 * @see #getDescribableElement()
	 * @generated
	 */
	EAttribute getDescribableElement_BriefDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.DescribableElement#getMainDescription <em>Main Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Description</em>'.
	 * @see org.obeonetwork.dsl.spem.DescribableElement#getMainDescription()
	 * @see #getDescribableElement()
	 * @generated
	 */
	EAttribute getDescribableElement_MainDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.DescribableElement#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see org.obeonetwork.dsl.spem.DescribableElement#getPurpose()
	 * @see #getDescribableElement()
	 * @generated
	 */
	EAttribute getDescribableElement_Purpose();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.DescribableElement#getGuidance <em>Guidance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guidance</em>'.
	 * @see org.obeonetwork.dsl.spem.DescribableElement#getGuidance()
	 * @see #getDescribableElement()
	 * @generated
	 */
	EReference getDescribableElement_Guidance();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.DescribableElement#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Metric</em>'.
	 * @see org.obeonetwork.dsl.spem.DescribableElement#getMetric()
	 * @see #getDescribableElement()
	 * @generated
	 */
	EReference getDescribableElement_Metric();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.DescribableElement#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category</em>'.
	 * @see org.obeonetwork.dsl.spem.DescribableElement#getCategory()
	 * @see #getDescribableElement()
	 * @generated
	 */
	EReference getDescribableElement_Category();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.DescribableElement#getCopyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copyright</em>'.
	 * @see org.obeonetwork.dsl.spem.DescribableElement#getCopyright()
	 * @see #getDescribableElement()
	 * @generated
	 */
	EAttribute getDescribableElement_Copyright();

	/**
	 * Returns the meta object for the attribute list '{@link org.obeonetwork.dsl.spem.DescribableElement#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Author</em>'.
	 * @see org.obeonetwork.dsl.spem.DescribableElement#getAuthor()
	 * @see #getDescribableElement()
	 * @generated
	 */
	EAttribute getDescribableElement_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.DescribableElement#getChangeDate <em>Change Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Date</em>'.
	 * @see org.obeonetwork.dsl.spem.DescribableElement#getChangeDate()
	 * @see #getDescribableElement()
	 * @generated
	 */
	EAttribute getDescribableElement_ChangeDate();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.DescribableElement#getChangeDescription <em>Change Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Description</em>'.
	 * @see org.obeonetwork.dsl.spem.DescribableElement#getChangeDescription()
	 * @see #getDescribableElement()
	 * @generated
	 */
	EAttribute getDescribableElement_ChangeDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.DescribableElement#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.obeonetwork.dsl.spem.DescribableElement#getVersion()
	 * @see #getDescribableElement()
	 * @generated
	 */
	EAttribute getDescribableElement_Version();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.obeonetwork.dsl.spem.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.Category#getSubCategory <em>Sub Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Category</em>'.
	 * @see org.obeonetwork.dsl.spem.Category#getSubCategory()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_SubCategory();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.Category#getCategorizedElement <em>Categorized Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Categorized Element</em>'.
	 * @see org.obeonetwork.dsl.spem.Category#getCategorizedElement()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_CategorizedElement();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.Guidance <em>Guidance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guidance</em>'.
	 * @see org.obeonetwork.dsl.spem.Guidance
	 * @generated
	 */
	EClass getGuidance();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see org.obeonetwork.dsl.spem.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.Metric#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.obeonetwork.dsl.spem.Metric#getExpression()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Expression();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.MethodContentElement <em>Method Content Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Content Element</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodContentElement
	 * @generated
	 */
	EClass getMethodContentElement();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.MethodContentElement#getMethodContentKind <em>Method Content Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method Content Kind</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodContentElement#getMethodContentKind()
	 * @see #getMethodContentElement()
	 * @generated
	 */
	EReference getMethodContentElement_MethodContentKind();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.ToolDefinition <em>Tool Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Definition</em>'.
	 * @see org.obeonetwork.dsl.spem.ToolDefinition
	 * @generated
	 */
	EClass getToolDefinition();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.ToolDefinition#getManagedWorkProduct <em>Managed Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Managed Work Product</em>'.
	 * @see org.obeonetwork.dsl.spem.ToolDefinition#getManagedWorkProduct()
	 * @see #getToolDefinition()
	 * @generated
	 */
	EReference getToolDefinition_ManagedWorkProduct();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.TaskDefinition <em>Task Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Definition</em>'.
	 * @see org.obeonetwork.dsl.spem.TaskDefinition
	 * @generated
	 */
	EClass getTaskDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.spem.TaskDefinition#getOwnedTaskDefinitionParameter <em>Owned Task Definition Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Task Definition Parameter</em>'.
	 * @see org.obeonetwork.dsl.spem.TaskDefinition#getOwnedTaskDefinitionParameter()
	 * @see #getTaskDefinition()
	 * @generated
	 */
	EReference getTaskDefinition_OwnedTaskDefinitionParameter();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.TaskDefinition#getUsedTool <em>Used Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Tool</em>'.
	 * @see org.obeonetwork.dsl.spem.TaskDefinition#getUsedTool()
	 * @see #getTaskDefinition()
	 * @generated
	 */
	EReference getTaskDefinition_UsedTool();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.spem.TaskDefinition#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see org.obeonetwork.dsl.spem.TaskDefinition#getStep()
	 * @see #getTaskDefinition()
	 * @generated
	 */
	EReference getTaskDefinition_Step();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.TaskDefinition#getRequiredQualification <em>Required Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Qualification</em>'.
	 * @see org.obeonetwork.dsl.spem.TaskDefinition#getRequiredQualification()
	 * @see #getTaskDefinition()
	 * @generated
	 */
	EReference getTaskDefinition_RequiredQualification();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see org.obeonetwork.dsl.spem.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.Step#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.spem.Step#getName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Name();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.Step#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predecessor</em>'.
	 * @see org.obeonetwork.dsl.spem.Step#getPredecessor()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Predecessor();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.Step#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Successor</em>'.
	 * @see org.obeonetwork.dsl.spem.Step#getSuccessor()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Successor();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.WorkProductDefinition <em>Work Product Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Product Definition</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkProductDefinition
	 * @generated
	 */
	EClass getWorkProductDefinition();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.RoleDefinition <em>Role Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Definition</em>'.
	 * @see org.obeonetwork.dsl.spem.RoleDefinition
	 * @generated
	 */
	EClass getRoleDefinition();

	/**
	 * Returns the meta object for the attribute list '{@link org.obeonetwork.dsl.spem.RoleDefinition#getSynonym <em>Synonym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Synonym</em>'.
	 * @see org.obeonetwork.dsl.spem.RoleDefinition#getSynonym()
	 * @see #getRoleDefinition()
	 * @generated
	 */
	EAttribute getRoleDefinition_Synonym();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.RoleDefinition#getProvidedQualification <em>Provided Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Qualification</em>'.
	 * @see org.obeonetwork.dsl.spem.RoleDefinition#getProvidedQualification()
	 * @see #getRoleDefinition()
	 * @generated
	 */
	EReference getRoleDefinition_ProvidedQualification();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.WorkProductDefinitionRelationship <em>Work Product Definition Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Product Definition Relationship</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkProductDefinitionRelationship
	 * @generated
	 */
	EClass getWorkProductDefinitionRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.WorkProductDefinitionRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkProductDefinitionRelationship#getSource()
	 * @see #getWorkProductDefinitionRelationship()
	 * @generated
	 */
	EReference getWorkProductDefinitionRelationship_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.WorkProductDefinitionRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkProductDefinitionRelationship#getTarget()
	 * @see #getWorkProductDefinitionRelationship()
	 * @generated
	 */
	EReference getWorkProductDefinitionRelationship_Target();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.Default_TaskDefinitionPerformer <em>Default Task Definition Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Task Definition Performer</em>'.
	 * @see org.obeonetwork.dsl.spem.Default_TaskDefinitionPerformer
	 * @generated
	 */
	EClass getDefault_TaskDefinitionPerformer();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.Default_TaskDefinitionPerformer#getLinkedTaskDefinition <em>Linked Task Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked Task Definition</em>'.
	 * @see org.obeonetwork.dsl.spem.Default_TaskDefinitionPerformer#getLinkedTaskDefinition()
	 * @see #getDefault_TaskDefinitionPerformer()
	 * @generated
	 */
	EReference getDefault_TaskDefinitionPerformer_LinkedTaskDefinition();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.Default_TaskDefinitionPerformer#getLinkedRoleDefinition <em>Linked Role Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Role Definition</em>'.
	 * @see org.obeonetwork.dsl.spem.Default_TaskDefinitionPerformer#getLinkedRoleDefinition()
	 * @see #getDefault_TaskDefinitionPerformer()
	 * @generated
	 */
	EReference getDefault_TaskDefinitionPerformer_LinkedRoleDefinition();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.Default_ResponsibilityAssignment <em>Default Responsibility Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Responsibility Assignment</em>'.
	 * @see org.obeonetwork.dsl.spem.Default_ResponsibilityAssignment
	 * @generated
	 */
	EClass getDefault_ResponsibilityAssignment();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.Default_ResponsibilityAssignment#getLinkedRoleDefinition <em>Linked Role Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Role Definition</em>'.
	 * @see org.obeonetwork.dsl.spem.Default_ResponsibilityAssignment#getLinkedRoleDefinition()
	 * @see #getDefault_ResponsibilityAssignment()
	 * @generated
	 */
	EReference getDefault_ResponsibilityAssignment_LinkedRoleDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.Default_ResponsibilityAssignment#getLinkedWorkProductDefinition <em>Linked Work Product Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked Work Product Definition</em>'.
	 * @see org.obeonetwork.dsl.spem.Default_ResponsibilityAssignment#getLinkedWorkProductDefinition()
	 * @see #getDefault_ResponsibilityAssignment()
	 * @generated
	 */
	EReference getDefault_ResponsibilityAssignment_LinkedWorkProductDefinition();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.Default_TaskDefinitionParameter <em>Default Task Definition Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Task Definition Parameter</em>'.
	 * @see org.obeonetwork.dsl.spem.Default_TaskDefinitionParameter
	 * @generated
	 */
	EClass getDefault_TaskDefinitionParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.Default_TaskDefinitionParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.spem.Default_TaskDefinitionParameter#getName()
	 * @see #getDefault_TaskDefinitionParameter()
	 * @generated
	 */
	EAttribute getDefault_TaskDefinitionParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.Default_TaskDefinitionParameter#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Type</em>'.
	 * @see org.obeonetwork.dsl.spem.Default_TaskDefinitionParameter#getParameterType()
	 * @see #getDefault_TaskDefinitionParameter()
	 * @generated
	 */
	EReference getDefault_TaskDefinitionParameter_ParameterType();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.Default_TaskDefinitionParameter#getOptionality <em>Optionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optionality</em>'.
	 * @see org.obeonetwork.dsl.spem.Default_TaskDefinitionParameter#getOptionality()
	 * @see #getDefault_TaskDefinitionParameter()
	 * @generated
	 */
	EAttribute getDefault_TaskDefinitionParameter_Optionality();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.Qualification <em>Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualification</em>'.
	 * @see org.obeonetwork.dsl.spem.Qualification
	 * @generated
	 */
	EClass getQualification();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.MethodContentPackageableElement <em>Method Content Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Content Packageable Element</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodContentPackageableElement
	 * @generated
	 */
	EClass getMethodContentPackageableElement();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.MethodContentPackageableElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodContentPackageableElement#getName()
	 * @see #getMethodContentPackageableElement()
	 * @generated
	 */
	EAttribute getMethodContentPackageableElement_Name();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.ProcessPackageableElement <em>Process Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Packageable Element</em>'.
	 * @see org.obeonetwork.dsl.spem.ProcessPackageableElement
	 * @generated
	 */
	EClass getProcessPackageableElement();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.ProcessPackageableElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.spem.ProcessPackageableElement#getName()
	 * @see #getProcessPackageableElement()
	 * @generated
	 */
	EAttribute getProcessPackageableElement_Name();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.MethodContentPackage <em>Method Content Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Content Package</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodContentPackage
	 * @generated
	 */
	EClass getMethodContentPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.spem.MethodContentPackage#getOwnedMethodContentMember <em>Owned Method Content Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Method Content Member</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodContentPackage#getOwnedMethodContentMember()
	 * @see #getMethodContentPackage()
	 * @generated
	 */
	EReference getMethodContentPackage_OwnedMethodContentMember();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.MethodContentPackage#getReusedPackage <em>Reused Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reused Package</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodContentPackage#getReusedPackage()
	 * @see #getMethodContentPackage()
	 * @generated
	 */
	EReference getMethodContentPackage_ReusedPackage();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.ProcessPackage <em>Process Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Package</em>'.
	 * @see org.obeonetwork.dsl.spem.ProcessPackage
	 * @generated
	 */
	EClass getProcessPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.spem.ProcessPackage#getOwnedProcessMember <em>Owned Process Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Process Member</em>'.
	 * @see org.obeonetwork.dsl.spem.ProcessPackage#getOwnedProcessMember()
	 * @see #getProcessPackage()
	 * @generated
	 */
	EReference getProcessPackage_OwnedProcessMember();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.MethodContentKind <em>Method Content Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Content Kind</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodContentKind
	 * @generated
	 */
	EClass getMethodContentKind();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.ProcessKind <em>Process Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Kind</em>'.
	 * @see org.obeonetwork.dsl.spem.ProcessKind
	 * @generated
	 */
	EClass getProcessKind();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.PlanningData <em>Planning Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planning Data</em>'.
	 * @see org.obeonetwork.dsl.spem.PlanningData
	 * @generated
	 */
	EClass getPlanningData();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.PlanningData#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.obeonetwork.dsl.spem.PlanningData#getStartDate()
	 * @see #getPlanningData()
	 * @generated
	 */
	EAttribute getPlanningData_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.PlanningData#getFinishDate <em>Finish Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finish Date</em>'.
	 * @see org.obeonetwork.dsl.spem.PlanningData#getFinishDate()
	 * @see #getPlanningData()
	 * @generated
	 */
	EAttribute getPlanningData_FinishDate();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.PlanningData#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see org.obeonetwork.dsl.spem.PlanningData#getRank()
	 * @see #getPlanningData()
	 * @generated
	 */
	EAttribute getPlanningData_Rank();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.PlanningData#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.obeonetwork.dsl.spem.PlanningData#getDuration()
	 * @see #getPlanningData()
	 * @generated
	 */
	EAttribute getPlanningData_Duration();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.MethodContentUse <em>Method Content Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Content Use</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodContentUse
	 * @generated
	 */
	EClass getMethodContentUse();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.MethodContentUse#isIsSynchronizedWithSource <em>Is Synchronized With Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Synchronized With Source</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodContentUse#isIsSynchronizedWithSource()
	 * @see #getMethodContentUse()
	 * @generated
	 */
	EAttribute getMethodContentUse_IsSynchronizedWithSource();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.TaskUse <em>Task Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Use</em>'.
	 * @see org.obeonetwork.dsl.spem.TaskUse
	 * @generated
	 */
	EClass getTaskUse();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.TaskUse#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see org.obeonetwork.dsl.spem.TaskUse#getTask()
	 * @see #getTaskUse()
	 * @generated
	 */
	EReference getTaskUse_Task();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.TaskUse#getUsedQualification <em>Used Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Qualification</em>'.
	 * @see org.obeonetwork.dsl.spem.TaskUse#getUsedQualification()
	 * @see #getTaskUse()
	 * @generated
	 */
	EReference getTaskUse_UsedQualification();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.TaskUse#getSelectedStep <em>Selected Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selected Step</em>'.
	 * @see org.obeonetwork.dsl.spem.TaskUse#getSelectedStep()
	 * @see #getTaskUse()
	 * @generated
	 */
	EReference getTaskUse_SelectedStep();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.spem.TaskUse#getOwnedProcessParameter <em>Owned Process Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Process Parameter</em>'.
	 * @see org.obeonetwork.dsl.spem.TaskUse#getOwnedProcessParameter()
	 * @see #getTaskUse()
	 * @generated
	 */
	EReference getTaskUse_OwnedProcessParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.TaskUse#getPreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre Condition</em>'.
	 * @see org.obeonetwork.dsl.spem.TaskUse#getPreCondition()
	 * @see #getTaskUse()
	 * @generated
	 */
	EAttribute getTaskUse_PreCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.TaskUse#getPostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post Condition</em>'.
	 * @see org.obeonetwork.dsl.spem.TaskUse#getPostCondition()
	 * @see #getTaskUse()
	 * @generated
	 */
	EAttribute getTaskUse_PostCondition();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.CompositeRole <em>Composite Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Role</em>'.
	 * @see org.obeonetwork.dsl.spem.CompositeRole
	 * @generated
	 */
	EClass getCompositeRole();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.CompositeRole#getAggregatedRole <em>Aggregated Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aggregated Role</em>'.
	 * @see org.obeonetwork.dsl.spem.CompositeRole#getAggregatedRole()
	 * @see #getCompositeRole()
	 * @generated
	 */
	EReference getCompositeRole_AggregatedRole();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.TeamProfile <em>Team Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team Profile</em>'.
	 * @see org.obeonetwork.dsl.spem.TeamProfile
	 * @generated
	 */
	EClass getTeamProfile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.spem.TeamProfile#getSubTeam <em>Sub Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Team</em>'.
	 * @see org.obeonetwork.dsl.spem.TeamProfile#getSubTeam()
	 * @see #getTeamProfile()
	 * @generated
	 */
	EReference getTeamProfile_SubTeam();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.spem.TeamProfile#getSuperTeam <em>Super Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Super Team</em>'.
	 * @see org.obeonetwork.dsl.spem.TeamProfile#getSuperTeam()
	 * @see #getTeamProfile()
	 * @generated
	 */
	EReference getTeamProfile_SuperTeam();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.TeamProfile#getTeamRole <em>Team Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Team Role</em>'.
	 * @see org.obeonetwork.dsl.spem.TeamProfile#getTeamRole()
	 * @see #getTeamProfile()
	 * @generated
	 */
	EReference getTeamProfile_TeamRole();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.VariabilityElement <em>Variability Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variability Element</em>'.
	 * @see org.obeonetwork.dsl.spem.VariabilityElement
	 * @generated
	 */
	EClass getVariabilityElement();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.VariabilityElement#getVariabilityType <em>Variability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variability Type</em>'.
	 * @see org.obeonetwork.dsl.spem.VariabilityElement#getVariabilityType()
	 * @see #getVariabilityElement()
	 * @generated
	 */
	EAttribute getVariabilityElement_VariabilityType();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.VariabilityElement#getVariabilityBasedOnElement <em>Variability Based On Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variability Based On Element</em>'.
	 * @see org.obeonetwork.dsl.spem.VariabilityElement#getVariabilityBasedOnElement()
	 * @see #getVariabilityElement()
	 * @generated
	 */
	EReference getVariabilityElement_VariabilityBasedOnElement();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.ProcessComponent <em>Process Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Component</em>'.
	 * @see org.obeonetwork.dsl.spem.ProcessComponent
	 * @generated
	 */
	EClass getProcessComponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.spem.ProcessComponent#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process</em>'.
	 * @see org.obeonetwork.dsl.spem.ProcessComponent#getProcess()
	 * @see #getProcessComponent()
	 * @generated
	 */
	EReference getProcessComponent_Process();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.spem.ProcessComponent#getOwnedPort <em>Owned Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Port</em>'.
	 * @see org.obeonetwork.dsl.spem.ProcessComponent#getOwnedPort()
	 * @see #getProcessComponent()
	 * @generated
	 */
	EReference getProcessComponent_OwnedPort();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.ProcessComponentUse <em>Process Component Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Component Use</em>'.
	 * @see org.obeonetwork.dsl.spem.ProcessComponentUse
	 * @generated
	 */
	EClass getProcessComponentUse();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.ProcessComponentUse#getProcessComponent <em>Process Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process Component</em>'.
	 * @see org.obeonetwork.dsl.spem.ProcessComponentUse#getProcessComponent()
	 * @see #getProcessComponentUse()
	 * @generated
	 */
	EReference getProcessComponentUse_ProcessComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.spem.ProcessComponentUse#getUsedPort <em>Used Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Used Port</em>'.
	 * @see org.obeonetwork.dsl.spem.ProcessComponentUse#getUsedPort()
	 * @see #getProcessComponentUse()
	 * @generated
	 */
	EReference getProcessComponentUse_UsedPort();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.MethodLibraryPackageableElement <em>Method Library Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Library Packageable Element</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodLibraryPackageableElement
	 * @generated
	 */
	EClass getMethodLibraryPackageableElement();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.MethodLibraryPackageableElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodLibraryPackageableElement#getName()
	 * @see #getMethodLibraryPackageableElement()
	 * @generated
	 */
	EAttribute getMethodLibraryPackageableElement_Name();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.MethodPluginPackageableElement <em>Method Plugin Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Plugin Packageable Element</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodPluginPackageableElement
	 * @generated
	 */
	EClass getMethodPluginPackageableElement();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.MethodConfiguration <em>Method Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Configuration</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodConfiguration
	 * @generated
	 */
	EClass getMethodConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.MethodConfiguration#getBaseConfiguration <em>Base Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Configuration</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodConfiguration#getBaseConfiguration()
	 * @see #getMethodConfiguration()
	 * @generated
	 */
	EReference getMethodConfiguration_BaseConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.MethodConfiguration#getMethodPluginSelection <em>Method Plugin Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Method Plugin Selection</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodConfiguration#getMethodPluginSelection()
	 * @see #getMethodConfiguration()
	 * @generated
	 */
	EReference getMethodConfiguration_MethodPluginSelection();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.MethodConfiguration#getProcessPackageSelection <em>Process Package Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Process Package Selection</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodConfiguration#getProcessPackageSelection()
	 * @see #getMethodConfiguration()
	 * @generated
	 */
	EReference getMethodConfiguration_ProcessPackageSelection();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.MethodConfiguration#getContentPackageSelection <em>Content Package Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Content Package Selection</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodConfiguration#getContentPackageSelection()
	 * @see #getMethodConfiguration()
	 * @generated
	 */
	EReference getMethodConfiguration_ContentPackageSelection();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.MethodConfiguration#getSubstractedCategory <em>Substracted Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Substracted Category</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodConfiguration#getSubstractedCategory()
	 * @see #getMethodConfiguration()
	 * @generated
	 */
	EReference getMethodConfiguration_SubstractedCategory();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.MethodConfiguration#getDefaultView <em>Default View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default View</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodConfiguration#getDefaultView()
	 * @see #getMethodConfiguration()
	 * @generated
	 */
	EReference getMethodConfiguration_DefaultView();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.MethodConfiguration#getProcessView <em>Process View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Process View</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodConfiguration#getProcessView()
	 * @see #getMethodConfiguration()
	 * @generated
	 */
	EReference getMethodConfiguration_ProcessView();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.MethodPlugin <em>Method Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Plugin</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodPlugin
	 * @generated
	 */
	EClass getMethodPlugin();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.spem.MethodPlugin#getOwnedMethodContentPackage <em>Owned Method Content Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Method Content Package</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodPlugin#getOwnedMethodContentPackage()
	 * @see #getMethodPlugin()
	 * @generated
	 */
	EReference getMethodPlugin_OwnedMethodContentPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.spem.MethodPlugin#getOwnedProcessPackage <em>Owned Process Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Process Package</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodPlugin#getOwnedProcessPackage()
	 * @see #getMethodPlugin()
	 * @generated
	 */
	EReference getMethodPlugin_OwnedProcessPackage();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.MethodPlugin#getBasePlugin <em>Base Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Plugin</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodPlugin#getBasePlugin()
	 * @see #getMethodPlugin()
	 * @generated
	 */
	EReference getMethodPlugin_BasePlugin();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.MethodLibrary <em>Method Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Library</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodLibrary
	 * @generated
	 */
	EClass getMethodLibrary();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.MethodLibrary#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodLibrary#getName()
	 * @see #getMethodLibrary()
	 * @generated
	 */
	EAttribute getMethodLibrary_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.spem.MethodLibrary#getOwnedMethodPlugin <em>Owned Method Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Method Plugin</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodLibrary#getOwnedMethodPlugin()
	 * @see #getMethodLibrary()
	 * @generated
	 */
	EReference getMethodLibrary_OwnedMethodPlugin();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.spem.MethodLibrary#getPredefinedConfiguration <em>Predefined Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predefined Configuration</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodLibrary#getPredefinedConfiguration()
	 * @see #getMethodLibrary()
	 * @generated
	 */
	EReference getMethodLibrary_PredefinedConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.spem.MethodLibrary#getConfigurationPackage <em>Configuration Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration Package</em>'.
	 * @see org.obeonetwork.dsl.spem.MethodLibrary#getConfigurationPackage()
	 * @see #getMethodLibrary()
	 * @generated
	 */
	EReference getMethodLibrary_ConfigurationPackage();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.WorkProductPort <em>Work Product Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Product Port</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkProductPort
	 * @generated
	 */
	EClass getWorkProductPort();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.WorkProductPort#isIsOptional <em>Is Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Optional</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkProductPort#isIsOptional()
	 * @see #getWorkProductPort()
	 * @generated
	 */
	EAttribute getWorkProductPort_IsOptional();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.WorkProductPort#getPortKind <em>Port Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Kind</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkProductPort#getPortKind()
	 * @see #getWorkProductPort()
	 * @generated
	 */
	EAttribute getWorkProductPort_PortKind();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.WorkProductPort#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Type</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkProductPort#getPortType()
	 * @see #getWorkProductPort()
	 * @generated
	 */
	EReference getWorkProductPort_PortType();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.WorkProductPortConnector <em>Work Product Port Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Product Port Connector</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkProductPortConnector
	 * @generated
	 */
	EClass getWorkProductPortConnector();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.WorkProductPortConnector#getConnectedPort <em>Connected Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Port</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkProductPortConnector#getConnectedPort()
	 * @see #getWorkProductPortConnector()
	 * @generated
	 */
	EReference getWorkProductPortConnector_ConnectedPort();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.spem.ParameterDirectionKind <em>Parameter Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Direction Kind</em>'.
	 * @see org.obeonetwork.dsl.spem.ParameterDirectionKind
	 * @generated
	 */
	EEnum getParameterDirectionKind();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.spem.WorkSequenceKind <em>Work Sequence Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Work Sequence Kind</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkSequenceKind
	 * @generated
	 */
	EEnum getWorkSequenceKind();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.spem.ActivityUseKind <em>Activity Use Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activity Use Kind</em>'.
	 * @see org.obeonetwork.dsl.spem.ActivityUseKind
	 * @generated
	 */
	EEnum getActivityUseKind();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.spem.OptionalityKind <em>Optionality Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Optionality Kind</em>'.
	 * @see org.obeonetwork.dsl.spem.OptionalityKind
	 * @generated
	 */
	EEnum getOptionalityKind();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.spem.VariabilityType <em>Variability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variability Type</em>'.
	 * @see org.obeonetwork.dsl.spem.VariabilityType
	 * @generated
	 */
	EEnum getVariabilityType();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.spem.WorkProductRelationshipKind <em>Work Product Relationship Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Work Product Relationship Kind</em>'.
	 * @see org.obeonetwork.dsl.spem.WorkProductRelationshipKind
	 * @generated
	 */
	EEnum getWorkProductRelationshipKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpemFactory getSpemFactory();

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
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.ExtensibleElementImpl <em>Extensible Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.ExtensibleElementImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getExtensibleElement()
		 * @generated
		 */
		EClass EXTENSIBLE_ELEMENT = eINSTANCE.getExtensibleElement();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSIBLE_ELEMENT__KIND = eINSTANCE.getExtensibleElement_Kind();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.KindImpl <em>Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.KindImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getKind()
		 * @generated
		 */
		EClass KIND = eINSTANCE.getKind();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.WorkDefinitionPerformerImpl <em>Work Definition Performer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.WorkDefinitionPerformerImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkDefinitionPerformer()
		 * @generated
		 */
		EClass WORK_DEFINITION_PERFORMER = eINSTANCE.getWorkDefinitionPerformer();

		/**
		 * The meta object literal for the '<em><b>Linked Work Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_DEFINITION_PERFORMER__LINKED_WORK_DEFINITION = eINSTANCE.getWorkDefinitionPerformer_LinkedWorkDefinition();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.WorkDefinitionImpl <em>Work Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.WorkDefinitionImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkDefinition()
		 * @generated
		 */
		EClass WORK_DEFINITION = eINSTANCE.getWorkDefinition();

		/**
		 * The meta object literal for the '<em><b>Pre Condition</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_DEFINITION__PRE_CONDITION = eINSTANCE.getWorkDefinition_PreCondition();

		/**
		 * The meta object literal for the '<em><b>Post Condition</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_DEFINITION__POST_CONDITION = eINSTANCE.getWorkDefinition_PostCondition();

		/**
		 * The meta object literal for the '<em><b>Owned Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_DEFINITION__OWNED_PARAMETER = eINSTANCE.getWorkDefinition_OwnedParameter();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.WorkDefinitionParameterImpl <em>Work Definition Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.WorkDefinitionParameterImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkDefinitionParameter()
		 * @generated
		 */
		EClass WORK_DEFINITION_PARAMETER = eINSTANCE.getWorkDefinitionParameter();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_DEFINITION_PARAMETER__DIRECTION = eINSTANCE.getWorkDefinitionParameter_Direction();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.BreakdownElementImpl <em>Breakdown Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.BreakdownElementImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getBreakdownElement()
		 * @generated
		 */
		EClass BREAKDOWN_ELEMENT = eINSTANCE.getBreakdownElement();

		/**
		 * The meta object literal for the '<em><b>Has Multiple Occurrences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREAKDOWN_ELEMENT__HAS_MULTIPLE_OCCURRENCES = eINSTANCE.getBreakdownElement_HasMultipleOccurrences();

		/**
		 * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREAKDOWN_ELEMENT__IS_OPTIONAL = eINSTANCE.getBreakdownElement_IsOptional();

		/**
		 * The meta object literal for the '<em><b>Is Planned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREAKDOWN_ELEMENT__IS_PLANNED = eINSTANCE.getBreakdownElement_IsPlanned();

		/**
		 * The meta object literal for the '<em><b>Planning Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREAKDOWN_ELEMENT__PLANNING_DATA = eINSTANCE.getBreakdownElement_PlanningData();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.WorkBreakdownElementImpl <em>Work Breakdown Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.WorkBreakdownElementImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkBreakdownElement()
		 * @generated
		 */
		EClass WORK_BREAKDOWN_ELEMENT = eINSTANCE.getWorkBreakdownElement();

		/**
		 * The meta object literal for the '<em><b>Is Repeatable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_BREAKDOWN_ELEMENT__IS_REPEATABLE = eINSTANCE.getWorkBreakdownElement_IsRepeatable();

		/**
		 * The meta object literal for the '<em><b>Is Ongoing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_BREAKDOWN_ELEMENT__IS_ONGOING = eINSTANCE.getWorkBreakdownElement_IsOngoing();

		/**
		 * The meta object literal for the '<em><b>Is Event Driven</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_BREAKDOWN_ELEMENT__IS_EVENT_DRIVEN = eINSTANCE.getWorkBreakdownElement_IsEventDriven();

		/**
		 * The meta object literal for the '<em><b>Link To Predecessor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_BREAKDOWN_ELEMENT__LINK_TO_PREDECESSOR = eINSTANCE.getWorkBreakdownElement_LinkToPredecessor();

		/**
		 * The meta object literal for the '<em><b>Link To Successor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_BREAKDOWN_ELEMENT__LINK_TO_SUCCESSOR = eINSTANCE.getWorkBreakdownElement_LinkToSuccessor();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.WorkSequenceImpl <em>Work Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.WorkSequenceImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkSequence()
		 * @generated
		 */
		EClass WORK_SEQUENCE = eINSTANCE.getWorkSequence();

		/**
		 * The meta object literal for the '<em><b>Link Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_SEQUENCE__LINK_KIND = eINSTANCE.getWorkSequence_LinkKind();

		/**
		 * The meta object literal for the '<em><b>Predecessor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_SEQUENCE__PREDECESSOR = eINSTANCE.getWorkSequence_Predecessor();

		/**
		 * The meta object literal for the '<em><b>Successor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_SEQUENCE__SUCCESSOR = eINSTANCE.getWorkSequence_Successor();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.ActivityImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Use Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__USE_KIND = eINSTANCE.getActivity_UseKind();

		/**
		 * The meta object literal for the '<em><b>Used Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__USED_ACTIVITY = eINSTANCE.getActivity_UsedActivity();

		/**
		 * The meta object literal for the '<em><b>Nested Breakdown Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__NESTED_BREAKDOWN_ELEMENT = eINSTANCE.getActivity_NestedBreakdownElement();

		/**
		 * The meta object literal for the '<em><b>Suppressed Breakdown Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__SUPPRESSED_BREAKDOWN_ELEMENT = eINSTANCE.getActivity_SuppressedBreakdownElement();

		/**
		 * The meta object literal for the '<em><b>Owned Process Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__OWNED_PROCESS_PARAMETER = eINSTANCE.getActivity_OwnedProcessParameter();

		/**
		 * The meta object literal for the '<em><b>Default Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__DEFAULT_CONTEXT = eINSTANCE.getActivity_DefaultContext();

		/**
		 * The meta object literal for the '<em><b>Valid Context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__VALID_CONTEXT = eINSTANCE.getActivity_ValidContext();

		/**
		 * The meta object literal for the '<em><b>Is Enactable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__IS_ENACTABLE = eINSTANCE.getActivity_IsEnactable();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.ProcessPerformerImpl <em>Process Performer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.ProcessPerformerImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getProcessPerformer()
		 * @generated
		 */
		EClass PROCESS_PERFORMER = eINSTANCE.getProcessPerformer();

		/**
		 * The meta object literal for the '<em><b>Linked Role Use</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_PERFORMER__LINKED_ROLE_USE = eINSTANCE.getProcessPerformer_LinkedRoleUse();

		/**
		 * The meta object literal for the '<em><b>Linked Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_PERFORMER__LINKED_ACTIVITY = eINSTANCE.getProcessPerformer_LinkedActivity();

		/**
		 * The meta object literal for the '<em><b>Linked Task Use</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_PERFORMER__LINKED_TASK_USE = eINSTANCE.getProcessPerformer_LinkedTaskUse();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.RoleUseImpl <em>Role Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.RoleUseImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getRoleUse()
		 * @generated
		 */
		EClass ROLE_USE = eINSTANCE.getRoleUse();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_USE__ROLE = eINSTANCE.getRoleUse_Role();

		/**
		 * The meta object literal for the '<em><b>Applied Qualification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_USE__APPLIED_QUALIFICATION = eINSTANCE.getRoleUse_AppliedQualification();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.ProcessResponsibilityAssignmentImpl <em>Process Responsibility Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.ProcessResponsibilityAssignmentImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getProcessResponsibilityAssignment()
		 * @generated
		 */
		EClass PROCESS_RESPONSIBILITY_ASSIGNMENT = eINSTANCE.getProcessResponsibilityAssignment();

		/**
		 * The meta object literal for the '<em><b>Linked Role Use</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_RESPONSIBILITY_ASSIGNMENT__LINKED_ROLE_USE = eINSTANCE.getProcessResponsibilityAssignment_LinkedRoleUse();

		/**
		 * The meta object literal for the '<em><b>Linked Work Product Use</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_RESPONSIBILITY_ASSIGNMENT__LINKED_WORK_PRODUCT_USE = eINSTANCE.getProcessResponsibilityAssignment_LinkedWorkProductUse();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.WorkProductUseImpl <em>Work Product Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.WorkProductUseImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkProductUse()
		 * @generated
		 */
		EClass WORK_PRODUCT_USE = eINSTANCE.getWorkProductUse();

		/**
		 * The meta object literal for the '<em><b>Work Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT_USE__WORK_PRODUCT = eINSTANCE.getWorkProductUse_WorkProduct();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.WorkProductUseRelationshipImpl <em>Work Product Use Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.WorkProductUseRelationshipImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkProductUseRelationship()
		 * @generated
		 */
		EClass WORK_PRODUCT_USE_RELATIONSHIP = eINSTANCE.getWorkProductUseRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT_USE_RELATIONSHIP__SOURCE = eINSTANCE.getWorkProductUseRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT_USE_RELATIONSHIP__TARGET = eINSTANCE.getWorkProductUseRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Relationship Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PRODUCT_USE_RELATIONSHIP__RELATIONSHIP_KIND = eINSTANCE.getWorkProductUseRelationship_RelationshipKind();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.ProcessParameterImpl <em>Process Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.ProcessParameterImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getProcessParameter()
		 * @generated
		 */
		EClass PROCESS_PARAMETER = eINSTANCE.getProcessParameter();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_PARAMETER__PARAMETER_TYPE = eINSTANCE.getProcessParameter_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Optionality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_PARAMETER__OPTIONALITY = eINSTANCE.getProcessParameter_Optionality();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.MilestoneImpl <em>Milestone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.MilestoneImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getMilestone()
		 * @generated
		 */
		EClass MILESTONE = eINSTANCE.getMilestone();

		/**
		 * The meta object literal for the '<em><b>Required Result</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MILESTONE__REQUIRED_RESULT = eINSTANCE.getMilestone_RequiredResult();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.ProcessElementImpl <em>Process Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.ProcessElementImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getProcessElement()
		 * @generated
		 */
		EClass PROCESS_ELEMENT = eINSTANCE.getProcessElement();

		/**
		 * The meta object literal for the '<em><b>Process Kind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_ELEMENT__PROCESS_KIND = eINSTANCE.getProcessElement_ProcessKind();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.DescribableElementImpl <em>Describable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.DescribableElementImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getDescribableElement()
		 * @generated
		 */
		EClass DESCRIBABLE_ELEMENT = eINSTANCE.getDescribableElement();

		/**
		 * The meta object literal for the '<em><b>Presentation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBABLE_ELEMENT__PRESENTATION_NAME = eINSTANCE.getDescribableElement_PresentationName();

		/**
		 * The meta object literal for the '<em><b>Brief Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION = eINSTANCE.getDescribableElement_BriefDescription();

		/**
		 * The meta object literal for the '<em><b>Main Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION = eINSTANCE.getDescribableElement_MainDescription();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBABLE_ELEMENT__PURPOSE = eINSTANCE.getDescribableElement_Purpose();

		/**
		 * The meta object literal for the '<em><b>Guidance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIBABLE_ELEMENT__GUIDANCE = eINSTANCE.getDescribableElement_Guidance();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIBABLE_ELEMENT__METRIC = eINSTANCE.getDescribableElement_Metric();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIBABLE_ELEMENT__CATEGORY = eINSTANCE.getDescribableElement_Category();

		/**
		 * The meta object literal for the '<em><b>Copyright</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBABLE_ELEMENT__COPYRIGHT = eINSTANCE.getDescribableElement_Copyright();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBABLE_ELEMENT__AUTHOR = eINSTANCE.getDescribableElement_Author();

		/**
		 * The meta object literal for the '<em><b>Change Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBABLE_ELEMENT__CHANGE_DATE = eINSTANCE.getDescribableElement_ChangeDate();

		/**
		 * The meta object literal for the '<em><b>Change Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBABLE_ELEMENT__CHANGE_DESCRIPTION = eINSTANCE.getDescribableElement_ChangeDescription();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBABLE_ELEMENT__VERSION = eINSTANCE.getDescribableElement_Version();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.CategoryImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Sub Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__SUB_CATEGORY = eINSTANCE.getCategory_SubCategory();

		/**
		 * The meta object literal for the '<em><b>Categorized Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__CATEGORIZED_ELEMENT = eINSTANCE.getCategory_CategorizedElement();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.GuidanceImpl <em>Guidance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.GuidanceImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getGuidance()
		 * @generated
		 */
		EClass GUIDANCE = eINSTANCE.getGuidance();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.MetricImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__EXPRESSION = eINSTANCE.getMetric_Expression();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.MethodContentElementImpl <em>Method Content Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.MethodContentElementImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getMethodContentElement()
		 * @generated
		 */
		EClass METHOD_CONTENT_ELEMENT = eINSTANCE.getMethodContentElement();

		/**
		 * The meta object literal for the '<em><b>Method Content Kind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND = eINSTANCE.getMethodContentElement_MethodContentKind();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.ToolDefinitionImpl <em>Tool Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.ToolDefinitionImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getToolDefinition()
		 * @generated
		 */
		EClass TOOL_DEFINITION = eINSTANCE.getToolDefinition();

		/**
		 * The meta object literal for the '<em><b>Managed Work Product</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_DEFINITION__MANAGED_WORK_PRODUCT = eINSTANCE.getToolDefinition_ManagedWorkProduct();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.TaskDefinitionImpl <em>Task Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.TaskDefinitionImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getTaskDefinition()
		 * @generated
		 */
		EClass TASK_DEFINITION = eINSTANCE.getTaskDefinition();

		/**
		 * The meta object literal for the '<em><b>Owned Task Definition Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_DEFINITION__OWNED_TASK_DEFINITION_PARAMETER = eINSTANCE.getTaskDefinition_OwnedTaskDefinitionParameter();

		/**
		 * The meta object literal for the '<em><b>Used Tool</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_DEFINITION__USED_TOOL = eINSTANCE.getTaskDefinition_UsedTool();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_DEFINITION__STEP = eINSTANCE.getTaskDefinition_Step();

		/**
		 * The meta object literal for the '<em><b>Required Qualification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_DEFINITION__REQUIRED_QUALIFICATION = eINSTANCE.getTaskDefinition_RequiredQualification();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.StepImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__NAME = eINSTANCE.getStep_Name();

		/**
		 * The meta object literal for the '<em><b>Predecessor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__PREDECESSOR = eINSTANCE.getStep_Predecessor();

		/**
		 * The meta object literal for the '<em><b>Successor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__SUCCESSOR = eINSTANCE.getStep_Successor();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.WorkProductDefinitionImpl <em>Work Product Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.WorkProductDefinitionImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkProductDefinition()
		 * @generated
		 */
		EClass WORK_PRODUCT_DEFINITION = eINSTANCE.getWorkProductDefinition();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.RoleDefinitionImpl <em>Role Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.RoleDefinitionImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getRoleDefinition()
		 * @generated
		 */
		EClass ROLE_DEFINITION = eINSTANCE.getRoleDefinition();

		/**
		 * The meta object literal for the '<em><b>Synonym</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_DEFINITION__SYNONYM = eINSTANCE.getRoleDefinition_Synonym();

		/**
		 * The meta object literal for the '<em><b>Provided Qualification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_DEFINITION__PROVIDED_QUALIFICATION = eINSTANCE.getRoleDefinition_ProvidedQualification();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.WorkProductDefinitionRelationshipImpl <em>Work Product Definition Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.WorkProductDefinitionRelationshipImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkProductDefinitionRelationship()
		 * @generated
		 */
		EClass WORK_PRODUCT_DEFINITION_RELATIONSHIP = eINSTANCE.getWorkProductDefinitionRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT_DEFINITION_RELATIONSHIP__SOURCE = eINSTANCE.getWorkProductDefinitionRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT_DEFINITION_RELATIONSHIP__TARGET = eINSTANCE.getWorkProductDefinitionRelationship_Target();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.Default_TaskDefinitionPerformerImpl <em>Default Task Definition Performer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.Default_TaskDefinitionPerformerImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getDefault_TaskDefinitionPerformer()
		 * @generated
		 */
		EClass DEFAULT_TASK_DEFINITION_PERFORMER = eINSTANCE.getDefault_TaskDefinitionPerformer();

		/**
		 * The meta object literal for the '<em><b>Linked Task Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_TASK_DEFINITION_PERFORMER__LINKED_TASK_DEFINITION = eINSTANCE.getDefault_TaskDefinitionPerformer_LinkedTaskDefinition();

		/**
		 * The meta object literal for the '<em><b>Linked Role Definition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_TASK_DEFINITION_PERFORMER__LINKED_ROLE_DEFINITION = eINSTANCE.getDefault_TaskDefinitionPerformer_LinkedRoleDefinition();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.Default_ResponsibilityAssignmentImpl <em>Default Responsibility Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.Default_ResponsibilityAssignmentImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getDefault_ResponsibilityAssignment()
		 * @generated
		 */
		EClass DEFAULT_RESPONSIBILITY_ASSIGNMENT = eINSTANCE.getDefault_ResponsibilityAssignment();

		/**
		 * The meta object literal for the '<em><b>Linked Role Definition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_RESPONSIBILITY_ASSIGNMENT__LINKED_ROLE_DEFINITION = eINSTANCE.getDefault_ResponsibilityAssignment_LinkedRoleDefinition();

		/**
		 * The meta object literal for the '<em><b>Linked Work Product Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_RESPONSIBILITY_ASSIGNMENT__LINKED_WORK_PRODUCT_DEFINITION = eINSTANCE.getDefault_ResponsibilityAssignment_LinkedWorkProductDefinition();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.Default_TaskDefinitionParameterImpl <em>Default Task Definition Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.Default_TaskDefinitionParameterImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getDefault_TaskDefinitionParameter()
		 * @generated
		 */
		EClass DEFAULT_TASK_DEFINITION_PARAMETER = eINSTANCE.getDefault_TaskDefinitionParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_TASK_DEFINITION_PARAMETER__NAME = eINSTANCE.getDefault_TaskDefinitionParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_TASK_DEFINITION_PARAMETER__PARAMETER_TYPE = eINSTANCE.getDefault_TaskDefinitionParameter_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Optionality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_TASK_DEFINITION_PARAMETER__OPTIONALITY = eINSTANCE.getDefault_TaskDefinitionParameter_Optionality();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.QualificationImpl <em>Qualification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.QualificationImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getQualification()
		 * @generated
		 */
		EClass QUALIFICATION = eINSTANCE.getQualification();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.MethodContentPackageableElementImpl <em>Method Content Packageable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.MethodContentPackageableElementImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getMethodContentPackageableElement()
		 * @generated
		 */
		EClass METHOD_CONTENT_PACKAGEABLE_ELEMENT = eINSTANCE.getMethodContentPackageableElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_CONTENT_PACKAGEABLE_ELEMENT__NAME = eINSTANCE.getMethodContentPackageableElement_Name();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.ProcessPackageableElementImpl <em>Process Packageable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.ProcessPackageableElementImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getProcessPackageableElement()
		 * @generated
		 */
		EClass PROCESS_PACKAGEABLE_ELEMENT = eINSTANCE.getProcessPackageableElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_PACKAGEABLE_ELEMENT__NAME = eINSTANCE.getProcessPackageableElement_Name();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.MethodContentPackageImpl <em>Method Content Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.MethodContentPackageImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getMethodContentPackage()
		 * @generated
		 */
		EClass METHOD_CONTENT_PACKAGE = eINSTANCE.getMethodContentPackage();

		/**
		 * The meta object literal for the '<em><b>Owned Method Content Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER = eINSTANCE.getMethodContentPackage_OwnedMethodContentMember();

		/**
		 * The meta object literal for the '<em><b>Reused Package</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CONTENT_PACKAGE__REUSED_PACKAGE = eINSTANCE.getMethodContentPackage_ReusedPackage();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.ProcessPackageImpl <em>Process Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.ProcessPackageImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getProcessPackage()
		 * @generated
		 */
		EClass PROCESS_PACKAGE = eINSTANCE.getProcessPackage();

		/**
		 * The meta object literal for the '<em><b>Owned Process Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_PACKAGE__OWNED_PROCESS_MEMBER = eINSTANCE.getProcessPackage_OwnedProcessMember();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.MethodContentKindImpl <em>Method Content Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.MethodContentKindImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getMethodContentKind()
		 * @generated
		 */
		EClass METHOD_CONTENT_KIND = eINSTANCE.getMethodContentKind();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.ProcessKindImpl <em>Process Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.ProcessKindImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getProcessKind()
		 * @generated
		 */
		EClass PROCESS_KIND = eINSTANCE.getProcessKind();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.PlanningDataImpl <em>Planning Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.PlanningDataImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getPlanningData()
		 * @generated
		 */
		EClass PLANNING_DATA = eINSTANCE.getPlanningData();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANNING_DATA__START_DATE = eINSTANCE.getPlanningData_StartDate();

		/**
		 * The meta object literal for the '<em><b>Finish Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANNING_DATA__FINISH_DATE = eINSTANCE.getPlanningData_FinishDate();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANNING_DATA__RANK = eINSTANCE.getPlanningData_Rank();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANNING_DATA__DURATION = eINSTANCE.getPlanningData_Duration();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.MethodContentUseImpl <em>Method Content Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.MethodContentUseImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getMethodContentUse()
		 * @generated
		 */
		EClass METHOD_CONTENT_USE = eINSTANCE.getMethodContentUse();

		/**
		 * The meta object literal for the '<em><b>Is Synchronized With Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_CONTENT_USE__IS_SYNCHRONIZED_WITH_SOURCE = eINSTANCE.getMethodContentUse_IsSynchronizedWithSource();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.TaskUseImpl <em>Task Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.TaskUseImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getTaskUse()
		 * @generated
		 */
		EClass TASK_USE = eINSTANCE.getTaskUse();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_USE__TASK = eINSTANCE.getTaskUse_Task();

		/**
		 * The meta object literal for the '<em><b>Used Qualification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_USE__USED_QUALIFICATION = eINSTANCE.getTaskUse_UsedQualification();

		/**
		 * The meta object literal for the '<em><b>Selected Step</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_USE__SELECTED_STEP = eINSTANCE.getTaskUse_SelectedStep();

		/**
		 * The meta object literal for the '<em><b>Owned Process Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_USE__OWNED_PROCESS_PARAMETER = eINSTANCE.getTaskUse_OwnedProcessParameter();

		/**
		 * The meta object literal for the '<em><b>Pre Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_USE__PRE_CONDITION = eINSTANCE.getTaskUse_PreCondition();

		/**
		 * The meta object literal for the '<em><b>Post Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_USE__POST_CONDITION = eINSTANCE.getTaskUse_PostCondition();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.CompositeRoleImpl <em>Composite Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.CompositeRoleImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getCompositeRole()
		 * @generated
		 */
		EClass COMPOSITE_ROLE = eINSTANCE.getCompositeRole();

		/**
		 * The meta object literal for the '<em><b>Aggregated Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_ROLE__AGGREGATED_ROLE = eINSTANCE.getCompositeRole_AggregatedRole();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.TeamProfileImpl <em>Team Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.TeamProfileImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getTeamProfile()
		 * @generated
		 */
		EClass TEAM_PROFILE = eINSTANCE.getTeamProfile();

		/**
		 * The meta object literal for the '<em><b>Sub Team</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_PROFILE__SUB_TEAM = eINSTANCE.getTeamProfile_SubTeam();

		/**
		 * The meta object literal for the '<em><b>Super Team</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_PROFILE__SUPER_TEAM = eINSTANCE.getTeamProfile_SuperTeam();

		/**
		 * The meta object literal for the '<em><b>Team Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_PROFILE__TEAM_ROLE = eINSTANCE.getTeamProfile_TeamRole();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.VariabilityElementImpl <em>Variability Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.VariabilityElementImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getVariabilityElement()
		 * @generated
		 */
		EClass VARIABILITY_ELEMENT = eINSTANCE.getVariabilityElement();

		/**
		 * The meta object literal for the '<em><b>Variability Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABILITY_ELEMENT__VARIABILITY_TYPE = eINSTANCE.getVariabilityElement_VariabilityType();

		/**
		 * The meta object literal for the '<em><b>Variability Based On Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT = eINSTANCE.getVariabilityElement_VariabilityBasedOnElement();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.ProcessComponentImpl <em>Process Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.ProcessComponentImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getProcessComponent()
		 * @generated
		 */
		EClass PROCESS_COMPONENT = eINSTANCE.getProcessComponent();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_COMPONENT__PROCESS = eINSTANCE.getProcessComponent_Process();

		/**
		 * The meta object literal for the '<em><b>Owned Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_COMPONENT__OWNED_PORT = eINSTANCE.getProcessComponent_OwnedPort();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.ProcessComponentUseImpl <em>Process Component Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.ProcessComponentUseImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getProcessComponentUse()
		 * @generated
		 */
		EClass PROCESS_COMPONENT_USE = eINSTANCE.getProcessComponentUse();

		/**
		 * The meta object literal for the '<em><b>Process Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_COMPONENT_USE__PROCESS_COMPONENT = eINSTANCE.getProcessComponentUse_ProcessComponent();

		/**
		 * The meta object literal for the '<em><b>Used Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_COMPONENT_USE__USED_PORT = eINSTANCE.getProcessComponentUse_UsedPort();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.MethodLibraryPackageableElementImpl <em>Method Library Packageable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.MethodLibraryPackageableElementImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getMethodLibraryPackageableElement()
		 * @generated
		 */
		EClass METHOD_LIBRARY_PACKAGEABLE_ELEMENT = eINSTANCE.getMethodLibraryPackageableElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_LIBRARY_PACKAGEABLE_ELEMENT__NAME = eINSTANCE.getMethodLibraryPackageableElement_Name();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.MethodPluginPackageableElementImpl <em>Method Plugin Packageable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.MethodPluginPackageableElementImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getMethodPluginPackageableElement()
		 * @generated
		 */
		EClass METHOD_PLUGIN_PACKAGEABLE_ELEMENT = eINSTANCE.getMethodPluginPackageableElement();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.MethodConfigurationImpl <em>Method Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.MethodConfigurationImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getMethodConfiguration()
		 * @generated
		 */
		EClass METHOD_CONFIGURATION = eINSTANCE.getMethodConfiguration();

		/**
		 * The meta object literal for the '<em><b>Base Configuration</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CONFIGURATION__BASE_CONFIGURATION = eINSTANCE.getMethodConfiguration_BaseConfiguration();

		/**
		 * The meta object literal for the '<em><b>Method Plugin Selection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CONFIGURATION__METHOD_PLUGIN_SELECTION = eINSTANCE.getMethodConfiguration_MethodPluginSelection();

		/**
		 * The meta object literal for the '<em><b>Process Package Selection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CONFIGURATION__PROCESS_PACKAGE_SELECTION = eINSTANCE.getMethodConfiguration_ProcessPackageSelection();

		/**
		 * The meta object literal for the '<em><b>Content Package Selection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CONFIGURATION__CONTENT_PACKAGE_SELECTION = eINSTANCE.getMethodConfiguration_ContentPackageSelection();

		/**
		 * The meta object literal for the '<em><b>Substracted Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CONFIGURATION__SUBSTRACTED_CATEGORY = eINSTANCE.getMethodConfiguration_SubstractedCategory();

		/**
		 * The meta object literal for the '<em><b>Default View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CONFIGURATION__DEFAULT_VIEW = eINSTANCE.getMethodConfiguration_DefaultView();

		/**
		 * The meta object literal for the '<em><b>Process View</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CONFIGURATION__PROCESS_VIEW = eINSTANCE.getMethodConfiguration_ProcessView();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.MethodPluginImpl <em>Method Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.MethodPluginImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getMethodPlugin()
		 * @generated
		 */
		EClass METHOD_PLUGIN = eINSTANCE.getMethodPlugin();

		/**
		 * The meta object literal for the '<em><b>Owned Method Content Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE = eINSTANCE.getMethodPlugin_OwnedMethodContentPackage();

		/**
		 * The meta object literal for the '<em><b>Owned Process Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_PLUGIN__OWNED_PROCESS_PACKAGE = eINSTANCE.getMethodPlugin_OwnedProcessPackage();

		/**
		 * The meta object literal for the '<em><b>Base Plugin</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_PLUGIN__BASE_PLUGIN = eINSTANCE.getMethodPlugin_BasePlugin();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.MethodLibraryImpl <em>Method Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.MethodLibraryImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getMethodLibrary()
		 * @generated
		 */
		EClass METHOD_LIBRARY = eINSTANCE.getMethodLibrary();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_LIBRARY__NAME = eINSTANCE.getMethodLibrary_Name();

		/**
		 * The meta object literal for the '<em><b>Owned Method Plugin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_LIBRARY__OWNED_METHOD_PLUGIN = eINSTANCE.getMethodLibrary_OwnedMethodPlugin();

		/**
		 * The meta object literal for the '<em><b>Predefined Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_LIBRARY__PREDEFINED_CONFIGURATION = eINSTANCE.getMethodLibrary_PredefinedConfiguration();

		/**
		 * The meta object literal for the '<em><b>Configuration Package</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_LIBRARY__CONFIGURATION_PACKAGE = eINSTANCE.getMethodLibrary_ConfigurationPackage();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.WorkProductPortImpl <em>Work Product Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.WorkProductPortImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkProductPort()
		 * @generated
		 */
		EClass WORK_PRODUCT_PORT = eINSTANCE.getWorkProductPort();

		/**
		 * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PRODUCT_PORT__IS_OPTIONAL = eINSTANCE.getWorkProductPort_IsOptional();

		/**
		 * The meta object literal for the '<em><b>Port Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PRODUCT_PORT__PORT_KIND = eINSTANCE.getWorkProductPort_PortKind();

		/**
		 * The meta object literal for the '<em><b>Port Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT_PORT__PORT_TYPE = eINSTANCE.getWorkProductPort_PortType();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.impl.WorkProductPortConnectorImpl <em>Work Product Port Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.impl.WorkProductPortConnectorImpl
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkProductPortConnector()
		 * @generated
		 */
		EClass WORK_PRODUCT_PORT_CONNECTOR = eINSTANCE.getWorkProductPortConnector();

		/**
		 * The meta object literal for the '<em><b>Connected Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT_PORT_CONNECTOR__CONNECTED_PORT = eINSTANCE.getWorkProductPortConnector_ConnectedPort();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.ParameterDirectionKind <em>Parameter Direction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.ParameterDirectionKind
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getParameterDirectionKind()
		 * @generated
		 */
		EEnum PARAMETER_DIRECTION_KIND = eINSTANCE.getParameterDirectionKind();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.WorkSequenceKind <em>Work Sequence Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.WorkSequenceKind
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkSequenceKind()
		 * @generated
		 */
		EEnum WORK_SEQUENCE_KIND = eINSTANCE.getWorkSequenceKind();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.ActivityUseKind <em>Activity Use Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.ActivityUseKind
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getActivityUseKind()
		 * @generated
		 */
		EEnum ACTIVITY_USE_KIND = eINSTANCE.getActivityUseKind();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.OptionalityKind <em>Optionality Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.OptionalityKind
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getOptionalityKind()
		 * @generated
		 */
		EEnum OPTIONALITY_KIND = eINSTANCE.getOptionalityKind();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.VariabilityType <em>Variability Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.VariabilityType
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getVariabilityType()
		 * @generated
		 */
		EEnum VARIABILITY_TYPE = eINSTANCE.getVariabilityType();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.WorkProductRelationshipKind <em>Work Product Relationship Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.WorkProductRelationshipKind
		 * @see org.obeonetwork.dsl.spem.impl.SpemPackageImpl#getWorkProductRelationshipKind()
		 * @generated
		 */
		EEnum WORK_PRODUCT_RELATIONSHIP_KIND = eINSTANCE.getWorkProductRelationshipKind();

	}

} //SpemPackage
