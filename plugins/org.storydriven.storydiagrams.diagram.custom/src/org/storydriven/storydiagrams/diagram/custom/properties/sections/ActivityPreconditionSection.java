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
import org.storydriven.storydiagrams.diagram.custom.util.TextUtil;

import de.upb.swt.core.ui.properties.sections.AbstractComboSection;

public class ActivityPreconditionSection extends AbstractComboSection<MatchingStoryNode> {
	private SelectActivityPreconditionDialog dialog;

	public ActivityPreconditionSection() {
		dialog = new SelectActivityPreconditionDialog();
	}

	@Override
	protected void handleButtonClicked() {
		dialog.setInput(getEditingDomain().getResourceSet());
		dialog.setSelectedElement(getElement().getPrecondition());
		if (dialog.open() == Window.OK) {
			set(dialog.getElement());
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
	protected boolean shouldShowButton() {
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
