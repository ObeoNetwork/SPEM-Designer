/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bigpicture.impl;

import bigpicture.BigPicture;
import bigpicture.BigpicturePackage;
import bigpicture.Platform;
import bigpicture.UseCase;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Big Picture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bigpicture.impl.BigPictureImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link bigpicture.impl.BigPictureImpl#getUseCases <em>Use Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BigPictureImpl extends EObjectImpl implements BigPicture {
	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected Platform platform;

	/**
	 * The cached value of the '{@link #getUseCases() <em>Use Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCases()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> useCases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BigPictureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BigpicturePackage.Literals.BIG_PICTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform getPlatform() {
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlatform(Platform newPlatform, NotificationChain msgs) {
		Platform oldPlatform = platform;
		platform = newPlatform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BigpicturePackage.BIG_PICTURE__PLATFORM, oldPlatform, newPlatform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatform(Platform newPlatform) {
		if (newPlatform != platform) {
			NotificationChain msgs = null;
			if (platform != null)
				msgs = ((InternalEObject)platform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BigpicturePackage.BIG_PICTURE__PLATFORM, null, msgs);
			if (newPlatform != null)
				msgs = ((InternalEObject)newPlatform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BigpicturePackage.BIG_PICTURE__PLATFORM, null, msgs);
			msgs = basicSetPlatform(newPlatform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BigpicturePackage.BIG_PICTURE__PLATFORM, newPlatform, newPlatform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getUseCases() {
		if (useCases == null) {
			useCases = new EObjectContainmentEList<UseCase>(UseCase.class, this, BigpicturePackage.BIG_PICTURE__USE_CASES);
		}
		return useCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BigpicturePackage.BIG_PICTURE__PLATFORM:
				return basicSetPlatform(null, msgs);
			case BigpicturePackage.BIG_PICTURE__USE_CASES:
				return ((InternalEList<?>)getUseCases()).basicRemove(otherEnd, msgs);
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
			case BigpicturePackage.BIG_PICTURE__PLATFORM:
				return getPlatform();
			case BigpicturePackage.BIG_PICTURE__USE_CASES:
				return getUseCases();
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
			case BigpicturePackage.BIG_PICTURE__PLATFORM:
				setPlatform((Platform)newValue);
				return;
			case BigpicturePackage.BIG_PICTURE__USE_CASES:
				getUseCases().clear();
				getUseCases().addAll((Collection<? extends UseCase>)newValue);
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
			case BigpicturePackage.BIG_PICTURE__PLATFORM:
				setPlatform((Platform)null);
				return;
			case BigpicturePackage.BIG_PICTURE__USE_CASES:
				getUseCases().clear();
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
			case BigpicturePackage.BIG_PICTURE__PLATFORM:
				return platform != null;
			case BigpicturePackage.BIG_PICTURE__USE_CASES:
				return useCases != null && !useCases.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BigPictureImpl
