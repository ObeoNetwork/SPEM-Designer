/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.spem.WorkProductUse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.Artifact#getContainedArtifact <em>Contained Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends WorkProductUse {
	/**
	 * Returns the value of the '<em><b>Contained Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.spem.uma.Artifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Artifact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Artifact</em>' containment reference list.
	 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getArtifact_ContainedArtifact()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifact> getContainedArtifact();

} // Artifact
