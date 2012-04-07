/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.activities.expressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.storydriven.storydiagrams.activities.expressions.ActivitiesExpressionsFactory;
import org.storydriven.storydiagrams.activities.expressions.ActivitiesExpressionsPackage;
import org.storydriven.storydiagrams.activities.expressions.ExceptionVariableExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivitiesExpressionsFactoryImpl extends EFactoryImpl implements ActivitiesExpressionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivitiesExpressionsFactory init() {
		try {
			ActivitiesExpressionsFactory theActivitiesExpressionsFactory = (ActivitiesExpressionsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www..storydriven.org/storydiagrams/activities/expressions/0.1.0"); 
			if (theActivitiesExpressionsFactory != null) {
				return theActivitiesExpressionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActivitiesExpressionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitiesExpressionsFactoryImpl() {
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
			case ActivitiesExpressionsPackage.EXCEPTION_VARIABLE_EXPRESSION: return createExceptionVariableExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionVariableExpression createExceptionVariableExpression() {
		ExceptionVariableExpressionImpl exceptionVariableExpression = new ExceptionVariableExpressionImpl();
		return exceptionVariableExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitiesExpressionsPackage getActivitiesExpressionsPackage() {
		return (ActivitiesExpressionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActivitiesExpressionsPackage getPackage() {
		return ActivitiesExpressionsPackage.eINSTANCE;
	}

} //ActivitiesExpressionsFactoryImpl
