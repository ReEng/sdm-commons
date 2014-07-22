/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.calls.expressions.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.storydriven.modeling.calls.expressions.parts.ExpressionsViewsRepository;
import org.storydriven.modeling.calls.expressions.parts.forms.MethodCallExpressionPropertiesEditionPartForm;
import org.storydriven.modeling.calls.expressions.parts.forms.ParameterExpressionPropertiesEditionPartForm;
import org.storydriven.modeling.calls.expressions.parts.impl.MethodCallExpressionPropertiesEditionPartImpl;
import org.storydriven.modeling.calls.expressions.parts.impl.ParameterExpressionPropertiesEditionPartImpl;




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
		if (key == ExpressionsViewsRepository.MethodCallExpression.class) {
			if (kind == ExpressionsViewsRepository.SWT_KIND)
				return new MethodCallExpressionPropertiesEditionPartImpl(component);
			if (kind == ExpressionsViewsRepository.FORM_KIND)
				return new MethodCallExpressionPropertiesEditionPartForm(component);
		}
		if (key == ExpressionsViewsRepository.ParameterExpression.class) {
			if (kind == ExpressionsViewsRepository.SWT_KIND)
				return new ParameterExpressionPropertiesEditionPartImpl(component);
			if (kind == ExpressionsViewsRepository.FORM_KIND)
				return new ParameterExpressionPropertiesEditionPartForm(component);
		}
		return null;
	}

}
