/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.extension.lifecycle;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.obeonetwork.dsl.spem.extension.lifecycle.LifecycleFactory
 * @model kind="package"
 * @generated
 */
public interface LifecyclePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lifecycle";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.thalesgroup.com/spem/2.0/lifecycle";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lifecycle";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LifecyclePackage eINSTANCE = org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifecyclePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifeCycleImpl <em>Life Cycle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifeCycleImpl
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifecyclePackageImpl#getLifeCycle()
	 * @generated
	 */
	int LIFE_CYCLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE__OWNED_STATE = 1;

	/**
	 * The feature id for the '<em><b>Owned Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE__OWNED_TRANSITION = 2;

	/**
	 * The number of structural features of the '<em>Life Cycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.extension.lifecycle.impl.AbstractStateImpl <em>Abstract State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.AbstractStateImpl
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifecyclePackageImpl#getAbstractState()
	 * @generated
	 */
	int ABSTRACT_STATE = 1;

	/**
	 * The feature id for the '<em><b>Incoming Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__INCOMING_TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Outgoing Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__OUTGOING_TRANSITION = 1;

	/**
	 * The number of structural features of the '<em>Abstract State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.extension.lifecycle.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.StateImpl
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifecyclePackageImpl#getState()
	 * @generated
	 */
	int STATE = 2;

	/**
	 * The feature id for the '<em><b>Incoming Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING_TRANSITION = ABSTRACT_STATE__INCOMING_TRANSITION;

	/**
	 * The feature id for the '<em><b>Outgoing Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING_TRANSITION = ABSTRACT_STATE__OUTGOING_TRANSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = ABSTRACT_STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.extension.lifecycle.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.InitialStateImpl
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifecyclePackageImpl#getInitialState()
	 * @generated
	 */
	int INITIAL_STATE = 3;

	/**
	 * The feature id for the '<em><b>Incoming Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__INCOMING_TRANSITION = ABSTRACT_STATE__INCOMING_TRANSITION;

	/**
	 * The feature id for the '<em><b>Outgoing Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__OUTGOING_TRANSITION = ABSTRACT_STATE__OUTGOING_TRANSITION;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_FEATURE_COUNT = ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.extension.lifecycle.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.FinalStateImpl
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifecyclePackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 4;

	/**
	 * The feature id for the '<em><b>Incoming Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__INCOMING_TRANSITION = ABSTRACT_STATE__INCOMING_TRANSITION;

	/**
	 * The feature id for the '<em><b>Outgoing Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__OUTGOING_TRANSITION = ABSTRACT_STATE__OUTGOING_TRANSITION;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.extension.lifecycle.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.TransitionImpl
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifecyclePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifecycleElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifecycleElementImpl
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifecyclePackageImpl#getLifecycleElement()
	 * @generated
	 */
	int LIFECYCLE_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Lifecycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_ELEMENT__LIFECYCLE = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.extension.lifecycle.impl.WorkProductUseImpl <em>Work Product Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.WorkProductUseImpl
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifecyclePackageImpl#getWorkProductUse()
	 * @generated
	 */
	int WORK_PRODUCT_USE = 7;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__KIND = SpemPackage.WORK_PRODUCT_USE__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__PRESENTATION_NAME = SpemPackage.WORK_PRODUCT_USE__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__BRIEF_DESCRIPTION = SpemPackage.WORK_PRODUCT_USE__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__MAIN_DESCRIPTION = SpemPackage.WORK_PRODUCT_USE__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__PURPOSE = SpemPackage.WORK_PRODUCT_USE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__GUIDANCE = SpemPackage.WORK_PRODUCT_USE__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__METRIC = SpemPackage.WORK_PRODUCT_USE__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__CATEGORY = SpemPackage.WORK_PRODUCT_USE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__COPYRIGHT = SpemPackage.WORK_PRODUCT_USE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__AUTHOR = SpemPackage.WORK_PRODUCT_USE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__CHANGE_DATE = SpemPackage.WORK_PRODUCT_USE__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__CHANGE_DESCRIPTION = SpemPackage.WORK_PRODUCT_USE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__VERSION = SpemPackage.WORK_PRODUCT_USE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__NAME = SpemPackage.WORK_PRODUCT_USE__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__PROCESS_KIND = SpemPackage.WORK_PRODUCT_USE__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__HAS_MULTIPLE_OCCURRENCES = SpemPackage.WORK_PRODUCT_USE__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__IS_OPTIONAL = SpemPackage.WORK_PRODUCT_USE__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__IS_PLANNED = SpemPackage.WORK_PRODUCT_USE__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__PLANNING_DATA = SpemPackage.WORK_PRODUCT_USE__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Is Synchronized With Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__IS_SYNCHRONIZED_WITH_SOURCE = SpemPackage.WORK_PRODUCT_USE__IS_SYNCHRONIZED_WITH_SOURCE;

	/**
	 * The feature id for the '<em><b>Work Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__WORK_PRODUCT = SpemPackage.WORK_PRODUCT_USE__WORK_PRODUCT;

	/**
	 * The feature id for the '<em><b>Lifecycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE__LIFECYCLE = SpemPackage.WORK_PRODUCT_USE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Work Product Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_USE_FEATURE_COUNT = SpemPackage.WORK_PRODUCT_USE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.spem.extension.lifecycle.impl.WorkProductDefinitionImpl <em>Work Product Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.WorkProductDefinitionImpl
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifecyclePackageImpl#getWorkProductDefinition()
	 * @generated
	 */
	int WORK_PRODUCT_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__KIND = SpemPackage.WORK_PRODUCT_DEFINITION__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__PRESENTATION_NAME = SpemPackage.WORK_PRODUCT_DEFINITION__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__BRIEF_DESCRIPTION = SpemPackage.WORK_PRODUCT_DEFINITION__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__MAIN_DESCRIPTION = SpemPackage.WORK_PRODUCT_DEFINITION__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__PURPOSE = SpemPackage.WORK_PRODUCT_DEFINITION__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__GUIDANCE = SpemPackage.WORK_PRODUCT_DEFINITION__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__METRIC = SpemPackage.WORK_PRODUCT_DEFINITION__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__CATEGORY = SpemPackage.WORK_PRODUCT_DEFINITION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__COPYRIGHT = SpemPackage.WORK_PRODUCT_DEFINITION__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__AUTHOR = SpemPackage.WORK_PRODUCT_DEFINITION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__CHANGE_DATE = SpemPackage.WORK_PRODUCT_DEFINITION__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__CHANGE_DESCRIPTION = SpemPackage.WORK_PRODUCT_DEFINITION__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__VERSION = SpemPackage.WORK_PRODUCT_DEFINITION__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__NAME = SpemPackage.WORK_PRODUCT_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__VARIABILITY_TYPE = SpemPackage.WORK_PRODUCT_DEFINITION__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.WORK_PRODUCT_DEFINITION__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__METHOD_CONTENT_KIND = SpemPackage.WORK_PRODUCT_DEFINITION__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>Lifecycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__LIFECYCLE = SpemPackage.WORK_PRODUCT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Work Product Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_FEATURE_COUNT = SpemPackage.WORK_PRODUCT_DEFINITION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.extension.lifecycle.LifeCycle <em>Life Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Life Cycle</em>'.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.LifeCycle
	 * @generated
	 */
	EClass getLifeCycle();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.extension.lifecycle.LifeCycle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.LifeCycle#getName()
	 * @see #getLifeCycle()
	 * @generated
	 */
	EAttribute getLifeCycle_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.spem.extension.lifecycle.LifeCycle#getOwnedState <em>Owned State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned State</em>'.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.LifeCycle#getOwnedState()
	 * @see #getLifeCycle()
	 * @generated
	 */
	EReference getLifeCycle_OwnedState();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.spem.extension.lifecycle.LifeCycle#getOwnedTransition <em>Owned Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Transition</em>'.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.LifeCycle#getOwnedTransition()
	 * @see #getLifeCycle()
	 * @generated
	 */
	EReference getLifeCycle_OwnedTransition();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.extension.lifecycle.AbstractState <em>Abstract State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract State</em>'.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.AbstractState
	 * @generated
	 */
	EClass getAbstractState();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.extension.lifecycle.AbstractState#getIncomingTransition <em>Incoming Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transition</em>'.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.AbstractState#getIncomingTransition()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_IncomingTransition();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.spem.extension.lifecycle.AbstractState#getOutgoingTransition <em>Outgoing Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transition</em>'.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.AbstractState#getOutgoingTransition()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_OutgoingTransition();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.extension.lifecycle.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.extension.lifecycle.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.extension.lifecycle.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.extension.lifecycle.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.extension.lifecycle.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.spem.extension.lifecycle.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard</em>'.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Guard();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.extension.lifecycle.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.spem.extension.lifecycle.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.extension.lifecycle.LifecycleElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.LifecycleElement
	 * @generated
	 */
	EClass getLifecycleElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.spem.extension.lifecycle.LifecycleElement#getLifecycle <em>Lifecycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lifecycle</em>'.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.LifecycleElement#getLifecycle()
	 * @see #getLifecycleElement()
	 * @generated
	 */
	EReference getLifecycleElement_Lifecycle();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.extension.lifecycle.WorkProductUse <em>Work Product Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Product Use</em>'.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.WorkProductUse
	 * @generated
	 */
	EClass getWorkProductUse();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.spem.extension.lifecycle.WorkProductDefinition <em>Work Product Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Product Definition</em>'.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.WorkProductDefinition
	 * @generated
	 */
	EClass getWorkProductDefinition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LifecycleFactory getLifecycleFactory();

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
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifeCycleImpl <em>Life Cycle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifeCycleImpl
		 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifecyclePackageImpl#getLifeCycle()
		 * @generated
		 */
		EClass LIFE_CYCLE = eINSTANCE.getLifeCycle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFE_CYCLE__NAME = eINSTANCE.getLifeCycle_Name();

		/**
		 * The meta object literal for the '<em><b>Owned State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFE_CYCLE__OWNED_STATE = eINSTANCE.getLifeCycle_OwnedState();

		/**
		 * The meta object literal for the '<em><b>Owned Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFE_CYCLE__OWNED_TRANSITION = eINSTANCE.getLifeCycle_OwnedTransition();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.extension.lifecycle.impl.AbstractStateImpl <em>Abstract State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.AbstractStateImpl
		 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifecyclePackageImpl#getAbstractState()
		 * @generated
		 */
		EClass ABSTRACT_STATE = eINSTANCE.getAbstractState();

		/**
		 * The meta object literal for the '<em><b>Incoming Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATE__INCOMING_TRANSITION = eINSTANCE.getAbstractState_IncomingTransition();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATE__OUTGOING_TRANSITION = eINSTANCE.getAbstractState_OutgoingTransition();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.extension.lifecycle.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.StateImpl
		 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifecyclePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.extension.lifecycle.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.InitialStateImpl
		 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifecyclePackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.extension.lifecycle.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.FinalStateImpl
		 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifecyclePackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.extension.lifecycle.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.TransitionImpl
		 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifecyclePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifecycleElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifecycleElementImpl
		 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifecyclePackageImpl#getLifecycleElement()
		 * @generated
		 */
		EClass LIFECYCLE_ELEMENT = eINSTANCE.getLifecycleElement();

		/**
		 * The meta object literal for the '<em><b>Lifecycle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFECYCLE_ELEMENT__LIFECYCLE = eINSTANCE.getLifecycleElement_Lifecycle();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.extension.lifecycle.impl.WorkProductUseImpl <em>Work Product Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.WorkProductUseImpl
		 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifecyclePackageImpl#getWorkProductUse()
		 * @generated
		 */
		EClass WORK_PRODUCT_USE = eINSTANCE.getWorkProductUse();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.spem.extension.lifecycle.impl.WorkProductDefinitionImpl <em>Work Product Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.WorkProductDefinitionImpl
		 * @see org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifecyclePackageImpl#getWorkProductDefinition()
		 * @generated
		 */
		EClass WORK_PRODUCT_DEFINITION = eINSTANCE.getWorkProductDefinition();

	}

} //LifecyclePackage
