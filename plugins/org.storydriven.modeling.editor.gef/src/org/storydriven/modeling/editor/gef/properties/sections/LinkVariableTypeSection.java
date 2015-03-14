package org.storydriven.modeling.editor.gef.properties.sections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.fujaba.commons.properties.section.AbstractObjectSelectionComboSection;
import org.fujaba.commons.properties.util.SingleReferenceSelectionDialog;
import org.storydriven.modeling.editor.gef.utils.NameComparator;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.LinkVariable;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.PatternsPackage;


public class LinkVariableTypeSection extends AbstractObjectSelectionComboSection
{
   private SingleReferenceSelectionDialog dialog;


   public LinkVariableTypeSection()
   {
      dialog = new SingleReferenceSelectionDialog();
      dialog.setTitle("Link Variable Type");
   }


   @Override
   protected Object getCurrentValue()
   {
      return getElement().getTargetEnd();
   }


   @Override
   protected LinkVariable getElement()
   {
      return (LinkVariable) super.getElement();
   }


   @Override
   protected EStructuralFeature getFeature()
   {
      return PatternsPackage.eINSTANCE.getLinkVariable_TargetEnd();
   }


   @Override
   protected String getLabelText()
   {
      return "Type";
   }


   @Override
   protected Collection<EReference> getPossibilities()
   {
      return getAllValidTypes(getElement());
   }
   
   /**
    * Collects all available types for a pattern {@link PSLink link}.
    * 
    * @param link The pattern link.
    * @return Returns all valid pattern link {@link EReference types}.
    */
   private Collection<EReference> getAllValidTypes(LinkVariable link)
   {
      // get the nodes
      ObjectVariable source = link.getSource();
      AbstractVariable target = link.getTarget();

      // create list
      List<EReference> list = new ArrayList<EReference>();

      // get adequate for object --> object
      if (source != null && target != null)
      {
         // get types
         EClass sourceType = source.getClassifier();
         EClassifier targetType = target.getType();

         // collect valid references
         for (EReference ref : sourceType.getEAllReferences())
         {
            if (targetType instanceof EClass 
                  && ref.getEReferenceType().isSuperTypeOf((EClass)targetType))
            {
               list.add(ref);
            }
         }

         // sort the list
         Collections.sort(list, NameComparator.INSTANCE);
      }

      return list;
   }


   @Override
   protected String getValueText(Object element)
   {
      if(element == null)
      {
         return "";
      }
      
      // get element
      EReference refType = (EReference) element;

      // build name
      StringBuilder name = new StringBuilder();

      name.append(refType.getName());
      name.append(": ");
      EClass type = refType.getEReferenceType();
      if (type != null)
      {
         name.append(type.getName());
      }

      return name.toString();
   }


   @Override
   protected void handleAdvancedButtonClicked()
   {
      // set input
      dialog.setInput(getPossibilities(), getElement().getTargetEnd());

      // open it
      if (dialog.open() == IDialogConstants.OK_ID)
      {
         list.select(list.indexOf(getValueText(dialog.getSelected())));
         createCommand(getCurrentValue(), dialog.getSelected());
      }
   }


   @Override
   protected boolean showAdvancedButton()
   {
      return true;
   }


   @Override
   protected void createCommand(Object oldValue, Object newValue)
   {
      boolean equals = oldValue == null ? false : oldValue.equals(newValue);
      if (!equals)
      {
         EditingDomain editingDomain = getEditingDomain();
         Object value = newValue;
         if (getElements().size() == 1)
         {
            // apply the property change to single selected object
            editingDomain.getCommandStack().execute(
                  SetCommand.create(editingDomain, getElement(), getFeature(),
                        value));
         }
         else
         {
            CompoundCommand compoundCommand = new CompoundCommand();
            // apply the property change to all selected elements
            for (EObject nextObject : getElements())
            {
               compoundCommand.append(SetCommand.create(editingDomain,
                     nextObject, getFeature(), value));
            }
            editingDomain.getCommandStack().execute(compoundCommand);
         }
      }
   }
   
   
}
