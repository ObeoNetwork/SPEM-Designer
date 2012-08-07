/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.dsl.spem.TaskDefinition;

import org.obeonetwork.dsl.spem.impl.CategoryImpl;

import org.obeonetwork.dsl.spem.uma.Discipline;
import org.obeonetwork.dsl.spem.uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discipline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.DisciplineImpl#getRelatedTask <em>Related Task</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.spem.uma.impl.DisciplineImpl#getRelatedWorflow <em>Related Worflow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DisciplineImpl extends CategoryImpl implements Discipline {
	/**
	 * The cached value of the '{@link #getRelatedTask() <em>Related Task</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedTask()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskDefinition> relatedTask;

	/**
	 * The cached value of the '{@link #getRelatedWorflow() <em>Related Worflow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedWorflow()
	 * @generated
	 * @ordered
	 */
	protected EList<org.obeonetwork.dsl.spem.uma.Process> relatedWorflow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisciplineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.Literals.DISCIPLINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskDefinition> getRelatedTask() {
		if (relatedTask == null) {
			relatedTask = new EObjectResolvingEList<TaskDefinition>(TaskDefinition.class, this, UmaPackage.DISCIPLINE__RELATED_TASK);
		}
		return relatedTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.obeonetwork.dsl.spem.uma.Process> getRelatedWorflow() {
		if (relatedWorflow == null) {
			relatedWorflow = new EObjectResolvingEList<org.obeonetwork.dsl.spem.uma.Process>(org.obeonetwork.dsl.spem.uma.Process.class, this, UmaPackage.DISCIPLINE__RELATED_WORFLOW);
		}
		return relatedWorflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.DISCIPLINE__RELATED_TASK:
				return getRelatedTask();
			case UmaPackage.DISCIPLINE__RELATED_WORFLOW:
				return getRelatedWorflow();
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
			case UmaPackage.DISCIPLINE__RELATED_TASK:
				getRelatedTask().clear();
				getRelatedTask().addAll((Collection<? extends TaskDefinition>)newValue);
				return;
			case UmaPackage.DISCIPLINE__RELATED_WORFLOW:
				getRelatedWorflow().clear();
				getRelatedWorflow().addAll((Collection<? extends org.obeonetwork.dsl.spem.uma.Process>)newValue);
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
			case UmaPackage.DISCIPLINE__RELATED_TASK:
				getRelatedTask().clear();
				return;
			case UmaPackage.DISCIPLINE__RELATED_WORFLOW:
				getRelatedWorflow().clear();
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
			case UmaPackage.DISCIPLINE__RELATED_TASK:
				return relatedTask != null && !relatedTask.isEmpty();
			case UmaPackage.DISCIPLINE__RELATED_WORFLOW:
				return relatedWorflow != null && !relatedWorflow.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DisciplineImpl
