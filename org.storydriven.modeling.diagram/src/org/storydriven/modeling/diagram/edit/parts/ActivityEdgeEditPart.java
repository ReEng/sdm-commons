package org.storydriven.modeling.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.modeling.diagram.edit.policies.ActivityEdgeItemSemanticEditPolicy;

/**
 * @generated
 */
public class ActivityEdgeEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public ActivityEdgeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ActivityEdgeItemSemanticEditPolicy());
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
		return new ActivityEdgeFigure();
	}

	/**
	 * @generated
	 */
	public ActivityEdgeFigure getPrimaryShape() {
		return (ActivityEdgeFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ActivityEdgeFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureActivityEdgeGuardTypeFigure;

		/**
		 * @generated
		 */
		public ActivityEdgeFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureActivityEdgeGuardTypeFigure = new WrappingLabel();
			fFigureActivityEdgeGuardTypeFigure.setText("");

			this.add(fFigureActivityEdgeGuardTypeFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureActivityEdgeGuardTypeFigure() {
			return fFigureActivityEdgeGuardTypeFigure;
		}

	}

}
