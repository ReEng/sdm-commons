package org.storydriven.storydiagrams.diagram.custom.properties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor.Registry;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class StorydiagramsPropertiesLabelProvider extends LabelProvider {
	private AdapterFactoryLabelProvider aflp;

	public StorydiagramsPropertiesLabelProvider() {
		Registry reg = ComposedAdapterFactory.Descriptor.Registry.INSTANCE;
		AdapterFactory af = new ComposedAdapterFactory(reg);

		aflp = new AdapterFactoryLabelProvider(af);
	}

	@Override
	public void dispose() {
		aflp.dispose();
	}

	@Override
	public String getText(Object element) {
		if (element instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) element;
			if (selection.size() == 1) {
				return getText(selection.getFirstElement());
			}
		}
		if (element instanceof EditPart) {
			return getText(((EditPart) element).getModel());
		}
		if (element instanceof View) {
			return getText(((View) element).getElement());
		}

		return aflp.getText(element);
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) element;
			if (selection.size() == 1) {
				return getImage(selection.getFirstElement());
			}
		}
		if (element instanceof EditPart) {
			return getImage(((EditPart) element).getModel());
		}
		if (element instanceof View) {
			return getImage(((View) element).getElement());
		}

		return aflp.getImage(element);
	}
}
