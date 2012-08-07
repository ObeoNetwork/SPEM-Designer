/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Breakdown Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.BreakdownElement#isHasMultipleOccurrences <em>Has Multiple Occurrences</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.BreakdownElement#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.BreakdownElement#isIsPlanned <em>Is Planned</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.BreakdownElement#getPlanningData <em>Planning Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getBreakdownElement()
 * @model abstract="true"
 * @generated
 */
public interface BreakdownElement extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Multiple Occurrences</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Multiple Occurrences</em>' attribute.
	 * @see #setHasMultipleOccurrences(boolean)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getBreakdownElement_HasMultipleOccurrences()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isHasMultipleOccurrences();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.BreakdownElement#isHasMultipleOccurrences <em>Has Multiple Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Multiple Occurrences</em>' attribute.
	 * @see #isHasMultipleOccurrences()
	 * @generated
	 */
	void setHasMultipleOccurrences(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Optional</em>' attribute.
	 * @see #setIsOptional(boolean)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getBreakdownElement_IsOptional()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsOptional();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.BreakdownElement#isIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optional</em>' attribute.
	 * @see #isIsOptional()
	 * @generated
	 */
	void setIsOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Planned</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Planned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Planned</em>' attribute.
	 * @see #setIsPlanned(boolean)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getBreakdownElement_IsPlanned()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsPlanned();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.BreakdownElement#isIsPlanned <em>Is Planned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Planned</em>' attribute.
	 * @see #isIsPlanned()
	 * @generated
	 */
	void setIsPlanned(boolean value);

	/**
	 * Returns the value of the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planning Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planning Data</em>' containment reference.
	 * @see #setPlanningData(PlanningData)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getBreakdownElement_PlanningData()
	 * @model containment="true"
	 * @generated
	 */
	PlanningData getPlanningData();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.BreakdownElement#getPlanningData <em>Planning Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planning Data</em>' containment reference.
	 * @see #getPlanningData()
	 * @generated
	 */
	void setPlanningData(PlanningData value);

} // BreakdownElement
