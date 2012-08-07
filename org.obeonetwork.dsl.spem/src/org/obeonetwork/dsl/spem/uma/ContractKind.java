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
 * A representation of the literals of the enumeration '<em><b>Contract Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.spem.uma.UmaPackage#getContractKind()
 * @model
 * @generated
 */
public enum ContractKind implements Enumerator {
	/**
	 * The '<em><b>EXPRESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPRESS_VALUE
	 * @generated
	 * @ordered
	 */
	EXPRESS(1, "EXPRESS", "EXPRESS"),

	/**
	 * The '<em><b>IMPLIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLIED_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLIED(2, "IMPLIED", "IMPLIED"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(2, "OTHER", "OTHER");

	/**
	 * The '<em><b>EXPRESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXPRESS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPRESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPRESS_VALUE = 1;

	/**
	 * The '<em><b>IMPLIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMPLIED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPLIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMPLIED_VALUE = 2;

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
	public static final int OTHER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Contract Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContractKind[] VALUES_ARRAY =
		new ContractKind[] {
			EXPRESS,
			IMPLIED,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Contract Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContractKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Contract Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContractKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContractKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contract Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContractKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContractKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contract Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContractKind get(int value) {
		switch (value) {
			case EXPRESS_VALUE: return EXPRESS;
			case IMPLIED_VALUE: return IMPLIED;
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
	private ContractKind(int value, String name, String literal) {
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
	
} //ContractKind
