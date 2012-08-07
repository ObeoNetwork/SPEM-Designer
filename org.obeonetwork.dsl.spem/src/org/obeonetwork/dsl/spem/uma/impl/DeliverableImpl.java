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

import org.obeonetwork.dsl.spem.WorkProductUse;

import org.obeonetwork.dsl.spem.impl.WorkProductUseImpl;

import org.obeonetwork.dsl.spem.uma.Deliverable;
import org.obeonetwork.dsl.spem.uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deliverable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.DeliverableImpl#getDeliveredProduct <em>Delivered Product</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.DeliverableImpl#getExternalDescription <em>External Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.DeliverableImpl#getPackagingGuidance <em>Packaging Guidance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeliverableImpl extends WorkProductUseImpl implements Deliverable {
	/**
	 * The cached value of the '{@link #getDeliveredProduct() <em>Delivered Product</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveredProduct()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProductUse> deliveredProduct;

	/**
	 * The default value of the '{@link #getExternalDescription() <em>External Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalDescription() <em>External Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDescription()
	 * @generated
	 * @ordered
	 */
	protected String externalDescription = EXTERNAL_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackagingGuidance() <em>Packaging Guidance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagingGuidance()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGING_GUIDANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackagingGuidance() <em>Packaging Guidance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagingGuidance()
	 * @generated
	 * @ordered
	 */
	protected String packagingGuidance = PACKAGING_GUIDANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeliverableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.Literals.DELIVERABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProductUse> getDeliveredProduct() {
		if (deliveredProduct == null) {
			deliveredProduct = new EObjectResolvingEList<WorkProductUse>(WorkProductUse.class, this, UmaPackage.DELIVERABLE__DELIVERED_PRODUCT);
		}
		return deliveredProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalDescription() {
		return externalDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalDescription(String newExternalDescription) {
		String oldExternalDescription = externalDescription;
		externalDescription = newExternalDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.DELIVERABLE__EXTERNAL_DESCRIPTION, oldExternalDescription, externalDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackagingGuidance() {
		return packagingGuidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackagingGuidance(String newPackagingGuidance) {
		String oldPackagingGuidance = packagingGuidance;
		packagingGuidance = newPackagingGuidance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.DELIVERABLE__PACKAGING_GUIDANCE, oldPackagingGuidance, packagingGuidance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.DELIVERABLE__DELIVERED_PRODUCT:
				return getDeliveredProduct();
			case UmaPackage.DELIVERABLE__EXTERNAL_DESCRIPTION:
				return getExternalDescription();
			case UmaPackage.DELIVERABLE__PACKAGING_GUIDANCE:
				return getPackagingGuidance();
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
			case UmaPackage.DELIVERABLE__DELIVERED_PRODUCT:
				getDeliveredProduct().clear();
				getDeliveredProduct().addAll((Collection<? extends WorkProductUse>)newValue);
				return;
			case UmaPackage.DELIVERABLE__EXTERNAL_DESCRIPTION:
				setExternalDescription((String)newValue);
				return;
			case UmaPackage.DELIVERABLE__PACKAGING_GUIDANCE:
				setPackagingGuidance((String)newValue);
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
			case UmaPackage.DELIVERABLE__DELIVERED_PRODUCT:
				getDeliveredProduct().clear();
				return;
			case UmaPackage.DELIVERABLE__EXTERNAL_DESCRIPTION:
				setExternalDescription(EXTERNAL_DESCRIPTION_EDEFAULT);
				return;
			case UmaPackage.DELIVERABLE__PACKAGING_GUIDANCE:
				setPackagingGuidance(PACKAGING_GUIDANCE_EDEFAULT);
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
			case UmaPackage.DELIVERABLE__DELIVERED_PRODUCT:
				return deliveredProduct != null && !deliveredProduct.isEmpty();
			case UmaPackage.DELIVERABLE__EXTERNAL_DESCRIPTION:
				return EXTERNAL_DESCRIPTION_EDEFAULT == null ? externalDescription != null : !EXTERNAL_DESCRIPTION_EDEFAULT.equals(externalDescription);
			case UmaPackage.DELIVERABLE__PACKAGING_GUIDANCE:
				return PACKAGING_GUIDANCE_EDEFAULT == null ? packagingGuidance != null : !PACKAGING_GUIDANCE_EDEFAULT.equals(packagingGuidance);
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
		result.append(" (externalDescription: ");
		result.append(externalDescription);
		result.append(", packagingGuidance: ");
		result.append(packagingGuidance);
		result.append(')');
		return result.toString();
	}

} //DeliverableImpl
