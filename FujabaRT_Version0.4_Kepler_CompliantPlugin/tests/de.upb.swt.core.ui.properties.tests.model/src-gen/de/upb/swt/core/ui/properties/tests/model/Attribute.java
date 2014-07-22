/**
 */
package de.upb.swt.core.ui.properties.tests.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.Attribute#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.swt.core.ui.properties.tests.model.ModelPackage#getAttribute()
 * @model abstract="true"
 * @generated
 */
public interface Attribute extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.upb.swt.core.ui.properties.tests.model.Type#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' container reference.
	 * @see #setType(Type)
	 * @see de.upb.swt.core.ui.properties.tests.model.ModelPackage#getAttribute_Type()
	 * @see de.upb.swt.core.ui.properties.tests.model.Type#getAttributes
	 * @model opposite="attributes" required="true" transient="false"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link de.upb.swt.core.ui.properties.tests.model.Attribute#getType <em>Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' container reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Attribute
