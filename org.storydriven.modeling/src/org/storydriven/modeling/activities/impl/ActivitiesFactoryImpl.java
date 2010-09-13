/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.storydriven.modeling.activities.ActivitiesFactory;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.DecisionNode;
import org.storydriven.modeling.activities.ExceptionExpression;
import org.storydriven.modeling.activities.OperationExtension;
import org.storydriven.modeling.activities.StartNode;
import org.storydriven.modeling.activities.StatementNode;
import org.storydriven.modeling.activities.StopNode;
import org.storydriven.modeling.activities.StructuredNode;
import org.storydriven.modeling.activities.TransitionGuard;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ActivitiesFactoryImpl extends EFactoryImpl implements ActivitiesFactory
{
   /**
    * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public static ActivitiesFactory init ()
   {
      try
      {
         ActivitiesFactory theActivitiesFactory = (ActivitiesFactory) EPackage.Registry.INSTANCE
            .getEFactory("http://ns.storydriven.org/sdm/activities/0.1.0");
         if (theActivitiesFactory != null)
         {
            return theActivitiesFactory;
         }
      }
      catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new ActivitiesFactoryImpl();
   }

   /**
    * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public ActivitiesFactoryImpl ()
   {
      super();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public EObject create (EClass eClass)
   {
      switch (eClass.getClassifierID())
      {
         case ActivitiesPackage.ACTIVITY:
            return createActivity();
         case ActivitiesPackage.OPERATION_EXTENSION:
            return createOperationExtension();
         case ActivitiesPackage.ACTIVITY_EDGE:
            return createActivityEdge();
         case ActivitiesPackage.DECISION_NODE:
            return createDecisionNode();
         case ActivitiesPackage.EXCEPTION_EXPRESSION:
            return createExceptionExpression();
         case ActivitiesPackage.START_NODE:
            return createStartNode();
         case ActivitiesPackage.STATEMENT_NODE:
            return createStatementNode();
         case ActivitiesPackage.STOP_NODE:
            return createStopNode();
         case ActivitiesPackage.STRUCTURED_NODE:
            return createStructuredNode();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public Object createFromString (EDataType eDataType, String initialValue)
   {
      switch (eDataType.getClassifierID())
      {
         case ActivitiesPackage.TRANSITION_GUARD:
            return createTransitionGuardFromString(eDataType, initialValue);
         default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public String convertToString (EDataType eDataType, Object instanceValue)
   {
      switch (eDataType.getClassifierID())
      {
         case ActivitiesPackage.TRANSITION_GUARD:
            return convertTransitionGuardToString(eDataType, instanceValue);
         default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public Activity createActivity ()
   {
      ActivityImpl activity = new ActivityImpl();
      return activity;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public OperationExtension createOperationExtension ()
   {
      OperationExtensionImpl operationExtension = new OperationExtensionImpl();
      return operationExtension;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public ActivityEdge createActivityEdge ()
   {
      ActivityEdgeImpl activityEdge = new ActivityEdgeImpl();
      return activityEdge;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public DecisionNode createDecisionNode ()
   {
      DecisionNodeImpl decisionNode = new DecisionNodeImpl();
      return decisionNode;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public ExceptionExpression createExceptionExpression ()
   {
      ExceptionExpressionImpl exceptionExpression = new ExceptionExpressionImpl();
      return exceptionExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public StartNode createStartNode ()
   {
      StartNodeImpl startNode = new StartNodeImpl();
      return startNode;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public StatementNode createStatementNode ()
   {
      StatementNodeImpl statementNode = new StatementNodeImpl();
      return statementNode;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public StopNode createStopNode ()
   {
      StopNodeImpl stopNode = new StopNodeImpl();
      return stopNode;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public StructuredNode createStructuredNode ()
   {
      StructuredNodeImpl structuredNode = new StructuredNodeImpl();
      return structuredNode;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public TransitionGuard createTransitionGuardFromString (EDataType eDataType, String initialValue)
   {
      TransitionGuard result = TransitionGuard.get(initialValue);
      if (result == null)
      {
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      }
      return result;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public String convertTransitionGuardToString (EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public ActivitiesPackage getActivitiesPackage ()
   {
      return (ActivitiesPackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @deprecated
    * @generated
    */
   @Deprecated
   public static ActivitiesPackage getPackage ()
   {
      return ActivitiesPackage.eINSTANCE;
   }

} // ActivitiesFactoryImpl
