/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.pattern.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.modeling.activities.impl.ActivityNodeImpl;
import org.storydriven.modeling.pattern.ObjectPattern;
import org.storydriven.modeling.pattern.PatternPackage;
import org.storydriven.modeling.pattern.StoryNode;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Story Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.storydriven.modeling.pattern.impl.StoryNodeImpl#isForEach <em>For Each</em>}</li>
 * <li>{@link org.storydriven.modeling.pattern.impl.StoryNodeImpl#getOwnedPattern <em>Owned Pattern</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class StoryNodeImpl extends ActivityNodeImpl implements StoryNode
{
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
    * The cached value of the '{@link #getOwnedPattern() <em>Owned Pattern</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getOwnedPattern()
    * @generated
    * @ordered
    */
   protected ObjectPattern ownedPattern;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected StoryNodeImpl ()
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
      return PatternPackage.Literals.STORY_NODE;
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
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.STORY_NODE__FOR_EACH, oldForEach,
            this.forEach));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public ObjectPattern getOwnedPattern ()
   {
      if (this.ownedPattern != null && this.ownedPattern.eIsProxy())
      {
         InternalEObject oldOwnedPattern = (InternalEObject) this.ownedPattern;
         this.ownedPattern = (ObjectPattern) eResolveProxy(oldOwnedPattern);
         if (this.ownedPattern != oldOwnedPattern)
         {
            InternalEObject newOwnedPattern = (InternalEObject) this.ownedPattern;
            NotificationChain msgs = oldOwnedPattern.eInverseRemove(this, PatternPackage.OBJECT_PATTERN__OWNING_NODE,
               ObjectPattern.class, null);
            if (newOwnedPattern.eInternalContainer() == null)
            {
               msgs = newOwnedPattern.eInverseAdd(this, PatternPackage.OBJECT_PATTERN__OWNING_NODE,
                  ObjectPattern.class, msgs);
            }
            if (msgs != null)
            {
               msgs.dispatch();
            }
            if (eNotificationRequired())
            {
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.STORY_NODE__OWNED_PATTERN,
                  oldOwnedPattern, this.ownedPattern));
            }
         }
      }
      return this.ownedPattern;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public ObjectPattern basicGetOwnedPattern ()
   {
      return this.ownedPattern;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetOwnedPattern (ObjectPattern newOwnedPattern, NotificationChain msgs)
   {
      ObjectPattern oldOwnedPattern = this.ownedPattern;
      this.ownedPattern = newOwnedPattern;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            PatternPackage.STORY_NODE__OWNED_PATTERN, oldOwnedPattern, newOwnedPattern);
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
   public void setOwnedPattern (ObjectPattern newOwnedPattern)
   {
      if (newOwnedPattern != this.ownedPattern)
      {
         NotificationChain msgs = null;
         if (this.ownedPattern != null)
         {
            msgs = ((InternalEObject) this.ownedPattern).eInverseRemove(this,
               PatternPackage.OBJECT_PATTERN__OWNING_NODE, ObjectPattern.class, msgs);
         }
         if (newOwnedPattern != null)
         {
            msgs = ((InternalEObject) newOwnedPattern).eInverseAdd(this, PatternPackage.OBJECT_PATTERN__OWNING_NODE,
               ObjectPattern.class, msgs);
         }
         msgs = basicSetOwnedPattern(newOwnedPattern, msgs);
         if (msgs != null)
         {
            msgs.dispatch();
         }
      }
      else if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.STORY_NODE__OWNED_PATTERN,
            newOwnedPattern, newOwnedPattern));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case PatternPackage.STORY_NODE__OWNED_PATTERN:
            if (this.ownedPattern != null)
            {
               msgs = ((InternalEObject) this.ownedPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                  - PatternPackage.STORY_NODE__OWNED_PATTERN, null, msgs);
            }
            return basicSetOwnedPattern((ObjectPattern) otherEnd, msgs);
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
         case PatternPackage.STORY_NODE__OWNED_PATTERN:
            return basicSetOwnedPattern(null, msgs);
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
         case PatternPackage.STORY_NODE__FOR_EACH:
            return isForEach();
         case PatternPackage.STORY_NODE__OWNED_PATTERN:
            if (resolve)
            {
               return getOwnedPattern();
            }
            return basicGetOwnedPattern();
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
         case PatternPackage.STORY_NODE__FOR_EACH:
            setForEach((Boolean) newValue);
            return;
         case PatternPackage.STORY_NODE__OWNED_PATTERN:
            setOwnedPattern((ObjectPattern) newValue);
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
         case PatternPackage.STORY_NODE__FOR_EACH:
            setForEach(FOR_EACH_EDEFAULT);
            return;
         case PatternPackage.STORY_NODE__OWNED_PATTERN:
            setOwnedPattern((ObjectPattern) null);
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
         case PatternPackage.STORY_NODE__FOR_EACH:
            return this.forEach != FOR_EACH_EDEFAULT;
         case PatternPackage.STORY_NODE__OWNED_PATTERN:
            return this.ownedPattern != null;
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

} // StoryNodeImpl
