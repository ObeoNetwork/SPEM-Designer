/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.extension.lifecycle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.extension.lifecycle.LifecycleElement#getLifecycle <em>Lifecycle</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.extension.lifecycle.LifecyclePackage#getLifecycleElement()
 * @model abstract="true"
 * @generated
 */
public interface LifecycleElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Lifecycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifecycle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifecycle</em>' containment reference.
	 * @see #setLifecycle(LifeCycle)
	 * @see org.obeonetwork.dsl.spem.extension.lifecycle.LifecyclePackage#getLifecycleElement_Lifecycle()
	 * @model containment="true"
	 * @generated
	 */
	LifeCycle getLifecycle();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.extension.lifecycle.LifecycleElement#getLifecycle <em>Lifecycle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifecycle</em>' containment reference.
	 * @see #getLifecycle()
	 * @generated
	 */
	void setLifecycle(LifeCycle value);

} // LifecycleElement
