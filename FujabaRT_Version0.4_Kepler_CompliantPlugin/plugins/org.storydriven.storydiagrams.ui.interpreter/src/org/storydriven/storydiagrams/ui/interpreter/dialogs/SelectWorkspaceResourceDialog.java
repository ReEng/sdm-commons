package org.storydriven.storydiagrams.ui.interpreter.dialogs;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.model.WorkbenchViewerComparator;

public class SelectWorkspaceResourceDialog extends AbstractTreeSelectionDialog<IFile> {
	public SelectWorkspaceResourceDialog() {
		super("Select Workspace Resource", "Select Host Graph Resource",
				"Select the resource that should be interpreted.");
	}

	@Override
	protected ITreeContentProvider getContentProvider() {
		return new WorkbenchContentProvider();
	}

	@Override
	protected Object getInput() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}

	@Override
	protected ILabelProvider getLabelProvider() {
		return new WorkbenchLabelProvider();
	}

	@Override
	protected ViewerComparator getViewerComparator() {
		return new WorkbenchViewerComparator();
	}

	@Override
	protected ViewerFilter getViewerFilter() {
		return new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parent, Object element) {
				if (element instanceof IResource) {
					return !((IResource) element).getName().startsWith(".");
				}
				return true;
			}
		};
	}

	@Override
	protected String getErrorMessage(Object element) {
		if (element instanceof IFile) {
			return null;
		}
		return "You have to select a file!";
	}
}
