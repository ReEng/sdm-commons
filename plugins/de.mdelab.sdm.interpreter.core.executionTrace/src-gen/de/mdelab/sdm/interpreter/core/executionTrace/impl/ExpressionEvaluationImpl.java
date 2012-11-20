/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;
import de.mdelab.sdm.interpreter.core.executionTrace.ExpressionEvaluation;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Expression Evaluation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.ExpressionEvaluationImpl#getExpression
 * <em>Expression</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.ExpressionEvaluationImpl#getResult
 * <em>Result</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ExpressionEvaluationImpl<ExpressionType> extends ExecutionImpl implements ExpressionEvaluation<ExpressionType>
{
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected ExpressionType		expression;

	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final String	RESULT_EDEFAULT	= null;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected String				result			= ExpressionEvaluationImpl.RESULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ExpressionEvaluationImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ExecutionTracePackage.Literals.EXPRESSION_EVALUATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public ExpressionType getExpression()
	{
		if ((this.expression != null) && ((EObject) this.expression).eIsProxy())
		{
			final InternalEObject oldExpression = (InternalEObject) this.expression;
			this.expression = (ExpressionType) this.eResolveProxy(oldExpression);
			if (this.expression != oldExpression)
			{
				if (this.eNotificationRequired())
				{
					this.eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutionTracePackage.EXPRESSION_EVALUATION__EXPRESSION,
							oldExpression, this.expression));
				}
			}
		}
		return this.expression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExpressionType basicGetExpression()
	{
		return this.expression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setExpression(final ExpressionType newExpression)
	{
		final ExpressionType oldExpression = this.expression;
		this.expression = newExpression;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET, ExecutionTracePackage.EXPRESSION_EVALUATION__EXPRESSION,
					oldExpression, this.expression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getResult()
	{
		return this.result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setResult(final String newResult)
	{
		final String oldResult = this.result;
		this.result = newResult;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET, ExecutionTracePackage.EXPRESSION_EVALUATION__RESULT, oldResult,
					this.result));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType)
	{
		switch (featureID)
		{
			case ExecutionTracePackage.EXPRESSION_EVALUATION__EXPRESSION:
				if (resolve)
				{
					return this.getExpression();
				}
				return this.basicGetExpression();
			case ExecutionTracePackage.EXPRESSION_EVALUATION__RESULT:
				return this.getResult();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(final int featureID, final Object newValue)
	{
		switch (featureID)
		{
			case ExecutionTracePackage.EXPRESSION_EVALUATION__EXPRESSION:
				this.setExpression((ExpressionType) newValue);
				return;
			case ExecutionTracePackage.EXPRESSION_EVALUATION__RESULT:
				this.setResult((String) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(final int featureID)
	{
		switch (featureID)
		{
			case ExecutionTracePackage.EXPRESSION_EVALUATION__EXPRESSION:
				this.setExpression((ExpressionType) null);
				return;
			case ExecutionTracePackage.EXPRESSION_EVALUATION__RESULT:
				this.setResult(ExpressionEvaluationImpl.RESULT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(final int featureID)
	{
		switch (featureID)
		{
			case ExecutionTracePackage.EXPRESSION_EVALUATION__EXPRESSION:
				return this.expression != null;
			case ExecutionTracePackage.EXPRESSION_EVALUATION__RESULT:
				return ExpressionEvaluationImpl.RESULT_EDEFAULT == null ? this.result != null : !ExpressionEvaluationImpl.RESULT_EDEFAULT
						.equals(this.result);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (this.eIsProxy())
		{
			return super.toString();
		}

		final StringBuffer result = new StringBuffer(super.toString());
		result.append(" (result: ");
		result.append(result);
		result.append(')');
		return result.toString();
	}

} // ExpressionEvaluationImpl
