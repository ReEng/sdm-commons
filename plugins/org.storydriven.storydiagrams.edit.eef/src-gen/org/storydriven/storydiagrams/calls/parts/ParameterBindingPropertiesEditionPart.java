/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.calls.parts;

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
public interface ParameterBindingPropertiesEditionPart {

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
	 * @return the parameter
	 * 
	 */
	public EObject getParameter();

	/**
	 * Init the parameter
	 * @param settings the combo setting
	 */
	public void initParameter(EObjectFlatComboSettings settings);

	/**
	 * Defines a new parameter
	 * @param newValue the new parameter to set
	 * 
	 */
	public void setParameter(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setParameterButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the parameter edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToParameter(ViewerFilter filter);

	/**
	 * Adds the given filter to the parameter edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToParameter(ViewerFilter filter);


	/**
	 * @return the invocation
	 * 
	 */
	public EObject getInvocation();

	/**
	 * Init the invocation
	 * @param settings the combo setting
	 */
	public void initInvocation(EObjectFlatComboSettings settings);

	/**
	 * Defines a new invocation
	 * @param newValue the new invocation to set
	 * 
	 */
	public void setInvocation(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setInvocationButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the invocation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInvocation(ViewerFilter filter);

	/**
	 * Adds the given filter to the invocation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInvocation(ViewerFilter filter);





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
