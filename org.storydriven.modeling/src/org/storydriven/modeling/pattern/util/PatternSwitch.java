/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.pattern.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.NamedElement;
import org.storydriven.modeling.TypedElement;

import org.storydriven.modeling.activities.ActivityNode;

import org.storydriven.modeling.pattern.AttributeExpression;
import org.storydriven.modeling.pattern.Link;
import org.storydriven.modeling.pattern.MultiLink;
import org.storydriven.modeling.pattern.ObjectPattern;
import org.storydriven.modeling.pattern.Path;
import org.storydriven.modeling.pattern.PatternPackage;
import org.storydriven.modeling.pattern.StoryNode;

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
 * @see org.storydriven.modeling.pattern.PatternPackage
 * @generated
 */
public class PatternSwitch<T>
{
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static PatternPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PatternSwitch ()
   {
      if (modelPackage == null)
      {
         modelPackage = PatternPackage.eINSTANCE;
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
         case PatternPackage.ATTRIBUTE_EXPRESSION:
         {
            AttributeExpression attributeExpression = (AttributeExpression) theEObject;
            T result = caseAttributeExpression(attributeExpression);
            if (result == null)
               result = caseNamedElement(attributeExpression);
            if (result == null)
               result = caseExtendableElement(attributeExpression);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case PatternPackage.LINK:
         {
            Link link = (Link) theEObject;
            T result = caseLink(link);
            if (result == null)
               result = caseNamedElement(link);
            if (result == null)
               result = caseExtendableElement(link);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case PatternPackage.MULTI_LINK:
         {
            MultiLink multiLink = (MultiLink) theEObject;
            T result = caseMultiLink(multiLink);
            if (result == null)
               result = caseExtendableElement(multiLink);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case PatternPackage.OBJECT_PATTERN:
         {
            ObjectPattern objectPattern = (ObjectPattern) theEObject;
            T result = caseObjectPattern(objectPattern);
            if (result == null)
               result = caseCommentableElement(objectPattern);
            if (result == null)
               result = caseExtendableElement(objectPattern);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case PatternPackage.STORY_NODE:
         {
            StoryNode storyNode = (StoryNode) theEObject;
            T result = caseStoryNode(storyNode);
            if (result == null)
               result = caseActivityNode(storyNode);
            if (result == null)
               result = caseCommentableElement(storyNode);
            if (result == null)
               result = caseNamedElement(storyNode);
            if (result == null)
               result = caseExtendableElement(storyNode);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case PatternPackage.PATH:
         {
            Path path = (Path) theEObject;
            T result = casePath(path);
            if (result == null)
               result = caseLink(path);
            if (result == null)
               result = caseNamedElement(path);
            if (result == null)
               result = caseExtendableElement(path);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case PatternPackage.OBJECT:
         {
            org.storydriven.modeling.pattern.Object object = (org.storydriven.modeling.pattern.Object) theEObject;
            T result = caseObject(object);
            if (result == null)
               result = caseTypedElement(object);
            if (result == null)
               result = caseNamedElement(object);
            if (result == null)
               result = caseExtendableElement(object);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         default:
            return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Attribute Expression</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Attribute Expression</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAttributeExpression (AttributeExpression object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Link</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseLink (Link object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Multi Link</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Multi Link</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseMultiLink (MultiLink object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Object Pattern</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Object Pattern</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseObjectPattern (ObjectPattern object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Story Node</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Story Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseStoryNode (StoryNode object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Path</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Path</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casePath (Path object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Object</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseObject (org.storydriven.modeling.pattern.Object object)
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

} //PatternSwitch
