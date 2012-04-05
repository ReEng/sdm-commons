/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.activities.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.storydriven.modeling.activities.expressions.providers.ExceptionVariableExpressionPropertiesEditionProvider;
import org.storydriven.modeling.activities.expressions.util.ExpressionsAdapterFactory;
import org.storydriven.modeling.providers.CommentableElementPropertiesEditionProvider;


/**
 * 
 * 
 */
public class ExpressionsEEFAdapterFactory extends ExpressionsAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.activities.expressions.util.ExpressionsAdapterFactory#createCommentableElementAdapter()
	 * 
	 */
	public Adapter createCommentableElementAdapter() {
		return new CommentableElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.activities.expressions.util.ExpressionsAdapterFactory#createExceptionVariableExpressionAdapter()
	 * 
	 */
	public Adapter createExceptionVariableExpressionAdapter() {
		return new ExceptionVariableExpressionPropertiesEditionProvider();
	}

}
