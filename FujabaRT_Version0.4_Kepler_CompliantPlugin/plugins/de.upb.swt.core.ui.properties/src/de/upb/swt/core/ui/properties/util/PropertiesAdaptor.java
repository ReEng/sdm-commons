package de.upb.swt.core.ui.properties.util;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;

public final class PropertiesAdaptor {
	private PropertiesAdaptor() {
		// hide constructor
	}

	public static EditingDomain getEditingDomain(Object element) {
		return AdapterFactoryEditingDomain.getEditingDomainFor(element);
	}

	public static EObject adapt(Object element) {
		// EObject
		if (element instanceof EObject) {
			return (EObject) element;
		}

		// adaptable
		if (element instanceof IAdaptable) {
			Object adapted = ((IAdaptable) element).getAdapter(EObject.class);
			if (adapted instanceof EObject) {
				return (EObject) adapted;
			}
		}

		// whole selection
		if (element instanceof IStructuredSelection) {
			return adapt((IStructuredSelection) element);
		}

		return null;
	}

	private static EObject adapt(IStructuredSelection element) {
		for (Object selected : element.toArray()) {
			EObject adapted = adapt(selected);
			if (adapted != null) {
				return adapted;
			}
		}
		return null;
	}
}
