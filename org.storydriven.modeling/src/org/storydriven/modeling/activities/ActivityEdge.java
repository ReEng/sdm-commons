/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities;

import org.storydriven.modeling.Expression;
import org.storydriven.modeling.ExtendableElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Activity Edge</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.modeling.activities.ActivityEdge#getTarget <em>Target</em>}</li>
 * <li>{@link org.storydriven.modeling.activities.ActivityEdge#getSource <em>Source</em>}</li>
 * <li>{@link org.storydriven.modeling.activities.ActivityEdge#getGuardType <em>Guard Type</em>}</li>
 * <li>{@link org.storydriven.modeling.activities.ActivityEdge#getOwnedGuardExpression <em>Owned Guard Expression</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.modeling.activities.ActivitiesPackage#getActivityEdge()
 * @model
 * @generated
 */
public interface ActivityEdge extends ExtendableElement
{
   /**
    * Returns the value of the '<em><b>Target</b></em>' reference. It is bidirectional and its opposite is '{@link org.storydriven.modeling.activities.ActivityNode#getIncomings
    * <em>Incoming</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Target</em>' reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Target</em>' reference.
    * @see #setTarget(ActivityNode)
    * @see org.storydriven.modeling.activities.ActivitiesPackage#getActivityEdge_Target()
    * @see org.storydriven.modeling.activities.ActivityNode#getIncomings
    * @model opposite="incoming" required="true" ordered="false"
    * @generated
    */
   ActivityNode getTarget ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.activities.ActivityEdge#getTarget <em>Target</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Target</em>' reference.
    * @see #getTarget()
    * @generated
    */
   void setTarget (ActivityNode value);

   /**
    * Returns the value of the '<em><b>Source</b></em>' container reference. It is bidirectional and its opposite is '
    * {@link org.storydriven.modeling.activities.ActivityNode#getOutgoings <em>Outgoing</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Source</em>' container reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Source</em>' container reference.
    * @see #setSource(ActivityNode)
    * @see org.storydriven.modeling.activities.ActivitiesPackage#getActivityEdge_Source()
    * @see org.storydriven.modeling.activities.ActivityNode#getOutgoings
    * @model opposite="outgoing" required="true" transient="false" ordered="false"
    * @generated
    */
   ActivityNode getSource ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.activities.ActivityEdge#getSource <em>Source</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Source</em>' container reference.
    * @see #getSource()
    * @generated
    */
   void setSource (ActivityNode value);

   /**
    * Returns the value of the '<em><b>Guard Type</b></em>' attribute. The default value is <code>"NONE"</code>. The literals are from the enumeration
    * {@link org.storydriven.modeling.activities.TransitionGuard}. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Guard Type</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Guard Type</em>' attribute.
    * @see org.storydriven.modeling.activities.TransitionGuard
    * @see #setGuardType(TransitionGuard)
    * @see org.storydriven.modeling.activities.ActivitiesPackage#getActivityEdge_GuardType()
    * @model default="NONE" required="true" ordered="false"
    * @generated
    */
   TransitionGuard getGuardType ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.activities.ActivityEdge#getGuardType <em>Guard Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Guard Type</em>' attribute.
    * @see org.storydriven.modeling.activities.TransitionGuard
    * @see #getGuardType()
    * @generated
    */
   void setGuardType (TransitionGuard value);

   /**
    * Returns the value of the '<em><b>Owned Guard Expression</b></em>' containment reference. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Owned Guard Expression</em>' containment reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Owned Guard Expression</em>' containment reference.
    * @see #setOwnedGuardExpression(Expression)
    * @see org.storydriven.modeling.activities.ActivitiesPackage#getActivityEdge_OwnedGuardExpression()
    * @model containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   Expression getOwnedGuardExpression ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.activities.ActivityEdge#getOwnedGuardExpression <em>Owned Guard Expression</em>}' containment reference. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Owned Guard Expression</em>' containment reference.
    * @see #getOwnedGuardExpression()
    * @generated
    */
   void setOwnedGuardExpression (Expression value);

} // ActivityEdge
