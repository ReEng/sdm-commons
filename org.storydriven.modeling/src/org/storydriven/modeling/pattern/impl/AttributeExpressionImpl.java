/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.pattern.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.modeling.Expression;

import org.storydriven.modeling.impl.NamedElementImpl;

import org.storydriven.modeling.pattern.AttributeExpression;
import org.storydriven.modeling.pattern.Operator;
import org.storydriven.modeling.pattern.PatternPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.pattern.impl.AttributeExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.AttributeExpressionImpl#getOwningObject <em>Owning Object</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.AttributeExpressionImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.storydriven.modeling.pattern.impl.AttributeExpressionImpl#getValues <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeExpressionImpl extends NamedElementImpl implements AttributeExpression
{
   /**
    * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOperator()
    * @generated
    * @ordered
    */
   protected static final Operator OPERATOR_EDEFAULT = Operator.EQUAL;

   /**
    * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOperator()
    * @generated
    * @ordered
    */
   protected Operator operator = OPERATOR_EDEFAULT;

   /**
    * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAttribute()
    * @generated
    * @ordered
    */
   protected EAttribute attribute;

   /**
    * The cached value of the '{@link #getValues() <em>Value</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getValues()
    * @generated
    * @ordered
    */
   protected EList<Expression> values;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected AttributeExpressionImpl ()
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
      return PatternPackage.Literals.ATTRIBUTE_EXPRESSION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Operator getOperator ()
   {
      return operator;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setOperator (Operator newOperator)
   {
      Operator oldOperator = operator;
      operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ATTRIBUTE_EXPRESSION__OPERATOR,
            oldOperator, operator));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public org.storydriven.modeling.pattern.Object getOwningObject ()
   {
      if (eContainerFeatureID() != PatternPackage.ATTRIBUTE_EXPRESSION__OWNING_OBJECT)
         return null;
      return (org.storydriven.modeling.pattern.Object) eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public org.storydriven.modeling.pattern.Object basicGetOwningObject ()
   {
      if (eContainerFeatureID() != PatternPackage.ATTRIBUTE_EXPRESSION__OWNING_OBJECT)
         return null;
      return (org.storydriven.modeling.pattern.Object) eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetOwningObject (org.storydriven.modeling.pattern.Object newOwningObject,
                                                  NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newOwningObject, PatternPackage.ATTRIBUTE_EXPRESSION__OWNING_OBJECT,
         msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setOwningObject (org.storydriven.modeling.pattern.Object newOwningObject)
   {
      if (newOwningObject != eInternalContainer()
         || (eContainerFeatureID() != PatternPackage.ATTRIBUTE_EXPRESSION__OWNING_OBJECT && newOwningObject != null))
      {
         if (EcoreUtil.isAncestor(this, newOwningObject))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newOwningObject != null)
            msgs = ((InternalEObject) newOwningObject).eInverseAdd(this,
               PatternPackage.OBJECT__OWNED_ATTRIBUTE_EXPRESSION, org.storydriven.modeling.pattern.Object.class, msgs);
         msgs = basicSetOwningObject(newOwningObject, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ATTRIBUTE_EXPRESSION__OWNING_OBJECT,
            newOwningObject, newOwningObject));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAttribute ()
   {
      if (attribute != null && attribute.eIsProxy())
      {
         InternalEObject oldAttribute = (InternalEObject) attribute;
         attribute = (EAttribute) eResolveProxy(oldAttribute);
         if (attribute != oldAttribute)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  PatternPackage.ATTRIBUTE_EXPRESSION__ATTRIBUTE, oldAttribute, attribute));
         }
      }
      return attribute;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute basicGetAttribute ()
   {
      return attribute;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setAttribute (EAttribute newAttribute)
   {
      EAttribute oldAttribute = attribute;
      attribute = newAttribute;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ATTRIBUTE_EXPRESSION__ATTRIBUTE,
            oldAttribute, attribute));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Expression> getValues ()
   {
      if (values == null)
      {
         values = new EObjectContainmentEList.Resolving<Expression>(Expression.class, this,
            PatternPackage.ATTRIBUTE_EXPRESSION__VALUE);
      }
      return values;
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
         case PatternPackage.ATTRIBUTE_EXPRESSION__OWNING_OBJECT:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetOwningObject((org.storydriven.modeling.pattern.Object) otherEnd, msgs);
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
         case PatternPackage.ATTRIBUTE_EXPRESSION__OWNING_OBJECT:
            return basicSetOwningObject(null, msgs);
         case PatternPackage.ATTRIBUTE_EXPRESSION__VALUE:
            return ((InternalEList<?>) getValues()).basicRemove(otherEnd, msgs);
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
         case PatternPackage.ATTRIBUTE_EXPRESSION__OWNING_OBJECT:
            return eInternalContainer().eInverseRemove(this, PatternPackage.OBJECT__OWNED_ATTRIBUTE_EXPRESSION,
               org.storydriven.modeling.pattern.Object.class, msgs);
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
         case PatternPackage.ATTRIBUTE_EXPRESSION__OPERATOR:
            return getOperator();
         case PatternPackage.ATTRIBUTE_EXPRESSION__OWNING_OBJECT:
            if (resolve)
               return getOwningObject();
            return basicGetOwningObject();
         case PatternPackage.ATTRIBUTE_EXPRESSION__ATTRIBUTE:
            if (resolve)
               return getAttribute();
            return basicGetAttribute();
         case PatternPackage.ATTRIBUTE_EXPRESSION__VALUE:
            return getValues();
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
         case PatternPackage.ATTRIBUTE_EXPRESSION__OPERATOR:
            setOperator((Operator) newValue);
            return;
         case PatternPackage.ATTRIBUTE_EXPRESSION__OWNING_OBJECT:
            setOwningObject((org.storydriven.modeling.pattern.Object) newValue);
            return;
         case PatternPackage.ATTRIBUTE_EXPRESSION__ATTRIBUTE:
            setAttribute((EAttribute) newValue);
            return;
         case PatternPackage.ATTRIBUTE_EXPRESSION__VALUE:
            getValues().clear();
            getValues().addAll((Collection<? extends Expression>) newValue);
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
         case PatternPackage.ATTRIBUTE_EXPRESSION__OPERATOR:
            setOperator(OPERATOR_EDEFAULT);
            return;
         case PatternPackage.ATTRIBUTE_EXPRESSION__OWNING_OBJECT:
            setOwningObject((org.storydriven.modeling.pattern.Object) null);
            return;
         case PatternPackage.ATTRIBUTE_EXPRESSION__ATTRIBUTE:
            setAttribute((EAttribute) null);
            return;
         case PatternPackage.ATTRIBUTE_EXPRESSION__VALUE:
            getValues().clear();
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
         case PatternPackage.ATTRIBUTE_EXPRESSION__OPERATOR:
            return operator != OPERATOR_EDEFAULT;
         case PatternPackage.ATTRIBUTE_EXPRESSION__OWNING_OBJECT:
            return basicGetOwningObject() != null;
         case PatternPackage.ATTRIBUTE_EXPRESSION__ATTRIBUTE:
            return attribute != null;
         case PatternPackage.ATTRIBUTE_EXPRESSION__VALUE:
            return values != null && !values.isEmpty();
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
      result.append(" (operator: ");
      result.append(operator);
      result.append(')');
      return result.toString();
   }

} //AttributeExpressionImpl
