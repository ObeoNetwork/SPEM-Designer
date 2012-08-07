/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Responsibility Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.ProcessResponsibilityAssignment#getLinkedRoleUse <em>Linked Role Use</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.ProcessResponsibilityAssignment#getLinkedWorkProductUse <em>Linked Work Product Use</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getProcessResponsibilityAssignment()
 * @model
 * @generated
 */
public interface ProcessResponsibilityAssignment extends BreakdownElement {
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
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getProcessResponsibilityAssignment_LinkedRoleUse()
	 * @model required="true"
	 * @generated
	 */
	EList<RoleUse> getLinkedRoleUse();

	/**
	 * Returns the value of the '<em><b>Linked Work Product Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Work Product Use</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Work Product Use</em>' reference.
	 * @see #setLinkedWorkProductUse(WorkProductUse)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getProcessResponsibilityAssignment_LinkedWorkProductUse()
	 * @model required="true"
	 * @generated
	 */
	WorkProductUse getLinkedWorkProductUse();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.ProcessResponsibilityAssignment#getLinkedWorkProductUse <em>Linked Work Product Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Work Product Use</em>' reference.
	 * @see #getLinkedWorkProductUse()
	 * @generated
	 */
	void setLinkedWorkProductUse(WorkProductUse value);

} // ProcessResponsibilityAssignment
