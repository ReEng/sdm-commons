package org.storydriven.core.ui.ocl.editor;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.swt.SWT;

public class OCLKeywordRule extends WordRule {
	private static class OCLKeywordDetector implements IWordDetector {

		@Override
		public boolean isWordPart(char c) {
			return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
		}

		@Override
		public boolean isWordStart(char c) {
			return c == '@' || isWordPart(c);
		}
	}

	private static final String[] KEYWORDS = { "package", //$NON-NLS-1$
			"endpackage", //$NON-NLS-1$
			"context", //$NON-NLS-1$
			"inv", //$NON-NLS-1$
			"pre", //$NON-NLS-1$
			"post", //$NON-NLS-1$
			"body", //$NON-NLS-1$
			"derive", //$NON-NLS-1$
			"init", //$NON-NLS-1$
			"def", //$NON-NLS-1$

			"@pre", //$NON-NLS-1$

			"self", //$NON-NLS-1$
			"result", //$NON-NLS-1$

			"true", //$NON-NLS-1$
			"false", //$NON-NLS-1$
			"null", //$NON-NLS-1$
			"OclInvalid", //$NON-NLS-1$

			"and", //$NON-NLS-1$
			"or", //$NON-NLS-1$
			"xor", //$NON-NLS-1$
			"implies", //$NON-NLS-1$
			"not", //$NON-NLS-1$

			"let", //$NON-NLS-1$
			"in", //$NON-NLS-1$
			"if", //$NON-NLS-1$
			"then", //$NON-NLS-1$
			"else", //$NON-NLS-1$
			"endif", //$NON-NLS-1$

			"attr", //$NON-NLS-1$
			"oper", //$NON-NLS-1$
	};

	public OCLKeywordRule(ColorManager manager) {
		super(new OCLKeywordDetector());

		IToken token = new Token(new TextAttribute(manager.getColor(ColorManager.KEYWORD), null, SWT.BOLD));

		for (String word : KEYWORDS) {
			addWord(word, token);
		}
	}
}
