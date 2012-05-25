package org.storydriven.storydiagrams.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityCallNode;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.JunctionNode;
import org.storydriven.storydiagrams.activities.MatchingStoryNode;
import org.storydriven.storydiagrams.activities.ModifyingStoryNode;
import org.storydriven.storydiagrams.activities.StartNode;
import org.storydriven.storydiagrams.activities.StatementNode;
import org.storydriven.storydiagrams.activities.StopNode;
import org.storydriven.storydiagrams.activities.StructuredNode;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityCallNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEdgeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.AttributeAssignmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ConstraintEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ContainmentRelationEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.JunctionNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.JunctionNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingPatternEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingPatternStoryPatternCompartementEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingStoryNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingStoryNodeMatchingStoryNodeContentCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeModifyingStoryNodeContentCompartment2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeModifyingStoryNodeContentCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableObjectVariableConstraintsCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.PathEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.PrimitiveVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StartNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StartNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StopNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StopNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StoryPatternEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StoryPatternStoryPatternCompartementEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StructuredNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StructuredNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StructuredNodeStructuredNodeCompartment2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StructuredNodeStructuredNodeCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.AttributeAssignment;
import org.storydriven.storydiagrams.patterns.Constraint;
import org.storydriven.storydiagrams.patterns.ContainmentRelation;
import org.storydriven.storydiagrams.patterns.LinkVariable;
import org.storydriven.storydiagrams.patterns.MatchingPattern;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.Path;
import org.storydriven.storydiagrams.patterns.PatternsPackage;
import org.storydriven.storydiagrams.patterns.PrimitiveVariable;
import org.storydriven.storydiagrams.patterns.StoryPattern;

/**
 * @generated
 */
public class StorydiagramsDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<StorydiagramsNodeDescriptor> getSemanticChildren(View view) {
		switch (StorydiagramsVisualIDRegistry.getVisualID(view)) {
		case ActivityEditPart.VISUAL_ID:
			return getActivity_1000SemanticChildren(view);
		case ModifyingStoryNodeModifyingStoryNodeContentCompartmentEditPart.VISUAL_ID:
			return getModifyingStoryNodeModifyingStoryNodeContentCompartment_7013SemanticChildren(view);
		case StoryPatternStoryPatternCompartementEditPart.VISUAL_ID:
			return getStoryPatternStoryPatternCompartement_7007SemanticChildren(view);
		case ObjectVariableObjectVariableConstraintsCompartmentEditPart.VISUAL_ID:
			return getObjectVariableObjectVariableConstraintsCompartment_7008SemanticChildren(view);
		case ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
			return getObjectVariableObjectVariableAttributeAssignmentsCompartment_7009SemanticChildren(view);
		case MatchingStoryNodeMatchingStoryNodeContentCompartmentEditPart.VISUAL_ID:
			return getMatchingStoryNodeMatchingStoryNodeContentCompartment_7015SemanticChildren(view);
		case MatchingPatternStoryPatternCompartementEditPart.VISUAL_ID:
			return getMatchingPatternStoryPatternCompartement_7016SemanticChildren(view);
		case StructuredNodeStructuredNodeCompartmentEditPart.VISUAL_ID:
			return getStructuredNodeStructuredNodeCompartment_7002SemanticChildren(view);
		case StructuredNodeStructuredNodeCompartment2EditPart.VISUAL_ID:
			return getStructuredNodeStructuredNodeCompartment_7004SemanticChildren(view);
		case ModifyingStoryNodeModifyingStoryNodeContentCompartment2EditPart.VISUAL_ID:
			return getModifyingStoryNodeModifyingStoryNodeContentCompartment_7006SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsNodeDescriptor> getActivity_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Activity modelElement = (Activity) view.getElement();
		LinkedList<StorydiagramsNodeDescriptor> result = new LinkedList<StorydiagramsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedActivityNodes().iterator(); it.hasNext();) {
			ActivityNode childElement = (ActivityNode) it.next();
			int visualID = StorydiagramsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ActivityCallNodeEditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StatementNodeEditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ModifyingStoryNodeEditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MatchingStoryNodeEditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StructuredNodeEditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StartNodeEditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JunctionNodeEditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StopNodeEditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsNodeDescriptor> getModifyingStoryNodeModifyingStoryNodeContentCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ModifyingStoryNode modelElement = (ModifyingStoryNode) containerView.getElement();
		LinkedList<StorydiagramsNodeDescriptor> result = new LinkedList<StorydiagramsNodeDescriptor>();
		{
			StoryPattern childElement = modelElement.getOwnedRule();
			int visualID = StorydiagramsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StoryPatternEditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsNodeDescriptor> getStoryPatternStoryPatternCompartement_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StoryPattern modelElement = (StoryPattern) containerView.getElement();
		LinkedList<StorydiagramsNodeDescriptor> result = new LinkedList<StorydiagramsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getVariables().iterator(); it.hasNext();) {
			AbstractVariable childElement = (AbstractVariable) it.next();
			int visualID = StorydiagramsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ObjectVariableEditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PrimitiveVariableEditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsNodeDescriptor> getObjectVariableObjectVariableConstraintsCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ObjectVariable modelElement = (ObjectVariable) containerView.getElement();
		LinkedList<StorydiagramsNodeDescriptor> result = new LinkedList<StorydiagramsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConstraints().iterator(); it.hasNext();) {
			Constraint childElement = (Constraint) it.next();
			int visualID = StorydiagramsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ConstraintEditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsNodeDescriptor> getObjectVariableObjectVariableAttributeAssignmentsCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ObjectVariable modelElement = (ObjectVariable) containerView.getElement();
		LinkedList<StorydiagramsNodeDescriptor> result = new LinkedList<StorydiagramsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributeAssignments().iterator(); it.hasNext();) {
			AttributeAssignment childElement = (AttributeAssignment) it.next();
			int visualID = StorydiagramsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AttributeAssignmentEditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsNodeDescriptor> getMatchingStoryNodeMatchingStoryNodeContentCompartment_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MatchingStoryNode modelElement = (MatchingStoryNode) containerView.getElement();
		LinkedList<StorydiagramsNodeDescriptor> result = new LinkedList<StorydiagramsNodeDescriptor>();
		{
			MatchingPattern childElement = modelElement.getOwnedPattern();
			int visualID = StorydiagramsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MatchingPatternEditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsNodeDescriptor> getMatchingPatternStoryPatternCompartement_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MatchingPattern modelElement = (MatchingPattern) containerView.getElement();
		LinkedList<StorydiagramsNodeDescriptor> result = new LinkedList<StorydiagramsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getVariables().iterator(); it.hasNext();) {
			AbstractVariable childElement = (AbstractVariable) it.next();
			int visualID = StorydiagramsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ObjectVariableEditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PrimitiveVariableEditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsNodeDescriptor> getStructuredNodeStructuredNodeCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StructuredNode modelElement = (StructuredNode) containerView.getElement();
		LinkedList<StorydiagramsNodeDescriptor> result = new LinkedList<StorydiagramsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedActivityNodes().iterator(); it.hasNext();) {
			ActivityNode childElement = (ActivityNode) it.next();
			int visualID = StorydiagramsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == JunctionNode2EditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StartNode2EditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StopNode2EditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StatementNode2EditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StructuredNode2EditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ModifyingStoryNode2EditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsNodeDescriptor> getStructuredNodeStructuredNodeCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StructuredNode modelElement = (StructuredNode) containerView.getElement();
		LinkedList<StorydiagramsNodeDescriptor> result = new LinkedList<StorydiagramsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedActivityNodes().iterator(); it.hasNext();) {
			ActivityNode childElement = (ActivityNode) it.next();
			int visualID = StorydiagramsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == JunctionNode2EditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StartNode2EditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StopNode2EditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StatementNode2EditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StructuredNode2EditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ModifyingStoryNode2EditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsNodeDescriptor> getModifyingStoryNodeModifyingStoryNodeContentCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ModifyingStoryNode modelElement = (ModifyingStoryNode) containerView.getElement();
		LinkedList<StorydiagramsNodeDescriptor> result = new LinkedList<StorydiagramsNodeDescriptor>();
		{
			StoryPattern childElement = modelElement.getOwnedRule();
			int visualID = StorydiagramsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StoryPatternEditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getContainedLinks(View view) {
		switch (StorydiagramsVisualIDRegistry.getVisualID(view)) {
		case ActivityEditPart.VISUAL_ID:
			return getActivity_1000ContainedLinks(view);
		case ActivityCallNodeEditPart.VISUAL_ID:
			return getActivityCallNode_2006ContainedLinks(view);
		case StatementNodeEditPart.VISUAL_ID:
			return getStatementNode_2004ContainedLinks(view);
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return getModifyingStoryNode_2007ContainedLinks(view);
		case MatchingStoryNodeEditPart.VISUAL_ID:
			return getMatchingStoryNode_2008ContainedLinks(view);
		case StructuredNodeEditPart.VISUAL_ID:
			return getStructuredNode_2005ContainedLinks(view);
		case StartNodeEditPart.VISUAL_ID:
			return getStartNode_2001ContainedLinks(view);
		case JunctionNodeEditPart.VISUAL_ID:
			return getJunctionNode_2003ContainedLinks(view);
		case StopNodeEditPart.VISUAL_ID:
			return getStopNode_2002ContainedLinks(view);
		case StoryPatternEditPart.VISUAL_ID:
			return getStoryPattern_3008ContainedLinks(view);
		case ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3009ContainedLinks(view);
		case AttributeAssignmentEditPart.VISUAL_ID:
			return getAttributeAssignment_3010ContainedLinks(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_3013ContainedLinks(view);
		case PrimitiveVariableEditPart.VISUAL_ID:
			return getPrimitiveVariable_3011ContainedLinks(view);
		case MatchingPatternEditPart.VISUAL_ID:
			return getMatchingPattern_3012ContainedLinks(view);
		case JunctionNode2EditPart.VISUAL_ID:
			return getJunctionNode_3002ContainedLinks(view);
		case StartNode2EditPart.VISUAL_ID:
			return getStartNode_3003ContainedLinks(view);
		case StopNode2EditPart.VISUAL_ID:
			return getStopNode_3004ContainedLinks(view);
		case StatementNode2EditPart.VISUAL_ID:
			return getStatementNode_3005ContainedLinks(view);
		case StructuredNode2EditPart.VISUAL_ID:
			return getStructuredNode_3006ContainedLinks(view);
		case ModifyingStoryNode2EditPart.VISUAL_ID:
			return getModifyingStoryNode_3007ContainedLinks(view);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4001ContainedLinks(view);
		case LinkVariableEditPart.VISUAL_ID:
			return getLinkVariable_4002ContainedLinks(view);
		case PathEditPart.VISUAL_ID:
			return getPath_4003ContainedLinks(view);
		case ContainmentRelationEditPart.VISUAL_ID:
			return getContainmentRelation_4004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getIncomingLinks(View view) {
		switch (StorydiagramsVisualIDRegistry.getVisualID(view)) {
		case ActivityCallNodeEditPart.VISUAL_ID:
			return getActivityCallNode_2006IncomingLinks(view);
		case StatementNodeEditPart.VISUAL_ID:
			return getStatementNode_2004IncomingLinks(view);
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return getModifyingStoryNode_2007IncomingLinks(view);
		case MatchingStoryNodeEditPart.VISUAL_ID:
			return getMatchingStoryNode_2008IncomingLinks(view);
		case StructuredNodeEditPart.VISUAL_ID:
			return getStructuredNode_2005IncomingLinks(view);
		case StartNodeEditPart.VISUAL_ID:
			return getStartNode_2001IncomingLinks(view);
		case JunctionNodeEditPart.VISUAL_ID:
			return getJunctionNode_2003IncomingLinks(view);
		case StopNodeEditPart.VISUAL_ID:
			return getStopNode_2002IncomingLinks(view);
		case StoryPatternEditPart.VISUAL_ID:
			return getStoryPattern_3008IncomingLinks(view);
		case ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3009IncomingLinks(view);
		case AttributeAssignmentEditPart.VISUAL_ID:
			return getAttributeAssignment_3010IncomingLinks(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_3013IncomingLinks(view);
		case PrimitiveVariableEditPart.VISUAL_ID:
			return getPrimitiveVariable_3011IncomingLinks(view);
		case MatchingPatternEditPart.VISUAL_ID:
			return getMatchingPattern_3012IncomingLinks(view);
		case JunctionNode2EditPart.VISUAL_ID:
			return getJunctionNode_3002IncomingLinks(view);
		case StartNode2EditPart.VISUAL_ID:
			return getStartNode_3003IncomingLinks(view);
		case StopNode2EditPart.VISUAL_ID:
			return getStopNode_3004IncomingLinks(view);
		case StatementNode2EditPart.VISUAL_ID:
			return getStatementNode_3005IncomingLinks(view);
		case StructuredNode2EditPart.VISUAL_ID:
			return getStructuredNode_3006IncomingLinks(view);
		case ModifyingStoryNode2EditPart.VISUAL_ID:
			return getModifyingStoryNode_3007IncomingLinks(view);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4001IncomingLinks(view);
		case LinkVariableEditPart.VISUAL_ID:
			return getLinkVariable_4002IncomingLinks(view);
		case PathEditPart.VISUAL_ID:
			return getPath_4003IncomingLinks(view);
		case ContainmentRelationEditPart.VISUAL_ID:
			return getContainmentRelation_4004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getOutgoingLinks(View view) {
		switch (StorydiagramsVisualIDRegistry.getVisualID(view)) {
		case ActivityCallNodeEditPart.VISUAL_ID:
			return getActivityCallNode_2006OutgoingLinks(view);
		case StatementNodeEditPart.VISUAL_ID:
			return getStatementNode_2004OutgoingLinks(view);
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return getModifyingStoryNode_2007OutgoingLinks(view);
		case MatchingStoryNodeEditPart.VISUAL_ID:
			return getMatchingStoryNode_2008OutgoingLinks(view);
		case StructuredNodeEditPart.VISUAL_ID:
			return getStructuredNode_2005OutgoingLinks(view);
		case StartNodeEditPart.VISUAL_ID:
			return getStartNode_2001OutgoingLinks(view);
		case JunctionNodeEditPart.VISUAL_ID:
			return getJunctionNode_2003OutgoingLinks(view);
		case StopNodeEditPart.VISUAL_ID:
			return getStopNode_2002OutgoingLinks(view);
		case StoryPatternEditPart.VISUAL_ID:
			return getStoryPattern_3008OutgoingLinks(view);
		case ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3009OutgoingLinks(view);
		case AttributeAssignmentEditPart.VISUAL_ID:
			return getAttributeAssignment_3010OutgoingLinks(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_3013OutgoingLinks(view);
		case PrimitiveVariableEditPart.VISUAL_ID:
			return getPrimitiveVariable_3011OutgoingLinks(view);
		case MatchingPatternEditPart.VISUAL_ID:
			return getMatchingPattern_3012OutgoingLinks(view);
		case JunctionNode2EditPart.VISUAL_ID:
			return getJunctionNode_3002OutgoingLinks(view);
		case StartNode2EditPart.VISUAL_ID:
			return getStartNode_3003OutgoingLinks(view);
		case StopNode2EditPart.VISUAL_ID:
			return getStopNode_3004OutgoingLinks(view);
		case StatementNode2EditPart.VISUAL_ID:
			return getStatementNode_3005OutgoingLinks(view);
		case StructuredNode2EditPart.VISUAL_ID:
			return getStructuredNode_3006OutgoingLinks(view);
		case ModifyingStoryNode2EditPart.VISUAL_ID:
			return getModifyingStoryNode_3007OutgoingLinks(view);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4001OutgoingLinks(view);
		case LinkVariableEditPart.VISUAL_ID:
			return getLinkVariable_4002OutgoingLinks(view);
		case PathEditPart.VISUAL_ID:
			return getPath_4003OutgoingLinks(view);
		case ContainmentRelationEditPart.VISUAL_ID:
			return getContainmentRelation_4004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getActivity_1000ContainedLinks(View view) {
		Activity modelElement = (Activity) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getActivityCallNode_2006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStatementNode_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getModifyingStoryNode_2007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getMatchingStoryNode_2008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStructuredNode_2005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStartNode_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getJunctionNode_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStopNode_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStoryPattern_3008ContainedLinks(View view) {
		StoryPattern modelElement = (StoryPattern) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_LinkVariable_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Path_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ContainmentRelation_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getObjectVariable_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getAttributeAssignment_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getConstraint_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getPrimitiveVariable_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getMatchingPattern_3012ContainedLinks(View view) {
		MatchingPattern modelElement = (MatchingPattern) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_LinkVariable_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Path_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ContainmentRelation_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getJunctionNode_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStartNode_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStopNode_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStatementNode_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStructuredNode_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getModifyingStoryNode_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getActivityEdge_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getLinkVariable_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getPath_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getContainmentRelation_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getActivityCallNode_2006IncomingLinks(View view) {
		ActivityCallNode modelElement = (ActivityCallNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStatementNode_2004IncomingLinks(View view) {
		StatementNode modelElement = (StatementNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getModifyingStoryNode_2007IncomingLinks(View view) {
		ModifyingStoryNode modelElement = (ModifyingStoryNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getMatchingStoryNode_2008IncomingLinks(View view) {
		MatchingStoryNode modelElement = (MatchingStoryNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStructuredNode_2005IncomingLinks(View view) {
		StructuredNode modelElement = (StructuredNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStartNode_2001IncomingLinks(View view) {
		StartNode modelElement = (StartNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getJunctionNode_2003IncomingLinks(View view) {
		JunctionNode modelElement = (JunctionNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStopNode_2002IncomingLinks(View view) {
		StopNode modelElement = (StopNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStoryPattern_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getObjectVariable_3009IncomingLinks(View view) {
		ObjectVariable modelElement = (ObjectVariable) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_LinkVariable_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Path_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ContainmentRelation_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getAttributeAssignment_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getConstraint_3013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getPrimitiveVariable_3011IncomingLinks(View view) {
		PrimitiveVariable modelElement = (PrimitiveVariable) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_LinkVariable_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Path_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ContainmentRelation_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getMatchingPattern_3012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getJunctionNode_3002IncomingLinks(View view) {
		JunctionNode modelElement = (JunctionNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStartNode_3003IncomingLinks(View view) {
		StartNode modelElement = (StartNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStopNode_3004IncomingLinks(View view) {
		StopNode modelElement = (StopNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStatementNode_3005IncomingLinks(View view) {
		StatementNode modelElement = (StatementNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStructuredNode_3006IncomingLinks(View view) {
		StructuredNode modelElement = (StructuredNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getModifyingStoryNode_3007IncomingLinks(View view) {
		ModifyingStoryNode modelElement = (ModifyingStoryNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getActivityEdge_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getLinkVariable_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getPath_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getContainmentRelation_4004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getActivityCallNode_2006OutgoingLinks(View view) {
		ActivityCallNode modelElement = (ActivityCallNode) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStatementNode_2004OutgoingLinks(View view) {
		StatementNode modelElement = (StatementNode) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getModifyingStoryNode_2007OutgoingLinks(View view) {
		ModifyingStoryNode modelElement = (ModifyingStoryNode) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getMatchingStoryNode_2008OutgoingLinks(View view) {
		MatchingStoryNode modelElement = (MatchingStoryNode) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStructuredNode_2005OutgoingLinks(View view) {
		StructuredNode modelElement = (StructuredNode) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStartNode_2001OutgoingLinks(View view) {
		StartNode modelElement = (StartNode) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getJunctionNode_2003OutgoingLinks(View view) {
		JunctionNode modelElement = (JunctionNode) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStopNode_2002OutgoingLinks(View view) {
		StopNode modelElement = (StopNode) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStoryPattern_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getObjectVariable_3009OutgoingLinks(View view) {
		ObjectVariable modelElement = (ObjectVariable) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkVariable_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Path_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ContainmentRelation_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getAttributeAssignment_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getConstraint_3013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getPrimitiveVariable_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getMatchingPattern_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getJunctionNode_3002OutgoingLinks(View view) {
		JunctionNode modelElement = (JunctionNode) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStartNode_3003OutgoingLinks(View view) {
		StartNode modelElement = (StartNode) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStopNode_3004OutgoingLinks(View view) {
		StopNode modelElement = (StopNode) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStatementNode_3005OutgoingLinks(View view) {
		StatementNode modelElement = (StatementNode) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStructuredNode_3006OutgoingLinks(View view) {
		StructuredNode modelElement = (StructuredNode) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getModifyingStoryNode_3007OutgoingLinks(View view) {
		ModifyingStoryNode modelElement = (ModifyingStoryNode) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getActivityEdge_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getLinkVariable_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getPath_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getContainmentRelation_4004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<StorydiagramsLinkDescriptor> getContainedTypeModelFacetLinks_ActivityEdge_4001(
			Activity container) {
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		for (Iterator<?> links = container.getOwnedActivityEdges().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityEdge) {
				continue;
			}
			ActivityEdge link = (ActivityEdge) linkObject;
			if (ActivityEdgeEditPart.VISUAL_ID != StorydiagramsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			result.add(new StorydiagramsLinkDescriptor(src, dst, link, StorydiagramsElementTypes.ActivityEdge_4001,
					ActivityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<StorydiagramsLinkDescriptor> getContainedTypeModelFacetLinks_LinkVariable_4002(
			StoryPattern container) {
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		for (Iterator<?> links = container.getLinkVariables().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LinkVariable) {
				continue;
			}
			LinkVariable link = (LinkVariable) linkObject;
			if (LinkVariableEditPart.VISUAL_ID != StorydiagramsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractVariable dst = link.getTarget();
			ObjectVariable src = link.getSource();
			result.add(new StorydiagramsLinkDescriptor(src, dst, link, StorydiagramsElementTypes.LinkVariable_4002,
					LinkVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<StorydiagramsLinkDescriptor> getContainedTypeModelFacetLinks_Path_4003(
			StoryPattern container) {
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		for (Iterator<?> links = container.getLinkVariables().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Path) {
				continue;
			}
			Path link = (Path) linkObject;
			if (PathEditPart.VISUAL_ID != StorydiagramsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractVariable dst = link.getTarget();
			ObjectVariable src = link.getSource();
			result.add(new StorydiagramsLinkDescriptor(src, dst, link, StorydiagramsElementTypes.Path_4003,
					PathEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<StorydiagramsLinkDescriptor> getContainedTypeModelFacetLinks_ContainmentRelation_4004(
			StoryPattern container) {
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		for (Iterator<?> links = container.getLinkVariables().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ContainmentRelation) {
				continue;
			}
			ContainmentRelation link = (ContainmentRelation) linkObject;
			if (ContainmentRelationEditPart.VISUAL_ID != StorydiagramsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractVariable dst = link.getTarget();
			ObjectVariable src = link.getSource();
			result.add(new StorydiagramsLinkDescriptor(src, dst, link,
					StorydiagramsElementTypes.ContainmentRelation_4004, ContainmentRelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<StorydiagramsLinkDescriptor> getIncomingTypeModelFacetLinks_ActivityEdge_4001(
			ActivityNode target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ActivitiesPackage.eINSTANCE.getActivityEdge_Target()
					|| false == setting.getEObject() instanceof ActivityEdge) {
				continue;
			}
			ActivityEdge link = (ActivityEdge) setting.getEObject();
			if (ActivityEdgeEditPart.VISUAL_ID != StorydiagramsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode src = link.getSource();
			result.add(new StorydiagramsLinkDescriptor(src, target, link, StorydiagramsElementTypes.ActivityEdge_4001,
					ActivityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<StorydiagramsLinkDescriptor> getIncomingTypeModelFacetLinks_LinkVariable_4002(
			AbstractVariable target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PatternsPackage.eINSTANCE.getAbstractLinkVariable_Target()
					|| false == setting.getEObject() instanceof LinkVariable) {
				continue;
			}
			LinkVariable link = (LinkVariable) setting.getEObject();
			if (LinkVariableEditPart.VISUAL_ID != StorydiagramsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ObjectVariable src = link.getSource();
			result.add(new StorydiagramsLinkDescriptor(src, target, link, StorydiagramsElementTypes.LinkVariable_4002,
					LinkVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<StorydiagramsLinkDescriptor> getIncomingTypeModelFacetLinks_Path_4003(
			AbstractVariable target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PatternsPackage.eINSTANCE.getAbstractLinkVariable_Target()
					|| false == setting.getEObject() instanceof Path) {
				continue;
			}
			Path link = (Path) setting.getEObject();
			if (PathEditPart.VISUAL_ID != StorydiagramsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ObjectVariable src = link.getSource();
			result.add(new StorydiagramsLinkDescriptor(src, target, link, StorydiagramsElementTypes.Path_4003,
					PathEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<StorydiagramsLinkDescriptor> getIncomingTypeModelFacetLinks_ContainmentRelation_4004(
			AbstractVariable target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PatternsPackage.eINSTANCE.getAbstractLinkVariable_Target()
					|| false == setting.getEObject() instanceof ContainmentRelation) {
				continue;
			}
			ContainmentRelation link = (ContainmentRelation) setting.getEObject();
			if (ContainmentRelationEditPart.VISUAL_ID != StorydiagramsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ObjectVariable src = link.getSource();
			result.add(new StorydiagramsLinkDescriptor(src, target, link,
					StorydiagramsElementTypes.ContainmentRelation_4004, ContainmentRelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<StorydiagramsLinkDescriptor> getOutgoingTypeModelFacetLinks_ActivityEdge_4001(
			ActivityNode source) {
		Activity container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Activity) {
				container = (Activity) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		for (Iterator<?> links = container.getOwnedActivityEdges().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityEdge) {
				continue;
			}
			ActivityEdge link = (ActivityEdge) linkObject;
			if (ActivityEdgeEditPart.VISUAL_ID != StorydiagramsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new StorydiagramsLinkDescriptor(src, dst, link, StorydiagramsElementTypes.ActivityEdge_4001,
					ActivityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<StorydiagramsLinkDescriptor> getOutgoingTypeModelFacetLinks_LinkVariable_4002(
			ObjectVariable source) {
		StoryPattern container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof StoryPattern) {
				container = (StoryPattern) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		for (Iterator<?> links = container.getLinkVariables().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LinkVariable) {
				continue;
			}
			LinkVariable link = (LinkVariable) linkObject;
			if (LinkVariableEditPart.VISUAL_ID != StorydiagramsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractVariable dst = link.getTarget();
			ObjectVariable src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new StorydiagramsLinkDescriptor(src, dst, link, StorydiagramsElementTypes.LinkVariable_4002,
					LinkVariableEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<StorydiagramsLinkDescriptor> getOutgoingTypeModelFacetLinks_Path_4003(
			ObjectVariable source) {
		StoryPattern container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof StoryPattern) {
				container = (StoryPattern) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		for (Iterator<?> links = container.getLinkVariables().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Path) {
				continue;
			}
			Path link = (Path) linkObject;
			if (PathEditPart.VISUAL_ID != StorydiagramsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractVariable dst = link.getTarget();
			ObjectVariable src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new StorydiagramsLinkDescriptor(src, dst, link, StorydiagramsElementTypes.Path_4003,
					PathEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<StorydiagramsLinkDescriptor> getOutgoingTypeModelFacetLinks_ContainmentRelation_4004(
			ObjectVariable source) {
		StoryPattern container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof StoryPattern) {
				container = (StoryPattern) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		for (Iterator<?> links = container.getLinkVariables().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ContainmentRelation) {
				continue;
			}
			ContainmentRelation link = (ContainmentRelation) linkObject;
			if (ContainmentRelationEditPart.VISUAL_ID != StorydiagramsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractVariable dst = link.getTarget();
			ObjectVariable src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new StorydiagramsLinkDescriptor(src, dst, link,
					StorydiagramsElementTypes.ContainmentRelation_4004, ContainmentRelationEditPart.VISUAL_ID));
		}
		return result;
	}

}
