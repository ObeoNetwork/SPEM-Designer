/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.spem.impl.WorkProductUseImpl;

import org.obeonetwork.dsl.spem.uma.Artifact;
import org.obeonetwork.dsl.spem.uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.ArtifactImpl#getContainedArtifact <em>Contained Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactImpl extends WorkProductUseImpl implements Artifact {
	/**
	 * The cached value of the '{@link #getContainedArtifact() <em>Contained Artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> containedArtifact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.Literals.ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artifact> getContainedArtifact() {
		if (containedArtifact == null) {
			containedArtifact = new EObjectContainmentEList<Artifact>(Artifact.class, this, UmaPackage.ARTIFACT__CONTAINED_ARTIFACT);
		}
		return containedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmaPackage.ARTIFACT__CONTAINED_ARTIFACT:
				return ((InternalEList<?>)getContainedArtifact()).basicRemove(otherEnd, msgs);
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
			case UmaPackage.ARTIFACT__CONTAINED_ARTIFACT:
				return getContainedArtifact();
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
			case UmaPackage.ARTIFACT__CONTAINED_ARTIFACT:
				getContainedArtifact().clear();
				getContainedArtifact().addAll((Collection<? extends Artifact>)newValue);
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
			case UmaPackage.ARTIFACT__CONTAINED_ARTIFACT:
				getContainedArtifact().clear();
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
			case UmaPackage.ARTIFACT__CONTAINED_ARTIFACT:
				return containedArtifact != null && !containedArtifact.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArtifactImpl
