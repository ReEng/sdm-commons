/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.calls.expressions.parts;

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
public interface MethodCallExpressionPropertiesEditionPart {

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
	 * @return the callee
	 * 
	 */
	public EObject getCallee();

	/**
	 * Init the callee
	 * @param settings the combo setting
	 */
	public void initCallee(EObjectFlatComboSettings settings);

	/**
	 * Defines a new callee
	 * @param newValue the new callee to set
	 * 
	 */
	public void setCallee(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setCalleeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the callee edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCallee(ViewerFilter filter);

	/**
	 * Adds the given filter to the callee edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCallee(ViewerFilter filter);





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
