/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.patterns.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.core.expressions.impl.ExpressionImpl;
import org.storydriven.storydiagrams.patterns.ObjectSetVariable;
import org.storydriven.storydiagrams.patterns.expressions.ObjectSetSizeExpression;
import org.storydriven.storydiagrams.patterns.expressions.PatternsExpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Set Size Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.patterns.expressions.impl.ObjectSetSizeExpressionImpl#getSet <em>Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectSetSizeExpressionImpl extends ExpressionImpl implements ObjectSetSizeExpression {
	/**
	 * The cached value of the '{@link #getSet() <em>Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSet()
	 * @generated
	 * @ordered
	 */
	protected ObjectSetVariable set;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ObjectSetSizeExpressionImpl() {
		super();
		updateGenericType(EcorePackage.Literals.EINT, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsExpressionsPackage.Literals.OBJECT_SET_SIZE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectSetVariable getSet() {
		if (set != null && set.eIsProxy()) {
			InternalEObject oldSet = (InternalEObject) set;
			set = (ObjectSetVariable) eResolveProxy(oldSet);
			if (set != oldSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PatternsExpressionsPackage.OBJECT_SET_SIZE_EXPRESSION__SET, oldSet, set));
			}
		}
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectSetVariable basicGetSet() {
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSet(ObjectSetVariable newSet) {
		ObjectSetVariable oldSet = set;
		set = newSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PatternsExpressionsPackage.OBJECT_SET_SIZE_EXPRESSION__SET, oldSet, set));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PatternsExpressionsPackage.OBJECT_SET_SIZE_EXPRESSION__SET:
			if (resolve)
				return getSet();
			return basicGetSet();
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
		case PatternsExpressionsPackage.OBJECT_SET_SIZE_EXPRESSION__SET:
			setSet((ObjectSetVariable) newValue);
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
		case PatternsExpressionsPackage.OBJECT_SET_SIZE_EXPRESSION__SET:
			setSet((ObjectSetVariable) null);
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
		case PatternsExpressionsPackage.OBJECT_SET_SIZE_EXPRESSION__SET:
			return set != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EClassifier basicGetType() {
		return EcorePackage.Literals.EINT;
	}
} //ObjectSetSizeExpressionImpl
