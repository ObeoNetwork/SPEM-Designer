/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Definition Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.WorkDefinitionParameter#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkDefinitionParameter()
 * @model
 * @generated
 */
public interface WorkDefinitionParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.spem.ParameterDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.obeonetwork.dsl.spem.ParameterDirectionKind
	 * @see #setDirection(ParameterDirectionKind)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkDefinitionParameter_Direction()
	 * @model
	 * @generated
	 */
	ParameterDirectionKind getDirection();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.WorkDefinitionParameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.obeonetwork.dsl.spem.ParameterDirectionKind
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(ParameterDirectionKind value);

} // WorkDefinitionParameter
