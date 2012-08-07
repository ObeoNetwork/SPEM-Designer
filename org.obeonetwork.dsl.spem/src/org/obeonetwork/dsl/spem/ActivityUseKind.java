/**
 * THALES (c)
 */
package org.obeonetwork.dsl.spem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Activity Use Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.spem.SpemPackage#getActivityUseKind()
 * @model
 * @generated
 */
public enum ActivityUseKind implements Enumerator {
	/**
	 * The '<em><b>Na</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NA_VALUE
	 * @generated
	 * @ordered
	 */
	NA(0, "na", "na"),

	/**
	 * The '<em><b>Extension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENSION(1, "extension", "extension"),

	/**
	 * The '<em><b>Local Contribution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_CONTRIBUTION_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_CONTRIBUTION(2, "localContribution", "localContribution"),

	/**
	 * The '<em><b>Local Replacement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_REPLACEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_REPLACEMENT(3, "localReplacement", "localReplacement");

	/**
	 * The '<em><b>Na</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Na</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NA
	 * @model name="na"
	 * @generated
	 * @ordered
	 */
	public static final int NA_VALUE = 0;

	/**
	 * The '<em><b>Extension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Extension</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTENSION
	 * @model name="extension"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION_VALUE = 1;

	/**
	 * The '<em><b>Local Contribution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Local Contribution</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCAL_CONTRIBUTION
	 * @model name="localContribution"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_CONTRIBUTION_VALUE = 2;

	/**
	 * The '<em><b>Local Replacement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Local Replacement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCAL_REPLACEMENT
	 * @model name="localReplacement"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_REPLACEMENT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Activity Use Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActivityUseKind[] VALUES_ARRAY =
		new ActivityUseKind[] {
			NA,
			EXTENSION,
			LOCAL_CONTRIBUTION,
			LOCAL_REPLACEMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Activity Use Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActivityUseKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Activity Use Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivityUseKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivityUseKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activity Use Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivityUseKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivityUseKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activity Use Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivityUseKind get(int value) {
		switch (value) {
			case NA_VALUE: return NA;
			case EXTENSION_VALUE: return EXTENSION;
			case LOCAL_CONTRIBUTION_VALUE: return LOCAL_CONTRIBUTION;
			case LOCAL_REPLACEMENT_VALUE: return LOCAL_REPLACEMENT;
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
	private ActivityUseKind(int value, String name, String literal) {
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
	
} //ActivityUseKind
