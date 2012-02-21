/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.commands;

import org.fujaba.commons.edit.commands.AbstractCreateEdgeCommand;
import org.fujaba.commons.notation.Node;
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.LinkVariable;
import org.storydriven.modeling.patterns.ObjectVariable;
import org.storydriven.modeling.patterns.PatternsFactory;
import org.storydriven.modeling.patterns.StoryPattern;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class CreateLinkVariableCommand extends AbstractCreateEdgeCommand
{
   private StoryPattern parent;
   private LinkVariable link;
   private AbstractVariable targetVar;
   private ObjectVariable sourceVar;
   /**
    * @param label
    * @param source
    */
   public CreateLinkVariableCommand(Node source)
   {
      super("create link", source);
      this.sourceVar = (ObjectVariable) source.getModel();
      this.parent = this.sourceVar.getPattern(); 
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#redoModel()
    */
   @Override
   protected void redoModel()
   {
      this.targetVar = (AbstractVariable) this.getTarget().getModel();

      if(this.link == null)
      {
         this.link = PatternsFactory.eINSTANCE.createLinkVariable();
         this.modelElement = this.link;
      }
      
      this.link.setSource(sourceVar);
      this.link.setTarget(targetVar);
      this.link.setPattern(parent);
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#undoModel()
    */
   @Override
   protected void undoModel()
   {
      this.link.setSource(null);
      this.link.setTarget(null);
      this.link.setPattern(null);
   }

}
