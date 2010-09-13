/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.Expression;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.Extension;
import org.storydriven.modeling.NamedElement;
import org.storydriven.modeling.TypedElement;

import org.storydriven.modeling.activities.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.storydriven.modeling.activities.ActivitiesPackage
 * @generated
 */
public class ActivitiesSwitch<T>
{
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static ActivitiesPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ActivitiesSwitch ()
   {
      if (modelPackage == null)
      {
         modelPackage = ActivitiesPackage.eINSTANCE;
      }
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   public T doSwitch (EObject theEObject)
   {
      return doSwitch(theEObject.eClass(), theEObject);
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   protected T doSwitch (EClass theEClass, EObject theEObject)
   {
      if (theEClass.eContainer() == modelPackage)
      {
         return doSwitch(theEClass.getClassifierID(), theEObject);
      }
      else
      {
         List<EClass> eSuperTypes = theEClass.getESuperTypes();
         return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(eSuperTypes.get(0), theEObject);
      }
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   protected T doSwitch (int classifierID, EObject theEObject)
   {
      switch (classifierID)
      {
         case ActivitiesPackage.ACTIVITY:
         {
            Activity activity = (Activity) theEObject;
            T result = caseActivity(activity);
            if (result == null)
               result = caseCommentableElement(activity);
            if (result == null)
               result = caseExtendableElement(activity);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ActivitiesPackage.OPERATION_EXTENSION:
         {
            OperationExtension operationExtension = (OperationExtension) theEObject;
            T result = caseOperationExtension(operationExtension);
            if (result == null)
               result = caseExtension(operationExtension);
            if (result == null)
               result = caseExtendableElement(operationExtension);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ActivitiesPackage.ACTIVITY_EDGE:
         {
            ActivityEdge activityEdge = (ActivityEdge) theEObject;
            T result = caseActivityEdge(activityEdge);
            if (result == null)
               result = caseExtendableElement(activityEdge);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ActivitiesPackage.DECISION_NODE:
         {
            DecisionNode decisionNode = (DecisionNode) theEObject;
            T result = caseDecisionNode(decisionNode);
            if (result == null)
               result = caseActivityNode(decisionNode);
            if (result == null)
               result = caseCommentableElement(decisionNode);
            if (result == null)
               result = caseNamedElement(decisionNode);
            if (result == null)
               result = caseExtendableElement(decisionNode);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ActivitiesPackage.EXCEPTION_EXPRESSION:
         {
            ExceptionExpression exceptionExpression = (ExceptionExpression) theEObject;
            T result = caseExceptionExpression(exceptionExpression);
            if (result == null)
               result = caseExpression(exceptionExpression);
            if (result == null)
               result = caseTypedElement(exceptionExpression);
            if (result == null)
               result = caseExtendableElement(exceptionExpression);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ActivitiesPackage.START_NODE:
         {
            StartNode startNode = (StartNode) theEObject;
            T result = caseStartNode(startNode);
            if (result == null)
               result = caseActivityNode(startNode);
            if (result == null)
               result = caseCommentableElement(startNode);
            if (result == null)
               result = caseNamedElement(startNode);
            if (result == null)
               result = caseExtendableElement(startNode);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ActivitiesPackage.STATEMENT_NODE:
         {
            StatementNode statementNode = (StatementNode) theEObject;
            T result = caseStatementNode(statementNode);
            if (result == null)
               result = caseActivityNode(statementNode);
            if (result == null)
               result = caseCommentableElement(statementNode);
            if (result == null)
               result = caseNamedElement(statementNode);
            if (result == null)
               result = caseExtendableElement(statementNode);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ActivitiesPackage.STOP_NODE:
         {
            StopNode stopNode = (StopNode) theEObject;
            T result = caseStopNode(stopNode);
            if (result == null)
               result = caseActivityNode(stopNode);
            if (result == null)
               result = caseCommentableElement(stopNode);
            if (result == null)
               result = caseNamedElement(stopNode);
            if (result == null)
               result = caseExtendableElement(stopNode);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ActivitiesPackage.STRUCTURED_NODE:
         {
            StructuredNode structuredNode = (StructuredNode) theEObject;
            T result = caseStructuredNode(structuredNode);
            if (result == null)
               result = caseActivityNode(structuredNode);
            if (result == null)
               result = caseCommentableElement(structuredNode);
            if (result == null)
               result = caseNamedElement(structuredNode);
            if (result == null)
               result = caseExtendableElement(structuredNode);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ActivitiesPackage.ACTIVITY_NODE:
         {
            ActivityNode activityNode = (ActivityNode) theEObject;
            T result = caseActivityNode(activityNode);
            if (result == null)
               result = caseCommentableElement(activityNode);
            if (result == null)
               result = caseNamedElement(activityNode);
            if (result == null)
               result = caseExtendableElement(activityNode);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         default:
            return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseActivity (Activity object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Operation Extension</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Operation Extension</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseOperationExtension (OperationExtension object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseActivityEdge (ActivityEdge object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Decision Node</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Decision Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseDecisionNode (DecisionNode object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Exception Expression</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Exception Expression</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseExceptionExpression (ExceptionExpression object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Start Node</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Start Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseStartNode (StartNode object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Statement Node</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Statement Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseStatementNode (StatementNode object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Stop Node</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Stop Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseStopNode (StopNode object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Structured Node</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Structured Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseStructuredNode (StructuredNode object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Activity Node</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Activity Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseActivityNode (ActivityNode object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseExtendableElement (ExtendableElement object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseCommentableElement (CommentableElement object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseExtension (Extension object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseNamedElement (NamedElement object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseTypedElement (TypedElement object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseExpression (Expression object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch, but this is the last case anyway.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   public T defaultCase (EObject object)
   {
      return null;
   }

} //ActivitiesSwitch
