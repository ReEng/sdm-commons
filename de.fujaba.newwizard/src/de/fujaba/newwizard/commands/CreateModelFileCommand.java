package de.fujaba.newwizard.commands;

import java.io.IOException;
import java.util.LinkedList;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;

import de.fujaba.modelinstance.ModelinstanceFactory;
import de.fujaba.modelinstance.RootNode;
import de.fujaba.newwizard.FujabaNewwizardPlugin;
import de.fujaba.newwizard.diagrams.DiagramEditorUtil;

public class CreateModelFileCommand extends AbstractCreateFileCommand {

	@Override
	protected void createContents(URI selectedURI, IFile newFile) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		ResourceSet resourceSet = editingDomain.getResourceSet();
		LinkedList<IFile> affectedFiles = new LinkedList<IFile>();
		setCharset(newFile);
		affectedFiles.add(newFile);
		URI diagramModelURI = URI.createPlatformResourceURI(newFile
				.getFullPath().toString(), true);

		final Resource modelResource = resourceSet
				.createResource(diagramModelURI);
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain, "Initializing diagram contents", affectedFiles) {

			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				RootNode rootNode = ModelinstanceFactory.eINSTANCE
						.createRootNode();

				modelResource.getContents().add(rootNode);

				return CommandResult.newOKCommandResult();
			}
		};
		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new NullProgressMonitor(), null);
			modelResource.save(DiagramEditorUtil.getSaveOptions());

		} catch (ExecutionException e) {
			FujabaNewwizardPlugin.getDefault().logError(
					"Unable to create model", e); //$NON-NLS-1$
		} catch (IOException ex) {
			FujabaNewwizardPlugin.getDefault().logError(
					"Save operation failed for: " + diagramModelURI, ex); //$NON-NLS-1$
		}
	}

	@Override
	protected String getExtension() {
		return "fujaba";
	}

	@Override
	protected void setCharset(IFile file) {
		DiagramEditorUtil.setCharset(file);
	}

}
