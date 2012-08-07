/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.spem.Category;
import org.obeonetwork.dsl.spem.TaskDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discipline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.Discipline#getRelatedTask <em>Related Task</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.Discipline#getRelatedWorflow <em>Related Worflow</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getDiscipline()
 * @model
 * @generated
 */
public interface Discipline extends Category {
	/**
	 * Returns the value of the '<em><b>Related Task</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.TaskDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Task</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Task</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getDiscipline_RelatedTask()
	 * @model
	 * @generated
	 */
	EList<TaskDefinition> getRelatedTask();

	/**
	 * Returns the value of the '<em><b>Related Worflow</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.uma.Process}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Worflow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Worflow</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getDiscipline_RelatedWorflow()
	 * @model
	 * @generated
	 */
	EList<org.obeonetwork.dsl.spem.uma.Process> getRelatedWorflow();

} // Discipline
