package org.storydriven.modeling.diagram.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
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
		return primaryShape = new StoryPatternObjectFigureDescriptor();
	}

	/**
	 * @generated
	 */
	public StoryPatternObjectFigureDescriptor getPrimaryShape() {
		return (StoryPatternObjectFigureDescriptor) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ObjectVariableNameEditPart) {
			((ObjectVariableNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureStoryPatternObjectNameLabel());
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
	public class StoryPatternObjectFigureDescriptor extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureStoryPatternObjectNameLabel;

		/**
		 * @generated
		 */
		public StoryPatternObjectFigureDescriptor() {
			this.setLayoutManager(new StackLayout());
			this.setFill(false);
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(40),
					getMapMode().DPtoLP(60)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure storyPatternObjectContainerRectangle0 = new RectangleFigure();
			storyPatternObjectContainerRectangle0.setFill(false);
			storyPatternObjectContainerRectangle0.setOutline(false);

			storyPatternObjectContainerRectangle0.setBorder(new MarginBorder(
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));

			this.add(storyPatternObjectContainerRectangle0);
			storyPatternObjectContainerRectangle0
					.setLayoutManager(new StackLayout());

			RectangleFigure storyPatternObjectRectangle1 = new RectangleFigure();
			storyPatternObjectRectangle1
					.setForegroundColor(ColorConstants.black);

			storyPatternObjectContainerRectangle0
					.add(storyPatternObjectRectangle1);

			BorderLayout layoutStoryPatternObjectRectangle1 = new BorderLayout();
			storyPatternObjectRectangle1
					.setLayoutManager(layoutStoryPatternObjectRectangle1);

			RectangleFigure storyPatternObjectFigureNameRectangle2 = new RectangleFigure();

			storyPatternObjectRectangle1.add(
					storyPatternObjectFigureNameRectangle2, BorderLayout.TOP);

			GridLayout layoutStoryPatternObjectFigureNameRectangle2 = new GridLayout();
			layoutStoryPatternObjectFigureNameRectangle2.numColumns = 1;
			layoutStoryPatternObjectFigureNameRectangle2.makeColumnsEqualWidth = true;
			storyPatternObjectFigureNameRectangle2
					.setLayoutManager(layoutStoryPatternObjectFigureNameRectangle2);

			WrappingLabel storyPatternObjectModifierLabel3 = new WrappingLabel();
			storyPatternObjectModifierLabel3.setText("");

			storyPatternObjectModifierLabel3
					.setFont(STORYPATTERNOBJECTMODIFIERLABEL3_FONT);

			GridData constraintStoryPatternObjectModifierLabel3 = new GridData();
			constraintStoryPatternObjectModifierLabel3.verticalAlignment = GridData.BEGINNING;
			constraintStoryPatternObjectModifierLabel3.horizontalAlignment = GridData.CENTER;
			constraintStoryPatternObjectModifierLabel3.horizontalIndent = 0;
			constraintStoryPatternObjectModifierLabel3.horizontalSpan = 1;
			constraintStoryPatternObjectModifierLabel3.verticalSpan = 1;
			constraintStoryPatternObjectModifierLabel3.grabExcessHorizontalSpace = true;
			constraintStoryPatternObjectModifierLabel3.grabExcessVerticalSpace = false;
			storyPatternObjectFigureNameRectangle2.add(
					storyPatternObjectModifierLabel3,
					constraintStoryPatternObjectModifierLabel3);

			fFigureStoryPatternObjectNameLabel = new WrappingLabel();
			fFigureStoryPatternObjectNameLabel.setText("");

			fFigureStoryPatternObjectNameLabel
					.setFont(FFIGURESTORYPATTERNOBJECTNAMELABEL_FONT);

			GridData constraintFFigureStoryPatternObjectNameLabel = new GridData();
			constraintFFigureStoryPatternObjectNameLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureStoryPatternObjectNameLabel.horizontalAlignment = GridData.CENTER;
			constraintFFigureStoryPatternObjectNameLabel.horizontalIndent = 0;
			constraintFFigureStoryPatternObjectNameLabel.horizontalSpan = 1;
			constraintFFigureStoryPatternObjectNameLabel.verticalSpan = 1;
			constraintFFigureStoryPatternObjectNameLabel.grabExcessHorizontalSpace = true;
			constraintFFigureStoryPatternObjectNameLabel.grabExcessVerticalSpace = false;
			storyPatternObjectFigureNameRectangle2.add(
					fFigureStoryPatternObjectNameLabel,
					constraintFFigureStoryPatternObjectNameLabel);

			WrappingLabel storyPatternObjectClassifierLabel3 = new WrappingLabel();
			storyPatternObjectClassifierLabel3.setText("");

			storyPatternObjectClassifierLabel3
					.setFont(STORYPATTERNOBJECTCLASSIFIERLABEL3_FONT);

			GridData constraintStoryPatternObjectClassifierLabel3 = new GridData();
			constraintStoryPatternObjectClassifierLabel3.verticalAlignment = GridData.END;
			constraintStoryPatternObjectClassifierLabel3.horizontalAlignment = GridData.CENTER;
			constraintStoryPatternObjectClassifierLabel3.horizontalIndent = 0;
			constraintStoryPatternObjectClassifierLabel3.horizontalSpan = 1;
			constraintStoryPatternObjectClassifierLabel3.verticalSpan = 1;
			constraintStoryPatternObjectClassifierLabel3.grabExcessHorizontalSpace = true;
			constraintStoryPatternObjectClassifierLabel3.grabExcessVerticalSpace = false;
			storyPatternObjectFigureNameRectangle2.add(
					storyPatternObjectClassifierLabel3,
					constraintStoryPatternObjectClassifierLabel3);

			RectangleFigure storyPatternObjectFigureBodyRectangle2 = new RectangleFigure();
			storyPatternObjectFigureBodyRectangle2.setFill(false);
			storyPatternObjectFigureBodyRectangle2.setOutline(false);

			storyPatternObjectRectangle1
					.add(storyPatternObjectFigureBodyRectangle2,
							BorderLayout.CENTER);

			BorderLayout layoutStoryPatternObjectFigureBodyRectangle2 = new BorderLayout();
			storyPatternObjectFigureBodyRectangle2
					.setLayoutManager(layoutStoryPatternObjectFigureBodyRectangle2);

			RectangleFigure storyPatternObjectConstraintsRectangle3 = new RectangleFigure();
			storyPatternObjectConstraintsRectangle3.setFill(false);
			storyPatternObjectConstraintsRectangle3.setOutline(false);

			storyPatternObjectFigureBodyRectangle2.add(
					storyPatternObjectConstraintsRectangle3, BorderLayout.TOP);

			RectangleFigure storyPatternObjectAttributeAssignmentsRectangle3 = new RectangleFigure();
			storyPatternObjectAttributeAssignmentsRectangle3.setFill(false);
			storyPatternObjectAttributeAssignmentsRectangle3.setOutline(false);

			storyPatternObjectFigureBodyRectangle2.add(
					storyPatternObjectAttributeAssignmentsRectangle3,
					BorderLayout.CENTER);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStoryPatternObjectNameLabel() {
			return fFigureStoryPatternObjectNameLabel;
		}

	}

	/**
	 * @generated
	 */
	static final Font STORYPATTERNOBJECTMODIFIERLABEL3_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font FFIGURESTORYPATTERNOBJECTNAMELABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font STORYPATTERNOBJECTCLASSIFIERLABEL3_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

}
