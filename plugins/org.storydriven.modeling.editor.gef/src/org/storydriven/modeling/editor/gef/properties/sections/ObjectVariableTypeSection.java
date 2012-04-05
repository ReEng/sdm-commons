package org.storydriven.modeling.editor.gef.properties.sections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.fujaba.commons.properties.section.AbstractObjectSelectionComboSection;
import org.fujaba.commons.properties.util.SingleTypeSelectionDialog;
import org.storydriven.modeling.editor.gef.utils.ModelHelper;
import org.storydriven.modeling.editor.gef.utils.NameComparator;
import org.storydriven.modeling.patterns.ObjectVariable;
import org.storydriven.modeling.patterns.PatternsPackage;


public class ObjectVariableTypeSection extends AbstractObjectSelectionComboSection
{
   private SingleTypeSelectionDialog dialog;


   public ObjectVariableTypeSection()
   {
      super();

      dialog = new SingleTypeSelectionDialog();
      dialog.setTitle("Variable Type");
   }


   @Override
   protected Object getCurrentValue()
   {
      return getElement().getClassifier();
   }


   @Override
   protected ObjectVariable getElement()
   {
      return (ObjectVariable) super.getElement();
   }


   @Override
   protected EStructuralFeature getFeature()
   {
      return PatternsPackage.eINSTANCE.getObjectVariable_Classifier();
   }


   @Override
   protected String getLabelText()
   {
      return "Type";
   }


   /**
    * @see org.fujaba.commons.properties.section.AbstractObjectSelectionComboSection#getPossibilities()
    */
   @Override
   protected Collection<EClassifier> getPossibilities()
   {
      return getAllEClassifier();
   }


   @Override
   protected String getValueText(Object element)
   {
      if(element == null)
      {
         return "";
      }
      
      // get type
      EClass type = (EClass) element;
      String name = type.getName();

      // create the full text
      StringBuilder text = new StringBuilder(name);

      if(type.getInstanceClass() != null)
      {
         text.append(" [");
         text.append(type.getInstanceClass().getName());
         text.delete(text.length() - name.length() - 1, text.length());
         text.append("]");
      }
      return text.toString();
   }


   @Override
   protected void handleAdvancedButtonClicked()
   {
      Collection<EClassifier> input = getPossibilities();

      dialog.setInput(input, getElement().getType());

      // open it
      if (dialog.open() == IDialogConstants.OK_ID)
      {
         list.select(list.indexOf(getValueText(dialog.getSelected())));
         createCommand(getCurrentValue(), dialog.getSelected());
      }
   }
   
   private Collection<EClassifier> getAllEClassifier()
   {
      ArrayList<EClassifier> types = new ArrayList<EClassifier>();
      
      Collection<EObject> list = ModelHelper.getReachableObjectsOfType(getElement(), EcorePackage.eINSTANCE.getEClass());
      
      
      for(EObject o : list)
      {
         if(o instanceof EClass)
         {
            types.add((EClassifier) o);
         }
      }
      Collections.sort(types, NameComparator.INSTANCE);
      return types;
   }


   @Override
   protected boolean showAdvancedButton()
   {
      return true;
   }
}
