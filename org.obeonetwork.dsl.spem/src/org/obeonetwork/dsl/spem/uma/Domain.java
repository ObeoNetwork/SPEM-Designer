/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.spem.Category;
import org.obeonetwork.dsl.spem.WorkProductDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.Domain#getRelatedProduct <em>Related Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends Category {
	/**
	 * Returns the value of the '<em><b>Related Product</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.WorkProductDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Product</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Product</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getDomain_RelatedProduct()
	 * @model
	 * @generated
	 */
	EList<WorkProductDefinition> getRelatedProduct();

} // Domain
