package org.storydriven.storydiagrams.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
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
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
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
import org.eclipse.swt.graphics.Color;
import org.storydriven.storydiagrams.diagram.edit.policies.StartNode2ItemSemanticEditPolicy;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class StartNode2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3003;

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
	public StartNode2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new StartNode2ItemSemanticEditPolicy());
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
		return primaryShape = new StartNodeFigure();
	}

	/**
	 * @generated
	 */
	public StartNodeFigure getPrimaryShape() {
		return (StartNodeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof StartNodeSignatureLabelEditPart) {
			((StartNodeSignatureLabelEditPart) childEditPart).setLabel(getPrimaryShape().getStartNodeSignatureLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof StartNodeSignatureLabelEditPart) {
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
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.NONE);
		}
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
		return getChildBySemanticHint(StorydiagramsVisualIDRegistry.getType(StartNodeSignatureLabelEditPart.VISUAL_ID));
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
		if (targetEditPart instanceof StatementNodeEditPart) {
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
		if (targetEditPart instanceof org.storydriven.storydiagrams.diagram.edit.parts.StartNode2EditPart) {
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
	public class StartNodeFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fStartNodeSignatureLabel;

		/**
		 * @generated
		 */
		public StartNodeFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = false;
			this.setLayoutManager(layoutThis);

			this.setFill(false);
			this.setOutline(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			Ellipse startNodeEllipse0 = new Ellipse();
			startNodeEllipse0.setForegroundColor(ColorConstants.black);
			startNodeEllipse0.setBackgroundColor(ColorConstants.black);
			startNodeEllipse0.setPreferredSize(new Dimension(getMapMode().DPtoLP(15), getMapMode().DPtoLP(15)));
			startNodeEllipse0.setMaximumSize(new Dimension(getMapMode().DPtoLP(15), getMapMode().DPtoLP(15)));
			startNodeEllipse0.setMinimumSize(new Dimension(getMapMode().DPtoLP(15), getMapMode().DPtoLP(15)));

			GridData constraintStartNodeEllipse0 = new GridData();
			constraintStartNodeEllipse0.verticalAlignment = GridData.CENTER;
			constraintStartNodeEllipse0.horizontalAlignment = GridData.CENTER;
			constraintStartNodeEllipse0.horizontalIndent = 0;
			constraintStartNodeEllipse0.horizontalSpan = 1;
			constraintStartNodeEllipse0.verticalSpan = 1;
			constraintStartNodeEllipse0.grabExcessHorizontalSpace = false;
			constraintStartNodeEllipse0.grabExcessVerticalSpace = false;
			this.add(startNodeEllipse0, constraintStartNodeEllipse0);

			fStartNodeSignatureLabel = new WrappingLabel();
			fStartNodeSignatureLabel.setText("");

			GridData constraintFStartNodeSignatureLabel = new GridData();
			constraintFStartNodeSignatureLabel.verticalAlignment = GridData.CENTER;
			constraintFStartNodeSignatureLabel.horizontalAlignment = GridData.CENTER;
			constraintFStartNodeSignatureLabel.horizontalIndent = 0;
			constraintFStartNodeSignatureLabel.horizontalSpan = 1;
			constraintFStartNodeSignatureLabel.verticalSpan = 1;
			constraintFStartNodeSignatureLabel.grabExcessHorizontalSpace = true;
			constraintFStartNodeSignatureLabel.grabExcessVerticalSpace = false;
			this.add(fStartNodeSignatureLabel, constraintFStartNodeSignatureLabel);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getStartNodeSignatureLabel() {
			return fStartNodeSignatureLabel;
		}

	}

}
