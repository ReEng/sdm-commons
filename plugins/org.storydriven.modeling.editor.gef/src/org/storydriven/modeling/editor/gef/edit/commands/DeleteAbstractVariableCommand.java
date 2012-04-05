/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.commands;

import org.fujaba.commons.edit.commands.AbstractDeleteNodeCommand;
import org.fujaba.commons.notation.HierarchicalNode;
import org.fujaba.commons.notation.Node;
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.StoryPattern;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class DeleteAbstractVariableCommand extends AbstractDeleteNodeCommand
{
   private StoryPattern parent;
   private AbstractVariable variable;
   /**
    * @param label
    * @param node
    * @param parent
    */
   public DeleteAbstractVariableCommand(Node node, HierarchicalNode parent)
   {
      super("delete variable", node, parent);
      this.variable = (AbstractVariable) node.getModel();
      this.parent = this.variable.getPattern();
      this.modelElement = this.variable;
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#redoModel()
    */
   @Override
   protected void redoModel()
   {
      this.variable.setPattern(null);
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#undoModel()
    */
   @Override
   protected void undoModel()
   {
      this.variable.setPattern(parent);
   }

}
