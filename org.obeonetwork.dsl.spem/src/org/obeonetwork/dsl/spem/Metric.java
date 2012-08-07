/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.Metric#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getMetric()
 * @model
 * @generated
 */
public interface Metric extends DescribableElement {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getMetric_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.Metric#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // Metric
