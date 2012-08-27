/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.calls.expressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.storydriven.storydiagrams.calls.expressions.CallsExpressionsPackage
 * @generated
 */
public interface CallsExpressionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CallsExpressionsFactory eINSTANCE = org.storydriven.storydiagrams.calls.expressions.impl.CallsExpressionsFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Method Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Call Expression</em>'.
	 * @generated
	 */
	MethodCallExpression createMethodCallExpression();

	/**
	 * Returns a new object of class '<em>Parameter Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Expression</em>'.
	 * @generated
	 */
	ParameterExpression createParameterExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CallsExpressionsPackage getCallsExpressionsPackage();

} //CallsExpressionsFactory
