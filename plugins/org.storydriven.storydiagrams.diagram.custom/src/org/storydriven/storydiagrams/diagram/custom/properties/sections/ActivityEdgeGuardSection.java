package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.EdgeGuard;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractEEnumRadioSection;
import org.storydriven.storydiagrams.diagram.custom.util.ValidationUtil;

public class ActivityEdgeGuardSection extends AbstractEEnumRadioSection<EdgeGuard> {
	@Override
	protected String getDescription() {
		return "Edge Guard";
	}

	@Override
	protected EStructuralFeature getFeature() {
		return ActivitiesPackage.Literals.ACTIVITY_EDGE__GUARD;
	}

	@Override
	protected boolean isVertical() {
		return true;
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
