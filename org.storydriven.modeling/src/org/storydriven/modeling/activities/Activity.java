/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities;

import org.eclipse.emf.common.util.EList;

import org.storydriven.modeling.CommentableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.activities.Activity#getOwnedActivityNodes <em>Owned Activity Node</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.Activity#getOwningOperation <em>Owning Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.activities.ActivitiesPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends CommentableElement
{
   /**
    * Returns the value of the '<em><b>Owned Activity Node</b></em>' containment reference list.
    * The list contents are of type {@link org.storydriven.modeling.activities.ActivityNode}.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.activities.ActivityNode#getOwningActivity <em>Owning Activity</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Owned Activity Node</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Owned Activity Node</em>' containment reference list.
    * @see org.storydriven.modeling.activities.ActivitiesPackage#getActivity_OwnedActivityNode()
    * @see org.storydriven.modeling.activities.ActivityNode#getOwningActivity
    * @model opposite="owningActivity" containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   EList<ActivityNode> getOwnedActivityNodes ();

   /**
    * Returns the value of the '<em><b>Owning Operation</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.storydriven.modeling.activities.OperationExtension#getOwnedActivity <em>Owned Activity</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Owning Operation</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Owning Operation</em>' container reference.
    * @see #setOwningOperation(OperationExtension)
    * @see org.storydriven.modeling.activities.ActivitiesPackage#getActivity_OwningOperation()
    * @see org.storydriven.modeling.activities.OperationExtension#getOwnedActivity
    * @model opposite="ownedActivity" transient="false" ordered="false"
    * @generated
    */
   OperationExtension getOwningOperation ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.activities.Activity#getOwningOperation <em>Owning Operation</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Owning Operation</em>' container reference.
    * @see #getOwningOperation()
    * @generated
    */
   void setOwningOperation (OperationExtension value);

} // Activity
