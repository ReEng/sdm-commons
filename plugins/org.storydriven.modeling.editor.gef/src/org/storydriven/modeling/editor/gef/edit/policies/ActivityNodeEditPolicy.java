/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.fujaba.commons.edit.parts.AbstractNodeViewEditPart;
import org.fujaba.commons.notation.Node;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.editor.gef.edit.commands.CreateActivityEdgeCommand;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class ActivityNodeEditPolicy extends GraphicalNodeEditPolicy
{
   @Override
   protected Command getConnectionCompleteCommand(
         CreateConnectionRequest request)
   {
      if (request.getStartCommand() instanceof CreateActivityEdgeCommand)
      {
         CreateActivityEdgeCommand link = (CreateActivityEdgeCommand) request
               .getStartCommand();
         EObject source = link.getSource().getModel();
         EObject target = ((AbstractNodeViewEditPart) getHost()).getRealModel();

         // don't allow self-references
         if (source == target)
         {
            return null;
         }

         // check valid link between two nodes
         if (source instanceof ActivityNode && target instanceof ActivityNode)
         {
            link.setTarget((Node) getHost().getModel());
            return link;
         }
      }

      return null;
   }


   @Override
   protected Command getConnectionCreateCommand(CreateConnectionRequest request)
   {
      Command command = null;

      if (request.getNewObject() instanceof ActivityEdge)
      {
         Node sourceNode = (Node) getHost().getModel();
         command = new CreateActivityEdgeCommand(sourceNode);
      }


      if (command != null)
      {
         request.setStartCommand(command);
      }
      return command;
   }


   @Override
   protected Command getReconnectTargetCommand(ReconnectRequest request)
   {
      // TODO Auto-generated method stub
      return null;
   }


   @Override
   protected Command getReconnectSourceCommand(ReconnectRequest request)
   {
      // TODO Auto-generated method stub
      return null;
   }
}
