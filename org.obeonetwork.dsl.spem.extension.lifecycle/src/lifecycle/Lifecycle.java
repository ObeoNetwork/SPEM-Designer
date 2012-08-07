/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lifecycle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lifecycle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lifecycle.Lifecycle#getName <em>Name</em>}</li>
 *   <li>{@link lifecycle.Lifecycle#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link lifecycle.Lifecycle#getOwnedTransition <em>Owned Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see lifecycle.LifecyclePackage#getLifecycle()
 * @model
 * @generated
 */
public interface Lifecycle extends EObject {
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
	 * @see lifecycle.LifecyclePackage#getLifecycle_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lifecycle.Lifecycle#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owned State</b></em>' containment reference list.
	 * The list contents are of type {@link lifecycle.AbstractState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned State</em>' containment reference list.
	 * @see lifecycle.LifecyclePackage#getLifecycle_OwnedState()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractState> getOwnedState();

	/**
	 * Returns the value of the '<em><b>Owned Transition</b></em>' containment reference list.
	 * The list contents are of type {@link lifecycle.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Transition</em>' containment reference list.
	 * @see lifecycle.LifecyclePackage#getLifecycle_OwnedTransition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getOwnedTransition();

} // Lifecycle
