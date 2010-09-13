/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.ExceptionExpression;
import org.storydriven.modeling.impl.ExpressionImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Exception Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.storydriven.modeling.activities.impl.ExceptionExpressionImpl#getExceptionTypes <em>Exception Type</em>}</li>
 * <li>{@link org.storydriven.modeling.activities.impl.ExceptionExpressionImpl#getVariableName <em>Variable Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ExceptionExpressionImpl extends ExpressionImpl implements ExceptionExpression
{
   /**
    * The cached value of the '{@link #getExceptionTypes() <em>Exception Type</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getExceptionTypes()
    * @generated
    * @ordered
    */
   protected EList<EClassifier> exceptionTypes;

   /**
    * The default value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getVariableName()
    * @generated
    * @ordered
    */
   protected static final String VARIABLE_NAME_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getVariableName()
    * @generated
    * @ordered
    */
   protected String variableName = VARIABLE_NAME_EDEFAULT;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected ExceptionExpressionImpl ()
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
      return ActivitiesPackage.Literals.EXCEPTION_EXPRESSION;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<EClassifier> getExceptionTypes ()
   {
      if (this.exceptionTypes == null)
      {
         this.exceptionTypes = new EObjectResolvingEList<EClassifier>(EClassifier.class, this,
            ActivitiesPackage.EXCEPTION_EXPRESSION__EXCEPTION_TYPE);
      }
      return this.exceptionTypes;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getVariableName ()
   {
      return this.variableName;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setVariableName (String newVariableName)
   {
      String oldVariableName = this.variableName;
      this.variableName = newVariableName;
      if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.EXCEPTION_EXPRESSION__VARIABLE_NAME,
            oldVariableName, this.variableName));
      }
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
         case ActivitiesPackage.EXCEPTION_EXPRESSION__EXCEPTION_TYPE:
            return getExceptionTypes();
         case ActivitiesPackage.EXCEPTION_EXPRESSION__VARIABLE_NAME:
            return getVariableName();
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
         case ActivitiesPackage.EXCEPTION_EXPRESSION__EXCEPTION_TYPE:
            getExceptionTypes().clear();
            getExceptionTypes().addAll((Collection<? extends EClassifier>) newValue);
            return;
         case ActivitiesPackage.EXCEPTION_EXPRESSION__VARIABLE_NAME:
            setVariableName((String) newValue);
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
         case ActivitiesPackage.EXCEPTION_EXPRESSION__EXCEPTION_TYPE:
            getExceptionTypes().clear();
            return;
         case ActivitiesPackage.EXCEPTION_EXPRESSION__VARIABLE_NAME:
            setVariableName(VARIABLE_NAME_EDEFAULT);
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
         case ActivitiesPackage.EXCEPTION_EXPRESSION__EXCEPTION_TYPE:
            return this.exceptionTypes != null && !this.exceptionTypes.isEmpty();
         case ActivitiesPackage.EXCEPTION_EXPRESSION__VARIABLE_NAME:
            return VARIABLE_NAME_EDEFAULT == null ? this.variableName != null : !VARIABLE_NAME_EDEFAULT
               .equals(this.variableName);
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
      result.append(" (variableName: ");
      result.append(this.variableName);
      result.append(')');
      return result.toString();
   }

} // ExceptionExpressionImpl
