/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.expressions.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.storydriven.modeling.expressions.util.ExpressionsAdapterFactory;


/**
 * 
 * 
 */
public class ExpressionsEEFAdapterFactory extends ExpressionsAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.expressions.util.ExpressionsAdapterFactory#createTextualExpressionAdapter()
	 * 
	 */
	public Adapter createTextualExpressionAdapter() {
		return new TextualExpressionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.expressions.util.ExpressionsAdapterFactory#createLiteralExpressionAdapter()
	 * 
	 */
	public Adapter createLiteralExpressionAdapter() {
		return new LiteralExpressionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.expressions.util.ExpressionsAdapterFactory#createNotExpressionAdapter()
	 * 
	 */
	public Adapter createNotExpressionAdapter() {
		return new NotExpressionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.expressions.util.ExpressionsAdapterFactory#createComparisonExpressionAdapter()
	 * 
	 */
	public Adapter createComparisonExpressionAdapter() {
		return new ComparisonExpressionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.expressions.util.ExpressionsAdapterFactory#createArithmeticExpressionAdapter()
	 * 
	 */
	public Adapter createArithmeticExpressionAdapter() {
		return new ArithmeticExpressionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.expressions.util.ExpressionsAdapterFactory#createBinaryLogicExpressionAdapter()
	 * 
	 */
	public Adapter createBinaryLogicExpressionAdapter() {
		return new BinaryLogicExpressionPropertiesEditionProvider();
	}

}
