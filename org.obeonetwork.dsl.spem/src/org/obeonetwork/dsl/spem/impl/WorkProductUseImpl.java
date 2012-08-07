/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.WorkProductDefinition;
import org.obeonetwork.dsl.spem.WorkProductUse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Product Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.WorkProductUseImpl#getWorkProduct <em>Work Product</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkProductUseImpl extends MethodContentUseImpl implements WorkProductUse {
	/**
	 * The cached value of the '{@link #getWorkProduct() <em>Work Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkProduct()
	 * @generated
	 * @ordered
	 */
	protected WorkProductDefinition workProduct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkProductUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.WORK_PRODUCT_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductDefinition getWorkProduct() {
		if (workProduct != null && workProduct.eIsProxy()) {
			InternalEObject oldWorkProduct = (InternalEObject)workProduct;
			workProduct = (WorkProductDefinition)eResolveProxy(oldWorkProduct);
			if (workProduct != oldWorkProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.WORK_PRODUCT_USE__WORK_PRODUCT, oldWorkProduct, workProduct));
			}
		}
		return workProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductDefinition basicGetWorkProduct() {
		return workProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkProduct(WorkProductDefinition newWorkProduct) {
		WorkProductDefinition oldWorkProduct = workProduct;
		workProduct = newWorkProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.WORK_PRODUCT_USE__WORK_PRODUCT, oldWorkProduct, workProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.WORK_PRODUCT_USE__WORK_PRODUCT:
				if (resolve) return getWorkProduct();
				return basicGetWorkProduct();
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
			case SpemPackage.WORK_PRODUCT_USE__WORK_PRODUCT:
				setWorkProduct((WorkProductDefinition)newValue);
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
			case SpemPackage.WORK_PRODUCT_USE__WORK_PRODUCT:
				setWorkProduct((WorkProductDefinition)null);
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
			case SpemPackage.WORK_PRODUCT_USE__WORK_PRODUCT:
				return workProduct != null;
		}
		return super.eIsSet(featureID);
	}

} //WorkProductUseImpl
