/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EGenericTypeImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.TypedElement;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Typed Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.storydriven.modeling.impl.TypedElementImpl#getType <em>Type</em>}</li>
 * <li>{@link org.storydriven.modeling.impl.TypedElementImpl#getGenericType <em>Generic Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class TypedElementImpl extends ExtendableElementImpl implements TypedElement
{
   /**
    * The cached value of the '{@link #getType() <em>Type</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getType()
    * @generated
    * @ordered
    */
   protected EClassifier type;

   /**
    * This is true if the Type reference has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   protected boolean typeESet;

   /**
    * The cached value of the '{@link #getGenericType() <em>Generic Type</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getGenericType()
    * @generated
    * @ordered
    */
   protected EGenericType genericType;

   /**
    * This is true if the Generic Type containment reference has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   protected boolean genericTypeESet;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected TypedElementImpl ()
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
      return SDMPackage.Literals.TYPED_ELEMENT;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClassifier getType ()
   {
      if (this.type != null && this.type.eIsProxy())
      {
         InternalEObject oldType = (InternalEObject) this.type;
         this.type = (EClassifier) eResolveProxy(oldType);
         if (this.type != oldType)
         {
            if (eNotificationRequired())
            {
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, SDMPackage.TYPED_ELEMENT__TYPE, oldType,
                  this.type));
            }
         }
      }
      return this.type;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClassifier basicGetType ()
   {
      return this.type;
   }

   protected NotificationChain basicSetType (EClassifier newType, NotificationChain msgs)
   {
      EClassifier oldType = this.type;
      this.type = newType;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SDMPackage.TYPED_ELEMENT__TYPE,
            oldType, this.type);
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

   protected NotificationChain setType (EClassifier newType, NotificationChain msgs)
   {
      msgs = basicSetType(newType, msgs);
      EGenericType newGenericType = null;
      if (newType != null)
      {
         newGenericType = EcoreFactory.eINSTANCE.createEGenericType();
         newGenericType.setEClassifier(this.type);
      }
      msgs = setGenericType(newGenericType, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setType (EClassifier newType)
   {
      NotificationChain msgs = setType(newType, null);
      if (msgs != null)
      {
         msgs.dispatch();
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void unsetType ()
   {
      setType(null);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public boolean isSetType ()
   {
      return this.type != null && this.genericType.getETypeParameter() == null
         && this.genericType.getETypeArguments().isEmpty();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EGenericType getGenericType ()
   {
      if (this.genericType != null && this.genericType.eIsProxy())
      {
         InternalEObject oldGenericType = (InternalEObject) this.genericType;
         this.genericType = (EGenericType) eResolveProxy(oldGenericType);
         if (this.genericType != oldGenericType)
         {
            InternalEObject newGenericType = (InternalEObject) this.genericType;
            NotificationChain msgs = oldGenericType.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - SDMPackage.TYPED_ELEMENT__GENERIC_TYPE, null, null);
            if (newGenericType.eInternalContainer() == null)
            {
               msgs = newGenericType.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SDMPackage.TYPED_ELEMENT__GENERIC_TYPE,
                  null, msgs);
            }
            if (msgs != null)
            {
               msgs.dispatch();
            }
            if (eNotificationRequired())
            {
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, SDMPackage.TYPED_ELEMENT__GENERIC_TYPE,
                  oldGenericType, this.genericType));
            }
         }
      }
      return this.genericType;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EGenericType basicGetGenericType ()
   {
      return this.genericType;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   protected NotificationChain basicSetGenericType (EGenericType newGenericType, NotificationChain msgs)
   {
      EGenericType oldGenericType = this.genericType;
      this.genericType = newGenericType;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            SDMPackage.TYPED_ELEMENT__GENERIC_TYPE, oldGenericType, newGenericType);
         if (msgs == null)
         {
            msgs = notification;
         }
         else
         {
            msgs.add(notification);
         }
      }
      if (newGenericType == null)
      {
         if (this.type != null)
         {
            msgs = setType(null, msgs);
         }
      }
      else
      {
         EClassifier newType = ((EGenericTypeImpl) newGenericType).basicGetERawType();
         if (newType != this.type)
         {
            msgs = setType(newType, msgs);
         }
      }
      return msgs;
   }

   protected NotificationChain setGenericType (EGenericType newGenericType, NotificationChain msgs)
   {
      if (newGenericType != this.genericType)
      {
         if (this.genericType != null)
         {
            msgs = ((InternalEObject) this.genericType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - SDMPackage.TYPED_ELEMENT__GENERIC_TYPE, null, msgs);
         }
         if (newGenericType != null)
         {
            msgs = ((InternalEObject) newGenericType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - SDMPackage.TYPED_ELEMENT__GENERIC_TYPE, null, msgs);
         }
         msgs = basicSetGenericType(newGenericType, msgs);
      }
      else if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            SDMPackage.TYPED_ELEMENT__GENERIC_TYPE, newGenericType, newGenericType);
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
    * @generated NOT
    */
   public void setGenericType (EGenericType newGenericType)
   {
      NotificationChain msgs = setGenericType(newGenericType, null);
      if (msgs != null)
      {
         msgs.dispatch();
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public NotificationChain basicUnsetGenericType (NotificationChain msgs)
   {
      msgs = setType(null, msgs);
      return basicSetGenericType(null, msgs);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void unsetGenericType ()
   {
      setGenericType(null);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isSetGenericType ()
   {
      return this.genericTypeESet;
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
         case SDMPackage.TYPED_ELEMENT__GENERIC_TYPE:
            return basicUnsetGenericType(msgs);
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
         case SDMPackage.TYPED_ELEMENT__TYPE:
            if (resolve)
            {
               return getType();
            }
            return basicGetType();
         case SDMPackage.TYPED_ELEMENT__GENERIC_TYPE:
            if (resolve)
            {
               return getGenericType();
            }
            return basicGetGenericType();
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
         case SDMPackage.TYPED_ELEMENT__TYPE:
            setType((EClassifier) newValue);
            return;
         case SDMPackage.TYPED_ELEMENT__GENERIC_TYPE:
            setGenericType((EGenericType) newValue);
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
         case SDMPackage.TYPED_ELEMENT__TYPE:
            unsetType();
            return;
         case SDMPackage.TYPED_ELEMENT__GENERIC_TYPE:
            unsetGenericType();
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
         case SDMPackage.TYPED_ELEMENT__TYPE:
            return isSetType();
         case SDMPackage.TYPED_ELEMENT__GENERIC_TYPE:
            return isSetGenericType();
      }
      return super.eIsSet(featureID);
   }

} // TypedElementImpl
