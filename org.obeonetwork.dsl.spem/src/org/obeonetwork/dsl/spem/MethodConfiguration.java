/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.MethodConfiguration#getBaseConfiguration <em>Base Configuration</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.MethodConfiguration#getMethodPluginSelection <em>Method Plugin Selection</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.MethodConfiguration#getProcessPackageSelection <em>Process Package Selection</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.MethodConfiguration#getContentPackageSelection <em>Content Package Selection</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.MethodConfiguration#getSubstractedCategory <em>Substracted Category</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.MethodConfiguration#getDefaultView <em>Default View</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.MethodConfiguration#getProcessView <em>Process View</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getMethodConfiguration()
 * @model
 * @generated
 */
public interface MethodConfiguration extends MethodLibraryPackageableElement {
	/**
	 * Returns the value of the '<em><b>Base Configuration</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.MethodConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Configuration</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Configuration</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getMethodConfiguration_BaseConfiguration()
	 * @model
	 * @generated
	 */
	EList<MethodConfiguration> getBaseConfiguration();

	/**
	 * Returns the value of the '<em><b>Method Plugin Selection</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.MethodPlugin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Plugin Selection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Plugin Selection</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getMethodConfiguration_MethodPluginSelection()
	 * @model required="true" derived="true"
	 * @generated
	 */
	EList<MethodPlugin> getMethodPluginSelection();

	/**
	 * Returns the value of the '<em><b>Process Package Selection</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.ProcessPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Package Selection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Package Selection</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getMethodConfiguration_ProcessPackageSelection()
	 * @model
	 * @generated
	 */
	EList<ProcessPackage> getProcessPackageSelection();

	/**
	 * Returns the value of the '<em><b>Content Package Selection</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.MethodContentPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Package Selection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Package Selection</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getMethodConfiguration_ContentPackageSelection()
	 * @model
	 * @generated
	 */
	EList<MethodContentPackage> getContentPackageSelection();

	/**
	 * Returns the value of the '<em><b>Substracted Category</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substracted Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substracted Category</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getMethodConfiguration_SubstractedCategory()
	 * @model
	 * @generated
	 */
	EList<Category> getSubstractedCategory();

	/**
	 * Returns the value of the '<em><b>Default View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default View</em>' reference.
	 * @see #setDefaultView(Category)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getMethodConfiguration_DefaultView()
	 * @model required="true"
	 * @generated
	 */
	Category getDefaultView();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.MethodConfiguration#getDefaultView <em>Default View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default View</em>' reference.
	 * @see #getDefaultView()
	 * @generated
	 */
	void setDefaultView(Category value);

	/**
	 * Returns the value of the '<em><b>Process View</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process View</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process View</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getMethodConfiguration_ProcessView()
	 * @model
	 * @generated
	 */
	EList<Category> getProcessView();

} // MethodConfiguration
