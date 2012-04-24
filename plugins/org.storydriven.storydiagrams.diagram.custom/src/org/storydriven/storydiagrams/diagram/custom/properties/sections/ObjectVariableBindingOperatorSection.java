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

public class ObjectVariableBindingOperatorSection extends AbstractEEnumRadioSection<BindingOperator> {
	@Override
	protected String getDescription() {
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

	@Override
	protected void notifyChanged(Notification msg) {
		Object feature = msg.getFeature();
		if ((PatternsPackage.Literals.OBJECT_VARIABLE__BINDING_SEMANTICS.equals(feature) || PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_STATE
				.equals(feature)) && msg.isTouch()) {
			// binding state or semantics changed
			checkEnabled();
		}
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
