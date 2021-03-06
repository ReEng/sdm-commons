package org.storydriven.modeling.editor.gef.properties;


import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.fujaba.commons.properties.util.AdapterUtil;
import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityFinalNode;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.InitialNode;
import org.storydriven.storydiagrams.activities.JunctionNode;
import org.storydriven.storydiagrams.patterns.Constraint;
import org.storydriven.storydiagrams.patterns.LinkVariable;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.Path;
import org.storydriven.storydiagrams.util.StorydiagramsAdapterFactory;


public class SDMTabbedPropertiesLabelProvider extends LabelProvider
{
   private static AdapterFactoryLabelProvider provider;


   private static Image getElementImage(Object object)
   {
      // get adapted element
      EObject element = AdapterUtil.adaptObject(object);

      // get provider
      if (provider == null)
      {
         provider = new AdapterFactoryLabelProvider(
               new StorydiagramsAdapterFactory());
      }

      // let the provider return the image
      return provider.getImage(element);
   }


   private static String getElementText(Object object)
   {
      // get adapted element
      EObject element = AdapterUtil.adaptObject(object);

      if (element instanceof Activity)
      {
         return "Activity";
      }
      
      if (element instanceof InitialNode)
      {
         return "Start Node";
      }
      
      if (element instanceof ActivityFinalNode)
      {
         return "Stop Node";
      }
      
      if (element instanceof JunctionNode)
      {
         return "Junction Node";
      }

      if (element instanceof ActivityNode)
      {
         return "Activity Node";
      }

      if (element instanceof ObjectVariable)
      {
         return "Object Variable";
      }

      if (element instanceof LinkVariable)
      {
         return "Link Variable";
      }

      if (element instanceof ActivityEdge)
      {
         return "Activity Transition";
      }

      if (element instanceof Path)
      {
         return "Path";
      }
      
      if (element instanceof Constraint)
      {
         return "Constraint";
      }
      
      if (element instanceof Expression)
      {
         return "Expression";
      }

      return object.toString();
   }


   @Override
   public Image getImage(Object object)
   {
      // check for structured selection
      if (object instanceof IStructuredSelection)
      {
         // get selected
         List<?> elements = ((IStructuredSelection) object).toList();

         // when only one element is selected
         if (elements.size() == 1)
         {
            return getElementImage(elements.get(0));
         }

         // otherwise return null
         return null;
      }

      return getElementImage(object);
   }


   @Override
   public String getText(Object object)
   {
      // check for structured selection
      if (object instanceof IStructuredSelection)
      {
         // get selected
         List<?> elements = ((IStructuredSelection) object).toList();

         // when only one element is selected
         if (elements.size() == 1)
         {
            return getElementText(elements.get(0));
         }

         // otherwise return the count
         return elements.size() + " items selected";
      }

      return object.toString();
   }
}
