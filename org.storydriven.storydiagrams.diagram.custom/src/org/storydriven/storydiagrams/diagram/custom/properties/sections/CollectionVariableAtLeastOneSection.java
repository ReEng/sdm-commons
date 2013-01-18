package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractEBooleanSection;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

public class CollectionVariableAtLeastOneSection extends AbstractEBooleanSection {
	@Override
	protected EStructuralFeature getFeature() {
		return PatternsPackage.Literals.COLLECTION_VARIABLE__AT_LEAST_ONE;
	}

	@Override
	protected String getButtonText() {
		return "At Least One Match";
	}
}
