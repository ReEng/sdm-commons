package org.storydriven.storydiagrams.ui.interpreter;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.ui.interpreter.wizards.InterpreteActivityWizard;

public class StartInterpreterHandler extends AbstractHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// check current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection && ((IStructuredSelection) selection).size() == 1) {
			IFile file = null;
			Activity activity = null;

			// check current selected element
			Object element = ((IStructuredSelection) selection).getFirstElement();
			if (element instanceof IFile) {
				file = (IFile) element;
			} else if (element instanceof Activity) {
				activity = (Activity) element;
			} else if (element instanceof IAdaptable) {
				EObject adapted = (EObject) ((IAdaptable) element).getAdapter(EObject.class);
				if (adapted instanceof Activity) {
					activity = (Activity) adapted;
				}
			}

			// get file of activity resource
			if (activity != null) {
				String path = activity.eResource().getURI().toPlatformString(true);
				Object resource = ResourcesPlugin.getWorkspace().getRoot().findMember(path);

				if (resource instanceof IFile) {
					file = (IFile) resource;
				}
			}

			// start wizard when appropriate
			if (file != null) {
				URI uri = null;
				if (activity != null) {
					uri = EcoreUtil.getURI(activity);
				}

				Shell shell = HandlerUtil.getActiveShell(event);
				IWizard wizard = new InterpreteActivityWizard(file, uri);
				new WizardDialog(shell, wizard).open();
			}
		}

		return null;
	}
}
