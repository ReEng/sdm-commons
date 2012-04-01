package org.storydriven.modeling.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
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
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.storydriven.modeling.diagram.edit.policies.JunctionNode2ItemSemanticEditPolicy;
import org.storydriven.modeling.diagram.providers.SDMElementTypes;

/**
 * @generated
 */
public class JunctionNode2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3001;

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
	public JunctionNode2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new JunctionNode2ItemSemanticEditPolicy());
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
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
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
		return primaryShape = new JunctionNodeFigure();
	}

	/**
	 * @generated
	 */
	public JunctionNodeFigure getPrimaryShape() {
		return (JunctionNodeFigure) primaryShape;
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
		types.add(SDMElementTypes.ActivityEdge_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof StartNodeEditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StopNodeEditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof JunctionNodeEditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StatementNodeEditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StructuredNodeEditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof ModifyingStoryNodeEditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof ActivityCallNodeEditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof org.storydriven.modeling.diagram.edit.parts.JunctionNode2EditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StartNode2EditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StopNode2EditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StatementNode2EditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StructuredNode2EditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof ModifyingStoryNode2EditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == SDMElementTypes.ActivityEdge_4001) {
			types.add(SDMElementTypes.StartNode_2001);
			types.add(SDMElementTypes.StopNode_2002);
			types.add(SDMElementTypes.JunctionNode_2003);
			types.add(SDMElementTypes.StatementNode_2004);
			types.add(SDMElementTypes.StructuredNode_2005);
			types.add(SDMElementTypes.ModifyingStoryNode_2007);
			types.add(SDMElementTypes.ActivityCallNode_2008);
			types.add(SDMElementTypes.JunctionNode_3001);
			types.add(SDMElementTypes.StartNode_3002);
			types.add(SDMElementTypes.StopNode_3004);
			types.add(SDMElementTypes.StatementNode_3003);
			types.add(SDMElementTypes.StructuredNode_3005);
			types.add(SDMElementTypes.ModifyingStoryNode_3011);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(SDMElementTypes.ActivityEdge_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == SDMElementTypes.ActivityEdge_4001) {
			types.add(SDMElementTypes.StartNode_2001);
			types.add(SDMElementTypes.StopNode_2002);
			types.add(SDMElementTypes.JunctionNode_2003);
			types.add(SDMElementTypes.StatementNode_2004);
			types.add(SDMElementTypes.StructuredNode_2005);
			types.add(SDMElementTypes.ModifyingStoryNode_2007);
			types.add(SDMElementTypes.ActivityCallNode_2008);
			types.add(SDMElementTypes.JunctionNode_3001);
			types.add(SDMElementTypes.StartNode_3002);
			types.add(SDMElementTypes.StopNode_3004);
			types.add(SDMElementTypes.StatementNode_3003);
			types.add(SDMElementTypes.StructuredNode_3005);
			types.add(SDMElementTypes.ModifyingStoryNode_3011);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class JunctionNodeFigure extends ScalablePolygonShape {

		/**
		 * @generated
		 */
		public JunctionNodeFigure() {
			this.addPoint(new Point(getMapMode().DPtoLP(20), getMapMode()
					.DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(40), getMapMode()
					.DPtoLP(20)));
			this.addPoint(new Point(getMapMode().DPtoLP(20), getMapMode()
					.DPtoLP(40)));
			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(20)));
			this.setFill(true);
			this.setForegroundColor(ColorConstants.black);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(40),
					getMapMode().DPtoLP(40)));
			this.setMaximumSize(new Dimension(getMapMode().DPtoLP(40),
					getMapMode().DPtoLP(40)));
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(40),
					getMapMode().DPtoLP(40)));
		}

	}

}
