/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.extension.lifecycle.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.obeonetwork.dsl.spem.BreakdownElement;
import org.obeonetwork.dsl.spem.DescribableElement;
import org.obeonetwork.dsl.spem.ExtensibleElement;
import org.obeonetwork.dsl.spem.MethodContentElement;
import org.obeonetwork.dsl.spem.MethodContentPackageableElement;
import org.obeonetwork.dsl.spem.MethodContentUse;
import org.obeonetwork.dsl.spem.ProcessElement;
import org.obeonetwork.dsl.spem.ProcessPackageableElement;
import org.obeonetwork.dsl.spem.VariabilityElement;

import org.obeonetwork.dsl.spem.extension.lifecycle.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.spem.extension.lifecycle.LifecyclePackage
 * @generated
 */
public class LifecycleAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LifecyclePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifecycleAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LifecyclePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifecycleSwitch<Adapter> modelSwitch =
		new LifecycleSwitch<Adapter>() {
			@Override
			public Adapter caseLifeCycle(LifeCycle object) {
				return createLifeCycleAdapter();
			}
			@Override
			public Adapter caseAbstractState(AbstractState object) {
				return createAbstractStateAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseInitialState(InitialState object) {
				return createInitialStateAdapter();
			}
			@Override
			public Adapter caseFinalState(FinalState object) {
				return createFinalStateAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseLifecycleElement(LifecycleElement object) {
				return createLifecycleElementAdapter();
			}
			@Override
			public Adapter caseWorkProductUse(WorkProductUse object) {
				return createWorkProductUseAdapter();
			}
			@Override
			public Adapter caseWorkProductDefinition(WorkProductDefinition object) {
				return createWorkProductDefinitionAdapter();
			}
			@Override
			public Adapter caseExtensibleElement(ExtensibleElement object) {
				return createExtensibleElementAdapter();
			}
			@Override
			public Adapter caseDescribableElement(DescribableElement object) {
				return createDescribableElementAdapter();
			}
			@Override
			public Adapter caseProcessPackageableElement(ProcessPackageableElement object) {
				return createProcessPackageableElementAdapter();
			}
			@Override
			public Adapter caseProcessElement(ProcessElement object) {
				return createProcessElementAdapter();
			}
			@Override
			public Adapter caseBreakdownElement(BreakdownElement object) {
				return createBreakdownElementAdapter();
			}
			@Override
			public Adapter caseMethodContentUse(MethodContentUse object) {
				return createMethodContentUseAdapter();
			}
			@Override
			public Adapter caseSpem_WorkProductUse(org.obeonetwork.dsl.spem.WorkProductUse object) {
				return createSpem_WorkProductUseAdapter();
			}
			@Override
			public Adapter caseMethodContentPackageableElement(MethodContentPackageableElement object) {
				return createMethodContentPackageableElementAdapter();
			}
			@Override
			public Adapter caseVariabilityElement(VariabilityElement object) {
				return createVariabilityElementAdapter();
			}
			@Override
			public Adapter caseMethodContentElement(MethodContentElement object) {
				return createMethodContentElementAdapter();
			}
			@Override
			public Adapter caseSpem_WorkProductDefinition(org.obeonetwork.dsl.spem.WorkProductDefinition object) {
				return createSpem_WorkProductDefinitionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.extension.lifecycle.LifeCycle <em>Life Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.LifeCycle
	 * @generated
	 */
	public Adapter createLifeCycleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.extension.lifecycle.AbstractState <em>Abstract State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.AbstractState
	 * @generated
	 */
	public Adapter createAbstractStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.extension.lifecycle.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.extension.lifecycle.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.InitialState
	 * @generated
	 */
	public Adapter createInitialStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.extension.lifecycle.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.FinalState
	 * @generated
	 */
	public Adapter createFinalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.extension.lifecycle.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.extension.lifecycle.LifecycleElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.LifecycleElement
	 * @generated
	 */
	public Adapter createLifecycleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.extension.lifecycle.WorkProductUse <em>Work Product Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.WorkProductUse
	 * @generated
	 */
	public Adapter createWorkProductUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.extension.lifecycle.WorkProductDefinition <em>Work Product Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.WorkProductDefinition
	 * @generated
	 */
	public Adapter createWorkProductDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.ExtensibleElement <em>Extensible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.ExtensibleElement
	 * @generated
	 */
	public Adapter createExtensibleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.DescribableElement <em>Describable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.DescribableElement
	 * @generated
	 */
	public Adapter createDescribableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.ProcessPackageableElement <em>Process Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.ProcessPackageableElement
	 * @generated
	 */
	public Adapter createProcessPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.ProcessElement <em>Process Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.ProcessElement
	 * @generated
	 */
	public Adapter createProcessElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.BreakdownElement <em>Breakdown Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.BreakdownElement
	 * @generated
	 */
	public Adapter createBreakdownElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.MethodContentUse <em>Method Content Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.MethodContentUse
	 * @generated
	 */
	public Adapter createMethodContentUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.WorkProductUse <em>Work Product Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.WorkProductUse
	 * @generated
	 */
	public Adapter createSpem_WorkProductUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.MethodContentPackageableElement <em>Method Content Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.MethodContentPackageableElement
	 * @generated
	 */
	public Adapter createMethodContentPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.VariabilityElement <em>Variability Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.VariabilityElement
	 * @generated
	 */
	public Adapter createVariabilityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.MethodContentElement <em>Method Content Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.MethodContentElement
	 * @generated
	 */
	public Adapter createMethodContentElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.WorkProductDefinition <em>Work Product Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.WorkProductDefinition
	 * @generated
	 */
	public Adapter createSpem_WorkProductDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LifecycleAdapterFactory
