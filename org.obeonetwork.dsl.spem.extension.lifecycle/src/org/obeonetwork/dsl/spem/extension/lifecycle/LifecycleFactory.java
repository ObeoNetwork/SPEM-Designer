/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.extension.lifecycle;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.spem.extension.lifecycle.LifecyclePackage
 * @generated
 */
public interface LifecycleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LifecycleFactory eINSTANCE = org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifecycleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Life Cycle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Life Cycle</em>'.
	 * @generated
	 */
	LifeCycle createLifeCycle();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial State</em>'.
	 * @generated
	 */
	InitialState createInitialState();

	/**
	 * Returns a new object of class '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final State</em>'.
	 * @generated
	 */
	FinalState createFinalState();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Work Product Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Product Use</em>'.
	 * @generated
	 */
	WorkProductUse createWorkProductUse();

	/**
	 * Returns a new object of class '<em>Work Product Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Product Definition</em>'.
	 * @generated
	 */
	WorkProductDefinition createWorkProductDefinition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LifecyclePackage getLifecyclePackage();

} //LifecycleFactory
