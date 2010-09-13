/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.pattern;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;

import org.storydriven.modeling.Expression;
import org.storydriven.modeling.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.pattern.AttributeExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.AttributeExpression#getOwningObject <em>Owning Object</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.AttributeExpression#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.AttributeExpression#getValues <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.pattern.PatternPackage#getAttributeExpression()
 * @model
 * @generated
 */
public interface AttributeExpression extends NamedElement
{
   /**
    * Returns the value of the '<em><b>Operator</b></em>' attribute.
    * The default value is <code>"EQUAL"</code>.
    * The literals are from the enumeration {@link org.storydriven.modeling.pattern.Operator}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Operator</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Operator</em>' attribute.
    * @see org.storydriven.modeling.pattern.Operator
    * @see #setOperator(Operator)
    * @see org.storydriven.modeling.pattern.PatternPackage#getAttributeExpression_Operator()
    * @model default="EQUAL" required="true" ordered="false"
    * @generated
    */
   Operator getOperator ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.AttributeExpression#getOperator <em>Operator</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Operator</em>' attribute.
    * @see org.storydriven.modeling.pattern.Operator
    * @see #getOperator()
    * @generated
    */
   void setOperator (Operator value);

   /**
    * Returns the value of the '<em><b>Owning Object</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.pattern.Object#getOwnedAttributeExpressions <em>Owned Attribute Expression</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Owning Object</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Owning Object</em>' container reference.
    * @see #setOwningObject(org.storydriven.modeling.pattern.Object)
    * @see org.storydriven.modeling.pattern.PatternPackage#getAttributeExpression_OwningObject()
    * @see org.storydriven.modeling.pattern.Object#getOwnedAttributeExpressions
    * @model opposite="ownedAttributeExpression" required="true" transient="false" ordered="false"
    * @generated
    */
   org.storydriven.modeling.pattern.Object getOwningObject ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.AttributeExpression#getOwningObject <em>Owning Object</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Owning Object</em>' container reference.
    * @see #getOwningObject()
    * @generated
    */
   void setOwningObject (org.storydriven.modeling.pattern.Object value);

   /**
    * Returns the value of the '<em><b>Attribute</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Attribute</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Attribute</em>' reference.
    * @see #setAttribute(EAttribute)
    * @see org.storydriven.modeling.pattern.PatternPackage#getAttributeExpression_Attribute()
    * @model required="true" ordered="false"
    * @generated
    */
   EAttribute getAttribute ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.AttributeExpression#getAttribute <em>Attribute</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Attribute</em>' reference.
    * @see #getAttribute()
    * @generated
    */
   void setAttribute (EAttribute value);

   /**
    * Returns the value of the '<em><b>Value</b></em>' containment reference list.
    * The list contents are of type {@link org.storydriven.modeling.Expression}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Value</em>' containment reference list.
    * @see org.storydriven.modeling.pattern.PatternPackage#getAttributeExpression_Value()
    * @model containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   EList<Expression> getValues ();

} // AttributeExpression
