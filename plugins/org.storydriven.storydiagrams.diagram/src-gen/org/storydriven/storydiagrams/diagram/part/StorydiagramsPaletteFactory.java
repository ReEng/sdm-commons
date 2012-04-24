package org.storydriven.storydiagrams.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class StorydiagramsPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createActivities1Group());
		paletteRoot.add(createPatterns2Group());
		paletteRoot.add(createConstraints3Group());
	}

	/**
	 * Creates "Activities" palette tool group
	 * @generated
	 */
	private PaletteContainer createActivities1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Activities1Group_title);
		paletteContainer.setId("createActivities1Group"); //$NON-NLS-1$
		paletteContainer.setSmallIcon(StorydiagramsDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.storydiagrams.diagram.custom/icons/palette/activities.png")); //$NON-NLS-1$
		paletteContainer.add(createActivityCallNode1CreationTool());
		paletteContainer.add(createModifyingStoryNode2CreationTool());
		paletteContainer.add(createMatchingStoryNode3CreationTool());
		paletteContainer.add(createStatementNode4CreationTool());
		paletteContainer.add(createStructuredNode5CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createActivityEdge7CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createStartNode9CreationTool());
		paletteContainer.add(createJunctionNode10CreationTool());
		paletteContainer.add(createStopNode11CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Patterns" palette tool group
	 * @generated
	 */
	private PaletteContainer createPatterns2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Patterns2Group_title);
		paletteContainer.setId("createPatterns2Group"); //$NON-NLS-1$
		paletteContainer.setSmallIcon(StorydiagramsDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.storydiagrams.diagram.custom/icons/palette/patterns.png")); //$NON-NLS-1$
		paletteContainer.add(createObjectVariable1CreationTool());
		paletteContainer.add(createPrimitiveVariable2CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createLinkVariable4CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createAttributeAssignment6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Constraints" palette tool group
	 * @generated
	 */
	private PaletteContainer createConstraints3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Constraints3Group_title);
		paletteContainer.setId("createConstraints3Group"); //$NON-NLS-1$
		paletteContainer.setSmallIcon(StorydiagramsDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.storydiagrams.diagram.custom/icons/palette/constraints.png")); //$NON-NLS-1$
		paletteContainer.add(createAttributeConstraint1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityCallNode1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.ActivityCallNode1CreationTool_title,
				Messages.ActivityCallNode1CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.ActivityCallNode_2006));
		entry.setId("createActivityCallNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.storydiagrams.diagram.custom/icons/elements/activities/ActivityCallNode.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createModifyingStoryNode2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(StorydiagramsElementTypes.ModifyingStoryNode_3007);
		types.add(StorydiagramsElementTypes.ModifyingStoryNode_2007);
		NodeToolEntry entry = new NodeToolEntry(Messages.ModifyingStoryNode2CreationTool_title,
				Messages.ModifyingStoryNode2CreationTool_desc, types);
		entry.setId("createModifyingStoryNode2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.storydiagrams.diagram.custom/icons/elements/activities/ModifyingStoryNode.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMatchingStoryNode3CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.MatchingStoryNode3CreationTool_title,
				Messages.MatchingStoryNode3CreationTool_desc, null, null) {
		};
		entry.setId("createMatchingStoryNode3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.storydiagrams.diagram.custom/icons/elements/activities/MatchingStoryNode.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStatementNode4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(StorydiagramsElementTypes.StatementNode_2004);
		types.add(StorydiagramsElementTypes.StatementNode_3005);
		NodeToolEntry entry = new NodeToolEntry(Messages.StatementNode4CreationTool_title,
				Messages.StatementNode4CreationTool_desc, types);
		entry.setId("createStatementNode4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.storydiagrams.diagram.custom/icons/elements/activities/StatementNode.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuredNode5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(StorydiagramsElementTypes.StructuredNode_2005);
		types.add(StorydiagramsElementTypes.StructuredNode_3006);
		NodeToolEntry entry = new NodeToolEntry(Messages.StructuredNode5CreationTool_title,
				Messages.StructuredNode5CreationTool_desc, types);
		entry.setId("createStructuredNode5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.storydiagrams.diagram.custom/icons/elements/activities/StructuredNode.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityEdge7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.ActivityEdge7CreationTool_title,
				Messages.ActivityEdge7CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.ActivityEdge_4001));
		entry.setId("createActivityEdge7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.storydiagrams.diagram.custom/icons/elements/activities/ActivityEdge.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStartNode9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(StorydiagramsElementTypes.StartNode_2001);
		types.add(StorydiagramsElementTypes.StartNode_3003);
		NodeToolEntry entry = new NodeToolEntry(Messages.StartNode9CreationTool_title,
				Messages.StartNode9CreationTool_desc, types);
		entry.setId("createStartNode9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.storydiagrams.diagram.custom/icons/elements/activities/StartNode.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJunctionNode10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(StorydiagramsElementTypes.JunctionNode_2003);
		types.add(StorydiagramsElementTypes.JunctionNode_3002);
		NodeToolEntry entry = new NodeToolEntry(Messages.JunctionNode10CreationTool_title,
				Messages.JunctionNode10CreationTool_desc, types);
		entry.setId("createJunctionNode10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.storydiagrams.diagram.custom/icons/elements/activities/JunctionNode.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStopNode11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(StorydiagramsElementTypes.StopNode_2002);
		types.add(StorydiagramsElementTypes.StopNode_3004);
		NodeToolEntry entry = new NodeToolEntry(Messages.StopNode11CreationTool_title,
				Messages.StopNode11CreationTool_desc, types);
		entry.setId("createStopNode11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.storydiagrams.diagram.custom/icons/elements/activities/StopNode.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createObjectVariable1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.ObjectVariable1CreationTool_title,
				Messages.ObjectVariable1CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.ObjectVariable_3009));
		entry.setId("createObjectVariable1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.storydiagrams.diagram.custom/icons/elements/patterns/ObjectVariable.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrimitiveVariable2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.PrimitiveVariable2CreationTool_title,
				Messages.PrimitiveVariable2CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.PrimitiveVariable_3011));
		entry.setId("createPrimitiveVariable2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.storydiagrams.diagram.custom/icons/elements/patterns/PrimitiveVariable.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkVariable4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.LinkVariable4CreationTool_title,
				Messages.LinkVariable4CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.LinkVariable_4002));
		entry.setId("createLinkVariable4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.storydiagrams.diagram.custom/icons/elements/patterns/LinkVariable.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributeAssignment6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.AttributeAssignment6CreationTool_title,
				Messages.AttributeAssignment6CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.AttributeAssignment_3010));
		entry.setId("createAttributeAssignment6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.storydiagrams.diagram.custom/icons/elements/patterns/AttributeAssignment.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributeConstraint1CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.AttributeConstraint1CreationTool_title,
				Messages.AttributeConstraint1CreationTool_desc, null, null) {
		};
		entry.setId("createAttributeConstraint1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.storydiagrams.diagram.custom/icons/palette/constraints.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description, List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description, List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
