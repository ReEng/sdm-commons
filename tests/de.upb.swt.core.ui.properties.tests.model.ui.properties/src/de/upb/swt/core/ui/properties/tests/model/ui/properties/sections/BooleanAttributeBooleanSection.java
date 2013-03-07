package de.upb.swt.core.ui.properties.tests.model.ui.properties.sections;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.upb.swt.core.ui.properties.sections.AbstractCheckboxSection;
import de.upb.swt.core.ui.properties.tests.model.ModelPackage;

public class BooleanAttributeBooleanSection extends AbstractCheckboxSection {
	@Override
	protected String getLabelText() {
		return "Boolean";
	}

	@Override
	protected EStructuralFeature getFeature() {
		return ModelPackage.Literals.BOOLEAN_ATTRIBUTE__BOOLEAN_VALUE;
	}
}
