package de.upb.swt.core.ui.properties.filters;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.jface.viewers.IStructuredSelection;

import de.upb.swt.core.ui.properties.util.PropertiesAdaptor;

/**
 * This class can easily be used as base class for tabbed property sheet section filters when the delivered
 * {@link IStructuredSelection selection} contains {@link EObject}s or objects {@link IAdaptable adaptable} to an
 * EObject. Such as GMF edit parts.
 * 
 * @author Aljoscha Hark <aljoschability@gmail.com>
 */
public abstract class AbstractFilter implements IFilter {
	@Override
	public boolean select(Object element) {
		EObject adapted = PropertiesAdaptor.adapt(element);
		if (adapted != null) {
			return select(adapted);
		}

		return false;
	}

	/**
	 * <p>
	 * This method should be implemented in such a way that it check whether the element should be selected. As used in
	 * a property sheet section, it should return <code>true</code> if the section should be shown for the given
	 * element.
	 * </p>
	 * <p>
	 * For example, when you only want to show elements of <code>MySpecificEObject</code>, you simply have to implement
	 * the following:
	 * </p>
	 * 
	 * <pre>
	 * protected boolean select(EObject element) {
	 * 	return element instanceof MySpecificEObject;
	 * }
	 * </pre>
	 * <p>
	 * You can also check advanced things on the element, such as attributes or references. The method's parameter is
	 * always an instance of an {@link EObject}.
	 * </p>
	 * 
	 * @param element The element to test.
	 * @return Should return <code>true</code> when the given element should be selected.
	 */
	protected abstract boolean select(EObject element);
}
