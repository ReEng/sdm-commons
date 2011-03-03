package org.storydriven.modeling.diagram.custom.edit.parts;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.NonResizableEditPolicyEx;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.modeling.diagram.edit.parts.MatchingPatternEditPart;
import org.storydriven.modeling.diagram.edit.parts.MatchingStoryNodeMatchingStoryNodeContentCompartmentEditPart;
import org.storydriven.modeling.patterns.StoryPattern;

public class CustomStoryPatternEditPart extends MatchingPatternEditPart {

	public CustomStoryPatternEditPart(View view) {
		super(view);
	}

	private void updateFigure() {
		
		StoryPattern patternNode = (StoryPattern) ((View) getModel()).getElement();
		RoundedRectangle primaryRectangle = (RoundedRectangle) getPrimaryShape();
		primaryRectangle.setLayoutManager(null);
		((RoundedRectangle) primaryRectangle.getChildren().get(0)).setLayoutManager(new FlowLayout());
		
		// Here comes the listen part.
		// Whats still to determine: How do we notify the CustomStoryPattern about a resize Event in his parent.
		// maybe use the code from: http://gmfsamples.tuxfamily.org/wiki/doku.php?id=gmf_tutorial5
		
		CustomMatchingStoryNodeEditPart aStoryNode = (CustomMatchingStoryNodeEditPart) this.getParent().getParent();
		
		IFigure rectangleFront = (IFigure) ((IFigure) aStoryNode.getFigure().getChildren().get(0)).getChildren().get(1);
		rectangleFront =  (IFigure) rectangleFront.getChildren().get(0);
		IFigure rectangleContent = (IFigure) rectangleFront.getChildren().get(1);
		Rectangle bounds = ((IFigure) rectangleContent.getChildren().get(1)).getBounds();
		
		primaryRectangle.setBounds(bounds);
		((RoundedRectangle) primaryRectangle.getChildren().get(0)).setBounds(bounds);
		((RoundedRectangle) primaryRectangle.getChildren().get(0)).setOpaque(true);
		primaryRectangle.setOpaque(true);

		//aStoryNodeCompartment.getFigure().setLayoutManager(null);
	}
	
	
	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		updateFigure();
	}
	
	@Override
	public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);
			updateFigure();
	}
	
//	@Override
//	public EditPolicy getPrimaryDragEditPolicy() {
//	  return new NonResizableEditPolicyEx(); 
//	}

}
