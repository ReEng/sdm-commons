/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.patterns.expressions.parts;

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
public interface PrimitiveVariableExpressionPropertiesEditionPart {

	/**
	 * @return the comment
	 * 
	 */
	public String getComment();

	/**
	 * Defines a new comment
	 * @param newValue the new comment to set
	 * 
	 */
	public void setComment(String newValue);


	/**
	 * @return the primitiveVariable
	 * 
	 */
	public EObject getPrimitiveVariable();

	/**
	 * Init the primitiveVariable
	 * @param settings the combo setting
	 */
	public void initPrimitiveVariable(EObjectFlatComboSettings settings);

	/**
	 * Defines a new primitiveVariable
	 * @param newValue the new primitiveVariable to set
	 * 
	 */
	public void setPrimitiveVariable(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setPrimitiveVariableButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the primitiveVariable edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPrimitiveVariable(ViewerFilter filter);

	/**
	 * Adds the given filter to the primitiveVariable edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPrimitiveVariable(ViewerFilter filter);





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
