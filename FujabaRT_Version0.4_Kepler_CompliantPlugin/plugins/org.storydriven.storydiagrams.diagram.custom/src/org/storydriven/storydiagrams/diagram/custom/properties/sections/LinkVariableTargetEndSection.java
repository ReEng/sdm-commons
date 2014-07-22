package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.storydiagrams.diagram.custom.util.EcoreTextUtil;
import org.storydriven.storydiagrams.patterns.LinkVariable;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

import de.upb.swt.core.ui.properties.sections.AbstractComboSection;

public class LinkVariableTargetEndSection extends AbstractComboSection<EReference> {
	@Override
	protected List<EReference> getItems() {
		List<EReference> result = new ArrayList<EReference>();
		result.add(null);

		if (getElement().getTarget() instanceof ObjectVariable) {
			EClass sourceClassifier = getElement().getSource().getClassifier();
			EClass targetClassifier = ((ObjectVariable) getElement().getTarget()).getClassifier();

			if (sourceClassifier != null && targetClassifier != null) {
				// go through all possible references
				for (EReference eReference : sourceClassifier.getEAllReferences()) {
					EClass type = eReference.getEReferenceType();
					if (type != null && type.isSuperTypeOf(targetClassifier)) {
						result.add(eReference);
					}
				}
			}
		}
		return result;
	}

	@Override
	protected LinkVariable getElement() {
		return (LinkVariable) super.getElement();
	}

	@Override
	protected String getLabelText() {
		return "Target End";
	}

	@Override
	protected EStructuralFeature getFeature() {
		return PatternsPackage.Literals.LINK_VARIABLE__TARGET_END;
	}

	@Override
	protected String getText(EReference element) {
		return EcoreTextUtil.getText(element);
	}
}
