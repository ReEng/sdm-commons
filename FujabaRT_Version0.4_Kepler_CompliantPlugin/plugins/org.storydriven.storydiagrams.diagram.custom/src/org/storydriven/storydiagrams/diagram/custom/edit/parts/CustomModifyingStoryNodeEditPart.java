package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.ScrollPane;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.activities.StoryNode;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeEditPart;

public class CustomModifyingStoryNodeEditPart extends ModifyingStoryNodeEditPart {
	public CustomModifyingStoryNodeEditPart(View view) {
		super(view);
	}

	@Override
	public void refresh() {
		super.refresh();
		updateFigure(null);
	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		updateFigure(event);
		super.refreshVisuals();
	}

	private void updateFigure(Notification event) {
		if (((StoryNode) ((View) getModel()).getElement()) != null) {
			boolean isForEach = ((StoryNode) ((View) getModel()).getElement()).isForEach();

			RectangleFigure frontRectangle = (RectangleFigure) getPrimaryShape().getChildren().get(1);

			Insets insets = frontRectangle.getBorder().getInsets(frontRectangle);

			if (!isForEach) {
				insets.top = 0;
				insets.bottom = 0;
				insets.left = 0;
				insets.right = 0;
			} else {
				insets.top = 0;
				insets.bottom = 10;
				insets.left = 0;
				insets.right = 10;
			}

			// resize the pattern compartment
			RoundedRectangle patternRectangle = getPrimaryShape().getStoryNodePatternRectangle();
			if (!patternRectangle.getChildren().isEmpty()) {
				ResizableCompartmentFigure patternCompartment = (ResizableCompartmentFigure) patternRectangle
						.getChildren().get(0);
				patternCompartment.getScrollPane().setHorizontalScrollBarVisibility(ScrollPane.NEVER);
				patternCompartment.getScrollPane().setVerticalScrollBarVisibility(ScrollPane.NEVER);
				patternCompartment.setLayoutManager(new BorderLayout());

				if (!((EditPart) getChildren().get(1)).getChildren().isEmpty()) {
					patternCompartment.add(((AbstractGraphicalEditPart) ((EditPart) getChildren().get(1)).getChildren()
							.get(0)).getFigure(), BorderLayout.CENTER);
				}
			}
		}
	}
}
