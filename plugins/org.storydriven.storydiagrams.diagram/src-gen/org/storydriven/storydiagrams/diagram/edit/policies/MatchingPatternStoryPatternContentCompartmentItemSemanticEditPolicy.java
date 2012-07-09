package org.storydriven.storydiagrams.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.storydriven.storydiagrams.diagram.edit.commands.CollectionVariableCreateCommand;
import org.storydriven.storydiagrams.diagram.edit.commands.ObjectVariableCreateCommand;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class MatchingPatternStoryPatternContentCompartmentItemSemanticEditPolicy extends
		StorydiagramsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MatchingPatternStoryPatternContentCompartmentItemSemanticEditPolicy() {
		super(StorydiagramsElementTypes.MatchingPattern_3025);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (StorydiagramsElementTypes.ObjectVariable_3020 == req.getElementType()) {
			return getGEFWrapper(new ObjectVariableCreateCommand(req));
		}
		if (StorydiagramsElementTypes.CollectionVariable_3023 == req.getElementType()) {
			return getGEFWrapper(new CollectionVariableCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
