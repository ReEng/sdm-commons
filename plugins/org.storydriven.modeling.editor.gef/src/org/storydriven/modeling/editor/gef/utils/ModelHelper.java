/**
 * 
 */
package org.storydriven.modeling.editor.gef.utils;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.storydriven.core.Extension;
import org.storydriven.core.util.EModelElementOperations;
import org.storydriven.modeling.editor.gef.editor.SDMEditor;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.OperationExtension;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public abstract class ModelHelper
{
	public static Activity getActivityOfEOperation(EOperation operation)
	{
		Extension extension = EModelElementOperations.getExtension(operation,
				ActivitiesPackage.eINSTANCE.getOperationExtension());
		if (extension != null && extension instanceof OperationExtension)
		{
			OperationExtension ext = (OperationExtension) extension;
			return ext.getOwnedActivity();
		}
		return null;
	}
	 
   public static Collection<EObject> getReachableObjectsOfType(EObject object, EClass type)
   {
      return ItemPropertyDescriptor.getReachableObjectsOfType((EObject) object, EcorePackage.eINSTANCE.getEClass());
   }
   
   public static StringBuilder getText(EClassifier element)
   {
      StringBuilder text = new StringBuilder();

      if (element != null)
      {
         // name
         text.append(element.getName());

         // type parameters
         List<ETypeParameter> parameters = element.getETypeParameters();
         if (!parameters.isEmpty())
         {
            int size = parameters.size();
            int current = 0;
            text.append("<"); //$NON-NLS-1$
            for (ETypeParameter parameter : parameters)
            {
               text.append(parameter.getName());
               current++;
               if (current < size)
               {
                  text.append(","); //$NON-NLS-1$
               }
            }
            text.append(">"); //$NON-NLS-1$
         }
      }

      return text;
   }
}
