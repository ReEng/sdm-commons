package org.storydriven.storydiagrams.diagram.custom.part;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsDiagramEditor;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsDiagramEditorUtil;

import de.fujaba.newwizard.ui.commands.AbstractCreateDiagramFileCommand;

/**
 * @generated
 */
public class SDMFujabaDiagramFileAction extends
		AbstractCreateDiagramFileCommand {

	@Override
	public void setCharset(IFile diagramFile) {
		StorydiagramsDiagramEditorUtil.setCharset(diagramFile);
	}

	@Override
	public String getUniqueFilename(String hint, String extension,
			IPath filePath) {
		return StorydiagramsDiagramEditorUtil
				.getUniqueFileName(filePath, hint, extension);
	}

	@Override
	public String getEditorId() {
		return StorydiagramsDiagramEditor.ID;
	}

}
