/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.activities.expressions.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.storydriven.modeling.activities.expressions.util.ExpressionsAdapterFactory;


/**
 * 
 * 
 */
public class ExpressionsEEFAdapterFactory extends ExpressionsAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.activities.expressions.util.ExpressionsAdapterFactory#createExceptionVariableExpressionAdapter()
	 * 
	 */
	public Adapter createExceptionVariableExpressionAdapter() {
		return new ExceptionVariableExpressionPropertiesEditionProvider();
	}

}
