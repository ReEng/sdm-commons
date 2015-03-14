/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.fujaba.commons.edit.parts.AbstractNodeEditPart;
import org.fujaba.commons.figures.UMLConstraintFigure;
import org.storydriven.modeling.editor.gef.edit.policies.ActivityDeleteEditPolicy;
import org.storydriven.modeling.editor.gef.utils.Expr2String;
import org.storydriven.storydiagrams.patterns.Constraint;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class ConstraintEditPart extends AbstractNodeEditPart
{

   @Override
   public Constraint getRealModel()
   {
      return (Constraint) super.getRealModel();
   }


   @Override
   protected IFigure createFigure()
   {
      return new UMLConstraintFigure(new String());
   }


   @Override
   public void notifyChanged(Notification notification)
   {
      int fid = notification.getFeatureID(Constraint.class);

      if (PatternsPackage.CONSTRAINT__CONSTRAINT_EXPRESSION == fid)
      {
         refreshVisuals();
      }

      super.notifyChanged(notification);
   }


   @Override
   protected void createEditPolicies()
   {
      NonResizableEditPolicy nonResizable = new NonResizableEditPolicy();
      nonResizable.setDragAllowed(false);
      
      installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, nonResizable);
      installEditPolicy(EditPolicy.COMPONENT_ROLE, new ActivityDeleteEditPolicy());
   }


   @Override
   protected void refreshVisuals()
   {
      super.refreshVisuals();

      Constraint model = getRealModel();
      UMLConstraintFigure figure = (UMLConstraintFigure) getFigure();

      String text = Expr2String.toString(model.getConstraintExpression());
      if(text == null)
      {
         text = "...";
      }
      figure.setText(text);

      super.refreshVisuals();
   }
}
