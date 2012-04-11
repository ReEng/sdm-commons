package org.storydriven.modeling.interpreter.facade;

import java.util.ArrayList;
import java.util.Collection;

import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.activities.StoryNode;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.Constraint;
import org.storydriven.storydiagrams.patterns.StoryPattern;

import de.mdelab.sdm.interpreter.core.facade.IStoryPatternFacade;

public class StoryDrivenStoryPatternFacade implements IStoryPatternFacade<StoryPattern, AbstractVariable, AbstractLinkVariable, Expression>
{

	@Override
	public Collection<AbstractVariable> getStoryPatternObjects(StoryPattern sp)
	{
		assert sp != null;

		return sp.getVariables();
	}

	@Override
	public String getName(StoryPattern sp)
	{
		assert sp != null;

		if (sp.eContainer() instanceof StoryNode)
		{
			return ((StoryNode) sp.eContainer()).getName();
		}

		return null;
	}

	@Override
	public Collection<Expression> getConstraints(StoryPattern sp)
	{
		assert sp != null;

		Collection<Expression> constraints = new ArrayList<Expression>(sp.getConstraints().size());

		for (Constraint constraint : sp.getConstraints())
		{
			constraints.add(constraint.getConstraintExpression());
		}

		return constraints;
	}

}
