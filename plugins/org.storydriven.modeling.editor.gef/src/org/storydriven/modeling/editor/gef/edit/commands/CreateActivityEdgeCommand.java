/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.commands;

import org.fujaba.commons.edit.commands.AbstractCreateEdgeCommand;
import org.fujaba.commons.notation.Node;
import org.storydriven.modeling.activities.ActivitiesFactory;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.ActivityNode;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class CreateActivityEdgeCommand extends AbstractCreateEdgeCommand
{
   private ActivityEdge edge;
   private Activity activityParent;
   private ActivityNode sourceActivityNode, targetActivityNode;
   
   /**
    * @param label
    * @param source
    */
   public CreateActivityEdgeCommand(Node source)
   {
      super("create activity transition", source);
      this.setSource(source);
      this.sourceActivityNode = (ActivityNode) source.getModel();
      this.activityParent = sourceActivityNode.getOwningActivity();
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#redoModel()
    */
   @Override
   protected void redoModel()
   {
      this.targetActivityNode = (ActivityNode) this.getTarget().getModel();

      if (this.edge == null)
      {
         this.edge = ActivitiesFactory.eINSTANCE.createActivityEdge();
         this.modelElement = this.edge;
      }

      this.edge.setSource(sourceActivityNode);
      this.edge.setTarget(targetActivityNode);
      this.edge.setOwningActivity(activityParent);
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#undoModel()
    */
   @Override
   protected void undoModel()
   {
      this.edge.setSource(null);
      this.edge.setTarget(null);
      this.edge.setOwningActivity(null);
   }

}
