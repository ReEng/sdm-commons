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
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface ContainerVariablePropertiesEditionPart {

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
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initBindingState(EEnum eenum, Enumerator current);

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
	 * Init the outgoingLink
	 * @param settings settings for the outgoingLink ReferencesTable 
	 */
	public void initOutgoingLink(ReferencesTableSettings settings);

	/**
	 * Update the outgoingLink
	 * @param newValue the outgoingLink to update
	 * 
	 */
	public void updateOutgoingLink();

	/**
	 * Adds the given filter to the outgoingLink edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOutgoingLink(ViewerFilter filter);

	/**
	 * Adds the given filter to the outgoingLink edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOutgoingLink(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the outgoingLink table
	 * 
	 */
	public boolean isContainedInOutgoingLinkTable(EObject element);


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
	 * @return the bindingOperator
	 * 
	 */
	public Enumerator getBindingOperator();

	/**
	 * Init the bindingOperator
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initBindingOperator(EEnum eenum, Enumerator current);

	/**
	 * Defines a new bindingOperator
	 * @param newValue the new bindingOperator to set
	 * 
	 */
	public void setBindingOperator(Enumerator newValue);


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
