/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.policies;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.fujaba.commons.edit.parts.AbstractDiagramEditPart;
import org.fujaba.commons.edit.policies.AbstractLayoutEditPolicy;
import org.storydriven.modeling.editor.gef.edit.commands.CreateActivityCallNode;
import org.storydriven.modeling.editor.gef.edit.commands.CreateActivityNodeWithStoryPatternCommand;
import org.storydriven.modeling.editor.gef.edit.commands.CreateJunctionNodeCommand;
import org.storydriven.modeling.editor.gef.edit.commands.CreateStopNodeCommand;
import org.storydriven.storydiagrams.activities.ActivityCallNode;
import org.storydriven.storydiagrams.activities.ActivityFinalNode;
import org.storydriven.storydiagrams.activities.JunctionNode;
import org.storydriven.storydiagrams.activities.ModifyingStoryNode;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class ActivityLayoutEditPolicy extends AbstractLayoutEditPolicy
{

   @Override
   protected Command createChangeConstraintCommand(EditPart child,
         Object constraint)
   {
//      if(child instanceof AbstractNodeViewEditPart)
//      {
//         EObject o = ((AbstractNodeViewEditPart)child).getModel().getModel();
//         if(o instanceof StopNode 
//               || o instanceof StartNode)
//         return null;
//      }
      return super.createChangeConstraintCommand(child, constraint);
   }


   @Override
   protected Command getCreateCommand(CreateRequest request)
   {
      if (getHost() instanceof AbstractDiagramEditPart
            && request.getNewObjectType() instanceof Class<?>)
      {
         // deliver those
         AbstractDiagramEditPart host = (AbstractDiagramEditPart) getHost();
         Class<?> type = (Class<?>) request.getNewObjectType();
         // decide which element to create
         if (ModifyingStoryNode.class.isAssignableFrom(type))
         {
            return new CreateActivityNodeWithStoryPatternCommand(host.getModel(), getBounds(request));
         }
         if (ActivityFinalNode.class.isAssignableFrom(type))
         {
            return new CreateStopNodeCommand(host.getModel(), getBounds(request));
         }
         if (JunctionNode.class.isAssignableFrom(type))
         {
            return new CreateJunctionNodeCommand(host.getModel(), getBounds(request));
         }
         if (ActivityCallNode.class.isAssignableFrom(type))
         {
            return new CreateActivityCallNode(host.getModel(), getBounds(request));
         }
      }
      return null;
   }
   

   private Rectangle getBounds(CreateRequest req)
   {
      return (Rectangle) getConstraintFor(req);
   }
}
