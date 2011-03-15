package org.storydriven.modeling.diagram.custom.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.storydriven.modeling.activities.ActivitiesFactory;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.MatchingStoryNode;
import org.storydriven.modeling.activities.ModifyingStoryNode;
import org.storydriven.modeling.activities.impl.StructuredNodeImpl;
import org.storydriven.modeling.diagram.edit.commands.MatchingStoryNodeCreateCommand;
import org.storydriven.modeling.patterns.MatchingPattern;

/**
 * @override
 */
public class CustomMatchingStoryNodeCreateCommand extends MatchingStoryNodeCreateCommand {

	protected ModifyingStoryNode aModifyingNode;
	
	/**
	 * @override
	 */
	public CustomMatchingStoryNodeCreateCommand(CreateElementRequest req, ModifyingStoryNode aNode) {
		super(req);
		this.aModifyingNode = aNode; 
	}

	/**
	 * @override
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		MatchingStoryNode newElement = ActivitiesFactory.eINSTANCE
				.createMatchingStoryNode();

		EObject owner = getElementToEdit();
		if(owner.getClass().getName() == Activity.class.getName()) {
			((Activity) owner).getOwnedActivityNodes().add(newElement);
		}
		else if(owner.getClass().getName() == StructuredNodeImpl.class.getName()) {
			((StructuredNodeImpl) owner).getOwnedActivityNodes().add(newElement);
		}
		
		for( EStructuralFeature aFeature : ( aModifyingNode.eClass().getEAllStructuralFeatures()) ) {	
			if(! (aFeature.getName().equals("storyPattern") || ! (aFeature.getName().equals("owningActivity")))) {
			newElement.eSet(aFeature, (aModifyingNode.eGet(aFeature))); }
		}
		newElement.setOwnedPattern((MatchingPattern) aModifyingNode.getOwnedRule());
		
		doConfigure(newElement, monitor, info);
		
		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);
	}

}
