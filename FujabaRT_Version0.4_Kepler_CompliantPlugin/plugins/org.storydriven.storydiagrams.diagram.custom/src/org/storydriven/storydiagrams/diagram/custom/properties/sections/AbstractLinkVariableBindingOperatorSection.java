package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.storydiagrams.diagram.custom.util.ValidationUtil;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.BindingOperator;
import org.storydriven.storydiagrams.patterns.BindingSemantics;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

import de.upb.swt.core.ui.properties.sections.AbstractRadioGroupSection;

public class AbstractLinkVariableBindingOperatorSection extends AbstractRadioGroupSection<BindingOperator> {
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
	protected boolean isEnabled(BindingOperator operator) {
		if (getElement() instanceof AbstractLinkVariable) {
			AbstractLinkVariable variable = (AbstractLinkVariable) getElement();
			BindingSemantics semantics = variable.getBindingSemantics();

			return ValidationUtil.isValidLink(semantics, operator);
		}

		return true;
	}

	@Override
	protected EStructuralFeature getFeature() {
		return PatternsPackage.Literals.ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR;
	}

	@Override
	protected List<BindingOperator> getValues() {
		return BindingOperator.VALUES;
	}
}
