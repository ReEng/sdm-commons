package org.storydriven.modeling.diagram.custom.edit.parts;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.storydriven.modeling.diagram.edit.parts.ActivityCallNodeEditPart;

public class CustomActivityCallNodeEditPart extends ActivityCallNodeEditPart {

	public CustomActivityCallNodeEditPart(View view) {
		super(view);
		// TODO Auto-generated constructor stub
	}

	public class ActivityCallNodeFigureNEW extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureActivityCallNodeNewName;

		/**
		 * @generated
		 */
		public ActivityCallNodeFigureNEW() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setBackgroundColor(THIS_BACK);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureActivityCallNodeNewName = new WrappingLabel();
			fFigureActivityCallNodeNewName.setText("");
			fFigureActivityCallNodeNewName.setAlignment(PositionConstants.CENTER);

			this.add(fFigureActivityCallNodeNewName);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureActivityCallNodeNewName() {
			return fFigureActivityCallNodeNewName;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 230, 230, 230);

}
