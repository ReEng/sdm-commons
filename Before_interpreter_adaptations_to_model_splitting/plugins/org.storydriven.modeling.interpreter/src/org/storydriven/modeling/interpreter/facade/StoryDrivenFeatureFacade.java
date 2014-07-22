package org.storydriven.modeling.interpreter.facade;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.mdelab.sdm.interpreter.core.facade.IFeatureFacade;

/**
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class StoryDrivenFeatureFacade implements IFeatureFacade<EStructuralFeature>
{

	@Override
	public String getName(EStructuralFeature feature)
	{
		return feature.getName();
	}

}
