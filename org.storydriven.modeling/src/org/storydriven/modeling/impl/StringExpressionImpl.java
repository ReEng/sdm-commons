/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.StringExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.impl.StringExpressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.storydriven.modeling.impl.StringExpressionImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringExpressionImpl extends ExpressionImpl implements StringExpression
{
   /**
    * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getExpression()
    * @generated
    * @ordered
    */
   protected static final String EXPRESSION_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getExpression()
    * @generated
    * @ordered
    */
   protected String expression = EXPRESSION_EDEFAULT;

   /**
    * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getLanguage()
    * @generated
    * @ordered
    */
   protected static final String LANGUAGE_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getLanguage()
    * @generated
    * @ordered
    */
   protected String language = LANGUAGE_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected StringExpressionImpl ()
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
      return SDMPackage.Literals.STRING_EXPRESSION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getExpression ()
   {
      return expression;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setExpression (String newExpression)
   {
      String oldExpression = expression;
      expression = newExpression;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, SDMPackage.STRING_EXPRESSION__EXPRESSION, oldExpression,
            expression));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getLanguage ()
   {
      return language;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setLanguage (String newLanguage)
   {
      String oldLanguage = language;
      language = newLanguage;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, SDMPackage.STRING_EXPRESSION__LANGUAGE, oldLanguage,
            language));
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
         case SDMPackage.STRING_EXPRESSION__EXPRESSION:
            return getExpression();
         case SDMPackage.STRING_EXPRESSION__LANGUAGE:
            return getLanguage();
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
         case SDMPackage.STRING_EXPRESSION__EXPRESSION:
            setExpression((String) newValue);
            return;
         case SDMPackage.STRING_EXPRESSION__LANGUAGE:
            setLanguage((String) newValue);
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
         case SDMPackage.STRING_EXPRESSION__EXPRESSION:
            setExpression(EXPRESSION_EDEFAULT);
            return;
         case SDMPackage.STRING_EXPRESSION__LANGUAGE:
            setLanguage(LANGUAGE_EDEFAULT);
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
         case SDMPackage.STRING_EXPRESSION__EXPRESSION:
            return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
         case SDMPackage.STRING_EXPRESSION__LANGUAGE:
            return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
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
      result.append(" (expression: ");
      result.append(expression);
      result.append(", language: ");
      result.append(language);
      result.append(')');
      return result.toString();
   }

} //StringExpressionImpl
