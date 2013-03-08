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

public class ObjectVariableBindingOperatorSection extends AbstractRadioGroupSection<BindingOperator> {
	@Override
	public void refresh() {
		super.refresh();
		checkEnabled();
	}

	@Override
	protected String getLabelText() {
		return "Binding Operator";
	}

	@Override
	protected EStructuralFeature getFeature() {
		return PatternsPackage.Literals.OBJECT_VARIABLE__BINDING_OPERATOR;
	}

	@Override
	protected List<BindingOperator> getValues() {
		return BindingOperator.VALUES;
	}

	protected boolean isEnabled(BindingOperator operator) {
		if (getElement() != null) {
			ObjectVariable variable = (ObjectVariable) getElement();
			BindingState state = variable.getBindingState();
			BindingSemantics semantics = variable.getBindingSemantics();

			return ValidationUtil.isValid(state, semantics, operator);
		}
		return true;
	}
}
