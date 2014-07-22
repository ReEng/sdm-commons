package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.diagram.custom.util.SdmUtility;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableOperatorLabelEditPart;
import org.storydriven.storydiagrams.patterns.LinkVariable;

public class CustomLinkVariableOperatorLabelEditPart extends LinkVariableOperatorLabelEditPart {
	public CustomLinkVariableOperatorLabelEditPart(View view) {
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
		((WrappingLabel) getFigure()).setAlignment(PositionConstants.CENTER);
		((WrappingLabel) getFigure()).setTextAlignment(PositionConstants.CENTER);
		((WrappingLabel) getFigure()).setTextJustification(PositionConstants.CENTER);
		((WrappingLabel) getFigure()).setAlignment(PositionConstants.CENTER);
		((WrappingLabel) getFigure()).setTextWrap(true);

		LinkVariable link = (LinkVariable) ((View) getModel()).getElement();

		setLabelText(SdmUtility.getOperatorText(link));
		setFontColor(SdmUtility.getColor(link));
	}
}
