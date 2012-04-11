package org.storydriven.modeling.interpreter.facade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.AttributeAssignment;
import org.storydriven.storydiagrams.patterns.BindingOperator;
import org.storydriven.storydiagrams.patterns.BindingSemantics;
import org.storydriven.storydiagrams.patterns.BindingState;
import org.storydriven.storydiagrams.patterns.Constraint;
import org.storydriven.storydiagrams.patterns.ObjectVariable;

import de.mdelab.sdm.interpreter.core.facade.IStoryPatternObjectFacade;

public class StoryDrivenObjectVariableFacade implements
		IStoryPatternObjectFacade<AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>
{

	@Override
	public String getName(AbstractVariable spo)
	{
		assert spo != null;

		return spo.getName();
	}

	@Override
	public EClassifier getClassifier(AbstractVariable spo)
	{
		assert spo != null;

		return spo.getType();
	}

	@Override
	public boolean isBound(AbstractVariable spo)
	{
		assert spo != null;

		return spo.getBindingState() == BindingState.BOUND;
	}

	@Override
	public boolean isMaybeBound(AbstractVariable spo)
	{
		assert spo != null;

		return spo.getBindingState() == BindingState.MAYBE_BOUND;
	}

	@Override
	public boolean isCreate(AbstractVariable spo)
	{
		assert spo != null;

		if (spo instanceof ObjectVariable)
		{
			return ((ObjectVariable) spo).getBindingOperator() == BindingOperator.CREATE;
		}

		return false;
	}

	@Override
	public boolean isDestroy(AbstractVariable spo)
	{
		assert spo != null;

		if (spo instanceof ObjectVariable)
		{
			return ((ObjectVariable) spo).getBindingOperator() == BindingOperator.DESTROY;
		}

		return false;
	}

	@Override
	public boolean isOptional(AbstractVariable spo)
	{
		assert spo != null;

		if (spo instanceof ObjectVariable)
		{
			return ((ObjectVariable) spo).getBindingSemantics() == BindingSemantics.OPTIONAL;
		}

		return false;
	}

	@Override
	public Map<EStructuralFeature, Expression> getAttributeAssignments(AbstractVariable spo)
	{
		assert spo != null;

		if (spo instanceof ObjectVariable)
		{
			ObjectVariable v = (ObjectVariable) spo;

			Map<EStructuralFeature, Expression> map = new HashMap<EStructuralFeature, Expression>();

			for (AttributeAssignment aa : v.getAttributeAssignments())
			{
				map.put(aa.getAttribute(), aa.getValueExpression());
			}

			return map;
		}
		else
		{
			return Collections.emptyMap();
		}
	}

	@Override
	public Expression getAssignmentExpression(AbstractVariable spo)
	{
		assert spo != null;

		return spo.getBindingExpression();
	}

	@Override
	public Collection<Expression> getConstraints(AbstractVariable spo)
	{
		assert spo != null;

		Collection<Expression> constraints = new ArrayList<Expression>(spo.getConstraints().size());

		for (Constraint c : spo.getConstraints())
		{
			constraints.add(c.getConstraintExpression());
		}

		return constraints;
	}

}
