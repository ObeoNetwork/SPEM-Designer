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
import org.obeonetwork.dsl.spem.ExtensibleElement;
import org.obeonetwork.dsl.spem.Guidance;
import org.obeonetwork.dsl.spem.Kind;
import org.obeonetwork.dsl.spem.Metric;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.Step;
import org.obeonetwork.dsl.spem.VariabilityElement;
import org.obeonetwork.dsl.spem.VariabilityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.StepImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.StepImpl#getPresentationName <em>Presentation Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.StepImpl#getBriefDescription <em>Brief Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.StepImpl#getMainDescription <em>Main Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.StepImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.StepImpl#getGuidance <em>Guidance</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.StepImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.StepImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.StepImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.StepImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.StepImpl#getChangeDate <em>Change Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.StepImpl#getChangeDescription <em>Change Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.StepImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.StepImpl#getVariabilityType <em>Variability Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.StepImpl#getVariabilityBasedOnElement <em>Variability Based On Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.StepImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.StepImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.StepImpl#getSuccessor <em>Successor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StepImpl extends WorkDefinitionImpl implements Step {
	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected Kind kind;

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
	 * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessor()
	 * @generated
	 * @ordered
	 */
	protected Step predecessor;

	/**
	 * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessor()
	 * @generated
	 * @ordered
	 */
	protected Step successor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind getKind() {
		if (kind != null && kind.eIsProxy()) {
			InternalEObject oldKind = (InternalEObject)kind;
			kind = (Kind)eResolveProxy(oldKind);
			if (kind != oldKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.STEP__KIND, oldKind, kind));
			}
		}
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind basicGetKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(Kind newKind) {
		Kind oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.STEP__KIND, oldKind, kind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.STEP__PRESENTATION_NAME, oldPresentationName, presentationName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.STEP__BRIEF_DESCRIPTION, oldBriefDescription, briefDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.STEP__MAIN_DESCRIPTION, oldMainDescription, mainDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.STEP__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guidance> getGuidance() {
		if (guidance == null) {
			guidance = new EObjectResolvingEList<Guidance>(Guidance.class, this, SpemPackage.STEP__GUIDANCE);
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
			metric = new EObjectResolvingEList<Metric>(Metric.class, this, SpemPackage.STEP__METRIC);
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
			category = new EObjectWithInverseResolvingEList.ManyInverse<Category>(Category.class, this, SpemPackage.STEP__CATEGORY, SpemPackage.CATEGORY__CATEGORIZED_ELEMENT);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.STEP__COPYRIGHT, oldCopyright, copyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAuthor() {
		if (author == null) {
			author = new EDataTypeUniqueEList<String>(String.class, this, SpemPackage.STEP__AUTHOR);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.STEP__CHANGE_DATE, oldChangeDate, changeDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.STEP__CHANGE_DESCRIPTION, oldChangeDescription, changeDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.STEP__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.STEP__VARIABILITY_TYPE, oldVariabilityType, variabilityType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.STEP__VARIABILITY_BASED_ON_ELEMENT, oldVariabilityBasedOnElement, variabilityBasedOnElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.STEP__VARIABILITY_BASED_ON_ELEMENT, oldVariabilityBasedOnElement, variabilityBasedOnElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.STEP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getPredecessor() {
		if (predecessor != null && predecessor.eIsProxy()) {
			InternalEObject oldPredecessor = (InternalEObject)predecessor;
			predecessor = (Step)eResolveProxy(oldPredecessor);
			if (predecessor != oldPredecessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.STEP__PREDECESSOR, oldPredecessor, predecessor));
			}
		}
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetPredecessor() {
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredecessor(Step newPredecessor, NotificationChain msgs) {
		Step oldPredecessor = predecessor;
		predecessor = newPredecessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpemPackage.STEP__PREDECESSOR, oldPredecessor, newPredecessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredecessor(Step newPredecessor) {
		if (newPredecessor != predecessor) {
			NotificationChain msgs = null;
			if (predecessor != null)
				msgs = ((InternalEObject)predecessor).eInverseRemove(this, SpemPackage.STEP__SUCCESSOR, Step.class, msgs);
			if (newPredecessor != null)
				msgs = ((InternalEObject)newPredecessor).eInverseAdd(this, SpemPackage.STEP__SUCCESSOR, Step.class, msgs);
			msgs = basicSetPredecessor(newPredecessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.STEP__PREDECESSOR, newPredecessor, newPredecessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getSuccessor() {
		if (successor != null && successor.eIsProxy()) {
			InternalEObject oldSuccessor = (InternalEObject)successor;
			successor = (Step)eResolveProxy(oldSuccessor);
			if (successor != oldSuccessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.STEP__SUCCESSOR, oldSuccessor, successor));
			}
		}
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetSuccessor() {
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuccessor(Step newSuccessor, NotificationChain msgs) {
		Step oldSuccessor = successor;
		successor = newSuccessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpemPackage.STEP__SUCCESSOR, oldSuccessor, newSuccessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessor(Step newSuccessor) {
		if (newSuccessor != successor) {
			NotificationChain msgs = null;
			if (successor != null)
				msgs = ((InternalEObject)successor).eInverseRemove(this, SpemPackage.STEP__PREDECESSOR, Step.class, msgs);
			if (newSuccessor != null)
				msgs = ((InternalEObject)newSuccessor).eInverseAdd(this, SpemPackage.STEP__PREDECESSOR, Step.class, msgs);
			msgs = basicSetSuccessor(newSuccessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.STEP__SUCCESSOR, newSuccessor, newSuccessor));
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
			case SpemPackage.STEP__CATEGORY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategory()).basicAdd(otherEnd, msgs);
			case SpemPackage.STEP__PREDECESSOR:
				if (predecessor != null)
					msgs = ((InternalEObject)predecessor).eInverseRemove(this, SpemPackage.STEP__SUCCESSOR, Step.class, msgs);
				return basicSetPredecessor((Step)otherEnd, msgs);
			case SpemPackage.STEP__SUCCESSOR:
				if (successor != null)
					msgs = ((InternalEObject)successor).eInverseRemove(this, SpemPackage.STEP__PREDECESSOR, Step.class, msgs);
				return basicSetSuccessor((Step)otherEnd, msgs);
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
			case SpemPackage.STEP__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case SpemPackage.STEP__PREDECESSOR:
				return basicSetPredecessor(null, msgs);
			case SpemPackage.STEP__SUCCESSOR:
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
			case SpemPackage.STEP__KIND:
				if (resolve) return getKind();
				return basicGetKind();
			case SpemPackage.STEP__PRESENTATION_NAME:
				return getPresentationName();
			case SpemPackage.STEP__BRIEF_DESCRIPTION:
				return getBriefDescription();
			case SpemPackage.STEP__MAIN_DESCRIPTION:
				return getMainDescription();
			case SpemPackage.STEP__PURPOSE:
				return getPurpose();
			case SpemPackage.STEP__GUIDANCE:
				return getGuidance();
			case SpemPackage.STEP__METRIC:
				return getMetric();
			case SpemPackage.STEP__CATEGORY:
				return getCategory();
			case SpemPackage.STEP__COPYRIGHT:
				return getCopyright();
			case SpemPackage.STEP__AUTHOR:
				return getAuthor();
			case SpemPackage.STEP__CHANGE_DATE:
				return getChangeDate();
			case SpemPackage.STEP__CHANGE_DESCRIPTION:
				return getChangeDescription();
			case SpemPackage.STEP__VERSION:
				return getVersion();
			case SpemPackage.STEP__VARIABILITY_TYPE:
				return getVariabilityType();
			case SpemPackage.STEP__VARIABILITY_BASED_ON_ELEMENT:
				if (resolve) return getVariabilityBasedOnElement();
				return basicGetVariabilityBasedOnElement();
			case SpemPackage.STEP__NAME:
				return getName();
			case SpemPackage.STEP__PREDECESSOR:
				if (resolve) return getPredecessor();
				return basicGetPredecessor();
			case SpemPackage.STEP__SUCCESSOR:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpemPackage.STEP__KIND:
				setKind((Kind)newValue);
				return;
			case SpemPackage.STEP__PRESENTATION_NAME:
				setPresentationName((String)newValue);
				return;
			case SpemPackage.STEP__BRIEF_DESCRIPTION:
				setBriefDescription((String)newValue);
				return;
			case SpemPackage.STEP__MAIN_DESCRIPTION:
				setMainDescription((String)newValue);
				return;
			case SpemPackage.STEP__PURPOSE:
				setPurpose((String)newValue);
				return;
			case SpemPackage.STEP__GUIDANCE:
				getGuidance().clear();
				getGuidance().addAll((Collection<? extends Guidance>)newValue);
				return;
			case SpemPackage.STEP__METRIC:
				getMetric().clear();
				getMetric().addAll((Collection<? extends Metric>)newValue);
				return;
			case SpemPackage.STEP__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case SpemPackage.STEP__COPYRIGHT:
				setCopyright((String)newValue);
				return;
			case SpemPackage.STEP__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends String>)newValue);
				return;
			case SpemPackage.STEP__CHANGE_DATE:
				setChangeDate((Date)newValue);
				return;
			case SpemPackage.STEP__CHANGE_DESCRIPTION:
				setChangeDescription((String)newValue);
				return;
			case SpemPackage.STEP__VERSION:
				setVersion((String)newValue);
				return;
			case SpemPackage.STEP__VARIABILITY_TYPE:
				setVariabilityType((VariabilityType)newValue);
				return;
			case SpemPackage.STEP__VARIABILITY_BASED_ON_ELEMENT:
				setVariabilityBasedOnElement((VariabilityElement)newValue);
				return;
			case SpemPackage.STEP__NAME:
				setName((String)newValue);
				return;
			case SpemPackage.STEP__PREDECESSOR:
				setPredecessor((Step)newValue);
				return;
			case SpemPackage.STEP__SUCCESSOR:
				setSuccessor((Step)newValue);
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
			case SpemPackage.STEP__KIND:
				setKind((Kind)null);
				return;
			case SpemPackage.STEP__PRESENTATION_NAME:
				setPresentationName(PRESENTATION_NAME_EDEFAULT);
				return;
			case SpemPackage.STEP__BRIEF_DESCRIPTION:
				setBriefDescription(BRIEF_DESCRIPTION_EDEFAULT);
				return;
			case SpemPackage.STEP__MAIN_DESCRIPTION:
				setMainDescription(MAIN_DESCRIPTION_EDEFAULT);
				return;
			case SpemPackage.STEP__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case SpemPackage.STEP__GUIDANCE:
				getGuidance().clear();
				return;
			case SpemPackage.STEP__METRIC:
				getMetric().clear();
				return;
			case SpemPackage.STEP__CATEGORY:
				getCategory().clear();
				return;
			case SpemPackage.STEP__COPYRIGHT:
				setCopyright(COPYRIGHT_EDEFAULT);
				return;
			case SpemPackage.STEP__AUTHOR:
				getAuthor().clear();
				return;
			case SpemPackage.STEP__CHANGE_DATE:
				setChangeDate(CHANGE_DATE_EDEFAULT);
				return;
			case SpemPackage.STEP__CHANGE_DESCRIPTION:
				setChangeDescription(CHANGE_DESCRIPTION_EDEFAULT);
				return;
			case SpemPackage.STEP__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case SpemPackage.STEP__VARIABILITY_TYPE:
				setVariabilityType(VARIABILITY_TYPE_EDEFAULT);
				return;
			case SpemPackage.STEP__VARIABILITY_BASED_ON_ELEMENT:
				setVariabilityBasedOnElement((VariabilityElement)null);
				return;
			case SpemPackage.STEP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpemPackage.STEP__PREDECESSOR:
				setPredecessor((Step)null);
				return;
			case SpemPackage.STEP__SUCCESSOR:
				setSuccessor((Step)null);
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
			case SpemPackage.STEP__KIND:
				return kind != null;
			case SpemPackage.STEP__PRESENTATION_NAME:
				return PRESENTATION_NAME_EDEFAULT == null ? presentationName != null : !PRESENTATION_NAME_EDEFAULT.equals(presentationName);
			case SpemPackage.STEP__BRIEF_DESCRIPTION:
				return BRIEF_DESCRIPTION_EDEFAULT == null ? briefDescription != null : !BRIEF_DESCRIPTION_EDEFAULT.equals(briefDescription);
			case SpemPackage.STEP__MAIN_DESCRIPTION:
				return MAIN_DESCRIPTION_EDEFAULT == null ? mainDescription != null : !MAIN_DESCRIPTION_EDEFAULT.equals(mainDescription);
			case SpemPackage.STEP__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case SpemPackage.STEP__GUIDANCE:
				return guidance != null && !guidance.isEmpty();
			case SpemPackage.STEP__METRIC:
				return metric != null && !metric.isEmpty();
			case SpemPackage.STEP__CATEGORY:
				return category != null && !category.isEmpty();
			case SpemPackage.STEP__COPYRIGHT:
				return COPYRIGHT_EDEFAULT == null ? copyright != null : !COPYRIGHT_EDEFAULT.equals(copyright);
			case SpemPackage.STEP__AUTHOR:
				return author != null && !author.isEmpty();
			case SpemPackage.STEP__CHANGE_DATE:
				return CHANGE_DATE_EDEFAULT == null ? changeDate != null : !CHANGE_DATE_EDEFAULT.equals(changeDate);
			case SpemPackage.STEP__CHANGE_DESCRIPTION:
				return CHANGE_DESCRIPTION_EDEFAULT == null ? changeDescription != null : !CHANGE_DESCRIPTION_EDEFAULT.equals(changeDescription);
			case SpemPackage.STEP__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case SpemPackage.STEP__VARIABILITY_TYPE:
				return variabilityType != VARIABILITY_TYPE_EDEFAULT;
			case SpemPackage.STEP__VARIABILITY_BASED_ON_ELEMENT:
				return variabilityBasedOnElement != null;
			case SpemPackage.STEP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpemPackage.STEP__PREDECESSOR:
				return predecessor != null;
			case SpemPackage.STEP__SUCCESSOR:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ExtensibleElement.class) {
			switch (derivedFeatureID) {
				case SpemPackage.STEP__KIND: return SpemPackage.EXTENSIBLE_ELEMENT__KIND;
				default: return -1;
			}
		}
		if (baseClass == DescribableElement.class) {
			switch (derivedFeatureID) {
				case SpemPackage.STEP__PRESENTATION_NAME: return SpemPackage.DESCRIBABLE_ELEMENT__PRESENTATION_NAME;
				case SpemPackage.STEP__BRIEF_DESCRIPTION: return SpemPackage.DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION;
				case SpemPackage.STEP__MAIN_DESCRIPTION: return SpemPackage.DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION;
				case SpemPackage.STEP__PURPOSE: return SpemPackage.DESCRIBABLE_ELEMENT__PURPOSE;
				case SpemPackage.STEP__GUIDANCE: return SpemPackage.DESCRIBABLE_ELEMENT__GUIDANCE;
				case SpemPackage.STEP__METRIC: return SpemPackage.DESCRIBABLE_ELEMENT__METRIC;
				case SpemPackage.STEP__CATEGORY: return SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY;
				case SpemPackage.STEP__COPYRIGHT: return SpemPackage.DESCRIBABLE_ELEMENT__COPYRIGHT;
				case SpemPackage.STEP__AUTHOR: return SpemPackage.DESCRIBABLE_ELEMENT__AUTHOR;
				case SpemPackage.STEP__CHANGE_DATE: return SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DATE;
				case SpemPackage.STEP__CHANGE_DESCRIPTION: return SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DESCRIPTION;
				case SpemPackage.STEP__VERSION: return SpemPackage.DESCRIBABLE_ELEMENT__VERSION;
				default: return -1;
			}
		}
		if (baseClass == VariabilityElement.class) {
			switch (derivedFeatureID) {
				case SpemPackage.STEP__VARIABILITY_TYPE: return SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_TYPE;
				case SpemPackage.STEP__VARIABILITY_BASED_ON_ELEMENT: return SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT;
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
		if (baseClass == ExtensibleElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.EXTENSIBLE_ELEMENT__KIND: return SpemPackage.STEP__KIND;
				default: return -1;
			}
		}
		if (baseClass == DescribableElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.DESCRIBABLE_ELEMENT__PRESENTATION_NAME: return SpemPackage.STEP__PRESENTATION_NAME;
				case SpemPackage.DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION: return SpemPackage.STEP__BRIEF_DESCRIPTION;
				case SpemPackage.DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION: return SpemPackage.STEP__MAIN_DESCRIPTION;
				case SpemPackage.DESCRIBABLE_ELEMENT__PURPOSE: return SpemPackage.STEP__PURPOSE;
				case SpemPackage.DESCRIBABLE_ELEMENT__GUIDANCE: return SpemPackage.STEP__GUIDANCE;
				case SpemPackage.DESCRIBABLE_ELEMENT__METRIC: return SpemPackage.STEP__METRIC;
				case SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY: return SpemPackage.STEP__CATEGORY;
				case SpemPackage.DESCRIBABLE_ELEMENT__COPYRIGHT: return SpemPackage.STEP__COPYRIGHT;
				case SpemPackage.DESCRIBABLE_ELEMENT__AUTHOR: return SpemPackage.STEP__AUTHOR;
				case SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DATE: return SpemPackage.STEP__CHANGE_DATE;
				case SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DESCRIPTION: return SpemPackage.STEP__CHANGE_DESCRIPTION;
				case SpemPackage.DESCRIBABLE_ELEMENT__VERSION: return SpemPackage.STEP__VERSION;
				default: return -1;
			}
		}
		if (baseClass == VariabilityElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_TYPE: return SpemPackage.STEP__VARIABILITY_TYPE;
				case SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT: return SpemPackage.STEP__VARIABILITY_BASED_ON_ELEMENT;
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
		result.append(", variabilityType: ");
		result.append(variabilityType);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StepImpl
