package org.storydriven.modeling.editor.gef.edit.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.fujaba.commons.edit.commands.AbstractCreateNodeCommand;
import org.fujaba.commons.notation.HierarchicalNode;
import org.storydriven.modeling.activities.StoryNode;
import org.storydriven.modeling.expressions.ExpressionsFactory;
import org.storydriven.modeling.expressions.TextualExpression;
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.Constraint;
import org.storydriven.modeling.patterns.PatternsFactory;
import org.storydriven.modeling.patterns.StoryPattern;

public class CreateConstraintCommand extends AbstractCreateNodeCommand
{
   private HierarchicalNode parent;
   private Constraint constraint;

   public CreateConstraintCommand(HierarchicalNode parent, Rectangle bounds)
   {
      super("create constraint", parent, false, null);
      this.parent = parent;
      setMinHeight(15);
      setMinWidth(50);
      setBounds(bounds);
   }

   @Override
   protected void redoModel()
   {
      if(this.constraint == null)
      {
         this.constraint = PatternsFactory.eINSTANCE.createConstraint();
         TextualExpression expr = ExpressionsFactory.eINSTANCE.createTextualExpression();
         expr.setLanguage("OCL");
         this.constraint.setConstraintExpression(expr);
         
         this.modelElement = this.constraint;
      }
      
      if(parent.getModel() instanceof AbstractVariable)
      {
         this.constraint.setObjectVariable((AbstractVariable)this.parent.getModel());
      }
      else if(parent.getModel() instanceof StoryNode)
      {
         StoryPattern pattern = ((StoryNode)parent.getModel()).getStoryPattern();
         this.constraint.setPattern(pattern);
      }
      
   }

   @Override
   protected void undoModel()
   {
      this.constraint.setPattern(null);
      this.constraint.setObjectVariable(null);
   }

}
