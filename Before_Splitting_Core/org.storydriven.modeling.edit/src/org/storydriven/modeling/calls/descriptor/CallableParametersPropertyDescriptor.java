package org.storydriven.modeling.calls.descriptor;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.storydriven.modeling.calls.CallsPackage;

public class CallableParametersPropertyDescriptor extends
		ItemPropertyDescriptor {
	
	private Collection<EStructuralFeature> parameterFeatures = new ArrayList<EStructuralFeature>();

	public CallableParametersPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
		Assert.isLegal(isMany(null));
		addParameterFeature(CallsPackage.Literals.CALLABLE__IN_PARAMETER);
		addParameterFeature(CallsPackage.Literals.CALLABLE__OUT_PARAMETER);
	}
	
	protected void addParameterFeature(EStructuralFeature feature) {
		Assert.isLegal(feature.isMany());
		parameterFeatures.add(feature);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setPropertyValue(Object object, Object newValue) {
		EObject element = (EObject) object;
		
		// Collection<Object> containedValues = (Collection<Object>) unwrap(getPropertyValue(object));
		// containedValues.clear();
		Collection<Object> containedValues = new ArrayList<Object>();
		
		for (EStructuralFeature feature : parameterFeatures) {
			Collection<Object> values;
			
			if (feature.equals(getFeature(object))) {
				values = (Collection<Object>) newValue;
			} else {
				values = (Collection<Object>) element.eGet(feature);
			}
			containedValues.addAll(values);
		}
		setContainedValues(object, containedValues);

		super.setPropertyValue(object, newValue);
	}

	protected void setContainedValues(Object object,
			Collection<Object> containedValues) {
		setFeatureValue(CallsPackage.Literals.CALLABLE__CONTAINED_PARAMETERS, object, containedValues);
	}

	public void setFeatureValue(EStructuralFeature feature, Object object,
			Object value) {
		EditingDomain editingDomain = getEditingDomain(object);
		if (editingDomain == null) {
			((EObject) object).eSet(feature, value);
		} else {
			Command setCommand = SetCommand.create(editingDomain, object,
					feature,
					value);
			editingDomain.getCommandStack().execute(setCommand);
		}

	}

	@SuppressWarnings("unchecked")
	protected Collection<Object> getContainedValues(Object object) {
		EObject callable = (EObject) object;
		return (Collection<Object>) callable
				.eGet(CallsPackage.Literals.CALLABLE__CONTAINED_PARAMETERS);
	}

	/**
	 * Auxiliary method to unwrap a value.
	 * 
	 * @param value
	 *            The PropertyValueWrapper.
	 * @return The wrapped value.
	 */
	protected static Object unwrap(Object value) {
		if (value instanceof ItemPropertyDescriptor.PropertyValueWrapper) {
			value = ((ItemPropertyDescriptor.PropertyValueWrapper) value)
					.getEditableValue(value);
		}
		return value;
	}

}
