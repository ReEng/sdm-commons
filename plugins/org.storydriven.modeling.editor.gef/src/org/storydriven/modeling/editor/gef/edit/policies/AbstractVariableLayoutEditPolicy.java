/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.policies;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.fujaba.commons.edit.parts.AbstractDiagramEditPart;
import org.fujaba.commons.edit.policies.AbstractLayoutEditPolicy;
import org.storydriven.modeling.editor.gef.edit.commands.CreateBindingExpressionCommand;
import org.storydriven.modeling.editor.gef.edit.commands.CreateConstraintCommand;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.Constraint;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class AbstractVariableLayoutEditPolicy extends AbstractLayoutEditPolicy
{

   @Override
   protected Command getMoveChildrenCommand(Request request)
   {
      return null;
   }

   /**
    * @see org.eclipse.gef.editpolicies.LayoutEditPolicy#getCreateCommand(org.eclipse.gef.requests.CreateRequest)
    */
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
         if (Expression.class.isAssignableFrom(type))
         {
            AbstractVariable var = (AbstractVariable) host.getRealModel();
            if(var.getBindingExpression() != null)
            {
               return null;
            }
            return new CreateBindingExpressionCommand(host.getModel());
         }
         if (Constraint.class.isAssignableFrom(type))
         {
            Rectangle rect = new Rectangle(request.getLocation(), new Dimension(15, 50));
            return new CreateConstraintCommand(host.getModel(), rect);
         }
      }
      return null;
   }   
}
