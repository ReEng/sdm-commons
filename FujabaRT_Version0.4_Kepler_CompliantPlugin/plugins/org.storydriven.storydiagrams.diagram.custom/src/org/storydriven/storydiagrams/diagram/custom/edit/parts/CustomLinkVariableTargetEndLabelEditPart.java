package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.diagram.custom.util.SdmUtility;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableTargetEndLabelEditPart;
import org.storydriven.storydiagrams.patterns.LinkVariable;

public class CustomLinkVariableTargetEndLabelEditPart extends LinkVariableTargetEndLabelEditPart {
	public CustomLinkVariableTargetEndLabelEditPart(View view) {
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

	protected void updateFigure() {
		WrappingLabel label = (WrappingLabel) getFigure();
		label.setAlignment(PositionConstants.RIGHT);
		label.setTextAlignment(PositionConstants.RIGHT);
		label.setTextJustification(PositionConstants.RIGHT);
		label.setAlignment(PositionConstants.RIGHT);
		label.setTextWrap(true);

		LinkVariable link = (LinkVariable) ((View) getModel()).getElement();

		String text = ""; //$NON-NLS-1$
		if (link.getTargetEnd() != null) {
			text = link.getTargetEnd().getName();
		}

		setLabelText(text);
		setFontColor(SdmUtility.getColor(link));
	}
}
