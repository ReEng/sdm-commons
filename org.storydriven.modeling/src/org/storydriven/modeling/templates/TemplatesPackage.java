/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.templates;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.pattern.PatternPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.storydriven.modeling.templates.TemplatesFactory
 * @model kind="package"
 * @generated
 */
public interface TemplatesPackage extends EPackage
{
   /**
    * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNAME = "templates";

   /**
    * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_URI = "http://ns.storydriven.org/sdm/templates/0.1.0";

   /**
    * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_PREFIX = "sdmt";

   /**
    * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   TemplatesPackage eINSTANCE = org.storydriven.modeling.templates.impl.TemplatesPackageImpl.init();

   /**
    * The meta object id for the '{@link org.storydriven.modeling.templates.impl.ObjectPatternTemplateImpl <em>Object Pattern Template</em>}' class. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @see org.storydriven.modeling.templates.impl.ObjectPatternTemplateImpl
    * @see org.storydriven.modeling.templates.impl.TemplatesPackageImpl#getObjectPatternTemplate()
    * @generated
    */
   int OBJECT_PATTERN_TEMPLATE = 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_PATTERN_TEMPLATE__ANNOTATION = PatternPackage.OBJECT_PATTERN__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_PATTERN_TEMPLATE__EXTENSION = PatternPackage.OBJECT_PATTERN__EXTENSION;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_PATTERN_TEMPLATE__COMMENT = PatternPackage.OBJECT_PATTERN__COMMENT;

   /**
    * The feature id for the '<em><b>Owned Objects</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_PATTERN_TEMPLATE__OWNED_OBJECTS = PatternPackage.OBJECT_PATTERN__OWNED_OBJECTS;

   /**
    * The feature id for the '<em><b>Statement</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_PATTERN_TEMPLATE__STATEMENT = PatternPackage.OBJECT_PATTERN__STATEMENT;

   /**
    * The feature id for the '<em><b>Owning Node</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_PATTERN_TEMPLATE__OWNING_NODE = PatternPackage.OBJECT_PATTERN__OWNING_NODE;

   /**
    * The feature id for the '<em><b>Owning Pattern</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_PATTERN_TEMPLATE__OWNING_PATTERN = PatternPackage.OBJECT_PATTERN__OWNING_PATTERN;

   /**
    * The feature id for the '<em><b>Owned Pattern</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_PATTERN_TEMPLATE__OWNED_PATTERN = PatternPackage.OBJECT_PATTERN__OWNED_PATTERN;

   /**
    * The feature id for the '<em><b>Constraint</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_PATTERN_TEMPLATE__CONSTRAINT = PatternPackage.OBJECT_PATTERN__CONSTRAINT;

   /**
    * The feature id for the '<em><b>Constraint Expression</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_PATTERN_TEMPLATE__CONSTRAINT_EXPRESSION = PatternPackage.OBJECT_PATTERN__CONSTRAINT_EXPRESSION;

   /**
    * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_PATTERN_TEMPLATE__TYPE_PARAMETER = PatternPackage.OBJECT_PATTERN_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Template Binding</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_PATTERN_TEMPLATE__TEMPLATE_BINDING = PatternPackage.OBJECT_PATTERN_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Object Pattern Template</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int OBJECT_PATTERN_TEMPLATE_FEATURE_COUNT = PatternPackage.OBJECT_PATTERN_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.templates.impl.TemplateBindingImpl <em>Template Binding</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @see org.storydriven.modeling.templates.impl.TemplateBindingImpl
    * @see org.storydriven.modeling.templates.impl.TemplatesPackageImpl#getTemplateBinding()
    * @generated
    */
   int TEMPLATE_BINDING = 1;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING__ANNOTATION = SDMPackage.EXTENDABLE_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING__EXTENSION = SDMPackage.EXTENDABLE_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Bound Parameter</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING__BOUND_PARAMETER = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Binding Expression</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING__BINDING_EXPRESSION = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Property Binding</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING__PROPERTY_BINDING = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Template</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING__TEMPLATE = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The number of structural features of the '<em>Template Binding</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING_FEATURE_COUNT = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.templates.impl.PropertyBindingImpl <em>Property Binding</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @see org.storydriven.modeling.templates.impl.PropertyBindingImpl
    * @see org.storydriven.modeling.templates.impl.TemplatesPackageImpl#getPropertyBinding()
    * @generated
    */
   int PROPERTY_BINDING = 2;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING__ANNOTATION = SDMPackage.EXTENDABLE_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING__EXTENSION = SDMPackage.EXTENDABLE_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Bound Property</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING__BOUND_PROPERTY = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Binding Expression</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING__BINDING_EXPRESSION = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Template Binding</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING__TEMPLATE_BINDING = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Property Binding</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING_FEATURE_COUNT = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.templates.ObjectPatternTemplate <em>Object Pattern Template</em>}'. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @return the meta object for class '<em>Object Pattern Template</em>'.
    * @see org.storydriven.modeling.templates.ObjectPatternTemplate
    * @generated
    */
   EClass getObjectPatternTemplate ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.templates.ObjectPatternTemplate#getTypeParameters <em>Type Parameter</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Type Parameter</em>'.
    * @see org.storydriven.modeling.templates.ObjectPatternTemplate#getTypeParameters()
    * @see #getObjectPatternTemplate()
    * @generated
    */
   EReference getObjectPatternTemplate_TypeParameter ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.templates.ObjectPatternTemplate#getTemplateBindings <em>Template Binding</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Template Binding</em>'.
    * @see org.storydriven.modeling.templates.ObjectPatternTemplate#getTemplateBindings()
    * @see #getObjectPatternTemplate()
    * @generated
    */
   EReference getObjectPatternTemplate_TemplateBinding ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.templates.TemplateBinding <em>Template Binding</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Template Binding</em>'.
    * @see org.storydriven.modeling.templates.TemplateBinding
    * @generated
    */
   EClass getTemplateBinding ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.templates.TemplateBinding#getBoundParameter <em>Bound Parameter</em>}'. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the reference '<em>Bound Parameter</em>'.
    * @see org.storydriven.modeling.templates.TemplateBinding#getBoundParameter()
    * @see #getTemplateBinding()
    * @generated
    */
   EReference getTemplateBinding_BoundParameter ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.templates.TemplateBinding#getBindingExpression <em>Binding Expression</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Binding Expression</em>'.
    * @see org.storydriven.modeling.templates.TemplateBinding#getBindingExpression()
    * @see #getTemplateBinding()
    * @generated
    */
   EReference getTemplateBinding_BindingExpression ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.templates.TemplateBinding#getPropertyBindings <em>Property Binding</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Property Binding</em>'.
    * @see org.storydriven.modeling.templates.TemplateBinding#getPropertyBindings()
    * @see #getTemplateBinding()
    * @generated
    */
   EReference getTemplateBinding_PropertyBinding ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.templates.TemplateBinding#getTemplate <em>Template</em>}'. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @return the meta object for the container reference '<em>Template</em>'.
    * @see org.storydriven.modeling.templates.TemplateBinding#getTemplate()
    * @see #getTemplateBinding()
    * @generated
    */
   EReference getTemplateBinding_Template ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.templates.PropertyBinding <em>Property Binding</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Property Binding</em>'.
    * @see org.storydriven.modeling.templates.PropertyBinding
    * @generated
    */
   EClass getPropertyBinding ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.templates.PropertyBinding#getBoundProperty <em>Bound Property</em>}'. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @return the meta object for the reference '<em>Bound Property</em>'.
    * @see org.storydriven.modeling.templates.PropertyBinding#getBoundProperty()
    * @see #getPropertyBinding()
    * @generated
    */
   EReference getPropertyBinding_BoundProperty ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.templates.PropertyBinding#getBindingExpression <em>Binding Expression</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Binding Expression</em>'.
    * @see org.storydriven.modeling.templates.PropertyBinding#getBindingExpression()
    * @see #getPropertyBinding()
    * @generated
    */
   EReference getPropertyBinding_BindingExpression ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.templates.PropertyBinding#getTemplateBinding <em>Template Binding</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the container reference '<em>Template Binding</em>'.
    * @see org.storydriven.modeling.templates.PropertyBinding#getTemplateBinding()
    * @see #getPropertyBinding()
    * @generated
    */
   EReference getPropertyBinding_TemplateBinding ();

   /**
    * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the factory that creates the instances of the model.
    * @generated
    */
   TemplatesFactory getTemplatesFactory ();

   /**
    * <!-- begin-user-doc --> Defines literals for the meta objects that represent
    * <ul>
    * <li>each class,</li>
    * <li>each feature of each class,</li>
    * <li>each enum,</li>
    * <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   interface Literals
   {
      /**
       * The meta object literal for the '{@link org.storydriven.modeling.templates.impl.ObjectPatternTemplateImpl <em>Object Pattern Template</em>}' class. <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.storydriven.modeling.templates.impl.ObjectPatternTemplateImpl
       * @see org.storydriven.modeling.templates.impl.TemplatesPackageImpl#getObjectPatternTemplate()
       * @generated
       */
      EClass OBJECT_PATTERN_TEMPLATE = eINSTANCE.getObjectPatternTemplate();

      /**
       * The meta object literal for the '<em><b>Type Parameter</b></em>' containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference OBJECT_PATTERN_TEMPLATE__TYPE_PARAMETER = eINSTANCE.getObjectPatternTemplate_TypeParameter();

      /**
       * The meta object literal for the '<em><b>Template Binding</b></em>' containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference OBJECT_PATTERN_TEMPLATE__TEMPLATE_BINDING = eINSTANCE.getObjectPatternTemplate_TemplateBinding();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.templates.impl.TemplateBindingImpl <em>Template Binding</em>}' class. <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * 
       * @see org.storydriven.modeling.templates.impl.TemplateBindingImpl
       * @see org.storydriven.modeling.templates.impl.TemplatesPackageImpl#getTemplateBinding()
       * @generated
       */
      EClass TEMPLATE_BINDING = eINSTANCE.getTemplateBinding();

      /**
       * The meta object literal for the '<em><b>Bound Parameter</b></em>' reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference TEMPLATE_BINDING__BOUND_PARAMETER = eINSTANCE.getTemplateBinding_BoundParameter();

      /**
       * The meta object literal for the '<em><b>Binding Expression</b></em>' containment reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference TEMPLATE_BINDING__BINDING_EXPRESSION = eINSTANCE.getTemplateBinding_BindingExpression();

      /**
       * The meta object literal for the '<em><b>Property Binding</b></em>' containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference TEMPLATE_BINDING__PROPERTY_BINDING = eINSTANCE.getTemplateBinding_PropertyBinding();

      /**
       * The meta object literal for the '<em><b>Template</b></em>' container reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference TEMPLATE_BINDING__TEMPLATE = eINSTANCE.getTemplateBinding_Template();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.templates.impl.PropertyBindingImpl <em>Property Binding</em>}' class. <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * 
       * @see org.storydriven.modeling.templates.impl.PropertyBindingImpl
       * @see org.storydriven.modeling.templates.impl.TemplatesPackageImpl#getPropertyBinding()
       * @generated
       */
      EClass PROPERTY_BINDING = eINSTANCE.getPropertyBinding();

      /**
       * The meta object literal for the '<em><b>Bound Property</b></em>' reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference PROPERTY_BINDING__BOUND_PROPERTY = eINSTANCE.getPropertyBinding_BoundProperty();

      /**
       * The meta object literal for the '<em><b>Binding Expression</b></em>' containment reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference PROPERTY_BINDING__BINDING_EXPRESSION = eINSTANCE.getPropertyBinding_BindingExpression();

      /**
       * The meta object literal for the '<em><b>Template Binding</b></em>' container reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference PROPERTY_BINDING__TEMPLATE_BINDING = eINSTANCE.getPropertyBinding_TemplateBinding();

   }

} // TemplatesPackage
