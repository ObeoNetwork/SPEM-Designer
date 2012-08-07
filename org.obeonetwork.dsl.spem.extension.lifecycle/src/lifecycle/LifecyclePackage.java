/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lifecycle;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see lifecycle.LifecycleFactory
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
	LifecyclePackage eINSTANCE = lifecycle.impl.LifecyclePackageImpl.init();

	/**
	 * The meta object id for the '{@link lifecycle.impl.LifecycleImpl <em>Lifecycle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lifecycle.impl.LifecycleImpl
	 * @see lifecycle.impl.LifecyclePackageImpl#getLifecycle()
	 * @generated
	 */
	int LIFECYCLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE__OWNED_STATE = 1;

	/**
	 * The feature id for the '<em><b>Owned Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE__OWNED_TRANSITION = 2;

	/**
	 * The number of structural features of the '<em>Lifecycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link lifecycle.impl.AbstractStateImpl <em>Abstract State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lifecycle.impl.AbstractStateImpl
	 * @see lifecycle.impl.LifecyclePackageImpl#getAbstractState()
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
	 * The meta object id for the '{@link lifecycle.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lifecycle.impl.StateImpl
	 * @see lifecycle.impl.LifecyclePackageImpl#getState()
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
	 * The meta object id for the '{@link lifecycle.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lifecycle.impl.InitialStateImpl
	 * @see lifecycle.impl.LifecyclePackageImpl#getInitialState()
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
	 * The meta object id for the '{@link lifecycle.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lifecycle.impl.FinalStateImpl
	 * @see lifecycle.impl.LifecyclePackageImpl#getFinalState()
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
	 * The meta object id for the '{@link lifecycle.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lifecycle.impl.TransitionImpl
	 * @see lifecycle.impl.LifecyclePackageImpl#getTransition()
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
	 * Returns the meta object for class '{@link lifecycle.Lifecycle <em>Lifecycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifecycle</em>'.
	 * @see lifecycle.Lifecycle
	 * @generated
	 */
	EClass getLifecycle();

	/**
	 * Returns the meta object for the attribute '{@link lifecycle.Lifecycle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lifecycle.Lifecycle#getName()
	 * @see #getLifecycle()
	 * @generated
	 */
	EAttribute getLifecycle_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link lifecycle.Lifecycle#getOwnedState <em>Owned State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned State</em>'.
	 * @see lifecycle.Lifecycle#getOwnedState()
	 * @see #getLifecycle()
	 * @generated
	 */
	EReference getLifecycle_OwnedState();

	/**
	 * Returns the meta object for the containment reference list '{@link lifecycle.Lifecycle#getOwnedTransition <em>Owned Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Transition</em>'.
	 * @see lifecycle.Lifecycle#getOwnedTransition()
	 * @see #getLifecycle()
	 * @generated
	 */
	EReference getLifecycle_OwnedTransition();

	/**
	 * Returns the meta object for class '{@link lifecycle.AbstractState <em>Abstract State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract State</em>'.
	 * @see lifecycle.AbstractState
	 * @generated
	 */
	EClass getAbstractState();

	/**
	 * Returns the meta object for the reference list '{@link lifecycle.AbstractState#getIncomingTransition <em>Incoming Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transition</em>'.
	 * @see lifecycle.AbstractState#getIncomingTransition()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_IncomingTransition();

	/**
	 * Returns the meta object for the reference list '{@link lifecycle.AbstractState#getOutgoingTransition <em>Outgoing Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transition</em>'.
	 * @see lifecycle.AbstractState#getOutgoingTransition()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_OutgoingTransition();

	/**
	 * Returns the meta object for class '{@link lifecycle.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see lifecycle.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link lifecycle.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lifecycle.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for class '{@link lifecycle.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see lifecycle.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the meta object for class '{@link lifecycle.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see lifecycle.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for class '{@link lifecycle.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see lifecycle.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link lifecycle.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard</em>'.
	 * @see lifecycle.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Guard();

	/**
	 * Returns the meta object for the reference '{@link lifecycle.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see lifecycle.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link lifecycle.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see lifecycle.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

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
		 * The meta object literal for the '{@link lifecycle.impl.LifecycleImpl <em>Lifecycle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lifecycle.impl.LifecycleImpl
		 * @see lifecycle.impl.LifecyclePackageImpl#getLifecycle()
		 * @generated
		 */
		EClass LIFECYCLE = eINSTANCE.getLifecycle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFECYCLE__NAME = eINSTANCE.getLifecycle_Name();

		/**
		 * The meta object literal for the '<em><b>Owned State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFECYCLE__OWNED_STATE = eINSTANCE.getLifecycle_OwnedState();

		/**
		 * The meta object literal for the '<em><b>Owned Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFECYCLE__OWNED_TRANSITION = eINSTANCE.getLifecycle_OwnedTransition();

		/**
		 * The meta object literal for the '{@link lifecycle.impl.AbstractStateImpl <em>Abstract State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lifecycle.impl.AbstractStateImpl
		 * @see lifecycle.impl.LifecyclePackageImpl#getAbstractState()
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
		 * The meta object literal for the '{@link lifecycle.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lifecycle.impl.StateImpl
		 * @see lifecycle.impl.LifecyclePackageImpl#getState()
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
		 * The meta object literal for the '{@link lifecycle.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lifecycle.impl.InitialStateImpl
		 * @see lifecycle.impl.LifecyclePackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link lifecycle.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lifecycle.impl.FinalStateImpl
		 * @see lifecycle.impl.LifecyclePackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '{@link lifecycle.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lifecycle.impl.TransitionImpl
		 * @see lifecycle.impl.LifecyclePackageImpl#getTransition()
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

	}

} //LifecyclePackage
