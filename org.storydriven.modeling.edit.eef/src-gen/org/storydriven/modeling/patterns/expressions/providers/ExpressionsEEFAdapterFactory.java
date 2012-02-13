/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.patterns.expressions.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.storydriven.modeling.patterns.expressions.util.ExpressionsAdapterFactory;


/**
 * 
 * 
 */
public class ExpressionsEEFAdapterFactory extends ExpressionsAdapterFactory {

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
