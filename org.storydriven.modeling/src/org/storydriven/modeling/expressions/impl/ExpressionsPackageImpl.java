/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.storydriven.modeling.SDMPackage;

import org.storydriven.modeling.activities.ActivitiesPackage;

import org.storydriven.modeling.activities.impl.ActivitiesPackageImpl;

import org.storydriven.modeling.expressions.Collaboration;
import org.storydriven.modeling.expressions.ComplexExpression;
import org.storydriven.modeling.expressions.ConditionalExpression;
import org.storydriven.modeling.expressions.ExpressionsFactory;
import org.storydriven.modeling.expressions.ExpressionsPackage;
import org.storydriven.modeling.expressions.ForLoop;
import org.storydriven.modeling.expressions.WhileLoop;

import org.storydriven.modeling.impl.SDMPackageImpl;

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
public class ExpressionsPackageImpl extends EPackageImpl implements ExpressionsPackage
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass collaborationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass complexExpressionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass forLoopEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass whileLoopEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass conditionalExpressionEClass = null;

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
    * @see org.storydriven.modeling.expressions.ExpressionsPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private ExpressionsPackageImpl ()
   {
      super(eNS_URI, ExpressionsFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link ExpressionsPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static ExpressionsPackage init ()
   {
      if (isInited)
         return (ExpressionsPackage) EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

      // Obtain or create and register package
      ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExpressionsPackageImpl
         ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExpressionsPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      EcorePackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      SDMPackageImpl theSDMPackage = (SDMPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI) instanceof SDMPackageImpl
         ? EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI) : SDMPackage.eINSTANCE);
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
      theExpressionsPackage.createPackageContents();
      theSDMPackage.createPackageContents();
      thePatternPackage.createPackageContents();
      theActivitiesPackage.createPackageContents();
      theTemplatesPackage.createPackageContents();

      // Initialize created meta-data
      theExpressionsPackage.initializePackageContents();
      theSDMPackage.initializePackageContents();
      thePatternPackage.initializePackageContents();
      theActivitiesPackage.initializePackageContents();
      theTemplatesPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theExpressionsPackage.freeze();

      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(ExpressionsPackage.eNS_URI, theExpressionsPackage);
      return theExpressionsPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getCollaboration ()
   {
      return collaborationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCollaboration_Source ()
   {
      return (EReference) collaborationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCollaboration_Target ()
   {
      return (EReference) collaborationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCollaboration_Body ()
   {
      return (EReference) collaborationEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getCollaboration_ForEach ()
   {
      return (EAttribute) collaborationEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getComplexExpression ()
   {
      return complexExpressionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getComplexExpression_ChildExpression ()
   {
      return (EReference) complexExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getForLoop ()
   {
      return forLoopEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getForLoop_LoopVariable ()
   {
      return (EReference) forLoopEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getForLoop_StartValue ()
   {
      return (EReference) forLoopEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getForLoop_StopValue ()
   {
      return (EReference) forLoopEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getWhileLoop ()
   {
      return whileLoopEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getWhileLoop_LoopCondition ()
   {
      return (EReference) whileLoopEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getWhileLoop_Body ()
   {
      return (EReference) whileLoopEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getConditionalExpression ()
   {
      return conditionalExpressionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getConditionalExpression_Condition ()
   {
      return (EReference) conditionalExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getConditionalExpression_Then ()
   {
      return (EReference) conditionalExpressionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getConditionalExpression_Else ()
   {
      return (EReference) conditionalExpressionEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ExpressionsFactory getExpressionsFactory ()
   {
      return (ExpressionsFactory) getEFactoryInstance();
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
      collaborationEClass = createEClass(COLLABORATION);
      createEReference(collaborationEClass, COLLABORATION__SOURCE);
      createEReference(collaborationEClass, COLLABORATION__TARGET);
      createEReference(collaborationEClass, COLLABORATION__BODY);
      createEAttribute(collaborationEClass, COLLABORATION__FOR_EACH);

      complexExpressionEClass = createEClass(COMPLEX_EXPRESSION);
      createEReference(complexExpressionEClass, COMPLEX_EXPRESSION__CHILD_EXPRESSION);

      forLoopEClass = createEClass(FOR_LOOP);
      createEReference(forLoopEClass, FOR_LOOP__LOOP_VARIABLE);
      createEReference(forLoopEClass, FOR_LOOP__START_VALUE);
      createEReference(forLoopEClass, FOR_LOOP__STOP_VALUE);

      whileLoopEClass = createEClass(WHILE_LOOP);
      createEReference(whileLoopEClass, WHILE_LOOP__LOOP_CONDITION);
      createEReference(whileLoopEClass, WHILE_LOOP__BODY);

      conditionalExpressionEClass = createEClass(CONDITIONAL_EXPRESSION);
      createEReference(conditionalExpressionEClass, CONDITIONAL_EXPRESSION__CONDITION);
      createEReference(conditionalExpressionEClass, CONDITIONAL_EXPRESSION__THEN);
      createEReference(conditionalExpressionEClass, CONDITIONAL_EXPRESSION__ELSE);
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
      SDMPackage theSDMPackage = (SDMPackage) EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI);
      PatternPackage thePatternPackage = (PatternPackage) EPackage.Registry.INSTANCE
         .getEPackage(PatternPackage.eNS_URI);
      EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      collaborationEClass.getESuperTypes().add(theSDMPackage.getExpression());
      complexExpressionEClass.getESuperTypes().add(theSDMPackage.getExpression());
      forLoopEClass.getESuperTypes().add(theSDMPackage.getExpression());
      whileLoopEClass.getESuperTypes().add(theSDMPackage.getExpression());
      conditionalExpressionEClass.getESuperTypes().add(theSDMPackage.getExpression());

      // Initialize classes and features; add operations and parameters
      initEClass(collaborationEClass, Collaboration.class, "Collaboration", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCollaboration_Source(), thePatternPackage.getObject(),
         thePatternPackage.getObject_SentCollaboration(), "source", null, 0, 1, Collaboration.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
         !IS_ORDERED);
      initEReference(getCollaboration_Target(), thePatternPackage.getObject(),
         thePatternPackage.getObject_ReceivedCollaboration(), "target", null, 0, -1, Collaboration.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getCollaboration_Body(), theSDMPackage.getExpression(), null, "body", null, 0, 1,
         Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getCollaboration_ForEach(), ecorePackage.getEBoolean(), "forEach", null, 1, 1,
         Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);

      initEClass(complexExpressionEClass, ComplexExpression.class, "ComplexExpression", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getComplexExpression_ChildExpression(), theSDMPackage.getExpression(), null, "childExpression",
         null, 1, -1, ComplexExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(forLoopEClass, ForLoop.class, "ForLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getForLoop_LoopVariable(), theEcorePackage.getEAttribute(), null, "loopVariable", null, 1, 1,
         ForLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
         IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getForLoop_StartValue(), theSDMPackage.getExpression(), null, "startValue", null, 1, 1,
         ForLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
         IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getForLoop_StopValue(), theSDMPackage.getExpression(), null, "stopValue", null, 1, 1,
         ForLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
         IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(whileLoopEClass, WhileLoop.class, "WhileLoop", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getWhileLoop_LoopCondition(), theSDMPackage.getExpression(), null, "loopCondition", null, 0, 1,
         WhileLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
         IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getWhileLoop_Body(), theSDMPackage.getExpression(), null, "body", null, 0, 1, WhileLoop.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);

      initEClass(conditionalExpressionEClass, ConditionalExpression.class, "ConditionalExpression", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getConditionalExpression_Condition(), theSDMPackage.getExpression(), null, "condition", null, 1,
         1, ConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getConditionalExpression_Then(), theSDMPackage.getExpression(), null, "then", null, 0, 1,
         ConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getConditionalExpression_Else(), theSDMPackage.getExpression(), null, "else", null, 0, 1,
         ConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
   }

} //ExpressionsPackageImpl
