package org.storydriven.storydiagrams.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.storydriven.storydiagrams.diagram.edit.commands.MatchingPatternCreateCommand;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class MatchingStoryNodeMatchingStoryNodeContentCompartment2ItemSemanticEditPolicy extends
		StorydiagramsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MatchingStoryNodeMatchingStoryNodeContentCompartment2ItemSemanticEditPolicy() {
		super(StorydiagramsElementTypes.MatchingStoryNode_3017);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (StorydiagramsElementTypes.MatchingPattern_3012 == req.getElementType()) {
			return getGEFWrapper(new MatchingPatternCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}