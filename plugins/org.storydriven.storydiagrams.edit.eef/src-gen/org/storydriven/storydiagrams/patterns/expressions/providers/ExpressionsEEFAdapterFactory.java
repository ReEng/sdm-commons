/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.patterns.expressions.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.storydriven.storydiagrams.patterns.expressions.util.PatternsExpressionsAdapterFactory;


/**
 * 
 * 
 */
public class ExpressionsEEFAdapterFactory extends PatternsExpressionsAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.patterns.expressions.util.PatternsExpressionsAdapterFactory#createAttributeValueExpressionAdapter()
	 * 
	 */
	public Adapter createAttributeValueExpressionAdapter() {
		return new AttributeValueExpressionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.patterns.expressions.util.PatternsExpressionsAdapterFactory#createObjectVariableExpressionAdapter()
	 * 
	 */
	public Adapter createObjectVariableExpressionAdapter() {
		return new ObjectVariableExpressionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.patterns.expressions.util.PatternsExpressionsAdapterFactory#createObjectSetSizeExpressionAdapter()
	 * 
	 */
	public Adapter createObjectSetSizeExpressionAdapter() {
		return new ObjectSetSizeExpressionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.patterns.expressions.util.PatternsExpressionsAdapterFactory#createPrimitiveVariableExpressionAdapter()
	 * 
	 */
	public Adapter createPrimitiveVariableExpressionAdapter() {
		return new PrimitiveVariableExpressionPropertiesEditionProvider();
	}

}
