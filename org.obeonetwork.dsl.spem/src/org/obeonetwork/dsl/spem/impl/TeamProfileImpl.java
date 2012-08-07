/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.spem.RoleUse;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.TeamProfile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.TeamProfileImpl#getSubTeam <em>Sub Team</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.TeamProfileImpl#getSuperTeam <em>Super Team</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.impl.TeamProfileImpl#getTeamRole <em>Team Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TeamProfileImpl extends BreakdownElementImpl implements TeamProfile {
	/**
	 * The cached value of the '{@link #getSubTeam() <em>Sub Team</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTeam()
	 * @generated
	 * @ordered
	 */
	protected EList<TeamProfile> subTeam;

	/**
	 * The cached value of the '{@link #getTeamRole() <em>Team Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamRole()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleUse> teamRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.TEAM_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TeamProfile> getSubTeam() {
		if (subTeam == null) {
			subTeam = new EObjectContainmentWithInverseEList<TeamProfile>(TeamProfile.class, this, SpemPackage.TEAM_PROFILE__SUB_TEAM, SpemPackage.TEAM_PROFILE__SUPER_TEAM);
		}
		return subTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamProfile getSuperTeam() {
		if (eContainerFeatureID() != SpemPackage.TEAM_PROFILE__SUPER_TEAM) return null;
		return (TeamProfile)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperTeam(TeamProfile newSuperTeam, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuperTeam, SpemPackage.TEAM_PROFILE__SUPER_TEAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperTeam(TeamProfile newSuperTeam) {
		if (newSuperTeam != eInternalContainer() || (eContainerFeatureID() != SpemPackage.TEAM_PROFILE__SUPER_TEAM && newSuperTeam != null)) {
			if (EcoreUtil.isAncestor(this, newSuperTeam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuperTeam != null)
				msgs = ((InternalEObject)newSuperTeam).eInverseAdd(this, SpemPackage.TEAM_PROFILE__SUB_TEAM, TeamProfile.class, msgs);
			msgs = basicSetSuperTeam(newSuperTeam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.TEAM_PROFILE__SUPER_TEAM, newSuperTeam, newSuperTeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleUse> getTeamRole() {
		if (teamRole == null) {
			teamRole = new EObjectResolvingEList<RoleUse>(RoleUse.class, this, SpemPackage.TEAM_PROFILE__TEAM_ROLE);
		}
		return teamRole;
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
			case SpemPackage.TEAM_PROFILE__SUB_TEAM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubTeam()).basicAdd(otherEnd, msgs);
			case SpemPackage.TEAM_PROFILE__SUPER_TEAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuperTeam((TeamProfile)otherEnd, msgs);
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
			case SpemPackage.TEAM_PROFILE__SUB_TEAM:
				return ((InternalEList<?>)getSubTeam()).basicRemove(otherEnd, msgs);
			case SpemPackage.TEAM_PROFILE__SUPER_TEAM:
				return basicSetSuperTeam(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SpemPackage.TEAM_PROFILE__SUPER_TEAM:
				return eInternalContainer().eInverseRemove(this, SpemPackage.TEAM_PROFILE__SUB_TEAM, TeamProfile.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.TEAM_PROFILE__SUB_TEAM:
				return getSubTeam();
			case SpemPackage.TEAM_PROFILE__SUPER_TEAM:
				return getSuperTeam();
			case SpemPackage.TEAM_PROFILE__TEAM_ROLE:
				return getTeamRole();
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
			case SpemPackage.TEAM_PROFILE__SUB_TEAM:
				getSubTeam().clear();
				getSubTeam().addAll((Collection<? extends TeamProfile>)newValue);
				return;
			case SpemPackage.TEAM_PROFILE__SUPER_TEAM:
				setSuperTeam((TeamProfile)newValue);
				return;
			case SpemPackage.TEAM_PROFILE__TEAM_ROLE:
				getTeamRole().clear();
				getTeamRole().addAll((Collection<? extends RoleUse>)newValue);
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
			case SpemPackage.TEAM_PROFILE__SUB_TEAM:
				getSubTeam().clear();
				return;
			case SpemPackage.TEAM_PROFILE__SUPER_TEAM:
				setSuperTeam((TeamProfile)null);
				return;
			case SpemPackage.TEAM_PROFILE__TEAM_ROLE:
				getTeamRole().clear();
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
			case SpemPackage.TEAM_PROFILE__SUB_TEAM:
				return subTeam != null && !subTeam.isEmpty();
			case SpemPackage.TEAM_PROFILE__SUPER_TEAM:
				return getSuperTeam() != null;
			case SpemPackage.TEAM_PROFILE__TEAM_ROLE:
				return teamRole != null && !teamRole.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TeamProfileImpl
