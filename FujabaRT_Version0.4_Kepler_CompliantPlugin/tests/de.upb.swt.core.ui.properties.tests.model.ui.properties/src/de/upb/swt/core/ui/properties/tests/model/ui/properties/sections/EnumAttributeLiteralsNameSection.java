package de.upb.swt.core.ui.properties.tests.model.ui.properties.sections;

import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.upb.swt.core.ui.properties.sections.AbstractRadioGroupSection;
import de.upb.swt.core.ui.properties.tests.model.EnumLiterals;
import de.upb.swt.core.ui.properties.tests.model.ModelPackage;
import de.upb.swt.core.ui.properties.util.State;

public class EnumAttributeLiteralsNameSection extends AbstractRadioGroupSection<EnumLiterals> {
	@Override
	protected String getLabelText() {
		return "Literal";
	}

	@Override
	protected List<EnumLiterals> getValues() {
		return EnumLiterals.VALUES;
	}

	@Override
	protected State validate(EnumLiterals literal) {
		switch (literal) {
		case FIRST:
			return State.warning("FIRST should not be selected...");
		case THIRD:
			return State.error("THIRD is invalid...");
		default:
			return State.info("Only SECOND is ok?");
		}
	}

	@Override
	protected EStructuralFeature getFeature() {
		return ModelPackage.Literals.ENUM_ATTRIBUTE__LITERAL;
	}
}
