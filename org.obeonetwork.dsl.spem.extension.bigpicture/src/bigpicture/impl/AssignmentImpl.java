/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bigpicture.impl;

import bigpicture.ActivityBP;
import bigpicture.Assignment;
import bigpicture.BigpicturePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.dsl.spem.WorkBreakdownElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bigpicture.impl.AssignmentImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link bigpicture.impl.AssignmentImpl#getWorkBreakdownElement <em>Work Breakdown Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentImpl extends EObjectImpl implements Assignment {
	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected ActivityBP activity;

	/**
	 * The cached value of the '{@link #getWorkBreakdownElement() <em>Work Breakdown Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkBreakdownElement()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkBreakdownElement> workBreakdownElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BigpicturePackage.Literals.ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityBP getActivity() {
		if (activity != null && activity.eIsProxy()) {
			InternalEObject oldActivity = (InternalEObject)activity;
			activity = (ActivityBP)eResolveProxy(oldActivity);
			if (activity != oldActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BigpicturePackage.ASSIGNMENT__ACTIVITY, oldActivity, activity));
			}
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityBP basicGetActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(ActivityBP newActivity) {
		ActivityBP oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BigpicturePackage.ASSIGNMENT__ACTIVITY, oldActivity, activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkBreakdownElement> getWorkBreakdownElement() {
		if (workBreakdownElement == null) {
			workBreakdownElement = new EObjectResolvingEList<WorkBreakdownElement>(WorkBreakdownElement.class, this, BigpicturePackage.ASSIGNMENT__WORK_BREAKDOWN_ELEMENT);
		}
		return workBreakdownElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BigpicturePackage.ASSIGNMENT__ACTIVITY:
				if (resolve) return getActivity();
				return basicGetActivity();
			case BigpicturePackage.ASSIGNMENT__WORK_BREAKDOWN_ELEMENT:
				return getWorkBreakdownElement();
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
			case BigpicturePackage.ASSIGNMENT__ACTIVITY:
				setActivity((ActivityBP)newValue);
				return;
			case BigpicturePackage.ASSIGNMENT__WORK_BREAKDOWN_ELEMENT:
				getWorkBreakdownElement().clear();
				getWorkBreakdownElement().addAll((Collection<? extends WorkBreakdownElement>)newValue);
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
			case BigpicturePackage.ASSIGNMENT__ACTIVITY:
				setActivity((ActivityBP)null);
				return;
			case BigpicturePackage.ASSIGNMENT__WORK_BREAKDOWN_ELEMENT:
				getWorkBreakdownElement().clear();
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
			case BigpicturePackage.ASSIGNMENT__ACTIVITY:
				return activity != null;
			case BigpicturePackage.ASSIGNMENT__WORK_BREAKDOWN_ELEMENT:
				return workBreakdownElement != null && !workBreakdownElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssignmentImpl
