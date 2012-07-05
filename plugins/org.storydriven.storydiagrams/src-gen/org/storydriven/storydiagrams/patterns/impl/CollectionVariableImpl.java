/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.patterns.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.storydriven.storydiagrams.patterns.CollectionVariable;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.patterns.impl.CollectionVariableImpl#isMaybeEmpty <em>Maybe Empty</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionVariableImpl extends ObjectVariableImpl implements
		CollectionVariable {
	/**
	 * The default value of the '{@link #isMaybeEmpty() <em>Maybe Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaybeEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAYBE_EMPTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMaybeEmpty() <em>Maybe Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaybeEmpty()
	 * @generated
	 * @ordered
	 */
	protected boolean maybeEmpty = MAYBE_EMPTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.COLLECTION_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMaybeEmpty() {
		return maybeEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaybeEmpty(boolean newMaybeEmpty) {
		boolean oldMaybeEmpty = maybeEmpty;
		maybeEmpty = newMaybeEmpty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PatternsPackage.COLLECTION_VARIABLE__MAYBE_EMPTY,
					oldMaybeEmpty, maybeEmpty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PatternsPackage.COLLECTION_VARIABLE__MAYBE_EMPTY:
			return isMaybeEmpty();
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
		case PatternsPackage.COLLECTION_VARIABLE__MAYBE_EMPTY:
			setMaybeEmpty((Boolean) newValue);
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
		case PatternsPackage.COLLECTION_VARIABLE__MAYBE_EMPTY:
			setMaybeEmpty(MAYBE_EMPTY_EDEFAULT);
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
		case PatternsPackage.COLLECTION_VARIABLE__MAYBE_EMPTY:
			return maybeEmpty != MAYBE_EMPTY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (maybeEmpty: ");
		result.append(maybeEmpty);
		result.append(')');
		return result.toString();
	}

} //CollectionVariableImpl
