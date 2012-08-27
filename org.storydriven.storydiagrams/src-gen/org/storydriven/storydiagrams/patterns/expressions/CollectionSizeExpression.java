/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.patterns.expressions;

import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.patterns.CollectionVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Size Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the number of elements in the set of objects that is represented by an object set variable. For example, if you have an object set variable mySet, then this expression would represent something like mySet.size(). The expression can be used to constrain the pattern application, e.g., to only a apply the pattern when at least two objects can be matched for the set.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.patterns.expressions.CollectionSizeExpression#getSet <em>Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.storydiagrams.patterns.expressions.PatternsExpressionsPackage#getCollectionSizeExpression()
 * @model
 * @generated
 */
public interface CollectionSizeExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the object set variable whose number of set elements is to be represented by this expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set</em>' reference.
	 * @see #setSet(CollectionVariable)
	 * @see org.storydriven.storydiagrams.patterns.expressions.PatternsExpressionsPackage#getCollectionSizeExpression_Set()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CollectionVariable getSet();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.patterns.expressions.CollectionSizeExpression#getSet <em>Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' reference.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(CollectionVariable value);

} // CollectionSizeExpression
