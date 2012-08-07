/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Product Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.WorkProductPort#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.WorkProductPort#getPortKind <em>Port Kind</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.WorkProductPort#getPortType <em>Port Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkProductPort()
 * @model
 * @generated
 */
public interface WorkProductPort extends ProcessElement {
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
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkProductPort_IsOptional()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsOptional();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.WorkProductPort#isIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optional</em>' attribute.
	 * @see #isIsOptional()
	 * @generated
	 */
	void setIsOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Port Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.spem.ParameterDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Kind</em>' attribute.
	 * @see org.obeonetwork.dsl.spem.ParameterDirectionKind
	 * @see #setPortKind(ParameterDirectionKind)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkProductPort_PortKind()
	 * @model ordered="false"
	 * @generated
	 */
	ParameterDirectionKind getPortKind();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.WorkProductPort#getPortKind <em>Port Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Kind</em>' attribute.
	 * @see org.obeonetwork.dsl.spem.ParameterDirectionKind
	 * @see #getPortKind()
	 * @generated
	 */
	void setPortKind(ParameterDirectionKind value);

	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type</em>' reference.
	 * @see #setPortType(WorkProductDefinition)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkProductPort_PortType()
	 * @model
	 * @generated
	 */
	WorkProductDefinition getPortType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.WorkProductPort#getPortType <em>Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Type</em>' reference.
	 * @see #getPortType()
	 * @generated
	 */
	void setPortType(WorkProductDefinition value);

} // WorkProductPort
