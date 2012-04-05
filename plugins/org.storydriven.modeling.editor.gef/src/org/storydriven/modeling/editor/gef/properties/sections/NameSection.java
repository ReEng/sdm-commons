/**
 * 
 */
package org.storydriven.modeling.editor.gef.properties.sections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.fujaba.commons.properties.section.AbstractTextSection;
import org.storydriven.modeling.NamedElement;
import org.storydriven.modeling.SDMPackage;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class NameSection extends AbstractTextSection
{

   @Override
   protected NamedElement getElement()
   {
      return (NamedElement)super.getElement();
   }

   /**
    * @see org.fujaba.commons.properties.section.AbstractTextSection#getErrorMessage()
    */
   @Override
   protected String getErrorMessage()
   {
      return null;
   }

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


   /**
    * @see org.fujaba.commons.properties.section.AbstractTextSection#getTooltip()
    */
   @Override
   protected String getTooltip()
   {
      return "The element's name";
   }


   /**
    * @see org.fujaba.commons.properties.section.AbstractSection#getFeature()
    */
   @Override
   protected EStructuralFeature getFeature()
   {
      return SDMPackage.Literals.NAMED_ELEMENT__NAME;
   }


   /**
    * @see org.fujaba.commons.properties.section.AbstractSection#getLabelText()
    */
   @Override
   protected String getLabelText()
   {
      return "Name";
   }

}
