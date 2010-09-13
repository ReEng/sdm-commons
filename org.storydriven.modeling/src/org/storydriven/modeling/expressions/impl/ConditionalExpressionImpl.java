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

import org.storydriven.modeling.expressions.ConditionalExpression;
import org.storydriven.modeling.expressions.ExpressionsPackage;

import org.storydriven.modeling.impl.ExpressionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.impl.ConditionalExpressionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.storydriven.modeling.expressions.impl.ConditionalExpressionImpl#getThen <em>Then</em>}</li>
 *   <li>{@link org.storydriven.modeling.expressions.impl.ConditionalExpressionImpl#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalExpressionImpl extends ExpressionImpl implements ConditionalExpression
{
   /**
    * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getCondition()
    * @generated
    * @ordered
    */
   protected Expression condition;

   /**
    * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getThen()
    * @generated
    * @ordered
    */
   protected Expression then;

   /**
    * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getElse()
    * @generated
    * @ordered
    */
   protected Expression else_;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ConditionalExpressionImpl ()
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
      return ExpressionsPackage.Literals.CONDITIONAL_EXPRESSION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Expression getCondition ()
   {
      if (condition != null && condition.eIsProxy())
      {
         InternalEObject oldCondition = (InternalEObject) condition;
         condition = (Expression) eResolveProxy(oldCondition);
         if (condition != oldCondition)
         {
            InternalEObject newCondition = (InternalEObject) condition;
            NotificationChain msgs = oldCondition.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.CONDITIONAL_EXPRESSION__CONDITION, null, null);
            if (newCondition.eInternalContainer() == null)
            {
               msgs = newCondition.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                  - ExpressionsPackage.CONDITIONAL_EXPRESSION__CONDITION, null, msgs);
            }
            if (msgs != null)
               msgs.dispatch();
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  ExpressionsPackage.CONDITIONAL_EXPRESSION__CONDITION, oldCondition, condition));
         }
      }
      return condition;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Expression basicGetCondition ()
   {
      return condition;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetCondition (Expression newCondition, NotificationChain msgs)
   {
      Expression oldCondition = condition;
      condition = newCondition;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            ExpressionsPackage.CONDITIONAL_EXPRESSION__CONDITION, oldCondition, newCondition);
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
   public void setCondition (Expression newCondition)
   {
      if (newCondition != condition)
      {
         NotificationChain msgs = null;
         if (condition != null)
            msgs = ((InternalEObject) condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.CONDITIONAL_EXPRESSION__CONDITION, null, msgs);
         if (newCondition != null)
            msgs = ((InternalEObject) newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.CONDITIONAL_EXPRESSION__CONDITION, null, msgs);
         msgs = basicSetCondition(newCondition, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITIONAL_EXPRESSION__CONDITION,
            newCondition, newCondition));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Expression getThen ()
   {
      if (then != null && then.eIsProxy())
      {
         InternalEObject oldThen = (InternalEObject) then;
         then = (Expression) eResolveProxy(oldThen);
         if (then != oldThen)
         {
            InternalEObject newThen = (InternalEObject) then;
            NotificationChain msgs = oldThen.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.CONDITIONAL_EXPRESSION__THEN, null, null);
            if (newThen.eInternalContainer() == null)
            {
               msgs = newThen.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                  - ExpressionsPackage.CONDITIONAL_EXPRESSION__THEN, null, msgs);
            }
            if (msgs != null)
               msgs.dispatch();
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  ExpressionsPackage.CONDITIONAL_EXPRESSION__THEN, oldThen, then));
         }
      }
      return then;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Expression basicGetThen ()
   {
      return then;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetThen (Expression newThen, NotificationChain msgs)
   {
      Expression oldThen = then;
      then = newThen;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            ExpressionsPackage.CONDITIONAL_EXPRESSION__THEN, oldThen, newThen);
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
   public void setThen (Expression newThen)
   {
      if (newThen != then)
      {
         NotificationChain msgs = null;
         if (then != null)
            msgs = ((InternalEObject) then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.CONDITIONAL_EXPRESSION__THEN, null, msgs);
         if (newThen != null)
            msgs = ((InternalEObject) newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.CONDITIONAL_EXPRESSION__THEN, null, msgs);
         msgs = basicSetThen(newThen, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITIONAL_EXPRESSION__THEN,
            newThen, newThen));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Expression getElse ()
   {
      if (else_ != null && else_.eIsProxy())
      {
         InternalEObject oldElse = (InternalEObject) else_;
         else_ = (Expression) eResolveProxy(oldElse);
         if (else_ != oldElse)
         {
            InternalEObject newElse = (InternalEObject) else_;
            NotificationChain msgs = oldElse.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.CONDITIONAL_EXPRESSION__ELSE, null, null);
            if (newElse.eInternalContainer() == null)
            {
               msgs = newElse.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                  - ExpressionsPackage.CONDITIONAL_EXPRESSION__ELSE, null, msgs);
            }
            if (msgs != null)
               msgs.dispatch();
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  ExpressionsPackage.CONDITIONAL_EXPRESSION__ELSE, oldElse, else_));
         }
      }
      return else_;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Expression basicGetElse ()
   {
      return else_;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetElse (Expression newElse, NotificationChain msgs)
   {
      Expression oldElse = else_;
      else_ = newElse;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            ExpressionsPackage.CONDITIONAL_EXPRESSION__ELSE, oldElse, newElse);
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
   public void setElse (Expression newElse)
   {
      if (newElse != else_)
      {
         NotificationChain msgs = null;
         if (else_ != null)
            msgs = ((InternalEObject) else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.CONDITIONAL_EXPRESSION__ELSE, null, msgs);
         if (newElse != null)
            msgs = ((InternalEObject) newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.CONDITIONAL_EXPRESSION__ELSE, null, msgs);
         msgs = basicSetElse(newElse, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITIONAL_EXPRESSION__ELSE,
            newElse, newElse));
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
         case ExpressionsPackage.CONDITIONAL_EXPRESSION__CONDITION:
            return basicSetCondition(null, msgs);
         case ExpressionsPackage.CONDITIONAL_EXPRESSION__THEN:
            return basicSetThen(null, msgs);
         case ExpressionsPackage.CONDITIONAL_EXPRESSION__ELSE:
            return basicSetElse(null, msgs);
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
         case ExpressionsPackage.CONDITIONAL_EXPRESSION__CONDITION:
            if (resolve)
               return getCondition();
            return basicGetCondition();
         case ExpressionsPackage.CONDITIONAL_EXPRESSION__THEN:
            if (resolve)
               return getThen();
            return basicGetThen();
         case ExpressionsPackage.CONDITIONAL_EXPRESSION__ELSE:
            if (resolve)
               return getElse();
            return basicGetElse();
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
         case ExpressionsPackage.CONDITIONAL_EXPRESSION__CONDITION:
            setCondition((Expression) newValue);
            return;
         case ExpressionsPackage.CONDITIONAL_EXPRESSION__THEN:
            setThen((Expression) newValue);
            return;
         case ExpressionsPackage.CONDITIONAL_EXPRESSION__ELSE:
            setElse((Expression) newValue);
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
         case ExpressionsPackage.CONDITIONAL_EXPRESSION__CONDITION:
            setCondition((Expression) null);
            return;
         case ExpressionsPackage.CONDITIONAL_EXPRESSION__THEN:
            setThen((Expression) null);
            return;
         case ExpressionsPackage.CONDITIONAL_EXPRESSION__ELSE:
            setElse((Expression) null);
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
         case ExpressionsPackage.CONDITIONAL_EXPRESSION__CONDITION:
            return condition != null;
         case ExpressionsPackage.CONDITIONAL_EXPRESSION__THEN:
            return then != null;
         case ExpressionsPackage.CONDITIONAL_EXPRESSION__ELSE:
            return else_ != null;
      }
      return super.eIsSet(featureID);
   }

} //ConditionalExpressionImpl
