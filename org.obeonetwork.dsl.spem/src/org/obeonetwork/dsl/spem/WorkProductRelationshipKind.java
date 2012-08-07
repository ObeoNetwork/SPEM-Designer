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
 * A representation of the literals of the enumeration '<em><b>Work Product Relationship Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkProductRelationshipKind()
 * @model
 * @generated
 */
public enum WorkProductRelationshipKind implements Enumerator {
	/**
	 * The '<em><b>Impacted By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPACTED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	IMPACTED_BY(0, "impactedBy", "impactedBy"),

	/**
	 * The '<em><b>Composition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSITION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOSITION(1, "composition", "composition"),

	/**
	 * The '<em><b>Aggregation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGGREGATION_VALUE
	 * @generated
	 * @ordered
	 */
	AGGREGATION(2, "aggregation", "aggregation");

	/**
	 * The '<em><b>Impacted By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Impacted By</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPACTED_BY
	 * @model name="impactedBy"
	 * @generated
	 * @ordered
	 */
	public static final int IMPACTED_BY_VALUE = 0;

	/**
	 * The '<em><b>Composition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Composition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPOSITION
	 * @model name="composition"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITION_VALUE = 1;

	/**
	 * The '<em><b>Aggregation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aggregation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGGREGATION
	 * @model name="aggregation"
	 * @generated
	 * @ordered
	 */
	public static final int AGGREGATION_VALUE = 2;

	/**
	 * An array of all the '<em><b>Work Product Relationship Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WorkProductRelationshipKind[] VALUES_ARRAY =
		new WorkProductRelationshipKind[] {
			IMPACTED_BY,
			COMPOSITION,
			AGGREGATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Work Product Relationship Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WorkProductRelationshipKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Work Product Relationship Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkProductRelationshipKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WorkProductRelationshipKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Work Product Relationship Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkProductRelationshipKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WorkProductRelationshipKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Work Product Relationship Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkProductRelationshipKind get(int value) {
		switch (value) {
			case IMPACTED_BY_VALUE: return IMPACTED_BY;
			case COMPOSITION_VALUE: return COMPOSITION;
			case AGGREGATION_VALUE: return AGGREGATION;
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
	private WorkProductRelationshipKind(int value, String name, String literal) {
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
	
} //WorkProductRelationshipKind
