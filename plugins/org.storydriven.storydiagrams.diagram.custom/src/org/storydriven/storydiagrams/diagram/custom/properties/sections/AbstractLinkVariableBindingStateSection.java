package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractEEnumRadioSection;
import org.storydriven.storydiagrams.diagram.custom.util.ValidationUtil;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.BindingOperator;
import org.storydriven.storydiagrams.patterns.BindingSemantics;
import org.storydriven.storydiagrams.patterns.BindingState;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

public class AbstractLinkVariableBindingStateSection extends AbstractEEnumRadioSection<BindingState> {
	@Override
	protected EStructuralFeature getFeature() {
		return PatternsPackage.Literals.ABSTRACT_LINK_VARIABLE__BINDING_STATE;
	}

	@Override
	protected String getDescription() {
		return "Binding State";
	}

	@Override
	protected void notifyChanged(Notification msg) {
		checkEnabled();
	}

	@Override
	protected boolean isEnabled(BindingState state) {
		if (getElement() instanceof AbstractLinkVariable) {
			AbstractLinkVariable variable = (AbstractLinkVariable) getElement();
			BindingSemantics semantics = variable.getBindingSemantics();
			BindingOperator operator = variable.getBindingOperator();

			return ValidationUtil.isValidLink(state, semantics, operator);
		}

		return true;
	}

	@Override
	protected List<BindingState> getValues() {
		return BindingState.VALUES;
	}
}
