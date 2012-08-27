package org.storydriven.core.expressions.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.storydriven.core.expressions.TextualExpression;

public class CustomTextualExpressionItemProvider extends TextualExpressionItemProvider {
	public CustomTextualExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("core/expressions/TextualExpression.png"); //$NON-NLS-1$
	}

	@Override
	public String getText(Object object) {
		TextualExpression textualExpression = (TextualExpression) object;

		StringBuffer buffer = new StringBuffer();
		buffer.append(getString("_UI_TextualExpression_type"));

		String language = textualExpression.getLanguage();
		if (language != null) {
			buffer.append(' ');
			buffer.append(language);
		}

		String languageVersion = textualExpression.getLanguageVersion();
		if (languageVersion != null) {
			buffer.append(' ');
			buffer.append(languageVersion);
		}

		return buffer.toString();
	}
}
