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

public class ObjectVariableBindingSemanticsSection extends AbstractEEnumRadioSection<BindingSemantics> {

	@Override
	protected String getDescription() {
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

	@Override
	protected void notifyChanged(Notification msg) {
		checkEnabled();
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
