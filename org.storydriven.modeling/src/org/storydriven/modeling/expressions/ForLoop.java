/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions;

import org.eclipse.emf.ecore.EAttribute;

import org.storydriven.modeling.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.ForLoop#getLoopVariable <em>Loop Variable</em>}</li>
 *   <li>{@link org.storydriven.modeling.expressions.ForLoop#getStartValue <em>Start Value</em>}</li>
 *   <li>{@link org.storydriven.modeling.expressions.ForLoop#getStopValue <em>Stop Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.expressions.ExpressionsPackage#getForLoop()
 * @model
 * @generated
 */
public interface ForLoop extends Expression
{
   /**
    * Returns the value of the '<em><b>Loop Variable</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Loop Variable</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Loop Variable</em>' containment reference.
    * @see #setLoopVariable(EAttribute)
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#getForLoop_LoopVariable()
    * @model containment="true" resolveProxies="true" required="true" ordered="false"
    * @generated
    */
   EAttribute getLoopVariable ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.expressions.ForLoop#getLoopVariable <em>Loop Variable</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Loop Variable</em>' containment reference.
    * @see #getLoopVariable()
    * @generated
    */
   void setLoopVariable (EAttribute value);

   /**
    * Returns the value of the '<em><b>Start Value</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Start Value</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Start Value</em>' containment reference.
    * @see #setStartValue(Expression)
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#getForLoop_StartValue()
    * @model containment="true" resolveProxies="true" required="true" ordered="false"
    * @generated
    */
   Expression getStartValue ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.expressions.ForLoop#getStartValue <em>Start Value</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Start Value</em>' containment reference.
    * @see #getStartValue()
    * @generated
    */
   void setStartValue (Expression value);

   /**
    * Returns the value of the '<em><b>Stop Value</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Stop Value</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Stop Value</em>' containment reference.
    * @see #setStopValue(Expression)
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#getForLoop_StopValue()
    * @model containment="true" resolveProxies="true" required="true" ordered="false"
    * @generated
    */
   Expression getStopValue ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.expressions.ForLoop#getStopValue <em>Stop Value</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Stop Value</em>' containment reference.
    * @see #getStopValue()
    * @generated
    */
   void setStopValue (Expression value);

} // ForLoop
