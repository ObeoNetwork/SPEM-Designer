/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.dsl.spem.Qualification;
import org.obeonetwork.dsl.spem.RoleDefinition;
import org.obeonetwork.dsl.spem.SpemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.RoleDefinitionImpl#getSynonym <em>Synonym</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.RoleDefinitionImpl#getProvidedQualification <em>Provided Qualification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleDefinitionImpl extends MethodContentElementImpl implements RoleDefinition {
	/**
	 * The cached value of the '{@link #getSynonym() <em>Synonym</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynonym()
	 * @generated
	 * @ordered
	 */
	protected EList<String> synonym;

	/**
	 * The cached value of the '{@link #getProvidedQualification() <em>Provided Qualification</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedQualification()
	 * @generated
	 * @ordered
	 */
	protected EList<Qualification> providedQualification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.ROLE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSynonym() {
		if (synonym == null) {
			synonym = new EDataTypeUniqueEList<String>(String.class, this, SpemPackage.ROLE_DEFINITION__SYNONYM);
		}
		return synonym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Qualification> getProvidedQualification() {
		if (providedQualification == null) {
			providedQualification = new EObjectResolvingEList<Qualification>(Qualification.class, this, SpemPackage.ROLE_DEFINITION__PROVIDED_QUALIFICATION);
		}
		return providedQualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.ROLE_DEFINITION__SYNONYM:
				return getSynonym();
			case SpemPackage.ROLE_DEFINITION__PROVIDED_QUALIFICATION:
				return getProvidedQualification();
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
			case SpemPackage.ROLE_DEFINITION__SYNONYM:
				getSynonym().clear();
				getSynonym().addAll((Collection<? extends String>)newValue);
				return;
			case SpemPackage.ROLE_DEFINITION__PROVIDED_QUALIFICATION:
				getProvidedQualification().clear();
				getProvidedQualification().addAll((Collection<? extends Qualification>)newValue);
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
			case SpemPackage.ROLE_DEFINITION__SYNONYM:
				getSynonym().clear();
				return;
			case SpemPackage.ROLE_DEFINITION__PROVIDED_QUALIFICATION:
				getProvidedQualification().clear();
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
			case SpemPackage.ROLE_DEFINITION__SYNONYM:
				return synonym != null && !synonym.isEmpty();
			case SpemPackage.ROLE_DEFINITION__PROVIDED_QUALIFICATION:
				return providedQualification != null && !providedQualification.isEmpty();
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
		result.append(" (synonym: ");
		result.append(synonym);
		result.append(')');
		return result.toString();
	}

} //RoleDefinitionImpl
