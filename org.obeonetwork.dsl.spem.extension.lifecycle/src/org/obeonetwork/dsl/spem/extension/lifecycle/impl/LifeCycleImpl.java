/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.extension.lifecycle.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.spem.extension.lifecycle.AbstractState;
import org.obeonetwork.dsl.spem.extension.lifecycle.LifeCycle;
import org.obeonetwork.dsl.spem.extension.lifecycle.LifecyclePackage;
import org.obeonetwork.dsl.spem.extension.lifecycle.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Life Cycle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifeCycleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifeCycleImpl#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.extension.lifecycle.impl.LifeCycleImpl#getOwnedTransition <em>Owned Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LifeCycleImpl extends EObjectImpl implements LifeCycle {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedState() <em>Owned State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedState()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractState> ownedState;

	/**
	 * The cached value of the '{@link #getOwnedTransition() <em>Owned Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> ownedTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifeCycleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LifecyclePackage.Literals.LIFE_CYCLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LifecyclePackage.LIFE_CYCLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractState> getOwnedState() {
		if (ownedState == null) {
			ownedState = new EObjectContainmentEList<AbstractState>(AbstractState.class, this, LifecyclePackage.LIFE_CYCLE__OWNED_STATE);
		}
		return ownedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOwnedTransition() {
		if (ownedTransition == null) {
			ownedTransition = new EObjectContainmentEList<Transition>(Transition.class, this, LifecyclePackage.LIFE_CYCLE__OWNED_TRANSITION);
		}
		return ownedTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LifecyclePackage.LIFE_CYCLE__OWNED_STATE:
				return ((InternalEList<?>)getOwnedState()).basicRemove(otherEnd, msgs);
			case LifecyclePackage.LIFE_CYCLE__OWNED_TRANSITION:
				return ((InternalEList<?>)getOwnedTransition()).basicRemove(otherEnd, msgs);
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
			case LifecyclePackage.LIFE_CYCLE__NAME:
				return getName();
			case LifecyclePackage.LIFE_CYCLE__OWNED_STATE:
				return getOwnedState();
			case LifecyclePackage.LIFE_CYCLE__OWNED_TRANSITION:
				return getOwnedTransition();
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
			case LifecyclePackage.LIFE_CYCLE__NAME:
				setName((String)newValue);
				return;
			case LifecyclePackage.LIFE_CYCLE__OWNED_STATE:
				getOwnedState().clear();
				getOwnedState().addAll((Collection<? extends AbstractState>)newValue);
				return;
			case LifecyclePackage.LIFE_CYCLE__OWNED_TRANSITION:
				getOwnedTransition().clear();
				getOwnedTransition().addAll((Collection<? extends Transition>)newValue);
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
			case LifecyclePackage.LIFE_CYCLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LifecyclePackage.LIFE_CYCLE__OWNED_STATE:
				getOwnedState().clear();
				return;
			case LifecyclePackage.LIFE_CYCLE__OWNED_TRANSITION:
				getOwnedTransition().clear();
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
			case LifecyclePackage.LIFE_CYCLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LifecyclePackage.LIFE_CYCLE__OWNED_STATE:
				return ownedState != null && !ownedState.isEmpty();
			case LifecyclePackage.LIFE_CYCLE__OWNED_TRANSITION:
				return ownedTransition != null && !ownedTransition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LifeCycleImpl
