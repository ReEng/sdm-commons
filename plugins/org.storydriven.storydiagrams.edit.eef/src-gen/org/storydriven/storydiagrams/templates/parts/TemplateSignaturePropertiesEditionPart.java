/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.templates.parts;

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
public interface TemplateSignaturePropertiesEditionPart {

	/**
	 * @return the pattern
	 * 
	 */
	public EObject getPattern();

	/**
	 * Init the pattern
	 * @param settings the combo setting
	 */
	public void initPattern(EObjectFlatComboSettings settings);

	/**
	 * Defines a new pattern
	 * @param newValue the new pattern to set
	 * 
	 */
	public void setPattern(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setPatternButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the pattern edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPattern(ViewerFilter filter);

	/**
	 * Adds the given filter to the pattern edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPattern(ViewerFilter filter);





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
