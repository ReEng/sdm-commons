package org.storydriven.storydiagrams.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.storydriven.storydiagrams.diagram.edit.policies.ModifyingStoryNodeItemSemanticEditPolicy;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class ModifyingStoryNodeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2011;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ModifyingStoryNodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ModifyingStoryNodeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new StoryNodeFigureDescriptor();
	}

	/**
	 * @generated
	 */
	public StoryNodeFigureDescriptor getPrimaryShape() {
		return (StoryNodeFigureDescriptor) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ModifyingStoryNodeNameEditPart) {
			((ModifyingStoryNodeNameEditPart) childEditPart).setLabel(getPrimaryShape().getStoryNodeNameLabel());
			return true;
		}
		if (childEditPart instanceof ModifyingStoryNodeStoryNodePatternCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getStoryNodePatternRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ModifyingStoryNodeStoryNodePatternCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ModifyingStoryNodeNameEditPart) {
			return true;
		}
		if (childEditPart instanceof ModifyingStoryNodeStoryNodePatternCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getStoryNodePatternRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((ModifyingStoryNodeStoryNodePatternCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof ModifyingStoryNodeStoryNodePatternCompartmentEditPart) {
			return getPrimaryShape().getStoryNodePatternRectangle();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(StorydiagramsVisualIDRegistry.getType(ModifyingStoryNodeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(StorydiagramsElementTypes.ActivityEdge_4005);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ActivityCallNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof StatementNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof MatchingStoryNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof InitialNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof JunctionNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof ActivityFinalNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof FlowFinalNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == StorydiagramsElementTypes.ActivityEdge_4005) {
			types.add(StorydiagramsElementTypes.ActivityCallNode_2009);
			types.add(StorydiagramsElementTypes.StatementNode_2010);
			types.add(StorydiagramsElementTypes.ModifyingStoryNode_2011);
			types.add(StorydiagramsElementTypes.MatchingStoryNode_2012);
			types.add(StorydiagramsElementTypes.InitialNode_2013);
			types.add(StorydiagramsElementTypes.JunctionNode_2014);
			types.add(StorydiagramsElementTypes.ActivityFinalNode_2015);
			types.add(StorydiagramsElementTypes.FlowFinalNode_2016);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(StorydiagramsElementTypes.ActivityEdge_4005);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == StorydiagramsElementTypes.ActivityEdge_4005) {
			types.add(StorydiagramsElementTypes.ActivityCallNode_2009);
			types.add(StorydiagramsElementTypes.StatementNode_2010);
			types.add(StorydiagramsElementTypes.ModifyingStoryNode_2011);
			types.add(StorydiagramsElementTypes.MatchingStoryNode_2012);
			types.add(StorydiagramsElementTypes.InitialNode_2013);
			types.add(StorydiagramsElementTypes.JunctionNode_2014);
			types.add(StorydiagramsElementTypes.ActivityFinalNode_2015);
			types.add(StorydiagramsElementTypes.FlowFinalNode_2016);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class StoryNodeFigureDescriptor extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fStoryNodeNameLabel;
		/**
		 * @generated
		 */
		private RoundedRectangle fStoryNodePatternRectangle;

		/**
		 * @generated
		 */
		public StoryNodeFigureDescriptor() {
			this.setLayoutManager(new StackLayout());
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(16), getMapMode().DPtoLP(16)));
			this.setFill(false);
			this.setOutline(false);
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(100), getMapMode().DPtoLP(50)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure storyNodeShadeContainerRectangle0 = new RectangleFigure();
			storyNodeShadeContainerRectangle0.setFill(false);
			storyNodeShadeContainerRectangle0.setOutline(false);

			storyNodeShadeContainerRectangle0.setBorder(new MarginBorder(getMapMode().DPtoLP(10), getMapMode().DPtoLP(
					10), getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));

			this.add(storyNodeShadeContainerRectangle0);
			storyNodeShadeContainerRectangle0.setLayoutManager(new StackLayout());

			RoundedRectangle storyNodeShadeRectangle1 = new RoundedRectangle();
			storyNodeShadeRectangle1
					.setCornerDimensions(new Dimension(getMapMode().DPtoLP(16), getMapMode().DPtoLP(16)));
			storyNodeShadeRectangle1.setForegroundColor(ColorConstants.black);
			storyNodeShadeRectangle1.setBackgroundColor(STORYNODESHADERECTANGLE1_BACK);

			storyNodeShadeContainerRectangle0.add(storyNodeShadeRectangle1);

			RectangleFigure storyNodeContentContainerRectangle0 = new RectangleFigure();
			storyNodeContentContainerRectangle0.setFill(false);
			storyNodeContentContainerRectangle0.setOutline(false);

			storyNodeContentContainerRectangle0.setBorder(new MarginBorder(getMapMode().DPtoLP(0), getMapMode().DPtoLP(
					0), getMapMode().DPtoLP(10), getMapMode().DPtoLP(10)));

			this.add(storyNodeContentContainerRectangle0);
			storyNodeContentContainerRectangle0.setLayoutManager(new StackLayout());

			RoundedRectangle storyNodeContentRectangle1 = new RoundedRectangle();
			storyNodeContentRectangle1.setCornerDimensions(new Dimension(getMapMode().DPtoLP(16), getMapMode().DPtoLP(
					16)));
			storyNodeContentRectangle1.setForegroundColor(ColorConstants.black);
			storyNodeContentRectangle1.setBackgroundColor(STORYNODECONTENTRECTANGLE1_BACK);

			storyNodeContentContainerRectangle0.add(storyNodeContentRectangle1);

			BorderLayout layoutStoryNodeContentRectangle1 = new BorderLayout();
			storyNodeContentRectangle1.setLayoutManager(layoutStoryNodeContentRectangle1);

			RoundedRectangle storyNodeNameRectangle2 = new RoundedRectangle();
			storyNodeNameRectangle2
					.setCornerDimensions(new Dimension(getMapMode().DPtoLP(16), getMapMode().DPtoLP(16)));
			storyNodeNameRectangle2.setFill(false);
			storyNodeNameRectangle2.setOutline(false);
			storyNodeNameRectangle2.setPreferredSize(new Dimension(getMapMode().DPtoLP(100), getMapMode().DPtoLP(30)));

			storyNodeContentRectangle1.add(storyNodeNameRectangle2, BorderLayout.TOP);

			GridLayout layoutStoryNodeNameRectangle2 = new GridLayout();
			layoutStoryNodeNameRectangle2.numColumns = 1;
			layoutStoryNodeNameRectangle2.makeColumnsEqualWidth = true;
			storyNodeNameRectangle2.setLayoutManager(layoutStoryNodeNameRectangle2);

			fStoryNodeNameLabel = new WrappingLabel();
			fStoryNodeNameLabel.setText("");

			fStoryNodeNameLabel.setFont(FSTORYNODENAMELABEL_FONT);

			GridData constraintFStoryNodeNameLabel = new GridData();
			constraintFStoryNodeNameLabel.verticalAlignment = GridData.CENTER;
			constraintFStoryNodeNameLabel.horizontalAlignment = GridData.CENTER;
			constraintFStoryNodeNameLabel.horizontalIndent = 0;
			constraintFStoryNodeNameLabel.horizontalSpan = 1;
			constraintFStoryNodeNameLabel.verticalSpan = 1;
			constraintFStoryNodeNameLabel.grabExcessHorizontalSpace = true;
			constraintFStoryNodeNameLabel.grabExcessVerticalSpace = false;
			storyNodeNameRectangle2.add(fStoryNodeNameLabel, constraintFStoryNodeNameLabel);

			RoundedRectangle storyNodePatternContainerRectangle2 = new RoundedRectangle();
			storyNodePatternContainerRectangle2.setCornerDimensions(new Dimension(getMapMode().DPtoLP(16), getMapMode()
					.DPtoLP(16)));
			storyNodePatternContainerRectangle2.setFill(false);
			storyNodePatternContainerRectangle2.setOutline(false);

			storyNodeContentRectangle1.add(storyNodePatternContainerRectangle2, BorderLayout.CENTER);

			BorderLayout layoutStoryNodePatternContainerRectangle2 = new BorderLayout();
			storyNodePatternContainerRectangle2.setLayoutManager(layoutStoryNodePatternContainerRectangle2);

			fStoryNodePatternRectangle = new RoundedRectangle();
			fStoryNodePatternRectangle.setCornerDimensions(new Dimension(getMapMode().DPtoLP(16), getMapMode().DPtoLP(
					16)));
			fStoryNodePatternRectangle.setFill(false);
			fStoryNodePatternRectangle.setOutline(false);

			storyNodePatternContainerRectangle2.add(fStoryNodePatternRectangle, BorderLayout.CENTER);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getStoryNodeNameLabel() {
			return fStoryNodeNameLabel;
		}

		/**
		 * @generated
		 */
		public RoundedRectangle getStoryNodePatternRectangle() {
			return fStoryNodePatternRectangle;
		}

	}

	/**
	 * @generated
	 */
	static final Color STORYNODESHADERECTANGLE1_BACK = new Color(null, 252, 254, 204);

	/**
	 * @generated
	 */
	static final Color STORYNODECONTENTRECTANGLE1_BACK = new Color(null, 252, 254, 204);

	/**
	 * @generated
	 */
	static final Font FSTORYNODENAMELABEL_FONT = new Font(Display.getCurrent(), Display.getDefault().getSystemFont()
			.getFontData()[0].getName(), 10, SWT.BOLD);

}
