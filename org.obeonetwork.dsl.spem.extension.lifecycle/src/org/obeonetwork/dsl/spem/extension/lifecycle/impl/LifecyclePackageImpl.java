/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.extension.lifecycle.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.obeonetwork.dsl.spem.SpemPackage;

import org.obeonetwork.dsl.spem.extension.lifecycle.AbstractState;
import org.obeonetwork.dsl.spem.extension.lifecycle.FinalState;
import org.obeonetwork.dsl.spem.extension.lifecycle.InitialState;
import org.obeonetwork.dsl.spem.extension.lifecycle.LifeCycle;
import org.obeonetwork.dsl.spem.extension.lifecycle.LifecycleElement;
import org.obeonetwork.dsl.spem.extension.lifecycle.LifecycleFactory;
import org.obeonetwork.dsl.spem.extension.lifecycle.LifecyclePackage;
import org.obeonetwork.dsl.spem.extension.lifecycle.State;
import org.obeonetwork.dsl.spem.extension.lifecycle.Transition;
import org.obeonetwork.dsl.spem.extension.lifecycle.WorkProductDefinition;
import org.obeonetwork.dsl.spem.extension.lifecycle.WorkProductUse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LifecyclePackageImpl extends EPackageImpl implements LifecyclePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifeCycleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifecycleElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workProductUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workProductDefinitionEClass = null;

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
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.LifecyclePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LifecyclePackageImpl() {
		super(eNS_URI, LifecycleFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LifecyclePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LifecyclePackage init() {
		if (isInited) return (LifecyclePackage)EPackage.Registry.INSTANCE.getEPackage(LifecyclePackage.eNS_URI);

		// Obtain or create and register package
		LifecyclePackageImpl theLifecyclePackage = (LifecyclePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LifecyclePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LifecyclePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SpemPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLifecyclePackage.createPackageContents();

		// Initialize created meta-data
		theLifecyclePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLifecyclePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LifecyclePackage.eNS_URI, theLifecyclePackage);
		return theLifecyclePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLifeCycle() {
		return lifeCycleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLifeCycle_Name() {
		return (EAttribute)lifeCycleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeCycle_OwnedState() {
		return (EReference)lifeCycleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeCycle_OwnedTransition() {
		return (EReference)lifeCycleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractState() {
		return abstractStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractState_IncomingTransition() {
		return (EReference)abstractStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractState_OutgoingTransition() {
		return (EReference)abstractStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Name() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialState() {
		return initialStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalState() {
		return finalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Guard() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLifecycleElement() {
		return lifecycleElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifecycleElement_Lifecycle() {
		return (EReference)lifecycleElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkProductUse() {
		return workProductUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkProductDefinition() {
		return workProductDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifecycleFactory getLifecycleFactory() {
		return (LifecycleFactory)getEFactoryInstance();
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
		lifeCycleEClass = createEClass(LIFE_CYCLE);
		createEAttribute(lifeCycleEClass, LIFE_CYCLE__NAME);
		createEReference(lifeCycleEClass, LIFE_CYCLE__OWNED_STATE);
		createEReference(lifeCycleEClass, LIFE_CYCLE__OWNED_TRANSITION);

		abstractStateEClass = createEClass(ABSTRACT_STATE);
		createEReference(abstractStateEClass, ABSTRACT_STATE__INCOMING_TRANSITION);
		createEReference(abstractStateEClass, ABSTRACT_STATE__OUTGOING_TRANSITION);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__NAME);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__GUARD);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);

		lifecycleElementEClass = createEClass(LIFECYCLE_ELEMENT);
		createEReference(lifecycleElementEClass, LIFECYCLE_ELEMENT__LIFECYCLE);

		workProductUseEClass = createEClass(WORK_PRODUCT_USE);

		workProductDefinitionEClass = createEClass(WORK_PRODUCT_DEFINITION);
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
		stateEClass.getESuperTypes().add(this.getAbstractState());
		initialStateEClass.getESuperTypes().add(this.getAbstractState());
		finalStateEClass.getESuperTypes().add(this.getAbstractState());
		workProductUseEClass.getESuperTypes().add(theSpemPackage.getWorkProductUse());
		workProductUseEClass.getESuperTypes().add(this.getLifecycleElement());
		workProductDefinitionEClass.getESuperTypes().add(theSpemPackage.getWorkProductDefinition());
		workProductDefinitionEClass.getESuperTypes().add(this.getLifecycleElement());

		// Initialize classes and features; add operations and parameters
		initEClass(lifeCycleEClass, LifeCycle.class, "LifeCycle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLifeCycle_Name(), ecorePackage.getEString(), "name", null, 0, 1, LifeCycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLifeCycle_OwnedState(), this.getAbstractState(), null, "ownedState", null, 0, -1, LifeCycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLifeCycle_OwnedTransition(), this.getTransition(), null, "ownedTransition", null, 0, -1, LifeCycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractStateEClass, AbstractState.class, "AbstractState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractState_IncomingTransition(), this.getTransition(), this.getTransition_Target(), "incomingTransition", null, 0, -1, AbstractState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractState_OutgoingTransition(), this.getTransition(), this.getTransition_Source(), "outgoingTransition", null, 0, -1, AbstractState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Guard(), ecorePackage.getEString(), "guard", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getAbstractState(), this.getAbstractState_OutgoingTransition(), "source", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getAbstractState(), this.getAbstractState_IncomingTransition(), "target", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lifecycleElementEClass, LifecycleElement.class, "LifecycleElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLifecycleElement_Lifecycle(), this.getLifeCycle(), null, "lifecycle", null, 0, 1, LifecycleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workProductUseEClass, WorkProductUse.class, "WorkProductUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workProductDefinitionEClass, WorkProductDefinition.class, "WorkProductDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //LifecyclePackageImpl
