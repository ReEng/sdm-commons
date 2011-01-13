/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.activities.ActivitiesFactory;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityCallNode;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.activities.ExceptionVariable;
import org.storydriven.modeling.activities.JunctionNode;
import org.storydriven.modeling.activities.MatchingStoryNode;
import org.storydriven.modeling.activities.ModifyingStoryNode;
import org.storydriven.modeling.activities.OperationExtension;
import org.storydriven.modeling.activities.StartNode;
import org.storydriven.modeling.activities.StatementNode;
import org.storydriven.modeling.activities.StopNode;
import org.storydriven.modeling.activities.StoryNode;
import org.storydriven.modeling.activities.StructuredNode;
import org.storydriven.modeling.activities.TransitionGuard;
import org.storydriven.modeling.activities.expressions.ExpressionsPackage;
import org.storydriven.modeling.activities.expressions.impl.ExpressionsPackageImpl;
import org.storydriven.modeling.activities.util.ActivitiesValidator;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.calls.impl.CallsPackageImpl;
import org.storydriven.modeling.impl.SDMPackageImpl;
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.patterns.impl.PatternsPackageImpl;
import org.storydriven.modeling.templates.TemplatesPackage;
import org.storydriven.modeling.templates.impl.TemplatesPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class ActivitiesPackageImpl extends EPackageImpl implements ActivitiesPackage
{
   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass activityEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass activityNodeEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass activityEdgeEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass exceptionVariableEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass structuredNodeEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass operationExtensionEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass storyNodeEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass junctionNodeEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass startNodeEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass statementNodeEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass stopNodeEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass activityCallNodeEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass matchingStoryNodeEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass modifyingStoryNodeEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EEnum transitionGuardEEnum = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with
    * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
    * package URI value.
    * <p>Note: the correct way to create the package is via the static
    * factory method {@link #init init()}, which also performs
    * initialization of the package, or returns the registered package,
    * if one already exists.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
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
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>This method is used to initialize {@link ActivitiesPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static ActivitiesPackage init ()
   {
      if (isInited)
         return (ActivitiesPackage) EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);

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
      org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl theExpressionsPackage_1 = (org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(org.storydriven.modeling.expressions.ExpressionsPackage.eNS_URI) instanceof org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl
         ? EPackage.Registry.INSTANCE.getEPackage(org.storydriven.modeling.expressions.ExpressionsPackage.eNS_URI)
         : org.storydriven.modeling.expressions.ExpressionsPackage.eINSTANCE);
      CallsPackageImpl theCallsPackage = (CallsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(CallsPackage.eNS_URI) instanceof CallsPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(CallsPackage.eNS_URI) : CallsPackage.eINSTANCE);
      org.storydriven.modeling.calls.expressions.impl.ExpressionsPackageImpl theExpressionsPackage_2 = (org.storydriven.modeling.calls.expressions.impl.ExpressionsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(org.storydriven.modeling.calls.expressions.ExpressionsPackage.eNS_URI) instanceof org.storydriven.modeling.calls.expressions.impl.ExpressionsPackageImpl
         ? EPackage.Registry.INSTANCE
            .getEPackage(org.storydriven.modeling.calls.expressions.ExpressionsPackage.eNS_URI)
         : org.storydriven.modeling.calls.expressions.ExpressionsPackage.eINSTANCE);
      PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(PatternsPackage.eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(PatternsPackage.eNS_URI) : PatternsPackage.eINSTANCE);
      org.storydriven.modeling.patterns.expressions.impl.ExpressionsPackageImpl theExpressionsPackage_3 = (org.storydriven.modeling.patterns.expressions.impl.ExpressionsPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(org.storydriven.modeling.patterns.expressions.ExpressionsPackage.eNS_URI) instanceof org.storydriven.modeling.patterns.expressions.impl.ExpressionsPackageImpl
         ? EPackage.Registry.INSTANCE
            .getEPackage(org.storydriven.modeling.patterns.expressions.ExpressionsPackage.eNS_URI)
         : org.storydriven.modeling.patterns.expressions.ExpressionsPackage.eINSTANCE);
      TemplatesPackageImpl theTemplatesPackage = (TemplatesPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(TemplatesPackage.eNS_URI) instanceof TemplatesPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(TemplatesPackage.eNS_URI) : TemplatesPackage.eINSTANCE);

      // Create package meta-data objects
      theActivitiesPackage.createPackageContents();
      theSDMPackage.createPackageContents();
      theExpressionsPackage.createPackageContents();
      theExpressionsPackage_1.createPackageContents();
      theCallsPackage.createPackageContents();
      theExpressionsPackage_2.createPackageContents();
      thePatternsPackage.createPackageContents();
      theExpressionsPackage_3.createPackageContents();
      theTemplatesPackage.createPackageContents();

      // Initialize created meta-data
      theActivitiesPackage.initializePackageContents();
      theSDMPackage.initializePackageContents();
      theExpressionsPackage.initializePackageContents();
      theExpressionsPackage_1.initializePackageContents();
      theCallsPackage.initializePackageContents();
      theExpressionsPackage_2.initializePackageContents();
      thePatternsPackage.initializePackageContents();
      theExpressionsPackage_3.initializePackageContents();
      theTemplatesPackage.initializePackageContents();

      // Register package validator
      EValidator.Registry.INSTANCE.put(theActivitiesPackage, new EValidator.Descriptor()
      {
         public EValidator getEValidator ()
         {
            return ActivitiesValidator.INSTANCE;
         }
      });

      // Mark meta-data to indicate it can't be changed
      theActivitiesPackage.freeze();

      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(ActivitiesPackage.eNS_URI, theActivitiesPackage);
      return theActivitiesPackage;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getActivity ()
   {
      return activityEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getActivity_OwnedActivityNode ()
   {
      return (EReference) activityEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getActivity_OwnedActivityEdge ()
   {
      return (EReference) activityEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getActivity_OwningOperation ()
   {
      return (EReference) activityEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getActivity_Parameters ()
   {
      return (EReference) activityEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getActivity_Precondition ()
   {
      return (EReference) activityEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getActivityNode ()
   {
      return activityNodeEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getActivityNode_Incoming ()
   {
      return (EReference) activityNodeEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getActivityNode_Outgoing ()
   {
      return (EReference) activityNodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getActivityNode_OwningActivityNode ()
   {
      return (EReference) activityNodeEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getActivityNode_OwningActivity ()
   {
      return (EReference) activityNodeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getActivityEdge ()
   {
      return activityEdgeEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getActivityEdge_Source ()
   {
      return (EReference) activityEdgeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getActivityEdge_GuardType ()
   {
      return (EAttribute) activityEdgeEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getActivityEdge_GuardExpression ()
   {
      return (EReference) activityEdgeEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getActivityEdge_OwningActivity ()
   {
      return (EReference) activityEdgeEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getActivityEdge_GuardException ()
   {
      return (EReference) activityEdgeEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getActivityEdge_Target ()
   {
      return (EReference) activityEdgeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getExceptionVariable ()
   {
      return exceptionVariableEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getExceptionVariable_Name ()
   {
      return (EAttribute) exceptionVariableEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getExceptionVariable_ExceptionType ()
   {
      return (EReference) exceptionVariableEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getExceptionVariable_GenericExceptionType ()
   {
      return (EReference) exceptionVariableEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getExceptionVariable_ActivityEdge ()
   {
      return (EReference) exceptionVariableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getStructuredNode ()
   {
      return structuredNodeEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getStructuredNode_OwnedActivityNode ()
   {
      return (EReference) structuredNodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getOperationExtension ()
   {
      return operationExtensionEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getOperationExtension_Operation ()
   {
      return (EReference) operationExtensionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getOperationExtension_OwnedActivity ()
   {
      return (EReference) operationExtensionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EOperation getOperationExtension__NumberOfOutParams__DiagnosticChain_Map ()
   {
      return operationExtensionEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getStoryNode ()
   {
      return storyNodeEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getStoryNode_ForEach ()
   {
      return (EAttribute) storyNodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getStoryNode_StoryPattern ()
   {
      return (EReference) storyNodeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getJunctionNode ()
   {
      return junctionNodeEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getStartNode ()
   {
      return startNodeEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getStatementNode ()
   {
      return statementNodeEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getStatementNode_StatementExpression ()
   {
      return (EReference) statementNodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getStopNode ()
   {
      return stopNodeEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getStopNode_FlowStopOnly ()
   {
      return (EAttribute) stopNodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getStopNode_ReturnValue ()
   {
      return (EReference) stopNodeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getActivityCallNode ()
   {
      return activityCallNodeEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getActivityCallNode_CalledActivity ()
   {
      return (EReference) activityCallNodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getMatchingStoryNode ()
   {
      return matchingStoryNodeEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getMatchingStoryNode_OwnedPattern ()
   {
      return (EReference) matchingStoryNodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getModifyingStoryNode ()
   {
      return modifyingStoryNodeEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getModifyingStoryNode_OwnedRule ()
   {
      return (EReference) modifyingStoryNodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EEnum getTransitionGuard ()
   {
      return transitionGuardEEnum;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ActivitiesFactory getActivitiesFactory ()
   {
      return (ActivitiesFactory) getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package.  This method is
    * guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void createPackageContents ()
   {
      if (isCreated)
         return;
      isCreated = true;

      // Create classes and their features
      exceptionVariableEClass = createEClass(EXCEPTION_VARIABLE);
      createEReference(exceptionVariableEClass, EXCEPTION_VARIABLE__ACTIVITY_EDGE);
      createEAttribute(exceptionVariableEClass, EXCEPTION_VARIABLE__NAME);
      createEReference(exceptionVariableEClass, EXCEPTION_VARIABLE__EXCEPTION_TYPE);
      createEReference(exceptionVariableEClass, EXCEPTION_VARIABLE__GENERIC_EXCEPTION_TYPE);

      activityEdgeEClass = createEClass(ACTIVITY_EDGE);
      createEReference(activityEdgeEClass, ACTIVITY_EDGE__TARGET);
      createEReference(activityEdgeEClass, ACTIVITY_EDGE__SOURCE);
      createEReference(activityEdgeEClass, ACTIVITY_EDGE__OWNING_ACTIVITY);
      createEAttribute(activityEdgeEClass, ACTIVITY_EDGE__GUARD_TYPE);
      createEReference(activityEdgeEClass, ACTIVITY_EDGE__GUARD_EXPRESSION);
      createEReference(activityEdgeEClass, ACTIVITY_EDGE__GUARD_EXCEPTION);

      activityNodeEClass = createEClass(ACTIVITY_NODE);
      createEReference(activityNodeEClass, ACTIVITY_NODE__OUTGOING);
      createEReference(activityNodeEClass, ACTIVITY_NODE__OWNING_ACTIVITY);
      createEReference(activityNodeEClass, ACTIVITY_NODE__OWNING_ACTIVITY_NODE);
      createEReference(activityNodeEClass, ACTIVITY_NODE__INCOMING);

      activityEClass = createEClass(ACTIVITY);
      createEReference(activityEClass, ACTIVITY__OWNING_OPERATION);
      createEReference(activityEClass, ACTIVITY__OWNED_ACTIVITY_EDGE);
      createEReference(activityEClass, ACTIVITY__PARAMETERS);
      createEReference(activityEClass, ACTIVITY__PRECONDITION);
      createEReference(activityEClass, ACTIVITY__OWNED_ACTIVITY_NODE);

      operationExtensionEClass = createEClass(OPERATION_EXTENSION);
      createEReference(operationExtensionEClass, OPERATION_EXTENSION__OPERATION);
      createEReference(operationExtensionEClass, OPERATION_EXTENSION__OWNED_ACTIVITY);
      createEOperation(operationExtensionEClass, OPERATION_EXTENSION___NUMBER_OF_OUT_PARAMS__DIAGNOSTICCHAIN_MAP);

      storyNodeEClass = createEClass(STORY_NODE);
      createEAttribute(storyNodeEClass, STORY_NODE__FOR_EACH);
      createEReference(storyNodeEClass, STORY_NODE__STORY_PATTERN);

      structuredNodeEClass = createEClass(STRUCTURED_NODE);
      createEReference(structuredNodeEClass, STRUCTURED_NODE__OWNED_ACTIVITY_NODE);

      junctionNodeEClass = createEClass(JUNCTION_NODE);

      startNodeEClass = createEClass(START_NODE);

      statementNodeEClass = createEClass(STATEMENT_NODE);
      createEReference(statementNodeEClass, STATEMENT_NODE__STATEMENT_EXPRESSION);

      stopNodeEClass = createEClass(STOP_NODE);
      createEAttribute(stopNodeEClass, STOP_NODE__FLOW_STOP_ONLY);
      createEReference(stopNodeEClass, STOP_NODE__RETURN_VALUE);

      activityCallNodeEClass = createEClass(ACTIVITY_CALL_NODE);
      createEReference(activityCallNodeEClass, ACTIVITY_CALL_NODE__CALLED_ACTIVITY);

      matchingStoryNodeEClass = createEClass(MATCHING_STORY_NODE);
      createEReference(matchingStoryNodeEClass, MATCHING_STORY_NODE__OWNED_PATTERN);

      modifyingStoryNodeEClass = createEClass(MODIFYING_STORY_NODE);
      createEReference(modifyingStoryNodeEClass, MODIFYING_STORY_NODE__OWNED_RULE);

      // Create enums
      transitionGuardEEnum = createEEnum(TRANSITION_GUARD);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model.  This
    * method is guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
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
      SDMPackage theSDMPackage = (SDMPackage) EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI);
      EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
      org.storydriven.modeling.expressions.ExpressionsPackage theExpressionsPackage_1 = (org.storydriven.modeling.expressions.ExpressionsPackage) EPackage.Registry.INSTANCE
         .getEPackage(org.storydriven.modeling.expressions.ExpressionsPackage.eNS_URI);
      CallsPackage theCallsPackage = (CallsPackage) EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI);
      PatternsPackage thePatternsPackage = (PatternsPackage) EPackage.Registry.INSTANCE
         .getEPackage(PatternsPackage.eNS_URI);

      // Add subpackages
      getESubpackages().add(theExpressionsPackage);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      exceptionVariableEClass.getESuperTypes().add(theSDMPackage.getVariable());
      activityEdgeEClass.getESuperTypes().add(theSDMPackage.getExtendableElement());
      activityNodeEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
      activityNodeEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());
      activityEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());
      activityEClass.getESuperTypes().add(theCallsPackage.getCallable());
      operationExtensionEClass.getESuperTypes().add(theSDMPackage.getExtension());
      operationExtensionEClass.getESuperTypes().add(theCallsPackage.getCallable());
      storyNodeEClass.getESuperTypes().add(this.getActivityNode());
      structuredNodeEClass.getESuperTypes().add(this.getActivityNode());
      junctionNodeEClass.getESuperTypes().add(this.getActivityNode());
      startNodeEClass.getESuperTypes().add(this.getActivityNode());
      statementNodeEClass.getESuperTypes().add(this.getActivityNode());
      stopNodeEClass.getESuperTypes().add(this.getActivityNode());
      activityCallNodeEClass.getESuperTypes().add(this.getActivityNode());
      activityCallNodeEClass.getESuperTypes().add(theCallsPackage.getInvocation());
      matchingStoryNodeEClass.getESuperTypes().add(this.getStoryNode());
      modifyingStoryNodeEClass.getESuperTypes().add(this.getStoryNode());

      // Initialize classes, features, and operations; add parameters
      initEClass(exceptionVariableEClass, ExceptionVariable.class, "ExceptionVariable", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getExceptionVariable_ActivityEdge(), this.getActivityEdge(),
         this.getActivityEdge_GuardException(), "activityEdge", null, 1, 1, ExceptionVariable.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
         !IS_ORDERED);
      initEAttribute(getExceptionVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1,
         ExceptionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getExceptionVariable_ExceptionType(), theEcorePackage.getEClassifier(), null, "exceptionType",
         null, 0, -1, ExceptionVariable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getExceptionVariable_GenericExceptionType(), theEcorePackage.getEGenericType(), null,
         "genericExceptionType", null, 0, -1, ExceptionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(activityEdgeEClass, ActivityEdge.class, "ActivityEdge", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getActivityEdge_Target(), this.getActivityNode(), this.getActivityNode_Incoming(), "target", null,
         1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getActivityEdge_Source(), this.getActivityNode(), this.getActivityNode_Outgoing(), "source", null,
         1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getActivityEdge_OwningActivity(), this.getActivity(), this.getActivity_OwnedActivityEdge(),
         "owningActivity", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getActivityEdge_GuardType(), this.getTransitionGuard(), "guardType", "NONE", 1, 1,
         ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getActivityEdge_GuardExpression(), theExpressionsPackage_1.getExpression(), null,
         "guardExpression", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getActivityEdge_GuardException(), this.getExceptionVariable(),
         this.getExceptionVariable_ActivityEdge(), "guardException", null, 0, -1, ActivityEdge.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
         IS_ORDERED);

      initEClass(activityNodeEClass, ActivityNode.class, "ActivityNode", IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getActivityNode_Outgoing(), this.getActivityEdge(), this.getActivityEdge_Source(), "outgoing",
         null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getActivityNode_OwningActivity(), this.getActivity(), this.getActivity_OwnedActivityNode(),
         "owningActivity", null, 0, 1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getActivityNode_OwningActivityNode(), this.getStructuredNode(),
         this.getStructuredNode_OwnedActivityNode(), "owningActivityNode", null, 0, 1, ActivityNode.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getActivityNode_Incoming(), this.getActivityEdge(), this.getActivityEdge_Target(), "incoming",
         null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getActivity_OwningOperation(), this.getOperationExtension(),
         this.getOperationExtension_OwnedActivity(), "owningOperation", null, 0, 1, Activity.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
         !IS_ORDERED);
      initEReference(getActivity_OwnedActivityEdge(), this.getActivityEdge(), this.getActivityEdge_OwningActivity(),
         "ownedActivityEdge", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getActivity_Parameters(), theEcorePackage.getEParameter(), null, "parameters", null, 0, -1,
         Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
         IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getActivity_Precondition(), this.getStoryNode(), null, "precondition", null, 0, 1, Activity.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getActivity_OwnedActivityNode(), this.getActivityNode(), this.getActivityNode_OwningActivity(),
         "ownedActivityNode", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(operationExtensionEClass, OperationExtension.class, "OperationExtension", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getOperationExtension_Operation(), theEcorePackage.getEOperation(), null, "operation", null, 0, 1,
         OperationExtension.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
      initEReference(getOperationExtension_OwnedActivity(), this.getActivity(), this.getActivity_OwningOperation(),
         "ownedActivity", null, 0, 1, OperationExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      EOperation op = initEOperation(getOperationExtension__NumberOfOutParams__DiagnosticChain_Map(),
         ecorePackage.getEBoolean(), "NumberOfOutParams", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      EGenericType g1 = createEGenericType(ecorePackage.getEMap());
      EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(storyNodeEClass, StoryNode.class, "StoryNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getStoryNode_ForEach(), ecorePackage.getEBoolean(), "forEach", null, 1, 1, StoryNode.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getStoryNode_StoryPattern(), thePatternsPackage.getStoryPattern(), null, "storyPattern", null, 1,
         1, StoryNode.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

      initEClass(structuredNodeEClass, StructuredNode.class, "StructuredNode", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getStructuredNode_OwnedActivityNode(), this.getActivityNode(),
         this.getActivityNode_OwningActivityNode(), "ownedActivityNode", null, 0, -1, StructuredNode.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);

      initEClass(junctionNodeEClass, JunctionNode.class, "JunctionNode", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(startNodeEClass, StartNode.class, "StartNode", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(statementNodeEClass, StatementNode.class, "StatementNode", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getStatementNode_StatementExpression(), theExpressionsPackage_1.getExpression(), null,
         "statementExpression", null, 1, 1, StatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(stopNodeEClass, StopNode.class, "StopNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getStopNode_FlowStopOnly(), ecorePackage.getEBoolean(), "flowStopOnly", null, 1, 1,
         StopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
         !IS_ORDERED);
      initEReference(getStopNode_ReturnValue(), theExpressionsPackage_1.getExpression(), null, "returnValue", null, 0,
         1, StopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(activityCallNodeEClass, ActivityCallNode.class, "ActivityCallNode", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getActivityCallNode_CalledActivity(), this.getActivity(), null, "calledActivity", null, 1, -1,
         ActivityCallNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(matchingStoryNodeEClass, MatchingStoryNode.class, "MatchingStoryNode", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getMatchingStoryNode_OwnedPattern(), thePatternsPackage.getMatchingPattern(), null,
         "ownedPattern", null, 1, 1, MatchingStoryNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(modifyingStoryNodeEClass, ModifyingStoryNode.class, "ModifyingStoryNode", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getModifyingStoryNode_OwnedRule(), thePatternsPackage.getStoryPattern(), null, "ownedRule", null,
         1, 1, ModifyingStoryNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      // Initialize enums and add enum literals
      initEEnum(transitionGuardEEnum, TransitionGuard.class, "TransitionGuard");
      addEEnumLiteral(transitionGuardEEnum, TransitionGuard.NONE);
      addEEnumLiteral(transitionGuardEEnum, TransitionGuard.SUCCESS);
      addEEnumLiteral(transitionGuardEEnum, TransitionGuard.FAILURE);
      addEEnumLiteral(transitionGuardEEnum, TransitionGuard.EACH_TIME);
      addEEnumLiteral(transitionGuardEEnum, TransitionGuard.END);
      addEEnumLiteral(transitionGuardEEnum, TransitionGuard.ELSE);
      addEEnumLiteral(transitionGuardEEnum, TransitionGuard.BOOL);
      addEEnumLiteral(transitionGuardEEnum, TransitionGuard.EXCEPTION);
      addEEnumLiteral(transitionGuardEEnum, TransitionGuard.FINALLY);

      // Create annotations
      // http://www.eclipse.org/emf/2002/GenModel
      createGenModelAnnotations();
      // http://www.eclipse.org/uml2/1.1.0/GenModel
      createGenModel_1Annotations();
      // redefines
      createRedefinesAnnotations();
      // union
      createUnionAnnotations();
      // subsets
      createSubsetsAnnotations();
   }

   /**
    * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected void createGenModelAnnotations ()
   {
      String source = "http://www.eclipse.org/emf/2002/GenModel";
      addAnnotation(exceptionVariableEClass, source, new String[] {"documentation",
            "Declares a variable representing an Exception that leads to firing a transition (ActivityEdge)."});
      addAnnotation(getExceptionVariable_ActivityEdge(), source, new String[] {"documentation",
            "Specifies the transition (activity edge) where the exception variable is declared."});
      addAnnotation(getExceptionVariable_Name(), source, new String[] {"documentation",
            "Specifies the name of the declared exception variable."});
      addAnnotation(getExceptionVariable_ExceptionType(), source, new String[] {"documentation",
            "Specifies the type of the declared exception variable."});
      addAnnotation(getActivityEdge_GuardExpression(), source, new String[] {"documentation",
            "Points to the boolean expression in case of boolean transition guard."});
      addAnnotation(getActivityEdge_GuardException(), source, new String[] {"documentation",
            "Declares variables representing the Exceptions that lead to firing this transition."});
      addAnnotation(
         getActivity_Precondition(),
         source,
         new String[] {
               "documentation",
               "References a story node which represents the precondition for the execution of the activity. I.e., the activity is executed, iff the object structure in the story node can be matched. Obviously the referenced story node may only contain black (i.e., non-create and non-destroy) objects and links."});
      addAnnotation(getOperationExtension__NumberOfOutParams__DiagnosticChain_Map(), source, new String[] {
            "documentation", "self.oclAsType(Callable).out->size() <= 1"});
      addAnnotation((getOperationExtension__NumberOfOutParams__DiagnosticChain_Map()).getEParameters().get(0), source,
         new String[] {"documentation", "The chain of diagnostics to which problems are to be appended."});
      addAnnotation((getOperationExtension__NumberOfOutParams__DiagnosticChain_Map()).getEParameters().get(1), source,
         new String[] {"documentation", "The cache of context-specific information."});
      addAnnotation(getStopNode_FlowStopOnly(), source, new String[] {"documentation",
            "true if subactivity is stopped, but not the whole control flow"});
      addAnnotation(
         activityCallNodeEClass,
         source,
         new String[] {
               "documentation",
               "The ActivityCallNode is a special ActivityNode which represents the calling of another story diagram within an activity.\r\nTo support polymorphic dispatching, multiple activities can be assigned to it (all of which must have the same call signature, i.e. matching in and out parameters). All assigned activities are then called in the given order and the first one whose precondition is fulfilled is executed (Chain of Responsibilty)."});
      addAnnotation(
         getActivityCallNode_CalledActivity(),
         source,
         new String[] {
               "documentation",
               "References all activities that are to be considered for the polymorphic dispatching of the call. All activities must have the same call signature."});
   }

   /**
    * Initializes the annotations for <b>http://www.eclipse.org/uml2/1.1.0/GenModel</b>.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected void createGenModel_1Annotations ()
   {
      String source = "http://www.eclipse.org/uml2/1.1.0/GenModel";
      addAnnotation(getOperationExtension__NumberOfOutParams__DiagnosticChain_Map(), source, new String[] {"body",
            "self.oclAsType(Callable).out->size() <= 1"});
   }

   /**
    * Initializes the annotations for <b>redefines</b>.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected void createRedefinesAnnotations ()
   {
      String source = "redefines";
      addAnnotation(getOperationExtension_Operation(), source, new String[] {},
         new URI[] {URI.createURI(SDMPackage.eNS_URI).appendFragment("//Extension/base")});
   }

   /**
    * Initializes the annotations for <b>union</b>.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected void createUnionAnnotations ()
   {
      String source = "union";
      addAnnotation(getStoryNode_StoryPattern(), source, new String[] {});
   }

   /**
    * Initializes the annotations for <b>subsets</b>.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected void createSubsetsAnnotations ()
   {
      String source = "subsets";
      addAnnotation(getMatchingStoryNode_OwnedPattern(), source, new String[] {},
         new URI[] {URI.createURI(SDMPackage.eNS_URI).appendFragment("//activities/StoryNode/storyPattern")});
      addAnnotation(getModifyingStoryNode_OwnedRule(), source, new String[] {},
         new URI[] {URI.createURI(SDMPackage.eNS_URI).appendFragment("//activities/StoryNode/storyPattern")});
   }

} // ActivitiesPackageImpl
