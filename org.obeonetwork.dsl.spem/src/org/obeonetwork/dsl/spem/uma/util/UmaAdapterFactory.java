/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.obeonetwork.dsl.spem.Activity;
import org.obeonetwork.dsl.spem.BreakdownElement;
import org.obeonetwork.dsl.spem.Category;
import org.obeonetwork.dsl.spem.DescribableElement;
import org.obeonetwork.dsl.spem.ExtensibleElement;
import org.obeonetwork.dsl.spem.Guidance;
import org.obeonetwork.dsl.spem.Kind;
import org.obeonetwork.dsl.spem.MethodContentElement;
import org.obeonetwork.dsl.spem.MethodContentPackage;
import org.obeonetwork.dsl.spem.MethodContentPackageableElement;
import org.obeonetwork.dsl.spem.MethodContentUse;
import org.obeonetwork.dsl.spem.MethodPluginPackageableElement;
import org.obeonetwork.dsl.spem.ProcessElement;
import org.obeonetwork.dsl.spem.ProcessPackage;
import org.obeonetwork.dsl.spem.ProcessPackageableElement;
import org.obeonetwork.dsl.spem.VariabilityElement;
import org.obeonetwork.dsl.spem.WorkBreakdownElement;
import org.obeonetwork.dsl.spem.WorkDefinition;
import org.obeonetwork.dsl.spem.WorkProductUse;

import org.obeonetwork.dsl.spem.uma.Artifact;
import org.obeonetwork.dsl.spem.uma.CapabilityPattern;
import org.obeonetwork.dsl.spem.uma.CapabilityPatternPackage;
import org.obeonetwork.dsl.spem.uma.CategoryPackage;
import org.obeonetwork.dsl.spem.uma.Checklist;
import org.obeonetwork.dsl.spem.uma.Concept;
import org.obeonetwork.dsl.spem.uma.ConfigurationPackage;
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
import org.obeonetwork.dsl.spem.uma.Example;
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
import org.obeonetwork.dsl.spem.uma.UmaPackage;
import org.obeonetwork.dsl.spem.uma.Whitepaper;
import org.obeonetwork.dsl.spem.uma.WorkProductDefinitionPackage;
import org.obeonetwork.dsl.spem.uma.WorkProductKind;
import org.obeonetwork.dsl.spem.uma.WorkProductKindPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.spem.uma.UmaPackage
 * @generated
 */
public class UmaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UmaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UmaPackage.eINSTANCE;
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
	protected UmaSwitch<Adapter> modelSwitch =
		new UmaSwitch<Adapter>() {
			@Override
			public Adapter caseArtifact(Artifact object) {
				return createArtifactAdapter();
			}
			@Override
			public Adapter caseCapabilityPattern(CapabilityPattern object) {
				return createCapabilityPatternAdapter();
			}
			@Override
			public Adapter caseChecklist(Checklist object) {
				return createChecklistAdapter();
			}
			@Override
			public Adapter caseConcept(Concept object) {
				return createConceptAdapter();
			}
			@Override
			public Adapter caseCategoryPackage(CategoryPackage object) {
				return createCategoryPackageAdapter();
			}
			@Override
			public Adapter caseCustomCategory(CustomCategory object) {
				return createCustomCategoryAdapter();
			}
			@Override
			public Adapter caseDeliverable(Deliverable object) {
				return createDeliverableAdapter();
			}
			@Override
			public Adapter caseProcess(org.obeonetwork.dsl.spem.uma.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseDeliveryProcess(DeliveryProcess object) {
				return createDeliveryProcessAdapter();
			}
			@Override
			public Adapter caseDiscipline(Discipline object) {
				return createDisciplineAdapter();
			}
			@Override
			public Adapter caseDisciplineGrouping(DisciplineGrouping object) {
				return createDisciplineGroupingAdapter();
			}
			@Override
			public Adapter caseRoot(Root object) {
				return createRootAdapter();
			}
			@Override
			public Adapter caseDomain(Domain object) {
				return createDomainAdapter();
			}
			@Override
			public Adapter caseEstimatingConsideration(EstimatingConsideration object) {
				return createEstimatingConsiderationAdapter();
			}
			@Override
			public Adapter caseExample(Example object) {
				return createExampleAdapter();
			}
			@Override
			public Adapter caseIteration(Iteration object) {
				return createIterationAdapter();
			}
			@Override
			public Adapter caseOutcome(Outcome object) {
				return createOutcomeAdapter();
			}
			@Override
			public Adapter casePhase(Phase object) {
				return createPhaseAdapter();
			}
			@Override
			public Adapter casePractice(Practice object) {
				return createPracticeAdapter();
			}
			@Override
			public Adapter caseProcessPlanningTemplate(ProcessPlanningTemplate object) {
				return createProcessPlanningTemplateAdapter();
			}
			@Override
			public Adapter caseReport(Report object) {
				return createReportAdapter();
			}
			@Override
			public Adapter caseReusableAsset(ReusableAsset object) {
				return createReusableAssetAdapter();
			}
			@Override
			public Adapter caseRoadmap(Roadmap object) {
				return createRoadmapAdapter();
			}
			@Override
			public Adapter caseTemplate(Template object) {
				return createTemplateAdapter();
			}
			@Override
			public Adapter caseTermDefinition(TermDefinition object) {
				return createTermDefinitionAdapter();
			}
			@Override
			public Adapter caseToolMentor(ToolMentor object) {
				return createToolMentorAdapter();
			}
			@Override
			public Adapter caseWhitepaper(Whitepaper object) {
				return createWhitepaperAdapter();
			}
			@Override
			public Adapter caseGuideline(Guideline object) {
				return createGuidelineAdapter();
			}
			@Override
			public Adapter caseSupportingMaterial(SupportingMaterial object) {
				return createSupportingMaterialAdapter();
			}
			@Override
			public Adapter caseRoleDefinitionPackage(RoleDefinitionPackage object) {
				return createRoleDefinitionPackageAdapter();
			}
			@Override
			public Adapter caseTaskDefinitionPackage(TaskDefinitionPackage object) {
				return createTaskDefinitionPackageAdapter();
			}
			@Override
			public Adapter caseWorkProductDefinitionPackage(WorkProductDefinitionPackage object) {
				return createWorkProductDefinitionPackageAdapter();
			}
			@Override
			public Adapter caseGuidancePackage(GuidancePackage object) {
				return createGuidancePackageAdapter();
			}
			@Override
			public Adapter caseDisciplinePackage(DisciplinePackage object) {
				return createDisciplinePackageAdapter();
			}
			@Override
			public Adapter caseDomainPackage(DomainPackage object) {
				return createDomainPackageAdapter();
			}
			@Override
			public Adapter caseWorkProductKindPackage(WorkProductKindPackage object) {
				return createWorkProductKindPackageAdapter();
			}
			@Override
			public Adapter caseRoleSetPackage(RoleSetPackage object) {
				return createRoleSetPackageAdapter();
			}
			@Override
			public Adapter caseToolDefinitionPackage(ToolDefinitionPackage object) {
				return createToolDefinitionPackageAdapter();
			}
			@Override
			public Adapter caseConfigurationPackage(ConfigurationPackage object) {
				return createConfigurationPackageAdapter();
			}
			@Override
			public Adapter caseCapabilityPatternPackage(CapabilityPatternPackage object) {
				return createCapabilityPatternPackageAdapter();
			}
			@Override
			public Adapter caseDeliveryProcessPackage(DeliveryProcessPackage object) {
				return createDeliveryProcessPackageAdapter();
			}
			@Override
			public Adapter caseRoleSet(RoleSet object) {
				return createRoleSetAdapter();
			}
			@Override
			public Adapter caseQualificationPackage(QualificationPackage object) {
				return createQualificationPackageAdapter();
			}
			@Override
			public Adapter caseProcessComponentPackage(ProcessComponentPackage object) {
				return createProcessComponentPackageAdapter();
			}
			@Override
			public Adapter caseWorkProductKind(WorkProductKind object) {
				return createWorkProductKindAdapter();
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
			public Adapter caseWorkProductUse(WorkProductUse object) {
				return createWorkProductUseAdapter();
			}
			@Override
			public Adapter caseWorkDefinition(WorkDefinition object) {
				return createWorkDefinitionAdapter();
			}
			@Override
			public Adapter caseWorkBreakdownElement(WorkBreakdownElement object) {
				return createWorkBreakdownElementAdapter();
			}
			@Override
			public Adapter caseVariabilityElement(VariabilityElement object) {
				return createVariabilityElementAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseMethodContentPackageableElement(MethodContentPackageableElement object) {
				return createMethodContentPackageableElementAdapter();
			}
			@Override
			public Adapter caseMethodContentElement(MethodContentElement object) {
				return createMethodContentElementAdapter();
			}
			@Override
			public Adapter caseGuidance(Guidance object) {
				return createGuidanceAdapter();
			}
			@Override
			public Adapter caseMethodPluginPackageableElement(MethodPluginPackageableElement object) {
				return createMethodPluginPackageableElementAdapter();
			}
			@Override
			public Adapter caseMethodContentPackage(MethodContentPackage object) {
				return createMethodContentPackageAdapter();
			}
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter caseProcessPackage(ProcessPackage object) {
				return createProcessPackageAdapter();
			}
			@Override
			public Adapter caseKind(Kind object) {
				return createKindAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.CapabilityPattern <em>Capability Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.CapabilityPattern
	 * @generated
	 */
	public Adapter createCapabilityPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.Checklist <em>Checklist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.Checklist
	 * @generated
	 */
	public Adapter createChecklistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.Concept
	 * @generated
	 */
	public Adapter createConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.CategoryPackage <em>Category Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.CategoryPackage
	 * @generated
	 */
	public Adapter createCategoryPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.CustomCategory <em>Custom Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.CustomCategory
	 * @generated
	 */
	public Adapter createCustomCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.Deliverable <em>Deliverable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.Deliverable
	 * @generated
	 */
	public Adapter createDeliverableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.DeliveryProcess <em>Delivery Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.DeliveryProcess
	 * @generated
	 */
	public Adapter createDeliveryProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.Discipline <em>Discipline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.Discipline
	 * @generated
	 */
	public Adapter createDisciplineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.DisciplineGrouping <em>Discipline Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.DisciplineGrouping
	 * @generated
	 */
	public Adapter createDisciplineGroupingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.Root
	 * @generated
	 */
	public Adapter createRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.EstimatingConsideration <em>Estimating Consideration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.EstimatingConsideration
	 * @generated
	 */
	public Adapter createEstimatingConsiderationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.Example <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.Example
	 * @generated
	 */
	public Adapter createExampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.Iteration <em>Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.Iteration
	 * @generated
	 */
	public Adapter createIterationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.Outcome <em>Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.Outcome
	 * @generated
	 */
	public Adapter createOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.Phase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.Phase
	 * @generated
	 */
	public Adapter createPhaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.Practice <em>Practice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.Practice
	 * @generated
	 */
	public Adapter createPracticeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.ProcessPlanningTemplate <em>Process Planning Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.ProcessPlanningTemplate
	 * @generated
	 */
	public Adapter createProcessPlanningTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.Report <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.Report
	 * @generated
	 */
	public Adapter createReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.ReusableAsset <em>Reusable Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.ReusableAsset
	 * @generated
	 */
	public Adapter createReusableAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.Roadmap <em>Roadmap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.Roadmap
	 * @generated
	 */
	public Adapter createRoadmapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.Template
	 * @generated
	 */
	public Adapter createTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.TermDefinition <em>Term Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.TermDefinition
	 * @generated
	 */
	public Adapter createTermDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.ToolMentor <em>Tool Mentor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.ToolMentor
	 * @generated
	 */
	public Adapter createToolMentorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.Whitepaper <em>Whitepaper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.Whitepaper
	 * @generated
	 */
	public Adapter createWhitepaperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.Guideline <em>Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.Guideline
	 * @generated
	 */
	public Adapter createGuidelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.SupportingMaterial <em>Supporting Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.SupportingMaterial
	 * @generated
	 */
	public Adapter createSupportingMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.RoleDefinitionPackage <em>Role Definition Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.RoleDefinitionPackage
	 * @generated
	 */
	public Adapter createRoleDefinitionPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.TaskDefinitionPackage <em>Task Definition Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.TaskDefinitionPackage
	 * @generated
	 */
	public Adapter createTaskDefinitionPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.WorkProductDefinitionPackage <em>Work Product Definition Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.WorkProductDefinitionPackage
	 * @generated
	 */
	public Adapter createWorkProductDefinitionPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.GuidancePackage <em>Guidance Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.GuidancePackage
	 * @generated
	 */
	public Adapter createGuidancePackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.DisciplinePackage <em>Discipline Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.DisciplinePackage
	 * @generated
	 */
	public Adapter createDisciplinePackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.DomainPackage <em>Domain Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.DomainPackage
	 * @generated
	 */
	public Adapter createDomainPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.WorkProductKindPackage <em>Work Product Kind Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.WorkProductKindPackage
	 * @generated
	 */
	public Adapter createWorkProductKindPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.RoleSetPackage <em>Role Set Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.RoleSetPackage
	 * @generated
	 */
	public Adapter createRoleSetPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.ToolDefinitionPackage <em>Tool Definition Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.ToolDefinitionPackage
	 * @generated
	 */
	public Adapter createToolDefinitionPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.ConfigurationPackage <em>Configuration Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.ConfigurationPackage
	 * @generated
	 */
	public Adapter createConfigurationPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.CapabilityPatternPackage <em>Capability Pattern Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.CapabilityPatternPackage
	 * @generated
	 */
	public Adapter createCapabilityPatternPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.DeliveryProcessPackage <em>Delivery Process Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.DeliveryProcessPackage
	 * @generated
	 */
	public Adapter createDeliveryProcessPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.RoleSet <em>Role Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.RoleSet
	 * @generated
	 */
	public Adapter createRoleSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.QualificationPackage <em>Qualification Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.QualificationPackage
	 * @generated
	 */
	public Adapter createQualificationPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.ProcessComponentPackage <em>Process Component Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.ProcessComponentPackage
	 * @generated
	 */
	public Adapter createProcessComponentPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.spem.uma.WorkProductKind <em>Work Product Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.spem.uma.WorkProductKind
	 * @generated
	 */
	public Adapter createWorkProductKindAdapter() {
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
	public Adapter createWorkProductUseAdapter() {
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

} //UmaAdapterFactory
