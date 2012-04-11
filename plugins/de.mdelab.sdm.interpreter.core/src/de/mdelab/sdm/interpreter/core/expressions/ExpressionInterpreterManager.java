package de.mdelab.sdm.interpreter.core.expressions;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.facade.IExpressionFacade;
import de.mdelab.sdm.interpreter.core.facade.MetamodelFacadeFactory;
import de.mdelab.sdm.interpreter.core.notifications.NotificationEmitter;
import de.mdelab.sdm.interpreter.core.notifications.Notifier;
import de.mdelab.sdm.interpreter.core.variables.Variable;
import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

/**
 * The expression interpreter manager manages expression interpreters (duh!).
 * Expression interpreters can be registered for a specific expression language.
 * When expression interpreter manager evaluates an expression, it delegates to
 * the appropriate expression interpreter.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <Activity>
 * @param <ActivityNode>
 * @param <ActivityEdge>
 * @param <StoryPattern>
 * @param <StoryPatternObject>
 * @param <StoryPatternLink>
 * @param <Classifier>
 * @param <Feature>
 * @param <Expression>
 */
public abstract class ExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>
		extends
		Notifier<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>
{
	private final IExpressionFacade<Expression>																														expressionFacade;

	private final Map<String, Map<String, ExpressionInterpreter<Expression, Classifier>>>																			expressionInterpreters;

	private final MetamodelFacadeFactory<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>	facadeFactory;

	/**
	 * The class loader is needed by some expression interpreters to invoke
	 * methods via Java reflection.
	 */
	private final ClassLoader																																		classLoader;

	public ExpressionInterpreterManager(
			MetamodelFacadeFactory<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> facadeFactory,
			ClassLoader classLoader,
			NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> notificationEmitter)
	{
		super(notificationEmitter);

		assert facadeFactory != null;

		this.facadeFactory = facadeFactory;
		this.expressionFacade = facadeFactory.getExpressionFacade();

		this.classLoader = classLoader;

		this.expressionInterpreters = new ConcurrentHashMap<String, Map<String, ExpressionInterpreter<Expression, Classifier>>>();
	}

	public MetamodelFacadeFactory<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> getFacadeFactory()
	{
		return this.facadeFactory;
	}

	public ClassLoader getClassLoader()
	{
		return this.classLoader;
	}

	/**
	 * Evaluate an expression in a certain context. Evaluation is delegated to
	 * the appropriate expression interpreter.
	 * 
	 * @param expression
	 * @param contextClassifier
	 * @param contextInstance
	 * @param variablesScope
	 * @return
	 * @throws SDMException
	 */
	public Variable<Classifier> evaluateExpression(Expression expression, Classifier contextClassifier, Object contextInstance,
			VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, Expression> variablesScope) throws SDMException
	{
		this.getNotificationEmitter().evaluatingExpression(expression, variablesScope, this);

		/*
		 * Get the expression interpreter for that language
		 */
		ExpressionInterpreter<Expression, Classifier> expressionInterpreter = this.getExpressionInterpreter(
				this.expressionFacade.getExpressionLanguage(expression), this.expressionFacade.getExpressionLanguageVersion(expression));

		if (expressionInterpreter == null)
		{
			throw new SDMException("There is no expression interpreter for language '"
					+ this.expressionFacade.getExpressionLanguage(expression) + "' version '"
					+ this.expressionFacade.getExpressionLanguageVersion(expression) + "'.");
		}
		else
		{
			Variable<Classifier> result = expressionInterpreter.evaluateExpression(expression, contextClassifier, contextInstance,
					variablesScope);

			this.getNotificationEmitter().evaluatedExpression(expression, result.getValue(), variablesScope, this);

			return result;
		}
	}

	/**
	 * Register an expression interpreter for the specified expression language.
	 * 
	 * @param expressionInterpreter
	 * @param expressionLanguage
	 * @param expressionLanguageVersion
	 * @throws SDMException
	 */
	public synchronized void registerExpressionInterpreter(ExpressionInterpreter<Expression, Classifier> expressionInterpreter,
			String expressionLanguage, String expressionLanguageVersion) throws SDMException
	{
		Map<String, ExpressionInterpreter<Expression, Classifier>> map = this.expressionInterpreters.get(expressionLanguage);

		if (map == null)
		{
			map = new ConcurrentHashMap<String, ExpressionInterpreter<Expression, Classifier>>();
			this.expressionInterpreters.put(expressionLanguage, map);
		}

		if (map.containsKey(expressionLanguageVersion))
		{
			throw new SDMException("An expression interpreter for expression language '" + expressionLanguage + "' version '"
					+ expressionLanguageVersion + "' is already registered.");
		}
		else
		{
			map.put(expressionLanguageVersion, expressionInterpreter);

			expressionInterpreter.setExpressionInterpreterManager(this);
		}
	}

	/**
	 * Return the expression interpreter for the specified expression language.
	 * 
	 * @param expressionLanguage
	 * @param expressionLanguageVersion
	 * @return
	 */
	protected ExpressionInterpreter<Expression, Classifier> getExpressionInterpreter(String expressionLanguage,
			String expressionLanguageVersion)
	{
		Map<String, ExpressionInterpreter<Expression, Classifier>> map = this.expressionInterpreters.get(expressionLanguage);

		if (map != null)
		{
			return map.get(expressionLanguageVersion);
		}
		else
		{
			return null;
		}
	}
}
