/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.storydriven.modeling.expressions.util.ExpressionsAdapterFactory;
import org.storydriven.modeling.patterns.expressions.providers.AttributeValueExpressionPropertiesEditionProvider;
import org.storydriven.modeling.patterns.expressions.providers.ObjectSetSizeExpressionPropertiesEditionProvider;
import org.storydriven.modeling.patterns.expressions.providers.ObjectVariableExpressionPropertiesEditionProvider;
import org.storydriven.modeling.patterns.expressions.providers.PrimitiveVariableExpressionPropertiesEditionProvider;


/**
 * 
 * 
 */
public class ExpressionsEEFAdapterFactory extends ExpressionsAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.patterns.expressions.util.ExpressionsAdapterFactory#createCommentableElementAdapter()
	 * 
	 */
	public Adapter createCommentableElementAdapter() {
		return new CommentableElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.patterns.expressions.util.ExpressionsAdapterFactory#createAttributeValueExpressionAdapter()
	 * 
	 */
	public Adapter createAttributeValueExpressionAdapter() {
		return new AttributeValueExpressionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.patterns.expressions.util.ExpressionsAdapterFactory#createObjectVariableExpressionAdapter()
	 * 
	 */
	public Adapter createObjectVariableExpressionAdapter() {
		return new ObjectVariableExpressionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.patterns.expressions.util.ExpressionsAdapterFactory#createObjectSetSizeExpressionAdapter()
	 * 
	 */
	public Adapter createObjectSetSizeExpressionAdapter() {
		return new ObjectSetSizeExpressionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.patterns.expressions.util.ExpressionsAdapterFactory#createPrimitiveVariableExpressionAdapter()
	 * 
	 */
	public Adapter createPrimitiveVariableExpressionAdapter() {
		return new PrimitiveVariableExpressionPropertiesEditionProvider();
	}

}
