package de.mdelab.sdm.interpreter.core.facade;

/**
 * This facade provides access to properties of expressions.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <Expression>
 */
public interface IExpressionFacade<Expression>
{
	String getExpressionLanguage(Expression expression);

	String getExpressionLanguageVersion(Expression expression);

	String getExpressionString(Expression expression);

	Object getExpressionAST(Expression expression);

	void setExpressionAST(Expression expression, Object expressionAST);
}
