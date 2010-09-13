/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>String Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.modeling.StringExpression#getExpression <em>Expression</em>}</li>
 * <li>{@link org.storydriven.modeling.StringExpression#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.modeling.SDMPackage#getStringExpression()
 * @model
 * @generated
 */
public interface StringExpression extends Expression
{
   /**
    * Returns the value of the '<em><b>Expression</b></em>' attribute. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Expression</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Expression</em>' attribute.
    * @see #setExpression(String)
    * @see org.storydriven.modeling.SDMPackage#getStringExpression_Expression()
    * @model required="true" ordered="false"
    * @generated
    */
   String getExpression ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.StringExpression#getExpression <em>Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Expression</em>' attribute.
    * @see #getExpression()
    * @generated
    */
   void setExpression (String value);

   /**
    * Returns the value of the '<em><b>Language</b></em>' attribute. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Language</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Language</em>' attribute.
    * @see #setLanguage(String)
    * @see org.storydriven.modeling.SDMPackage#getStringExpression_Language()
    * @model required="true" ordered="false"
    * @generated
    */
   String getLanguage ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.StringExpression#getLanguage <em>Language</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Language</em>' attribute.
    * @see #getLanguage()
    * @generated
    */
   void setLanguage (String value);

} // StringExpression
