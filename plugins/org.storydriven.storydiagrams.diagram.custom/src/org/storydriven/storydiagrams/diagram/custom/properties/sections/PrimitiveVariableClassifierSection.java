package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import java.util.List;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.storydiagrams.diagram.custom.ResourceManager;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractEListComboSection;
import org.storydriven.storydiagrams.diagram.custom.util.ActivityUtil;
import org.storydriven.storydiagrams.diagram.custom.util.EcoreTextUtil;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

public class PrimitiveVariableClassifierSection extends AbstractEListComboSection<EDataType> {
	@Override
	protected List<EDataType> getItems() {
		return ResourceManager.get(ActivityUtil.getActivity(getElement())).getEDataTypes();
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
