package org.storydriven.storydiagrams.activities.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomStructuredNodeItemProvider extends StructuredNodeItemProvider {
	public CustomStructuredNodeItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("activities/StructuredNode.png"); //$NON-NLS-1$
	}
}
