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

import org.obeonetwork.dsl.spem.Default_TaskDefinitionPerformer;
import org.obeonetwork.dsl.spem.RoleDefinition;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.TaskDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Task Definition Performer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.Default_TaskDefinitionPerformerImpl#getLinkedTaskDefinition <em>Linked Task Definition</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.Default_TaskDefinitionPerformerImpl#getLinkedRoleDefinition <em>Linked Role Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Default_TaskDefinitionPerformerImpl extends MethodContentElementImpl implements Default_TaskDefinitionPerformer {
	/**
	 * The cached value of the '{@link #getLinkedTaskDefinition() <em>Linked Task Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedTaskDefinition()
	 * @generated
	 * @ordered
	 */
	protected TaskDefinition linkedTaskDefinition;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Default_TaskDefinitionPerformerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.DEFAULT_TASK_DEFINITION_PERFORMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDefinition getLinkedTaskDefinition() {
		if (linkedTaskDefinition != null && linkedTaskDefinition.eIsProxy()) {
			InternalEObject oldLinkedTaskDefinition = (InternalEObject)linkedTaskDefinition;
			linkedTaskDefinition = (TaskDefinition)eResolveProxy(oldLinkedTaskDefinition);
			if (linkedTaskDefinition != oldLinkedTaskDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.DEFAULT_TASK_DEFINITION_PERFORMER__LINKED_TASK_DEFINITION, oldLinkedTaskDefinition, linkedTaskDefinition));
			}
		}
		return linkedTaskDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDefinition basicGetLinkedTaskDefinition() {
		return linkedTaskDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedTaskDefinition(TaskDefinition newLinkedTaskDefinition) {
		TaskDefinition oldLinkedTaskDefinition = linkedTaskDefinition;
		linkedTaskDefinition = newLinkedTaskDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.DEFAULT_TASK_DEFINITION_PERFORMER__LINKED_TASK_DEFINITION, oldLinkedTaskDefinition, linkedTaskDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleDefinition> getLinkedRoleDefinition() {
		if (linkedRoleDefinition == null) {
			linkedRoleDefinition = new EObjectResolvingEList<RoleDefinition>(RoleDefinition.class, this, SpemPackage.DEFAULT_TASK_DEFINITION_PERFORMER__LINKED_ROLE_DEFINITION);
		}
		return linkedRoleDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.DEFAULT_TASK_DEFINITION_PERFORMER__LINKED_TASK_DEFINITION:
				if (resolve) return getLinkedTaskDefinition();
				return basicGetLinkedTaskDefinition();
			case SpemPackage.DEFAULT_TASK_DEFINITION_PERFORMER__LINKED_ROLE_DEFINITION:
				return getLinkedRoleDefinition();
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
			case SpemPackage.DEFAULT_TASK_DEFINITION_PERFORMER__LINKED_TASK_DEFINITION:
				setLinkedTaskDefinition((TaskDefinition)newValue);
				return;
			case SpemPackage.DEFAULT_TASK_DEFINITION_PERFORMER__LINKED_ROLE_DEFINITION:
				getLinkedRoleDefinition().clear();
				getLinkedRoleDefinition().addAll((Collection<? extends RoleDefinition>)newValue);
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
			case SpemPackage.DEFAULT_TASK_DEFINITION_PERFORMER__LINKED_TASK_DEFINITION:
				setLinkedTaskDefinition((TaskDefinition)null);
				return;
			case SpemPackage.DEFAULT_TASK_DEFINITION_PERFORMER__LINKED_ROLE_DEFINITION:
				getLinkedRoleDefinition().clear();
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
			case SpemPackage.DEFAULT_TASK_DEFINITION_PERFORMER__LINKED_TASK_DEFINITION:
				return linkedTaskDefinition != null;
			case SpemPackage.DEFAULT_TASK_DEFINITION_PERFORMER__LINKED_ROLE_DEFINITION:
				return linkedRoleDefinition != null && !linkedRoleDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Default_TaskDefinitionPerformerImpl
