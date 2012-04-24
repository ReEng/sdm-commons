package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.core.CorePackage;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractEStringSection;

public class NamedElementNameSection extends AbstractEStringSection {
	@Override
	protected EStructuralFeature getFeature() {
		return CorePackage.Literals.NAMED_ELEMENT__NAME;
	}

	@Override
	protected void execute(Command command) {
		super.execute(command);
		// refreshTitleBar();
	}

	@Override
	protected String getLabelText() {
		return "Name";
	}
}
