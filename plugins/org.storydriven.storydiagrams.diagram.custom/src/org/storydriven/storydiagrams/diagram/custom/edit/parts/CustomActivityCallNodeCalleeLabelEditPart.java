package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.activities.ActivityCallNode;
import org.storydriven.storydiagrams.diagram.custom.util.TextUtil;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityCallNodeCalleeLabelEditPart;

public class CustomActivityCallNodeCalleeLabelEditPart extends ActivityCallNodeCalleeLabelEditPart {
	public CustomActivityCallNodeCalleeLabelEditPart(View view) {
		super(view);
	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		updateFigure();
		super.handleNotificationEvent(event);
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		updateFigure();
	}

	private void updateFigure() {
		ActivityCallNode node = (ActivityCallNode) ((View) getModel()).getElement();

		setLabelText(TextUtil.getText(node));
	}
}
