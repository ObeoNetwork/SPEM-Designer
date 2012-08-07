/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.dsl.spem.Default_ResponsibilityAssignment;
import org.obeonetwork.dsl.spem.RoleDefinition;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.WorkProductDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Responsibility Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.Default_ResponsibilityAssignmentImpl#getLinkedRoleDefinition <em>Linked Role Definition</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.Default_ResponsibilityAssignmentImpl#getLinkedWorkProductDefinition <em>Linked Work Product Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Default_ResponsibilityAssignmentImpl extends MethodContentElementImpl implements Default_ResponsibilityAssignment {
	/**
	 * The cached value of the '{@link #getLinkedRoleDefinition() <em>Linked Role Definition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedRoleDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleDefinition> linkedRoleDefinition;

	/**
	 * The cached value of the '{@link #getLinkedWorkProductDefinition() <em>Linked Work Product Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedWorkProductDefinition()
	 * @generated
	 * @ordered
	 */
	protected WorkProductDefinition linkedWorkProductDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Default_ResponsibilityAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.DEFAULT_RESPONSIBILITY_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleDefinition> getLinkedRoleDefinition() {
		if (linkedRoleDefinition == null) {
			linkedRoleDefinition = new EObjectResolvingEList<RoleDefinition>(RoleDefinition.class, this, SpemPackage.DEFAULT_RESPONSIBILITY_ASSIGNMENT__LINKED_ROLE_DEFINITION);
		}
		return linkedRoleDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductDefinition getLinkedWorkProductDefinition() {
		if (linkedWorkProductDefinition != null && linkedWorkProductDefinition.eIsProxy()) {
			InternalEObject oldLinkedWorkProductDefinition = (InternalEObject)linkedWorkProductDefinition;
			linkedWorkProductDefinition = (WorkProductDefinition)eResolveProxy(oldLinkedWorkProductDefinition);
			if (linkedWorkProductDefinition != oldLinkedWorkProductDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.DEFAULT_RESPONSIBILITY_ASSIGNMENT__LINKED_WORK_PRODUCT_DEFINITION, oldLinkedWorkProductDefinition, linkedWorkProductDefinition));
			}
		}
		return linkedWorkProductDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductDefinition basicGetLinkedWorkProductDefinition() {
		return linkedWorkProductDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedWorkProductDefinition(WorkProductDefinition newLinkedWorkProductDefinition) {
		WorkProductDefinition oldLinkedWorkProductDefinition = linkedWorkProductDefinition;
		linkedWorkProductDefinition = newLinkedWorkProductDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.DEFAULT_RESPONSIBILITY_ASSIGNMENT__LINKED_WORK_PRODUCT_DEFINITION, oldLinkedWorkProductDefinition, linkedWorkProductDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.DEFAULT_RESPONSIBILITY_ASSIGNMENT__LINKED_ROLE_DEFINITION:
				return getLinkedRoleDefinition();
			case SpemPackage.DEFAULT_RESPONSIBILITY_ASSIGNMENT__LINKED_WORK_PRODUCT_DEFINITION:
				if (resolve) return getLinkedWorkProductDefinition();
				return basicGetLinkedWorkProductDefinition();
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
			case SpemPackage.DEFAULT_RESPONSIBILITY_ASSIGNMENT__LINKED_ROLE_DEFINITION:
				getLinkedRoleDefinition().clear();
				getLinkedRoleDefinition().addAll((Collection<? extends RoleDefinition>)newValue);
				return;
			case SpemPackage.DEFAULT_RESPONSIBILITY_ASSIGNMENT__LINKED_WORK_PRODUCT_DEFINITION:
				setLinkedWorkProductDefinition((WorkProductDefinition)newValue);
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
			case SpemPackage.DEFAULT_RESPONSIBILITY_ASSIGNMENT__LINKED_ROLE_DEFINITION:
				getLinkedRoleDefinition().clear();
				return;
			case SpemPackage.DEFAULT_RESPONSIBILITY_ASSIGNMENT__LINKED_WORK_PRODUCT_DEFINITION:
				setLinkedWorkProductDefinition((WorkProductDefinition)null);
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
			case SpemPackage.DEFAULT_RESPONSIBILITY_ASSIGNMENT__LINKED_ROLE_DEFINITION:
				return linkedRoleDefinition != null && !linkedRoleDefinition.isEmpty();
			case SpemPackage.DEFAULT_RESPONSIBILITY_ASSIGNMENT__LINKED_WORK_PRODUCT_DEFINITION:
				return linkedWorkProductDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} //Default_ResponsibilityAssignmentImpl
