/**
 * THALES (c)
 */
package activity;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.spem.BreakdownElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.Node#getIncomingEdge <em>Incoming Edge</em>}</li>
 *   <li>{@link activity.Node#getOutgoingEdge <em>Outgoing Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends BreakdownElement {
	/**
	 * Returns the value of the '<em><b>Incoming Edge</b></em>' reference list.
	 * The list contents are of type {@link activity.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Edge</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Edge</em>' reference list.
	 * @see activity.ActivityPackage#getNode_IncomingEdge()
	 * @model
	 * @generated
	 */
	EList<Edge> getIncomingEdge();

	/**
	 * Returns the value of the '<em><b>Outgoing Edge</b></em>' reference list.
	 * The list contents are of type {@link activity.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Edge</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Edge</em>' reference list.
	 * @see activity.ActivityPackage#getNode_OutgoingEdge()
	 * @model
	 * @generated
	 */
	EList<Edge> getOutgoingEdge();

} // Node
