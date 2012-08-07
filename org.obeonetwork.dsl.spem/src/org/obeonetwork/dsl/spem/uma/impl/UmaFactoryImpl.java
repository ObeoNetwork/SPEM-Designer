/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.obeonetwork.dsl.spem.uma.Artifact;
import org.obeonetwork.dsl.spem.uma.CapabilityPattern;
import org.obeonetwork.dsl.spem.uma.CapabilityPatternPackage;
import org.obeonetwork.dsl.spem.uma.CategoryPackage;
import org.obeonetwork.dsl.spem.uma.Checklist;
import org.obeonetwork.dsl.spem.uma.Concept;
import org.obeonetwork.dsl.spem.uma.ConfigurationPackage;
import org.obeonetwork.dsl.spem.uma.ContractKind;
import org.obeonetwork.dsl.spem.uma.CustomCategory;
import org.obeonetwork.dsl.spem.uma.Deliverable;
import org.obeonetwork.dsl.spem.uma.DeliveryProcess;
import org.obeonetwork.dsl.spem.uma.DeliveryProcessPackage;
import org.obeonetwork.dsl.spem.uma.Discipline;
import org.obeonetwork.dsl.spem.uma.DisciplineGrouping;
import org.obeonetwork.dsl.spem.uma.DisciplinePackage;
import org.obeonetwork.dsl.spem.uma.Domain;
import org.obeonetwork.dsl.spem.uma.DomainPackage;
import org.obeonetwork.dsl.spem.uma.EstimatingConsideration;
import org.obeonetwork.dsl.spem.uma.EstimatingTechnique;
import org.obeonetwork.dsl.spem.uma.Example;
import org.obeonetwork.dsl.spem.uma.ExpertiseLevel;
import org.obeonetwork.dsl.spem.uma.GuidancePackage;
import org.obeonetwork.dsl.spem.uma.Guideline;
import org.obeonetwork.dsl.spem.uma.Iteration;
import org.obeonetwork.dsl.spem.uma.Outcome;
import org.obeonetwork.dsl.spem.uma.Phase;
import org.obeonetwork.dsl.spem.uma.Practice;
import org.obeonetwork.dsl.spem.uma.ProcessComponentPackage;
import org.obeonetwork.dsl.spem.uma.ProcessPlanningTemplate;
import org.obeonetwork.dsl.spem.uma.QualificationPackage;
import org.obeonetwork.dsl.spem.uma.Report;
import org.obeonetwork.dsl.spem.uma.ReusableAsset;
import org.obeonetwork.dsl.spem.uma.RiskLevel;
import org.obeonetwork.dsl.spem.uma.Roadmap;
import org.obeonetwork.dsl.spem.uma.RoleDefinitionPackage;
import org.obeonetwork.dsl.spem.uma.RoleSet;
import org.obeonetwork.dsl.spem.uma.RoleSetPackage;
import org.obeonetwork.dsl.spem.uma.Root;
import org.obeonetwork.dsl.spem.uma.SupportingMaterial;
import org.obeonetwork.dsl.spem.uma.TaskDefinitionPackage;
import org.obeonetwork.dsl.spem.uma.Template;
import org.obeonetwork.dsl.spem.uma.TermDefinition;
import org.obeonetwork.dsl.spem.uma.ToolDefinitionPackage;
import org.obeonetwork.dsl.spem.uma.ToolMentor;
import org.obeonetwork.dsl.spem.uma.UmaFactory;
import org.obeonetwork.dsl.spem.uma.UmaPackage;
import org.obeonetwork.dsl.spem.uma.Whitepaper;
import org.obeonetwork.dsl.spem.uma.WorkProductDefinitionPackage;
import org.obeonetwork.dsl.spem.uma.WorkProductKind;
import org.obeonetwork.dsl.spem.uma.WorkProductKindPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmaFactoryImpl extends EFactoryImpl implements UmaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UmaFactory init() {
		try {
			UmaFactory theUmaFactory = (UmaFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.thalesgroup.com/spem/2.0/uma"); 
			if (theUmaFactory != null) {
				return theUmaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UmaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmaFactoryImpl() {
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
			case UmaPackage.ARTIFACT: return createArtifact();
			case UmaPackage.CAPABILITY_PATTERN: return createCapabilityPattern();
			case UmaPackage.CHECKLIST: return createChecklist();
			case UmaPackage.CONCEPT: return createConcept();
			case UmaPackage.CATEGORY_PACKAGE: return createCategoryPackage();
			case UmaPackage.CUSTOM_CATEGORY: return createCustomCategory();
			case UmaPackage.DELIVERABLE: return createDeliverable();
			case UmaPackage.PROCESS: return createProcess();
			case UmaPackage.DELIVERY_PROCESS: return createDeliveryProcess();
			case UmaPackage.DISCIPLINE: return createDiscipline();
			case UmaPackage.DISCIPLINE_GROUPING: return createDisciplineGrouping();
			case UmaPackage.ROOT: return createRoot();
			case UmaPackage.DOMAIN: return createDomain();
			case UmaPackage.ESTIMATING_CONSIDERATION: return createEstimatingConsideration();
			case UmaPackage.EXAMPLE: return createExample();
			case UmaPackage.ITERATION: return createIteration();
			case UmaPackage.OUTCOME: return createOutcome();
			case UmaPackage.PHASE: return createPhase();
			case UmaPackage.PRACTICE: return createPractice();
			case UmaPackage.PROCESS_PLANNING_TEMPLATE: return createProcessPlanningTemplate();
			case UmaPackage.REPORT: return createReport();
			case UmaPackage.REUSABLE_ASSET: return createReusableAsset();
			case UmaPackage.ROADMAP: return createRoadmap();
			case UmaPackage.TEMPLATE: return createTemplate();
			case UmaPackage.TERM_DEFINITION: return createTermDefinition();
			case UmaPackage.TOOL_MENTOR: return createToolMentor();
			case UmaPackage.WHITEPAPER: return createWhitepaper();
			case UmaPackage.GUIDELINE: return createGuideline();
			case UmaPackage.SUPPORTING_MATERIAL: return createSupportingMaterial();
			case UmaPackage.ROLE_DEFINITION_PACKAGE: return createRoleDefinitionPackage();
			case UmaPackage.TASK_DEFINITION_PACKAGE: return createTaskDefinitionPackage();
			case UmaPackage.WORK_PRODUCT_DEFINITION_PACKAGE: return createWorkProductDefinitionPackage();
			case UmaPackage.GUIDANCE_PACKAGE: return createGuidancePackage();
			case UmaPackage.DISCIPLINE_PACKAGE: return createDisciplinePackage();
			case UmaPackage.DOMAIN_PACKAGE: return createDomainPackage();
			case UmaPackage.WORK_PRODUCT_KIND_PACKAGE: return createWorkProductKindPackage();
			case UmaPackage.ROLE_SET_PACKAGE: return createRoleSetPackage();
			case UmaPackage.TOOL_DEFINITION_PACKAGE: return createToolDefinitionPackage();
			case UmaPackage.CONFIGURATION_PACKAGE: return createConfigurationPackage();
			case UmaPackage.CAPABILITY_PATTERN_PACKAGE: return createCapabilityPatternPackage();
			case UmaPackage.DELIVERY_PROCESS_PACKAGE: return createDeliveryProcessPackage();
			case UmaPackage.ROLE_SET: return createRoleSet();
			case UmaPackage.QUALIFICATION_PACKAGE: return createQualificationPackage();
			case UmaPackage.PROCESS_COMPONENT_PACKAGE: return createProcessComponentPackage();
			case UmaPackage.WORK_PRODUCT_KIND: return createWorkProductKind();
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
			case UmaPackage.RISK_LEVEL:
				return createRiskLevelFromString(eDataType, initialValue);
			case UmaPackage.ESTIMATING_TECHNIQUE:
				return createEstimatingTechniqueFromString(eDataType, initialValue);
			case UmaPackage.EXPERTISE_LEVEL:
				return createExpertiseLevelFromString(eDataType, initialValue);
			case UmaPackage.CONTRACT_KIND:
				return createContractKindFromString(eDataType, initialValue);
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
			case UmaPackage.RISK_LEVEL:
				return convertRiskLevelToString(eDataType, instanceValue);
			case UmaPackage.ESTIMATING_TECHNIQUE:
				return convertEstimatingTechniqueToString(eDataType, instanceValue);
			case UmaPackage.EXPERTISE_LEVEL:
				return convertExpertiseLevelToString(eDataType, instanceValue);
			case UmaPackage.CONTRACT_KIND:
				return convertContractKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityPattern createCapabilityPattern() {
		CapabilityPatternImpl capabilityPattern = new CapabilityPatternImpl();
		return capabilityPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Checklist createChecklist() {
		ChecklistImpl checklist = new ChecklistImpl();
		return checklist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept createConcept() {
		ConceptImpl concept = new ConceptImpl();
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryPackage createCategoryPackage() {
		CategoryPackageImpl categoryPackage = new CategoryPackageImpl();
		return categoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomCategory createCustomCategory() {
		CustomCategoryImpl customCategory = new CustomCategoryImpl();
		return customCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deliverable createDeliverable() {
		DeliverableImpl deliverable = new DeliverableImpl();
		return deliverable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.obeonetwork.dsl.spem.uma.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliveryProcess createDeliveryProcess() {
		DeliveryProcessImpl deliveryProcess = new DeliveryProcessImpl();
		return deliveryProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discipline createDiscipline() {
		DisciplineImpl discipline = new DisciplineImpl();
		return discipline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisciplineGrouping createDisciplineGrouping() {
		DisciplineGroupingImpl disciplineGrouping = new DisciplineGroupingImpl();
		return disciplineGrouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstimatingConsideration createEstimatingConsideration() {
		EstimatingConsiderationImpl estimatingConsideration = new EstimatingConsiderationImpl();
		return estimatingConsideration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Example createExample() {
		ExampleImpl example = new ExampleImpl();
		return example;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iteration createIteration() {
		IterationImpl iteration = new IterationImpl();
		return iteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Outcome createOutcome() {
		OutcomeImpl outcome = new OutcomeImpl();
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phase createPhase() {
		PhaseImpl phase = new PhaseImpl();
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practice createPractice() {
		PracticeImpl practice = new PracticeImpl();
		return practice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPlanningTemplate createProcessPlanningTemplate() {
		ProcessPlanningTemplateImpl processPlanningTemplate = new ProcessPlanningTemplateImpl();
		return processPlanningTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Report createReport() {
		ReportImpl report = new ReportImpl();
		return report;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReusableAsset createReusableAsset() {
		ReusableAssetImpl reusableAsset = new ReusableAssetImpl();
		return reusableAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Roadmap createRoadmap() {
		RoadmapImpl roadmap = new RoadmapImpl();
		return roadmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template createTemplate() {
		TemplateImpl template = new TemplateImpl();
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermDefinition createTermDefinition() {
		TermDefinitionImpl termDefinition = new TermDefinitionImpl();
		return termDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolMentor createToolMentor() {
		ToolMentorImpl toolMentor = new ToolMentorImpl();
		return toolMentor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Whitepaper createWhitepaper() {
		WhitepaperImpl whitepaper = new WhitepaperImpl();
		return whitepaper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guideline createGuideline() {
		GuidelineImpl guideline = new GuidelineImpl();
		return guideline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportingMaterial createSupportingMaterial() {
		SupportingMaterialImpl supportingMaterial = new SupportingMaterialImpl();
		return supportingMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleDefinitionPackage createRoleDefinitionPackage() {
		RoleDefinitionPackageImpl roleDefinitionPackage = new RoleDefinitionPackageImpl();
		return roleDefinitionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDefinitionPackage createTaskDefinitionPackage() {
		TaskDefinitionPackageImpl taskDefinitionPackage = new TaskDefinitionPackageImpl();
		return taskDefinitionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductDefinitionPackage createWorkProductDefinitionPackage() {
		WorkProductDefinitionPackageImpl workProductDefinitionPackage = new WorkProductDefinitionPackageImpl();
		return workProductDefinitionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidancePackage createGuidancePackage() {
		GuidancePackageImpl guidancePackage = new GuidancePackageImpl();
		return guidancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisciplinePackage createDisciplinePackage() {
		DisciplinePackageImpl disciplinePackage = new DisciplinePackageImpl();
		return disciplinePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainPackage createDomainPackage() {
		DomainPackageImpl domainPackage = new DomainPackageImpl();
		return domainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductKindPackage createWorkProductKindPackage() {
		WorkProductKindPackageImpl workProductKindPackage = new WorkProductKindPackageImpl();
		return workProductKindPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleSetPackage createRoleSetPackage() {
		RoleSetPackageImpl roleSetPackage = new RoleSetPackageImpl();
		return roleSetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolDefinitionPackage createToolDefinitionPackage() {
		ToolDefinitionPackageImpl toolDefinitionPackage = new ToolDefinitionPackageImpl();
		return toolDefinitionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationPackage createConfigurationPackage() {
		ConfigurationPackageImpl configurationPackage = new ConfigurationPackageImpl();
		return configurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityPatternPackage createCapabilityPatternPackage() {
		CapabilityPatternPackageImpl capabilityPatternPackage = new CapabilityPatternPackageImpl();
		return capabilityPatternPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliveryProcessPackage createDeliveryProcessPackage() {
		DeliveryProcessPackageImpl deliveryProcessPackage = new DeliveryProcessPackageImpl();
		return deliveryProcessPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleSet createRoleSet() {
		RoleSetImpl roleSet = new RoleSetImpl();
		return roleSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualificationPackage createQualificationPackage() {
		QualificationPackageImpl qualificationPackage = new QualificationPackageImpl();
		return qualificationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessComponentPackage createProcessComponentPackage() {
		ProcessComponentPackageImpl processComponentPackage = new ProcessComponentPackageImpl();
		return processComponentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductKind createWorkProductKind() {
		WorkProductKindImpl workProductKind = new WorkProductKindImpl();
		return workProductKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskLevel createRiskLevelFromString(EDataType eDataType, String initialValue) {
		RiskLevel result = RiskLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRiskLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstimatingTechnique createEstimatingTechniqueFromString(EDataType eDataType, String initialValue) {
		EstimatingTechnique result = EstimatingTechnique.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEstimatingTechniqueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpertiseLevel createExpertiseLevelFromString(EDataType eDataType, String initialValue) {
		ExpertiseLevel result = ExpertiseLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpertiseLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractKind createContractKindFromString(EDataType eDataType, String initialValue) {
		ContractKind result = ContractKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmaPackage getUmaPackage() {
		return (UmaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UmaPackage getPackage() {
		return UmaPackage.eINSTANCE;
	}

} //UmaFactoryImpl
