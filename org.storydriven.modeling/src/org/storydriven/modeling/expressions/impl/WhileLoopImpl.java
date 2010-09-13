/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.storydriven.modeling.Expression;

import org.storydriven.modeling.expressions.ExpressionsPackage;
import org.storydriven.modeling.expressions.WhileLoop;

import org.storydriven.modeling.impl.ExpressionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.impl.WhileLoopImpl#getLoopCondition <em>Loop Condition</em>}</li>
 *   <li>{@link org.storydriven.modeling.expressions.impl.WhileLoopImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhileLoopImpl extends ExpressionImpl implements WhileLoop
{
   /**
    * The cached value of the '{@link #getLoopCondition() <em>Loop Condition</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getLoopCondition()
    * @generated
    * @ordered
    */
   protected Expression loopCondition;

   /**
    * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBody()
    * @generated
    * @ordered
    */
   protected Expression body;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected WhileLoopImpl ()
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
      return ExpressionsPackage.Literals.WHILE_LOOP;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Expression getLoopCondition ()
   {
      if (loopCondition != null && loopCondition.eIsProxy())
      {
         InternalEObject oldLoopCondition = (InternalEObject) loopCondition;
         loopCondition = (Expression) eResolveProxy(oldLoopCondition);
         if (loopCondition != oldLoopCondition)
         {
            InternalEObject newLoopCondition = (InternalEObject) loopCondition;
            NotificationChain msgs = oldLoopCondition.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.WHILE_LOOP__LOOP_CONDITION, null, null);
            if (newLoopCondition.eInternalContainer() == null)
            {
               msgs = newLoopCondition.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                  - ExpressionsPackage.WHILE_LOOP__LOOP_CONDITION, null, msgs);
            }
            if (msgs != null)
               msgs.dispatch();
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.WHILE_LOOP__LOOP_CONDITION,
                  oldLoopCondition, loopCondition));
         }
      }
      return loopCondition;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Expression basicGetLoopCondition ()
   {
      return loopCondition;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetLoopCondition (Expression newLoopCondition, NotificationChain msgs)
   {
      Expression oldLoopCondition = loopCondition;
      loopCondition = newLoopCondition;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            ExpressionsPackage.WHILE_LOOP__LOOP_CONDITION, oldLoopCondition, newLoopCondition);
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
   public void setLoopCondition (Expression newLoopCondition)
   {
      if (newLoopCondition != loopCondition)
      {
         NotificationChain msgs = null;
         if (loopCondition != null)
            msgs = ((InternalEObject) loopCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.WHILE_LOOP__LOOP_CONDITION, null, msgs);
         if (newLoopCondition != null)
            msgs = ((InternalEObject) newLoopCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.WHILE_LOOP__LOOP_CONDITION, null, msgs);
         msgs = basicSetLoopCondition(newLoopCondition, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.WHILE_LOOP__LOOP_CONDITION,
            newLoopCondition, newLoopCondition));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Expression getBody ()
   {
      if (body != null && body.eIsProxy())
      {
         InternalEObject oldBody = (InternalEObject) body;
         body = (Expression) eResolveProxy(oldBody);
         if (body != oldBody)
         {
            InternalEObject newBody = (InternalEObject) body;
            NotificationChain msgs = oldBody.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.WHILE_LOOP__BODY, null, null);
            if (newBody.eInternalContainer() == null)
            {
               msgs = newBody.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.WHILE_LOOP__BODY, null,
                  msgs);
            }
            if (msgs != null)
               msgs.dispatch();
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.WHILE_LOOP__BODY, oldBody,
                  body));
         }
      }
      return body;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Expression basicGetBody ()
   {
      return body;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetBody (Expression newBody, NotificationChain msgs)
   {
      Expression oldBody = body;
      body = newBody;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            ExpressionsPackage.WHILE_LOOP__BODY, oldBody, newBody);
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
   public void setBody (Expression newBody)
   {
      if (newBody != body)
      {
         NotificationChain msgs = null;
         if (body != null)
            msgs = ((InternalEObject) body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.WHILE_LOOP__BODY, null, msgs);
         if (newBody != null)
            msgs = ((InternalEObject) newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.WHILE_LOOP__BODY, null, msgs);
         msgs = basicSetBody(newBody, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.WHILE_LOOP__BODY, newBody, newBody));
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
         case ExpressionsPackage.WHILE_LOOP__LOOP_CONDITION:
            return basicSetLoopCondition(null, msgs);
         case ExpressionsPackage.WHILE_LOOP__BODY:
            return basicSetBody(null, msgs);
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
         case ExpressionsPackage.WHILE_LOOP__LOOP_CONDITION:
            if (resolve)
               return getLoopCondition();
            return basicGetLoopCondition();
         case ExpressionsPackage.WHILE_LOOP__BODY:
            if (resolve)
               return getBody();
            return basicGetBody();
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
         case ExpressionsPackage.WHILE_LOOP__LOOP_CONDITION:
            setLoopCondition((Expression) newValue);
            return;
         case ExpressionsPackage.WHILE_LOOP__BODY:
            setBody((Expression) newValue);
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
         case ExpressionsPackage.WHILE_LOOP__LOOP_CONDITION:
            setLoopCondition((Expression) null);
            return;
         case ExpressionsPackage.WHILE_LOOP__BODY:
            setBody((Expression) null);
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
         case ExpressionsPackage.WHILE_LOOP__LOOP_CONDITION:
            return loopCondition != null;
         case ExpressionsPackage.WHILE_LOOP__BODY:
            return body != null;
      }
      return super.eIsSet(featureID);
   }

} //WhileLoopImpl
