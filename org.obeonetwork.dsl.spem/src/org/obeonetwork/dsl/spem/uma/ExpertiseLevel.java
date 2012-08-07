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
 * A representation of the literals of the enumeration '<em><b>Expertise Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getExpertiseLevel()
 * @model
 * @generated
 */
public enum ExpertiseLevel implements Enumerator {
	/**
	 * The '<em><b>LOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOW_VALUE
	 * @generated
	 * @ordered
	 */
	LOW(0, "LOW", "LOW"),

	/**
	 * The '<em><b>MID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MID_VALUE
	 * @generated
	 * @ordered
	 */
	MID(1, "MID", "MID"),

	/**
	 * The '<em><b>LEVEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL(2, "LEVEL", "LEVEL");

	/**
	 * The '<em><b>LOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOW_VALUE = 0;

	/**
	 * The '<em><b>MID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MID_VALUE = 1;

	/**
	 * The '<em><b>LEVEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LEVEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEVEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Expertise Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExpertiseLevel[] VALUES_ARRAY =
		new ExpertiseLevel[] {
			LOW,
			MID,
			LEVEL,
		};

	/**
	 * A public read-only list of all the '<em><b>Expertise Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExpertiseLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Expertise Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpertiseLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExpertiseLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expertise Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpertiseLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExpertiseLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expertise Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpertiseLevel get(int value) {
		switch (value) {
			case LOW_VALUE: return LOW;
			case MID_VALUE: return MID;
			case LEVEL_VALUE: return LEVEL;
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
	private ExpertiseLevel(int value, String name, String literal) {
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
	
} //ExpertiseLevel
