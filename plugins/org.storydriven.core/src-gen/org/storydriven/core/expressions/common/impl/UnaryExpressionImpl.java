/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.core.expressions.common.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.common.CommonExpressionsPackage;
import org.storydriven.core.expressions.common.UnaryExpression;
import org.storydriven.core.expressions.impl.ExpressionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.core.expressions.common.impl.UnaryExpressionImpl#getEnclosedExpression <em>Enclosed Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnaryExpressionImpl extends ExpressionImpl implements UnaryExpression {
	/**
	 * The cached value of the '{@link #getEnclosedExpression() <em>Enclosed Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosedExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression enclosedExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonExpressionsPackage.Literals.UNARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getEnclosedExpression() {
		if (enclosedExpression != null && enclosedExpression.eIsProxy()) {
			InternalEObject oldEnclosedExpression = (InternalEObject) enclosedExpression;
			enclosedExpression = (Expression) eResolveProxy(oldEnclosedExpression);
			if (enclosedExpression != oldEnclosedExpression) {
				InternalEObject newEnclosedExpression = (InternalEObject) enclosedExpression;
				NotificationChain msgs = oldEnclosedExpression.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CommonExpressionsPackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION, null, null);
				if (newEnclosedExpression.eInternalContainer() == null) {
					msgs = newEnclosedExpression.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- CommonExpressionsPackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CommonExpressionsPackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION, oldEnclosedExpression,
							enclosedExpression));
			}
		}
		return enclosedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetEnclosedExpression() {
		return enclosedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnclosedExpression(Expression newEnclosedExpression, NotificationChain msgs) {
		Expression oldEnclosedExpression = enclosedExpression;
		enclosedExpression = newEnclosedExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CommonExpressionsPackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION, oldEnclosedExpression,
					newEnclosedExpression);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosedExpression(Expression newEnclosedExpression) {
		if (newEnclosedExpression != enclosedExpression) {
			NotificationChain msgs = null;
			if (enclosedExpression != null)
				msgs = ((InternalEObject) enclosedExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CommonExpressionsPackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION, null, msgs);
			if (newEnclosedExpression != null)
				msgs = ((InternalEObject) newEnclosedExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CommonExpressionsPackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION, null, msgs);
			msgs = basicSetEnclosedExpression(newEnclosedExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CommonExpressionsPackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION, newEnclosedExpression,
					newEnclosedExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CommonExpressionsPackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION:
			return basicSetEnclosedExpression(null, msgs);
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
		case CommonExpressionsPackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION:
			if (resolve)
				return getEnclosedExpression();
			return basicGetEnclosedExpression();
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
		case CommonExpressionsPackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION:
			setEnclosedExpression((Expression) newValue);
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
		case CommonExpressionsPackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION:
			setEnclosedExpression((Expression) null);
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
		case CommonExpressionsPackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION:
			return enclosedExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //UnaryExpressionImpl
