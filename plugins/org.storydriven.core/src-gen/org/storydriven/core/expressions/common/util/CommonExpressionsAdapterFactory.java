/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.core.expressions.common.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.storydriven.core.expressions.common.CommonExpressionsPackage
 * @generated
 */
public class CommonExpressionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommonExpressionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonExpressionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CommonExpressionsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonExpressionsSwitch<Adapter> modelSwitch = new CommonExpressionsSwitch<Adapter>() {
		@Override
		public Adapter caseUnaryExpression(UnaryExpression object) {
			return createUnaryExpressionAdapter();
		}

		@Override
		public Adapter caseBinaryExpression(BinaryExpression object) {
			return createBinaryExpressionAdapter();
		}

		@Override
		public Adapter caseComparisonExpression(ComparisonExpression object) {
			return createComparisonExpressionAdapter();
		}

		@Override
		public Adapter caseArithmeticExpression(ArithmeticExpression object) {
			return createArithmeticExpressionAdapter();
		}

		@Override
		public Adapter caseLogicExpression(LogicExpression object) {
			return createLogicExpressionAdapter();
		}

		@Override
		public Adapter caseLiteralExpression(LiteralExpression object) {
			return createLiteralExpressionAdapter();
		}

		@Override
		public Adapter caseBooleanLiteralExpression(BooleanLiteralExpression object) {
			return createBooleanLiteralExpressionAdapter();
		}

		@Override
		public Adapter caseIntegerLiteralExpression(IntegerLiteralExpression object) {
			return createIntegerLiteralExpressionAdapter();
		}

		@Override
		public Adapter caseDoubleLiteralExpression(DoubleLiteralExpression object) {
			return createDoubleLiteralExpressionAdapter();
		}

		@Override
		public Adapter caseStringLiteralExpression(StringLiteralExpression object) {
			return createStringLiteralExpressionAdapter();
		}

		@Override
		public Adapter caseExtendableElement(ExtendableElement object) {
			return createExtendableElementAdapter();
		}

		@Override
		public Adapter caseCommentableElement(CommentableElement object) {
			return createCommentableElementAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.expressions.common.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.expressions.common.UnaryExpression
	 * @generated
	 */
	public Adapter createUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.expressions.common.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.expressions.common.BinaryExpression
	 * @generated
	 */
	public Adapter createBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.expressions.common.ComparisonExpression <em>Comparison Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.expressions.common.ComparisonExpression
	 * @generated
	 */
	public Adapter createComparisonExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.expressions.common.ArithmeticExpression <em>Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.expressions.common.ArithmeticExpression
	 * @generated
	 */
	public Adapter createArithmeticExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.expressions.common.LogicExpression <em>Logic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.expressions.common.LogicExpression
	 * @generated
	 */
	public Adapter createLogicExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.expressions.common.LiteralExpression <em>Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.expressions.common.LiteralExpression
	 * @generated
	 */
	public Adapter createLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.expressions.common.BooleanLiteralExpression <em>Boolean Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.expressions.common.BooleanLiteralExpression
	 * @generated
	 */
	public Adapter createBooleanLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.expressions.common.IntegerLiteralExpression <em>Integer Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.expressions.common.IntegerLiteralExpression
	 * @generated
	 */
	public Adapter createIntegerLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.expressions.common.DoubleLiteralExpression <em>Double Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.expressions.common.DoubleLiteralExpression
	 * @generated
	 */
	public Adapter createDoubleLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.expressions.common.StringLiteralExpression <em>String Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.expressions.common.StringLiteralExpression
	 * @generated
	 */
	public Adapter createStringLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.ExtendableElement <em>Extendable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.ExtendableElement
	 * @generated
	 */
	public Adapter createExtendableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.CommentableElement <em>Commentable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.CommentableElement
	 * @generated
	 */
	public Adapter createCommentableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.expressions.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.expressions.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CommonExpressionsAdapterFactory
