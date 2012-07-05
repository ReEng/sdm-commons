/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.activities.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.core.expressions.Expression;

import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.ActivityFinalNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Final Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.activities.impl.ActivityFinalNodeImpl#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.activities.impl.ActivityFinalNodeImpl#getReturnValues <em>Return Values</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.activities.impl.ActivityFinalNodeImpl#isSuccess <em>Success</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityFinalNodeImpl extends ActivityNodeImpl implements
		ActivityFinalNode {
	/**
	 * The cached value of the '{@link #getReturnValues() <em>Return Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> returnValues;

	/**
	 * The default value of the '{@link #isSuccess() <em>Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuccess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUCCESS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSuccess() <em>Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuccess()
	 * @generated
	 * @ordered
	 */
	protected boolean success = SUCCESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityFinalNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitiesPackage.Literals.ACTIVITY_FINAL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getReturnValue() {
		Expression returnValue = basicGetReturnValue();
		return returnValue != null && returnValue.eIsProxy() ? (Expression) eResolveProxy((InternalEObject) returnValue)
				: returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetReturnValue() {
		// TODO: implement this method to return the 'Return Value' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getReturnValues() {
		if (returnValues == null) {
			returnValues = new EObjectContainmentEList.Resolving<Expression>(
					Expression.class, this,
					ActivitiesPackage.ACTIVITY_FINAL_NODE__RETURN_VALUES);
		}
		return returnValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccess(boolean newSuccess) {
		boolean oldSuccess = success;
		success = newSuccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ActivitiesPackage.ACTIVITY_FINAL_NODE__SUCCESS, oldSuccess,
					success));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ActivitiesPackage.ACTIVITY_FINAL_NODE__RETURN_VALUES:
			return ((InternalEList<?>) getReturnValues()).basicRemove(otherEnd,
					msgs);
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
		case ActivitiesPackage.ACTIVITY_FINAL_NODE__RETURN_VALUE:
			if (resolve)
				return getReturnValue();
			return basicGetReturnValue();
		case ActivitiesPackage.ACTIVITY_FINAL_NODE__RETURN_VALUES:
			return getReturnValues();
		case ActivitiesPackage.ACTIVITY_FINAL_NODE__SUCCESS:
			return isSuccess();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ActivitiesPackage.ACTIVITY_FINAL_NODE__RETURN_VALUES:
			getReturnValues().clear();
			getReturnValues().addAll(
					(Collection<? extends Expression>) newValue);
			return;
		case ActivitiesPackage.ACTIVITY_FINAL_NODE__SUCCESS:
			setSuccess((Boolean) newValue);
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
		case ActivitiesPackage.ACTIVITY_FINAL_NODE__RETURN_VALUES:
			getReturnValues().clear();
			return;
		case ActivitiesPackage.ACTIVITY_FINAL_NODE__SUCCESS:
			setSuccess(SUCCESS_EDEFAULT);
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
		case ActivitiesPackage.ACTIVITY_FINAL_NODE__RETURN_VALUE:
			return basicGetReturnValue() != null;
		case ActivitiesPackage.ACTIVITY_FINAL_NODE__RETURN_VALUES:
			return returnValues != null && !returnValues.isEmpty();
		case ActivitiesPackage.ACTIVITY_FINAL_NODE__SUCCESS:
			return success != SUCCESS_EDEFAULT;
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
		result.append(" (success: ");
		result.append(success);
		result.append(')');
		return result.toString();
	}

} //ActivityFinalNodeImpl
