/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Breakdown Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.WorkBreakdownElement#isIsRepeatable <em>Is Repeatable</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.WorkBreakdownElement#isIsOngoing <em>Is Ongoing</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.WorkBreakdownElement#isIsEventDriven <em>Is Event Driven</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.WorkBreakdownElement#getLinkToPredecessor <em>Link To Predecessor</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.WorkBreakdownElement#getLinkToSuccessor <em>Link To Successor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkBreakdownElement()
 * @model abstract="true"
 * @generated
 */
public interface WorkBreakdownElement extends BreakdownElement {
	/**
	 * Returns the value of the '<em><b>Is Repeatable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Repeatable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Repeatable</em>' attribute.
	 * @see #setIsRepeatable(boolean)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkBreakdownElement_IsRepeatable()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsRepeatable();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.WorkBreakdownElement#isIsRepeatable <em>Is Repeatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Repeatable</em>' attribute.
	 * @see #isIsRepeatable()
	 * @generated
	 */
	void setIsRepeatable(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Ongoing</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ongoing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ongoing</em>' attribute.
	 * @see #setIsOngoing(boolean)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkBreakdownElement_IsOngoing()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsOngoing();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.WorkBreakdownElement#isIsOngoing <em>Is Ongoing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ongoing</em>' attribute.
	 * @see #isIsOngoing()
	 * @generated
	 */
	void setIsOngoing(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Event Driven</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Event Driven</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Event Driven</em>' attribute.
	 * @see #setIsEventDriven(boolean)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkBreakdownElement_IsEventDriven()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsEventDriven();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.WorkBreakdownElement#isIsEventDriven <em>Is Event Driven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Event Driven</em>' attribute.
	 * @see #isIsEventDriven()
	 * @generated
	 */
	void setIsEventDriven(boolean value);

	/**
	 * Returns the value of the '<em><b>Link To Predecessor</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.WorkSequence}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.spem.WorkSequence#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link To Predecessor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To Predecessor</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkBreakdownElement_LinkToPredecessor()
	 * @see org.obeonetwork.dsl.spem.WorkSequence#getSuccessor
	 * @model opposite="successor"
	 * @generated
	 */
	EList<WorkSequence> getLinkToPredecessor();

	/**
	 * Returns the value of the '<em><b>Link To Successor</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.WorkSequence}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.spem.WorkSequence#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link To Successor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To Successor</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkBreakdownElement_LinkToSuccessor()
	 * @see org.obeonetwork.dsl.spem.WorkSequence#getPredecessor
	 * @model opposite="predecessor"
	 * @generated
	 */
	EList<WorkSequence> getLinkToSuccessor();

} // WorkBreakdownElement
