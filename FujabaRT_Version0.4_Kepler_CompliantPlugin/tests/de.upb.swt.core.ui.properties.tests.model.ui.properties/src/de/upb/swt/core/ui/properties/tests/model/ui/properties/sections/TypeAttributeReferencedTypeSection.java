package de.upb.swt.core.ui.properties.tests.model.ui.properties.sections;

import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.upb.swt.core.ui.properties.sections.AbstractComboSection;
import de.upb.swt.core.ui.properties.tests.model.ModelPackage;
import de.upb.swt.core.ui.properties.tests.model.Type;
import de.upb.swt.core.ui.properties.tests.model.TypeAttribute;
import de.upb.swt.core.ui.properties.util.State;

public class TypeAttributeReferencedTypeSection extends AbstractComboSection<Type> {
	@Override
	protected List<Type> getItems() {
		return getElement().getType().getContainer().getTypes();
	}

	@Override
	protected TypeAttribute getElement() {
		return (TypeAttribute) super.getElement();
	}

	@Override
	protected String getLabelText() {
		return "Referenced Type";
	}

	@Override
	protected State validate(Type value) {
		if (getElement().getType().equals(value)) {
			return State.error("The referenced type is invalid - it should not reference the container type.");
		}
		return State.info("The referenced type for the attribute");
	}

	@Override
	protected EStructuralFeature getFeature() {
		return ModelPackage.Literals.TYPE_ATTRIBUTE__REFERENCED_TYPE;
	}
}
