/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.activities.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.MatchingStoryNode;
import org.storydriven.storydiagrams.patterns.MatchingPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matching Story Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.activities.impl.MatchingStoryNodeImpl#getOwnedPattern <em>Owned Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatchingStoryNodeImpl extends StoryNodeImpl implements MatchingStoryNode {
	/**
	 * The cached value of the '{@link #getOwnedPattern() <em>Owned Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPattern()
	 * @generated
	 * @ordered
	 */
	protected MatchingPattern ownedPattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchingStoryNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitiesPackage.Literals.MATCHING_STORY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchingPattern getOwnedPattern() {
		return ownedPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedPattern(MatchingPattern newOwnedPattern, NotificationChain msgs) {
		MatchingPattern oldOwnedPattern = ownedPattern;
		ownedPattern = newOwnedPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN, oldOwnedPattern, newOwnedPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedPattern(MatchingPattern newOwnedPattern) {
		if (newOwnedPattern != ownedPattern) {
			NotificationChain msgs = null;
			if (ownedPattern != null)
				msgs = ((InternalEObject)ownedPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN, null, msgs);
			if (newOwnedPattern != null)
				msgs = ((InternalEObject)newOwnedPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN, null, msgs);
			msgs = basicSetOwnedPattern(newOwnedPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN, newOwnedPattern, newOwnedPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN:
				return basicSetOwnedPattern(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN:
				return getOwnedPattern();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN:
				setOwnedPattern((MatchingPattern)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN:
				setOwnedPattern((MatchingPattern)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN:
				return ownedPattern != null;
		}
		return super.eIsSet(featureID);
	}

} //MatchingStoryNodeImpl
