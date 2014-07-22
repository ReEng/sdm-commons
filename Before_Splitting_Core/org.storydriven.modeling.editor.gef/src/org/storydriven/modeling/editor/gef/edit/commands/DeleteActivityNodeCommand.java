/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.commands;

import org.fujaba.commons.edit.commands.AbstractDeleteNodeCommand;
import org.fujaba.commons.notation.HierarchicalNode;
import org.fujaba.commons.notation.Node;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityCallNode;
import org.storydriven.modeling.activities.ActivityNode;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class DeleteActivityNodeCommand extends AbstractDeleteNodeCommand
{

   private ActivityNode activityNode;
   private Activity parent;
   /**
    * @param label
    * @param node
    * @param parent
    */
   public DeleteActivityNodeCommand(Node node, HierarchicalNode parent)
   {
      super("delete activity call", node, parent);
      this.activityNode = (ActivityNode) node.getModel();
      this.parent = (Activity) parent.getModel();
      this.modelElement = this.activityNode;
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#redoModel()
    */
   @Override
   protected void redoModel()
   {
      this.activityNode.setOwningActivity(null);
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#undoModel()
    */
   @Override
   protected void undoModel()
   {
      this.activityNode.setOwningActivity(parent);
   }

}
