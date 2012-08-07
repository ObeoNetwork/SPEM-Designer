/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.spem.MethodContentUse;
import org.obeonetwork.dsl.spem.SpemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Content Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.MethodContentUseImpl#isIsSynchronizedWithSource <em>Is Synchronized With Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MethodContentUseImpl extends BreakdownElementImpl implements MethodContentUse {
	/**
	 * The default value of the '{@link #isIsSynchronizedWithSource() <em>Is Synchronized With Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSynchronizedWithSource()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SYNCHRONIZED_WITH_SOURCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSynchronizedWithSource() <em>Is Synchronized With Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSynchronizedWithSource()
	 * @generated
	 * @ordered
	 */
	protected boolean isSynchronizedWithSource = IS_SYNCHRONIZED_WITH_SOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodContentUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.METHOD_CONTENT_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSynchronizedWithSource() {
		return isSynchronizedWithSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSynchronizedWithSource(boolean newIsSynchronizedWithSource) {
		boolean oldIsSynchronizedWithSource = isSynchronizedWithSource;
		isSynchronizedWithSource = newIsSynchronizedWithSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.METHOD_CONTENT_USE__IS_SYNCHRONIZED_WITH_SOURCE, oldIsSynchronizedWithSource, isSynchronizedWithSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.METHOD_CONTENT_USE__IS_SYNCHRONIZED_WITH_SOURCE:
				return isIsSynchronizedWithSource();
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
			case SpemPackage.METHOD_CONTENT_USE__IS_SYNCHRONIZED_WITH_SOURCE:
				setIsSynchronizedWithSource((Boolean)newValue);
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
			case SpemPackage.METHOD_CONTENT_USE__IS_SYNCHRONIZED_WITH_SOURCE:
				setIsSynchronizedWithSource(IS_SYNCHRONIZED_WITH_SOURCE_EDEFAULT);
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
			case SpemPackage.METHOD_CONTENT_USE__IS_SYNCHRONIZED_WITH_SOURCE:
				return isSynchronizedWithSource != IS_SYNCHRONIZED_WITH_SOURCE_EDEFAULT;
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
		result.append(" (isSynchronizedWithSource: ");
		result.append(isSynchronizedWithSource);
		result.append(')');
		return result.toString();
	}

} //MethodContentUseImpl
