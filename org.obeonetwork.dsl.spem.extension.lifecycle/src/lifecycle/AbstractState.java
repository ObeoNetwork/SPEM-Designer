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
 * A representation of the model object '<em><b>Abstract State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lifecycle.AbstractState#getIncomingTransition <em>Incoming Transition</em>}</li>
 *   <li>{@link lifecycle.AbstractState#getOutgoingTransition <em>Outgoing Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see lifecycle.LifecyclePackage#getAbstractState()
 * @model abstract="true"
 * @generated
 */
public interface AbstractState extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming Transition</b></em>' reference list.
	 * The list contents are of type {@link lifecycle.Transition}.
	 * It is bidirectional and its opposite is '{@link lifecycle.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transition</em>' reference list.
	 * @see lifecycle.LifecyclePackage#getAbstractState_IncomingTransition()
	 * @see lifecycle.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncomingTransition();

	/**
	 * Returns the value of the '<em><b>Outgoing Transition</b></em>' reference list.
	 * The list contents are of type {@link lifecycle.Transition}.
	 * It is bidirectional and its opposite is '{@link lifecycle.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transition</em>' reference list.
	 * @see lifecycle.LifecyclePackage#getAbstractState_OutgoingTransition()
	 * @see lifecycle.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoingTransition();

} // AbstractState
