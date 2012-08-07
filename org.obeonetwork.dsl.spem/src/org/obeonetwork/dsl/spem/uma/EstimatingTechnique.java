/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem.uma;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Estimating Technique</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getEstimatingTechnique()
 * @model
 * @generated
 */
public enum EstimatingTechnique implements Enumerator {
	/**
	 * The '<em><b>COST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COST_VALUE
	 * @generated
	 * @ordered
	 */
	COST(0, "COST", "COST"),

	/**
	 * The '<em><b>TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(1, "TIME", "TIME"),

	/**
	 * The '<em><b>SKILLS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SKILLS_VALUE
	 * @generated
	 * @ordered
	 */
	SKILLS(2, "SKILLS", "SKILLS"),

	/**
	 * The '<em><b>DEFECTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFECTS_VALUE
	 * @generated
	 * @ordered
	 */
	DEFECTS(3, "DEFECTS", "DEFECTS"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(4, "OTHER", "OTHER");

	/**
	 * The '<em><b>COST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COST_VALUE = 0;

	/**
	 * The '<em><b>TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_VALUE = 1;

	/**
	 * The '<em><b>SKILLS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SKILLS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SKILLS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SKILLS_VALUE = 2;

	/**
	 * The '<em><b>DEFECTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEFECTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFECTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEFECTS_VALUE = 3;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OTHER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Estimating Technique</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EstimatingTechnique[] VALUES_ARRAY =
		new EstimatingTechnique[] {
			COST,
			TIME,
			SKILLS,
			DEFECTS,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Estimating Technique</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EstimatingTechnique> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Estimating Technique</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EstimatingTechnique get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EstimatingTechnique result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Estimating Technique</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EstimatingTechnique getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EstimatingTechnique result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Estimating Technique</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EstimatingTechnique get(int value) {
		switch (value) {
			case COST_VALUE: return COST;
			case TIME_VALUE: return TIME;
			case SKILLS_VALUE: return SKILLS;
			case DEFECTS_VALUE: return DEFECTS;
			case OTHER_VALUE: return OTHER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EstimatingTechnique(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EstimatingTechnique
