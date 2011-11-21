package de.fujaba.newwizard.diagrams;

import org.eclipse.emf.ecore.EObject;

/**
 * A validator that can test, if the given object is a valid Diagram Element for
 * the Editor.
 * 
 * @author bingo
 * 
 */
public interface DiagramElementValidator {

	/**
	 * Tests if the given object is a valid Diagram Element for the Editor.
	 * 
	 * @param object
	 *            The object to test.
	 * @return true, if the given object is valid.
	 */
	boolean isValidDiagramElement(EObject object);

	/**
	 * Tests if the given object is a valid Top Level Element within the given
	 * Diagram Element.
	 * 
	 * @param diagramElement
	 *            The Diagram that should be tested, if it can contain the
	 *            object as Top Level Node.
	 * @param topLevelNodeElement
	 *            The Top Level Node to test.
	 * @return true, if the given object is valid.
	 */
	boolean isValidTopLevelNodeElement(EObject diagramElement,
			EObject topLevelNodeElement);
}
