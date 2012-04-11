/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.calls.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.storydriven.storydiagrams.calls.util.CallsAdapterFactory;


/**
 * 
 * 
 */
public class CallsEEFAdapterFactory extends CallsAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.calls.util.CallsAdapterFactory#createParameterBindingAdapter()
	 * 
	 */
	public Adapter createParameterBindingAdapter() {
		return new ParameterBindingPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.calls.util.CallsAdapterFactory#createOpaqueCallableAdapter()
	 * 
	 */
	public Adapter createOpaqueCallableAdapter() {
		return new OpaqueCallablePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.calls.util.CallsAdapterFactory#createParameterExtensionAdapter()
	 * 
	 */
	public Adapter createParameterExtensionAdapter() {
		return new ParameterExtensionPropertiesEditionProvider();
	}

}
