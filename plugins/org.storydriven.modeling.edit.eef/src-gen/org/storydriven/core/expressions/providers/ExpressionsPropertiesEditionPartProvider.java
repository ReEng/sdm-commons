/**
 * Generated with Acceleo
 */
package org.storydriven.core.expressions.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.storydriven.core.expressions.parts.ExpressionsViewsRepository;
import org.storydriven.core.expressions.parts.forms.ArithmeticExpressionPropertiesEditionPartForm;
import org.storydriven.core.expressions.parts.forms.BinaryLogicExpressionPropertiesEditionPartForm;
import org.storydriven.core.expressions.parts.forms.ComparisonExpressionPropertiesEditionPartForm;
import org.storydriven.core.expressions.parts.forms.LiteralExpressionPropertiesEditionPartForm;
import org.storydriven.core.expressions.parts.forms.NotExpressionPropertiesEditionPartForm;
import org.storydriven.core.expressions.parts.forms.TextualExpressionPropertiesEditionPartForm;
import org.storydriven.core.expressions.parts.impl.ArithmeticExpressionPropertiesEditionPartImpl;
import org.storydriven.core.expressions.parts.impl.BinaryLogicExpressionPropertiesEditionPartImpl;
import org.storydriven.core.expressions.parts.impl.ComparisonExpressionPropertiesEditionPartImpl;
import org.storydriven.core.expressions.parts.impl.LiteralExpressionPropertiesEditionPartImpl;
import org.storydriven.core.expressions.parts.impl.NotExpressionPropertiesEditionPartImpl;
import org.storydriven.core.expressions.parts.impl.TextualExpressionPropertiesEditionPartImpl;




/**
 * 
 * 
 */
public class ExpressionsPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == ExpressionsViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == ExpressionsViewsRepository.TextualExpression.class) {
			if (kind == ExpressionsViewsRepository.SWT_KIND)
				return new TextualExpressionPropertiesEditionPartImpl(component);
			if (kind == ExpressionsViewsRepository.FORM_KIND)
				return new TextualExpressionPropertiesEditionPartForm(component);
		}
		if (key == ExpressionsViewsRepository.LiteralExpression.class) {
			if (kind == ExpressionsViewsRepository.SWT_KIND)
				return new LiteralExpressionPropertiesEditionPartImpl(component);
			if (kind == ExpressionsViewsRepository.FORM_KIND)
				return new LiteralExpressionPropertiesEditionPartForm(component);
		}
		if (key == ExpressionsViewsRepository.NotExpression.class) {
			if (kind == ExpressionsViewsRepository.SWT_KIND)
				return new NotExpressionPropertiesEditionPartImpl(component);
			if (kind == ExpressionsViewsRepository.FORM_KIND)
				return new NotExpressionPropertiesEditionPartForm(component);
		}
		if (key == ExpressionsViewsRepository.ComparisonExpression.class) {
			if (kind == ExpressionsViewsRepository.SWT_KIND)
				return new ComparisonExpressionPropertiesEditionPartImpl(component);
			if (kind == ExpressionsViewsRepository.FORM_KIND)
				return new ComparisonExpressionPropertiesEditionPartForm(component);
		}
		if (key == ExpressionsViewsRepository.ArithmeticExpression.class) {
			if (kind == ExpressionsViewsRepository.SWT_KIND)
				return new ArithmeticExpressionPropertiesEditionPartImpl(component);
			if (kind == ExpressionsViewsRepository.FORM_KIND)
				return new ArithmeticExpressionPropertiesEditionPartForm(component);
		}
		if (key == ExpressionsViewsRepository.BinaryLogicExpression.class) {
			if (kind == ExpressionsViewsRepository.SWT_KIND)
				return new BinaryLogicExpressionPropertiesEditionPartImpl(component);
			if (kind == ExpressionsViewsRepository.FORM_KIND)
				return new BinaryLogicExpressionPropertiesEditionPartForm(component);
		}
		return null;
	}

}
