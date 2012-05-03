package org.storydriven.storydiagrams.diagram.custom.dialogs;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityCallNode;
import org.storydriven.storydiagrams.diagram.custom.ResourceManager;
import org.storydriven.storydiagrams.diagram.custom.providers.CalledActivitiesLabelProvider;
import org.storydriven.storydiagrams.diagram.custom.util.ActivityUtil;

public class SelectActivityDialog extends AbstractTreeSelectionDialog<Activity> {
	private Collection<Activity> activities;
	private ActivityCallNode node;

	public SelectActivityDialog() {
		super("Called Activity", "Select Called Activity",
				"Select the activity that should be added to the calls of the node.");
	}

	public void setActivityCallNode(ActivityCallNode node) {
		this.node = node;
		setResourceSet(node.eResource().getResourceSet());
	}

	@Override
	protected boolean hasLoadButton() {
		return true;
	}

	@Override
	protected Object getInput() {
		Activity activity = ActivityUtil.getActivity(node);

		activities = new HashSet<Activity>();
		activities.addAll(ResourceManager.get(activity).getActivities());
		activities.removeAll(node.getCalledActivities());

		return node.eResource().getResourceSet();
	}

	@Override
	protected String validate(Object element) {
		if (ActivityUtil.getActivity(node).equals(element)) {
			return "You cannot call the activity where the node is contained in!";
		}
		if (node.getCalledActivities().contains(element)) {
			return "The selected activity is already called by the node!";
		}
		if (!(element instanceof Activity)) {
			return "You have to select an activity!";
		}
		return null;
	}

	@Override
	protected ViewerFilter getViewerFilter() {
		return new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parent, Object element) {
				if (element instanceof Activity) {
					return true;
				}
				if (element instanceof Resource) {
					for (EObject content : ((Resource) element).getContents()) {
						if (select(viewer, element, content)) {
							return true;
						}
					}
				}
				if (element instanceof EObject) {
					for (EObject content : ((EObject) element).eContents()) {
						if (select(viewer, element, content)) {
							return true;
						}
					}
				}
				return false;
			}
		};
	}

	@Override
	protected ILabelProvider getLabelProvider() {
		return new CalledActivitiesLabelProvider();
	}
}
