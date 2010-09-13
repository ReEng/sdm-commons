/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.activities.OperationExtension;
import org.storydriven.modeling.impl.CommentableElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.activities.impl.ActivityImpl#getOwnedActivityNodes <em>Owned Activity Node</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.ActivityImpl#getOwningOperation <em>Owning Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends CommentableElementImpl implements Activity
{
   private static final String ACTIVITY_ANNOTATION_URI = "http://ns.storydriven.org/sdm/activities/activity";

   /**
    * The cached value of the '{@link #getOwnedActivityNodes() <em>Owned Activity Node</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOwnedActivityNodes()
    * @generated
    * @ordered
    */
   protected EList<ActivityNode> ownedActivityNodes;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ActivityImpl ()
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
      return ActivitiesPackage.Literals.ACTIVITY;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public OperationExtension getOwningOperation ()
   {
      if (eContainerFeatureID() != ActivitiesPackage.ACTIVITY__OWNING_OPERATION)
         return null;
      return (OperationExtension) eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated NOT
    */
   public EOperation basicGetOwningOperation ()
   {
      EAnnotation annotation = getOwningOperationAnnotation();
      if (annotation != null)
      {
         EModelElement modelElement = annotation.getEModelElement();
         if (modelElement instanceof EOperation)
         {
            return (EOperation) modelElement;
         }
      }
      return null;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetOwningOperation (OperationExtension newOwningOperation, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newOwningOperation, ActivitiesPackage.ACTIVITY__OWNING_OPERATION,
         msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setOwningOperation (OperationExtension newOwningOperation)
   {
      if (newOwningOperation != eInternalContainer()
         || (eContainerFeatureID() != ActivitiesPackage.ACTIVITY__OWNING_OPERATION && newOwningOperation != null))
      {
         if (EcoreUtil.isAncestor(this, newOwningOperation))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newOwningOperation != null)
            msgs = ((InternalEObject) newOwningOperation).eInverseAdd(this,
               ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY, OperationExtension.class, msgs);
         msgs = basicSetOwningOperation(newOwningOperation, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY__OWNING_OPERATION,
            newOwningOperation, newOwningOperation));
   }

   protected EAnnotation getOwningOperationAnnotation ()
   {
      if (eContainmentFeature() == EcorePackage.Literals.EANNOTATION__CONTENTS)
      {
         EAnnotation annotation = (EAnnotation) eContainer();
         if (ACTIVITY_ANNOTATION_URI.equals(annotation.getSource()))
         {
            return annotation;
         }
      }
      return null;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ActivityNode> getOwnedActivityNodes ()
   {
      if (ownedActivityNodes == null)
      {
         ownedActivityNodes = new EObjectContainmentWithInverseEList.Resolving<ActivityNode>(ActivityNode.class, this,
            ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE, ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY);
      }
      return ownedActivityNodes;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings ("unchecked")
   @Override
   public NotificationChain eInverseAdd (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedActivityNodes()).basicAdd(otherEnd,
               msgs);
         case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetOwningOperation((OperationExtension) otherEnd, msgs);
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
         case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE:
            return ((InternalEList<?>) getOwnedActivityNodes()).basicRemove(otherEnd, msgs);
         case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
            return basicSetOwningOperation(null, msgs);
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
         case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
            return eInternalContainer().eInverseRemove(this, ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY,
               OperationExtension.class, msgs);
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
         case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE:
            return getOwnedActivityNodes();
         case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
            if (resolve)
               return getOwningOperation();
            return basicGetOwningOperation();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings ("unchecked")
   @Override
   public void eSet (int featureID, Object newValue)
   {
      switch (featureID)
      {
         case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE:
            getOwnedActivityNodes().clear();
            getOwnedActivityNodes().addAll((Collection<? extends ActivityNode>) newValue);
            return;
         case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
            setOwningOperation((OperationExtension) newValue);
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
         case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE:
            getOwnedActivityNodes().clear();
            return;
         case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
            setOwningOperation((OperationExtension) null);
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
         case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE:
            return ownedActivityNodes != null && !ownedActivityNodes.isEmpty();
         case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
            return basicGetOwningOperation() != null;
      }
      return super.eIsSet(featureID);
   }

} //ActivityImpl
