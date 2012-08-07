/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Performer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.ProcessPerformer#getLinkedRoleUse <em>Linked Role Use</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.ProcessPerformer#getLinkedActivity <em>Linked Activity</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.ProcessPerformer#getLinkedTaskUse <em>Linked Task Use</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getProcessPerformer()
 * @model
 * @generated
 */
public interface ProcessPerformer extends WorkDefinitionPerformer, BreakdownElement {
	/**
	 * Returns the value of the '<em><b>Linked Role Use</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.RoleUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Role Use</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Role Use</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getProcessPerformer_LinkedRoleUse()
	 * @model required="true"
	 * @generated
	 */
	EList<RoleUse> getLinkedRoleUse();

	/**
	 * Returns the value of the '<em><b>Linked Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Activity</em>' reference.
	 * @see #setLinkedActivity(Activity)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getProcessPerformer_LinkedActivity()
	 * @model
	 * @generated
	 */
	Activity getLinkedActivity();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.ProcessPerformer#getLinkedActivity <em>Linked Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Activity</em>' reference.
	 * @see #getLinkedActivity()
	 * @generated
	 */
	void setLinkedActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Linked Task Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Task Use</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Task Use</em>' reference.
	 * @see #setLinkedTaskUse(TaskUse)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getProcessPerformer_LinkedTaskUse()
	 * @model
	 * @generated
	 */
	TaskUse getLinkedTaskUse();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.ProcessPerformer#getLinkedTaskUse <em>Linked Task Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Task Use</em>' reference.
	 * @see #getLinkedTaskUse()
	 * @generated
	 */
	void setLinkedTaskUse(TaskUse value);

} // ProcessPerformer
