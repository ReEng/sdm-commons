package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.EdgeGuard;
import org.storydriven.storydiagrams.diagram.custom.util.SdmUtility;
import org.storydriven.storydiagrams.diagram.custom.util.TextUtil;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEdgeGuardConstraintLabelEditPart;

public class CustomActivityEdgeGuardConstraintLabelEditPart extends ActivityEdgeGuardConstraintLabelEditPart {
	public CustomActivityEdgeGuardConstraintLabelEditPart(View view) {
		super(view);
	}

	protected void handleNotificationEvent(Notification event) {
		updateFigure();
		super.handleNotificationEvent(event);
	}

	protected void refreshVisuals() {
		super.refreshVisuals();
		updateFigure();
	}

	protected void updateFigure() {
		((WrappingLabel) getFigure()).setTextWrap(true);
		((WrappingLabel) getFigure()).setTextJustification(PositionConstants.CENTER);

		ActivityEdge edge = (ActivityEdge) ((View) getModel()).getElement();

		String text = "";
		if (EdgeGuard.BOOL.equals(edge.getGuard())) {
			text = TextUtil.getText(edge.getGuardExpression());
		} else if (edge.getGuard() != EdgeGuard.NONE) {
			text = SdmUtility.Guard2String(edge.getGuard());
		}

		setLabelText(format(text));
	}

	protected static String format(String text) {
		return "[ " + text + " ]";
	}
}
