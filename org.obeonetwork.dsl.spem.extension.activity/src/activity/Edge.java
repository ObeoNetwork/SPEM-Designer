/**
 * THALES (c)
 */
package activity;

import org.obeonetwork.dsl.spem.BreakdownElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.Edge#getGuard <em>Guard</em>}</li>
 *   <li>{@link activity.Edge#getSource <em>Source</em>}</li>
 *   <li>{@link activity.Edge#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends BreakdownElement {
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
	 * @see activity.ActivityPackage#getEdge_Guard()
	 * @model
	 * @generated
	 */
	String getGuard();

	/**
	 * Sets the value of the '{@link activity.Edge#getGuard <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' attribute.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(BreakdownElement)
	 * @see activity.ActivityPackage#getEdge_Source()
	 * @model required="true"
	 * @generated
	 */
	BreakdownElement getSource();

	/**
	 * Sets the value of the '{@link activity.Edge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(BreakdownElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(BreakdownElement)
	 * @see activity.ActivityPackage#getEdge_Target()
	 * @model required="true"
	 * @generated
	 */
	BreakdownElement getTarget();

	/**
	 * Sets the value of the '{@link activity.Edge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(BreakdownElement value);

} // Edge
