package org.storydriven.modeling.interpreter.facade;

import org.eclipse.emf.ecore.EClassifier;

import de.mdelab.sdm.interpreter.core.facade.IClassifierFacade;

/**
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class StoryDrivenClassifierFacade implements IClassifierFacade<EClassifier>
{

	@Override
	public boolean isInstance(EClassifier classifier, Object value)
	{
		return classifier.isInstance(value);
	}

}
