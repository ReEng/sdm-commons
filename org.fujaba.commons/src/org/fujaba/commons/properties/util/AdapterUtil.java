package org.fujaba.commons.properties.util;


import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.fujaba.commons.edit.parts.IModelViewEditPart;



/**
 * Provides the adaption of a given object in an EObject.
 * 
 * @author harka
 */
public final class AdapterUtil
{

   private AdapterUtil()
   {
      // Instantiation forbidden
   }


   /**
    * Returns the EObject associated with the given object. Returns <code>null</code> if no such
    * object can be found.
    * 
    * @param object The object to look up its associated EObject.
    * @return Returns the EObject associated to the given object, <code>null</code> otherwise.
    */
   public static EObject adaptObject(Object object)
   {
      // edit part
      if (object instanceof IModelViewEditPart)
      {
         return ((IModelViewEditPart) object).getRealModel();
      }

      return (EObject) adaptObject(object, EObject.class);
   }


   private static Object adaptObject(Object object, Class<?> type)
   {
      if (object == null)
      {
         return null;
      }
      else if (type.isInstance(object))
      {
         return object;
      }
      else if (object instanceof IAdaptable)
      {
         // IAdaptable
         IAdaptable adaptable = (IAdaptable) object;
         Object adapted = adaptable.getAdapter(type);
         if (adapted != null)
         {
            return adapted;
         }
      }
      else
      {
         // registered adapter
         Object adapted = Platform.getAdapterManager().getAdapter(object, type);
         if (adapted != null)
         {
            return adapted;
         }
      }

      return null;
   }
}
