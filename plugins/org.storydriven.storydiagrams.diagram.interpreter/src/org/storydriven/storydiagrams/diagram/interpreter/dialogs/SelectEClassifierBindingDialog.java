package org.storydriven.storydiagrams.diagram.interpreter.dialogs;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor.Registry;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.storydriven.storydiagrams.diagram.custom.dialogs.AbstractTreeSelectionDialog;
import org.storydriven.storydiagrams.diagram.interpreter.providers.ResourceContentProvider;
import org.storydriven.storydiagrams.diagram.interpreter.util.Texts;

public class SelectEClassifierBindingDialog extends AbstractTreeSelectionDialog<EObject> {
	private EClassifier eClassifier;
	private Resource resource;

	public SelectEClassifierBindingDialog() {
		super("shellText", "title", "description");
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public void setType(EClassifier eClassifier) {
		this.eClassifier = eClassifier;
	}

	@Override
	protected ITreeContentProvider getContentProvider() {
		return new ResourceContentProvider();
	}

	@Override
	protected Object getInput() {
		return resource;
	}

	@Override
	protected ILabelProvider getLabelProvider() {
		Registry registry = ComposedAdapterFactory.Descriptor.Registry.INSTANCE;
		AdapterFactory adapterFactory = new ComposedAdapterFactory(registry);
		return new AdapterFactoryLabelProvider(adapterFactory);
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
		return String.format("You have to select an element of the type %1s.", Texts.get(eClassifier));
	}
}
