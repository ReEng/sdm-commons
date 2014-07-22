package org.storydriven.storydiagrams.interpreter.facade;

import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.TextualExpression;

import de.mdelab.sdm.interpreter.core.facade.IExpressionFacade;

public class StoryDrivenExpressionFacade implements IExpressionFacade<Expression>
{

	@Override
	public String getExpressionLanguage(Expression expression)
	{
		assert expression != null;

		if (expression instanceof TextualExpression)
		{
			return ((TextualExpression) expression).getLanguage();
		}
		else
		{
			// TODO
			return "Calls";
		}
	}

	@Override
	public String getExpressionLanguageVersion(Expression expression)
	{
		assert expression != null;

		if (expression instanceof TextualExpression)
		{
			return ((TextualExpression) expression).getLanguageVersion();
		}
		else
		{
			// TODO
			return "1.0";
		}
	}

	@Override
	public String getExpressionString(Expression expression)
	{
		assert expression != null;

		if (expression instanceof TextualExpression)
		{
			return ((TextualExpression) expression).getExpressionText();
		}
		else
		{
			return expression.toString();
		}
	}

	@Override
	public Object getExpressionAST(Expression expression)
	{
		return null;
	}

	@Override
	public void setExpressionAST(Expression expression, Object expressionAST)
	{
		// Do nothing
	}

}
