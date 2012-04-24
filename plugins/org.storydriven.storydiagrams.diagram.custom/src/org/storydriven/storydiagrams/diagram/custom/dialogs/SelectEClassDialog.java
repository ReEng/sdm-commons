package org.storydriven.storydiagrams.diagram.custom.dialogs;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.diagram.custom.providers.ResourcesContentProvider;
import org.storydriven.storydiagrams.diagram.custom.providers.ResourcesLabelProvider;

public class SelectEClassDialog extends AbstractTreeSelectionDialog<EClass> {

	private Activity activity;

	public SelectEClassDialog() {
		super("Select Classifier", "Select EClass", "Select the EClass for the Object.");
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	@Override
	protected String getNoElementErrorMessage() {
		return "You have to select an EClass!";
	}

	@Override
	protected boolean isValid(Object element) {
		return element instanceof EClass;
	}

	@Override
	protected IBaseLabelProvider getLabelProvider() {
		return new ResourcesLabelProvider();
	}

	@Override
	protected IContentProvider getContentProvider() {
		return new ResourcesContentProvider();
	}

	@Override
	protected Object getInput() {
		return activity;
	}

}
