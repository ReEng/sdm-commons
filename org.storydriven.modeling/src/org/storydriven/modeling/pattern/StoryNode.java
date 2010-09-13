/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.pattern;

import org.storydriven.modeling.activities.ActivityNode;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Story Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.modeling.pattern.StoryNode#isForEach <em>For Each</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.StoryNode#getContainedPattern <em>Contained Pattern</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.modeling.pattern.PatternPackage#getStoryNode()
 * @model
 * @generated
 */
public interface StoryNode extends ActivityNode
{
   /**
    * Returns the value of the '<em><b>For Each</b></em>' attribute. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>For Each</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>For Each</em>' attribute.
    * @see #setForEach(boolean)
    * @see org.storydriven.modeling.pattern.PatternPackage#getStoryNode_ForEach()
    * @model required="true" ordered="false"
    * @generated
    */
   boolean isForEach ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.StoryNode#isForEach <em>For Each</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>For Each</em>' attribute.
    * @see #isForEach()
    * @generated
    */
   void setForEach (boolean value);

   /**
    * Returns the value of the '<em><b>Contained Pattern</b></em>' containment reference. It is bidirectional and its opposite is '
    * {@link org.storydriven.modeling.pattern.ObjectPattern#getContainingNode <em>Containing Node</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Contained Pattern</em>' containment reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Contained Pattern</em>' containment reference.
    * @see #setContainedPattern(ObjectPattern)
    * @see org.storydriven.modeling.pattern.PatternPackage#getStoryNode_ContainedPattern()
    * @see org.storydriven.modeling.pattern.ObjectPattern#getContainingNode
    * @model opposite="containingNode" containment="true" resolveProxies="true" required="true" ordered="false"
    * @generated
    */
   ObjectPattern getContainedPattern ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.pattern.StoryNode#getContainedPattern <em>Contained Pattern</em>}' containment reference. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @param value the new value of the '<em>Contained Pattern</em>' containment reference.
    * @see #getContainedPattern()
    * @generated
    */
   void setContainedPattern (ObjectPattern value);

} // StoryNode
