package org.storydriven.storydiagrams.diagram.custom.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.storydriven.core.Extension;
import org.storydriven.storydiagrams.activities.ActivitiesFactory;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.OperationExtension;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEditPart;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsDiagramEditor;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsDiagramEditorPlugin;

public class ShowActivityForEOperationHandler extends AbstractHandler {
	private EOperation operation;
	private EAnnotation annotation;
	private OperationExtension extension;
	private Activity activity;
	private Diagram diagram;
	private View view;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);

		// reset handler state
		view = null;
		operation = null;
		annotation = null;
		extension = null;
		activity = null;
		diagram = null;

		// find view element
		view = getView(selection);
		if (view == null) {
			return null;
		}

		// find operation
		if (view.getElement() instanceof EOperation) {
			operation = (EOperation) view.getElement();
		}
		if (operation == null) {
			return null;
		}

		// find annotation
		annotation = operation.getEAnnotation(Extension.EXTENSION_SOURCE_URI);

		// find operation extension
		if (annotation != null) {
			for (EObject content : annotation.getContents()) {
				if (content instanceof OperationExtension) {
					extension = (OperationExtension) content;
					break;
				}
			}
		}

		// find activity
		if (extension != null) {
			activity = extension.getOwnedActivity();
		}

		// find diagram
		if (activity != null) {
			for (EObject content : view.getDiagram().eResource().getContents()) {
				if (content instanceof Diagram) {
					if (activity.equals(((Diagram) content).getElement())) {
						diagram = (Diagram) content;
					}
				}
			}
		}

		// execute command when diagram could not be found
		if (diagram == null) {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(operation);
			RecordingCommand command = new RecordingCommand(editingDomain) {
				@Override
				protected void doExecute() {
					// create annotation and extension
					if (annotation == null || extension == null) {
						extension = ActivitiesFactory.eINSTANCE.createOperationExtension();
						extension.setOperation(operation);
						annotation = operation.getEAnnotation(Extension.EXTENSION_SOURCE_URI);
					}

					// create activity
					if (activity == null) {
						activity = ActivitiesFactory.eINSTANCE.createActivity();
						extension.setOwnedActivity(activity);
					}

					// create diagram
					if (diagram == null) {
						String mid = ActivityEditPart.MODEL_ID;
						PreferencesHint phint = StorydiagramsDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;

						diagram = ViewService.createDiagram(activity, mid, phint);
						diagram.setElement(activity);
						view.eResource().getContents().add(diagram);
					}
				}
			};
			editingDomain.getCommandStack().execute(command);

			// save
			HandlerUtil.getActiveEditor(event).doSave(new NullProgressMonitor());
		}

		// open editor
		IWorkbenchWindow ww = HandlerUtil.getActiveWorkbenchWindow(event);
		if (ww != null) {
			IWorkbenchPage page = ww.getActivePage();

			if (page != null) {
				IEditorInput input = new URIEditorInput(EcoreUtil.getURI(diagram));
				try {
					page.openEditor(input, getEditorId());
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}
		}

		return null;
	}

	protected String getEditorId() {
		return StorydiagramsDiagramEditor.ID;
	}

	private View getView(Object source) {
		if (source instanceof IStructuredSelection) {
			return getView(((IStructuredSelection) source).getFirstElement());
		}

		if (source instanceof EditPart) {
			return getView(((EditPart) source).getModel());
		}

		if (source instanceof View) {
			return (View) source;
		}

		return null;
	}
}
