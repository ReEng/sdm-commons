package org.storydriven.storydiagrams.activities.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomActivityItemProvider extends ActivityItemProvider {
	public CustomActivityItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("activities/Activity.png"); //$NON-NLS-1$
	}
}
