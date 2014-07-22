/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.commands;

import org.eclipse.emf.ecore.EObject;
import org.fujaba.commons.edit.commands.AbstractDeleteNodeCommand;
import org.fujaba.commons.notation.HierarchicalNode;
import org.fujaba.commons.notation.Node;
import org.storydriven.modeling.activities.StoryNode;
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.Constraint;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class DeleteConstraintCommand extends AbstractDeleteNodeCommand
{
   private Constraint constr;
   private EObject parent;

   /**
    * @param label
    * @param node
    * @param parent
    */
   public DeleteConstraintCommand(Node node, HierarchicalNode parent)
   {
      super("delete constraint", node, parent);
      this.modelElement = node.getModel();
      this.constr = (Constraint) node.getModel();
      this.parent = parent.getModel();
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#redoModel()
    */
   @Override
   protected void redoModel()
   {
      this.constr.setObjectVariable(null);
      this.constr.setPattern(null);
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#undoModel()
    */
   @Override
   protected void undoModel()
   {
      if(this.parent instanceof AbstractVariable)
      {
         this.constr.setObjectVariable((AbstractVariable) this.parent);
      }
      else if(this.parent instanceof StoryNode)
      {
         this.constr.setPattern(((StoryNode)this.parent).getStoryPattern());
      }

   }

}

