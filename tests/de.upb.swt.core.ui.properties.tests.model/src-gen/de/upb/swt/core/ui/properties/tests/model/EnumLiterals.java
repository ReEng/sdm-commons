/**
 */
package de.upb.swt.core.ui.properties.tests.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Literals</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.upb.swt.core.ui.properties.tests.model.ModelPackage#getEnumLiterals()
 * @model
 * @generated
 */
public enum EnumLiterals implements Enumerator {
	/**
	 * The '<em><b>FIRST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST(0, "FIRST", "FIRST"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>SECOND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND_VALUE
	 * @generated
	 * @ordered
	 */
	SECOND(0, "SECOND", "SECOND"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>THIRD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRD_VALUE
	 * @generated
	 * @ordered
	 */
	THIRD(0, "THIRD", "THIRD"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>FIRST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIRST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIRST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_VALUE = 0;

	/**
	 * The '<em><b>SECOND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SECOND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECOND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECOND_VALUE = 0;

	/**
	 * The '<em><b>THIRD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THIRD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THIRD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THIRD_VALUE = 0;

	/**
	 * An array of all the '<em><b>Enum Literals</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumLiterals[] VALUES_ARRAY = new EnumLiterals[] { FIRST, SECOND, THIRD, };

	/**
	 * A public read-only list of all the '<em><b>Enum Literals</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumLiterals> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Literals</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumLiterals get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumLiterals result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Literals</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumLiterals getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumLiterals result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Literals</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumLiterals get(int value) {
		switch (value) {
		case FIRST_VALUE:
			return FIRST;
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
	private EnumLiterals(int value, String name, String literal) {
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

} //EnumLiterals
