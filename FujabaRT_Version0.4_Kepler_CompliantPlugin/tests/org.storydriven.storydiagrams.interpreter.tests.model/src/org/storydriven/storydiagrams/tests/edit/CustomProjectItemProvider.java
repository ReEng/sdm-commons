package org.storydriven.storydiagrams.tests.edit;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.storydriven.storydiagrams.tests.Named;

public class CustomProjectItemProvider extends ProjectItemProvider {
	public CustomProjectItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public String getText(Object object) {
		return String.valueOf(((Named) object).getName());
	}

	@Override
	public Object getImage(Object object) {
		return getImage("project.png"); //$NON-NLS-1$
	}
}
