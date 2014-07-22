package org.fujaba.commons.properties.section;


/**
 * An abstract implementation of a section for a field with a String property value.
 */
public abstract class AbstractStringSection extends AbstractTextSection
{
   @Override
   protected String getFeatureAsString()
   {
      String string = getElement() == null ? null : (String) getElement().eGet(
            getFeature());
      if (string == null)
      {
         return ""; //$NON-NLS-1$
      }
      return string;
   }


   @Override
   protected Object getNewFeatureValue(String text)
   {
      return text;
   }


   @Override
   protected Object getOldFeatureValue()
   {
      return getFeatureAsString();
   }
}
