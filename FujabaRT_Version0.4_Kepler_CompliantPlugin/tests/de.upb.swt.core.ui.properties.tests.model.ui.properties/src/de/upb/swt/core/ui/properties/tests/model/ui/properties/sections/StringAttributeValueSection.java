package de.upb.swt.core.ui.properties.tests.model.ui.properties.sections;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.upb.swt.core.ui.properties.sections.AbstractTextSection;
import de.upb.swt.core.ui.properties.tests.model.ModelPackage;

public class StringAttributeValueSection extends AbstractTextSection {
	@Override
	protected String getLabelText() {
		return "String";
	}

	@Override
	protected EStructuralFeature getFeature() {
		return ModelPackage.Literals.STRING_ATTRIBUTE__VALUE;
	}

	@Override
	protected boolean isMultiLine() {
		return true;
	}
}
