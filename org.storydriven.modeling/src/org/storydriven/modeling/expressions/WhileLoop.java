/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions;

import org.storydriven.modeling.Expression;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>While Loop</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.modeling.expressions.WhileLoop#getLoopCondition <em>Loop Condition</em>}</li>
 * <li>{@link org.storydriven.modeling.expressions.WhileLoop#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.modeling.expressions.ExpressionsPackage#getWhileLoop()
 * @model
 * @generated
 */
public interface WhileLoop extends Expression
{
   /**
    * Returns the value of the '<em><b>Loop Condition</b></em>' containment reference. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Loop Condition</em>' containment reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Loop Condition</em>' containment reference.
    * @see #setLoopCondition(Expression)
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#getWhileLoop_LoopCondition()
    * @model containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   Expression getLoopCondition ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.expressions.WhileLoop#getLoopCondition <em>Loop Condition</em>}' containment reference. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @param value the new value of the '<em>Loop Condition</em>' containment reference.
    * @see #getLoopCondition()
    * @generated
    */
   void setLoopCondition (Expression value);

   /**
    * Returns the value of the '<em><b>Body</b></em>' containment reference. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Body</em>' containment reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Body</em>' containment reference.
    * @see #setBody(Expression)
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#getWhileLoop_Body()
    * @model containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   Expression getBody ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.expressions.WhileLoop#getBody <em>Body</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Body</em>' containment reference.
    * @see #getBody()
    * @generated
    */
   void setBody (Expression value);

} // WhileLoop
