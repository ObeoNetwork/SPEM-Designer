/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.WorkDefinition#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.WorkDefinition#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.WorkDefinition#getOwnedParameter <em>Owned Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkDefinition()
 * @model abstract="true"
 * @generated
 */
public interface WorkDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Pre Condition</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Condition</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Condition</em>' attribute list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkDefinition_PreCondition()
	 * @model
	 * @generated
	 */
	EList<String> getPreCondition();

	/**
	 * Returns the value of the '<em><b>Post Condition</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Condition</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Condition</em>' attribute list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkDefinition_PostCondition()
	 * @model
	 * @generated
	 */
	EList<String> getPostCondition();

	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.WorkDefinitionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkDefinition_OwnedParameter()
	 * @model resolveProxies="false" transient="true" derived="true"
	 *        annotation="TODO implem='isDerived'"
	 * @generated
	 */
	EList<WorkDefinitionParameter> getOwnedParameter();

} // WorkDefinition
