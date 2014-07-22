package de.mdelab.sdm.interpreter.core.facade;

/**
 * This facade provides access to properties of classifiers.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <Classifier>
 */
public interface IClassifierFacade<Classifier> extends IMetamodelFacade
{
	/**
	 * Checks if value is an instance of classifier.
	 * 
	 * @param classifier
	 * @param value
	 * @return
	 */
	boolean isInstance(Classifier classifier, Object value);
}
