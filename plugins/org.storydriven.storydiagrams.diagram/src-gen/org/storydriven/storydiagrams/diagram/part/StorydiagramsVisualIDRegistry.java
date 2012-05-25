package org.storydriven.storydiagrams.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityCallNodeCalleeLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityCallNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityCallNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEdgeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEdgeGuardConstraintLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.AttributeAssignmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ConstraintEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ContainmentRelationEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ContainmentRelationOperatorLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.JunctionNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.JunctionNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableOperatorLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableSourceEndLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableTargetEndLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingPatternEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingPatternStoryPatternCompartementEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingStoryNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingStoryNodeMatchingStoryNodeConstraintsCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingStoryNodeMatchingStoryNodeContentCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingStoryNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeModifyingStoryNodeConstraintsCompartment2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeModifyingStoryNodeConstraintsCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeModifyingStoryNodeContentCompartment2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeModifyingStoryNodeContentCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeName2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableBindingOperatorEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableClassifierLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableObjectVariableConstraintsCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.PathEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.PrimitiveVariableClassifierLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.PrimitiveVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.PrimitiveVariableNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.PrimitiveVariablePrimitiveVariableConstraintsCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StartNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StartNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StartNodeSignatureLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeExpressionLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeName2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StopNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StopNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StopNodeSignatureLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StoryPatternEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StoryPatternStoryPatternCompartementEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StructuredNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StructuredNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StructuredNodeName2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StructuredNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StructuredNodeStructuredNodeCompartment2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StructuredNodeStructuredNodeCompartmentEditPart;
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
		return org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry.getVisualID(view.getType());
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
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				StorydiagramsDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: " + type);
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
		if (ActivitiesPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())
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
			if (ActivitiesPackage.eINSTANCE.getActivityCallNode().isSuperTypeOf(domainElement.eClass())) {
				return ActivityCallNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStatementNode().isSuperTypeOf(domainElement.eClass())) {
				return StatementNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getModifyingStoryNode().isSuperTypeOf(domainElement.eClass())) {
				return ModifyingStoryNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getMatchingStoryNode().isSuperTypeOf(domainElement.eClass())) {
				return MatchingStoryNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStructuredNode().isSuperTypeOf(domainElement.eClass())) {
				return StructuredNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStartNode().isSuperTypeOf(domainElement.eClass())) {
				return StartNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getJunctionNode().isSuperTypeOf(domainElement.eClass())) {
				return JunctionNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStopNode().isSuperTypeOf(domainElement.eClass())) {
				return StopNodeEditPart.VISUAL_ID;
			}
			break;
		case ModifyingStoryNodeModifyingStoryNodeContentCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getStoryPattern().isSuperTypeOf(domainElement.eClass())) {
				return StoryPatternEditPart.VISUAL_ID;
			}
			break;
		case StoryPatternStoryPatternCompartementEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getObjectVariable().isSuperTypeOf(domainElement.eClass())) {
				return ObjectVariableEditPart.VISUAL_ID;
			}
			if (PatternsPackage.eINSTANCE.getPrimitiveVariable().isSuperTypeOf(domainElement.eClass())) {
				return PrimitiveVariableEditPart.VISUAL_ID;
			}
			break;
		case ObjectVariableObjectVariableConstraintsCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
				return ConstraintEditPart.VISUAL_ID;
			}
			break;
		case ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getAttributeAssignment().isSuperTypeOf(domainElement.eClass())) {
				return AttributeAssignmentEditPart.VISUAL_ID;
			}
			break;
		case MatchingStoryNodeMatchingStoryNodeContentCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getMatchingPattern().isSuperTypeOf(domainElement.eClass())) {
				return MatchingPatternEditPart.VISUAL_ID;
			}
			break;
		case MatchingPatternStoryPatternCompartementEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getObjectVariable().isSuperTypeOf(domainElement.eClass())) {
				return ObjectVariableEditPart.VISUAL_ID;
			}
			if (PatternsPackage.eINSTANCE.getPrimitiveVariable().isSuperTypeOf(domainElement.eClass())) {
				return PrimitiveVariableEditPart.VISUAL_ID;
			}
			break;
		case StructuredNodeStructuredNodeCompartmentEditPart.VISUAL_ID:
			if (ActivitiesPackage.eINSTANCE.getJunctionNode().isSuperTypeOf(domainElement.eClass())) {
				return JunctionNode2EditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStartNode().isSuperTypeOf(domainElement.eClass())) {
				return StartNode2EditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStopNode().isSuperTypeOf(domainElement.eClass())) {
				return StopNode2EditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStatementNode().isSuperTypeOf(domainElement.eClass())) {
				return StatementNode2EditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStructuredNode().isSuperTypeOf(domainElement.eClass())) {
				return StructuredNode2EditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getModifyingStoryNode().isSuperTypeOf(domainElement.eClass())) {
				return ModifyingStoryNode2EditPart.VISUAL_ID;
			}
			break;
		case StructuredNodeStructuredNodeCompartment2EditPart.VISUAL_ID:
			if (ActivitiesPackage.eINSTANCE.getJunctionNode().isSuperTypeOf(domainElement.eClass())) {
				return JunctionNode2EditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStartNode().isSuperTypeOf(domainElement.eClass())) {
				return StartNode2EditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStopNode().isSuperTypeOf(domainElement.eClass())) {
				return StopNode2EditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStatementNode().isSuperTypeOf(domainElement.eClass())) {
				return StatementNode2EditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStructuredNode().isSuperTypeOf(domainElement.eClass())) {
				return StructuredNode2EditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getModifyingStoryNode().isSuperTypeOf(domainElement.eClass())) {
				return ModifyingStoryNode2EditPart.VISUAL_ID;
			}
			break;
		case ModifyingStoryNodeModifyingStoryNodeContentCompartment2EditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getStoryPattern().isSuperTypeOf(domainElement.eClass())) {
				return StoryPatternEditPart.VISUAL_ID;
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
			if (StructuredNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StartNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JunctionNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StopNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityCallNodeEditPart.VISUAL_ID:
			if (ActivityCallNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityCallNodeCalleeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StatementNodeEditPart.VISUAL_ID:
			if (StatementNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StatementNodeExpressionLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			if (ModifyingStoryNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ModifyingStoryNodeModifyingStoryNodeConstraintsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ModifyingStoryNodeModifyingStoryNodeContentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MatchingStoryNodeEditPart.VISUAL_ID:
			if (MatchingStoryNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MatchingStoryNodeMatchingStoryNodeConstraintsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MatchingStoryNodeMatchingStoryNodeContentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuredNodeEditPart.VISUAL_ID:
			if (StructuredNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StructuredNodeStructuredNodeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StartNodeEditPart.VISUAL_ID:
			if (StartNodeSignatureLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StopNodeEditPart.VISUAL_ID:
			if (StopNodeSignatureLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StoryPatternEditPart.VISUAL_ID:
			if (StoryPatternStoryPatternCompartementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ObjectVariableEditPart.VISUAL_ID:
			if (ObjectVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ObjectVariableBindingOperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ObjectVariableClassifierLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ObjectVariableObjectVariableConstraintsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimitiveVariableEditPart.VISUAL_ID:
			if (PrimitiveVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveVariableClassifierLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveVariablePrimitiveVariableConstraintsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MatchingPatternEditPart.VISUAL_ID:
			if (MatchingPatternStoryPatternCompartementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StartNode2EditPart.VISUAL_ID:
			if (StartNodeSignatureLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StopNode2EditPart.VISUAL_ID:
			if (StopNodeSignatureLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StatementNode2EditPart.VISUAL_ID:
			if (StatementNodeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StatementNodeExpressionLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuredNode2EditPart.VISUAL_ID:
			if (StructuredNodeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StructuredNodeStructuredNodeCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModifyingStoryNode2EditPart.VISUAL_ID:
			if (ModifyingStoryNodeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ModifyingStoryNodeModifyingStoryNodeConstraintsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ModifyingStoryNodeModifyingStoryNodeContentCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModifyingStoryNodeModifyingStoryNodeContentCompartmentEditPart.VISUAL_ID:
			if (StoryPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StoryPatternStoryPatternCompartementEditPart.VISUAL_ID:
			if (ObjectVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveVariableEditPart.VISUAL_ID == nodeVisualID) {
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
		case MatchingStoryNodeMatchingStoryNodeContentCompartmentEditPart.VISUAL_ID:
			if (MatchingPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MatchingPatternStoryPatternCompartementEditPart.VISUAL_ID:
			if (ObjectVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuredNodeStructuredNodeCompartmentEditPart.VISUAL_ID:
			if (JunctionNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StartNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StopNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StatementNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StructuredNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ModifyingStoryNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuredNodeStructuredNodeCompartment2EditPart.VISUAL_ID:
			if (JunctionNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StartNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StopNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StatementNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StructuredNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ModifyingStoryNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModifyingStoryNodeModifyingStoryNodeContentCompartment2EditPart.VISUAL_ID:
			if (StoryPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityEdgeEditPart.VISUAL_ID:
			if (ActivityEdgeGuardConstraintLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LinkVariableEditPart.VISUAL_ID:
			if (LinkVariableSourceEndLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LinkVariableOperatorLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LinkVariableTargetEndLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContainmentRelationEditPart.VISUAL_ID:
			if (ContainmentRelationOperatorLabelEditPart.VISUAL_ID == nodeVisualID) {
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
		if (ActivitiesPackage.eINSTANCE.getActivityEdge().isSuperTypeOf(domainElement.eClass())) {
			return ActivityEdgeEditPart.VISUAL_ID;
		}
		if (PatternsPackage.eINSTANCE.getLinkVariable().isSuperTypeOf(domainElement.eClass())) {
			return LinkVariableEditPart.VISUAL_ID;
		}
		if (PatternsPackage.eINSTANCE.getPath().isSuperTypeOf(domainElement.eClass())) {
			return PathEditPart.VISUAL_ID;
		}
		if (PatternsPackage.eINSTANCE.getContainmentRelation().isSuperTypeOf(domainElement.eClass())) {
			return ContainmentRelationEditPart.VISUAL_ID;
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
