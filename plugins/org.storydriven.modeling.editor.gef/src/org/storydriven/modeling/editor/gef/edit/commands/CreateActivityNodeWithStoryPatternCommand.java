/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.fujaba.commons.edit.commands.AbstractCreateNodeCommand;
import org.fujaba.commons.notation.HierarchicalNode;
import org.storydriven.storydiagrams.activities.ActivitiesFactory;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ModifyingStoryNode;
import org.storydriven.storydiagrams.patterns.PatternsFactory;
import org.storydriven.storydiagrams.patterns.StoryPattern;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class CreateActivityNodeWithStoryPatternCommand extends AbstractCreateNodeCommand
{
   private ModifyingStoryNode activityNode;
   private StoryPattern storyPattern;
   private Activity parentActivity;

   public CreateActivityNodeWithStoryPatternCommand(HierarchicalNode parent, Rectangle bounds)
   {
      super("create story pattern", parent, true, null);
      assert parent.getModel() instanceof Activity;
      parentActivity = (Activity) parent.getModel();
      
      this.setMinHeight(100);
      this.setMinWidth(200);
      this.setBounds(bounds);
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#redoModel()
    */
   @Override
   protected void redoModel()
   {
      if(activityNode == null || storyPattern == null)
      {
         activityNode = ActivitiesFactory.eINSTANCE.createModifyingStoryNode();
         storyPattern = PatternsFactory.eINSTANCE.createStoryPattern();
         activityNode.setOwnedRule(storyPattern);
         this.modelElement = activityNode;
      }
      
      parentActivity.getOwnedActivityNodes().add(activityNode);
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#undoModel()
    */
   @Override
   protected void undoModel()
   {
      parentActivity.getOwnedActivityNodes().remove(this.activityNode);
   }
}
