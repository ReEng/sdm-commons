/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.core.expressions.common;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.storydriven.core.expressions.common.CommonExpressionsPackage
 * @generated
 */
public interface CommonExpressionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonExpressionsFactory eINSTANCE = org.storydriven.core.expressions.common.impl.CommonExpressionsFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Expression</em>'.
	 * @generated
	 */
	UnaryExpression createUnaryExpression();

	/**
	 * Returns a new object of class '<em>Comparison Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparison Expression</em>'.
	 * @generated
	 */
	ComparisonExpression createComparisonExpression();

	/**
	 * Returns a new object of class '<em>Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arithmetic Expression</em>'.
	 * @generated
	 */
	ArithmeticExpression createArithmeticExpression();

	/**
	 * Returns a new object of class '<em>Logic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logic Expression</em>'.
	 * @generated
	 */
	LogicExpression createLogicExpression();

	/**
	 * Returns a new object of class '<em>Boolean Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal Expression</em>'.
	 * @generated
	 */
	BooleanLiteralExpression createBooleanLiteralExpression();

	/**
	 * Returns a new object of class '<em>Integer Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Literal Expression</em>'.
	 * @generated
	 */
	IntegerLiteralExpression createIntegerLiteralExpression();

	/**
	 * Returns a new object of class '<em>Double Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Literal Expression</em>'.
	 * @generated
	 */
	DoubleLiteralExpression createDoubleLiteralExpression();

	/**
	 * Returns a new object of class '<em>String Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Literal Expression</em>'.
	 * @generated
	 */
	StringLiteralExpression createStringLiteralExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommonExpressionsPackage getCommonExpressionsPackage();

} //CommonExpressionsFactory
