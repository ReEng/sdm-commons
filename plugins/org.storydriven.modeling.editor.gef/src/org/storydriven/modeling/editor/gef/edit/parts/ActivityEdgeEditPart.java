/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.fujaba.commons.edit.parts.AbstractEdgeEditPart;
import org.fujaba.commons.figures.utils.ConnectionDecorationFactory;
import org.fujaba.commons.notation.Edge;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.EdgeGuard;
import org.storydriven.modeling.editor.gef.utils.Expr2String;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class ActivityEdgeEditPart extends AbstractEdgeEditPart
{

   @Override
   public ActivityEdge getRealModel()
   {
      return (ActivityEdge) super.getRealModel();
   }

   @Override
   protected IFigure createFigure()
   {
      IFigure figure = super.createFigure();
      placeLabel(((ActivityEdge)this.getRealModel()).getGuard().toString());
      connection.setTargetDecoration(ConnectionDecorationFactory.createDecoration(ConnectionDecorationFactory.OPEN_ARROW));
      return figure;
   }

   @Override
   protected void refreshVisuals()
   {
      super.refreshVisuals();
      ActivityEdge model = getRealModel();
      String label = "";
      if(model.getGuard() != EdgeGuard.NONE)
      {
         label = this.getRealModel().getGuard().toString();
      }
      
      if(model.getGuardExpression() != null)
      {
         label+= " [ "+ Expr2String.toString(model.getGuardExpression()) +" ] ";
      }
      
      placeLabel(label);
   }

   @Override
   public void notifyChanged(Notification notification)
   {
      int featureID = notification.getFeatureID(Edge.class);
      if(featureID == ActivitiesPackage.ACTIVITY_EDGE__GUARD
            || featureID == ActivitiesPackage.ACTIVITY_EDGE__GUARD_EXPRESSION)
      {
         refreshVisuals();
      }
      super.notifyChanged(notification);
   }

}
