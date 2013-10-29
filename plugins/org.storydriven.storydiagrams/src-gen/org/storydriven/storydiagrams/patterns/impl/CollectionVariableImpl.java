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
 *   <li>{@link org.storydriven.storydiagrams.patterns.impl.CollectionVariableImpl#isAtLeastOne <em>At Least One</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.patterns.impl.CollectionVariableImpl#isUnique <em>Unique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionVariableImpl extends ObjectVariableImpl implements
		CollectionVariable {
	/**
	 * The default value of the '{@link #isAtLeastOne() <em>At Least One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAtLeastOne()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AT_LEAST_ONE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAtLeastOne() <em>At Least One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAtLeastOne()
	 * @generated
	 * @ordered
	 */
	protected boolean atLeastOne = AT_LEAST_ONE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

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
	public boolean isAtLeastOne() {
		return atLeastOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtLeastOne(boolean newAtLeastOne) {
		boolean oldAtLeastOne = atLeastOne;
		atLeastOne = newAtLeastOne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PatternsPackage.COLLECTION_VARIABLE__AT_LEAST_ONE,
					oldAtLeastOne, atLeastOne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PatternsPackage.COLLECTION_VARIABLE__UNIQUE, oldUnique,
					unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PatternsPackage.COLLECTION_VARIABLE__AT_LEAST_ONE:
			return isAtLeastOne();
		case PatternsPackage.COLLECTION_VARIABLE__UNIQUE:
			return isUnique();
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
		case PatternsPackage.COLLECTION_VARIABLE__AT_LEAST_ONE:
			setAtLeastOne((Boolean) newValue);
			return;
		case PatternsPackage.COLLECTION_VARIABLE__UNIQUE:
			setUnique((Boolean) newValue);
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
		case PatternsPackage.COLLECTION_VARIABLE__AT_LEAST_ONE:
			setAtLeastOne(AT_LEAST_ONE_EDEFAULT);
			return;
		case PatternsPackage.COLLECTION_VARIABLE__UNIQUE:
			setUnique(UNIQUE_EDEFAULT);
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
		case PatternsPackage.COLLECTION_VARIABLE__AT_LEAST_ONE:
			return atLeastOne != AT_LEAST_ONE_EDEFAULT;
		case PatternsPackage.COLLECTION_VARIABLE__UNIQUE:
			return unique != UNIQUE_EDEFAULT;
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
		result.append(" (atLeastOne: ");
		result.append(atLeastOne);
		result.append(", unique: ");
		result.append(unique);
		result.append(')');
		return result.toString();
	}

} //CollectionVariableImpl
