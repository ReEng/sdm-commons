/**
 */
package de.upb.swt.core.ui.properties.tests.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.EnumAttribute#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.swt.core.ui.properties.tests.model.ModelPackage#getEnumAttribute()
 * @model
 * @generated
 */
public interface EnumAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute.
	 * The literals are from the enumeration {@link de.upb.swt.core.ui.properties.tests.model.EnumLiterals}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' attribute.
	 * @see de.upb.swt.core.ui.properties.tests.model.EnumLiterals
	 * @see #setLiteral(EnumLiterals)
	 * @see de.upb.swt.core.ui.properties.tests.model.ModelPackage#getEnumAttribute_Literal()
	 * @model required="true"
	 * @generated
	 */
	EnumLiterals getLiteral();

	/**
	 * Sets the value of the '{@link de.upb.swt.core.ui.properties.tests.model.EnumAttribute#getLiteral <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' attribute.
	 * @see de.upb.swt.core.ui.properties.tests.model.EnumLiterals
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(EnumLiterals value);

} // EnumAttribute
