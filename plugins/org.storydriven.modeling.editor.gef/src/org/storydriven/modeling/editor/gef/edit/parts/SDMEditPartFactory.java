/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.parts;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.fujaba.commons.notation.DiagramElement;
import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityCallNode;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityFinalNode;
import org.storydriven.storydiagrams.activities.InitialNode;
import org.storydriven.storydiagrams.activities.JunctionNode;
import org.storydriven.storydiagrams.activities.StoryNode;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.Constraint;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.PrimitiveVariable;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class SDMEditPartFactory implements EditPartFactory
{

   /**
    * @see org.eclipse.gef.EditPartFactory#createEditPart(org.eclipse.gef.EditPart, java.lang.Object)
    */
   @Override
   public EditPart createEditPart(EditPart context, Object model)
   {

      EObject realModel = null;
      DiagramElement view = null;
      EditPart part = null;

      if (model instanceof DiagramElement)
      {
         view = (DiagramElement) model;
         realModel = view.getModel();
      }
      else
      {
         return null;
      }

      if (realModel instanceof Activity)
      {
         part = new ActivityEditPart();
      }
      else if (realModel instanceof InitialNode)
      {
         part = new StartNodeEditPart();
      }
      else if (realModel instanceof ActivityFinalNode)
      {
         part = new StopNodeEditPart();
      }
      else if (realModel instanceof StoryNode)
      {
         part = new StoryNodeEditPart();
      }
      else if (realModel instanceof ActivityCallNode)
      {
         part = new ActivityCallNodeEditPart();
      }
      else if (realModel instanceof JunctionNode)
      {
         part = new JunctionNodeEditPart();
      }
      else if (realModel instanceof ActivityEdge)
      {
         part = new ActivityEdgeEditPart();
      }
      else if (realModel instanceof ObjectVariable)
      {
         part = new ObjectVariableEditPart();
      }
      else if (realModel instanceof AbstractLinkVariable)
      {
         part = new LinkVariableEditPart();
      }
      else if (realModel instanceof PrimitiveVariable)
      {
         part = new PrimitiveVariableEditPart();
      }
      else if (realModel instanceof Expression)
      {
         part = new BindingExpressionEditPart();
      }
      else if (realModel instanceof Constraint)
      {
         part = new ConstraintEditPart();
      }
      
      

      if (view != null && part != null)
      {
         part.setModel(view);
      }
      return part;
   }

}
