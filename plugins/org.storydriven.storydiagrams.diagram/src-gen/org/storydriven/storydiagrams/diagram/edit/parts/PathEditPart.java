package org.storydriven.storydiagrams.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.diagram.edit.policies.PathItemSemanticEditPolicy;

/**
 * @generated
 */
public class PathEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4003;

	/**
	 * @generated
	 */
	public PathEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new PathItemSemanticEditPolicy());
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
		return new PathFigure();
	}

	/**
	 * @generated
	 */
	public PathFigure getPrimaryShape() {
		return (PathFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class PathFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePathDescription;

		/**
		 * @generated
		 */
		public PathFigure() {
			this.setForegroundColor(ColorConstants.lightBlue);
			this.setBackgroundColor(ColorConstants.lightBlue);

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigurePathDescription = new WrappingLabel();
			fFigurePathDescription.setText("");

			this.add(fFigurePathDescription);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			df.setForegroundColor(ColorConstants.black);
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePathDescription() {
			return fFigurePathDescription;
		}

	}

}
