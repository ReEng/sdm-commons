package org.storydriven.storydiagrams.activities.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class CustomFlowFinalNodeItemProvider extends FlowFinalNodeItemProvider {
	public CustomFlowFinalNodeItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("activities/FlowFinalNode.png"); //$NON-NLS-1$
	}
}
