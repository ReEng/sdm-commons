/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.templates.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.pattern.impl.ObjectPatternImpl;
import org.storydriven.modeling.templates.ObjectPatternTemplate;
import org.storydriven.modeling.templates.TemplateBinding;
import org.storydriven.modeling.templates.TemplatesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Object Pattern Template</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.storydriven.modeling.templates.impl.ObjectPatternTemplateImpl#getTypeParameters <em>Type Parameter</em>}</li>
 * <li>{@link org.storydriven.modeling.templates.impl.ObjectPatternTemplateImpl#getTemplateBindings <em>Template Binding</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ObjectPatternTemplateImpl extends ObjectPatternImpl implements ObjectPatternTemplate
{
   /**
    * The cached value of the '{@link #getTypeParameters() <em>Type Parameter</em>}' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getTypeParameters()
    * @generated
    * @ordered
    */
   protected EList<EClassifier> typeParameters;

   /**
    * The cached value of the '{@link #getTemplateBindings() <em>Template Binding</em>}' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getTemplateBindings()
    * @generated
    * @ordered
    */
   protected EList<TemplateBinding> templateBindings;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected ObjectPatternTemplateImpl ()
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
      return TemplatesPackage.Literals.OBJECT_PATTERN_TEMPLATE;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<EClassifier> getTypeParameters ()
   {
      if (this.typeParameters == null)
      {
         this.typeParameters = new EObjectContainmentEList.Resolving<EClassifier>(EClassifier.class, this,
            TemplatesPackage.OBJECT_PATTERN_TEMPLATE__TYPE_PARAMETER);
      }
      return this.typeParameters;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<TemplateBinding> getTemplateBindings ()
   {
      if (this.templateBindings == null)
      {
         this.templateBindings = new EObjectContainmentWithInverseEList.Resolving<TemplateBinding>(
            TemplateBinding.class, this, TemplatesPackage.OBJECT_PATTERN_TEMPLATE__TEMPLATE_BINDING,
            TemplatesPackage.TEMPLATE_BINDING__TEMPLATE);
      }
      return this.templateBindings;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @SuppressWarnings ("unchecked")
   @Override
   public NotificationChain eInverseAdd (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case TemplatesPackage.OBJECT_PATTERN_TEMPLATE__TEMPLATE_BINDING:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getTemplateBindings()).basicAdd(otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
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
         case TemplatesPackage.OBJECT_PATTERN_TEMPLATE__TYPE_PARAMETER:
            return ((InternalEList<?>) getTypeParameters()).basicRemove(otherEnd, msgs);
         case TemplatesPackage.OBJECT_PATTERN_TEMPLATE__TEMPLATE_BINDING:
            return ((InternalEList<?>) getTemplateBindings()).basicRemove(otherEnd, msgs);
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
         case TemplatesPackage.OBJECT_PATTERN_TEMPLATE__TYPE_PARAMETER:
            return getTypeParameters();
         case TemplatesPackage.OBJECT_PATTERN_TEMPLATE__TEMPLATE_BINDING:
            return getTemplateBindings();
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
         case TemplatesPackage.OBJECT_PATTERN_TEMPLATE__TYPE_PARAMETER:
            getTypeParameters().clear();
            getTypeParameters().addAll((Collection<? extends EClassifier>) newValue);
            return;
         case TemplatesPackage.OBJECT_PATTERN_TEMPLATE__TEMPLATE_BINDING:
            getTemplateBindings().clear();
            getTemplateBindings().addAll((Collection<? extends TemplateBinding>) newValue);
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
         case TemplatesPackage.OBJECT_PATTERN_TEMPLATE__TYPE_PARAMETER:
            getTypeParameters().clear();
            return;
         case TemplatesPackage.OBJECT_PATTERN_TEMPLATE__TEMPLATE_BINDING:
            getTemplateBindings().clear();
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
         case TemplatesPackage.OBJECT_PATTERN_TEMPLATE__TYPE_PARAMETER:
            return this.typeParameters != null && !this.typeParameters.isEmpty();
         case TemplatesPackage.OBJECT_PATTERN_TEMPLATE__TEMPLATE_BINDING:
            return this.templateBindings != null && !this.templateBindings.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // ObjectPatternTemplateImpl
