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
 * <li>{@link org.storydriven.modeling.pattern.ObjectPattern#getContainedObjects <em>Contained Objects</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.ObjectPattern#getStatements <em>Statement</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.ObjectPattern#getContainingNode <em>Containing Node</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.ObjectPattern#getParentPattern <em>Parent Pattern</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.ObjectPattern#getChildPatterns <em>Child Pattern</em>}</li>
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
    * Returns the value of the '<em><b>Contained Objects</b></em>' containment reference list. The list contents are of type {@link org.storydriven.modeling.pattern.Object}. It is
    * bidirectional and its opposite is '{@link org.storydriven.modeling.pattern.Object#getPattern <em>Pattern</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Contained Objects</em>' containment reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Contained Objects</em>' containment reference list.
    * @see org.storydriven.modeling.pattern.PatternPackage#getObjectPattern_ContainedObjects()
    * @see org.storydriven.modeling.pattern.Object#getPattern
    * @model opposite="pattern" containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   EList<org.storydriven.modeling.pattern.Object> getContainedObjects ();

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
    * Returns the value of the '<em><b>Containing Node</b></em>' container reference. It is bidirectional and its opposite is '
    * {@link org.storydriven.modeling.pattern.StoryNode#getContainedPattern <em>Contained Pattern</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Containing Node</em>' container reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Containing Node</em>' container reference.
    * @see #setContainingNode(StoryNode)
    * @see org.storydriven.modeling.pattern.PatternPackage#getObjectPattern_ContainingNode()
    * @see org.storydriven.modeling.pattern.StoryNode#getContainedPattern
    * @model opposite="containedPattern" transient="false" ordered="false"
    * @generated
    */
   StoryNode getContainingNode ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.ObjectPattern#getContainingNode <em>Containing Node</em>}' container reference. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @param value the new value of the '<em>Containing Node</em>' container reference.
    * @see #getContainingNode()
    * @generated
    */
   void setContainingNode (StoryNode value);

   /**
    * Returns the value of the '<em><b>Parent Pattern</b></em>' container reference. It is bidirectional and its opposite is '
    * {@link org.storydriven.modeling.pattern.ObjectPattern#getChildPatterns <em>Child Pattern</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parent Pattern</em>' container reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Parent Pattern</em>' container reference.
    * @see #setParentPattern(ObjectPattern)
    * @see org.storydriven.modeling.pattern.PatternPackage#getObjectPattern_ParentPattern()
    * @see org.storydriven.modeling.pattern.ObjectPattern#getChildPatterns
    * @model opposite="childPattern" transient="false" ordered="false"
    * @generated
    */
   ObjectPattern getParentPattern ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.ObjectPattern#getParentPattern <em>Parent Pattern</em>}' container reference. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @param value the new value of the '<em>Parent Pattern</em>' container reference.
    * @see #getParentPattern()
    * @generated
    */
   void setParentPattern (ObjectPattern value);

   /**
    * Returns the value of the '<em><b>Child Pattern</b></em>' containment reference list. The list contents are of type {@link org.storydriven.modeling.pattern.ObjectPattern}. It
    * is bidirectional and its opposite is '{@link org.storydriven.modeling.pattern.ObjectPattern#getParentPattern <em>Parent Pattern</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Child Pattern</em>' containment reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Child Pattern</em>' containment reference list.
    * @see org.storydriven.modeling.pattern.PatternPackage#getObjectPattern_ChildPattern()
    * @see org.storydriven.modeling.pattern.ObjectPattern#getParentPattern
    * @model opposite="parentPattern" containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   EList<ObjectPattern> getChildPatterns ();

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
