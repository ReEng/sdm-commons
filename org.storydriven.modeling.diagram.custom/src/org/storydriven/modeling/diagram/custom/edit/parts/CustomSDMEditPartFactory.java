package org.storydriven.modeling.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.modeling.diagram.edit.parts.MatchingPatternEditPart;
import org.storydriven.modeling.diagram.edit.parts.MatchingStoryNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.MatchingStoryNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.ObjectVariableBindingOperatorEditPart;
import org.storydriven.modeling.diagram.edit.parts.ObjectVariableNameEditPart;
import org.storydriven.modeling.diagram.edit.parts.SDMEditPartFactory;
import org.storydriven.modeling.diagram.edit.parts.ForkNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StoryPatternEditPart;
import org.storydriven.modeling.diagram.part.SDMVisualIDRegistry;

public class CustomSDMEditPartFactory extends SDMEditPartFactory {
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (SDMVisualIDRegistry.getVisualID(view)) {

			case ForkNodeEditPart.VISUAL_ID:
				return new CustomStopNodeEditPart(view);
			
			case MatchingStoryNodeEditPart.VISUAL_ID:
				return new CustomMatchingStoryNodeEditPart(view);
				
			case ModifyingStoryNodeEditPart.VISUAL_ID:
				return new CustomModifyingStoryNodeEditPart(view);
				
			case ObjectVariableNameEditPart.VISUAL_ID:
				return new CustomObjectVariableNameLabelEditPart(view);
				
			case ObjectVariableBindingOperatorEditPart.VISUAL_ID:
				return new CustomObjectVariableBindingOperatorLabelEditPart(view);
				
			}	
		}
		return super.createEditPart(context, model);
	}
}
