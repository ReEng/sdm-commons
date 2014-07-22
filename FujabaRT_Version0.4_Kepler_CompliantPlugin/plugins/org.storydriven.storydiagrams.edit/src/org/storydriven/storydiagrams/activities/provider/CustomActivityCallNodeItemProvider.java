package org.storydriven.storydiagrams.activities.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomActivityCallNodeItemProvider extends ActivityCallNodeItemProvider {
	public CustomActivityCallNodeItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("activities/ActivityCallNode.png"); //$NON-NLS-1$
	}
}
