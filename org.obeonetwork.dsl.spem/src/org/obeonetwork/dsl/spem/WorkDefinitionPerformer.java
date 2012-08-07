/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Definition Performer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.WorkDefinitionPerformer#getLinkedWorkDefinition <em>Linked Work Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkDefinitionPerformer()
 * @model abstract="true"
 * @generated
 */
public interface WorkDefinitionPerformer extends EObject {
	/**
	 * Returns the value of the '<em><b>Linked Work Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Work Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Work Definition</em>' reference.
	 * @see #setLinkedWorkDefinition(WorkDefinition)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkDefinitionPerformer_LinkedWorkDefinition()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	WorkDefinition getLinkedWorkDefinition();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.WorkDefinitionPerformer#getLinkedWorkDefinition <em>Linked Work Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Work Definition</em>' reference.
	 * @see #getLinkedWorkDefinition()
	 * @generated
	 */
	void setLinkedWorkDefinition(WorkDefinition value);

} // WorkDefinitionPerformer
