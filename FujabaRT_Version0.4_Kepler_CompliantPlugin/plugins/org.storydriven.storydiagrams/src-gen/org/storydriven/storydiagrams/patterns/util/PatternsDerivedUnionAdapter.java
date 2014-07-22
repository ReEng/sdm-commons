/**
 */
package org.storydriven.storydiagrams.patterns.util;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.storydriven.core.CorePackage;

import org.storydriven.storydiagrams.patterns.CollectionVariable;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.PatternsPackage;
import org.storydriven.storydiagrams.patterns.PrimitiveVariable;

/**
 * <!-- begin-user-doc -->
 * An adapter that propagates notifications for derived unions.
 * <!-- end-user-doc -->
 * @see org.storydriven.storydiagrams.patterns.PatternsPackage
 * @generated
 */
public class PatternsDerivedUnionAdapter extends AdapterImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PatternsPackage modelPackage;

	/**
	 * Creates an instance of the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternsDerivedUnionAdapter() {
		if (modelPackage == null) {
			modelPackage = PatternsPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> with the appropriate model class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		Object notifier = notification.getNotifier();
		if (notifier instanceof EObject) {
			EClass eClass = ((EObject) notifier).eClass();
			if (eClass.eContainer() == modelPackage) {
				notifyChanged(notification, eClass);
			}
		}
	}

	/**
	 * Calls <code>notifyXXXChanged</code> for the corresponding class of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyChanged(Notification notification, EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PatternsPackage.OBJECT_VARIABLE:
			notifyObjectVariableChanged(notification, eClass);
			break;
		case PatternsPackage.COLLECTION_VARIABLE:
			notifyCollectionVariableChanged(notification, eClass);
			break;
		case PatternsPackage.PRIMITIVE_VARIABLE:
			notifyPrimitiveVariableChanged(notification, eClass);
			break;
		}
	}

	/**
	 * Does nothing; clients may override so that it does something.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @param derivedUnion the derived union affected by the change.
	 * @generated
	 */
	public void notifyChanged(Notification notification, EClass eClass,
			EStructuralFeature derivedUnion) {
		// Do nothing.
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyObjectVariableChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ObjectVariable.class)) {
		case PatternsPackage.OBJECT_VARIABLE__CLASSIFIER:
			notifyChanged(notification, eClass,
					CorePackage.Literals.TYPED_ELEMENT__TYPE);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyCollectionVariableChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(CollectionVariable.class)) {
		case PatternsPackage.COLLECTION_VARIABLE__CLASSIFIER:
			notifyChanged(notification, eClass,
					CorePackage.Literals.TYPED_ELEMENT__TYPE);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyPrimitiveVariableChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(PrimitiveVariable.class)) {
		case PatternsPackage.PRIMITIVE_VARIABLE__CLASSIFIER:
			notifyChanged(notification, eClass,
					CorePackage.Literals.TYPED_ELEMENT__TYPE);
			break;
		}
	}

} //PatternsDerivedUnionAdapter
