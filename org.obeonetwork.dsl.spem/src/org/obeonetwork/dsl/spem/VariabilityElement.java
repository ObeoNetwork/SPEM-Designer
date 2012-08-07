/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variability Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.VariabilityElement#getVariabilityType <em>Variability Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.VariabilityElement#getVariabilityBasedOnElement <em>Variability Based On Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getVariabilityElement()
 * @model abstract="true"
 * @generated
 */
public interface VariabilityElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Variability Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.spem.VariabilityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variability Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variability Type</em>' attribute.
	 * @see org.obeonetwork.dsl.spem.VariabilityType
	 * @see #setVariabilityType(VariabilityType)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getVariabilityElement_VariabilityType()
	 * @model
	 * @generated
	 */
	VariabilityType getVariabilityType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.VariabilityElement#getVariabilityType <em>Variability Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variability Type</em>' attribute.
	 * @see org.obeonetwork.dsl.spem.VariabilityType
	 * @see #getVariabilityType()
	 * @generated
	 */
	void setVariabilityType(VariabilityType value);

	/**
	 * Returns the value of the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variability Based On Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variability Based On Element</em>' reference.
	 * @see #setVariabilityBasedOnElement(VariabilityElement)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getVariabilityElement_VariabilityBasedOnElement()
	 * @model
	 * @generated
	 */
	VariabilityElement getVariabilityBasedOnElement();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.VariabilityElement#getVariabilityBasedOnElement <em>Variability Based On Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variability Based On Element</em>' reference.
	 * @see #getVariabilityBasedOnElement()
	 * @generated
	 */
	void setVariabilityBasedOnElement(VariabilityElement value);

} // VariabilityElement
