package org.storydriven.modeling.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.modeling.diagram.edit.parts.MatchingPatternEditPart;
import org.storydriven.modeling.diagram.edit.parts.MatchingStoryNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.SDMEditPartFactory;
import org.storydriven.modeling.diagram.edit.parts.StopNodeEditPart;
import org.storydriven.modeling.diagram.part.SDMVisualIDRegistry;

public class CustomSDMEditPartFactory extends SDMEditPartFactory {
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (SDMVisualIDRegistry.getVisualID(view)) {

			case StopNodeEditPart.VISUAL_ID:
				return new CustomStopNodeEditPart(view);
			
			case MatchingStoryNodeEditPart.VISUAL_ID:
				return new CustomMatchingStoryNodeEditPart(view);

			case MatchingPatternEditPart.VISUAL_ID:
				return new CustomStoryPatternEditPart(view);
				
			}	
		}
		return super.createEditPart(context, model);
	}
}
