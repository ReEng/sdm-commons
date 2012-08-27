/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.core.expressions.common;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arithmetic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents arithmetic expressions like a + 5 or a * 7.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.core.expressions.common.ArithmeticExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.core.expressions.common.CommonExpressionsPackage#getArithmeticExpression()
 * @model
 * @generated
 */
public interface ArithmeticExpression extends BinaryExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.storydriven.core.expressions.common.ArithmeticOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the expression's arithmetic operator, e.g. +, -, *, /, or MODULO.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.storydriven.core.expressions.common.ArithmeticOperator
	 * @see #setOperator(ArithmeticOperator)
	 * @see org.storydriven.core.expressions.common.CommonExpressionsPackage#getArithmeticExpression_Operator()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ArithmeticOperator getOperator();

	/**
	 * Sets the value of the '{@link org.storydriven.core.expressions.common.ArithmeticExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.storydriven.core.expressions.common.ArithmeticOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ArithmeticOperator value);

} // ArithmeticExpression
