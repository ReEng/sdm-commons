package org.storydriven.modeling.expressions.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

public class ExpressionUtils
{
   public static final String EXPRESSION_LANGUAGES_EXTENSION_POINT_ID = "org.storydriven.modeling.expressionLanguagesExtension";

   public static final String EXPRESSION_LANGUAGES_EXPRESSION_LANGUAGE_ATTRIBUTE_NAME = "expressionLanguage";

   public static final String EXPRESSION_LANGUAGES_VERSION_ATTRIBUTE_NAME = "version";

   private static List<String> expressionLanguages = null;

   // TODO Extend to support different versions of the same expression language.
   public static List<String> getAvailableExpressionLanguages ()
   {
      if (expressionLanguages == null)
      {
         expressionLanguages = new ArrayList<String>();

         if (Platform.getExtensionRegistry() != null)
         {
            IConfigurationElement[] configurationElements = Platform.getExtensionRegistry()
               .getConfigurationElementsFor(EXPRESSION_LANGUAGES_EXTENSION_POINT_ID);

            for (IConfigurationElement configurationElement: configurationElements)
            {
               String s = configurationElement.getAttribute(EXPRESSION_LANGUAGES_EXPRESSION_LANGUAGE_ATTRIBUTE_NAME);

               if (s != null && !("".equals(s)))
               {
                  expressionLanguages.add(s);
               }
            }
         }
      }

      return expressionLanguages;
   }
}
