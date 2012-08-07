/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.spem.ProcessComponent;
import org.obeonetwork.dsl.spem.ProcessComponentUse;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.WorkProductPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Component Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ProcessComponentUseImpl#getProcessComponent <em>Process Component</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ProcessComponentUseImpl#getUsedPort <em>Used Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessComponentUseImpl extends MethodContentUseImpl implements ProcessComponentUse {
	/**
	 * The cached value of the '{@link #getProcessComponent() <em>Process Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessComponent()
	 * @generated
	 * @ordered
	 */
	protected ProcessComponent processComponent;

	/**
	 * The cached value of the '{@link #getUsedPort() <em>Used Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedPort()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProductPort> usedPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessComponentUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.PROCESS_COMPONENT_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessComponent getProcessComponent() {
		if (processComponent != null && processComponent.eIsProxy()) {
			InternalEObject oldProcessComponent = (InternalEObject)processComponent;
			processComponent = (ProcessComponent)eResolveProxy(oldProcessComponent);
			if (processComponent != oldProcessComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.PROCESS_COMPONENT_USE__PROCESS_COMPONENT, oldProcessComponent, processComponent));
			}
		}
		return processComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessComponent basicGetProcessComponent() {
		return processComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessComponent(ProcessComponent newProcessComponent) {
		ProcessComponent oldProcessComponent = processComponent;
		processComponent = newProcessComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.PROCESS_COMPONENT_USE__PROCESS_COMPONENT, oldProcessComponent, processComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProductPort> getUsedPort() {
		if (usedPort == null) {
			usedPort = new EObjectContainmentEList<WorkProductPort>(WorkProductPort.class, this, SpemPackage.PROCESS_COMPONENT_USE__USED_PORT);
		}
		return usedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpemPackage.PROCESS_COMPONENT_USE__USED_PORT:
				return ((InternalEList<?>)getUsedPort()).basicRemove(otherEnd, msgs);
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
			case SpemPackage.PROCESS_COMPONENT_USE__PROCESS_COMPONENT:
				if (resolve) return getProcessComponent();
				return basicGetProcessComponent();
			case SpemPackage.PROCESS_COMPONENT_USE__USED_PORT:
				return getUsedPort();
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
			case SpemPackage.PROCESS_COMPONENT_USE__PROCESS_COMPONENT:
				setProcessComponent((ProcessComponent)newValue);
				return;
			case SpemPackage.PROCESS_COMPONENT_USE__USED_PORT:
				getUsedPort().clear();
				getUsedPort().addAll((Collection<? extends WorkProductPort>)newValue);
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
			case SpemPackage.PROCESS_COMPONENT_USE__PROCESS_COMPONENT:
				setProcessComponent((ProcessComponent)null);
				return;
			case SpemPackage.PROCESS_COMPONENT_USE__USED_PORT:
				getUsedPort().clear();
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
			case SpemPackage.PROCESS_COMPONENT_USE__PROCESS_COMPONENT:
				return processComponent != null;
			case SpemPackage.PROCESS_COMPONENT_USE__USED_PORT:
				return usedPort != null && !usedPort.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessComponentUseImpl
