/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions;

import org.eclipse.emf.common.util.EList;

import org.storydriven.modeling.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.ComplexExpression#getChildExpressions <em>Child Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.expressions.ExpressionsPackage#getComplexExpression()
 * @model
 * @generated
 */
public interface ComplexExpression extends Expression
{
   /**
    * Returns the value of the '<em><b>Child Expression</b></em>' containment reference list.
    * The list contents are of type {@link org.storydriven.modeling.Expression}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Child Expression</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Child Expression</em>' containment reference list.
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#getComplexExpression_ChildExpression()
    * @model containment="true" resolveProxies="true" required="true"
    * @generated
    */
   EList<Expression> getChildExpressions ();

} // ComplexExpression
