/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.commands;

import org.fujaba.commons.edit.commands.AbstractDeleteEdgeCommand;
import org.fujaba.commons.notation.Edge;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityNode;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class DeleteActivityEdgeCommand extends AbstractDeleteEdgeCommand
{
   private ActivityNode sourceNode, targetNode;
   private Activity parent;
   private ActivityEdge transition;
   /**
    * @param label
    * @param edge
    */
   public DeleteActivityEdgeCommand(Edge edge)
   {
      super("delete activity transition", edge);
      this.transition = (ActivityEdge) edge.getModel();
      this.parent = this.transition.getOwningActivity();
      this.sourceNode = this.transition.getSource();
      this.targetNode = this.transition.getTarget();
      this.modelElement = this.transition;
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#redoModel()
    */
   @Override
   protected void redoModel()
   {
      this.transition.setOwningActivity(null);
      this.transition.setSource(null);
      this.transition.setTarget(null);
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#undoModel()
    */
   @Override
   protected void undoModel()
   {
      this.transition.setSource(sourceNode);
      this.transition.setTarget(targetNode);
      this.transition.setOwningActivity(this.parent);
   }

}
