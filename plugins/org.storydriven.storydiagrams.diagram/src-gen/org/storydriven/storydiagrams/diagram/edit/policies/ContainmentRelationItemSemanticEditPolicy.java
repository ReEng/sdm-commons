package org.storydriven.storydiagrams.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class ContainmentRelationItemSemanticEditPolicy extends StorydiagramsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContainmentRelationItemSemanticEditPolicy() {
		super(StorydiagramsElementTypes.ContainmentRelation_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
