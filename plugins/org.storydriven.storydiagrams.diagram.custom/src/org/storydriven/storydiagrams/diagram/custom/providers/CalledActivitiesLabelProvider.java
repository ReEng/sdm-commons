package org.storydriven.storydiagrams.diagram.custom.providers;

import org.eclipse.swt.graphics.Image;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityCallNode;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;
import org.storydriven.storydiagrams.diagram.custom.util.TextUtil;

public class CalledActivitiesLabelProvider extends ComposedAdapterFactoryLabelProvider {
	private ActivityCallNode node;

	@Override
	public String getText(Object element) {
		if (element instanceof Activity) {
			return TextUtil.getText((Activity) element);
		}
		return super.getText(element);
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof Activity) {
			if (node != null && element.equals(node.getCallee())) {
				return DiagramImages.getImage(DiagramImages.ACTIVITY_CALL_NODE);
			}
			return DiagramImages.getImage(DiagramImages.ACTIVITY);
		}
		return super.getImage(element);
	}

	public void setActivityCallNode(ActivityCallNode node) {
		this.node = node;
	}
}
