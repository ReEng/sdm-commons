/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.activities.expressions.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.storydriven.storydiagrams.activities.expressions.util.ActivitiesExpressionsAdapterFactory;


/**
 * 
 * 
 */
public class ExpressionsEEFAdapterFactory extends ActivitiesExpressionsAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.activities.expressions.util.ActivitiesExpressionsAdapterFactory#createExceptionVariableExpressionAdapter()
	 * 
	 */
	public Adapter createExceptionVariableExpressionAdapter() {
		return new ExceptionVariableExpressionPropertiesEditionProvider();
	}

}
