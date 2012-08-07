/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Component Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.ProcessComponentUse#getProcessComponent <em>Process Component</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.ProcessComponentUse#getUsedPort <em>Used Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getProcessComponentUse()
 * @model
 * @generated
 */
public interface ProcessComponentUse extends MethodContentUse {
	/**
	 * Returns the value of the '<em><b>Process Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Component</em>' reference.
	 * @see #setProcessComponent(ProcessComponent)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getProcessComponentUse_ProcessComponent()
	 * @model required="true"
	 * @generated
	 */
	ProcessComponent getProcessComponent();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.ProcessComponentUse#getProcessComponent <em>Process Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Component</em>' reference.
	 * @see #getProcessComponent()
	 * @generated
	 */
	void setProcessComponent(ProcessComponent value);

	/**
	 * Returns the value of the '<em><b>Used Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.WorkProductPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Port</em>' containment reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getProcessComponentUse_UsedPort()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkProductPort> getUsedPort();

} // ProcessComponentUse
