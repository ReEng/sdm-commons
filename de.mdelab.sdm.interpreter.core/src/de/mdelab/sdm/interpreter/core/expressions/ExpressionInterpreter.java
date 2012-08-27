package de.mdelab.sdm.interpreter.core.expressions;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.variables.Variable;
import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

/**
 * Superclass of all expression interpreters. An expression interpreter executes
 * expressions of a language, e.g., OCL.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <Expression>
 * @param <Classifier>
 */
public abstract class ExpressionInterpreter<Expression, Classifier>
{
	private ExpressionInterpreterManager<?, ?, ?, ?, ?, ?, Classifier, ?, Expression>	expressionInterpreterManager;

	public void setExpressionInterpreterManager(
			ExpressionInterpreterManager<?, ?, ?, ?, ?, ?, Classifier, ?, Expression> expressionInterpreterManager)
	{
		this.expressionInterpreterManager = expressionInterpreterManager;
	}

	public ExpressionInterpreterManager<?, ?, ?, ?, ?, ?, Classifier, ?, Expression> getExpressionInterpreterManager()
	{
		return this.expressionInterpreterManager;
	}

	/**
	 * Evaluate an expression.
	 * 
	 * @param expression
	 *            The expression to evaluate.
	 * @param contextClassifier
	 *            The classifier of the context or null if there is no context.
	 * @param contextInstance
	 *            The context instance or null if there is no context.
	 * @param variablesScope
	 *            The variable scope, which contains the available variables.
	 * @return A Variable object containing the classifier and value of the
	 *         expression result.
	 * @throws SDMException
	 */
	public abstract Variable<Classifier> evaluateExpression(Expression expression, Classifier contextClassifier, Object contextInstance,
			VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, Expression> variablesScope) throws SDMException;
}
