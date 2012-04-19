package org.storydriven.storydiagrams.interpreter.patternmatcher;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.interpreter.facade.StoryDrivenMetamodelFacadeFactory;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.ContainmentRelation;
import org.storydriven.storydiagrams.patterns.LinkVariable;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.Path;
import org.storydriven.storydiagrams.patterns.PatternsPackage;
import org.storydriven.storydiagrams.patterns.StoryPattern;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.expressions.ExpressionInterpreterManager;
import de.mdelab.sdm.interpreter.core.facade.MetamodelFacadeFactory;
import de.mdelab.sdm.interpreter.core.notifications.NotificationEmitter;
import de.mdelab.sdm.interpreter.core.patternmatcher.MatchingStrategy;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.DefaultMatchingStrategy;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.PatternPart;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.PatternPartBasedMatcher;
import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

public class StoryDrivenPatternMatcher
		extends
		PatternPartBasedMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>
{

	public StoryDrivenPatternMatcher(
			StoryPattern storyPattern,
			VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> variablesScope,
			ExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> expressionInterpreterManager,
			NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> notificationEmitter)
			throws SDMException
	{
		this(
				storyPattern,
				variablesScope,
				new DefaultMatchingStrategy<StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>(
						StoryDrivenMetamodelFacadeFactory.INSTANCE), StoryDrivenMetamodelFacadeFactory.INSTANCE,
				expressionInterpreterManager, notificationEmitter);
	}

	public StoryDrivenPatternMatcher(
			StoryPattern storyPattern,
			VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> variablesScope,
			MatchingStrategy<StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> matchingStrategy,
			MetamodelFacadeFactory<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> facadeFactory,
			ExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> expressionInterpreterManager,
			NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> notificationEmitter)
			throws SDMException
	{
		super(storyPattern, variablesScope, matchingStrategy, facadeFactory, expressionInterpreterManager, notificationEmitter);
	}

	@Override
	protected Collection<PatternPart<AbstractVariable, AbstractLinkVariable, EClassifier, Expression>> createPatternParts()
	{
		List<AbstractLinkVariable> storyPatternLinks = new LinkedList<AbstractLinkVariable>(getStoryPattern().getLinkVariables());
		Collection<PatternPart<AbstractVariable, AbstractLinkVariable, EClassifier, Expression>> patternParts = new HashSet<PatternPart<AbstractVariable, AbstractLinkVariable, EClassifier, Expression>>();

		/*
		 * Create pattern parts for story pattern links and objects connected to
		 * links
		 */
		while (!storyPatternLinks.isEmpty())
		{
			AbstractLinkVariable link = storyPatternLinks.remove(0);

			EClass linkEClass = link.eClass();

			StoryDrivenPatternPart<AbstractVariable, ? extends AbstractLinkVariable> part = null;

			if (linkEClass == PatternsPackage.Literals.LINK_VARIABLE)
			{
				part = new StoryDrivenLinkVariablePatternPart(this, (LinkVariable) link);
			}
			else if (linkEClass == PatternsPackage.Literals.CONTAINMENT_RELATION)
			{
				part = new StoryDrivenContainmentRelationPatternPart(this, (ContainmentRelation) link);
			}
			else if (linkEClass == PatternsPackage.Literals.PATH)
			{
				part = new StoryDrivenPathPatternPart(this, (Path) link);
			}
			else
			{
				throw new UnsupportedOperationException();
			}

			assert part != null;

			patternParts.add(part);
		}

		/*
		 * Create pattern parts for objects that are not connected to any links.
		 */
		for (AbstractVariable var : getStoryPattern().getVariables())
		{
			if (var.getIncomingLinks().isEmpty()
					&& (!(var instanceof ObjectVariable) || ((ObjectVariable) var).getOutgoingLinks().isEmpty()))
			{
				StoryDrivenVariableOnlyPatternPart part = new StoryDrivenVariableOnlyPatternPart(this, var);

				patternParts.add(part);
			}
		}

		return patternParts;
	}

}
