/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.patterns;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Set Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a set of objects of the same type that are represented by a single node.
 * The context for contained Constraints and AttributeAssignments is every single object in the set. E.g., if the constraint is "name = 'abc'", only objects with that name are matched and added to the set. The use of the binding operator "CREATE" is not defined for ObjectSetVariables, i.e., the sets can only be matched and deleted.
 * <!-- end-model-doc -->
 *
 *
 * @see org.storydriven.storydiagrams.patterns.PatternsPackage#getObjectSetVariable()
 * @model
 * @generated
 */
public interface ObjectSetVariable extends ObjectVariable {
} // ObjectSetVariable
