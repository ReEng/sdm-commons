package org.storydriven.storydiagrams.activities.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomJunctionNodeItemProvider extends JunctionNodeItemProvider {
	public CustomJunctionNodeItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("activities/JunctionNode.png"); //$NON-NLS-1$
	}
}
