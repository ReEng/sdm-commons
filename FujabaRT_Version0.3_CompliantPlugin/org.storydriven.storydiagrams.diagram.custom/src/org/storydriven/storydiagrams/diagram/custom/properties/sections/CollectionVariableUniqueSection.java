package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractEBooleanSection;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

public class CollectionVariableUniqueSection extends AbstractEBooleanSection {
	@Override
	protected EStructuralFeature getFeature() {
		return PatternsPackage.Literals.COLLECTION_VARIABLE__UNIQUE;
	}

	@Override
	protected String getButtonText() {
		return "Unique Elements";
	}
}
