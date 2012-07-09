package org.storydriven.storydiagrams.patterns.provider;

import org.eclipse.emf.common.notify.Adapter;

public class CustomPatternsItemProviderAdapterFactory extends PatternsItemProviderAdapterFactory {
	@Override
	public Adapter createAttributeAssignmentAdapter() {
		if (attributeAssignmentItemProvider == null) {
			attributeAssignmentItemProvider = new CustomAttributeAssignmentItemProvider(this);
		}
		return attributeAssignmentItemProvider;
	}

	@Override
	public Adapter createCollectionVariableAdapter() {
		if (collectionVariableItemProvider == null) {
			collectionVariableItemProvider = new CustomCollectionVariableItemProvider(this);
		}
		return collectionVariableItemProvider;
	}

	@Override
	public Adapter createConstraintAdapter() {
		if (constraintItemProvider == null) {
			constraintItemProvider = new CustomConstraintItemProvider(this);
		}
		return constraintItemProvider;
	}

	@Override
	public Adapter createInclusionLinkAdapter() {
		if (inclusionLinkItemProvider == null) {
			inclusionLinkItemProvider = new CustomInclusionLinkItemProvider(this);
		}
		return inclusionLinkItemProvider;
	}

	@Override
	public Adapter createLinkConstraintAdapter() {
		if (linkConstraintItemProvider == null) {
			linkConstraintItemProvider = new CustomLinkConstraintItemProvider(this);
		}
		return linkConstraintItemProvider;
	}

	@Override
	public Adapter createLinkVariableAdapter() {
		if (linkVariableItemProvider == null) {
			linkVariableItemProvider = new CustomLinkVariableItemProvider(this);
		}
		return linkVariableItemProvider;
	}

	@Override
	public Adapter createMatchingPatternAdapter() {
		if (matchingPatternItemProvider == null) {
			matchingPatternItemProvider = new CustomMatchingPatternItemProvider(this);
		}
		return matchingPatternItemProvider;
	}

	@Override
	public Adapter createMaybeLinkAdapter() {
		if (maybeLinkItemProvider == null) {
			maybeLinkItemProvider = new CustomMaybeLinkItemProvider(this);
		}
		return maybeLinkItemProvider;
	}

	@Override
	public Adapter createObjectVariableAdapter() {
		if (objectVariableItemProvider == null) {
			objectVariableItemProvider = new CustomObjectVariableItemProvider(this);
		}
		return objectVariableItemProvider;
	}

	@Override
	public Adapter createPathAdapter() {
		if (pathItemProvider == null) {
			pathItemProvider = new CustomPathItemProvider(this);
		}
		return pathItemProvider;
	}

	@Override
	public Adapter createPrimitiveVariableAdapter() {
		if (primitiveVariableItemProvider == null) {
			primitiveVariableItemProvider = new CustomPrimitiveVariableItemProvider(this);
		}
		return primitiveVariableItemProvider;
	}

	@Override
	public Adapter createStoryPatternAdapter() {
		if (storyPatternItemProvider == null) {
			storyPatternItemProvider = new CustomStoryPatternItemProvider(this);
		}
		return storyPatternItemProvider;
	}
}
