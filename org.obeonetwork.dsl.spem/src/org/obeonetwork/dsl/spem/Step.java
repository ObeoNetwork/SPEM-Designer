/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.Step#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.Step#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.Step#getSuccessor <em>Successor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getStep()
 * @model annotation="add-ons Thales\040R&T='predecessor, successor in order to replace Section metaclass'"
 * @generated
 */
public interface Step extends WorkDefinition, DescribableElement, VariabilityElement {
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
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getStep_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.Step#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.spem.Step#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor</em>' reference.
	 * @see #setPredecessor(Step)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getStep_Predecessor()
	 * @see org.obeonetwork.dsl.spem.Step#getSuccessor
	 * @model opposite="successor"
	 * @generated
	 */
	Step getPredecessor();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.Step#getPredecessor <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(Step value);

	/**
	 * Returns the value of the '<em><b>Successor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.spem.Step#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' reference.
	 * @see #setSuccessor(Step)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getStep_Successor()
	 * @see org.obeonetwork.dsl.spem.Step#getPredecessor
	 * @model opposite="predecessor"
	 * @generated
	 */
	Step getSuccessor();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.Step#getSuccessor <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successor</em>' reference.
	 * @see #getSuccessor()
	 * @generated
	 */
	void setSuccessor(Step value);

} // Step
