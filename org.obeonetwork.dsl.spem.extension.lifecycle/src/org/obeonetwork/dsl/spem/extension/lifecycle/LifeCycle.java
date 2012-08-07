/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.extension.lifecycle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Life Cycle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.extension.lifecycle.LifeCycle#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.extension.lifecycle.LifeCycle#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.extension.lifecycle.LifeCycle#getOwnedTransition <em>Owned Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.extension.lifecycle.LifecyclePackage#getLifeCycle()
 * @model
 * @generated
 */
public interface LifeCycle extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.LifecyclePackage#getLifeCycle_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.extension.lifecycle.LifeCycle#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owned State</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.extension.lifecycle.AbstractState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned State</em>' containment reference list.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.LifecyclePackage#getLifeCycle_OwnedState()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractState> getOwnedState();

	/**
	 * Returns the value of the '<em><b>Owned Transition</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.extension.lifecycle.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Transition</em>' containment reference list.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.LifecyclePackage#getLifeCycle_OwnedTransition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getOwnedTransition();

} // LifeCycle
