/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lifecycle.impl;

import java.util.Collection;

import lifecycle.AbstractState;
import lifecycle.Lifecycle;
import lifecycle.LifecyclePackage;
import lifecycle.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lifecycle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lifecycle.impl.LifecycleImpl#getName <em>Name</em>}</li>
 *   <li>{@link lifecycle.impl.LifecycleImpl#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link lifecycle.impl.LifecycleImpl#getOwnedTransition <em>Owned Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LifecycleImpl extends EObjectImpl implements Lifecycle {
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
	protected LifecycleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LifecyclePackage.Literals.LIFECYCLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LifecyclePackage.LIFECYCLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractState> getOwnedState() {
		if (ownedState == null) {
			ownedState = new EObjectContainmentEList<AbstractState>(AbstractState.class, this, LifecyclePackage.LIFECYCLE__OWNED_STATE);
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
			ownedTransition = new EObjectContainmentEList<Transition>(Transition.class, this, LifecyclePackage.LIFECYCLE__OWNED_TRANSITION);
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
			case LifecyclePackage.LIFECYCLE__OWNED_STATE:
				return ((InternalEList<?>)getOwnedState()).basicRemove(otherEnd, msgs);
			case LifecyclePackage.LIFECYCLE__OWNED_TRANSITION:
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
			case LifecyclePackage.LIFECYCLE__NAME:
				return getName();
			case LifecyclePackage.LIFECYCLE__OWNED_STATE:
				return getOwnedState();
			case LifecyclePackage.LIFECYCLE__OWNED_TRANSITION:
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
			case LifecyclePackage.LIFECYCLE__NAME:
				setName((String)newValue);
				return;
			case LifecyclePackage.LIFECYCLE__OWNED_STATE:
				getOwnedState().clear();
				getOwnedState().addAll((Collection<? extends AbstractState>)newValue);
				return;
			case LifecyclePackage.LIFECYCLE__OWNED_TRANSITION:
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
			case LifecyclePackage.LIFECYCLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LifecyclePackage.LIFECYCLE__OWNED_STATE:
				getOwnedState().clear();
				return;
			case LifecyclePackage.LIFECYCLE__OWNED_TRANSITION:
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
			case LifecyclePackage.LIFECYCLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LifecyclePackage.LIFECYCLE__OWNED_STATE:
				return ownedState != null && !ownedState.isEmpty();
			case LifecyclePackage.LIFECYCLE__OWNED_TRANSITION:
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

} //LifecycleImpl
