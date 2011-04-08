/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.patterns.PrimitiveVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.impl.PrimitiveVariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.PrimitiveVariableImpl#getEDataType <em>EData Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimitiveVariableImpl extends AbstractVariableImpl implements PrimitiveVariable
{
   /**
    * The cached value of the '{@link #getEDataType() <em>EData Type</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getEDataType()
    * @generated
    * @ordered
    */
   protected EDataType eDataType;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected PrimitiveVariableImpl ()
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
      return PatternsPackage.Literals.PRIMITIVE_VARIABLE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClassifier getType ()
   {
      EClassifier type = basicGetType();
      return type != null && type.eIsProxy() ? (EClassifier) eResolveProxy((InternalEObject) type) : type;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClassifier basicGetType ()
   {
      if (eIsSet(PatternsPackage.PRIMITIVE_VARIABLE__EDATA_TYPE))
      {
         return basicGetEDataType();
      }
      return null;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EDataType getEDataType ()
   {
      if (eDataType != null && eDataType.eIsProxy())
      {
         InternalEObject oldEDataType = (InternalEObject) eDataType;
         eDataType = (EDataType) eResolveProxy(oldEDataType);
         if (eDataType != oldEDataType)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  PatternsPackage.PRIMITIVE_VARIABLE__EDATA_TYPE, oldEDataType, eDataType));
         }
      }
      return eDataType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EDataType basicGetEDataType ()
   {
      return eDataType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setEDataType (EDataType newEDataType)
   {
      EDataType oldEDataType = eDataType;
      eDataType = newEDataType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.PRIMITIVE_VARIABLE__EDATA_TYPE,
            oldEDataType, eDataType));
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
         case PatternsPackage.PRIMITIVE_VARIABLE__EDATA_TYPE:
            if (resolve)
               return getEDataType();
            return basicGetEDataType();
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
         case PatternsPackage.PRIMITIVE_VARIABLE__EDATA_TYPE:
            setEDataType((EDataType) newValue);
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
         case PatternsPackage.PRIMITIVE_VARIABLE__EDATA_TYPE:
            setEDataType((EDataType) null);
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
         case PatternsPackage.PRIMITIVE_VARIABLE__EDATA_TYPE:
            return eDataType != null;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isSetType ()
   {
      return eIsSet(PatternsPackage.PRIMITIVE_VARIABLE__EDATA_TYPE);
   }

} //PrimitiveVariableImpl
