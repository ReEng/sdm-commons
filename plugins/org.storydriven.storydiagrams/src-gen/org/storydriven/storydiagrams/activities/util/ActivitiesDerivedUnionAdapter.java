/**
 */
package org.storydriven.storydiagrams.activities.util;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.storydriven.core.CorePackage;

import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.ExceptionVariable;
import org.storydriven.storydiagrams.activities.MatchingStoryNode;
import org.storydriven.storydiagrams.activities.ModifyingStoryNode;
import org.storydriven.storydiagrams.activities.OperationExtension;

/**
 * <!-- begin-user-doc -->
 * An adapter that propagates notifications for derived unions.
 * <!-- end-user-doc -->
 * @see org.storydriven.storydiagrams.activities.ActivitiesPackage
 * @generated
 */
public class ActivitiesDerivedUnionAdapter extends AdapterImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActivitiesPackage modelPackage;

	/**
	 * Creates an instance of the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitiesDerivedUnionAdapter() {
		if (modelPackage == null) {
			modelPackage = ActivitiesPackage.eINSTANCE;
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
		case ActivitiesPackage.EXCEPTION_VARIABLE:
			notifyExceptionVariableChanged(notification, eClass);
			break;
		case ActivitiesPackage.OPERATION_EXTENSION:
			notifyOperationExtensionChanged(notification, eClass);
			break;
		case ActivitiesPackage.MATCHING_STORY_NODE:
			notifyMatchingStoryNodeChanged(notification, eClass);
			break;
		case ActivitiesPackage.MODIFYING_STORY_NODE:
			notifyModifyingStoryNodeChanged(notification, eClass);
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
	protected void notifyExceptionVariableChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ExceptionVariable.class)) {
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
	protected void notifyOperationExtensionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(OperationExtension.class)) {
		case ActivitiesPackage.OPERATION_EXTENSION__MODEL_BASE:
			notifyChanged(notification, eClass,
					CorePackage.Literals.EXTENSION__BASE);
			break;
		case ActivitiesPackage.OPERATION_EXTENSION__EXTENDABLE_BASE:
			notifyChanged(notification, eClass,
					CorePackage.Literals.EXTENSION__BASE);
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
	protected void notifyMatchingStoryNodeChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(MatchingStoryNode.class)) {
		case ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN:
			notifyChanged(notification, eClass,
					ActivitiesPackage.Literals.STORY_NODE__STORY_PATTERN);
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
	protected void notifyModifyingStoryNodeChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ModifyingStoryNode.class)) {
		case ActivitiesPackage.MODIFYING_STORY_NODE__OWNED_RULE:
			notifyChanged(notification, eClass,
					ActivitiesPackage.Literals.STORY_NODE__STORY_PATTERN);
			break;
		}
	}

} //ActivitiesDerivedUnionAdapter
