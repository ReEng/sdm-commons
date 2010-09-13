/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.Expression;
import org.storydriven.modeling.expressions.ComplexExpression;
import org.storydriven.modeling.expressions.ExpressionsPackage;
import org.storydriven.modeling.impl.ExpressionImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Complex Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.storydriven.modeling.expressions.impl.ComplexExpressionImpl#getChildExpressions <em>Child Expression</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ComplexExpressionImpl extends ExpressionImpl implements ComplexExpression
{
   /**
    * The cached value of the '{@link #getChildExpressions() <em>Child Expression</em>}' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getChildExpressions()
    * @generated
    * @ordered
    */
   protected EList<Expression> childExpressions;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected ComplexExpressionImpl ()
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
      return ExpressionsPackage.Literals.COMPLEX_EXPRESSION;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<Expression> getChildExpressions ()
   {
      if (this.childExpressions == null)
      {
         this.childExpressions = new EObjectContainmentEList.Resolving<Expression>(Expression.class, this,
            ExpressionsPackage.COMPLEX_EXPRESSION__CHILD_EXPRESSION);
      }
      return this.childExpressions;
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
         case ExpressionsPackage.COMPLEX_EXPRESSION__CHILD_EXPRESSION:
            return ((InternalEList<?>) getChildExpressions()).basicRemove(otherEnd, msgs);
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
         case ExpressionsPackage.COMPLEX_EXPRESSION__CHILD_EXPRESSION:
            return getChildExpressions();
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
         case ExpressionsPackage.COMPLEX_EXPRESSION__CHILD_EXPRESSION:
            getChildExpressions().clear();
            getChildExpressions().addAll((Collection<? extends Expression>) newValue);
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
         case ExpressionsPackage.COMPLEX_EXPRESSION__CHILD_EXPRESSION:
            getChildExpressions().clear();
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
         case ExpressionsPackage.COMPLEX_EXPRESSION__CHILD_EXPRESSION:
            return this.childExpressions != null && !this.childExpressions.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // ComplexExpressionImpl
