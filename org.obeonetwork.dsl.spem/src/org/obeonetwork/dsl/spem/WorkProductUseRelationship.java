/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Product Use Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.WorkProductUseRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.WorkProductUseRelationship#getTarget <em>Target</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.WorkProductUseRelationship#getRelationshipKind <em>Relationship Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkProductUseRelationship()
 * @model annotation="add-ons uma='relationshipkind'"
 * @generated
 */
public interface WorkProductUseRelationship extends BreakdownElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(WorkProductUse)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkProductUseRelationship_Source()
	 * @model required="true"
	 * @generated
	 */
	WorkProductUse getSource();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.WorkProductUseRelationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(WorkProductUse value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.WorkProductUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkProductUseRelationship_Target()
	 * @model required="true"
	 * @generated
	 */
	EList<WorkProductUse> getTarget();

	/**
	 * Returns the value of the '<em><b>Relationship Kind</b></em>' attribute.
	 * The default value is <code>"impactedBy"</code>.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.spem.WorkProductRelationshipKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Kind</em>' attribute.
	 * @see org.obeonetwork.dsl.spem.WorkProductRelationshipKind
	 * @see #setRelationshipKind(WorkProductRelationshipKind)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkProductUseRelationship_RelationshipKind()
	 * @model default="impactedBy" required="true"
	 * @generated
	 */
	WorkProductRelationshipKind getRelationshipKind();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.WorkProductUseRelationship#getRelationshipKind <em>Relationship Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Kind</em>' attribute.
	 * @see org.obeonetwork.dsl.spem.WorkProductRelationshipKind
	 * @see #getRelationshipKind()
	 * @generated
	 */
	void setRelationshipKind(WorkProductRelationshipKind value);

} // WorkProductUseRelationship
