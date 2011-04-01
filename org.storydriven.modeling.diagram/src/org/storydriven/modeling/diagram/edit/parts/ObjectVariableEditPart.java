package org.storydriven.modeling.diagram.edit.parts;

import java.util.Collections;
import java.util.List;
import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.storydriven.modeling.diagram.edit.policies.ObjectVariableItemSemanticEditPolicy;
import org.storydriven.modeling.diagram.part.SDMVisualIDRegistry;

/**
 * @generated
 */
public class ObjectVariableEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3007;

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
	public ObjectVariableEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ObjectVariableItemSemanticEditPolicy());
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
		return primaryShape = new ObjectVariableFigure();
	}

	/**
	 * @generated
	 */
	public ObjectVariableFigure getPrimaryShape() {
		return (ObjectVariableFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ObjectVariableNameEditPart) {
			((ObjectVariableNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureObjectVariableNameLabel());
			return true;
		}
		if (childEditPart instanceof WrappingLabelEditPart) {
			((WrappingLabelEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureObjectVariableClassifierLabel());
			return true;
		}
		if (childEditPart instanceof ObjectVariableBindingOperatorEditPart) {
			((ObjectVariableBindingOperatorEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureObjectVariableModifierLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ObjectVariableNameEditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabelEditPart) {
			return true;
		}
		if (childEditPart instanceof ObjectVariableBindingOperatorEditPart) {
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
		return getChildBySemanticHint(SDMVisualIDRegistry
				.getType(ObjectVariableNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ObjectVariableFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureObjectVariableNameLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureObjectVariableModifierLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureObjectVariableClassifierLabel;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureObjectVariableConstraintsRectangle;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureObjectVariableAttributeAssignmentsRectangle;

		/**
		 * @generated
		 */
		public ObjectVariableFigure() {
			this.setLayoutManager(new StackLayout());
			this.setFill(false);
			this.setOutline(false);
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure objectVariableContainerRectangle0 = new RectangleFigure();
			objectVariableContainerRectangle0.setFill(false);
			objectVariableContainerRectangle0.setOutline(false);

			objectVariableContainerRectangle0.setBorder(new MarginBorder(
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));

			this.add(objectVariableContainerRectangle0);
			objectVariableContainerRectangle0
					.setLayoutManager(new StackLayout());

			RectangleFigure objectVariableRectangle1 = new RectangleFigure();
			objectVariableRectangle1.setForegroundColor(ColorConstants.black);

			objectVariableContainerRectangle0.add(objectVariableRectangle1);

			BorderLayout layoutObjectVariableRectangle1 = new BorderLayout();
			objectVariableRectangle1
					.setLayoutManager(layoutObjectVariableRectangle1);

			RectangleFigure objectVariableFigureNameRectangle2 = new RectangleFigure();

			objectVariableRectangle1.add(objectVariableFigureNameRectangle2,
					BorderLayout.TOP);

			GridLayout layoutObjectVariableFigureNameRectangle2 = new GridLayout();
			layoutObjectVariableFigureNameRectangle2.numColumns = 1;
			layoutObjectVariableFigureNameRectangle2.makeColumnsEqualWidth = true;
			objectVariableFigureNameRectangle2
					.setLayoutManager(layoutObjectVariableFigureNameRectangle2);

			fFigureObjectVariableModifierLabel = new WrappingLabel();
			fFigureObjectVariableModifierLabel.setText("");

			fFigureObjectVariableModifierLabel
					.setFont(FFIGUREOBJECTVARIABLEMODIFIERLABEL_FONT);

			GridData constraintFFigureObjectVariableModifierLabel = new GridData();
			constraintFFigureObjectVariableModifierLabel.verticalAlignment = GridData.BEGINNING;
			constraintFFigureObjectVariableModifierLabel.horizontalAlignment = GridData.CENTER;
			constraintFFigureObjectVariableModifierLabel.horizontalIndent = 0;
			constraintFFigureObjectVariableModifierLabel.horizontalSpan = 1;
			constraintFFigureObjectVariableModifierLabel.verticalSpan = 1;
			constraintFFigureObjectVariableModifierLabel.grabExcessHorizontalSpace = true;
			constraintFFigureObjectVariableModifierLabel.grabExcessVerticalSpace = false;
			objectVariableFigureNameRectangle2.add(
					fFigureObjectVariableModifierLabel,
					constraintFFigureObjectVariableModifierLabel);

			fFigureObjectVariableNameLabel = new WrappingLabel();
			fFigureObjectVariableNameLabel.setText("");

			fFigureObjectVariableNameLabel
					.setFont(FFIGUREOBJECTVARIABLENAMELABEL_FONT);

			GridData constraintFFigureObjectVariableNameLabel = new GridData();
			constraintFFigureObjectVariableNameLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureObjectVariableNameLabel.horizontalAlignment = GridData.CENTER;
			constraintFFigureObjectVariableNameLabel.horizontalIndent = 0;
			constraintFFigureObjectVariableNameLabel.horizontalSpan = 1;
			constraintFFigureObjectVariableNameLabel.verticalSpan = 1;
			constraintFFigureObjectVariableNameLabel.grabExcessHorizontalSpace = true;
			constraintFFigureObjectVariableNameLabel.grabExcessVerticalSpace = false;
			objectVariableFigureNameRectangle2.add(
					fFigureObjectVariableNameLabel,
					constraintFFigureObjectVariableNameLabel);

			fFigureObjectVariableClassifierLabel = new WrappingLabel();
			fFigureObjectVariableClassifierLabel.setText("");

			fFigureObjectVariableClassifierLabel
					.setFont(FFIGUREOBJECTVARIABLECLASSIFIERLABEL_FONT);

			GridData constraintFFigureObjectVariableClassifierLabel = new GridData();
			constraintFFigureObjectVariableClassifierLabel.verticalAlignment = GridData.END;
			constraintFFigureObjectVariableClassifierLabel.horizontalAlignment = GridData.CENTER;
			constraintFFigureObjectVariableClassifierLabel.horizontalIndent = 0;
			constraintFFigureObjectVariableClassifierLabel.horizontalSpan = 1;
			constraintFFigureObjectVariableClassifierLabel.verticalSpan = 1;
			constraintFFigureObjectVariableClassifierLabel.grabExcessHorizontalSpace = true;
			constraintFFigureObjectVariableClassifierLabel.grabExcessVerticalSpace = false;
			objectVariableFigureNameRectangle2.add(
					fFigureObjectVariableClassifierLabel,
					constraintFFigureObjectVariableClassifierLabel);

			RectangleFigure objectVariableFigureBodyRectangle2 = new RectangleFigure();
			objectVariableFigureBodyRectangle2.setFill(false);
			objectVariableFigureBodyRectangle2.setOutline(false);

			objectVariableRectangle1.add(objectVariableFigureBodyRectangle2,
					BorderLayout.CENTER);

			BorderLayout layoutObjectVariableFigureBodyRectangle2 = new BorderLayout();
			objectVariableFigureBodyRectangle2
					.setLayoutManager(layoutObjectVariableFigureBodyRectangle2);

			fFigureObjectVariableConstraintsRectangle = new RectangleFigure();
			fFigureObjectVariableConstraintsRectangle.setFill(false);
			fFigureObjectVariableConstraintsRectangle.setOutline(false);

			objectVariableFigureBodyRectangle2
					.add(fFigureObjectVariableConstraintsRectangle,
							BorderLayout.TOP);

			fFigureObjectVariableAttributeAssignmentsRectangle = new RectangleFigure();
			fFigureObjectVariableAttributeAssignmentsRectangle.setFill(false);
			fFigureObjectVariableAttributeAssignmentsRectangle
					.setOutline(false);

			objectVariableFigureBodyRectangle2.add(
					fFigureObjectVariableAttributeAssignmentsRectangle,
					BorderLayout.CENTER);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureObjectVariableNameLabel() {
			return fFigureObjectVariableNameLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureObjectVariableModifierLabel() {
			return fFigureObjectVariableModifierLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureObjectVariableClassifierLabel() {
			return fFigureObjectVariableClassifierLabel;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureObjectVariableConstraintsRectangle() {
			return fFigureObjectVariableConstraintsRectangle;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureObjectVariableAttributeAssignmentsRectangle() {
			return fFigureObjectVariableAttributeAssignmentsRectangle;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREOBJECTVARIABLEMODIFIERLABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font FFIGUREOBJECTVARIABLENAMELABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font FFIGUREOBJECTVARIABLECLASSIFIERLABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

}
