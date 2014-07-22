package org.fujaba.commons.properties.section;


import java.util.regex.Pattern;

public abstract class AbstractDoubleSection extends AbstractTextSection
{

   /**
    * Predefined string pattern value for decimal, absolute with '-' and exp. notation : -25.36e-6
    */
   public static final String EXP_NUMERIC_PATTERN = "^[-\\d][\\d]*\\.?[\\d]*((e|E)?-?[\\d]*)"; //$NON-NLS-1$

   public static final Pattern DOUBLE_PATTERN = Pattern
         .compile(EXP_NUMERIC_PATTERN);


   @Override
   protected String getFeatureAsString()
   {
      return getFeatureDouble().toString();
   }


   protected abstract Double getFeatureDouble();


   @Override
   protected Object getNewFeatureValue(String newText)
   {
      if (newText == null || newText.isEmpty())
      {
         return null;
      }

      return new Double(Double.parseDouble(newText));
   }

   @Override
   protected Object getOldFeatureValue()
   {
      return getFeatureDouble();
   }


   @Override
   protected boolean isTextValid()
   {
      return DOUBLE_PATTERN.matcher(getText().getText()).matches();
   }
}
