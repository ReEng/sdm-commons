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
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.model.WorkbenchViewerComparator;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;

public class SelectEPackageFromWorkspaceDialog extends AbstractTreeSelectionDialog<IFile> {
	private static final String TITLE = "Add Workspace Packages";
	private static final String DESCRIPTION = "Select the resource which packages should be added to the type model.";

	public SelectEPackageFromWorkspaceDialog() {
		super(TITLE, DESCRIPTION);
		setTitleImage(DiagramImages.getImage(DiagramImages.BANNER_ADD_EPACKAGE_WORKSPACE));
	}

	public void setResourceSet(ResourceSet resourceSet) {
		super.setResourceSet(resourceSet);

		Collection<IFile> hidden = new HashSet<IFile>();

		for (Resource resource : resourceSet.getResources()) {
			if (resource.getURI().isPlatformResource()) {
				String path = resource.getURI().toPlatformString(true);
				IResource iResource = getInput().findMember(path);
				if (iResource instanceof IFile) {
					hidden.add((IFile) iResource);
				}
			}
		}
		setHiddenElements(hidden);
	}

	@Override
	protected IWorkspaceRoot getInput() {
		return ResourcesPlugin.getWorkspace().getRoot();
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
