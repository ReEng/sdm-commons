package de.fujaba.newwizard;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.storydriven.modeling.ExtendableElement;

import de.fujaba.newwizard.diagrams.DiagramElementValidator;

public interface IFujabaEditorDescription extends DiagramElementValidator {

	/**
	 * Should return the ID of the generated Editor class.
	 * 
	 * @return the Editor-ID.
	 */
	String getEditorId();

	/**
	 * Should return the MODEL_ID of the generated DiagramEditPart.
	 * 
	 * @return The Model-ID.
	 */
	String getModelId();

	/**
	 * Should return the DIAGRAM_PREFERENCES_HINT of the generated Editor-Plugin
	 * class.
	 * 
	 * @return the PreferencesHint.
	 */
	PreferencesHint getDiagramPreferencesHint();

	/**
	 * Should return the file extension to use in the NewWizard.
	 * 
	 * @return the file extension.
	 */
	String getDiagramFileExtension();

	/**
	 * Return the Diagram Element, or null if the ModelElementCategory should be
	 * used as the Diagram Element.
	 */
	ExtendableElement createDiagramElement();

	String getModelElementCategoryKey();

	boolean isModelElementCategoryDiagramElement();

	CreateViewRequest getCreatePersistedViewsRequest(Diagram diagram,
			Collection<EObject> elements);
}
