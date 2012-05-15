package org.storydriven.storydiagrams.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FlowLayout;
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
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
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
import org.storydriven.storydiagrams.diagram.edit.policies.StatementNode2ItemSemanticEditPolicy;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class StatementNode2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3005;

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
	public StatementNode2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new StatementNode2ItemSemanticEditPolicy());
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
		if (childEditPart instanceof StatementNodeName2EditPart) {
			((StatementNodeName2EditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureStatementNodeFigureNameLabel());
			return true;
		}
		if (childEditPart instanceof StatementNodeStatementNodeCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getFigureStatementNodeFigureRectangleBody();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((StatementNodeStatementNodeCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof StatementNodeName2EditPart) {
			return true;
		}
		if (childEditPart instanceof StatementNodeStatementNodeCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getFigureStatementNodeFigureRectangleBody();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((StatementNodeStatementNodeCompartment2EditPart) childEditPart).getFigure());
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
		if (editPart instanceof StatementNodeStatementNodeCompartment2EditPart) {
			return getPrimaryShape().getFigureStatementNodeFigureRectangleBody();
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
		return getChildBySemanticHint(StorydiagramsVisualIDRegistry.getType(StatementNodeName2EditPart.VISUAL_ID));
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
		if (targetEditPart instanceof ModifyingStoryNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof MatchingStoryNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StatementNodeEditPart) {
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
		if (targetEditPart instanceof JunctionNode2EditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StartNode2EditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StopNode2EditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof org.storydriven.storydiagrams.diagram.edit.parts.StatementNode2EditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StructuredNode2EditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof ModifyingStoryNode2EditPart) {
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
			types.add(StorydiagramsElementTypes.ModifyingStoryNode_2007);
			types.add(StorydiagramsElementTypes.MatchingStoryNode_2008);
			types.add(StorydiagramsElementTypes.StatementNode_2004);
			types.add(StorydiagramsElementTypes.StructuredNode_2005);
			types.add(StorydiagramsElementTypes.StartNode_2001);
			types.add(StorydiagramsElementTypes.JunctionNode_2003);
			types.add(StorydiagramsElementTypes.StopNode_2002);
			types.add(StorydiagramsElementTypes.JunctionNode_3002);
			types.add(StorydiagramsElementTypes.StartNode_3003);
			types.add(StorydiagramsElementTypes.StopNode_3004);
			types.add(StorydiagramsElementTypes.StatementNode_3005);
			types.add(StorydiagramsElementTypes.StructuredNode_3006);
			types.add(StorydiagramsElementTypes.ModifyingStoryNode_3007);
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
			types.add(StorydiagramsElementTypes.ModifyingStoryNode_2007);
			types.add(StorydiagramsElementTypes.MatchingStoryNode_2008);
			types.add(StorydiagramsElementTypes.StatementNode_2004);
			types.add(StorydiagramsElementTypes.StructuredNode_2005);
			types.add(StorydiagramsElementTypes.StartNode_2001);
			types.add(StorydiagramsElementTypes.JunctionNode_2003);
			types.add(StorydiagramsElementTypes.StopNode_2002);
			types.add(StorydiagramsElementTypes.JunctionNode_3002);
			types.add(StorydiagramsElementTypes.StartNode_3003);
			types.add(StorydiagramsElementTypes.StopNode_3004);
			types.add(StorydiagramsElementTypes.StatementNode_3005);
			types.add(StorydiagramsElementTypes.StructuredNode_3006);
			types.add(StorydiagramsElementTypes.ModifyingStoryNode_3007);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == StorydiagramsElementTypes.TextualExpression_3001) {
				return getChildBySemanticHint(StorydiagramsVisualIDRegistry
						.getType(StatementNodeStatementNodeCompartment2EditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class StatementNodeFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureStatementNodeFigureNameLabel;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureStatementNodeFigureRectangleBody;

		/**
		 * @generated
		 */
		public StatementNodeFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			this.setForegroundColor(ColorConstants.black);
			this.setBackgroundColor(THIS_BACK);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure statementNodeFigureRectangleTitle0 = new RectangleFigure();
			statementNodeFigureRectangleTitle0.setPreferredSize(new Dimension(getMapMode().DPtoLP(100), getMapMode()
					.DPtoLP(30)));

			this.add(statementNodeFigureRectangleTitle0, BorderLayout.TOP);

			GridLayout layoutStatementNodeFigureRectangleTitle0 = new GridLayout();
			layoutStatementNodeFigureRectangleTitle0.numColumns = 1;
			layoutStatementNodeFigureRectangleTitle0.makeColumnsEqualWidth = true;
			statementNodeFigureRectangleTitle0.setLayoutManager(layoutStatementNodeFigureRectangleTitle0);

			fFigureStatementNodeFigureNameLabel = new WrappingLabel();
			fFigureStatementNodeFigureNameLabel.setText("");

			fFigureStatementNodeFigureNameLabel.setFont(FFIGURESTATEMENTNODEFIGURENAMELABEL_FONT);

			GridData constraintFFigureStatementNodeFigureNameLabel = new GridData();
			constraintFFigureStatementNodeFigureNameLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureStatementNodeFigureNameLabel.horizontalAlignment = GridData.CENTER;
			constraintFFigureStatementNodeFigureNameLabel.horizontalIndent = 0;
			constraintFFigureStatementNodeFigureNameLabel.horizontalSpan = 1;
			constraintFFigureStatementNodeFigureNameLabel.verticalSpan = 1;
			constraintFFigureStatementNodeFigureNameLabel.grabExcessHorizontalSpace = true;
			constraintFFigureStatementNodeFigureNameLabel.grabExcessVerticalSpace = false;
			statementNodeFigureRectangleTitle0.add(fFigureStatementNodeFigureNameLabel,
					constraintFFigureStatementNodeFigureNameLabel);

			fFigureStatementNodeFigureRectangleBody = new RectangleFigure();
			fFigureStatementNodeFigureRectangleBody.setPreferredSize(new Dimension(getMapMode().DPtoLP(100),
					getMapMode().DPtoLP(40)));

			this.add(fFigureStatementNodeFigureRectangleBody, BorderLayout.CENTER);

			FlowLayout layoutFFigureStatementNodeFigureRectangleBody = new FlowLayout();
			layoutFFigureStatementNodeFigureRectangleBody.setStretchMinorAxis(false);
			layoutFFigureStatementNodeFigureRectangleBody.setMinorAlignment(FlowLayout.ALIGN_CENTER);

			layoutFFigureStatementNodeFigureRectangleBody.setMajorAlignment(FlowLayout.ALIGN_CENTER);
			layoutFFigureStatementNodeFigureRectangleBody.setMajorSpacing(0);
			layoutFFigureStatementNodeFigureRectangleBody.setMinorSpacing(0);
			layoutFFigureStatementNodeFigureRectangleBody.setHorizontal(true);

			fFigureStatementNodeFigureRectangleBody.setLayoutManager(layoutFFigureStatementNodeFigureRectangleBody);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStatementNodeFigureNameLabel() {
			return fFigureStatementNodeFigureNameLabel;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureStatementNodeFigureRectangleBody() {
			return fFigureStatementNodeFigureRectangleBody;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 230, 230, 230);

	/**
	 * @generated
	 */
	static final Font FFIGURESTATEMENTNODEFIGURENAMELABEL_FONT = new Font(Display.getCurrent(), Display.getDefault()
			.getSystemFont().getFontData()[0].getName(), 10, SWT.BOLD);

}
