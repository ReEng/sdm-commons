package de.upb.swt.core.ui.properties.tests.model.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import de.upb.swt.core.ui.properties.tests.model.diagram.edit.policies.ReferenceItemSemanticEditPolicy;

/**
 * @generated
 */
public class ReferenceEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public ReferenceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ReferenceItemSemanticEditPolicy());
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
		return new ReferenceFigure();
	}

	/**
	 * @generated
	 */
	public ReferenceFigure getPrimaryShape() {
		return (ReferenceFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ReferenceFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureReferenceNameFigure;

		/**
		 * @generated
		 */
		public ReferenceFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureReferenceNameFigure = new WrappingLabel();

			fFigureReferenceNameFigure.setText("<...>");

			this.add(fFigureReferenceNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureReferenceNameFigure() {
			return fFigureReferenceNameFigure;
		}

	}

}
