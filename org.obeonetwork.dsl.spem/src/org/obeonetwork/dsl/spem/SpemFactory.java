/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.spem.SpemPackage
 * @generated
 */
public interface SpemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpemFactory eINSTANCE = org.obeonetwork.dsl.spem.impl.SpemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kind</em>'.
	 * @generated
	 */
	Kind createKind();

	/**
	 * Returns a new object of class '<em>Work Definition Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Definition Parameter</em>'.
	 * @generated
	 */
	WorkDefinitionParameter createWorkDefinitionParameter();

	/**
	 * Returns a new object of class '<em>Work Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Sequence</em>'.
	 * @generated
	 */
	WorkSequence createWorkSequence();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Process Performer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Performer</em>'.
	 * @generated
	 */
	ProcessPerformer createProcessPerformer();

	/**
	 * Returns a new object of class '<em>Role Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Use</em>'.
	 * @generated
	 */
	RoleUse createRoleUse();

	/**
	 * Returns a new object of class '<em>Process Responsibility Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Responsibility Assignment</em>'.
	 * @generated
	 */
	ProcessResponsibilityAssignment createProcessResponsibilityAssignment();

	/**
	 * Returns a new object of class '<em>Work Product Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Product Use</em>'.
	 * @generated
	 */
	WorkProductUse createWorkProductUse();

	/**
	 * Returns a new object of class '<em>Work Product Use Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Product Use Relationship</em>'.
	 * @generated
	 */
	WorkProductUseRelationship createWorkProductUseRelationship();

	/**
	 * Returns a new object of class '<em>Process Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Parameter</em>'.
	 * @generated
	 */
	ProcessParameter createProcessParameter();

	/**
	 * Returns a new object of class '<em>Milestone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Milestone</em>'.
	 * @generated
	 */
	Milestone createMilestone();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * Returns a new object of class '<em>Guidance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guidance</em>'.
	 * @generated
	 */
	Guidance createGuidance();

	/**
	 * Returns a new object of class '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metric</em>'.
	 * @generated
	 */
	Metric createMetric();

	/**
	 * Returns a new object of class '<em>Tool Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool Definition</em>'.
	 * @generated
	 */
	ToolDefinition createToolDefinition();

	/**
	 * Returns a new object of class '<em>Task Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Definition</em>'.
	 * @generated
	 */
	TaskDefinition createTaskDefinition();

	/**
	 * Returns a new object of class '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step</em>'.
	 * @generated
	 */
	Step createStep();

	/**
	 * Returns a new object of class '<em>Work Product Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Product Definition</em>'.
	 * @generated
	 */
	WorkProductDefinition createWorkProductDefinition();

	/**
	 * Returns a new object of class '<em>Role Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Definition</em>'.
	 * @generated
	 */
	RoleDefinition createRoleDefinition();

	/**
	 * Returns a new object of class '<em>Work Product Definition Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Product Definition Relationship</em>'.
	 * @generated
	 */
	WorkProductDefinitionRelationship createWorkProductDefinitionRelationship();

	/**
	 * Returns a new object of class '<em>Default Task Definition Performer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Task Definition Performer</em>'.
	 * @generated
	 */
	Default_TaskDefinitionPerformer createDefault_TaskDefinitionPerformer();

	/**
	 * Returns a new object of class '<em>Default Responsibility Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Responsibility Assignment</em>'.
	 * @generated
	 */
	Default_ResponsibilityAssignment createDefault_ResponsibilityAssignment();

	/**
	 * Returns a new object of class '<em>Default Task Definition Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Task Definition Parameter</em>'.
	 * @generated
	 */
	Default_TaskDefinitionParameter createDefault_TaskDefinitionParameter();

	/**
	 * Returns a new object of class '<em>Qualification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualification</em>'.
	 * @generated
	 */
	Qualification createQualification();

	/**
	 * Returns a new object of class '<em>Method Content Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Content Package</em>'.
	 * @generated
	 */
	MethodContentPackage createMethodContentPackage();

	/**
	 * Returns a new object of class '<em>Process Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Package</em>'.
	 * @generated
	 */
	ProcessPackage createProcessPackage();

	/**
	 * Returns a new object of class '<em>Planning Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Planning Data</em>'.
	 * @generated
	 */
	PlanningData createPlanningData();

	/**
	 * Returns a new object of class '<em>Task Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Use</em>'.
	 * @generated
	 */
	TaskUse createTaskUse();

	/**
	 * Returns a new object of class '<em>Composite Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Role</em>'.
	 * @generated
	 */
	CompositeRole createCompositeRole();

	/**
	 * Returns a new object of class '<em>Team Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Team Profile</em>'.
	 * @generated
	 */
	TeamProfile createTeamProfile();

	/**
	 * Returns a new object of class '<em>Process Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Component</em>'.
	 * @generated
	 */
	ProcessComponent createProcessComponent();

	/**
	 * Returns a new object of class '<em>Process Component Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Component Use</em>'.
	 * @generated
	 */
	ProcessComponentUse createProcessComponentUse();

	/**
	 * Returns a new object of class '<em>Method Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Configuration</em>'.
	 * @generated
	 */
	MethodConfiguration createMethodConfiguration();

	/**
	 * Returns a new object of class '<em>Method Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Plugin</em>'.
	 * @generated
	 */
	MethodPlugin createMethodPlugin();

	/**
	 * Returns a new object of class '<em>Method Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Library</em>'.
	 * @generated
	 */
	MethodLibrary createMethodLibrary();

	/**
	 * Returns a new object of class '<em>Work Product Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Product Port</em>'.
	 * @generated
	 */
	WorkProductPort createWorkProductPort();

	/**
	 * Returns a new object of class '<em>Work Product Port Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Product Port Connector</em>'.
	 * @generated
	 */
	WorkProductPortConnector createWorkProductPortConnector();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpemPackage getSpemPackage();

} //SpemFactory
