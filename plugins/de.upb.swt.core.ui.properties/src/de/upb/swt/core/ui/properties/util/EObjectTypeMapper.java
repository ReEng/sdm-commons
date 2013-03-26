package de.upb.swt.core.ui.properties.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.views.properties.tabbed.AbstractTypeMapper;


public class EObjectTypeMapper extends AbstractTypeMapper {
	@Override
	@SuppressWarnings("rawtypes")
	public Class mapType(Object object) {
		EObject adapted = PropertiesAdaptor.adapt(object);
		if (adapted != null) {
			return adapted.eClass().getInstanceClass();
		}

		return super.mapType(object);
	}
}
