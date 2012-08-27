package org.storydriven.storydiagrams.diagram.custom.dialogs;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;

public class LoadResourceDialog extends AbstractTreeSelectionDialog<IFile> {
	private Collection<IFile> filteredFiles;

	public LoadResourceDialog() {
		super("Load Resource", "Load Workspace Resource", "Select the resource which should be loaded.");
		setTitleImage(DiagramImages.getImage(DiagramImages.BANNER_LOAD_RESOURCE));
		filteredFiles = new HashSet<IFile>();
	}

	public void setResourceSet(ResourceSet resourceSet) {
		filteredFiles.clear();

		for (Resource resource : resourceSet.getResources()) {
			if (resource.getURI().isPlatformResource()) {
				String path = resource.getURI().toPlatformString(true);
				IResource iResource = getInput().findMember(path);
				if (iResource instanceof IFile) {
					filteredFiles.add((IFile) iResource);
				}
			}
		}
	}

	@Override
	protected IWorkspaceRoot getInput() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}

	@Override
	protected ViewerFilter getViewerFilter() {
		return new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parent, Object element) {
				if (element instanceof IResource) {
					return !((IResource) element).getName().startsWith(".") && !filteredFiles.contains(element);
				}
				return false;
			}
		};
	}

	@Override
	protected ITreeContentProvider getContentProvider() {
		return new WorkbenchContentProvider();
	}

	@Override
	protected ILabelProvider getLabelProvider() {
		return new WorkbenchLabelProvider();
	}

	@Override
	protected String getErrorMessage(Object element) {
		if (element instanceof IFile) {
			return null;
		}
		return "You have to select a file!";
	}
}
