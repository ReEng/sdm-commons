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
		paletteContainer.add(createActivityFinalNode11CreationTool());
		paletteContainer.add(createFlowFinalNode12CreationTool());
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
		paletteContainer.add(createCollectionVariable2CreationTool());
		paletteContainer.add(createPrimitiveVariable3CreationTool());
		paletteContainer.add(createContainerVariable4CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createLinkVariable6CreationTool());
		paletteContainer.add(createPath7CreationTool());
		paletteContainer.add(createContainmentRelation8CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createConstraint10CreationTool());
		paletteContainer.add(createAttributeAssignment11CreationTool());
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
		entry.setSmallIcon(StorydiagramsElementTypes
				.getImageDescriptor(StorydiagramsElementTypes.ActivityCallNode_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createModifyingStoryNode2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(StorydiagramsElementTypes.ModifyingStoryNode_2007);
		types.add(StorydiagramsElementTypes.ModifyingStoryNode_3007);
		NodeToolEntry entry = new NodeToolEntry(Messages.ModifyingStoryNode2CreationTool_title,
				Messages.ModifyingStoryNode2CreationTool_desc, types);
		entry.setId("createModifyingStoryNode2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes
				.getImageDescriptor(StorydiagramsElementTypes.ModifyingStoryNode_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMatchingStoryNode3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.MatchingStoryNode3CreationTool_title,
				Messages.MatchingStoryNode3CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.MatchingStoryNode_2008));
		entry.setId("createMatchingStoryNode3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes
				.getImageDescriptor(StorydiagramsElementTypes.MatchingStoryNode_2008));
		entry.setLargeIcon(entry.getSmallIcon());
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
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.StatementNode_2004));
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
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.StructuredNode_2005));
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
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.ActivityEdge_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStartNode9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(StorydiagramsElementTypes.StartNode_3003);
		types.add(StorydiagramsElementTypes.StartNode_2001);
		NodeToolEntry entry = new NodeToolEntry(Messages.StartNode9CreationTool_title,
				Messages.StartNode9CreationTool_desc, types);
		entry.setId("createStartNode9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.StartNode_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJunctionNode10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(StorydiagramsElementTypes.JunctionNode_3002);
		types.add(StorydiagramsElementTypes.JunctionNode_2003);
		NodeToolEntry entry = new NodeToolEntry(Messages.JunctionNode10CreationTool_title,
				Messages.JunctionNode10CreationTool_desc, types);
		entry.setId("createJunctionNode10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.JunctionNode_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityFinalNode11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(StorydiagramsElementTypes.StopNode_3004);
		types.add(StorydiagramsElementTypes.StopNode_2002);
		NodeToolEntry entry = new NodeToolEntry(Messages.ActivityFinalNode11CreationTool_title,
				Messages.ActivityFinalNode11CreationTool_desc, types);
		entry.setId("createActivityFinalNode11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.StopNode_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFlowFinalNode12CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.FlowFinalNode12CreationTool_title,
				Messages.FlowFinalNode12CreationTool_desc, null, null) {
		};
		entry.setId("createFlowFinalNode12CreationTool"); //$NON-NLS-1$
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
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.ObjectVariable_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCollectionVariable2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.CollectionVariable2CreationTool_title,
				Messages.CollectionVariable2CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.ObjectSetVariable_3014));
		entry.setId("createCollectionVariable2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes
				.getImageDescriptor(StorydiagramsElementTypes.ObjectSetVariable_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrimitiveVariable3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.PrimitiveVariable3CreationTool_title,
				Messages.PrimitiveVariable3CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.PrimitiveVariable_3011));
		entry.setId("createPrimitiveVariable3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes
				.getImageDescriptor(StorydiagramsElementTypes.PrimitiveVariable_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContainerVariable4CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.ContainerVariable4CreationTool_title,
				Messages.ContainerVariable4CreationTool_desc, null, null) {
		};
		entry.setId("createContainerVariable4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkVariable6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.LinkVariable6CreationTool_title,
				Messages.LinkVariable6CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.LinkVariable_4002));
		entry.setId("createLinkVariable6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.LinkVariable_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPath7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.Path7CreationTool_title, Messages.Path7CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.Path_4003));
		entry.setId("createPath7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.Path_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContainmentRelation8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.ContainmentRelation8CreationTool_title,
				Messages.ContainmentRelation8CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.ContainmentRelation_4004));
		entry.setId("createContainmentRelation8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes
				.getImageDescriptor(StorydiagramsElementTypes.ContainmentRelation_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConstraint10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Constraint10CreationTool_title,
				Messages.Constraint10CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.Constraint_3013));
		entry.setId("createConstraint10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.Constraint_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributeAssignment11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.AttributeAssignment11CreationTool_title,
				Messages.AttributeAssignment11CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.AttributeAssignment_3010));
		entry.setId("createAttributeAssignment11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes
				.getImageDescriptor(StorydiagramsElementTypes.AttributeAssignment_3010));
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
