package org.storydriven.storydiagrams.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.storydriven.storydiagrams.diagram.edit.commands.ObjectSetVariableCreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.ObjectVariableCreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.PrimitiveVariableCreateCommand;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class StoryPatternStoryPatternCompartementItemSemanticEditPolicy extends StorydiagramsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StoryPatternStoryPatternCompartementItemSemanticEditPolicy() {
		super(StorydiagramsElementTypes.StoryPattern_3008);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (StorydiagramsElementTypes.ObjectVariable_3009 == req.getElementType()) {
			return getGEFWrapper(new ObjectVariableCreateCommand(req));
		}
		if (StorydiagramsElementTypes.PrimitiveVariable_3011 == req.getElementType()) {
			return getGEFWrapper(new PrimitiveVariableCreateCommand(req));
		}
		if (StorydiagramsElementTypes.ObjectSetVariable_3014 == req.getElementType()) {
			return getGEFWrapper(new ObjectSetVariableCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
