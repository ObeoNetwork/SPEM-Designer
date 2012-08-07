/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.obeonetwork.dsl.spem.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpemFactoryImpl extends EFactoryImpl implements SpemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpemFactory init() {
		try {
			SpemFactory theSpemFactory = (SpemFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.thalesgroup.com/spem/2.0"); 
			if (theSpemFactory != null) {
				return theSpemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpemFactoryImpl() {
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
			case SpemPackage.KIND: return createKind();
			case SpemPackage.WORK_DEFINITION_PARAMETER: return createWorkDefinitionParameter();
			case SpemPackage.WORK_SEQUENCE: return createWorkSequence();
			case SpemPackage.ACTIVITY: return createActivity();
			case SpemPackage.PROCESS_PERFORMER: return createProcessPerformer();
			case SpemPackage.ROLE_USE: return createRoleUse();
			case SpemPackage.PROCESS_RESPONSIBILITY_ASSIGNMENT: return createProcessResponsibilityAssignment();
			case SpemPackage.WORK_PRODUCT_USE: return createWorkProductUse();
			case SpemPackage.WORK_PRODUCT_USE_RELATIONSHIP: return createWorkProductUseRelationship();
			case SpemPackage.PROCESS_PARAMETER: return createProcessParameter();
			case SpemPackage.MILESTONE: return createMilestone();
			case SpemPackage.CATEGORY: return createCategory();
			case SpemPackage.GUIDANCE: return createGuidance();
			case SpemPackage.METRIC: return createMetric();
			case SpemPackage.TOOL_DEFINITION: return createToolDefinition();
			case SpemPackage.TASK_DEFINITION: return createTaskDefinition();
			case SpemPackage.STEP: return createStep();
			case SpemPackage.WORK_PRODUCT_DEFINITION: return createWorkProductDefinition();
			case SpemPackage.ROLE_DEFINITION: return createRoleDefinition();
			case SpemPackage.WORK_PRODUCT_DEFINITION_RELATIONSHIP: return createWorkProductDefinitionRelationship();
			case SpemPackage.DEFAULT_TASK_DEFINITION_PERFORMER: return createDefault_TaskDefinitionPerformer();
			case SpemPackage.DEFAULT_RESPONSIBILITY_ASSIGNMENT: return createDefault_ResponsibilityAssignment();
			case SpemPackage.DEFAULT_TASK_DEFINITION_PARAMETER: return createDefault_TaskDefinitionParameter();
			case SpemPackage.QUALIFICATION: return createQualification();
			case SpemPackage.METHOD_CONTENT_PACKAGE: return createMethodContentPackage();
			case SpemPackage.PROCESS_PACKAGE: return createProcessPackage();
			case SpemPackage.PLANNING_DATA: return createPlanningData();
			case SpemPackage.TASK_USE: return createTaskUse();
			case SpemPackage.COMPOSITE_ROLE: return createCompositeRole();
			case SpemPackage.TEAM_PROFILE: return createTeamProfile();
			case SpemPackage.PROCESS_COMPONENT: return createProcessComponent();
			case SpemPackage.PROCESS_COMPONENT_USE: return createProcessComponentUse();
			case SpemPackage.METHOD_CONFIGURATION: return createMethodConfiguration();
			case SpemPackage.METHOD_PLUGIN: return createMethodPlugin();
			case SpemPackage.METHOD_LIBRARY: return createMethodLibrary();
			case SpemPackage.WORK_PRODUCT_PORT: return createWorkProductPort();
			case SpemPackage.WORK_PRODUCT_PORT_CONNECTOR: return createWorkProductPortConnector();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SpemPackage.PARAMETER_DIRECTION_KIND:
				return createParameterDirectionKindFromString(eDataType, initialValue);
			case SpemPackage.WORK_SEQUENCE_KIND:
				return createWorkSequenceKindFromString(eDataType, initialValue);
			case SpemPackage.ACTIVITY_USE_KIND:
				return createActivityUseKindFromString(eDataType, initialValue);
			case SpemPackage.OPTIONALITY_KIND:
				return createOptionalityKindFromString(eDataType, initialValue);
			case SpemPackage.VARIABILITY_TYPE:
				return createVariabilityTypeFromString(eDataType, initialValue);
			case SpemPackage.WORK_PRODUCT_RELATIONSHIP_KIND:
				return createWorkProductRelationshipKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SpemPackage.PARAMETER_DIRECTION_KIND:
				return convertParameterDirectionKindToString(eDataType, instanceValue);
			case SpemPackage.WORK_SEQUENCE_KIND:
				return convertWorkSequenceKindToString(eDataType, instanceValue);
			case SpemPackage.ACTIVITY_USE_KIND:
				return convertActivityUseKindToString(eDataType, instanceValue);
			case SpemPackage.OPTIONALITY_KIND:
				return convertOptionalityKindToString(eDataType, instanceValue);
			case SpemPackage.VARIABILITY_TYPE:
				return convertVariabilityTypeToString(eDataType, instanceValue);
			case SpemPackage.WORK_PRODUCT_RELATIONSHIP_KIND:
				return convertWorkProductRelationshipKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind createKind() {
		KindImpl kind = new KindImpl();
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinitionParameter createWorkDefinitionParameter() {
		WorkDefinitionParameterImpl workDefinitionParameter = new WorkDefinitionParameterImpl();
		return workDefinitionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkSequence createWorkSequence() {
		WorkSequenceImpl workSequence = new WorkSequenceImpl();
		return workSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPerformer createProcessPerformer() {
		ProcessPerformerImpl processPerformer = new ProcessPerformerImpl();
		return processPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleUse createRoleUse() {
		RoleUseImpl roleUse = new RoleUseImpl();
		return roleUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessResponsibilityAssignment createProcessResponsibilityAssignment() {
		ProcessResponsibilityAssignmentImpl processResponsibilityAssignment = new ProcessResponsibilityAssignmentImpl();
		return processResponsibilityAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductUse createWorkProductUse() {
		WorkProductUseImpl workProductUse = new WorkProductUseImpl();
		return workProductUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductUseRelationship createWorkProductUseRelationship() {
		WorkProductUseRelationshipImpl workProductUseRelationship = new WorkProductUseRelationshipImpl();
		return workProductUseRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessParameter createProcessParameter() {
		ProcessParameterImpl processParameter = new ProcessParameterImpl();
		return processParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Milestone createMilestone() {
		MilestoneImpl milestone = new MilestoneImpl();
		return milestone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guidance createGuidance() {
		GuidanceImpl guidance = new GuidanceImpl();
		return guidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric createMetric() {
		MetricImpl metric = new MetricImpl();
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolDefinition createToolDefinition() {
		ToolDefinitionImpl toolDefinition = new ToolDefinitionImpl();
		return toolDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDefinition createTaskDefinition() {
		TaskDefinitionImpl taskDefinition = new TaskDefinitionImpl();
		return taskDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductDefinition createWorkProductDefinition() {
		WorkProductDefinitionImpl workProductDefinition = new WorkProductDefinitionImpl();
		return workProductDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleDefinition createRoleDefinition() {
		RoleDefinitionImpl roleDefinition = new RoleDefinitionImpl();
		return roleDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductDefinitionRelationship createWorkProductDefinitionRelationship() {
		WorkProductDefinitionRelationshipImpl workProductDefinitionRelationship = new WorkProductDefinitionRelationshipImpl();
		return workProductDefinitionRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Default_TaskDefinitionPerformer createDefault_TaskDefinitionPerformer() {
		Default_TaskDefinitionPerformerImpl default_TaskDefinitionPerformer = new Default_TaskDefinitionPerformerImpl();
		return default_TaskDefinitionPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Default_ResponsibilityAssignment createDefault_ResponsibilityAssignment() {
		Default_ResponsibilityAssignmentImpl default_ResponsibilityAssignment = new Default_ResponsibilityAssignmentImpl();
		return default_ResponsibilityAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Default_TaskDefinitionParameter createDefault_TaskDefinitionParameter() {
		Default_TaskDefinitionParameterImpl default_TaskDefinitionParameter = new Default_TaskDefinitionParameterImpl();
		return default_TaskDefinitionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qualification createQualification() {
		QualificationImpl qualification = new QualificationImpl();
		return qualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodContentPackage createMethodContentPackage() {
		MethodContentPackageImpl methodContentPackage = new MethodContentPackageImpl();
		return methodContentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPackage createProcessPackage() {
		ProcessPackageImpl processPackage = new ProcessPackageImpl();
		return processPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanningData createPlanningData() {
		PlanningDataImpl planningData = new PlanningDataImpl();
		return planningData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskUse createTaskUse() {
		TaskUseImpl taskUse = new TaskUseImpl();
		return taskUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeRole createCompositeRole() {
		CompositeRoleImpl compositeRole = new CompositeRoleImpl();
		return compositeRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamProfile createTeamProfile() {
		TeamProfileImpl teamProfile = new TeamProfileImpl();
		return teamProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessComponent createProcessComponent() {
		ProcessComponentImpl processComponent = new ProcessComponentImpl();
		return processComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessComponentUse createProcessComponentUse() {
		ProcessComponentUseImpl processComponentUse = new ProcessComponentUseImpl();
		return processComponentUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodConfiguration createMethodConfiguration() {
		MethodConfigurationImpl methodConfiguration = new MethodConfigurationImpl();
		return methodConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodPlugin createMethodPlugin() {
		MethodPluginImpl methodPlugin = new MethodPluginImpl();
		return methodPlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodLibrary createMethodLibrary() {
		MethodLibraryImpl methodLibrary = new MethodLibraryImpl();
		return methodLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductPort createWorkProductPort() {
		WorkProductPortImpl workProductPort = new WorkProductPortImpl();
		return workProductPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductPortConnector createWorkProductPortConnector() {
		WorkProductPortConnectorImpl workProductPortConnector = new WorkProductPortConnectorImpl();
		return workProductPortConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirectionKind createParameterDirectionKindFromString(EDataType eDataType, String initialValue) {
		ParameterDirectionKind result = ParameterDirectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterDirectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkSequenceKind createWorkSequenceKindFromString(EDataType eDataType, String initialValue) {
		WorkSequenceKind result = WorkSequenceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkSequenceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityUseKind createActivityUseKindFromString(EDataType eDataType, String initialValue) {
		ActivityUseKind result = ActivityUseKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivityUseKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionalityKind createOptionalityKindFromString(EDataType eDataType, String initialValue) {
		OptionalityKind result = OptionalityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOptionalityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityType createVariabilityTypeFromString(EDataType eDataType, String initialValue) {
		VariabilityType result = VariabilityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariabilityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductRelationshipKind createWorkProductRelationshipKindFromString(EDataType eDataType, String initialValue) {
		WorkProductRelationshipKind result = WorkProductRelationshipKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkProductRelationshipKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpemPackage getSpemPackage() {
		return (SpemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpemPackage getPackage() {
		return SpemPackage.eINSTANCE;
	}

} //SpemFactoryImpl
