package org.storydriven.storydiagrams.ui.interpreter.compare;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareViewerPane;
import org.eclipse.emf.compare.diff.metamodel.ComparisonSnapshot;
import org.eclipse.emf.compare.ui.editor.ModelCompareEditorInput;
import org.eclipse.emf.compare.ui.viewer.content.ModelContentMergeViewer;

public class InterpreterCompareInput extends ModelCompareEditorInput {
	public InterpreterCompareInput(ComparisonSnapshot snapshot) {
		super(snapshot);
	}

	@Override
	protected ModelContentMergeViewer createMergeViewer(CompareViewerPane pane, CompareConfiguration config) {
		return new InterpreterContentMergeViewer(pane, config);
	}
}
