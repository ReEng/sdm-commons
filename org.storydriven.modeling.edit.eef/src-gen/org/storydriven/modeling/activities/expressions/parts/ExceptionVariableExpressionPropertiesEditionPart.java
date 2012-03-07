/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.activities.expressions.parts;

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
public interface ExceptionVariableExpressionPropertiesEditionPart {

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
	 * @return the exceptionVariable
	 * 
	 */
	public EObject getExceptionVariable();

	/**
	 * Init the exceptionVariable
	 * @param settings the combo setting
	 */
	public void initExceptionVariable(EObjectFlatComboSettings settings);

	/**
	 * Defines a new exceptionVariable
	 * @param newValue the new exceptionVariable to set
	 * 
	 */
	public void setExceptionVariable(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setExceptionVariableButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the exceptionVariable edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToExceptionVariable(ViewerFilter filter);

	/**
	 * Adds the given filter to the exceptionVariable edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToExceptionVariable(ViewerFilter filter);





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
