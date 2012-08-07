/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma;

import org.eclipse.emf.ecore.EObject;

import org.obeonetwork.dsl.spem.MethodConfiguration;
import org.obeonetwork.dsl.spem.MethodLibrary;
import org.obeonetwork.dsl.spem.MethodPlugin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.Root#getMethodConfiguration <em>Method Configuration</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.Root#getMethodLibrary <em>Method Library</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.Root#getMethodPlugin <em>Method Plugin</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Method Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Configuration</em>' containment reference.
	 * @see #setMethodConfiguration(MethodConfiguration)
	 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getRoot_MethodConfiguration()
	 * @model containment="true" upper="-2"
	 * @generated
	 */
	MethodConfiguration getMethodConfiguration();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.uma.Root#getMethodConfiguration <em>Method Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Configuration</em>' containment reference.
	 * @see #getMethodConfiguration()
	 * @generated
	 */
	void setMethodConfiguration(MethodConfiguration value);

	/**
	 * Returns the value of the '<em><b>Method Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Library</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Library</em>' containment reference.
	 * @see #setMethodLibrary(MethodLibrary)
	 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getRoot_MethodLibrary()
	 * @model containment="true" upper="-2"
	 * @generated
	 */
	MethodLibrary getMethodLibrary();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.uma.Root#getMethodLibrary <em>Method Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Library</em>' containment reference.
	 * @see #getMethodLibrary()
	 * @generated
	 */
	void setMethodLibrary(MethodLibrary value);

	/**
	 * Returns the value of the '<em><b>Method Plugin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Plugin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Plugin</em>' containment reference.
	 * @see #setMethodPlugin(MethodPlugin)
	 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getRoot_MethodPlugin()
	 * @model containment="true" upper="-2"
	 * @generated
	 */
	MethodPlugin getMethodPlugin();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.uma.Root#getMethodPlugin <em>Method Plugin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Plugin</em>' containment reference.
	 * @see #getMethodPlugin()
	 * @generated
	 */
	void setMethodPlugin(MethodPlugin value);

} // Root
