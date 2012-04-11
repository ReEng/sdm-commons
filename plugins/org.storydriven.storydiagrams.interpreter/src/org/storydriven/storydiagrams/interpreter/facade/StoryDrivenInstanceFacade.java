package org.storydriven.storydiagrams.interpreter.facade;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.patterns.AbstractLinkVariable;

import de.mdelab.sdm.interpreter.core.facade.IInstanceFacade;

/**
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class StoryDrivenInstanceFacade implements IInstanceFacade<AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>
{

	@Override
	public void setAttributeValue(Object sourceInstanceObject, EStructuralFeature feature, Object value)
	{
		assert sourceInstanceObject != null;
		assert feature != null;
		assert sourceInstanceObject instanceof EObject;

		assert feature.isChangeable();

		((EObject) sourceInstanceObject).eSet(feature, value);
	}

}
