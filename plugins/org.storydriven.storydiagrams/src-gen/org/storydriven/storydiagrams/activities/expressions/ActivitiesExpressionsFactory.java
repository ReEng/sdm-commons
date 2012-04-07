/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.activities.expressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.storydriven.storydiagrams.activities.expressions.ActivitiesExpressionsPackage
 * @generated
 */
public interface ActivitiesExpressionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivitiesExpressionsFactory eINSTANCE = org.storydriven.storydiagrams.activities.expressions.impl.ActivitiesExpressionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Exception Variable Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Variable Expression</em>'.
	 * @generated
	 */
	ExceptionVariableExpression createExceptionVariableExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ActivitiesExpressionsPackage getActivitiesExpressionsPackage();

} //ActivitiesExpressionsFactory
