/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.templates.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.storydriven.storydiagrams.templates.parts.TemplatesViewsRepository;
import org.storydriven.storydiagrams.templates.parts.forms.PropertyBindingPropertiesEditionPartForm;
import org.storydriven.storydiagrams.templates.parts.forms.TemplateBindingPropertiesEditionPartForm;
import org.storydriven.storydiagrams.templates.parts.forms.TemplateSignaturePropertiesEditionPartForm;
import org.storydriven.storydiagrams.templates.parts.impl.PropertyBindingPropertiesEditionPartImpl;
import org.storydriven.storydiagrams.templates.parts.impl.TemplateBindingPropertiesEditionPartImpl;
import org.storydriven.storydiagrams.templates.parts.impl.TemplateSignaturePropertiesEditionPartImpl;




/**
 * 
 * 
 */
public class TemplatesPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == TemplatesViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == TemplatesViewsRepository.TemplateBinding.class) {
			if (kind == TemplatesViewsRepository.SWT_KIND)
				return new TemplateBindingPropertiesEditionPartImpl(component);
			if (kind == TemplatesViewsRepository.FORM_KIND)
				return new TemplateBindingPropertiesEditionPartForm(component);
		}
		if (key == TemplatesViewsRepository.PropertyBinding.class) {
			if (kind == TemplatesViewsRepository.SWT_KIND)
				return new PropertyBindingPropertiesEditionPartImpl(component);
			if (kind == TemplatesViewsRepository.FORM_KIND)
				return new PropertyBindingPropertiesEditionPartForm(component);
		}
		if (key == TemplatesViewsRepository.TemplateSignature.class) {
			if (kind == TemplatesViewsRepository.SWT_KIND)
				return new TemplateSignaturePropertiesEditionPartImpl(component);
			if (kind == TemplatesViewsRepository.FORM_KIND)
				return new TemplateSignaturePropertiesEditionPartForm(component);
		}
		return null;
	}

}
