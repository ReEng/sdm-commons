package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractEBooleanSection;

public class ActivityFinalNodeSuccessSection extends AbstractEBooleanSection {
	@Override
	protected EStructuralFeature getFeature() {
		return ActivitiesPackage.Literals.ACTIVITY_FINAL_NODE__SUCCESS;
	}

	@Override
	protected String getButtonText() {
		return "Success";
	}
}
