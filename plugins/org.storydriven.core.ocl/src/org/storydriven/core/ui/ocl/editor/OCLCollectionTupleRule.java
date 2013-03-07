package org.storydriven.core.ui.ocl.editor;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.swt.SWT;

public class OCLCollectionTupleRule extends WordRule {
	private static class CollectionTupleDetector implements IWordDetector {
		private final boolean isBraces;

		public CollectionTupleDetector(boolean isBraces) {
			this.isBraces = isBraces;
		}

		@Override
		public boolean isWordPart(char c) {
			return isBraces ? c == '{' || c == '}' : c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
		}

		@Override
		public boolean isWordStart(char c) {
			return isWordPart(c);
		}
	}

	private static final String[] KEYWORDS = { "Set", //$NON-NLS-1$
			"OrderedSet", //$NON-NLS-1$
			"Bag", //$NON-NLS-1$
			"Sequence", //$NON-NLS-1$
			"Tuple", //$NON-NLS-1$
	};

	private static final String[] BRACES = { "{", //$NON-NLS-1$
			"}", //$NON-NLS-1$
			"}}", //$NON-NLS-1$
			"}}}", //$NON-NLS-1$
	};

	public OCLCollectionTupleRule(ColorManager colorManager, boolean isBraces) {
		super(new CollectionTupleDetector(isBraces));

		IToken token = new Token(
				new TextAttribute(colorManager.getColor(ColorManager.COLLECTION_TUPLE), null, SWT.BOLD));

		if (isBraces) {
			for (String word : BRACES) {
				addWord(word, token);
			}
		} else {
			for (String word : KEYWORDS) {
				addWord(word, token);
			}
		}
	}
}
