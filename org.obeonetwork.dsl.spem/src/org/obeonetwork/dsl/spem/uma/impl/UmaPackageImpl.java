/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.obeonetwork.dsl.spem.SpemPackage;

import org.obeonetwork.dsl.spem.impl.SpemPackageImpl;

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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmaPackageImpl extends EPackageImpl implements UmaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checklistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deliverableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deliveryProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disciplineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disciplineGroupingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass estimatingConsiderationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iterationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outcomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass practiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processPlanningTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roadmapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolMentorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whitepaperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guidelineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportingMaterialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleDefinitionPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskDefinitionPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workProductDefinitionPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guidancePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disciplinePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workProductKindPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleSetPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolDefinitionPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityPatternPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deliveryProcessPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualificationPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processComponentPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workProductKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum riskLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum estimatingTechniqueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum expertiseLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractKindEEnum = null;

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
	 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UmaPackageImpl() {
		super(eNS_URI, UmaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UmaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UmaPackage init() {
		if (isInited) return (UmaPackage)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI);

		// Obtain or create and register package
		UmaPackageImpl theUmaPackage = (UmaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UmaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UmaPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SpemPackageImpl theSpemPackage = (SpemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SpemPackage.eNS_URI) instanceof SpemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SpemPackage.eNS_URI) : SpemPackage.eINSTANCE);

		// Create package meta-data objects
		theUmaPackage.createPackageContents();
		theSpemPackage.createPackageContents();

		// Initialize created meta-data
		theUmaPackage.initializePackageContents();
		theSpemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUmaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UmaPackage.eNS_URI, theUmaPackage);
		return theUmaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_ContainedArtifact() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityPattern() {
		return capabilityPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChecklist() {
		return checklistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcept() {
		return conceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryPackage() {
		return categoryPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomCategory() {
		return customCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeliverable() {
		return deliverableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeliverable_DeliveredProduct() {
		return (EReference)deliverableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliverable_ExternalDescription() {
		return (EAttribute)deliverableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliverable_PackagingGuidance() {
		return (EAttribute)deliverableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_IncludedPattern() {
		return (EReference)processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcess_Scope() {
		return (EAttribute)processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcess_UsageNote() {
		return (EAttribute)processEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_IncludedConnector() {
		return (EReference)processEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeliveryProcess() {
		return deliveryProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliveryProcess_Scale() {
		return (EAttribute)deliveryProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliveryProcess_ProjectCharacteristics() {
		return (EAttribute)deliveryProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliveryProcess_RiskLevel() {
		return (EAttribute)deliveryProcessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliveryProcess_EstimatingTechnique() {
		return (EAttribute)deliveryProcessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliveryProcess_ProjectMemberExpertise() {
		return (EAttribute)deliveryProcessEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliveryProcess_TypeOfContract() {
		return (EAttribute)deliveryProcessEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeliveryProcess_CommunicationMaterial() {
		return (EReference)deliveryProcessEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeliveryProcess_EducationalMaterial() {
		return (EReference)deliveryProcessEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscipline() {
		return disciplineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscipline_RelatedTask() {
		return (EReference)disciplineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscipline_RelatedWorflow() {
		return (EReference)disciplineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisciplineGrouping() {
		return disciplineGroupingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_MethodConfiguration() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_MethodLibrary() {
		return (EReference)rootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_MethodPlugin() {
		return (EReference)rootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_RelatedProduct() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEstimatingConsideration() {
		return estimatingConsiderationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExample() {
		return exampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIteration() {
		return iterationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutcome() {
		return outcomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhase() {
		return phaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPractice() {
		return practiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractice_SubPractice() {
		return (EReference)practiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractice_ReferencedActivity() {
		return (EReference)practiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractice_ContentReference() {
		return (EReference)practiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPractice_AdditionalInfo() {
		return (EAttribute)practiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPractice_Application() {
		return (EAttribute)practiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPractice_Background() {
		return (EAttribute)practiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPractice_Goal() {
		return (EAttribute)practiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPractice_LevelOfAdoption() {
		return (EAttribute)practiceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPractice_Problem() {
		return (EAttribute)practiceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessPlanningTemplate() {
		return processPlanningTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessPlanningTemplate_BaseProcess() {
		return (EReference)processPlanningTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReport() {
		return reportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReusableAsset() {
		return reusableAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoadmap() {
		return roadmapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplate() {
		return templateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermDefinition() {
		return termDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolMentor() {
		return toolMentorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhitepaper() {
		return whitepaperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuideline() {
		return guidelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportingMaterial() {
		return supportingMaterialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleDefinitionPackage() {
		return roleDefinitionPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskDefinitionPackage() {
		return taskDefinitionPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkProductDefinitionPackage() {
		return workProductDefinitionPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuidancePackage() {
		return guidancePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisciplinePackage() {
		return disciplinePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainPackage() {
		return domainPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkProductKindPackage() {
		return workProductKindPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleSetPackage() {
		return roleSetPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolDefinitionPackage() {
		return toolDefinitionPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationPackage() {
		return configurationPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationPackage_OwnedConfiguration() {
		return (EReference)configurationPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityPatternPackage() {
		return capabilityPatternPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeliveryProcessPackage() {
		return deliveryProcessPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleSet() {
		return roleSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleSet_Role() {
		return (EReference)roleSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualificationPackage() {
		return qualificationPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessComponentPackage() {
		return processComponentPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkProductKind() {
		return workProductKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRiskLevel() {
		return riskLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEstimatingTechnique() {
		return estimatingTechniqueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExpertiseLevel() {
		return expertiseLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContractKind() {
		return contractKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmaFactory getUmaFactory() {
		return (UmaFactory)getEFactoryInstance();
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
		artifactEClass = createEClass(ARTIFACT);
		createEReference(artifactEClass, ARTIFACT__CONTAINED_ARTIFACT);

		capabilityPatternEClass = createEClass(CAPABILITY_PATTERN);

		checklistEClass = createEClass(CHECKLIST);

		conceptEClass = createEClass(CONCEPT);

		categoryPackageEClass = createEClass(CATEGORY_PACKAGE);

		customCategoryEClass = createEClass(CUSTOM_CATEGORY);

		deliverableEClass = createEClass(DELIVERABLE);
		createEReference(deliverableEClass, DELIVERABLE__DELIVERED_PRODUCT);
		createEAttribute(deliverableEClass, DELIVERABLE__EXTERNAL_DESCRIPTION);
		createEAttribute(deliverableEClass, DELIVERABLE__PACKAGING_GUIDANCE);

		processEClass = createEClass(PROCESS);
		createEReference(processEClass, PROCESS__INCLUDED_PATTERN);
		createEAttribute(processEClass, PROCESS__SCOPE);
		createEAttribute(processEClass, PROCESS__USAGE_NOTE);
		createEReference(processEClass, PROCESS__INCLUDED_CONNECTOR);

		deliveryProcessEClass = createEClass(DELIVERY_PROCESS);
		createEAttribute(deliveryProcessEClass, DELIVERY_PROCESS__SCALE);
		createEAttribute(deliveryProcessEClass, DELIVERY_PROCESS__PROJECT_CHARACTERISTICS);
		createEAttribute(deliveryProcessEClass, DELIVERY_PROCESS__RISK_LEVEL);
		createEAttribute(deliveryProcessEClass, DELIVERY_PROCESS__ESTIMATING_TECHNIQUE);
		createEAttribute(deliveryProcessEClass, DELIVERY_PROCESS__PROJECT_MEMBER_EXPERTISE);
		createEAttribute(deliveryProcessEClass, DELIVERY_PROCESS__TYPE_OF_CONTRACT);
		createEReference(deliveryProcessEClass, DELIVERY_PROCESS__COMMUNICATION_MATERIAL);
		createEReference(deliveryProcessEClass, DELIVERY_PROCESS__EDUCATIONAL_MATERIAL);

		disciplineEClass = createEClass(DISCIPLINE);
		createEReference(disciplineEClass, DISCIPLINE__RELATED_TASK);
		createEReference(disciplineEClass, DISCIPLINE__RELATED_WORFLOW);

		disciplineGroupingEClass = createEClass(DISCIPLINE_GROUPING);

		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__METHOD_CONFIGURATION);
		createEReference(rootEClass, ROOT__METHOD_LIBRARY);
		createEReference(rootEClass, ROOT__METHOD_PLUGIN);

		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__RELATED_PRODUCT);

		estimatingConsiderationEClass = createEClass(ESTIMATING_CONSIDERATION);

		exampleEClass = createEClass(EXAMPLE);

		iterationEClass = createEClass(ITERATION);

		outcomeEClass = createEClass(OUTCOME);

		phaseEClass = createEClass(PHASE);

		practiceEClass = createEClass(PRACTICE);
		createEReference(practiceEClass, PRACTICE__SUB_PRACTICE);
		createEReference(practiceEClass, PRACTICE__REFERENCED_ACTIVITY);
		createEReference(practiceEClass, PRACTICE__CONTENT_REFERENCE);
		createEAttribute(practiceEClass, PRACTICE__ADDITIONAL_INFO);
		createEAttribute(practiceEClass, PRACTICE__APPLICATION);
		createEAttribute(practiceEClass, PRACTICE__BACKGROUND);
		createEAttribute(practiceEClass, PRACTICE__GOAL);
		createEAttribute(practiceEClass, PRACTICE__LEVEL_OF_ADOPTION);
		createEAttribute(practiceEClass, PRACTICE__PROBLEM);

		processPlanningTemplateEClass = createEClass(PROCESS_PLANNING_TEMPLATE);
		createEReference(processPlanningTemplateEClass, PROCESS_PLANNING_TEMPLATE__BASE_PROCESS);

		reportEClass = createEClass(REPORT);

		reusableAssetEClass = createEClass(REUSABLE_ASSET);

		roadmapEClass = createEClass(ROADMAP);

		templateEClass = createEClass(TEMPLATE);

		termDefinitionEClass = createEClass(TERM_DEFINITION);

		toolMentorEClass = createEClass(TOOL_MENTOR);

		whitepaperEClass = createEClass(WHITEPAPER);

		guidelineEClass = createEClass(GUIDELINE);

		supportingMaterialEClass = createEClass(SUPPORTING_MATERIAL);

		roleDefinitionPackageEClass = createEClass(ROLE_DEFINITION_PACKAGE);

		taskDefinitionPackageEClass = createEClass(TASK_DEFINITION_PACKAGE);

		workProductDefinitionPackageEClass = createEClass(WORK_PRODUCT_DEFINITION_PACKAGE);

		guidancePackageEClass = createEClass(GUIDANCE_PACKAGE);

		disciplinePackageEClass = createEClass(DISCIPLINE_PACKAGE);

		domainPackageEClass = createEClass(DOMAIN_PACKAGE);

		workProductKindPackageEClass = createEClass(WORK_PRODUCT_KIND_PACKAGE);

		roleSetPackageEClass = createEClass(ROLE_SET_PACKAGE);

		toolDefinitionPackageEClass = createEClass(TOOL_DEFINITION_PACKAGE);

		configurationPackageEClass = createEClass(CONFIGURATION_PACKAGE);
		createEReference(configurationPackageEClass, CONFIGURATION_PACKAGE__OWNED_CONFIGURATION);

		capabilityPatternPackageEClass = createEClass(CAPABILITY_PATTERN_PACKAGE);

		deliveryProcessPackageEClass = createEClass(DELIVERY_PROCESS_PACKAGE);

		roleSetEClass = createEClass(ROLE_SET);
		createEReference(roleSetEClass, ROLE_SET__ROLE);

		qualificationPackageEClass = createEClass(QUALIFICATION_PACKAGE);

		processComponentPackageEClass = createEClass(PROCESS_COMPONENT_PACKAGE);

		workProductKindEClass = createEClass(WORK_PRODUCT_KIND);

		// Create enums
		riskLevelEEnum = createEEnum(RISK_LEVEL);
		estimatingTechniqueEEnum = createEEnum(ESTIMATING_TECHNIQUE);
		expertiseLevelEEnum = createEEnum(EXPERTISE_LEVEL);
		contractKindEEnum = createEEnum(CONTRACT_KIND);
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
		artifactEClass.getESuperTypes().add(theSpemPackage.getWorkProductUse());
		capabilityPatternEClass.getESuperTypes().add(this.getProcess());
		checklistEClass.getESuperTypes().add(theSpemPackage.getGuidance());
		conceptEClass.getESuperTypes().add(theSpemPackage.getGuidance());
		categoryPackageEClass.getESuperTypes().add(theSpemPackage.getMethodContentPackage());
		customCategoryEClass.getESuperTypes().add(theSpemPackage.getCategory());
		deliverableEClass.getESuperTypes().add(theSpemPackage.getWorkProductUse());
		processEClass.getESuperTypes().add(theSpemPackage.getActivity());
		deliveryProcessEClass.getESuperTypes().add(this.getProcess());
		disciplineEClass.getESuperTypes().add(theSpemPackage.getCategory());
		disciplineGroupingEClass.getESuperTypes().add(theSpemPackage.getCategory());
		domainEClass.getESuperTypes().add(theSpemPackage.getCategory());
		estimatingConsiderationEClass.getESuperTypes().add(theSpemPackage.getGuidance());
		exampleEClass.getESuperTypes().add(theSpemPackage.getGuidance());
		iterationEClass.getESuperTypes().add(theSpemPackage.getActivity());
		outcomeEClass.getESuperTypes().add(theSpemPackage.getWorkProductUse());
		phaseEClass.getESuperTypes().add(theSpemPackage.getActivity());
		practiceEClass.getESuperTypes().add(theSpemPackage.getGuidance());
		processPlanningTemplateEClass.getESuperTypes().add(this.getProcess());
		reportEClass.getESuperTypes().add(theSpemPackage.getGuidance());
		reusableAssetEClass.getESuperTypes().add(theSpemPackage.getGuidance());
		roadmapEClass.getESuperTypes().add(theSpemPackage.getGuidance());
		templateEClass.getESuperTypes().add(theSpemPackage.getGuidance());
		termDefinitionEClass.getESuperTypes().add(theSpemPackage.getGuidance());
		toolMentorEClass.getESuperTypes().add(theSpemPackage.getGuidance());
		whitepaperEClass.getESuperTypes().add(this.getConcept());
		guidelineEClass.getESuperTypes().add(theSpemPackage.getGuidance());
		supportingMaterialEClass.getESuperTypes().add(theSpemPackage.getGuidance());
		roleDefinitionPackageEClass.getESuperTypes().add(theSpemPackage.getMethodContentPackage());
		taskDefinitionPackageEClass.getESuperTypes().add(theSpemPackage.getMethodContentPackage());
		workProductDefinitionPackageEClass.getESuperTypes().add(theSpemPackage.getMethodContentPackage());
		guidancePackageEClass.getESuperTypes().add(theSpemPackage.getMethodContentPackage());
		disciplinePackageEClass.getESuperTypes().add(theSpemPackage.getMethodContentPackage());
		domainPackageEClass.getESuperTypes().add(theSpemPackage.getMethodContentPackage());
		workProductKindPackageEClass.getESuperTypes().add(theSpemPackage.getMethodContentPackage());
		roleSetPackageEClass.getESuperTypes().add(theSpemPackage.getMethodContentPackage());
		toolDefinitionPackageEClass.getESuperTypes().add(theSpemPackage.getMethodContentPackage());
		configurationPackageEClass.getESuperTypes().add(theSpemPackage.getMethodContentPackage());
		capabilityPatternPackageEClass.getESuperTypes().add(theSpemPackage.getProcessPackage());
		deliveryProcessPackageEClass.getESuperTypes().add(theSpemPackage.getProcessPackage());
		roleSetEClass.getESuperTypes().add(theSpemPackage.getMethodContentElement());
		qualificationPackageEClass.getESuperTypes().add(theSpemPackage.getMethodContentPackage());
		processComponentPackageEClass.getESuperTypes().add(theSpemPackage.getProcessPackage());
		workProductKindEClass.getESuperTypes().add(theSpemPackage.getKind());
		workProductKindEClass.getESuperTypes().add(theSpemPackage.getMethodContentElement());

		// Initialize classes and features; add operations and parameters
		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArtifact_ContainedArtifact(), this.getArtifact(), null, "containedArtifact", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityPatternEClass, CapabilityPattern.class, "CapabilityPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(checklistEClass, Checklist.class, "Checklist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conceptEClass, Concept.class, "Concept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(categoryPackageEClass, CategoryPackage.class, "CategoryPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(customCategoryEClass, CustomCategory.class, "CustomCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deliverableEClass, Deliverable.class, "Deliverable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeliverable_DeliveredProduct(), theSpemPackage.getWorkProductUse(), null, "deliveredProduct", null, 0, -1, Deliverable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliverable_ExternalDescription(), ecorePackage.getEString(), "externalDescription", null, 0, 1, Deliverable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliverable_PackagingGuidance(), ecorePackage.getEString(), "packagingGuidance", null, 0, 1, Deliverable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEClass, org.obeonetwork.dsl.spem.uma.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcess_IncludedPattern(), this.getCapabilityPattern(), null, "includedPattern", null, 0, -1, org.obeonetwork.dsl.spem.uma.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_Scope(), ecorePackage.getEString(), "scope", null, 0, 1, org.obeonetwork.dsl.spem.uma.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_UsageNote(), ecorePackage.getEString(), "usageNote", null, 0, -1, org.obeonetwork.dsl.spem.uma.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_IncludedConnector(), theSpemPackage.getWorkProductPortConnector(), null, "includedConnector", null, 0, -1, org.obeonetwork.dsl.spem.uma.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deliveryProcessEClass, DeliveryProcess.class, "DeliveryProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeliveryProcess_Scale(), ecorePackage.getEString(), "scale", null, 0, 1, DeliveryProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliveryProcess_ProjectCharacteristics(), ecorePackage.getEString(), "projectCharacteristics", null, 0, 1, DeliveryProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliveryProcess_RiskLevel(), this.getRiskLevel(), "riskLevel", null, 0, 1, DeliveryProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliveryProcess_EstimatingTechnique(), this.getEstimatingTechnique(), "estimatingTechnique", null, 0, 1, DeliveryProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliveryProcess_ProjectMemberExpertise(), this.getExpertiseLevel(), "projectMemberExpertise", null, 0, 1, DeliveryProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliveryProcess_TypeOfContract(), this.getContractKind(), "typeOfContract", null, 0, 1, DeliveryProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeliveryProcess_CommunicationMaterial(), this.getSupportingMaterial(), null, "communicationMaterial", null, 0, -1, DeliveryProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeliveryProcess_EducationalMaterial(), this.getSupportingMaterial(), null, "educationalMaterial", null, 0, -1, DeliveryProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disciplineEClass, Discipline.class, "Discipline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscipline_RelatedTask(), theSpemPackage.getTaskDefinition(), null, "relatedTask", null, 0, -1, Discipline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscipline_RelatedWorflow(), this.getProcess(), null, "relatedWorflow", null, 0, -1, Discipline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disciplineGroupingEClass, DisciplineGrouping.class, "DisciplineGrouping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_MethodConfiguration(), theSpemPackage.getMethodConfiguration(), null, "methodConfiguration", null, 0, -2, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_MethodLibrary(), theSpemPackage.getMethodLibrary(), null, "methodLibrary", null, 0, -2, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_MethodPlugin(), theSpemPackage.getMethodPlugin(), null, "MethodPlugin", null, 0, -2, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_RelatedProduct(), theSpemPackage.getWorkProductDefinition(), null, "relatedProduct", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(estimatingConsiderationEClass, EstimatingConsideration.class, "EstimatingConsideration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exampleEClass, Example.class, "Example", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iterationEClass, Iteration.class, "Iteration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outcomeEClass, Outcome.class, "Outcome", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(phaseEClass, Phase.class, "Phase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(practiceEClass, Practice.class, "Practice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPractice_SubPractice(), this.getPractice(), null, "subPractice", null, 0, -1, Practice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPractice_ReferencedActivity(), theSpemPackage.getActivity(), null, "referencedActivity", null, 0, -1, Practice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPractice_ContentReference(), theSpemPackage.getMethodContentElement(), null, "contentReference", null, 0, -1, Practice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPractice_AdditionalInfo(), ecorePackage.getEString(), "additionalInfo", null, 0, 1, Practice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPractice_Application(), ecorePackage.getEString(), "application", null, 0, 1, Practice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPractice_Background(), ecorePackage.getEString(), "background", null, 0, 1, Practice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPractice_Goal(), ecorePackage.getEString(), "goal", null, 0, -1, Practice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPractice_LevelOfAdoption(), ecorePackage.getEString(), "levelOfAdoption", null, 0, -1, Practice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPractice_Problem(), ecorePackage.getEString(), "problem", null, 0, 1, Practice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processPlanningTemplateEClass, ProcessPlanningTemplate.class, "ProcessPlanningTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessPlanningTemplate_BaseProcess(), this.getProcess(), null, "baseProcess", null, 0, -1, ProcessPlanningTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reportEClass, Report.class, "Report", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reusableAssetEClass, ReusableAsset.class, "ReusableAsset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roadmapEClass, Roadmap.class, "Roadmap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateEClass, Template.class, "Template", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(termDefinitionEClass, TermDefinition.class, "TermDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toolMentorEClass, ToolMentor.class, "ToolMentor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(whitepaperEClass, Whitepaper.class, "Whitepaper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(guidelineEClass, Guideline.class, "Guideline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(supportingMaterialEClass, SupportingMaterial.class, "SupportingMaterial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleDefinitionPackageEClass, RoleDefinitionPackage.class, "RoleDefinitionPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskDefinitionPackageEClass, TaskDefinitionPackage.class, "TaskDefinitionPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workProductDefinitionPackageEClass, WorkProductDefinitionPackage.class, "WorkProductDefinitionPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(guidancePackageEClass, GuidancePackage.class, "GuidancePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(disciplinePackageEClass, DisciplinePackage.class, "DisciplinePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainPackageEClass, DomainPackage.class, "DomainPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workProductKindPackageEClass, WorkProductKindPackage.class, "WorkProductKindPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleSetPackageEClass, RoleSetPackage.class, "RoleSetPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toolDefinitionPackageEClass, ToolDefinitionPackage.class, "ToolDefinitionPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(configurationPackageEClass, ConfigurationPackage.class, "ConfigurationPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationPackage_OwnedConfiguration(), theSpemPackage.getMethodConfiguration(), null, "ownedConfiguration", null, 0, -1, ConfigurationPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityPatternPackageEClass, CapabilityPatternPackage.class, "CapabilityPatternPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deliveryProcessPackageEClass, DeliveryProcessPackage.class, "DeliveryProcessPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleSetEClass, RoleSet.class, "RoleSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleSet_Role(), theSpemPackage.getRoleDefinition(), null, "role", null, 0, -1, RoleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualificationPackageEClass, QualificationPackage.class, "QualificationPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processComponentPackageEClass, ProcessComponentPackage.class, "ProcessComponentPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workProductKindEClass, WorkProductKind.class, "WorkProductKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(riskLevelEEnum, RiskLevel.class, "RiskLevel");
		addEEnumLiteral(riskLevelEEnum, RiskLevel.LOW);
		addEEnumLiteral(riskLevelEEnum, RiskLevel.MID);
		addEEnumLiteral(riskLevelEEnum, RiskLevel.HIGH);

		initEEnum(estimatingTechniqueEEnum, EstimatingTechnique.class, "EstimatingTechnique");
		addEEnumLiteral(estimatingTechniqueEEnum, EstimatingTechnique.COST);
		addEEnumLiteral(estimatingTechniqueEEnum, EstimatingTechnique.TIME);
		addEEnumLiteral(estimatingTechniqueEEnum, EstimatingTechnique.SKILLS);
		addEEnumLiteral(estimatingTechniqueEEnum, EstimatingTechnique.DEFECTS);
		addEEnumLiteral(estimatingTechniqueEEnum, EstimatingTechnique.OTHER);

		initEEnum(expertiseLevelEEnum, ExpertiseLevel.class, "ExpertiseLevel");
		addEEnumLiteral(expertiseLevelEEnum, ExpertiseLevel.LOW);
		addEEnumLiteral(expertiseLevelEEnum, ExpertiseLevel.MID);
		addEEnumLiteral(expertiseLevelEEnum, ExpertiseLevel.LEVEL);

		initEEnum(contractKindEEnum, ContractKind.class, "ContractKind");
		addEEnumLiteral(contractKindEEnum, ContractKind.EXPRESS);
		addEEnumLiteral(contractKindEEnum, ContractKind.IMPLIED);
		addEEnumLiteral(contractKindEEnum, ContractKind.OTHER);

		// Create annotations
		// doc
		createDocAnnotations();
	}

	/**
	 * Initializes the annotations for <b>doc</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDocAnnotations() {
		String source = "doc";		
		addAnnotation
		  (deliveryProcessEClass, 
		   source, 
		   new String[] {
			 "scale", "represents the size in man.year or other equivalent units"
		   });
	}

} //UmaPackageImpl
