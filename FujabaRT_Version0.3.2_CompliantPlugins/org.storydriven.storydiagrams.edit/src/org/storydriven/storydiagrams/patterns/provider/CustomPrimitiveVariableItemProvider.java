package org.storydriven.storydiagrams.patterns.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomPrimitiveVariableItemProvider extends PrimitiveVariableItemProvider {
	public CustomPrimitiveVariableItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("patterns/PrimitiveVariable.png"); //$NON-NLS-1$
	}
}
