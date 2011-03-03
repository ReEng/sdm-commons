package org.storydriven.modeling.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ScrollPane;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ShapeCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.modeling.activities.MatchingStoryNode;
import org.storydriven.modeling.activities.StoryNode;
import org.storydriven.modeling.diagram.edit.parts.MatchingStoryNodeEditPart;

public class CustomMatchingStoryNodeEditPart extends MatchingStoryNodeEditPart {

	public CustomMatchingStoryNodeEditPart(View view) {
		super(view);
	}
	
	private void updateFigure() {
			boolean isForEach = ((StoryNode) ((View) getModel()).getElement()).isForEach();

			RectangleFigure frontRectangle = (RectangleFigure) getPrimaryShape().getChildren().get(1);

			Insets frontInsets = frontRectangle.getBorder().getInsets(frontRectangle);

			if (!isForEach)
			{
				frontInsets.top = 0;
				frontInsets.bottom = 0;
				frontInsets.left = 0;
				frontInsets.right = 0;
			}
			else
			{
				frontInsets.top = 0;
				frontInsets.bottom = 10;
				frontInsets.left = 0;
				frontInsets.right = 10;
			}
			
			
			for(Object child : ((EditPart) getChildren().get(1)).getChildren() ) {
				((GraphicalEditPart) child).notifyChanged(new NotificationImpl(Notification.NO_FEATURE_ID, 0, 0));
			}
			
			IFigure rectangleFront = (IFigure) ((IFigure) getFigure().getChildren().get(0)).getChildren().get(1);
			rectangleFront =  (IFigure) rectangleFront.getChildren().get(0);
			IFigure rectangleContent = (IFigure) rectangleFront.getChildren().get(1);
			rectangleContent = (IFigure) rectangleContent.getChildren().get(1);
			ShapeCompartmentFigure upperCompartment = (ShapeCompartmentFigure) rectangleContent.getChildren().get(0);
			upperCompartment.getScrollPane().setHorizontalScrollBarVisibility(ScrollPane.NEVER);
			upperCompartment.getScrollPane().setVerticalScrollBarVisibility(ScrollPane.NEVER);
			
			
	}
	
	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		updateFigure();
		super.refreshVisuals();
	}

}
