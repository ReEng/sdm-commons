package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;

import de.upb.swt.core.ui.properties.sections.AbstractCheckboxSection;

public class StoryNodeForEachSection extends AbstractCheckboxSection {
	@Override
	protected void postExecute() {
		refreshTitle();
	}

	@Override
	protected EStructuralFeature getFeature() {
		return ActivitiesPackage.Literals.STORY_NODE__FOR_EACH;
	}

	@Override
	protected String getLabelText() {
		return "For Each Node";
	}
}
