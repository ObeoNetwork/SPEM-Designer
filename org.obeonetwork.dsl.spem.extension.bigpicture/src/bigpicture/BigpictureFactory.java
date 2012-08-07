/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bigpicture;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bigpicture.BigpicturePackage
 * @generated
 */
public interface BigpictureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BigpictureFactory eINSTANCE = bigpicture.impl.BigpictureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Big Picture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Big Picture</em>'.
	 * @generated
	 */
	BigPicture createBigPicture();

	/**
	 * Returns a new object of class '<em>Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform</em>'.
	 * @generated
	 */
	Platform createPlatform();

	/**
	 * Returns a new object of class '<em>Work Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Package</em>'.
	 * @generated
	 */
	WorkPackage createWorkPackage();

	/**
	 * Returns a new object of class '<em>Task BP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task BP</em>'.
	 * @generated
	 */
	TaskBP createTaskBP();

	/**
	 * Returns a new object of class '<em>Activity BP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity BP</em>'.
	 * @generated
	 */
	ActivityBP createActivityBP();

	/**
	 * Returns a new object of class '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Case</em>'.
	 * @generated
	 */
	UseCase createUseCase();

	/**
	 * Returns a new object of class '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment</em>'.
	 * @generated
	 */
	Assignment createAssignment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BigpicturePackage getBigpicturePackage();

} //BigpictureFactory
