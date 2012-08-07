/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Describable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.DescribableElement#getPresentationName <em>Presentation Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.DescribableElement#getBriefDescription <em>Brief Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.DescribableElement#getMainDescription <em>Main Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.DescribableElement#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.DescribableElement#getGuidance <em>Guidance</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.DescribableElement#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.DescribableElement#getCategory <em>Category</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.DescribableElement#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.DescribableElement#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.DescribableElement#getChangeDate <em>Change Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.DescribableElement#getChangeDescription <em>Change Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.DescribableElement#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getDescribableElement()
 * @model abstract="true"
 *        annotation="add-ons uma='category, copyright, author, changeDate, changeDescription, version'"
 * @generated
 */
public interface DescribableElement extends ExtensibleElement {
	/**
	 * Returns the value of the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Name</em>' attribute.
	 * @see #setPresentationName(String)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getDescribableElement_PresentationName()
	 * @model ordered="false"
	 * @generated
	 */
	String getPresentationName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.DescribableElement#getPresentationName <em>Presentation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Name</em>' attribute.
	 * @see #getPresentationName()
	 * @generated
	 */
	void setPresentationName(String value);

	/**
	 * Returns the value of the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brief Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brief Description</em>' attribute.
	 * @see #setBriefDescription(String)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getDescribableElement_BriefDescription()
	 * @model ordered="false"
	 * @generated
	 */
	String getBriefDescription();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.DescribableElement#getBriefDescription <em>Brief Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brief Description</em>' attribute.
	 * @see #getBriefDescription()
	 * @generated
	 */
	void setBriefDescription(String value);

	/**
	 * Returns the value of the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Description</em>' attribute.
	 * @see #setMainDescription(String)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getDescribableElement_MainDescription()
	 * @model ordered="false"
	 * @generated
	 */
	String getMainDescription();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.DescribableElement#getMainDescription <em>Main Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Description</em>' attribute.
	 * @see #getMainDescription()
	 * @generated
	 */
	void setMainDescription(String value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getDescribableElement_Purpose()
	 * @model ordered="false"
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.DescribableElement#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Guidance</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.Guidance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guidance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guidance</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getDescribableElement_Guidance()
	 * @model
	 * @generated
	 */
	EList<Guidance> getGuidance();

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.Metric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getDescribableElement_Metric()
	 * @model
	 * @generated
	 */
	EList<Metric> getMetric();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.Category}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.spem.Category#getCategorizedElement <em>Categorized Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getDescribableElement_Category()
	 * @see org.obeonetwork.dsl.spem.Category#getCategorizedElement
	 * @model opposite="categorizedElement"
	 * @generated
	 */
	EList<Category> getCategory();

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright</em>' attribute.
	 * @see #setCopyright(String)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getDescribableElement_Copyright()
	 * @model
	 * @generated
	 */
	String getCopyright();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.DescribableElement#getCopyright <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' attribute.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute list.
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getDescribableElement_Author()
	 * @model
	 * @generated
	 */
	EList<String> getAuthor();

	/**
	 * Returns the value of the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Date</em>' attribute.
	 * @see #setChangeDate(Date)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getDescribableElement_ChangeDate()
	 * @model
	 * @generated
	 */
	Date getChangeDate();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.DescribableElement#getChangeDate <em>Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Date</em>' attribute.
	 * @see #getChangeDate()
	 * @generated
	 */
	void setChangeDate(Date value);

	/**
	 * Returns the value of the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Description</em>' attribute.
	 * @see #setChangeDescription(String)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getDescribableElement_ChangeDescription()
	 * @model
	 * @generated
	 */
	String getChangeDescription();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.DescribableElement#getChangeDescription <em>Change Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Description</em>' attribute.
	 * @see #getChangeDescription()
	 * @generated
	 */
	void setChangeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getDescribableElement_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.DescribableElement#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // DescribableElement
