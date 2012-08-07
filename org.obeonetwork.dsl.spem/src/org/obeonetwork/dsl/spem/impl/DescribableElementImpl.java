/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.spem.Category;
import org.obeonetwork.dsl.spem.DescribableElement;
import org.obeonetwork.dsl.spem.Guidance;
import org.obeonetwork.dsl.spem.Metric;
import org.obeonetwork.dsl.spem.SpemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Describable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.DescribableElementImpl#getPresentationName <em>Presentation Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.DescribableElementImpl#getBriefDescription <em>Brief Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.DescribableElementImpl#getMainDescription <em>Main Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.DescribableElementImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.DescribableElementImpl#getGuidance <em>Guidance</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.DescribableElementImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.DescribableElementImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.DescribableElementImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.DescribableElementImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.DescribableElementImpl#getChangeDate <em>Change Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.DescribableElementImpl#getChangeDescription <em>Change Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.DescribableElementImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DescribableElementImpl extends ExtensibleElementImpl implements DescribableElement {
	/**
	 * The default value of the '{@link #getPresentationName() <em>Presentation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRESENTATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPresentationName() <em>Presentation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationName()
	 * @generated
	 * @ordered
	 */
	protected String presentationName = PRESENTATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBriefDescription() <em>Brief Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBriefDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String BRIEF_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBriefDescription() <em>Brief Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBriefDescription()
	 * @generated
	 * @ordered
	 */
	protected String briefDescription = BRIEF_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMainDescription() <em>Main Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIN_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMainDescription() <em>Main Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainDescription()
	 * @generated
	 * @ordered
	 */
	protected String mainDescription = MAIN_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGuidance() <em>Guidance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuidance()
	 * @generated
	 * @ordered
	 */
	protected EList<Guidance> guidance;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected EList<Metric> metric;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> category;

	/**
	 * The default value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected static final String COPYRIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected String copyright = COPYRIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<String> author;

	/**
	 * The default value of the '{@link #getChangeDate() <em>Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CHANGE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeDate() <em>Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeDate()
	 * @generated
	 * @ordered
	 */
	protected Date changeDate = CHANGE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeDescription() <em>Change Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeDescription() <em>Change Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeDescription()
	 * @generated
	 * @ordered
	 */
	protected String changeDescription = CHANGE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescribableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.DESCRIBABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPresentationName() {
		return presentationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentationName(String newPresentationName) {
		String oldPresentationName = presentationName;
		presentationName = newPresentationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.DESCRIBABLE_ELEMENT__PRESENTATION_NAME, oldPresentationName, presentationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBriefDescription() {
		return briefDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBriefDescription(String newBriefDescription) {
		String oldBriefDescription = briefDescription;
		briefDescription = newBriefDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION, oldBriefDescription, briefDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMainDescription() {
		return mainDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainDescription(String newMainDescription) {
		String oldMainDescription = mainDescription;
		mainDescription = newMainDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION, oldMainDescription, mainDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.DESCRIBABLE_ELEMENT__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guidance> getGuidance() {
		if (guidance == null) {
			guidance = new EObjectResolvingEList<Guidance>(Guidance.class, this, SpemPackage.DESCRIBABLE_ELEMENT__GUIDANCE);
		}
		return guidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metric> getMetric() {
		if (metric == null) {
			metric = new EObjectResolvingEList<Metric>(Metric.class, this, SpemPackage.DESCRIBABLE_ELEMENT__METRIC);
		}
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategory() {
		if (category == null) {
			category = new EObjectWithInverseResolvingEList.ManyInverse<Category>(Category.class, this, SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY, SpemPackage.CATEGORY__CATEGORIZED_ELEMENT);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(String newCopyright) {
		String oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.DESCRIBABLE_ELEMENT__COPYRIGHT, oldCopyright, copyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAuthor() {
		if (author == null) {
			author = new EDataTypeUniqueEList<String>(String.class, this, SpemPackage.DESCRIBABLE_ELEMENT__AUTHOR);
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getChangeDate() {
		return changeDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeDate(Date newChangeDate) {
		Date oldChangeDate = changeDate;
		changeDate = newChangeDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DATE, oldChangeDate, changeDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChangeDescription() {
		return changeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeDescription(String newChangeDescription) {
		String oldChangeDescription = changeDescription;
		changeDescription = newChangeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DESCRIPTION, oldChangeDescription, changeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.DESCRIBABLE_ELEMENT__VERSION, oldVersion, version));
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
			case SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategory()).basicAdd(otherEnd, msgs);
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
			case SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
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
			case SpemPackage.DESCRIBABLE_ELEMENT__PRESENTATION_NAME:
				return getPresentationName();
			case SpemPackage.DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION:
				return getBriefDescription();
			case SpemPackage.DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION:
				return getMainDescription();
			case SpemPackage.DESCRIBABLE_ELEMENT__PURPOSE:
				return getPurpose();
			case SpemPackage.DESCRIBABLE_ELEMENT__GUIDANCE:
				return getGuidance();
			case SpemPackage.DESCRIBABLE_ELEMENT__METRIC:
				return getMetric();
			case SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY:
				return getCategory();
			case SpemPackage.DESCRIBABLE_ELEMENT__COPYRIGHT:
				return getCopyright();
			case SpemPackage.DESCRIBABLE_ELEMENT__AUTHOR:
				return getAuthor();
			case SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DATE:
				return getChangeDate();
			case SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DESCRIPTION:
				return getChangeDescription();
			case SpemPackage.DESCRIBABLE_ELEMENT__VERSION:
				return getVersion();
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
			case SpemPackage.DESCRIBABLE_ELEMENT__PRESENTATION_NAME:
				setPresentationName((String)newValue);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION:
				setBriefDescription((String)newValue);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION:
				setMainDescription((String)newValue);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__PURPOSE:
				setPurpose((String)newValue);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__GUIDANCE:
				getGuidance().clear();
				getGuidance().addAll((Collection<? extends Guidance>)newValue);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__METRIC:
				getMetric().clear();
				getMetric().addAll((Collection<? extends Metric>)newValue);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__COPYRIGHT:
				setCopyright((String)newValue);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends String>)newValue);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DATE:
				setChangeDate((Date)newValue);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DESCRIPTION:
				setChangeDescription((String)newValue);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__VERSION:
				setVersion((String)newValue);
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
			case SpemPackage.DESCRIBABLE_ELEMENT__PRESENTATION_NAME:
				setPresentationName(PRESENTATION_NAME_EDEFAULT);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION:
				setBriefDescription(BRIEF_DESCRIPTION_EDEFAULT);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION:
				setMainDescription(MAIN_DESCRIPTION_EDEFAULT);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__GUIDANCE:
				getGuidance().clear();
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__METRIC:
				getMetric().clear();
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY:
				getCategory().clear();
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__COPYRIGHT:
				setCopyright(COPYRIGHT_EDEFAULT);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__AUTHOR:
				getAuthor().clear();
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DATE:
				setChangeDate(CHANGE_DATE_EDEFAULT);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DESCRIPTION:
				setChangeDescription(CHANGE_DESCRIPTION_EDEFAULT);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case SpemPackage.DESCRIBABLE_ELEMENT__PRESENTATION_NAME:
				return PRESENTATION_NAME_EDEFAULT == null ? presentationName != null : !PRESENTATION_NAME_EDEFAULT.equals(presentationName);
			case SpemPackage.DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION:
				return BRIEF_DESCRIPTION_EDEFAULT == null ? briefDescription != null : !BRIEF_DESCRIPTION_EDEFAULT.equals(briefDescription);
			case SpemPackage.DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION:
				return MAIN_DESCRIPTION_EDEFAULT == null ? mainDescription != null : !MAIN_DESCRIPTION_EDEFAULT.equals(mainDescription);
			case SpemPackage.DESCRIBABLE_ELEMENT__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case SpemPackage.DESCRIBABLE_ELEMENT__GUIDANCE:
				return guidance != null && !guidance.isEmpty();
			case SpemPackage.DESCRIBABLE_ELEMENT__METRIC:
				return metric != null && !metric.isEmpty();
			case SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY:
				return category != null && !category.isEmpty();
			case SpemPackage.DESCRIBABLE_ELEMENT__COPYRIGHT:
				return COPYRIGHT_EDEFAULT == null ? copyright != null : !COPYRIGHT_EDEFAULT.equals(copyright);
			case SpemPackage.DESCRIBABLE_ELEMENT__AUTHOR:
				return author != null && !author.isEmpty();
			case SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DATE:
				return CHANGE_DATE_EDEFAULT == null ? changeDate != null : !CHANGE_DATE_EDEFAULT.equals(changeDate);
			case SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DESCRIPTION:
				return CHANGE_DESCRIPTION_EDEFAULT == null ? changeDescription != null : !CHANGE_DESCRIPTION_EDEFAULT.equals(changeDescription);
			case SpemPackage.DESCRIBABLE_ELEMENT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (presentationName: ");
		result.append(presentationName);
		result.append(", briefDescription: ");
		result.append(briefDescription);
		result.append(", mainDescription: ");
		result.append(mainDescription);
		result.append(", purpose: ");
		result.append(purpose);
		result.append(", copyright: ");
		result.append(copyright);
		result.append(", author: ");
		result.append(author);
		result.append(", changeDate: ");
		result.append(changeDate);
		result.append(", changeDescription: ");
		result.append(changeDescription);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //DescribableElementImpl
