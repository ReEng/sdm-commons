package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.storydiagrams.diagram.custom.ResourceManager;
import org.storydriven.storydiagrams.diagram.custom.util.ActivityUtil;
import org.storydriven.storydiagrams.diagram.custom.util.EcoreTextUtil;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

import de.upb.swt.core.ui.properties.sections.AbstractComboSection;

public class PrimitiveVariableClassifierSection extends AbstractComboSection<EDataType> {
	@Override
	protected List<EDataType> getItems() {
		List<EDataType> items = new ArrayList<EDataType>();
		items.add(null);

		items.addAll(ResourceManager.get(ActivityUtil.getActivity(getElement())).getEDataTypes());

		return items;
	}

	@Override
	protected String getLabelText() {
		return "Type";
	}

	@Override
	protected EStructuralFeature getFeature() {
		return PatternsPackage.Literals.PRIMITIVE_VARIABLE__CLASSIFIER;
	}

	@Override
	protected String getText(EDataType element) {
		return EcoreTextUtil.getQualifiedText(element);
	}
}
