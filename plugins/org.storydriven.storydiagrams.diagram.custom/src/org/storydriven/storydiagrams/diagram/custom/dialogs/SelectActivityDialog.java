package org.storydriven.storydiagrams.diagram.custom.dialogs;

import java.util.Collection;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.diagram.custom.providers.ActivitiesLabelProvider;
import org.storydriven.storydiagrams.diagram.custom.providers.CalledActivitiesContentProvider;

public class SelectActivityDialog extends AbstractTreeSelectionDialog<Activity> {
	private Collection<Activity> activities;

	public SelectActivityDialog() {
		super("Called Activity", "Select Activity", "Select the activity...");
	}

	public void setInput(Collection<Activity> activities) {
		this.activities = activities;
	}

	@Override
	protected Object getInput() {
		return activities;
	}

	@Override
	protected String validate(Object element) {
		if (!activities.contains(element)) {
			return "You have to select an activity!";
		}
		return null;
	}

	@Override
	protected ILabelProvider getLabelProvider() {
		return new ActivitiesLabelProvider();
	}

	@Override
	protected ITreeContentProvider getContentProvider() {
		return new CalledActivitiesContentProvider();
	}
}
