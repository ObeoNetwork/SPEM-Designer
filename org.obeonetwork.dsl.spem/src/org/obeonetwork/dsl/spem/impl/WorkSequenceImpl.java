/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.WorkBreakdownElement;
import org.obeonetwork.dsl.spem.WorkSequence;
import org.obeonetwork.dsl.spem.WorkSequenceKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.WorkSequenceImpl#getLinkKind <em>Link Kind</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.WorkSequenceImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.WorkSequenceImpl#getSuccessor <em>Successor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkSequenceImpl extends BreakdownElementImpl implements WorkSequence {
	/**
	 * The default value of the '{@link #getLinkKind() <em>Link Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkKind()
	 * @generated
	 * @ordered
	 */
	protected static final WorkSequenceKind LINK_KIND_EDEFAULT = WorkSequenceKind.FINISH_TO_START;

	/**
	 * The cached value of the '{@link #getLinkKind() <em>Link Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkKind()
	 * @generated
	 * @ordered
	 */
	protected WorkSequenceKind linkKind = LINK_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessor()
	 * @generated
	 * @ordered
	 */
	protected WorkBreakdownElement predecessor;

	/**
	 * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessor()
	 * @generated
	 * @ordered
	 */
	protected WorkBreakdownElement successor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.WORK_SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkSequenceKind getLinkKind() {
		return linkKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkKind(WorkSequenceKind newLinkKind) {
		WorkSequenceKind oldLinkKind = linkKind;
		linkKind = newLinkKind == null ? LINK_KIND_EDEFAULT : newLinkKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.WORK_SEQUENCE__LINK_KIND, oldLinkKind, linkKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkBreakdownElement getPredecessor() {
		if (predecessor != null && predecessor.eIsProxy()) {
			InternalEObject oldPredecessor = (InternalEObject)predecessor;
			predecessor = (WorkBreakdownElement)eResolveProxy(oldPredecessor);
			if (predecessor != oldPredecessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.WORK_SEQUENCE__PREDECESSOR, oldPredecessor, predecessor));
			}
		}
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkBreakdownElement basicGetPredecessor() {
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredecessor(WorkBreakdownElement newPredecessor, NotificationChain msgs) {
		WorkBreakdownElement oldPredecessor = predecessor;
		predecessor = newPredecessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpemPackage.WORK_SEQUENCE__PREDECESSOR, oldPredecessor, newPredecessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredecessor(WorkBreakdownElement newPredecessor) {
		if (newPredecessor != predecessor) {
			NotificationChain msgs = null;
			if (predecessor != null)
				msgs = ((InternalEObject)predecessor).eInverseRemove(this, SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_SUCCESSOR, WorkBreakdownElement.class, msgs);
			if (newPredecessor != null)
				msgs = ((InternalEObject)newPredecessor).eInverseAdd(this, SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_SUCCESSOR, WorkBreakdownElement.class, msgs);
			msgs = basicSetPredecessor(newPredecessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.WORK_SEQUENCE__PREDECESSOR, newPredecessor, newPredecessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkBreakdownElement getSuccessor() {
		if (successor != null && successor.eIsProxy()) {
			InternalEObject oldSuccessor = (InternalEObject)successor;
			successor = (WorkBreakdownElement)eResolveProxy(oldSuccessor);
			if (successor != oldSuccessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.WORK_SEQUENCE__SUCCESSOR, oldSuccessor, successor));
			}
		}
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkBreakdownElement basicGetSuccessor() {
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuccessor(WorkBreakdownElement newSuccessor, NotificationChain msgs) {
		WorkBreakdownElement oldSuccessor = successor;
		successor = newSuccessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpemPackage.WORK_SEQUENCE__SUCCESSOR, oldSuccessor, newSuccessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessor(WorkBreakdownElement newSuccessor) {
		if (newSuccessor != successor) {
			NotificationChain msgs = null;
			if (successor != null)
				msgs = ((InternalEObject)successor).eInverseRemove(this, SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_PREDECESSOR, WorkBreakdownElement.class, msgs);
			if (newSuccessor != null)
				msgs = ((InternalEObject)newSuccessor).eInverseAdd(this, SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_PREDECESSOR, WorkBreakdownElement.class, msgs);
			msgs = basicSetSuccessor(newSuccessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.WORK_SEQUENCE__SUCCESSOR, newSuccessor, newSuccessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpemPackage.WORK_SEQUENCE__PREDECESSOR:
				if (predecessor != null)
					msgs = ((InternalEObject)predecessor).eInverseRemove(this, SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_SUCCESSOR, WorkBreakdownElement.class, msgs);
				return basicSetPredecessor((WorkBreakdownElement)otherEnd, msgs);
			case SpemPackage.WORK_SEQUENCE__SUCCESSOR:
				if (successor != null)
					msgs = ((InternalEObject)successor).eInverseRemove(this, SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_PREDECESSOR, WorkBreakdownElement.class, msgs);
				return basicSetSuccessor((WorkBreakdownElement)otherEnd, msgs);
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
			case SpemPackage.WORK_SEQUENCE__PREDECESSOR:
				return basicSetPredecessor(null, msgs);
			case SpemPackage.WORK_SEQUENCE__SUCCESSOR:
				return basicSetSuccessor(null, msgs);
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
			case SpemPackage.WORK_SEQUENCE__LINK_KIND:
				return getLinkKind();
			case SpemPackage.WORK_SEQUENCE__PREDECESSOR:
				if (resolve) return getPredecessor();
				return basicGetPredecessor();
			case SpemPackage.WORK_SEQUENCE__SUCCESSOR:
				if (resolve) return getSuccessor();
				return basicGetSuccessor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpemPackage.WORK_SEQUENCE__LINK_KIND:
				setLinkKind((WorkSequenceKind)newValue);
				return;
			case SpemPackage.WORK_SEQUENCE__PREDECESSOR:
				setPredecessor((WorkBreakdownElement)newValue);
				return;
			case SpemPackage.WORK_SEQUENCE__SUCCESSOR:
				setSuccessor((WorkBreakdownElement)newValue);
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
			case SpemPackage.WORK_SEQUENCE__LINK_KIND:
				setLinkKind(LINK_KIND_EDEFAULT);
				return;
			case SpemPackage.WORK_SEQUENCE__PREDECESSOR:
				setPredecessor((WorkBreakdownElement)null);
				return;
			case SpemPackage.WORK_SEQUENCE__SUCCESSOR:
				setSuccessor((WorkBreakdownElement)null);
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
			case SpemPackage.WORK_SEQUENCE__LINK_KIND:
				return linkKind != LINK_KIND_EDEFAULT;
			case SpemPackage.WORK_SEQUENCE__PREDECESSOR:
				return predecessor != null;
			case SpemPackage.WORK_SEQUENCE__SUCCESSOR:
				return successor != null;
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
		result.append(" (linkKind: ");
		result.append(linkKind);
		result.append(')');
		return result.toString();
	}

} //WorkSequenceImpl
