/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.TaskUse#getTask <em>Task</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.TaskUse#getUsedQualification <em>Used Qualification</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.TaskUse#getSelectedStep <em>Selected Step</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.TaskUse#getOwnedProcessParameter <em>Owned Process Parameter</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.TaskUse#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.TaskUse#getPostCondition <em>Post Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getTaskUse()
 * @model
 * @generated
 */
public interface TaskUse extends MethodContentUse, WorkBreakdownElement {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(TaskDefinition)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getTaskUse_Task()
	 * @model
	 * @generated
	 */
	TaskDefinition getTask();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.TaskUse#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(TaskDefinition value);

	/**
	 * Returns the value of the '<em><b>Used Qualification</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.Qualification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Qualification</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Qualification</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getTaskUse_UsedQualification()
	 * @model
	 * @generated
	 */
	EList<Qualification> getUsedQualification();

	/**
	 * Returns the value of the '<em><b>Selected Step</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Step</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Step</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getTaskUse_SelectedStep()
	 * @model
	 * @generated
	 */
	EList<Step> getSelectedStep();

	/**
	 * Returns the value of the '<em><b>Owned Process Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.ProcessParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Process Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Process Parameter</em>' containment reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getTaskUse_OwnedProcessParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessParameter> getOwnedProcessParameter();

	/**
	 * Returns the value of the '<em><b>Pre Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Condition</em>' attribute.
	 * @see #setPreCondition(String)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getTaskUse_PreCondition()
	 * @model
	 * @generated
	 */
	String getPreCondition();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.TaskUse#getPreCondition <em>Pre Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Condition</em>' attribute.
	 * @see #getPreCondition()
	 * @generated
	 */
	void setPreCondition(String value);

	/**
	 * Returns the value of the '<em><b>Post Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Condition</em>' attribute.
	 * @see #setPostCondition(String)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getTaskUse_PostCondition()
	 * @model
	 * @generated
	 */
	String getPostCondition();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.TaskUse#getPostCondition <em>Post Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Condition</em>' attribute.
	 * @see #getPostCondition()
	 * @generated
	 */
	void setPostCondition(String value);

} // TaskUse
