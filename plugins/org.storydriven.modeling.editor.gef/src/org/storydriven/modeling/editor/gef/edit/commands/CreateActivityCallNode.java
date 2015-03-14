/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.fujaba.commons.edit.commands.AbstractCreateNodeCommand;
import org.fujaba.commons.notation.HierarchicalNode;
import org.storydriven.storydiagrams.activities.ActivitiesFactory;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityCallNode;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class CreateActivityCallNode extends AbstractCreateNodeCommand
{
   private Activity parentActivity;
   private ActivityCallNode callNode;
   /**
    * @param label
    * @param parent
    * @param hierarchical
    * @param children
    */
   public CreateActivityCallNode(HierarchicalNode parent, Rectangle bounds)
   {
      super("create activity call node", parent, true, null);
      setMinHeight(60);
      setMinWidth(150);
      this.setBounds(bounds);
      assert parent.getModel() instanceof Activity;
      parentActivity = (Activity) parent.getModel();
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#redoModel()
    */
   @Override
   protected void redoModel()
   {
      if(this.callNode == null)
      {
         this.callNode = ActivitiesFactory.eINSTANCE.createActivityCallNode();
         this.modelElement = this.callNode;
      }

      this.callNode.setOwningActivity(parentActivity);
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#undoModel()
    */
   @Override
   protected void undoModel()
   {
      this.callNode.setOwningActivity(null);
   }

}
