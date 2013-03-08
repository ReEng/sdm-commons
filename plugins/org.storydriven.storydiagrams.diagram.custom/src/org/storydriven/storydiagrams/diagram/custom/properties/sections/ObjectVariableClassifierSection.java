package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.window.Window;
import org.storydriven.storydiagrams.diagram.custom.ResourceManager;
import org.storydriven.storydiagrams.diagram.custom.dialogs.SelectEClassDialog;
import org.storydriven.storydiagrams.diagram.custom.util.ActivityUtil;
import org.storydriven.storydiagrams.diagram.custom.util.EcoreTextUtil;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

import de.upb.swt.core.ui.properties.sections.AbstractComboSection;

public class ObjectVariableClassifierSection extends AbstractComboSection<EClass> {
	private SelectEClassDialog dialog;

	public ObjectVariableClassifierSection() {
		dialog = new SelectEClassDialog();
	}

	@Override
	protected void handleButtonClicked() {
		dialog.setActivity(ActivityUtil.getActivity(getElement()));
		dialog.setSelectedElement(((ObjectVariable) getElement()).getClassifier());
		if (dialog.open() == Window.OK) {
			EClass result = dialog.getElement();
			set(result);
			refresh();
		}
	}

	@Override
	protected EStructuralFeature getFeature() {
		return PatternsPackage.Literals.OBJECT_VARIABLE__CLASSIFIER;
	}

	@Override
	protected List<EClass> getItems() {
		List<EClass> items = new ArrayList<EClass>();
		items.add(null);
		items.addAll(ResourceManager.get(ActivityUtil.getActivity(getElement())).getEClasses());
		return items;
	}

	@Override
	protected String getLabelText() {
		return "Type";
	}

	@Override
	protected boolean shouldShowButton() {
		return true;
	}

	@Override
	protected String getText(EClass element) {
		return EcoreTextUtil.getQualifiedText(element);
	}
}
