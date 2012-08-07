/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.WorkDefinition;
import org.obeonetwork.dsl.spem.WorkDefinitionParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.WorkDefinitionImpl#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.WorkDefinitionImpl#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.WorkDefinitionImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class WorkDefinitionImpl extends EObjectImpl implements WorkDefinition {
	/**
	 * The cached value of the '{@link #getPreCondition() <em>Pre Condition</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<String> preCondition;

	/**
	 * The cached value of the '{@link #getPostCondition() <em>Post Condition</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<String> postCondition;

	/**
	 * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkDefinitionParameter> ownedParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.WORK_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPreCondition() {
		if (preCondition == null) {
			preCondition = new EDataTypeUniqueEList<String>(String.class, this, SpemPackage.WORK_DEFINITION__PRE_CONDITION);
		}
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPostCondition() {
		if (postCondition == null) {
			postCondition = new EDataTypeUniqueEList<String>(String.class, this, SpemPackage.WORK_DEFINITION__POST_CONDITION);
		}
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkDefinitionParameter> getOwnedParameter() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectEList<WorkDefinitionParameter>(WorkDefinitionParameter.class, this, SpemPackage.WORK_DEFINITION__OWNED_PARAMETER);
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.WORK_DEFINITION__PRE_CONDITION:
				return getPreCondition();
			case SpemPackage.WORK_DEFINITION__POST_CONDITION:
				return getPostCondition();
			case SpemPackage.WORK_DEFINITION__OWNED_PARAMETER:
				return getOwnedParameter();
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
			case SpemPackage.WORK_DEFINITION__PRE_CONDITION:
				getPreCondition().clear();
				getPreCondition().addAll((Collection<? extends String>)newValue);
				return;
			case SpemPackage.WORK_DEFINITION__POST_CONDITION:
				getPostCondition().clear();
				getPostCondition().addAll((Collection<? extends String>)newValue);
				return;
			case SpemPackage.WORK_DEFINITION__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends WorkDefinitionParameter>)newValue);
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
			case SpemPackage.WORK_DEFINITION__PRE_CONDITION:
				getPreCondition().clear();
				return;
			case SpemPackage.WORK_DEFINITION__POST_CONDITION:
				getPostCondition().clear();
				return;
			case SpemPackage.WORK_DEFINITION__OWNED_PARAMETER:
				getOwnedParameter().clear();
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
			case SpemPackage.WORK_DEFINITION__PRE_CONDITION:
				return preCondition != null && !preCondition.isEmpty();
			case SpemPackage.WORK_DEFINITION__POST_CONDITION:
				return postCondition != null && !postCondition.isEmpty();
			case SpemPackage.WORK_DEFINITION__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
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
		result.append(" (preCondition: ");
		result.append(preCondition);
		result.append(", postCondition: ");
		result.append(postCondition);
		result.append(')');
		return result.toString();
	}

} //WorkDefinitionImpl
