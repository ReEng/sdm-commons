package de.fujaba.newwizard.ui.commands;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;

import de.fujaba.newwizard.FujabaNewwizardPlugin;
import de.fujaba.newwizard.diagrams.DiagramEditorUtil;

public class CreateModelFileCommand extends AbstractCreateFileCommand {

	@Override
	protected void createContents(URI selectedURI, IFile newFile) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		FujabaNewwizardPlugin.getDefault().createModel(newFile, editingDomain);
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
