/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bigpicture.impl;

import bigpicture.BigpicturePackage;
import bigpicture.Platform;
import bigpicture.WorkPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bigpicture.impl.PlatformImpl#getWorkPackages <em>Work Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlatformImpl extends EObjectImpl implements Platform {
	/**
	 * The cached value of the '{@link #getWorkPackages() <em>Work Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkPackage> workPackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BigpicturePackage.Literals.PLATFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkPackage> getWorkPackages() {
		if (workPackages == null) {
			workPackages = new EObjectContainmentEList<WorkPackage>(WorkPackage.class, this, BigpicturePackage.PLATFORM__WORK_PACKAGES);
		}
		return workPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BigpicturePackage.PLATFORM__WORK_PACKAGES:
				return ((InternalEList<?>)getWorkPackages()).basicRemove(otherEnd, msgs);
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
			case BigpicturePackage.PLATFORM__WORK_PACKAGES:
				return getWorkPackages();
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
			case BigpicturePackage.PLATFORM__WORK_PACKAGES:
				getWorkPackages().clear();
				getWorkPackages().addAll((Collection<? extends WorkPackage>)newValue);
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
			case BigpicturePackage.PLATFORM__WORK_PACKAGES:
				getWorkPackages().clear();
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
			case BigpicturePackage.PLATFORM__WORK_PACKAGES:
				return workPackages != null && !workPackages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlatformImpl
