package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.storydiagrams.diagram.custom.util.EcoreTextUtil;
import org.storydriven.storydiagrams.patterns.AttributeAssignment;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

import de.upb.swt.core.ui.properties.sections.AbstractComboSection;

public class AttributeAssignmentAttributeSection extends AbstractComboSection<EAttribute> {
	@Override
	protected List<EAttribute> getItems() {
		List<EAttribute> items = new ArrayList<EAttribute>();
		items.add(null);

		EClass classifier = getElement().getObjectVariable().getClassifier();
		if (classifier != null) {
			items.addAll(classifier.getEAllAttributes());
		}
		return items;
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
