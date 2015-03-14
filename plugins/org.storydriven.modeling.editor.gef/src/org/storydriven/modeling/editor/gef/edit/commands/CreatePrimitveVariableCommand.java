/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.fujaba.commons.edit.commands.AbstractCreateNodeCommand;
import org.fujaba.commons.notation.HierarchicalNode;
import org.storydriven.storydiagrams.activities.StoryNode;
import org.storydriven.storydiagrams.patterns.PatternsFactory;
import org.storydriven.storydiagrams.patterns.PrimitiveVariable;
import org.storydriven.storydiagrams.patterns.StoryPattern;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class CreatePrimitveVariableCommand extends AbstractCreateNodeCommand
{
   private StoryPattern parent;
   private PrimitiveVariable primVariable;
   protected static int varNumber = 1;
   /**
    * @param label
    * @param parent
    * @param hierarchical
    * @param children
    */
   public CreatePrimitveVariableCommand(HierarchicalNode parent, Rectangle bounds)
   {
      super("create primitive variable", parent, true, null);
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
      if(this.primVariable == null)
      {
         this.primVariable = PatternsFactory.eINSTANCE.createPrimitiveVariable();
         this.modelElement = this.primVariable;
         this.primVariable.setName("prim"+ varNumber++);
      }
      
      this.primVariable.setPattern(parent);
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#undoModel()
    */
   @Override
   protected void undoModel()
   {
      this.primVariable.setPattern(null);
   }

}
