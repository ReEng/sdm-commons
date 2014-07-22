/**
 */
package de.upb.swt.core.ui.properties.tests.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.TypeAttribute#getReferencedType <em>Referenced Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.swt.core.ui.properties.tests.model.ModelPackage#getTypeAttribute()
 * @model
 * @generated
 */
public interface TypeAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Referenced Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Type</em>' reference.
	 * @see #setReferencedType(Type)
	 * @see de.upb.swt.core.ui.properties.tests.model.ModelPackage#getTypeAttribute_ReferencedType()
	 * @model required="true"
	 * @generated
	 */
	Type getReferencedType();

	/**
	 * Sets the value of the '{@link de.upb.swt.core.ui.properties.tests.model.TypeAttribute#getReferencedType <em>Referenced Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Type</em>' reference.
	 * @see #getReferencedType()
	 * @generated
	 */
	void setReferencedType(Type value);

} // TypeAttribute
