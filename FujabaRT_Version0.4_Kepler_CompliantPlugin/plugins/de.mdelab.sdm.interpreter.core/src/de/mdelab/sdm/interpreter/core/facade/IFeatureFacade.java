package de.mdelab.sdm.interpreter.core.facade;

/**
 * This facade provides access to properties of features (i.e. attributes and
 * references).
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <Feature>
 */
public interface IFeatureFacade<Feature> extends IMetamodelFacade
{
	String getName(Feature feature);
}
