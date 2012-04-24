package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractEListComboSection;
import org.storydriven.storydiagrams.diagram.custom.util.EcoreTextUtil;
import org.storydriven.storydiagrams.patterns.AttributeAssignment;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

public class AttributeAssignmentAttributeSection extends AbstractEListComboSection<EAttribute> {
	@Override
	protected List<EAttribute> getItems() {
		EClass classifier = getElement().getObjectVariable().getClassifier();
		if (classifier != null) {
			return classifier.getEAllAttributes();
		}
		return Collections.emptyList();
	}

	@Override
	protected AttributeAssignment getElement() {
		return (AttributeAssignment) super.getElement();
	}

	@Override
	protected String getLabelText() {
		return "Attribute";
	}

	@Override
	protected EStructuralFeature getFeature() {
		return PatternsPackage.Literals.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE;
	}

	@Override
	protected String getText(EAttribute element) {
		return EcoreTextUtil.getText(element);
	}
}
