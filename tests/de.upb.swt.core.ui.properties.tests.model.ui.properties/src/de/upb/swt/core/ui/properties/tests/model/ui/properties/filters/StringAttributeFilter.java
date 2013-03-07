package de.upb.swt.core.ui.properties.tests.model.ui.properties.filters;

import org.eclipse.emf.ecore.EObject;

import de.upb.swt.core.ui.properties.filters.AbstractFilter;
import de.upb.swt.core.ui.properties.tests.model.StringAttribute;

public class StringAttributeFilter extends AbstractFilter {
	@Override
	protected boolean select(EObject element) {
		return element instanceof StringAttribute;
	}
}
