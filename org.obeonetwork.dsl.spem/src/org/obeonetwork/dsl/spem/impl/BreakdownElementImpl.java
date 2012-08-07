/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.spem.BreakdownElement;
import org.obeonetwork.dsl.spem.PlanningData;
import org.obeonetwork.dsl.spem.SpemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Breakdown Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.BreakdownElementImpl#isHasMultipleOccurrences <em>Has Multiple Occurrences</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.BreakdownElementImpl#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.BreakdownElementImpl#isIsPlanned <em>Is Planned</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.BreakdownElementImpl#getPlanningData <em>Planning Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BreakdownElementImpl extends ProcessElementImpl implements BreakdownElement {
	/**
	 * The default value of the '{@link #isHasMultipleOccurrences() <em>Has Multiple Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasMultipleOccurrences()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_MULTIPLE_OCCURRENCES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasMultipleOccurrences() <em>Has Multiple Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasMultipleOccurrences()
	 * @generated
	 * @ordered
	 */
	protected boolean hasMultipleOccurrences = HAS_MULTIPLE_OCCURRENCES_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean isOptional = IS_OPTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPlanned() <em>Is Planned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPlanned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PLANNED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPlanned() <em>Is Planned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPlanned()
	 * @generated
	 * @ordered
	 */
	protected boolean isPlanned = IS_PLANNED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlanningData() <em>Planning Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanningData()
	 * @generated
	 * @ordered
	 */
	protected PlanningData planningData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreakdownElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.BREAKDOWN_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasMultipleOccurrences() {
		return hasMultipleOccurrences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasMultipleOccurrences(boolean newHasMultipleOccurrences) {
		boolean oldHasMultipleOccurrences = hasMultipleOccurrences;
		hasMultipleOccurrences = newHasMultipleOccurrences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.BREAKDOWN_ELEMENT__HAS_MULTIPLE_OCCURRENCES, oldHasMultipleOccurrences, hasMultipleOccurrences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOptional() {
		return isOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOptional(boolean newIsOptional) {
		boolean oldIsOptional = isOptional;
		isOptional = newIsOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.BREAKDOWN_ELEMENT__IS_OPTIONAL, oldIsOptional, isOptional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPlanned() {
		return isPlanned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPlanned(boolean newIsPlanned) {
		boolean oldIsPlanned = isPlanned;
		isPlanned = newIsPlanned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.BREAKDOWN_ELEMENT__IS_PLANNED, oldIsPlanned, isPlanned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanningData getPlanningData() {
		return planningData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanningData(PlanningData newPlanningData, NotificationChain msgs) {
		PlanningData oldPlanningData = planningData;
		planningData = newPlanningData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpemPackage.BREAKDOWN_ELEMENT__PLANNING_DATA, oldPlanningData, newPlanningData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanningData(PlanningData newPlanningData) {
		if (newPlanningData != planningData) {
			NotificationChain msgs = null;
			if (planningData != null)
				msgs = ((InternalEObject)planningData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpemPackage.BREAKDOWN_ELEMENT__PLANNING_DATA, null, msgs);
			if (newPlanningData != null)
				msgs = ((InternalEObject)newPlanningData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpemPackage.BREAKDOWN_ELEMENT__PLANNING_DATA, null, msgs);
			msgs = basicSetPlanningData(newPlanningData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.BREAKDOWN_ELEMENT__PLANNING_DATA, newPlanningData, newPlanningData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpemPackage.BREAKDOWN_ELEMENT__PLANNING_DATA:
				return basicSetPlanningData(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.BREAKDOWN_ELEMENT__HAS_MULTIPLE_OCCURRENCES:
				return isHasMultipleOccurrences();
			case SpemPackage.BREAKDOWN_ELEMENT__IS_OPTIONAL:
				return isIsOptional();
			case SpemPackage.BREAKDOWN_ELEMENT__IS_PLANNED:
				return isIsPlanned();
			case SpemPackage.BREAKDOWN_ELEMENT__PLANNING_DATA:
				return getPlanningData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpemPackage.BREAKDOWN_ELEMENT__HAS_MULTIPLE_OCCURRENCES:
				setHasMultipleOccurrences((Boolean)newValue);
				return;
			case SpemPackage.BREAKDOWN_ELEMENT__IS_OPTIONAL:
				setIsOptional((Boolean)newValue);
				return;
			case SpemPackage.BREAKDOWN_ELEMENT__IS_PLANNED:
				setIsPlanned((Boolean)newValue);
				return;
			case SpemPackage.BREAKDOWN_ELEMENT__PLANNING_DATA:
				setPlanningData((PlanningData)newValue);
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
			case SpemPackage.BREAKDOWN_ELEMENT__HAS_MULTIPLE_OCCURRENCES:
				setHasMultipleOccurrences(HAS_MULTIPLE_OCCURRENCES_EDEFAULT);
				return;
			case SpemPackage.BREAKDOWN_ELEMENT__IS_OPTIONAL:
				setIsOptional(IS_OPTIONAL_EDEFAULT);
				return;
			case SpemPackage.BREAKDOWN_ELEMENT__IS_PLANNED:
				setIsPlanned(IS_PLANNED_EDEFAULT);
				return;
			case SpemPackage.BREAKDOWN_ELEMENT__PLANNING_DATA:
				setPlanningData((PlanningData)null);
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
			case SpemPackage.BREAKDOWN_ELEMENT__HAS_MULTIPLE_OCCURRENCES:
				return hasMultipleOccurrences != HAS_MULTIPLE_OCCURRENCES_EDEFAULT;
			case SpemPackage.BREAKDOWN_ELEMENT__IS_OPTIONAL:
				return isOptional != IS_OPTIONAL_EDEFAULT;
			case SpemPackage.BREAKDOWN_ELEMENT__IS_PLANNED:
				return isPlanned != IS_PLANNED_EDEFAULT;
			case SpemPackage.BREAKDOWN_ELEMENT__PLANNING_DATA:
				return planningData != null;
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
		result.append(" (hasMultipleOccurrences: ");
		result.append(hasMultipleOccurrences);
		result.append(", isOptional: ");
		result.append(isOptional);
		result.append(", isPlanned: ");
		result.append(isPlanned);
		result.append(')');
		return result.toString();
	}

} //BreakdownElementImpl
