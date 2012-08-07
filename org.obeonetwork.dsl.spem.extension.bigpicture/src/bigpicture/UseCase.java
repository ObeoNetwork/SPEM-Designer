/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bigpicture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bigpicture.UseCase#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see bigpicture.BigpicturePackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link bigpicture.Assignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' containment reference list.
	 * @see bigpicture.BigpicturePackage#getUseCase_Assignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assignment> getAssignments();

} // UseCase
