/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.ProcessComponent#getProcess <em>Process</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.ProcessComponent#getOwnedPort <em>Owned Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getProcessComponent()
 * @model
 * @generated
 */
public interface ProcessComponent extends ProcessPackage {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference.
	 * @see #setProcess(Activity)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getProcessComponent_Process()
	 * @model containment="true"
	 * @generated
	 */
	Activity getProcess();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.ProcessComponent#getProcess <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' containment reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(Activity value);

	/**
	 * Returns the value of the '<em><b>Owned Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.WorkProductPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Port</em>' containment reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getProcessComponent_OwnedPort()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkProductPort> getOwnedPort();

} // ProcessComponent
