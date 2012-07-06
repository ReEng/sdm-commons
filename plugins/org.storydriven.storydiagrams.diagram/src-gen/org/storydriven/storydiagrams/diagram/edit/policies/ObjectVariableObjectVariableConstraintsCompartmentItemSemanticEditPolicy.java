package org.storydriven.storydiagrams.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.storydriven.storydiagrams.diagram.edit.commands.ConstraintCreateCommand;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class ObjectVariableObjectVariableConstraintsCompartmentItemSemanticEditPolicy
		extends StorydiagramsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ObjectVariableObjectVariableConstraintsCompartmentItemSemanticEditPolicy() {
		super(StorydiagramsElementTypes.ObjectVariable_3020);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (StorydiagramsElementTypes.Constraint_3022 == req.getElementType()) {
			return getGEFWrapper(new ConstraintCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
