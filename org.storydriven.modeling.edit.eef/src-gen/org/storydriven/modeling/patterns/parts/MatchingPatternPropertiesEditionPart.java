/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.patterns.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface MatchingPatternPropertiesEditionPart {

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
	 * @return the parentPattern
	 * 
	 */
	public EObject getParentPattern();

	/**
	 * Init the parentPattern
	 * @param settings the combo setting
	 */
	public void initParentPattern(EObjectFlatComboSettings settings);

	/**
	 * Defines a new parentPattern
	 * @param newValue the new parentPattern to set
	 * 
	 */
	public void setParentPattern(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setParentPatternButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the parentPattern edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToParentPattern(ViewerFilter filter);

	/**
	 * Adds the given filter to the parentPattern edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToParentPattern(ViewerFilter filter);


	/**
	 * @return the bindingSemantics
	 * 
	 */
	public Enumerator getBindingSemantics();

	/**
	 * Init the bindingSemantics
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initBindingSemantics(EEnum eenum, Enumerator current);

	/**
	 * Defines a new bindingSemantics
	 * @param newValue the new bindingSemantics to set
	 * 
	 */
	public void setBindingSemantics(Enumerator newValue);





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
