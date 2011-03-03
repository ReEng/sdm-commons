package org.storydriven.modeling.diagram.part;

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
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.activities.JunctionNode;
import org.storydriven.modeling.activities.MatchingStoryNode;
import org.storydriven.modeling.activities.ModifyingStoryNode;
import org.storydriven.modeling.activities.StartNode;
import org.storydriven.modeling.activities.StatementNode;
import org.storydriven.modeling.activities.StopNode;
import org.storydriven.modeling.activities.StructuredNode;
import org.storydriven.modeling.diagram.edit.parts.ActivityEdgeEditPart;
import org.storydriven.modeling.diagram.edit.parts.ActivityEditPart;
import org.storydriven.modeling.diagram.edit.parts.JunctionNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.JunctionNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.MatchingPatternEditPart;
import org.storydriven.modeling.diagram.edit.parts.MatchingPatternStoryPatternCompartementEditPart;
import org.storydriven.modeling.diagram.edit.parts.MatchingStoryNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.MatchingStoryNodeMatchingStoryNodeContentCompartmentEditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.ObjectVariableEditPart;
import org.storydriven.modeling.diagram.edit.parts.StartNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StartNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StatementNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StatementNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StopNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StopNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNodeStructuredNodeCompartment2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNodeStructuredNodeCompartmentEditPart;
import org.storydriven.modeling.diagram.providers.SDMElementTypes;
import org.storydriven.modeling.patterns.MatchingPattern;
import org.storydriven.modeling.patterns.ObjectVariable;

/**
 * @generated
 */
public class SDMDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<SDMNodeDescriptor> getSemanticChildren(View view) {
		switch (SDMVisualIDRegistry.getVisualID(view)) {
		case ActivityEditPart.VISUAL_ID:
			return getActivity_1000SemanticChildren(view);
		case StructuredNodeStructuredNodeCompartmentEditPart.VISUAL_ID:
			return getStructuredNodeStructuredNodeCompartment_7001SemanticChildren(view);
		case StructuredNodeStructuredNodeCompartment2EditPart.VISUAL_ID:
			return getStructuredNodeStructuredNodeCompartment_7002SemanticChildren(view);
		case MatchingStoryNodeMatchingStoryNodeContentCompartmentEditPart.VISUAL_ID:
			return getMatchingStoryNodeMatchingStoryNodeContentCompartment_7003SemanticChildren(view);
		case MatchingPatternStoryPatternCompartementEditPart.VISUAL_ID:
			return getMatchingPatternStoryPatternCompartement_7005SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMNodeDescriptor> getActivity_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Activity modelElement = (Activity) view.getElement();
		LinkedList<SDMNodeDescriptor> result = new LinkedList<SDMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedActivityNodes().iterator(); it
				.hasNext();) {
			ActivityNode childElement = (ActivityNode) it.next();
			int visualID = SDMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == StartNodeEditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StopNodeEditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JunctionNodeEditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StatementNodeEditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StructuredNodeEditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MatchingStoryNodeEditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ModifyingStoryNodeEditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMNodeDescriptor> getStructuredNodeStructuredNodeCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StructuredNode modelElement = (StructuredNode) containerView
				.getElement();
		LinkedList<SDMNodeDescriptor> result = new LinkedList<SDMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedActivityNodes().iterator(); it
				.hasNext();) {
			ActivityNode childElement = (ActivityNode) it.next();
			int visualID = SDMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == JunctionNode2EditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StartNode2EditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StatementNode2EditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StopNode2EditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StructuredNode2EditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMNodeDescriptor> getStructuredNodeStructuredNodeCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StructuredNode modelElement = (StructuredNode) containerView
				.getElement();
		LinkedList<SDMNodeDescriptor> result = new LinkedList<SDMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedActivityNodes().iterator(); it
				.hasNext();) {
			ActivityNode childElement = (ActivityNode) it.next();
			int visualID = SDMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == JunctionNode2EditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StartNode2EditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StatementNode2EditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StopNode2EditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StructuredNode2EditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMNodeDescriptor> getMatchingStoryNodeMatchingStoryNodeContentCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MatchingStoryNode modelElement = (MatchingStoryNode) containerView
				.getElement();
		LinkedList<SDMNodeDescriptor> result = new LinkedList<SDMNodeDescriptor>();
		{
			MatchingPattern childElement = modelElement.getOwnedPattern();
			int visualID = SDMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MatchingPatternEditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMNodeDescriptor> getMatchingPatternStoryPatternCompartement_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MatchingPattern modelElement = (MatchingPattern) containerView
				.getElement();
		LinkedList<SDMNodeDescriptor> result = new LinkedList<SDMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getObjectVariables().iterator(); it
				.hasNext();) {
			ObjectVariable childElement = (ObjectVariable) it.next();
			int visualID = SDMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ObjectVariableEditPart.VISUAL_ID) {
				result.add(new SDMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getContainedLinks(View view) {
		switch (SDMVisualIDRegistry.getVisualID(view)) {
		case ActivityEditPart.VISUAL_ID:
			return getActivity_1000ContainedLinks(view);
		case StartNodeEditPart.VISUAL_ID:
			return getStartNode_2001ContainedLinks(view);
		case StopNodeEditPart.VISUAL_ID:
			return getStopNode_2002ContainedLinks(view);
		case JunctionNodeEditPart.VISUAL_ID:
			return getJunctionNode_2003ContainedLinks(view);
		case StatementNodeEditPart.VISUAL_ID:
			return getStatementNode_2004ContainedLinks(view);
		case StructuredNodeEditPart.VISUAL_ID:
			return getStructuredNode_2005ContainedLinks(view);
		case MatchingStoryNodeEditPart.VISUAL_ID:
			return getMatchingStoryNode_2006ContainedLinks(view);
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return getModifyingStoryNode_2007ContainedLinks(view);
		case JunctionNode2EditPart.VISUAL_ID:
			return getJunctionNode_3001ContainedLinks(view);
		case StartNode2EditPart.VISUAL_ID:
			return getStartNode_3002ContainedLinks(view);
		case StatementNode2EditPart.VISUAL_ID:
			return getStatementNode_3003ContainedLinks(view);
		case StopNode2EditPart.VISUAL_ID:
			return getStopNode_3004ContainedLinks(view);
		case StructuredNode2EditPart.VISUAL_ID:
			return getStructuredNode_3005ContainedLinks(view);
		case MatchingPatternEditPart.VISUAL_ID:
			return getMatchingPattern_3006ContainedLinks(view);
		case ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3007ContainedLinks(view);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getIncomingLinks(View view) {
		switch (SDMVisualIDRegistry.getVisualID(view)) {
		case StartNodeEditPart.VISUAL_ID:
			return getStartNode_2001IncomingLinks(view);
		case StopNodeEditPart.VISUAL_ID:
			return getStopNode_2002IncomingLinks(view);
		case JunctionNodeEditPart.VISUAL_ID:
			return getJunctionNode_2003IncomingLinks(view);
		case StatementNodeEditPart.VISUAL_ID:
			return getStatementNode_2004IncomingLinks(view);
		case StructuredNodeEditPart.VISUAL_ID:
			return getStructuredNode_2005IncomingLinks(view);
		case MatchingStoryNodeEditPart.VISUAL_ID:
			return getMatchingStoryNode_2006IncomingLinks(view);
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return getModifyingStoryNode_2007IncomingLinks(view);
		case JunctionNode2EditPart.VISUAL_ID:
			return getJunctionNode_3001IncomingLinks(view);
		case StartNode2EditPart.VISUAL_ID:
			return getStartNode_3002IncomingLinks(view);
		case StatementNode2EditPart.VISUAL_ID:
			return getStatementNode_3003IncomingLinks(view);
		case StopNode2EditPart.VISUAL_ID:
			return getStopNode_3004IncomingLinks(view);
		case StructuredNode2EditPart.VISUAL_ID:
			return getStructuredNode_3005IncomingLinks(view);
		case MatchingPatternEditPart.VISUAL_ID:
			return getMatchingPattern_3006IncomingLinks(view);
		case ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3007IncomingLinks(view);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getOutgoingLinks(View view) {
		switch (SDMVisualIDRegistry.getVisualID(view)) {
		case StartNodeEditPart.VISUAL_ID:
			return getStartNode_2001OutgoingLinks(view);
		case StopNodeEditPart.VISUAL_ID:
			return getStopNode_2002OutgoingLinks(view);
		case JunctionNodeEditPart.VISUAL_ID:
			return getJunctionNode_2003OutgoingLinks(view);
		case StatementNodeEditPart.VISUAL_ID:
			return getStatementNode_2004OutgoingLinks(view);
		case StructuredNodeEditPart.VISUAL_ID:
			return getStructuredNode_2005OutgoingLinks(view);
		case MatchingStoryNodeEditPart.VISUAL_ID:
			return getMatchingStoryNode_2006OutgoingLinks(view);
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return getModifyingStoryNode_2007OutgoingLinks(view);
		case JunctionNode2EditPart.VISUAL_ID:
			return getJunctionNode_3001OutgoingLinks(view);
		case StartNode2EditPart.VISUAL_ID:
			return getStartNode_3002OutgoingLinks(view);
		case StatementNode2EditPart.VISUAL_ID:
			return getStatementNode_3003OutgoingLinks(view);
		case StopNode2EditPart.VISUAL_ID:
			return getStopNode_3004OutgoingLinks(view);
		case StructuredNode2EditPart.VISUAL_ID:
			return getStructuredNode_3005OutgoingLinks(view);
		case MatchingPatternEditPart.VISUAL_ID:
			return getMatchingPattern_3006OutgoingLinks(view);
		case ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3007OutgoingLinks(view);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getActivity_1000ContainedLinks(
			View view) {
		Activity modelElement = (Activity) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStartNode_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStopNode_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getJunctionNode_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStatementNode_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStructuredNode_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getMatchingStoryNode_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getModifyingStoryNode_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getJunctionNode_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStartNode_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStatementNode_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStopNode_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStructuredNode_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getMatchingPattern_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getObjectVariable_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getActivityEdge_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStartNode_2001IncomingLinks(
			View view) {
		StartNode modelElement = (StartNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStopNode_2002IncomingLinks(
			View view) {
		StopNode modelElement = (StopNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getJunctionNode_2003IncomingLinks(
			View view) {
		JunctionNode modelElement = (JunctionNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStatementNode_2004IncomingLinks(
			View view) {
		StatementNode modelElement = (StatementNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStructuredNode_2005IncomingLinks(
			View view) {
		StructuredNode modelElement = (StructuredNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getMatchingStoryNode_2006IncomingLinks(
			View view) {
		MatchingStoryNode modelElement = (MatchingStoryNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getModifyingStoryNode_2007IncomingLinks(
			View view) {
		ModifyingStoryNode modelElement = (ModifyingStoryNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getJunctionNode_3001IncomingLinks(
			View view) {
		JunctionNode modelElement = (JunctionNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStartNode_3002IncomingLinks(
			View view) {
		StartNode modelElement = (StartNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStatementNode_3003IncomingLinks(
			View view) {
		StatementNode modelElement = (StatementNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStopNode_3004IncomingLinks(
			View view) {
		StopNode modelElement = (StopNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStructuredNode_3005IncomingLinks(
			View view) {
		StructuredNode modelElement = (StructuredNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getMatchingPattern_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getObjectVariable_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getActivityEdge_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStartNode_2001OutgoingLinks(
			View view) {
		StartNode modelElement = (StartNode) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStopNode_2002OutgoingLinks(
			View view) {
		StopNode modelElement = (StopNode) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getJunctionNode_2003OutgoingLinks(
			View view) {
		JunctionNode modelElement = (JunctionNode) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStatementNode_2004OutgoingLinks(
			View view) {
		StatementNode modelElement = (StatementNode) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStructuredNode_2005OutgoingLinks(
			View view) {
		StructuredNode modelElement = (StructuredNode) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getMatchingStoryNode_2006OutgoingLinks(
			View view) {
		MatchingStoryNode modelElement = (MatchingStoryNode) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getModifyingStoryNode_2007OutgoingLinks(
			View view) {
		ModifyingStoryNode modelElement = (ModifyingStoryNode) view
				.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getJunctionNode_3001OutgoingLinks(
			View view) {
		JunctionNode modelElement = (JunctionNode) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStartNode_3002OutgoingLinks(
			View view) {
		StartNode modelElement = (StartNode) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStatementNode_3003OutgoingLinks(
			View view) {
		StatementNode modelElement = (StatementNode) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStopNode_3004OutgoingLinks(
			View view) {
		StopNode modelElement = (StopNode) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getStructuredNode_3005OutgoingLinks(
			View view) {
		StructuredNode modelElement = (StructuredNode) view.getElement();
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getMatchingPattern_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getObjectVariable_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SDMLinkDescriptor> getActivityEdge_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<SDMLinkDescriptor> getContainedTypeModelFacetLinks_ActivityEdge_4001(
			Activity container) {
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		for (Iterator<?> links = container.getOwnedActivityEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityEdge) {
				continue;
			}
			ActivityEdge link = (ActivityEdge) linkObject;
			if (ActivityEdgeEditPart.VISUAL_ID != SDMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			result.add(new SDMLinkDescriptor(src, dst, link,
					SDMElementTypes.ActivityEdge_4001,
					ActivityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SDMLinkDescriptor> getIncomingTypeModelFacetLinks_ActivityEdge_4001(
			ActivityNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ActivitiesPackage.eINSTANCE
					.getActivityEdge_Target()
					|| false == setting.getEObject() instanceof ActivityEdge) {
				continue;
			}
			ActivityEdge link = (ActivityEdge) setting.getEObject();
			if (ActivityEdgeEditPart.VISUAL_ID != SDMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode src = link.getSource();
			result.add(new SDMLinkDescriptor(src, target, link,
					SDMElementTypes.ActivityEdge_4001,
					ActivityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SDMLinkDescriptor> getOutgoingTypeModelFacetLinks_ActivityEdge_4001(
			ActivityNode source) {
		Activity container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Activity) {
				container = (Activity) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<SDMLinkDescriptor> result = new LinkedList<SDMLinkDescriptor>();
		for (Iterator<?> links = container.getOwnedActivityEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityEdge) {
				continue;
			}
			ActivityEdge link = (ActivityEdge) linkObject;
			if (ActivityEdgeEditPart.VISUAL_ID != SDMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new SDMLinkDescriptor(src, dst, link,
					SDMElementTypes.ActivityEdge_4001,
					ActivityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

}
