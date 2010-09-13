/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.modeling.Expression;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.TypedElement;
import org.storydriven.modeling.expressions.Collaboration;
import org.storydriven.modeling.expressions.ComplexExpression;
import org.storydriven.modeling.expressions.ConditionalExpression;
import org.storydriven.modeling.expressions.ExpressionsPackage;
import org.storydriven.modeling.expressions.ForLoop;
import org.storydriven.modeling.expressions.WhileLoop;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the
 * <code>caseXXX</code> method for each class of the model, starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * 
 * @see org.storydriven.modeling.expressions.ExpressionsPackage
 * @generated
 */
public class ExpressionsSwitch<T>
{
   /**
    * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected static ExpressionsPackage modelPackage;

   /**
    * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
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
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   public T doSwitch (EObject theEObject)
   {
      return doSwitch(theEObject.eClass(), theEObject);
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
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
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   protected T doSwitch (int classifierID, EObject theEObject)
   {
      switch (classifierID)
      {
         case ExpressionsPackage.COLLABORATION:
         {
            Collaboration collaboration = (Collaboration) theEObject;
            T result = caseCollaboration(collaboration);
            if (result == null)
            {
               result = caseExpression(collaboration);
            }
            if (result == null)
            {
               result = caseTypedElement(collaboration);
            }
            if (result == null)
            {
               result = caseExtendableElement(collaboration);
            }
            if (result == null)
            {
               result = defaultCase(theEObject);
            }
            return result;
         }
         case ExpressionsPackage.COMPLEX_EXPRESSION:
         {
            ComplexExpression complexExpression = (ComplexExpression) theEObject;
            T result = caseComplexExpression(complexExpression);
            if (result == null)
            {
               result = caseExpression(complexExpression);
            }
            if (result == null)
            {
               result = caseTypedElement(complexExpression);
            }
            if (result == null)
            {
               result = caseExtendableElement(complexExpression);
            }
            if (result == null)
            {
               result = defaultCase(theEObject);
            }
            return result;
         }
         case ExpressionsPackage.FOR_LOOP:
         {
            ForLoop forLoop = (ForLoop) theEObject;
            T result = caseForLoop(forLoop);
            if (result == null)
            {
               result = caseExpression(forLoop);
            }
            if (result == null)
            {
               result = caseTypedElement(forLoop);
            }
            if (result == null)
            {
               result = caseExtendableElement(forLoop);
            }
            if (result == null)
            {
               result = defaultCase(theEObject);
            }
            return result;
         }
         case ExpressionsPackage.WHILE_LOOP:
         {
            WhileLoop whileLoop = (WhileLoop) theEObject;
            T result = caseWhileLoop(whileLoop);
            if (result == null)
            {
               result = caseExpression(whileLoop);
            }
            if (result == null)
            {
               result = caseTypedElement(whileLoop);
            }
            if (result == null)
            {
               result = caseExtendableElement(whileLoop);
            }
            if (result == null)
            {
               result = defaultCase(theEObject);
            }
            return result;
         }
         case ExpressionsPackage.CONDITIONAL_EXPRESSION:
         {
            ConditionalExpression conditionalExpression = (ConditionalExpression) theEObject;
            T result = caseConditionalExpression(conditionalExpression);
            if (result == null)
            {
               result = caseExpression(conditionalExpression);
            }
            if (result == null)
            {
               result = caseTypedElement(conditionalExpression);
            }
            if (result == null)
            {
               result = caseExtendableElement(conditionalExpression);
            }
            if (result == null)
            {
               result = defaultCase(theEObject);
            }
            return result;
         }
         default:
            return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Collaboration</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Collaboration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseCollaboration (Collaboration object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Complex Expression</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Complex Expression</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseComplexExpression (ComplexExpression object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>For Loop</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null result
    * will terminate the switch. <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>For Loop</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseForLoop (ForLoop object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>While Loop</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null result
    * will terminate the switch. <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>While Loop</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseWhileLoop (WhileLoop object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Conditional Expression</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
    * non-null result will terminate the switch. <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseConditionalExpression (ConditionalExpression object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Extendable Element</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * 
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
    * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * 
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
    * Returns the result of interpreting the object as an instance of '<em>Expression</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null result
    * will terminate the switch. <!-- end-user-doc -->
    * 
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
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
    * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   public T defaultCase (EObject object)
   {
      return null;
   }

} // ExpressionsSwitch
