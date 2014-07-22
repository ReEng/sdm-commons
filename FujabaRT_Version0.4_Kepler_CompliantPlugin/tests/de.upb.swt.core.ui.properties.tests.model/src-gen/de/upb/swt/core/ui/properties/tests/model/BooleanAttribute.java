/**
 */
package de.upb.swt.core.ui.properties.tests.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.BooleanAttribute#isBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link de.upb.swt.core.ui.properties.tests.model.BooleanAttribute#getBooleanObjectValue <em>Boolean Object Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.swt.core.ui.properties.tests.model.ModelPackage#getBooleanAttribute()
 * @model
 * @generated
 */
public interface BooleanAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Value</em>' attribute.
	 * @see #setBooleanValue(boolean)
	 * @see de.upb.swt.core.ui.properties.tests.model.ModelPackage#getBooleanAttribute_BooleanValue()
	 * @model required="true"
	 * @generated
	 */
	boolean isBooleanValue();

	/**
	 * Sets the value of the '{@link de.upb.swt.core.ui.properties.tests.model.BooleanAttribute#isBooleanValue <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Value</em>' attribute.
	 * @see #isBooleanValue()
	 * @generated
	 */
	void setBooleanValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Boolean Object Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Object Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Object Value</em>' attribute.
	 * @see #setBooleanObjectValue(Boolean)
	 * @see de.upb.swt.core.ui.properties.tests.model.ModelPackage#getBooleanAttribute_BooleanObjectValue()
	 * @model required="true"
	 * @generated
	 */
	Boolean getBooleanObjectValue();

	/**
	 * Sets the value of the '{@link de.upb.swt.core.ui.properties.tests.model.BooleanAttribute#getBooleanObjectValue <em>Boolean Object Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Object Value</em>' attribute.
	 * @see #getBooleanObjectValue()
	 * @generated
	 */
	void setBooleanObjectValue(Boolean value);

} // BooleanAttribute
