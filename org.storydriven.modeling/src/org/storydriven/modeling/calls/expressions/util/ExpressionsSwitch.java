/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.calls.expressions.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.TypedElement;
import org.storydriven.modeling.calls.Invocation;
import org.storydriven.modeling.calls.expressions.*;
import org.storydriven.modeling.calls.expressions.ExpressionsPackage;
import org.storydriven.modeling.calls.expressions.MethodCallExpression;
import org.storydriven.modeling.calls.expressions.ParameterExpression;
import org.storydriven.modeling.expressions.Expression;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the
 * <code>caseXXX</code> method for each class of the model, starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see org.storydriven.modeling.calls.expressions.ExpressionsPackage
 * @generated
 */
public class ExpressionsSwitch<T> extends Switch<T>
{
   /**
    * The cached model package
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected static ExpressionsPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ExpressionsSwitch ()
   {
      if (modelPackage == null)
      {
         modelPackage = ExpressionsPackage.eINSTANCE;
      }
   }

   /**
    * Checks whether this is a switch for the given package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @parameter ePackage the package in question.
    * @return whether this is a switch for the given package.
    * @generated
    */
   @Override
   protected boolean isSwitchFor (EPackage ePackage)
   {
      return ePackage == modelPackage;
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   @Override
   protected T doSwitch (int classifierID, EObject theEObject)
   {
      switch (classifierID)
      {
         case ExpressionsPackage.METHOD_CALL_EXPRESSION:
         {
            MethodCallExpression methodCallExpression = (MethodCallExpression) theEObject;
            T result = caseMethodCallExpression(methodCallExpression);
            if (result == null)
               result = caseExpression(methodCallExpression);
            if (result == null)
               result = caseInvocation(methodCallExpression);
            if (result == null)
               result = caseTypedElement(methodCallExpression);
            if (result == null)
               result = caseCommentableElement(methodCallExpression);
            if (result == null)
               result = caseExtendableElement(methodCallExpression);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ExpressionsPackage.PARAMETER_EXPRESSION:
         {
            ParameterExpression parameterExpression = (ParameterExpression) theEObject;
            T result = caseParameterExpression(parameterExpression);
            if (result == null)
               result = caseExpression(parameterExpression);
            if (result == null)
               result = caseTypedElement(parameterExpression);
            if (result == null)
               result = caseCommentableElement(parameterExpression);
            if (result == null)
               result = caseExtendableElement(parameterExpression);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         default:
            return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Method Call Expression</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a
    * non-null result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Method Call Expression</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseMethodCallExpression (MethodCallExpression object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Parameter Expression</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a
    * non-null result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Parameter Expression</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseParameterExpression (ParameterExpression object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
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
    * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
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
    * Returns the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
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
    * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null result
    * will terminate the switch. <!-- end-user-doc -->
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
    * Returns the result of interpreting the object as an instance of '<em>Invocation</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null result
    * will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Invocation</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseInvocation (Invocation object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
    * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   @Override
   public T defaultCase (EObject object)
   {
      return null;
   }

} // ExpressionsSwitch
