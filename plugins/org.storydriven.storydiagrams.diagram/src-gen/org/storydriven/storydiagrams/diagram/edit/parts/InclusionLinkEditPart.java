package org.storydriven.storydiagrams.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.diagram.edit.policies.InclusionLinkItemSemanticEditPolicy;

/**
 * @generated
 */
public class InclusionLinkEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4007;

	/**
	 * @generated
	 */
	public InclusionLinkEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new InclusionLinkItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ContainmentRelationOperatorLabelEditPart) {
			((ContainmentRelationOperatorLabelEditPart) childEditPart).setLabel(getPrimaryShape()
					.getContainmentRelationOperatorFigure());
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
		return new InclusionLinkFigureDescriptor();
	}

	/**
	 * @generated
	 */
	public InclusionLinkFigureDescriptor getPrimaryShape() {
		return (InclusionLinkFigureDescriptor) getFigure();
	}

	/**
	 * @generated
	 */
	public class InclusionLinkFigureDescriptor extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fContainmentRelationOperatorFigure;

		/**
		 * @generated
		 */
		public InclusionLinkFigureDescriptor() {
			this.setForegroundColor(ColorConstants.black);
			this.setBackgroundColor(ColorConstants.black);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fContainmentRelationOperatorFigure = new WrappingLabel();
			fContainmentRelationOperatorFigure.setText("");

			this.add(fContainmentRelationOperatorFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getContainmentRelationOperatorFigure() {
			return fContainmentRelationOperatorFigure;
		}

	}

}
