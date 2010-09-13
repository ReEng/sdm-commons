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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.storydriven.modeling.Expression;

import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.activities.TransitionGuard;

import org.storydriven.modeling.impl.ExtendableElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.activities.impl.ActivityEdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.ActivityEdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.ActivityEdgeImpl#getGuardType <em>Guard Type</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.ActivityEdgeImpl#getOwnedGuardExpression <em>Owned Guard Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityEdgeImpl extends ExtendableElementImpl implements ActivityEdge
{
   /**
    * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTarget()
    * @generated
    * @ordered
    */
   protected ActivityNode target;

   /**
    * The default value of the '{@link #getGuardType() <em>Guard Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getGuardType()
    * @generated
    * @ordered
    */
   protected static final TransitionGuard GUARD_TYPE_EDEFAULT = TransitionGuard.NONE;

   /**
    * The cached value of the '{@link #getGuardType() <em>Guard Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getGuardType()
    * @generated
    * @ordered
    */
   protected TransitionGuard guardType = GUARD_TYPE_EDEFAULT;

   /**
    * The cached value of the '{@link #getOwnedGuardExpression() <em>Owned Guard Expression</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOwnedGuardExpression()
    * @generated
    * @ordered
    */
   protected Expression ownedGuardExpression;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ActivityEdgeImpl ()
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
      return ActivitiesPackage.Literals.ACTIVITY_EDGE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ActivityNode getTarget ()
   {
      if (target != null && target.eIsProxy())
      {
         InternalEObject oldTarget = (InternalEObject) target;
         target = (ActivityNode) eResolveProxy(oldTarget);
         if (target != oldTarget)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitiesPackage.ACTIVITY_EDGE__TARGET,
                  oldTarget, target));
         }
      }
      return target;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ActivityNode basicGetTarget ()
   {
      return target;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetTarget (ActivityNode newTarget, NotificationChain msgs)
   {
      ActivityNode oldTarget = target;
      target = newTarget;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            ActivitiesPackage.ACTIVITY_EDGE__TARGET, oldTarget, newTarget);
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
   public void setTarget (ActivityNode newTarget)
   {
      if (newTarget != target)
      {
         NotificationChain msgs = null;
         if (target != null)
            msgs = ((InternalEObject) target).eInverseRemove(this, ActivitiesPackage.ACTIVITY_NODE__INCOMING,
               ActivityNode.class, msgs);
         if (newTarget != null)
            msgs = ((InternalEObject) newTarget).eInverseAdd(this, ActivitiesPackage.ACTIVITY_NODE__INCOMING,
               ActivityNode.class, msgs);
         msgs = basicSetTarget(newTarget, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY_EDGE__TARGET, newTarget,
            newTarget));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ActivityNode getSource ()
   {
      if (eContainerFeatureID() != ActivitiesPackage.ACTIVITY_EDGE__SOURCE)
         return null;
      return (ActivityNode) eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ActivityNode basicGetSource ()
   {
      if (eContainerFeatureID() != ActivitiesPackage.ACTIVITY_EDGE__SOURCE)
         return null;
      return (ActivityNode) eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetSource (ActivityNode newSource, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newSource, ActivitiesPackage.ACTIVITY_EDGE__SOURCE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSource (ActivityNode newSource)
   {
      if (newSource != eInternalContainer()
         || (eContainerFeatureID() != ActivitiesPackage.ACTIVITY_EDGE__SOURCE && newSource != null))
      {
         if (EcoreUtil.isAncestor(this, newSource))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newSource != null)
            msgs = ((InternalEObject) newSource).eInverseAdd(this, ActivitiesPackage.ACTIVITY_NODE__OUTGOING,
               ActivityNode.class, msgs);
         msgs = basicSetSource(newSource, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY_EDGE__SOURCE, newSource,
            newSource));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public TransitionGuard getGuardType ()
   {
      return guardType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setGuardType (TransitionGuard newGuardType)
   {
      TransitionGuard oldGuardType = guardType;
      guardType = newGuardType == null ? GUARD_TYPE_EDEFAULT : newGuardType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY_EDGE__GUARD_TYPE,
            oldGuardType, guardType));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Expression getOwnedGuardExpression ()
   {
      if (ownedGuardExpression != null && ownedGuardExpression.eIsProxy())
      {
         InternalEObject oldOwnedGuardExpression = (InternalEObject) ownedGuardExpression;
         ownedGuardExpression = (Expression) eResolveProxy(oldOwnedGuardExpression);
         if (ownedGuardExpression != oldOwnedGuardExpression)
         {
            InternalEObject newOwnedGuardExpression = (InternalEObject) ownedGuardExpression;
            NotificationChain msgs = oldOwnedGuardExpression.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ActivitiesPackage.ACTIVITY_EDGE__OWNED_GUARD_EXPRESSION, null, null);
            if (newOwnedGuardExpression.eInternalContainer() == null)
            {
               msgs = newOwnedGuardExpression.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                  - ActivitiesPackage.ACTIVITY_EDGE__OWNED_GUARD_EXPRESSION, null, msgs);
            }
            if (msgs != null)
               msgs.dispatch();
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  ActivitiesPackage.ACTIVITY_EDGE__OWNED_GUARD_EXPRESSION, oldOwnedGuardExpression,
                  ownedGuardExpression));
         }
      }
      return ownedGuardExpression;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Expression basicGetOwnedGuardExpression ()
   {
      return ownedGuardExpression;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetOwnedGuardExpression (Expression newOwnedGuardExpression, NotificationChain msgs)
   {
      Expression oldOwnedGuardExpression = ownedGuardExpression;
      ownedGuardExpression = newOwnedGuardExpression;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            ActivitiesPackage.ACTIVITY_EDGE__OWNED_GUARD_EXPRESSION, oldOwnedGuardExpression, newOwnedGuardExpression);
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
   public void setOwnedGuardExpression (Expression newOwnedGuardExpression)
   {
      if (newOwnedGuardExpression != ownedGuardExpression)
      {
         NotificationChain msgs = null;
         if (ownedGuardExpression != null)
            msgs = ((InternalEObject) ownedGuardExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ActivitiesPackage.ACTIVITY_EDGE__OWNED_GUARD_EXPRESSION, null, msgs);
         if (newOwnedGuardExpression != null)
            msgs = ((InternalEObject) newOwnedGuardExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - ActivitiesPackage.ACTIVITY_EDGE__OWNED_GUARD_EXPRESSION, null, msgs);
         msgs = basicSetOwnedGuardExpression(newOwnedGuardExpression, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY_EDGE__OWNED_GUARD_EXPRESSION,
            newOwnedGuardExpression, newOwnedGuardExpression));
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
         case ActivitiesPackage.ACTIVITY_EDGE__TARGET:
            if (target != null)
               msgs = ((InternalEObject) target).eInverseRemove(this, ActivitiesPackage.ACTIVITY_NODE__INCOMING,
                  ActivityNode.class, msgs);
            return basicSetTarget((ActivityNode) otherEnd, msgs);
         case ActivitiesPackage.ACTIVITY_EDGE__SOURCE:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetSource((ActivityNode) otherEnd, msgs);
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
         case ActivitiesPackage.ACTIVITY_EDGE__TARGET:
            return basicSetTarget(null, msgs);
         case ActivitiesPackage.ACTIVITY_EDGE__SOURCE:
            return basicSetSource(null, msgs);
         case ActivitiesPackage.ACTIVITY_EDGE__OWNED_GUARD_EXPRESSION:
            return basicSetOwnedGuardExpression(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eBasicRemoveFromContainerFeature (NotificationChain msgs)
   {
      switch (eContainerFeatureID())
      {
         case ActivitiesPackage.ACTIVITY_EDGE__SOURCE:
            return eInternalContainer().eInverseRemove(this, ActivitiesPackage.ACTIVITY_NODE__OUTGOING,
               ActivityNode.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
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
         case ActivitiesPackage.ACTIVITY_EDGE__TARGET:
            if (resolve)
               return getTarget();
            return basicGetTarget();
         case ActivitiesPackage.ACTIVITY_EDGE__SOURCE:
            if (resolve)
               return getSource();
            return basicGetSource();
         case ActivitiesPackage.ACTIVITY_EDGE__GUARD_TYPE:
            return getGuardType();
         case ActivitiesPackage.ACTIVITY_EDGE__OWNED_GUARD_EXPRESSION:
            if (resolve)
               return getOwnedGuardExpression();
            return basicGetOwnedGuardExpression();
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
         case ActivitiesPackage.ACTIVITY_EDGE__TARGET:
            setTarget((ActivityNode) newValue);
            return;
         case ActivitiesPackage.ACTIVITY_EDGE__SOURCE:
            setSource((ActivityNode) newValue);
            return;
         case ActivitiesPackage.ACTIVITY_EDGE__GUARD_TYPE:
            setGuardType((TransitionGuard) newValue);
            return;
         case ActivitiesPackage.ACTIVITY_EDGE__OWNED_GUARD_EXPRESSION:
            setOwnedGuardExpression((Expression) newValue);
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
         case ActivitiesPackage.ACTIVITY_EDGE__TARGET:
            setTarget((ActivityNode) null);
            return;
         case ActivitiesPackage.ACTIVITY_EDGE__SOURCE:
            setSource((ActivityNode) null);
            return;
         case ActivitiesPackage.ACTIVITY_EDGE__GUARD_TYPE:
            setGuardType(GUARD_TYPE_EDEFAULT);
            return;
         case ActivitiesPackage.ACTIVITY_EDGE__OWNED_GUARD_EXPRESSION:
            setOwnedGuardExpression((Expression) null);
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
         case ActivitiesPackage.ACTIVITY_EDGE__TARGET:
            return target != null;
         case ActivitiesPackage.ACTIVITY_EDGE__SOURCE:
            return basicGetSource() != null;
         case ActivitiesPackage.ACTIVITY_EDGE__GUARD_TYPE:
            return guardType != GUARD_TYPE_EDEFAULT;
         case ActivitiesPackage.ACTIVITY_EDGE__OWNED_GUARD_EXPRESSION:
            return ownedGuardExpression != null;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString ()
   {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (guardType: ");
      result.append(guardType);
      result.append(')');
      return result.toString();
   }

} //ActivityEdgeImpl
