package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.storydiagrams.activities.StoryNode;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractEEnumRadioSection;
import org.storydriven.storydiagrams.patterns.BindingSemantics;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

public class StoryNodeBindingSemanticsSection extends AbstractEEnumRadioSection<BindingSemantics> {
	@Override
	protected String getDescription() {
		return "Binding Semantics";
	}

	@Override
	protected EObject getElement() {
		StoryNode storyNode = (StoryNode) super.getElement();
		if (storyNode != null) {
			return storyNode.getStoryPattern();
		}
		return super.getElement();
	}

	@Override
	protected EStructuralFeature getFeature() {
		return PatternsPackage.Literals.STORY_PATTERN__BINDING_SEMANTICS;
	}

	@Override
	protected List<BindingSemantics> getValues() {
		return BindingSemantics.VALUES;
	}
}
