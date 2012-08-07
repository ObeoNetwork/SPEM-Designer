/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.MethodLibrary#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.MethodLibrary#getOwnedMethodPlugin <em>Owned Method Plugin</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.MethodLibrary#getPredefinedConfiguration <em>Predefined Configuration</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.MethodLibrary#getConfigurationPackage <em>Configuration Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getMethodLibrary()
 * @model annotation="add-ons uma='configurationPackage'"
 * @generated
 */
public interface MethodLibrary extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getMethodLibrary_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.MethodLibrary#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owned Method Plugin</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.MethodPlugin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Method Plugin</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Method Plugin</em>' containment reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getMethodLibrary_OwnedMethodPlugin()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodPlugin> getOwnedMethodPlugin();

	/**
	 * Returns the value of the '<em><b>Predefined Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.MethodConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Configuration</em>' containment reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getMethodLibrary_PredefinedConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodConfiguration> getPredefinedConfiguration();

	/**
	 * Returns the value of the '<em><b>Configuration Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Package</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Package</em>' containment reference.
	 * @see #setConfigurationPackage(MethodContentPackage)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getMethodLibrary_ConfigurationPackage()
	 * @model containment="true"
	 * @generated
	 */
	MethodContentPackage getConfigurationPackage();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.MethodLibrary#getConfigurationPackage <em>Configuration Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Package</em>' containment reference.
	 * @see #getConfigurationPackage()
	 * @generated
	 */
	void setConfigurationPackage(MethodContentPackage value);

} // MethodLibrary
