package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.NonResizableEditPolicyEx;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.activities.InitialNode;
import org.storydriven.storydiagrams.diagram.custom.util.TextUtil;
import org.storydriven.storydiagrams.diagram.edit.parts.InitialNodeEditPart;

public class CustomInitialNodeEditPart extends InitialNodeEditPart {
	public CustomInitialNodeEditPart(View view) {
		super(view);
	}

	@Override
	public EditPolicy getPrimaryDragEditPolicy() {
		return new NonResizableEditPolicyEx();
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		updateLabel();
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		updateLabel();
	}

	private void updateLabel() {
		InitialNode node = (InitialNode) ((View) getModel()).getElement();
		getPrimaryShape().getInitialNodeLabel().setText(TextUtil.getText(node));
	}
}
