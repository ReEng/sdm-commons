package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.storydiagrams.diagram.custom.util.ValidationUtil;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.BindingOperator;
import org.storydriven.storydiagrams.patterns.BindingSemantics;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

import de.upb.swt.core.ui.properties.sections.AbstractRadioGroupSection;

public class AbstractLinkVariableBindingSemanticsSection extends AbstractRadioGroupSection<BindingSemantics> {
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
	protected boolean isEnabled(BindingSemantics semantics) {
		if (getElement() instanceof AbstractLinkVariable) {
			AbstractLinkVariable variable = (AbstractLinkVariable) getElement();
			BindingOperator operator = variable.getBindingOperator();

			return ValidationUtil.isValidLink(semantics, operator);
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
