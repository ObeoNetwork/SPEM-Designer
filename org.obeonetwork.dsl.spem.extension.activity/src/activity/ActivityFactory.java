/**
 * THALES (c)
 */
package activity;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see activity.ActivityPackage
 * @generated
 */
public interface ActivityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivityFactory eINSTANCE = activity.impl.ActivityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge</em>'.
	 * @generated
	 */
	Edge createEdge();

	/**
	 * Returns a new object of class '<em>Start Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Node</em>'.
	 * @generated
	 */
	StartNode createStartNode();

	/**
	 * Returns a new object of class '<em>End Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Node</em>'.
	 * @generated
	 */
	EndNode createEndNode();

	/**
	 * Returns a new object of class '<em>Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fork Node</em>'.
	 * @generated
	 */
	ForkNode createForkNode();

	/**
	 * Returns a new object of class '<em>Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Node</em>'.
	 * @generated
	 */
	JoinNode createJoinNode();

	/**
	 * Returns a new object of class '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Node</em>'.
	 * @generated
	 */
	DecisionNode createDecisionNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ActivityPackage getActivityPackage();

} //ActivityFactory
