package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.core.CorePackage;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.StartNode;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractEStringSection;

public class NamedElementNameSection extends AbstractEStringSection {
	@Override
	protected EStructuralFeature getFeature() {
		return CorePackage.Literals.NAMED_ELEMENT__NAME;
	}

	@Override
	protected void execute(Command command) {
		super.execute(command);

		refreshTitleBar();

		// refresh start node label
		if (getElement() instanceof Activity) {
			for (ActivityNode node : ((Activity) getElement()).getOwnedActivityNodes()) {
				if (node instanceof StartNode) {
//					node.eNotify(new NotificationImpl(Notification.SET, null, ((Activity) getElement()).getName()));
				}
			}
		}
	}

	@Override
	protected String getLabelText() {
		return "Name";
	}
}
