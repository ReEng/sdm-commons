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
import org.storydriven.storydiagrams.diagram.edit.policies.ObjectSetVariableItemSemanticEditPolicy;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class ObjectSetVariableEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3018;

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
	public ObjectSetVariableEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ObjectSetVariableItemSemanticEditPolicy());
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
		return primaryShape = new CollectionVariableFigureDescriptor();
	}

	/**
	 * @generated
	 */
	public CollectionVariableFigureDescriptor getPrimaryShape() {
		return (CollectionVariableFigureDescriptor) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel7EditPart) {
			((WrappingLabel7EditPart) childEditPart).setLabel(getPrimaryShape().getCollectionVariableOperatorLabel());
			return true;
		}
		if (childEditPart instanceof CollectionVariableNameLabelEditPart) {
			((CollectionVariableNameLabelEditPart) childEditPart).setLabel(getPrimaryShape()
					.getCollectionVariableNameLabel());
			return true;
		}
		if (childEditPart instanceof WrappingLabel8EditPart) {
			((WrappingLabel8EditPart) childEditPart).setLabel(getPrimaryShape().getCollectionVariableTypeLabel());
			return true;
		}
		if (childEditPart instanceof ObjectSetVariableCollectionVariableConstraintsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getCollectionVariableConstraintsRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ObjectSetVariableCollectionVariableConstraintsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ObjectSetVariableCollectionVariableAttributeAssignmentsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getCollectionVariableAttributeAssignmentsRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ObjectSetVariableCollectionVariableAttributeAssignmentsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel7EditPart) {
			return true;
		}
		if (childEditPart instanceof CollectionVariableNameLabelEditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabel8EditPart) {
			return true;
		}
		if (childEditPart instanceof ObjectSetVariableCollectionVariableConstraintsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getCollectionVariableConstraintsRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((ObjectSetVariableCollectionVariableConstraintsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ObjectSetVariableCollectionVariableAttributeAssignmentsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getCollectionVariableAttributeAssignmentsRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((ObjectSetVariableCollectionVariableAttributeAssignmentsCompartmentEditPart) childEditPart)
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
		if (editPart instanceof ObjectSetVariableCollectionVariableConstraintsCompartmentEditPart) {
			return getPrimaryShape().getCollectionVariableConstraintsRectangle();
		}
		if (editPart instanceof ObjectSetVariableCollectionVariableAttributeAssignmentsCompartmentEditPart) {
			return getPrimaryShape().getCollectionVariableAttributeAssignmentsRectangle();
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
		return getChildBySemanticHint(StorydiagramsVisualIDRegistry.getType(WrappingLabel7EditPart.VISUAL_ID));
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
		if (targetEditPart instanceof ObjectVariableEditPart) {
			types.add(StorydiagramsElementTypes.LinkVariable_4002);
		}
		if (targetEditPart instanceof org.storydriven.storydiagrams.diagram.edit.parts.ObjectSetVariableEditPart) {
			types.add(StorydiagramsElementTypes.LinkVariable_4002);
		}
		if (targetEditPart instanceof ObjectVariableEditPart) {
			types.add(StorydiagramsElementTypes.ContainmentRelation_4004);
		}
		if (targetEditPart instanceof org.storydriven.storydiagrams.diagram.edit.parts.ObjectSetVariableEditPart) {
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
						.getType(ObjectSetVariableCollectionVariableConstraintsCompartmentEditPart.VISUAL_ID));
			}
			if (type == StorydiagramsElementTypes.AttributeAssignment_3010) {
				return getChildBySemanticHint(StorydiagramsVisualIDRegistry
						.getType(ObjectSetVariableCollectionVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class CollectionVariableFigureDescriptor extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fCollectionVariableNameLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fCollectionVariableOperatorLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fCollectionVariableTypeLabel;
		/**
		 * @generated
		 */
		private RectangleFigure fCollectionVariableConstraintsRectangle;
		/**
		 * @generated
		 */
		private RectangleFigure fCollectionVariableAttributeAssignmentsRectangle;

		/**
		 * @generated
		 */
		public CollectionVariableFigureDescriptor() {
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

			RectangleFigure collectionVariableShadeRectangle0 = new RectangleFigure();
			collectionVariableShadeRectangle0.setForegroundColor(ColorConstants.black);
			collectionVariableShadeRectangle0.setBackgroundColor(ColorConstants.white);

			collectionVariableShadeRectangle0.setBorder(new MarginBorder(getMapMode().DPtoLP(10), getMapMode().DPtoLP(
					10), getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));

			this.add(collectionVariableShadeRectangle0);

			RectangleFigure collectionVariableContainerRectangle0 = new RectangleFigure();
			collectionVariableContainerRectangle0.setFill(false);
			collectionVariableContainerRectangle0.setOutline(false);
			collectionVariableContainerRectangle0.setForegroundColor(ColorConstants.black);
			collectionVariableContainerRectangle0.setBackgroundColor(ColorConstants.white);

			collectionVariableContainerRectangle0.setBorder(new MarginBorder(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(0), getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));

			this.add(collectionVariableContainerRectangle0);

			BorderLayout layoutCollectionVariableContainerRectangle0 = new BorderLayout();
			collectionVariableContainerRectangle0.setLayoutManager(layoutCollectionVariableContainerRectangle0);

			RectangleFigure collectionVariableNameRectangle1 = new RectangleFigure();

			collectionVariableContainerRectangle0.add(collectionVariableNameRectangle1, BorderLayout.TOP);

			GridLayout layoutCollectionVariableNameRectangle1 = new GridLayout();
			layoutCollectionVariableNameRectangle1.numColumns = 1;
			layoutCollectionVariableNameRectangle1.makeColumnsEqualWidth = true;
			collectionVariableNameRectangle1.setLayoutManager(layoutCollectionVariableNameRectangle1);

			fCollectionVariableOperatorLabel = new WrappingLabel();
			fCollectionVariableOperatorLabel.setText("");

			fCollectionVariableOperatorLabel.setFont(FCOLLECTIONVARIABLEOPERATORLABEL_FONT);

			GridData constraintFCollectionVariableOperatorLabel = new GridData();
			constraintFCollectionVariableOperatorLabel.verticalAlignment = GridData.BEGINNING;
			constraintFCollectionVariableOperatorLabel.horizontalAlignment = GridData.CENTER;
			constraintFCollectionVariableOperatorLabel.horizontalIndent = 0;
			constraintFCollectionVariableOperatorLabel.horizontalSpan = 1;
			constraintFCollectionVariableOperatorLabel.verticalSpan = 1;
			constraintFCollectionVariableOperatorLabel.grabExcessHorizontalSpace = true;
			constraintFCollectionVariableOperatorLabel.grabExcessVerticalSpace = false;
			collectionVariableNameRectangle1.add(fCollectionVariableOperatorLabel,
					constraintFCollectionVariableOperatorLabel);

			fCollectionVariableNameLabel = new WrappingLabel();
			fCollectionVariableNameLabel.setText("");

			fCollectionVariableNameLabel.setFont(FCOLLECTIONVARIABLENAMELABEL_FONT);

			GridData constraintFCollectionVariableNameLabel = new GridData();
			constraintFCollectionVariableNameLabel.verticalAlignment = GridData.CENTER;
			constraintFCollectionVariableNameLabel.horizontalAlignment = GridData.CENTER;
			constraintFCollectionVariableNameLabel.horizontalIndent = 0;
			constraintFCollectionVariableNameLabel.horizontalSpan = 1;
			constraintFCollectionVariableNameLabel.verticalSpan = 1;
			constraintFCollectionVariableNameLabel.grabExcessHorizontalSpace = true;
			constraintFCollectionVariableNameLabel.grabExcessVerticalSpace = false;
			collectionVariableNameRectangle1.add(fCollectionVariableNameLabel, constraintFCollectionVariableNameLabel);

			fCollectionVariableTypeLabel = new WrappingLabel();
			fCollectionVariableTypeLabel.setText("");

			fCollectionVariableTypeLabel.setFont(FCOLLECTIONVARIABLETYPELABEL_FONT);

			GridData constraintFCollectionVariableTypeLabel = new GridData();
			constraintFCollectionVariableTypeLabel.verticalAlignment = GridData.END;
			constraintFCollectionVariableTypeLabel.horizontalAlignment = GridData.CENTER;
			constraintFCollectionVariableTypeLabel.horizontalIndent = 0;
			constraintFCollectionVariableTypeLabel.horizontalSpan = 1;
			constraintFCollectionVariableTypeLabel.verticalSpan = 1;
			constraintFCollectionVariableTypeLabel.grabExcessHorizontalSpace = true;
			constraintFCollectionVariableTypeLabel.grabExcessVerticalSpace = false;
			collectionVariableNameRectangle1.add(fCollectionVariableTypeLabel, constraintFCollectionVariableTypeLabel);

			RectangleFigure collectionVariableBodyRectangle1 = new RectangleFigure();
			collectionVariableBodyRectangle1.setFill(false);
			collectionVariableBodyRectangle1.setOutline(false);

			collectionVariableContainerRectangle0.add(collectionVariableBodyRectangle1, BorderLayout.CENTER);

			BorderLayout layoutCollectionVariableBodyRectangle1 = new BorderLayout();
			collectionVariableBodyRectangle1.setLayoutManager(layoutCollectionVariableBodyRectangle1);

			fCollectionVariableConstraintsRectangle = new RectangleFigure();
			fCollectionVariableConstraintsRectangle.setFill(false);
			fCollectionVariableConstraintsRectangle.setOutline(false);

			collectionVariableBodyRectangle1.add(fCollectionVariableConstraintsRectangle, BorderLayout.TOP);

			fCollectionVariableAttributeAssignmentsRectangle = new RectangleFigure();
			fCollectionVariableAttributeAssignmentsRectangle.setFill(false);
			fCollectionVariableAttributeAssignmentsRectangle.setOutline(false);

			collectionVariableBodyRectangle1.add(fCollectionVariableAttributeAssignmentsRectangle, BorderLayout.CENTER);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getCollectionVariableNameLabel() {
			return fCollectionVariableNameLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getCollectionVariableOperatorLabel() {
			return fCollectionVariableOperatorLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getCollectionVariableTypeLabel() {
			return fCollectionVariableTypeLabel;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getCollectionVariableConstraintsRectangle() {
			return fCollectionVariableConstraintsRectangle;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getCollectionVariableAttributeAssignmentsRectangle() {
			return fCollectionVariableAttributeAssignmentsRectangle;
		}

	}

	/**
	 * @generated
	 */
	static final Font FCOLLECTIONVARIABLEOPERATORLABEL_FONT = new Font(Display.getCurrent(), Display.getDefault()
			.getSystemFont().getFontData()[0].getName(), 9, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font FCOLLECTIONVARIABLENAMELABEL_FONT = new Font(Display.getCurrent(), Display.getDefault()
			.getSystemFont().getFontData()[0].getName(), 9, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font FCOLLECTIONVARIABLETYPELABEL_FONT = new Font(Display.getCurrent(), Display.getDefault()
			.getSystemFont().getFontData()[0].getName(), 9, SWT.BOLD);

}
