/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.commands;

import org.fujaba.commons.edit.commands.AbstractCreateNodeCommand;
import org.fujaba.commons.notation.HierarchicalNode;
import org.storydriven.modeling.expressions.ExpressionsFactory;
import org.storydriven.modeling.expressions.TextualExpression;
import org.storydriven.modeling.patterns.AbstractVariable;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class CreateBindingExpressionCommand extends AbstractCreateNodeCommand
{

   private AbstractVariable parent;
   private TextualExpression bindingExpression; 
   /**
    * @param label
    * @param parent
    * @param hierarchical
    * @param children
    */
   public CreateBindingExpressionCommand(HierarchicalNode parent)
   {
      super("create binding expression", parent, false, null);
      this.parent = (AbstractVariable) parent.getModel();
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#redoModel()
    */
   @Override
   protected void redoModel()
   {
      if(bindingExpression == null)
      {
         bindingExpression = ExpressionsFactory.eINSTANCE.createTextualExpression();
         bindingExpression.setLanguage("OCL");
         this.modelElement = this.bindingExpression;
      }
      parent.setBindingExpression(bindingExpression);
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#undoModel()
    */
   @Override
   protected void undoModel()
   {
      parent.setBindingExpression(null);
   }

}
