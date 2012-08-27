/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.activities.expressions;

import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.activities.ExceptionVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Variable Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the value of an exception variable declared as a transition guard (the guard of an activity edge).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.activities.expressions.ExceptionVariableExpression#getExceptionVariable <em>Exception Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.storydiagrams.activities.expressions.ActivitiesExpressionsPackage#getExceptionVariableExpression()
 * @model
 * @generated
 */
public interface ExceptionVariableExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Exception Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the exception variable that this expression refers to. If you have an activity edge that catches an exception e, then this expression can represent the reference e.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception Variable</em>' reference.
	 * @see #setExceptionVariable(ExceptionVariable)
	 * @see org.storydriven.storydiagrams.activities.expressions.ActivitiesExpressionsPackage#getExceptionVariableExpression_ExceptionVariable()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ExceptionVariable getExceptionVariable();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.activities.expressions.ExceptionVariableExpression#getExceptionVariable <em>Exception Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Variable</em>' reference.
	 * @see #getExceptionVariable()
	 * @generated
	 */
	void setExceptionVariable(ExceptionVariable value);

} // ExceptionVariableExpression
