/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.obeonetwork.dsl.spem.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.spem.SpemPackage
 * @generated
 */
public class SpemSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpemPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpemSwitch() {
		if (modelPackage == null) {
			modelPackage = SpemPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SpemPackage.EXTENSIBLE_ELEMENT: {
				ExtensibleElement extensibleElement = (ExtensibleElement)theEObject;
				T result = caseExtensibleElement(extensibleElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.KIND: {
				Kind kind = (Kind)theEObject;
				T result = caseKind(kind);
				if (result == null) result = caseExtensibleElement(kind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.WORK_DEFINITION_PERFORMER: {
				WorkDefinitionPerformer workDefinitionPerformer = (WorkDefinitionPerformer)theEObject;
				T result = caseWorkDefinitionPerformer(workDefinitionPerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.WORK_DEFINITION: {
				WorkDefinition workDefinition = (WorkDefinition)theEObject;
				T result = caseWorkDefinition(workDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.WORK_DEFINITION_PARAMETER: {
				WorkDefinitionParameter workDefinitionParameter = (WorkDefinitionParameter)theEObject;
				T result = caseWorkDefinitionParameter(workDefinitionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.BREAKDOWN_ELEMENT: {
				BreakdownElement breakdownElement = (BreakdownElement)theEObject;
				T result = caseBreakdownElement(breakdownElement);
				if (result == null) result = caseProcessElement(breakdownElement);
				if (result == null) result = caseDescribableElement(breakdownElement);
				if (result == null) result = caseProcessPackageableElement(breakdownElement);
				if (result == null) result = caseExtensibleElement(breakdownElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.WORK_BREAKDOWN_ELEMENT: {
				WorkBreakdownElement workBreakdownElement = (WorkBreakdownElement)theEObject;
				T result = caseWorkBreakdownElement(workBreakdownElement);
				if (result == null) result = caseBreakdownElement(workBreakdownElement);
				if (result == null) result = caseProcessElement(workBreakdownElement);
				if (result == null) result = caseDescribableElement(workBreakdownElement);
				if (result == null) result = caseProcessPackageableElement(workBreakdownElement);
				if (result == null) result = caseExtensibleElement(workBreakdownElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.WORK_SEQUENCE: {
				WorkSequence workSequence = (WorkSequence)theEObject;
				T result = caseWorkSequence(workSequence);
				if (result == null) result = caseBreakdownElement(workSequence);
				if (result == null) result = caseProcessElement(workSequence);
				if (result == null) result = caseDescribableElement(workSequence);
				if (result == null) result = caseProcessPackageableElement(workSequence);
				if (result == null) result = caseExtensibleElement(workSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseWorkDefinition(activity);
				if (result == null) result = caseWorkBreakdownElement(activity);
				if (result == null) result = caseVariabilityElement(activity);
				if (result == null) result = caseBreakdownElement(activity);
				if (result == null) result = caseProcessElement(activity);
				if (result == null) result = caseDescribableElement(activity);
				if (result == null) result = caseProcessPackageableElement(activity);
				if (result == null) result = caseExtensibleElement(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.PROCESS_PERFORMER: {
				ProcessPerformer processPerformer = (ProcessPerformer)theEObject;
				T result = caseProcessPerformer(processPerformer);
				if (result == null) result = caseWorkDefinitionPerformer(processPerformer);
				if (result == null) result = caseBreakdownElement(processPerformer);
				if (result == null) result = caseProcessElement(processPerformer);
				if (result == null) result = caseDescribableElement(processPerformer);
				if (result == null) result = caseProcessPackageableElement(processPerformer);
				if (result == null) result = caseExtensibleElement(processPerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.ROLE_USE: {
				RoleUse roleUse = (RoleUse)theEObject;
				T result = caseRoleUse(roleUse);
				if (result == null) result = caseMethodContentUse(roleUse);
				if (result == null) result = caseBreakdownElement(roleUse);
				if (result == null) result = caseProcessElement(roleUse);
				if (result == null) result = caseDescribableElement(roleUse);
				if (result == null) result = caseProcessPackageableElement(roleUse);
				if (result == null) result = caseExtensibleElement(roleUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.PROCESS_RESPONSIBILITY_ASSIGNMENT: {
				ProcessResponsibilityAssignment processResponsibilityAssignment = (ProcessResponsibilityAssignment)theEObject;
				T result = caseProcessResponsibilityAssignment(processResponsibilityAssignment);
				if (result == null) result = caseBreakdownElement(processResponsibilityAssignment);
				if (result == null) result = caseProcessElement(processResponsibilityAssignment);
				if (result == null) result = caseDescribableElement(processResponsibilityAssignment);
				if (result == null) result = caseProcessPackageableElement(processResponsibilityAssignment);
				if (result == null) result = caseExtensibleElement(processResponsibilityAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.WORK_PRODUCT_USE: {
				WorkProductUse workProductUse = (WorkProductUse)theEObject;
				T result = caseWorkProductUse(workProductUse);
				if (result == null) result = caseMethodContentUse(workProductUse);
				if (result == null) result = caseBreakdownElement(workProductUse);
				if (result == null) result = caseProcessElement(workProductUse);
				if (result == null) result = caseDescribableElement(workProductUse);
				if (result == null) result = caseProcessPackageableElement(workProductUse);
				if (result == null) result = caseExtensibleElement(workProductUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.WORK_PRODUCT_USE_RELATIONSHIP: {
				WorkProductUseRelationship workProductUseRelationship = (WorkProductUseRelationship)theEObject;
				T result = caseWorkProductUseRelationship(workProductUseRelationship);
				if (result == null) result = caseBreakdownElement(workProductUseRelationship);
				if (result == null) result = caseProcessElement(workProductUseRelationship);
				if (result == null) result = caseDescribableElement(workProductUseRelationship);
				if (result == null) result = caseProcessPackageableElement(workProductUseRelationship);
				if (result == null) result = caseExtensibleElement(workProductUseRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.PROCESS_PARAMETER: {
				ProcessParameter processParameter = (ProcessParameter)theEObject;
				T result = caseProcessParameter(processParameter);
				if (result == null) result = caseWorkDefinitionParameter(processParameter);
				if (result == null) result = caseBreakdownElement(processParameter);
				if (result == null) result = caseProcessElement(processParameter);
				if (result == null) result = caseDescribableElement(processParameter);
				if (result == null) result = caseProcessPackageableElement(processParameter);
				if (result == null) result = caseExtensibleElement(processParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.MILESTONE: {
				Milestone milestone = (Milestone)theEObject;
				T result = caseMilestone(milestone);
				if (result == null) result = caseWorkBreakdownElement(milestone);
				if (result == null) result = caseBreakdownElement(milestone);
				if (result == null) result = caseProcessElement(milestone);
				if (result == null) result = caseDescribableElement(milestone);
				if (result == null) result = caseProcessPackageableElement(milestone);
				if (result == null) result = caseExtensibleElement(milestone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.PROCESS_ELEMENT: {
				ProcessElement processElement = (ProcessElement)theEObject;
				T result = caseProcessElement(processElement);
				if (result == null) result = caseDescribableElement(processElement);
				if (result == null) result = caseProcessPackageableElement(processElement);
				if (result == null) result = caseExtensibleElement(processElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.DESCRIBABLE_ELEMENT: {
				DescribableElement describableElement = (DescribableElement)theEObject;
				T result = caseDescribableElement(describableElement);
				if (result == null) result = caseExtensibleElement(describableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.CATEGORY: {
				Category category = (Category)theEObject;
				T result = caseCategory(category);
				if (result == null) result = caseMethodContentElement(category);
				if (result == null) result = caseDescribableElement(category);
				if (result == null) result = caseMethodContentPackageableElement(category);
				if (result == null) result = caseVariabilityElement(category);
				if (result == null) result = caseExtensibleElement(category);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.GUIDANCE: {
				Guidance guidance = (Guidance)theEObject;
				T result = caseGuidance(guidance);
				if (result == null) result = caseMethodContentElement(guidance);
				if (result == null) result = caseDescribableElement(guidance);
				if (result == null) result = caseMethodContentPackageableElement(guidance);
				if (result == null) result = caseVariabilityElement(guidance);
				if (result == null) result = caseExtensibleElement(guidance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.METRIC: {
				Metric metric = (Metric)theEObject;
				T result = caseMetric(metric);
				if (result == null) result = caseDescribableElement(metric);
				if (result == null) result = caseExtensibleElement(metric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.METHOD_CONTENT_ELEMENT: {
				MethodContentElement methodContentElement = (MethodContentElement)theEObject;
				T result = caseMethodContentElement(methodContentElement);
				if (result == null) result = caseDescribableElement(methodContentElement);
				if (result == null) result = caseMethodContentPackageableElement(methodContentElement);
				if (result == null) result = caseVariabilityElement(methodContentElement);
				if (result == null) result = caseExtensibleElement(methodContentElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.TOOL_DEFINITION: {
				ToolDefinition toolDefinition = (ToolDefinition)theEObject;
				T result = caseToolDefinition(toolDefinition);
				if (result == null) result = caseMethodContentElement(toolDefinition);
				if (result == null) result = caseDescribableElement(toolDefinition);
				if (result == null) result = caseMethodContentPackageableElement(toolDefinition);
				if (result == null) result = caseVariabilityElement(toolDefinition);
				if (result == null) result = caseExtensibleElement(toolDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.TASK_DEFINITION: {
				TaskDefinition taskDefinition = (TaskDefinition)theEObject;
				T result = caseTaskDefinition(taskDefinition);
				if (result == null) result = caseWorkDefinition(taskDefinition);
				if (result == null) result = caseMethodContentElement(taskDefinition);
				if (result == null) result = caseDescribableElement(taskDefinition);
				if (result == null) result = caseMethodContentPackageableElement(taskDefinition);
				if (result == null) result = caseVariabilityElement(taskDefinition);
				if (result == null) result = caseExtensibleElement(taskDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.STEP: {
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = caseWorkDefinition(step);
				if (result == null) result = caseDescribableElement(step);
				if (result == null) result = caseVariabilityElement(step);
				if (result == null) result = caseExtensibleElement(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.WORK_PRODUCT_DEFINITION: {
				WorkProductDefinition workProductDefinition = (WorkProductDefinition)theEObject;
				T result = caseWorkProductDefinition(workProductDefinition);
				if (result == null) result = caseMethodContentElement(workProductDefinition);
				if (result == null) result = caseDescribableElement(workProductDefinition);
				if (result == null) result = caseMethodContentPackageableElement(workProductDefinition);
				if (result == null) result = caseVariabilityElement(workProductDefinition);
				if (result == null) result = caseExtensibleElement(workProductDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.ROLE_DEFINITION: {
				RoleDefinition roleDefinition = (RoleDefinition)theEObject;
				T result = caseRoleDefinition(roleDefinition);
				if (result == null) result = caseMethodContentElement(roleDefinition);
				if (result == null) result = caseDescribableElement(roleDefinition);
				if (result == null) result = caseMethodContentPackageableElement(roleDefinition);
				if (result == null) result = caseVariabilityElement(roleDefinition);
				if (result == null) result = caseExtensibleElement(roleDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.WORK_PRODUCT_DEFINITION_RELATIONSHIP: {
				WorkProductDefinitionRelationship workProductDefinitionRelationship = (WorkProductDefinitionRelationship)theEObject;
				T result = caseWorkProductDefinitionRelationship(workProductDefinitionRelationship);
				if (result == null) result = caseMethodContentElement(workProductDefinitionRelationship);
				if (result == null) result = caseDescribableElement(workProductDefinitionRelationship);
				if (result == null) result = caseMethodContentPackageableElement(workProductDefinitionRelationship);
				if (result == null) result = caseVariabilityElement(workProductDefinitionRelationship);
				if (result == null) result = caseExtensibleElement(workProductDefinitionRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.DEFAULT_TASK_DEFINITION_PERFORMER: {
				Default_TaskDefinitionPerformer default_TaskDefinitionPerformer = (Default_TaskDefinitionPerformer)theEObject;
				T result = caseDefault_TaskDefinitionPerformer(default_TaskDefinitionPerformer);
				if (result == null) result = caseMethodContentElement(default_TaskDefinitionPerformer);
				if (result == null) result = caseDescribableElement(default_TaskDefinitionPerformer);
				if (result == null) result = caseMethodContentPackageableElement(default_TaskDefinitionPerformer);
				if (result == null) result = caseVariabilityElement(default_TaskDefinitionPerformer);
				if (result == null) result = caseExtensibleElement(default_TaskDefinitionPerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.DEFAULT_RESPONSIBILITY_ASSIGNMENT: {
				Default_ResponsibilityAssignment default_ResponsibilityAssignment = (Default_ResponsibilityAssignment)theEObject;
				T result = caseDefault_ResponsibilityAssignment(default_ResponsibilityAssignment);
				if (result == null) result = caseMethodContentElement(default_ResponsibilityAssignment);
				if (result == null) result = caseDescribableElement(default_ResponsibilityAssignment);
				if (result == null) result = caseMethodContentPackageableElement(default_ResponsibilityAssignment);
				if (result == null) result = caseVariabilityElement(default_ResponsibilityAssignment);
				if (result == null) result = caseExtensibleElement(default_ResponsibilityAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.DEFAULT_TASK_DEFINITION_PARAMETER: {
				Default_TaskDefinitionParameter default_TaskDefinitionParameter = (Default_TaskDefinitionParameter)theEObject;
				T result = caseDefault_TaskDefinitionParameter(default_TaskDefinitionParameter);
				if (result == null) result = caseWorkDefinitionParameter(default_TaskDefinitionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.QUALIFICATION: {
				Qualification qualification = (Qualification)theEObject;
				T result = caseQualification(qualification);
				if (result == null) result = caseMethodContentElement(qualification);
				if (result == null) result = caseDescribableElement(qualification);
				if (result == null) result = caseMethodContentPackageableElement(qualification);
				if (result == null) result = caseVariabilityElement(qualification);
				if (result == null) result = caseExtensibleElement(qualification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.METHOD_CONTENT_PACKAGEABLE_ELEMENT: {
				MethodContentPackageableElement methodContentPackageableElement = (MethodContentPackageableElement)theEObject;
				T result = caseMethodContentPackageableElement(methodContentPackageableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.PROCESS_PACKAGEABLE_ELEMENT: {
				ProcessPackageableElement processPackageableElement = (ProcessPackageableElement)theEObject;
				T result = caseProcessPackageableElement(processPackageableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.METHOD_CONTENT_PACKAGE: {
				MethodContentPackage methodContentPackage = (MethodContentPackage)theEObject;
				T result = caseMethodContentPackage(methodContentPackage);
				if (result == null) result = caseMethodContentPackageableElement(methodContentPackage);
				if (result == null) result = caseMethodPluginPackageableElement(methodContentPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.PROCESS_PACKAGE: {
				ProcessPackage processPackage = (ProcessPackage)theEObject;
				T result = caseProcessPackage(processPackage);
				if (result == null) result = caseProcessPackageableElement(processPackage);
				if (result == null) result = caseMethodPluginPackageableElement(processPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.METHOD_CONTENT_KIND: {
				MethodContentKind methodContentKind = (MethodContentKind)theEObject;
				T result = caseMethodContentKind(methodContentKind);
				if (result == null) result = caseMethodContentElement(methodContentKind);
				if (result == null) result = caseKind(methodContentKind);
				if (result == null) result = caseDescribableElement(methodContentKind);
				if (result == null) result = caseMethodContentPackageableElement(methodContentKind);
				if (result == null) result = caseVariabilityElement(methodContentKind);
				if (result == null) result = caseExtensibleElement(methodContentKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.PROCESS_KIND: {
				ProcessKind processKind = (ProcessKind)theEObject;
				T result = caseProcessKind(processKind);
				if (result == null) result = caseProcessElement(processKind);
				if (result == null) result = caseKind(processKind);
				if (result == null) result = caseDescribableElement(processKind);
				if (result == null) result = caseProcessPackageableElement(processKind);
				if (result == null) result = caseExtensibleElement(processKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.PLANNING_DATA: {
				PlanningData planningData = (PlanningData)theEObject;
				T result = casePlanningData(planningData);
				if (result == null) result = caseProcessElement(planningData);
				if (result == null) result = caseDescribableElement(planningData);
				if (result == null) result = caseProcessPackageableElement(planningData);
				if (result == null) result = caseExtensibleElement(planningData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.METHOD_CONTENT_USE: {
				MethodContentUse methodContentUse = (MethodContentUse)theEObject;
				T result = caseMethodContentUse(methodContentUse);
				if (result == null) result = caseBreakdownElement(methodContentUse);
				if (result == null) result = caseProcessElement(methodContentUse);
				if (result == null) result = caseDescribableElement(methodContentUse);
				if (result == null) result = caseProcessPackageableElement(methodContentUse);
				if (result == null) result = caseExtensibleElement(methodContentUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.TASK_USE: {
				TaskUse taskUse = (TaskUse)theEObject;
				T result = caseTaskUse(taskUse);
				if (result == null) result = caseMethodContentUse(taskUse);
				if (result == null) result = caseWorkBreakdownElement(taskUse);
				if (result == null) result = caseBreakdownElement(taskUse);
				if (result == null) result = caseProcessElement(taskUse);
				if (result == null) result = caseDescribableElement(taskUse);
				if (result == null) result = caseProcessPackageableElement(taskUse);
				if (result == null) result = caseExtensibleElement(taskUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.COMPOSITE_ROLE: {
				CompositeRole compositeRole = (CompositeRole)theEObject;
				T result = caseCompositeRole(compositeRole);
				if (result == null) result = caseRoleUse(compositeRole);
				if (result == null) result = caseMethodContentUse(compositeRole);
				if (result == null) result = caseBreakdownElement(compositeRole);
				if (result == null) result = caseProcessElement(compositeRole);
				if (result == null) result = caseDescribableElement(compositeRole);
				if (result == null) result = caseProcessPackageableElement(compositeRole);
				if (result == null) result = caseExtensibleElement(compositeRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.TEAM_PROFILE: {
				TeamProfile teamProfile = (TeamProfile)theEObject;
				T result = caseTeamProfile(teamProfile);
				if (result == null) result = caseBreakdownElement(teamProfile);
				if (result == null) result = caseProcessElement(teamProfile);
				if (result == null) result = caseDescribableElement(teamProfile);
				if (result == null) result = caseProcessPackageableElement(teamProfile);
				if (result == null) result = caseExtensibleElement(teamProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.VARIABILITY_ELEMENT: {
				VariabilityElement variabilityElement = (VariabilityElement)theEObject;
				T result = caseVariabilityElement(variabilityElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.PROCESS_COMPONENT: {
				ProcessComponent processComponent = (ProcessComponent)theEObject;
				T result = caseProcessComponent(processComponent);
				if (result == null) result = caseProcessPackage(processComponent);
				if (result == null) result = caseProcessPackageableElement(processComponent);
				if (result == null) result = caseMethodPluginPackageableElement(processComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.PROCESS_COMPONENT_USE: {
				ProcessComponentUse processComponentUse = (ProcessComponentUse)theEObject;
				T result = caseProcessComponentUse(processComponentUse);
				if (result == null) result = caseMethodContentUse(processComponentUse);
				if (result == null) result = caseBreakdownElement(processComponentUse);
				if (result == null) result = caseProcessElement(processComponentUse);
				if (result == null) result = caseDescribableElement(processComponentUse);
				if (result == null) result = caseProcessPackageableElement(processComponentUse);
				if (result == null) result = caseExtensibleElement(processComponentUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.METHOD_LIBRARY_PACKAGEABLE_ELEMENT: {
				MethodLibraryPackageableElement methodLibraryPackageableElement = (MethodLibraryPackageableElement)theEObject;
				T result = caseMethodLibraryPackageableElement(methodLibraryPackageableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.METHOD_PLUGIN_PACKAGEABLE_ELEMENT: {
				MethodPluginPackageableElement methodPluginPackageableElement = (MethodPluginPackageableElement)theEObject;
				T result = caseMethodPluginPackageableElement(methodPluginPackageableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.METHOD_CONFIGURATION: {
				MethodConfiguration methodConfiguration = (MethodConfiguration)theEObject;
				T result = caseMethodConfiguration(methodConfiguration);
				if (result == null) result = caseMethodLibraryPackageableElement(methodConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.METHOD_PLUGIN: {
				MethodPlugin methodPlugin = (MethodPlugin)theEObject;
				T result = caseMethodPlugin(methodPlugin);
				if (result == null) result = caseMethodLibraryPackageableElement(methodPlugin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.METHOD_LIBRARY: {
				MethodLibrary methodLibrary = (MethodLibrary)theEObject;
				T result = caseMethodLibrary(methodLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.WORK_PRODUCT_PORT: {
				WorkProductPort workProductPort = (WorkProductPort)theEObject;
				T result = caseWorkProductPort(workProductPort);
				if (result == null) result = caseProcessElement(workProductPort);
				if (result == null) result = caseDescribableElement(workProductPort);
				if (result == null) result = caseProcessPackageableElement(workProductPort);
				if (result == null) result = caseExtensibleElement(workProductPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemPackage.WORK_PRODUCT_PORT_CONNECTOR: {
				WorkProductPortConnector workProductPortConnector = (WorkProductPortConnector)theEObject;
				T result = caseWorkProductPortConnector(workProductPortConnector);
				if (result == null) result = caseProcessElement(workProductPortConnector);
				if (result == null) result = caseDescribableElement(workProductPortConnector);
				if (result == null) result = caseProcessPackageableElement(workProductPortConnector);
				if (result == null) result = caseExtensibleElement(workProductPortConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extensible Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extensible Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensibleElement(ExtensibleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKind(Kind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Definition Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Definition Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkDefinitionPerformer(WorkDefinitionPerformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkDefinition(WorkDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Definition Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Definition Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkDefinitionParameter(WorkDefinitionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breakdown Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breakdown Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreakdownElement(BreakdownElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Breakdown Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Breakdown Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkBreakdownElement(WorkBreakdownElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkSequence(WorkSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessPerformer(ProcessPerformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleUse(RoleUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Responsibility Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Responsibility Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessResponsibilityAssignment(ProcessResponsibilityAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Product Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Product Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkProductUse(WorkProductUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Product Use Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Product Use Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkProductUseRelationship(WorkProductUseRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessParameter(ProcessParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Milestone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Milestone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMilestone(Milestone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessElement(ProcessElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Describable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Describable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribableElement(DescribableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategory(Category object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guidance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guidance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuidance(Guidance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetric(Metric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Content Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Content Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodContentElement(MethodContentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolDefinition(ToolDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskDefinition(TaskDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Product Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Product Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkProductDefinition(WorkProductDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleDefinition(RoleDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Product Definition Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Product Definition Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkProductDefinitionRelationship(WorkProductDefinitionRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Task Definition Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Task Definition Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefault_TaskDefinitionPerformer(Default_TaskDefinitionPerformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Responsibility Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Responsibility Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefault_ResponsibilityAssignment(Default_ResponsibilityAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Task Definition Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Task Definition Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefault_TaskDefinitionParameter(Default_TaskDefinitionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualification(Qualification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Content Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Content Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodContentPackageableElement(MethodContentPackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessPackageableElement(ProcessPackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Content Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Content Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodContentPackage(MethodContentPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessPackage(ProcessPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Content Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Content Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodContentKind(MethodContentKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessKind(ProcessKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planning Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planning Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanningData(PlanningData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Content Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Content Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodContentUse(MethodContentUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskUse(TaskUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeRole(CompositeRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Team Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Team Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTeamProfile(TeamProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variability Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variability Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariabilityElement(VariabilityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessComponent(ProcessComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Component Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Component Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessComponentUse(ProcessComponentUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Library Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Library Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodLibraryPackageableElement(MethodLibraryPackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Plugin Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Plugin Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodPluginPackageableElement(MethodPluginPackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodConfiguration(MethodConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Plugin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodPlugin(MethodPlugin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodLibrary(MethodLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Product Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Product Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkProductPort(WorkProductPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Product Port Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Product Port Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkProductPortConnector(WorkProductPortConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SpemSwitch
