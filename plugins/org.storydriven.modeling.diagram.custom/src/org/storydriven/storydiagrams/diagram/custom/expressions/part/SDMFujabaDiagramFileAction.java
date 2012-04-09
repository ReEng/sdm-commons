package org.storydriven.modeling.diagram.custom.part;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.storydriven.modeling.diagram.part.SDMDiagramEditor;
import org.storydriven.modeling.diagram.part.SDMDiagramEditorUtil;

import de.fujaba.newwizard.ui.commands.AbstractCreateDiagramFileCommand;

/**
 * @generated
 */
public class SDMFujabaDiagramFileAction extends
		AbstractCreateDiagramFileCommand {

	@Override
	public void setCharset(IFile diagramFile) {
		SDMDiagramEditorUtil.setCharset(diagramFile);
	}

	@Override
	public String getUniqueFilename(String hint, String extension,
			IPath filePath) {
		return SDMDiagramEditorUtil
				.getUniqueFileName(filePath, hint, extension);
	}

	@Override
	public String getEditorId() {
		return SDMDiagramEditor.ID;
	}

}
