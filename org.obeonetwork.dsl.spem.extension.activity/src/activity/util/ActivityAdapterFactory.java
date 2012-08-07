/**
 * THALES (c)
 */
package activity.util;

import activity.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.obeonetwork.dsl.spem.BreakdownElement;
import org.obeonetwork.dsl.spem.DescribableElement;
import org.obeonetwork.dsl.spem.ExtensibleElement;
import org.obeonetwork.dsl.spem.ProcessElement;
import org.obeonetwork.dsl.spem.ProcessPackageableElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see activity.ActivityPackage
 * @generated
 */
public class ActivityAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActivityPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ActivityPackage.eINSTANCE;
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
	protected ActivitySwitch<Adapter> modelSwitch =
		new ActivitySwitch<Adapter>() {
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object) {
				return createEdgeAdapter();
			}
			@Override
			public Adapter caseStartNode(StartNode object) {
				return createStartNodeAdapter();
			}
			@Override
			public Adapter caseEndNode(EndNode object) {
				return createEndNodeAdapter();
			}
			@Override
			public Adapter caseForkNode(ForkNode object) {
				return createForkNodeAdapter();
			}
			@Override
			public Adapter caseJoinNode(JoinNode object) {
				return createJoinNodeAdapter();
			}
			@Override
			public Adapter caseDecisionNode(DecisionNode object) {
				return createDecisionNodeAdapter();
			}
			@Override
			public Adapter caseExtensibleElement(ExtensibleElement object) {
				return createExtensibleElementAdapter();
			}
			@Override
			public Adapter caseDescribableElement(DescribableElement object) {
				return createDescribableElementAdapter();
			}
			@Override
			public Adapter caseProcessPackageableElement(ProcessPackageableElement object) {
				return createProcessPackageableElementAdapter();
			}
			@Override
			public Adapter caseProcessElement(ProcessElement object) {
				return createProcessElementAdapter();
			}
			@Override
			public Adapter caseBreakdownElement(BreakdownElement object) {
				return createBreakdownElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link activity.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activity.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activity.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activity.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activity.StartNode <em>Start Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activity.StartNode
	 * @generated
	 */
	public Adapter createStartNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activity.EndNode <em>End Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activity.EndNode
	 * @generated
	 */
	public Adapter createEndNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activity.ForkNode <em>Fork Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activity.ForkNode
	 * @generated
	 */
	public Adapter createForkNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activity.JoinNode <em>Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activity.JoinNode
	 * @generated
	 */
	public Adapter createJoinNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activity.DecisionNode <em>Decision Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activity.DecisionNode
	 * @generated
	 */
	public Adapter createDecisionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.ExtensibleElement <em>Extensible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.ExtensibleElement
	 * @generated
	 */
	public Adapter createExtensibleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.DescribableElement <em>Describable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.DescribableElement
	 * @generated
	 */
	public Adapter createDescribableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.ProcessPackageableElement <em>Process Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.ProcessPackageableElement
	 * @generated
	 */
	public Adapter createProcessPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.ProcessElement <em>Process Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.ProcessElement
	 * @generated
	 */
	public Adapter createProcessElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.BreakdownElement <em>Breakdown Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.BreakdownElement
	 * @generated
	 */
	public Adapter createBreakdownElementAdapter() {
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

} //ActivityAdapterFactory
