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
 * A representation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bigpicture.Platform#getWorkPackages <em>Work Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see bigpicture.BigpicturePackage#getPlatform()
 * @model
 * @generated
 */
public interface Platform extends EObject {
	/**
	 * Returns the value of the '<em><b>Work Packages</b></em>' containment reference list.
	 * The list contents are of type {@link bigpicture.WorkPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Packages</em>' containment reference list.
	 * @see bigpicture.BigpicturePackage#getPlatform_WorkPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkPackage> getWorkPackages();

} // Platform
