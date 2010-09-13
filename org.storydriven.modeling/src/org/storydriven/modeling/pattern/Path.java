/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.pattern;

import org.storydriven.modeling.Expression;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Path</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.modeling.pattern.Path#getPathExpression <em>Path Expression</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.modeling.pattern.PatternPackage#getPath()
 * @model
 * @generated
 */
public interface Path extends Link
{
   /**
    * Returns the value of the '<em><b>Path Expression</b></em>' containment reference. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Path Expression</em>' containment reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Path Expression</em>' containment reference.
    * @see #setPathExpression(Expression)
    * @see org.storydriven.modeling.pattern.PatternPackage#getPath_PathExpression()
    * @model containment="true" resolveProxies="true" required="true" ordered="false"
    * @generated
    */
   Expression getPathExpression ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.Path#getPathExpression <em>Path Expression</em>}' containment reference. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @param value the new value of the '<em>Path Expression</em>' containment reference.
    * @see #getPathExpression()
    * @generated
    */
   void setPathExpression (Expression value);

} // Path
