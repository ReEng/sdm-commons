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
import org.storydriven.storydiagrams.activities.JunctionNode;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityCallNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityCallNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEdgeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEdgeGuardLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityFinalNodeLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.AttributeAssignmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.Constraint2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ConstraintEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ContainmentRelationEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ContainmentRelationOperatorLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.InitialNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.InitialNodeLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.JunctionNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableSourceEndLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingPatternEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingStoryNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingStoryNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectSetVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableOperatorEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StartNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StopNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StoryPatternEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.WrappingLabel6EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.WrappingLabel7EditPart;
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
		case ActivityEdgeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.storydriven.org/storydiagrams/activities/0.2.0?ActivityEdge", StorydiagramsElementTypes.ActivityEdge_4001); //$NON-NLS-1$
		case StopNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.0?StopNode", StorydiagramsElementTypes.StopNode_2002); //$NON-NLS-1$
		case LinkVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.storydriven.org/storydiagrams/patterns/0.2.0?LinkVariable", StorydiagramsElementTypes.LinkVariable_4002); //$NON-NLS-1$
		case ObjectVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.0?ObjectVariable", StorydiagramsElementTypes.ObjectVariable_3009); //$NON-NLS-1$
		case AttributeAssignmentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.0?AttributeAssignment", StorydiagramsElementTypes.AttributeAssignment_3010); //$NON-NLS-1$
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.0?ModifyingStoryNode", StorydiagramsElementTypes.ModifyingStoryNode_2007); //$NON-NLS-1$
		case StatementNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.0?StatementNode", StorydiagramsElementTypes.StatementNode_2004); //$NON-NLS-1$
		case StartNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.0?StartNode", StorydiagramsElementTypes.StartNode_2001); //$NON-NLS-1$
		case ActivityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.storydriven.org/storydiagrams/activities/0.2.0?Activity", StorydiagramsElementTypes.Activity_1000); //$NON-NLS-1$
		case Constraint2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.0?Constraint", StorydiagramsElementTypes.Constraint_3017); //$NON-NLS-1$
		case JunctionNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.0?JunctionNode", StorydiagramsElementTypes.JunctionNode_2003); //$NON-NLS-1$
		case ActivityCallNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.0?ActivityCallNode", StorydiagramsElementTypes.ActivityCallNode_2006); //$NON-NLS-1$
		case ObjectSetVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.0?ObjectSetVariable", StorydiagramsElementTypes.ObjectSetVariable_3018); //$NON-NLS-1$
		case ConstraintEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.0?Constraint", StorydiagramsElementTypes.Constraint_3013); //$NON-NLS-1$
		case ContainmentRelationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.storydriven.org/storydiagrams/patterns/0.2.0?ContainmentRelation", StorydiagramsElementTypes.ContainmentRelation_4004); //$NON-NLS-1$
		case MatchingPatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.0?MatchingPattern", StorydiagramsElementTypes.MatchingPattern_3012); //$NON-NLS-1$
		case StoryPatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.0?StoryPattern", StorydiagramsElementTypes.StoryPattern_3008); //$NON-NLS-1$
		case MatchingStoryNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.0?MatchingStoryNode", StorydiagramsElementTypes.MatchingStoryNode_2008); //$NON-NLS-1$
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
		case ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4001Text(view);
		case StopNodeEditPart.VISUAL_ID:
			return getStopNode_2002Text(view);
		case LinkVariableEditPart.VISUAL_ID:
			return getLinkVariable_4002Text(view);
		case ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3009Text(view);
		case AttributeAssignmentEditPart.VISUAL_ID:
			return getAttributeAssignment_3010Text(view);
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return getModifyingStoryNode_2007Text(view);
		case StatementNodeEditPart.VISUAL_ID:
			return getStatementNode_2004Text(view);
		case StartNodeEditPart.VISUAL_ID:
			return getStartNode_2001Text(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_1000Text(view);
		case Constraint2EditPart.VISUAL_ID:
			return getConstraint_3017Text(view);
		case JunctionNodeEditPart.VISUAL_ID:
			return getJunctionNode_2003Text(view);
		case ActivityCallNodeEditPart.VISUAL_ID:
			return getActivityCallNode_2006Text(view);
		case ObjectSetVariableEditPart.VISUAL_ID:
			return getObjectSetVariable_3018Text(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_3013Text(view);
		case ContainmentRelationEditPart.VISUAL_ID:
			return getContainmentRelation_4004Text(view);
		case MatchingPatternEditPart.VISUAL_ID:
			return getMatchingPattern_3012Text(view);
		case StoryPatternEditPart.VISUAL_ID:
			return getStoryPattern_3008Text(view);
		case MatchingStoryNodeEditPart.VISUAL_ID:
			return getMatchingStoryNode_2008Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getStoryPattern_3008Text(View view) {
		StoryPattern domainModelElement = (StoryPattern) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStartNode_2001Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.StartNode_2001,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(InitialNodeLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStopNode_2002Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.StopNode_2002,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(ActivityFinalNodeLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMatchingPattern_3012Text(View view) {
		MatchingPattern domainModelElement = (MatchingPattern) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getModifyingStoryNode_2007Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.ModifyingStoryNode_2007,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(ModifyingStoryNodeNameEditPart.VISUAL_ID));
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
	private String getConstraint_3013Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.Constraint_3013,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getObjectSetVariable_3018Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.ObjectSetVariable_3018,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(WrappingLabel7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJunctionNode_2003Text(View view) {
		JunctionNode domainModelElement = (JunctionNode) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2003); //$NON-NLS-1$
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
	private String getMatchingStoryNode_2008Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.MatchingStoryNode_2008,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(MatchingStoryNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStatementNode_2004Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.StatementNode_2004,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(StatementNodeNameEditPart.VISUAL_ID));
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
	private String getConstraint_3017Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.Constraint_3017,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(Constraint2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3017); //$NON-NLS-1$
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
	private String getObjectVariable_3009Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.ObjectVariable_3009,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(ObjectVariableOperatorEditPart.VISUAL_ID));
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
	private String getContainmentRelation_4004Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.ContainmentRelation_4004,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(ContainmentRelationOperatorLabelEditPart.VISUAL_ID));
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
	private String getActivityCallNode_2006Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.ActivityCallNode_2006,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(ActivityCallNodeNameEditPart.VISUAL_ID));
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
	private String getAttributeAssignment_3010Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.AttributeAssignment_3010,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(AttributeAssignmentEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3010); //$NON-NLS-1$
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
