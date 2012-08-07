/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.spem.ParameterDirectionKind;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.WorkProductDefinition;
import org.obeonetwork.dsl.spem.WorkProductPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Product Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.WorkProductPortImpl#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.WorkProductPortImpl#getPortKind <em>Port Kind</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.WorkProductPortImpl#getPortType <em>Port Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkProductPortImpl extends ProcessElementImpl implements WorkProductPort {
	/**
	 * The default value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean isOptional = IS_OPTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortKind() <em>Port Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortKind()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterDirectionKind PORT_KIND_EDEFAULT = ParameterDirectionKind.IN;

	/**
	 * The cached value of the '{@link #getPortKind() <em>Port Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortKind()
	 * @generated
	 * @ordered
	 */
	protected ParameterDirectionKind portKind = PORT_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPortType() <em>Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected WorkProductDefinition portType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkProductPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.WORK_PRODUCT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOptional() {
		return isOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOptional(boolean newIsOptional) {
		boolean oldIsOptional = isOptional;
		isOptional = newIsOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.WORK_PRODUCT_PORT__IS_OPTIONAL, oldIsOptional, isOptional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirectionKind getPortKind() {
		return portKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortKind(ParameterDirectionKind newPortKind) {
		ParameterDirectionKind oldPortKind = portKind;
		portKind = newPortKind == null ? PORT_KIND_EDEFAULT : newPortKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.WORK_PRODUCT_PORT__PORT_KIND, oldPortKind, portKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductDefinition getPortType() {
		if (portType != null && portType.eIsProxy()) {
			InternalEObject oldPortType = (InternalEObject)portType;
			portType = (WorkProductDefinition)eResolveProxy(oldPortType);
			if (portType != oldPortType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.WORK_PRODUCT_PORT__PORT_TYPE, oldPortType, portType));
			}
		}
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductDefinition basicGetPortType() {
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortType(WorkProductDefinition newPortType) {
		WorkProductDefinition oldPortType = portType;
		portType = newPortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.WORK_PRODUCT_PORT__PORT_TYPE, oldPortType, portType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.WORK_PRODUCT_PORT__IS_OPTIONAL:
				return isIsOptional();
			case SpemPackage.WORK_PRODUCT_PORT__PORT_KIND:
				return getPortKind();
			case SpemPackage.WORK_PRODUCT_PORT__PORT_TYPE:
				if (resolve) return getPortType();
				return basicGetPortType();
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
			case SpemPackage.WORK_PRODUCT_PORT__IS_OPTIONAL:
				setIsOptional((Boolean)newValue);
				return;
			case SpemPackage.WORK_PRODUCT_PORT__PORT_KIND:
				setPortKind((ParameterDirectionKind)newValue);
				return;
			case SpemPackage.WORK_PRODUCT_PORT__PORT_TYPE:
				setPortType((WorkProductDefinition)newValue);
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
			case SpemPackage.WORK_PRODUCT_PORT__IS_OPTIONAL:
				setIsOptional(IS_OPTIONAL_EDEFAULT);
				return;
			case SpemPackage.WORK_PRODUCT_PORT__PORT_KIND:
				setPortKind(PORT_KIND_EDEFAULT);
				return;
			case SpemPackage.WORK_PRODUCT_PORT__PORT_TYPE:
				setPortType((WorkProductDefinition)null);
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
			case SpemPackage.WORK_PRODUCT_PORT__IS_OPTIONAL:
				return isOptional != IS_OPTIONAL_EDEFAULT;
			case SpemPackage.WORK_PRODUCT_PORT__PORT_KIND:
				return portKind != PORT_KIND_EDEFAULT;
			case SpemPackage.WORK_PRODUCT_PORT__PORT_TYPE:
				return portType != null;
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
		result.append(" (isOptional: ");
		result.append(isOptional);
		result.append(", portKind: ");
		result.append(portKind);
		result.append(')');
		return result.toString();
	}

} //WorkProductPortImpl
