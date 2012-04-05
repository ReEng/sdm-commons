/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.fujaba.commons.edit.commands.AbstractCreateNodeCommand;
import org.fujaba.commons.notation.HierarchicalNode;
import org.storydriven.modeling.activities.ActivitiesFactory;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.JunctionNode;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class CreateJunctionNodeCommand extends AbstractCreateNodeCommand
{
   private Activity parentActivity;
   private JunctionNode junctionNode;
   /**
    * @param label
    * @param parent
    * @param hierarchical
    * @param children
    */
   public CreateJunctionNodeCommand(HierarchicalNode parent, Rectangle bounds)
   {
      super("create junction node", parent, false, null);
      this.setMinWidth(30);
      bounds.height = 30;
      bounds.width = 30;
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
      if(junctionNode == null)
      {
         this.junctionNode = ActivitiesFactory.eINSTANCE.createJunctionNode();
         this.modelElement = this.junctionNode;
      }

      this.junctionNode.setOwningActivity(parentActivity);
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#undoModel()
    */
   @Override
   protected void undoModel()
   {
      this.junctionNode.setOwningActivity(null);
   }

}
