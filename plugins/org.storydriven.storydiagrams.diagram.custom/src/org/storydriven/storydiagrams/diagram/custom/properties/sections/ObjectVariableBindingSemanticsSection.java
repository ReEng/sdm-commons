package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.storydiagrams.diagram.custom.util.ValidationUtil;
import org.storydriven.storydiagrams.patterns.BindingOperator;
import org.storydriven.storydiagrams.patterns.BindingSemantics;
import org.storydriven.storydiagrams.patterns.BindingState;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

import de.upb.swt.core.ui.properties.sections.AbstractRadioGroupSection;

public class ObjectVariableBindingSemanticsSection extends AbstractRadioGroupSection<BindingSemantics> {
	@Override
	public void refresh() {
		super.refresh();
		checkEnabled();
	}

	@Override
	protected String getLabelText() {
		return "Binding Semantics";
	}

	@Override
	protected EStructuralFeature getFeature() {
		return PatternsPackage.Literals.OBJECT_VARIABLE__BINDING_SEMANTICS;
	}

	@Override
	protected List<BindingSemantics> getValues() {
		return BindingSemantics.VALUES;
	}

	protected boolean isEnabled(BindingSemantics semantics) {
		if (getElement() != null) {
			ObjectVariable variable = (ObjectVariable) getElement();
			BindingState state = variable.getBindingState();
			BindingOperator operator = variable.getBindingOperator();

			return ValidationUtil.isValid(state, semantics, operator);
		}
		return true;
	}
}
