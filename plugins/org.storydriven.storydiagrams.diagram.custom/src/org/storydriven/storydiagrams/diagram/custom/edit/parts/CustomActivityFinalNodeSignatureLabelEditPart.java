package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.activities.ActivityFinalNode;
import org.storydriven.storydiagrams.diagram.custom.util.TextUtil;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityFinalNodeLabelEditPart;

public class CustomActivityFinalNodeSignatureLabelEditPart extends ActivityFinalNodeLabelEditPart {
	public CustomActivityFinalNodeSignatureLabelEditPart(View view) {
		super(view);
	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		updateFigure();
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		updateFigure();
	}

	private void updateFigure() {
		ActivityFinalNode node = (ActivityFinalNode) ((View) getModel()).getElement();

		setLabelText(TextUtil.getText(node));
	}
}
