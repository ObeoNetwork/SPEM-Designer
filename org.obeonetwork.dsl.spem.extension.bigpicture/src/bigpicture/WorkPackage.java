/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bigpicture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bigpicture.WorkPackage#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see bigpicture.BigpicturePackage#getWorkPackage()
 * @model
 * @generated
 */
public interface WorkPackage extends ActivityBP {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link bigpicture.TaskBP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see bigpicture.BigpicturePackage#getWorkPackage_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskBP> getTasks();

} // WorkPackage
