/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.ProcessElement#getProcessKind <em>Process Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getProcessElement()
 * @model abstract="true"
 * @generated
 */
public interface ProcessElement extends DescribableElement, ProcessPackageableElement {
	/**
	 * Returns the value of the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Kind</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Kind</em>' reference.
	 * @see #setProcessKind(ProcessKind)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getProcessElement_ProcessKind()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	ProcessKind getProcessKind();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.ProcessElement#getProcessKind <em>Process Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Kind</em>' reference.
	 * @see #getProcessKind()
	 * @generated
	 */
	void setProcessKind(ProcessKind value);

} // ProcessElement
