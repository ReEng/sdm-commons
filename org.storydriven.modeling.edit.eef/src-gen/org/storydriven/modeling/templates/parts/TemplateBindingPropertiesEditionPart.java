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
public interface TemplateBindingPropertiesEditionPart {

	/**
	 * @return the boundParameter
	 * 
	 */
	public EObject getBoundParameter();

	/**
	 * Init the boundParameter
	 * @param settings the combo setting
	 */
	public void initBoundParameter(EObjectFlatComboSettings settings);

	/**
	 * Defines a new boundParameter
	 * @param newValue the new boundParameter to set
	 * 
	 */
	public void setBoundParameter(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setBoundParameterButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the boundParameter edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToBoundParameter(ViewerFilter filter);

	/**
	 * Adds the given filter to the boundParameter edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToBoundParameter(ViewerFilter filter);


	/**
	 * @return the template
	 * 
	 */
	public EObject getTemplate();

	/**
	 * Init the template
	 * @param settings the combo setting
	 */
	public void initTemplate(EObjectFlatComboSettings settings);

	/**
	 * Defines a new template
	 * @param newValue the new template to set
	 * 
	 */
	public void setTemplate(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setTemplateButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the template edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTemplate(ViewerFilter filter);

	/**
	 * Adds the given filter to the template edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTemplate(ViewerFilter filter);





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
