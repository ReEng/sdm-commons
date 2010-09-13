/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.templates.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.storydriven.modeling.SDMPackage;

import org.storydriven.modeling.activities.ActivitiesPackage;

import org.storydriven.modeling.activities.impl.ActivitiesPackageImpl;

import org.storydriven.modeling.expressions.ExpressionsPackage;

import org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl;

import org.storydriven.modeling.impl.SDMPackageImpl;

import org.storydriven.modeling.pattern.PatternPackage;

import org.storydriven.modeling.pattern.impl.PatternPackageImpl;

import org.storydriven.modeling.templates.ObjectPatternTemplate;
import org.storydriven.modeling.templates.PropertyBinding;
import org.storydriven.modeling.templates.TemplateBinding;
import org.storydriven.modeling.templates.TemplatesFactory;
import org.storydriven.modeling.templates.TemplatesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplatesPackageImpl extends EPackageImpl implements TemplatesPackage
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass objectPatternTemplateEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass templateBindingEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass propertyBindingEClass = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with
    * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
    * package URI value.
    * <p>Note: the correct way to create the package is via the static
    * factory method {@link #init init()}, which also performs
    * initialization of the package, or returns the registered package,
    * if one already exists.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see org.storydriven.modeling.templates.TemplatesPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private TemplatesPackageImpl ()
   {
      super(eNS_URI, TemplatesFactory.eINSTANCE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>This method is used to initialize {@link TemplatesPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static TemplatesPackage init ()
   {
      if (isInited)
         return (TemplatesPackage) EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI);

      // Obtain or create and register package
      TemplatesPackageImpl theTemplatesPackage = (TemplatesPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TemplatesPackageImpl
         ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TemplatesPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      EcorePackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      SDMPackageImpl theSDMPackage = (SDMPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI) instanceof SDMPackageImpl
         ? EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI) : SDMPackage.eINSTANCE);
      ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
      PatternPackageImpl thePatternPackage = (PatternPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
      ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(ActivitiesPackage.eNS_URI) : ActivitiesPackage.eINSTANCE);

      // Create package meta-data objects
      theTemplatesPackage.createPackageContents();
      theSDMPackage.createPackageContents();
      theExpressionsPackage.createPackageContents();
      thePatternPackage.createPackageContents();
      theActivitiesPackage.createPackageContents();

      // Initialize created meta-data
      theTemplatesPackage.initializePackageContents();
      theSDMPackage.initializePackageContents();
      theExpressionsPackage.initializePackageContents();
      thePatternPackage.initializePackageContents();
      theActivitiesPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theTemplatesPackage.freeze();

      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(TemplatesPackage.eNS_URI, theTemplatesPackage);
      return theTemplatesPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getObjectPatternTemplate ()
   {
      return objectPatternTemplateEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getObjectPatternTemplate_TypeParameter ()
   {
      return (EReference) objectPatternTemplateEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getObjectPatternTemplate_TemplateBinding ()
   {
      return (EReference) objectPatternTemplateEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getTemplateBinding ()
   {
      return templateBindingEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getTemplateBinding_BoundParameter ()
   {
      return (EReference) templateBindingEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getTemplateBinding_BindingExpression ()
   {
      return (EReference) templateBindingEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getTemplateBinding_PropertyBinding ()
   {
      return (EReference) templateBindingEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getTemplateBinding_Template ()
   {
      return (EReference) templateBindingEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPropertyBinding ()
   {
      return propertyBindingEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPropertyBinding_BoundProperty ()
   {
      return (EReference) propertyBindingEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPropertyBinding_BindingExpression ()
   {
      return (EReference) propertyBindingEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPropertyBinding_TemplateBinding ()
   {
      return (EReference) propertyBindingEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public TemplatesFactory getTemplatesFactory ()
   {
      return (TemplatesFactory) getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package.  This method is
    * guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void createPackageContents ()
   {
      if (isCreated)
         return;
      isCreated = true;

      // Create classes and their features
      objectPatternTemplateEClass = createEClass(OBJECT_PATTERN_TEMPLATE);
      createEReference(objectPatternTemplateEClass, OBJECT_PATTERN_TEMPLATE__TYPE_PARAMETER);
      createEReference(objectPatternTemplateEClass, OBJECT_PATTERN_TEMPLATE__TEMPLATE_BINDING);

      templateBindingEClass = createEClass(TEMPLATE_BINDING);
      createEReference(templateBindingEClass, TEMPLATE_BINDING__BOUND_PARAMETER);
      createEReference(templateBindingEClass, TEMPLATE_BINDING__BINDING_EXPRESSION);
      createEReference(templateBindingEClass, TEMPLATE_BINDING__PROPERTY_BINDING);
      createEReference(templateBindingEClass, TEMPLATE_BINDING__TEMPLATE);

      propertyBindingEClass = createEClass(PROPERTY_BINDING);
      createEReference(propertyBindingEClass, PROPERTY_BINDING__BOUND_PROPERTY);
      createEReference(propertyBindingEClass, PROPERTY_BINDING__BINDING_EXPRESSION);
      createEReference(propertyBindingEClass, PROPERTY_BINDING__TEMPLATE_BINDING);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model.  This
    * method is guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void initializePackageContents ()
   {
      if (isInitialized)
         return;
      isInitialized = true;

      // Initialize package
      setName(eNAME);
      setNsPrefix(eNS_PREFIX);
      setNsURI(eNS_URI);

      // Obtain other dependent packages
      PatternPackage thePatternPackage = (PatternPackage) EPackage.Registry.INSTANCE
         .getEPackage(PatternPackage.eNS_URI);
      EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
      SDMPackage theSDMPackage = (SDMPackage) EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      objectPatternTemplateEClass.getESuperTypes().add(thePatternPackage.getObjectPattern());
      templateBindingEClass.getESuperTypes().add(theSDMPackage.getExtendableElement());
      propertyBindingEClass.getESuperTypes().add(theSDMPackage.getExtendableElement());

      // Initialize classes and features; add operations and parameters
      initEClass(objectPatternTemplateEClass, ObjectPatternTemplate.class, "ObjectPatternTemplate", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getObjectPatternTemplate_TypeParameter(), theEcorePackage.getEClassifier(), null, "typeParameter",
         null, 0, -1, ObjectPatternTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getObjectPatternTemplate_TemplateBinding(), this.getTemplateBinding(),
         this.getTemplateBinding_Template(), "templateBinding", null, 0, -1, ObjectPatternTemplate.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);

      initEClass(templateBindingEClass, TemplateBinding.class, "TemplateBinding", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getTemplateBinding_BoundParameter(), theEcorePackage.getEClassifier(), null, "boundParameter",
         null, 1, 1, TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getTemplateBinding_BindingExpression(), theSDMPackage.getExpression(), null, "bindingExpression",
         null, 1, 1, TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getTemplateBinding_PropertyBinding(), this.getPropertyBinding(),
         this.getPropertyBinding_TemplateBinding(), "propertyBinding", null, 0, -1, TemplateBinding.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getTemplateBinding_Template(), this.getObjectPatternTemplate(),
         this.getObjectPatternTemplate_TemplateBinding(), "template", null, 1, 1, TemplateBinding.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
         !IS_ORDERED);

      initEClass(propertyBindingEClass, PropertyBinding.class, "PropertyBinding", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPropertyBinding_BoundProperty(), theEcorePackage.getEStructuralFeature(), null,
         "boundProperty", null, 1, 1, PropertyBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPropertyBinding_BindingExpression(), theSDMPackage.getExpression(), null, "bindingExpression",
         null, 1, 1, PropertyBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPropertyBinding_TemplateBinding(), this.getTemplateBinding(),
         this.getTemplateBinding_PropertyBinding(), "templateBinding", null, 1, 1, PropertyBinding.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
   }

} //TemplatesPackageImpl
