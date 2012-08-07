/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Task Definition Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.Default_TaskDefinitionParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.Default_TaskDefinitionParameter#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.Default_TaskDefinitionParameter#getOptionality <em>Optionality</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getDefault_TaskDefinitionParameter()
 * @model
 * @generated
 */
public interface Default_TaskDefinitionParameter extends WorkDefinitionParameter {
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
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getDefault_TaskDefinitionParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.Default_TaskDefinitionParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Type</em>' reference.
	 * @see #setParameterType(WorkProductDefinition)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getDefault_TaskDefinitionParameter_ParameterType()
	 * @model
	 * @generated
	 */
	WorkProductDefinition getParameterType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.Default_TaskDefinitionParameter#getParameterType <em>Parameter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' reference.
	 * @see #getParameterType()
	 * @generated
	 */
	void setParameterType(WorkProductDefinition value);

	/**
	 * Returns the value of the '<em><b>Optionality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.spem.OptionalityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optionality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optionality</em>' attribute.
	 * @see org.obeonetwork.dsl.spem.OptionalityKind
	 * @see #setOptionality(OptionalityKind)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getDefault_TaskDefinitionParameter_Optionality()
	 * @model
	 * @generated
	 */
	OptionalityKind getOptionality();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.Default_TaskDefinitionParameter#getOptionality <em>Optionality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optionality</em>' attribute.
	 * @see org.obeonetwork.dsl.spem.OptionalityKind
	 * @see #getOptionality()
	 * @generated
	 */
	void setOptionality(OptionalityKind value);

} // Default_TaskDefinitionParameter
