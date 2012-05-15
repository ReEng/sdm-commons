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
					.getFigureLinkVariableSourceEndFigure());
			return true;
		}
		if (childEditPart instanceof LinkVariableOperatorLabelEditPart) {
			((LinkVariableOperatorLabelEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureLinkVariableOperatorFigure());
			return true;
		}
		if (childEditPart instanceof LinkVariableTargetEndLabelEditPart) {
			((LinkVariableTargetEndLabelEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureLinkVariableTargetEndFigure());
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
		return new LinkVariableFigure();
	}

	/**
	 * @generated
	 */
	public LinkVariableFigure getPrimaryShape() {
		return (LinkVariableFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkVariableFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkVariableSourceEndFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkVariableOperatorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkVariableTargetEndFigure;

		/**
		 * @generated
		 */
		public LinkVariableFigure() {
			this.setForegroundColor(ColorConstants.black);
			this.setBackgroundColor(ColorConstants.black);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkVariableSourceEndFigure = new WrappingLabel();
			fFigureLinkVariableSourceEndFigure.setText("");

			this.add(fFigureLinkVariableSourceEndFigure);

			fFigureLinkVariableOperatorFigure = new WrappingLabel();
			fFigureLinkVariableOperatorFigure.setText("");

			this.add(fFigureLinkVariableOperatorFigure);

			fFigureLinkVariableTargetEndFigure = new WrappingLabel();
			fFigureLinkVariableTargetEndFigure.setText("");

			this.add(fFigureLinkVariableTargetEndFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkVariableSourceEndFigure() {
			return fFigureLinkVariableSourceEndFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkVariableOperatorFigure() {
			return fFigureLinkVariableOperatorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkVariableTargetEndFigure() {
			return fFigureLinkVariableTargetEndFigure;
		}

	}

}
