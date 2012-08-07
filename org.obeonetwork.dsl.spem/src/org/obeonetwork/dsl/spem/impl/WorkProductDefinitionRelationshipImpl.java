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

import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.WorkProductDefinition;
import org.obeonetwork.dsl.spem.WorkProductDefinitionRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Product Definition Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.WorkProductDefinitionRelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.WorkProductDefinitionRelationshipImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkProductDefinitionRelationshipImpl extends MethodContentElementImpl implements WorkProductDefinitionRelationship {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected WorkProductDefinition source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProductDefinition> target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkProductDefinitionRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.WORK_PRODUCT_DEFINITION_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductDefinition getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (WorkProductDefinition)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.WORK_PRODUCT_DEFINITION_RELATIONSHIP__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductDefinition basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(WorkProductDefinition newSource) {
		WorkProductDefinition oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.WORK_PRODUCT_DEFINITION_RELATIONSHIP__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProductDefinition> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<WorkProductDefinition>(WorkProductDefinition.class, this, SpemPackage.WORK_PRODUCT_DEFINITION_RELATIONSHIP__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.WORK_PRODUCT_DEFINITION_RELATIONSHIP__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case SpemPackage.WORK_PRODUCT_DEFINITION_RELATIONSHIP__TARGET:
				return getTarget();
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
			case SpemPackage.WORK_PRODUCT_DEFINITION_RELATIONSHIP__SOURCE:
				setSource((WorkProductDefinition)newValue);
				return;
			case SpemPackage.WORK_PRODUCT_DEFINITION_RELATIONSHIP__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends WorkProductDefinition>)newValue);
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
			case SpemPackage.WORK_PRODUCT_DEFINITION_RELATIONSHIP__SOURCE:
				setSource((WorkProductDefinition)null);
				return;
			case SpemPackage.WORK_PRODUCT_DEFINITION_RELATIONSHIP__TARGET:
				getTarget().clear();
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
			case SpemPackage.WORK_PRODUCT_DEFINITION_RELATIONSHIP__SOURCE:
				return source != null;
			case SpemPackage.WORK_PRODUCT_DEFINITION_RELATIONSHIP__TARGET:
				return target != null && !target.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkProductDefinitionRelationshipImpl
