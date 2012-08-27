package de.mdelab.sdm.interpreter.core.facade;

import java.util.Collection;

/**
 * This facade provides access to properties of story patterns.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <StoryPattern>
 * @param <StoryPatternObject>
 * @param <StoryPatternLink>
 * @param <Expression>
 */
public interface IStoryPatternFacade<StoryPattern, StoryPatternObject, StoryPatternLink, Expression> extends IMetamodelFacade
{
	/**
	 * Return all story pattern objects of the story pattern.
	 * 
	 * @param sp
	 * @return
	 */
	Collection<StoryPatternObject> getStoryPatternObjects(StoryPattern sp);

	/**
	 * Return the name of the story pattern.
	 * 
	 * @param sp
	 * @return
	 */
	String getName(StoryPattern sp);

	/**
	 * Return all constraints defined on this story pattern.
	 * 
	 * @param sp
	 * @return
	 */
	Collection<Expression> getConstraints(StoryPattern sp);
}
