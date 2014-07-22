/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.patterns.expressions.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.storydriven.modeling.patterns.expressions.parts.ExpressionsViewsRepository;
import org.storydriven.modeling.patterns.expressions.parts.forms.AttributeValueExpressionPropertiesEditionPartForm;
import org.storydriven.modeling.patterns.expressions.parts.forms.ObjectSetSizeExpressionPropertiesEditionPartForm;
import org.storydriven.modeling.patterns.expressions.parts.forms.ObjectVariableExpressionPropertiesEditionPartForm;
import org.storydriven.modeling.patterns.expressions.parts.forms.PrimitiveVariableExpressionPropertiesEditionPartForm;
import org.storydriven.modeling.patterns.expressions.parts.impl.AttributeValueExpressionPropertiesEditionPartImpl;
import org.storydriven.modeling.patterns.expressions.parts.impl.ObjectSetSizeExpressionPropertiesEditionPartImpl;
import org.storydriven.modeling.patterns.expressions.parts.impl.ObjectVariableExpressionPropertiesEditionPartImpl;
import org.storydriven.modeling.patterns.expressions.parts.impl.PrimitiveVariableExpressionPropertiesEditionPartImpl;




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
		if (key == ExpressionsViewsRepository.AttributeValueExpression.class) {
			if (kind == ExpressionsViewsRepository.SWT_KIND)
				return new AttributeValueExpressionPropertiesEditionPartImpl(component);
			if (kind == ExpressionsViewsRepository.FORM_KIND)
				return new AttributeValueExpressionPropertiesEditionPartForm(component);
		}
		if (key == ExpressionsViewsRepository.ObjectVariableExpression.class) {
			if (kind == ExpressionsViewsRepository.SWT_KIND)
				return new ObjectVariableExpressionPropertiesEditionPartImpl(component);
			if (kind == ExpressionsViewsRepository.FORM_KIND)
				return new ObjectVariableExpressionPropertiesEditionPartForm(component);
		}
		if (key == ExpressionsViewsRepository.ObjectSetSizeExpression.class) {
			if (kind == ExpressionsViewsRepository.SWT_KIND)
				return new ObjectSetSizeExpressionPropertiesEditionPartImpl(component);
			if (kind == ExpressionsViewsRepository.FORM_KIND)
				return new ObjectSetSizeExpressionPropertiesEditionPartForm(component);
		}
		if (key == ExpressionsViewsRepository.PrimitiveVariableExpression.class) {
			if (kind == ExpressionsViewsRepository.SWT_KIND)
				return new PrimitiveVariableExpressionPropertiesEditionPartImpl(component);
			if (kind == ExpressionsViewsRepository.FORM_KIND)
				return new PrimitiveVariableExpressionPropertiesEditionPartForm(component);
		}
		return null;
	}

}
