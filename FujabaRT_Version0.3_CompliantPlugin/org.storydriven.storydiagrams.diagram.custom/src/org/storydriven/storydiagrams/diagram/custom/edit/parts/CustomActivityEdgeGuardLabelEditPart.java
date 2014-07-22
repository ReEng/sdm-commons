package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.diagram.custom.util.LabelUtil;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEdgeGuardLabelEditPart;

public class CustomActivityEdgeGuardLabelEditPart extends ActivityEdgeGuardLabelEditPart {
	public CustomActivityEdgeGuardLabelEditPart(View view) {
		super(view);
	}

	protected void handleNotificationEvent(Notification event) {
		updateLabel();
		super.handleNotificationEvent(event);
	}

	protected void refreshVisuals() {
		super.refreshVisuals();
		updateLabel();
	}

	private void updateLabel() {
		((WrappingLabel) getFigure()).setTextWrap(true);
		((WrappingLabel) getFigure()).setTextJustification(PositionConstants.CENTER);

		ActivityEdge edge = (ActivityEdge) ((View) getModel()).getElement();

		setLabelText(LabelUtil.getText(edge));
	}
}
