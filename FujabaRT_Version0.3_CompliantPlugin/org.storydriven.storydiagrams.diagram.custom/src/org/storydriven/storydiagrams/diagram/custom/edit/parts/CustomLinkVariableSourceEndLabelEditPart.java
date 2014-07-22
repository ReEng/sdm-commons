package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.diagram.custom.util.SdmUtility;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableSourceEndLabelEditPart;
import org.storydriven.storydiagrams.patterns.LinkVariable;

public class CustomLinkVariableSourceEndLabelEditPart extends LinkVariableSourceEndLabelEditPart {
	public CustomLinkVariableSourceEndLabelEditPart(View view) {
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
		WrappingLabel label = (WrappingLabel) getFigure();
		label.setAlignment(PositionConstants.LEFT);
		label.setTextAlignment(PositionConstants.LEFT);
		label.setTextJustification(PositionConstants.LEFT);
		label.setAlignment(PositionConstants.LEFT);
		label.setTextWrap(true);

		LinkVariable link = (LinkVariable) ((View) getModel()).getElement();

		String text = ""; //$NON-NLS-1$
		if (link.getSourceEnd() != null) {
			text = link.getSourceEnd().getName();
		}

		setLabelText(text);
		setFontColor(SdmUtility.getColor(link));
	}
}
