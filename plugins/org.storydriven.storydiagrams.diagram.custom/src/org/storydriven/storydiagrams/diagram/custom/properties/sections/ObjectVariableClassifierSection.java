package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.window.Window;
import org.storydriven.storydiagrams.diagram.custom.ResourceManager;
import org.storydriven.storydiagrams.diagram.custom.dialogs.SelectEClassDialog;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractEListComboSection;
import org.storydriven.storydiagrams.diagram.custom.util.ActivityUtil;
import org.storydriven.storydiagrams.diagram.custom.util.EcoreTextUtil;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

public class ObjectVariableClassifierSection extends AbstractEListComboSection<EClass> {
	private SelectEClassDialog dialog;

	public ObjectVariableClassifierSection() {
		dialog = new SelectEClassDialog();
	}

	@Override
	protected void handleSearchButtonClicked() {
		dialog.setActivity(ActivityUtil.getActivity(getElement()));
		dialog.setElement(((ObjectVariable) getElement()).getClassifier());
		if (dialog.open() == Window.OK) {
			EClass result = dialog.getElement();
			execute(getFeature(), result);
			refresh();
		}
	}

	@Override
	protected EStructuralFeature getFeature() {
		return PatternsPackage.Literals.OBJECT_VARIABLE__CLASSIFIER;
	}

	@Override
	protected List<EClass> getItems() {
		return ResourceManager.get(ActivityUtil.getActivity(getElement())).getEClasses();
	}

	@Override
	protected String getLabelText() {
		return "Type";
	}

	@Override
	protected boolean isShowSearchButton() {
		return true;
	}

	@Override
	protected String getText(EClass element) {
		return EcoreTextUtil.getQualifiedText(element);
	}
}
