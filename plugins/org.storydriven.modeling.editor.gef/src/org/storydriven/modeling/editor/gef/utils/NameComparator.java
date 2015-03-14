/**
 * 
 */
package org.storydriven.modeling.editor.gef.utils;

import java.util.Comparator;

import org.eclipse.emf.ecore.ENamedElement;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class NameComparator
{
   public final static Comparator<ENamedElement> INSTANCE = new Comparator<ENamedElement>()
   {
      @Override
      public int compare(ENamedElement one, ENamedElement two)
      {
         // both null
         if (one == null && two == null)
         {
            return 0;
         }

         // first null
         if (one == null)
         {
            return -1;
         }

         // second null
         if (two == null)
         {
            return 1;
         }

         return one.getName().compareTo(two.getName());
      }
   };
}
