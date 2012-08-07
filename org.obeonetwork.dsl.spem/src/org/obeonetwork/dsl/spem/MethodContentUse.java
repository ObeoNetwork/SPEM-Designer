/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Content Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.MethodContentUse#isIsSynchronizedWithSource <em>Is Synchronized With Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getMethodContentUse()
 * @model abstract="true"
 * @generated
 */
public interface MethodContentUse extends BreakdownElement {
	/**
	 * Returns the value of the '<em><b>Is Synchronized With Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Synchronized With Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Synchronized With Source</em>' attribute.
	 * @see #setIsSynchronizedWithSource(boolean)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getMethodContentUse_IsSynchronizedWithSource()
	 * @model
	 * @generated
	 */
	boolean isIsSynchronizedWithSource();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.MethodContentUse#isIsSynchronizedWithSource <em>Is Synchronized With Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Synchronized With Source</em>' attribute.
	 * @see #isIsSynchronizedWithSource()
	 * @generated
	 */
	void setIsSynchronizedWithSource(boolean value);

} // MethodContentUse
