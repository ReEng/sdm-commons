package org.storydriven.modeling.editor.gef.edit.policies;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.fujaba.commons.edit.parts.AbstractDiagramEditPart;
import org.fujaba.commons.edit.policies.AbstractLayoutEditPolicy;
import org.storydriven.modeling.editor.gef.edit.commands.CreateConstraintCommand;
import org.storydriven.modeling.editor.gef.edit.commands.CreateObjectSetVariableCommand;
import org.storydriven.modeling.editor.gef.edit.commands.CreateObjectVariableCommand;
import org.storydriven.modeling.editor.gef.edit.commands.CreatePrimitveVariableCommand;
import org.storydriven.modeling.patterns.Constraint;
import org.storydriven.modeling.patterns.ObjectSetVariable;
import org.storydriven.modeling.patterns.ObjectVariable;
import org.storydriven.modeling.patterns.PrimitiveVariable;

public class StoryPatternLayoutEditPolicy extends AbstractLayoutEditPolicy
{

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
         if (ObjectSetVariable.class.isAssignableFrom(type))
         {
            return new CreateObjectSetVariableCommand(host.getModel(), getBounds(request));
         }
         if (ObjectVariable.class.isAssignableFrom(type))
         {
            return new CreateObjectVariableCommand(host.getModel(), getBounds(request));
         }
         if (PrimitiveVariable.class.isAssignableFrom(type))
         {
            return new CreatePrimitveVariableCommand(host.getModel(), getBounds(request));
         }
         if (Constraint.class.isAssignableFrom(type))
         {
            return new CreateConstraintCommand(host.getModel(), getBounds(request));
         }
      }
      return null;
   }

   private Rectangle getBounds(CreateRequest req)
   {
      return (Rectangle) getConstraintFor(req);
   }
}
