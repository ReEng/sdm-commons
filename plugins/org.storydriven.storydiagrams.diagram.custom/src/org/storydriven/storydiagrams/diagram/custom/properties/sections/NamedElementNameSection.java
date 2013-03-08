package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.core.CorePackage;

import de.upb.swt.core.ui.properties.sections.AbstractTextSection;

public class NamedElementNameSection extends AbstractTextSection {
	@Override
	protected EStructuralFeature getFeature() {
		return CorePackage.Literals.NAMED_ELEMENT__NAME;
	}

	@Override
	protected void postExecute() {
		refreshTitle();
	}

	@Override
	protected String getLabelText() {
		return "Name";
	}
}
