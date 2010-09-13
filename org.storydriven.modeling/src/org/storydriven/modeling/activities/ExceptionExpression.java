/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.storydriven.modeling.Expression;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Exception Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.modeling.activities.ExceptionExpression#getExceptionTypes <em>Exception Type</em>}</li>
 * <li>{@link org.storydriven.modeling.activities.ExceptionExpression#getVariableName <em>Variable Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.modeling.activities.ActivitiesPackage#getExceptionExpression()
 * @model
 * @generated
 */
public interface ExceptionExpression extends Expression
{
   /**
    * Returns the value of the '<em><b>Exception Type</b></em>' reference list. The list contents are of type {@link org.eclipse.emf.ecore.EClassifier}. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Exception Type</em>' reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Exception Type</em>' reference list.
    * @see org.storydriven.modeling.activities.ActivitiesPackage#getExceptionExpression_ExceptionType()
    * @model ordered="false"
    * @generated
    */
   EList<EClassifier> getExceptionTypes ();

   /**
    * Returns the value of the '<em><b>Variable Name</b></em>' attribute. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Variable Name</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Variable Name</em>' attribute.
    * @see #setVariableName(String)
    * @see org.storydriven.modeling.activities.ActivitiesPackage#getExceptionExpression_VariableName()
    * @model required="true" ordered="false"
    * @generated
    */
   String getVariableName ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.activities.ExceptionExpression#getVariableName <em>Variable Name</em>}' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @param value the new value of the '<em>Variable Name</em>' attribute.
    * @see #getVariableName()
    * @generated
    */
   void setVariableName (String value);

} // ExceptionExpression
