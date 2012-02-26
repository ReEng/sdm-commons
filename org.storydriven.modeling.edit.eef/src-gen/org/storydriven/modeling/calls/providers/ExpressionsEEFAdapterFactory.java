/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.calls.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.storydriven.modeling.calls.expressions.providers.MethodCallExpressionPropertiesEditionProvider;
import org.storydriven.modeling.calls.expressions.providers.ParameterExpressionPropertiesEditionProvider;
import org.storydriven.modeling.calls.expressions.util.ExpressionsAdapterFactory;
import org.storydriven.modeling.providers.CommentableElementPropertiesEditionProvider;


/**
 * 
 * 
 */
public class ExpressionsEEFAdapterFactory extends ExpressionsAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.calls.expressions.util.ExpressionsAdapterFactory#createCommentableElementAdapter()
	 * 
	 */
	public Adapter createCommentableElementAdapter() {
		return new CommentableElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.calls.expressions.util.ExpressionsAdapterFactory#createMethodCallExpressionAdapter()
	 * 
	 */
	public Adapter createMethodCallExpressionAdapter() {
		return new MethodCallExpressionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.calls.expressions.util.ExpressionsAdapterFactory#createParameterExpressionAdapter()
	 * 
	 */
	public Adapter createParameterExpressionAdapter() {
		return new ParameterExpressionPropertiesEditionProvider();
	}

}
