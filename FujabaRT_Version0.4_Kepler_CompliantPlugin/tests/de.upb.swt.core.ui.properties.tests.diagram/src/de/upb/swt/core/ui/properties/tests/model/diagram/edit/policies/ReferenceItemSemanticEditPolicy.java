package de.upb.swt.core.ui.properties.tests.model.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import de.upb.swt.core.ui.properties.tests.model.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class ReferenceItemSemanticEditPolicy extends ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ReferenceItemSemanticEditPolicy() {
		super(ModelElementTypes.Reference_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
