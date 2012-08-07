/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.ProcessParameter#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.ProcessParameter#getOptionality <em>Optionality</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getProcessParameter()
 * @model annotation="add-ons Thales\040R&T='optionality (bug in the spec)'"
 * @generated
 */
public interface ProcessParameter extends WorkDefinitionParameter, BreakdownElement {
	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Type</em>' reference.
	 * @see #setParameterType(WorkProductUse)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getProcessParameter_ParameterType()
	 * @model
	 * @generated
	 */
	WorkProductUse getParameterType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.ProcessParameter#getParameterType <em>Parameter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' reference.
	 * @see #getParameterType()
	 * @generated
	 */
	void setParameterType(WorkProductUse value);

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
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getProcessParameter_Optionality()
	 * @model
	 * @generated
	 */
	OptionalityKind getOptionality();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.ProcessParameter#getOptionality <em>Optionality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optionality</em>' attribute.
	 * @see org.obeonetwork.dsl.spem.OptionalityKind
	 * @see #getOptionality()
	 * @generated
	 */
	void setOptionality(OptionalityKind value);

} // ProcessParameter
