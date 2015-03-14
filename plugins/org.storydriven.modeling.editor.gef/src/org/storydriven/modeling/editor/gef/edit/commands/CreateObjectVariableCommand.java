/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.fujaba.commons.edit.commands.AbstractCreateNodeCommand;
import org.fujaba.commons.notation.HierarchicalNode;
import org.storydriven.storydiagrams.activities.StoryNode;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.PatternsFactory;
import org.storydriven.storydiagrams.patterns.StoryPattern;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class CreateObjectVariableCommand extends AbstractCreateNodeCommand
{
   private StoryPattern parent;
   private ObjectVariable objectVariable;
   protected static int varNumber = 1;
   
   /**
    * @param label
    * @param parent
    * @param hierarchical
    * @param children
    */
   public CreateObjectVariableCommand(HierarchicalNode parent, Rectangle bounds)
   {
      super("create object", parent, true, null);  
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
      if(this.objectVariable == null)
      {
         this.objectVariable = PatternsFactory.eINSTANCE.createObjectVariable();
         this.modelElement = this.objectVariable;
         this.objectVariable.setName("obj"+ varNumber++);
      }
      
      this.objectVariable.setPattern(parent);
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#undoModel()
    */
   @Override
   protected void undoModel()
   {
      this.objectVariable.setPattern(null);
   }

}
