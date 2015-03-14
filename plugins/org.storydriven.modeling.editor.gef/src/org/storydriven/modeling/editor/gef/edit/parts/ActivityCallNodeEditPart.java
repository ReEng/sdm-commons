/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.fujaba.commons.edit.parts.AbstractDiagramEditPart;
import org.fujaba.commons.edit.policies.AbstractLayoutEditPolicy;
import org.fujaba.commons.notation.Edge;
import org.storydriven.modeling.editor.gef.edit.policies.ActivityNodeEditPolicy;
import org.storydriven.modeling.editor.gef.figures.UMLActivityChopboxAnchor;
import org.storydriven.modeling.editor.gef.figures.UMLStoryActivityFigure;
import org.storydriven.modeling.editor.gef.utils.Expr2String;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityCallNode;
import org.storydriven.storydiagrams.calls.ParameterBinding;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class ActivityCallNodeEditPart extends AbstractDiagramEditPart
{

   /**
    * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
    */
   @Override
   protected IFigure createFigure()
   {
      String name = null;
      name = getCallLabel();
      UMLStoryActivityFigure figure = new UMLStoryActivityFigure();
      figure.setName(name);
      figure.setBackgroundColor(ColorConstants.lightGray);
      this.anchor = new UMLActivityChopboxAnchor(figure);
      return figure;
   }

   private String getCallLabel()
   {
      String name = null;
      Activity activity = (Activity) getRealModel().getCallee();
      if (activity != null)
      {
         EOperation operation = activity.getOwningOperation().getOperation();
         if (!activity.getOutParameters().isEmpty())
         {
            EParameter param = activity.getOutParameters().get(0);
            for (ParameterBinding binding : getRealModel().getOwnedParameterBindings())
            {
               if (binding.getParameter() == param)
               {
                  name = Expr2String.toString(binding.getValueExpression()) + " := ";
               }
            }
            
            

            if (name == null)
            {
               name = "";
            }
         }
         else
         {
            name = "void ";
         }
         
         name += operation.getName() + "(";
         for (EParameter param : operation.getEParameters())
         {
            boolean found = false;
            for (ParameterBinding binding : getRealModel().getOwnedParameterBindings())
            {
               if (binding.getParameter() == param)
               {
                  name += Expr2String.toString(binding.getValueExpression()) + ",";
                  found = true;
               }
            }
            
            if(!found)
            {
               name += "null,";
            }
         }
         int  lastComma = name.lastIndexOf(",");
         if(lastComma > -1)
         {
            name = name.substring(0, lastComma);
         }
         name += ")";
      }
      else
      {
         name = "select activity to call";
      }
      return name;
   }

   /**
    * @see de.uni_paderborn.fujaba4eclipse.edit.editparts.AbstractBoundedASGEditPart#refreshVisuals()
    */
   @Override
   protected void refreshVisuals()
   {
      ((UMLStoryActivityFigure)getFigure()).setName(getCallLabel());
      super.refreshVisuals();
   }
   
   /**
    * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
    */
   @Override
   protected void createEditPolicies()
   {
      installEditPolicy(EditPolicy.COMPONENT_ROLE, new AbstractLayoutEditPolicy()
      {
         
         @Override
         protected Command getCreateCommand(CreateRequest request)
         {
            return null;
         }
      });
      installEditPolicy(EditPolicy.NODE_ROLE, new ActivityNodeEditPolicy());
   }

   @Override
   public ActivityCallNode getRealModel()
   {
      return (ActivityCallNode) super.getRealModel();
   }

   @Override
   public void notifyChanged(Notification notification)
   {
      int featureID = notification.getFeatureID(Edge.class);
      if(featureID == ActivitiesPackage.ACTIVITY_CALL_NODE__CALLED_ACTIVITY
            || featureID == ActivitiesPackage.ACTIVITY_CALL_NODE__NAME)
      {
         refreshVisuals();
      }
      else if( featureID == ActivitiesPackage.ACTIVITY_CALL_NODE__CALLEE)
      {
         refreshVisuals();
      }
      else
      {
         super.notifyChanged(notification);
      }
   }
}
