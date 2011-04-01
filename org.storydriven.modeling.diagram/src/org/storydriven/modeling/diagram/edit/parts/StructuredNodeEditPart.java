package org.storydriven.modeling.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.Graphics;
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
import org.storydriven.modeling.diagram.edit.policies.StructuredNodeItemSemanticEditPolicy;
import org.storydriven.modeling.diagram.part.SDMVisualIDRegistry;
import org.storydriven.modeling.diagram.providers.SDMElementTypes;

/**
 * @generated
 */
public class StructuredNodeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2005;

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
	public StructuredNodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new StructuredNodeItemSemanticEditPolicy());
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
		return primaryShape = new StructuredNodeFigure();
	}

	/**
	 * @generated
	 */
	public StructuredNodeFigure getPrimaryShape() {
		return (StructuredNodeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof StructuredNodeNameEditPart) {
			((StructuredNodeNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureStructuredNodeNameFigure());
			return true;
		}
		if (childEditPart instanceof StructuredNodeStructuredNodeCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureStructuredNodeCompartmentRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((StructuredNodeStructuredNodeCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof StructuredNodeNameEditPart) {
			return true;
		}
		if (childEditPart instanceof StructuredNodeStructuredNodeCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureStructuredNodeCompartmentRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((StructuredNodeStructuredNodeCompartmentEditPart) childEditPart)
					.getFigure());
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
		if (editPart instanceof StructuredNodeStructuredNodeCompartmentEditPart) {
			return getPrimaryShape()
					.getFigureStructuredNodeCompartmentRectangle();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(110, 150);
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
		return getChildBySemanticHint(SDMVisualIDRegistry
				.getType(StructuredNodeNameEditPart.VISUAL_ID));
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
		if (targetEditPart instanceof org.storydriven.modeling.diagram.edit.parts.StructuredNodeEditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof MatchingStoryNodeEditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof ModifyingStoryNodeEditPart) {
			types.add(SDMElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof JunctionNode2EditPart) {
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
		if (targetEditPart instanceof MatchingStoryNode2EditPart) {
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
			types.add(SDMElementTypes.MatchingStoryNode_2006);
			types.add(SDMElementTypes.ModifyingStoryNode_2007);
			types.add(SDMElementTypes.JunctionNode_3001);
			types.add(SDMElementTypes.StartNode_3002);
			types.add(SDMElementTypes.StopNode_3004);
			types.add(SDMElementTypes.StatementNode_3003);
			types.add(SDMElementTypes.StructuredNode_3005);
			types.add(SDMElementTypes.MatchingStoryNode_3010);
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
			types.add(SDMElementTypes.MatchingStoryNode_2006);
			types.add(SDMElementTypes.ModifyingStoryNode_2007);
			types.add(SDMElementTypes.JunctionNode_3001);
			types.add(SDMElementTypes.StartNode_3002);
			types.add(SDMElementTypes.StopNode_3004);
			types.add(SDMElementTypes.StatementNode_3003);
			types.add(SDMElementTypes.StructuredNode_3005);
			types.add(SDMElementTypes.MatchingStoryNode_3010);
			types.add(SDMElementTypes.ModifyingStoryNode_3011);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class StructuredNodeFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureStructuredNodeNameFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureStructuredNodeCompartmentRectangle;

		/**
		 * @generated
		 */
		public StructuredNodeFigure() {
			this.setLineWidth(3);
			this.setLineStyle(Graphics.LINE_DASH);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(110),
					getMapMode().DPtoLP(150)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure structuredNodeNameRectangle0 = new RectangleFigure();
			structuredNodeNameRectangle0.setFill(false);
			structuredNodeNameRectangle0.setLineWidth(0);
			structuredNodeNameRectangle0.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(100), getMapMode().DPtoLP(30)));

			this.add(structuredNodeNameRectangle0);

			GridLayout layoutStructuredNodeNameRectangle0 = new GridLayout();
			layoutStructuredNodeNameRectangle0.numColumns = 1;
			layoutStructuredNodeNameRectangle0.makeColumnsEqualWidth = true;
			structuredNodeNameRectangle0
					.setLayoutManager(layoutStructuredNodeNameRectangle0);

			fFigureStructuredNodeNameFigure = new WrappingLabel();
			fFigureStructuredNodeNameFigure.setText("");

			fFigureStructuredNodeNameFigure
					.setFont(FFIGURESTRUCTUREDNODENAMEFIGURE_FONT);

			GridData constraintFFigureStructuredNodeNameFigure = new GridData();
			constraintFFigureStructuredNodeNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureStructuredNodeNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureStructuredNodeNameFigure.horizontalIndent = 0;
			constraintFFigureStructuredNodeNameFigure.horizontalSpan = 1;
			constraintFFigureStructuredNodeNameFigure.verticalSpan = 1;
			constraintFFigureStructuredNodeNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureStructuredNodeNameFigure.grabExcessVerticalSpace = false;
			structuredNodeNameRectangle0.add(fFigureStructuredNodeNameFigure,
					constraintFFigureStructuredNodeNameFigure);

			fFigureStructuredNodeCompartmentRectangle = new RectangleFigure();
			fFigureStructuredNodeCompartmentRectangle.setFill(false);
			fFigureStructuredNodeCompartmentRectangle.setLineWidth(0);

			this.add(fFigureStructuredNodeCompartmentRectangle);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStructuredNodeNameFigure() {
			return fFigureStructuredNodeNameFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureStructuredNodeCompartmentRectangle() {
			return fFigureStructuredNodeCompartmentRectangle;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGURESTRUCTUREDNODENAMEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.NORMAL);

}
