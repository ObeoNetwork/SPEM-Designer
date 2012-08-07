/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Content Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.MethodContentPackage#getOwnedMethodContentMember <em>Owned Method Content Member</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.MethodContentPackage#getReusedPackage <em>Reused Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getMethodContentPackage()
 * @model
 * @generated
 */
public interface MethodContentPackage extends MethodContentPackageableElement, MethodPluginPackageableElement {
	/**
	 * Returns the value of the '<em><b>Owned Method Content Member</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.MethodContentPackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Method Content Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Method Content Member</em>' containment reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getMethodContentPackage_OwnedMethodContentMember()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodContentPackageableElement> getOwnedMethodContentMember();

	/**
	 * Returns the value of the '<em><b>Reused Package</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.MethodContentPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reused Package</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reused Package</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getMethodContentPackage_ReusedPackage()
	 * @model
	 * @generated
	 */
	EList<MethodContentPackage> getReusedPackage();

} // MethodContentPackage
