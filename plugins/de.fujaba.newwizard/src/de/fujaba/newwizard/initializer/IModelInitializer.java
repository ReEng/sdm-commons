package de.fujaba.newwizard.initializer;

import org.eclipse.emf.ecore.EObject;

/**
 * Interface that can be overridden to initialize a Fujaba Model after the
 * newwizard created it.
 * 
 * @author bingo
 * 
 */
public interface IModelInitializer {

	/**
	 * Can be asked if the given object is supported for initialization.
	 * 
	 * @param object
	 *            The object in question.
	 * @return <code>true</code>, if the object can be initialized.
	 */
	boolean supports(EObject object);

	/**
	 * Initializes the object.
	 * 
	 * @param object
	 *            The object to initialize.
	 */
	void initialize(EObject object);
}
