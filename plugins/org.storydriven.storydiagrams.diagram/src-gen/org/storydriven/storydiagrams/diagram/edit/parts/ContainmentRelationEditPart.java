package org.storydriven.storydiagrams.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.diagram.edit.policies.ContainmentRelationItemSemanticEditPolicy;

/**
 * @generated
 */
public class ContainmentRelationEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4004;

	/**
	 * @generated
	 */
	public ContainmentRelationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ContainmentRelationItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ContainmentRelationOperatorLabelEditPart) {
			((ContainmentRelationOperatorLabelEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureContainmentRelationOperatorFigure());
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
		super.addChildVisual(childEditPart, index);
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ContainmentRelationOperatorLabelEditPart) {
			return true;
		}
		return false;
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
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new ContainmentRelationFigure();
	}

	/**
	 * @generated
	 */
	public ContainmentRelationFigure getPrimaryShape() {
		return (ContainmentRelationFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ContainmentRelationFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureContainmentRelationOperatorFigure;

		/**
		 * @generated
		 */
		public ContainmentRelationFigure() {
			this.setForegroundColor(ColorConstants.black);
			this.setBackgroundColor(ColorConstants.black);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureContainmentRelationOperatorFigure = new WrappingLabel();
			fFigureContainmentRelationOperatorFigure.setText("");

			this.add(fFigureContainmentRelationOperatorFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureContainmentRelationOperatorFigure() {
			return fFigureContainmentRelationOperatorFigure;
		}

	}

}
