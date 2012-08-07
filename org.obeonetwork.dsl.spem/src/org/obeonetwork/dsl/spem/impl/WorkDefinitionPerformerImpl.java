/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.WorkDefinition;
import org.obeonetwork.dsl.spem.WorkDefinitionPerformer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Definition Performer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.WorkDefinitionPerformerImpl#getLinkedWorkDefinition <em>Linked Work Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class WorkDefinitionPerformerImpl extends EObjectImpl implements WorkDefinitionPerformer {
	/**
	 * The cached value of the '{@link #getLinkedWorkDefinition() <em>Linked Work Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedWorkDefinition()
	 * @generated
	 * @ordered
	 */
	protected WorkDefinition linkedWorkDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkDefinitionPerformerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.WORK_DEFINITION_PERFORMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition getLinkedWorkDefinition() {
		if (linkedWorkDefinition != null && linkedWorkDefinition.eIsProxy()) {
			InternalEObject oldLinkedWorkDefinition = (InternalEObject)linkedWorkDefinition;
			linkedWorkDefinition = (WorkDefinition)eResolveProxy(oldLinkedWorkDefinition);
			if (linkedWorkDefinition != oldLinkedWorkDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.WORK_DEFINITION_PERFORMER__LINKED_WORK_DEFINITION, oldLinkedWorkDefinition, linkedWorkDefinition));
			}
		}
		return linkedWorkDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition basicGetLinkedWorkDefinition() {
		return linkedWorkDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedWorkDefinition(WorkDefinition newLinkedWorkDefinition) {
		WorkDefinition oldLinkedWorkDefinition = linkedWorkDefinition;
		linkedWorkDefinition = newLinkedWorkDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.WORK_DEFINITION_PERFORMER__LINKED_WORK_DEFINITION, oldLinkedWorkDefinition, linkedWorkDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.WORK_DEFINITION_PERFORMER__LINKED_WORK_DEFINITION:
				if (resolve) return getLinkedWorkDefinition();
				return basicGetLinkedWorkDefinition();
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
			case SpemPackage.WORK_DEFINITION_PERFORMER__LINKED_WORK_DEFINITION:
				setLinkedWorkDefinition((WorkDefinition)newValue);
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
			case SpemPackage.WORK_DEFINITION_PERFORMER__LINKED_WORK_DEFINITION:
				setLinkedWorkDefinition((WorkDefinition)null);
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
			case SpemPackage.WORK_DEFINITION_PERFORMER__LINKED_WORK_DEFINITION:
				return linkedWorkDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} //WorkDefinitionPerformerImpl
