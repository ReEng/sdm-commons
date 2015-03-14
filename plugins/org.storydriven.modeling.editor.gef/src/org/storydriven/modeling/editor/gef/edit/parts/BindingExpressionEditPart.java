/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.fujaba.commons.edit.parts.AbstractNodeEditPart;
import org.fujaba.commons.figures.LabelFigure;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.ExpressionsPackage;
import org.storydriven.modeling.editor.gef.edit.policies.ActivityDeleteEditPolicy;
import org.storydriven.modeling.editor.gef.utils.Expr2String;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class BindingExpressionEditPart extends AbstractNodeEditPart
{

   @Override
   public Expression getRealModel()
   {
      return (Expression) super.getRealModel();
   }
   
   @Override
   protected IFigure createFigure()
   {
      MarginBorder border = new MarginBorder(2, 5, 2, 5);
      LabelFigure figure = new LabelFigure();

      figure.setLabelAlignment(PositionConstants.LEFT);
      figure.setBorder(border);

      return figure;
   }
   
   /**
    * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
    */
   @Override
   protected void createEditPolicies()
   {
      NonResizableEditPolicy nonResizable = new NonResizableEditPolicy();
      nonResizable.setDragAllowed(false);

      installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, nonResizable);
      installEditPolicy(EditPolicy.COMPONENT_ROLE, new ActivityDeleteEditPolicy());
   }

   @Override
   public void notifyChanged(Notification notification)
   {
      int fid = notification.getFeatureID(Expression.class);
      if (ExpressionsPackage.TEXTUAL_EXPRESSION__EXPRESSION_TEXT == fid
            || ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE == fid
            || ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE_VERSION == fid)
      {
         refreshVisuals();
      }

      super.notifyChanged(notification);
   }


   @Override
   protected void refreshVisuals()
   {
      super.refreshVisuals();
      LabelFigure figure = (LabelFigure) getFigure();
      String expressionString = Expr2String.toString(getRealModel());
      figure.setForegroundColor(ColorConstants.darkGreen);
      figure.setText(" := " + expressionString);
   }
}
