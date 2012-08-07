/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.TaskDefinition#getOwnedTaskDefinitionParameter <em>Owned Task Definition Parameter</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.TaskDefinition#getUsedTool <em>Used Tool</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.TaskDefinition#getStep <em>Step</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.TaskDefinition#getRequiredQualification <em>Required Qualification</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getTaskDefinition()
 * @model
 * @generated
 */
public interface TaskDefinition extends WorkDefinition, MethodContentElement {
	/**
	 * Returns the value of the '<em><b>Owned Task Definition Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.Default_TaskDefinitionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Task Definition Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Task Definition Parameter</em>' containment reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getTaskDefinition_OwnedTaskDefinitionParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Default_TaskDefinitionParameter> getOwnedTaskDefinitionParameter();

	/**
	 * Returns the value of the '<em><b>Used Tool</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.ToolDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Tool</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Tool</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getTaskDefinition_UsedTool()
	 * @model
	 * @generated
	 */
	EList<ToolDefinition> getUsedTool();

	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getTaskDefinition_Step()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getStep();

	/**
	 * Returns the value of the '<em><b>Required Qualification</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.Qualification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Qualification</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Qualification</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getTaskDefinition_RequiredQualification()
	 * @model
	 * @generated
	 */
	EList<Qualification> getRequiredQualification();

} // TaskDefinition
