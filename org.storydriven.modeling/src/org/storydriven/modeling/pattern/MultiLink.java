/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.pattern;

import org.storydriven.modeling.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.pattern.MultiLink#getIndex <em>Index</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.MultiLink#getMultiLinkType <em>Multi Link Type</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.MultiLink#isNegative <em>Negative</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.MultiLink#getSourceLink <em>Source Link</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.MultiLink#getTargetObject <em>Target Object</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.MultiLink#getTargetLink <em>Target Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.pattern.PatternPackage#getMultiLink()
 * @model
 * @generated
 */
public interface MultiLink extends ExtendableElement
{
   /**
    * Returns the value of the '<em><b>Index</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Index</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Index</em>' attribute.
    * @see #setIndex(int)
    * @see org.storydriven.modeling.pattern.PatternPackage#getMultiLink_Index()
    * @model required="true" ordered="false"
    * @generated
    */
   int getIndex ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.MultiLink#getIndex <em>Index</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Index</em>' attribute.
    * @see #getIndex()
    * @generated
    */
   void setIndex (int value);

   /**
    * Returns the value of the '<em><b>Multi Link Type</b></em>' attribute.
    * The default value is <code>"DIRECT"</code>.
    * The literals are from the enumeration {@link org.storydriven.modeling.pattern.MultiLinkType}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Multi Link Type</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Multi Link Type</em>' attribute.
    * @see org.storydriven.modeling.pattern.MultiLinkType
    * @see #setMultiLinkType(MultiLinkType)
    * @see org.storydriven.modeling.pattern.PatternPackage#getMultiLink_MultiLinkType()
    * @model default="DIRECT" required="true" ordered="false"
    * @generated
    */
   MultiLinkType getMultiLinkType ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.MultiLink#getMultiLinkType <em>Multi Link Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Multi Link Type</em>' attribute.
    * @see org.storydriven.modeling.pattern.MultiLinkType
    * @see #getMultiLinkType()
    * @generated
    */
   void setMultiLinkType (MultiLinkType value);

   /**
    * Returns the value of the '<em><b>Negative</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Negative</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Negative</em>' attribute.
    * @see #setNegative(boolean)
    * @see org.storydriven.modeling.pattern.PatternPackage#getMultiLink_Negative()
    * @model required="true" ordered="false"
    * @generated
    */
   boolean isNegative ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.MultiLink#isNegative <em>Negative</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Negative</em>' attribute.
    * @see #isNegative()
    * @generated
    */
   void setNegative (boolean value);

   /**
    * Returns the value of the '<em><b>Source Link</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.pattern.Link#getMultiLinkFromSources <em>Multi Link From Source</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Source Link</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Source Link</em>' container reference.
    * @see #setSourceLink(Link)
    * @see org.storydriven.modeling.pattern.PatternPackage#getMultiLink_SourceLink()
    * @see org.storydriven.modeling.pattern.Link#getMultiLinkFromSources
    * @model opposite="multiLinkFromSource" required="true" transient="false" ordered="false"
    * @generated
    */
   Link getSourceLink ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.MultiLink#getSourceLink <em>Source Link</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Source Link</em>' container reference.
    * @see #getSourceLink()
    * @generated
    */
   void setSourceLink (Link value);

   /**
    * Returns the value of the '<em><b>Target Object</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Target Object</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Target Object</em>' reference.
    * @see #setTargetObject(org.storydriven.modeling.pattern.Object)
    * @see org.storydriven.modeling.pattern.PatternPackage#getMultiLink_TargetObject()
    * @model ordered="false"
    * @generated
    */
   org.storydriven.modeling.pattern.Object getTargetObject ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.MultiLink#getTargetObject <em>Target Object</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Target Object</em>' reference.
    * @see #getTargetObject()
    * @generated
    */
   void setTargetObject (org.storydriven.modeling.pattern.Object value);

   /**
    * Returns the value of the '<em><b>Target Link</b></em>' reference.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.pattern.Link#getMultiLinkToTargets <em>Multi Link To Target</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Target Link</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Target Link</em>' reference.
    * @see #setTargetLink(Link)
    * @see org.storydriven.modeling.pattern.PatternPackage#getMultiLink_TargetLink()
    * @see org.storydriven.modeling.pattern.Link#getMultiLinkToTargets
    * @model opposite="multiLinkToTarget" required="true" ordered="false"
    * @generated
    */
   Link getTargetLink ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.MultiLink#getTargetLink <em>Target Link</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Target Link</em>' reference.
    * @see #getTargetLink()
    * @generated
    */
   void setTargetLink (Link value);

} // MultiLink
