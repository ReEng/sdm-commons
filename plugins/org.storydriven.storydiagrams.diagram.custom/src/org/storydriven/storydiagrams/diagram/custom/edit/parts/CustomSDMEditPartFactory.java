package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityCallNodeActivityCallNodeCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEdgeGuardConstraintLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.AttributeAssignmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ContainmentRelationEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ContainmentRelationOperatorLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableOperatorLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableSourceEndLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableTargetEndLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableBindingOperatorEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableClassifierLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.PrimitiveVariableClassifierLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StopNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StoryPatternEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StorydiagramsEditPartFactory;
import org.storydriven.storydiagrams.diagram.edit.parts.TextualExpressionEditPart;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry;

public class CustomSDMEditPartFactory extends StorydiagramsEditPartFactory {
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (StorydiagramsVisualIDRegistry.getVisualID(view)) {

			case StopNodeEditPart.VISUAL_ID:
				return new CustomStopNodeEditPart(view);

			case ModifyingStoryNodeEditPart.VISUAL_ID:
				return new CustomModifyingStoryNodeEditPart(view);

			case StoryPatternEditPart.VISUAL_ID:
				return new CustomStoryPatternEditPart(view);

			case ObjectVariableNameEditPart.VISUAL_ID:
				return new CustomObjectVariableNameLabelEditPart(view);

			case ObjectVariableBindingOperatorEditPart.VISUAL_ID:
				return new CustomObjectVariableBindingOperatorLabelEditPart(view);

			case ObjectVariableClassifierLabelEditPart.VISUAL_ID:
				return new CustomObjectVariableClassifierLabelEditPart(view);

			case PrimitiveVariableClassifierLabelEditPart.VISUAL_ID:
				return new CustomPrimitiveVariableClassifierLabelEditPart(view);

			case AttributeAssignmentEditPart.VISUAL_ID:
				return new CustomAttributeAssignmentEditPart(view);

			case TextualExpressionEditPart.VISUAL_ID:
				return new CustomTextualExpressionEditPart(view);

			case ActivityEdgeGuardConstraintLabelEditPart.VISUAL_ID:
				return new CustomActivityEdgeGuardConstraintLabelEditPart(view);

			case LinkVariableEditPart.VISUAL_ID:
				return new CustomLinkVariableEditPart(view);

			case LinkVariableTargetEndLabelEditPart.VISUAL_ID:
				return new CustomLinkVariableTargetEndLabelEditPart(view);

			case LinkVariableSourceEndLabelEditPart.VISUAL_ID:
				return new CustomLinkVariableSourceEndLabelEditPart(view);

			case LinkVariableOperatorLabelEditPart.VISUAL_ID:
				return new CustomLinkVariableOperatorLabelEditPart(view);

			case ContainmentRelationEditPart.VISUAL_ID:
				return new CustomContainmentRelationEditPart(view);

			case ContainmentRelationOperatorLabelEditPart.VISUAL_ID:
				return new CustomContainmentRelationOperatorLabelEditPart(view);

			case ObjectVariableEditPart.VISUAL_ID:
				return new CustomObjectVariableEditPart(view);
				/*
				 * In case MatchingStoryNodes strike back add this:
				 * case MatchingStoryNodeEditPart.VISUAL_ID:
				 * return new CustomMatchingStoryNodeEditPart(view);
				 */
			case ActivityCallNodeActivityCallNodeCompartmentEditPart.VISUAL_ID:
				return new CustomActivityCallNodeActivityCallNodeCompartmentEditPart(view);

				/*
				 * case ActivityCallNodeEditPart.VISUAL_ID:
				 * return new CustomActivityCallNodeEditPart(view);
				 */
			}
		}
		return super.createEditPart(context, model);
	}
}
