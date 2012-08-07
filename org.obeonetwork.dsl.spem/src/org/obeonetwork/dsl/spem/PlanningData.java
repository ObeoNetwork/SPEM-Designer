/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planning Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.PlanningData#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.PlanningData#getFinishDate <em>Finish Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.PlanningData#getRank <em>Rank</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.PlanningData#getDuration <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.SpemPackage#getPlanningData()
 * @model
 * @generated
 */
public interface PlanningData extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getPlanningData_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.PlanningData#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Finish Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish Date</em>' attribute.
	 * @see #setFinishDate(Date)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getPlanningData_FinishDate()
	 * @model
	 * @generated
	 */
	Date getFinishDate();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.PlanningData#getFinishDate <em>Finish Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish Date</em>' attribute.
	 * @see #getFinishDate()
	 * @generated
	 */
	void setFinishDate(Date value);

	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rank</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see #setRank(int)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getPlanningData_Rank()
	 * @model
	 * @generated
	 */
	int getRank();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.PlanningData#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(int value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see org.obeonetwork.dsl.spem.SpemPackage#getPlanningData_Duration()
	 * @model
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.PlanningData#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

} // PlanningData
