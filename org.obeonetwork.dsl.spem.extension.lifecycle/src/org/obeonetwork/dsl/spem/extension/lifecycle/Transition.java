/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.extension.lifecycle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.extension.lifecycle.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.extension.lifecycle.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.extension.lifecycle.Transition#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.extension.lifecycle.LifecyclePackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' attribute.
	 * @see #setGuard(String)
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.LifecyclePackage#getTransition_Guard()
	 * @model
	 * @generated
	 */
	String getGuard();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.extension.lifecycle.Transition#getGuard <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' attribute.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.spem.extension.lifecycle.AbstractState#getOutgoingTransition <em>Outgoing Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(AbstractState)
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.LifecyclePackage#getTransition_Source()
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.AbstractState#getOutgoingTransition
	 * @model opposite="outgoingTransition" required="true"
	 * @generated
	 */
	AbstractState getSource();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.extension.lifecycle.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AbstractState value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.spem.extension.lifecycle.AbstractState#getIncomingTransition <em>Incoming Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AbstractState)
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.LifecyclePackage#getTransition_Target()
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.AbstractState#getIncomingTransition
	 * @model opposite="incomingTransition" required="true"
	 * @generated
	 */
	AbstractState getTarget();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.extension.lifecycle.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AbstractState value);

} // Transition
