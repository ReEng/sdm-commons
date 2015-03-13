package de.mdelab.sdm.interpreter.core.facade;

import java.util.Collection;
import java.util.Map;

/**
 * This facade provides access to properties of story pattern objects.
 * 
 * @author stephan
 * 
 * @param <StoryPatternObject>
 * @param <StoryPatternLink>
 * @param <Classifier>
 * @param <Feature>
 * @param <Expression>
 */
public interface IStoryPatternObjectFacade<StoryPatternObject, StoryPatternLink, Classifier, Feature, Expression> extends IMetamodelFacade
{
	String getName(StoryPatternObject spo);

	Classifier getClassifier(StoryPatternObject spo);

	boolean isBound(StoryPatternObject spo);

	/**
	 * Returns whether the story pattern object may be bound. When the story
	 * pattern is executed and a variable with the name of the story pattern
	 * object already exists, this variable is reused and no new match is
	 * sought. Otherwise, a new match is sought for the story pattern object.
	 * 
	 * @param spo
	 * @return
	 */
	boolean isMaybeBound(StoryPatternObject spo);

	boolean isCreate(StoryPatternObject spo);

	boolean isDestroy(StoryPatternObject spo);

	boolean isOptional(StoryPatternObject spo);

	Map<Feature, Expression> getAttributeAssignments(StoryPatternObject spo);

	/**
	 * Return the expression that immediately assigns a value to the story
	 * pattern object or null if there is no such expression.
	 * 
	 * @param spo
	 * @return
	 */
	Expression getAssignmentExpression(StoryPatternObject spo);

	Collection<Expression> getConstraints(StoryPatternObject spo);
}
