package org.storydriven.storydiagrams.interpreter;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.interpreter.facade.StoryDrivenMetamodelFacadeFactory;
import org.storydriven.storydiagrams.interpreter.patternmatcher.StoryDrivenPatternMatcher;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.StoryPattern;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.SDMInterpreter;
import de.mdelab.sdm.interpreter.core.expressions.ExpressionInterpreterManager;
import de.mdelab.sdm.interpreter.core.notifications.NotificationEmitter;
import de.mdelab.sdm.interpreter.core.patternmatcher.StoryPatternMatcher;
import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

public class StoryDrivenInterpreter
		extends
		SDMInterpreter<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>
{

	public StoryDrivenInterpreter(
			ExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> expressionInterpreterManager)
	{
		this(expressionInterpreterManager, null);
	}

	public StoryDrivenInterpreter(
			ExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> expressionInterpreterManager,
			NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> notificationEmitter)
	{
		super(StoryDrivenMetamodelFacadeFactory.INSTANCE, expressionInterpreterManager, notificationEmitter);
	}

	@Override
	protected StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> createStoryPatternMatcher(
			StoryPattern storyPattern,
			VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> variablesScope)
			throws SDMException
	{
		return new StoryDrivenPatternMatcher(storyPattern, variablesScope, getExpressionInterpreterManager(), getNotificationEmitter());
	}

}
