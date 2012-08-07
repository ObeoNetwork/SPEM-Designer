/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.dsl.spem.Milestone;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.WorkProductUse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Milestone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.MilestoneImpl#getRequiredResult <em>Required Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MilestoneImpl extends WorkBreakdownElementImpl implements Milestone {
	/**
	 * The cached value of the '{@link #getRequiredResult() <em>Required Result</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredResult()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProductUse> requiredResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MilestoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.MILESTONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProductUse> getRequiredResult() {
		if (requiredResult == null) {
			requiredResult = new EObjectResolvingEList<WorkProductUse>(WorkProductUse.class, this, SpemPackage.MILESTONE__REQUIRED_RESULT);
		}
		return requiredResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.MILESTONE__REQUIRED_RESULT:
				return getRequiredResult();
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
			case SpemPackage.MILESTONE__REQUIRED_RESULT:
				getRequiredResult().clear();
				getRequiredResult().addAll((Collection<? extends WorkProductUse>)newValue);
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
			case SpemPackage.MILESTONE__REQUIRED_RESULT:
				getRequiredResult().clear();
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
			case SpemPackage.MILESTONE__REQUIRED_RESULT:
				return requiredResult != null && !requiredResult.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MilestoneImpl
