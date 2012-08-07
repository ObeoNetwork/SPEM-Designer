/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.Category#getSubCategory <em>Sub Category</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.Category#getCategorizedElement <em>Categorized Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends MethodContentElement {
	/**
	 * Returns the value of the '<em><b>Sub Category</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Category</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getCategory_SubCategory()
	 * @model
	 * @generated
	 */
	EList<Category> getSubCategory();

	/**
	 * Returns the value of the '<em><b>Categorized Element</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.DescribableElement}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.spem.DescribableElement#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorized Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorized Element</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getCategory_CategorizedElement()
	 * @see org.obeonetwork.dsl.spem.DescribableElement#getCategory
	 * @model opposite="category"
	 * @generated
	 */
	EList<DescribableElement> getCategorizedElement();

} // Category
