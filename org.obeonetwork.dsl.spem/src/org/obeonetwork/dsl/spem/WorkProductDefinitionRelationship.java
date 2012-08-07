/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Product Definition Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.WorkProductDefinitionRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.WorkProductDefinitionRelationship#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkProductDefinitionRelationship()
 * @model
 * @generated
 */
public interface WorkProductDefinitionRelationship extends MethodContentElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(WorkProductDefinition)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkProductDefinitionRelationship_Source()
	 * @model required="true"
	 * @generated
	 */
	WorkProductDefinition getSource();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.WorkProductDefinitionRelationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(WorkProductDefinition value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.WorkProductDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkProductDefinitionRelationship_Target()
	 * @model required="true"
	 * @generated
	 */
	EList<WorkProductDefinition> getTarget();

} // WorkProductDefinitionRelationship
