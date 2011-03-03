package org.storydriven.modeling.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.diagram.edit.parts.ActivityEdgeEditPart;
import org.storydriven.modeling.diagram.edit.parts.ActivityEditPart;
import org.storydriven.modeling.diagram.edit.parts.JunctionNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.JunctionNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.MatchingPatternEditPart;
import org.storydriven.modeling.diagram.edit.parts.MatchingPatternStoryPatternCompartementEditPart;
import org.storydriven.modeling.diagram.edit.parts.MatchingStoryNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.MatchingStoryNodeMatchingStoryNodeConstraintsCompartmentEditPart;
import org.storydriven.modeling.diagram.edit.parts.MatchingStoryNodeMatchingStoryNodeContentCompartmentEditPart;
import org.storydriven.modeling.diagram.edit.parts.MatchingStoryNodeNameEditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNodeModifyingStoryNodeConstraintsCompartmentEditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNodeModifyingStoryNodeContentCompartmentEditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNodeNameEditPart;
import org.storydriven.modeling.diagram.edit.parts.ObjectVariableEditPart;
import org.storydriven.modeling.diagram.edit.parts.ObjectVariableNameEditPart;
import org.storydriven.modeling.diagram.edit.parts.StartNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StartNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StatementNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StatementNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StatementNodeName2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StatementNodeNameEditPart;
import org.storydriven.modeling.diagram.edit.parts.StopNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StopNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNodeName2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNodeNameEditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNodeStructuredNodeCompartment2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNodeStructuredNodeCompartmentEditPart;
import org.storydriven.modeling.patterns.PatternsPackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class SDMVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.storydriven.modeling.diagram/debug/visualID"; //$NON-NLS-1$

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
		return org.storydriven.modeling.diagram.part.SDMVisualIDRegistry
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
				SDMDiagramEditorPlugin.getInstance().logError(
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
		String containerModelID = org.storydriven.modeling.diagram.part.SDMVisualIDRegistry
				.getModelID(containerView);
		if (!ActivityEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ActivityEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.storydriven.modeling.diagram.part.SDMVisualIDRegistry
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
			if (ActivitiesPackage.eINSTANCE.getStartNode().isSuperTypeOf(
					domainElement.eClass())) {
				return StartNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStopNode().isSuperTypeOf(
					domainElement.eClass())) {
				return StopNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getJunctionNode().isSuperTypeOf(
					domainElement.eClass())) {
				return JunctionNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStatementNode().isSuperTypeOf(
					domainElement.eClass())) {
				return StatementNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStructuredNode().isSuperTypeOf(
					domainElement.eClass())) {
				return StructuredNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getMatchingStoryNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return MatchingStoryNodeEditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getModifyingStoryNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ModifyingStoryNodeEditPart.VISUAL_ID;
			}
			break;
		case StructuredNodeStructuredNodeCompartmentEditPart.VISUAL_ID:
			if (ActivitiesPackage.eINSTANCE.getJunctionNode().isSuperTypeOf(
					domainElement.eClass())) {
				return JunctionNode2EditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStartNode().isSuperTypeOf(
					domainElement.eClass())) {
				return StartNode2EditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStatementNode().isSuperTypeOf(
					domainElement.eClass())) {
				return StatementNode2EditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStopNode().isSuperTypeOf(
					domainElement.eClass())) {
				return StopNode2EditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStructuredNode().isSuperTypeOf(
					domainElement.eClass())) {
				return StructuredNode2EditPart.VISUAL_ID;
			}
			break;
		case StructuredNodeStructuredNodeCompartment2EditPart.VISUAL_ID:
			if (ActivitiesPackage.eINSTANCE.getJunctionNode().isSuperTypeOf(
					domainElement.eClass())) {
				return JunctionNode2EditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStartNode().isSuperTypeOf(
					domainElement.eClass())) {
				return StartNode2EditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStatementNode().isSuperTypeOf(
					domainElement.eClass())) {
				return StatementNode2EditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStopNode().isSuperTypeOf(
					domainElement.eClass())) {
				return StopNode2EditPart.VISUAL_ID;
			}
			if (ActivitiesPackage.eINSTANCE.getStructuredNode().isSuperTypeOf(
					domainElement.eClass())) {
				return StructuredNode2EditPart.VISUAL_ID;
			}
			break;
		case MatchingStoryNodeMatchingStoryNodeContentCompartmentEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getMatchingPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return MatchingPatternEditPart.VISUAL_ID;
			}
			break;
		case MatchingPatternStoryPatternCompartementEditPart.VISUAL_ID:
			if (PatternsPackage.eINSTANCE.getObjectVariable().isSuperTypeOf(
					domainElement.eClass())) {
				return ObjectVariableEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.storydriven.modeling.diagram.part.SDMVisualIDRegistry
				.getModelID(containerView);
		if (!ActivityEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ActivityEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.storydriven.modeling.diagram.part.SDMVisualIDRegistry
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
			if (StartNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StopNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JunctionNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StatementNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StructuredNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MatchingStoryNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ModifyingStoryNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StatementNodeEditPart.VISUAL_ID:
			if (StatementNodeNameEditPart.VISUAL_ID == nodeVisualID) {
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
		case MatchingStoryNodeEditPart.VISUAL_ID:
			if (MatchingStoryNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MatchingStoryNodeMatchingStoryNodeContentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MatchingStoryNodeMatchingStoryNodeConstraintsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
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
		case StatementNode2EditPart.VISUAL_ID:
			if (StatementNodeName2EditPart.VISUAL_ID == nodeVisualID) {
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
		case MatchingPatternEditPart.VISUAL_ID:
			if (MatchingPatternStoryPatternCompartementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ObjectVariableEditPart.VISUAL_ID:
			if (ObjectVariableNameEditPart.VISUAL_ID == nodeVisualID) {
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
			if (StatementNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StopNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StructuredNode2EditPart.VISUAL_ID == nodeVisualID) {
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
			if (StatementNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StopNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StructuredNode2EditPart.VISUAL_ID == nodeVisualID) {
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
