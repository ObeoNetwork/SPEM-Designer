/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.spem.uma.UmaPackage
 * @generated
 */
public class UmaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UmaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmaSwitch() {
		if (modelPackage == null) {
			modelPackage = UmaPackage.eINSTANCE;
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
			case UmaPackage.ARTIFACT: {
				Artifact artifact = (Artifact)theEObject;
				T result = caseArtifact(artifact);
				if (result == null) result = caseWorkProductUse(artifact);
				if (result == null) result = caseMethodContentUse(artifact);
				if (result == null) result = caseBreakdownElement(artifact);
				if (result == null) result = caseProcessElement(artifact);
				if (result == null) result = caseDescribableElement(artifact);
				if (result == null) result = caseProcessPackageableElement(artifact);
				if (result == null) result = caseExtensibleElement(artifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.CAPABILITY_PATTERN: {
				CapabilityPattern capabilityPattern = (CapabilityPattern)theEObject;
				T result = caseCapabilityPattern(capabilityPattern);
				if (result == null) result = caseProcess(capabilityPattern);
				if (result == null) result = caseActivity(capabilityPattern);
				if (result == null) result = caseWorkDefinition(capabilityPattern);
				if (result == null) result = caseWorkBreakdownElement(capabilityPattern);
				if (result == null) result = caseVariabilityElement(capabilityPattern);
				if (result == null) result = caseBreakdownElement(capabilityPattern);
				if (result == null) result = caseProcessElement(capabilityPattern);
				if (result == null) result = caseDescribableElement(capabilityPattern);
				if (result == null) result = caseProcessPackageableElement(capabilityPattern);
				if (result == null) result = caseExtensibleElement(capabilityPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.CHECKLIST: {
				Checklist checklist = (Checklist)theEObject;
				T result = caseChecklist(checklist);
				if (result == null) result = caseGuidance(checklist);
				if (result == null) result = caseMethodContentElement(checklist);
				if (result == null) result = caseDescribableElement(checklist);
				if (result == null) result = caseMethodContentPackageableElement(checklist);
				if (result == null) result = caseVariabilityElement(checklist);
				if (result == null) result = caseExtensibleElement(checklist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.CONCEPT: {
				Concept concept = (Concept)theEObject;
				T result = caseConcept(concept);
				if (result == null) result = caseGuidance(concept);
				if (result == null) result = caseMethodContentElement(concept);
				if (result == null) result = caseDescribableElement(concept);
				if (result == null) result = caseMethodContentPackageableElement(concept);
				if (result == null) result = caseVariabilityElement(concept);
				if (result == null) result = caseExtensibleElement(concept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.CATEGORY_PACKAGE: {
				CategoryPackage categoryPackage = (CategoryPackage)theEObject;
				T result = caseCategoryPackage(categoryPackage);
				if (result == null) result = caseMethodContentPackage(categoryPackage);
				if (result == null) result = caseMethodContentPackageableElement(categoryPackage);
				if (result == null) result = caseMethodPluginPackageableElement(categoryPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.CUSTOM_CATEGORY: {
				CustomCategory customCategory = (CustomCategory)theEObject;
				T result = caseCustomCategory(customCategory);
				if (result == null) result = caseCategory(customCategory);
				if (result == null) result = caseMethodContentElement(customCategory);
				if (result == null) result = caseDescribableElement(customCategory);
				if (result == null) result = caseMethodContentPackageableElement(customCategory);
				if (result == null) result = caseVariabilityElement(customCategory);
				if (result == null) result = caseExtensibleElement(customCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.DELIVERABLE: {
				Deliverable deliverable = (Deliverable)theEObject;
				T result = caseDeliverable(deliverable);
				if (result == null) result = caseWorkProductUse(deliverable);
				if (result == null) result = caseMethodContentUse(deliverable);
				if (result == null) result = caseBreakdownElement(deliverable);
				if (result == null) result = caseProcessElement(deliverable);
				if (result == null) result = caseDescribableElement(deliverable);
				if (result == null) result = caseProcessPackageableElement(deliverable);
				if (result == null) result = caseExtensibleElement(deliverable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.PROCESS: {
				org.obeonetwork.dsl.spem.uma.Process process = (org.obeonetwork.dsl.spem.uma.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseActivity(process);
				if (result == null) result = caseWorkDefinition(process);
				if (result == null) result = caseWorkBreakdownElement(process);
				if (result == null) result = caseVariabilityElement(process);
				if (result == null) result = caseBreakdownElement(process);
				if (result == null) result = caseProcessElement(process);
				if (result == null) result = caseDescribableElement(process);
				if (result == null) result = caseProcessPackageableElement(process);
				if (result == null) result = caseExtensibleElement(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.DELIVERY_PROCESS: {
				DeliveryProcess deliveryProcess = (DeliveryProcess)theEObject;
				T result = caseDeliveryProcess(deliveryProcess);
				if (result == null) result = caseProcess(deliveryProcess);
				if (result == null) result = caseActivity(deliveryProcess);
				if (result == null) result = caseWorkDefinition(deliveryProcess);
				if (result == null) result = caseWorkBreakdownElement(deliveryProcess);
				if (result == null) result = caseVariabilityElement(deliveryProcess);
				if (result == null) result = caseBreakdownElement(deliveryProcess);
				if (result == null) result = caseProcessElement(deliveryProcess);
				if (result == null) result = caseDescribableElement(deliveryProcess);
				if (result == null) result = caseProcessPackageableElement(deliveryProcess);
				if (result == null) result = caseExtensibleElement(deliveryProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.DISCIPLINE: {
				Discipline discipline = (Discipline)theEObject;
				T result = caseDiscipline(discipline);
				if (result == null) result = caseCategory(discipline);
				if (result == null) result = caseMethodContentElement(discipline);
				if (result == null) result = caseDescribableElement(discipline);
				if (result == null) result = caseMethodContentPackageableElement(discipline);
				if (result == null) result = caseVariabilityElement(discipline);
				if (result == null) result = caseExtensibleElement(discipline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.DISCIPLINE_GROUPING: {
				DisciplineGrouping disciplineGrouping = (DisciplineGrouping)theEObject;
				T result = caseDisciplineGrouping(disciplineGrouping);
				if (result == null) result = caseCategory(disciplineGrouping);
				if (result == null) result = caseMethodContentElement(disciplineGrouping);
				if (result == null) result = caseDescribableElement(disciplineGrouping);
				if (result == null) result = caseMethodContentPackageableElement(disciplineGrouping);
				if (result == null) result = caseVariabilityElement(disciplineGrouping);
				if (result == null) result = caseExtensibleElement(disciplineGrouping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.ROOT: {
				Root root = (Root)theEObject;
				T result = caseRoot(root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.DOMAIN: {
				Domain domain = (Domain)theEObject;
				T result = caseDomain(domain);
				if (result == null) result = caseCategory(domain);
				if (result == null) result = caseMethodContentElement(domain);
				if (result == null) result = caseDescribableElement(domain);
				if (result == null) result = caseMethodContentPackageableElement(domain);
				if (result == null) result = caseVariabilityElement(domain);
				if (result == null) result = caseExtensibleElement(domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.ESTIMATING_CONSIDERATION: {
				EstimatingConsideration estimatingConsideration = (EstimatingConsideration)theEObject;
				T result = caseEstimatingConsideration(estimatingConsideration);
				if (result == null) result = caseGuidance(estimatingConsideration);
				if (result == null) result = caseMethodContentElement(estimatingConsideration);
				if (result == null) result = caseDescribableElement(estimatingConsideration);
				if (result == null) result = caseMethodContentPackageableElement(estimatingConsideration);
				if (result == null) result = caseVariabilityElement(estimatingConsideration);
				if (result == null) result = caseExtensibleElement(estimatingConsideration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.EXAMPLE: {
				Example example = (Example)theEObject;
				T result = caseExample(example);
				if (result == null) result = caseGuidance(example);
				if (result == null) result = caseMethodContentElement(example);
				if (result == null) result = caseDescribableElement(example);
				if (result == null) result = caseMethodContentPackageableElement(example);
				if (result == null) result = caseVariabilityElement(example);
				if (result == null) result = caseExtensibleElement(example);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.ITERATION: {
				Iteration iteration = (Iteration)theEObject;
				T result = caseIteration(iteration);
				if (result == null) result = caseActivity(iteration);
				if (result == null) result = caseWorkDefinition(iteration);
				if (result == null) result = caseWorkBreakdownElement(iteration);
				if (result == null) result = caseVariabilityElement(iteration);
				if (result == null) result = caseBreakdownElement(iteration);
				if (result == null) result = caseProcessElement(iteration);
				if (result == null) result = caseDescribableElement(iteration);
				if (result == null) result = caseProcessPackageableElement(iteration);
				if (result == null) result = caseExtensibleElement(iteration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.OUTCOME: {
				Outcome outcome = (Outcome)theEObject;
				T result = caseOutcome(outcome);
				if (result == null) result = caseWorkProductUse(outcome);
				if (result == null) result = caseMethodContentUse(outcome);
				if (result == null) result = caseBreakdownElement(outcome);
				if (result == null) result = caseProcessElement(outcome);
				if (result == null) result = caseDescribableElement(outcome);
				if (result == null) result = caseProcessPackageableElement(outcome);
				if (result == null) result = caseExtensibleElement(outcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.PHASE: {
				Phase phase = (Phase)theEObject;
				T result = casePhase(phase);
				if (result == null) result = caseActivity(phase);
				if (result == null) result = caseWorkDefinition(phase);
				if (result == null) result = caseWorkBreakdownElement(phase);
				if (result == null) result = caseVariabilityElement(phase);
				if (result == null) result = caseBreakdownElement(phase);
				if (result == null) result = caseProcessElement(phase);
				if (result == null) result = caseDescribableElement(phase);
				if (result == null) result = caseProcessPackageableElement(phase);
				if (result == null) result = caseExtensibleElement(phase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.PRACTICE: {
				Practice practice = (Practice)theEObject;
				T result = casePractice(practice);
				if (result == null) result = caseGuidance(practice);
				if (result == null) result = caseMethodContentElement(practice);
				if (result == null) result = caseDescribableElement(practice);
				if (result == null) result = caseMethodContentPackageableElement(practice);
				if (result == null) result = caseVariabilityElement(practice);
				if (result == null) result = caseExtensibleElement(practice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.PROCESS_PLANNING_TEMPLATE: {
				ProcessPlanningTemplate processPlanningTemplate = (ProcessPlanningTemplate)theEObject;
				T result = caseProcessPlanningTemplate(processPlanningTemplate);
				if (result == null) result = caseProcess(processPlanningTemplate);
				if (result == null) result = caseActivity(processPlanningTemplate);
				if (result == null) result = caseWorkDefinition(processPlanningTemplate);
				if (result == null) result = caseWorkBreakdownElement(processPlanningTemplate);
				if (result == null) result = caseVariabilityElement(processPlanningTemplate);
				if (result == null) result = caseBreakdownElement(processPlanningTemplate);
				if (result == null) result = caseProcessElement(processPlanningTemplate);
				if (result == null) result = caseDescribableElement(processPlanningTemplate);
				if (result == null) result = caseProcessPackageableElement(processPlanningTemplate);
				if (result == null) result = caseExtensibleElement(processPlanningTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.REPORT: {
				Report report = (Report)theEObject;
				T result = caseReport(report);
				if (result == null) result = caseGuidance(report);
				if (result == null) result = caseMethodContentElement(report);
				if (result == null) result = caseDescribableElement(report);
				if (result == null) result = caseMethodContentPackageableElement(report);
				if (result == null) result = caseVariabilityElement(report);
				if (result == null) result = caseExtensibleElement(report);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.REUSABLE_ASSET: {
				ReusableAsset reusableAsset = (ReusableAsset)theEObject;
				T result = caseReusableAsset(reusableAsset);
				if (result == null) result = caseGuidance(reusableAsset);
				if (result == null) result = caseMethodContentElement(reusableAsset);
				if (result == null) result = caseDescribableElement(reusableAsset);
				if (result == null) result = caseMethodContentPackageableElement(reusableAsset);
				if (result == null) result = caseVariabilityElement(reusableAsset);
				if (result == null) result = caseExtensibleElement(reusableAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.ROADMAP: {
				Roadmap roadmap = (Roadmap)theEObject;
				T result = caseRoadmap(roadmap);
				if (result == null) result = caseGuidance(roadmap);
				if (result == null) result = caseMethodContentElement(roadmap);
				if (result == null) result = caseDescribableElement(roadmap);
				if (result == null) result = caseMethodContentPackageableElement(roadmap);
				if (result == null) result = caseVariabilityElement(roadmap);
				if (result == null) result = caseExtensibleElement(roadmap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.TEMPLATE: {
				Template template = (Template)theEObject;
				T result = caseTemplate(template);
				if (result == null) result = caseGuidance(template);
				if (result == null) result = caseMethodContentElement(template);
				if (result == null) result = caseDescribableElement(template);
				if (result == null) result = caseMethodContentPackageableElement(template);
				if (result == null) result = caseVariabilityElement(template);
				if (result == null) result = caseExtensibleElement(template);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.TERM_DEFINITION: {
				TermDefinition termDefinition = (TermDefinition)theEObject;
				T result = caseTermDefinition(termDefinition);
				if (result == null) result = caseGuidance(termDefinition);
				if (result == null) result = caseMethodContentElement(termDefinition);
				if (result == null) result = caseDescribableElement(termDefinition);
				if (result == null) result = caseMethodContentPackageableElement(termDefinition);
				if (result == null) result = caseVariabilityElement(termDefinition);
				if (result == null) result = caseExtensibleElement(termDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.TOOL_MENTOR: {
				ToolMentor toolMentor = (ToolMentor)theEObject;
				T result = caseToolMentor(toolMentor);
				if (result == null) result = caseGuidance(toolMentor);
				if (result == null) result = caseMethodContentElement(toolMentor);
				if (result == null) result = caseDescribableElement(toolMentor);
				if (result == null) result = caseMethodContentPackageableElement(toolMentor);
				if (result == null) result = caseVariabilityElement(toolMentor);
				if (result == null) result = caseExtensibleElement(toolMentor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.WHITEPAPER: {
				Whitepaper whitepaper = (Whitepaper)theEObject;
				T result = caseWhitepaper(whitepaper);
				if (result == null) result = caseConcept(whitepaper);
				if (result == null) result = caseGuidance(whitepaper);
				if (result == null) result = caseMethodContentElement(whitepaper);
				if (result == null) result = caseDescribableElement(whitepaper);
				if (result == null) result = caseMethodContentPackageableElement(whitepaper);
				if (result == null) result = caseVariabilityElement(whitepaper);
				if (result == null) result = caseExtensibleElement(whitepaper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.GUIDELINE: {
				Guideline guideline = (Guideline)theEObject;
				T result = caseGuideline(guideline);
				if (result == null) result = caseGuidance(guideline);
				if (result == null) result = caseMethodContentElement(guideline);
				if (result == null) result = caseDescribableElement(guideline);
				if (result == null) result = caseMethodContentPackageableElement(guideline);
				if (result == null) result = caseVariabilityElement(guideline);
				if (result == null) result = caseExtensibleElement(guideline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.SUPPORTING_MATERIAL: {
				SupportingMaterial supportingMaterial = (SupportingMaterial)theEObject;
				T result = caseSupportingMaterial(supportingMaterial);
				if (result == null) result = caseGuidance(supportingMaterial);
				if (result == null) result = caseMethodContentElement(supportingMaterial);
				if (result == null) result = caseDescribableElement(supportingMaterial);
				if (result == null) result = caseMethodContentPackageableElement(supportingMaterial);
				if (result == null) result = caseVariabilityElement(supportingMaterial);
				if (result == null) result = caseExtensibleElement(supportingMaterial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.ROLE_DEFINITION_PACKAGE: {
				RoleDefinitionPackage roleDefinitionPackage = (RoleDefinitionPackage)theEObject;
				T result = caseRoleDefinitionPackage(roleDefinitionPackage);
				if (result == null) result = caseMethodContentPackage(roleDefinitionPackage);
				if (result == null) result = caseMethodContentPackageableElement(roleDefinitionPackage);
				if (result == null) result = caseMethodPluginPackageableElement(roleDefinitionPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.TASK_DEFINITION_PACKAGE: {
				TaskDefinitionPackage taskDefinitionPackage = (TaskDefinitionPackage)theEObject;
				T result = caseTaskDefinitionPackage(taskDefinitionPackage);
				if (result == null) result = caseMethodContentPackage(taskDefinitionPackage);
				if (result == null) result = caseMethodContentPackageableElement(taskDefinitionPackage);
				if (result == null) result = caseMethodPluginPackageableElement(taskDefinitionPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.WORK_PRODUCT_DEFINITION_PACKAGE: {
				WorkProductDefinitionPackage workProductDefinitionPackage = (WorkProductDefinitionPackage)theEObject;
				T result = caseWorkProductDefinitionPackage(workProductDefinitionPackage);
				if (result == null) result = caseMethodContentPackage(workProductDefinitionPackage);
				if (result == null) result = caseMethodContentPackageableElement(workProductDefinitionPackage);
				if (result == null) result = caseMethodPluginPackageableElement(workProductDefinitionPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.GUIDANCE_PACKAGE: {
				GuidancePackage guidancePackage = (GuidancePackage)theEObject;
				T result = caseGuidancePackage(guidancePackage);
				if (result == null) result = caseMethodContentPackage(guidancePackage);
				if (result == null) result = caseMethodContentPackageableElement(guidancePackage);
				if (result == null) result = caseMethodPluginPackageableElement(guidancePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.DISCIPLINE_PACKAGE: {
				DisciplinePackage disciplinePackage = (DisciplinePackage)theEObject;
				T result = caseDisciplinePackage(disciplinePackage);
				if (result == null) result = caseMethodContentPackage(disciplinePackage);
				if (result == null) result = caseMethodContentPackageableElement(disciplinePackage);
				if (result == null) result = caseMethodPluginPackageableElement(disciplinePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.DOMAIN_PACKAGE: {
				DomainPackage domainPackage = (DomainPackage)theEObject;
				T result = caseDomainPackage(domainPackage);
				if (result == null) result = caseMethodContentPackage(domainPackage);
				if (result == null) result = caseMethodContentPackageableElement(domainPackage);
				if (result == null) result = caseMethodPluginPackageableElement(domainPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.WORK_PRODUCT_KIND_PACKAGE: {
				WorkProductKindPackage workProductKindPackage = (WorkProductKindPackage)theEObject;
				T result = caseWorkProductKindPackage(workProductKindPackage);
				if (result == null) result = caseMethodContentPackage(workProductKindPackage);
				if (result == null) result = caseMethodContentPackageableElement(workProductKindPackage);
				if (result == null) result = caseMethodPluginPackageableElement(workProductKindPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.ROLE_SET_PACKAGE: {
				RoleSetPackage roleSetPackage = (RoleSetPackage)theEObject;
				T result = caseRoleSetPackage(roleSetPackage);
				if (result == null) result = caseMethodContentPackage(roleSetPackage);
				if (result == null) result = caseMethodContentPackageableElement(roleSetPackage);
				if (result == null) result = caseMethodPluginPackageableElement(roleSetPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.TOOL_DEFINITION_PACKAGE: {
				ToolDefinitionPackage toolDefinitionPackage = (ToolDefinitionPackage)theEObject;
				T result = caseToolDefinitionPackage(toolDefinitionPackage);
				if (result == null) result = caseMethodContentPackage(toolDefinitionPackage);
				if (result == null) result = caseMethodContentPackageableElement(toolDefinitionPackage);
				if (result == null) result = caseMethodPluginPackageableElement(toolDefinitionPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.CONFIGURATION_PACKAGE: {
				ConfigurationPackage configurationPackage = (ConfigurationPackage)theEObject;
				T result = caseConfigurationPackage(configurationPackage);
				if (result == null) result = caseMethodContentPackage(configurationPackage);
				if (result == null) result = caseMethodContentPackageableElement(configurationPackage);
				if (result == null) result = caseMethodPluginPackageableElement(configurationPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.CAPABILITY_PATTERN_PACKAGE: {
				CapabilityPatternPackage capabilityPatternPackage = (CapabilityPatternPackage)theEObject;
				T result = caseCapabilityPatternPackage(capabilityPatternPackage);
				if (result == null) result = caseProcessPackage(capabilityPatternPackage);
				if (result == null) result = caseProcessPackageableElement(capabilityPatternPackage);
				if (result == null) result = caseMethodPluginPackageableElement(capabilityPatternPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.DELIVERY_PROCESS_PACKAGE: {
				DeliveryProcessPackage deliveryProcessPackage = (DeliveryProcessPackage)theEObject;
				T result = caseDeliveryProcessPackage(deliveryProcessPackage);
				if (result == null) result = caseProcessPackage(deliveryProcessPackage);
				if (result == null) result = caseProcessPackageableElement(deliveryProcessPackage);
				if (result == null) result = caseMethodPluginPackageableElement(deliveryProcessPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.ROLE_SET: {
				RoleSet roleSet = (RoleSet)theEObject;
				T result = caseRoleSet(roleSet);
				if (result == null) result = caseMethodContentElement(roleSet);
				if (result == null) result = caseDescribableElement(roleSet);
				if (result == null) result = caseMethodContentPackageableElement(roleSet);
				if (result == null) result = caseVariabilityElement(roleSet);
				if (result == null) result = caseExtensibleElement(roleSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.QUALIFICATION_PACKAGE: {
				QualificationPackage qualificationPackage = (QualificationPackage)theEObject;
				T result = caseQualificationPackage(qualificationPackage);
				if (result == null) result = caseMethodContentPackage(qualificationPackage);
				if (result == null) result = caseMethodContentPackageableElement(qualificationPackage);
				if (result == null) result = caseMethodPluginPackageableElement(qualificationPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.PROCESS_COMPONENT_PACKAGE: {
				ProcessComponentPackage processComponentPackage = (ProcessComponentPackage)theEObject;
				T result = caseProcessComponentPackage(processComponentPackage);
				if (result == null) result = caseProcessPackage(processComponentPackage);
				if (result == null) result = caseProcessPackageableElement(processComponentPackage);
				if (result == null) result = caseMethodPluginPackageableElement(processComponentPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.WORK_PRODUCT_KIND: {
				WorkProductKind workProductKind = (WorkProductKind)theEObject;
				T result = caseWorkProductKind(workProductKind);
				if (result == null) result = caseKind(workProductKind);
				if (result == null) result = caseMethodContentElement(workProductKind);
				if (result == null) result = caseDescribableElement(workProductKind);
				if (result == null) result = caseMethodContentPackageableElement(workProductKind);
				if (result == null) result = caseVariabilityElement(workProductKind);
				if (result == null) result = caseExtensibleElement(workProductKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityPattern(CapabilityPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Checklist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Checklist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChecklist(Checklist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcept(Concept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoryPackage(CategoryPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomCategory(CustomCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deliverable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deliverable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeliverable(Deliverable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(org.obeonetwork.dsl.spem.uma.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delivery Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delivery Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeliveryProcess(DeliveryProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discipline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discipline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscipline(Discipline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discipline Grouping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discipline Grouping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisciplineGrouping(DisciplineGrouping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoot(Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomain(Domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Estimating Consideration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Estimating Consideration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEstimatingConsideration(EstimatingConsideration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExample(Example object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iteration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iteration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIteration(Iteration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outcome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutcome(Outcome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhase(Phase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Practice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Practice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePractice(Practice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Planning Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Planning Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessPlanningTemplate(ProcessPlanningTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReport(Report object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reusable Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reusable Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReusableAsset(ReusableAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Roadmap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Roadmap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoadmap(Roadmap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplate(Template object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermDefinition(TermDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Mentor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Mentor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolMentor(ToolMentor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Whitepaper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Whitepaper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhitepaper(Whitepaper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guideline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guideline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuideline(Guideline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supporting Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supporting Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportingMaterial(SupportingMaterial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Definition Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Definition Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleDefinitionPackage(RoleDefinitionPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Definition Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Definition Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskDefinitionPackage(TaskDefinitionPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Product Definition Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Product Definition Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkProductDefinitionPackage(WorkProductDefinitionPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guidance Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guidance Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuidancePackage(GuidancePackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discipline Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discipline Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisciplinePackage(DisciplinePackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainPackage(DomainPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Product Kind Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Product Kind Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkProductKindPackage(WorkProductKindPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Set Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Set Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleSetPackage(RoleSetPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Definition Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Definition Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolDefinitionPackage(ToolDefinitionPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationPackage(ConfigurationPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Pattern Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Pattern Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityPatternPackage(CapabilityPatternPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delivery Process Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delivery Process Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeliveryProcessPackage(DeliveryProcessPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleSet(RoleSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualification Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualification Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualificationPackage(QualificationPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Component Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Component Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessComponentPackage(ProcessComponentPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Product Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Product Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkProductKind(WorkProductKind object) {
		return null;
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

} //UmaSwitch
