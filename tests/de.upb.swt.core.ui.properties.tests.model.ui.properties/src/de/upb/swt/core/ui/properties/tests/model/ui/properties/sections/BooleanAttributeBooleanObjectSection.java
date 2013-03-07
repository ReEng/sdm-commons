package de.upb.swt.core.ui.properties.tests.model.ui.properties.sections;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.upb.swt.core.ui.properties.sections.AbstractCheckboxSection;
import de.upb.swt.core.ui.properties.tests.model.ModelPackage;
import de.upb.swt.core.ui.properties.util.State;

public class BooleanAttributeBooleanObjectSection extends AbstractCheckboxSection {
	@Override
	protected String getLabelText() {
		return "Boolean Object";
	}

	@Override
	protected EStructuralFeature getFeature() {
		return ModelPackage.Literals.BOOLEAN_ATTRIBUTE__BOOLEAN_OBJECT_VALUE;
	}

	@Override
	protected State validate(Boolean value) {
		if (value) {
			return State.error("This cannot be true!");
		}

		return State.info("this boolean is for??");
	}
}
