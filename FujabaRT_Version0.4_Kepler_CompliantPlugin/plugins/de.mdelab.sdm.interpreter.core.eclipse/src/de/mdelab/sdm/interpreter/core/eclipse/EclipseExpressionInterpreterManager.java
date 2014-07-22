package de.mdelab.sdm.interpreter.core.eclipse;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.expressions.ExpressionInterpreter;
import de.mdelab.sdm.interpreter.core.expressions.ExpressionInterpreterManager;
import de.mdelab.sdm.interpreter.core.facade.MetamodelFacadeFactory;
import de.mdelab.sdm.interpreter.core.notifications.NotificationEmitter;

/**
 * A subclass of ExpressionInterpreterManager which provides an extension point
 * that can be used by expression interpreters to register with the manager. An
 * explicit registration of expression interpreters is unnecessary.
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
public class EclipseExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>
		extends
		ExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression>
{
	/*
	 * ID of the expression interpreter extension point
	 */
	public static final String	EXPRESSION_INTERPRETERS_EXTENSION_POINT_ID	= "de.mdelab.sdm.interpreter.core.eclipse.expressionInterpreterExtension";

	/*
	 * name of the expression language attribute of the expression interpreter
	 * extension point
	 */
	public static final String	EXPRESSION_LANGUAGE_ATTRIBUTE_NAME			= "expressionLanguage";

	/*
	 * name of the expression language version attribute of the expression
	 * interpreter extension point
	 */
	public static final String	EXPRESSION_LANGUAGE_VERSION_ATTRIBUTE_NAME	= "expressionLanguageVersion";

	/*
	 * name of the expression interpreter class attribute of the expression
	 * interpreter extension point
	 */
	public static final String	EXPRESSION_INTERPRETER_CLASS_ATTRIBUTE_NAME	= "expressionInterpreterClass";

	public EclipseExpressionInterpreterManager(
			MetamodelFacadeFactory<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> facadeFactory,
			ClassLoader classLoader,
			NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> notificationEmitter)
			throws SDMException
	{
		super(facadeFactory, classLoader, notificationEmitter);

		/*
		 * Discover available expression interpreters
		 */
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] configurationElements = registry.getConfigurationElementsFor(EXPRESSION_INTERPRETERS_EXTENSION_POINT_ID);

		for (IConfigurationElement configElement : configurationElements)
		{
			String expressionLanguage = configElement.getAttribute(EXPRESSION_LANGUAGE_ATTRIBUTE_NAME);

			String expressionLanguageVersion = configElement.getAttribute(EXPRESSION_LANGUAGE_VERSION_ATTRIBUTE_NAME);

			/*
			 * Create the expression interpreter and register it.
			 */
			try
			{
				@SuppressWarnings("unchecked")
				ExpressionInterpreter<Expression, Classifier> expressionInterpreter = (ExpressionInterpreter<Expression, Classifier>) configElement
						.createExecutableExtension(EXPRESSION_INTERPRETER_CLASS_ATTRIBUTE_NAME);

				this.registerExpressionInterpreter(expressionInterpreter, expressionLanguage, expressionLanguageVersion);

			}
			catch (CoreException e)
			{
				e.printStackTrace();

				throw new SDMException("Could not instantiate expression interpreter for language '" + expressionLanguage + "' version '"
						+ expressionLanguageVersion + "'.", e);
			}

		}
	}

}
