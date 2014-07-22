/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.calls.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.storydriven.modeling.calls.parts.CallsViewsRepository;
import org.storydriven.modeling.calls.parts.forms.OpaqueCallablePropertiesEditionPartForm;
import org.storydriven.modeling.calls.parts.forms.ParameterBindingPropertiesEditionPartForm;
import org.storydriven.modeling.calls.parts.forms.ParameterExtensionPropertiesEditionPartForm;
import org.storydriven.modeling.calls.parts.impl.OpaqueCallablePropertiesEditionPartImpl;
import org.storydriven.modeling.calls.parts.impl.ParameterBindingPropertiesEditionPartImpl;
import org.storydriven.modeling.calls.parts.impl.ParameterExtensionPropertiesEditionPartImpl;




/**
 * 
 * 
 */
public class CallsPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == CallsViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == CallsViewsRepository.ParameterBinding.class) {
			if (kind == CallsViewsRepository.SWT_KIND)
				return new ParameterBindingPropertiesEditionPartImpl(component);
			if (kind == CallsViewsRepository.FORM_KIND)
				return new ParameterBindingPropertiesEditionPartForm(component);
		}
		if (key == CallsViewsRepository.OpaqueCallable.class) {
			if (kind == CallsViewsRepository.SWT_KIND)
				return new OpaqueCallablePropertiesEditionPartImpl(component);
			if (kind == CallsViewsRepository.FORM_KIND)
				return new OpaqueCallablePropertiesEditionPartForm(component);
		}
		if (key == CallsViewsRepository.ParameterExtension.class) {
			if (kind == CallsViewsRepository.SWT_KIND)
				return new ParameterExtensionPropertiesEditionPartImpl(component);
			if (kind == CallsViewsRepository.FORM_KIND)
				return new ParameterExtensionPropertiesEditionPartForm(component);
		}
		return null;
	}

}
