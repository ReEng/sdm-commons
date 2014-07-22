package org.storydriven.core.ui;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.widgets.Composite;

public interface IExpressionEditor {
	String ID_EXTENSION = "org.storydriven.core.ui.expressionEditor"; //$NON-NLS-1$
	String ID_ATTRIBUTE_CLASS = "class"; //$NON-NLS-1$;
	String ID_ATTRIBUTE_LANGUAGE = "language"; //$NON-NLS-1$;
	String ID_ATTRIBUTE_VERSION = "version"; //$NON-NLS-1$;

	ISourceViewer createSourceViewer(Composite parent, int styles,
			EClassifier contextClassifier,
			Map<String, EClassifier> contextInformation, String text);

	void dispose();

	String getText();

	void setText(String text);
}
