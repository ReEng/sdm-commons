/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.fujaba.commons.edit.commands.AbstractCreateNodeCommand;
import org.fujaba.commons.notation.HierarchicalNode;
import org.storydriven.storydiagrams.activities.StoryNode;
import org.storydriven.storydiagrams.patterns.CollectionVariable;
import org.storydriven.storydiagrams.patterns.PatternsFactory;
import org.storydriven.storydiagrams.patterns.StoryPattern;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class CreateObjectSetVariableCommand extends AbstractCreateNodeCommand
{

   private StoryPattern parent;
   private CollectionVariable objectSetVariable;
   protected static int varNumber = 1;
   /**
    * @param label
    * @param parent
    * @param hierarchical
    * @param children
    */
   public CreateObjectSetVariableCommand(HierarchicalNode parent, Rectangle bounds)
   {
      super("create object set variable", parent, true, null);
      setBounds(bounds);
      assert parent.getModel() instanceof StoryNode;
      this.parent = ((StoryNode)parent.getModel()).getStoryPattern();
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#redoModel()
    */
   @Override
   protected void redoModel()
   {
      if(this.objectSetVariable == null)
      {
         this.objectSetVariable = PatternsFactory.eINSTANCE.createCollectionVariable();
         this.modelElement = this.objectSetVariable;
         this.objectSetVariable.setName("objSet"+ varNumber++);
      }
      
      this.objectSetVariable.setPattern(parent);
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#undoModel()
    */
   @Override
   protected void undoModel()
   {
      this.objectSetVariable.setPattern(null);
   }

}
