/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extensible Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.ExtensibleElement#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getExtensibleElement()
 * @model abstract="true"
 * @generated
 */
public interface ExtensibleElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' reference.
	 * @see #setKind(Kind)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getExtensibleElement_Kind()
	 * @model
	 * @generated
	 */
	Kind getKind();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.ExtensibleElement#getKind <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Kind value);

} // ExtensibleElement
