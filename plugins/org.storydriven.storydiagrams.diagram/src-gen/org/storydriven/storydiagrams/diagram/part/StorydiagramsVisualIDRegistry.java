package org.storydriven.storydiagrams.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityCallNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityCallNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEdgeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityFinalNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.AttributeAssignmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.CollectionVariableCollectionVariableConstraintsCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.CollectionVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.CollectionVariableNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.Constraint2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ConstraintEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.InclusionLinkEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.InitialNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.JunctionNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingPatternEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingPatternStoryPatternConstraintsCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingPatternStoryPatternContentCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingStoryNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingStoryNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingStoryNodeStoryNodePatternCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeStoryNodePatternCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableObjectVariableConstraintsCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StoryPatternEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StoryPatternStoryPatternConstraintsCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StoryPatternStoryPatternContentCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.WrappingLabel10EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.WrappingLabel11EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.WrappingLabel12EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.WrappingLabel13EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.WrappingLabel2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.WrappingLabel3EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.WrappingLabel4EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.WrappingLabel5EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.WrappingLabel6EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.WrappingLabel7EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.WrappingLabel8EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.WrappingLabel9EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.WrappingLabelEditPart;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class StorydiagramsVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.storydriven.storydiagrams.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ActivityEditPart.MODEL_ID.equals(view.getType())) {
				return ActivityEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				StorydiagramsDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ActivitiesPackage.eINSTANCE.getActivity().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Activity) domainElement)) {
			return ActivityEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry
				.getModelID(containerView);
		if (!ActivityEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ActivityEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ActivityEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ActivityEditPart.VISUAL_ID:
			if (ActivitiesPackage.eINSTANCE.getActivityCallNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityCallNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStatementNode().isSuperTypeOf(
					domainElement.eClass())) {
				return StatementNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getModifyingStoryNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ModifyingStoryNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getMatchingStoryNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return MatchingStoryNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getInitialNode().isSuperTypeOf(
					domainElement.eClass())) {
				return InitialNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getJunctionNode().isSuperTypeOf(
					domainElement.eClass())) {
				return JunctionNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getActivityFinalNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityFinalNodeEditPart.VISUAL_ID;
			}
			break;
		case ModifyingStoryNodeStoryNodePatternCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getStoryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return StoryPatternEditPart.VISUAL_ID;
			}
			break;
		case StoryPatternStoryPatternContentCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getObjectVariable().isSuperTypeOf(
					domainElement.eClass())) {
				return ObjectVariableEditPart.VISUAL_ID;
			}
			if (PatternsPackage.eINSTANCE.getCollectionVariable()
					.isSuperTypeOf(domainElement.eClass())) {
				return CollectionVariableEditPart.VISUAL_ID;
			}
			break;
		case StoryPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getConstraint().isSuperTypeOf(
					domainElement.eClass())) {
				return Constraint2EditPart.VISUAL_ID;
			}
			break;
		case ObjectVariableObjectVariableConstraintsCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getConstraint().isSuperTypeOf(
					domainElement.eClass())) {
				return ConstraintEditPart.VISUAL_ID;
			}
			break;
		case ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getAttributeAssignment()
					.isSuperTypeOf(domainElement.eClass())) {
				return AttributeAssignmentEditPart.VISUAL_ID;
			}
			break;
		case CollectionVariableCollectionVariableConstraintsCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getConstraint().isSuperTypeOf(
					domainElement.eClass())) {
				return ConstraintEditPart.VISUAL_ID;
			}
			break;
		case CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getAttributeAssignment()
					.isSuperTypeOf(domainElement.eClass())) {
				return AttributeAssignmentEditPart.VISUAL_ID;
			}
			break;
		case MatchingStoryNodeStoryNodePatternCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getMatchingPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return MatchingPatternEditPart.VISUAL_ID;
			}
			break;
		case MatchingPatternStoryPatternContentCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getObjectVariable().isSuperTypeOf(
					domainElement.eClass())) {
				return ObjectVariableEditPart.VISUAL_ID;
			}
			if (PatternsPackage.eINSTANCE.getCollectionVariable()
					.isSuperTypeOf(domainElement.eClass())) {
				return CollectionVariableEditPart.VISUAL_ID;
			}
			break;
		case MatchingPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getConstraint().isSuperTypeOf(
					domainElement.eClass())) {
				return Constraint2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry
				.getModelID(containerView);
		if (!ActivityEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ActivityEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ActivityEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ActivityEditPart.VISUAL_ID:
			if (ActivityCallNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StatementNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ModifyingStoryNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MatchingStoryNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JunctionNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityFinalNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityCallNodeEditPart.VISUAL_ID:
			if (ActivityCallNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StatementNodeEditPart.VISUAL_ID:
			if (StatementNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			if (ModifyingStoryNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ModifyingStoryNodeStoryNodePatternCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MatchingStoryNodeEditPart.VISUAL_ID:
			if (MatchingStoryNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MatchingStoryNodeStoryNodePatternCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InitialNodeEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityFinalNodeEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StoryPatternEditPart.VISUAL_ID:
			if (StoryPatternStoryPatternContentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StoryPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ObjectVariableEditPart.VISUAL_ID:
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ObjectVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ObjectVariableObjectVariableConstraintsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CollectionVariableEditPart.VISUAL_ID:
			if (WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollectionVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollectionVariableCollectionVariableConstraintsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MatchingPatternEditPart.VISUAL_ID:
			if (MatchingPatternStoryPatternContentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MatchingPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModifyingStoryNodeStoryNodePatternCompartmentEditPart.VISUAL_ID:
			if (StoryPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StoryPatternStoryPatternContentCompartmentEditPart.VISUAL_ID:
			if (ObjectVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollectionVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StoryPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID:
			if (Constraint2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ObjectVariableObjectVariableConstraintsCompartmentEditPart.VISUAL_ID:
			if (ConstraintEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
			if (AttributeAssignmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CollectionVariableCollectionVariableConstraintsCompartmentEditPart.VISUAL_ID:
			if (ConstraintEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
			if (AttributeAssignmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MatchingStoryNodeStoryNodePatternCompartmentEditPart.VISUAL_ID:
			if (MatchingPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MatchingPatternStoryPatternContentCompartmentEditPart.VISUAL_ID:
			if (ObjectVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollectionVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MatchingPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID:
			if (Constraint2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityEdgeEditPart.VISUAL_ID:
			if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LinkVariableEditPart.VISUAL_ID:
			if (WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InclusionLinkEditPart.VISUAL_ID:
			if (WrappingLabel13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ActivitiesPackage.eINSTANCE.getActivityEdge().isSuperTypeOf(
				domainElement.eClass())) {
			return ActivityEdgeEditPart.VISUAL_ID;
		}
		if (PatternsPackage.eINSTANCE.getLinkVariable().isSuperTypeOf(
				domainElement.eClass())) {
			return LinkVariableEditPart.VISUAL_ID;
		}
		if (PatternsPackage.eINSTANCE.getInclusionLink().isSuperTypeOf(
				domainElement.eClass())) {
			return InclusionLinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Activity element) {
		return true;
	}

}
