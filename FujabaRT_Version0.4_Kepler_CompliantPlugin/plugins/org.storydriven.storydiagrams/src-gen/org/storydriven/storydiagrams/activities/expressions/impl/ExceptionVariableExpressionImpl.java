/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.activities.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.core.expressions.impl.ExpressionImpl;
import org.storydriven.storydiagrams.activities.ExceptionVariable;
import org.storydriven.storydiagrams.activities.expressions.ActivitiesExpressionsPackage;
import org.storydriven.storydiagrams.activities.expressions.ExceptionVariableExpression;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Exception Variable Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.activities.expressions.impl.ExceptionVariableExpressionImpl#getExceptionVariable <em>Exception Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExceptionVariableExpressionImpl extends ExpressionImpl implements
		ExceptionVariableExpression {
	/**
	 * The cached value of the '{@link #getExceptionVariable() <em>Exception Variable</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getExceptionVariable()
	 * @generated
	 * @ordered
	 */
	protected ExceptionVariable exceptionVariable;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionVariableExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitiesExpressionsPackage.Literals.EXCEPTION_VARIABLE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionVariable getExceptionVariable() {
		if (exceptionVariable != null && exceptionVariable.eIsProxy()) {
			InternalEObject oldExceptionVariable = (InternalEObject) exceptionVariable;
			exceptionVariable = (ExceptionVariable) eResolveProxy(oldExceptionVariable);
			if (exceptionVariable != oldExceptionVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							ActivitiesExpressionsPackage.EXCEPTION_VARIABLE_EXPRESSION__EXCEPTION_VARIABLE,
							oldExceptionVariable, exceptionVariable));
			}
		}
		return exceptionVariable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionVariable basicGetExceptionVariable() {
		return exceptionVariable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionVariable(ExceptionVariable newExceptionVariable) {
		ExceptionVariable oldExceptionVariable = exceptionVariable;
		exceptionVariable = newExceptionVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					ActivitiesExpressionsPackage.EXCEPTION_VARIABLE_EXPRESSION__EXCEPTION_VARIABLE,
					oldExceptionVariable, exceptionVariable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ActivitiesExpressionsPackage.EXCEPTION_VARIABLE_EXPRESSION__EXCEPTION_VARIABLE:
			if (resolve)
				return getExceptionVariable();
			return basicGetExceptionVariable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ActivitiesExpressionsPackage.EXCEPTION_VARIABLE_EXPRESSION__EXCEPTION_VARIABLE:
			setExceptionVariable((ExceptionVariable) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ActivitiesExpressionsPackage.EXCEPTION_VARIABLE_EXPRESSION__EXCEPTION_VARIABLE:
			setExceptionVariable((ExceptionVariable) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ActivitiesExpressionsPackage.EXCEPTION_VARIABLE_EXPRESSION__EXCEPTION_VARIABLE:
			return exceptionVariable != null;
		}
		return super.eIsSet(featureID);
	}

} // ExceptionVariableExpressionImpl
