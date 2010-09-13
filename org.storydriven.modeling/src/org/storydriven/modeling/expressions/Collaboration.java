/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions;

import org.eclipse.emf.common.util.EList;
import org.storydriven.modeling.Expression;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Collaboration</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.modeling.expressions.Collaboration#getSource <em>Source</em>}</li>
 * <li>{@link org.storydriven.modeling.expressions.Collaboration#getTargets <em>Target</em>}</li>
 * <li>{@link org.storydriven.modeling.expressions.Collaboration#getBody <em>Body</em>}</li>
 * <li>{@link org.storydriven.modeling.expressions.Collaboration#isForEach <em>For Each</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.modeling.expressions.ExpressionsPackage#getCollaboration()
 * @model
 * @generated
 */
public interface Collaboration extends Expression
{
   /**
    * Returns the value of the '<em><b>Source</b></em>' reference. It is bidirectional and its opposite is '{@link org.storydriven.modeling.pattern.Object#getSentCollaborations
    * <em>Sent Collaboration</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Source</em>' reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Source</em>' reference.
    * @see #setSource(org.storydriven.modeling.pattern.Object)
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#getCollaboration_Source()
    * @see org.storydriven.modeling.pattern.Object#getSentCollaborations
    * @model opposite="sentCollaboration" ordered="false"
    * @generated
    */
   org.storydriven.modeling.pattern.Object getSource ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.expressions.Collaboration#getSource <em>Source</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Source</em>' reference.
    * @see #getSource()
    * @generated
    */
   void setSource (org.storydriven.modeling.pattern.Object value);

   /**
    * Returns the value of the '<em><b>Target</b></em>' reference list. The list contents are of type {@link org.storydriven.modeling.pattern.Object}. It is bidirectional and its
    * opposite is '{@link org.storydriven.modeling.pattern.Object#getReceivedCollaborations <em>Received Collaboration</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Target</em>' reference list isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Target</em>' reference list.
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#getCollaboration_Target()
    * @see org.storydriven.modeling.pattern.Object#getReceivedCollaborations
    * @model opposite="receivedCollaboration" ordered="false"
    * @generated
    */
   EList<org.storydriven.modeling.pattern.Object> getTargets ();

   /**
    * Returns the value of the '<em><b>Body</b></em>' containment reference. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Body</em>' containment reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Body</em>' containment reference.
    * @see #setBody(Expression)
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#getCollaboration_Body()
    * @model containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   Expression getBody ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.expressions.Collaboration#getBody <em>Body</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Body</em>' containment reference.
    * @see #getBody()
    * @generated
    */
   void setBody (Expression value);

   /**
    * Returns the value of the '<em><b>For Each</b></em>' attribute. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>For Each</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>For Each</em>' attribute.
    * @see #setForEach(boolean)
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#getCollaboration_ForEach()
    * @model required="true" ordered="false"
    * @generated
    */
   boolean isForEach ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.expressions.Collaboration#isForEach <em>For Each</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>For Each</em>' attribute.
    * @see #isForEach()
    * @generated
    */
   void setForEach (boolean value);

} // Collaboration
