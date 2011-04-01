package org.storydriven.modeling.diagram.custom.util;

import java.util.Collection;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest.ViewAndElementDescriptor;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.modeling.diagram.edit.parts.MatchingPatternEditPart;
import org.storydriven.modeling.diagram.edit.parts.StoryPatternEditPart;
import org.storydriven.modeling.diagram.providers.SDMElementTypes;
import org.storydriven.modeling.patterns.MatchingPattern;
import org.storydriven.modeling.patterns.StoryPattern;

public class StoryPatternConverter extends SdmConverter {
	
	public StoryPatternConverter(DiagramEditPart diagramEP, EditPart targetParentEP) {
		super(diagramEP, targetParentEP);
	}

	private	MatchingPattern 		ownMatchingPattern = null;
	private	StoryPattern			ownStoryPattern = null;
	private	View 					targetPatternView = null;
	
	public MatchingPattern convertStoryToMatching(StoryPattern sourceStoryPattern) {
		ownStoryPattern = sourceStoryPattern;
		
		fetchNewMatchingPattern();
		
		copyValuesToMatchingPattern();
		
		configureNewMatchingPattern();
		
		// Removing the old pattern is not necessary because it will be deleted with its parent storynode.
		
		return ownMatchingPattern;
	}

	public StoryPattern convertMatchingToStory(MatchingPattern sourceMatchingPattern) {
		ownMatchingPattern = sourceMatchingPattern;
		
		fetchNewStoryPattern();
		
		copyValuesToStoryPattern();
		
		configureNewStoryPattern();
		
		// Removing the old pattern is not necessary because it will be deleted with its parent storynode.
		
		return ownStoryPattern;
	}
	
	private void fetchNewMatchingPattern() { 
		
		if(targetParentEditPart.getChildren().size() > 0) {
			targetPatternView = (View) ((EditPart) targetParentEditPart.getChildren().get(0)).getModel();
			ownMatchingPattern = (MatchingPattern)targetPatternView.getElement();
		}
		else {
			createMatchingPattern();
		}
		
	}
	
	private void fetchNewStoryPattern() { 
		
		if(targetParentEditPart.getChildren().size() > 0) {
			targetPatternView = (View) ((EditPart) targetParentEditPart.getChildren().get(0)).getModel();
			ownStoryPattern = (StoryPattern)targetPatternView.getElement();
		}
		else {
			createStoryPattern();
		}
		
	}

	private void createMatchingPattern() {
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(diagramEditPart.getEditingDomain(),
				"Toggle StoryNode to Matching", null) {

			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
					IAdaptable info) throws ExecutionException {

				IElementType type = SDMElementTypes.MatchingPattern_3006;
				ViewAndElementDescriptor viewDescriptor = new ViewAndElementDescriptor(
						new CreateElementRequestAdapter(new CreateElementRequest(type)),
						Node.class,
						((IHintedType) type).getSemanticHint(), 
						((GraphicalEditPart) diagramEditPart).getDiagramPreferencesHint());
				CreateViewAndElementRequest req = new CreateViewAndElementRequest(viewDescriptor);

				// Use CompoundCommand to encapsulate the specific command returned by .getCommand
				CompoundCommand cmd = new CompoundCommand("Create MatchingPattern");
				cmd.add(targetParentEditPart.getCommand(req));
				((GraphicalEditPart) targetParentEditPart).getDiagramEditDomain().getDiagramCommandStack().execute(cmd);

				Collection results = DiagramCommandStack.getReturnValues(cmd);
				for (Object res: results) {
					if (res instanceof IAdaptable) {
						IAdaptable adapter = (IAdaptable) res;
						targetPatternView = (View) adapter.getAdapter(View.class);

						if (targetPatternView != null) {
							ownMatchingPattern = (MatchingPattern)targetPatternView.getElement();
						}
					}
				}
				return CommandResult.newOKCommandResult();
			}
		};
		
		executeCommand(command);
	}

	private void createStoryPattern() {
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(diagramEditPart.getEditingDomain(),
				"Toggle StoryNode to Matching", null) {

			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
					IAdaptable info) throws ExecutionException {

				IElementType type = SDMElementTypes.StoryPattern_3008;
				ViewAndElementDescriptor viewDescriptor = new ViewAndElementDescriptor(
						new CreateElementRequestAdapter(new CreateElementRequest(type)),
						Node.class,
						((IHintedType) type).getSemanticHint(), 
						((GraphicalEditPart) diagramEditPart).getDiagramPreferencesHint());
				CreateViewAndElementRequest req = new CreateViewAndElementRequest(viewDescriptor);

				// Use CompoundCommand to encapsulate the specific command returned by .getCommand
				CompoundCommand cmd = new CompoundCommand("Create StoryPattern");
				cmd.add(targetParentEditPart.getCommand(req));
				((GraphicalEditPart) targetParentEditPart).getDiagramEditDomain().getDiagramCommandStack().execute(cmd);

				Collection results = DiagramCommandStack.getReturnValues(cmd);
				for (Object res: results) {
					if (res instanceof IAdaptable) {
						IAdaptable adapter = (IAdaptable) res;
						targetPatternView = (View) adapter.getAdapter(View.class);

						if (targetPatternView != null) {
							ownStoryPattern = (StoryPattern)targetPatternView.getElement();
						}
					}
				}
				return CommandResult.newOKCommandResult();
			}
		};
		
		executeCommand(command);
	}
	
	private void configureNewMatchingPattern() {
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(diagramEditPart.getEditingDomain(), 
				"Configure the new MatchingPattern after conversion", null) {
		
			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
					IAdaptable info) throws ExecutionException {
				
				MatchingPatternEditPart resultEditPart = (MatchingPatternEditPart) getNewMatchingEditPart();
				
				if(resultEditPart == null || resultEditPart.getClass() != MatchingPatternEditPart.class) 
				{
					return CommandResult.newErrorCommandResult("Could not find newly created Editpart");
				}
				else 
				{
					Bounds initialBounds = (Bounds) ((Node) resultEditPart.getModel()).getLayoutConstraint();	
					Rectangle tempBounds = (((AbstractGraphicalEditPart) targetParentEditPart).getFigure()).getBounds();

					initialBounds.setX(tempBounds.x);
					initialBounds.setY(tempBounds.y);
					initialBounds.setHeight(tempBounds.height);
					initialBounds.setWidth(tempBounds.width);
					
					resultEditPart.refresh();
				}
												
				return CommandResult.newOKCommandResult();
			}

			
		};	
		
		executeCommand(command);		
	}
	
	private void configureNewStoryPattern() {
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(diagramEditPart.getEditingDomain(), 
				"Configure the new StoryPattern after conversion", null) {
		
			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
					IAdaptable info) throws ExecutionException {
				
				StoryPatternEditPart resultEditPart = (StoryPatternEditPart) getNewPatternEditPart();
				
				if(resultEditPart == null || resultEditPart.getClass() != StoryPatternEditPart.class) 
				{
					return CommandResult.newErrorCommandResult("Could not find newly created Editpart");
				}
				else 
				{
					Bounds initialBounds = (Bounds) ((Node) resultEditPart.getModel()).getLayoutConstraint();	
					Rectangle tempBounds = (((AbstractGraphicalEditPart) targetParentEditPart).getFigure()).getBounds();

					initialBounds.setX(tempBounds.x);
					initialBounds.setY(tempBounds.y);
					initialBounds.setHeight(tempBounds.height);
					initialBounds.setWidth(tempBounds.width);
					
					resultEditPart.refresh();
				}
												
				return CommandResult.newOKCommandResult();
			}

			
		};	
		
		executeCommand(command);		
	}
	
	// TODO Combine those two methods to a method with a class as argument
	protected MatchingPatternEditPart getNewMatchingEditPart() {
		MatchingPatternEditPart resultEditPart = null;

		int amountOfDiagramChildren = diagramEditPart.getChildren().size();
		for(int i = 1; i <= amountOfDiagramChildren && resultEditPart == null; i++) 
		{
			Object aDiagramChild = diagramEditPart.getChildren().get(amountOfDiagramChildren - i);
			if( aDiagramChild.getClass() == MatchingPatternEditPart.class) {
				resultEditPart = (MatchingPatternEditPart) aDiagramChild;
			}
		}
		
		return resultEditPart;
	}
	
	protected StoryPatternEditPart getNewPatternEditPart() {
		StoryPatternEditPart resultEditPart = null;

		int amountOfDiagramChildren = diagramEditPart.getChildren().size();
		for(int i = 1; i <= amountOfDiagramChildren && resultEditPart == null; i++) 
		{
			Object aDiagramChild = diagramEditPart.getChildren().get(amountOfDiagramChildren - i);
			if( aDiagramChild.getClass() == StoryPatternEditPart.class) {
				resultEditPart = (StoryPatternEditPart) aDiagramChild;
			}
		}
		
		return resultEditPart;
	}
	//
	
	private void copyValuesToMatchingPattern() {
		copyValues(ownStoryPattern, ownMatchingPattern);
	}
	
	private void copyValuesToStoryPattern() {
		copyValues(ownMatchingPattern, ownStoryPattern);
	}
	
}

