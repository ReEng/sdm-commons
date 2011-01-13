/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns;

import org.storydriven.modeling.ExtendableElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Link Order Constraint</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.LinkOrderConstraint#getIndex <em>Index</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.LinkOrderConstraint#getConstraintType <em>Constraint Type</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.LinkOrderConstraint#isNegative <em>Negative</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.LinkOrderConstraint#getFirstLink <em>First Link</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.LinkOrderConstraint#getReferencingObject <em>Referencing Object</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.LinkOrderConstraint#getSecondLink <em>Second Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.patterns.PatternsPackage#getLinkOrderConstraint()
 * @model
 * @generated
 */
public interface LinkOrderConstraint extends ExtendableElement
{
   /**
    * Returns the value of the '<em><b>Index</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Index</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Index</em>' attribute.
    * @see #setIndex(int)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getLinkOrderConstraint_Index()
    * @model required="true" ordered="false"
    * @generated
    */
   int getIndex ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.LinkOrderConstraint#getIndex <em>Index</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @param value the new value of the '<em>Index</em>' attribute.
    * @see #getIndex()
    * @generated
    */
   void setIndex (int value);

   /**
    * Returns the value of the '<em><b>Constraint Type</b></em>' attribute.
    * The default value is <code>"DIRECT"</code>.
    * The literals are from the enumeration {@link org.storydriven.modeling.patterns.OrderConstraintType}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Constraint Type</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Constraint Type</em>' attribute.
    * @see org.storydriven.modeling.patterns.OrderConstraintType
    * @see #setConstraintType(OrderConstraintType)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getLinkOrderConstraint_ConstraintType()
    * @model default="DIRECT" required="true" ordered="false"
    * @generated
    */
   OrderConstraintType getConstraintType ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.LinkOrderConstraint#getConstraintType <em>Constraint Type</em>}' attribute.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @param value the new value of the '<em>Constraint Type</em>' attribute.
    * @see org.storydriven.modeling.patterns.OrderConstraintType
    * @see #getConstraintType()
    * @generated
    */
   void setConstraintType (OrderConstraintType value);

   /**
    * Returns the value of the '<em><b>Negative</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Negative</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Negative</em>' attribute.
    * @see #setNegative(boolean)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getLinkOrderConstraint_Negative()
    * @model required="true" ordered="false"
    * @generated
    */
   boolean isNegative ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.LinkOrderConstraint#isNegative <em>Negative</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @param value the new value of the '<em>Negative</em>' attribute.
    * @see #isNegative()
    * @generated
    */
   void setNegative (boolean value);

   /**
    * Returns the value of the '<em><b>First Link</b></em>' reference.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getFirstLinkOrderConstraints <em>First Link Order Constraint</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>First Link</em>' reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>First Link</em>' reference.
    * @see #setFirstLink(AbstractLinkVariable)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getLinkOrderConstraint_FirstLink()
    * @see org.storydriven.modeling.patterns.AbstractLinkVariable#getFirstLinkOrderConstraints
    * @model opposite="firstLinkOrderConstraint" required="true" ordered="false"
    * @generated
    */
   AbstractLinkVariable getFirstLink ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.LinkOrderConstraint#getFirstLink <em>First Link</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @param value the new value of the '<em>First Link</em>' reference.
    * @see #getFirstLink()
    * @generated
    */
   void setFirstLink (AbstractLinkVariable value);

   /**
    * Returns the value of the '<em><b>Referencing Object</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.ObjectVariable#getLinkOrderConstraints <em>Link Order Constraint</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Referencing Object</em>' container reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Referencing Object</em>' container reference.
    * @see #setReferencingObject(ObjectVariable)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getLinkOrderConstraint_ReferencingObject()
    * @see org.storydriven.modeling.patterns.ObjectVariable#getLinkOrderConstraints
    * @model opposite="linkOrderConstraint" required="true" transient="false" ordered="false"
    * @generated
    */
   ObjectVariable getReferencingObject ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.LinkOrderConstraint#getReferencingObject <em>Referencing Object</em>}' container reference. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Referencing Object</em>' container reference.
    * @see #getReferencingObject()
    * @generated
    */
   void setReferencingObject (ObjectVariable value);

   /**
    * Returns the value of the '<em><b>Second Link</b></em>' reference.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getSecondLinkOrderConstraints <em>Second Link Order Constraint</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Second Link</em>' reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Second Link</em>' reference.
    * @see #setSecondLink(AbstractLinkVariable)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getLinkOrderConstraint_SecondLink()
    * @see org.storydriven.modeling.patterns.AbstractLinkVariable#getSecondLinkOrderConstraints
    * @model opposite="secondLinkOrderConstraint" required="true" ordered="false"
    * @generated
    */
   AbstractLinkVariable getSecondLink ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.LinkOrderConstraint#getSecondLink <em>Second Link</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @param value the new value of the '<em>Second Link</em>' reference.
    * @see #getSecondLink()
    * @generated
    */
   void setSecondLink (AbstractLinkVariable value);

} // LinkOrderConstraint
