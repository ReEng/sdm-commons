package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractEBooleanSection;

public class StopNodeFlowStopOnlySection extends AbstractEBooleanSection {
	@Override
	protected String getButtonText() {
		return "Flow Stop Only";
	}

	@Override
	protected EStructuralFeature getFeature() {
		return ActivitiesPackage.Literals.STOP_NODE__FLOW_STOP_ONLY;
	}
}
