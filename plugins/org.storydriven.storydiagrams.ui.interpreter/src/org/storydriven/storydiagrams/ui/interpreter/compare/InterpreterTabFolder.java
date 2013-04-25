package org.storydriven.storydiagrams.ui.interpreter.compare;

import org.eclipse.emf.compare.ui.viewer.content.ModelContentMergeViewer;
import org.eclipse.emf.compare.ui.viewer.content.part.ModelContentMergeTabFolder;
import org.eclipse.swt.widgets.Composite;

public class InterpreterTabFolder extends ModelContentMergeTabFolder {
	public InterpreterTabFolder(ModelContentMergeViewer viewer, Composite composite, int side) {
		super(viewer, composite, side);
	}

	@Override
	protected void createContents(Composite composite) {
		// TODO: create more simple pane

		super.createContents(composite);
	}
}
