/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.patterns.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface LinkConstraintPropertiesEditionPart {

	/**
	 * @return the index
	 * 
	 */
	public String getIndex();

	/**
	 * Defines a new index
	 * @param newValue the new index to set
	 * 
	 */
	public void setIndex(String newValue);


	/**
	 * @return the constraintType
	 * 
	 */
	public Enumerator getConstraintType();

	/**
	 * Init the constraintType
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initConstraintType(Object input, Enumerator current);

	/**
	 * Defines a new constraintType
	 * @param newValue the new constraintType to set
	 * 
	 */
	public void setConstraintType(Enumerator newValue);


	/**
	 * @return the negative
	 * 
	 */
	public Boolean getNegative();

	/**
	 * Defines a new negative
	 * @param newValue the new negative to set
	 * 
	 */
	public void setNegative(Boolean newValue);


	/**
	 * @return the firstLink
	 * 
	 */
	public EObject getFirstLink();

	/**
	 * Init the firstLink
	 * @param settings the combo setting
	 */
	public void initFirstLink(EObjectFlatComboSettings settings);

	/**
	 * Defines a new firstLink
	 * @param newValue the new firstLink to set
	 * 
	 */
	public void setFirstLink(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setFirstLinkButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the firstLink edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFirstLink(ViewerFilter filter);

	/**
	 * Adds the given filter to the firstLink edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFirstLink(ViewerFilter filter);


	/**
	 * @return the referencingObject
	 * 
	 */
	public EObject getReferencingObject();

	/**
	 * Init the referencingObject
	 * @param settings the combo setting
	 */
	public void initReferencingObject(EObjectFlatComboSettings settings);

	/**
	 * Defines a new referencingObject
	 * @param newValue the new referencingObject to set
	 * 
	 */
	public void setReferencingObject(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setReferencingObjectButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the referencingObject edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReferencingObject(ViewerFilter filter);

	/**
	 * Adds the given filter to the referencingObject edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReferencingObject(ViewerFilter filter);


	/**
	 * @return the secondLink
	 * 
	 */
	public EObject getSecondLink();

	/**
	 * Init the secondLink
	 * @param settings the combo setting
	 */
	public void initSecondLink(EObjectFlatComboSettings settings);

	/**
	 * Defines a new secondLink
	 * @param newValue the new secondLink to set
	 * 
	 */
	public void setSecondLink(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSecondLinkButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the secondLink edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSecondLink(ViewerFilter filter);

	/**
	 * Adds the given filter to the secondLink edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSecondLink(ViewerFilter filter);





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
