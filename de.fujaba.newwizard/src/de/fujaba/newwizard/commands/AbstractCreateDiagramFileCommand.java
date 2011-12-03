package de.fujaba.newwizard.commands;

import java.io.IOException;
import java.util.LinkedList;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.ui.PartInitException;
import org.storydriven.modeling.ExtendableElement;

import de.fujaba.modelinstance.ModelElementCategory;
import de.fujaba.modelinstance.ModelInstancePlugin;
import de.fujaba.modelinstance.RootNode;
import de.fujaba.newwizard.FujabaNewwizardPlugin;
import de.fujaba.newwizard.IFujabaEditorDescription;
import de.fujaba.newwizard.Messages;
import de.fujaba.newwizard.diagrams.DiagramEditorUtil;

public abstract class AbstractCreateDiagramFileCommand extends
		AbstractCreateFileCommand implements IFujabaEditorDescription {

	@Override
	protected void createContents(URI selectedURI, IFile newFile) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		ResourceSet resourceSet = editingDomain.getResourceSet();
		EObject diagramRoot = null;
		try {
			Resource resource = resourceSet.getResource(selectedURI, true);
			diagramRoot = (EObject) resource.getContents().get(0);
		} catch (WrappedException ex) {
			FujabaNewwizardPlugin.getDefault().logError(
					"Unable to load resource: " + selectedURI, ex); //$NON-NLS-1$
		}

		createDiagram(newFile, diagramRoot, editingDomain);
	}

	// Copied from generated *NewDiagramFileWizard.performFinish()
	protected void createDiagram(IFile diagramFile, final EObject diagramRoot,
			TransactionalEditingDomain myEditingDomain) {
		LinkedList<IFile> affectedFiles = new LinkedList<IFile>();
		setCharset(diagramFile);
		affectedFiles.add(diagramFile);
		URI diagramModelURI = URI.createPlatformResourceURI(diagramFile
				.getFullPath().toString(), true);
		ResourceSet resourceSet = myEditingDomain.getResourceSet();
		final Resource diagramResource = resourceSet
				.createResource(diagramModelURI);
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				myEditingDomain, "Initializing diagram contents", affectedFiles) {

			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				// int diagramVID =
				// de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
				// .getDiagramVisualID(diagramRootElementSelectionPage
				// .getModelElement());
				// if (diagramVID !=
				// de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID)
				// {
				// return CommandResult
				// .newErrorCommandResult(de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.Messages.MumlNewDiagramFileWizard_IncorrectRootError);
				// }
				ModelElementCategory category = null;
				if (diagramRoot instanceof RootNode) {
					RootNode rootNode = (RootNode) diagramRoot;
					String categoryKey = getModelElementCategoryKey();
					category = ModelInstancePlugin.getInstance()
							.getModelElementCategoryRegistry()
							.getModelElementCategory(rootNode, categoryKey);

				} else {
					// MessageDialog.openError(getShell(), "Error",
					// "Model file loading fail");
					return CommandResult
							.newErrorCommandResult("Model file loading fail");
				}
				
				EObject diagramElement = createDiagramElement();
				
				if (diagramElement != null) {
					category.getModelElements().add((ExtendableElement) diagramElement);
				} else {
					diagramElement = category;
				}

				Diagram diagram = ViewService.createDiagram(diagramElement,
						getModelId(), getDiagramPreferencesHint());
				if (diagram == null) {
					return CommandResult.newErrorCommandResult("Diagram could not be created.");
				}

				diagramResource.getContents().add(diagram);
				return CommandResult.newOKCommandResult();
			}
		};
		try {
			IStatus status = OperationHistoryFactory.getOperationHistory().execute(command,
					new NullProgressMonitor(), null);
			if (status.isOK()) {
				diagramResource.save(DiagramEditorUtil.getSaveOptions());
				Resource modelResource = diagramRoot.eResource();
				modelResource.save(DiagramEditorUtil.getSaveOptions());
				DiagramEditorUtil.openDiagram(diagramResource, getEditorId());
			}

		} catch (ExecutionException e) {
			FujabaNewwizardPlugin.getDefault().logError(
					"Unable to create model and diagram", e); //$NON-NLS-1$
		} catch (IOException ex) {
			FujabaNewwizardPlugin.getDefault().logError(
					"Save operation failed for: " + diagramModelURI, ex); //$NON-NLS-1$
		} catch (PartInitException ex) {
			ErrorDialog.openError(getShell(),
					Messages.CreationWizardOpenEditorError, null,
					ex.getStatus());
		}
	}

	@Override
	protected String getExtension() {
		return getDiagramFileExtension();
	}

	@Override
	protected void setCharset(IFile file) {
		DiagramEditorUtil.setCharset(file);
	}

}
