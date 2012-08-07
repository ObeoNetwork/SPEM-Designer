/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bigpicture;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bigpicture.BigpictureFactory
 * @model kind="package"
 * @generated
 */
public interface BigpicturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bigpicture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.obeo.fr/spem/bigpicture";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bigpicture";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BigpicturePackage eINSTANCE = bigpicture.impl.BigpicturePackageImpl.init();

	/**
	 * The meta object id for the '{@link bigpicture.impl.BigPictureImpl <em>Big Picture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bigpicture.impl.BigPictureImpl
	 * @see bigpicture.impl.BigpicturePackageImpl#getBigPicture()
	 * @generated
	 */
	int BIG_PICTURE = 0;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_PICTURE__PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Use Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_PICTURE__USE_CASES = 1;

	/**
	 * The number of structural features of the '<em>Big Picture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_PICTURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link bigpicture.impl.PlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bigpicture.impl.PlatformImpl
	 * @see bigpicture.impl.BigpicturePackageImpl#getPlatform()
	 * @generated
	 */
	int PLATFORM = 1;

	/**
	 * The feature id for the '<em><b>Work Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__WORK_PACKAGES = 0;

	/**
	 * The number of structural features of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link bigpicture.impl.ActivityBPImpl <em>Activity BP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bigpicture.impl.ActivityBPImpl
	 * @see bigpicture.impl.BigpicturePackageImpl#getActivityBP()
	 * @generated
	 */
	int ACTIVITY_BP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_BP__NAME = 0;

	/**
	 * The number of structural features of the '<em>Activity BP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_BP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link bigpicture.impl.WorkPackageImpl <em>Work Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bigpicture.impl.WorkPackageImpl
	 * @see bigpicture.impl.BigpicturePackageImpl#getWorkPackage()
	 * @generated
	 */
	int WORK_PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__NAME = ACTIVITY_BP__NAME;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__TASKS = ACTIVITY_BP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Work Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE_FEATURE_COUNT = ACTIVITY_BP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link bigpicture.impl.TaskBPImpl <em>Task BP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bigpicture.impl.TaskBPImpl
	 * @see bigpicture.impl.BigpicturePackageImpl#getTaskBP()
	 * @generated
	 */
	int TASK_BP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BP__NAME = ACTIVITY_BP__NAME;

	/**
	 * The number of structural features of the '<em>Task BP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BP_FEATURE_COUNT = ACTIVITY_BP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link bigpicture.impl.UseCaseImpl <em>Use Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bigpicture.impl.UseCaseImpl
	 * @see bigpicture.impl.BigpicturePackageImpl#getUseCase()
	 * @generated
	 */
	int USE_CASE = 5;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__ASSIGNMENTS = 0;

	/**
	 * The number of structural features of the '<em>Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link bigpicture.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bigpicture.impl.AssignmentImpl
	 * @see bigpicture.impl.BigpicturePackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 6;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Work Breakdown Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__WORK_BREAKDOWN_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link bigpicture.BigPicture <em>Big Picture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Big Picture</em>'.
	 * @see bigpicture.BigPicture
	 * @generated
	 */
	EClass getBigPicture();

	/**
	 * Returns the meta object for the containment reference '{@link bigpicture.BigPicture#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Platform</em>'.
	 * @see bigpicture.BigPicture#getPlatform()
	 * @see #getBigPicture()
	 * @generated
	 */
	EReference getBigPicture_Platform();

	/**
	 * Returns the meta object for the containment reference list '{@link bigpicture.BigPicture#getUseCases <em>Use Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Use Cases</em>'.
	 * @see bigpicture.BigPicture#getUseCases()
	 * @see #getBigPicture()
	 * @generated
	 */
	EReference getBigPicture_UseCases();

	/**
	 * Returns the meta object for class '{@link bigpicture.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see bigpicture.Platform
	 * @generated
	 */
	EClass getPlatform();

	/**
	 * Returns the meta object for the containment reference list '{@link bigpicture.Platform#getWorkPackages <em>Work Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Work Packages</em>'.
	 * @see bigpicture.Platform#getWorkPackages()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_WorkPackages();

	/**
	 * Returns the meta object for class '{@link bigpicture.WorkPackage <em>Work Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Package</em>'.
	 * @see bigpicture.WorkPackage
	 * @generated
	 */
	EClass getWorkPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link bigpicture.WorkPackage#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see bigpicture.WorkPackage#getTasks()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EReference getWorkPackage_Tasks();

	/**
	 * Returns the meta object for class '{@link bigpicture.TaskBP <em>Task BP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task BP</em>'.
	 * @see bigpicture.TaskBP
	 * @generated
	 */
	EClass getTaskBP();

	/**
	 * Returns the meta object for class '{@link bigpicture.ActivityBP <em>Activity BP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity BP</em>'.
	 * @see bigpicture.ActivityBP
	 * @generated
	 */
	EClass getActivityBP();

	/**
	 * Returns the meta object for the attribute '{@link bigpicture.ActivityBP#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bigpicture.ActivityBP#getName()
	 * @see #getActivityBP()
	 * @generated
	 */
	EAttribute getActivityBP_Name();

	/**
	 * Returns the meta object for class '{@link bigpicture.UseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Case</em>'.
	 * @see bigpicture.UseCase
	 * @generated
	 */
	EClass getUseCase();

	/**
	 * Returns the meta object for the containment reference list '{@link bigpicture.UseCase#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignments</em>'.
	 * @see bigpicture.UseCase#getAssignments()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_Assignments();

	/**
	 * Returns the meta object for class '{@link bigpicture.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see bigpicture.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the reference '{@link bigpicture.Assignment#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see bigpicture.Assignment#getActivity()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Activity();

	/**
	 * Returns the meta object for the reference list '{@link bigpicture.Assignment#getWorkBreakdownElement <em>Work Breakdown Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Breakdown Element</em>'.
	 * @see bigpicture.Assignment#getWorkBreakdownElement()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_WorkBreakdownElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BigpictureFactory getBigpictureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bigpicture.impl.BigPictureImpl <em>Big Picture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bigpicture.impl.BigPictureImpl
		 * @see bigpicture.impl.BigpicturePackageImpl#getBigPicture()
		 * @generated
		 */
		EClass BIG_PICTURE = eINSTANCE.getBigPicture();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIG_PICTURE__PLATFORM = eINSTANCE.getBigPicture_Platform();

		/**
		 * The meta object literal for the '<em><b>Use Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIG_PICTURE__USE_CASES = eINSTANCE.getBigPicture_UseCases();

		/**
		 * The meta object literal for the '{@link bigpicture.impl.PlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bigpicture.impl.PlatformImpl
		 * @see bigpicture.impl.BigpicturePackageImpl#getPlatform()
		 * @generated
		 */
		EClass PLATFORM = eINSTANCE.getPlatform();

		/**
		 * The meta object literal for the '<em><b>Work Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM__WORK_PACKAGES = eINSTANCE.getPlatform_WorkPackages();

		/**
		 * The meta object literal for the '{@link bigpicture.impl.WorkPackageImpl <em>Work Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bigpicture.impl.WorkPackageImpl
		 * @see bigpicture.impl.BigpicturePackageImpl#getWorkPackage()
		 * @generated
		 */
		EClass WORK_PACKAGE = eINSTANCE.getWorkPackage();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PACKAGE__TASKS = eINSTANCE.getWorkPackage_Tasks();

		/**
		 * The meta object literal for the '{@link bigpicture.impl.TaskBPImpl <em>Task BP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bigpicture.impl.TaskBPImpl
		 * @see bigpicture.impl.BigpicturePackageImpl#getTaskBP()
		 * @generated
		 */
		EClass TASK_BP = eINSTANCE.getTaskBP();

		/**
		 * The meta object literal for the '{@link bigpicture.impl.ActivityBPImpl <em>Activity BP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bigpicture.impl.ActivityBPImpl
		 * @see bigpicture.impl.BigpicturePackageImpl#getActivityBP()
		 * @generated
		 */
		EClass ACTIVITY_BP = eINSTANCE.getActivityBP();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_BP__NAME = eINSTANCE.getActivityBP_Name();

		/**
		 * The meta object literal for the '{@link bigpicture.impl.UseCaseImpl <em>Use Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bigpicture.impl.UseCaseImpl
		 * @see bigpicture.impl.BigpicturePackageImpl#getUseCase()
		 * @generated
		 */
		EClass USE_CASE = eINSTANCE.getUseCase();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE__ASSIGNMENTS = eINSTANCE.getUseCase_Assignments();

		/**
		 * The meta object literal for the '{@link bigpicture.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bigpicture.impl.AssignmentImpl
		 * @see bigpicture.impl.BigpicturePackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__ACTIVITY = eINSTANCE.getAssignment_Activity();

		/**
		 * The meta object literal for the '<em><b>Work Breakdown Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__WORK_BREAKDOWN_ELEMENT = eINSTANCE.getAssignment_WorkBreakdownElement();

	}

} //BigpicturePackage
