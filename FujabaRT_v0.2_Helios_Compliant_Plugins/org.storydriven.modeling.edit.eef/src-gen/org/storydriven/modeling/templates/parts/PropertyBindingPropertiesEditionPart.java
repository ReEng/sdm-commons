/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.templates.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface PropertyBindingPropertiesEditionPart {

	/**
	 * @return the boundProperty
	 * 
	 */
	public EObject getBoundProperty();

	/**
	 * Init the boundProperty
	 * @param settings the combo setting
	 */
	public void initBoundProperty(EObjectFlatComboSettings settings);

	/**
	 * Defines a new boundProperty
	 * @param newValue the new boundProperty to set
	 * 
	 */
	public void setBoundProperty(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setBoundPropertyButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the boundProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToBoundProperty(ViewerFilter filter);

	/**
	 * Adds the given filter to the boundProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToBoundProperty(ViewerFilter filter);


	/**
	 * @return the templateBinding
	 * 
	 */
	public EObject getTemplateBinding();

	/**
	 * Init the templateBinding
	 * @param settings the combo setting
	 */
	public void initTemplateBinding(EObjectFlatComboSettings settings);

	/**
	 * Defines a new templateBinding
	 * @param newValue the new templateBinding to set
	 * 
	 */
	public void setTemplateBinding(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setTemplateBindingButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the templateBinding edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTemplateBinding(ViewerFilter filter);

	/**
	 * Adds the given filter to the templateBinding edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTemplateBinding(ViewerFilter filter);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods

// End of user code

}
