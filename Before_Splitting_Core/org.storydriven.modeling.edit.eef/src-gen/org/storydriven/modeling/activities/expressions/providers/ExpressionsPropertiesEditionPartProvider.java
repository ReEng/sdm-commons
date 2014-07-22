/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.activities.expressions.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.storydriven.modeling.activities.expressions.parts.ExpressionsViewsRepository;
import org.storydriven.modeling.activities.expressions.parts.forms.ExceptionVariableExpressionPropertiesEditionPartForm;
import org.storydriven.modeling.activities.expressions.parts.impl.ExceptionVariableExpressionPropertiesEditionPartImpl;




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
		if (key == ExpressionsViewsRepository.ExceptionVariableExpression.class) {
			if (kind == ExpressionsViewsRepository.SWT_KIND)
				return new ExceptionVariableExpressionPropertiesEditionPartImpl(component);
			if (kind == ExpressionsViewsRepository.FORM_KIND)
				return new ExceptionVariableExpressionPropertiesEditionPartForm(component);
		}
		return null;
	}

}
