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

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.storydriven.modeling.impl.ExtendableElementImpl;

import org.storydriven.modeling.pattern.Link;
import org.storydriven.modeling.pattern.MultiLink;
import org.storydriven.modeling.pattern.MultiLinkType;
import org.storydriven.modeling.pattern.PatternPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.pattern.impl.MultiLinkImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.MultiLinkImpl#getMultiLinkType <em>Multi Link Type</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.MultiLinkImpl#isNegative <em>Negative</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.MultiLinkImpl#getSourceLink <em>Source Link</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.MultiLinkImpl#getTargetObject <em>Target Object</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.MultiLinkImpl#getTargetLink <em>Target Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiLinkImpl extends ExtendableElementImpl implements MultiLink
{
   /**
    * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getIndex()
    * @generated
    * @ordered
    */
   protected static final int INDEX_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getIndex()
    * @generated
    * @ordered
    */
   protected int index = INDEX_EDEFAULT;

   /**
    * The default value of the '{@link #getMultiLinkType() <em>Multi Link Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getMultiLinkType()
    * @generated
    * @ordered
    */
   protected static final MultiLinkType MULTI_LINK_TYPE_EDEFAULT = MultiLinkType.DIRECT;

   /**
    * The cached value of the '{@link #getMultiLinkType() <em>Multi Link Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getMultiLinkType()
    * @generated
    * @ordered
    */
   protected MultiLinkType multiLinkType = MULTI_LINK_TYPE_EDEFAULT;

   /**
    * The default value of the '{@link #isNegative() <em>Negative</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isNegative()
    * @generated
    * @ordered
    */
   protected static final boolean NEGATIVE_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isNegative() <em>Negative</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isNegative()
    * @generated
    * @ordered
    */
   protected boolean negative = NEGATIVE_EDEFAULT;

   /**
    * The cached value of the '{@link #getTargetObject() <em>Target Object</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTargetObject()
    * @generated
    * @ordered
    */
   protected org.storydriven.modeling.pattern.Object targetObject;

   /**
    * The cached value of the '{@link #getTargetLink() <em>Target Link</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTargetLink()
    * @generated
    * @ordered
    */
   protected Link targetLink;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected MultiLinkImpl ()
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
      return PatternPackage.Literals.MULTI_LINK;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getIndex ()
   {
      return index;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setIndex (int newIndex)
   {
      int oldIndex = index;
      index = newIndex;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.MULTI_LINK__INDEX, oldIndex, index));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public MultiLinkType getMultiLinkType ()
   {
      return multiLinkType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setMultiLinkType (MultiLinkType newMultiLinkType)
   {
      MultiLinkType oldMultiLinkType = multiLinkType;
      multiLinkType = newMultiLinkType == null ? MULTI_LINK_TYPE_EDEFAULT : newMultiLinkType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.MULTI_LINK__MULTI_LINK_TYPE,
            oldMultiLinkType, multiLinkType));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isNegative ()
   {
      return negative;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setNegative (boolean newNegative)
   {
      boolean oldNegative = negative;
      negative = newNegative;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.MULTI_LINK__NEGATIVE, oldNegative,
            negative));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Link getSourceLink ()
   {
      if (eContainerFeatureID() != PatternPackage.MULTI_LINK__SOURCE_LINK)
         return null;
      return (Link) eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Link basicGetSourceLink ()
   {
      if (eContainerFeatureID() != PatternPackage.MULTI_LINK__SOURCE_LINK)
         return null;
      return (Link) eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetSourceLink (Link newSourceLink, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newSourceLink, PatternPackage.MULTI_LINK__SOURCE_LINK, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSourceLink (Link newSourceLink)
   {
      if (newSourceLink != eInternalContainer()
         || (eContainerFeatureID() != PatternPackage.MULTI_LINK__SOURCE_LINK && newSourceLink != null))
      {
         if (EcoreUtil.isAncestor(this, newSourceLink))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newSourceLink != null)
            msgs = ((InternalEObject) newSourceLink).eInverseAdd(this, PatternPackage.LINK__MULTI_LINK_FROM_SOURCE,
               Link.class, msgs);
         msgs = basicSetSourceLink(newSourceLink, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.MULTI_LINK__SOURCE_LINK, newSourceLink,
            newSourceLink));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public org.storydriven.modeling.pattern.Object getTargetObject ()
   {
      if (targetObject != null && targetObject.eIsProxy())
      {
         InternalEObject oldTargetObject = (InternalEObject) targetObject;
         targetObject = (org.storydriven.modeling.pattern.Object) eResolveProxy(oldTargetObject);
         if (targetObject != oldTargetObject)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.MULTI_LINK__TARGET_OBJECT,
                  oldTargetObject, targetObject));
         }
      }
      return targetObject;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public org.storydriven.modeling.pattern.Object basicGetTargetObject ()
   {
      return targetObject;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setTargetObject (org.storydriven.modeling.pattern.Object newTargetObject)
   {
      org.storydriven.modeling.pattern.Object oldTargetObject = targetObject;
      targetObject = newTargetObject;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.MULTI_LINK__TARGET_OBJECT,
            oldTargetObject, targetObject));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Link getTargetLink ()
   {
      if (targetLink != null && targetLink.eIsProxy())
      {
         InternalEObject oldTargetLink = (InternalEObject) targetLink;
         targetLink = (Link) eResolveProxy(oldTargetLink);
         if (targetLink != oldTargetLink)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.MULTI_LINK__TARGET_LINK,
                  oldTargetLink, targetLink));
         }
      }
      return targetLink;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Link basicGetTargetLink ()
   {
      return targetLink;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetTargetLink (Link newTargetLink, NotificationChain msgs)
   {
      Link oldTargetLink = targetLink;
      targetLink = newTargetLink;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            PatternPackage.MULTI_LINK__TARGET_LINK, oldTargetLink, newTargetLink);
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
   public void setTargetLink (Link newTargetLink)
   {
      if (newTargetLink != targetLink)
      {
         NotificationChain msgs = null;
         if (targetLink != null)
            msgs = ((InternalEObject) targetLink).eInverseRemove(this, PatternPackage.LINK__MULTI_LINK_TO_TARGET,
               Link.class, msgs);
         if (newTargetLink != null)
            msgs = ((InternalEObject) newTargetLink).eInverseAdd(this, PatternPackage.LINK__MULTI_LINK_TO_TARGET,
               Link.class, msgs);
         msgs = basicSetTargetLink(newTargetLink, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.MULTI_LINK__TARGET_LINK, newTargetLink,
            newTargetLink));
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
         case PatternPackage.MULTI_LINK__SOURCE_LINK:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetSourceLink((Link) otherEnd, msgs);
         case PatternPackage.MULTI_LINK__TARGET_LINK:
            if (targetLink != null)
               msgs = ((InternalEObject) targetLink).eInverseRemove(this, PatternPackage.LINK__MULTI_LINK_TO_TARGET,
                  Link.class, msgs);
            return basicSetTargetLink((Link) otherEnd, msgs);
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
         case PatternPackage.MULTI_LINK__SOURCE_LINK:
            return basicSetSourceLink(null, msgs);
         case PatternPackage.MULTI_LINK__TARGET_LINK:
            return basicSetTargetLink(null, msgs);
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
         case PatternPackage.MULTI_LINK__SOURCE_LINK:
            return eInternalContainer().eInverseRemove(this, PatternPackage.LINK__MULTI_LINK_FROM_SOURCE, Link.class,
               msgs);
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
         case PatternPackage.MULTI_LINK__INDEX:
            return getIndex();
         case PatternPackage.MULTI_LINK__MULTI_LINK_TYPE:
            return getMultiLinkType();
         case PatternPackage.MULTI_LINK__NEGATIVE:
            return isNegative();
         case PatternPackage.MULTI_LINK__SOURCE_LINK:
            if (resolve)
               return getSourceLink();
            return basicGetSourceLink();
         case PatternPackage.MULTI_LINK__TARGET_OBJECT:
            if (resolve)
               return getTargetObject();
            return basicGetTargetObject();
         case PatternPackage.MULTI_LINK__TARGET_LINK:
            if (resolve)
               return getTargetLink();
            return basicGetTargetLink();
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
         case PatternPackage.MULTI_LINK__INDEX:
            setIndex((Integer) newValue);
            return;
         case PatternPackage.MULTI_LINK__MULTI_LINK_TYPE:
            setMultiLinkType((MultiLinkType) newValue);
            return;
         case PatternPackage.MULTI_LINK__NEGATIVE:
            setNegative((Boolean) newValue);
            return;
         case PatternPackage.MULTI_LINK__SOURCE_LINK:
            setSourceLink((Link) newValue);
            return;
         case PatternPackage.MULTI_LINK__TARGET_OBJECT:
            setTargetObject((org.storydriven.modeling.pattern.Object) newValue);
            return;
         case PatternPackage.MULTI_LINK__TARGET_LINK:
            setTargetLink((Link) newValue);
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
         case PatternPackage.MULTI_LINK__INDEX:
            setIndex(INDEX_EDEFAULT);
            return;
         case PatternPackage.MULTI_LINK__MULTI_LINK_TYPE:
            setMultiLinkType(MULTI_LINK_TYPE_EDEFAULT);
            return;
         case PatternPackage.MULTI_LINK__NEGATIVE:
            setNegative(NEGATIVE_EDEFAULT);
            return;
         case PatternPackage.MULTI_LINK__SOURCE_LINK:
            setSourceLink((Link) null);
            return;
         case PatternPackage.MULTI_LINK__TARGET_OBJECT:
            setTargetObject((org.storydriven.modeling.pattern.Object) null);
            return;
         case PatternPackage.MULTI_LINK__TARGET_LINK:
            setTargetLink((Link) null);
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
         case PatternPackage.MULTI_LINK__INDEX:
            return index != INDEX_EDEFAULT;
         case PatternPackage.MULTI_LINK__MULTI_LINK_TYPE:
            return multiLinkType != MULTI_LINK_TYPE_EDEFAULT;
         case PatternPackage.MULTI_LINK__NEGATIVE:
            return negative != NEGATIVE_EDEFAULT;
         case PatternPackage.MULTI_LINK__SOURCE_LINK:
            return basicGetSourceLink() != null;
         case PatternPackage.MULTI_LINK__TARGET_OBJECT:
            return targetObject != null;
         case PatternPackage.MULTI_LINK__TARGET_LINK:
            return targetLink != null;
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
      result.append(" (index: ");
      result.append(index);
      result.append(", multiLinkType: ");
      result.append(multiLinkType);
      result.append(", negative: ");
      result.append(negative);
      result.append(')');
      return result.toString();
   }

} //MultiLinkImpl
