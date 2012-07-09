/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.core.expressions.common;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents binary, logic expressions like a AND b and a OR b.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.core.expressions.common.LogicExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.core.expressions.common.CommonExpressionsPackage#getLogicExpression()
 * @model
 * @generated
 */
public interface LogicExpression extends BinaryExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.storydriven.core.expressions.common.LogicOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the expression's logic operator, e.g. AND, OR, or XOR.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.storydriven.core.expressions.common.LogicOperator
	 * @see #setOperator(LogicOperator)
	 * @see org.storydriven.core.expressions.common.CommonExpressionsPackage#getLogicExpression_Operator()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LogicOperator getOperator();

	/**
	 * Sets the value of the '{@link org.storydriven.core.expressions.common.LogicExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.storydriven.core.expressions.common.LogicOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(LogicOperator value);

} // LogicExpression
