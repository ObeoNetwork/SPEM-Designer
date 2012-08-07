/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.spem.Default_TaskDefinitionParameter;
import org.obeonetwork.dsl.spem.OptionalityKind;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.WorkProductDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Task Definition Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.Default_TaskDefinitionParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.Default_TaskDefinitionParameterImpl#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.Default_TaskDefinitionParameterImpl#getOptionality <em>Optionality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Default_TaskDefinitionParameterImpl extends WorkDefinitionParameterImpl implements Default_TaskDefinitionParameter {
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
	 * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected WorkProductDefinition parameterType;

	/**
	 * The default value of the '{@link #getOptionality() <em>Optionality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionality()
	 * @generated
	 * @ordered
	 */
	protected static final OptionalityKind OPTIONALITY_EDEFAULT = OptionalityKind.MANDATORY;

	/**
	 * The cached value of the '{@link #getOptionality() <em>Optionality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionality()
	 * @generated
	 * @ordered
	 */
	protected OptionalityKind optionality = OPTIONALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Default_TaskDefinitionParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.DEFAULT_TASK_DEFINITION_PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.DEFAULT_TASK_DEFINITION_PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductDefinition getParameterType() {
		if (parameterType != null && parameterType.eIsProxy()) {
			InternalEObject oldParameterType = (InternalEObject)parameterType;
			parameterType = (WorkProductDefinition)eResolveProxy(oldParameterType);
			if (parameterType != oldParameterType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.DEFAULT_TASK_DEFINITION_PARAMETER__PARAMETER_TYPE, oldParameterType, parameterType));
			}
		}
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductDefinition basicGetParameterType() {
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterType(WorkProductDefinition newParameterType) {
		WorkProductDefinition oldParameterType = parameterType;
		parameterType = newParameterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.DEFAULT_TASK_DEFINITION_PARAMETER__PARAMETER_TYPE, oldParameterType, parameterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionalityKind getOptionality() {
		return optionality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionality(OptionalityKind newOptionality) {
		OptionalityKind oldOptionality = optionality;
		optionality = newOptionality == null ? OPTIONALITY_EDEFAULT : newOptionality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.DEFAULT_TASK_DEFINITION_PARAMETER__OPTIONALITY, oldOptionality, optionality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.DEFAULT_TASK_DEFINITION_PARAMETER__NAME:
				return getName();
			case SpemPackage.DEFAULT_TASK_DEFINITION_PARAMETER__PARAMETER_TYPE:
				if (resolve) return getParameterType();
				return basicGetParameterType();
			case SpemPackage.DEFAULT_TASK_DEFINITION_PARAMETER__OPTIONALITY:
				return getOptionality();
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
			case SpemPackage.DEFAULT_TASK_DEFINITION_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case SpemPackage.DEFAULT_TASK_DEFINITION_PARAMETER__PARAMETER_TYPE:
				setParameterType((WorkProductDefinition)newValue);
				return;
			case SpemPackage.DEFAULT_TASK_DEFINITION_PARAMETER__OPTIONALITY:
				setOptionality((OptionalityKind)newValue);
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
			case SpemPackage.DEFAULT_TASK_DEFINITION_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpemPackage.DEFAULT_TASK_DEFINITION_PARAMETER__PARAMETER_TYPE:
				setParameterType((WorkProductDefinition)null);
				return;
			case SpemPackage.DEFAULT_TASK_DEFINITION_PARAMETER__OPTIONALITY:
				setOptionality(OPTIONALITY_EDEFAULT);
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
			case SpemPackage.DEFAULT_TASK_DEFINITION_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpemPackage.DEFAULT_TASK_DEFINITION_PARAMETER__PARAMETER_TYPE:
				return parameterType != null;
			case SpemPackage.DEFAULT_TASK_DEFINITION_PARAMETER__OPTIONALITY:
				return optionality != OPTIONALITY_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", optionality: ");
		result.append(optionality);
		result.append(')');
		return result.toString();
	}

} //Default_TaskDefinitionParameterImpl
