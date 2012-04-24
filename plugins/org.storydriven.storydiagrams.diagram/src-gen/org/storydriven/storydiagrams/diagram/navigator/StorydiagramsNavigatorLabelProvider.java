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
import org.storydriven.storydiagrams.activities.StartNode;
import org.storydriven.storydiagrams.activities.StopNode;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityCallNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityCallNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEdgeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEdgeGuardConstraintLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.AttributeAssignmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.JunctionNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.JunctionNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeName2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.PrimitiveVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.PrimitiveVariableNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StartNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StartNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeName2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StopNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StopNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StoryPatternEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StructuredNode2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StructuredNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StructuredNodeName2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StructuredNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.TextualExpressionEditPart;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsDiagramEditorPlugin;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsParserProvider;
import org.storydriven.storydiagrams.patterns.LinkVariable;
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
		case StoryPatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.0?StoryPattern", StorydiagramsElementTypes.StoryPattern_3008); //$NON-NLS-1$
		case StartNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/activities/0.2.0?StartNode", StorydiagramsElementTypes.StartNode_3003); //$NON-NLS-1$
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.0?ModifyingStoryNode", StorydiagramsElementTypes.ModifyingStoryNode_2007); //$NON-NLS-1$
		case StartNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.0?StartNode", StorydiagramsElementTypes.StartNode_2001); //$NON-NLS-1$
		case JunctionNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/activities/0.2.0?JunctionNode", StorydiagramsElementTypes.JunctionNode_3002); //$NON-NLS-1$
		case ModifyingStoryNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/activities/0.2.0?ModifyingStoryNode", StorydiagramsElementTypes.ModifyingStoryNode_3007); //$NON-NLS-1$
		case TextualExpressionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/core/expressions/0.2.0?TextualExpression", StorydiagramsElementTypes.TextualExpression_3001); //$NON-NLS-1$
		case ActivityCallNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.0?ActivityCallNode", StorydiagramsElementTypes.ActivityCallNode_2006); //$NON-NLS-1$
		case JunctionNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.0?JunctionNode", StorydiagramsElementTypes.JunctionNode_2003); //$NON-NLS-1$
		case ObjectVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.0?ObjectVariable", StorydiagramsElementTypes.ObjectVariable_3009); //$NON-NLS-1$
		case StructuredNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.0?StructuredNode", StorydiagramsElementTypes.StructuredNode_2005); //$NON-NLS-1$
		case ActivityEdgeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.storydriven.org/storydiagrams/activities/0.2.0?ActivityEdge", StorydiagramsElementTypes.ActivityEdge_4001); //$NON-NLS-1$
		case ActivityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.storydriven.org/storydiagrams/activities/0.2.0?Activity", StorydiagramsElementTypes.Activity_1000); //$NON-NLS-1$
		case LinkVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.storydriven.org/storydiagrams/patterns/0.2.0?LinkVariable", StorydiagramsElementTypes.LinkVariable_4002); //$NON-NLS-1$
		case StructuredNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/activities/0.2.0?StructuredNode", StorydiagramsElementTypes.StructuredNode_3006); //$NON-NLS-1$
		case StatementNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/activities/0.2.0?StatementNode", StorydiagramsElementTypes.StatementNode_3005); //$NON-NLS-1$
		case StopNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/activities/0.2.0?StopNode", StorydiagramsElementTypes.StopNode_3004); //$NON-NLS-1$
		case AttributeAssignmentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.0?AttributeAssignment", StorydiagramsElementTypes.AttributeAssignment_3010); //$NON-NLS-1$
		case PrimitiveVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.0?PrimitiveVariable", StorydiagramsElementTypes.PrimitiveVariable_3011); //$NON-NLS-1$
		case StatementNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.0?StatementNode", StorydiagramsElementTypes.StatementNode_2004); //$NON-NLS-1$
		case StopNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.0?StopNode", StorydiagramsElementTypes.StopNode_2002); //$NON-NLS-1$
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
		case StoryPatternEditPart.VISUAL_ID:
			return getStoryPattern_3008Text(view);
		case StartNode2EditPart.VISUAL_ID:
			return getStartNode_3003Text(view);
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return getModifyingStoryNode_2007Text(view);
		case StartNodeEditPart.VISUAL_ID:
			return getStartNode_2001Text(view);
		case JunctionNode2EditPart.VISUAL_ID:
			return getJunctionNode_3002Text(view);
		case ModifyingStoryNode2EditPart.VISUAL_ID:
			return getModifyingStoryNode_3007Text(view);
		case TextualExpressionEditPart.VISUAL_ID:
			return getTextualExpression_3001Text(view);
		case ActivityCallNodeEditPart.VISUAL_ID:
			return getActivityCallNode_2006Text(view);
		case JunctionNodeEditPart.VISUAL_ID:
			return getJunctionNode_2003Text(view);
		case ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3009Text(view);
		case StructuredNodeEditPart.VISUAL_ID:
			return getStructuredNode_2005Text(view);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4001Text(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_1000Text(view);
		case LinkVariableEditPart.VISUAL_ID:
			return getLinkVariable_4002Text(view);
		case StructuredNode2EditPart.VISUAL_ID:
			return getStructuredNode_3006Text(view);
		case StatementNode2EditPart.VISUAL_ID:
			return getStatementNode_3005Text(view);
		case StopNode2EditPart.VISUAL_ID:
			return getStopNode_3004Text(view);
		case AttributeAssignmentEditPart.VISUAL_ID:
			return getAttributeAssignment_3010Text(view);
		case PrimitiveVariableEditPart.VISUAL_ID:
			return getPrimitiveVariable_3011Text(view);
		case StatementNodeEditPart.VISUAL_ID:
			return getStatementNode_2004Text(view);
		case StopNodeEditPart.VISUAL_ID:
			return getStopNode_2002Text(view);
		}
		return getUnknownElementText(view);
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
	private String getActivityEdge_4001Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.ActivityEdge_4001,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(ActivityEdgeGuardConstraintLabelEditPart.VISUAL_ID));
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
	private String getObjectVariable_3009Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.ObjectVariable_3009,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(ObjectVariableNameEditPart.VISUAL_ID));
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
	private String getPrimitiveVariable_3011Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.PrimitiveVariable_3011,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(PrimitiveVariableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLinkVariable_4002Text(View view) {
		LinkVariable domainModelElement = (LinkVariable) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getStatementNode_3005Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.StatementNode_3005,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(StatementNodeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTextualExpression_3001Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.TextualExpression_3001,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(TextualExpressionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStructuredNode_2005Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.StructuredNode_2005,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(StructuredNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStartNode_2001Text(View view) {
		StartNode domainModelElement = (StartNode) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2001); //$NON-NLS-1$
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
	private String getJunctionNode_3002Text(View view) {
		JunctionNode domainModelElement = (JunctionNode) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStructuredNode_3006Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.StructuredNode_3006,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(StructuredNodeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getModifyingStoryNode_3007Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.ModifyingStoryNode_3007,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(ModifyingStoryNodeName2EditPart.VISUAL_ID));
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
	private String getStartNode_3003Text(View view) {
		StartNode domainModelElement = (StartNode) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3003); //$NON-NLS-1$
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
	private String getStopNode_3004Text(View view) {
		StopNode domainModelElement = (StopNode) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStopNode_2002Text(View view) {
		StopNode domainModelElement = (StopNode) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2002); //$NON-NLS-1$
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
