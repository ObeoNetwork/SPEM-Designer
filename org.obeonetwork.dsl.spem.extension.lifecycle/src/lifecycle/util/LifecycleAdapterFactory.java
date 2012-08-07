/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lifecycle.util;

import lifecycle.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see lifecycle.LifecyclePackage
 * @generated
 */
public class LifecycleAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LifecyclePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifecycleAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LifecyclePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifecycleSwitch<Adapter> modelSwitch =
		new LifecycleSwitch<Adapter>() {
			@Override
			public Adapter caseLifecycle(Lifecycle object) {
				return createLifecycleAdapter();
			}
			@Override
			public Adapter caseAbstractState(AbstractState object) {
				return createAbstractStateAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseInitialState(InitialState object) {
				return createInitialStateAdapter();
			}
			@Override
			public Adapter caseFinalState(FinalState object) {
				return createFinalStateAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link lifecycle.Lifecycle <em>Lifecycle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lifecycle.Lifecycle
	 * @generated
	 */
	public Adapter createLifecycleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lifecycle.AbstractState <em>Abstract State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lifecycle.AbstractState
	 * @generated
	 */
	public Adapter createAbstractStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lifecycle.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lifecycle.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lifecycle.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lifecycle.InitialState
	 * @generated
	 */
	public Adapter createInitialStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lifecycle.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lifecycle.FinalState
	 * @generated
	 */
	public Adapter createFinalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lifecycle.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lifecycle.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LifecycleAdapterFactory
