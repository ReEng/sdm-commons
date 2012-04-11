/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.calls.expressions.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.storydriven.storydiagrams.calls.expressions.util.CallsExpressionsAdapterFactory;


/**
 * 
 * 
 */
public class ExpressionsEEFAdapterFactory extends CallsExpressionsAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.calls.expressions.util.CallsExpressionsAdapterFactory#createMethodCallExpressionAdapter()
	 * 
	 */
	public Adapter createMethodCallExpressionAdapter() {
		return new MethodCallExpressionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.calls.expressions.util.CallsExpressionsAdapterFactory#createParameterExpressionAdapter()
	 * 
	 */
	public Adapter createParameterExpressionAdapter() {
		return new ParameterExpressionPropertiesEditionProvider();
	}

}
