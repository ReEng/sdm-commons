/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.storydriven.modeling.NamedElement;
import org.storydriven.modeling.TypedElement;
import org.storydriven.modeling.Variable;
import org.storydriven.modeling.expressions.Expression;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Object Variable</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.ObjectVariable#getBindingState <em>Binding State</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.ObjectVariable#getBindingSemantics <em>Binding Semantics</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.ObjectVariable#getBindingOperator <em>Binding Operator</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.ObjectVariable#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.ObjectVariable#getAttributeAssignments <em>Attribute Assignment</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.ObjectVariable#getOutgoingLinks <em>Outgoing Link</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.ObjectVariable#getIncomingLinks <em>Incoming Link</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.ObjectVariable#getLinkOrderConstraints <em>Link Order Constraint</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.ObjectVariable#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.ObjectVariable#getBindingExpression <em>Binding Expression</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.ObjectVariable#getConstraints <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.patterns.PatternsPackage#getObjectVariable()
 * @model
 * @generated
 */
public interface ObjectVariable extends Variable, NamedElement
{
   /**
    * Returns the value of the '<em><b>Binding State</b></em>' attribute.
    * The default value is <code>"UNBOUND"</code>.
    * The literals are from the enumeration {@link org.storydriven.modeling.patterns.BindingState}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Binding State</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Binding State</em>' attribute.
    * @see org.storydriven.modeling.patterns.BindingState
    * @see #setBindingState(BindingState)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getObjectVariable_BindingState()
    * @model default="UNBOUND" required="true" ordered="false"
    * @generated
    */
   BindingState getBindingState ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.ObjectVariable#getBindingState <em>Binding State</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @param value the new value of the '<em>Binding State</em>' attribute.
    * @see org.storydriven.modeling.patterns.BindingState
    * @see #getBindingState()
    * @generated
    */
   void setBindingState (BindingState value);

   /**
    * Returns the value of the '<em><b>Binding Semantics</b></em>' attribute.
    * The default value is <code>"NONE"</code>.
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
    * @see org.storydriven.modeling.patterns.PatternsPackage#getObjectVariable_BindingSemantics()
    * @model default="NONE" required="true" ordered="false"
    * @generated
    */
   BindingSemantics getBindingSemantics ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.ObjectVariable#getBindingSemantics <em>Binding Semantics</em>}' attribute.
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
    * @see org.storydriven.modeling.patterns.PatternsPackage#getObjectVariable_BindingOperator()
    * @model default="CHECK" required="true" ordered="false"
    * @generated
    */
   BindingOperator getBindingOperator ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.ObjectVariable#getBindingOperator <em>Binding Operator</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Binding Operator</em>' attribute.
    * @see org.storydriven.modeling.patterns.BindingOperator
    * @see #getBindingOperator()
    * @generated
    */
   void setBindingOperator (BindingOperator value);

   /**
    * Returns the value of the '<em><b>Pattern</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.StoryPattern#getObjectVariables <em>Object Variable</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Pattern</em>' container reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Pattern</em>' container reference.
    * @see #setPattern(StoryPattern)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getObjectVariable_Pattern()
    * @see org.storydriven.modeling.patterns.StoryPattern#getObjectVariables
    * @model opposite="objectVariable" required="true" transient="false" ordered="false"
    * @generated
    */
   StoryPattern getPattern ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.ObjectVariable#getPattern <em>Pattern</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @param value the new value of the '<em>Pattern</em>' container reference.
    * @see #getPattern()
    * @generated
    */
   void setPattern (StoryPattern value);

   /**
    * Returns the value of the '<em><b>Outgoing Link</b></em>' reference list.
    * The list contents are of type {@link org.storydriven.modeling.patterns.AbstractLinkVariable}.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getSource <em>Source</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Outgoing Link</em>' reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Outgoing Link</em>' reference list.
    * @see org.storydriven.modeling.patterns.PatternsPackage#getObjectVariable_OutgoingLink()
    * @see org.storydriven.modeling.patterns.AbstractLinkVariable#getSource
    * @model opposite="source" ordered="false"
    * @generated
    */
   EList<AbstractLinkVariable> getOutgoingLinks ();

   /**
    * Returns the value of the '<em><b>Incoming Link</b></em>' reference list.
    * The list contents are of type {@link org.storydriven.modeling.patterns.AbstractLinkVariable}.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getTarget <em>Target</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Incoming Link</em>' reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Incoming Link</em>' reference list.
    * @see org.storydriven.modeling.patterns.PatternsPackage#getObjectVariable_IncomingLink()
    * @see org.storydriven.modeling.patterns.AbstractLinkVariable#getTarget
    * @model opposite="target" ordered="false"
    * @generated
    */
   EList<AbstractLinkVariable> getIncomingLinks ();

   /**
    * Returns the value of the '<em><b>Link Order Constraint</b></em>' containment reference list.
    * The list contents are of type {@link org.storydriven.modeling.patterns.LinkOrderConstraint}.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.LinkOrderConstraint#getReferencingObject <em>Referencing Object</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Link Order Constraint</em>' containment reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Link Order Constraint</em>' containment reference list.
    * @see org.storydriven.modeling.patterns.PatternsPackage#getObjectVariable_LinkOrderConstraint()
    * @see org.storydriven.modeling.patterns.LinkOrderConstraint#getReferencingObject
    * @model opposite="referencingObject" containment="true" resolveProxies="true"
    * @generated
    */
   EList<LinkOrderConstraint> getLinkOrderConstraints ();

   /**
    * Returns the value of the '<em><b>Classifier</b></em>' reference.
    * <p>
    * This feature subsets the following features:
    * <ul>
    *   <li>'{@link org.storydriven.modeling.TypedElement#getType() <em>Type</em>}'</li>
    * </ul>
    * </p>
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Classifier</em>' reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Classifier</em>' reference.
    * @see #setClassifier(EClass)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getObjectVariable_Classifier()
    * @model required="true" ordered="false"
    * @generated
    */
   EClass getClassifier ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.ObjectVariable#getClassifier <em>Classifier</em>}' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @param value the new value of the '<em>Classifier</em>' reference.
    * @see #getClassifier()
    * @generated
    */
   void setClassifier (EClass value);

   /**
    * Returns the value of the '<em><b>Binding Expression</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Binding Expression</em>' containment reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Binding Expression</em>' containment reference.
    * @see #setBindingExpression(Expression)
    * @see org.storydriven.modeling.patterns.PatternsPackage#getObjectVariable_BindingExpression()
    * @model containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   Expression getBindingExpression ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.patterns.ObjectVariable#getBindingExpression <em>Binding Expression</em>}' containment reference.
    * <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * @param value the new value of the '<em>Binding Expression</em>' containment reference.
    * @see #getBindingExpression()
    * @generated
    */
   void setBindingExpression (Expression value);

   /**
    * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
    * The list contents are of type {@link org.storydriven.modeling.patterns.Constraint}.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.Constraint#getObjectVariable <em>Object Variable</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Constraint</em>' containment reference list.
    * @see org.storydriven.modeling.patterns.PatternsPackage#getObjectVariable_Constraint()
    * @see org.storydriven.modeling.patterns.Constraint#getObjectVariable
    * @model opposite="objectVariable" containment="true" resolveProxies="true"
    * @generated
    */
   EList<Constraint> getConstraints ();

   /**
    * Returns the value of the '<em><b>Attribute Assignment</b></em>' containment reference list.
    * The list contents are of type {@link org.storydriven.modeling.patterns.AttributeAssignment}.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.patterns.AttributeAssignment#getObjectVariable <em>Object Variable</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Attribute Assignment</em>' containment reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Attribute Assignment</em>' containment reference list.
    * @see org.storydriven.modeling.patterns.PatternsPackage#getObjectVariable_AttributeAssignment()
    * @see org.storydriven.modeling.patterns.AttributeAssignment#getObjectVariable
    * @model opposite="objectVariable" containment="true" resolveProxies="true"
    * @generated
    */
   EList<AttributeAssignment> getAttributeAssignments ();

} // ObjectVariable
