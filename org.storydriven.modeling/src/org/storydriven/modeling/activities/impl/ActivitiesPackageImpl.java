/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.activities.ActivitiesFactory;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.activities.DecisionNode;
import org.storydriven.modeling.activities.ExceptionExpression;
import org.storydriven.modeling.activities.OperationExtension;
import org.storydriven.modeling.activities.StartNode;
import org.storydriven.modeling.activities.StatementNode;
import org.storydriven.modeling.activities.StopNode;
import org.storydriven.modeling.activities.StructuredNode;
import org.storydriven.modeling.activities.TransitionGuard;
import org.storydriven.modeling.expressions.ExpressionsPackage;
import org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl;
import org.storydriven.modeling.impl.SDMPackageImpl;
import org.storydriven.modeling.pattern.PatternPackage;
import org.storydriven.modeling.pattern.impl.PatternPackageImpl;
import org.storydriven.modeling.templates.TemplatesPackage;
import org.storydriven.modeling.templates.impl.TemplatesPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ActivitiesPackageImpl extends EPackageImpl implements ActivitiesPackage
{
   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass activityEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass operationExtensionEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass activityEdgeEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass decisionNodeEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass exceptionExpressionEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass startNodeEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass statementNodeEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass stopNodeEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass structuredNodeEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass activityNodeEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum transitionGuardEEnum = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI value.
    * <p>
    * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also performs initialization of the package, or returns the
    * registered package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see org.storydriven.modeling.activities.ActivitiesPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private ActivitiesPackageImpl ()
   {
      super(eNS_URI, ActivitiesFactory.eINSTANCE);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * <p>
    * This method is used to initialize {@link ActivitiesPackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly. Instead, they should simply access
    * that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static ActivitiesPackage init ()
   {
      if (isInited)
      {
         return (ActivitiesPackage) EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);
      }

      // Obtain or create and register package
      ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActivitiesPackageImpl
         ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActivitiesPackageImpl());

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
      TemplatesPackageImpl theTemplatesPackage = (TemplatesPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(TemplatesPackage.eNS_URI) instanceof TemplatesPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(TemplatesPackage.eNS_URI) : TemplatesPackage.eINSTANCE);

      // Create package meta-data objects
      theActivitiesPackage.createPackageContents();
      theSDMPackage.createPackageContents();
      theExpressionsPackage.createPackageContents();
      thePatternPackage.createPackageContents();
      theTemplatesPackage.createPackageContents();

      // Initialize created meta-data
      theActivitiesPackage.initializePackageContents();
      theSDMPackage.initializePackageContents();
      theExpressionsPackage.initializePackageContents();
      thePatternPackage.initializePackageContents();
      theTemplatesPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theActivitiesPackage.freeze();

      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(ActivitiesPackage.eNS_URI, theActivitiesPackage);
      return theActivitiesPackage;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getActivity ()
   {
      return this.activityEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getActivity_OwnedActivityNode ()
   {
      return (EReference) this.activityEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getActivity_OwningOperation ()
   {
      return (EReference) this.activityEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getOperationExtension ()
   {
      return this.operationExtensionEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getOperationExtension_OwnedActivity ()
   {
      return (EReference) this.operationExtensionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getActivityEdge ()
   {
      return this.activityEdgeEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getActivityEdge_Target ()
   {
      return (EReference) this.activityEdgeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getActivityEdge_Source ()
   {
      return (EReference) this.activityEdgeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getActivityEdge_GuardType ()
   {
      return (EAttribute) this.activityEdgeEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getActivityEdge_OwnedGuardExpression ()
   {
      return (EReference) this.activityEdgeEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getDecisionNode ()
   {
      return this.decisionNodeEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getExceptionExpression ()
   {
      return this.exceptionExpressionEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getExceptionExpression_ExceptionType ()
   {
      return (EReference) this.exceptionExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getExceptionExpression_VariableName ()
   {
      return (EAttribute) this.exceptionExpressionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getStartNode ()
   {
      return this.startNodeEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getStatementNode ()
   {
      return this.statementNodeEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getStatementNode_StatementExpression ()
   {
      return (EReference) this.statementNodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getStopNode ()
   {
      return this.stopNodeEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getStopNode_FlowStopOnly ()
   {
      return (EAttribute) this.stopNodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getStopNode_ReturnValue ()
   {
      return (EReference) this.stopNodeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getStructuredNode ()
   {
      return this.structuredNodeEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getStructuredNode_OwnedActivityNode ()
   {
      return (EReference) this.structuredNodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getActivityNode ()
   {
      return this.activityNodeEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getActivityNode_OwningActivity ()
   {
      return (EReference) this.activityNodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getActivityNode_Incoming ()
   {
      return (EReference) this.activityNodeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getActivityNode_Outgoing ()
   {
      return (EReference) this.activityNodeEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getActivityNode_OwningActivityNode ()
   {
      return (EReference) this.activityNodeEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getTransitionGuard ()
   {
      return this.transitionGuardEEnum;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public ActivitiesFactory getActivitiesFactory ()
   {
      return (ActivitiesFactory) getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package. This method is guarded to have no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void createPackageContents ()
   {
      if (this.isCreated)
      {
         return;
      }
      this.isCreated = true;

      // Create classes and their features
      this.activityEClass = createEClass(ACTIVITY);
      createEReference(this.activityEClass, ACTIVITY__OWNED_ACTIVITY_NODE);
      createEReference(this.activityEClass, ACTIVITY__OWNING_OPERATION);

      this.operationExtensionEClass = createEClass(OPERATION_EXTENSION);
      createEReference(this.operationExtensionEClass, OPERATION_EXTENSION__OWNED_ACTIVITY);

      this.activityEdgeEClass = createEClass(ACTIVITY_EDGE);
      createEReference(this.activityEdgeEClass, ACTIVITY_EDGE__TARGET);
      createEReference(this.activityEdgeEClass, ACTIVITY_EDGE__SOURCE);
      createEAttribute(this.activityEdgeEClass, ACTIVITY_EDGE__GUARD_TYPE);
      createEReference(this.activityEdgeEClass, ACTIVITY_EDGE__OWNED_GUARD_EXPRESSION);

      this.decisionNodeEClass = createEClass(DECISION_NODE);

      this.exceptionExpressionEClass = createEClass(EXCEPTION_EXPRESSION);
      createEReference(this.exceptionExpressionEClass, EXCEPTION_EXPRESSION__EXCEPTION_TYPE);
      createEAttribute(this.exceptionExpressionEClass, EXCEPTION_EXPRESSION__VARIABLE_NAME);

      this.startNodeEClass = createEClass(START_NODE);

      this.statementNodeEClass = createEClass(STATEMENT_NODE);
      createEReference(this.statementNodeEClass, STATEMENT_NODE__STATEMENT_EXPRESSION);

      this.stopNodeEClass = createEClass(STOP_NODE);
      createEAttribute(this.stopNodeEClass, STOP_NODE__FLOW_STOP_ONLY);
      createEReference(this.stopNodeEClass, STOP_NODE__RETURN_VALUE);

      this.structuredNodeEClass = createEClass(STRUCTURED_NODE);
      createEReference(this.structuredNodeEClass, STRUCTURED_NODE__OWNED_ACTIVITY_NODE);

      this.activityNodeEClass = createEClass(ACTIVITY_NODE);
      createEReference(this.activityNodeEClass, ACTIVITY_NODE__OWNING_ACTIVITY);
      createEReference(this.activityNodeEClass, ACTIVITY_NODE__INCOMING);
      createEReference(this.activityNodeEClass, ACTIVITY_NODE__OUTGOING);
      createEReference(this.activityNodeEClass, ACTIVITY_NODE__OWNING_ACTIVITY_NODE);

      // Create enums
      this.transitionGuardEEnum = createEEnum(TRANSITION_GUARD);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model. This method is guarded to have no affect on any invocation but its first. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    */
   public void initializePackageContents ()
   {
      if (this.isInitialized)
      {
         return;
      }
      this.isInitialized = true;

      // Initialize package
      setName(eNAME);
      setNsPrefix(eNS_PREFIX);
      setNsURI(eNS_URI);

      // Obtain other dependent packages
      SDMPackage theSDMPackage = (SDMPackage) EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI);
      EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      this.activityEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());
      this.operationExtensionEClass.getESuperTypes().add(theSDMPackage.getExtension());
      this.activityEdgeEClass.getESuperTypes().add(theSDMPackage.getExtendableElement());
      this.decisionNodeEClass.getESuperTypes().add(getActivityNode());
      this.exceptionExpressionEClass.getESuperTypes().add(theSDMPackage.getExpression());
      this.startNodeEClass.getESuperTypes().add(getActivityNode());
      this.statementNodeEClass.getESuperTypes().add(getActivityNode());
      this.stopNodeEClass.getESuperTypes().add(getActivityNode());
      this.structuredNodeEClass.getESuperTypes().add(getActivityNode());
      this.activityNodeEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());
      this.activityNodeEClass.getESuperTypes().add(theSDMPackage.getNamedElement());

      // Initialize classes and features; add operations and parameters
      initEClass(this.activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getActivity_OwnedActivityNode(), getActivityNode(), getActivityNode_OwningActivity(),
         "ownedActivityNode", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getActivity_OwningOperation(), getOperationExtension(), getOperationExtension_OwnedActivity(),
         "owningOperation", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(this.operationExtensionEClass, OperationExtension.class, "OperationExtension", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getOperationExtension_OwnedActivity(), getActivity(), getActivity_OwningOperation(),
         "ownedActivity", null, 0, 1, OperationExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(this.activityEdgeEClass, ActivityEdge.class, "ActivityEdge", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getActivityEdge_Target(), getActivityNode(), getActivityNode_Incoming(), "target", null, 1, 1,
         ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getActivityEdge_Source(), getActivityNode(), getActivityNode_Outgoing(), "source", null, 1, 1,
         ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getActivityEdge_GuardType(), getTransitionGuard(), "guardType", "NONE", 1, 1, ActivityEdge.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getActivityEdge_OwnedGuardExpression(), theSDMPackage.getExpression(), null,
         "ownedGuardExpression", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(this.decisionNodeEClass, DecisionNode.class, "DecisionNode", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(this.exceptionExpressionEClass, ExceptionExpression.class, "ExceptionExpression", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getExceptionExpression_ExceptionType(), theEcorePackage.getEClassifier(), null, "exceptionType",
         null, 0, -1, ExceptionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getExceptionExpression_VariableName(), this.ecorePackage.getEString(), "variableName", null, 1, 1,
         ExceptionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);

      initEClass(this.startNodeEClass, StartNode.class, "StartNode", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(this.statementNodeEClass, StatementNode.class, "StatementNode", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getStatementNode_StatementExpression(), theSDMPackage.getExpression(), null,
         "statementExpression", null, 1, 1, StatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(this.stopNodeEClass, StopNode.class, "StopNode", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getStopNode_FlowStopOnly(), this.ecorePackage.getEBoolean(), "flowStopOnly", null, 1, 1,
         StopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
         !IS_ORDERED);
      initEReference(getStopNode_ReturnValue(), theSDMPackage.getExpression(), null, "returnValue", null, 0, 1,
         StopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
         IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(this.structuredNodeEClass, StructuredNode.class, "StructuredNode", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getStructuredNode_OwnedActivityNode(), getActivityNode(), getActivityNode_OwningActivityNode(),
         "ownedActivityNode", null, 0, -1, StructuredNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(this.activityNodeEClass, ActivityNode.class, "ActivityNode", IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getActivityNode_OwningActivity(), getActivity(), getActivity_OwnedActivityNode(),
         "owningActivity", null, 0, 1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getActivityNode_Incoming(), getActivityEdge(), getActivityEdge_Target(), "incoming", null, 0, -1,
         ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getActivityNode_Outgoing(), getActivityEdge(), getActivityEdge_Source(), "outgoing", null, 0, -1,
         ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getActivityNode_OwningActivityNode(), getStructuredNode(), getStructuredNode_OwnedActivityNode(),
         "owningActivityNode", null, 0, 1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      // Initialize enums and add enum literals
      initEEnum(this.transitionGuardEEnum, TransitionGuard.class, "TransitionGuard");
      addEEnumLiteral(this.transitionGuardEEnum, TransitionGuard.NONE);
      addEEnumLiteral(this.transitionGuardEEnum, TransitionGuard.SUCCESS);
      addEEnumLiteral(this.transitionGuardEEnum, TransitionGuard.FAILURE);
      addEEnumLiteral(this.transitionGuardEEnum, TransitionGuard.EACH_TIME);
      addEEnumLiteral(this.transitionGuardEEnum, TransitionGuard.END);
      addEEnumLiteral(this.transitionGuardEEnum, TransitionGuard.ELSE);
      addEEnumLiteral(this.transitionGuardEEnum, TransitionGuard.BOOL);
      addEEnumLiteral(this.transitionGuardEEnum, TransitionGuard.EXCEPTION);
      addEEnumLiteral(this.transitionGuardEEnum, TransitionGuard.FINALLY);
   }

} // ActivitiesPackageImpl
