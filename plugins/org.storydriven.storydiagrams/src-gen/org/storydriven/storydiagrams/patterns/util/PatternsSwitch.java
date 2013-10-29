/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.patterns.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.NamedElement;
import org.storydriven.core.TypedElement;
import org.storydriven.storydiagrams.Variable;
import org.storydriven.storydiagrams.patterns.*;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.AttributeAssignment;
import org.storydriven.storydiagrams.patterns.CollectionVariable;
import org.storydriven.storydiagrams.patterns.Constraint;
import org.storydriven.storydiagrams.patterns.InclusionLink;
import org.storydriven.storydiagrams.patterns.LinkConstraint;
import org.storydriven.storydiagrams.patterns.LinkVariable;
import org.storydriven.storydiagrams.patterns.MatchingPattern;
import org.storydriven.storydiagrams.patterns.MaybeLink;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.Path;
import org.storydriven.storydiagrams.patterns.PatternsPackage;
import org.storydriven.storydiagrams.patterns.PrimitiveVariable;
import org.storydriven.storydiagrams.patterns.StoryPattern;

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
 * @see org.storydriven.storydiagrams.patterns.PatternsPackage
 * @generated
 */
public class PatternsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PatternsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternsSwitch() {
		if (modelPackage == null) {
			modelPackage = PatternsPackage.eINSTANCE;
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
	protected boolean isSwitchFor(EPackage ePackage) {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case PatternsPackage.OBJECT_VARIABLE: {
			ObjectVariable objectVariable = (ObjectVariable) theEObject;
			T result = caseObjectVariable(objectVariable);
			if (result == null)
				result = caseAbstractVariable(objectVariable);
			if (result == null)
				result = caseVariable(objectVariable);
			if (result == null)
				result = caseNamedElement(objectVariable);
			if (result == null)
				result = caseTypedElement(objectVariable);
			if (result == null)
				result = caseExtendableElement(objectVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PatternsPackage.ABSTRACT_VARIABLE: {
			AbstractVariable abstractVariable = (AbstractVariable) theEObject;
			T result = caseAbstractVariable(abstractVariable);
			if (result == null)
				result = caseVariable(abstractVariable);
			if (result == null)
				result = caseNamedElement(abstractVariable);
			if (result == null)
				result = caseTypedElement(abstractVariable);
			if (result == null)
				result = caseExtendableElement(abstractVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PatternsPackage.CONSTRAINT: {
			Constraint constraint = (Constraint) theEObject;
			T result = caseConstraint(constraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PatternsPackage.ABSTRACT_LINK_VARIABLE: {
			AbstractLinkVariable abstractLinkVariable = (AbstractLinkVariable) theEObject;
			T result = caseAbstractLinkVariable(abstractLinkVariable);
			if (result == null)
				result = caseNamedElement(abstractLinkVariable);
			if (result == null)
				result = caseExtendableElement(abstractLinkVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PatternsPackage.LINK_CONSTRAINT: {
			LinkConstraint linkConstraint = (LinkConstraint) theEObject;
			T result = caseLinkConstraint(linkConstraint);
			if (result == null)
				result = caseExtendableElement(linkConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PatternsPackage.ATTRIBUTE_ASSIGNMENT: {
			AttributeAssignment attributeAssignment = (AttributeAssignment) theEObject;
			T result = caseAttributeAssignment(attributeAssignment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PatternsPackage.COLLECTION_VARIABLE: {
			CollectionVariable collectionVariable = (CollectionVariable) theEObject;
			T result = caseCollectionVariable(collectionVariable);
			if (result == null)
				result = caseObjectVariable(collectionVariable);
			if (result == null)
				result = caseAbstractVariable(collectionVariable);
			if (result == null)
				result = caseVariable(collectionVariable);
			if (result == null)
				result = caseNamedElement(collectionVariable);
			if (result == null)
				result = caseTypedElement(collectionVariable);
			if (result == null)
				result = caseExtendableElement(collectionVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PatternsPackage.PRIMITIVE_VARIABLE: {
			PrimitiveVariable primitiveVariable = (PrimitiveVariable) theEObject;
			T result = casePrimitiveVariable(primitiveVariable);
			if (result == null)
				result = caseAbstractVariable(primitiveVariable);
			if (result == null)
				result = caseVariable(primitiveVariable);
			if (result == null)
				result = caseNamedElement(primitiveVariable);
			if (result == null)
				result = caseTypedElement(primitiveVariable);
			if (result == null)
				result = caseExtendableElement(primitiveVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PatternsPackage.PATH: {
			Path path = (Path) theEObject;
			T result = casePath(path);
			if (result == null)
				result = caseAbstractLinkVariable(path);
			if (result == null)
				result = caseNamedElement(path);
			if (result == null)
				result = caseExtendableElement(path);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PatternsPackage.LINK_VARIABLE: {
			LinkVariable linkVariable = (LinkVariable) theEObject;
			T result = caseLinkVariable(linkVariable);
			if (result == null)
				result = caseAbstractLinkVariable(linkVariable);
			if (result == null)
				result = caseNamedElement(linkVariable);
			if (result == null)
				result = caseExtendableElement(linkVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PatternsPackage.INCLUSION_LINK: {
			InclusionLink inclusionLink = (InclusionLink) theEObject;
			T result = caseInclusionLink(inclusionLink);
			if (result == null)
				result = caseAbstractLinkVariable(inclusionLink);
			if (result == null)
				result = caseNamedElement(inclusionLink);
			if (result == null)
				result = caseExtendableElement(inclusionLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PatternsPackage.MATCHING_PATTERN: {
			MatchingPattern matchingPattern = (MatchingPattern) theEObject;
			T result = caseMatchingPattern(matchingPattern);
			if (result == null)
				result = caseStoryPattern(matchingPattern);
			if (result == null)
				result = caseCommentableElement(matchingPattern);
			if (result == null)
				result = caseExtendableElement(matchingPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PatternsPackage.MAYBE_LINK: {
			MaybeLink maybeLink = (MaybeLink) theEObject;
			T result = caseMaybeLink(maybeLink);
			if (result == null)
				result = caseAbstractLinkVariable(maybeLink);
			if (result == null)
				result = caseNamedElement(maybeLink);
			if (result == null)
				result = caseExtendableElement(maybeLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PatternsPackage.STORY_PATTERN: {
			StoryPattern storyPattern = (StoryPattern) theEObject;
			T result = caseStoryPattern(storyPattern);
			if (result == null)
				result = caseCommentableElement(storyPattern);
			if (result == null)
				result = caseExtendableElement(storyPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectVariable(ObjectVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractVariable(AbstractVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Link Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Link Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractLinkVariable(AbstractLinkVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkConstraint(LinkConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeAssignment(AttributeAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionVariable(CollectionVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveVariable(PrimitiveVariable object) {
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
	public T casePath(Path object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkVariable(LinkVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inclusion Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inclusion Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInclusionLink(InclusionLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matching Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matching Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchingPattern(MatchingPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Story Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Story Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoryPattern(StoryPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maybe Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maybe Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaybeLink(MaybeLink object) {
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
	public T caseExtendableElement(ExtendableElement object) {
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
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
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
	public T caseNamedElement(NamedElement object) {
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
	public T caseCommentableElement(CommentableElement object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //PatternsSwitch
