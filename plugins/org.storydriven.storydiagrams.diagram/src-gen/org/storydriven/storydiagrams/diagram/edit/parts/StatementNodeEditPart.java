package org.storydriven.storydiagrams.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
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
import org.storydriven.storydiagrams.diagram.edit.policies.StatementNodeItemSemanticEditPolicy;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class StatementNodeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2004;

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
	public StatementNodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new StatementNodeItemSemanticEditPolicy());
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
		return primaryShape = new StatementNodeFigure();
	}

	/**
	 * @generated
	 */
	public StatementNodeFigure getPrimaryShape() {
		return (StatementNodeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof StatementNodeNameEditPart) {
			((StatementNodeNameEditPart) childEditPart).setLabel(getPrimaryShape().getStatementNodeNameLabel());
			return true;
		}
		if (childEditPart instanceof StatementNodeExpressionLabelEditPart) {
			((StatementNodeExpressionLabelEditPart) childEditPart).setLabel(getPrimaryShape()
					.getStatementNodeExpressionLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof StatementNodeNameEditPart) {
			return true;
		}
		if (childEditPart instanceof StatementNodeExpressionLabelEditPart) {
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
		return getChildBySemanticHint(StorydiagramsVisualIDRegistry.getType(StatementNodeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ActivityCallNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof ModifyingStoryNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof MatchingStoryNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StructuredNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StartNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof JunctionNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StopNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof ActivityCallNode2EditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof ModifyingStoryNode2EditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof MatchingStoryNode2EditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StatementNode2EditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StructuredNode2EditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StartNode2EditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof JunctionNode2EditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StopNode2EditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == StorydiagramsElementTypes.ActivityEdge_4001) {
			types.add(StorydiagramsElementTypes.ActivityCallNode_2006);
			types.add(StorydiagramsElementTypes.StatementNode_2004);
			types.add(StorydiagramsElementTypes.ModifyingStoryNode_2007);
			types.add(StorydiagramsElementTypes.MatchingStoryNode_2008);
			types.add(StorydiagramsElementTypes.StructuredNode_2005);
			types.add(StorydiagramsElementTypes.StartNode_2001);
			types.add(StorydiagramsElementTypes.JunctionNode_2003);
			types.add(StorydiagramsElementTypes.StopNode_2002);
			types.add(StorydiagramsElementTypes.ActivityCallNode_3016);
			types.add(StorydiagramsElementTypes.ModifyingStoryNode_3007);
			types.add(StorydiagramsElementTypes.MatchingStoryNode_3017);
			types.add(StorydiagramsElementTypes.StatementNode_3005);
			types.add(StorydiagramsElementTypes.StructuredNode_3006);
			types.add(StorydiagramsElementTypes.StartNode_3003);
			types.add(StorydiagramsElementTypes.JunctionNode_3002);
			types.add(StorydiagramsElementTypes.StopNode_3004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == StorydiagramsElementTypes.ActivityEdge_4001) {
			types.add(StorydiagramsElementTypes.ActivityCallNode_2006);
			types.add(StorydiagramsElementTypes.StatementNode_2004);
			types.add(StorydiagramsElementTypes.ModifyingStoryNode_2007);
			types.add(StorydiagramsElementTypes.MatchingStoryNode_2008);
			types.add(StorydiagramsElementTypes.StructuredNode_2005);
			types.add(StorydiagramsElementTypes.StartNode_2001);
			types.add(StorydiagramsElementTypes.JunctionNode_2003);
			types.add(StorydiagramsElementTypes.StopNode_2002);
			types.add(StorydiagramsElementTypes.ActivityCallNode_3016);
			types.add(StorydiagramsElementTypes.ModifyingStoryNode_3007);
			types.add(StorydiagramsElementTypes.MatchingStoryNode_3017);
			types.add(StorydiagramsElementTypes.StatementNode_3005);
			types.add(StorydiagramsElementTypes.StructuredNode_3006);
			types.add(StorydiagramsElementTypes.StartNode_3003);
			types.add(StorydiagramsElementTypes.JunctionNode_3002);
			types.add(StorydiagramsElementTypes.StopNode_3004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class StatementNodeFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fStatementNodeNameLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fStatementNodeExpressionLabel;

		/**
		 * @generated
		 */
		public StatementNodeFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			this.setForegroundColor(ColorConstants.black);
			this.setBackgroundColor(THIS_BACK);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fStatementNodeNameLabel = new WrappingLabel();
			fStatementNodeNameLabel.setText("");

			fStatementNodeNameLabel.setFont(FSTATEMENTNODENAMELABEL_FONT);

			GridData constraintFStatementNodeNameLabel = new GridData();
			constraintFStatementNodeNameLabel.verticalAlignment = GridData.CENTER;
			constraintFStatementNodeNameLabel.horizontalAlignment = GridData.CENTER;
			constraintFStatementNodeNameLabel.horizontalIndent = 0;
			constraintFStatementNodeNameLabel.horizontalSpan = 1;
			constraintFStatementNodeNameLabel.verticalSpan = 1;
			constraintFStatementNodeNameLabel.grabExcessHorizontalSpace = true;
			constraintFStatementNodeNameLabel.grabExcessVerticalSpace = false;
			this.add(fStatementNodeNameLabel, constraintFStatementNodeNameLabel);

			fStatementNodeExpressionLabel = new WrappingLabel();
			fStatementNodeExpressionLabel.setText("");

			fStatementNodeExpressionLabel.setFont(FSTATEMENTNODEEXPRESSIONLABEL_FONT);

			GridData constraintFStatementNodeExpressionLabel = new GridData();
			constraintFStatementNodeExpressionLabel.verticalAlignment = GridData.CENTER;
			constraintFStatementNodeExpressionLabel.horizontalAlignment = GridData.CENTER;
			constraintFStatementNodeExpressionLabel.horizontalIndent = 0;
			constraintFStatementNodeExpressionLabel.horizontalSpan = 1;
			constraintFStatementNodeExpressionLabel.verticalSpan = 1;
			constraintFStatementNodeExpressionLabel.grabExcessHorizontalSpace = true;
			constraintFStatementNodeExpressionLabel.grabExcessVerticalSpace = false;
			this.add(fStatementNodeExpressionLabel, constraintFStatementNodeExpressionLabel);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getStatementNodeNameLabel() {
			return fStatementNodeNameLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getStatementNodeExpressionLabel() {
			return fStatementNodeExpressionLabel;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 237, 216, 206);

	/**
	 * @generated
	 */
	static final Font FSTATEMENTNODENAMELABEL_FONT = new Font(Display.getCurrent(), Display.getDefault()
			.getSystemFont().getFontData()[0].getName(), 10, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font FSTATEMENTNODEEXPRESSIONLABEL_FONT = new Font(Display.getCurrent(), Display.getDefault()
			.getSystemFont().getFontData()[0].getName(), 9, SWT.NORMAL);

}
