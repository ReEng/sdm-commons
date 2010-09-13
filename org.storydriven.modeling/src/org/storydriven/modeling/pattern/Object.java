/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.storydriven.modeling.Expression;
import org.storydriven.modeling.NamedElement;
import org.storydriven.modeling.TypedElement;
import org.storydriven.modeling.expressions.Collaboration;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Object</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.modeling.pattern.Object#getOwnedAttributeExpressions <em>Owned Attribute Expression</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.Object#getLinkToSources <em>Link To Source</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.Object#getLinkToTargets <em>Link To Target</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.Object#getPattern <em>Pattern</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.Object#getBound <em>Bound</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.Object#getConstraint <em>Constraint</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.Object#getModifier <em>Modifier</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.Object#getClassifier <em>Classifier</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.Object#getBindingExpression <em>Binding Expression</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.Object#getReceivedCollaborations <em>Received Collaboration</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.Object#getSentCollaborations <em>Sent Collaboration</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.modeling.pattern.PatternPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends TypedElement, NamedElement
{
   /**
    * Returns the value of the '<em><b>Owned Attribute Expression</b></em>' containment reference list. The list contents are of type
    * {@link org.storydriven.modeling.pattern.AttributeExpression}. It is bidirectional and its opposite is '
    * {@link org.storydriven.modeling.pattern.AttributeExpression#getOwningObject <em>Owning Object</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Owned Attribute Expression</em>' containment reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Owned Attribute Expression</em>' containment reference list.
    * @see org.storydriven.modeling.pattern.PatternPackage#getObject_OwnedAttributeExpression()
    * @see org.storydriven.modeling.pattern.AttributeExpression#getOwningObject
    * @model opposite="owningObject" containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   EList<AttributeExpression> getOwnedAttributeExpressions ();

   /**
    * Returns the value of the '<em><b>Link To Source</b></em>' reference list. The list contents are of type {@link org.storydriven.modeling.pattern.Link}. It is bidirectional and
    * its opposite is '{@link org.storydriven.modeling.pattern.Link#getTarget <em>Target</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Link To Source</em>' reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Link To Source</em>' reference list.
    * @see org.storydriven.modeling.pattern.PatternPackage#getObject_LinkToSource()
    * @see org.storydriven.modeling.pattern.Link#getTarget
    * @model opposite="target" ordered="false"
    * @generated
    */
   EList<Link> getLinkToSources ();

   /**
    * Returns the value of the '<em><b>Link To Target</b></em>' containment reference list. The list contents are of type {@link org.storydriven.modeling.pattern.Link}. It is
    * bidirectional and its opposite is '{@link org.storydriven.modeling.pattern.Link#getSource <em>Source</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Link To Target</em>' containment reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Link To Target</em>' containment reference list.
    * @see org.storydriven.modeling.pattern.PatternPackage#getObject_LinkToTarget()
    * @see org.storydriven.modeling.pattern.Link#getSource
    * @model opposite="source" containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   EList<Link> getLinkToTargets ();

   /**
    * Returns the value of the '<em><b>Pattern</b></em>' container reference. It is bidirectional and its opposite is '
    * {@link org.storydriven.modeling.pattern.ObjectPattern#getContainedObjects <em>Contained Objects</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Pattern</em>' container reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Pattern</em>' container reference.
    * @see #setPattern(ObjectPattern)
    * @see org.storydriven.modeling.pattern.PatternPackage#getObject_Pattern()
    * @see org.storydriven.modeling.pattern.ObjectPattern#getContainedObjects
    * @model opposite="containedObjects" transient="false" ordered="false"
    * @generated
    */
   ObjectPattern getPattern ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.Object#getPattern <em>Pattern</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Pattern</em>' container reference.
    * @see #getPattern()
    * @generated
    */
   void setPattern (ObjectPattern value);

   /**
    * Returns the value of the '<em><b>Bound</b></em>' attribute. The default value is <code>"UNBOUND"</code>. The literals are from the enumeration
    * {@link org.storydriven.modeling.pattern.BoundType}. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Bound</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Bound</em>' attribute.
    * @see org.storydriven.modeling.pattern.BoundType
    * @see #setBound(BoundType)
    * @see org.storydriven.modeling.pattern.PatternPackage#getObject_Bound()
    * @model default="UNBOUND" required="true" ordered="false"
    * @generated
    */
   BoundType getBound ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.Object#getBound <em>Bound</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Bound</em>' attribute.
    * @see org.storydriven.modeling.pattern.BoundType
    * @see #getBound()
    * @generated
    */
   void setBound (BoundType value);

   /**
    * Returns the value of the '<em><b>Constraint</b></em>' attribute. The default value is <code>"NONE"</code>. The literals are from the enumeration
    * {@link org.storydriven.modeling.pattern.Constraint}. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Constraint</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Constraint</em>' attribute.
    * @see org.storydriven.modeling.pattern.Constraint
    * @see #setConstraint(Constraint)
    * @see org.storydriven.modeling.pattern.PatternPackage#getObject_Constraint()
    * @model default="NONE" required="true" ordered="false"
    * @generated
    */
   Constraint getConstraint ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.Object#getConstraint <em>Constraint</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Constraint</em>' attribute.
    * @see org.storydriven.modeling.pattern.Constraint
    * @see #getConstraint()
    * @generated
    */
   void setConstraint (Constraint value);

   /**
    * Returns the value of the '<em><b>Modifier</b></em>' attribute. The default value is <code>"NONE"</code>. The literals are from the enumeration
    * {@link org.storydriven.modeling.pattern.Modifier}. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Modifier</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Modifier</em>' attribute.
    * @see org.storydriven.modeling.pattern.Modifier
    * @see #setModifier(Modifier)
    * @see org.storydriven.modeling.pattern.PatternPackage#getObject_Modifier()
    * @model default="NONE" required="true" ordered="false"
    * @generated
    */
   Modifier getModifier ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.Object#getModifier <em>Modifier</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Modifier</em>' attribute.
    * @see org.storydriven.modeling.pattern.Modifier
    * @see #getModifier()
    * @generated
    */
   void setModifier (Modifier value);

   /**
    * Returns the value of the '<em><b>Classifier</b></em>' reference.
    * <p>
    * This feature redefines the following features:
    * <ul>
    * <li>'{@link org.storydriven.modeling.TypedElement#getType() <em>Type</em>}'</li>
    * </ul>
    * </p>
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Classifier</em>' reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Classifier</em>' reference.
    * @see #setClassifier(EClass)
    * @see org.storydriven.modeling.pattern.PatternPackage#getObject_Classifier()
    * @model required="true" volatile="true" ordered="false"
    * @generated
    */
   EClass getClassifier ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.Object#getClassifier <em>Classifier</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Classifier</em>' reference.
    * @see #getClassifier()
    * @generated
    */
   void setClassifier (EClass value);

   /**
    * Returns the value of the '<em><b>Binding Expression</b></em>' containment reference. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Binding Expression</em>' containment reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Binding Expression</em>' containment reference.
    * @see #setBindingExpression(Expression)
    * @see org.storydriven.modeling.pattern.PatternPackage#getObject_BindingExpression()
    * @model containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   Expression getBindingExpression ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.Object#getBindingExpression <em>Binding Expression</em>}' containment reference. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @param value the new value of the '<em>Binding Expression</em>' containment reference.
    * @see #getBindingExpression()
    * @generated
    */
   void setBindingExpression (Expression value);

   /**
    * Returns the value of the '<em><b>Received Collaboration</b></em>' reference list. The list contents are of type {@link org.storydriven.modeling.expressions.Collaboration}. It
    * is bidirectional and its opposite is '{@link org.storydriven.modeling.expressions.Collaboration#getTargets <em>Target</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Received Collaboration</em>' reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Received Collaboration</em>' reference list.
    * @see org.storydriven.modeling.pattern.PatternPackage#getObject_ReceivedCollaboration()
    * @see org.storydriven.modeling.expressions.Collaboration#getTargets
    * @model opposite="target" ordered="false"
    * @generated
    */
   EList<Collaboration> getReceivedCollaborations ();

   /**
    * Returns the value of the '<em><b>Sent Collaboration</b></em>' reference list. The list contents are of type {@link org.storydriven.modeling.expressions.Collaboration}. It is
    * bidirectional and its opposite is '{@link org.storydriven.modeling.expressions.Collaboration#getSource <em>Source</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Sent Collaboration</em>' reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Sent Collaboration</em>' reference list.
    * @see org.storydriven.modeling.pattern.PatternPackage#getObject_SentCollaboration()
    * @see org.storydriven.modeling.expressions.Collaboration#getSource
    * @model opposite="source" ordered="false"
    * @generated
    */
   EList<Collaboration> getSentCollaborations ();

} // Object
