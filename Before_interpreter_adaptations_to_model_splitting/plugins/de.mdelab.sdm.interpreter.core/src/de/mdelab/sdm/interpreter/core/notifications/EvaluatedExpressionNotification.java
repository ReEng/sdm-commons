package de.mdelab.sdm.interpreter.core.notifications;

import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

/**
 * An expression has been evaluated.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <Classifier>
 * @param <Expression>
 */
public class EvaluatedExpressionNotification<Classifier, Expression> extends InterpreterNotification<Classifier>
{
	private final Expression	expression;

	private final Object		result;

	public EvaluatedExpressionNotification(VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, Expression> variablesScope,
			Notifier<?, ?, ?, ?, ?, ?, Classifier, ?, Expression> notifier, Expression expression, Object result)
	{
		super(variablesScope, notifier);

		assert expression != null;

		this.expression = expression;
		this.result = result;
	}

	public Expression getExpression()
	{
		return this.expression;
	}

	public Object getResult()
	{
		return this.result;
	}

	@Override
	public Object getMainStoryDiagramElement()
	{
		return this.getExpression();
	}

	@Override
	public NotificationTypeEnum getNotificationType()
	{
		return NotificationTypeEnum.EVALUATED_EXPRESSION;
	}

}
