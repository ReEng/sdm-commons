/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.calls.parts;

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
public interface ParameterExtensionPropertiesEditionPart {

	/**
	 * @return the extendableBase
	 * 
	 */
	public EObject getExtendableBase();

	/**
	 * Init the extendableBase
	 * @param settings the combo setting
	 */
	public void initExtendableBase(EObjectFlatComboSettings settings);

	/**
	 * Defines a new extendableBase
	 * @param newValue the new extendableBase to set
	 * 
	 */
	public void setExtendableBase(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setExtendableBaseButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the extendableBase edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToExtendableBase(ViewerFilter filter);

	/**
	 * Adds the given filter to the extendableBase edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToExtendableBase(ViewerFilter filter);





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
