package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractEBooleanSection;

public class StoryNodeForEachSection extends AbstractEBooleanSection {
	@Override
	protected void execute(Command command) {
		super.execute(command);
		refreshTitleBar();
	}

	@Override
	protected String getButtonText() {
		return "For Each Node";
	}

	@Override
	protected EStructuralFeature getFeature() {
		return ActivitiesPackage.Literals.STORY_NODE__FOR_EACH;
	}
}
