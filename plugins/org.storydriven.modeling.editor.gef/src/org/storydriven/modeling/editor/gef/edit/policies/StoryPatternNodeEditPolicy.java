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
import org.storydriven.modeling.editor.gef.edit.commands.CreateLinkVariableCommand;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.LinkVariable;
import org.storydriven.storydiagrams.patterns.ObjectVariable;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class StoryPatternNodeEditPolicy extends GraphicalNodeEditPolicy
{

   /**
    * @see org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy#getConnectionCompleteCommand(org.eclipse.gef.requests.CreateConnectionRequest)
    */
   @Override
   protected Command getConnectionCompleteCommand(CreateConnectionRequest request)
   {
   // validate PSLink
      if (request.getStartCommand() instanceof CreateLinkVariableCommand)
      {
         CreateLinkVariableCommand link = (CreateLinkVariableCommand) request
               .getStartCommand();
         EObject source = link.getSource().getModel();
         EObject target = ((AbstractNodeViewEditPart) getHost()).getRealModel();

         // check valid link between two nodes
         if (source instanceof ObjectVariable && target instanceof AbstractVariable)
         {
            link.setTarget((Node) getHost().getModel());
            return link;
         }
      }
      return null;
   }


   /**
    * @see org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy#getConnectionCreateCommand(org.eclipse.gef.requests.CreateConnectionRequest)
    */
   @Override
   protected Command getConnectionCreateCommand(CreateConnectionRequest request)
   {
      Command command = null;

      if (request.getNewObject() instanceof LinkVariable)
      {
         Node sourceNode = (Node) getHost().getModel();
         if(sourceNode.getModel() instanceof ObjectVariable)
         {
            command = new CreateLinkVariableCommand(sourceNode);
         }
      }


      if (command != null)
      {
         request.setStartCommand(command);
      }
      return command;
   }


   /**
    * @see org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy#getReconnectTargetCommand(org.eclipse.gef.requests.ReconnectRequest)
    */
   @Override
   protected Command getReconnectTargetCommand(ReconnectRequest request)
   {
      // TODO Auto-generated method stub
      return null;
   }


   /**
    * @see org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy#getReconnectSourceCommand(org.eclipse.gef.requests.ReconnectRequest)
    */
   @Override
   protected Command getReconnectSourceCommand(ReconnectRequest request)
   {
      // TODO Auto-generated method stub
      return null;
   }

}
