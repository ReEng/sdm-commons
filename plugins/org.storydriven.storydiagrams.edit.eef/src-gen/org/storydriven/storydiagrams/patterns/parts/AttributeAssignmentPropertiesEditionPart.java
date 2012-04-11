/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.patterns.parts;

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
public interface AttributeAssignmentPropertiesEditionPart {

	/**
	 * @return the attribute
	 * 
	 */
	public EObject getAttribute();

	/**
	 * Init the attribute
	 * @param settings the combo setting
	 */
	public void initAttribute(EObjectFlatComboSettings settings);

	/**
	 * Defines a new attribute
	 * @param newValue the new attribute to set
	 * 
	 */
	public void setAttribute(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setAttributeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the attribute edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAttribute(ViewerFilter filter);

	/**
	 * Adds the given filter to the attribute edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAttribute(ViewerFilter filter);


	/**
	 * @return the objectVariable
	 * 
	 */
	public EObject getObjectVariable();

	/**
	 * Init the objectVariable
	 * @param settings the combo setting
	 */
	public void initObjectVariable(EObjectFlatComboSettings settings);

	/**
	 * Defines a new objectVariable
	 * @param newValue the new objectVariable to set
	 * 
	 */
	public void setObjectVariable(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setObjectVariableButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the objectVariable edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToObjectVariable(ViewerFilter filter);

	/**
	 * Adds the given filter to the objectVariable edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToObjectVariable(ViewerFilter filter);





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
