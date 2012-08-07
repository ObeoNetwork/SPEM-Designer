/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Planning Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.ProcessPlanningTemplate#getBaseProcess <em>Base Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getProcessPlanningTemplate()
 * @model
 * @generated
 */
public interface ProcessPlanningTemplate extends org.obeonetwork.dsl.spem.uma.Process {
	/**
	 * Returns the value of the '<em><b>Base Process</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.uma.Process}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Process</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Process</em>' reference list.
	 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getProcessPlanningTemplate_BaseProcess()
	 * @model
	 * @generated
	 */
	EList<org.obeonetwork.dsl.spem.uma.Process> getBaseProcess();

} // ProcessPlanningTemplate
