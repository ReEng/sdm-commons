package de.upb.swt.core.ui.properties.tests.model.ui.properties.sections;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.upb.swt.core.ui.properties.sections.AbstractTextSection;
import de.upb.swt.core.ui.properties.tests.model.ModelPackage;
import de.upb.swt.core.ui.properties.util.State;

public class NamedElementNameSection extends AbstractTextSection {
	@Override
	protected String getLabelText() {
		return "Name";
	}

	@Override
	protected EStructuralFeature getFeature() {
		return ModelPackage.Literals.NAMED_ELEMENT__NAME;
	}

	@Override
	protected State validate(String value) {
		if (value == null || value.isEmpty()) {
			return State.warning("The name should not be empty.");
		}

		if (value.equals("err")) {
			return State.error("The name must not be 'err'!");
		}

		return State.info("The name of the element.");
	}
}
