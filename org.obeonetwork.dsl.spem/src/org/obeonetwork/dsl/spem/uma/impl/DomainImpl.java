/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.dsl.spem.WorkProductDefinition;

import org.obeonetwork.dsl.spem.impl.CategoryImpl;

import org.obeonetwork.dsl.spem.uma.Domain;
import org.obeonetwork.dsl.spem.uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.DomainImpl#getRelatedProduct <em>Related Product</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainImpl extends CategoryImpl implements Domain {
	/**
	 * The cached value of the '{@link #getRelatedProduct() <em>Related Product</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedProduct()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProductDefinition> relatedProduct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProductDefinition> getRelatedProduct() {
		if (relatedProduct == null) {
			relatedProduct = new EObjectResolvingEList<WorkProductDefinition>(WorkProductDefinition.class, this, UmaPackage.DOMAIN__RELATED_PRODUCT);
		}
		return relatedProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.DOMAIN__RELATED_PRODUCT:
				return getRelatedProduct();
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
			case UmaPackage.DOMAIN__RELATED_PRODUCT:
				getRelatedProduct().clear();
				getRelatedProduct().addAll((Collection<? extends WorkProductDefinition>)newValue);
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
			case UmaPackage.DOMAIN__RELATED_PRODUCT:
				getRelatedProduct().clear();
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
			case UmaPackage.DOMAIN__RELATED_PRODUCT:
				return relatedProduct != null && !relatedProduct.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
