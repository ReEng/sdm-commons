package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.diagram.custom.util.SdmUtility;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableNameEditPart;
import org.storydriven.storydiagrams.patterns.ObjectVariable;

public class CustomObjectVariableNameLabelEditPart extends
		ObjectVariableNameEditPart {

		public CustomObjectVariableNameLabelEditPart(View view)
		{
			super(view);
		}

		@Override
		protected void handleNotificationEvent(Notification event)
		{
			if (event.getNotifier() instanceof ObjectVariable)
			{
				SdmUtility.adaptColor(getFigure(), ((ObjectVariable) ((View) this.getModel()).getElement()).getBindingOperator());
			}

			super.handleNotificationEvent(event);
			
		
		}

		@Override
		protected void refreshVisuals()
		{
			super.refreshVisuals();
			SdmUtility.adaptColor(getFigure(), ((ObjectVariable) ((View) this.getModel()).getElement()).getBindingOperator());
			
			((WrappingLabel) getFigure()).setTextUnderline(true);
		}

}
