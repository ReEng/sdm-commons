package org.storydriven.modeling.activities.descriptor;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.calls.descriptor.CallableParametersPropertyDescriptor;

public class ActivityParametersPropertyDescriptor extends
		CallableParametersPropertyDescriptor {

	public ActivityParametersPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}

	protected void setContainedValues(Object object,
			Collection<Object> containedValues) {
		EObject eObject = (EObject) object;
		EObject operationExtension = (EObject) eObject
				.eGet(ActivitiesPackage.Literals.ACTIVITY__OWNING_OPERATION);
		if (operationExtension != null) {
			EObject operation = (EObject) operationExtension
					.eGet(ActivitiesPackage.Literals.OPERATION_EXTENSION__OPERATION);
			if (operation != null) {
				setFeatureValue(EcorePackage.Literals.EOPERATION__EPARAMETERS,
						operation, containedValues);
				return;
			}
		}
		super.setContainedValues(eObject, containedValues);
	}
}
