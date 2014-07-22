package org.storydriven.core.ui.ocl.editor;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.swt.widgets.Composite;

public class OCLSourceViewer extends SourceViewer {
	public OCLSourceViewer(Composite parent, IVerticalRuler ruler, int styles, ColorManager colorManager,
			EClassifier contextClassifier, Map<String, EClassifier> contextInformation, String text) {
		super(parent, ruler, styles);

		OCLDocument oclDocument = new OCLDocument();
		oclDocument.set(text);
		oclDocument.setOCLContext(contextClassifier);
		oclDocument.setOCLContextInformation(contextInformation);

		setDocument(oclDocument);

		getTextWidget().setFont(JFaceResources.getTextFont());

		configure(new OCLSourceViewerConfiguration(colorManager, oclDocument));
	}
}
