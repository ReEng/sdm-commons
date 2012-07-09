/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.core.expressions.common.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.storydriven.core.expressions.common.*;
import org.storydriven.core.expressions.common.ArithmeticExpression;
import org.storydriven.core.expressions.common.ArithmeticOperator;
import org.storydriven.core.expressions.common.BooleanLiteralExpression;
import org.storydriven.core.expressions.common.CommonExpressionsFactory;
import org.storydriven.core.expressions.common.CommonExpressionsPackage;
import org.storydriven.core.expressions.common.ComparingOperator;
import org.storydriven.core.expressions.common.ComparisonExpression;
import org.storydriven.core.expressions.common.DoubleLiteralExpression;
import org.storydriven.core.expressions.common.IntegerLiteralExpression;
import org.storydriven.core.expressions.common.LogicExpression;
import org.storydriven.core.expressions.common.LogicOperator;
import org.storydriven.core.expressions.common.StringLiteralExpression;
import org.storydriven.core.expressions.common.UnaryExpression;
import org.storydriven.core.expressions.common.UnaryOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonExpressionsFactoryImpl extends EFactoryImpl implements
		CommonExpressionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommonExpressionsFactory init() {
		try {
			CommonExpressionsFactory theCommonExpressionsFactory = (CommonExpressionsFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.storydriven.org/core/expressions/common/0.2.0");
			if (theCommonExpressionsFactory != null) {
				return theCommonExpressionsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommonExpressionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonExpressionsFactoryImpl() {
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
		case CommonExpressionsPackage.UNARY_EXPRESSION:
			return createUnaryExpression();
		case CommonExpressionsPackage.COMPARISON_EXPRESSION:
			return createComparisonExpression();
		case CommonExpressionsPackage.ARITHMETIC_EXPRESSION:
			return createArithmeticExpression();
		case CommonExpressionsPackage.LOGIC_EXPRESSION:
			return createLogicExpression();
		case CommonExpressionsPackage.BOOLEAN_LITERAL_EXPRESSION:
			return createBooleanLiteralExpression();
		case CommonExpressionsPackage.INTEGER_LITERAL_EXPRESSION:
			return createIntegerLiteralExpression();
		case CommonExpressionsPackage.DOUBLE_LITERAL_EXPRESSION:
			return createDoubleLiteralExpression();
		case CommonExpressionsPackage.STRING_LITERAL_EXPRESSION:
			return createStringLiteralExpression();
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
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case CommonExpressionsPackage.LOGIC_OPERATOR:
			return createLogicOperatorFromString(eDataType, initialValue);
		case CommonExpressionsPackage.COMPARING_OPERATOR:
			return createComparingOperatorFromString(eDataType, initialValue);
		case CommonExpressionsPackage.ARITHMETIC_OPERATOR:
			return createArithmeticOperatorFromString(eDataType, initialValue);
		case CommonExpressionsPackage.UNARY_OPERATOR:
			return createUnaryOperatorFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case CommonExpressionsPackage.LOGIC_OPERATOR:
			return convertLogicOperatorToString(eDataType, instanceValue);
		case CommonExpressionsPackage.COMPARING_OPERATOR:
			return convertComparingOperatorToString(eDataType, instanceValue);
		case CommonExpressionsPackage.ARITHMETIC_OPERATOR:
			return convertArithmeticOperatorToString(eDataType, instanceValue);
		case CommonExpressionsPackage.UNARY_OPERATOR:
			return convertUnaryOperatorToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpression createUnaryExpression() {
		UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
		return unaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonExpression createComparisonExpression() {
		ComparisonExpressionImpl comparisonExpression = new ComparisonExpressionImpl();
		return comparisonExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticExpression createArithmeticExpression() {
		ArithmeticExpressionImpl arithmeticExpression = new ArithmeticExpressionImpl();
		return arithmeticExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicExpression createLogicExpression() {
		LogicExpressionImpl logicExpression = new LogicExpressionImpl();
		return logicExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteralExpression createBooleanLiteralExpression() {
		BooleanLiteralExpressionImpl booleanLiteralExpression = new BooleanLiteralExpressionImpl();
		return booleanLiteralExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLiteralExpression createIntegerLiteralExpression() {
		IntegerLiteralExpressionImpl integerLiteralExpression = new IntegerLiteralExpressionImpl();
		return integerLiteralExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleLiteralExpression createDoubleLiteralExpression() {
		DoubleLiteralExpressionImpl doubleLiteralExpression = new DoubleLiteralExpressionImpl();
		return doubleLiteralExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteralExpression createStringLiteralExpression() {
		StringLiteralExpressionImpl stringLiteralExpression = new StringLiteralExpressionImpl();
		return stringLiteralExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicOperator createLogicOperatorFromString(EDataType eDataType,
			String initialValue) {
		LogicOperator result = LogicOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicOperatorToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparingOperator createComparingOperatorFromString(
			EDataType eDataType, String initialValue) {
		ComparingOperator result = ComparingOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparingOperatorToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticOperator createArithmeticOperatorFromString(
			EDataType eDataType, String initialValue) {
		ArithmeticOperator result = ArithmeticOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArithmeticOperatorToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperator createUnaryOperatorFromString(EDataType eDataType,
			String initialValue) {
		UnaryOperator result = UnaryOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnaryOperatorToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonExpressionsPackage getCommonExpressionsPackage() {
		return (CommonExpressionsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommonExpressionsPackage getPackage() {
		return CommonExpressionsPackage.eINSTANCE;
	}

} //CommonExpressionsFactoryImpl
