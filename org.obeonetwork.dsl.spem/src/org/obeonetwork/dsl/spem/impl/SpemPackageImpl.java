/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.obeonetwork.dsl.spem.Activity;
import org.obeonetwork.dsl.spem.ActivityUseKind;
import org.obeonetwork.dsl.spem.BreakdownElement;
import org.obeonetwork.dsl.spem.Category;
import org.obeonetwork.dsl.spem.CompositeRole;
import org.obeonetwork.dsl.spem.Default_ResponsibilityAssignment;
import org.obeonetwork.dsl.spem.Default_TaskDefinitionParameter;
import org.obeonetwork.dsl.spem.Default_TaskDefinitionPerformer;
import org.obeonetwork.dsl.spem.DescribableElement;
import org.obeonetwork.dsl.spem.ExtensibleElement;
import org.obeonetwork.dsl.spem.Guidance;
import org.obeonetwork.dsl.spem.Kind;
import org.obeonetwork.dsl.spem.MethodConfiguration;
import org.obeonetwork.dsl.spem.MethodContentElement;
import org.obeonetwork.dsl.spem.MethodContentKind;
import org.obeonetwork.dsl.spem.MethodContentPackage;
import org.obeonetwork.dsl.spem.MethodContentPackageableElement;
import org.obeonetwork.dsl.spem.MethodContentUse;
import org.obeonetwork.dsl.spem.MethodLibrary;
import org.obeonetwork.dsl.spem.MethodLibraryPackageableElement;
import org.obeonetwork.dsl.spem.MethodPlugin;
import org.obeonetwork.dsl.spem.MethodPluginPackageableElement;
import org.obeonetwork.dsl.spem.Metric;
import org.obeonetwork.dsl.spem.Milestone;
import org.obeonetwork.dsl.spem.OptionalityKind;
import org.obeonetwork.dsl.spem.ParameterDirectionKind;
import org.obeonetwork.dsl.spem.PlanningData;
import org.obeonetwork.dsl.spem.ProcessComponent;
import org.obeonetwork.dsl.spem.ProcessComponentUse;
import org.obeonetwork.dsl.spem.ProcessElement;
import org.obeonetwork.dsl.spem.ProcessKind;
import org.obeonetwork.dsl.spem.ProcessPackage;
import org.obeonetwork.dsl.spem.ProcessPackageableElement;
import org.obeonetwork.dsl.spem.ProcessParameter;
import org.obeonetwork.dsl.spem.ProcessPerformer;
import org.obeonetwork.dsl.spem.ProcessResponsibilityAssignment;
import org.obeonetwork.dsl.spem.Qualification;
import org.obeonetwork.dsl.spem.RoleDefinition;
import org.obeonetwork.dsl.spem.RoleUse;
import org.obeonetwork.dsl.spem.SpemFactory;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.Step;
import org.obeonetwork.dsl.spem.TaskDefinition;
import org.obeonetwork.dsl.spem.TaskUse;
import org.obeonetwork.dsl.spem.TeamProfile;
import org.obeonetwork.dsl.spem.ToolDefinition;
import org.obeonetwork.dsl.spem.VariabilityElement;
import org.obeonetwork.dsl.spem.VariabilityType;
import org.obeonetwork.dsl.spem.WorkBreakdownElement;
import org.obeonetwork.dsl.spem.WorkDefinition;
import org.obeonetwork.dsl.spem.WorkDefinitionParameter;
import org.obeonetwork.dsl.spem.WorkDefinitionPerformer;
import org.obeonetwork.dsl.spem.WorkProductDefinition;
import org.obeonetwork.dsl.spem.WorkProductDefinitionRelationship;
import org.obeonetwork.dsl.spem.WorkProductPort;
import org.obeonetwork.dsl.spem.WorkProductPortConnector;
import org.obeonetwork.dsl.spem.WorkProductRelationshipKind;
import org.obeonetwork.dsl.spem.WorkProductUse;
import org.obeonetwork.dsl.spem.WorkProductUseRelationship;
import org.obeonetwork.dsl.spem.WorkSequence;
import org.obeonetwork.dsl.spem.WorkSequenceKind;

import org.obeonetwork.dsl.spem.uma.UmaPackage;

import org.obeonetwork.dsl.spem.uma.impl.UmaPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpemPackageImpl extends EPackageImpl implements SpemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensibleElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workDefinitionPerformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workDefinitionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakdownElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workBreakdownElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processPerformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processResponsibilityAssignmentEClass = null;

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
	private EClass workProductUseRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass milestoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass describableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guidanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodContentElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workProductDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workProductDefinitionRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass default_TaskDefinitionPerformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass default_ResponsibilityAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass default_TaskDefinitionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodContentPackageableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processPackageableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodContentPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodContentKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planningDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodContentUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teamProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variabilityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processComponentUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodLibraryPackageableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodPluginPackageableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodPluginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workProductPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workProductPortConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterDirectionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workSequenceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum activityUseKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum optionalityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variabilityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workProductRelationshipKindEEnum = null;

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
	 * @see org.obeonetwork.dsl.spem.SpemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpemPackageImpl() {
		super(eNS_URI, SpemFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SpemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpemPackage init() {
		if (isInited) return (SpemPackage)EPackage.Registry.INSTANCE.getEPackage(SpemPackage.eNS_URI);

		// Obtain or create and register package
		SpemPackageImpl theSpemPackage = (SpemPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SpemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SpemPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		UmaPackageImpl theUmaPackage = (UmaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI) instanceof UmaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI) : UmaPackage.eINSTANCE);

		// Create package meta-data objects
		theSpemPackage.createPackageContents();
		theUmaPackage.createPackageContents();

		// Initialize created meta-data
		theSpemPackage.initializePackageContents();
		theUmaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpemPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpemPackage.eNS_URI, theSpemPackage);
		return theSpemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensibleElement() {
		return extensibleElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensibleElement_Kind() {
		return (EReference)extensibleElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKind() {
		return kindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkDefinitionPerformer() {
		return workDefinitionPerformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkDefinitionPerformer_LinkedWorkDefinition() {
		return (EReference)workDefinitionPerformerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkDefinition() {
		return workDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkDefinition_PreCondition() {
		return (EAttribute)workDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkDefinition_PostCondition() {
		return (EAttribute)workDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkDefinition_OwnedParameter() {
		return (EReference)workDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkDefinitionParameter() {
		return workDefinitionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkDefinitionParameter_Direction() {
		return (EAttribute)workDefinitionParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreakdownElement() {
		return breakdownElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreakdownElement_HasMultipleOccurrences() {
		return (EAttribute)breakdownElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreakdownElement_IsOptional() {
		return (EAttribute)breakdownElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreakdownElement_IsPlanned() {
		return (EAttribute)breakdownElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakdownElement_PlanningData() {
		return (EReference)breakdownElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkBreakdownElement() {
		return workBreakdownElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkBreakdownElement_IsRepeatable() {
		return (EAttribute)workBreakdownElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkBreakdownElement_IsOngoing() {
		return (EAttribute)workBreakdownElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkBreakdownElement_IsEventDriven() {
		return (EAttribute)workBreakdownElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkBreakdownElement_LinkToPredecessor() {
		return (EReference)workBreakdownElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkBreakdownElement_LinkToSuccessor() {
		return (EReference)workBreakdownElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkSequence() {
		return workSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkSequence_LinkKind() {
		return (EAttribute)workSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkSequence_Predecessor() {
		return (EReference)workSequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkSequence_Successor() {
		return (EReference)workSequenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_UseKind() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_UsedActivity() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_NestedBreakdownElement() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_SuppressedBreakdownElement() {
		return (EReference)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_OwnedProcessParameter() {
		return (EReference)activityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_DefaultContext() {
		return (EReference)activityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_ValidContext() {
		return (EReference)activityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_IsEnactable() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessPerformer() {
		return processPerformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessPerformer_LinkedRoleUse() {
		return (EReference)processPerformerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessPerformer_LinkedActivity() {
		return (EReference)processPerformerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessPerformer_LinkedTaskUse() {
		return (EReference)processPerformerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleUse() {
		return roleUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleUse_Role() {
		return (EReference)roleUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleUse_AppliedQualification() {
		return (EReference)roleUseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessResponsibilityAssignment() {
		return processResponsibilityAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponsibilityAssignment_LinkedRoleUse() {
		return (EReference)processResponsibilityAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponsibilityAssignment_LinkedWorkProductUse() {
		return (EReference)processResponsibilityAssignmentEClass.getEStructuralFeatures().get(1);
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
	public EReference getWorkProductUse_WorkProduct() {
		return (EReference)workProductUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkProductUseRelationship() {
		return workProductUseRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkProductUseRelationship_Source() {
		return (EReference)workProductUseRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkProductUseRelationship_Target() {
		return (EReference)workProductUseRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkProductUseRelationship_RelationshipKind() {
		return (EAttribute)workProductUseRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessParameter() {
		return processParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessParameter_ParameterType() {
		return (EReference)processParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessParameter_Optionality() {
		return (EAttribute)processParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMilestone() {
		return milestoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMilestone_RequiredResult() {
		return (EReference)milestoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessElement() {
		return processElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessElement_ProcessKind() {
		return (EReference)processElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescribableElement() {
		return describableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescribableElement_PresentationName() {
		return (EAttribute)describableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescribableElement_BriefDescription() {
		return (EAttribute)describableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescribableElement_MainDescription() {
		return (EAttribute)describableElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescribableElement_Purpose() {
		return (EAttribute)describableElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescribableElement_Guidance() {
		return (EReference)describableElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescribableElement_Metric() {
		return (EReference)describableElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescribableElement_Category() {
		return (EReference)describableElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescribableElement_Copyright() {
		return (EAttribute)describableElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescribableElement_Author() {
		return (EAttribute)describableElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescribableElement_ChangeDate() {
		return (EAttribute)describableElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescribableElement_ChangeDescription() {
		return (EAttribute)describableElementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescribableElement_Version() {
		return (EAttribute)describableElementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_SubCategory() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_CategorizedElement() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuidance() {
		return guidanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetric() {
		return metricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Expression() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodContentElement() {
		return methodContentElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodContentElement_MethodContentKind() {
		return (EReference)methodContentElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolDefinition() {
		return toolDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolDefinition_ManagedWorkProduct() {
		return (EReference)toolDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskDefinition() {
		return taskDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskDefinition_OwnedTaskDefinitionParameter() {
		return (EReference)taskDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskDefinition_UsedTool() {
		return (EReference)taskDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskDefinition_Step() {
		return (EReference)taskDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskDefinition_RequiredQualification() {
		return (EReference)taskDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Name() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Predecessor() {
		return (EReference)stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Successor() {
		return (EReference)stepEClass.getEStructuralFeatures().get(2);
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
	public EClass getRoleDefinition() {
		return roleDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleDefinition_Synonym() {
		return (EAttribute)roleDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleDefinition_ProvidedQualification() {
		return (EReference)roleDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkProductDefinitionRelationship() {
		return workProductDefinitionRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkProductDefinitionRelationship_Source() {
		return (EReference)workProductDefinitionRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkProductDefinitionRelationship_Target() {
		return (EReference)workProductDefinitionRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefault_TaskDefinitionPerformer() {
		return default_TaskDefinitionPerformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefault_TaskDefinitionPerformer_LinkedTaskDefinition() {
		return (EReference)default_TaskDefinitionPerformerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefault_TaskDefinitionPerformer_LinkedRoleDefinition() {
		return (EReference)default_TaskDefinitionPerformerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefault_ResponsibilityAssignment() {
		return default_ResponsibilityAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefault_ResponsibilityAssignment_LinkedRoleDefinition() {
		return (EReference)default_ResponsibilityAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefault_ResponsibilityAssignment_LinkedWorkProductDefinition() {
		return (EReference)default_ResponsibilityAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefault_TaskDefinitionParameter() {
		return default_TaskDefinitionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefault_TaskDefinitionParameter_Name() {
		return (EAttribute)default_TaskDefinitionParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefault_TaskDefinitionParameter_ParameterType() {
		return (EReference)default_TaskDefinitionParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefault_TaskDefinitionParameter_Optionality() {
		return (EAttribute)default_TaskDefinitionParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualification() {
		return qualificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodContentPackageableElement() {
		return methodContentPackageableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodContentPackageableElement_Name() {
		return (EAttribute)methodContentPackageableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessPackageableElement() {
		return processPackageableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessPackageableElement_Name() {
		return (EAttribute)processPackageableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodContentPackage() {
		return methodContentPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodContentPackage_OwnedMethodContentMember() {
		return (EReference)methodContentPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodContentPackage_ReusedPackage() {
		return (EReference)methodContentPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessPackage() {
		return processPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessPackage_OwnedProcessMember() {
		return (EReference)processPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodContentKind() {
		return methodContentKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessKind() {
		return processKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanningData() {
		return planningDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanningData_StartDate() {
		return (EAttribute)planningDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanningData_FinishDate() {
		return (EAttribute)planningDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanningData_Rank() {
		return (EAttribute)planningDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanningData_Duration() {
		return (EAttribute)planningDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodContentUse() {
		return methodContentUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodContentUse_IsSynchronizedWithSource() {
		return (EAttribute)methodContentUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskUse() {
		return taskUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskUse_Task() {
		return (EReference)taskUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskUse_UsedQualification() {
		return (EReference)taskUseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskUse_SelectedStep() {
		return (EReference)taskUseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskUse_OwnedProcessParameter() {
		return (EReference)taskUseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskUse_PreCondition() {
		return (EAttribute)taskUseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskUse_PostCondition() {
		return (EAttribute)taskUseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeRole() {
		return compositeRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeRole_AggregatedRole() {
		return (EReference)compositeRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTeamProfile() {
		return teamProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeamProfile_SubTeam() {
		return (EReference)teamProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeamProfile_SuperTeam() {
		return (EReference)teamProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeamProfile_TeamRole() {
		return (EReference)teamProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariabilityElement() {
		return variabilityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariabilityElement_VariabilityType() {
		return (EAttribute)variabilityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariabilityElement_VariabilityBasedOnElement() {
		return (EReference)variabilityElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessComponent() {
		return processComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessComponent_Process() {
		return (EReference)processComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessComponent_OwnedPort() {
		return (EReference)processComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessComponentUse() {
		return processComponentUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessComponentUse_ProcessComponent() {
		return (EReference)processComponentUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessComponentUse_UsedPort() {
		return (EReference)processComponentUseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodLibraryPackageableElement() {
		return methodLibraryPackageableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodLibraryPackageableElement_Name() {
		return (EAttribute)methodLibraryPackageableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodPluginPackageableElement() {
		return methodPluginPackageableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodConfiguration() {
		return methodConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodConfiguration_BaseConfiguration() {
		return (EReference)methodConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodConfiguration_MethodPluginSelection() {
		return (EReference)methodConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodConfiguration_ProcessPackageSelection() {
		return (EReference)methodConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodConfiguration_ContentPackageSelection() {
		return (EReference)methodConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodConfiguration_SubstractedCategory() {
		return (EReference)methodConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodConfiguration_DefaultView() {
		return (EReference)methodConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodConfiguration_ProcessView() {
		return (EReference)methodConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodPlugin() {
		return methodPluginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodPlugin_OwnedMethodContentPackage() {
		return (EReference)methodPluginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodPlugin_OwnedProcessPackage() {
		return (EReference)methodPluginEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodPlugin_BasePlugin() {
		return (EReference)methodPluginEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodLibrary() {
		return methodLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodLibrary_Name() {
		return (EAttribute)methodLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodLibrary_OwnedMethodPlugin() {
		return (EReference)methodLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodLibrary_PredefinedConfiguration() {
		return (EReference)methodLibraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodLibrary_ConfigurationPackage() {
		return (EReference)methodLibraryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkProductPort() {
		return workProductPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkProductPort_IsOptional() {
		return (EAttribute)workProductPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkProductPort_PortKind() {
		return (EAttribute)workProductPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkProductPort_PortType() {
		return (EReference)workProductPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkProductPortConnector() {
		return workProductPortConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkProductPortConnector_ConnectedPort() {
		return (EReference)workProductPortConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterDirectionKind() {
		return parameterDirectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWorkSequenceKind() {
		return workSequenceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActivityUseKind() {
		return activityUseKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOptionalityKind() {
		return optionalityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVariabilityType() {
		return variabilityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWorkProductRelationshipKind() {
		return workProductRelationshipKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpemFactory getSpemFactory() {
		return (SpemFactory)getEFactoryInstance();
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
		extensibleElementEClass = createEClass(EXTENSIBLE_ELEMENT);
		createEReference(extensibleElementEClass, EXTENSIBLE_ELEMENT__KIND);

		kindEClass = createEClass(KIND);

		workDefinitionPerformerEClass = createEClass(WORK_DEFINITION_PERFORMER);
		createEReference(workDefinitionPerformerEClass, WORK_DEFINITION_PERFORMER__LINKED_WORK_DEFINITION);

		workDefinitionEClass = createEClass(WORK_DEFINITION);
		createEAttribute(workDefinitionEClass, WORK_DEFINITION__PRE_CONDITION);
		createEAttribute(workDefinitionEClass, WORK_DEFINITION__POST_CONDITION);
		createEReference(workDefinitionEClass, WORK_DEFINITION__OWNED_PARAMETER);

		workDefinitionParameterEClass = createEClass(WORK_DEFINITION_PARAMETER);
		createEAttribute(workDefinitionParameterEClass, WORK_DEFINITION_PARAMETER__DIRECTION);

		breakdownElementEClass = createEClass(BREAKDOWN_ELEMENT);
		createEAttribute(breakdownElementEClass, BREAKDOWN_ELEMENT__HAS_MULTIPLE_OCCURRENCES);
		createEAttribute(breakdownElementEClass, BREAKDOWN_ELEMENT__IS_OPTIONAL);
		createEAttribute(breakdownElementEClass, BREAKDOWN_ELEMENT__IS_PLANNED);
		createEReference(breakdownElementEClass, BREAKDOWN_ELEMENT__PLANNING_DATA);

		workBreakdownElementEClass = createEClass(WORK_BREAKDOWN_ELEMENT);
		createEAttribute(workBreakdownElementEClass, WORK_BREAKDOWN_ELEMENT__IS_REPEATABLE);
		createEAttribute(workBreakdownElementEClass, WORK_BREAKDOWN_ELEMENT__IS_ONGOING);
		createEAttribute(workBreakdownElementEClass, WORK_BREAKDOWN_ELEMENT__IS_EVENT_DRIVEN);
		createEReference(workBreakdownElementEClass, WORK_BREAKDOWN_ELEMENT__LINK_TO_PREDECESSOR);
		createEReference(workBreakdownElementEClass, WORK_BREAKDOWN_ELEMENT__LINK_TO_SUCCESSOR);

		workSequenceEClass = createEClass(WORK_SEQUENCE);
		createEAttribute(workSequenceEClass, WORK_SEQUENCE__LINK_KIND);
		createEReference(workSequenceEClass, WORK_SEQUENCE__PREDECESSOR);
		createEReference(workSequenceEClass, WORK_SEQUENCE__SUCCESSOR);

		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__USE_KIND);
		createEReference(activityEClass, ACTIVITY__USED_ACTIVITY);
		createEReference(activityEClass, ACTIVITY__NESTED_BREAKDOWN_ELEMENT);
		createEReference(activityEClass, ACTIVITY__SUPPRESSED_BREAKDOWN_ELEMENT);
		createEReference(activityEClass, ACTIVITY__OWNED_PROCESS_PARAMETER);
		createEReference(activityEClass, ACTIVITY__DEFAULT_CONTEXT);
		createEReference(activityEClass, ACTIVITY__VALID_CONTEXT);
		createEAttribute(activityEClass, ACTIVITY__IS_ENACTABLE);

		processPerformerEClass = createEClass(PROCESS_PERFORMER);
		createEReference(processPerformerEClass, PROCESS_PERFORMER__LINKED_ROLE_USE);
		createEReference(processPerformerEClass, PROCESS_PERFORMER__LINKED_ACTIVITY);
		createEReference(processPerformerEClass, PROCESS_PERFORMER__LINKED_TASK_USE);

		roleUseEClass = createEClass(ROLE_USE);
		createEReference(roleUseEClass, ROLE_USE__ROLE);
		createEReference(roleUseEClass, ROLE_USE__APPLIED_QUALIFICATION);

		processResponsibilityAssignmentEClass = createEClass(PROCESS_RESPONSIBILITY_ASSIGNMENT);
		createEReference(processResponsibilityAssignmentEClass, PROCESS_RESPONSIBILITY_ASSIGNMENT__LINKED_ROLE_USE);
		createEReference(processResponsibilityAssignmentEClass, PROCESS_RESPONSIBILITY_ASSIGNMENT__LINKED_WORK_PRODUCT_USE);

		workProductUseEClass = createEClass(WORK_PRODUCT_USE);
		createEReference(workProductUseEClass, WORK_PRODUCT_USE__WORK_PRODUCT);

		workProductUseRelationshipEClass = createEClass(WORK_PRODUCT_USE_RELATIONSHIP);
		createEReference(workProductUseRelationshipEClass, WORK_PRODUCT_USE_RELATIONSHIP__SOURCE);
		createEReference(workProductUseRelationshipEClass, WORK_PRODUCT_USE_RELATIONSHIP__TARGET);
		createEAttribute(workProductUseRelationshipEClass, WORK_PRODUCT_USE_RELATIONSHIP__RELATIONSHIP_KIND);

		processParameterEClass = createEClass(PROCESS_PARAMETER);
		createEReference(processParameterEClass, PROCESS_PARAMETER__PARAMETER_TYPE);
		createEAttribute(processParameterEClass, PROCESS_PARAMETER__OPTIONALITY);

		milestoneEClass = createEClass(MILESTONE);
		createEReference(milestoneEClass, MILESTONE__REQUIRED_RESULT);

		processElementEClass = createEClass(PROCESS_ELEMENT);
		createEReference(processElementEClass, PROCESS_ELEMENT__PROCESS_KIND);

		describableElementEClass = createEClass(DESCRIBABLE_ELEMENT);
		createEAttribute(describableElementEClass, DESCRIBABLE_ELEMENT__PRESENTATION_NAME);
		createEAttribute(describableElementEClass, DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION);
		createEAttribute(describableElementEClass, DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION);
		createEAttribute(describableElementEClass, DESCRIBABLE_ELEMENT__PURPOSE);
		createEReference(describableElementEClass, DESCRIBABLE_ELEMENT__GUIDANCE);
		createEReference(describableElementEClass, DESCRIBABLE_ELEMENT__METRIC);
		createEReference(describableElementEClass, DESCRIBABLE_ELEMENT__CATEGORY);
		createEAttribute(describableElementEClass, DESCRIBABLE_ELEMENT__COPYRIGHT);
		createEAttribute(describableElementEClass, DESCRIBABLE_ELEMENT__AUTHOR);
		createEAttribute(describableElementEClass, DESCRIBABLE_ELEMENT__CHANGE_DATE);
		createEAttribute(describableElementEClass, DESCRIBABLE_ELEMENT__CHANGE_DESCRIPTION);
		createEAttribute(describableElementEClass, DESCRIBABLE_ELEMENT__VERSION);

		categoryEClass = createEClass(CATEGORY);
		createEReference(categoryEClass, CATEGORY__SUB_CATEGORY);
		createEReference(categoryEClass, CATEGORY__CATEGORIZED_ELEMENT);

		guidanceEClass = createEClass(GUIDANCE);

		metricEClass = createEClass(METRIC);
		createEAttribute(metricEClass, METRIC__EXPRESSION);

		methodContentElementEClass = createEClass(METHOD_CONTENT_ELEMENT);
		createEReference(methodContentElementEClass, METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND);

		toolDefinitionEClass = createEClass(TOOL_DEFINITION);
		createEReference(toolDefinitionEClass, TOOL_DEFINITION__MANAGED_WORK_PRODUCT);

		taskDefinitionEClass = createEClass(TASK_DEFINITION);
		createEReference(taskDefinitionEClass, TASK_DEFINITION__OWNED_TASK_DEFINITION_PARAMETER);
		createEReference(taskDefinitionEClass, TASK_DEFINITION__USED_TOOL);
		createEReference(taskDefinitionEClass, TASK_DEFINITION__STEP);
		createEReference(taskDefinitionEClass, TASK_DEFINITION__REQUIRED_QUALIFICATION);

		stepEClass = createEClass(STEP);
		createEAttribute(stepEClass, STEP__NAME);
		createEReference(stepEClass, STEP__PREDECESSOR);
		createEReference(stepEClass, STEP__SUCCESSOR);

		workProductDefinitionEClass = createEClass(WORK_PRODUCT_DEFINITION);

		roleDefinitionEClass = createEClass(ROLE_DEFINITION);
		createEAttribute(roleDefinitionEClass, ROLE_DEFINITION__SYNONYM);
		createEReference(roleDefinitionEClass, ROLE_DEFINITION__PROVIDED_QUALIFICATION);

		workProductDefinitionRelationshipEClass = createEClass(WORK_PRODUCT_DEFINITION_RELATIONSHIP);
		createEReference(workProductDefinitionRelationshipEClass, WORK_PRODUCT_DEFINITION_RELATIONSHIP__SOURCE);
		createEReference(workProductDefinitionRelationshipEClass, WORK_PRODUCT_DEFINITION_RELATIONSHIP__TARGET);

		default_TaskDefinitionPerformerEClass = createEClass(DEFAULT_TASK_DEFINITION_PERFORMER);
		createEReference(default_TaskDefinitionPerformerEClass, DEFAULT_TASK_DEFINITION_PERFORMER__LINKED_TASK_DEFINITION);
		createEReference(default_TaskDefinitionPerformerEClass, DEFAULT_TASK_DEFINITION_PERFORMER__LINKED_ROLE_DEFINITION);

		default_ResponsibilityAssignmentEClass = createEClass(DEFAULT_RESPONSIBILITY_ASSIGNMENT);
		createEReference(default_ResponsibilityAssignmentEClass, DEFAULT_RESPONSIBILITY_ASSIGNMENT__LINKED_ROLE_DEFINITION);
		createEReference(default_ResponsibilityAssignmentEClass, DEFAULT_RESPONSIBILITY_ASSIGNMENT__LINKED_WORK_PRODUCT_DEFINITION);

		default_TaskDefinitionParameterEClass = createEClass(DEFAULT_TASK_DEFINITION_PARAMETER);
		createEAttribute(default_TaskDefinitionParameterEClass, DEFAULT_TASK_DEFINITION_PARAMETER__NAME);
		createEReference(default_TaskDefinitionParameterEClass, DEFAULT_TASK_DEFINITION_PARAMETER__PARAMETER_TYPE);
		createEAttribute(default_TaskDefinitionParameterEClass, DEFAULT_TASK_DEFINITION_PARAMETER__OPTIONALITY);

		qualificationEClass = createEClass(QUALIFICATION);

		methodContentPackageableElementEClass = createEClass(METHOD_CONTENT_PACKAGEABLE_ELEMENT);
		createEAttribute(methodContentPackageableElementEClass, METHOD_CONTENT_PACKAGEABLE_ELEMENT__NAME);

		processPackageableElementEClass = createEClass(PROCESS_PACKAGEABLE_ELEMENT);
		createEAttribute(processPackageableElementEClass, PROCESS_PACKAGEABLE_ELEMENT__NAME);

		methodContentPackageEClass = createEClass(METHOD_CONTENT_PACKAGE);
		createEReference(methodContentPackageEClass, METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER);
		createEReference(methodContentPackageEClass, METHOD_CONTENT_PACKAGE__REUSED_PACKAGE);

		processPackageEClass = createEClass(PROCESS_PACKAGE);
		createEReference(processPackageEClass, PROCESS_PACKAGE__OWNED_PROCESS_MEMBER);

		methodContentKindEClass = createEClass(METHOD_CONTENT_KIND);

		processKindEClass = createEClass(PROCESS_KIND);

		planningDataEClass = createEClass(PLANNING_DATA);
		createEAttribute(planningDataEClass, PLANNING_DATA__START_DATE);
		createEAttribute(planningDataEClass, PLANNING_DATA__FINISH_DATE);
		createEAttribute(planningDataEClass, PLANNING_DATA__RANK);
		createEAttribute(planningDataEClass, PLANNING_DATA__DURATION);

		methodContentUseEClass = createEClass(METHOD_CONTENT_USE);
		createEAttribute(methodContentUseEClass, METHOD_CONTENT_USE__IS_SYNCHRONIZED_WITH_SOURCE);

		taskUseEClass = createEClass(TASK_USE);
		createEReference(taskUseEClass, TASK_USE__TASK);
		createEReference(taskUseEClass, TASK_USE__USED_QUALIFICATION);
		createEReference(taskUseEClass, TASK_USE__SELECTED_STEP);
		createEReference(taskUseEClass, TASK_USE__OWNED_PROCESS_PARAMETER);
		createEAttribute(taskUseEClass, TASK_USE__PRE_CONDITION);
		createEAttribute(taskUseEClass, TASK_USE__POST_CONDITION);

		compositeRoleEClass = createEClass(COMPOSITE_ROLE);
		createEReference(compositeRoleEClass, COMPOSITE_ROLE__AGGREGATED_ROLE);

		teamProfileEClass = createEClass(TEAM_PROFILE);
		createEReference(teamProfileEClass, TEAM_PROFILE__SUB_TEAM);
		createEReference(teamProfileEClass, TEAM_PROFILE__SUPER_TEAM);
		createEReference(teamProfileEClass, TEAM_PROFILE__TEAM_ROLE);

		variabilityElementEClass = createEClass(VARIABILITY_ELEMENT);
		createEAttribute(variabilityElementEClass, VARIABILITY_ELEMENT__VARIABILITY_TYPE);
		createEReference(variabilityElementEClass, VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT);

		processComponentEClass = createEClass(PROCESS_COMPONENT);
		createEReference(processComponentEClass, PROCESS_COMPONENT__PROCESS);
		createEReference(processComponentEClass, PROCESS_COMPONENT__OWNED_PORT);

		processComponentUseEClass = createEClass(PROCESS_COMPONENT_USE);
		createEReference(processComponentUseEClass, PROCESS_COMPONENT_USE__PROCESS_COMPONENT);
		createEReference(processComponentUseEClass, PROCESS_COMPONENT_USE__USED_PORT);

		methodLibraryPackageableElementEClass = createEClass(METHOD_LIBRARY_PACKAGEABLE_ELEMENT);
		createEAttribute(methodLibraryPackageableElementEClass, METHOD_LIBRARY_PACKAGEABLE_ELEMENT__NAME);

		methodPluginPackageableElementEClass = createEClass(METHOD_PLUGIN_PACKAGEABLE_ELEMENT);

		methodConfigurationEClass = createEClass(METHOD_CONFIGURATION);
		createEReference(methodConfigurationEClass, METHOD_CONFIGURATION__BASE_CONFIGURATION);
		createEReference(methodConfigurationEClass, METHOD_CONFIGURATION__METHOD_PLUGIN_SELECTION);
		createEReference(methodConfigurationEClass, METHOD_CONFIGURATION__PROCESS_PACKAGE_SELECTION);
		createEReference(methodConfigurationEClass, METHOD_CONFIGURATION__CONTENT_PACKAGE_SELECTION);
		createEReference(methodConfigurationEClass, METHOD_CONFIGURATION__SUBSTRACTED_CATEGORY);
		createEReference(methodConfigurationEClass, METHOD_CONFIGURATION__DEFAULT_VIEW);
		createEReference(methodConfigurationEClass, METHOD_CONFIGURATION__PROCESS_VIEW);

		methodPluginEClass = createEClass(METHOD_PLUGIN);
		createEReference(methodPluginEClass, METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE);
		createEReference(methodPluginEClass, METHOD_PLUGIN__OWNED_PROCESS_PACKAGE);
		createEReference(methodPluginEClass, METHOD_PLUGIN__BASE_PLUGIN);

		methodLibraryEClass = createEClass(METHOD_LIBRARY);
		createEAttribute(methodLibraryEClass, METHOD_LIBRARY__NAME);
		createEReference(methodLibraryEClass, METHOD_LIBRARY__OWNED_METHOD_PLUGIN);
		createEReference(methodLibraryEClass, METHOD_LIBRARY__PREDEFINED_CONFIGURATION);
		createEReference(methodLibraryEClass, METHOD_LIBRARY__CONFIGURATION_PACKAGE);

		workProductPortEClass = createEClass(WORK_PRODUCT_PORT);
		createEAttribute(workProductPortEClass, WORK_PRODUCT_PORT__IS_OPTIONAL);
		createEAttribute(workProductPortEClass, WORK_PRODUCT_PORT__PORT_KIND);
		createEReference(workProductPortEClass, WORK_PRODUCT_PORT__PORT_TYPE);

		workProductPortConnectorEClass = createEClass(WORK_PRODUCT_PORT_CONNECTOR);
		createEReference(workProductPortConnectorEClass, WORK_PRODUCT_PORT_CONNECTOR__CONNECTED_PORT);

		// Create enums
		parameterDirectionKindEEnum = createEEnum(PARAMETER_DIRECTION_KIND);
		workSequenceKindEEnum = createEEnum(WORK_SEQUENCE_KIND);
		activityUseKindEEnum = createEEnum(ACTIVITY_USE_KIND);
		optionalityKindEEnum = createEEnum(OPTIONALITY_KIND);
		variabilityTypeEEnum = createEEnum(VARIABILITY_TYPE);
		workProductRelationshipKindEEnum = createEEnum(WORK_PRODUCT_RELATIONSHIP_KIND);
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
		UmaPackage theUmaPackage = (UmaPackage)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theUmaPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		kindEClass.getESuperTypes().add(this.getExtensibleElement());
		breakdownElementEClass.getESuperTypes().add(this.getProcessElement());
		workBreakdownElementEClass.getESuperTypes().add(this.getBreakdownElement());
		workSequenceEClass.getESuperTypes().add(this.getBreakdownElement());
		activityEClass.getESuperTypes().add(this.getWorkDefinition());
		activityEClass.getESuperTypes().add(this.getWorkBreakdownElement());
		activityEClass.getESuperTypes().add(this.getVariabilityElement());
		processPerformerEClass.getESuperTypes().add(this.getWorkDefinitionPerformer());
		processPerformerEClass.getESuperTypes().add(this.getBreakdownElement());
		roleUseEClass.getESuperTypes().add(this.getMethodContentUse());
		processResponsibilityAssignmentEClass.getESuperTypes().add(this.getBreakdownElement());
		workProductUseEClass.getESuperTypes().add(this.getMethodContentUse());
		workProductUseRelationshipEClass.getESuperTypes().add(this.getBreakdownElement());
		processParameterEClass.getESuperTypes().add(this.getWorkDefinitionParameter());
		processParameterEClass.getESuperTypes().add(this.getBreakdownElement());
		milestoneEClass.getESuperTypes().add(this.getWorkBreakdownElement());
		processElementEClass.getESuperTypes().add(this.getDescribableElement());
		processElementEClass.getESuperTypes().add(this.getProcessPackageableElement());
		describableElementEClass.getESuperTypes().add(this.getExtensibleElement());
		categoryEClass.getESuperTypes().add(this.getMethodContentElement());
		guidanceEClass.getESuperTypes().add(this.getMethodContentElement());
		metricEClass.getESuperTypes().add(this.getDescribableElement());
		methodContentElementEClass.getESuperTypes().add(this.getDescribableElement());
		methodContentElementEClass.getESuperTypes().add(this.getMethodContentPackageableElement());
		methodContentElementEClass.getESuperTypes().add(this.getVariabilityElement());
		toolDefinitionEClass.getESuperTypes().add(this.getMethodContentElement());
		taskDefinitionEClass.getESuperTypes().add(this.getWorkDefinition());
		taskDefinitionEClass.getESuperTypes().add(this.getMethodContentElement());
		stepEClass.getESuperTypes().add(this.getWorkDefinition());
		stepEClass.getESuperTypes().add(this.getDescribableElement());
		stepEClass.getESuperTypes().add(this.getVariabilityElement());
		workProductDefinitionEClass.getESuperTypes().add(this.getMethodContentElement());
		roleDefinitionEClass.getESuperTypes().add(this.getMethodContentElement());
		workProductDefinitionRelationshipEClass.getESuperTypes().add(this.getMethodContentElement());
		default_TaskDefinitionPerformerEClass.getESuperTypes().add(this.getMethodContentElement());
		default_ResponsibilityAssignmentEClass.getESuperTypes().add(this.getMethodContentElement());
		default_TaskDefinitionParameterEClass.getESuperTypes().add(this.getWorkDefinitionParameter());
		qualificationEClass.getESuperTypes().add(this.getMethodContentElement());
		methodContentPackageEClass.getESuperTypes().add(this.getMethodContentPackageableElement());
		methodContentPackageEClass.getESuperTypes().add(this.getMethodPluginPackageableElement());
		processPackageEClass.getESuperTypes().add(this.getProcessPackageableElement());
		processPackageEClass.getESuperTypes().add(this.getMethodPluginPackageableElement());
		methodContentKindEClass.getESuperTypes().add(this.getMethodContentElement());
		methodContentKindEClass.getESuperTypes().add(this.getKind());
		processKindEClass.getESuperTypes().add(this.getProcessElement());
		processKindEClass.getESuperTypes().add(this.getKind());
		planningDataEClass.getESuperTypes().add(this.getProcessElement());
		methodContentUseEClass.getESuperTypes().add(this.getBreakdownElement());
		taskUseEClass.getESuperTypes().add(this.getMethodContentUse());
		taskUseEClass.getESuperTypes().add(this.getWorkBreakdownElement());
		compositeRoleEClass.getESuperTypes().add(this.getRoleUse());
		teamProfileEClass.getESuperTypes().add(this.getBreakdownElement());
		processComponentEClass.getESuperTypes().add(this.getProcessPackage());
		processComponentUseEClass.getESuperTypes().add(this.getMethodContentUse());
		methodConfigurationEClass.getESuperTypes().add(this.getMethodLibraryPackageableElement());
		methodPluginEClass.getESuperTypes().add(this.getMethodLibraryPackageableElement());
		workProductPortEClass.getESuperTypes().add(this.getProcessElement());
		workProductPortConnectorEClass.getESuperTypes().add(this.getProcessElement());

		// Initialize classes and features; add operations and parameters
		initEClass(extensibleElementEClass, ExtensibleElement.class, "ExtensibleElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtensibleElement_Kind(), this.getKind(), null, "kind", null, 0, 1, ExtensibleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kindEClass, Kind.class, "Kind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workDefinitionPerformerEClass, WorkDefinitionPerformer.class, "WorkDefinitionPerformer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkDefinitionPerformer_LinkedWorkDefinition(), this.getWorkDefinition(), null, "linkedWorkDefinition", null, 0, 1, WorkDefinitionPerformer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(workDefinitionEClass, WorkDefinition.class, "WorkDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkDefinition_PreCondition(), ecorePackage.getEString(), "preCondition", null, 0, -1, WorkDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkDefinition_PostCondition(), ecorePackage.getEString(), "postCondition", null, 0, -1, WorkDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkDefinition_OwnedParameter(), this.getWorkDefinitionParameter(), null, "ownedParameter", null, 0, -1, WorkDefinition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(workDefinitionParameterEClass, WorkDefinitionParameter.class, "WorkDefinitionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkDefinitionParameter_Direction(), this.getParameterDirectionKind(), "direction", null, 0, 1, WorkDefinitionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(breakdownElementEClass, BreakdownElement.class, "BreakdownElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBreakdownElement_HasMultipleOccurrences(), ecorePackage.getEBoolean(), "hasMultipleOccurrences", "false", 1, 1, BreakdownElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBreakdownElement_IsOptional(), ecorePackage.getEBoolean(), "isOptional", "false", 1, 1, BreakdownElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBreakdownElement_IsPlanned(), ecorePackage.getEBoolean(), "isPlanned", "false", 1, 1, BreakdownElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBreakdownElement_PlanningData(), this.getPlanningData(), null, "planningData", null, 0, 1, BreakdownElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workBreakdownElementEClass, WorkBreakdownElement.class, "WorkBreakdownElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkBreakdownElement_IsRepeatable(), ecorePackage.getEBoolean(), "isRepeatable", "false", 1, 1, WorkBreakdownElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWorkBreakdownElement_IsOngoing(), ecorePackage.getEBoolean(), "isOngoing", "false", 1, 1, WorkBreakdownElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWorkBreakdownElement_IsEventDriven(), ecorePackage.getEBoolean(), "isEventDriven", "false", 1, 1, WorkBreakdownElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkBreakdownElement_LinkToPredecessor(), this.getWorkSequence(), this.getWorkSequence_Successor(), "linkToPredecessor", null, 0, -1, WorkBreakdownElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkBreakdownElement_LinkToSuccessor(), this.getWorkSequence(), this.getWorkSequence_Predecessor(), "linkToSuccessor", null, 0, -1, WorkBreakdownElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workSequenceEClass, WorkSequence.class, "WorkSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkSequence_LinkKind(), this.getWorkSequenceKind(), "linkKind", "finishToStart", 0, 1, WorkSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkSequence_Predecessor(), this.getWorkBreakdownElement(), this.getWorkBreakdownElement_LinkToSuccessor(), "predecessor", null, 1, 1, WorkSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkSequence_Successor(), this.getWorkBreakdownElement(), this.getWorkBreakdownElement_LinkToPredecessor(), "successor", null, 1, 1, WorkSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_UseKind(), this.getActivityUseKind(), "useKind", "na", 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_UsedActivity(), this.getActivity(), null, "usedActivity", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_NestedBreakdownElement(), this.getBreakdownElement(), null, "nestedBreakdownElement", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_SuppressedBreakdownElement(), this.getBreakdownElement(), null, "suppressedBreakdownElement", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_OwnedProcessParameter(), this.getProcessParameter(), null, "ownedProcessParameter", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_DefaultContext(), this.getMethodConfiguration(), null, "defaultContext", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_ValidContext(), this.getMethodConfiguration(), null, "validContext", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_IsEnactable(), ecorePackage.getEBoolean(), "isEnactable", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processPerformerEClass, ProcessPerformer.class, "ProcessPerformer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessPerformer_LinkedRoleUse(), this.getRoleUse(), null, "linkedRoleUse", null, 1, -1, ProcessPerformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessPerformer_LinkedActivity(), this.getActivity(), null, "linkedActivity", null, 0, 1, ProcessPerformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessPerformer_LinkedTaskUse(), this.getTaskUse(), null, "linkedTaskUse", null, 0, 1, ProcessPerformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleUseEClass, RoleUse.class, "RoleUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleUse_Role(), this.getRoleDefinition(), null, "role", null, 0, 1, RoleUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleUse_AppliedQualification(), this.getQualification(), null, "appliedQualification", null, 0, -1, RoleUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processResponsibilityAssignmentEClass, ProcessResponsibilityAssignment.class, "ProcessResponsibilityAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessResponsibilityAssignment_LinkedRoleUse(), this.getRoleUse(), null, "linkedRoleUse", null, 1, -1, ProcessResponsibilityAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessResponsibilityAssignment_LinkedWorkProductUse(), this.getWorkProductUse(), null, "linkedWorkProductUse", null, 1, 1, ProcessResponsibilityAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workProductUseEClass, WorkProductUse.class, "WorkProductUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkProductUse_WorkProduct(), this.getWorkProductDefinition(), null, "workProduct", null, 0, 1, WorkProductUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workProductUseRelationshipEClass, WorkProductUseRelationship.class, "WorkProductUseRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkProductUseRelationship_Source(), this.getWorkProductUse(), null, "source", null, 1, 1, WorkProductUseRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkProductUseRelationship_Target(), this.getWorkProductUse(), null, "target", null, 1, -1, WorkProductUseRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkProductUseRelationship_RelationshipKind(), this.getWorkProductRelationshipKind(), "relationshipKind", "impactedBy", 1, 1, WorkProductUseRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processParameterEClass, ProcessParameter.class, "ProcessParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessParameter_ParameterType(), this.getWorkProductUse(), null, "parameterType", null, 0, 1, ProcessParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessParameter_Optionality(), this.getOptionalityKind(), "optionality", null, 0, 1, ProcessParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(milestoneEClass, Milestone.class, "Milestone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMilestone_RequiredResult(), this.getWorkProductUse(), null, "requiredResult", null, 0, -1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processElementEClass, ProcessElement.class, "ProcessElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessElement_ProcessKind(), this.getProcessKind(), null, "processKind", null, 0, 1, ProcessElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(describableElementEClass, DescribableElement.class, "DescribableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescribableElement_PresentationName(), ecorePackage.getEString(), "presentationName", null, 0, 1, DescribableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDescribableElement_BriefDescription(), ecorePackage.getEString(), "briefDescription", null, 0, 1, DescribableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDescribableElement_MainDescription(), ecorePackage.getEString(), "mainDescription", null, 0, 1, DescribableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDescribableElement_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1, DescribableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDescribableElement_Guidance(), this.getGuidance(), null, "guidance", null, 0, -1, DescribableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDescribableElement_Metric(), this.getMetric(), null, "metric", null, 0, -1, DescribableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDescribableElement_Category(), this.getCategory(), this.getCategory_CategorizedElement(), "category", null, 0, -1, DescribableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescribableElement_Copyright(), ecorePackage.getEString(), "copyright", null, 0, 1, DescribableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescribableElement_Author(), ecorePackage.getEString(), "author", null, 0, -1, DescribableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescribableElement_ChangeDate(), ecorePackage.getEDate(), "changeDate", null, 0, 1, DescribableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescribableElement_ChangeDescription(), ecorePackage.getEString(), "changeDescription", null, 0, 1, DescribableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescribableElement_Version(), ecorePackage.getEString(), "version", null, 0, 1, DescribableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategory_SubCategory(), this.getCategory(), null, "subCategory", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategory_CategorizedElement(), this.getDescribableElement(), this.getDescribableElement_Category(), "categorizedElement", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guidanceEClass, Guidance.class, "Guidance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metricEClass, Metric.class, "Metric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetric_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodContentElementEClass, MethodContentElement.class, "MethodContentElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodContentElement_MethodContentKind(), this.getMethodContentKind(), null, "methodContentKind", null, 0, 1, MethodContentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolDefinitionEClass, ToolDefinition.class, "ToolDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToolDefinition_ManagedWorkProduct(), this.getWorkProductDefinition(), null, "managedWorkProduct", null, 0, -1, ToolDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskDefinitionEClass, TaskDefinition.class, "TaskDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskDefinition_OwnedTaskDefinitionParameter(), this.getDefault_TaskDefinitionParameter(), null, "ownedTaskDefinitionParameter", null, 0, -1, TaskDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskDefinition_UsedTool(), this.getToolDefinition(), null, "usedTool", null, 0, -1, TaskDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskDefinition_Step(), this.getStep(), null, "step", null, 0, -1, TaskDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskDefinition_RequiredQualification(), this.getQualification(), null, "requiredQualification", null, 0, -1, TaskDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStep_Name(), ecorePackage.getEString(), "name", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Predecessor(), this.getStep(), this.getStep_Successor(), "predecessor", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Successor(), this.getStep(), this.getStep_Predecessor(), "successor", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workProductDefinitionEClass, WorkProductDefinition.class, "WorkProductDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleDefinitionEClass, RoleDefinition.class, "RoleDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoleDefinition_Synonym(), ecorePackage.getEString(), "synonym", null, 0, -1, RoleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleDefinition_ProvidedQualification(), this.getQualification(), null, "providedQualification", null, 0, -1, RoleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workProductDefinitionRelationshipEClass, WorkProductDefinitionRelationship.class, "WorkProductDefinitionRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkProductDefinitionRelationship_Source(), this.getWorkProductDefinition(), null, "source", null, 1, 1, WorkProductDefinitionRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkProductDefinitionRelationship_Target(), this.getWorkProductDefinition(), null, "target", null, 1, -1, WorkProductDefinitionRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(default_TaskDefinitionPerformerEClass, Default_TaskDefinitionPerformer.class, "Default_TaskDefinitionPerformer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefault_TaskDefinitionPerformer_LinkedTaskDefinition(), this.getTaskDefinition(), null, "linkedTaskDefinition", null, 1, 1, Default_TaskDefinitionPerformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefault_TaskDefinitionPerformer_LinkedRoleDefinition(), this.getRoleDefinition(), null, "linkedRoleDefinition", null, 1, -1, Default_TaskDefinitionPerformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(default_ResponsibilityAssignmentEClass, Default_ResponsibilityAssignment.class, "Default_ResponsibilityAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefault_ResponsibilityAssignment_LinkedRoleDefinition(), this.getRoleDefinition(), null, "linkedRoleDefinition", null, 1, -1, Default_ResponsibilityAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefault_ResponsibilityAssignment_LinkedWorkProductDefinition(), this.getWorkProductDefinition(), null, "linkedWorkProductDefinition", null, 1, 1, Default_ResponsibilityAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(default_TaskDefinitionParameterEClass, Default_TaskDefinitionParameter.class, "Default_TaskDefinitionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefault_TaskDefinitionParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Default_TaskDefinitionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefault_TaskDefinitionParameter_ParameterType(), this.getWorkProductDefinition(), null, "parameterType", null, 0, 1, Default_TaskDefinitionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefault_TaskDefinitionParameter_Optionality(), this.getOptionalityKind(), "optionality", null, 0, 1, Default_TaskDefinitionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualificationEClass, Qualification.class, "Qualification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(methodContentPackageableElementEClass, MethodContentPackageableElement.class, "MethodContentPackageableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodContentPackageableElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, MethodContentPackageableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processPackageableElementEClass, ProcessPackageableElement.class, "ProcessPackageableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessPackageableElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProcessPackageableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodContentPackageEClass, MethodContentPackage.class, "MethodContentPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodContentPackage_OwnedMethodContentMember(), this.getMethodContentPackageableElement(), null, "ownedMethodContentMember", null, 0, -1, MethodContentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodContentPackage_ReusedPackage(), this.getMethodContentPackage(), null, "reusedPackage", null, 0, -1, MethodContentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processPackageEClass, ProcessPackage.class, "ProcessPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessPackage_OwnedProcessMember(), this.getProcessPackageableElement(), null, "ownedProcessMember", null, 0, -1, ProcessPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodContentKindEClass, MethodContentKind.class, "MethodContentKind", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processKindEClass, ProcessKind.class, "ProcessKind", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(planningDataEClass, PlanningData.class, "PlanningData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlanningData_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, PlanningData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanningData_FinishDate(), ecorePackage.getEDate(), "finishDate", null, 0, 1, PlanningData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanningData_Rank(), ecorePackage.getEInt(), "rank", null, 0, 1, PlanningData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanningData_Duration(), ecorePackage.getEString(), "duration", null, 0, 1, PlanningData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodContentUseEClass, MethodContentUse.class, "MethodContentUse", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodContentUse_IsSynchronizedWithSource(), ecorePackage.getEBoolean(), "isSynchronizedWithSource", null, 0, 1, MethodContentUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskUseEClass, TaskUse.class, "TaskUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskUse_Task(), this.getTaskDefinition(), null, "task", null, 0, 1, TaskUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskUse_UsedQualification(), this.getQualification(), null, "usedQualification", null, 0, -1, TaskUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskUse_SelectedStep(), this.getStep(), null, "selectedStep", null, 0, -1, TaskUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskUse_OwnedProcessParameter(), this.getProcessParameter(), null, "ownedProcessParameter", null, 0, -1, TaskUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskUse_PreCondition(), ecorePackage.getEString(), "preCondition", null, 0, 1, TaskUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskUse_PostCondition(), ecorePackage.getEString(), "postCondition", null, 0, 1, TaskUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeRoleEClass, CompositeRole.class, "CompositeRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeRole_AggregatedRole(), this.getRoleDefinition(), null, "aggregatedRole", null, 0, -1, CompositeRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teamProfileEClass, TeamProfile.class, "TeamProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTeamProfile_SubTeam(), this.getTeamProfile(), this.getTeamProfile_SuperTeam(), "subTeam", null, 0, -1, TeamProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeamProfile_SuperTeam(), this.getTeamProfile(), this.getTeamProfile_SubTeam(), "superTeam", null, 0, 1, TeamProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeamProfile_TeamRole(), this.getRoleUse(), null, "teamRole", null, 0, -1, TeamProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variabilityElementEClass, VariabilityElement.class, "VariabilityElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariabilityElement_VariabilityType(), this.getVariabilityType(), "variabilityType", null, 0, 1, VariabilityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariabilityElement_VariabilityBasedOnElement(), this.getVariabilityElement(), null, "variabilityBasedOnElement", null, 0, 1, VariabilityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processComponentEClass, ProcessComponent.class, "ProcessComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessComponent_Process(), this.getActivity(), null, "process", null, 0, 1, ProcessComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessComponent_OwnedPort(), this.getWorkProductPort(), null, "ownedPort", null, 0, -1, ProcessComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processComponentUseEClass, ProcessComponentUse.class, "ProcessComponentUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessComponentUse_ProcessComponent(), this.getProcessComponent(), null, "processComponent", null, 1, 1, ProcessComponentUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessComponentUse_UsedPort(), this.getWorkProductPort(), null, "usedPort", null, 0, -1, ProcessComponentUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodLibraryPackageableElementEClass, MethodLibraryPackageableElement.class, "MethodLibraryPackageableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodLibraryPackageableElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, MethodLibraryPackageableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodPluginPackageableElementEClass, MethodPluginPackageableElement.class, "MethodPluginPackageableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(methodConfigurationEClass, MethodConfiguration.class, "MethodConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodConfiguration_BaseConfiguration(), this.getMethodConfiguration(), null, "baseConfiguration", null, 0, -1, MethodConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodConfiguration_MethodPluginSelection(), this.getMethodPlugin(), null, "methodPluginSelection", null, 1, -1, MethodConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMethodConfiguration_ProcessPackageSelection(), this.getProcessPackage(), null, "processPackageSelection", null, 0, -1, MethodConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodConfiguration_ContentPackageSelection(), this.getMethodContentPackage(), null, "contentPackageSelection", null, 0, -1, MethodConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodConfiguration_SubstractedCategory(), this.getCategory(), null, "substractedCategory", null, 0, -1, MethodConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodConfiguration_DefaultView(), this.getCategory(), null, "defaultView", null, 1, 1, MethodConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodConfiguration_ProcessView(), this.getCategory(), null, "processView", null, 0, -1, MethodConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodPluginEClass, MethodPlugin.class, "MethodPlugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodPlugin_OwnedMethodContentPackage(), this.getMethodContentPackage(), null, "ownedMethodContentPackage", null, 0, -1, MethodPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodPlugin_OwnedProcessPackage(), this.getProcessPackage(), null, "ownedProcessPackage", null, 0, -1, MethodPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodPlugin_BasePlugin(), this.getMethodPlugin(), null, "basePlugin", null, 0, -1, MethodPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodLibraryEClass, MethodLibrary.class, "MethodLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodLibrary_Name(), ecorePackage.getEString(), "name", null, 0, 1, MethodLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodLibrary_OwnedMethodPlugin(), this.getMethodPlugin(), null, "ownedMethodPlugin", null, 0, -1, MethodLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodLibrary_PredefinedConfiguration(), this.getMethodConfiguration(), null, "predefinedConfiguration", null, 0, -1, MethodLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodLibrary_ConfigurationPackage(), this.getMethodContentPackage(), null, "configurationPackage", null, 0, 1, MethodLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workProductPortEClass, WorkProductPort.class, "WorkProductPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkProductPort_IsOptional(), ecorePackage.getEBoolean(), "isOptional", "false", 1, 1, WorkProductPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWorkProductPort_PortKind(), this.getParameterDirectionKind(), "portKind", null, 0, 1, WorkProductPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkProductPort_PortType(), this.getWorkProductDefinition(), null, "portType", null, 0, 1, WorkProductPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workProductPortConnectorEClass, WorkProductPortConnector.class, "WorkProductPortConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkProductPortConnector_ConnectedPort(), this.getWorkProductPort(), null, "connectedPort", null, 0, -1, WorkProductPortConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(parameterDirectionKindEEnum, ParameterDirectionKind.class, "ParameterDirectionKind");
		addEEnumLiteral(parameterDirectionKindEEnum, ParameterDirectionKind.IN);
		addEEnumLiteral(parameterDirectionKindEEnum, ParameterDirectionKind.OUT);
		addEEnumLiteral(parameterDirectionKindEEnum, ParameterDirectionKind.INOUT);

		initEEnum(workSequenceKindEEnum, WorkSequenceKind.class, "WorkSequenceKind");
		addEEnumLiteral(workSequenceKindEEnum, WorkSequenceKind.FINISH_TO_START);
		addEEnumLiteral(workSequenceKindEEnum, WorkSequenceKind.FINISH_TO_FINISH);
		addEEnumLiteral(workSequenceKindEEnum, WorkSequenceKind.START_TO_START);
		addEEnumLiteral(workSequenceKindEEnum, WorkSequenceKind.START_TO_FINISH);

		initEEnum(activityUseKindEEnum, ActivityUseKind.class, "ActivityUseKind");
		addEEnumLiteral(activityUseKindEEnum, ActivityUseKind.NA);
		addEEnumLiteral(activityUseKindEEnum, ActivityUseKind.EXTENSION);
		addEEnumLiteral(activityUseKindEEnum, ActivityUseKind.LOCAL_CONTRIBUTION);
		addEEnumLiteral(activityUseKindEEnum, ActivityUseKind.LOCAL_REPLACEMENT);

		initEEnum(optionalityKindEEnum, OptionalityKind.class, "OptionalityKind");
		addEEnumLiteral(optionalityKindEEnum, OptionalityKind.MANDATORY);
		addEEnumLiteral(optionalityKindEEnum, OptionalityKind.OPTIONAL);

		initEEnum(variabilityTypeEEnum, VariabilityType.class, "VariabilityType");
		addEEnumLiteral(variabilityTypeEEnum, VariabilityType.NA);
		addEEnumLiteral(variabilityTypeEEnum, VariabilityType.CONTRIBUTES);
		addEEnumLiteral(variabilityTypeEEnum, VariabilityType.EXTENDS);
		addEEnumLiteral(variabilityTypeEEnum, VariabilityType.REPLACES);
		addEEnumLiteral(variabilityTypeEEnum, VariabilityType.EXTENDS_REPLACES);

		initEEnum(workProductRelationshipKindEEnum, WorkProductRelationshipKind.class, "WorkProductRelationshipKind");
		addEEnumLiteral(workProductRelationshipKindEEnum, WorkProductRelationshipKind.IMPACTED_BY);
		addEEnumLiteral(workProductRelationshipKindEEnum, WorkProductRelationshipKind.COMPOSITION);
		addEEnumLiteral(workProductRelationshipKindEEnum, WorkProductRelationshipKind.AGGREGATION);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// add-ons
		createAddonsAnnotations();
		// TODO
		createTODOAnnotations();
	}

	/**
	 * Initializes the annotations for <b>add-ons</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAddonsAnnotations() {
		String source = "add-ons";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "uma", "WorkProductUseRelationship"
		   });			
		addAnnotation
		  (activityEClass, 
		   source, 
		   new String[] {
			 "uma", "isEnactable"
		   });		
		addAnnotation
		  (workProductUseRelationshipEClass, 
		   source, 
		   new String[] {
			 "uma", "relationshipkind"
		   });		
		addAnnotation
		  (processParameterEClass, 
		   source, 
		   new String[] {
			 "Thales R&T", "optionality (bug in the spec)"
		   });		
		addAnnotation
		  (describableElementEClass, 
		   source, 
		   new String[] {
			 "uma", "category, copyright, author, changeDate, changeDescription, version"
		   });		
		addAnnotation
		  (stepEClass, 
		   source, 
		   new String[] {
			 "Thales R&T", "predecessor, successor in order to replace Section metaclass"
		   });		
		addAnnotation
		  (methodLibraryEClass, 
		   source, 
		   new String[] {
			 "uma", "configurationPackage"
		   });
	}

	/**
	 * Initializes the annotations for <b>TODO</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTODOAnnotations() {
		String source = "TODO";			
		addAnnotation
		  (getWorkDefinition_OwnedParameter(), 
		   source, 
		   new String[] {
			 "implem", "isDerived"
		   });						
	}

} //SpemPackageImpl
