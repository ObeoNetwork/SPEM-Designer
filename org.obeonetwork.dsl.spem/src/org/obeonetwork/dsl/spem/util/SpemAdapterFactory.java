/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.obeonetwork.dsl.spem.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.spem.SpemPackage
 * @generated
 */
public class SpemAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpemPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpemAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SpemPackage.eINSTANCE;
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
	protected SpemSwitch<Adapter> modelSwitch =
		new SpemSwitch<Adapter>() {
			@Override
			public Adapter caseExtensibleElement(ExtensibleElement object) {
				return createExtensibleElementAdapter();
			}
			@Override
			public Adapter caseKind(Kind object) {
				return createKindAdapter();
			}
			@Override
			public Adapter caseWorkDefinitionPerformer(WorkDefinitionPerformer object) {
				return createWorkDefinitionPerformerAdapter();
			}
			@Override
			public Adapter caseWorkDefinition(WorkDefinition object) {
				return createWorkDefinitionAdapter();
			}
			@Override
			public Adapter caseWorkDefinitionParameter(WorkDefinitionParameter object) {
				return createWorkDefinitionParameterAdapter();
			}
			@Override
			public Adapter caseBreakdownElement(BreakdownElement object) {
				return createBreakdownElementAdapter();
			}
			@Override
			public Adapter caseWorkBreakdownElement(WorkBreakdownElement object) {
				return createWorkBreakdownElementAdapter();
			}
			@Override
			public Adapter caseWorkSequence(WorkSequence object) {
				return createWorkSequenceAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseProcessPerformer(ProcessPerformer object) {
				return createProcessPerformerAdapter();
			}
			@Override
			public Adapter caseRoleUse(RoleUse object) {
				return createRoleUseAdapter();
			}
			@Override
			public Adapter caseProcessResponsibilityAssignment(ProcessResponsibilityAssignment object) {
				return createProcessResponsibilityAssignmentAdapter();
			}
			@Override
			public Adapter caseWorkProductUse(WorkProductUse object) {
				return createWorkProductUseAdapter();
			}
			@Override
			public Adapter caseWorkProductUseRelationship(WorkProductUseRelationship object) {
				return createWorkProductUseRelationshipAdapter();
			}
			@Override
			public Adapter caseProcessParameter(ProcessParameter object) {
				return createProcessParameterAdapter();
			}
			@Override
			public Adapter caseMilestone(Milestone object) {
				return createMilestoneAdapter();
			}
			@Override
			public Adapter caseProcessElement(ProcessElement object) {
				return createProcessElementAdapter();
			}
			@Override
			public Adapter caseDescribableElement(DescribableElement object) {
				return createDescribableElementAdapter();
			}
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter caseGuidance(Guidance object) {
				return createGuidanceAdapter();
			}
			@Override
			public Adapter caseMetric(Metric object) {
				return createMetricAdapter();
			}
			@Override
			public Adapter caseMethodContentElement(MethodContentElement object) {
				return createMethodContentElementAdapter();
			}
			@Override
			public Adapter caseToolDefinition(ToolDefinition object) {
				return createToolDefinitionAdapter();
			}
			@Override
			public Adapter caseTaskDefinition(TaskDefinition object) {
				return createTaskDefinitionAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseWorkProductDefinition(WorkProductDefinition object) {
				return createWorkProductDefinitionAdapter();
			}
			@Override
			public Adapter caseRoleDefinition(RoleDefinition object) {
				return createRoleDefinitionAdapter();
			}
			@Override
			public Adapter caseWorkProductDefinitionRelationship(WorkProductDefinitionRelationship object) {
				return createWorkProductDefinitionRelationshipAdapter();
			}
			@Override
			public Adapter caseDefault_TaskDefinitionPerformer(Default_TaskDefinitionPerformer object) {
				return createDefault_TaskDefinitionPerformerAdapter();
			}
			@Override
			public Adapter caseDefault_ResponsibilityAssignment(Default_ResponsibilityAssignment object) {
				return createDefault_ResponsibilityAssignmentAdapter();
			}
			@Override
			public Adapter caseDefault_TaskDefinitionParameter(Default_TaskDefinitionParameter object) {
				return createDefault_TaskDefinitionParameterAdapter();
			}
			@Override
			public Adapter caseQualification(Qualification object) {
				return createQualificationAdapter();
			}
			@Override
			public Adapter caseMethodContentPackageableElement(MethodContentPackageableElement object) {
				return createMethodContentPackageableElementAdapter();
			}
			@Override
			public Adapter caseProcessPackageableElement(ProcessPackageableElement object) {
				return createProcessPackageableElementAdapter();
			}
			@Override
			public Adapter caseMethodContentPackage(MethodContentPackage object) {
				return createMethodContentPackageAdapter();
			}
			@Override
			public Adapter caseProcessPackage(ProcessPackage object) {
				return createProcessPackageAdapter();
			}
			@Override
			public Adapter caseMethodContentKind(MethodContentKind object) {
				return createMethodContentKindAdapter();
			}
			@Override
			public Adapter caseProcessKind(ProcessKind object) {
				return createProcessKindAdapter();
			}
			@Override
			public Adapter casePlanningData(PlanningData object) {
				return createPlanningDataAdapter();
			}
			@Override
			public Adapter caseMethodContentUse(MethodContentUse object) {
				return createMethodContentUseAdapter();
			}
			@Override
			public Adapter caseTaskUse(TaskUse object) {
				return createTaskUseAdapter();
			}
			@Override
			public Adapter caseCompositeRole(CompositeRole object) {
				return createCompositeRoleAdapter();
			}
			@Override
			public Adapter caseTeamProfile(TeamProfile object) {
				return createTeamProfileAdapter();
			}
			@Override
			public Adapter caseVariabilityElement(VariabilityElement object) {
				return createVariabilityElementAdapter();
			}
			@Override
			public Adapter caseProcessComponent(ProcessComponent object) {
				return createProcessComponentAdapter();
			}
			@Override
			public Adapter caseProcessComponentUse(ProcessComponentUse object) {
				return createProcessComponentUseAdapter();
			}
			@Override
			public Adapter caseMethodLibraryPackageableElement(MethodLibraryPackageableElement object) {
				return createMethodLibraryPackageableElementAdapter();
			}
			@Override
			public Adapter caseMethodPluginPackageableElement(MethodPluginPackageableElement object) {
				return createMethodPluginPackageableElementAdapter();
			}
			@Override
			public Adapter caseMethodConfiguration(MethodConfiguration object) {
				return createMethodConfigurationAdapter();
			}
			@Override
			public Adapter caseMethodPlugin(MethodPlugin object) {
				return createMethodPluginAdapter();
			}
			@Override
			public Adapter caseMethodLibrary(MethodLibrary object) {
				return createMethodLibraryAdapter();
			}
			@Override
			public Adapter caseWorkProductPort(WorkProductPort object) {
				return createWorkProductPortAdapter();
			}
			@Override
			public Adapter caseWorkProductPortConnector(WorkProductPortConnector object) {
				return createWorkProductPortConnectorAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.Kind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.Kind
	 * @generated
	 */
	public Adapter createKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.WorkDefinitionPerformer <em>Work Definition Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.WorkDefinitionPerformer
	 * @generated
	 */
	public Adapter createWorkDefinitionPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.WorkDefinition <em>Work Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.WorkDefinition
	 * @generated
	 */
	public Adapter createWorkDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.WorkDefinitionParameter <em>Work Definition Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.WorkDefinitionParameter
	 * @generated
	 */
	public Adapter createWorkDefinitionParameterAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.WorkBreakdownElement <em>Work Breakdown Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.WorkBreakdownElement
	 * @generated
	 */
	public Adapter createWorkBreakdownElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.WorkSequence <em>Work Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.WorkSequence
	 * @generated
	 */
	public Adapter createWorkSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.ProcessPerformer <em>Process Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.ProcessPerformer
	 * @generated
	 */
	public Adapter createProcessPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.RoleUse <em>Role Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.RoleUse
	 * @generated
	 */
	public Adapter createRoleUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.ProcessResponsibilityAssignment <em>Process Responsibility Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.ProcessResponsibilityAssignment
	 * @generated
	 */
	public Adapter createProcessResponsibilityAssignmentAdapter() {
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
	public Adapter createWorkProductUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.WorkProductUseRelationship <em>Work Product Use Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.WorkProductUseRelationship
	 * @generated
	 */
	public Adapter createWorkProductUseRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.ProcessParameter <em>Process Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.ProcessParameter
	 * @generated
	 */
	public Adapter createProcessParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.Milestone <em>Milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.Milestone
	 * @generated
	 */
	public Adapter createMilestoneAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.Guidance <em>Guidance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.Guidance
	 * @generated
	 */
	public Adapter createGuidanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.Metric
	 * @generated
	 */
	public Adapter createMetricAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.ToolDefinition <em>Tool Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.ToolDefinition
	 * @generated
	 */
	public Adapter createToolDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.TaskDefinition <em>Task Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.TaskDefinition
	 * @generated
	 */
	public Adapter createTaskDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
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
	public Adapter createWorkProductDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.RoleDefinition <em>Role Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.RoleDefinition
	 * @generated
	 */
	public Adapter createRoleDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.WorkProductDefinitionRelationship <em>Work Product Definition Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.WorkProductDefinitionRelationship
	 * @generated
	 */
	public Adapter createWorkProductDefinitionRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.Default_TaskDefinitionPerformer <em>Default Task Definition Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.Default_TaskDefinitionPerformer
	 * @generated
	 */
	public Adapter createDefault_TaskDefinitionPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.Default_ResponsibilityAssignment <em>Default Responsibility Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.Default_ResponsibilityAssignment
	 * @generated
	 */
	public Adapter createDefault_ResponsibilityAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.Default_TaskDefinitionParameter <em>Default Task Definition Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.Default_TaskDefinitionParameter
	 * @generated
	 */
	public Adapter createDefault_TaskDefinitionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.Qualification <em>Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.Qualification
	 * @generated
	 */
	public Adapter createQualificationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.MethodContentPackage <em>Method Content Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.MethodContentPackage
	 * @generated
	 */
	public Adapter createMethodContentPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.ProcessPackage <em>Process Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.ProcessPackage
	 * @generated
	 */
	public Adapter createProcessPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.MethodContentKind <em>Method Content Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.MethodContentKind
	 * @generated
	 */
	public Adapter createMethodContentKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.ProcessKind <em>Process Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.ProcessKind
	 * @generated
	 */
	public Adapter createProcessKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.PlanningData <em>Planning Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.PlanningData
	 * @generated
	 */
	public Adapter createPlanningDataAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.TaskUse <em>Task Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.TaskUse
	 * @generated
	 */
	public Adapter createTaskUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.CompositeRole <em>Composite Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.CompositeRole
	 * @generated
	 */
	public Adapter createCompositeRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.TeamProfile <em>Team Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.TeamProfile
	 * @generated
	 */
	public Adapter createTeamProfileAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.ProcessComponent <em>Process Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.ProcessComponent
	 * @generated
	 */
	public Adapter createProcessComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.ProcessComponentUse <em>Process Component Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.ProcessComponentUse
	 * @generated
	 */
	public Adapter createProcessComponentUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.MethodLibraryPackageableElement <em>Method Library Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.MethodLibraryPackageableElement
	 * @generated
	 */
	public Adapter createMethodLibraryPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.MethodPluginPackageableElement <em>Method Plugin Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.MethodPluginPackageableElement
	 * @generated
	 */
	public Adapter createMethodPluginPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.MethodConfiguration <em>Method Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.MethodConfiguration
	 * @generated
	 */
	public Adapter createMethodConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.MethodPlugin <em>Method Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.MethodPlugin
	 * @generated
	 */
	public Adapter createMethodPluginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.MethodLibrary <em>Method Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.MethodLibrary
	 * @generated
	 */
	public Adapter createMethodLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.WorkProductPort <em>Work Product Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.WorkProductPort
	 * @generated
	 */
	public Adapter createWorkProductPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.WorkProductPortConnector <em>Work Product Port Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.WorkProductPortConnector
	 * @generated
	 */
	public Adapter createWorkProductPortConnectorAdapter() {
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

} //SpemAdapterFactory
