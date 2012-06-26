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
import org.storydriven.storydiagrams.diagram.edit.policies.ObjectVariableItemSemanticEditPolicy;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class ObjectVariableEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3009;

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
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ObjectVariableItemSemanticEditPolicy());
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
		return primaryShape = new ObjectVariableFigureDescriptor();
	}

	/**
	 * @generated
	 */
	public ObjectVariableFigureDescriptor getPrimaryShape() {
		return (ObjectVariableFigureDescriptor) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ObjectVariableOperatorEditPart) {
			((ObjectVariableOperatorEditPart) childEditPart).setLabel(getPrimaryShape()
					.getObjectVariableOperatorLabel());
			return true;
		}
		if (childEditPart instanceof ObjectVariableNameEditPart) {
			((ObjectVariableNameEditPart) childEditPart).setLabel(getPrimaryShape().getObjectVariableNameLabel());
			return true;
		}
		if (childEditPart instanceof ObjectVariableTypeLabelEditPart) {
			((ObjectVariableTypeLabelEditPart) childEditPart).setLabel(getPrimaryShape().getObjectVariableTypeLabel());
			return true;
		}
		if (childEditPart instanceof ObjectVariableObjectVariableConstraintsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getObjectVariableConstraintsRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ObjectVariableObjectVariableConstraintsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getObjectVariableAttributeAssignmentsRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ObjectVariableOperatorEditPart) {
			return true;
		}
		if (childEditPart instanceof ObjectVariableNameEditPart) {
			return true;
		}
		if (childEditPart instanceof ObjectVariableTypeLabelEditPart) {
			return true;
		}
		if (childEditPart instanceof ObjectVariableObjectVariableConstraintsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getObjectVariableConstraintsRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((ObjectVariableObjectVariableConstraintsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getObjectVariableAttributeAssignmentsRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart) childEditPart)
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
		if (editPart instanceof ObjectVariableObjectVariableConstraintsCompartmentEditPart) {
			return getPrimaryShape().getObjectVariableConstraintsRectangle();
		}
		if (editPart instanceof ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart) {
			return getPrimaryShape().getObjectVariableAttributeAssignmentsRectangle();
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
		return getChildBySemanticHint(StorydiagramsVisualIDRegistry.getType(ObjectVariableOperatorEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(StorydiagramsElementTypes.LinkVariable_4002);
		types.add(StorydiagramsElementTypes.ContainmentRelation_4004);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableEditPart) {
			types.add(StorydiagramsElementTypes.LinkVariable_4002);
		}
		if (targetEditPart instanceof ObjectSetVariableEditPart) {
			types.add(StorydiagramsElementTypes.LinkVariable_4002);
		}
		if (targetEditPart instanceof org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableEditPart) {
			types.add(StorydiagramsElementTypes.ContainmentRelation_4004);
		}
		if (targetEditPart instanceof ObjectSetVariableEditPart) {
			types.add(StorydiagramsElementTypes.ContainmentRelation_4004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == StorydiagramsElementTypes.LinkVariable_4002) {
			types.add(StorydiagramsElementTypes.ObjectVariable_3009);
			types.add(StorydiagramsElementTypes.ObjectSetVariable_3018);
		} else if (relationshipType == StorydiagramsElementTypes.ContainmentRelation_4004) {
			types.add(StorydiagramsElementTypes.ObjectVariable_3009);
			types.add(StorydiagramsElementTypes.ObjectSetVariable_3018);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(StorydiagramsElementTypes.LinkVariable_4002);
		types.add(StorydiagramsElementTypes.ContainmentRelation_4004);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == StorydiagramsElementTypes.LinkVariable_4002) {
			types.add(StorydiagramsElementTypes.ObjectVariable_3009);
			types.add(StorydiagramsElementTypes.ObjectSetVariable_3018);
		} else if (relationshipType == StorydiagramsElementTypes.ContainmentRelation_4004) {
			types.add(StorydiagramsElementTypes.ObjectVariable_3009);
			types.add(StorydiagramsElementTypes.ObjectSetVariable_3018);
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
			if (type == StorydiagramsElementTypes.Constraint_3013) {
				return getChildBySemanticHint(StorydiagramsVisualIDRegistry
						.getType(ObjectVariableObjectVariableConstraintsCompartmentEditPart.VISUAL_ID));
			}
			if (type == StorydiagramsElementTypes.AttributeAssignment_3010) {
				return getChildBySemanticHint(StorydiagramsVisualIDRegistry
						.getType(ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class ObjectVariableFigureDescriptor extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fObjectVariableOperatorLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fObjectVariableNameLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fObjectVariableTypeLabel;
		/**
		 * @generated
		 */
		private RectangleFigure fObjectVariableConstraintsRectangle;
		/**
		 * @generated
		 */
		private RectangleFigure fObjectVariableAttributeAssignmentsRectangle;

		/**
		 * @generated
		 */
		public ObjectVariableFigureDescriptor() {
			this.setLayoutManager(new StackLayout());
			this.setFill(false);
			this.setOutline(false);
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure objectVariableContainerRectangle0 = new RectangleFigure();
			objectVariableContainerRectangle0.setFill(false);
			objectVariableContainerRectangle0.setOutline(false);

			objectVariableContainerRectangle0.setBorder(new MarginBorder(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));

			this.add(objectVariableContainerRectangle0);
			objectVariableContainerRectangle0.setLayoutManager(new StackLayout());

			RectangleFigure objectVariableRectangle1 = new RectangleFigure();
			objectVariableRectangle1.setForegroundColor(ColorConstants.black);

			objectVariableContainerRectangle0.add(objectVariableRectangle1);

			BorderLayout layoutObjectVariableRectangle1 = new BorderLayout();
			objectVariableRectangle1.setLayoutManager(layoutObjectVariableRectangle1);

			RectangleFigure objectVariableFigureNameRectangle2 = new RectangleFigure();

			objectVariableRectangle1.add(objectVariableFigureNameRectangle2, BorderLayout.TOP);

			GridLayout layoutObjectVariableFigureNameRectangle2 = new GridLayout();
			layoutObjectVariableFigureNameRectangle2.numColumns = 1;
			layoutObjectVariableFigureNameRectangle2.makeColumnsEqualWidth = true;
			objectVariableFigureNameRectangle2.setLayoutManager(layoutObjectVariableFigureNameRectangle2);

			fObjectVariableOperatorLabel = new WrappingLabel();
			fObjectVariableOperatorLabel.setText("");

			fObjectVariableOperatorLabel.setFont(FOBJECTVARIABLEOPERATORLABEL_FONT);

			GridData constraintFObjectVariableOperatorLabel = new GridData();
			constraintFObjectVariableOperatorLabel.verticalAlignment = GridData.BEGINNING;
			constraintFObjectVariableOperatorLabel.horizontalAlignment = GridData.CENTER;
			constraintFObjectVariableOperatorLabel.horizontalIndent = 0;
			constraintFObjectVariableOperatorLabel.horizontalSpan = 1;
			constraintFObjectVariableOperatorLabel.verticalSpan = 1;
			constraintFObjectVariableOperatorLabel.grabExcessHorizontalSpace = true;
			constraintFObjectVariableOperatorLabel.grabExcessVerticalSpace = false;
			objectVariableFigureNameRectangle2
					.add(fObjectVariableOperatorLabel, constraintFObjectVariableOperatorLabel);

			fObjectVariableNameLabel = new WrappingLabel();
			fObjectVariableNameLabel.setText("");

			fObjectVariableNameLabel.setFont(FOBJECTVARIABLENAMELABEL_FONT);

			GridData constraintFObjectVariableNameLabel = new GridData();
			constraintFObjectVariableNameLabel.verticalAlignment = GridData.CENTER;
			constraintFObjectVariableNameLabel.horizontalAlignment = GridData.CENTER;
			constraintFObjectVariableNameLabel.horizontalIndent = 0;
			constraintFObjectVariableNameLabel.horizontalSpan = 1;
			constraintFObjectVariableNameLabel.verticalSpan = 1;
			constraintFObjectVariableNameLabel.grabExcessHorizontalSpace = true;
			constraintFObjectVariableNameLabel.grabExcessVerticalSpace = false;
			objectVariableFigureNameRectangle2.add(fObjectVariableNameLabel, constraintFObjectVariableNameLabel);

			fObjectVariableTypeLabel = new WrappingLabel();
			fObjectVariableTypeLabel.setText("");

			fObjectVariableTypeLabel.setFont(FOBJECTVARIABLETYPELABEL_FONT);

			GridData constraintFObjectVariableTypeLabel = new GridData();
			constraintFObjectVariableTypeLabel.verticalAlignment = GridData.END;
			constraintFObjectVariableTypeLabel.horizontalAlignment = GridData.CENTER;
			constraintFObjectVariableTypeLabel.horizontalIndent = 0;
			constraintFObjectVariableTypeLabel.horizontalSpan = 1;
			constraintFObjectVariableTypeLabel.verticalSpan = 1;
			constraintFObjectVariableTypeLabel.grabExcessHorizontalSpace = true;
			constraintFObjectVariableTypeLabel.grabExcessVerticalSpace = false;
			objectVariableFigureNameRectangle2.add(fObjectVariableTypeLabel, constraintFObjectVariableTypeLabel);

			RectangleFigure objectVariableFigureBodyRectangle2 = new RectangleFigure();
			objectVariableFigureBodyRectangle2.setFill(false);
			objectVariableFigureBodyRectangle2.setOutline(false);

			objectVariableRectangle1.add(objectVariableFigureBodyRectangle2, BorderLayout.CENTER);

			BorderLayout layoutObjectVariableFigureBodyRectangle2 = new BorderLayout();
			objectVariableFigureBodyRectangle2.setLayoutManager(layoutObjectVariableFigureBodyRectangle2);

			fObjectVariableConstraintsRectangle = new RectangleFigure();
			fObjectVariableConstraintsRectangle.setFill(false);
			fObjectVariableConstraintsRectangle.setOutline(false);

			objectVariableFigureBodyRectangle2.add(fObjectVariableConstraintsRectangle, BorderLayout.TOP);

			fObjectVariableAttributeAssignmentsRectangle = new RectangleFigure();
			fObjectVariableAttributeAssignmentsRectangle.setFill(false);
			fObjectVariableAttributeAssignmentsRectangle.setOutline(false);

			objectVariableFigureBodyRectangle2.add(fObjectVariableAttributeAssignmentsRectangle, BorderLayout.CENTER);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getObjectVariableOperatorLabel() {
			return fObjectVariableOperatorLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getObjectVariableNameLabel() {
			return fObjectVariableNameLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getObjectVariableTypeLabel() {
			return fObjectVariableTypeLabel;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getObjectVariableConstraintsRectangle() {
			return fObjectVariableConstraintsRectangle;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getObjectVariableAttributeAssignmentsRectangle() {
			return fObjectVariableAttributeAssignmentsRectangle;
		}

	}

	/**
	 * @generated
	 */
	static final Font FOBJECTVARIABLEOPERATORLABEL_FONT = new Font(Display.getCurrent(), Display.getDefault()
			.getSystemFont().getFontData()[0].getName(), 9, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font FOBJECTVARIABLENAMELABEL_FONT = new Font(Display.getCurrent(), Display.getDefault()
			.getSystemFont().getFontData()[0].getName(), 9, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font FOBJECTVARIABLETYPELABEL_FONT = new Font(Display.getCurrent(), Display.getDefault()
			.getSystemFont().getFontData()[0].getName(), 9, SWT.BOLD);

}
