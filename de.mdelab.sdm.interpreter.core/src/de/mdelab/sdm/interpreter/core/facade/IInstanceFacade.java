package de.mdelab.sdm.interpreter.core.facade;

/**
 * This facade provides access to properties of instance objects. Especially it
 * is used to create and destroy objects and links.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <StoryPatternLink>
 * @param <Classifier>
 * @param <Feature>
 * @param <Expression>
 */
public interface IInstanceFacade<StoryPatternLink, Classifier, Feature, Expression> extends IMetamodelFacade
{

	/**
	 * Set the specified attribute of the instance object to the specified
	 * value.
	 * 
	 * @param sourceInstanceObject
	 * @param feature
	 * @param value
	 */
	public void setAttributeValue(Object sourceInstanceObject, Feature feature, Object value);

}
