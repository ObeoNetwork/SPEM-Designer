/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bigpicture.impl;

import bigpicture.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BigpictureFactoryImpl extends EFactoryImpl implements BigpictureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BigpictureFactory init() {
		try {
			BigpictureFactory theBigpictureFactory = (BigpictureFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.obeo.fr/spem/bigpicture"); 
			if (theBigpictureFactory != null) {
				return theBigpictureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BigpictureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigpictureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BigpicturePackage.BIG_PICTURE: return createBigPicture();
			case BigpicturePackage.PLATFORM: return createPlatform();
			case BigpicturePackage.WORK_PACKAGE: return createWorkPackage();
			case BigpicturePackage.TASK_BP: return createTaskBP();
			case BigpicturePackage.ACTIVITY_BP: return createActivityBP();
			case BigpicturePackage.USE_CASE: return createUseCase();
			case BigpicturePackage.ASSIGNMENT: return createAssignment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigPicture createBigPicture() {
		BigPictureImpl bigPicture = new BigPictureImpl();
		return bigPicture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform createPlatform() {
		PlatformImpl platform = new PlatformImpl();
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkPackage createWorkPackage() {
		WorkPackageImpl workPackage = new WorkPackageImpl();
		return workPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskBP createTaskBP() {
		TaskBPImpl taskBP = new TaskBPImpl();
		return taskBP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityBP createActivityBP() {
		ActivityBPImpl activityBP = new ActivityBPImpl();
		return activityBP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase createUseCase() {
		UseCaseImpl useCase = new UseCaseImpl();
		return useCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigpicturePackage getBigpicturePackage() {
		return (BigpicturePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BigpicturePackage getPackage() {
		return BigpicturePackage.eINSTANCE;
	}

} //BigpictureFactoryImpl
