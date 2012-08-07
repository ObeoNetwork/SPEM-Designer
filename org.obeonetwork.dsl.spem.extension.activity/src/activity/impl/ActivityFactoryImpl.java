/**
 * THALES (c)
 */
package activity.impl;

import activity.*;

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
public class ActivityFactoryImpl extends EFactoryImpl implements ActivityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivityFactory init() {
		try {
			ActivityFactory theActivityFactory = (ActivityFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.thalesgroup.com/spem/2.0/activity"); 
			if (theActivityFactory != null) {
				return theActivityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActivityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFactoryImpl() {
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
			case ActivityPackage.EDGE: return createEdge();
			case ActivityPackage.START_NODE: return createStartNode();
			case ActivityPackage.END_NODE: return createEndNode();
			case ActivityPackage.FORK_NODE: return createForkNode();
			case ActivityPackage.JOIN_NODE: return createJoinNode();
			case ActivityPackage.DECISION_NODE: return createDecisionNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartNode createStartNode() {
		StartNodeImpl startNode = new StartNodeImpl();
		return startNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndNode createEndNode() {
		EndNodeImpl endNode = new EndNodeImpl();
		return endNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNode createForkNode() {
		ForkNodeImpl forkNode = new ForkNodeImpl();
		return forkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNode createJoinNode() {
		JoinNodeImpl joinNode = new JoinNodeImpl();
		return joinNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNode createDecisionNode() {
		DecisionNodeImpl decisionNode = new DecisionNodeImpl();
		return decisionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPackage getActivityPackage() {
		return (ActivityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActivityPackage getPackage() {
		return ActivityPackage.eINSTANCE;
	}

} //ActivityFactoryImpl
