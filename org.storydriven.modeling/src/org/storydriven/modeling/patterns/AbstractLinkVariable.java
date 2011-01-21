/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns;

import org.eclipse.emf.common.util.EList;
import org.storydriven.modeling.NamedElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Abstract Link Variable</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getBindingSemantics <em>Binding Semantics</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getBindingOperator <em>Binding Operator</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getTarget <em>Target</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getSecondLinkOrderConstraints <em>Second Link Order Constraint</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getFirstLinkOrderConstraints <em>First Link Order Constraint</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getBindingState <em>Binding State</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.patterns.PatternsPackage#getAbstractLinkVariable()
 * @model abstract="true"
 * @generated
 */
public interface AbstractLinkVariable extends NamedElement
{
   /**
    * Returns the value of the '<em><b>Binding Semantics</b></em>' attribute.
    * The default value is <code>"MANDATORY"</code>.
    * The literals are from the enumeration {@link org.storydriven.modeling.patterns.BindingSemantics}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Binding Semantics</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Binding Semantics</em>' attribute.
    * @see org.storydriven.modeling.patterns.BindingSemantics
    * @see #setBindingSemantics(BindingSemantics)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getAbstractLinkVariable_BindingSemantics()
    * @model default="MANDATORY" required="true" ordered="false"
    * @generated
    */
   BindingSemantics getBindingSemantics ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getBindingSemantics <em>Binding Semantics</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Binding Semantics</em>' attribute.
    * @see org.storydriven.modeling.patterns.BindingSemantics
    * @see #getBindingSemantics()
    * @generated
    */
   void setBindingSemantics (BindingSemantics value);

   /**
    * Returns the value of the '<em><b>Binding Operator</b></em>' attribute.
    * The default value is <code>"CHECK"</code>.
    * The literals are from the enumeration {@link org.storydriven.modeling.patterns.BindingOperator}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Binding Operator</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Binding Operator</em>' attribute.
    * @see org.storydriven.modeling.patterns.BindingOperator
    * @see #setBindingOperator(BindingOperator)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getAbstractLinkVariable_BindingOperator()
    * @model default="CHECK" required="true" ordered="false"
    * @generated
    */
   BindingOperator getBindingOperator ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getBindingOperator <em>Binding Operator</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Binding Operator</em>' attribute.
    * @see org.storydriven.modeling.patterns.BindingOperator
    * @see #getBindingOperator()
    * @generated
    */
   void setBindingOperator (BindingOperator value);

   /**
    * Returns the value of the '<em><b>Target</b></em>' reference.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.ObjectVariable#getIncomingLinks <em>Incoming Link</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Target</em>' reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Target</em>' reference.
    * @see #setTarget(ObjectVariable)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getAbstractLinkVariable_Target()
    * @see org.storydriven.modeling.patterns.ObjectVariable#getIncomingLinks
    * @model opposite="incomingLink" required="true" ordered="false"
    * @generated
    */
   ObjectVariable getTarget ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getTarget <em>Target</em>}' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @param value the new value of the '<em>Target</em>' reference.
    * @see #getTarget()
    * @generated
    */
   void setTarget (ObjectVariable value);

   /**
    * Returns the value of the '<em><b>Second Link Order Constraint</b></em>' reference list.
    * The list contents are of type {@link org.storydriven.modeling.patterns.LinkOrderConstraint}.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.LinkOrderConstraint#getSecondLink <em>Second Link</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Second Link Order Constraint</em>' reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Second Link Order Constraint</em>' reference list.
    * @see org.storydriven.modeling.patterns.PatternsPackage#getAbstractLinkVariable_SecondLinkOrderConstraint()
    * @see org.storydriven.modeling.patterns.LinkOrderConstraint#getSecondLink
    * @model opposite="secondLink" ordered="false"
    * @generated
    */
   EList<LinkOrderConstraint> getSecondLinkOrderConstraints ();

   /**
    * Returns the value of the '<em><b>First Link Order Constraint</b></em>' reference list.
    * The list contents are of type {@link org.storydriven.modeling.patterns.LinkOrderConstraint}.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.LinkOrderConstraint#getFirstLink <em>First Link</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>First Link Order Constraint</em>' reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>First Link Order Constraint</em>' reference list.
    * @see org.storydriven.modeling.patterns.PatternsPackage#getAbstractLinkVariable_FirstLinkOrderConstraint()
    * @see org.storydriven.modeling.patterns.LinkOrderConstraint#getFirstLink
    * @model opposite="firstLink" ordered="false"
    * @generated
    */
   EList<LinkOrderConstraint> getFirstLinkOrderConstraints ();

   /**
    * Returns the value of the '<em><b>Binding State</b></em>' attribute. The literals are from the enumeration {@link org.storydriven.modeling.patterns.BindingState}. <!--
    * begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Binding State</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Binding State</em>' attribute.
    * @see org.storydriven.modeling.patterns.BindingState
    * @see #setBindingState(BindingState)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getAbstractLinkVariable_BindingState()
    * @model required="true" ordered="false"
    * @generated
    */
   BindingState getBindingState ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getBindingState <em>Binding State</em>}' attribute.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @param value the new value of the '<em>Binding State</em>' attribute.
    * @see org.storydriven.modeling.patterns.BindingState
    * @see #getBindingState()
    * @generated
    */
   void setBindingState (BindingState value);

   /**
    * Returns the value of the '<em><b>Pattern</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.StoryPattern#getLinkVariables <em>Link Variable</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Pattern</em>' container reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Pattern</em>' container reference.
    * @see #setPattern(StoryPattern)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getAbstractLinkVariable_Pattern()
    * @see org.storydriven.modeling.patterns.StoryPattern#getLinkVariables
    * @model opposite="linkVariable" required="true" transient="false" ordered="false"
    * @generated
    */
   StoryPattern getPattern ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getPattern <em>Pattern</em>}' container reference.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @param value the new value of the '<em>Pattern</em>' container reference.
    * @see #getPattern()
    * @generated
    */
   void setPattern (StoryPattern value);

   /**
    * Returns the value of the '<em><b>Source</b></em>' reference.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.ObjectVariable#getOutgoingLinks <em>Outgoing Link</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Source</em>' reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Source</em>' reference.
    * @see #setSource(ObjectVariable)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getAbstractLinkVariable_Source()
    * @see org.storydriven.modeling.patterns.ObjectVariable#getOutgoingLinks
    * @model opposite="outgoingLink" required="true" ordered="false"
    * @generated
    */
   ObjectVariable getSource ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getSource <em>Source</em>}' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @param value the new value of the '<em>Source</em>' reference.
    * @see #getSource()
    * @generated
    */
   void setSource (ObjectVariable value);

} // AbstractLinkVariable
