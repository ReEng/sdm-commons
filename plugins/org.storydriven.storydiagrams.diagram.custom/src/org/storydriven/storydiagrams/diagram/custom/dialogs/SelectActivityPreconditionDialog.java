package org.storydriven.storydiagrams.diagram.custom.dialogs;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.storydriven.storydiagrams.activities.MatchingStoryNode;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;
import org.storydriven.storydiagrams.diagram.custom.providers.ComposedAdapterFactoryLabelProvider;

public class SelectActivityPreconditionDialog extends AbstractTreeSelectionDialog<MatchingStoryNode> {
	private ResourceSet resourceSet;

	public SelectActivityPreconditionDialog() {
		super("Activity Precodition", "Select Activity Precondition", "Select the pattern that must be matched as condition of the activity.");
		setTitleImage(DiagramImages.getImage(DiagramImages.BANNER_SELECT_PRECONDITION));
	}

	public void setInput(ResourceSet resourceSet) {
		setResourceSet(resourceSet);
		this.resourceSet = resourceSet;
	}

	@Override
	protected ILabelProvider getLabelProvider() {
		return new ComposedAdapterFactoryLabelProvider();
	}

	@Override
	protected boolean hasLoadButton() {
		return true;
	}

	protected ViewerFilter getViewerFilter() {
		return new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parent, Object element) {
				if (element instanceof MatchingStoryNode) {
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
	protected Object getInput() {
		return resourceSet;
	}

	@Override
	protected String getErrorMessage(Object element) {
		if (element instanceof MatchingStoryNode) {
			return null;
		}
		return "You have to select an Matching Story Node!";
	}

}
