/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions;

import org.storydriven.modeling.Expression;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Conditional Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.modeling.expressions.ConditionalExpression#getCondition <em>Condition</em>}</li>
 * <li>{@link org.storydriven.modeling.expressions.ConditionalExpression#getThen <em>Then</em>}</li>
 * <li>{@link org.storydriven.modeling.expressions.ConditionalExpression#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.modeling.expressions.ExpressionsPackage#getConditionalExpression()
 * @model
 * @generated
 */
public interface ConditionalExpression extends Expression
{
   /**
    * Returns the value of the '<em><b>Condition</b></em>' containment reference. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Condition</em>' containment reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Condition</em>' containment reference.
    * @see #setCondition(Expression)
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#getConditionalExpression_Condition()
    * @model containment="true" resolveProxies="true" required="true" ordered="false"
    * @generated
    */
   Expression getCondition ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.expressions.ConditionalExpression#getCondition <em>Condition</em>}' containment reference. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @param value the new value of the '<em>Condition</em>' containment reference.
    * @see #getCondition()
    * @generated
    */
   void setCondition (Expression value);

   /**
    * Returns the value of the '<em><b>Then</b></em>' containment reference. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Then</em>' containment reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Then</em>' containment reference.
    * @see #setThen(Expression)
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#getConditionalExpression_Then()
    * @model containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   Expression getThen ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.expressions.ConditionalExpression#getThen <em>Then</em>}' containment reference. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @param value the new value of the '<em>Then</em>' containment reference.
    * @see #getThen()
    * @generated
    */
   void setThen (Expression value);

   /**
    * Returns the value of the '<em><b>Else</b></em>' containment reference. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Else</em>' containment reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Else</em>' containment reference.
    * @see #setElse(Expression)
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#getConditionalExpression_Else()
    * @model containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   Expression getElse ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.expressions.ConditionalExpression#getElse <em>Else</em>}' containment reference. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @param value the new value of the '<em>Else</em>' containment reference.
    * @see #getElse()
    * @generated
    */
   void setElse (Expression value);

} // ConditionalExpression
