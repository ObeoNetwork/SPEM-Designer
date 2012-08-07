/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma.impl;

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
import org.obeonetwork.dsl.spem.MethodContentElement;
import org.obeonetwork.dsl.spem.MethodContentKind;
import org.obeonetwork.dsl.spem.MethodContentPackageableElement;
import org.obeonetwork.dsl.spem.Metric;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.VariabilityElement;
import org.obeonetwork.dsl.spem.VariabilityType;
import org.obeonetwork.dsl.spem.impl.KindImpl;

import org.obeonetwork.dsl.spem.uma.UmaPackage;
import org.obeonetwork.dsl.spem.uma.WorkProductKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Product Kind</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.WorkProductKindImpl#getPresentationName <em>Presentation Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.WorkProductKindImpl#getBriefDescription <em>Brief Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.WorkProductKindImpl#getMainDescription <em>Main Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.WorkProductKindImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.WorkProductKindImpl#getGuidance <em>Guidance</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.WorkProductKindImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.WorkProductKindImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.WorkProductKindImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.WorkProductKindImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.WorkProductKindImpl#getChangeDate <em>Change Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.WorkProductKindImpl#getChangeDescription <em>Change Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.WorkProductKindImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.WorkProductKindImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.WorkProductKindImpl#getVariabilityType <em>Variability Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.WorkProductKindImpl#getVariabilityBasedOnElement <em>Variability Based On Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.WorkProductKindImpl#getMethodContentKind <em>Method Content Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkProductKindImpl extends KindImpl implements WorkProductKind {
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
	 * The default value of the '{@link #getVariabilityType() <em>Variability Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariabilityType()
	 * @generated
	 * @ordered
	 */
	protected static final VariabilityType VARIABILITY_TYPE_EDEFAULT = VariabilityType.NA;
	/**
	 * The cached value of the '{@link #getVariabilityType() <em>Variability Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariabilityType()
	 * @generated
	 * @ordered
	 */
	protected VariabilityType variabilityType = VARIABILITY_TYPE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getVariabilityBasedOnElement() <em>Variability Based On Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariabilityBasedOnElement()
	 * @generated
	 * @ordered
	 */
	protected VariabilityElement variabilityBasedOnElement;
	/**
	 * The cached value of the '{@link #getMethodContentKind() <em>Method Content Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodContentKind()
	 * @generated
	 * @ordered
	 */
	protected MethodContentKind methodContentKind;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkProductKindImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.Literals.WORK_PRODUCT_KIND;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.WORK_PRODUCT_KIND__PRESENTATION_NAME, oldPresentationName, presentationName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.WORK_PRODUCT_KIND__BRIEF_DESCRIPTION, oldBriefDescription, briefDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.WORK_PRODUCT_KIND__MAIN_DESCRIPTION, oldMainDescription, mainDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.WORK_PRODUCT_KIND__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guidance> getGuidance() {
		if (guidance == null) {
			guidance = new EObjectResolvingEList<Guidance>(Guidance.class, this, UmaPackage.WORK_PRODUCT_KIND__GUIDANCE);
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
			metric = new EObjectResolvingEList<Metric>(Metric.class, this, UmaPackage.WORK_PRODUCT_KIND__METRIC);
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
			category = new EObjectWithInverseResolvingEList.ManyInverse<Category>(Category.class, this, UmaPackage.WORK_PRODUCT_KIND__CATEGORY, SpemPackage.CATEGORY__CATEGORIZED_ELEMENT);
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.WORK_PRODUCT_KIND__COPYRIGHT, oldCopyright, copyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAuthor() {
		if (author == null) {
			author = new EDataTypeUniqueEList<String>(String.class, this, UmaPackage.WORK_PRODUCT_KIND__AUTHOR);
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.WORK_PRODUCT_KIND__CHANGE_DATE, oldChangeDate, changeDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.WORK_PRODUCT_KIND__CHANGE_DESCRIPTION, oldChangeDescription, changeDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.WORK_PRODUCT_KIND__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.WORK_PRODUCT_KIND__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityType getVariabilityType() {
		return variabilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariabilityType(VariabilityType newVariabilityType) {
		VariabilityType oldVariabilityType = variabilityType;
		variabilityType = newVariabilityType == null ? VARIABILITY_TYPE_EDEFAULT : newVariabilityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.WORK_PRODUCT_KIND__VARIABILITY_TYPE, oldVariabilityType, variabilityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityElement getVariabilityBasedOnElement() {
		if (variabilityBasedOnElement != null && variabilityBasedOnElement.eIsProxy()) {
			InternalEObject oldVariabilityBasedOnElement = (InternalEObject)variabilityBasedOnElement;
			variabilityBasedOnElement = (VariabilityElement)eResolveProxy(oldVariabilityBasedOnElement);
			if (variabilityBasedOnElement != oldVariabilityBasedOnElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmaPackage.WORK_PRODUCT_KIND__VARIABILITY_BASED_ON_ELEMENT, oldVariabilityBasedOnElement, variabilityBasedOnElement));
			}
		}
		return variabilityBasedOnElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityElement basicGetVariabilityBasedOnElement() {
		return variabilityBasedOnElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariabilityBasedOnElement(VariabilityElement newVariabilityBasedOnElement) {
		VariabilityElement oldVariabilityBasedOnElement = variabilityBasedOnElement;
		variabilityBasedOnElement = newVariabilityBasedOnElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.WORK_PRODUCT_KIND__VARIABILITY_BASED_ON_ELEMENT, oldVariabilityBasedOnElement, variabilityBasedOnElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodContentKind getMethodContentKind() {
		if (methodContentKind != null && methodContentKind.eIsProxy()) {
			InternalEObject oldMethodContentKind = (InternalEObject)methodContentKind;
			methodContentKind = (MethodContentKind)eResolveProxy(oldMethodContentKind);
			if (methodContentKind != oldMethodContentKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmaPackage.WORK_PRODUCT_KIND__METHOD_CONTENT_KIND, oldMethodContentKind, methodContentKind));
			}
		}
		return methodContentKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodContentKind basicGetMethodContentKind() {
		return methodContentKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodContentKind(MethodContentKind newMethodContentKind) {
		MethodContentKind oldMethodContentKind = methodContentKind;
		methodContentKind = newMethodContentKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.WORK_PRODUCT_KIND__METHOD_CONTENT_KIND, oldMethodContentKind, methodContentKind));
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
			case UmaPackage.WORK_PRODUCT_KIND__CATEGORY:
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
			case UmaPackage.WORK_PRODUCT_KIND__CATEGORY:
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
			case UmaPackage.WORK_PRODUCT_KIND__PRESENTATION_NAME:
				return getPresentationName();
			case UmaPackage.WORK_PRODUCT_KIND__BRIEF_DESCRIPTION:
				return getBriefDescription();
			case UmaPackage.WORK_PRODUCT_KIND__MAIN_DESCRIPTION:
				return getMainDescription();
			case UmaPackage.WORK_PRODUCT_KIND__PURPOSE:
				return getPurpose();
			case UmaPackage.WORK_PRODUCT_KIND__GUIDANCE:
				return getGuidance();
			case UmaPackage.WORK_PRODUCT_KIND__METRIC:
				return getMetric();
			case UmaPackage.WORK_PRODUCT_KIND__CATEGORY:
				return getCategory();
			case UmaPackage.WORK_PRODUCT_KIND__COPYRIGHT:
				return getCopyright();
			case UmaPackage.WORK_PRODUCT_KIND__AUTHOR:
				return getAuthor();
			case UmaPackage.WORK_PRODUCT_KIND__CHANGE_DATE:
				return getChangeDate();
			case UmaPackage.WORK_PRODUCT_KIND__CHANGE_DESCRIPTION:
				return getChangeDescription();
			case UmaPackage.WORK_PRODUCT_KIND__VERSION:
				return getVersion();
			case UmaPackage.WORK_PRODUCT_KIND__NAME:
				return getName();
			case UmaPackage.WORK_PRODUCT_KIND__VARIABILITY_TYPE:
				return getVariabilityType();
			case UmaPackage.WORK_PRODUCT_KIND__VARIABILITY_BASED_ON_ELEMENT:
				if (resolve) return getVariabilityBasedOnElement();
				return basicGetVariabilityBasedOnElement();
			case UmaPackage.WORK_PRODUCT_KIND__METHOD_CONTENT_KIND:
				if (resolve) return getMethodContentKind();
				return basicGetMethodContentKind();
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
			case UmaPackage.WORK_PRODUCT_KIND__PRESENTATION_NAME:
				setPresentationName((String)newValue);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__BRIEF_DESCRIPTION:
				setBriefDescription((String)newValue);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__MAIN_DESCRIPTION:
				setMainDescription((String)newValue);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__PURPOSE:
				setPurpose((String)newValue);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__GUIDANCE:
				getGuidance().clear();
				getGuidance().addAll((Collection<? extends Guidance>)newValue);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__METRIC:
				getMetric().clear();
				getMetric().addAll((Collection<? extends Metric>)newValue);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__COPYRIGHT:
				setCopyright((String)newValue);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends String>)newValue);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__CHANGE_DATE:
				setChangeDate((Date)newValue);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__CHANGE_DESCRIPTION:
				setChangeDescription((String)newValue);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__VERSION:
				setVersion((String)newValue);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__NAME:
				setName((String)newValue);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__VARIABILITY_TYPE:
				setVariabilityType((VariabilityType)newValue);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__VARIABILITY_BASED_ON_ELEMENT:
				setVariabilityBasedOnElement((VariabilityElement)newValue);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__METHOD_CONTENT_KIND:
				setMethodContentKind((MethodContentKind)newValue);
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
			case UmaPackage.WORK_PRODUCT_KIND__PRESENTATION_NAME:
				setPresentationName(PRESENTATION_NAME_EDEFAULT);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__BRIEF_DESCRIPTION:
				setBriefDescription(BRIEF_DESCRIPTION_EDEFAULT);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__MAIN_DESCRIPTION:
				setMainDescription(MAIN_DESCRIPTION_EDEFAULT);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__GUIDANCE:
				getGuidance().clear();
				return;
			case UmaPackage.WORK_PRODUCT_KIND__METRIC:
				getMetric().clear();
				return;
			case UmaPackage.WORK_PRODUCT_KIND__CATEGORY:
				getCategory().clear();
				return;
			case UmaPackage.WORK_PRODUCT_KIND__COPYRIGHT:
				setCopyright(COPYRIGHT_EDEFAULT);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__AUTHOR:
				getAuthor().clear();
				return;
			case UmaPackage.WORK_PRODUCT_KIND__CHANGE_DATE:
				setChangeDate(CHANGE_DATE_EDEFAULT);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__CHANGE_DESCRIPTION:
				setChangeDescription(CHANGE_DESCRIPTION_EDEFAULT);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__VARIABILITY_TYPE:
				setVariabilityType(VARIABILITY_TYPE_EDEFAULT);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__VARIABILITY_BASED_ON_ELEMENT:
				setVariabilityBasedOnElement((VariabilityElement)null);
				return;
			case UmaPackage.WORK_PRODUCT_KIND__METHOD_CONTENT_KIND:
				setMethodContentKind((MethodContentKind)null);
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
			case UmaPackage.WORK_PRODUCT_KIND__PRESENTATION_NAME:
				return PRESENTATION_NAME_EDEFAULT == null ? presentationName != null : !PRESENTATION_NAME_EDEFAULT.equals(presentationName);
			case UmaPackage.WORK_PRODUCT_KIND__BRIEF_DESCRIPTION:
				return BRIEF_DESCRIPTION_EDEFAULT == null ? briefDescription != null : !BRIEF_DESCRIPTION_EDEFAULT.equals(briefDescription);
			case UmaPackage.WORK_PRODUCT_KIND__MAIN_DESCRIPTION:
				return MAIN_DESCRIPTION_EDEFAULT == null ? mainDescription != null : !MAIN_DESCRIPTION_EDEFAULT.equals(mainDescription);
			case UmaPackage.WORK_PRODUCT_KIND__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case UmaPackage.WORK_PRODUCT_KIND__GUIDANCE:
				return guidance != null && !guidance.isEmpty();
			case UmaPackage.WORK_PRODUCT_KIND__METRIC:
				return metric != null && !metric.isEmpty();
			case UmaPackage.WORK_PRODUCT_KIND__CATEGORY:
				return category != null && !category.isEmpty();
			case UmaPackage.WORK_PRODUCT_KIND__COPYRIGHT:
				return COPYRIGHT_EDEFAULT == null ? copyright != null : !COPYRIGHT_EDEFAULT.equals(copyright);
			case UmaPackage.WORK_PRODUCT_KIND__AUTHOR:
				return author != null && !author.isEmpty();
			case UmaPackage.WORK_PRODUCT_KIND__CHANGE_DATE:
				return CHANGE_DATE_EDEFAULT == null ? changeDate != null : !CHANGE_DATE_EDEFAULT.equals(changeDate);
			case UmaPackage.WORK_PRODUCT_KIND__CHANGE_DESCRIPTION:
				return CHANGE_DESCRIPTION_EDEFAULT == null ? changeDescription != null : !CHANGE_DESCRIPTION_EDEFAULT.equals(changeDescription);
			case UmaPackage.WORK_PRODUCT_KIND__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case UmaPackage.WORK_PRODUCT_KIND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UmaPackage.WORK_PRODUCT_KIND__VARIABILITY_TYPE:
				return variabilityType != VARIABILITY_TYPE_EDEFAULT;
			case UmaPackage.WORK_PRODUCT_KIND__VARIABILITY_BASED_ON_ELEMENT:
				return variabilityBasedOnElement != null;
			case UmaPackage.WORK_PRODUCT_KIND__METHOD_CONTENT_KIND:
				return methodContentKind != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DescribableElement.class) {
			switch (derivedFeatureID) {
				case UmaPackage.WORK_PRODUCT_KIND__PRESENTATION_NAME: return SpemPackage.DESCRIBABLE_ELEMENT__PRESENTATION_NAME;
				case UmaPackage.WORK_PRODUCT_KIND__BRIEF_DESCRIPTION: return SpemPackage.DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION;
				case UmaPackage.WORK_PRODUCT_KIND__MAIN_DESCRIPTION: return SpemPackage.DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION;
				case UmaPackage.WORK_PRODUCT_KIND__PURPOSE: return SpemPackage.DESCRIBABLE_ELEMENT__PURPOSE;
				case UmaPackage.WORK_PRODUCT_KIND__GUIDANCE: return SpemPackage.DESCRIBABLE_ELEMENT__GUIDANCE;
				case UmaPackage.WORK_PRODUCT_KIND__METRIC: return SpemPackage.DESCRIBABLE_ELEMENT__METRIC;
				case UmaPackage.WORK_PRODUCT_KIND__CATEGORY: return SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY;
				case UmaPackage.WORK_PRODUCT_KIND__COPYRIGHT: return SpemPackage.DESCRIBABLE_ELEMENT__COPYRIGHT;
				case UmaPackage.WORK_PRODUCT_KIND__AUTHOR: return SpemPackage.DESCRIBABLE_ELEMENT__AUTHOR;
				case UmaPackage.WORK_PRODUCT_KIND__CHANGE_DATE: return SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DATE;
				case UmaPackage.WORK_PRODUCT_KIND__CHANGE_DESCRIPTION: return SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DESCRIPTION;
				case UmaPackage.WORK_PRODUCT_KIND__VERSION: return SpemPackage.DESCRIBABLE_ELEMENT__VERSION;
				default: return -1;
			}
		}
		if (baseClass == MethodContentPackageableElement.class) {
			switch (derivedFeatureID) {
				case UmaPackage.WORK_PRODUCT_KIND__NAME: return SpemPackage.METHOD_CONTENT_PACKAGEABLE_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == VariabilityElement.class) {
			switch (derivedFeatureID) {
				case UmaPackage.WORK_PRODUCT_KIND__VARIABILITY_TYPE: return SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_TYPE;
				case UmaPackage.WORK_PRODUCT_KIND__VARIABILITY_BASED_ON_ELEMENT: return SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == MethodContentElement.class) {
			switch (derivedFeatureID) {
				case UmaPackage.WORK_PRODUCT_KIND__METHOD_CONTENT_KIND: return SpemPackage.METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DescribableElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.DESCRIBABLE_ELEMENT__PRESENTATION_NAME: return UmaPackage.WORK_PRODUCT_KIND__PRESENTATION_NAME;
				case SpemPackage.DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION: return UmaPackage.WORK_PRODUCT_KIND__BRIEF_DESCRIPTION;
				case SpemPackage.DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION: return UmaPackage.WORK_PRODUCT_KIND__MAIN_DESCRIPTION;
				case SpemPackage.DESCRIBABLE_ELEMENT__PURPOSE: return UmaPackage.WORK_PRODUCT_KIND__PURPOSE;
				case SpemPackage.DESCRIBABLE_ELEMENT__GUIDANCE: return UmaPackage.WORK_PRODUCT_KIND__GUIDANCE;
				case SpemPackage.DESCRIBABLE_ELEMENT__METRIC: return UmaPackage.WORK_PRODUCT_KIND__METRIC;
				case SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY: return UmaPackage.WORK_PRODUCT_KIND__CATEGORY;
				case SpemPackage.DESCRIBABLE_ELEMENT__COPYRIGHT: return UmaPackage.WORK_PRODUCT_KIND__COPYRIGHT;
				case SpemPackage.DESCRIBABLE_ELEMENT__AUTHOR: return UmaPackage.WORK_PRODUCT_KIND__AUTHOR;
				case SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DATE: return UmaPackage.WORK_PRODUCT_KIND__CHANGE_DATE;
				case SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DESCRIPTION: return UmaPackage.WORK_PRODUCT_KIND__CHANGE_DESCRIPTION;
				case SpemPackage.DESCRIBABLE_ELEMENT__VERSION: return UmaPackage.WORK_PRODUCT_KIND__VERSION;
				default: return -1;
			}
		}
		if (baseClass == MethodContentPackageableElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.METHOD_CONTENT_PACKAGEABLE_ELEMENT__NAME: return UmaPackage.WORK_PRODUCT_KIND__NAME;
				default: return -1;
			}
		}
		if (baseClass == VariabilityElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_TYPE: return UmaPackage.WORK_PRODUCT_KIND__VARIABILITY_TYPE;
				case SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT: return UmaPackage.WORK_PRODUCT_KIND__VARIABILITY_BASED_ON_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == MethodContentElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND: return UmaPackage.WORK_PRODUCT_KIND__METHOD_CONTENT_KIND;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", name: ");
		result.append(name);
		result.append(", variabilityType: ");
		result.append(variabilityType);
		result.append(')');
		return result.toString();
	}

} //WorkProductKindImpl
