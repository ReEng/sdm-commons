package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.activities.StatementNode;
import org.storydriven.storydiagrams.diagram.custom.util.TextUtil;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeExpressionLabelEditPart;

public class CustomStatementNodeExpressionLabelEditPart extends StatementNodeExpressionLabelEditPart {
	public CustomStatementNodeExpressionLabelEditPart(View view) {
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
		StatementNode node = (StatementNode) ((View) getModel()).getElement();

		setLabelText(TextUtil.getText(node.getStatementExpression()));
	}
}
