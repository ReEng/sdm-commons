/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.fujaba.commons.edit.commands.AbstractCreateNodeCommand;
import org.fujaba.commons.notation.HierarchicalNode;
import org.storydriven.modeling.activities.ActivitiesFactory;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.StopNode;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class CreateStopNodeCommand extends AbstractCreateNodeCommand
{
   private StopNode stopNode;
   private Activity parentActivity;
   /**
    * @param label
    * @param parent
    * @param hierarchical
    * @param children
    */
   public CreateStopNodeCommand(HierarchicalNode parent, Rectangle bounds)
   {
      super("create stop node", parent, false, null);
      this.setMinWidth(30);
      bounds.height = 25;
      bounds.width = 25;
      setBounds(bounds);
      assert parent.getModel() instanceof Activity;
      parentActivity = (Activity) parent.getModel();
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#redoModel()
    */
   @Override
   protected void redoModel()
   {
      if(this.stopNode == null)
      {
         this.stopNode = ActivitiesFactory.eINSTANCE.createStopNode();
         this.modelElement = this.stopNode;
      }

      this.stopNode.setOwningActivity(parentActivity);
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#undoModel()
    */
   @Override
   protected void undoModel()
   {
      this.stopNode.setOwningActivity(null);
   }

}
