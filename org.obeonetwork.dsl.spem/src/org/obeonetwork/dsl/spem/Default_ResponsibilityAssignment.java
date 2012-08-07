/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Responsibility Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.Default_ResponsibilityAssignment#getLinkedRoleDefinition <em>Linked Role Definition</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.Default_ResponsibilityAssignment#getLinkedWorkProductDefinition <em>Linked Work Product Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getDefault_ResponsibilityAssignment()
 * @model
 * @generated
 */
public interface Default_ResponsibilityAssignment extends MethodContentElement {
	/**
	 * Returns the value of the '<em><b>Linked Role Definition</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.RoleDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Role Definition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Role Definition</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getDefault_ResponsibilityAssignment_LinkedRoleDefinition()
	 * @model required="true"
	 * @generated
	 */
	EList<RoleDefinition> getLinkedRoleDefinition();

	/**
	 * Returns the value of the '<em><b>Linked Work Product Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Work Product Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Work Product Definition</em>' reference.
	 * @see #setLinkedWorkProductDefinition(WorkProductDefinition)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getDefault_ResponsibilityAssignment_LinkedWorkProductDefinition()
	 * @model required="true"
	 * @generated
	 */
	WorkProductDefinition getLinkedWorkProductDefinition();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.Default_ResponsibilityAssignment#getLinkedWorkProductDefinition <em>Linked Work Product Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Work Product Definition</em>' reference.
	 * @see #getLinkedWorkProductDefinition()
	 * @generated
	 */
	void setLinkedWorkProductDefinition(WorkProductDefinition value);

} // Default_ResponsibilityAssignment
