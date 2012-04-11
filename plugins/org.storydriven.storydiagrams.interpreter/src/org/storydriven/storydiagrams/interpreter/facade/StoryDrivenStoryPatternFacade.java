package org.storydriven.storydiagrams.interpreter.facade;

import java.util.ArrayList;
import java.util.Collection;

import org.storydriven.modeling.activities.StoryNode;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.Constraint;
import org.storydriven.modeling.patterns.StoryPattern;

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
