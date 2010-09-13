/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.OperationExtension;

import org.storydriven.modeling.impl.ExtensionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.activities.impl.OperationExtensionImpl#getOwnedActivity <em>Owned Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationExtensionImpl extends ExtensionImpl implements OperationExtension
{
   /**
    * The cached value of the '{@link #getOwnedActivity() <em>Owned Activity</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOwnedActivity()
    * @generated
    * @ordered
    */
   protected Activity ownedActivity;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected OperationExtensionImpl ()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass ()
   {
      return ActivitiesPackage.Literals.OPERATION_EXTENSION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Activity getOwnedActivity ()
   {
      if (ownedActivity != null && ownedActivity.eIsProxy())
      {
         InternalEObject oldOwnedActivity = (InternalEObject) ownedActivity;
         ownedActivity = (Activity) eResolveProxy(oldOwnedActivity);
         if (ownedActivity != oldOwnedActivity)
         {
            InternalEObject newOwnedActivity = (InternalEObject) ownedActivity;
            NotificationChain msgs = oldOwnedActivity.eInverseRemove(this,
               ActivitiesPackage.ACTIVITY__OWNING_OPERATION, Activity.class, null);
            if (newOwnedActivity.eInternalContainer() == null)
            {
               msgs = newOwnedActivity.eInverseAdd(this, ActivitiesPackage.ACTIVITY__OWNING_OPERATION, Activity.class,
                  msgs);
            }
            if (msgs != null)
               msgs.dispatch();
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY, oldOwnedActivity, ownedActivity));
         }
      }
      return ownedActivity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Activity basicGetOwnedActivity ()
   {
      return ownedActivity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetOwnedActivity (Activity newOwnedActivity, NotificationChain msgs)
   {
      Activity oldOwnedActivity = ownedActivity;
      ownedActivity = newOwnedActivity;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY, oldOwnedActivity, newOwnedActivity);
         if (msgs == null)
            msgs = notification;
         else
            msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setOwnedActivity (Activity newOwnedActivity)
   {
      if (newOwnedActivity != ownedActivity)
      {
         NotificationChain msgs = null;
         if (ownedActivity != null)
            msgs = ((InternalEObject) ownedActivity).eInverseRemove(this, ActivitiesPackage.ACTIVITY__OWNING_OPERATION,
               Activity.class, msgs);
         if (newOwnedActivity != null)
            msgs = ((InternalEObject) newOwnedActivity).eInverseAdd(this, ActivitiesPackage.ACTIVITY__OWNING_OPERATION,
               Activity.class, msgs);
         msgs = basicSetOwnedActivity(newOwnedActivity, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY,
            newOwnedActivity, newOwnedActivity));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY:
            if (ownedActivity != null)
               msgs = ((InternalEObject) ownedActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                  - ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY, null, msgs);
            return basicSetOwnedActivity((Activity) otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY:
            return basicSetOwnedActivity(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet (int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
         case ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY:
            if (resolve)
               return getOwnedActivity();
            return basicGetOwnedActivity();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet (int featureID, Object newValue)
   {
      switch (featureID)
      {
         case ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY:
            setOwnedActivity((Activity) newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset (int featureID)
   {
      switch (featureID)
      {
         case ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY:
            setOwnedActivity((Activity) null);
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet (int featureID)
   {
      switch (featureID)
      {
         case ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY:
            return ownedActivity != null;
      }
      return super.eIsSet(featureID);
   }

} //OperationExtensionImpl
