package org.storydriven.storydiagrams.diagram.ocl;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;

public class OCLIdentifierRule extends WordRule {
	private static class OCLKeywordDetector implements IWordDetector {
		@Override
		public boolean isWordPart(char c) {
			return isWordStart(c) || c == '$' || c >= '0' && c <= '9';
		}

		@Override
		public boolean isWordStart(char c) {
			return c == '_' || c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
		}
	}

	public OCLIdentifierRule(ColorManager colorManager, OCLDocument oclDocument) {
		super(new OCLKeywordDetector(), new Token(new TextAttribute(null)));

		Color color = colorManager.getColor(ColorManager.KNOWN_VARIABLE);
		Token wordToken = new Token(new TextAttribute(color, null, SWT.NORMAL));

		for (Variable<EClassifier, EParameter> variable : oclDocument.getOCLContextInformation()) {
			addWord(variable.getName(), wordToken);
		}
	}
}
