/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.extension.lifecycle.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.spem.extension.lifecycle.LifeCycle;
import org.obeonetwork.dsl.spem.extension.lifecycle.LifecycleElement;
import org.obeonetwork.dsl.spem.extension.lifecycle.LifecyclePackage;
import org.obeonetwork.dsl.spem.extension.lifecycle.WorkProductDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Product Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.extension.lifecycle.impl.WorkProductDefinitionImpl#getLifecycle <em>Lifecycle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkProductDefinitionImpl extends org.obeonetwork.dsl.spem.impl.WorkProductDefinitionImpl implements WorkProductDefinition {
	/**
	 * The cached value of the '{@link #getLifecycle() <em>Lifecycle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycle()
	 * @generated
	 * @ordered
	 */
	protected LifeCycle lifecycle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkProductDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LifecyclePackage.Literals.WORK_PRODUCT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifeCycle getLifecycle() {
		return lifecycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLifecycle(LifeCycle newLifecycle, NotificationChain msgs) {
		LifeCycle oldLifecycle = lifecycle;
		lifecycle = newLifecycle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LifecyclePackage.WORK_PRODUCT_DEFINITION__LIFECYCLE, oldLifecycle, newLifecycle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifecycle(LifeCycle newLifecycle) {
		if (newLifecycle != lifecycle) {
			NotificationChain msgs = null;
			if (lifecycle != null)
				msgs = ((InternalEObject)lifecycle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LifecyclePackage.WORK_PRODUCT_DEFINITION__LIFECYCLE, null, msgs);
			if (newLifecycle != null)
				msgs = ((InternalEObject)newLifecycle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LifecyclePackage.WORK_PRODUCT_DEFINITION__LIFECYCLE, null, msgs);
			msgs = basicSetLifecycle(newLifecycle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LifecyclePackage.WORK_PRODUCT_DEFINITION__LIFECYCLE, newLifecycle, newLifecycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LifecyclePackage.WORK_PRODUCT_DEFINITION__LIFECYCLE:
				return basicSetLifecycle(null, msgs);
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
			case LifecyclePackage.WORK_PRODUCT_DEFINITION__LIFECYCLE:
				return getLifecycle();
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
			case LifecyclePackage.WORK_PRODUCT_DEFINITION__LIFECYCLE:
				setLifecycle((LifeCycle)newValue);
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
			case LifecyclePackage.WORK_PRODUCT_DEFINITION__LIFECYCLE:
				setLifecycle((LifeCycle)null);
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
			case LifecyclePackage.WORK_PRODUCT_DEFINITION__LIFECYCLE:
				return lifecycle != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == LifecycleElement.class) {
			switch (derivedFeatureID) {
				case LifecyclePackage.WORK_PRODUCT_DEFINITION__LIFECYCLE: return LifecyclePackage.LIFECYCLE_ELEMENT__LIFECYCLE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == LifecycleElement.class) {
			switch (baseFeatureID) {
				case LifecyclePackage.LIFECYCLE_ELEMENT__LIFECYCLE: return LifecyclePackage.WORK_PRODUCT_DEFINITION__LIFECYCLE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //WorkProductDefinitionImpl
