/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.Expression;
import org.storydriven.modeling.expressions.Collaboration;
import org.storydriven.modeling.expressions.ExpressionsPackage;
import org.storydriven.modeling.impl.ExpressionImpl;
import org.storydriven.modeling.pattern.PatternPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Collaboration</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.storydriven.modeling.expressions.impl.CollaborationImpl#getSource <em>Source</em>}</li>
 * <li>{@link org.storydriven.modeling.expressions.impl.CollaborationImpl#getTargets <em>Target</em>}</li>
 * <li>{@link org.storydriven.modeling.expressions.impl.CollaborationImpl#getBody <em>Body</em>}</li>
 * <li>{@link org.storydriven.modeling.expressions.impl.CollaborationImpl#isForEach <em>For Each</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CollaborationImpl extends ExpressionImpl implements Collaboration
{
   /**
    * The cached value of the '{@link #getSource() <em>Source</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getSource()
    * @generated
    * @ordered
    */
   protected org.storydriven.modeling.pattern.Object source;

   /**
    * The cached value of the '{@link #getTargets() <em>Target</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getTargets()
    * @generated
    * @ordered
    */
   protected EList<org.storydriven.modeling.pattern.Object> targets;

   /**
    * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getBody()
    * @generated
    * @ordered
    */
   protected Expression body;

   /**
    * The default value of the '{@link #isForEach() <em>For Each</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isForEach()
    * @generated
    * @ordered
    */
   protected static final boolean FOR_EACH_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isForEach() <em>For Each</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isForEach()
    * @generated
    * @ordered
    */
   protected boolean forEach = FOR_EACH_EDEFAULT;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected CollaborationImpl ()
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
      return ExpressionsPackage.Literals.COLLABORATION;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public org.storydriven.modeling.pattern.Object getSource ()
   {
      if (this.source != null && this.source.eIsProxy())
      {
         InternalEObject oldSource = (InternalEObject) this.source;
         this.source = (org.storydriven.modeling.pattern.Object) eResolveProxy(oldSource);
         if (this.source != oldSource)
         {
            if (eNotificationRequired())
            {
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.COLLABORATION__SOURCE,
                  oldSource, this.source));
            }
         }
      }
      return this.source;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public org.storydriven.modeling.pattern.Object basicGetSource ()
   {
      return this.source;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetSource (org.storydriven.modeling.pattern.Object newSource, NotificationChain msgs)
   {
      org.storydriven.modeling.pattern.Object oldSource = this.source;
      this.source = newSource;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            ExpressionsPackage.COLLABORATION__SOURCE, oldSource, newSource);
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
   public void setSource (org.storydriven.modeling.pattern.Object newSource)
   {
      if (newSource != this.source)
      {
         NotificationChain msgs = null;
         if (this.source != null)
         {
            msgs = ((InternalEObject) this.source).eInverseRemove(this, PatternPackage.OBJECT__SENT_COLLABORATION,
               org.storydriven.modeling.pattern.Object.class, msgs);
         }
         if (newSource != null)
         {
            msgs = ((InternalEObject) newSource).eInverseAdd(this, PatternPackage.OBJECT__SENT_COLLABORATION,
               org.storydriven.modeling.pattern.Object.class, msgs);
         }
         msgs = basicSetSource(newSource, msgs);
         if (msgs != null)
         {
            msgs.dispatch();
         }
      }
      else if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.COLLABORATION__SOURCE, newSource,
            newSource));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<org.storydriven.modeling.pattern.Object> getTargets ()
   {
      if (this.targets == null)
      {
         this.targets = new EObjectWithInverseResolvingEList.ManyInverse<org.storydriven.modeling.pattern.Object>(
            org.storydriven.modeling.pattern.Object.class, this, ExpressionsPackage.COLLABORATION__TARGET,
            PatternPackage.OBJECT__RECEIVED_COLLABORATION);
      }
      return this.targets;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public Expression getBody ()
   {
      if (this.body != null && this.body.eIsProxy())
      {
         InternalEObject oldBody = (InternalEObject) this.body;
         this.body = (Expression) eResolveProxy(oldBody);
         if (this.body != oldBody)
         {
            InternalEObject newBody = (InternalEObject) this.body;
            NotificationChain msgs = oldBody.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.COLLABORATION__BODY, null, null);
            if (newBody.eInternalContainer() == null)
            {
               msgs = newBody.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.COLLABORATION__BODY, null,
                  msgs);
            }
            if (msgs != null)
            {
               msgs.dispatch();
            }
            if (eNotificationRequired())
            {
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.COLLABORATION__BODY,
                  oldBody, this.body));
            }
         }
      }
      return this.body;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public Expression basicGetBody ()
   {
      return this.body;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetBody (Expression newBody, NotificationChain msgs)
   {
      Expression oldBody = this.body;
      this.body = newBody;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            ExpressionsPackage.COLLABORATION__BODY, oldBody, newBody);
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
   public void setBody (Expression newBody)
   {
      if (newBody != this.body)
      {
         NotificationChain msgs = null;
         if (this.body != null)
         {
            msgs = ((InternalEObject) this.body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.COLLABORATION__BODY, null, msgs);
         }
         if (newBody != null)
         {
            msgs = ((InternalEObject) newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - ExpressionsPackage.COLLABORATION__BODY, null, msgs);
         }
         msgs = basicSetBody(newBody, msgs);
         if (msgs != null)
         {
            msgs.dispatch();
         }
      }
      else if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.COLLABORATION__BODY, newBody, newBody));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isForEach ()
   {
      return this.forEach;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setForEach (boolean newForEach)
   {
      boolean oldForEach = this.forEach;
      this.forEach = newForEach;
      if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.COLLABORATION__FOR_EACH, oldForEach,
            this.forEach));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @SuppressWarnings ("unchecked")
   @Override
   public NotificationChain eInverseAdd (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case ExpressionsPackage.COLLABORATION__SOURCE:
            if (this.source != null)
            {
               msgs = ((InternalEObject) this.source).eInverseRemove(this, PatternPackage.OBJECT__SENT_COLLABORATION,
                  org.storydriven.modeling.pattern.Object.class, msgs);
            }
            return basicSetSource((org.storydriven.modeling.pattern.Object) otherEnd, msgs);
         case ExpressionsPackage.COLLABORATION__TARGET:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getTargets()).basicAdd(otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
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
         case ExpressionsPackage.COLLABORATION__SOURCE:
            return basicSetSource(null, msgs);
         case ExpressionsPackage.COLLABORATION__TARGET:
            return ((InternalEList<?>) getTargets()).basicRemove(otherEnd, msgs);
         case ExpressionsPackage.COLLABORATION__BODY:
            return basicSetBody(null, msgs);
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
         case ExpressionsPackage.COLLABORATION__SOURCE:
            if (resolve)
            {
               return getSource();
            }
            return basicGetSource();
         case ExpressionsPackage.COLLABORATION__TARGET:
            return getTargets();
         case ExpressionsPackage.COLLABORATION__BODY:
            if (resolve)
            {
               return getBody();
            }
            return basicGetBody();
         case ExpressionsPackage.COLLABORATION__FOR_EACH:
            return isForEach();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @SuppressWarnings ("unchecked")
   @Override
   public void eSet (int featureID, Object newValue)
   {
      switch (featureID)
      {
         case ExpressionsPackage.COLLABORATION__SOURCE:
            setSource((org.storydriven.modeling.pattern.Object) newValue);
            return;
         case ExpressionsPackage.COLLABORATION__TARGET:
            getTargets().clear();
            getTargets().addAll((Collection<? extends org.storydriven.modeling.pattern.Object>) newValue);
            return;
         case ExpressionsPackage.COLLABORATION__BODY:
            setBody((Expression) newValue);
            return;
         case ExpressionsPackage.COLLABORATION__FOR_EACH:
            setForEach((Boolean) newValue);
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
         case ExpressionsPackage.COLLABORATION__SOURCE:
            setSource((org.storydriven.modeling.pattern.Object) null);
            return;
         case ExpressionsPackage.COLLABORATION__TARGET:
            getTargets().clear();
            return;
         case ExpressionsPackage.COLLABORATION__BODY:
            setBody((Expression) null);
            return;
         case ExpressionsPackage.COLLABORATION__FOR_EACH:
            setForEach(FOR_EACH_EDEFAULT);
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
         case ExpressionsPackage.COLLABORATION__SOURCE:
            return this.source != null;
         case ExpressionsPackage.COLLABORATION__TARGET:
            return this.targets != null && !this.targets.isEmpty();
         case ExpressionsPackage.COLLABORATION__BODY:
            return this.body != null;
         case ExpressionsPackage.COLLABORATION__FOR_EACH:
            return this.forEach != FOR_EACH_EDEFAULT;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public String toString ()
   {
      if (eIsProxy())
      {
         return super.toString();
      }

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (forEach: ");
      result.append(this.forEach);
      result.append(')');
      return result.toString();
   }

} // CollaborationImpl
