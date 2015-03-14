/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.parts;


import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.fujaba.commons.figures.LabelFigure;
import org.storydriven.core.expressions.Expression;
import org.storydriven.modeling.editor.gef.figures.CircleChopboxAnchor;
import org.storydriven.modeling.editor.gef.figures.UMLStopActivityFigure;
import org.storydriven.modeling.editor.gef.utils.Expr2String;
import org.storydriven.storydiagrams.activities.ActivityFinalNode;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class StopNodeEditPart extends ActivityNodeEditPart
{

   private Label returnValueLabel = null;
   
   /**
    * @return   No description provided
    * @see      org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
    */
   @Override
   protected IFigure createFigure()
   {
      IFigure figure = new UMLStopActivityFigure (ColorConstants.white);
      this.anchor = new CircleChopboxAnchor (figure);
      figure.setOpaque (true);
      return figure;
   }
   
   /**
    * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
    */
   @Override
   protected void createEditPolicies()
   {
      super.createEditPolicies();
   }
   
   /**
    * @see de.uni_paderborn.fujaba4eclipse.edit.editparts.AbstractBoundedASGEditPart#refreshVisuals()
    */
   @Override
   protected void refreshVisuals()
   {
      super.refreshVisuals();
      
      // create/remove/update return value label
      ActivityFinalNode activity = this.getRealModel();
      Expression expression = activity.getReturnValue();
     
      if (expression != null)
      {
         String returnValue = "return " + Expr2String.toString(expression) + ";";
         IFigure parentFigure = this.getFigure().getParent();
         
         if (this.returnValueLabel == null)
         {
            LabelFigure label = new LabelFigure();
            label.setText(returnValue);
            label.setAutosized(true);
            label.setOpaque(true);
            this.returnValueLabel = label;
            
            
            if (parentFigure != null)
            {
               parentFigure.add(this.returnValueLabel);
               
            }
         }
         
         if(returnValueLabel.getParent() == parentFigure)
         {
            Point p = getFigure().getBounds().getBottom();
            p = new Point(p);
            p.setLocation(p.x - 30, p.y + 10);
            parentFigure.setConstraint(this.returnValueLabel, new Rectangle(p, returnValueLabel.getSize()));
         }
         this.returnValueLabel.setText(returnValue);
      }
      else
      {
         if (this.returnValueLabel != null)
         {
            IFigure parentFigure = this.getFigure().getParent();
            if (parentFigure != null)
            {
               parentFigure.remove(this.returnValueLabel);
               this.returnValueLabel = null;
            }
         }
      }
   }

   @Override
   public ActivityFinalNode getRealModel()
   {
      return (ActivityFinalNode)super.getRealModel();
   }

}
