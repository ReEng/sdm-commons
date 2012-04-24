package org.storydriven.storydiagrams.diagram.custom.properties;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.jface.viewers.IStructuredSelection;

public abstract class AbstractFilter implements IFilter {

	@Override
	public boolean select(Object element) {
		if (element instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) element;
			if (selection.size() == 1) {
				return select(selection.getFirstElement());
			}
		}
		if (element instanceof EditPart) {
			EditPart part = (EditPart) element;
			if (part.getModel() instanceof View) {
				View view = (View) part.getModel();
				if (view.getElement() instanceof EObject) {
					return select(view.getElement());
				}
			}
		}
		if (element instanceof EObject) {
			return select((EObject) element);
		}
		return false;
	}

	protected abstract boolean select(EObject element);
}
