package org.storydriven.storydiagrams.tests.edit;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.storydriven.storydiagrams.tests.Statement;

public class CustomStatementItemProvider extends StatementItemProvider {
	public CustomStatementItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public String getText(Object object) {
		return String.valueOf(((Statement) object).getValue());
	}

	@Override
	public Object getImage(Object object) {
		return getImage("statement.png"); //$NON-NLS-1$
	}
}
