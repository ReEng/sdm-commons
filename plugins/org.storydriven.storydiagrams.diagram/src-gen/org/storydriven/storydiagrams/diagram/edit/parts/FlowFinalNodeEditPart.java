package org.storydriven.storydiagrams.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
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
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.storydriven.storydiagrams.diagram.edit.policies.FlowFinalNodeItemSemanticEditPolicy;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class FlowFinalNodeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2016;

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
	public FlowFinalNodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new FlowFinalNodeItemSemanticEditPolicy());
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
		return primaryShape = new FlowFinalNodeFigureDescriptor();
	}

	/**
	 * @generated
	 */
	public FlowFinalNodeFigureDescriptor getPrimaryShape() {
		return (FlowFinalNodeFigureDescriptor) primaryShape;
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
		if (targetEditPart instanceof ModifyingStoryNodeEditPart) {
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
		if (targetEditPart instanceof org.storydriven.storydiagrams.diagram.edit.parts.FlowFinalNodeEditPart) {
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
	public class FlowFinalNodeFigureDescriptor extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFlowFinalNodeLabel;

		/**
		 * @generated
		 */
		public FlowFinalNodeFigureDescriptor() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = false;
			this.setLayoutManager(layoutThis);

			this.setOutline(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			Ellipse flowFinalNodeEllipse0 = new Ellipse();
			flowFinalNodeEllipse0.setForegroundColor(ColorConstants.black);
			flowFinalNodeEllipse0.setPreferredSize(new Dimension(getMapMode().DPtoLP(23), getMapMode().DPtoLP(23)));
			flowFinalNodeEllipse0.setMaximumSize(new Dimension(getMapMode().DPtoLP(23), getMapMode().DPtoLP(23)));
			flowFinalNodeEllipse0.setMinimumSize(new Dimension(getMapMode().DPtoLP(23), getMapMode().DPtoLP(23)));

			GridData constraintFlowFinalNodeEllipse0 = new GridData();
			constraintFlowFinalNodeEllipse0.verticalAlignment = GridData.CENTER;
			constraintFlowFinalNodeEllipse0.horizontalAlignment = GridData.CENTER;
			constraintFlowFinalNodeEllipse0.horizontalIndent = 0;
			constraintFlowFinalNodeEllipse0.horizontalSpan = 1;
			constraintFlowFinalNodeEllipse0.verticalSpan = 1;
			constraintFlowFinalNodeEllipse0.grabExcessHorizontalSpace = false;
			constraintFlowFinalNodeEllipse0.grabExcessVerticalSpace = false;
			this.add(flowFinalNodeEllipse0, constraintFlowFinalNodeEllipse0);

			fFlowFinalNodeLabel = new WrappingLabel();
			fFlowFinalNodeLabel.setText("");

			GridData constraintFFlowFinalNodeLabel = new GridData();
			constraintFFlowFinalNodeLabel.verticalAlignment = GridData.CENTER;
			constraintFFlowFinalNodeLabel.horizontalAlignment = GridData.CENTER;
			constraintFFlowFinalNodeLabel.horizontalIndent = 0;
			constraintFFlowFinalNodeLabel.horizontalSpan = 1;
			constraintFFlowFinalNodeLabel.verticalSpan = 1;
			constraintFFlowFinalNodeLabel.grabExcessHorizontalSpace = true;
			constraintFFlowFinalNodeLabel.grabExcessVerticalSpace = false;
			this.add(fFlowFinalNodeLabel, constraintFFlowFinalNodeLabel);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFlowFinalNodeLabel() {
			return fFlowFinalNodeLabel;
		}

	}

}
