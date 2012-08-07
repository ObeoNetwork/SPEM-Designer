/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.spem.Category;
import org.obeonetwork.dsl.spem.DescribableElement;
import org.obeonetwork.dsl.spem.SpemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.CategoryImpl#getSubCategory <em>Sub Category</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.CategoryImpl#getCategorizedElement <em>Categorized Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoryImpl extends MethodContentElementImpl implements Category {
	/**
	 * The cached value of the '{@link #getSubCategory() <em>Sub Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> subCategory;

	/**
	 * The cached value of the '{@link #getCategorizedElement() <em>Categorized Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorizedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<DescribableElement> categorizedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getSubCategory() {
		if (subCategory == null) {
			subCategory = new EObjectResolvingEList<Category>(Category.class, this, SpemPackage.CATEGORY__SUB_CATEGORY);
		}
		return subCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescribableElement> getCategorizedElement() {
		if (categorizedElement == null) {
			categorizedElement = new EObjectWithInverseResolvingEList.ManyInverse<DescribableElement>(DescribableElement.class, this, SpemPackage.CATEGORY__CATEGORIZED_ELEMENT, SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY);
		}
		return categorizedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpemPackage.CATEGORY__CATEGORIZED_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategorizedElement()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpemPackage.CATEGORY__CATEGORIZED_ELEMENT:
				return ((InternalEList<?>)getCategorizedElement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.CATEGORY__SUB_CATEGORY:
				return getSubCategory();
			case SpemPackage.CATEGORY__CATEGORIZED_ELEMENT:
				return getCategorizedElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpemPackage.CATEGORY__SUB_CATEGORY:
				getSubCategory().clear();
				getSubCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case SpemPackage.CATEGORY__CATEGORIZED_ELEMENT:
				getCategorizedElement().clear();
				getCategorizedElement().addAll((Collection<? extends DescribableElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpemPackage.CATEGORY__SUB_CATEGORY:
				getSubCategory().clear();
				return;
			case SpemPackage.CATEGORY__CATEGORIZED_ELEMENT:
				getCategorizedElement().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpemPackage.CATEGORY__SUB_CATEGORY:
				return subCategory != null && !subCategory.isEmpty();
			case SpemPackage.CATEGORY__CATEGORIZED_ELEMENT:
				return categorizedElement != null && !categorizedElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CategoryImpl
