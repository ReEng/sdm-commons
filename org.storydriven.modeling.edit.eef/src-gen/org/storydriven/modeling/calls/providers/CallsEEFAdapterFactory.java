/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.calls.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.storydriven.modeling.calls.util.CallsAdapterFactory;
import org.storydriven.modeling.providers.CommentableElementPropertiesEditionProvider;


/**
 * 
 * 
 */
public class CallsEEFAdapterFactory extends CallsAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.calls.util.CallsAdapterFactory#createCommentableElementAdapter()
	 * 
	 */
	public Adapter createCommentableElementAdapter() {
		return new CommentableElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.calls.util.CallsAdapterFactory#createParameterBindingAdapter()
	 * 
	 */
	public Adapter createParameterBindingAdapter() {
		return new ParameterBindingPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.calls.util.CallsAdapterFactory#createOpaqueCallableAdapter()
	 * 
	 */
	public Adapter createOpaqueCallableAdapter() {
		return new OpaqueCallablePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.calls.util.CallsAdapterFactory#createParameterExtensionAdapter()
	 * 
	 */
	public Adapter createParameterExtensionAdapter() {
		return new ParameterExtensionPropertiesEditionProvider();
	}

}
