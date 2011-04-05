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
import org.storydriven.modeling.activities.EdgeGuard;
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
   private EClass activityNodeEClass = null;

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
   private EClass exceptionVariableEClass = null;

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
   private EClass operationExtensionEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass storyNodeEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass junctionNodeEClass = null;

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
   private EClass activityCallNodeEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass matchingStoryNodeEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass modifyingStoryNodeEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum edgeGuardEEnum = null;

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
      return (EReference) this.activityEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getActivity_OwnedActivityEdge ()
   {
      return (EReference) this.activityEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getActivity_OwningOperation ()
   {
      return (EReference) this.activityEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getActivity_Precondition ()
   {
      return (EReference) this.activityEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getActivity_InParameter ()
   {
      return (EReference) this.activityEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getActivity_OutParameter ()
   {
      return (EReference) this.activityEClass.getEStructuralFeatures().get(4);
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
   public EReference getActivityNode_Incoming ()
   {
      return (EReference) this.activityNodeEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getActivityNode_Outgoing ()
   {
      return (EReference) this.activityNodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getActivityNode_OwningActivityNode ()
   {
      return (EReference) this.activityNodeEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getActivityNode_OwningActivity ()
   {
      return (EReference) this.activityNodeEClass.getEStructuralFeatures().get(1);
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
   public EReference getActivityEdge_Source ()
   {
      return (EReference) this.activityEdgeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getActivityEdge_GuardExpression ()
   {
      return (EReference) this.activityEdgeEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getActivityEdge_OwningActivity ()
   {
      return (EReference) this.activityEdgeEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getActivityEdge_Guard ()
   {
      return (EAttribute) this.activityEdgeEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getActivityEdge_GuardException ()
   {
      return (EReference) this.activityEdgeEClass.getEStructuralFeatures().get(5);
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
   public EClass getExceptionVariable ()
   {
      return this.exceptionVariableEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getExceptionVariable_Name ()
   {
      return (EAttribute) this.exceptionVariableEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getExceptionVariable_ExceptionType ()
   {
      return (EReference) this.exceptionVariableEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getExceptionVariable_GenericExceptionType ()
   {
      return (EReference) this.exceptionVariableEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getExceptionVariable_ActivityEdge ()
   {
      return (EReference) this.exceptionVariableEClass.getEStructuralFeatures().get(0);
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
   public EClass getOperationExtension ()
   {
      return this.operationExtensionEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getOperationExtension_Operation ()
   {
      return (EReference) this.operationExtensionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getOperationExtension_ReturnValue ()
   {
      return (EReference) this.operationExtensionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getOperationExtension_OwnedActivity ()
   {
      return (EReference) this.operationExtensionEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EOperation getOperationExtension__NumberOfOutParams__DiagnosticChain_Map ()
   {
      return this.operationExtensionEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getStoryNode ()
   {
      return this.storyNodeEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getStoryNode_ForEach ()
   {
      return (EAttribute) this.storyNodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getStoryNode_StoryPattern ()
   {
      return (EReference) this.storyNodeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getJunctionNode ()
   {
      return this.junctionNodeEClass;
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
   public EClass getActivityCallNode ()
   {
      return this.activityCallNodeEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getActivityCallNode_CalledActivity ()
   {
      return (EReference) this.activityCallNodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getMatchingStoryNode ()
   {
      return this.matchingStoryNodeEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getMatchingStoryNode_OwnedPattern ()
   {
      return (EReference) this.matchingStoryNodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getModifyingStoryNode ()
   {
      return this.modifyingStoryNodeEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getModifyingStoryNode_OwnedRule ()
   {
      return (EReference) this.modifyingStoryNodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getEdgeGuard ()
   {
      return this.edgeGuardEEnum;
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
      this.exceptionVariableEClass = createEClass(EXCEPTION_VARIABLE);
      createEReference(this.exceptionVariableEClass, EXCEPTION_VARIABLE__ACTIVITY_EDGE);
      createEAttribute(this.exceptionVariableEClass, EXCEPTION_VARIABLE__NAME);
      createEReference(this.exceptionVariableEClass, EXCEPTION_VARIABLE__EXCEPTION_TYPE);
      createEReference(this.exceptionVariableEClass, EXCEPTION_VARIABLE__GENERIC_EXCEPTION_TYPE);

      this.activityEdgeEClass = createEClass(ACTIVITY_EDGE);
      createEReference(this.activityEdgeEClass, ACTIVITY_EDGE__TARGET);
      createEReference(this.activityEdgeEClass, ACTIVITY_EDGE__SOURCE);
      createEReference(this.activityEdgeEClass, ACTIVITY_EDGE__OWNING_ACTIVITY);
      createEAttribute(this.activityEdgeEClass, ACTIVITY_EDGE__GUARD);
      createEReference(this.activityEdgeEClass, ACTIVITY_EDGE__GUARD_EXPRESSION);
      createEReference(this.activityEdgeEClass, ACTIVITY_EDGE__GUARD_EXCEPTION);

      this.activityNodeEClass = createEClass(ACTIVITY_NODE);
      createEReference(this.activityNodeEClass, ACTIVITY_NODE__OUTGOING);
      createEReference(this.activityNodeEClass, ACTIVITY_NODE__OWNING_ACTIVITY);
      createEReference(this.activityNodeEClass, ACTIVITY_NODE__OWNING_ACTIVITY_NODE);
      createEReference(this.activityNodeEClass, ACTIVITY_NODE__INCOMING);

      this.activityEClass = createEClass(ACTIVITY);
      createEReference(this.activityEClass, ACTIVITY__OWNING_OPERATION);
      createEReference(this.activityEClass, ACTIVITY__OWNED_ACTIVITY_EDGE);
      createEReference(this.activityEClass, ACTIVITY__PRECONDITION);
      createEReference(this.activityEClass, ACTIVITY__IN_PARAMETER);
      createEReference(this.activityEClass, ACTIVITY__OUT_PARAMETER);
      createEReference(this.activityEClass, ACTIVITY__OWNED_ACTIVITY_NODE);

      this.operationExtensionEClass = createEClass(OPERATION_EXTENSION);
      createEReference(this.operationExtensionEClass, OPERATION_EXTENSION__OPERATION);
      createEReference(this.operationExtensionEClass, OPERATION_EXTENSION__RETURN_VALUE);
      createEReference(this.operationExtensionEClass, OPERATION_EXTENSION__OWNED_ACTIVITY);
      createEOperation(this.operationExtensionEClass, OPERATION_EXTENSION___NUMBER_OF_OUT_PARAMS__DIAGNOSTICCHAIN_MAP);

      this.matchingStoryNodeEClass = createEClass(MATCHING_STORY_NODE);
      createEReference(this.matchingStoryNodeEClass, MATCHING_STORY_NODE__OWNED_PATTERN);

      this.storyNodeEClass = createEClass(STORY_NODE);
      createEAttribute(this.storyNodeEClass, STORY_NODE__FOR_EACH);
      createEReference(this.storyNodeEClass, STORY_NODE__STORY_PATTERN);

      this.structuredNodeEClass = createEClass(STRUCTURED_NODE);
      createEReference(this.structuredNodeEClass, STRUCTURED_NODE__OWNED_ACTIVITY_NODE);

      this.junctionNodeEClass = createEClass(JUNCTION_NODE);

      this.startNodeEClass = createEClass(START_NODE);

      this.statementNodeEClass = createEClass(STATEMENT_NODE);
      createEReference(this.statementNodeEClass, STATEMENT_NODE__STATEMENT_EXPRESSION);

      this.stopNodeEClass = createEClass(STOP_NODE);
      createEAttribute(this.stopNodeEClass, STOP_NODE__FLOW_STOP_ONLY);
      createEReference(this.stopNodeEClass, STOP_NODE__RETURN_VALUE);

      this.activityCallNodeEClass = createEClass(ACTIVITY_CALL_NODE);
      createEReference(this.activityCallNodeEClass, ACTIVITY_CALL_NODE__CALLED_ACTIVITY);

      this.modifyingStoryNodeEClass = createEClass(MODIFYING_STORY_NODE);
      createEReference(this.modifyingStoryNodeEClass, MODIFYING_STORY_NODE__OWNED_RULE);

      // Create enums
      this.edgeGuardEEnum = createEEnum(EDGE_GUARD);
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
      this.exceptionVariableEClass.getESuperTypes().add(theSDMPackage.getVariable());
      this.activityEdgeEClass.getESuperTypes().add(theSDMPackage.getExtendableElement());
      this.activityNodeEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
      this.activityNodeEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());
      this.activityEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());
      this.activityEClass.getESuperTypes().add(theCallsPackage.getCallable());
      this.operationExtensionEClass.getESuperTypes().add(theSDMPackage.getExtension());
      this.operationExtensionEClass.getESuperTypes().add(theCallsPackage.getCallable());
      this.matchingStoryNodeEClass.getESuperTypes().add(getStoryNode());
      this.storyNodeEClass.getESuperTypes().add(getActivityNode());
      this.structuredNodeEClass.getESuperTypes().add(getActivityNode());
      this.junctionNodeEClass.getESuperTypes().add(getActivityNode());
      this.startNodeEClass.getESuperTypes().add(getActivityNode());
      this.statementNodeEClass.getESuperTypes().add(getActivityNode());
      this.stopNodeEClass.getESuperTypes().add(getActivityNode());
      this.activityCallNodeEClass.getESuperTypes().add(getActivityNode());
      this.activityCallNodeEClass.getESuperTypes().add(theCallsPackage.getInvocation());
      this.modifyingStoryNodeEClass.getESuperTypes().add(getStoryNode());

      // Initialize classes, features, and operations; add parameters
      initEClass(this.exceptionVariableEClass, ExceptionVariable.class, "ExceptionVariable", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getExceptionVariable_ActivityEdge(), getActivityEdge(), getActivityEdge_GuardException(),
         "activityEdge", null, 1, 1, ExceptionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getExceptionVariable_Name(), this.ecorePackage.getEString(), "name", null, 1, 1,
         ExceptionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, !IS_ORDERED);
      initEReference(getExceptionVariable_ExceptionType(), theEcorePackage.getEClassifier(), null, "exceptionType",
         null, 0, -1, ExceptionVariable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getExceptionVariable_GenericExceptionType(), theEcorePackage.getEGenericType(), null,
         "genericExceptionType", null, 0, -1, ExceptionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(this.activityEdgeEClass, ActivityEdge.class, "ActivityEdge", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getActivityEdge_Target(), getActivityNode(), getActivityNode_Incoming(), "target", null, 1, 1,
         ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getActivityEdge_Source(), getActivityNode(), getActivityNode_Outgoing(), "source", null, 1, 1,
         ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getActivityEdge_OwningActivity(), getActivity(), getActivity_OwnedActivityEdge(),
         "owningActivity", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getActivityEdge_Guard(), getEdgeGuard(), "guard", "NONE", 1, 1, ActivityEdge.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getActivityEdge_GuardExpression(), theExpressionsPackage_1.getExpression(), null,
         "guardExpression", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getActivityEdge_GuardException(), getExceptionVariable(), getExceptionVariable_ActivityEdge(),
         "guardException", null, 0, -1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(this.activityNodeEClass, ActivityNode.class, "ActivityNode", IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getActivityNode_Outgoing(), getActivityEdge(), getActivityEdge_Source(), "outgoing", null, 0, -1,
         ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getActivityNode_OwningActivity(), getActivity(), getActivity_OwnedActivityNode(),
         "owningActivity", null, 0, 1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getActivityNode_OwningActivityNode(), getStructuredNode(), getStructuredNode_OwnedActivityNode(),
         "owningActivityNode", null, 0, 1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getActivityNode_Incoming(), getActivityEdge(), getActivityEdge_Target(), "incoming", null, 0, -1,
         ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(this.activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getActivity_OwningOperation(), getOperationExtension(), getOperationExtension_OwnedActivity(),
         "owningOperation", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getActivity_OwnedActivityEdge(), getActivityEdge(), getActivityEdge_OwningActivity(),
         "ownedActivityEdge", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getActivity_Precondition(), getMatchingStoryNode(), null, "precondition", null, 0, 1,
         Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
         IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getActivity_InParameter(), theEcorePackage.getEParameter(), null, "inParameter", null, 0, -1,
         Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
         IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getActivity_OutParameter(), theEcorePackage.getEParameter(), null, "outParameter", null, 0, -1,
         Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
         IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getActivity_OwnedActivityNode(), getActivityNode(), getActivityNode_OwningActivity(),
         "ownedActivityNode", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(this.operationExtensionEClass, OperationExtension.class, "OperationExtension", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getOperationExtension_Operation(), theEcorePackage.getEOperation(), null, "operation", null, 0, 1,
         OperationExtension.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
      initEReference(getOperationExtension_ReturnValue(), theEcorePackage.getEParameter(), null, "returnValue", null,
         0, 1, OperationExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getOperationExtension_OwnedActivity(), getActivity(), getActivity_OwningOperation(),
         "ownedActivity", null, 0, 1, OperationExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      EOperation op = initEOperation(getOperationExtension__NumberOfOutParams__DiagnosticChain_Map(),
         this.ecorePackage.getEBoolean(), "NumberOfOutParams", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      EGenericType g1 = createEGenericType(this.ecorePackage.getEMap());
      EGenericType g2 = createEGenericType(this.ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(this.ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(this.matchingStoryNodeEClass, MatchingStoryNode.class, "MatchingStoryNode", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getMatchingStoryNode_OwnedPattern(), thePatternsPackage.getMatchingPattern(), null,
         "ownedPattern", null, 1, 1, MatchingStoryNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(this.storyNodeEClass, StoryNode.class, "StoryNode", IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getStoryNode_ForEach(), this.ecorePackage.getEBoolean(), "forEach", null, 1, 1, StoryNode.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getStoryNode_StoryPattern(), thePatternsPackage.getStoryPattern(), null, "storyPattern", null, 1,
         1, StoryNode.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

      initEClass(this.structuredNodeEClass, StructuredNode.class, "StructuredNode", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getStructuredNode_OwnedActivityNode(), getActivityNode(), getActivityNode_OwningActivityNode(),
         "ownedActivityNode", null, 0, -1, StructuredNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(this.junctionNodeEClass, JunctionNode.class, "JunctionNode", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(this.startNodeEClass, StartNode.class, "StartNode", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(this.statementNodeEClass, StatementNode.class, "StatementNode", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getStatementNode_StatementExpression(), theExpressionsPackage_1.getExpression(), null,
         "statementExpression", null, 1, 1, StatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(this.stopNodeEClass, StopNode.class, "StopNode", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getStopNode_FlowStopOnly(), this.ecorePackage.getEBoolean(), "flowStopOnly", null, 1, 1,
         StopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
         !IS_ORDERED);
      initEReference(getStopNode_ReturnValue(), theExpressionsPackage_1.getExpression(), null, "returnValue", null, 0,
         1, StopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(this.activityCallNodeEClass, ActivityCallNode.class, "ActivityCallNode", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getActivityCallNode_CalledActivity(), getActivity(), null, "calledActivity", null, 1, -1,
         ActivityCallNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(this.modifyingStoryNodeEClass, ModifyingStoryNode.class, "ModifyingStoryNode", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getModifyingStoryNode_OwnedRule(), thePatternsPackage.getStoryPattern(), null, "ownedRule", null,
         1, 1, ModifyingStoryNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      // Initialize enums and add enum literals
      initEEnum(this.edgeGuardEEnum, EdgeGuard.class, "EdgeGuard");
      addEEnumLiteral(this.edgeGuardEEnum, EdgeGuard.NONE);
      addEEnumLiteral(this.edgeGuardEEnum, EdgeGuard.SUCCESS);
      addEEnumLiteral(this.edgeGuardEEnum, EdgeGuard.FAILURE);
      addEEnumLiteral(this.edgeGuardEEnum, EdgeGuard.EACH_TIME);
      addEEnumLiteral(this.edgeGuardEEnum, EdgeGuard.END);
      addEEnumLiteral(this.edgeGuardEEnum, EdgeGuard.ELSE);
      addEEnumLiteral(this.edgeGuardEEnum, EdgeGuard.BOOL);
      addEEnumLiteral(this.edgeGuardEEnum, EdgeGuard.EXCEPTION);
      addEEnumLiteral(this.edgeGuardEEnum, EdgeGuard.FINALLY);

      // Create annotations
      // http://www.eclipse.org/emf/2002/GenModel
      createGenModelAnnotations();
      // redefines
      createRedefinesAnnotations();
      // http://www.eclipse.org/uml2/1.1.0/GenModel
      createGenModel_1Annotations();
      // subsets
      createSubsetsAnnotations();
      // union
      createUnionAnnotations();
   }

   /**
    * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void createGenModelAnnotations ()
   {
      String source = "http://www.eclipse.org/emf/2002/GenModel";
      addAnnotation(this.exceptionVariableEClass, source, new String[] {"documentation",
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
         this.activityCallNodeEClass,
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
    * Initializes the annotations for <b>http://www.eclipse.org/uml2/1.1.0/GenModel</b>. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void createGenModel_1Annotations ()
   {
      String source = "http://www.eclipse.org/uml2/1.1.0/GenModel";
      addAnnotation(getOperationExtension__NumberOfOutParams__DiagnosticChain_Map(), source, new String[] {"body",
            "self.oclAsType(Callable).out->size() <= 1"});
   }

   /**
    * Initializes the annotations for <b>redefines</b>. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void createRedefinesAnnotations ()
   {
      String source = "redefines";
      addAnnotation(getActivity_InParameter(), source, new String[] {}, new URI[] {URI.createURI(SDMPackage.eNS_URI)
         .appendFragment("//calls/Callable/%duplicates%/inParameter")});
      addAnnotation(getActivity_OutParameter(), source, new String[] {}, new URI[] {URI.createURI(SDMPackage.eNS_URI)
         .appendFragment("//calls/Callable/%duplicates%/outParameter")});
      addAnnotation(getOperationExtension_Operation(), source, new String[] {},
         new URI[] {URI.createURI(SDMPackage.eNS_URI).appendFragment("//Extension/base")});
   }

   /**
    * Initializes the annotations for <b>union</b>. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void createUnionAnnotations ()
   {
      String source = "union";
      addAnnotation(getStoryNode_StoryPattern(), source, new String[] {});
   }

   /**
    * Initializes the annotations for <b>subsets</b>. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
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
