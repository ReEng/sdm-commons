package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractEEnumRadioSection;
import org.storydriven.storydiagrams.diagram.custom.util.ValidationUtil;
import org.storydriven.storydiagrams.patterns.BindingOperator;
import org.storydriven.storydiagrams.patterns.BindingSemantics;
import org.storydriven.storydiagrams.patterns.BindingState;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

public class AbstractVariableBindingStateSection extends AbstractEEnumRadioSection<BindingState> {
	@Override
	protected String getDescription() {
		return "Binding State";
	}

	@Override
	protected EStructuralFeature getFeature() {
		return PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_STATE;
	}

	@Override
	protected List<BindingState> getValues() {
		return BindingState.VALUES;
	}

	@Override
	protected void notifyChanged(Notification msg) {
		checkEnabled();
	}

	protected boolean isEnabled(BindingState state) {
		if (getElement() instanceof ObjectVariable) {
			ObjectVariable variable = (ObjectVariable) getElement();
			BindingSemantics semantics = variable.getBindingSemantics();
			BindingOperator operator = variable.getBindingOperator();

			return ValidationUtil.isValid(state, semantics, operator);
		}

		return true;
	}
}
