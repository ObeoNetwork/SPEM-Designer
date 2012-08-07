/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bigpicture.impl;

import bigpicture.ActivityBP;
import bigpicture.Assignment;
import bigpicture.BigPicture;
import bigpicture.BigpictureFactory;
import bigpicture.BigpicturePackage;
import bigpicture.Platform;
import bigpicture.TaskBP;
import bigpicture.UseCase;
import bigpicture.WorkPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.obeonetwork.dsl.spem.SpemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BigpicturePackageImpl extends EPackageImpl implements BigpicturePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bigPictureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskBPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityBPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see bigpicture.BigpicturePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BigpicturePackageImpl() {
		super(eNS_URI, BigpictureFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BigpicturePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BigpicturePackage init() {
		if (isInited) return (BigpicturePackage)EPackage.Registry.INSTANCE.getEPackage(BigpicturePackage.eNS_URI);

		// Obtain or create and register package
		BigpicturePackageImpl theBigpicturePackage = (BigpicturePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BigpicturePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BigpicturePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SpemPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBigpicturePackage.createPackageContents();

		// Initialize created meta-data
		theBigpicturePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBigpicturePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BigpicturePackage.eNS_URI, theBigpicturePackage);
		return theBigpicturePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBigPicture() {
		return bigPictureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBigPicture_Platform() {
		return (EReference)bigPictureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBigPicture_UseCases() {
		return (EReference)bigPictureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatform() {
		return platformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatform_WorkPackages() {
		return (EReference)platformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkPackage() {
		return workPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkPackage_Tasks() {
		return (EReference)workPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskBP() {
		return taskBPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityBP() {
		return activityBPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityBP_Name() {
		return (EAttribute)activityBPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseCase() {
		return useCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_Assignments() {
		return (EReference)useCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Activity() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_WorkBreakdownElement() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigpictureFactory getBigpictureFactory() {
		return (BigpictureFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bigPictureEClass = createEClass(BIG_PICTURE);
		createEReference(bigPictureEClass, BIG_PICTURE__PLATFORM);
		createEReference(bigPictureEClass, BIG_PICTURE__USE_CASES);

		platformEClass = createEClass(PLATFORM);
		createEReference(platformEClass, PLATFORM__WORK_PACKAGES);

		workPackageEClass = createEClass(WORK_PACKAGE);
		createEReference(workPackageEClass, WORK_PACKAGE__TASKS);

		taskBPEClass = createEClass(TASK_BP);

		activityBPEClass = createEClass(ACTIVITY_BP);
		createEAttribute(activityBPEClass, ACTIVITY_BP__NAME);

		useCaseEClass = createEClass(USE_CASE);
		createEReference(useCaseEClass, USE_CASE__ASSIGNMENTS);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEReference(assignmentEClass, ASSIGNMENT__ACTIVITY);
		createEReference(assignmentEClass, ASSIGNMENT__WORK_BREAKDOWN_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SpemPackage theSpemPackage = (SpemPackage)EPackage.Registry.INSTANCE.getEPackage(SpemPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		workPackageEClass.getESuperTypes().add(this.getActivityBP());
		taskBPEClass.getESuperTypes().add(this.getActivityBP());

		// Initialize classes and features; add operations and parameters
		initEClass(bigPictureEClass, BigPicture.class, "BigPicture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBigPicture_Platform(), this.getPlatform(), null, "platform", null, 1, 1, BigPicture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBigPicture_UseCases(), this.getUseCase(), null, "useCases", null, 0, -1, BigPicture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformEClass, Platform.class, "Platform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatform_WorkPackages(), this.getWorkPackage(), null, "workPackages", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workPackageEClass, WorkPackage.class, "WorkPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkPackage_Tasks(), this.getTaskBP(), null, "tasks", null, 0, -1, WorkPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskBPEClass, TaskBP.class, "TaskBP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityBPEClass, ActivityBP.class, "ActivityBP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityBP_Name(), ecorePackage.getEString(), "name", null, 1, 1, ActivityBP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(useCaseEClass, UseCase.class, "UseCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUseCase_Assignments(), this.getAssignment(), null, "assignments", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignment_Activity(), this.getActivityBP(), null, "activity", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignment_WorkBreakdownElement(), theSpemPackage.getWorkBreakdownElement(), null, "workBreakdownElement", null, 0, -1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BigpicturePackageImpl
