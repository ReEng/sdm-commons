package org.storydriven.storydiagrams.activities.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomActivityEdgeItemProvider extends ActivityEdgeItemProvider {
	public CustomActivityEdgeItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("activities/ActivityEdge.png"); //$NON-NLS-1$
	}
}
