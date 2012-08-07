/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.spem.MethodConfiguration;
import org.obeonetwork.dsl.spem.MethodContentPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.ConfigurationPackage#getOwnedConfiguration <em>Owned Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getConfigurationPackage()
 * @model
 * @generated
 */
public interface ConfigurationPackage extends MethodContentPackage {
	/**
	 * Returns the value of the '<em><b>Owned Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.MethodConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Configuration</em>' containment reference list.
	 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getConfigurationPackage_OwnedConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodConfiguration> getOwnedConfiguration();

} // ConfigurationPackage
