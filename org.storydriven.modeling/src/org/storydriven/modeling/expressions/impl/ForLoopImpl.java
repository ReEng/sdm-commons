/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.modeling.Expression;
import org.storydriven.modeling.expressions.ExpressionsPackage;
import org.storydriven.modeling.expressions.ForLoop;
import org.storydriven.modeling.impl.ExpressionImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>For Loop</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.storydriven.modeling.expressions.impl.ForLoopImpl#getLoopVariable <em>Loop Variable</em>}</li>
 * <li>{@link org.storydriven.modeling.expressions.impl.ForLoopImpl#getStartValue <em>Start Value</em>}</li>
 * <li>{@link org.storydriven.modeling.expressions.impl.ForLoopImpl#getStopValue <em>Stop Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ForLoopImpl extends ExpressionImpl implements ForLoop
{
   /**
    * The cached value of the '{@link #getLoopVariable() <em>Loop Variable</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getLoopVariable()
    * @generated
    * @ordered
    */
   protected EAttribute loopVariable;

   /**
    * The cached value of the '{@link #getStartValue() <em>Start Value</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getStartValue()
    * @generated
    * @ordered
    */
   protected Expression startValue;

   /**
    * The cached value of the '{@link #getStopValue() <em>Stop Value</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getStopValue()
    * @generated
    * @ordered
    */
   protected Expression stopValue;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected ForLoopImpl ()
   {
      super();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   protected EClass eStaticClass ()
   {
      return ExpressionsPackage.Literals.FOR_LOOP;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getLoopVariable ()
   {
      if (this.loopVariable != null && this.loopVariable.eIsProxy())
      {
         InternalEObject oldLoopVariable = (InternalEObject) this.loopVariable;
         this.loopVariable = (EAttribute) eResolveProxy(oldLoopVariable);
         if (this.loopVariable != oldLoopVariable)
         {
            InternalEObject newLoopVariable = (InternalEObject) this.loopVariable;
            NotificationChain msgs = oldLoopVariable.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.FOR_LOOP__LOOP_VARIABLE, null, null);
            if (newLoopVariable.eInternalContainer() == null)
            {
               msgs = newLoopVariable.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                  - ExpressionsPackage.FOR_LOOP__LOOP_VARIABLE, null, msgs);
            }
            if (msgs != null)
            {
               msgs.dispatch();
            }
            if (eNotificationRequired())
            {
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.FOR_LOOP__LOOP_VARIABLE,
                  oldLoopVariable, this.loopVariable));
            }
         }
      }
      return this.loopVariable;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute basicGetLoopVariable ()
   {
      return this.loopVariable;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetLoopVariable (EAttribute newLoopVariable, NotificationChain msgs)
   {
      EAttribute oldLoopVariable = this.loopVariable;
      this.loopVariable = newLoopVariable;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            ExpressionsPackage.FOR_LOOP__LOOP_VARIABLE, oldLoopVariable, newLoopVariable);
         if (msgs == null)
         {
            msgs = notification;
         }
         else
         {
            msgs.add(notification);
         }
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setLoopVariable (EAttribute newLoopVariable)
   {
      if (newLoopVariable != this.loopVariable)
      {
         NotificationChain msgs = null;
         if (this.loopVariable != null)
         {
            msgs = ((InternalEObject) this.loopVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.FOR_LOOP__LOOP_VARIABLE, null, msgs);
         }
         if (newLoopVariable != null)
         {
            msgs = ((InternalEObject) newLoopVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.FOR_LOOP__LOOP_VARIABLE, null, msgs);
         }
         msgs = basicSetLoopVariable(newLoopVariable, msgs);
         if (msgs != null)
         {
            msgs.dispatch();
         }
      }
      else if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.FOR_LOOP__LOOP_VARIABLE,
            newLoopVariable, newLoopVariable));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public Expression getStartValue ()
   {
      if (this.startValue != null && this.startValue.eIsProxy())
      {
         InternalEObject oldStartValue = (InternalEObject) this.startValue;
         this.startValue = (Expression) eResolveProxy(oldStartValue);
         if (this.startValue != oldStartValue)
         {
            InternalEObject newStartValue = (InternalEObject) this.startValue;
            NotificationChain msgs = oldStartValue.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.FOR_LOOP__START_VALUE, null, null);
            if (newStartValue.eInternalContainer() == null)
            {
               msgs = newStartValue.eInverseAdd(this,
                  EOPPOSITE_FEATURE_BASE - ExpressionsPackage.FOR_LOOP__START_VALUE, null, msgs);
            }
            if (msgs != null)
            {
               msgs.dispatch();
            }
            if (eNotificationRequired())
            {
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.FOR_LOOP__START_VALUE,
                  oldStartValue, this.startValue));
            }
         }
      }
      return this.startValue;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public Expression basicGetStartValue ()
   {
      return this.startValue;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetStartValue (Expression newStartValue, NotificationChain msgs)
   {
      Expression oldStartValue = this.startValue;
      this.startValue = newStartValue;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            ExpressionsPackage.FOR_LOOP__START_VALUE, oldStartValue, newStartValue);
         if (msgs == null)
         {
            msgs = notification;
         }
         else
         {
            msgs.add(notification);
         }
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setStartValue (Expression newStartValue)
   {
      if (newStartValue != this.startValue)
      {
         NotificationChain msgs = null;
         if (this.startValue != null)
         {
            msgs = ((InternalEObject) this.startValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.FOR_LOOP__START_VALUE, null, msgs);
         }
         if (newStartValue != null)
         {
            msgs = ((InternalEObject) newStartValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.FOR_LOOP__START_VALUE, null, msgs);
         }
         msgs = basicSetStartValue(newStartValue, msgs);
         if (msgs != null)
         {
            msgs.dispatch();
         }
      }
      else if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.FOR_LOOP__START_VALUE, newStartValue,
            newStartValue));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public Expression getStopValue ()
   {
      if (this.stopValue != null && this.stopValue.eIsProxy())
      {
         InternalEObject oldStopValue = (InternalEObject) this.stopValue;
         this.stopValue = (Expression) eResolveProxy(oldStopValue);
         if (this.stopValue != oldStopValue)
         {
            InternalEObject newStopValue = (InternalEObject) this.stopValue;
            NotificationChain msgs = oldStopValue.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.FOR_LOOP__STOP_VALUE, null, null);
            if (newStopValue.eInternalContainer() == null)
            {
               msgs = newStopValue.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.FOR_LOOP__STOP_VALUE,
                  null, msgs);
            }
            if (msgs != null)
            {
               msgs.dispatch();
            }
            if (eNotificationRequired())
            {
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.FOR_LOOP__STOP_VALUE,
                  oldStopValue, this.stopValue));
            }
         }
      }
      return this.stopValue;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public Expression basicGetStopValue ()
   {
      return this.stopValue;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetStopValue (Expression newStopValue, NotificationChain msgs)
   {
      Expression oldStopValue = this.stopValue;
      this.stopValue = newStopValue;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            ExpressionsPackage.FOR_LOOP__STOP_VALUE, oldStopValue, newStopValue);
         if (msgs == null)
         {
            msgs = notification;
         }
         else
         {
            msgs.add(notification);
         }
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setStopValue (Expression newStopValue)
   {
      if (newStopValue != this.stopValue)
      {
         NotificationChain msgs = null;
         if (this.stopValue != null)
         {
            msgs = ((InternalEObject) this.stopValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.FOR_LOOP__STOP_VALUE, null, msgs);
         }
         if (newStopValue != null)
         {
            msgs = ((InternalEObject) newStopValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.FOR_LOOP__STOP_VALUE, null, msgs);
         }
         msgs = basicSetStopValue(newStopValue, msgs);
         if (msgs != null)
         {
            msgs.dispatch();
         }
      }
      else if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.FOR_LOOP__STOP_VALUE, newStopValue,
            newStopValue));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case ExpressionsPackage.FOR_LOOP__LOOP_VARIABLE:
            return basicSetLoopVariable(null, msgs);
         case ExpressionsPackage.FOR_LOOP__START_VALUE:
            return basicSetStartValue(null, msgs);
         case ExpressionsPackage.FOR_LOOP__STOP_VALUE:
            return basicSetStopValue(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public Object eGet (int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
         case ExpressionsPackage.FOR_LOOP__LOOP_VARIABLE:
            if (resolve)
            {
               return getLoopVariable();
            }
            return basicGetLoopVariable();
         case ExpressionsPackage.FOR_LOOP__START_VALUE:
            if (resolve)
            {
               return getStartValue();
            }
            return basicGetStartValue();
         case ExpressionsPackage.FOR_LOOP__STOP_VALUE:
            if (resolve)
            {
               return getStopValue();
            }
            return basicGetStopValue();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public void eSet (int featureID, Object newValue)
   {
      switch (featureID)
      {
         case ExpressionsPackage.FOR_LOOP__LOOP_VARIABLE:
            setLoopVariable((EAttribute) newValue);
            return;
         case ExpressionsPackage.FOR_LOOP__START_VALUE:
            setStartValue((Expression) newValue);
            return;
         case ExpressionsPackage.FOR_LOOP__STOP_VALUE:
            setStopValue((Expression) newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public void eUnset (int featureID)
   {
      switch (featureID)
      {
         case ExpressionsPackage.FOR_LOOP__LOOP_VARIABLE:
            setLoopVariable((EAttribute) null);
            return;
         case ExpressionsPackage.FOR_LOOP__START_VALUE:
            setStartValue((Expression) null);
            return;
         case ExpressionsPackage.FOR_LOOP__STOP_VALUE:
            setStopValue((Expression) null);
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public boolean eIsSet (int featureID)
   {
      switch (featureID)
      {
         case ExpressionsPackage.FOR_LOOP__LOOP_VARIABLE:
            return this.loopVariable != null;
         case ExpressionsPackage.FOR_LOOP__START_VALUE:
            return this.startValue != null;
         case ExpressionsPackage.FOR_LOOP__STOP_VALUE:
            return this.stopValue != null;
      }
      return super.eIsSet(featureID);
   }

} // ForLoopImpl
