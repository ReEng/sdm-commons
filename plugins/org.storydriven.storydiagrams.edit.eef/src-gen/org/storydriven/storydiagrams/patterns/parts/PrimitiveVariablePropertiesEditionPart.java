/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.patterns.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
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
public interface PrimitiveVariablePropertiesEditionPart {

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
	 * @return the pattern
	 * 
	 */
	public EObject getPattern();

	/**
	 * Init the pattern
	 * @param settings the combo setting
	 */
	public void initPattern(EObjectFlatComboSettings settings);

	/**
	 * Defines a new pattern
	 * @param newValue the new pattern to set
	 * 
	 */
	public void setPattern(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setPatternButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the pattern edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPattern(ViewerFilter filter);

	/**
	 * Adds the given filter to the pattern edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPattern(ViewerFilter filter);


	/**
	 * @return the bindingState
	 * 
	 */
	public Enumerator getBindingState();

	/**
	 * Init the bindingState
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initBindingState(Object input, Enumerator current);

	/**
	 * Defines a new bindingState
	 * @param newValue the new bindingState to set
	 * 
	 */
	public void setBindingState(Enumerator newValue);




	/**
	 * Init the incomingLink
	 * @param settings settings for the incomingLink ReferencesTable 
	 */
	public void initIncomingLink(ReferencesTableSettings settings);

	/**
	 * Update the incomingLink
	 * @param newValue the incomingLink to update
	 * 
	 */
	public void updateIncomingLink();

	/**
	 * Adds the given filter to the incomingLink edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIncomingLink(ViewerFilter filter);

	/**
	 * Adds the given filter to the incomingLink edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIncomingLink(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the incomingLink table
	 * 
	 */
	public boolean isContainedInIncomingLinkTable(EObject element);


	/**
	 * @return the classifier
	 * 
	 */
	public EObject getClassifier();

	/**
	 * Init the classifier
	 * @param settings the combo setting
	 */
	public void initClassifier(EObjectFlatComboSettings settings);

	/**
	 * Defines a new classifier
	 * @param newValue the new classifier to set
	 * 
	 */
	public void setClassifier(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setClassifierButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the classifier edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToClassifier(ViewerFilter filter);

	/**
	 * Adds the given filter to the classifier edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToClassifier(ViewerFilter filter);





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
