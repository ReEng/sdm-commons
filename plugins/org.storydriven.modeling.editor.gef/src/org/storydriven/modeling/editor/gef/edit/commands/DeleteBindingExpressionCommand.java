/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.commands;

import org.fujaba.commons.edit.commands.AbstractDeleteNodeCommand;
import org.fujaba.commons.notation.HierarchicalNode;
import org.fujaba.commons.notation.Node;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.patterns.AbstractVariable;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class DeleteBindingExpressionCommand extends AbstractDeleteNodeCommand
{
   private AbstractVariable parent;
   private Expression bindingExpression;

   /**
    * @param label
    * @param node
    * @param parent
    */
   public DeleteBindingExpressionCommand(Node node, HierarchicalNode parent)
   {
      super("delete binding expression", node, parent);
      this.parent = (AbstractVariable) parent.getModel();
      this.bindingExpression = (Expression) node.getModel();
      this.modelElement = this.bindingExpression;
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#redoModel()
    */
   @Override
   protected void redoModel()
   {
      this.parent.setBindingExpression(null);
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#undoModel()
    */
   @Override
   protected void undoModel()
   {
      this.parent.setBindingExpression(bindingExpression);
   }

}
