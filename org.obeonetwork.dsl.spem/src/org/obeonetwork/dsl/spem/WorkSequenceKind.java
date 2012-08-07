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
 * A representation of the literals of the enumeration '<em><b>Work Sequence Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.spem.SpemPackage#getWorkSequenceKind()
 * @model
 * @generated
 */
public enum WorkSequenceKind implements Enumerator {
	/**
	 * The '<em><b>Finish To Start</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINISH_TO_START_VALUE
	 * @generated
	 * @ordered
	 */
	FINISH_TO_START(0, "finishToStart", "finishToStart"),

	/**
	 * The '<em><b>Finish To Finish</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINISH_TO_FINISH_VALUE
	 * @generated
	 * @ordered
	 */
	FINISH_TO_FINISH(1, "finishToFinish", "finishToFinish"),

	/**
	 * The '<em><b>Start To Start</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_TO_START_VALUE
	 * @generated
	 * @ordered
	 */
	START_TO_START(2, "startToStart", "startToStart"),

	/**
	 * The '<em><b>Start To Finish</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_TO_FINISH_VALUE
	 * @generated
	 * @ordered
	 */
	START_TO_FINISH(3, "startToFinish", "startToFinish");

	/**
	 * The '<em><b>Finish To Start</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Finish To Start</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINISH_TO_START
	 * @model name="finishToStart"
	 * @generated
	 * @ordered
	 */
	public static final int FINISH_TO_START_VALUE = 0;

	/**
	 * The '<em><b>Finish To Finish</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Finish To Finish</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINISH_TO_FINISH
	 * @model name="finishToFinish"
	 * @generated
	 * @ordered
	 */
	public static final int FINISH_TO_FINISH_VALUE = 1;

	/**
	 * The '<em><b>Start To Start</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Start To Start</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #START_TO_START
	 * @model name="startToStart"
	 * @generated
	 * @ordered
	 */
	public static final int START_TO_START_VALUE = 2;

	/**
	 * The '<em><b>Start To Finish</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Start To Finish</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #START_TO_FINISH
	 * @model name="startToFinish"
	 * @generated
	 * @ordered
	 */
	public static final int START_TO_FINISH_VALUE = 3;

	/**
	 * An array of all the '<em><b>Work Sequence Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WorkSequenceKind[] VALUES_ARRAY =
		new WorkSequenceKind[] {
			FINISH_TO_START,
			FINISH_TO_FINISH,
			START_TO_START,
			START_TO_FINISH,
		};

	/**
	 * A public read-only list of all the '<em><b>Work Sequence Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WorkSequenceKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Work Sequence Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkSequenceKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WorkSequenceKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Work Sequence Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkSequenceKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WorkSequenceKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Work Sequence Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkSequenceKind get(int value) {
		switch (value) {
			case FINISH_TO_START_VALUE: return FINISH_TO_START;
			case FINISH_TO_FINISH_VALUE: return FINISH_TO_FINISH;
			case START_TO_START_VALUE: return START_TO_START;
			case START_TO_FINISH_VALUE: return START_TO_FINISH;
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
	private WorkSequenceKind(int value, String name, String literal) {
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
	
} //WorkSequenceKind
