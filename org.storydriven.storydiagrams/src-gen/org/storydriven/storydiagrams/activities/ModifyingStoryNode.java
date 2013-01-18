/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.activities;

import org.storydriven.storydiagrams.patterns.StoryPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifying Story Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ModifyingStoryNode contains a story pattern which may change the underlying graph upon execution.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.activities.ModifyingStoryNode#getOwnedRule <em>Owned Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.storydiagrams.activities.ActivitiesPackage#getModifyingStoryNode()
 * @model
 * @generated
 */
public interface ModifyingStoryNode extends StoryNode {
	/**
	 * Returns the value of the '<em><b>Owned Rule</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 *   <li>'{@link org.storydriven.storydiagrams.activities.StoryNode#getStoryPattern() <em>Story Pattern</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The story pattern contained in this ModifyingStoryNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Rule</em>' containment reference.
	 * @see #setOwnedRule(StoryPattern)
	 * @see org.storydriven.storydiagrams.activities.ActivitiesPackage#getModifyingStoryNode_OwnedRule()
	 * @model containment="true" resolveProxies="true" required="true" ordered="false"
	 * @generated
	 */
	StoryPattern getOwnedRule();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.activities.ModifyingStoryNode#getOwnedRule <em>Owned Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Rule</em>' containment reference.
	 * @see #getOwnedRule()
	 * @generated
	 */
	void setOwnedRule(StoryPattern value);

} // ModifyingStoryNode
