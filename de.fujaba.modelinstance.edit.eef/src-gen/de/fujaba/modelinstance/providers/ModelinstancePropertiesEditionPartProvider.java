/**
 * Generated with Acceleo
 */
package de.fujaba.modelinstance.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import de.fujaba.modelinstance.parts.ModelinstanceViewsRepository;
import de.fujaba.modelinstance.parts.forms.ModelElementCategoryPropertiesEditionPartForm;
import de.fujaba.modelinstance.parts.forms.RootNodePropertiesEditionPartForm;
import de.fujaba.modelinstance.parts.impl.ModelElementCategoryPropertiesEditionPartImpl;
import de.fujaba.modelinstance.parts.impl.RootNodePropertiesEditionPartImpl;




/**
 * 
 * 
 */
public class ModelinstancePropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == ModelinstanceViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == ModelinstanceViewsRepository.RootNode.class) {
			if (kind == ModelinstanceViewsRepository.SWT_KIND)
				return new RootNodePropertiesEditionPartImpl(component);
			if (kind == ModelinstanceViewsRepository.FORM_KIND)
				return new RootNodePropertiesEditionPartForm(component);
		}
		if (key == ModelinstanceViewsRepository.ModelElementCategory.class) {
			if (kind == ModelinstanceViewsRepository.SWT_KIND)
				return new ModelElementCategoryPropertiesEditionPartImpl(component);
			if (kind == ModelinstanceViewsRepository.FORM_KIND)
				return new ModelElementCategoryPropertiesEditionPartForm(component);
		}
		return null;
	}

}
