package org.storydriven.modeling.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.storydriven.modeling.diagram.providers.SDMElementTypes;

/**
 * @generated
 */
public class SDMPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createModeling1Group());
	}

	/**
	 * Creates "modeling" palette tool group
	 * @generated
	 */
	private PaletteContainer createModeling1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Modeling1Group_title);
		paletteContainer.setId("createModeling1Group"); //$NON-NLS-1$
		paletteContainer.add(createStartNode1CreationTool());
		paletteContainer.add(createJunctionNode2CreationTool());
		paletteContainer.add(createStopNode3CreationTool());
		paletteContainer.add(createActivityEdge4CreationTool());
		paletteContainer.add(createStructuredNode5CreationTool());
		paletteContainer.add(createStatementNode6CreationTool());
		paletteContainer.add(createMatchingStoryNode7CreationTool());
		paletteContainer.add(createModifyingStoryNode8CreationTool());
		paletteContainer.add(createStoryPatternNode9CreationTool());
		paletteContainer.add(createObjectVariableNode10CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStartNode1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SDMElementTypes.StartNode_2001);
		types.add(SDMElementTypes.StartNode_3002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StartNode1CreationTool_title,
				Messages.StartNode1CreationTool_desc, types);
		entry.setId("createStartNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/full/obj16/StartNode.gif")); //$NON-NLS-1$
		entry.setLargeIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/full/obj16/StartNode.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJunctionNode2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SDMElementTypes.JunctionNode_2003);
		types.add(SDMElementTypes.JunctionNode_3001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.JunctionNode2CreationTool_title,
				Messages.JunctionNode2CreationTool_desc, types);
		entry.setId("createJunctionNode2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/full/obj16/JunctionNode.gif")); //$NON-NLS-1$
		entry.setLargeIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/full/obj16/JunctionNode.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStopNode3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SDMElementTypes.StopNode_2002);
		types.add(SDMElementTypes.StopNode_3004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StopNode3CreationTool_title,
				Messages.StopNode3CreationTool_desc, types);
		entry.setId("createStopNode3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/full/obj16/FinalStopNode.gif")); //$NON-NLS-1$
		entry.setLargeIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/full/obj16/FinalStopNode.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityEdge4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ActivityEdge4CreationTool_title,
				Messages.ActivityEdge4CreationTool_desc,
				Collections.singletonList(SDMElementTypes.ActivityEdge_4001));
		entry.setId("createActivityEdge4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/full/obj16/ActivityEdge.gif")); //$NON-NLS-1$
		entry.setLargeIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/full/obj16/ActivityEdge.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuredNode5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SDMElementTypes.StructuredNode_2005);
		types.add(SDMElementTypes.StructuredNode_3005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StructuredNode5CreationTool_title,
				Messages.StructuredNode5CreationTool_desc, types);
		entry.setId("createStructuredNode5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/full/obj16/StructuredNode.gif")); //$NON-NLS-1$
		entry.setLargeIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/full/obj16/StructuredNode.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStatementNode6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SDMElementTypes.StatementNode_2004);
		types.add(SDMElementTypes.StatementNode_3003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StatementNode6CreationTool_title,
				Messages.StatementNode6CreationTool_desc, types);
		entry.setId("createStatementNode6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/full/obj16/StatementNode.gif")); //$NON-NLS-1$
		entry.setLargeIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/full/obj16/StatementNode.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMatchingStoryNode7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MatchingStoryNode7CreationTool_title,
				Messages.MatchingStoryNode7CreationTool_desc,
				Collections
						.singletonList(SDMElementTypes.MatchingStoryNode_2006));
		entry.setId("createMatchingStoryNode7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/full/obj16/StatementNode.gif")); //$NON-NLS-1$
		entry.setLargeIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/full/obj16/StatementNode.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createModifyingStoryNode8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ModifyingStoryNode8CreationTool_title,
				Messages.ModifyingStoryNode8CreationTool_desc,
				Collections
						.singletonList(SDMElementTypes.ModifyingStoryNode_2007));
		entry.setId("createModifyingStoryNode8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/full/obj16/StatementNode.gif")); //$NON-NLS-1$
		entry.setLargeIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/full/obj16/StatementNode.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStoryPatternNode9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StoryPatternNode9CreationTool_title,
				Messages.StoryPatternNode9CreationTool_desc,
				Collections.singletonList(SDMElementTypes.MatchingPattern_3006));
		entry.setId("createStoryPatternNode9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/full/obj16/StatementNode.gif")); //$NON-NLS-1$
		entry.setLargeIcon(SDMDiagramEditorPlugin
				.findImageDescriptor("/org.storydriven.modeling.diagram.custom/icons/full/obj16/StatementNode.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createObjectVariableNode10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ObjectVariableNode10CreationTool_title,
				Messages.ObjectVariableNode10CreationTool_desc,
				Collections.singletonList(SDMElementTypes.ObjectVariable_3007));
		entry.setId("createObjectVariableNode10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SDMElementTypes
				.getImageDescriptor(SDMElementTypes.ObjectVariable_3007));
		entry.setLargeIcon(entry.getSmallIcon());
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
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
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
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
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
