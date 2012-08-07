/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.spem.ProcessElement;
import org.obeonetwork.dsl.spem.ProcessKind;
import org.obeonetwork.dsl.spem.ProcessPackageableElement;
import org.obeonetwork.dsl.spem.SpemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ProcessElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ProcessElementImpl#getProcessKind <em>Process Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ProcessElementImpl extends DescribableElementImpl implements ProcessElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcessKind() <em>Process Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessKind()
	 * @generated
	 * @ordered
	 */
	protected ProcessKind processKind;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.PROCESS_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.PROCESS_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessKind getProcessKind() {
		if (processKind != null && processKind.eIsProxy()) {
			InternalEObject oldProcessKind = (InternalEObject)processKind;
			processKind = (ProcessKind)eResolveProxy(oldProcessKind);
			if (processKind != oldProcessKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.PROCESS_ELEMENT__PROCESS_KIND, oldProcessKind, processKind));
			}
		}
		return processKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessKind basicGetProcessKind() {
		return processKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessKind(ProcessKind newProcessKind) {
		ProcessKind oldProcessKind = processKind;
		processKind = newProcessKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.PROCESS_ELEMENT__PROCESS_KIND, oldProcessKind, processKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.PROCESS_ELEMENT__NAME:
				return getName();
			case SpemPackage.PROCESS_ELEMENT__PROCESS_KIND:
				if (resolve) return getProcessKind();
				return basicGetProcessKind();
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
			case SpemPackage.PROCESS_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case SpemPackage.PROCESS_ELEMENT__PROCESS_KIND:
				setProcessKind((ProcessKind)newValue);
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
			case SpemPackage.PROCESS_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpemPackage.PROCESS_ELEMENT__PROCESS_KIND:
				setProcessKind((ProcessKind)null);
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
			case SpemPackage.PROCESS_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpemPackage.PROCESS_ELEMENT__PROCESS_KIND:
				return processKind != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ProcessPackageableElement.class) {
			switch (derivedFeatureID) {
				case SpemPackage.PROCESS_ELEMENT__NAME: return SpemPackage.PROCESS_PACKAGEABLE_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ProcessPackageableElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.PROCESS_PACKAGEABLE_ELEMENT__NAME: return SpemPackage.PROCESS_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProcessElementImpl
