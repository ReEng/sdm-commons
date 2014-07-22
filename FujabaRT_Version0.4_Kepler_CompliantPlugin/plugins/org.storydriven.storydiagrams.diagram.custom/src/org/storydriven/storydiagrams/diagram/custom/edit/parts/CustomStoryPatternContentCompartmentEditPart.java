package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.diagram.edit.parts.StoryPatternStoryPatternContentCompartmentEditPart;

public class CustomStoryPatternContentCompartmentEditPart extends StoryPatternStoryPatternContentCompartmentEditPart {
	public CustomStoryPatternContentCompartmentEditPart(View view) {
		super(view);
	}

	@Override
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		result.setTitleVisibility(false);
		result.setMinimumSize(new Dimension(0, 0));
		result.setBorder(null);
		return result;
	}
}
