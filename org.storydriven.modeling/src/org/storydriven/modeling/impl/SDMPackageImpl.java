/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.impl;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.Expression;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.Extension;
import org.storydriven.modeling.NamedElement;
import org.storydriven.modeling.SDMFactory;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.StringExpression;
import org.storydriven.modeling.TypedElement;

import org.storydriven.modeling.activities.ActivitiesPackage;

import org.storydriven.modeling.activities.impl.ActivitiesPackageImpl;

import org.storydriven.modeling.expressions.ExpressionsPackage;

import org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl;

import org.storydriven.modeling.pattern.PatternPackage;

import org.storydriven.modeling.pattern.impl.PatternPackageImpl;

import org.storydriven.modeling.templates.TemplatesPackage;

import org.storydriven.modeling.templates.impl.TemplatesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SDMPackageImpl extends EPackageImpl implements SDMPackage
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass expressionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass typedElementEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass extendableElementEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass extensionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass stringExpressionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass namedElementEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass commentableElementEClass = null;

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
    * @see org.storydriven.modeling.SDMPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private SDMPackageImpl ()
   {
      super(eNS_URI, SDMFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link SDMPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static SDMPackage init ()
   {
      if (isInited)
         return (SDMPackage) EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI);

      // Obtain or create and register package
      SDMPackageImpl theSDMPackage = (SDMPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SDMPackageImpl
         ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SDMPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      EcorePackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
      PatternPackageImpl thePatternPackage = (PatternPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
      ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(ActivitiesPackage.eNS_URI) : ActivitiesPackage.eINSTANCE);
      TemplatesPackageImpl theTemplatesPackage = (TemplatesPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(TemplatesPackage.eNS_URI) instanceof TemplatesPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(TemplatesPackage.eNS_URI) : TemplatesPackage.eINSTANCE);

      // Create package meta-data objects
      theSDMPackage.createPackageContents();
      theExpressionsPackage.createPackageContents();
      thePatternPackage.createPackageContents();
      theActivitiesPackage.createPackageContents();
      theTemplatesPackage.createPackageContents();

      // Initialize created meta-data
      theSDMPackage.initializePackageContents();
      theExpressionsPackage.initializePackageContents();
      thePatternPackage.initializePackageContents();
      theActivitiesPackage.initializePackageContents();
      theTemplatesPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theSDMPackage.freeze();

      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(SDMPackage.eNS_URI, theSDMPackage);
      return theSDMPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getExpression ()
   {
      return expressionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getTypedElement ()
   {
      return typedElementEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getTypedElement_Type ()
   {
      return (EReference) typedElementEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getTypedElement_GenericType ()
   {
      return (EReference) typedElementEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getExtendableElement ()
   {
      return extendableElementEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getExtendableElement_Annotation ()
   {
      return (EReference) extendableElementEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getExtendableElement_Extension ()
   {
      return (EReference) extendableElementEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getExtension ()
   {
      return extensionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getExtension_Base ()
   {
      return (EReference) extensionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getExtension_ModelBase ()
   {
      return (EReference) extensionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getExtension_OwningAnnotation ()
   {
      return (EReference) extensionEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getExtension_ExtendableBase ()
   {
      return (EReference) extensionEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getStringExpression ()
   {
      return stringExpressionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getStringExpression_Expression ()
   {
      return (EAttribute) stringExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getStringExpression_Language ()
   {
      return (EAttribute) stringExpressionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getNamedElement ()
   {
      return namedElementEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getNamedElement_Name ()
   {
      return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getCommentableElement ()
   {
      return commentableElementEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getCommentableElement_Comment ()
   {
      return (EAttribute) commentableElementEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SDMFactory getSDMFactory ()
   {
      return (SDMFactory) getEFactoryInstance();
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
      expressionEClass = createEClass(EXPRESSION);

      typedElementEClass = createEClass(TYPED_ELEMENT);
      createEReference(typedElementEClass, TYPED_ELEMENT__TYPE);
      createEReference(typedElementEClass, TYPED_ELEMENT__GENERIC_TYPE);

      extendableElementEClass = createEClass(EXTENDABLE_ELEMENT);
      createEReference(extendableElementEClass, EXTENDABLE_ELEMENT__ANNOTATION);
      createEReference(extendableElementEClass, EXTENDABLE_ELEMENT__EXTENSION);

      extensionEClass = createEClass(EXTENSION);
      createEReference(extensionEClass, EXTENSION__BASE);
      createEReference(extensionEClass, EXTENSION__MODEL_BASE);
      createEReference(extensionEClass, EXTENSION__OWNING_ANNOTATION);
      createEReference(extensionEClass, EXTENSION__EXTENDABLE_BASE);

      stringExpressionEClass = createEClass(STRING_EXPRESSION);
      createEAttribute(stringExpressionEClass, STRING_EXPRESSION__EXPRESSION);
      createEAttribute(stringExpressionEClass, STRING_EXPRESSION__LANGUAGE);

      namedElementEClass = createEClass(NAMED_ELEMENT);
      createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

      commentableElementEClass = createEClass(COMMENTABLE_ELEMENT);
      createEAttribute(commentableElementEClass, COMMENTABLE_ELEMENT__COMMENT);
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
      ExpressionsPackage theExpressionsPackage = (ExpressionsPackage) EPackage.Registry.INSTANCE
         .getEPackage(ExpressionsPackage.eNS_URI);
      PatternPackage thePatternPackage = (PatternPackage) EPackage.Registry.INSTANCE
         .getEPackage(PatternPackage.eNS_URI);
      ActivitiesPackage theActivitiesPackage = (ActivitiesPackage) EPackage.Registry.INSTANCE
         .getEPackage(ActivitiesPackage.eNS_URI);
      TemplatesPackage theTemplatesPackage = (TemplatesPackage) EPackage.Registry.INSTANCE
         .getEPackage(TemplatesPackage.eNS_URI);
      EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

      // Add subpackages
      getESubpackages().add(theExpressionsPackage);
      getESubpackages().add(thePatternPackage);
      getESubpackages().add(theActivitiesPackage);
      getESubpackages().add(theTemplatesPackage);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      expressionEClass.getESuperTypes().add(this.getTypedElement());
      typedElementEClass.getESuperTypes().add(this.getExtendableElement());
      extendableElementEClass.getESuperTypes().add(theEcorePackage.getEObject());
      extensionEClass.getESuperTypes().add(this.getExtendableElement());
      stringExpressionEClass.getESuperTypes().add(this.getExpression());
      namedElementEClass.getESuperTypes().add(this.getExtendableElement());
      commentableElementEClass.getESuperTypes().add(this.getExtendableElement());

      // Initialize classes and features; add operations and parameters
      initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(typedElementEClass, TypedElement.class, "TypedElement", IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getTypedElement_Type(), theEcorePackage.getEClassifier(), null, "type", null, 0, 1,
         TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getTypedElement_GenericType(), theEcorePackage.getEGenericType(), null, "genericType", null, 0, 1,
         TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(extendableElementEClass, ExtendableElement.class, "ExtendableElement", IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getExtendableElement_Annotation(), theEcorePackage.getEAnnotation(), null, "annotation", null, 0,
         -1, ExtendableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getExtendableElement_Extension(), this.getExtension(), this.getExtension_ExtendableBase(),
         "extension", null, 0, -1, ExtendableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      EOperation op = addEOperation(extendableElementEClass, this.getExtension(), "getExtension", 1, 1, IS_UNIQUE,
         !IS_ORDERED);
      addEParameter(op, theEcorePackage.getEClass(), "type", 1, 1, IS_UNIQUE, !IS_ORDERED);

      op = addEOperation(extendableElementEClass, this.getExtension(), "provideExtension", 1, 1, IS_UNIQUE, !IS_ORDERED);
      addEParameter(op, theEcorePackage.getEClass(), "type", 1, 1, IS_UNIQUE, !IS_ORDERED);

      op = addEOperation(extendableElementEClass, theEcorePackage.getEAnnotation(), "getAnnotation", 1, 1, IS_UNIQUE,
         !IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, !IS_ORDERED);

      op = addEOperation(extendableElementEClass, theEcorePackage.getEAnnotation(), "provideAnnotation", 1, 1,
         IS_UNIQUE, !IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, !IS_ORDERED);

      initEClass(extensionEClass, Extension.class, "Extension", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getExtension_Base(), theEcorePackage.getEObject(), null, "base", null, 1, 1, Extension.class,
         IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         IS_DERIVED, !IS_ORDERED);
      initEReference(getExtension_ModelBase(), theEcorePackage.getEModelElement(), null, "modelBase", null, 0, 1,
         Extension.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE,
         IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
      initEReference(getExtension_OwningAnnotation(), theEcorePackage.getEAnnotation(), null, "owningAnnotation", null,
         0, 1, Extension.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
      initEReference(getExtension_ExtendableBase(), this.getExtendableElement(), this.getExtendableElement_Extension(),
         "extendableBase", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(stringExpressionEClass, StringExpression.class, "StringExpression", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getStringExpression_Expression(), ecorePackage.getEString(), "expression", null, 1, 1,
         StringExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getStringExpression_Language(), ecorePackage.getEString(), "language", null, 1, 1,
         StringExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);

      initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(commentableElementEClass, CommentableElement.class, "CommentableElement", IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getCommentableElement_Comment(), ecorePackage.getEString(), "comment", null, 1, 1,
         CommentableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);

      // Create resource
      createResource(eNS_URI);

      // Create annotations
      // union
      createUnionAnnotations();
      // subsets
      createSubsetsAnnotations();
   }

   /**
    * Initializes the annotations for <b>union</b>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected void createUnionAnnotations ()
   {
      String source = "union";
      addAnnotation(getExtension_Base(), source, new String[] {});
   }

   /**
    * Initializes the annotations for <b>subsets</b>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected void createSubsetsAnnotations ()
   {
      String source = "subsets";
      addAnnotation(getExtension_ModelBase(), source, new String[] {}, new URI[] {URI.createURI(eNS_URI)
         .appendFragment("//Extension/base")});
      addAnnotation(getExtension_ExtendableBase(), source, new String[] {}, new URI[] {URI.createURI(eNS_URI)
         .appendFragment("//Extension/base")});
   }

} //SDMPackageImpl
