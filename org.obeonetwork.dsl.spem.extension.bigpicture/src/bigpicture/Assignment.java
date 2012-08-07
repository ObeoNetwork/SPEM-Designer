/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bigpicture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.obeonetwork.dsl.spem.WorkBreakdownElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bigpicture.Assignment#getActivity <em>Activity</em>}</li>
 *   <li>{@link bigpicture.Assignment#getWorkBreakdownElement <em>Work Breakdown Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see bigpicture.BigpicturePackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(ActivityBP)
	 * @see bigpicture.BigpicturePackage#getAssignment_Activity()
	 * @model required="true"
	 * @generated
	 */
	ActivityBP getActivity();

	/**
	 * Sets the value of the '{@link bigpicture.Assignment#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(ActivityBP value);

	/**
	 * Returns the value of the '<em><b>Work Breakdown Element</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.WorkBreakdownElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Breakdown Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Breakdown Element</em>' reference list.
	 * @see bigpicture.BigpicturePackage#getAssignment_WorkBreakdownElement()
	 * @model
	 * @generated
	 */
	EList<WorkBreakdownElement> getWorkBreakdownElement();

} // Assignment
