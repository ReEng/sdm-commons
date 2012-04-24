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

public class AbstractLinkVariableBindingSemanticsSection extends AbstractEEnumRadioSection<BindingSemantics> {
	@Override
	protected String getDescription() {
		return "Binding Semantics";
	}

	@Override
	protected void notifyChanged(Notification msg) {
		Object feature = msg.getFeature();
		if ((PatternsPackage.Literals.ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR.equals(feature) || PatternsPackage.Literals.ABSTRACT_LINK_VARIABLE__BINDING_STATE
				.equals(feature)) && msg.isTouch()) {
			// binding state or semantics changed
			checkEnabled();
		}
	}

	@Override
	protected boolean isEnabled(BindingSemantics semantics) {
		if (getElement() instanceof AbstractLinkVariable) {
			AbstractLinkVariable variable = (AbstractLinkVariable) getElement();
			BindingState state = variable.getBindingState();
			BindingOperator operator = variable.getBindingOperator();

			return ValidationUtil.isValidLink(state, semantics, operator);
		}

		return true;
	}

	@Override
	protected EStructuralFeature getFeature() {
		return PatternsPackage.Literals.ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS;
	}

	@Override
	protected List<BindingSemantics> getValues() {
		return BindingSemantics.VALUES;
	}
}
