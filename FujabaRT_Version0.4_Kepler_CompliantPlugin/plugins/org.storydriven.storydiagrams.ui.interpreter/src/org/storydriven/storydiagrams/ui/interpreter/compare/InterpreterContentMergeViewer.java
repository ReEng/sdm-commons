package org.storydriven.storydiagrams.ui.interpreter.compare;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.emf.compare.ui.viewer.content.ModelContentMergeViewer;
import org.eclipse.emf.compare.ui.viewer.content.part.ModelContentMergeTabFolder;
import org.eclipse.swt.widgets.Composite;

public class InterpreterContentMergeViewer extends ModelContentMergeViewer {
	public InterpreterContentMergeViewer(Composite parent, CompareConfiguration config) {
		super(parent, config);
	}

	@Override
	protected ModelContentMergeTabFolder createModelContentMergeTabFolder(Composite composite, int side) {
		// TODO Auto-generated method stub
		// return new InterpreterTabFolder(composite, side);
		return super.createModelContentMergeTabFolder(composite, side);
	}
}
