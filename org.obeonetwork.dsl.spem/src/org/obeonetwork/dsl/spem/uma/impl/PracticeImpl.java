/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.spem.Activity;
import org.obeonetwork.dsl.spem.MethodContentElement;

import org.obeonetwork.dsl.spem.impl.GuidanceImpl;

import org.obeonetwork.dsl.spem.uma.Practice;
import org.obeonetwork.dsl.spem.uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Practice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.PracticeImpl#getSubPractice <em>Sub Practice</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.PracticeImpl#getReferencedActivity <em>Referenced Activity</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.PracticeImpl#getContentReference <em>Content Reference</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.PracticeImpl#getAdditionalInfo <em>Additional Info</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.PracticeImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.PracticeImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.PracticeImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.PracticeImpl#getLevelOfAdoption <em>Level Of Adoption</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.PracticeImpl#getProblem <em>Problem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PracticeImpl extends GuidanceImpl implements Practice {
	/**
	 * The cached value of the '{@link #getSubPractice() <em>Sub Practice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPractice()
	 * @generated
	 * @ordered
	 */
	protected EList<Practice> subPractice;

	/**
	 * The cached value of the '{@link #getReferencedActivity() <em>Referenced Activity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> referencedActivity;

	/**
	 * The cached value of the '{@link #getContentReference() <em>Content Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentReference()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodContentElement> contentReference;

	/**
	 * The default value of the '{@link #getAdditionalInfo() <em>Additional Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalInfo() <em>Additional Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInfo()
	 * @generated
	 * @ordered
	 */
	protected String additionalInfo = ADDITIONAL_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected String application = APPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected String background = BACKGROUND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<String> goal;

	/**
	 * The cached value of the '{@link #getLevelOfAdoption() <em>Level Of Adoption</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOfAdoption()
	 * @generated
	 * @ordered
	 */
	protected EList<String> levelOfAdoption;

	/**
	 * The default value of the '{@link #getProblem() <em>Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblem()
	 * @generated
	 * @ordered
	 */
	protected static final String PROBLEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProblem() <em>Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblem()
	 * @generated
	 * @ordered
	 */
	protected String problem = PROBLEM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PracticeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.Literals.PRACTICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Practice> getSubPractice() {
		if (subPractice == null) {
			subPractice = new EObjectContainmentEList<Practice>(Practice.class, this, UmaPackage.PRACTICE__SUB_PRACTICE);
		}
		return subPractice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getReferencedActivity() {
		if (referencedActivity == null) {
			referencedActivity = new EObjectResolvingEList<Activity>(Activity.class, this, UmaPackage.PRACTICE__REFERENCED_ACTIVITY);
		}
		return referencedActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodContentElement> getContentReference() {
		if (contentReference == null) {
			contentReference = new EObjectResolvingEList<MethodContentElement>(MethodContentElement.class, this, UmaPackage.PRACTICE__CONTENT_REFERENCE);
		}
		return contentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdditionalInfo() {
		return additionalInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalInfo(String newAdditionalInfo) {
		String oldAdditionalInfo = additionalInfo;
		additionalInfo = newAdditionalInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.PRACTICE__ADDITIONAL_INFO, oldAdditionalInfo, additionalInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(String newApplication) {
		String oldApplication = application;
		application = newApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.PRACTICE__APPLICATION, oldApplication, application));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(String newBackground) {
		String oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.PRACTICE__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getGoal() {
		if (goal == null) {
			goal = new EDataTypeUniqueEList<String>(String.class, this, UmaPackage.PRACTICE__GOAL);
		}
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLevelOfAdoption() {
		if (levelOfAdoption == null) {
			levelOfAdoption = new EDataTypeUniqueEList<String>(String.class, this, UmaPackage.PRACTICE__LEVEL_OF_ADOPTION);
		}
		return levelOfAdoption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProblem() {
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblem(String newProblem) {
		String oldProblem = problem;
		problem = newProblem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.PRACTICE__PROBLEM, oldProblem, problem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmaPackage.PRACTICE__SUB_PRACTICE:
				return ((InternalEList<?>)getSubPractice()).basicRemove(otherEnd, msgs);
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
			case UmaPackage.PRACTICE__SUB_PRACTICE:
				return getSubPractice();
			case UmaPackage.PRACTICE__REFERENCED_ACTIVITY:
				return getReferencedActivity();
			case UmaPackage.PRACTICE__CONTENT_REFERENCE:
				return getContentReference();
			case UmaPackage.PRACTICE__ADDITIONAL_INFO:
				return getAdditionalInfo();
			case UmaPackage.PRACTICE__APPLICATION:
				return getApplication();
			case UmaPackage.PRACTICE__BACKGROUND:
				return getBackground();
			case UmaPackage.PRACTICE__GOAL:
				return getGoal();
			case UmaPackage.PRACTICE__LEVEL_OF_ADOPTION:
				return getLevelOfAdoption();
			case UmaPackage.PRACTICE__PROBLEM:
				return getProblem();
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
			case UmaPackage.PRACTICE__SUB_PRACTICE:
				getSubPractice().clear();
				getSubPractice().addAll((Collection<? extends Practice>)newValue);
				return;
			case UmaPackage.PRACTICE__REFERENCED_ACTIVITY:
				getReferencedActivity().clear();
				getReferencedActivity().addAll((Collection<? extends Activity>)newValue);
				return;
			case UmaPackage.PRACTICE__CONTENT_REFERENCE:
				getContentReference().clear();
				getContentReference().addAll((Collection<? extends MethodContentElement>)newValue);
				return;
			case UmaPackage.PRACTICE__ADDITIONAL_INFO:
				setAdditionalInfo((String)newValue);
				return;
			case UmaPackage.PRACTICE__APPLICATION:
				setApplication((String)newValue);
				return;
			case UmaPackage.PRACTICE__BACKGROUND:
				setBackground((String)newValue);
				return;
			case UmaPackage.PRACTICE__GOAL:
				getGoal().clear();
				getGoal().addAll((Collection<? extends String>)newValue);
				return;
			case UmaPackage.PRACTICE__LEVEL_OF_ADOPTION:
				getLevelOfAdoption().clear();
				getLevelOfAdoption().addAll((Collection<? extends String>)newValue);
				return;
			case UmaPackage.PRACTICE__PROBLEM:
				setProblem((String)newValue);
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
			case UmaPackage.PRACTICE__SUB_PRACTICE:
				getSubPractice().clear();
				return;
			case UmaPackage.PRACTICE__REFERENCED_ACTIVITY:
				getReferencedActivity().clear();
				return;
			case UmaPackage.PRACTICE__CONTENT_REFERENCE:
				getContentReference().clear();
				return;
			case UmaPackage.PRACTICE__ADDITIONAL_INFO:
				setAdditionalInfo(ADDITIONAL_INFO_EDEFAULT);
				return;
			case UmaPackage.PRACTICE__APPLICATION:
				setApplication(APPLICATION_EDEFAULT);
				return;
			case UmaPackage.PRACTICE__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case UmaPackage.PRACTICE__GOAL:
				getGoal().clear();
				return;
			case UmaPackage.PRACTICE__LEVEL_OF_ADOPTION:
				getLevelOfAdoption().clear();
				return;
			case UmaPackage.PRACTICE__PROBLEM:
				setProblem(PROBLEM_EDEFAULT);
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
			case UmaPackage.PRACTICE__SUB_PRACTICE:
				return subPractice != null && !subPractice.isEmpty();
			case UmaPackage.PRACTICE__REFERENCED_ACTIVITY:
				return referencedActivity != null && !referencedActivity.isEmpty();
			case UmaPackage.PRACTICE__CONTENT_REFERENCE:
				return contentReference != null && !contentReference.isEmpty();
			case UmaPackage.PRACTICE__ADDITIONAL_INFO:
				return ADDITIONAL_INFO_EDEFAULT == null ? additionalInfo != null : !ADDITIONAL_INFO_EDEFAULT.equals(additionalInfo);
			case UmaPackage.PRACTICE__APPLICATION:
				return APPLICATION_EDEFAULT == null ? application != null : !APPLICATION_EDEFAULT.equals(application);
			case UmaPackage.PRACTICE__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
			case UmaPackage.PRACTICE__GOAL:
				return goal != null && !goal.isEmpty();
			case UmaPackage.PRACTICE__LEVEL_OF_ADOPTION:
				return levelOfAdoption != null && !levelOfAdoption.isEmpty();
			case UmaPackage.PRACTICE__PROBLEM:
				return PROBLEM_EDEFAULT == null ? problem != null : !PROBLEM_EDEFAULT.equals(problem);
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
		result.append(" (additionalInfo: ");
		result.append(additionalInfo);
		result.append(", application: ");
		result.append(application);
		result.append(", background: ");
		result.append(background);
		result.append(", goal: ");
		result.append(goal);
		result.append(", levelOfAdoption: ");
		result.append(levelOfAdoption);
		result.append(", problem: ");
		result.append(problem);
		result.append(')');
		return result.toString();
	}

} //PracticeImpl
