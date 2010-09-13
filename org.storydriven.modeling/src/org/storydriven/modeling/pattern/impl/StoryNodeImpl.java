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
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Story Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.pattern.impl.StoryNodeImpl#isForEach <em>For Each</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.StoryNodeImpl#getContainedPattern <em>Contained Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StoryNodeImpl extends ActivityNodeImpl implements StoryNode
{
   /**
    * The default value of the '{@link #isForEach() <em>For Each</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isForEach()
    * @generated
    * @ordered
    */
   protected static final boolean FOR_EACH_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isForEach() <em>For Each</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isForEach()
    * @generated
    * @ordered
    */
   protected boolean forEach = FOR_EACH_EDEFAULT;

   /**
    * The cached value of the '{@link #getContainedPattern() <em>Contained Pattern</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getContainedPattern()
    * @generated
    * @ordered
    */
   protected ObjectPattern containedPattern;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected StoryNodeImpl ()
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
      return PatternPackage.Literals.STORY_NODE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isForEach ()
   {
      return forEach;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setForEach (boolean newForEach)
   {
      boolean oldForEach = forEach;
      forEach = newForEach;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.STORY_NODE__FOR_EACH, oldForEach, forEach));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ObjectPattern getContainedPattern ()
   {
      if (containedPattern != null && containedPattern.eIsProxy())
      {
         InternalEObject oldContainedPattern = (InternalEObject) containedPattern;
         containedPattern = (ObjectPattern) eResolveProxy(oldContainedPattern);
         if (containedPattern != oldContainedPattern)
         {
            InternalEObject newContainedPattern = (InternalEObject) containedPattern;
            NotificationChain msgs = oldContainedPattern.eInverseRemove(this,
               PatternPackage.OBJECT_PATTERN__CONTAINING_NODE, ObjectPattern.class, null);
            if (newContainedPattern.eInternalContainer() == null)
            {
               msgs = newContainedPattern.eInverseAdd(this, PatternPackage.OBJECT_PATTERN__CONTAINING_NODE,
                  ObjectPattern.class, msgs);
            }
            if (msgs != null)
               msgs.dispatch();
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.STORY_NODE__CONTAINED_PATTERN,
                  oldContainedPattern, containedPattern));
         }
      }
      return containedPattern;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ObjectPattern basicGetContainedPattern ()
   {
      return containedPattern;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetContainedPattern (ObjectPattern newContainedPattern, NotificationChain msgs)
   {
      ObjectPattern oldContainedPattern = containedPattern;
      containedPattern = newContainedPattern;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            PatternPackage.STORY_NODE__CONTAINED_PATTERN, oldContainedPattern, newContainedPattern);
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
   public void setContainedPattern (ObjectPattern newContainedPattern)
   {
      if (newContainedPattern != containedPattern)
      {
         NotificationChain msgs = null;
         if (containedPattern != null)
            msgs = ((InternalEObject) containedPattern).eInverseRemove(this,
               PatternPackage.OBJECT_PATTERN__CONTAINING_NODE, ObjectPattern.class, msgs);
         if (newContainedPattern != null)
            msgs = ((InternalEObject) newContainedPattern).eInverseAdd(this,
               PatternPackage.OBJECT_PATTERN__CONTAINING_NODE, ObjectPattern.class, msgs);
         msgs = basicSetContainedPattern(newContainedPattern, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.STORY_NODE__CONTAINED_PATTERN,
            newContainedPattern, newContainedPattern));
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
         case PatternPackage.STORY_NODE__CONTAINED_PATTERN:
            if (containedPattern != null)
               msgs = ((InternalEObject) containedPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                  - PatternPackage.STORY_NODE__CONTAINED_PATTERN, null, msgs);
            return basicSetContainedPattern((ObjectPattern) otherEnd, msgs);
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
         case PatternPackage.STORY_NODE__CONTAINED_PATTERN:
            return basicSetContainedPattern(null, msgs);
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
         case PatternPackage.STORY_NODE__FOR_EACH:
            return isForEach();
         case PatternPackage.STORY_NODE__CONTAINED_PATTERN:
            if (resolve)
               return getContainedPattern();
            return basicGetContainedPattern();
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
         case PatternPackage.STORY_NODE__FOR_EACH:
            setForEach((Boolean) newValue);
            return;
         case PatternPackage.STORY_NODE__CONTAINED_PATTERN:
            setContainedPattern((ObjectPattern) newValue);
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
         case PatternPackage.STORY_NODE__FOR_EACH:
            setForEach(FOR_EACH_EDEFAULT);
            return;
         case PatternPackage.STORY_NODE__CONTAINED_PATTERN:
            setContainedPattern((ObjectPattern) null);
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
         case PatternPackage.STORY_NODE__FOR_EACH:
            return forEach != FOR_EACH_EDEFAULT;
         case PatternPackage.STORY_NODE__CONTAINED_PATTERN:
            return containedPattern != null;
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
      result.append(" (forEach: ");
      result.append(forEach);
      result.append(')');
      return result.toString();
   }

} //StoryNodeImpl
