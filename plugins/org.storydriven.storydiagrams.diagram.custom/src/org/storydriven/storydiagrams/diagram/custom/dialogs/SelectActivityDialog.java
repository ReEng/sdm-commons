package org.storydriven.storydiagrams.diagram.custom.dialogs;

import java.util.Collection;

import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
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
	protected boolean isValid(Object element) {
		return element instanceof Activity && activities.contains(element);
	}

	@Override
	protected String getNoElementErrorMessage() {
		return "You have to select an activity to be called!";
	}

	@Override
	protected IBaseLabelProvider getLabelProvider() {
		return new ActivitiesLabelProvider();
	}

	@Override
	protected IContentProvider getContentProvider() {
		return new CalledActivitiesContentProvider();
	}
}
