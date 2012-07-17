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
import org.storydriven.storydiagrams.activities.ActivityFinalNode;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.FlowFinalNode;
import org.storydriven.storydiagrams.activities.InitialNode;
import org.storydriven.storydiagrams.activities.JunctionNode;
import org.storydriven.storydiagrams.activities.MatchingStoryNode;
import org.storydriven.storydiagrams.activities.ModifyingStoryNode;
import org.storydriven.storydiagrams.activities.StatementNode;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityCallNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEdgeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityFinalNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.AttributeAssignmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.CollectionVariableCollectionVariableConstraintsCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.CollectionVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.Constraint2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ConstraintEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.FlowFinalNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.InclusionLinkEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.InitialNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.JunctionNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingPatternEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingPatternStoryPatternConstraintsCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingPatternStoryPatternContentCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingStoryNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingStoryNodeStoryNodePatternCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MaybeLinkEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeStoryNodePatternCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableObjectVariableConstraintsCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StoryPatternEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StoryPatternStoryPatternConstraintsCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StoryPatternStoryPatternContentCompartmentEditPart;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.AttributeAssignment;
import org.storydriven.storydiagrams.patterns.CollectionVariable;
import org.storydriven.storydiagrams.patterns.Constraint;
import org.storydriven.storydiagrams.patterns.InclusionLink;
import org.storydriven.storydiagrams.patterns.LinkVariable;
import org.storydriven.storydiagrams.patterns.MatchingPattern;
import org.storydriven.storydiagrams.patterns.MaybeLink;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.PatternsPackage;
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
		case ModifyingStoryNodeStoryNodePatternCompartmentEditPart.VISUAL_ID:
			return getModifyingStoryNodeStoryNodePatternCompartment_7001SemanticChildren(view);
		case StoryPatternStoryPatternContentCompartmentEditPart.VISUAL_ID:
			return getStoryPatternStoryPatternContentCompartment_7002SemanticChildren(view);
		case StoryPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID:
			return getStoryPatternStoryPatternConstraintsCompartment_7003SemanticChildren(view);
		case ObjectVariableObjectVariableConstraintsCompartmentEditPart.VISUAL_ID:
			return getObjectVariableObjectVariableConstraintsCompartment_7004SemanticChildren(view);
		case ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
			return getObjectVariableObjectVariableAttributeAssignmentsCompartment_7005SemanticChildren(view);
		case CollectionVariableCollectionVariableConstraintsCompartmentEditPart.VISUAL_ID:
			return getCollectionVariableCollectionVariableConstraintsCompartment_7006SemanticChildren(view);
		case CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
			return getCollectionVariableCollectionVariableAttributeAssignmentsCompartment_7007SemanticChildren(view);
		case MatchingStoryNodeStoryNodePatternCompartmentEditPart.VISUAL_ID:
			return getMatchingStoryNodeStoryNodePatternCompartment_7008SemanticChildren(view);
		case MatchingPatternStoryPatternContentCompartmentEditPart.VISUAL_ID:
			return getMatchingPatternStoryPatternContentCompartment_7009SemanticChildren(view);
		case MatchingPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID:
			return getMatchingPatternStoryPatternConstraintsCompartment_7010SemanticChildren(view);
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
			if (visualID == InitialNodeEditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JunctionNodeEditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityFinalNodeEditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FlowFinalNodeEditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsNodeDescriptor> getModifyingStoryNodeStoryNodePatternCompartment_7001SemanticChildren(
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
	public static List<StorydiagramsNodeDescriptor> getStoryPatternStoryPatternContentCompartment_7002SemanticChildren(
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
			if (visualID == CollectionVariableEditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsNodeDescriptor> getStoryPatternStoryPatternConstraintsCompartment_7003SemanticChildren(
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
		for (Iterator<?> it = modelElement.getConstraints().iterator(); it.hasNext();) {
			Constraint childElement = (Constraint) it.next();
			int visualID = StorydiagramsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Constraint2EditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsNodeDescriptor> getObjectVariableObjectVariableConstraintsCompartment_7004SemanticChildren(
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
	public static List<StorydiagramsNodeDescriptor> getObjectVariableObjectVariableAttributeAssignmentsCompartment_7005SemanticChildren(
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
	public static List<StorydiagramsNodeDescriptor> getCollectionVariableCollectionVariableConstraintsCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CollectionVariable modelElement = (CollectionVariable) containerView.getElement();
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
	public static List<StorydiagramsNodeDescriptor> getCollectionVariableCollectionVariableAttributeAssignmentsCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CollectionVariable modelElement = (CollectionVariable) containerView.getElement();
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
	public static List<StorydiagramsNodeDescriptor> getMatchingStoryNodeStoryNodePatternCompartment_7008SemanticChildren(
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
	public static List<StorydiagramsNodeDescriptor> getMatchingPatternStoryPatternContentCompartment_7009SemanticChildren(
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
			if (visualID == CollectionVariableEditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsNodeDescriptor> getMatchingPatternStoryPatternConstraintsCompartment_7010SemanticChildren(
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
		for (Iterator<?> it = modelElement.getConstraints().iterator(); it.hasNext();) {
			Constraint childElement = (Constraint) it.next();
			int visualID = StorydiagramsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Constraint2EditPart.VISUAL_ID) {
				result.add(new StorydiagramsNodeDescriptor(childElement, visualID));
				continue;
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
			return getActivityCallNode_2001ContainedLinks(view);
		case StatementNodeEditPart.VISUAL_ID:
			return getStatementNode_2002ContainedLinks(view);
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return getModifyingStoryNode_2003ContainedLinks(view);
		case MatchingStoryNodeEditPart.VISUAL_ID:
			return getMatchingStoryNode_2004ContainedLinks(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2005ContainedLinks(view);
		case JunctionNodeEditPart.VISUAL_ID:
			return getJunctionNode_2006ContainedLinks(view);
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return getActivityFinalNode_2007ContainedLinks(view);
		case FlowFinalNodeEditPart.VISUAL_ID:
			return getFlowFinalNode_2008ContainedLinks(view);
		case StoryPatternEditPart.VISUAL_ID:
			return getStoryPattern_3001ContainedLinks(view);
		case ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3002ContainedLinks(view);
		case AttributeAssignmentEditPart.VISUAL_ID:
			return getAttributeAssignment_3003ContainedLinks(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_3004ContainedLinks(view);
		case CollectionVariableEditPart.VISUAL_ID:
			return getCollectionVariable_3005ContainedLinks(view);
		case Constraint2EditPart.VISUAL_ID:
			return getConstraint_3006ContainedLinks(view);
		case MatchingPatternEditPart.VISUAL_ID:
			return getMatchingPattern_3007ContainedLinks(view);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4001ContainedLinks(view);
		case LinkVariableEditPart.VISUAL_ID:
			return getLinkVariable_4002ContainedLinks(view);
		case InclusionLinkEditPart.VISUAL_ID:
			return getInclusionLink_4003ContainedLinks(view);
		case MaybeLinkEditPart.VISUAL_ID:
			return getMaybeLink_4004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getIncomingLinks(View view) {
		switch (StorydiagramsVisualIDRegistry.getVisualID(view)) {
		case ActivityCallNodeEditPart.VISUAL_ID:
			return getActivityCallNode_2001IncomingLinks(view);
		case StatementNodeEditPart.VISUAL_ID:
			return getStatementNode_2002IncomingLinks(view);
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return getModifyingStoryNode_2003IncomingLinks(view);
		case MatchingStoryNodeEditPart.VISUAL_ID:
			return getMatchingStoryNode_2004IncomingLinks(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2005IncomingLinks(view);
		case JunctionNodeEditPart.VISUAL_ID:
			return getJunctionNode_2006IncomingLinks(view);
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return getActivityFinalNode_2007IncomingLinks(view);
		case FlowFinalNodeEditPart.VISUAL_ID:
			return getFlowFinalNode_2008IncomingLinks(view);
		case StoryPatternEditPart.VISUAL_ID:
			return getStoryPattern_3001IncomingLinks(view);
		case ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3002IncomingLinks(view);
		case AttributeAssignmentEditPart.VISUAL_ID:
			return getAttributeAssignment_3003IncomingLinks(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_3004IncomingLinks(view);
		case CollectionVariableEditPart.VISUAL_ID:
			return getCollectionVariable_3005IncomingLinks(view);
		case Constraint2EditPart.VISUAL_ID:
			return getConstraint_3006IncomingLinks(view);
		case MatchingPatternEditPart.VISUAL_ID:
			return getMatchingPattern_3007IncomingLinks(view);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4001IncomingLinks(view);
		case LinkVariableEditPart.VISUAL_ID:
			return getLinkVariable_4002IncomingLinks(view);
		case InclusionLinkEditPart.VISUAL_ID:
			return getInclusionLink_4003IncomingLinks(view);
		case MaybeLinkEditPart.VISUAL_ID:
			return getMaybeLink_4004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getOutgoingLinks(View view) {
		switch (StorydiagramsVisualIDRegistry.getVisualID(view)) {
		case ActivityCallNodeEditPart.VISUAL_ID:
			return getActivityCallNode_2001OutgoingLinks(view);
		case StatementNodeEditPart.VISUAL_ID:
			return getStatementNode_2002OutgoingLinks(view);
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return getModifyingStoryNode_2003OutgoingLinks(view);
		case MatchingStoryNodeEditPart.VISUAL_ID:
			return getMatchingStoryNode_2004OutgoingLinks(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2005OutgoingLinks(view);
		case JunctionNodeEditPart.VISUAL_ID:
			return getJunctionNode_2006OutgoingLinks(view);
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return getActivityFinalNode_2007OutgoingLinks(view);
		case FlowFinalNodeEditPart.VISUAL_ID:
			return getFlowFinalNode_2008OutgoingLinks(view);
		case StoryPatternEditPart.VISUAL_ID:
			return getStoryPattern_3001OutgoingLinks(view);
		case ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3002OutgoingLinks(view);
		case AttributeAssignmentEditPart.VISUAL_ID:
			return getAttributeAssignment_3003OutgoingLinks(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_3004OutgoingLinks(view);
		case CollectionVariableEditPart.VISUAL_ID:
			return getCollectionVariable_3005OutgoingLinks(view);
		case Constraint2EditPart.VISUAL_ID:
			return getConstraint_3006OutgoingLinks(view);
		case MatchingPatternEditPart.VISUAL_ID:
			return getMatchingPattern_3007OutgoingLinks(view);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4001OutgoingLinks(view);
		case LinkVariableEditPart.VISUAL_ID:
			return getLinkVariable_4002OutgoingLinks(view);
		case InclusionLinkEditPart.VISUAL_ID:
			return getInclusionLink_4003OutgoingLinks(view);
		case MaybeLinkEditPart.VISUAL_ID:
			return getMaybeLink_4004OutgoingLinks(view);
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
	public static List<StorydiagramsLinkDescriptor> getActivityCallNode_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStatementNode_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getModifyingStoryNode_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getMatchingStoryNode_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getInitialNode_2005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getJunctionNode_2006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getActivityFinalNode_2007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getFlowFinalNode_2008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStoryPattern_3001ContainedLinks(View view) {
		StoryPattern modelElement = (StoryPattern) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_LinkVariable_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InclusionLink_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_MaybeLink_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getObjectVariable_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getAttributeAssignment_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getConstraint_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getCollectionVariable_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getConstraint_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getMatchingPattern_3007ContainedLinks(View view) {
		MatchingPattern modelElement = (MatchingPattern) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_LinkVariable_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InclusionLink_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_MaybeLink_4004(modelElement));
		return result;
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
	public static List<StorydiagramsLinkDescriptor> getInclusionLink_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getMaybeLink_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getActivityCallNode_2001IncomingLinks(View view) {
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
	public static List<StorydiagramsLinkDescriptor> getStatementNode_2002IncomingLinks(View view) {
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
	public static List<StorydiagramsLinkDescriptor> getModifyingStoryNode_2003IncomingLinks(View view) {
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
	public static List<StorydiagramsLinkDescriptor> getMatchingStoryNode_2004IncomingLinks(View view) {
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
	public static List<StorydiagramsLinkDescriptor> getInitialNode_2005IncomingLinks(View view) {
		InitialNode modelElement = (InitialNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getJunctionNode_2006IncomingLinks(View view) {
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
	public static List<StorydiagramsLinkDescriptor> getActivityFinalNode_2007IncomingLinks(View view) {
		ActivityFinalNode modelElement = (ActivityFinalNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getFlowFinalNode_2008IncomingLinks(View view) {
		FlowFinalNode modelElement = (FlowFinalNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStoryPattern_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getObjectVariable_3002IncomingLinks(View view) {
		ObjectVariable modelElement = (ObjectVariable) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_LinkVariable_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InclusionLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaybeLink_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getAttributeAssignment_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getConstraint_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getCollectionVariable_3005IncomingLinks(View view) {
		CollectionVariable modelElement = (CollectionVariable) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_LinkVariable_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InclusionLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MaybeLink_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getConstraint_3006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getMatchingPattern_3007IncomingLinks(View view) {
		return Collections.emptyList();
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
	public static List<StorydiagramsLinkDescriptor> getInclusionLink_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getMaybeLink_4004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getActivityCallNode_2001OutgoingLinks(View view) {
		ActivityCallNode modelElement = (ActivityCallNode) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStatementNode_2002OutgoingLinks(View view) {
		StatementNode modelElement = (StatementNode) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getModifyingStoryNode_2003OutgoingLinks(View view) {
		ModifyingStoryNode modelElement = (ModifyingStoryNode) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getMatchingStoryNode_2004OutgoingLinks(View view) {
		MatchingStoryNode modelElement = (MatchingStoryNode) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getInitialNode_2005OutgoingLinks(View view) {
		InitialNode modelElement = (InitialNode) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getJunctionNode_2006OutgoingLinks(View view) {
		JunctionNode modelElement = (JunctionNode) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getActivityFinalNode_2007OutgoingLinks(View view) {
		ActivityFinalNode modelElement = (ActivityFinalNode) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getFlowFinalNode_2008OutgoingLinks(View view) {
		FlowFinalNode modelElement = (FlowFinalNode) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getStoryPattern_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getObjectVariable_3002OutgoingLinks(View view) {
		ObjectVariable modelElement = (ObjectVariable) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkVariable_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InclusionLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MaybeLink_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getAttributeAssignment_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getConstraint_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getCollectionVariable_3005OutgoingLinks(View view) {
		CollectionVariable modelElement = (CollectionVariable) view.getElement();
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkVariable_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InclusionLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MaybeLink_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getConstraint_3006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getMatchingPattern_3007OutgoingLinks(View view) {
		return Collections.emptyList();
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
	public static List<StorydiagramsLinkDescriptor> getInclusionLink_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StorydiagramsLinkDescriptor> getMaybeLink_4004OutgoingLinks(View view) {
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
	private static Collection<StorydiagramsLinkDescriptor> getContainedTypeModelFacetLinks_InclusionLink_4003(
			StoryPattern container) {
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		for (Iterator<?> links = container.getLinkVariables().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InclusionLink) {
				continue;
			}
			InclusionLink link = (InclusionLink) linkObject;
			if (InclusionLinkEditPart.VISUAL_ID != StorydiagramsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractVariable dst = link.getTarget();
			ObjectVariable src = link.getSource();
			result.add(new StorydiagramsLinkDescriptor(src, dst, link, StorydiagramsElementTypes.InclusionLink_4003,
					InclusionLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<StorydiagramsLinkDescriptor> getContainedTypeModelFacetLinks_MaybeLink_4004(
			StoryPattern container) {
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		for (Iterator<?> links = container.getLinkVariables().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MaybeLink) {
				continue;
			}
			MaybeLink link = (MaybeLink) linkObject;
			if (MaybeLinkEditPart.VISUAL_ID != StorydiagramsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractVariable dst = link.getTarget();
			ObjectVariable src = link.getSource();
			result.add(new StorydiagramsLinkDescriptor(src, dst, link, StorydiagramsElementTypes.MaybeLink_4004,
					MaybeLinkEditPart.VISUAL_ID));
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
	private static Collection<StorydiagramsLinkDescriptor> getIncomingTypeModelFacetLinks_InclusionLink_4003(
			AbstractVariable target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PatternsPackage.eINSTANCE.getAbstractLinkVariable_Target()
					|| false == setting.getEObject() instanceof InclusionLink) {
				continue;
			}
			InclusionLink link = (InclusionLink) setting.getEObject();
			if (InclusionLinkEditPart.VISUAL_ID != StorydiagramsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ObjectVariable src = link.getSource();
			result.add(new StorydiagramsLinkDescriptor(src, target, link, StorydiagramsElementTypes.InclusionLink_4003,
					InclusionLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<StorydiagramsLinkDescriptor> getIncomingTypeModelFacetLinks_MaybeLink_4004(
			AbstractVariable target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<StorydiagramsLinkDescriptor> result = new LinkedList<StorydiagramsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PatternsPackage.eINSTANCE.getAbstractLinkVariable_Target()
					|| false == setting.getEObject() instanceof MaybeLink) {
				continue;
			}
			MaybeLink link = (MaybeLink) setting.getEObject();
			if (MaybeLinkEditPart.VISUAL_ID != StorydiagramsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ObjectVariable src = link.getSource();
			result.add(new StorydiagramsLinkDescriptor(src, target, link, StorydiagramsElementTypes.MaybeLink_4004,
					MaybeLinkEditPart.VISUAL_ID));
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
	private static Collection<StorydiagramsLinkDescriptor> getOutgoingTypeModelFacetLinks_InclusionLink_4003(
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
			if (false == linkObject instanceof InclusionLink) {
				continue;
			}
			InclusionLink link = (InclusionLink) linkObject;
			if (InclusionLinkEditPart.VISUAL_ID != StorydiagramsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractVariable dst = link.getTarget();
			ObjectVariable src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new StorydiagramsLinkDescriptor(src, dst, link, StorydiagramsElementTypes.InclusionLink_4003,
					InclusionLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<StorydiagramsLinkDescriptor> getOutgoingTypeModelFacetLinks_MaybeLink_4004(
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
			if (false == linkObject instanceof MaybeLink) {
				continue;
			}
			MaybeLink link = (MaybeLink) linkObject;
			if (MaybeLinkEditPart.VISUAL_ID != StorydiagramsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractVariable dst = link.getTarget();
			ObjectVariable src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new StorydiagramsLinkDescriptor(src, dst, link, StorydiagramsElementTypes.MaybeLink_4004,
					MaybeLinkEditPart.VISUAL_ID));
		}
		return result;
	}

}
