/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.spem.WorkProductUse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deliverable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.Deliverable#getDeliveredProduct <em>Delivered Product</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.Deliverable#getExternalDescription <em>External Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.Deliverable#getPackagingGuidance <em>Packaging Guidance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getDeliverable()
 * @model
 * @generated
 */
public interface Deliverable extends WorkProductUse {
	/**
	 * Returns the value of the '<em><b>Delivered Product</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.WorkProductUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivered Product</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivered Product</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getDeliverable_DeliveredProduct()
	 * @model
	 * @generated
	 */
	EList<WorkProductUse> getDeliveredProduct();

	/**
	 * Returns the value of the '<em><b>External Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Description</em>' attribute.
	 * @see #setExternalDescription(String)
	 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getDeliverable_ExternalDescription()
	 * @model
	 * @generated
	 */
	String getExternalDescription();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.uma.Deliverable#getExternalDescription <em>External Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Description</em>' attribute.
	 * @see #getExternalDescription()
	 * @generated
	 */
	void setExternalDescription(String value);

	/**
	 * Returns the value of the '<em><b>Packaging Guidance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packaging Guidance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packaging Guidance</em>' attribute.
	 * @see #setPackagingGuidance(String)
	 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getDeliverable_PackagingGuidance()
	 * @model
	 * @generated
	 */
	String getPackagingGuidance();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.uma.Deliverable#getPackagingGuidance <em>Packaging Guidance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packaging Guidance</em>' attribute.
	 * @see #getPackagingGuidance()
	 * @generated
	 */
	void setPackagingGuidance(String value);

} // Deliverable
