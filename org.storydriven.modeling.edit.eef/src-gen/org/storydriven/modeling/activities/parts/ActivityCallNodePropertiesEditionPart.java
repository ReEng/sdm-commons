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
public interface ActivityCallNodePropertiesEditionPart {

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
	 * Init the outgoing
	 * @param settings settings for the outgoing ReferencesTable 
	 */
	public void initOutgoing(ReferencesTableSettings settings);

	/**
	 * Update the outgoing
	 * @param newValue the outgoing to update
	 * 
	 */
	public void updateOutgoing();

	/**
	 * Adds the given filter to the outgoing edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOutgoing(ViewerFilter filter);

	/**
	 * Adds the given filter to the outgoing edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOutgoing(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the outgoing table
	 * 
	 */
	public boolean isContainedInOutgoingTable(EObject element);


	/**
	 * @return the owningActivity
	 * 
	 */
	public EObject getOwningActivity();

	/**
	 * Init the owningActivity
	 * @param settings the combo setting
	 */
	public void initOwningActivity(EObjectFlatComboSettings settings);

	/**
	 * Defines a new owningActivity
	 * @param newValue the new owningActivity to set
	 * 
	 */
	public void setOwningActivity(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setOwningActivityButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the owningActivity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOwningActivity(ViewerFilter filter);

	/**
	 * Adds the given filter to the owningActivity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOwningActivity(ViewerFilter filter);


	/**
	 * @return the owningActivityNode
	 * 
	 */
	public EObject getOwningActivityNode();

	/**
	 * Init the owningActivityNode
	 * @param settings the combo setting
	 */
	public void initOwningActivityNode(EObjectFlatComboSettings settings);

	/**
	 * Defines a new owningActivityNode
	 * @param newValue the new owningActivityNode to set
	 * 
	 */
	public void setOwningActivityNode(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setOwningActivityNodeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the owningActivityNode edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOwningActivityNode(ViewerFilter filter);

	/**
	 * Adds the given filter to the owningActivityNode edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOwningActivityNode(ViewerFilter filter);




	/**
	 * Init the incoming
	 * @param settings settings for the incoming ReferencesTable 
	 */
	public void initIncoming(ReferencesTableSettings settings);

	/**
	 * Update the incoming
	 * @param newValue the incoming to update
	 * 
	 */
	public void updateIncoming();

	/**
	 * Adds the given filter to the incoming edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIncoming(ViewerFilter filter);

	/**
	 * Adds the given filter to the incoming edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIncoming(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the incoming table
	 * 
	 */
	public boolean isContainedInIncomingTable(EObject element);


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
	 * Init the calledActivity
	 * @param settings settings for the calledActivity ReferencesTable 
	 */
	public void initCalledActivity(ReferencesTableSettings settings);

	/**
	 * Update the calledActivity
	 * @param newValue the calledActivity to update
	 * 
	 */
	public void updateCalledActivity();

	/**
	 * Adds the given filter to the calledActivity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCalledActivity(ViewerFilter filter);

	/**
	 * Adds the given filter to the calledActivity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCalledActivity(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the calledActivity table
	 * 
	 */
	public boolean isContainedInCalledActivityTable(EObject element);





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
