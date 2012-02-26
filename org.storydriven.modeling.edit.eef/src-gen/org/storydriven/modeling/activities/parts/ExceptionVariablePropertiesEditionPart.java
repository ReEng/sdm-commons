/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.activities.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface ExceptionVariablePropertiesEditionPart {

	/**
	 * @return the activityEdge
	 * 
	 */
	public EObject getActivityEdge();

	/**
	 * Init the activityEdge
	 * @param settings the combo setting
	 */
	public void initActivityEdge(EObjectFlatComboSettings settings);

	/**
	 * Defines a new activityEdge
	 * @param newValue the new activityEdge to set
	 * 
	 */
	public void setActivityEdge(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setActivityEdgeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the activityEdge edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToActivityEdge(ViewerFilter filter);

	/**
	 * Adds the given filter to the activityEdge edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToActivityEdge(ViewerFilter filter);


	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);




	/**
	 * Init the exceptionType
	 * @param settings settings for the exceptionType ReferencesTable 
	 */
	public void initExceptionType(ReferencesTableSettings settings);

	/**
	 * Update the exceptionType
	 * @param newValue the exceptionType to update
	 * 
	 */
	public void updateExceptionType();

	/**
	 * Adds the given filter to the exceptionType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToExceptionType(ViewerFilter filter);

	/**
	 * Adds the given filter to the exceptionType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToExceptionType(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the exceptionType table
	 * 
	 */
	public boolean isContainedInExceptionTypeTable(EObject element);




	/**
	 * Init the genericExceptionType
	 * @param settings settings for the genericExceptionType ReferencesTable 
	 */
	public void initGenericExceptionType(ReferencesTableSettings settings);

	/**
	 * Update the genericExceptionType
	 * @param newValue the genericExceptionType to update
	 * 
	 */
	public void updateGenericExceptionType();

	/**
	 * Adds the given filter to the genericExceptionType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToGenericExceptionType(ViewerFilter filter);

	/**
	 * Adds the given filter to the genericExceptionType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToGenericExceptionType(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the genericExceptionType table
	 * 
	 */
	public boolean isContainedInGenericExceptionTypeTable(EObject element);





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
