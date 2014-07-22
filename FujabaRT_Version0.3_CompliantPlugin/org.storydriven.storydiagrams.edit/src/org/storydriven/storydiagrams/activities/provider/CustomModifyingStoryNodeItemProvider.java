package org.storydriven.storydiagrams.activities.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.storydriven.storydiagrams.activities.ModifyingStoryNode;

public class CustomModifyingStoryNodeItemProvider extends ModifyingStoryNodeItemProvider {
	public CustomModifyingStoryNodeItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		if (((ModifyingStoryNode) object).isForEach()) {
			return getImage("activities/ModifyingStoryNode_loop.png"); //$NON-NLS-1$
		}
		return getImage("activities/ModifyingStoryNode.png"); //$NON-NLS-1$
	}
}
