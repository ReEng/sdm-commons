package org.storydriven.storydiagrams.activities.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomInitialNodeItemProvider extends InitialNodeItemProvider {
	public CustomInitialNodeItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("activities/InitialNode.png"); //$NON-NLS-1$
	}
}
