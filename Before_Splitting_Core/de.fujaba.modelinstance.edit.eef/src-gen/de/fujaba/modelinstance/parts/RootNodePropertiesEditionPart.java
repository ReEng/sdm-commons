/**
 * Generated with Acceleo
 */
package de.fujaba.modelinstance.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface RootNodePropertiesEditionPart {



	/**
	 * Init the categories
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initCategories(ReferencesTableSettings settings);

	/**
	 * Update the categories
	 * @param newValue the categories to update
	 * 
	 */
	public void updateCategories();

	/**
	 * Adds the given filter to the categories edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCategories(ViewerFilter filter);

	/**
	 * Adds the given filter to the categories edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCategories(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the categories table
	 * 
	 */
	public boolean isContainedInCategoriesTable(EObject element);




	/**
	 * Init the ecoreDataTypes
	 * @param settings settings for the ecoreDataTypes ReferencesTable 
	 */
	public void initEcoreDataTypes(ReferencesTableSettings settings);

	/**
	 * Update the ecoreDataTypes
	 * @param newValue the ecoreDataTypes to update
	 * 
	 */
	public void updateEcoreDataTypes();

	/**
	 * Adds the given filter to the ecoreDataTypes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEcoreDataTypes(ViewerFilter filter);

	/**
	 * Adds the given filter to the ecoreDataTypes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEcoreDataTypes(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the ecoreDataTypes table
	 * 
	 */
	public boolean isContainedInEcoreDataTypesTable(EObject element);





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
