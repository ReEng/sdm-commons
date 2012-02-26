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
public interface LinkVariablePropertiesEditionPart {

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
	 * @return the source
	 * 
	 */
	public EObject getSource();

	/**
	 * Init the source
	 * @param settings the combo setting
	 */
	public void initSource(EObjectFlatComboSettings settings);

	/**
	 * Defines a new source
	 * @param newValue the new source to set
	 * 
	 */
	public void setSource(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSourceButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the source edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSource(ViewerFilter filter);

	/**
	 * Adds the given filter to the source edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSource(ViewerFilter filter);




	/**
	 * Init the secondLinkConstraint
	 * @param settings settings for the secondLinkConstraint ReferencesTable 
	 */
	public void initSecondLinkConstraint(ReferencesTableSettings settings);

	/**
	 * Update the secondLinkConstraint
	 * @param newValue the secondLinkConstraint to update
	 * 
	 */
	public void updateSecondLinkConstraint();

	/**
	 * Adds the given filter to the secondLinkConstraint edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSecondLinkConstraint(ViewerFilter filter);

	/**
	 * Adds the given filter to the secondLinkConstraint edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSecondLinkConstraint(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the secondLinkConstraint table
	 * 
	 */
	public boolean isContainedInSecondLinkConstraintTable(EObject element);




	/**
	 * Init the firstLinkConstraint
	 * @param settings settings for the firstLinkConstraint ReferencesTable 
	 */
	public void initFirstLinkConstraint(ReferencesTableSettings settings);

	/**
	 * Update the firstLinkConstraint
	 * @param newValue the firstLinkConstraint to update
	 * 
	 */
	public void updateFirstLinkConstraint();

	/**
	 * Adds the given filter to the firstLinkConstraint edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFirstLinkConstraint(ViewerFilter filter);

	/**
	 * Adds the given filter to the firstLinkConstraint edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFirstLinkConstraint(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the firstLinkConstraint table
	 * 
	 */
	public boolean isContainedInFirstLinkConstraintTable(EObject element);


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
	 * @return the target
	 * 
	 */
	public EObject getTarget();

	/**
	 * Init the target
	 * @param settings the combo setting
	 */
	public void initTarget(EObjectFlatComboSettings settings);

	/**
	 * Defines a new target
	 * @param newValue the new target to set
	 * 
	 */
	public void setTarget(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setTargetButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the target edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTarget(ViewerFilter filter);

	/**
	 * Adds the given filter to the target edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTarget(ViewerFilter filter);


	/**
	 * @return the targetEnd
	 * 
	 */
	public EObject getTargetEnd();

	/**
	 * Init the targetEnd
	 * @param settings the combo setting
	 */
	public void initTargetEnd(EObjectFlatComboSettings settings);

	/**
	 * Defines a new targetEnd
	 * @param newValue the new targetEnd to set
	 * 
	 */
	public void setTargetEnd(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setTargetEndButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the targetEnd edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTargetEnd(ViewerFilter filter);

	/**
	 * Adds the given filter to the targetEnd edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTargetEnd(ViewerFilter filter);





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
