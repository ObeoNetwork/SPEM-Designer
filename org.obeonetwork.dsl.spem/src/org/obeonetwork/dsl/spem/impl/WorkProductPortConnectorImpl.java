/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.WorkProductPort;
import org.obeonetwork.dsl.spem.WorkProductPortConnector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Product Port Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.WorkProductPortConnectorImpl#getConnectedPort <em>Connected Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkProductPortConnectorImpl extends ProcessElementImpl implements WorkProductPortConnector {
	/**
	 * The cached value of the '{@link #getConnectedPort() <em>Connected Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedPort()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProductPort> connectedPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkProductPortConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.WORK_PRODUCT_PORT_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProductPort> getConnectedPort() {
		if (connectedPort == null) {
			connectedPort = new EObjectResolvingEList<WorkProductPort>(WorkProductPort.class, this, SpemPackage.WORK_PRODUCT_PORT_CONNECTOR__CONNECTED_PORT);
		}
		return connectedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.WORK_PRODUCT_PORT_CONNECTOR__CONNECTED_PORT:
				return getConnectedPort();
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
			case SpemPackage.WORK_PRODUCT_PORT_CONNECTOR__CONNECTED_PORT:
				getConnectedPort().clear();
				getConnectedPort().addAll((Collection<? extends WorkProductPort>)newValue);
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
			case SpemPackage.WORK_PRODUCT_PORT_CONNECTOR__CONNECTED_PORT:
				getConnectedPort().clear();
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
			case SpemPackage.WORK_PRODUCT_PORT_CONNECTOR__CONNECTED_PORT:
				return connectedPort != null && !connectedPort.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkProductPortConnectorImpl
