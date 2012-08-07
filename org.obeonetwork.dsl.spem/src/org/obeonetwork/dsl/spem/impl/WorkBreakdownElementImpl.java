/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.WorkBreakdownElement;
import org.obeonetwork.dsl.spem.WorkSequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Breakdown Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.WorkBreakdownElementImpl#isIsRepeatable <em>Is Repeatable</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.WorkBreakdownElementImpl#isIsOngoing <em>Is Ongoing</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.WorkBreakdownElementImpl#isIsEventDriven <em>Is Event Driven</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.WorkBreakdownElementImpl#getLinkToPredecessor <em>Link To Predecessor</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.WorkBreakdownElementImpl#getLinkToSuccessor <em>Link To Successor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class WorkBreakdownElementImpl extends BreakdownElementImpl implements WorkBreakdownElement {
	/**
	 * The default value of the '{@link #isIsRepeatable() <em>Is Repeatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRepeatable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REPEATABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRepeatable() <em>Is Repeatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRepeatable()
	 * @generated
	 * @ordered
	 */
	protected boolean isRepeatable = IS_REPEATABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOngoing() <em>Is Ongoing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOngoing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ONGOING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOngoing() <em>Is Ongoing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOngoing()
	 * @generated
	 * @ordered
	 */
	protected boolean isOngoing = IS_ONGOING_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsEventDriven() <em>Is Event Driven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEventDriven()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EVENT_DRIVEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEventDriven() <em>Is Event Driven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEventDriven()
	 * @generated
	 * @ordered
	 */
	protected boolean isEventDriven = IS_EVENT_DRIVEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinkToPredecessor() <em>Link To Predecessor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkToPredecessor()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkSequence> linkToPredecessor;

	/**
	 * The cached value of the '{@link #getLinkToSuccessor() <em>Link To Successor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkToSuccessor()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkSequence> linkToSuccessor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkBreakdownElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.WORK_BREAKDOWN_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRepeatable() {
		return isRepeatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRepeatable(boolean newIsRepeatable) {
		boolean oldIsRepeatable = isRepeatable;
		isRepeatable = newIsRepeatable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_REPEATABLE, oldIsRepeatable, isRepeatable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOngoing() {
		return isOngoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOngoing(boolean newIsOngoing) {
		boolean oldIsOngoing = isOngoing;
		isOngoing = newIsOngoing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_ONGOING, oldIsOngoing, isOngoing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEventDriven() {
		return isEventDriven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEventDriven(boolean newIsEventDriven) {
		boolean oldIsEventDriven = isEventDriven;
		isEventDriven = newIsEventDriven;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_EVENT_DRIVEN, oldIsEventDriven, isEventDriven));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkSequence> getLinkToPredecessor() {
		if (linkToPredecessor == null) {
			linkToPredecessor = new EObjectWithInverseResolvingEList<WorkSequence>(WorkSequence.class, this, SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_PREDECESSOR, SpemPackage.WORK_SEQUENCE__SUCCESSOR);
		}
		return linkToPredecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkSequence> getLinkToSuccessor() {
		if (linkToSuccessor == null) {
			linkToSuccessor = new EObjectWithInverseResolvingEList<WorkSequence>(WorkSequence.class, this, SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_SUCCESSOR, SpemPackage.WORK_SEQUENCE__PREDECESSOR);
		}
		return linkToSuccessor;
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
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_PREDECESSOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinkToPredecessor()).basicAdd(otherEnd, msgs);
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_SUCCESSOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinkToSuccessor()).basicAdd(otherEnd, msgs);
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
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_PREDECESSOR:
				return ((InternalEList<?>)getLinkToPredecessor()).basicRemove(otherEnd, msgs);
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_SUCCESSOR:
				return ((InternalEList<?>)getLinkToSuccessor()).basicRemove(otherEnd, msgs);
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
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_REPEATABLE:
				return isIsRepeatable();
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_ONGOING:
				return isIsOngoing();
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_EVENT_DRIVEN:
				return isIsEventDriven();
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_PREDECESSOR:
				return getLinkToPredecessor();
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_SUCCESSOR:
				return getLinkToSuccessor();
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
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_REPEATABLE:
				setIsRepeatable((Boolean)newValue);
				return;
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_ONGOING:
				setIsOngoing((Boolean)newValue);
				return;
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_EVENT_DRIVEN:
				setIsEventDriven((Boolean)newValue);
				return;
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_PREDECESSOR:
				getLinkToPredecessor().clear();
				getLinkToPredecessor().addAll((Collection<? extends WorkSequence>)newValue);
				return;
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_SUCCESSOR:
				getLinkToSuccessor().clear();
				getLinkToSuccessor().addAll((Collection<? extends WorkSequence>)newValue);
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
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_REPEATABLE:
				setIsRepeatable(IS_REPEATABLE_EDEFAULT);
				return;
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_ONGOING:
				setIsOngoing(IS_ONGOING_EDEFAULT);
				return;
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_EVENT_DRIVEN:
				setIsEventDriven(IS_EVENT_DRIVEN_EDEFAULT);
				return;
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_PREDECESSOR:
				getLinkToPredecessor().clear();
				return;
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_SUCCESSOR:
				getLinkToSuccessor().clear();
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
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_REPEATABLE:
				return isRepeatable != IS_REPEATABLE_EDEFAULT;
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_ONGOING:
				return isOngoing != IS_ONGOING_EDEFAULT;
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_EVENT_DRIVEN:
				return isEventDriven != IS_EVENT_DRIVEN_EDEFAULT;
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_PREDECESSOR:
				return linkToPredecessor != null && !linkToPredecessor.isEmpty();
			case SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_SUCCESSOR:
				return linkToSuccessor != null && !linkToSuccessor.isEmpty();
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
		result.append(" (isRepeatable: ");
		result.append(isRepeatable);
		result.append(", isOngoing: ");
		result.append(isOngoing);
		result.append(", isEventDriven: ");
		result.append(isEventDriven);
		result.append(')');
		return result.toString();
	}

} //WorkBreakdownElementImpl
