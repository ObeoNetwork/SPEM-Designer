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
 * A representation of the model object '<em><b>Big Picture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bigpicture.BigPicture#getPlatform <em>Platform</em>}</li>
 *   <li>{@link bigpicture.BigPicture#getUseCases <em>Use Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @see bigpicture.BigpicturePackage#getBigPicture()
 * @model
 * @generated
 */
public interface BigPicture extends EObject {
	/**
	 * Returns the value of the '<em><b>Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' containment reference.
	 * @see #setPlatform(Platform)
	 * @see bigpicture.BigpicturePackage#getBigPicture_Platform()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Platform getPlatform();

	/**
	 * Sets the value of the '{@link bigpicture.BigPicture#getPlatform <em>Platform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' containment reference.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(Platform value);

	/**
	 * Returns the value of the '<em><b>Use Cases</b></em>' containment reference list.
	 * The list contents are of type {@link bigpicture.UseCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Cases</em>' containment reference list.
	 * @see bigpicture.BigpicturePackage#getBigPicture_UseCases()
	 * @model containment="true"
	 * @generated
	 */
	EList<UseCase> getUseCases();

} // BigPicture
