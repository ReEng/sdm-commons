package de.fujaba.newwizard.ui.commands;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.undo.CreateFileOperation;
import org.eclipse.ui.ide.undo.WorkspaceUndoUtil;

import de.fujaba.newwizard.diagrams.DiagramEditorUtil;

public abstract class AbstractCreateFileCommand extends AbstractHandler {
	private Shell shell;

	protected Shell getShell() {
		return shell;
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Get shell and uri of current selection
		shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		IResource workspaceResource = null;
		if (selection instanceof IStructuredSelection && !selection.isEmpty()) {
			workspaceResource = (IResource) ((IStructuredSelection) selection)
					.getFirstElement();

		}

		if (workspaceResource != null) {
			URI selectedFileURI = URI.createPlatformResourceURI(
					workspaceResource.getFullPath().toString(), true);

			URI trimmedURI = selectedFileURI;
			if (workspaceResource instanceof IFile) {
				trimmedURI = trimmedURI.trimSegments(1);
			}
			
			// Get a unique filename for the new file
			IPath filePath = getFullPath(trimmedURI);
			
			
			String hint = URI.decode(selectedFileURI.trimFileExtension()
					.lastSegment());
			String fileName = getUniqueFilename(hint, getExtension(), filePath);

			// Create the new file
			IFile newFile = createNewFile(filePath, fileName, shell);

			// Put the contents into the file
			createContents(selectedFileURI, newFile);
		}
		return null;
	}

	protected abstract void createContents(URI selectedURI, IFile newFile);

	protected abstract String getExtension();

	protected abstract void setCharset(IFile file);

	// Copied from WizardNewFileCreationPage
	protected IFile createNewFile(IPath fullPath, String fileName,
			final Shell shell) {
		final IFile newFileHandle = createFileHandle(fullPath.append(fileName));
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) {
				CreateFileOperation op = new CreateFileOperation(newFileHandle,
						null, null, "New File");
				try {
					// see bug
					// https://bugs.eclipse.org/bugs/show_bug.cgi?id=219901
					// directly execute the operation so that the undo state is
					// not preserved. Making this undoable resulted in too many
					// accidental file deletions.
					op.execute(monitor,
							WorkspaceUndoUtil.getUIInfoAdapter(shell));
				} catch (final ExecutionException e) {
					shell.getDisplay().syncExec(new Runnable() {
						public void run() {
							if (e.getCause() instanceof CoreException) {
								ErrorDialog.openError(shell,
										"Creation problems", null,
										((CoreException) e.getCause())
												.getStatus());
							} else {
								MessageDialog.openError(shell,
										"Creation problems", NLS.bind(
												"Internal error: {0}", e
														.getCause()
														.getMessage()));
							}
						}
					});
				}
			}
		};

		try {
			if (newFileHandle != null) {
				PlatformUI.getWorkbench().getProgressService()
						.run(false, true, op);
			}
		} catch (InterruptedException e) {
			return null;
		} catch (InvocationTargetException e) {
			// Execution Exceptions are handled above but we may still get
			// unexpected runtime errors.
			MessageDialog.open(MessageDialog.ERROR, shell, "Creation problems",
					NLS.bind("Internal error: {0}", e.getTargetException()
							.getMessage()), SWT.SHEET);

			return null;
		}
		return newFileHandle;
	}

	protected IFile createFileHandle(IPath filePath) {
		return ResourcesPlugin.getWorkspace().getRoot().getFile(filePath);
	}

	protected IPath getFullPath(URI domainModelURI)
			throws IllegalArgumentException {
		if (domainModelURI.isPlatformResource()) {
			return new Path(domainModelURI.toPlatformString(
					true));
		} else if (domainModelURI.isFile()) {
			return new Path(domainModelURI.toFileString());
		} else {
			// TODO : use some default path
			throw new IllegalArgumentException(
					"Unsupported URI: " + domainModelURI); //$NON-NLS-1$
		}
	}

	protected String getUniqueFilename(String hint, String extension,
			IPath filePath) {
		return DiagramEditorUtil.getUniqueFileName(filePath, hint, extension);
	}

}
