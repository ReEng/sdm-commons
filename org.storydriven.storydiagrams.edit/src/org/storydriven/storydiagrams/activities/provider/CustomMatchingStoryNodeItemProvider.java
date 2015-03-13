package org.storydriven.storydiagrams.activities.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.storydriven.storydiagrams.activities.MatchingStoryNode;

public class CustomMatchingStoryNodeItemProvider extends MatchingStoryNodeItemProvider {
	public CustomMatchingStoryNodeItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		if (((MatchingStoryNode) object).isForEach()) {
			return getImage("activities/MatchingStoryNode_loop.png"); //$NON-NLS-1$
		}
		return getImage("activities/MatchingStoryNode.png"); //$NON-NLS-1$
	}
}
