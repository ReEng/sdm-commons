package org.storydriven.storydiagrams.interpreter.facade;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.StoryPattern;

import de.mdelab.sdm.interpreter.core.facade.IActivityEdgeFacade;
import de.mdelab.sdm.interpreter.core.facade.IActivityFacade;
import de.mdelab.sdm.interpreter.core.facade.IClassifierFacade;
import de.mdelab.sdm.interpreter.core.facade.IDecisionNodeFacade;
import de.mdelab.sdm.interpreter.core.facade.IExpressionFacade;
import de.mdelab.sdm.interpreter.core.facade.IExpressionNodeFacade;
import de.mdelab.sdm.interpreter.core.facade.IFeatureFacade;
import de.mdelab.sdm.interpreter.core.facade.IFinalNodeFacade;
import de.mdelab.sdm.interpreter.core.facade.IInstanceFacade;
import de.mdelab.sdm.interpreter.core.facade.IStoryNodeFacade;
import de.mdelab.sdm.interpreter.core.facade.IStoryPatternFacade;
import de.mdelab.sdm.interpreter.core.facade.IStoryPatternLinkFacade;
import de.mdelab.sdm.interpreter.core.facade.IStoryPatternObjectFacade;
import de.mdelab.sdm.interpreter.core.facade.IUnspecificActivityNodeFacade;
import de.mdelab.sdm.interpreter.core.facade.MetamodelFacadeFactory;

public class StoryDrivenMetamodelFacadeFactory
		extends
		MetamodelFacadeFactory<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>
{
	public static final StoryDrivenMetamodelFacadeFactory	INSTANCE	= new StoryDrivenMetamodelFacadeFactory();

	@Override
	protected IClassifierFacade<EClassifier> createClassifierFacade()
	{
		return new StoryDrivenClassifierFacade();
	}

	@Override
	protected IFeatureFacade<EStructuralFeature> createFeatureFacade()
	{
		return new StoryDrivenFeatureFacade();
	}

	@Override
	protected IStoryPatternObjectFacade<AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> createStoryPatternObjectFacade()
	{
		return new StoryDrivenObjectVariableFacade();
	}

	@Override
	protected IStoryPatternLinkFacade<AbstractVariable, AbstractLinkVariable, EStructuralFeature> createStoryPatternLinkFacade()
	{
		return new StoryDrivenAbstractLinkVariableFacade();
	}

	@Override
	protected IStoryPatternFacade<StoryPattern, AbstractVariable, AbstractLinkVariable, Expression> createStoryPatternFacade()
	{
		return new StoryDrivenStoryPatternFacade();
	}

	@Override
	protected IInstanceFacade<AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> createInstanceFacade()
	{
		return new StoryDrivenInstanceFacade();
	}

	@Override
	protected IExpressionFacade<Expression> createExpressionFacade()
	{
		return new StoryDrivenExpressionFacade();
	}

	@Override
	protected IActivityFacade<Activity, ActivityNode> createActivityFacade()
	{
		return new StoryDrivenActivityFacade();
	}

	@Override
	protected IUnspecificActivityNodeFacade<ActivityNode, ActivityEdge> createUnspecificActivityNodeFacade()
	{
		return new StoryDrivenUnspecificActivityNodeFacade();
	}

	@Override
	protected IStoryNodeFacade<ActivityNode, ActivityEdge, StoryPattern> createStoryNodeFacade()
	{
		return new StoryDrivenStoryNodeFacade();
	}

	@Override
	protected IExpressionNodeFacade<ActivityNode, ActivityEdge, Expression> createExpressionNodeFacade()
	{
		return new StoryDrivenStatementNodeFacade();
	}

	@Override
	protected IDecisionNodeFacade<ActivityNode, ActivityEdge, Expression> createDecisionNodeFacade()
	{
		return new StoryDrivenJunctionNodeFacade();
	}

	@Override
	protected IFinalNodeFacade<ActivityNode, Expression> createFinalNodeFacade()
	{
		return new StoryDrivenActivityFinalNodeFacade();
	}

	@Override
	protected IActivityEdgeFacade<ActivityNode, ActivityEdge> createActivityEdgeFacade()
	{
		return new StoryDrivenActivityEdgeFacade();
	}

}
