/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.pattern;

import org.eclipse.emf.common.util.EList;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.Expression;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Object Pattern</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.modeling.pattern.ObjectPattern#getOwnedObjects <em>Owned Objects</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.ObjectPattern#getStatements <em>Statement</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.ObjectPattern#getOwningNode <em>Owning Node</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.ObjectPattern#getOwningPattern <em>Owning Pattern</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.ObjectPattern#getOwnedPatterns <em>Owned Pattern</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.ObjectPattern#getConstraint <em>Constraint</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.ObjectPattern#getConstraintExpressions <em>Constraint Expression</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.modeling.pattern.PatternPackage#getObjectPattern()
 * @model
 * @generated
 */
public interface ObjectPattern extends CommentableElement
{
   /**
    * Returns the value of the '<em><b>Owned Objects</b></em>' containment reference list. The list contents are of type {@link org.storydriven.modeling.pattern.Object}. It is
    * bidirectional and its opposite is '{@link org.storydriven.modeling.pattern.Object#getPattern <em>Pattern</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Owned Objects</em>' containment reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Owned Objects</em>' containment reference list.
    * @see org.storydriven.modeling.pattern.PatternPackage#getObjectPattern_OwnedObjects()
    * @see org.storydriven.modeling.pattern.Object#getPattern
    * @model opposite="pattern" containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   EList<org.storydriven.modeling.pattern.Object> getOwnedObjects ();

   /**
    * Returns the value of the '<em><b>Statement</b></em>' containment reference list. The list contents are of type {@link org.storydriven.modeling.Expression}. <!--
    * begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Statement</em>' containment reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Statement</em>' containment reference list.
    * @see org.storydriven.modeling.pattern.PatternPackage#getObjectPattern_Statement()
    * @model containment="true" resolveProxies="true"
    * @generated
    */
   EList<Expression> getStatements ();

   /**
    * Returns the value of the '<em><b>Owning Node</b></em>' container reference. It is bidirectional and its opposite is '
    * {@link org.storydriven.modeling.pattern.StoryNode#getOwnedPattern <em>Owned Pattern</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Owning Node</em>' container reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Owning Node</em>' container reference.
    * @see #setOwningNode(StoryNode)
    * @see org.storydriven.modeling.pattern.PatternPackage#getObjectPattern_OwningNode()
    * @see org.storydriven.modeling.pattern.StoryNode#getOwnedPattern
    * @model opposite="ownedPattern" transient="false" ordered="false"
    * @generated
    */
   StoryNode getOwningNode ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.ObjectPattern#getOwningNode <em>Owning Node</em>}' container reference. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @param value the new value of the '<em>Owning Node</em>' container reference.
    * @see #getOwningNode()
    * @generated
    */
   void setOwningNode (StoryNode value);

   /**
    * Returns the value of the '<em><b>Owning Pattern</b></em>' container reference. It is bidirectional and its opposite is '
    * {@link org.storydriven.modeling.pattern.ObjectPattern#getOwnedPatterns <em>Owned Pattern</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Owning Pattern</em>' container reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Owning Pattern</em>' container reference.
    * @see #setOwningPattern(ObjectPattern)
    * @see org.storydriven.modeling.pattern.PatternPackage#getObjectPattern_OwningPattern()
    * @see org.storydriven.modeling.pattern.ObjectPattern#getOwnedPatterns
    * @model opposite="ownedPattern" transient="false" ordered="false"
    * @generated
    */
   ObjectPattern getOwningPattern ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.ObjectPattern#getOwningPattern <em>Owning Pattern</em>}' container reference. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @param value the new value of the '<em>Owning Pattern</em>' container reference.
    * @see #getOwningPattern()
    * @generated
    */
   void setOwningPattern (ObjectPattern value);

   /**
    * Returns the value of the '<em><b>Owned Pattern</b></em>' containment reference list. The list contents are of type {@link org.storydriven.modeling.pattern.ObjectPattern}. It
    * is bidirectional and its opposite is '{@link org.storydriven.modeling.pattern.ObjectPattern#getOwningPattern <em>Owning Pattern</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Owned Pattern</em>' containment reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Owned Pattern</em>' containment reference list.
    * @see org.storydriven.modeling.pattern.PatternPackage#getObjectPattern_OwnedPattern()
    * @see org.storydriven.modeling.pattern.ObjectPattern#getOwningPattern
    * @model opposite="owningPattern" containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   EList<ObjectPattern> getOwnedPatterns ();

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
    * @see org.storydriven.modeling.pattern.PatternPackage#getObjectPattern_Constraint()
    * @model default="NONE" required="true" ordered="false"
    * @generated
    */
   Constraint getConstraint ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.ObjectPattern#getConstraint <em>Constraint</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Constraint</em>' attribute.
    * @see org.storydriven.modeling.pattern.Constraint
    * @see #getConstraint()
    * @generated
    */
   void setConstraint (Constraint value);

   /**
    * Returns the value of the '<em><b>Constraint Expression</b></em>' containment reference list. The list contents are of type {@link org.storydriven.modeling.Expression}. <!--
    * begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Constraint Expression</em>' containment reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Constraint Expression</em>' containment reference list.
    * @see org.storydriven.modeling.pattern.PatternPackage#getObjectPattern_ConstraintExpression()
    * @model containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   EList<Expression> getConstraintExpressions ();

} // ObjectPattern
