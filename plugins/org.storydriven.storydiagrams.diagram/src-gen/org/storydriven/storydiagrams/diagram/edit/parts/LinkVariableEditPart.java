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
import org.storydriven.storydiagrams.diagram.edit.policies.LinkVariableItemSemanticEditPolicy;

/**
 * @generated
 */
public class LinkVariableEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4002;

	/**
	 * @generated
	 */
	public LinkVariableEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new LinkVariableItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof LinkVariableSourceEndLabelEditPart) {
			((LinkVariableSourceEndLabelEditPart) childEditPart).setLabel(getPrimaryShape()
					.getLinkVariableSourceEndFigure());
			return true;
		}
		if (childEditPart instanceof LinkVariableOperatorLabelEditPart) {
			((LinkVariableOperatorLabelEditPart) childEditPart).setLabel(getPrimaryShape()
					.getLinkVariableOperatorFigure());
			return true;
		}
		if (childEditPart instanceof LinkVariableTargetEndLabelEditPart) {
			((LinkVariableTargetEndLabelEditPart) childEditPart).setLabel(getPrimaryShape()
					.getLinkVariableTargetEndFigure());
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
		if (childEditPart instanceof LinkVariableSourceEndLabelEditPart) {
			return true;
		}
		if (childEditPart instanceof LinkVariableOperatorLabelEditPart) {
			return true;
		}
		if (childEditPart instanceof LinkVariableTargetEndLabelEditPart) {
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
		return new LinkVariableFigureDescriptor();
	}

	/**
	 * @generated
	 */
	public LinkVariableFigureDescriptor getPrimaryShape() {
		return (LinkVariableFigureDescriptor) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkVariableFigureDescriptor extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fLinkVariableSourceEndFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fLinkVariableOperatorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fLinkVariableTargetEndFigure;

		/**
		 * @generated
		 */
		public LinkVariableFigureDescriptor() {
			this.setForegroundColor(ColorConstants.black);
			this.setBackgroundColor(ColorConstants.black);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fLinkVariableSourceEndFigure = new WrappingLabel();
			fLinkVariableSourceEndFigure.setText("");

			this.add(fLinkVariableSourceEndFigure);

			fLinkVariableOperatorFigure = new WrappingLabel();
			fLinkVariableOperatorFigure.setText("");

			this.add(fLinkVariableOperatorFigure);

			fLinkVariableTargetEndFigure = new WrappingLabel();
			fLinkVariableTargetEndFigure.setText("");

			this.add(fLinkVariableTargetEndFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getLinkVariableSourceEndFigure() {
			return fLinkVariableSourceEndFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getLinkVariableOperatorFigure() {
			return fLinkVariableOperatorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getLinkVariableTargetEndFigure() {
			return fLinkVariableTargetEndFigure;
		}

	}

}
