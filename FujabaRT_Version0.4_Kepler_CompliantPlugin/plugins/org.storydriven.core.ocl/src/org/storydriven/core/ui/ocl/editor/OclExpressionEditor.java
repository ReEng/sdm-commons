package org.storydriven.core.ui.ocl.editor;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.widgets.Composite;
import org.storydriven.core.ui.AbstractExpressionEditor;

public class OclExpressionEditor extends AbstractExpressionEditor {
	private OCLSourceViewer oclSourceViewer = null;
	private ColorManager colorManager = null;

	@Override
	public ISourceViewer createSourceViewer(Composite parent, int styles,
			EClassifier contextClassifier,
			Map<String, EClassifier> contextInformation, String text) {
		colorManager = new ColorManager();

		oclSourceViewer = new OCLSourceViewer(parent, null, styles,
				colorManager, contextClassifier, contextInformation, text);

		return oclSourceViewer;
	}

	@Override
	public void dispose() {
		if (colorManager != null) {
			colorManager.dispose();
		}
	}

	@Override
	public String getText() {
		return oclSourceViewer.getDocument().get();
	}

	@Override
	public void setText(String text) {
		oclSourceViewer.getDocument().set(text);
	}
}
