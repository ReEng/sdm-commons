/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.patterns.expressions;

import org.eclipse.emf.ecore.EAttribute;
import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.patterns.ObjectVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the value of an object's attribute, e.g. obj.attr for an object obj and an attribute attr.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.patterns.expressions.AttributeValueExpression#getObject <em>Object</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.patterns.expressions.AttributeValueExpression#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.storydiagrams.patterns.expressions.PatternsExpressionsPackage#getAttributeValueExpression()
 * @model
 * @generated
 */
public interface AttributeValueExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the object variable whose attribute value is represented by this expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(ObjectVariable)
	 * @see org.storydriven.storydiagrams.patterns.expressions.PatternsExpressionsPackage#getAttributeValueExpression_Object()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ObjectVariable getObject();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.patterns.expressions.AttributeValueExpression#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(ObjectVariable value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the object's attribute whose attribute value is represented by this expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(EAttribute)
	 * @see org.storydriven.storydiagrams.patterns.expressions.PatternsExpressionsPackage#getAttributeValueExpression_Attribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EAttribute getAttribute();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.patterns.expressions.AttributeValueExpression#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(EAttribute value);

} // AttributeValueExpression
