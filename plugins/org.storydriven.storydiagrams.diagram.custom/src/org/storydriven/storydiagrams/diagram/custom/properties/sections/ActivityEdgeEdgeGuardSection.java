package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.EdgeGuard;
import org.storydriven.storydiagrams.diagram.custom.util.ValidationUtil;

import de.upb.swt.core.ui.properties.sections.AbstractRadioGroupSection;

public class ActivityEdgeEdgeGuardSection extends AbstractRadioGroupSection<EdgeGuard> {
	@Override
	protected String getLabelText() {
		return "Edge Guard";
	}

	@Override
	protected EStructuralFeature getFeature() {
		return ActivitiesPackage.Literals.ACTIVITY_EDGE__GUARD;
	}

	@Override
	protected List<EdgeGuard> getValues() {
		return EdgeGuard.VALUES;
	}

	@Override
	protected boolean isEnabled(EdgeGuard guard) {
		ActivityEdge edge = (ActivityEdge) getElement();
		return ValidationUtil.isValid(edge, guard);
	}
}
