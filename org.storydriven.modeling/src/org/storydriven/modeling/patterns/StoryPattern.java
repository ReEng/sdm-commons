/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns;

import org.eclipse.emf.common.util.EList;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.templates.TemplateSignature;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Story Pattern</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.StoryPattern#getObjectVariables <em>Object Variable</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.StoryPattern#getLinkVariables <em>Link Variable</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.StoryPattern#getConstraints <em>Constraint</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.StoryPattern#getParentPattern <em>Parent Pattern</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.StoryPattern#getContainedPatterns <em>Contained Pattern</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.StoryPattern#getBindingType <em>Binding Type</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.StoryPattern#getTemplateSignature <em>Template Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.patterns.PatternsPackage#getStoryPattern()
 * @model
 * @generated
 */
public interface StoryPattern extends CommentableElement
{
   /**
    * Returns the value of the '<em><b>Object Variable</b></em>' containment reference list.
    * The list contents are of type {@link org.storydriven.modeling.patterns.ObjectVariable}.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.ObjectVariable#getPattern <em>Pattern</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Object Variable</em>' containment reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Object Variable</em>' containment reference list.
    * @see org.storydriven.modeling.patterns.PatternsPackage#getStoryPattern_ObjectVariable()
    * @see org.storydriven.modeling.patterns.ObjectVariable#getPattern
    * @model opposite="pattern" containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   EList<ObjectVariable> getObjectVariables ();

   /**
    * Returns the value of the '<em><b>Link Variable</b></em>' containment reference list.
    * The list contents are of type {@link org.storydriven.modeling.patterns.AbstractLinkVariable}.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getPattern <em>Pattern</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Link Variable</em>' containment reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Link Variable</em>' containment reference list.
    * @see org.storydriven.modeling.patterns.PatternsPackage#getStoryPattern_LinkVariable()
    * @see org.storydriven.modeling.patterns.AbstractLinkVariable#getPattern
    * @model opposite="pattern" containment="true" resolveProxies="true"
    * @generated
    */
   EList<AbstractLinkVariable> getLinkVariables ();

   /**
    * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
    * The list contents are of type {@link org.storydriven.modeling.patterns.Constraint}.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.Constraint#getPattern <em>Pattern</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Constraint</em>' containment reference list.
    * @see org.storydriven.modeling.patterns.PatternsPackage#getStoryPattern_Constraint()
    * @see org.storydriven.modeling.patterns.Constraint#getPattern
    * @model opposite="pattern" containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   EList<Constraint> getConstraints ();

   /**
    * Returns the value of the '<em><b>Parent Pattern</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.StoryPattern#getContainedPatterns <em>Contained Pattern</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parent Pattern</em>' container reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Parent Pattern</em>' container reference.
    * @see #setParentPattern(StoryPattern)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getStoryPattern_ParentPattern()
    * @see org.storydriven.modeling.patterns.StoryPattern#getContainedPatterns
    * @model opposite="containedPattern" transient="false" ordered="false"
    * @generated
    */
   StoryPattern getParentPattern ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.StoryPattern#getParentPattern <em>Parent Pattern</em>}' container reference.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @param value the new value of the '<em>Parent Pattern</em>' container reference.
    * @see #getParentPattern()
    * @generated
    */
   void setParentPattern (StoryPattern value);

   /**
    * Returns the value of the '<em><b>Contained Pattern</b></em>' containment reference list.
    * The list contents are of type {@link org.storydriven.modeling.patterns.StoryPattern}.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.StoryPattern#getParentPattern <em>Parent Pattern</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Contained Pattern</em>' containment reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Contained Pattern</em>' containment reference list.
    * @see org.storydriven.modeling.patterns.PatternsPackage#getStoryPattern_ContainedPattern()
    * @see org.storydriven.modeling.patterns.StoryPattern#getParentPattern
    * @model opposite="parentPattern" containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   EList<StoryPattern> getContainedPatterns ();

   /**
    * Returns the value of the '<em><b>Binding Type</b></em>' attribute.
    * The default value is <code>"NONE"</code>.
    * The literals are from the enumeration {@link org.storydriven.modeling.patterns.BindingSemantics}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Binding Type</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Binding Type</em>' attribute.
    * @see org.storydriven.modeling.patterns.BindingSemantics
    * @see #setBindingType(BindingSemantics)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getStoryPattern_BindingType()
    * @model default="NONE" required="true" ordered="false"
    * @generated
    */
   BindingSemantics getBindingType ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.StoryPattern#getBindingType <em>Binding Type</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @param value the new value of the '<em>Binding Type</em>' attribute.
    * @see org.storydriven.modeling.patterns.BindingSemantics
    * @see #getBindingType()
    * @generated
    */
   void setBindingType (BindingSemantics value);

   /**
    * Returns the value of the '<em><b>Template Signature</b></em>' containment reference.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.templates.TemplateSignature#getPattern <em>Pattern</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Template Signature</em>' containment reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Template Signature</em>' containment reference.
    * @see #setTemplateSignature(TemplateSignature)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getStoryPattern_TemplateSignature()
    * @see org.storydriven.modeling.templates.TemplateSignature#getPattern
    * @model opposite="pattern" containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   TemplateSignature getTemplateSignature ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.StoryPattern#getTemplateSignature <em>Template Signature</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Template Signature</em>' containment reference.
    * @see #getTemplateSignature()
    * @generated
    */
   void setTemplateSignature (TemplateSignature value);

} // StoryPattern
