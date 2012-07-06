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
import org.storydriven.storydiagrams.diagram.edit.policies.ActivityCallNodeItemSemanticEditPolicy;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class ActivityCallNodeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2009;

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
	public ActivityCallNodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ActivityCallNodeItemSemanticEditPolicy());
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
		return primaryShape = new ActivityCallNodeFigureDescriptor();
	}

	/**
	 * @generated
	 */
	public ActivityCallNodeFigureDescriptor getPrimaryShape() {
		return (ActivityCallNodeFigureDescriptor) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ActivityCallNodeNameEditPart) {
			((ActivityCallNodeNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getActivityCallNodeNameLabel());
			return true;
		}
		if (childEditPart instanceof WrappingLabelEditPart) {
			((WrappingLabelEditPart) childEditPart).setLabel(getPrimaryShape()
					.getActivityCallNodeCalleeLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ActivityCallNodeNameEditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabelEditPart) {
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
		return getChildBySemanticHint(StorydiagramsVisualIDRegistry
				.getType(ActivityCallNodeNameEditPart.VISUAL_ID));
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
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof org.storydriven.storydiagrams.diagram.edit.parts.ActivityCallNodeEditPart) {
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
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class ActivityCallNodeFigureDescriptor extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fActivityCallNodeNameLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fActivityCallNodeCalleeLabel;

		/**
		 * @generated
		 */
		public ActivityCallNodeFigureDescriptor() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setForegroundColor(ColorConstants.black);
			this.setBackgroundColor(THIS_BACK);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fActivityCallNodeNameLabel = new WrappingLabel();
			fActivityCallNodeNameLabel.setText("");

			fActivityCallNodeNameLabel.setFont(FACTIVITYCALLNODENAMELABEL_FONT);

			GridData constraintFActivityCallNodeNameLabel = new GridData();
			constraintFActivityCallNodeNameLabel.verticalAlignment = GridData.CENTER;
			constraintFActivityCallNodeNameLabel.horizontalAlignment = GridData.CENTER;
			constraintFActivityCallNodeNameLabel.horizontalIndent = 0;
			constraintFActivityCallNodeNameLabel.horizontalSpan = 1;
			constraintFActivityCallNodeNameLabel.verticalSpan = 1;
			constraintFActivityCallNodeNameLabel.grabExcessHorizontalSpace = true;
			constraintFActivityCallNodeNameLabel.grabExcessVerticalSpace = false;
			this.add(fActivityCallNodeNameLabel,
					constraintFActivityCallNodeNameLabel);

			fActivityCallNodeCalleeLabel = new WrappingLabel();
			fActivityCallNodeCalleeLabel.setText("");

			GridData constraintFActivityCallNodeCalleeLabel = new GridData();
			constraintFActivityCallNodeCalleeLabel.verticalAlignment = GridData.CENTER;
			constraintFActivityCallNodeCalleeLabel.horizontalAlignment = GridData.CENTER;
			constraintFActivityCallNodeCalleeLabel.horizontalIndent = 0;
			constraintFActivityCallNodeCalleeLabel.horizontalSpan = 1;
			constraintFActivityCallNodeCalleeLabel.verticalSpan = 1;
			constraintFActivityCallNodeCalleeLabel.grabExcessHorizontalSpace = true;
			constraintFActivityCallNodeCalleeLabel.grabExcessVerticalSpace = false;
			this.add(fActivityCallNodeCalleeLabel,
					constraintFActivityCallNodeCalleeLabel);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getActivityCallNodeNameLabel() {
			return fActivityCallNodeNameLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getActivityCallNodeCalleeLabel() {
			return fActivityCallNodeCalleeLabel;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 206, 226, 237);

	/**
	 * @generated
	 */
	static final Font FACTIVITYCALLNODENAMELABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 10, SWT.BOLD);

}
