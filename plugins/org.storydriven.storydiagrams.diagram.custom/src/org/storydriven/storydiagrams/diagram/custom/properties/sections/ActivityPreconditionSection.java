package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.MatchingStoryNode;
import org.storydriven.storydiagrams.diagram.custom.ResourceManager;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractEListComboSection;
import org.storydriven.storydiagrams.diagram.custom.util.TextUtil;

public class ActivityPreconditionSection extends AbstractEListComboSection<MatchingStoryNode> {
	@Override
	protected List<MatchingStoryNode> getItems() {
		List<MatchingStoryNode> nodes = new ArrayList<MatchingStoryNode>();
		List<Activity> activities = ResourceManager.get((Activity) getElement()).getActivities();

		for (Activity activity : activities) {
			if (!activity.equals(getElement())) {
				TreeIterator<Object> it = EcoreUtil.getAllContents(activity, true);
				while (it.hasNext()) {
					Object element = (Object) it.next();
					if (element instanceof MatchingStoryNode) {
						nodes.add((MatchingStoryNode) element);
					}
				}
			}
		}

		return nodes;
	}

	@Override
	protected boolean isShowSearchButton() {
		return false;
	}

	@Override
	protected void handleSearchButtonClicked() {
		System.out.println("open the dialog");
	}

	@Override
	protected String getLabelText() {
		return "Precondition";
	}

	@Override
	protected EStructuralFeature getFeature() {
		return ActivitiesPackage.Literals.ACTIVITY__PRECONDITION;
	}

	@Override
	protected String getText(MatchingStoryNode element) {
		return TextUtil.getText(element);
	}
}
