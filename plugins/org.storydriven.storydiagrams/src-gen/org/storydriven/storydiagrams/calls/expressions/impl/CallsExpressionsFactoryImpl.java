/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.calls.expressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.storydriven.storydiagrams.calls.expressions.*;
import org.storydriven.storydiagrams.calls.expressions.CallsExpressionsFactory;
import org.storydriven.storydiagrams.calls.expressions.CallsExpressionsPackage;
import org.storydriven.storydiagrams.calls.expressions.MethodCallExpression;
import org.storydriven.storydiagrams.calls.expressions.ParameterExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CallsExpressionsFactoryImpl extends EFactoryImpl implements
		CallsExpressionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CallsExpressionsFactory init() {
		try {
			CallsExpressionsFactory theCallsExpressionsFactory = (CallsExpressionsFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.storydriven.org/storydiagrams/calls/expressions/0.2.0");
			if (theCallsExpressionsFactory != null) {
				return theCallsExpressionsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CallsExpressionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallsExpressionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CallsExpressionsPackage.METHOD_CALL_EXPRESSION:
			return createMethodCallExpression();
		case CallsExpressionsPackage.PARAMETER_EXPRESSION:
			return createParameterExpression();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCallExpression createMethodCallExpression() {
		MethodCallExpressionImpl methodCallExpression = new MethodCallExpressionImpl();
		return methodCallExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterExpression createParameterExpression() {
		ParameterExpressionImpl parameterExpression = new ParameterExpressionImpl();
		return parameterExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallsExpressionsPackage getCallsExpressionsPackage() {
		return (CallsExpressionsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CallsExpressionsPackage getPackage() {
		return CallsExpressionsPackage.eINSTANCE;
	}

} //CallsExpressionsFactoryImpl
