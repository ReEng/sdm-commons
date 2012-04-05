/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.fujaba.commons.edit.parts.AbstractEdgeEditPart;
import org.fujaba.commons.edit.parts.AbstractNodeEditPart;
import org.fujaba.commons.notation.Edge;
import org.fujaba.commons.notation.HierarchicalNode;
import org.fujaba.commons.notation.Node;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.editor.gef.edit.commands.DeleteAbstractVariableCommand;
import org.storydriven.modeling.editor.gef.edit.commands.DeleteActivityEdgeCommand;
import org.storydriven.modeling.editor.gef.edit.commands.DeleteActivityNodeCommand;
import org.storydriven.modeling.editor.gef.edit.commands.DeleteBindingExpressionCommand;
import org.storydriven.modeling.editor.gef.edit.commands.DeleteConstraintCommand;
import org.storydriven.modeling.editor.gef.edit.commands.DeleteLinkVariableCommand;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.Constraint;
import org.storydriven.modeling.patterns.LinkVariable;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class ActivityDeleteEditPolicy extends ComponentEditPolicy
{
   @Override
   protected Command createDeleteCommand(GroupRequest request)
   {
      if (request.getEditParts().size() > 0)
      {
         // summarize delete commands for all selected parts
         CompoundCommand compound = new CompoundCommand();

         for (Object part : request.getEditParts())
         {
            if (part instanceof AbstractNodeEditPart)
            {
               Node view = ((AbstractNodeEditPart) part).getModel();
               HierarchicalNode parent = view.getParent();
               EObject model = view.getModel();

               if (model instanceof ActivityNode)
               {
                  compound.add(getActivityNodeDeleteCommand(view, parent));
               }
               else if(model instanceof AbstractVariable)
               {
                  compound.add(getAbstractVariableDeleteCommand(view, parent));
               }
               else if(model instanceof Expression)
               {
                  compound.add(getExpressionDeleteCommand(view, parent));
               }
               else if(model instanceof Constraint)
               {
                  compound.add(getConstraintDeleteCommand(view, parent));
               }
            }
            else if (part instanceof AbstractEdgeEditPart)
            {
               Edge view = ((AbstractEdgeEditPart) part).getModel();
               EObject model = view.getModel();
               if(model instanceof ActivityEdge)
               {
                  compound.add(getActivityEdgeDeleteCommand(view));
               }
               else if(model instanceof LinkVariable)
               {
                  compound.add(getLinkVariableDeleteCommand(view));
               }
            }
         }

         return compound.unwrap();
      }

      return null;
   }
   
   


   private Command getConstraintDeleteCommand(Node view, HierarchicalNode parent)
   {
      return new DeleteConstraintCommand(view, parent);
   }




   private Command getExpressionDeleteCommand(Node view, HierarchicalNode parent)
   {
      if(parent.getModel() instanceof AbstractVariable)
      {
         AbstractVariable av = (AbstractVariable) parent.getModel();
         if(av.getBindingExpression() == view.getModel())
         {
            return new DeleteBindingExpressionCommand(view, parent);
         }
      }
      return null;
   }




   private Command getLinkVariableDeleteCommand(Edge view)
   {
      return new DeleteLinkVariableCommand(view);
   }




   private Command getAbstractVariableDeleteCommand(Node view, HierarchicalNode parent)
   {
      CompoundCommand cmd = new CompoundCommand();

      // add source edges
      for (Edge source : view.getIncoming())
      {
         cmd.add(getLinkVariableDeleteCommand(source));
      }

      // add target edges
      for (Edge target : view.getOutgoing())
      {
         cmd.add(getLinkVariableDeleteCommand(target));
      }
      
      cmd.add(new DeleteAbstractVariableCommand(view, parent));
      return cmd.unwrap();
   }




   /**
    * @param view The view model.
    * @param modelElement The model element.
    * @return Returns the command to delete the connection.
    */
   private Command getActivityEdgeDeleteCommand(Edge view)
   {
      return new DeleteActivityEdgeCommand(view);
   }
   
   /**
    * @param node The view model.
    * @param modelElement The model element.
    * @return Returns the command to delete the pattern node.
    */
   private Command getActivityNodeDeleteCommand(Node node,
         HierarchicalNode parent)
   {
      CompoundCommand cmd = new CompoundCommand();

      // add source edges
      for (Edge source : node.getIncoming())
      {
         cmd.add(getActivityEdgeDeleteCommand(source));
      }

      // add target edges
      for (Edge target : node.getOutgoing())
      {
         cmd.add(getActivityEdgeDeleteCommand(target));
      }

      // add node
      cmd.add(new DeleteActivityNodeCommand(node, parent));

      return cmd.unwrap();
   }
}
