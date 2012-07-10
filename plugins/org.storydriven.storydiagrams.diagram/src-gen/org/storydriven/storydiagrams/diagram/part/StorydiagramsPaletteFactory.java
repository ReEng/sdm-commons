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
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createActivityEdge6CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createInitialNode8CreationTool());
		paletteContainer.add(createJunctionNode9CreationTool());
		paletteContainer.add(createActivityFinalNode10CreationTool());
		paletteContainer.add(createFlowFinalNode11CreationTool());
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
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createLinkVariable4CreationTool());
		paletteContainer.add(createInclusionLink5CreationTool());
		paletteContainer.add(createMaybeLink6CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createConstraint8CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createAttributeAssignment10CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityCallNode1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.ActivityCallNode1CreationTool_title,
				Messages.ActivityCallNode1CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.ActivityCallNode_2009));
		entry.setId("createActivityCallNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes
				.getImageDescriptor(StorydiagramsElementTypes.ActivityCallNode_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createModifyingStoryNode2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.ModifyingStoryNode2CreationTool_title,
				Messages.ModifyingStoryNode2CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.ModifyingStoryNode_2011));
		entry.setId("createModifyingStoryNode2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes
				.getImageDescriptor(StorydiagramsElementTypes.ModifyingStoryNode_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMatchingStoryNode3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.MatchingStoryNode3CreationTool_title,
				Messages.MatchingStoryNode3CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.MatchingStoryNode_2012));
		entry.setId("createMatchingStoryNode3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes
				.getImageDescriptor(StorydiagramsElementTypes.MatchingStoryNode_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStatementNode4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.StatementNode4CreationTool_title,
				Messages.StatementNode4CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.StatementNode_2010));
		entry.setId("createStatementNode4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.StatementNode_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityEdge6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.ActivityEdge6CreationTool_title,
				Messages.ActivityEdge6CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.ActivityEdge_4005));
		entry.setId("createActivityEdge6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.ActivityEdge_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInitialNode8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.InitialNode8CreationTool_title,
				Messages.InitialNode8CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.InitialNode_2013));
		entry.setId("createInitialNode8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.InitialNode_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJunctionNode9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.JunctionNode9CreationTool_title,
				Messages.JunctionNode9CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.JunctionNode_2014));
		entry.setId("createJunctionNode9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.JunctionNode_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityFinalNode10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.ActivityFinalNode10CreationTool_title,
				Messages.ActivityFinalNode10CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.ActivityFinalNode_2015));
		entry.setId("createActivityFinalNode10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes
				.getImageDescriptor(StorydiagramsElementTypes.ActivityFinalNode_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFlowFinalNode11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.FlowFinalNode11CreationTool_title,
				Messages.FlowFinalNode11CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.FlowFinalNode_2016));
		entry.setId("createFlowFinalNode11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.FlowFinalNode_2016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createObjectVariable1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.ObjectVariable1CreationTool_title,
				Messages.ObjectVariable1CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.ObjectVariable_3020));
		entry.setId("createObjectVariable1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.ObjectVariable_3020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCollectionVariable2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.CollectionVariable2CreationTool_title,
				Messages.CollectionVariable2CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.CollectionVariable_3023));
		entry.setId("createCollectionVariable2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes
				.getImageDescriptor(StorydiagramsElementTypes.CollectionVariable_3023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkVariable4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.LinkVariable4CreationTool_title,
				Messages.LinkVariable4CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.LinkVariable_4006));
		entry.setId("createLinkVariable4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.LinkVariable_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInclusionLink5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.InclusionLink5CreationTool_title,
				Messages.InclusionLink5CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.InclusionLink_4007));
		entry.setId("createInclusionLink5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.InclusionLink_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMaybeLink6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.MaybeLink6CreationTool_title,
				Messages.MaybeLink6CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.MaybeLink_4008));
		entry.setId("createMaybeLink6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.MaybeLink_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConstraint8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(StorydiagramsElementTypes.Constraint_3022);
		types.add(StorydiagramsElementTypes.Constraint_3024);
		NodeToolEntry entry = new NodeToolEntry(Messages.Constraint8CreationTool_title,
				Messages.Constraint8CreationTool_desc, types);
		entry.setId("createConstraint8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.Constraint_3022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributeAssignment10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.AttributeAssignment10CreationTool_title,
				Messages.AttributeAssignment10CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.AttributeAssignment_3021));
		entry.setId("createAttributeAssignment10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes
				.getImageDescriptor(StorydiagramsElementTypes.AttributeAssignment_3021));
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
