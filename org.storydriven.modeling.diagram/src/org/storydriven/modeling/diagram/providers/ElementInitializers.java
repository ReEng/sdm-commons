package org.storydriven.modeling.diagram.providers;

import org.storydriven.modeling.diagram.part.SDMDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = SDMDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			SDMDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
