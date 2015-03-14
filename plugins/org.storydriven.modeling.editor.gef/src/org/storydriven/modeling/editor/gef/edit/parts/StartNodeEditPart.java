/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.storydriven.modeling.editor.gef.edit.policies.ActivityNodeEditPolicy;
import org.storydriven.modeling.editor.gef.figures.UMLStartActivityChopboxAnchor;
import org.storydriven.modeling.editor.gef.figures.UMLStartActivityFigure;
import org.storydriven.storydiagrams.activities.InitialNode;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class StartNodeEditPart extends ActivityNodeEditPart
{
   @Override
   protected IFigure createFigure() 
   {
      UMLStartActivityFigure figure = new UMLStartActivityFigure(getRealModel().getName());

      this.anchor = new UMLStartActivityChopboxAnchor(figure);
      return figure;
   }

   /**
    * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
    */
   @Override
   protected void createEditPolicies()
   {
      installEditPolicy(EditPolicy.NODE_ROLE, new ActivityNodeEditPolicy());
   }

   @Override
   public InitialNode getRealModel()
   {
      return (InitialNode)super.getRealModel();
   }
   
   /**
    * @see org.eclipse.gef.editparts.AbstractEditPart#refreshVisuals()
    */
   @Override
   protected void refreshVisuals() 
   {
      ((UMLStartActivityFigure) this.getFigure()).setName(this.getRealModel().getName());
      ((GraphicalEditPart) getParent()).setLayoutConstraint(this, getFigure(), new Rectangle(getModel().getX(), getModel().getY(), getModel().getWidth(), getModel().getHeight()));
   }

}
