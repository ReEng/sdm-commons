/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.commands;

import org.fujaba.commons.edit.commands.AbstractDeleteEdgeCommand;
import org.fujaba.commons.notation.Edge;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.ObjectVariable;
import org.storydriven.modeling.patterns.StoryPattern;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class DeleteLinkVariableCommand extends AbstractDeleteEdgeCommand
{
   private AbstractLinkVariable link;
   private StoryPattern parent;
   private AbstractVariable targetVar;
   private ObjectVariable sourceVar;
   /**
    * @param label
    * @param edge
    */
   public DeleteLinkVariableCommand(Edge edge)
   {
      super("delete link", edge);
      this.link = (AbstractLinkVariable) edge.getModel();
      this.parent = this.link.getPattern();
      this.sourceVar = this.link.getSource();
      this.targetVar = this.link.getTarget();
      this.modelElement = this.link;
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#redoModel()
    */
   @Override
   protected void redoModel()
   {
      this.link.setSource(null);
      this.link.setTarget(null);
      this.link.setPattern(null);
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#undoModel()
    */
   @Override
   protected void undoModel()
   {
      this.link.setSource(sourceVar);
      this.link.setPattern(parent);
      this.link.setTarget(targetVar);
   }

}
