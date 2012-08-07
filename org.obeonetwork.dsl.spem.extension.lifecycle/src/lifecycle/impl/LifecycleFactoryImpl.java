/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lifecycle.impl;

import lifecycle.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LifecycleFactoryImpl extends EFactoryImpl implements LifecycleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LifecycleFactory init() {
		try {
			LifecycleFactory theLifecycleFactory = (LifecycleFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.thalesgroup.com/spem/2.0/lifecycle"); 
			if (theLifecycleFactory != null) {
				return theLifecycleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LifecycleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifecycleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LifecyclePackage.LIFECYCLE: return createLifecycle();
			case LifecyclePackage.STATE: return createState();
			case LifecyclePackage.INITIAL_STATE: return createInitialState();
			case LifecyclePackage.FINAL_STATE: return createFinalState();
			case LifecyclePackage.TRANSITION: return createTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifecycle createLifecycle() {
		LifecycleImpl lifecycle = new LifecycleImpl();
		return lifecycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState createInitialState() {
		InitialStateImpl initialState = new InitialStateImpl();
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState createFinalState() {
		FinalStateImpl finalState = new FinalStateImpl();
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifecyclePackage getLifecyclePackage() {
		return (LifecyclePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LifecyclePackage getPackage() {
		return LifecyclePackage.eINSTANCE;
	}

} //LifecycleFactoryImpl
