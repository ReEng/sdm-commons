package org.storydriven.storydiagrams.activities.provider;

import org.eclipse.emf.common.notify.Adapter;

public class CustomActivitiesItemProviderAdapterFactory extends ActivitiesItemProviderAdapterFactory {
	@Override
	public Adapter createActivityAdapter() {
		if (activityItemProvider == null) {
			activityItemProvider = new CustomActivityItemProvider(this);
		}
		return activityItemProvider;
	}

	@Override
	public Adapter createActivityCallNodeAdapter() {
		if (activityCallNodeItemProvider == null) {
			activityCallNodeItemProvider = new CustomActivityCallNodeItemProvider(this);
		}
		return activityCallNodeItemProvider;
	}

	@Override
	public Adapter createActivityEdgeAdapter() {
		if (activityEdgeItemProvider == null) {
			activityEdgeItemProvider = new CustomActivityEdgeItemProvider(this);
		}
		return activityEdgeItemProvider;
	}

	@Override
	public Adapter createActivityFinalNodeAdapter() {
		if (activityFinalNodeItemProvider == null) {
			activityFinalNodeItemProvider = new CustomActivityFinalNodeItemProvider(this);
		}
		return activityFinalNodeItemProvider;
	}

	@Override
	public Adapter createFlowFinalNodeAdapter() {
		if (flowFinalNodeItemProvider == null) {
			flowFinalNodeItemProvider = new CustomFlowFinalNodeItemProvider(this);
		}
		return flowFinalNodeItemProvider;
	}

	@Override
	public Adapter createInitialNodeAdapter() {
		if (initialNodeItemProvider == null) {
			initialNodeItemProvider = new CustomInitialNodeItemProvider(this);
		}
		return initialNodeItemProvider;
	}

	@Override
	public Adapter createJunctionNodeAdapter() {
		if (junctionNodeItemProvider == null) {
			junctionNodeItemProvider = new CustomJunctionNodeItemProvider(this);
		}
		return junctionNodeItemProvider;
	}

	@Override
	public Adapter createMatchingStoryNodeAdapter() {
		if (matchingStoryNodeItemProvider == null) {
			matchingStoryNodeItemProvider = new CustomMatchingStoryNodeItemProvider(this);
		}
		return matchingStoryNodeItemProvider;
	}

	@Override
	public Adapter createModifyingStoryNodeAdapter() {
		if (modifyingStoryNodeItemProvider == null) {
			modifyingStoryNodeItemProvider = new CustomModifyingStoryNodeItemProvider(this);
		}
		return modifyingStoryNodeItemProvider;
	}

	@Override
	public Adapter createStatementNodeAdapter() {
		if (statementNodeItemProvider == null) {
			statementNodeItemProvider = new CustomStatementNodeItemProvider(this);
		}
		return statementNodeItemProvider;
	}

	@Override
	public Adapter createStructuredNodeAdapter() {
		if (structuredNodeItemProvider == null) {
			structuredNodeItemProvider = new CustomStructuredNodeItemProvider(this);
		}
		return structuredNodeItemProvider;
	}
}
