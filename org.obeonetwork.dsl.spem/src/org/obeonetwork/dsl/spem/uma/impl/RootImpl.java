/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.obeonetwork.dsl.spem.MethodConfiguration;
import org.obeonetwork.dsl.spem.MethodLibrary;
import org.obeonetwork.dsl.spem.MethodPlugin;

import org.obeonetwork.dsl.spem.uma.Root;
import org.obeonetwork.dsl.spem.uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.RootImpl#getMethodConfiguration <em>Method Configuration</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.RootImpl#getMethodLibrary <em>Method Library</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.RootImpl#getMethodPlugin <em>Method Plugin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootImpl extends EObjectImpl implements Root {
	/**
	 * The cached value of the '{@link #getMethodConfiguration() <em>Method Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodConfiguration()
	 * @generated
	 * @ordered
	 */
	protected MethodConfiguration methodConfiguration;

	/**
	 * The cached value of the '{@link #getMethodLibrary() <em>Method Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodLibrary()
	 * @generated
	 * @ordered
	 */
	protected MethodLibrary methodLibrary;

	/**
	 * The cached value of the '{@link #getMethodPlugin() <em>Method Plugin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodPlugin()
	 * @generated
	 * @ordered
	 */
	protected MethodPlugin methodPlugin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodConfiguration getMethodConfiguration() {
		return methodConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodConfiguration(MethodConfiguration newMethodConfiguration, NotificationChain msgs) {
		MethodConfiguration oldMethodConfiguration = methodConfiguration;
		methodConfiguration = newMethodConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmaPackage.ROOT__METHOD_CONFIGURATION, oldMethodConfiguration, newMethodConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodConfiguration(MethodConfiguration newMethodConfiguration) {
		if (newMethodConfiguration != methodConfiguration) {
			NotificationChain msgs = null;
			if (methodConfiguration != null)
				msgs = ((InternalEObject)methodConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmaPackage.ROOT__METHOD_CONFIGURATION, null, msgs);
			if (newMethodConfiguration != null)
				msgs = ((InternalEObject)newMethodConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmaPackage.ROOT__METHOD_CONFIGURATION, null, msgs);
			msgs = basicSetMethodConfiguration(newMethodConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.ROOT__METHOD_CONFIGURATION, newMethodConfiguration, newMethodConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodLibrary getMethodLibrary() {
		return methodLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodLibrary(MethodLibrary newMethodLibrary, NotificationChain msgs) {
		MethodLibrary oldMethodLibrary = methodLibrary;
		methodLibrary = newMethodLibrary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmaPackage.ROOT__METHOD_LIBRARY, oldMethodLibrary, newMethodLibrary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodLibrary(MethodLibrary newMethodLibrary) {
		if (newMethodLibrary != methodLibrary) {
			NotificationChain msgs = null;
			if (methodLibrary != null)
				msgs = ((InternalEObject)methodLibrary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmaPackage.ROOT__METHOD_LIBRARY, null, msgs);
			if (newMethodLibrary != null)
				msgs = ((InternalEObject)newMethodLibrary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmaPackage.ROOT__METHOD_LIBRARY, null, msgs);
			msgs = basicSetMethodLibrary(newMethodLibrary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.ROOT__METHOD_LIBRARY, newMethodLibrary, newMethodLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodPlugin getMethodPlugin() {
		return methodPlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodPlugin(MethodPlugin newMethodPlugin, NotificationChain msgs) {
		MethodPlugin oldMethodPlugin = methodPlugin;
		methodPlugin = newMethodPlugin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmaPackage.ROOT__METHOD_PLUGIN, oldMethodPlugin, newMethodPlugin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodPlugin(MethodPlugin newMethodPlugin) {
		if (newMethodPlugin != methodPlugin) {
			NotificationChain msgs = null;
			if (methodPlugin != null)
				msgs = ((InternalEObject)methodPlugin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmaPackage.ROOT__METHOD_PLUGIN, null, msgs);
			if (newMethodPlugin != null)
				msgs = ((InternalEObject)newMethodPlugin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmaPackage.ROOT__METHOD_PLUGIN, null, msgs);
			msgs = basicSetMethodPlugin(newMethodPlugin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.ROOT__METHOD_PLUGIN, newMethodPlugin, newMethodPlugin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmaPackage.ROOT__METHOD_CONFIGURATION:
				return basicSetMethodConfiguration(null, msgs);
			case UmaPackage.ROOT__METHOD_LIBRARY:
				return basicSetMethodLibrary(null, msgs);
			case UmaPackage.ROOT__METHOD_PLUGIN:
				return basicSetMethodPlugin(null, msgs);
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
			case UmaPackage.ROOT__METHOD_CONFIGURATION:
				return getMethodConfiguration();
			case UmaPackage.ROOT__METHOD_LIBRARY:
				return getMethodLibrary();
			case UmaPackage.ROOT__METHOD_PLUGIN:
				return getMethodPlugin();
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
			case UmaPackage.ROOT__METHOD_CONFIGURATION:
				setMethodConfiguration((MethodConfiguration)newValue);
				return;
			case UmaPackage.ROOT__METHOD_LIBRARY:
				setMethodLibrary((MethodLibrary)newValue);
				return;
			case UmaPackage.ROOT__METHOD_PLUGIN:
				setMethodPlugin((MethodPlugin)newValue);
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
			case UmaPackage.ROOT__METHOD_CONFIGURATION:
				setMethodConfiguration((MethodConfiguration)null);
				return;
			case UmaPackage.ROOT__METHOD_LIBRARY:
				setMethodLibrary((MethodLibrary)null);
				return;
			case UmaPackage.ROOT__METHOD_PLUGIN:
				setMethodPlugin((MethodPlugin)null);
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
			case UmaPackage.ROOT__METHOD_CONFIGURATION:
				return methodConfiguration != null;
			case UmaPackage.ROOT__METHOD_LIBRARY:
				return methodLibrary != null;
			case UmaPackage.ROOT__METHOD_PLUGIN:
				return methodPlugin != null;
		}
		return super.eIsSet(featureID);
	}

} //RootImpl
