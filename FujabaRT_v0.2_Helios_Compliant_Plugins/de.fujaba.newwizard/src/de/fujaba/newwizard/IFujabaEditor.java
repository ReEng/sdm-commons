package de.fujaba.newwizard;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.storydriven.modeling.ExtendableElement;

import de.fujaba.newwizard.diagrams.IDiagramElementValidator;

/**
 * An interface that should be implemented by Fujaba Diagram-Editors (not
 * necessarily by the Eclipse Editor-Class).
 * 
 * @author bingo
 * 
 */
public interface IFujabaEditor extends IDiagramElementValidator {

	/**
	 * Should return the DIAGRAM_PREFERENCES_HINT of the generated Editor-Plugin
	 * class.
	 * 
	 * @return the PreferencesHint.
	 */
	PreferencesHint getPreferencesHint();

	/**
	 * Return the Diagram Element, or null if the ModelElementCategory should be
	 * used as the Diagram Element.
	 */
	ExtendableElement createDiagramElement();

	/**
	 * Create diagram views for the elements.
	 * 
	 * @param diagram
	 *            The diagram to put the views into.
	 * @param elements
	 *            The elements to create a view for.
	 * @return The request.
	 */
	CreateViewRequest getCreatePersistedViewsRequest(Diagram diagram,
			Collection<EObject> elements);
}
