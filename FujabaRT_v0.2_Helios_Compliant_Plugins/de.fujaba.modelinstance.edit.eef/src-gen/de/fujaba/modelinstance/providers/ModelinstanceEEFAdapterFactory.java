/**
 * Generated with Acceleo
 */
package de.fujaba.modelinstance.providers;

import org.eclipse.emf.common.notify.Adapter;

import de.fujaba.modelinstance.util.ModelinstanceAdapterFactory;


/**
 * 
 * 
 */
public class ModelinstanceEEFAdapterFactory extends ModelinstanceAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see de.fujaba.modelinstance.util.ModelinstanceAdapterFactory#createRootNodeAdapter()
	 * 
	 */
	public Adapter createRootNodeAdapter() {
		return new RootNodePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.fujaba.modelinstance.util.ModelinstanceAdapterFactory#createModelElementCategoryAdapter()
	 * 
	 */
	public Adapter createModelElementCategoryAdapter() {
		return new ModelElementCategoryPropertiesEditionProvider();
	}

}
