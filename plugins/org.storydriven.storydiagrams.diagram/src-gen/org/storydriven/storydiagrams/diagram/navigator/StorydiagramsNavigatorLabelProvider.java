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
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityFinalNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.AttributeAssignmentEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.CollectionVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.Constraint2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ConstraintEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.InclusionLinkEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.InitialNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.JunctionNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.LinkVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingPatternEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingStoryNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingStoryNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StoryPatternEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.WrappingLabel10EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.WrappingLabel13EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.WrappingLabel3EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.WrappingLabel4EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.WrappingLabel5EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.WrappingLabel7EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.WrappingLabel9EditPart;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsDiagramEditorPlugin;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsParserProvider;
import org.storydriven.storydiagrams.patterns.MatchingPattern;
import org.storydriven.storydiagrams.patterns.StoryPattern;

/**
 * @generated
 */
public class StorydiagramsNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		StorydiagramsDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		StorydiagramsDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
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
			return StorydiagramsDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
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
					"Navigator?Link?http://www.storydriven.org/storydiagrams/activities/0.2.1?ActivityEdge", StorydiagramsElementTypes.ActivityEdge_4005); //$NON-NLS-1$
		case ActivityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.storydriven.org/storydiagrams/activities/0.2.1?Activity", StorydiagramsElementTypes.Activity_1000); //$NON-NLS-1$
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.1?ModifyingStoryNode", StorydiagramsElementTypes.ModifyingStoryNode_2011); //$NON-NLS-1$
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.1?ActivityFinalNode", StorydiagramsElementTypes.ActivityFinalNode_2015); //$NON-NLS-1$
		case MatchingStoryNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.1?MatchingStoryNode", StorydiagramsElementTypes.MatchingStoryNode_2012); //$NON-NLS-1$
		case ObjectVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.1?ObjectVariable", StorydiagramsElementTypes.ObjectVariable_3020); //$NON-NLS-1$
		case InclusionLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.storydriven.org/storydiagrams/patterns/0.2.1?InclusionLink", StorydiagramsElementTypes.InclusionLink_4007); //$NON-NLS-1$
		case ActivityCallNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.1?ActivityCallNode", StorydiagramsElementTypes.ActivityCallNode_2009); //$NON-NLS-1$
		case LinkVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.storydriven.org/storydiagrams/patterns/0.2.1?LinkVariable", StorydiagramsElementTypes.LinkVariable_4006); //$NON-NLS-1$
		case StatementNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.1?StatementNode", StorydiagramsElementTypes.StatementNode_2010); //$NON-NLS-1$
		case Constraint2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.1?Constraint", StorydiagramsElementTypes.Constraint_3024); //$NON-NLS-1$
		case JunctionNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.1?JunctionNode", StorydiagramsElementTypes.JunctionNode_2014); //$NON-NLS-1$
		case MatchingPatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.1?MatchingPattern", StorydiagramsElementTypes.MatchingPattern_3025); //$NON-NLS-1$
		case ConstraintEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.1?Constraint", StorydiagramsElementTypes.Constraint_3022); //$NON-NLS-1$
		case InitialNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.storydriven.org/storydiagrams/activities/0.2.1?InitialNode", StorydiagramsElementTypes.InitialNode_2013); //$NON-NLS-1$
		case AttributeAssignmentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.1?AttributeAssignment", StorydiagramsElementTypes.AttributeAssignment_3021); //$NON-NLS-1$
		case StoryPatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.1?StoryPattern", StorydiagramsElementTypes.StoryPattern_3019); //$NON-NLS-1$
		case CollectionVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.1?CollectionVariable", StorydiagramsElementTypes.CollectionVariable_3023); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = StorydiagramsDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& StorydiagramsElementTypes.isKnownElementType(elementType)) {
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
			return getActivityEdge_4005Text(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_1000Text(view);
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return getModifyingStoryNode_2011Text(view);
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return getActivityFinalNode_2015Text(view);
		case MatchingStoryNodeEditPart.VISUAL_ID:
			return getMatchingStoryNode_2012Text(view);
		case ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3020Text(view);
		case InclusionLinkEditPart.VISUAL_ID:
			return getInclusionLink_4007Text(view);
		case ActivityCallNodeEditPart.VISUAL_ID:
			return getActivityCallNode_2009Text(view);
		case LinkVariableEditPart.VISUAL_ID:
			return getLinkVariable_4006Text(view);
		case StatementNodeEditPart.VISUAL_ID:
			return getStatementNode_2010Text(view);
		case Constraint2EditPart.VISUAL_ID:
			return getConstraint_3024Text(view);
		case JunctionNodeEditPart.VISUAL_ID:
			return getJunctionNode_2014Text(view);
		case MatchingPatternEditPart.VISUAL_ID:
			return getMatchingPattern_3025Text(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_3022Text(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2013Text(view);
		case AttributeAssignmentEditPart.VISUAL_ID:
			return getAttributeAssignment_3021Text(view);
		case StoryPatternEditPart.VISUAL_ID:
			return getStoryPattern_3019Text(view);
		case CollectionVariableEditPart.VISUAL_ID:
			return getCollectionVariable_3023Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getActivityEdge_4005Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(
				StorydiagramsElementTypes.ActivityEdge_4005,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry
						.getType(WrappingLabel9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6006); //$NON-NLS-1$
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
	private String getModifyingStoryNode_2011Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(
				StorydiagramsElementTypes.ModifyingStoryNode_2011, view
						.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry
						.getType(ModifyingStoryNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActivityFinalNode_2015Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(
				StorydiagramsElementTypes.ActivityFinalNode_2015, view
						.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry
						.getType(WrappingLabel4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMatchingStoryNode_2012Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(
				StorydiagramsElementTypes.MatchingStoryNode_2012, view
						.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry
						.getType(MatchingStoryNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getObjectVariable_3020Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(
				StorydiagramsElementTypes.ObjectVariable_3020, view
						.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry
						.getType(WrappingLabel5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInclusionLink_4007Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(
				StorydiagramsElementTypes.InclusionLink_4007,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry
						.getType(WrappingLabel13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActivityCallNode_2009Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(
				StorydiagramsElementTypes.ActivityCallNode_2009, view
						.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry
						.getType(ActivityCallNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLinkVariable_4006Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(
				StorydiagramsElementTypes.LinkVariable_4006,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry
						.getType(WrappingLabel10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStatementNode_2010Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(
				StorydiagramsElementTypes.StatementNode_2010,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry
						.getType(StatementNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConstraint_3024Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(
				StorydiagramsElementTypes.Constraint_3024,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry
						.getType(Constraint2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJunctionNode_2014Text(View view) {
		JunctionNode domainModelElement = (JunctionNode) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMatchingPattern_3025Text(View view) {
		MatchingPattern domainModelElement = (MatchingPattern) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConstraint_3022Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(
				StorydiagramsElementTypes.Constraint_3022,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry
						.getType(ConstraintEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInitialNode_2013Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(
				StorydiagramsElementTypes.InitialNode_2013,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry
						.getType(WrappingLabel3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttributeAssignment_3021Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(
				StorydiagramsElementTypes.AttributeAssignment_3021, view
						.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry
						.getType(AttributeAssignmentEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStoryPattern_3019Text(View view) {
		StoryPattern domainModelElement = (StoryPattern) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCollectionVariable_3023Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(
				StorydiagramsElementTypes.CollectionVariable_3023, view
						.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry
						.getType(WrappingLabel7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5039); //$NON-NLS-1$
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
		return ActivityEditPart.MODEL_ID.equals(StorydiagramsVisualIDRegistry
				.getModelID(view));
	}

}
