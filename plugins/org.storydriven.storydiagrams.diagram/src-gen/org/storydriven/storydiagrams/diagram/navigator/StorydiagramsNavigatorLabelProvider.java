package org.storydriven.storydiagrams.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.FlowFinalNode;
import org.storydriven.storydiagrams.activities.JunctionNode;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityCallNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityCallNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEdgeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEdgeGuardLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityFinalNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityFinalNodeLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.AttributeAssignmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.CollectionVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.CollectionVariableOperatorLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.Constraint2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ConstraintEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.FlowFinalNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.InclusionLinkEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.InclusionLinkLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.InitialNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.InitialNodeLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.JunctionNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableSourceEndLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingPatternEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingStoryNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingStoryNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MaybeLinkEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MaybeLinkLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableOperatorEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StoryPatternEditPart;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsDiagramEditorPlugin;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsParserProvider;
import org.storydriven.storydiagrams.patterns.MatchingPattern;
import org.storydriven.storydiagrams.patterns.StoryPattern;

/**
 * @generated
 */
public class StorydiagramsNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider,
		ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		StorydiagramsDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		StorydiagramsDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof StorydiagramsNavigatorItem
				&& !isOwnView(((StorydiagramsNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof StorydiagramsNavigatorGroup) {
			StorydiagramsNavigatorGroup group = (StorydiagramsNavigatorGroup) element;
			return StorydiagramsDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof StorydiagramsNavigatorItem) {
			StorydiagramsNavigatorItem navigatorItem = (StorydiagramsNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (StorydiagramsVisualIDRegistry.getVisualID(view)) {
		case Constraint2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.1?Constraint", StorydiagramsElementTypes.Constraint_3006); //$NON-NLS-1$
		case StatementNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.1?StatementNode", StorydiagramsElementTypes.StatementNode_2002); //$NON-NLS-1$
		case AttributeAssignmentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.1?AttributeAssignment", StorydiagramsElementTypes.AttributeAssignment_3003); //$NON-NLS-1$
		case JunctionNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.1?JunctionNode", StorydiagramsElementTypes.JunctionNode_2006); //$NON-NLS-1$
		case StoryPatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.1?StoryPattern", StorydiagramsElementTypes.StoryPattern_3001); //$NON-NLS-1$
		case MaybeLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.storydriven.org/storydiagrams/patterns/0.2.1?MaybeLink", StorydiagramsElementTypes.MaybeLink_4004); //$NON-NLS-1$
		case ActivityCallNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.1?ActivityCallNode", StorydiagramsElementTypes.ActivityCallNode_2001); //$NON-NLS-1$
		case InclusionLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.storydriven.org/storydiagrams/patterns/0.2.1?InclusionLink", StorydiagramsElementTypes.InclusionLink_4003); //$NON-NLS-1$
		case CollectionVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.1?CollectionVariable", StorydiagramsElementTypes.CollectionVariable_3005); //$NON-NLS-1$
		case ActivityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.storydriven.org/storydiagrams/activities/0.2.1?Activity", StorydiagramsElementTypes.Activity_1000); //$NON-NLS-1$
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.1?ActivityFinalNode", StorydiagramsElementTypes.ActivityFinalNode_2007); //$NON-NLS-1$
		case LinkVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.storydriven.org/storydiagrams/patterns/0.2.1?LinkVariable", StorydiagramsElementTypes.LinkVariable_4002); //$NON-NLS-1$
		case MatchingPatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.1?MatchingPattern", StorydiagramsElementTypes.MatchingPattern_3007); //$NON-NLS-1$
		case MatchingStoryNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.1?MatchingStoryNode", StorydiagramsElementTypes.MatchingStoryNode_2004); //$NON-NLS-1$
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.1?ModifyingStoryNode", StorydiagramsElementTypes.ModifyingStoryNode_2003); //$NON-NLS-1$
		case ObjectVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.1?ObjectVariable", StorydiagramsElementTypes.ObjectVariable_3002); //$NON-NLS-1$
		case InitialNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.1?InitialNode", StorydiagramsElementTypes.InitialNode_2005); //$NON-NLS-1$
		case ActivityEdgeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.storydriven.org/storydiagrams/activities/0.2.1?ActivityEdge", StorydiagramsElementTypes.ActivityEdge_4001); //$NON-NLS-1$
		case ConstraintEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.1?Constraint", StorydiagramsElementTypes.Constraint_3004); //$NON-NLS-1$
		case FlowFinalNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.1?FlowFinalNode", StorydiagramsElementTypes.FlowFinalNode_2008); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = StorydiagramsDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && StorydiagramsElementTypes.isKnownElementType(elementType)) {
			image = StorydiagramsElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof StorydiagramsNavigatorGroup) {
			StorydiagramsNavigatorGroup group = (StorydiagramsNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof StorydiagramsNavigatorItem) {
			StorydiagramsNavigatorItem navigatorItem = (StorydiagramsNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (StorydiagramsVisualIDRegistry.getVisualID(view)) {
		case Constraint2EditPart.VISUAL_ID:
			return getConstraint_3006Text(view);
		case StatementNodeEditPart.VISUAL_ID:
			return getStatementNode_2002Text(view);
		case AttributeAssignmentEditPart.VISUAL_ID:
			return getAttributeAssignment_3003Text(view);
		case JunctionNodeEditPart.VISUAL_ID:
			return getJunctionNode_2006Text(view);
		case StoryPatternEditPart.VISUAL_ID:
			return getStoryPattern_3001Text(view);
		case MaybeLinkEditPart.VISUAL_ID:
			return getMaybeLink_4004Text(view);
		case ActivityCallNodeEditPart.VISUAL_ID:
			return getActivityCallNode_2001Text(view);
		case InclusionLinkEditPart.VISUAL_ID:
			return getInclusionLink_4003Text(view);
		case CollectionVariableEditPart.VISUAL_ID:
			return getCollectionVariable_3005Text(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_1000Text(view);
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return getActivityFinalNode_2007Text(view);
		case LinkVariableEditPart.VISUAL_ID:
			return getLinkVariable_4002Text(view);
		case MatchingPatternEditPart.VISUAL_ID:
			return getMatchingPattern_3007Text(view);
		case MatchingStoryNodeEditPart.VISUAL_ID:
			return getMatchingStoryNode_2004Text(view);
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return getModifyingStoryNode_2003Text(view);
		case ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3002Text(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2005Text(view);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4001Text(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_3004Text(view);
		case FlowFinalNodeEditPart.VISUAL_ID:
			return getFlowFinalNode_2008Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getConstraint_3006Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.Constraint_3006,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(Constraint2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStatementNode_2002Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.StatementNode_2002,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(StatementNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttributeAssignment_3003Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.AttributeAssignment_3003,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(AttributeAssignmentEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJunctionNode_2006Text(View view) {
		JunctionNode domainModelElement = (JunctionNode) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStoryPattern_3001Text(View view) {
		StoryPattern domainModelElement = (StoryPattern) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMaybeLink_4004Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.MaybeLink_4004,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(MaybeLinkLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActivityCallNode_2001Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.ActivityCallNode_2001,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(ActivityCallNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInclusionLink_4003Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.InclusionLink_4003,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(InclusionLinkLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCollectionVariable_3005Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.CollectionVariable_3005,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(CollectionVariableOperatorLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActivity_1000Text(View view) {
		Activity domainModelElement = (Activity) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActivityFinalNode_2007Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.ActivityFinalNode_2007,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(ActivityFinalNodeLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLinkVariable_4002Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.LinkVariable_4002,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(LinkVariableSourceEndLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMatchingPattern_3007Text(View view) {
		MatchingPattern domainModelElement = (MatchingPattern) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMatchingStoryNode_2004Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.MatchingStoryNode_2004,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(MatchingStoryNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getModifyingStoryNode_2003Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.ModifyingStoryNode_2003,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(ModifyingStoryNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getObjectVariable_3002Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.ObjectVariable_3002,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(ObjectVariableOperatorEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInitialNode_2005Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.InitialNode_2005,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(InitialNodeLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActivityEdge_4001Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.ActivityEdge_4001,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(ActivityEdgeGuardLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConstraint_3004Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.Constraint_3004,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFlowFinalNode_2008Text(View view) {
		FlowFinalNode domainModelElement = (FlowFinalNode) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ActivityEditPart.MODEL_ID.equals(StorydiagramsVisualIDRegistry.getModelID(view));
	}

}
