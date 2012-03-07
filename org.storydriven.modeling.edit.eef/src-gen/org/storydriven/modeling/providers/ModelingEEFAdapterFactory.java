/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.storydriven.modeling.util.SDMAdapterFactory;


/**
 * 
 * 
 */
public class ModelingEEFAdapterFactory extends SDMAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.util.SDMAdapterFactory#createCommentableElementAdapter()
	 * 
	 */
	public Adapter createCommentableElementAdapter() {
		return new CommentableElementPropertiesEditionProvider();
	}

}
