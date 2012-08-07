/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Plugin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.MethodPlugin#getOwnedMethodContentPackage <em>Owned Method Content Package</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.MethodPlugin#getOwnedProcessPackage <em>Owned Process Package</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.MethodPlugin#getBasePlugin <em>Base Plugin</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getMethodPlugin()
 * @model
 * @generated
 */
public interface MethodPlugin extends MethodLibraryPackageableElement {
	/**
	 * Returns the value of the '<em><b>Owned Method Content Package</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.MethodContentPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Method Content Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Method Content Package</em>' containment reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getMethodPlugin_OwnedMethodContentPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodContentPackage> getOwnedMethodContentPackage();

	/**
	 * Returns the value of the '<em><b>Owned Process Package</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.ProcessPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Process Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Process Package</em>' containment reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getMethodPlugin_OwnedProcessPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessPackage> getOwnedProcessPackage();

	/**
	 * Returns the value of the '<em><b>Base Plugin</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.MethodPlugin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Plugin</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Plugin</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getMethodPlugin_BasePlugin()
	 * @model
	 * @generated
	 */
	EList<MethodPlugin> getBasePlugin();

} // MethodPlugin
