/**
 * <copyright>
 * </copyright>
 *

 */
package org.storydriven.storydiagrams.expressions.pathExpressions.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.storydriven.storydiagrams.expressions.pathExpressions.ExplicitPathDescription;
import org.storydriven.storydiagrams.expressions.pathExpressions.ImplicitPathDescription;
import org.storydriven.storydiagrams.expressions.pathExpressions.Path;
import org.storydriven.storydiagrams.expressions.pathExpressions.PathExpression;
import org.storydriven.storydiagrams.expressions.pathExpressions.PathExpressionsPackage;
import org.storydriven.storydiagrams.expressions.pathExpressions.PathSegment;
import org.storydriven.storydiagrams.expressions.pathExpressions.PathSegmentDescription;
import org.storydriven.storydiagrams.expressions.pathExpressions.RestrictionList;
import org.storydriven.storydiagrams.expressions.pathExpressions.TypeRestriction;

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
 * @see org.storydriven.storydiagrams.expressions.pathExpressions.PathExpressionsPackage
 * @generated
 */
public class PathExpressionsSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PathExpressionsPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathExpressionsSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PathExpressionsPackage.eINSTANCE;
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
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PathExpressionsPackage.PATH_EXPRESSION:
      {
        PathExpression pathExpression = (PathExpression)theEObject;
        T result = casePathExpression(pathExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PathExpressionsPackage.PATH:
      {
        Path path = (Path)theEObject;
        T result = casePath(path);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PathExpressionsPackage.PATH_SEGMENT:
      {
        PathSegment pathSegment = (PathSegment)theEObject;
        T result = casePathSegment(pathSegment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PathExpressionsPackage.PATH_SEGMENT_DESCRIPTION:
      {
        PathSegmentDescription pathSegmentDescription = (PathSegmentDescription)theEObject;
        T result = casePathSegmentDescription(pathSegmentDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PathExpressionsPackage.RESTRICTION_LIST:
      {
        RestrictionList restrictionList = (RestrictionList)theEObject;
        T result = caseRestrictionList(restrictionList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PathExpressionsPackage.IMPLICIT_PATH_DESCRIPTION:
      {
        ImplicitPathDescription implicitPathDescription = (ImplicitPathDescription)theEObject;
        T result = caseImplicitPathDescription(implicitPathDescription);
        if (result == null) result = casePathSegmentDescription(implicitPathDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PathExpressionsPackage.EXPLICIT_PATH_DESCRIPTION:
      {
        ExplicitPathDescription explicitPathDescription = (ExplicitPathDescription)theEObject;
        T result = caseExplicitPathDescription(explicitPathDescription);
        if (result == null) result = casePathSegmentDescription(explicitPathDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PathExpressionsPackage.TYPE_RESTRICTION:
      {
        TypeRestriction typeRestriction = (TypeRestriction)theEObject;
        T result = caseTypeRestriction(typeRestriction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathExpression(PathExpression object)
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
  public T casePath(Path object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Segment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Segment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathSegment(PathSegment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Segment Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Segment Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathSegmentDescription(PathSegmentDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Restriction List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Restriction List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRestrictionList(RestrictionList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implicit Path Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implicit Path Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplicitPathDescription(ImplicitPathDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Explicit Path Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Explicit Path Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExplicitPathDescription(ExplicitPathDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Restriction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Restriction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeRestriction(TypeRestriction object)
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
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PathExpressionsSwitch
