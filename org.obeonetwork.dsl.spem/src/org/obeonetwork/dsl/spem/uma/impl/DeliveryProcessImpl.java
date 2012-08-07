/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.dsl.spem.uma.ContractKind;
import org.obeonetwork.dsl.spem.uma.DeliveryProcess;
import org.obeonetwork.dsl.spem.uma.EstimatingTechnique;
import org.obeonetwork.dsl.spem.uma.ExpertiseLevel;
import org.obeonetwork.dsl.spem.uma.RiskLevel;
import org.obeonetwork.dsl.spem.uma.SupportingMaterial;
import org.obeonetwork.dsl.spem.uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delivery Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.DeliveryProcessImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.DeliveryProcessImpl#getProjectCharacteristics <em>Project Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.DeliveryProcessImpl#getRiskLevel <em>Risk Level</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.DeliveryProcessImpl#getEstimatingTechnique <em>Estimating Technique</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.DeliveryProcessImpl#getProjectMemberExpertise <em>Project Member Expertise</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.DeliveryProcessImpl#getTypeOfContract <em>Type Of Contract</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.DeliveryProcessImpl#getCommunicationMaterial <em>Communication Material</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.DeliveryProcessImpl#getEducationalMaterial <em>Educational Material</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeliveryProcessImpl extends ProcessImpl implements DeliveryProcess {
	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected String scale = SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectCharacteristics() <em>Project Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_CHARACTERISTICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectCharacteristics() <em>Project Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected String projectCharacteristics = PROJECT_CHARACTERISTICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRiskLevel() <em>Risk Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskLevel()
	 * @generated
	 * @ordered
	 */
	protected static final RiskLevel RISK_LEVEL_EDEFAULT = RiskLevel.LOW;

	/**
	 * The cached value of the '{@link #getRiskLevel() <em>Risk Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskLevel()
	 * @generated
	 * @ordered
	 */
	protected RiskLevel riskLevel = RISK_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatingTechnique() <em>Estimating Technique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatingTechnique()
	 * @generated
	 * @ordered
	 */
	protected static final EstimatingTechnique ESTIMATING_TECHNIQUE_EDEFAULT = EstimatingTechnique.COST;

	/**
	 * The cached value of the '{@link #getEstimatingTechnique() <em>Estimating Technique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatingTechnique()
	 * @generated
	 * @ordered
	 */
	protected EstimatingTechnique estimatingTechnique = ESTIMATING_TECHNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectMemberExpertise() <em>Project Member Expertise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectMemberExpertise()
	 * @generated
	 * @ordered
	 */
	protected static final ExpertiseLevel PROJECT_MEMBER_EXPERTISE_EDEFAULT = ExpertiseLevel.LOW;

	/**
	 * The cached value of the '{@link #getProjectMemberExpertise() <em>Project Member Expertise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectMemberExpertise()
	 * @generated
	 * @ordered
	 */
	protected ExpertiseLevel projectMemberExpertise = PROJECT_MEMBER_EXPERTISE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeOfContract() <em>Type Of Contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfContract()
	 * @generated
	 * @ordered
	 */
	protected static final ContractKind TYPE_OF_CONTRACT_EDEFAULT = ContractKind.EXPRESS;

	/**
	 * The cached value of the '{@link #getTypeOfContract() <em>Type Of Contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfContract()
	 * @generated
	 * @ordered
	 */
	protected ContractKind typeOfContract = TYPE_OF_CONTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommunicationMaterial() <em>Communication Material</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationMaterial()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportingMaterial> communicationMaterial;

	/**
	 * The cached value of the '{@link #getEducationalMaterial() <em>Educational Material</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEducationalMaterial()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportingMaterial> educationalMaterial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeliveryProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.Literals.DELIVERY_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(String newScale) {
		String oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.DELIVERY_PROCESS__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectCharacteristics() {
		return projectCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectCharacteristics(String newProjectCharacteristics) {
		String oldProjectCharacteristics = projectCharacteristics;
		projectCharacteristics = newProjectCharacteristics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.DELIVERY_PROCESS__PROJECT_CHARACTERISTICS, oldProjectCharacteristics, projectCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskLevel getRiskLevel() {
		return riskLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiskLevel(RiskLevel newRiskLevel) {
		RiskLevel oldRiskLevel = riskLevel;
		riskLevel = newRiskLevel == null ? RISK_LEVEL_EDEFAULT : newRiskLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.DELIVERY_PROCESS__RISK_LEVEL, oldRiskLevel, riskLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstimatingTechnique getEstimatingTechnique() {
		return estimatingTechnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatingTechnique(EstimatingTechnique newEstimatingTechnique) {
		EstimatingTechnique oldEstimatingTechnique = estimatingTechnique;
		estimatingTechnique = newEstimatingTechnique == null ? ESTIMATING_TECHNIQUE_EDEFAULT : newEstimatingTechnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.DELIVERY_PROCESS__ESTIMATING_TECHNIQUE, oldEstimatingTechnique, estimatingTechnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpertiseLevel getProjectMemberExpertise() {
		return projectMemberExpertise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectMemberExpertise(ExpertiseLevel newProjectMemberExpertise) {
		ExpertiseLevel oldProjectMemberExpertise = projectMemberExpertise;
		projectMemberExpertise = newProjectMemberExpertise == null ? PROJECT_MEMBER_EXPERTISE_EDEFAULT : newProjectMemberExpertise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.DELIVERY_PROCESS__PROJECT_MEMBER_EXPERTISE, oldProjectMemberExpertise, projectMemberExpertise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractKind getTypeOfContract() {
		return typeOfContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeOfContract(ContractKind newTypeOfContract) {
		ContractKind oldTypeOfContract = typeOfContract;
		typeOfContract = newTypeOfContract == null ? TYPE_OF_CONTRACT_EDEFAULT : newTypeOfContract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.DELIVERY_PROCESS__TYPE_OF_CONTRACT, oldTypeOfContract, typeOfContract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupportingMaterial> getCommunicationMaterial() {
		if (communicationMaterial == null) {
			communicationMaterial = new EObjectResolvingEList<SupportingMaterial>(SupportingMaterial.class, this, UmaPackage.DELIVERY_PROCESS__COMMUNICATION_MATERIAL);
		}
		return communicationMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupportingMaterial> getEducationalMaterial() {
		if (educationalMaterial == null) {
			educationalMaterial = new EObjectResolvingEList<SupportingMaterial>(SupportingMaterial.class, this, UmaPackage.DELIVERY_PROCESS__EDUCATIONAL_MATERIAL);
		}
		return educationalMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.DELIVERY_PROCESS__SCALE:
				return getScale();
			case UmaPackage.DELIVERY_PROCESS__PROJECT_CHARACTERISTICS:
				return getProjectCharacteristics();
			case UmaPackage.DELIVERY_PROCESS__RISK_LEVEL:
				return getRiskLevel();
			case UmaPackage.DELIVERY_PROCESS__ESTIMATING_TECHNIQUE:
				return getEstimatingTechnique();
			case UmaPackage.DELIVERY_PROCESS__PROJECT_MEMBER_EXPERTISE:
				return getProjectMemberExpertise();
			case UmaPackage.DELIVERY_PROCESS__TYPE_OF_CONTRACT:
				return getTypeOfContract();
			case UmaPackage.DELIVERY_PROCESS__COMMUNICATION_MATERIAL:
				return getCommunicationMaterial();
			case UmaPackage.DELIVERY_PROCESS__EDUCATIONAL_MATERIAL:
				return getEducationalMaterial();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UmaPackage.DELIVERY_PROCESS__SCALE:
				setScale((String)newValue);
				return;
			case UmaPackage.DELIVERY_PROCESS__PROJECT_CHARACTERISTICS:
				setProjectCharacteristics((String)newValue);
				return;
			case UmaPackage.DELIVERY_PROCESS__RISK_LEVEL:
				setRiskLevel((RiskLevel)newValue);
				return;
			case UmaPackage.DELIVERY_PROCESS__ESTIMATING_TECHNIQUE:
				setEstimatingTechnique((EstimatingTechnique)newValue);
				return;
			case UmaPackage.DELIVERY_PROCESS__PROJECT_MEMBER_EXPERTISE:
				setProjectMemberExpertise((ExpertiseLevel)newValue);
				return;
			case UmaPackage.DELIVERY_PROCESS__TYPE_OF_CONTRACT:
				setTypeOfContract((ContractKind)newValue);
				return;
			case UmaPackage.DELIVERY_PROCESS__COMMUNICATION_MATERIAL:
				getCommunicationMaterial().clear();
				getCommunicationMaterial().addAll((Collection<? extends SupportingMaterial>)newValue);
				return;
			case UmaPackage.DELIVERY_PROCESS__EDUCATIONAL_MATERIAL:
				getEducationalMaterial().clear();
				getEducationalMaterial().addAll((Collection<? extends SupportingMaterial>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UmaPackage.DELIVERY_PROCESS__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case UmaPackage.DELIVERY_PROCESS__PROJECT_CHARACTERISTICS:
				setProjectCharacteristics(PROJECT_CHARACTERISTICS_EDEFAULT);
				return;
			case UmaPackage.DELIVERY_PROCESS__RISK_LEVEL:
				setRiskLevel(RISK_LEVEL_EDEFAULT);
				return;
			case UmaPackage.DELIVERY_PROCESS__ESTIMATING_TECHNIQUE:
				setEstimatingTechnique(ESTIMATING_TECHNIQUE_EDEFAULT);
				return;
			case UmaPackage.DELIVERY_PROCESS__PROJECT_MEMBER_EXPERTISE:
				setProjectMemberExpertise(PROJECT_MEMBER_EXPERTISE_EDEFAULT);
				return;
			case UmaPackage.DELIVERY_PROCESS__TYPE_OF_CONTRACT:
				setTypeOfContract(TYPE_OF_CONTRACT_EDEFAULT);
				return;
			case UmaPackage.DELIVERY_PROCESS__COMMUNICATION_MATERIAL:
				getCommunicationMaterial().clear();
				return;
			case UmaPackage.DELIVERY_PROCESS__EDUCATIONAL_MATERIAL:
				getEducationalMaterial().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UmaPackage.DELIVERY_PROCESS__SCALE:
				return SCALE_EDEFAULT == null ? scale != null : !SCALE_EDEFAULT.equals(scale);
			case UmaPackage.DELIVERY_PROCESS__PROJECT_CHARACTERISTICS:
				return PROJECT_CHARACTERISTICS_EDEFAULT == null ? projectCharacteristics != null : !PROJECT_CHARACTERISTICS_EDEFAULT.equals(projectCharacteristics);
			case UmaPackage.DELIVERY_PROCESS__RISK_LEVEL:
				return riskLevel != RISK_LEVEL_EDEFAULT;
			case UmaPackage.DELIVERY_PROCESS__ESTIMATING_TECHNIQUE:
				return estimatingTechnique != ESTIMATING_TECHNIQUE_EDEFAULT;
			case UmaPackage.DELIVERY_PROCESS__PROJECT_MEMBER_EXPERTISE:
				return projectMemberExpertise != PROJECT_MEMBER_EXPERTISE_EDEFAULT;
			case UmaPackage.DELIVERY_PROCESS__TYPE_OF_CONTRACT:
				return typeOfContract != TYPE_OF_CONTRACT_EDEFAULT;
			case UmaPackage.DELIVERY_PROCESS__COMMUNICATION_MATERIAL:
				return communicationMaterial != null && !communicationMaterial.isEmpty();
			case UmaPackage.DELIVERY_PROCESS__EDUCATIONAL_MATERIAL:
				return educationalMaterial != null && !educationalMaterial.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (scale: ");
		result.append(scale);
		result.append(", projectCharacteristics: ");
		result.append(projectCharacteristics);
		result.append(", riskLevel: ");
		result.append(riskLevel);
		result.append(", estimatingTechnique: ");
		result.append(estimatingTechnique);
		result.append(", projectMemberExpertise: ");
		result.append(projectMemberExpertise);
		result.append(", typeOfContract: ");
		result.append(typeOfContract);
		result.append(')');
		return result.toString();
	}

} //DeliveryProcessImpl
