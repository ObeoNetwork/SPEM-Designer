/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.dsl.spem.RoleDefinition;

import org.obeonetwork.dsl.spem.impl.MethodContentElementImpl;

import org.obeonetwork.dsl.spem.uma.RoleSet;
import org.obeonetwork.dsl.spem.uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.RoleSetImpl#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleSetImpl extends MethodContentElementImpl implements RoleSet {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleDefinition> role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.Literals.ROLE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleDefinition> getRole() {
		if (role == null) {
			role = new EObjectResolvingEList<RoleDefinition>(RoleDefinition.class, this, UmaPackage.ROLE_SET__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.ROLE_SET__ROLE:
				return getRole();
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
			case UmaPackage.ROLE_SET__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends RoleDefinition>)newValue);
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
			case UmaPackage.ROLE_SET__ROLE:
				getRole().clear();
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
			case UmaPackage.ROLE_SET__ROLE:
				return role != null && !role.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoleSetImpl
