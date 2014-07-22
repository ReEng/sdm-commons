package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart;

public class CustomObjectVariableAttributeAssignmentsCompartmentEditPart extends
		ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart {
	public CustomObjectVariableAttributeAssignmentsCompartmentEditPart(View view) {
		super(view);
	}

	@Override
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		result.setTitleVisibility(false);
		result.setMinimumSize(new Dimension(0, 0));
		return result;
	}
}
