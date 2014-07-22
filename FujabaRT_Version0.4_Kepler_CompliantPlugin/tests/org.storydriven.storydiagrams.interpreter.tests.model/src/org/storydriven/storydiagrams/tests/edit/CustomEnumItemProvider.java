package org.storydriven.storydiagrams.tests.edit;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.storydriven.storydiagrams.tests.Named;

public class CustomEnumItemProvider extends EnumItemProvider {
	public CustomEnumItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public String getText(Object object) {
		return String.valueOf(((Named) object).getName());
	}

	@Override
	public Object getImage(Object object) {
		return getImage("enum.png"); //$NON-NLS-1$
	}
}
