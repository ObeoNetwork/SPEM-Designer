/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.spem.Activity;
import org.obeonetwork.dsl.spem.Guidance;
import org.obeonetwork.dsl.spem.MethodContentElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Practice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.Practice#getSubPractice <em>Sub Practice</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.Practice#getReferencedActivity <em>Referenced Activity</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.Practice#getContentReference <em>Content Reference</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.Practice#getAdditionalInfo <em>Additional Info</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.Practice#getApplication <em>Application</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.Practice#getBackground <em>Background</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.Practice#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.Practice#getLevelOfAdoption <em>Level Of Adoption</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.Practice#getProblem <em>Problem</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getPractice()
 * @model
 * @generated
 */
public interface Practice extends Guidance {
	/**
	 * Returns the value of the '<em><b>Sub Practice</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.uma.Practice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Practice</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Practice</em>' containment reference list.
	 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getPractice_SubPractice()
	 * @model containment="true"
	 * @generated
	 */
	EList<Practice> getSubPractice();

	/**
	 * Returns the value of the '<em><b>Referenced Activity</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Activity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Activity</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getPractice_ReferencedActivity()
	 * @model
	 * @generated
	 */
	EList<Activity> getReferencedActivity();

	/**
	 * Returns the value of the '<em><b>Content Reference</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.MethodContentElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Reference</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getPractice_ContentReference()
	 * @model
	 * @generated
	 */
	EList<MethodContentElement> getContentReference();

	/**
	 * Returns the value of the '<em><b>Additional Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Info</em>' attribute.
	 * @see #setAdditionalInfo(String)
	 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getPractice_AdditionalInfo()
	 * @model
	 * @generated
	 */
	String getAdditionalInfo();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.uma.Practice#getAdditionalInfo <em>Additional Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Info</em>' attribute.
	 * @see #getAdditionalInfo()
	 * @generated
	 */
	void setAdditionalInfo(String value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' attribute.
	 * @see #setApplication(String)
	 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getPractice_Application()
	 * @model
	 * @generated
	 */
	String getApplication();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.uma.Practice#getApplication <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' attribute.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(String value);

	/**
	 * Returns the value of the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see #setBackground(String)
	 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getPractice_Background()
	 * @model
	 * @generated
	 */
	String getBackground();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.uma.Practice#getBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(String value);

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' attribute list.
	 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getPractice_Goal()
	 * @model
	 * @generated
	 */
	EList<String> getGoal();

	/**
	 * Returns the value of the '<em><b>Level Of Adoption</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Of Adoption</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Of Adoption</em>' attribute list.
	 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getPractice_LevelOfAdoption()
	 * @model
	 * @generated
	 */
	EList<String> getLevelOfAdoption();

	/**
	 * Returns the value of the '<em><b>Problem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem</em>' attribute.
	 * @see #setProblem(String)
	 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getPractice_Problem()
	 * @model
	 * @generated
	 */
	String getProblem();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.spem.uma.Practice#getProblem <em>Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem</em>' attribute.
	 * @see #getProblem()
	 * @generated
	 */
	void setProblem(String value);

} // Practice
