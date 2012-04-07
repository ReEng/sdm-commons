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
import org.storydriven.storydiagrams.activities.ModifyingStoryNode;
import org.storydriven.storydiagrams.patterns.StoryPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modifying Story Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.activities.impl.ModifyingStoryNodeImpl#getOwnedRule <em>Owned Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModifyingStoryNodeImpl extends StoryNodeImpl implements ModifyingStoryNode {
	/**
	 * The cached value of the '{@link #getOwnedRule() <em>Owned Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRule()
	 * @generated
	 * @ordered
	 */
	protected StoryPattern ownedRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyingStoryNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitiesPackage.Literals.MODIFYING_STORY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryPattern getOwnedRule() {
		return ownedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedRule(StoryPattern newOwnedRule, NotificationChain msgs) {
		StoryPattern oldOwnedRule = ownedRule;
		ownedRule = newOwnedRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitiesPackage.MODIFYING_STORY_NODE__OWNED_RULE, oldOwnedRule, newOwnedRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedRule(StoryPattern newOwnedRule) {
		if (newOwnedRule != ownedRule) {
			NotificationChain msgs = null;
			if (ownedRule != null)
				msgs = ((InternalEObject)ownedRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitiesPackage.MODIFYING_STORY_NODE__OWNED_RULE, null, msgs);
			if (newOwnedRule != null)
				msgs = ((InternalEObject)newOwnedRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitiesPackage.MODIFYING_STORY_NODE__OWNED_RULE, null, msgs);
			msgs = basicSetOwnedRule(newOwnedRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.MODIFYING_STORY_NODE__OWNED_RULE, newOwnedRule, newOwnedRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitiesPackage.MODIFYING_STORY_NODE__OWNED_RULE:
				return basicSetOwnedRule(null, msgs);
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
			case ActivitiesPackage.MODIFYING_STORY_NODE__OWNED_RULE:
				return getOwnedRule();
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
			case ActivitiesPackage.MODIFYING_STORY_NODE__OWNED_RULE:
				setOwnedRule((StoryPattern)newValue);
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
			case ActivitiesPackage.MODIFYING_STORY_NODE__OWNED_RULE:
				setOwnedRule((StoryPattern)null);
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
			case ActivitiesPackage.MODIFYING_STORY_NODE__OWNED_RULE:
				return ownedRule != null;
		}
		return super.eIsSet(featureID);
	}

} //ModifyingStoryNodeImpl
