package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

import de.upb.swt.core.ui.properties.sections.AbstractCheckboxSection;

public class CollectionVariableUniqueSection extends AbstractCheckboxSection {
	@Override
	protected EStructuralFeature getFeature() {
		return PatternsPackage.Literals.COLLECTION_VARIABLE__UNIQUE;
	}

	@Override
	protected String getLabelText() {
		return "Unique Elements";
	}
}
