/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.core.expressions.common.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.common.ArithmeticExpression;
import org.storydriven.core.expressions.common.BinaryExpression;
import org.storydriven.core.expressions.common.BooleanLiteralExpression;
import org.storydriven.core.expressions.common.CommonExpressionsPackage;
import org.storydriven.core.expressions.common.ComparisonExpression;
import org.storydriven.core.expressions.common.DoubleLiteralExpression;
import org.storydriven.core.expressions.common.IntegerLiteralExpression;
import org.storydriven.core.expressions.common.LiteralExpression;
import org.storydriven.core.expressions.common.LogicExpression;
import org.storydriven.core.expressions.common.StringLiteralExpression;
import org.storydriven.core.expressions.common.UnaryExpression;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.storydriven.core.expressions.common.CommonExpressionsPackage
 * @generated
 */
public class CommonExpressionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommonExpressionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonExpressionsSwitch() {
		if (modelPackage == null) {
			modelPackage = CommonExpressionsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case CommonExpressionsPackage.UNARY_EXPRESSION: {
			UnaryExpression unaryExpression = (UnaryExpression) theEObject;
			T result = caseUnaryExpression(unaryExpression);
			if (result == null)
				result = caseExpression(unaryExpression);
			if (result == null)
				result = caseCommentableElement(unaryExpression);
			if (result == null)
				result = caseExtendableElement(unaryExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CommonExpressionsPackage.BINARY_EXPRESSION: {
			BinaryExpression binaryExpression = (BinaryExpression) theEObject;
			T result = caseBinaryExpression(binaryExpression);
			if (result == null)
				result = caseExpression(binaryExpression);
			if (result == null)
				result = caseCommentableElement(binaryExpression);
			if (result == null)
				result = caseExtendableElement(binaryExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CommonExpressionsPackage.COMPARISON_EXPRESSION: {
			ComparisonExpression comparisonExpression = (ComparisonExpression) theEObject;
			T result = caseComparisonExpression(comparisonExpression);
			if (result == null)
				result = caseBinaryExpression(comparisonExpression);
			if (result == null)
				result = caseExpression(comparisonExpression);
			if (result == null)
				result = caseCommentableElement(comparisonExpression);
			if (result == null)
				result = caseExtendableElement(comparisonExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CommonExpressionsPackage.ARITHMETIC_EXPRESSION: {
			ArithmeticExpression arithmeticExpression = (ArithmeticExpression) theEObject;
			T result = caseArithmeticExpression(arithmeticExpression);
			if (result == null)
				result = caseBinaryExpression(arithmeticExpression);
			if (result == null)
				result = caseExpression(arithmeticExpression);
			if (result == null)
				result = caseCommentableElement(arithmeticExpression);
			if (result == null)
				result = caseExtendableElement(arithmeticExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CommonExpressionsPackage.LOGIC_EXPRESSION: {
			LogicExpression logicExpression = (LogicExpression) theEObject;
			T result = caseLogicExpression(logicExpression);
			if (result == null)
				result = caseBinaryExpression(logicExpression);
			if (result == null)
				result = caseExpression(logicExpression);
			if (result == null)
				result = caseCommentableElement(logicExpression);
			if (result == null)
				result = caseExtendableElement(logicExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CommonExpressionsPackage.LITERAL_EXPRESSION: {
			LiteralExpression literalExpression = (LiteralExpression) theEObject;
			T result = caseLiteralExpression(literalExpression);
			if (result == null)
				result = caseExpression(literalExpression);
			if (result == null)
				result = caseCommentableElement(literalExpression);
			if (result == null)
				result = caseExtendableElement(literalExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CommonExpressionsPackage.BOOLEAN_LITERAL_EXPRESSION: {
			BooleanLiteralExpression booleanLiteralExpression = (BooleanLiteralExpression) theEObject;
			T result = caseBooleanLiteralExpression(booleanLiteralExpression);
			if (result == null)
				result = caseLiteralExpression(booleanLiteralExpression);
			if (result == null)
				result = caseExpression(booleanLiteralExpression);
			if (result == null)
				result = caseCommentableElement(booleanLiteralExpression);
			if (result == null)
				result = caseExtendableElement(booleanLiteralExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CommonExpressionsPackage.INTEGER_LITERAL_EXPRESSION: {
			IntegerLiteralExpression integerLiteralExpression = (IntegerLiteralExpression) theEObject;
			T result = caseIntegerLiteralExpression(integerLiteralExpression);
			if (result == null)
				result = caseLiteralExpression(integerLiteralExpression);
			if (result == null)
				result = caseExpression(integerLiteralExpression);
			if (result == null)
				result = caseCommentableElement(integerLiteralExpression);
			if (result == null)
				result = caseExtendableElement(integerLiteralExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CommonExpressionsPackage.DOUBLE_LITERAL_EXPRESSION: {
			DoubleLiteralExpression doubleLiteralExpression = (DoubleLiteralExpression) theEObject;
			T result = caseDoubleLiteralExpression(doubleLiteralExpression);
			if (result == null)
				result = caseLiteralExpression(doubleLiteralExpression);
			if (result == null)
				result = caseExpression(doubleLiteralExpression);
			if (result == null)
				result = caseCommentableElement(doubleLiteralExpression);
			if (result == null)
				result = caseExtendableElement(doubleLiteralExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CommonExpressionsPackage.STRING_LITERAL_EXPRESSION: {
			StringLiteralExpression stringLiteralExpression = (StringLiteralExpression) theEObject;
			T result = caseStringLiteralExpression(stringLiteralExpression);
			if (result == null)
				result = caseLiteralExpression(stringLiteralExpression);
			if (result == null)
				result = caseExpression(stringLiteralExpression);
			if (result == null)
				result = caseCommentableElement(stringLiteralExpression);
			if (result == null)
				result = caseExtendableElement(stringLiteralExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpression(UnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpression(BinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonExpression(ComparisonExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticExpression(ArithmeticExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicExpression(LogicExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralExpression(LiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteralExpression(BooleanLiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerLiteralExpression(IntegerLiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleLiteralExpression(DoubleLiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLiteralExpression(StringLiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendableElement(ExtendableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentableElement(CommentableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CommonExpressionsSwitch
