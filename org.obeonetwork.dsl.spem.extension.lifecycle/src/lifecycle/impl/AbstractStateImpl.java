/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lifecycle.impl;

import java.util.Collection;

import lifecycle.AbstractState;
import lifecycle.LifecyclePackage;
import lifecycle.Transition;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lifecycle.impl.AbstractStateImpl#getIncomingTransition <em>Incoming Transition</em>}</li>
 *   <li>{@link lifecycle.impl.AbstractStateImpl#getOutgoingTransition <em>Outgoing Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractStateImpl extends EObjectImpl implements AbstractState {
	/**
	 * The cached value of the '{@link #getIncomingTransition() <em>Incoming Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incomingTransition;

	/**
	 * The cached value of the '{@link #getOutgoingTransition() <em>Outgoing Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoingTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LifecyclePackage.Literals.ABSTRACT_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncomingTransition() {
		if (incomingTransition == null) {
			incomingTransition = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, LifecyclePackage.ABSTRACT_STATE__INCOMING_TRANSITION, LifecyclePackage.TRANSITION__TARGET);
		}
		return incomingTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoingTransition() {
		if (outgoingTransition == null) {
			outgoingTransition = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, LifecyclePackage.ABSTRACT_STATE__OUTGOING_TRANSITION, LifecyclePackage.TRANSITION__SOURCE);
		}
		return outgoingTransition;
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
			case LifecyclePackage.ABSTRACT_STATE__INCOMING_TRANSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingTransition()).basicAdd(otherEnd, msgs);
			case LifecyclePackage.ABSTRACT_STATE__OUTGOING_TRANSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingTransition()).basicAdd(otherEnd, msgs);
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
			case LifecyclePackage.ABSTRACT_STATE__INCOMING_TRANSITION:
				return ((InternalEList<?>)getIncomingTransition()).basicRemove(otherEnd, msgs);
			case LifecyclePackage.ABSTRACT_STATE__OUTGOING_TRANSITION:
				return ((InternalEList<?>)getOutgoingTransition()).basicRemove(otherEnd, msgs);
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
			case LifecyclePackage.ABSTRACT_STATE__INCOMING_TRANSITION:
				return getIncomingTransition();
			case LifecyclePackage.ABSTRACT_STATE__OUTGOING_TRANSITION:
				return getOutgoingTransition();
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
			case LifecyclePackage.ABSTRACT_STATE__INCOMING_TRANSITION:
				getIncomingTransition().clear();
				getIncomingTransition().addAll((Collection<? extends Transition>)newValue);
				return;
			case LifecyclePackage.ABSTRACT_STATE__OUTGOING_TRANSITION:
				getOutgoingTransition().clear();
				getOutgoingTransition().addAll((Collection<? extends Transition>)newValue);
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
			case LifecyclePackage.ABSTRACT_STATE__INCOMING_TRANSITION:
				getIncomingTransition().clear();
				return;
			case LifecyclePackage.ABSTRACT_STATE__OUTGOING_TRANSITION:
				getOutgoingTransition().clear();
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
			case LifecyclePackage.ABSTRACT_STATE__INCOMING_TRANSITION:
				return incomingTransition != null && !incomingTransition.isEmpty();
			case LifecyclePackage.ABSTRACT_STATE__OUTGOING_TRANSITION:
				return outgoingTransition != null && !outgoingTransition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractStateImpl
