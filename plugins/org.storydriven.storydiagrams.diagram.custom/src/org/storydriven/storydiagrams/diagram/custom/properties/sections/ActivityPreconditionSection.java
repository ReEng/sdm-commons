package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.window.Window;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.MatchingStoryNode;
import org.storydriven.storydiagrams.diagram.custom.dialogs.SelectActivityPreconditionDialog;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractEListComboSection;
import org.storydriven.storydiagrams.diagram.custom.util.TextUtil;

public class ActivityPreconditionSection extends AbstractEListComboSection<MatchingStoryNode> {
	private SelectActivityPreconditionDialog dialog;

	public ActivityPreconditionSection() {
		dialog = new SelectActivityPreconditionDialog();
	}

	@Override
	protected void handleSearchButtonClicked() {
		dialog.setInput(getEditingDomain().getResourceSet());
		dialog.setElement(getElement().getPrecondition());
		if (dialog.open() == Window.OK) {
			execute(dialog.getElement());
		}
		refresh();
	}

	@Override
	protected Activity getElement() {
		return (Activity) super.getElement();
	}

	@Override
	protected List<MatchingStoryNode> getItems() {
		List<MatchingStoryNode> nodes = new ArrayList<MatchingStoryNode>();

		// add null
		nodes.add(null);

		TreeIterator<Object> it = EcoreUtil.getAllContents(getEditingDomain().getResourceSet(), true);
		while (it.hasNext()) {
			Object element = (Object) it.next();
			if (element instanceof MatchingStoryNode) {
				nodes.add((MatchingStoryNode) element);
			}
		}

		return nodes;
	}

	@Override
	protected boolean isShowSearchButton() {
		return true;
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
		if (element == null) {
			return EMPTY;
		}
		return TextUtil.getText(element);
	}
}
