package de.fujaba.newwizard.model;

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
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import de.fujaba.modelinstance.ModelinstanceFactory;
import de.fujaba.modelinstance.RootNode;
import de.fujaba.newwizard.FujabaNewwizardPlugin;
import de.fujaba.newwizard.Messages;
import de.fujaba.newwizard.diagrams.DiagramEditorUtil;
import de.fujaba.newwizard.diagrams.pages.NewExtendedFileCreationPage;

/**
 * A New Wizard for the Fujaba Model.
 * 
 * @author bingo
 * 
 */
public class FujabaModelNewWizard extends Wizard implements INewWizard {

	/**
	 * The Wizard Page for selecting a file name.
	 */
	protected NewExtendedFileCreationPage domainModelFilePage;

	/**
	 * The Editing Domain for all changes.
	 */
	private TransactionalEditingDomain editingDomain;

	/**
	 * Constructs this NewWizard.
	 */
	public FujabaModelNewWizard() {
		editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
	}

	/**
	 * Initializes this creation wizard.
	 * 
	 * @param workbench
	 *            The workbench
	 * @param selection
	 *            The selection that existed before this wizard was opened.
	 * 
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setNeedsProgressMonitor(true);

		domainModelFilePage = new NewExtendedFileCreationPage(
				"DiagramModelFile", selection, FujabaNewwizardPlugin.FUJABA_MODEL_EXTENSION); //$NON-NLS-1$

		domainModelFilePage
				.setTitle(Messages.NewDiagramFileWizard_CreationPageTitle);
		domainModelFilePage
				.setDescription(Messages.NewDiagramFileWizard_CreationPageDescription);

		addPage(domainModelFilePage);
	}

	/**
	 * Creates the specified domain model.
	 */
	@Override
	public boolean performFinish() {
		IFile domainModelFile = domainModelFilePage.createNewFile();
		FujabaNewwizardPlugin.getDefault().createModel(domainModelFile,
				editingDomain);
		return true;
	}

}
