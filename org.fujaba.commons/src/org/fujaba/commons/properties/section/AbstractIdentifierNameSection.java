package org.fujaba.commons.properties.section;


import org.eclipse.emf.ecore.EStructuralFeature;
import org.fujaba.commons.identifier.Identifier;
import org.fujaba.commons.identifier.IdentifierPackage;



public abstract class AbstractIdentifierNameSection extends
      AbstractStringSection
{

   @Override
   protected Identifier getElement()
   {
      return (Identifier) super.getElement();
   }


   @Override
   protected EStructuralFeature getFeature()
   {
      return IdentifierPackage.Literals.IDENTIFIER__NAME;
   }


   @Override
   protected String getLabelText()
   {
      return "Name";
   }
}
