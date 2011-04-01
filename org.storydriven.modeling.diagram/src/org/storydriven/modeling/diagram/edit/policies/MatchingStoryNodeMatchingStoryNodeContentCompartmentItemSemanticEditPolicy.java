package org.storydriven.modeling.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.storydriven.modeling.diagram.edit.commands.MatchingPatternCreateCommand;
import org.storydriven.modeling.diagram.providers.SDMElementTypes;

/**
 * @generated
 */
public class MatchingStoryNodeMatchingStoryNodeContentCompartmentItemSemanticEditPolicy
		extends SDMBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MatchingStoryNodeMatchingStoryNodeContentCompartmentItemSemanticEditPolicy() {
		super(SDMElementTypes.MatchingStoryNode_3010);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SDMElementTypes.MatchingPattern_3006 == req.getElementType()) {
			return getGEFWrapper(new MatchingPatternCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
