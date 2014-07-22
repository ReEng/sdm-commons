/**
 * 
 */
package org.storydriven.modeling.editor.gef.properties.sections;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.fujaba.commons.properties.section.AbstractObjectSelectionComboSection;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityCallNode;
import org.storydriven.modeling.calls.CallsPackage;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class ActivityCallNodeCalleSelectionSection extends AbstractObjectSelectionComboSection
{

   @Override
   protected ActivityCallNode getElement()
   {
      return (ActivityCallNode)super.getElement();
   }


   /**
    * @see org.fujaba.commons.properties.section.AbstractObjectSelectionComboSection#getCurrentValue()
    */
   @Override
   protected Object getCurrentValue()
   {
      return getElement().getCallee();
   }


   /**
    * @see org.fujaba.commons.properties.section.AbstractObjectSelectionComboSection#getPossibilities()
    */
   @Override
   protected Collection<Activity> getPossibilities()
   {
      ArrayList<Activity> possibilities = new ArrayList<Activity>();
      TreeIterator<Notifier> iter = getElement().eResource().getResourceSet().getAllContents();
      while(iter.hasNext())
      {
         Notifier n = iter.next();
         if(n instanceof Activity)
         {
            possibilities.add((Activity) n);
         }
      }
      return possibilities;
   }


   /**
    * @see org.fujaba.commons.properties.section.AbstractObjectSelectionComboSection#getValueText(java.lang.Object)
    */
   @Override
   protected String getValueText(Object element)
   {
      if(element == null)
      {
         return "";
      }
      
      if(element instanceof Activity)
      {
         Activity activity = (Activity)element;
         if(activity.getOwningOperation() != null
               && activity.getOwningOperation().getOperation() != null)
         {
            EClass parent = activity.getOwningOperation().getOperation().getEContainingClass();
            EOperation operation = activity.getOwningOperation().getOperation();
            String operationName = operation.getName()+ "(";
            for (EParameter param : operation.getEParameters())
            {
               operationName += param.getEType().getName() + " " + param.getName() + ",";
            }
            
            int  lastComma = operationName.lastIndexOf(",");
            if(lastComma > -1)
            {
               operationName = operationName.substring(0, lastComma);
            }
            operationName += ")";
            
            if(operation.getEType() != null)
            {
               operationName += " : " + operation.getEType().getName();
            }
            return parent.getName() + "." + operationName;
         }
         else if(activity.getName() != null
               && !activity.getName().equals(""))
         {
            return activity.getName();
         }
      }
      return null;
   }


   /**
    * @see org.fujaba.commons.properties.section.AbstractSection#getFeature()
    */
   @Override
   protected EStructuralFeature getFeature()
   {
      return CallsPackage.Literals.INVOCATION__CALLEE;
   }


   /**
    * @see org.fujaba.commons.properties.section.AbstractSection#getLabelText()
    */
   @Override
   protected String getLabelText()
   {
      return "Callee Activity";
   }

}
