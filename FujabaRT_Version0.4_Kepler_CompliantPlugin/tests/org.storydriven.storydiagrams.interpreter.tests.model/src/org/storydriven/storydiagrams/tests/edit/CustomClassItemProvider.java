package org.storydriven.storydiagrams.tests.edit;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.storydriven.storydiagrams.tests.Named;

public class CustomClassItemProvider extends ClassItemProvider {
	public CustomClassItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public String getText(Object object) {
		return String.valueOf(((Named) object).getName());
	}

	@Override
	public Object getImage(Object object) {
		return getImage("class.png"); //$NON-NLS-1$
	}
}
