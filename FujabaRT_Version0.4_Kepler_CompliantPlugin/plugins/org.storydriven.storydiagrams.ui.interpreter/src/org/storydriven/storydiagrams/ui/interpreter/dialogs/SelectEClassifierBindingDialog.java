package org.storydriven.storydiagrams.ui.interpreter.dialogs;

import java.text.MessageFormat;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.storydriven.storydiagrams.ui.interpreter.ResourcesContentProvider;
import org.storydriven.storydiagrams.ui.interpreter.ResourcesLabelProvider;
import org.storydriven.storydiagrams.ui.interpreter.util.TextUtil;
import org.storydriven.storydiagrams.ui.interpreter.wizards.IEPackageController;

public class SelectEClassifierBindingDialog extends AbstractTreeSelectionDialog<EObject> {
	private EClassifier eClassifier;
	private IEPackageController controller;

	public SelectEClassifierBindingDialog(IEPackageController controller) {
		super("Parameter Binding", "Select Parameter Binding",
				"Select the element that should be injected as parameter value.");

		this.controller = controller;
	}

	public void setType(EClassifier eClassifier) {
		this.eClassifier = eClassifier;
	}

	@Override
	protected ITreeContentProvider getContentProvider() {
		return new ResourcesContentProvider(controller.getAdapterFactory());
	}

	@Override
	protected Object getInput() {
		return controller.getAddedResources();
	}

	@Override
	protected ILabelProvider getLabelProvider() {
		return new ResourcesLabelProvider(controller.getAdapterFactory());
	}

	@Override
	protected ViewerFilter getViewerFilter() {
		return new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parent, Object element) {
				if (eClassifier != null && eClassifier.isInstance(element)) {
					return true;
				}
				if (element instanceof Resource) {
					for (EObject content : ((Resource) element).getContents()) {
						if (select(viewer, element, content)) {
							return true;
						}
					}
				}
				if (element instanceof EObject) {
					for (EObject content : ((EObject) element).eContents()) {
						if (select(viewer, element, content)) {
							return true;
						}
					}
				}
				return false;
			}
		};
	}

	@Override
	protected String getErrorMessage(Object element) {
		if (eClassifier != null && eClassifier.isInstance(element)) {
			return null;
		}
		String pattern = "Select an element of the type {0}.";
		return MessageFormat.format(pattern, TextUtil.getText(eClassifier));
	}
}
