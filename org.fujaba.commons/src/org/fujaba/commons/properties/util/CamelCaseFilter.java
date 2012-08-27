package org.fujaba.commons.properties.util;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.jface.viewers.TreeNode;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


public class CamelCaseFilter extends ViewerFilter
{
   private static final String ANY = "\\*"; //$NON-NLS-1$

   private static final String ANY_STAR = ".*?"; //$NON-NLS-1$

   private static final String REGEX_BEGIN = "\\b("; //$NON-NLS-1$

   private static final String REGEX_END = ".*?)\\b"; //$NON-NLS-1$

   private static final String CC_BEFORE = "([A-Z][^A-Z]*)"; //$NON-NLS-1$

   private static final String CC_AFTER = "$1[^A-Z]*"; //$NON-NLS-1$


   private static boolean isMatching(String query, String text)
   {
      return isMatchingPrefix(query, text) || isMatchingCamelCase(query, text);
   }


   private static boolean isMatchingPrefix(String query, String text)
   {
      return text.toLowerCase().startsWith(query.toLowerCase());
   }


   private static boolean isMatchingCamelCase(String query, String text)
   {
      // replace to match directly
      query = query.replaceAll(ANY, ANY_STAR);

      // create regular expression
      StringBuilder regex = new StringBuilder();

      regex.append(REGEX_BEGIN);
      regex.append(query.replaceAll(CC_BEFORE, CC_AFTER));
      regex.append(REGEX_END);

      // create pattern
      Pattern pattern = Pattern.compile(regex.toString());

      // create matcher
      Matcher matcher = pattern.matcher(text);

      // return it
      return matcher.find();
   }


   private String query;


   @Override
   public boolean select(Viewer viewer, Object parent, Object element)
   {
      if (element instanceof TreeNode)
      {
         if (query != null && !query.trim().isEmpty())
         {
            // get both texts
            String name = ((ENamedElement) ((TreeNode) element).getValue())
                  .getName();

            // check children
            if (((TreeNode) element).getChildren() != null)
            {
               for (TreeNode child : ((TreeNode) element).getChildren())
               {
                  // check the child
                  if (select(viewer, parent, child))
                  {
                     return true;
                  }
               }
            }

            return isMatching(query, name);
         }
         else
         {
            return true;
         }
      }

      return false;
   }


   public void setQuery(String query)
   {
      this.query = query;
   }
}
