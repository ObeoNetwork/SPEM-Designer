/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Content Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.MethodContentElement#getMethodContentKind <em>Method Content Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getMethodContentElement()
 * @model abstract="true"
 * @generated
 */
public interface MethodContentElement extends DescribableElement, MethodContentPackageableElement, VariabilityElement {
	/**
	 * Returns the value of the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Content Kind</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Content Kind</em>' reference.
	 * @see #setMethodContentKind(MethodContentKind)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getMethodContentElement_MethodContentKind()
	 * @model
	 * @generated
	 */
	MethodContentKind getMethodContentKind();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.MethodContentElement#getMethodContentKind <em>Method Content Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Content Kind</em>' reference.
	 * @see #getMethodContentKind()
	 * @generated
	 */
	void setMethodContentKind(MethodContentKind value);

} // MethodContentElement
