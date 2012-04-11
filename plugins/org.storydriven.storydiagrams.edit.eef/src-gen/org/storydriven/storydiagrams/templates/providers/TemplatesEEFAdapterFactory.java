/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.templates.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.storydriven.storydiagrams.templates.util.TemplatesAdapterFactory;


/**
 * 
 * 
 */
public class TemplatesEEFAdapterFactory extends TemplatesAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.templates.util.TemplatesAdapterFactory#createTemplateBindingAdapter()
	 * 
	 */
	public Adapter createTemplateBindingAdapter() {
		return new TemplateBindingPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.templates.util.TemplatesAdapterFactory#createPropertyBindingAdapter()
	 * 
	 */
	public Adapter createPropertyBindingAdapter() {
		return new PropertyBindingPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.templates.util.TemplatesAdapterFactory#createTemplateSignatureAdapter()
	 * 
	 */
	public Adapter createTemplateSignatureAdapter() {
		return new TemplateSignaturePropertiesEditionProvider();
	}

}
