/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.OperationExtension;
import org.storydriven.modeling.calls.Callable;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.impl.ExtensionImpl;
import org.storydriven.modeling.impl.ExtensionOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Operation Extension</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.activities.impl.OperationExtensionImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.OperationExtensionImpl#getIns <em>In</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.OperationExtensionImpl#getOuts <em>Out</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.OperationExtensionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.OperationExtensionImpl#getOwnedActivity <em>Owned Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationExtensionImpl extends ExtensionImpl implements OperationExtension
{
   /**
    * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getComment()
    * @generated
    * @ordered
    */
   protected static final String COMMENT_EDEFAULT = null;
   /**
    * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getComment()
    * @generated
    * @ordered
    */
   protected String comment = COMMENT_EDEFAULT;
   /**
    * The cached value of the '{@link #getOwnedActivity() <em>Owned Activity</em>}' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getOwnedActivity()
    * @generated
    * @ordered
    */
   protected Activity ownedActivity;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected OperationExtensionImpl ()
   {
      super();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass ()
   {
      return ActivitiesPackage.Literals.OPERATION_EXTENSION;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public String getComment ()
   {
      return comment;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setComment (String newComment)
   {
      String oldComment = comment;
      comment = newComment;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.OPERATION_EXTENSION__COMMENT,
            oldComment, comment));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EList<EParameter> getIns ()
   {
      EOperation operation = getOperation();
      return operation == null ? ECollections.<EParameter> emptyEList() : operation.getEParameters();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EList<EParameter> getOuts ()
   {
      EOperation operation = getOperation();
      return operation == null ? ECollections.<EParameter> emptyEList() : operation.getEParameters();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EOperation getOperation ()
   {
      return OperationExtensionOperations.getOperation(this);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setOperation (EOperation newOperation)
   {
      OperationExtensionOperations.setOperation(this, newOperation);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void unsetOperation ()
   {
      OperationExtensionOperations.unsetOperation(this);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public boolean isSetOperation ()
   {
      return OperationExtensionOperations.isSetOperation(this);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
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
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Activity basicGetOwnedActivity ()
   {
      return ownedActivity;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
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
    * <!-- begin-user-doc --> <!-- end-user-doc -->
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
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean NumberOfOutParams (DiagnosticChain diagnostics, Map<Object, Object> context)
   {
      return OperationExtensionOperations.NumberOfOutParams(this, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
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
    * <!-- begin-user-doc --> <!-- end-user-doc -->
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
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet (int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
         case ActivitiesPackage.OPERATION_EXTENSION__COMMENT:
            return getComment();
         case ActivitiesPackage.OPERATION_EXTENSION__IN:
            return getIns();
         case ActivitiesPackage.OPERATION_EXTENSION__OUT:
            return getOuts();
         case ActivitiesPackage.OPERATION_EXTENSION__OPERATION:
            return getOperation();
         case ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY:
            if (resolve)
               return getOwnedActivity();
            return basicGetOwnedActivity();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet (int featureID, Object newValue)
   {
      switch (featureID)
      {
         case ActivitiesPackage.OPERATION_EXTENSION__COMMENT:
            setComment((String) newValue);
            return;
         case ActivitiesPackage.OPERATION_EXTENSION__OPERATION:
            setOperation((EOperation) newValue);
            return;
         case ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY:
            setOwnedActivity((Activity) newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset (int featureID)
   {
      switch (featureID)
      {
         case ActivitiesPackage.OPERATION_EXTENSION__COMMENT:
            setComment(COMMENT_EDEFAULT);
            return;
         case ActivitiesPackage.OPERATION_EXTENSION__OPERATION:
            unsetOperation();
            return;
         case ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY:
            setOwnedActivity((Activity) null);
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet (int featureID)
   {
      switch (featureID)
      {
         case ActivitiesPackage.OPERATION_EXTENSION__COMMENT:
            return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
         case ActivitiesPackage.OPERATION_EXTENSION__IN:
            return !getIns().isEmpty();
         case ActivitiesPackage.OPERATION_EXTENSION__OUT:
            return !getOuts().isEmpty();
         case ActivitiesPackage.OPERATION_EXTENSION__OPERATION:
            return isSetOperation();
         case ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY:
            return ownedActivity != null;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eBaseStructuralFeatureID (int derivedFeatureID, Class<?> baseClass)
   {
      if (baseClass == CommentableElement.class)
      {
         switch (derivedFeatureID)
         {
            case ActivitiesPackage.OPERATION_EXTENSION__COMMENT:
               return SDMPackage.COMMENTABLE_ELEMENT__COMMENT;
            default:
               return -1;
         }
      }
      if (baseClass == Callable.class)
      {
         switch (derivedFeatureID)
         {
            case ActivitiesPackage.OPERATION_EXTENSION__IN:
               return CallsPackage.CALLABLE__IN;
            case ActivitiesPackage.OPERATION_EXTENSION__OUT:
               return CallsPackage.CALLABLE__OUT;
            default:
               return -1;
         }
      }
      return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eDerivedStructuralFeatureID (int baseFeatureID, Class<?> baseClass)
   {
      if (baseClass == CommentableElement.class)
      {
         switch (baseFeatureID)
         {
            case SDMPackage.COMMENTABLE_ELEMENT__COMMENT:
               return ActivitiesPackage.OPERATION_EXTENSION__COMMENT;
            default:
               return -1;
         }
      }
      if (baseClass == Callable.class)
      {
         switch (baseFeatureID)
         {
            case CallsPackage.CALLABLE__IN:
               return ActivitiesPackage.OPERATION_EXTENSION__IN;
            case CallsPackage.CALLABLE__OUT:
               return ActivitiesPackage.OPERATION_EXTENSION__OUT;
            default:
               return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   @SuppressWarnings ("unchecked")
   public Object eInvoke (int operationID, EList<?> arguments) throws InvocationTargetException
   {
      switch (operationID)
      {
         case ActivitiesPackage.OPERATION_EXTENSION___NUMBER_OF_OUT_PARAMS__DIAGNOSTICCHAIN_MAP:
            return NumberOfOutParams((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
      }
      return super.eInvoke(operationID, arguments);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString ()
   {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (comment: ");
      result.append(comment);
      result.append(')');
      return result.toString();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject getBase ()
   {
      return getOperation();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject basicGetBase ()
   {
      return getOperation();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean isSetBase ()
   {
      return false;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   @Override
   public boolean isSetModelBase ()
   {
      return ExtensionOperations.isSetModelBase(this);
   }

} // OperationExtensionImpl
