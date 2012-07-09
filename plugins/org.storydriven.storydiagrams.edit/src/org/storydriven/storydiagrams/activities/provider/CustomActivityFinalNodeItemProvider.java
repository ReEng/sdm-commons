package org.storydriven.storydiagrams.activities.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomActivityFinalNodeItemProvider extends ActivityFinalNodeItemProvider {
	public CustomActivityFinalNodeItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("activities/ActivityFinalNode.png"); //$NON-NLS-1$
	}
}
