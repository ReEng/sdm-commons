/**
 * 
 */
package org.storydriven.modeling.editor.gef.properties.sections;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.StopNode;
import org.storydriven.modeling.expressions.Expression;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class StopNodeReturnExpressionSection extends ExpressionSection
{

   /**
    * @see org.fujaba.commons.properties.section.AbstractSection#getElement()
    */
   @Override
   protected StopNode getElement()
   {
      return (StopNode)super.getElement();
   }


   /**
    * @see org.storydriven.modeling.editor.gef.properties.sections.ExpressionSection#getExpression()
    */
   @Override
   protected Expression getExpression()
   {
      return getElement().getReturnValue();
   }


   /**
    * @see org.fujaba.commons.properties.section.AbstractTextSection#getTooltip()
    */
   @Override
   protected String getTooltip()
   {
      return "Return Value";
   }


   /**
    * @see org.fujaba.commons.properties.section.AbstractSection#getFeature()
    */
   @Override
   protected EStructuralFeature getFeature()
   {
      return ActivitiesPackage.eINSTANCE.getStopNode_ReturnValues();
   }


   /**
    * @see org.fujaba.commons.properties.section.AbstractSection#getLabelText()
    */
   @Override
   protected String getLabelText()
   {
      return "Return Value";
   }


   /**
    * @see org.fujaba.commons.properties.section.AbstractSection#createCommand(java.lang.Object, java.lang.Object)
    */
   @Override
   protected void createCommand(Object oldValue, Object newValue)
   {
      boolean equals = oldValue == null ? false : oldValue.equals(newValue);
      if (!equals)
      {
         EditingDomain editingDomain = getEditingDomain();
         CompoundCommand cmd = new CompoundCommand();
         if(oldValue != null)
         {
            cmd.append(RemoveCommand.create(editingDomain, getElement(), getFeature(), oldValue));
         }
         
         if(newValue != null)
         {
            cmd.append(AddCommand.create(editingDomain, getElement(), getFeature(), newValue));
         }
         editingDomain.getCommandStack().execute(cmd.unwrap());
      }
   }

}
