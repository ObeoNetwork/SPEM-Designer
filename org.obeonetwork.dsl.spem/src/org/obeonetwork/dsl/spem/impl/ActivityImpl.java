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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.spem.Activity;
import org.obeonetwork.dsl.spem.ActivityUseKind;
import org.obeonetwork.dsl.spem.BreakdownElement;
import org.obeonetwork.dsl.spem.Category;
import org.obeonetwork.dsl.spem.DescribableElement;
import org.obeonetwork.dsl.spem.ExtensibleElement;
import org.obeonetwork.dsl.spem.Guidance;
import org.obeonetwork.dsl.spem.Kind;
import org.obeonetwork.dsl.spem.MethodConfiguration;
import org.obeonetwork.dsl.spem.Metric;
import org.obeonetwork.dsl.spem.PlanningData;
import org.obeonetwork.dsl.spem.ProcessElement;
import org.obeonetwork.dsl.spem.ProcessKind;
import org.obeonetwork.dsl.spem.ProcessPackageableElement;
import org.obeonetwork.dsl.spem.ProcessParameter;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.VariabilityElement;
import org.obeonetwork.dsl.spem.VariabilityType;
import org.obeonetwork.dsl.spem.WorkBreakdownElement;
import org.obeonetwork.dsl.spem.WorkSequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getPresentationName <em>Presentation Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getBriefDescription <em>Brief Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getMainDescription <em>Main Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getGuidance <em>Guidance</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getChangeDate <em>Change Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getChangeDescription <em>Change Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getProcessKind <em>Process Kind</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#isHasMultipleOccurrences <em>Has Multiple Occurrences</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#isIsPlanned <em>Is Planned</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getPlanningData <em>Planning Data</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#isIsRepeatable <em>Is Repeatable</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#isIsOngoing <em>Is Ongoing</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#isIsEventDriven <em>Is Event Driven</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getLinkToPredecessor <em>Link To Predecessor</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getLinkToSuccessor <em>Link To Successor</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getVariabilityType <em>Variability Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getVariabilityBasedOnElement <em>Variability Based On Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getUseKind <em>Use Kind</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getUsedActivity <em>Used Activity</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getNestedBreakdownElement <em>Nested Breakdown Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getSuppressedBreakdownElement <em>Suppressed Breakdown Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getOwnedProcessParameter <em>Owned Process Parameter</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getDefaultContext <em>Default Context</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#getValidContext <em>Valid Context</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.ActivityImpl#isIsEnactable <em>Is Enactable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends WorkDefinitionImpl implements Activity {
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
	 * The cached value of the '{@link #getProcessKind() <em>Process Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessKind()
	 * @generated
	 * @ordered
	 */
	protected ProcessKind processKind;

	/**
	 * The default value of the '{@link #isHasMultipleOccurrences() <em>Has Multiple Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasMultipleOccurrences()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_MULTIPLE_OCCURRENCES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasMultipleOccurrences() <em>Has Multiple Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasMultipleOccurrences()
	 * @generated
	 * @ordered
	 */
	protected boolean hasMultipleOccurrences = HAS_MULTIPLE_OCCURRENCES_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean isOptional = IS_OPTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPlanned() <em>Is Planned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPlanned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PLANNED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPlanned() <em>Is Planned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPlanned()
	 * @generated
	 * @ordered
	 */
	protected boolean isPlanned = IS_PLANNED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlanningData() <em>Planning Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanningData()
	 * @generated
	 * @ordered
	 */
	protected PlanningData planningData;

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
	 * The default value of the '{@link #getUseKind() <em>Use Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseKind()
	 * @generated
	 * @ordered
	 */
	protected static final ActivityUseKind USE_KIND_EDEFAULT = ActivityUseKind.NA;

	/**
	 * The cached value of the '{@link #getUseKind() <em>Use Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseKind()
	 * @generated
	 * @ordered
	 */
	protected ActivityUseKind useKind = USE_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsedActivity() <em>Used Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity usedActivity;

	/**
	 * The cached value of the '{@link #getNestedBreakdownElement() <em>Nested Breakdown Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedBreakdownElement()
	 * @generated
	 * @ordered
	 */
	protected EList<BreakdownElement> nestedBreakdownElement;

	/**
	 * The cached value of the '{@link #getSuppressedBreakdownElement() <em>Suppressed Breakdown Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppressedBreakdownElement()
	 * @generated
	 * @ordered
	 */
	protected EList<BreakdownElement> suppressedBreakdownElement;

	/**
	 * The cached value of the '{@link #getOwnedProcessParameter() <em>Owned Process Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProcessParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessParameter> ownedProcessParameter;

	/**
	 * The cached value of the '{@link #getDefaultContext() <em>Default Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultContext()
	 * @generated
	 * @ordered
	 */
	protected MethodConfiguration defaultContext;

	/**
	 * The cached value of the '{@link #getValidContext() <em>Valid Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidContext()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodConfiguration> validContext;

	/**
	 * The default value of the '{@link #isIsEnactable() <em>Is Enactable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnactable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENACTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEnactable() <em>Is Enactable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnactable()
	 * @generated
	 * @ordered
	 */
	protected boolean isEnactable = IS_ENACTABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.ACTIVITY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.ACTIVITY__KIND, oldKind, kind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__KIND, oldKind, kind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__PRESENTATION_NAME, oldPresentationName, presentationName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__BRIEF_DESCRIPTION, oldBriefDescription, briefDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__MAIN_DESCRIPTION, oldMainDescription, mainDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guidance> getGuidance() {
		if (guidance == null) {
			guidance = new EObjectResolvingEList<Guidance>(Guidance.class, this, SpemPackage.ACTIVITY__GUIDANCE);
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
			metric = new EObjectResolvingEList<Metric>(Metric.class, this, SpemPackage.ACTIVITY__METRIC);
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
			category = new EObjectWithInverseResolvingEList.ManyInverse<Category>(Category.class, this, SpemPackage.ACTIVITY__CATEGORY, SpemPackage.CATEGORY__CATEGORIZED_ELEMENT);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__COPYRIGHT, oldCopyright, copyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAuthor() {
		if (author == null) {
			author = new EDataTypeUniqueEList<String>(String.class, this, SpemPackage.ACTIVITY__AUTHOR);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__CHANGE_DATE, oldChangeDate, changeDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__CHANGE_DESCRIPTION, oldChangeDescription, changeDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessKind getProcessKind() {
		if (processKind != null && processKind.eIsProxy()) {
			InternalEObject oldProcessKind = (InternalEObject)processKind;
			processKind = (ProcessKind)eResolveProxy(oldProcessKind);
			if (processKind != oldProcessKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.ACTIVITY__PROCESS_KIND, oldProcessKind, processKind));
			}
		}
		return processKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessKind basicGetProcessKind() {
		return processKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessKind(ProcessKind newProcessKind) {
		ProcessKind oldProcessKind = processKind;
		processKind = newProcessKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__PROCESS_KIND, oldProcessKind, processKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasMultipleOccurrences() {
		return hasMultipleOccurrences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasMultipleOccurrences(boolean newHasMultipleOccurrences) {
		boolean oldHasMultipleOccurrences = hasMultipleOccurrences;
		hasMultipleOccurrences = newHasMultipleOccurrences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__HAS_MULTIPLE_OCCURRENCES, oldHasMultipleOccurrences, hasMultipleOccurrences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOptional() {
		return isOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOptional(boolean newIsOptional) {
		boolean oldIsOptional = isOptional;
		isOptional = newIsOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__IS_OPTIONAL, oldIsOptional, isOptional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPlanned() {
		return isPlanned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPlanned(boolean newIsPlanned) {
		boolean oldIsPlanned = isPlanned;
		isPlanned = newIsPlanned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__IS_PLANNED, oldIsPlanned, isPlanned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanningData getPlanningData() {
		return planningData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanningData(PlanningData newPlanningData, NotificationChain msgs) {
		PlanningData oldPlanningData = planningData;
		planningData = newPlanningData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__PLANNING_DATA, oldPlanningData, newPlanningData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanningData(PlanningData newPlanningData) {
		if (newPlanningData != planningData) {
			NotificationChain msgs = null;
			if (planningData != null)
				msgs = ((InternalEObject)planningData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpemPackage.ACTIVITY__PLANNING_DATA, null, msgs);
			if (newPlanningData != null)
				msgs = ((InternalEObject)newPlanningData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpemPackage.ACTIVITY__PLANNING_DATA, null, msgs);
			msgs = basicSetPlanningData(newPlanningData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__PLANNING_DATA, newPlanningData, newPlanningData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__IS_REPEATABLE, oldIsRepeatable, isRepeatable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__IS_ONGOING, oldIsOngoing, isOngoing));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__IS_EVENT_DRIVEN, oldIsEventDriven, isEventDriven));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkSequence> getLinkToPredecessor() {
		if (linkToPredecessor == null) {
			linkToPredecessor = new EObjectWithInverseResolvingEList<WorkSequence>(WorkSequence.class, this, SpemPackage.ACTIVITY__LINK_TO_PREDECESSOR, SpemPackage.WORK_SEQUENCE__SUCCESSOR);
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
			linkToSuccessor = new EObjectWithInverseResolvingEList<WorkSequence>(WorkSequence.class, this, SpemPackage.ACTIVITY__LINK_TO_SUCCESSOR, SpemPackage.WORK_SEQUENCE__PREDECESSOR);
		}
		return linkToSuccessor;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__VARIABILITY_TYPE, oldVariabilityType, variabilityType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.ACTIVITY__VARIABILITY_BASED_ON_ELEMENT, oldVariabilityBasedOnElement, variabilityBasedOnElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__VARIABILITY_BASED_ON_ELEMENT, oldVariabilityBasedOnElement, variabilityBasedOnElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityUseKind getUseKind() {
		return useKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseKind(ActivityUseKind newUseKind) {
		ActivityUseKind oldUseKind = useKind;
		useKind = newUseKind == null ? USE_KIND_EDEFAULT : newUseKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__USE_KIND, oldUseKind, useKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getUsedActivity() {
		if (usedActivity != null && usedActivity.eIsProxy()) {
			InternalEObject oldUsedActivity = (InternalEObject)usedActivity;
			usedActivity = (Activity)eResolveProxy(oldUsedActivity);
			if (usedActivity != oldUsedActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.ACTIVITY__USED_ACTIVITY, oldUsedActivity, usedActivity));
			}
		}
		return usedActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetUsedActivity() {
		return usedActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsedActivity(Activity newUsedActivity) {
		Activity oldUsedActivity = usedActivity;
		usedActivity = newUsedActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__USED_ACTIVITY, oldUsedActivity, usedActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BreakdownElement> getNestedBreakdownElement() {
		if (nestedBreakdownElement == null) {
			nestedBreakdownElement = new EObjectContainmentEList<BreakdownElement>(BreakdownElement.class, this, SpemPackage.ACTIVITY__NESTED_BREAKDOWN_ELEMENT);
		}
		return nestedBreakdownElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BreakdownElement> getSuppressedBreakdownElement() {
		if (suppressedBreakdownElement == null) {
			suppressedBreakdownElement = new EObjectResolvingEList<BreakdownElement>(BreakdownElement.class, this, SpemPackage.ACTIVITY__SUPPRESSED_BREAKDOWN_ELEMENT);
		}
		return suppressedBreakdownElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessParameter> getOwnedProcessParameter() {
		if (ownedProcessParameter == null) {
			ownedProcessParameter = new EObjectContainmentEList<ProcessParameter>(ProcessParameter.class, this, SpemPackage.ACTIVITY__OWNED_PROCESS_PARAMETER);
		}
		return ownedProcessParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodConfiguration getDefaultContext() {
		if (defaultContext != null && defaultContext.eIsProxy()) {
			InternalEObject oldDefaultContext = (InternalEObject)defaultContext;
			defaultContext = (MethodConfiguration)eResolveProxy(oldDefaultContext);
			if (defaultContext != oldDefaultContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.ACTIVITY__DEFAULT_CONTEXT, oldDefaultContext, defaultContext));
			}
		}
		return defaultContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodConfiguration basicGetDefaultContext() {
		return defaultContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultContext(MethodConfiguration newDefaultContext) {
		MethodConfiguration oldDefaultContext = defaultContext;
		defaultContext = newDefaultContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__DEFAULT_CONTEXT, oldDefaultContext, defaultContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodConfiguration> getValidContext() {
		if (validContext == null) {
			validContext = new EObjectResolvingEList<MethodConfiguration>(MethodConfiguration.class, this, SpemPackage.ACTIVITY__VALID_CONTEXT);
		}
		return validContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEnactable() {
		return isEnactable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEnactable(boolean newIsEnactable) {
		boolean oldIsEnactable = isEnactable;
		isEnactable = newIsEnactable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ACTIVITY__IS_ENACTABLE, oldIsEnactable, isEnactable));
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
			case SpemPackage.ACTIVITY__CATEGORY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategory()).basicAdd(otherEnd, msgs);
			case SpemPackage.ACTIVITY__LINK_TO_PREDECESSOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinkToPredecessor()).basicAdd(otherEnd, msgs);
			case SpemPackage.ACTIVITY__LINK_TO_SUCCESSOR:
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
			case SpemPackage.ACTIVITY__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case SpemPackage.ACTIVITY__PLANNING_DATA:
				return basicSetPlanningData(null, msgs);
			case SpemPackage.ACTIVITY__LINK_TO_PREDECESSOR:
				return ((InternalEList<?>)getLinkToPredecessor()).basicRemove(otherEnd, msgs);
			case SpemPackage.ACTIVITY__LINK_TO_SUCCESSOR:
				return ((InternalEList<?>)getLinkToSuccessor()).basicRemove(otherEnd, msgs);
			case SpemPackage.ACTIVITY__NESTED_BREAKDOWN_ELEMENT:
				return ((InternalEList<?>)getNestedBreakdownElement()).basicRemove(otherEnd, msgs);
			case SpemPackage.ACTIVITY__OWNED_PROCESS_PARAMETER:
				return ((InternalEList<?>)getOwnedProcessParameter()).basicRemove(otherEnd, msgs);
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
			case SpemPackage.ACTIVITY__KIND:
				if (resolve) return getKind();
				return basicGetKind();
			case SpemPackage.ACTIVITY__PRESENTATION_NAME:
				return getPresentationName();
			case SpemPackage.ACTIVITY__BRIEF_DESCRIPTION:
				return getBriefDescription();
			case SpemPackage.ACTIVITY__MAIN_DESCRIPTION:
				return getMainDescription();
			case SpemPackage.ACTIVITY__PURPOSE:
				return getPurpose();
			case SpemPackage.ACTIVITY__GUIDANCE:
				return getGuidance();
			case SpemPackage.ACTIVITY__METRIC:
				return getMetric();
			case SpemPackage.ACTIVITY__CATEGORY:
				return getCategory();
			case SpemPackage.ACTIVITY__COPYRIGHT:
				return getCopyright();
			case SpemPackage.ACTIVITY__AUTHOR:
				return getAuthor();
			case SpemPackage.ACTIVITY__CHANGE_DATE:
				return getChangeDate();
			case SpemPackage.ACTIVITY__CHANGE_DESCRIPTION:
				return getChangeDescription();
			case SpemPackage.ACTIVITY__VERSION:
				return getVersion();
			case SpemPackage.ACTIVITY__NAME:
				return getName();
			case SpemPackage.ACTIVITY__PROCESS_KIND:
				if (resolve) return getProcessKind();
				return basicGetProcessKind();
			case SpemPackage.ACTIVITY__HAS_MULTIPLE_OCCURRENCES:
				return isHasMultipleOccurrences();
			case SpemPackage.ACTIVITY__IS_OPTIONAL:
				return isIsOptional();
			case SpemPackage.ACTIVITY__IS_PLANNED:
				return isIsPlanned();
			case SpemPackage.ACTIVITY__PLANNING_DATA:
				return getPlanningData();
			case SpemPackage.ACTIVITY__IS_REPEATABLE:
				return isIsRepeatable();
			case SpemPackage.ACTIVITY__IS_ONGOING:
				return isIsOngoing();
			case SpemPackage.ACTIVITY__IS_EVENT_DRIVEN:
				return isIsEventDriven();
			case SpemPackage.ACTIVITY__LINK_TO_PREDECESSOR:
				return getLinkToPredecessor();
			case SpemPackage.ACTIVITY__LINK_TO_SUCCESSOR:
				return getLinkToSuccessor();
			case SpemPackage.ACTIVITY__VARIABILITY_TYPE:
				return getVariabilityType();
			case SpemPackage.ACTIVITY__VARIABILITY_BASED_ON_ELEMENT:
				if (resolve) return getVariabilityBasedOnElement();
				return basicGetVariabilityBasedOnElement();
			case SpemPackage.ACTIVITY__USE_KIND:
				return getUseKind();
			case SpemPackage.ACTIVITY__USED_ACTIVITY:
				if (resolve) return getUsedActivity();
				return basicGetUsedActivity();
			case SpemPackage.ACTIVITY__NESTED_BREAKDOWN_ELEMENT:
				return getNestedBreakdownElement();
			case SpemPackage.ACTIVITY__SUPPRESSED_BREAKDOWN_ELEMENT:
				return getSuppressedBreakdownElement();
			case SpemPackage.ACTIVITY__OWNED_PROCESS_PARAMETER:
				return getOwnedProcessParameter();
			case SpemPackage.ACTIVITY__DEFAULT_CONTEXT:
				if (resolve) return getDefaultContext();
				return basicGetDefaultContext();
			case SpemPackage.ACTIVITY__VALID_CONTEXT:
				return getValidContext();
			case SpemPackage.ACTIVITY__IS_ENACTABLE:
				return isIsEnactable();
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
			case SpemPackage.ACTIVITY__KIND:
				setKind((Kind)newValue);
				return;
			case SpemPackage.ACTIVITY__PRESENTATION_NAME:
				setPresentationName((String)newValue);
				return;
			case SpemPackage.ACTIVITY__BRIEF_DESCRIPTION:
				setBriefDescription((String)newValue);
				return;
			case SpemPackage.ACTIVITY__MAIN_DESCRIPTION:
				setMainDescription((String)newValue);
				return;
			case SpemPackage.ACTIVITY__PURPOSE:
				setPurpose((String)newValue);
				return;
			case SpemPackage.ACTIVITY__GUIDANCE:
				getGuidance().clear();
				getGuidance().addAll((Collection<? extends Guidance>)newValue);
				return;
			case SpemPackage.ACTIVITY__METRIC:
				getMetric().clear();
				getMetric().addAll((Collection<? extends Metric>)newValue);
				return;
			case SpemPackage.ACTIVITY__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case SpemPackage.ACTIVITY__COPYRIGHT:
				setCopyright((String)newValue);
				return;
			case SpemPackage.ACTIVITY__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends String>)newValue);
				return;
			case SpemPackage.ACTIVITY__CHANGE_DATE:
				setChangeDate((Date)newValue);
				return;
			case SpemPackage.ACTIVITY__CHANGE_DESCRIPTION:
				setChangeDescription((String)newValue);
				return;
			case SpemPackage.ACTIVITY__VERSION:
				setVersion((String)newValue);
				return;
			case SpemPackage.ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case SpemPackage.ACTIVITY__PROCESS_KIND:
				setProcessKind((ProcessKind)newValue);
				return;
			case SpemPackage.ACTIVITY__HAS_MULTIPLE_OCCURRENCES:
				setHasMultipleOccurrences((Boolean)newValue);
				return;
			case SpemPackage.ACTIVITY__IS_OPTIONAL:
				setIsOptional((Boolean)newValue);
				return;
			case SpemPackage.ACTIVITY__IS_PLANNED:
				setIsPlanned((Boolean)newValue);
				return;
			case SpemPackage.ACTIVITY__PLANNING_DATA:
				setPlanningData((PlanningData)newValue);
				return;
			case SpemPackage.ACTIVITY__IS_REPEATABLE:
				setIsRepeatable((Boolean)newValue);
				return;
			case SpemPackage.ACTIVITY__IS_ONGOING:
				setIsOngoing((Boolean)newValue);
				return;
			case SpemPackage.ACTIVITY__IS_EVENT_DRIVEN:
				setIsEventDriven((Boolean)newValue);
				return;
			case SpemPackage.ACTIVITY__LINK_TO_PREDECESSOR:
				getLinkToPredecessor().clear();
				getLinkToPredecessor().addAll((Collection<? extends WorkSequence>)newValue);
				return;
			case SpemPackage.ACTIVITY__LINK_TO_SUCCESSOR:
				getLinkToSuccessor().clear();
				getLinkToSuccessor().addAll((Collection<? extends WorkSequence>)newValue);
				return;
			case SpemPackage.ACTIVITY__VARIABILITY_TYPE:
				setVariabilityType((VariabilityType)newValue);
				return;
			case SpemPackage.ACTIVITY__VARIABILITY_BASED_ON_ELEMENT:
				setVariabilityBasedOnElement((VariabilityElement)newValue);
				return;
			case SpemPackage.ACTIVITY__USE_KIND:
				setUseKind((ActivityUseKind)newValue);
				return;
			case SpemPackage.ACTIVITY__USED_ACTIVITY:
				setUsedActivity((Activity)newValue);
				return;
			case SpemPackage.ACTIVITY__NESTED_BREAKDOWN_ELEMENT:
				getNestedBreakdownElement().clear();
				getNestedBreakdownElement().addAll((Collection<? extends BreakdownElement>)newValue);
				return;
			case SpemPackage.ACTIVITY__SUPPRESSED_BREAKDOWN_ELEMENT:
				getSuppressedBreakdownElement().clear();
				getSuppressedBreakdownElement().addAll((Collection<? extends BreakdownElement>)newValue);
				return;
			case SpemPackage.ACTIVITY__OWNED_PROCESS_PARAMETER:
				getOwnedProcessParameter().clear();
				getOwnedProcessParameter().addAll((Collection<? extends ProcessParameter>)newValue);
				return;
			case SpemPackage.ACTIVITY__DEFAULT_CONTEXT:
				setDefaultContext((MethodConfiguration)newValue);
				return;
			case SpemPackage.ACTIVITY__VALID_CONTEXT:
				getValidContext().clear();
				getValidContext().addAll((Collection<? extends MethodConfiguration>)newValue);
				return;
			case SpemPackage.ACTIVITY__IS_ENACTABLE:
				setIsEnactable((Boolean)newValue);
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
			case SpemPackage.ACTIVITY__KIND:
				setKind((Kind)null);
				return;
			case SpemPackage.ACTIVITY__PRESENTATION_NAME:
				setPresentationName(PRESENTATION_NAME_EDEFAULT);
				return;
			case SpemPackage.ACTIVITY__BRIEF_DESCRIPTION:
				setBriefDescription(BRIEF_DESCRIPTION_EDEFAULT);
				return;
			case SpemPackage.ACTIVITY__MAIN_DESCRIPTION:
				setMainDescription(MAIN_DESCRIPTION_EDEFAULT);
				return;
			case SpemPackage.ACTIVITY__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case SpemPackage.ACTIVITY__GUIDANCE:
				getGuidance().clear();
				return;
			case SpemPackage.ACTIVITY__METRIC:
				getMetric().clear();
				return;
			case SpemPackage.ACTIVITY__CATEGORY:
				getCategory().clear();
				return;
			case SpemPackage.ACTIVITY__COPYRIGHT:
				setCopyright(COPYRIGHT_EDEFAULT);
				return;
			case SpemPackage.ACTIVITY__AUTHOR:
				getAuthor().clear();
				return;
			case SpemPackage.ACTIVITY__CHANGE_DATE:
				setChangeDate(CHANGE_DATE_EDEFAULT);
				return;
			case SpemPackage.ACTIVITY__CHANGE_DESCRIPTION:
				setChangeDescription(CHANGE_DESCRIPTION_EDEFAULT);
				return;
			case SpemPackage.ACTIVITY__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case SpemPackage.ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpemPackage.ACTIVITY__PROCESS_KIND:
				setProcessKind((ProcessKind)null);
				return;
			case SpemPackage.ACTIVITY__HAS_MULTIPLE_OCCURRENCES:
				setHasMultipleOccurrences(HAS_MULTIPLE_OCCURRENCES_EDEFAULT);
				return;
			case SpemPackage.ACTIVITY__IS_OPTIONAL:
				setIsOptional(IS_OPTIONAL_EDEFAULT);
				return;
			case SpemPackage.ACTIVITY__IS_PLANNED:
				setIsPlanned(IS_PLANNED_EDEFAULT);
				return;
			case SpemPackage.ACTIVITY__PLANNING_DATA:
				setPlanningData((PlanningData)null);
				return;
			case SpemPackage.ACTIVITY__IS_REPEATABLE:
				setIsRepeatable(IS_REPEATABLE_EDEFAULT);
				return;
			case SpemPackage.ACTIVITY__IS_ONGOING:
				setIsOngoing(IS_ONGOING_EDEFAULT);
				return;
			case SpemPackage.ACTIVITY__IS_EVENT_DRIVEN:
				setIsEventDriven(IS_EVENT_DRIVEN_EDEFAULT);
				return;
			case SpemPackage.ACTIVITY__LINK_TO_PREDECESSOR:
				getLinkToPredecessor().clear();
				return;
			case SpemPackage.ACTIVITY__LINK_TO_SUCCESSOR:
				getLinkToSuccessor().clear();
				return;
			case SpemPackage.ACTIVITY__VARIABILITY_TYPE:
				setVariabilityType(VARIABILITY_TYPE_EDEFAULT);
				return;
			case SpemPackage.ACTIVITY__VARIABILITY_BASED_ON_ELEMENT:
				setVariabilityBasedOnElement((VariabilityElement)null);
				return;
			case SpemPackage.ACTIVITY__USE_KIND:
				setUseKind(USE_KIND_EDEFAULT);
				return;
			case SpemPackage.ACTIVITY__USED_ACTIVITY:
				setUsedActivity((Activity)null);
				return;
			case SpemPackage.ACTIVITY__NESTED_BREAKDOWN_ELEMENT:
				getNestedBreakdownElement().clear();
				return;
			case SpemPackage.ACTIVITY__SUPPRESSED_BREAKDOWN_ELEMENT:
				getSuppressedBreakdownElement().clear();
				return;
			case SpemPackage.ACTIVITY__OWNED_PROCESS_PARAMETER:
				getOwnedProcessParameter().clear();
				return;
			case SpemPackage.ACTIVITY__DEFAULT_CONTEXT:
				setDefaultContext((MethodConfiguration)null);
				return;
			case SpemPackage.ACTIVITY__VALID_CONTEXT:
				getValidContext().clear();
				return;
			case SpemPackage.ACTIVITY__IS_ENACTABLE:
				setIsEnactable(IS_ENACTABLE_EDEFAULT);
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
			case SpemPackage.ACTIVITY__KIND:
				return kind != null;
			case SpemPackage.ACTIVITY__PRESENTATION_NAME:
				return PRESENTATION_NAME_EDEFAULT == null ? presentationName != null : !PRESENTATION_NAME_EDEFAULT.equals(presentationName);
			case SpemPackage.ACTIVITY__BRIEF_DESCRIPTION:
				return BRIEF_DESCRIPTION_EDEFAULT == null ? briefDescription != null : !BRIEF_DESCRIPTION_EDEFAULT.equals(briefDescription);
			case SpemPackage.ACTIVITY__MAIN_DESCRIPTION:
				return MAIN_DESCRIPTION_EDEFAULT == null ? mainDescription != null : !MAIN_DESCRIPTION_EDEFAULT.equals(mainDescription);
			case SpemPackage.ACTIVITY__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case SpemPackage.ACTIVITY__GUIDANCE:
				return guidance != null && !guidance.isEmpty();
			case SpemPackage.ACTIVITY__METRIC:
				return metric != null && !metric.isEmpty();
			case SpemPackage.ACTIVITY__CATEGORY:
				return category != null && !category.isEmpty();
			case SpemPackage.ACTIVITY__COPYRIGHT:
				return COPYRIGHT_EDEFAULT == null ? copyright != null : !COPYRIGHT_EDEFAULT.equals(copyright);
			case SpemPackage.ACTIVITY__AUTHOR:
				return author != null && !author.isEmpty();
			case SpemPackage.ACTIVITY__CHANGE_DATE:
				return CHANGE_DATE_EDEFAULT == null ? changeDate != null : !CHANGE_DATE_EDEFAULT.equals(changeDate);
			case SpemPackage.ACTIVITY__CHANGE_DESCRIPTION:
				return CHANGE_DESCRIPTION_EDEFAULT == null ? changeDescription != null : !CHANGE_DESCRIPTION_EDEFAULT.equals(changeDescription);
			case SpemPackage.ACTIVITY__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case SpemPackage.ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpemPackage.ACTIVITY__PROCESS_KIND:
				return processKind != null;
			case SpemPackage.ACTIVITY__HAS_MULTIPLE_OCCURRENCES:
				return hasMultipleOccurrences != HAS_MULTIPLE_OCCURRENCES_EDEFAULT;
			case SpemPackage.ACTIVITY__IS_OPTIONAL:
				return isOptional != IS_OPTIONAL_EDEFAULT;
			case SpemPackage.ACTIVITY__IS_PLANNED:
				return isPlanned != IS_PLANNED_EDEFAULT;
			case SpemPackage.ACTIVITY__PLANNING_DATA:
				return planningData != null;
			case SpemPackage.ACTIVITY__IS_REPEATABLE:
				return isRepeatable != IS_REPEATABLE_EDEFAULT;
			case SpemPackage.ACTIVITY__IS_ONGOING:
				return isOngoing != IS_ONGOING_EDEFAULT;
			case SpemPackage.ACTIVITY__IS_EVENT_DRIVEN:
				return isEventDriven != IS_EVENT_DRIVEN_EDEFAULT;
			case SpemPackage.ACTIVITY__LINK_TO_PREDECESSOR:
				return linkToPredecessor != null && !linkToPredecessor.isEmpty();
			case SpemPackage.ACTIVITY__LINK_TO_SUCCESSOR:
				return linkToSuccessor != null && !linkToSuccessor.isEmpty();
			case SpemPackage.ACTIVITY__VARIABILITY_TYPE:
				return variabilityType != VARIABILITY_TYPE_EDEFAULT;
			case SpemPackage.ACTIVITY__VARIABILITY_BASED_ON_ELEMENT:
				return variabilityBasedOnElement != null;
			case SpemPackage.ACTIVITY__USE_KIND:
				return useKind != USE_KIND_EDEFAULT;
			case SpemPackage.ACTIVITY__USED_ACTIVITY:
				return usedActivity != null;
			case SpemPackage.ACTIVITY__NESTED_BREAKDOWN_ELEMENT:
				return nestedBreakdownElement != null && !nestedBreakdownElement.isEmpty();
			case SpemPackage.ACTIVITY__SUPPRESSED_BREAKDOWN_ELEMENT:
				return suppressedBreakdownElement != null && !suppressedBreakdownElement.isEmpty();
			case SpemPackage.ACTIVITY__OWNED_PROCESS_PARAMETER:
				return ownedProcessParameter != null && !ownedProcessParameter.isEmpty();
			case SpemPackage.ACTIVITY__DEFAULT_CONTEXT:
				return defaultContext != null;
			case SpemPackage.ACTIVITY__VALID_CONTEXT:
				return validContext != null && !validContext.isEmpty();
			case SpemPackage.ACTIVITY__IS_ENACTABLE:
				return isEnactable != IS_ENACTABLE_EDEFAULT;
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
				case SpemPackage.ACTIVITY__KIND: return SpemPackage.EXTENSIBLE_ELEMENT__KIND;
				default: return -1;
			}
		}
		if (baseClass == DescribableElement.class) {
			switch (derivedFeatureID) {
				case SpemPackage.ACTIVITY__PRESENTATION_NAME: return SpemPackage.DESCRIBABLE_ELEMENT__PRESENTATION_NAME;
				case SpemPackage.ACTIVITY__BRIEF_DESCRIPTION: return SpemPackage.DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION;
				case SpemPackage.ACTIVITY__MAIN_DESCRIPTION: return SpemPackage.DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION;
				case SpemPackage.ACTIVITY__PURPOSE: return SpemPackage.DESCRIBABLE_ELEMENT__PURPOSE;
				case SpemPackage.ACTIVITY__GUIDANCE: return SpemPackage.DESCRIBABLE_ELEMENT__GUIDANCE;
				case SpemPackage.ACTIVITY__METRIC: return SpemPackage.DESCRIBABLE_ELEMENT__METRIC;
				case SpemPackage.ACTIVITY__CATEGORY: return SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY;
				case SpemPackage.ACTIVITY__COPYRIGHT: return SpemPackage.DESCRIBABLE_ELEMENT__COPYRIGHT;
				case SpemPackage.ACTIVITY__AUTHOR: return SpemPackage.DESCRIBABLE_ELEMENT__AUTHOR;
				case SpemPackage.ACTIVITY__CHANGE_DATE: return SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DATE;
				case SpemPackage.ACTIVITY__CHANGE_DESCRIPTION: return SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DESCRIPTION;
				case SpemPackage.ACTIVITY__VERSION: return SpemPackage.DESCRIBABLE_ELEMENT__VERSION;
				default: return -1;
			}
		}
		if (baseClass == ProcessPackageableElement.class) {
			switch (derivedFeatureID) {
				case SpemPackage.ACTIVITY__NAME: return SpemPackage.PROCESS_PACKAGEABLE_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == ProcessElement.class) {
			switch (derivedFeatureID) {
				case SpemPackage.ACTIVITY__PROCESS_KIND: return SpemPackage.PROCESS_ELEMENT__PROCESS_KIND;
				default: return -1;
			}
		}
		if (baseClass == BreakdownElement.class) {
			switch (derivedFeatureID) {
				case SpemPackage.ACTIVITY__HAS_MULTIPLE_OCCURRENCES: return SpemPackage.BREAKDOWN_ELEMENT__HAS_MULTIPLE_OCCURRENCES;
				case SpemPackage.ACTIVITY__IS_OPTIONAL: return SpemPackage.BREAKDOWN_ELEMENT__IS_OPTIONAL;
				case SpemPackage.ACTIVITY__IS_PLANNED: return SpemPackage.BREAKDOWN_ELEMENT__IS_PLANNED;
				case SpemPackage.ACTIVITY__PLANNING_DATA: return SpemPackage.BREAKDOWN_ELEMENT__PLANNING_DATA;
				default: return -1;
			}
		}
		if (baseClass == WorkBreakdownElement.class) {
			switch (derivedFeatureID) {
				case SpemPackage.ACTIVITY__IS_REPEATABLE: return SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_REPEATABLE;
				case SpemPackage.ACTIVITY__IS_ONGOING: return SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_ONGOING;
				case SpemPackage.ACTIVITY__IS_EVENT_DRIVEN: return SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_EVENT_DRIVEN;
				case SpemPackage.ACTIVITY__LINK_TO_PREDECESSOR: return SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_PREDECESSOR;
				case SpemPackage.ACTIVITY__LINK_TO_SUCCESSOR: return SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_SUCCESSOR;
				default: return -1;
			}
		}
		if (baseClass == VariabilityElement.class) {
			switch (derivedFeatureID) {
				case SpemPackage.ACTIVITY__VARIABILITY_TYPE: return SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_TYPE;
				case SpemPackage.ACTIVITY__VARIABILITY_BASED_ON_ELEMENT: return SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT;
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
				case SpemPackage.EXTENSIBLE_ELEMENT__KIND: return SpemPackage.ACTIVITY__KIND;
				default: return -1;
			}
		}
		if (baseClass == DescribableElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.DESCRIBABLE_ELEMENT__PRESENTATION_NAME: return SpemPackage.ACTIVITY__PRESENTATION_NAME;
				case SpemPackage.DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION: return SpemPackage.ACTIVITY__BRIEF_DESCRIPTION;
				case SpemPackage.DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION: return SpemPackage.ACTIVITY__MAIN_DESCRIPTION;
				case SpemPackage.DESCRIBABLE_ELEMENT__PURPOSE: return SpemPackage.ACTIVITY__PURPOSE;
				case SpemPackage.DESCRIBABLE_ELEMENT__GUIDANCE: return SpemPackage.ACTIVITY__GUIDANCE;
				case SpemPackage.DESCRIBABLE_ELEMENT__METRIC: return SpemPackage.ACTIVITY__METRIC;
				case SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY: return SpemPackage.ACTIVITY__CATEGORY;
				case SpemPackage.DESCRIBABLE_ELEMENT__COPYRIGHT: return SpemPackage.ACTIVITY__COPYRIGHT;
				case SpemPackage.DESCRIBABLE_ELEMENT__AUTHOR: return SpemPackage.ACTIVITY__AUTHOR;
				case SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DATE: return SpemPackage.ACTIVITY__CHANGE_DATE;
				case SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DESCRIPTION: return SpemPackage.ACTIVITY__CHANGE_DESCRIPTION;
				case SpemPackage.DESCRIBABLE_ELEMENT__VERSION: return SpemPackage.ACTIVITY__VERSION;
				default: return -1;
			}
		}
		if (baseClass == ProcessPackageableElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.PROCESS_PACKAGEABLE_ELEMENT__NAME: return SpemPackage.ACTIVITY__NAME;
				default: return -1;
			}
		}
		if (baseClass == ProcessElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.PROCESS_ELEMENT__PROCESS_KIND: return SpemPackage.ACTIVITY__PROCESS_KIND;
				default: return -1;
			}
		}
		if (baseClass == BreakdownElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.BREAKDOWN_ELEMENT__HAS_MULTIPLE_OCCURRENCES: return SpemPackage.ACTIVITY__HAS_MULTIPLE_OCCURRENCES;
				case SpemPackage.BREAKDOWN_ELEMENT__IS_OPTIONAL: return SpemPackage.ACTIVITY__IS_OPTIONAL;
				case SpemPackage.BREAKDOWN_ELEMENT__IS_PLANNED: return SpemPackage.ACTIVITY__IS_PLANNED;
				case SpemPackage.BREAKDOWN_ELEMENT__PLANNING_DATA: return SpemPackage.ACTIVITY__PLANNING_DATA;
				default: return -1;
			}
		}
		if (baseClass == WorkBreakdownElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_REPEATABLE: return SpemPackage.ACTIVITY__IS_REPEATABLE;
				case SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_ONGOING: return SpemPackage.ACTIVITY__IS_ONGOING;
				case SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_EVENT_DRIVEN: return SpemPackage.ACTIVITY__IS_EVENT_DRIVEN;
				case SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_PREDECESSOR: return SpemPackage.ACTIVITY__LINK_TO_PREDECESSOR;
				case SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_SUCCESSOR: return SpemPackage.ACTIVITY__LINK_TO_SUCCESSOR;
				default: return -1;
			}
		}
		if (baseClass == VariabilityElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_TYPE: return SpemPackage.ACTIVITY__VARIABILITY_TYPE;
				case SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT: return SpemPackage.ACTIVITY__VARIABILITY_BASED_ON_ELEMENT;
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
		result.append(", hasMultipleOccurrences: ");
		result.append(hasMultipleOccurrences);
		result.append(", isOptional: ");
		result.append(isOptional);
		result.append(", isPlanned: ");
		result.append(isPlanned);
		result.append(", isRepeatable: ");
		result.append(isRepeatable);
		result.append(", isOngoing: ");
		result.append(isOngoing);
		result.append(", isEventDriven: ");
		result.append(isEventDriven);
		result.append(", variabilityType: ");
		result.append(variabilityType);
		result.append(", useKind: ");
		result.append(useKind);
		result.append(", isEnactable: ");
		result.append(isEnactable);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
