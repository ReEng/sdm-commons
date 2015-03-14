/**
 * 
 */
package org.storydriven.modeling.editor.gef.properties.sections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.ActivityEdge;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class ActivityEdgeGuardExpressionSection extends ExpressionSection
{

   /**
    * @see org.fujaba.commons.properties.section.AbstractSection#getElement()
    */
   @Override
   protected ActivityEdge getElement()
   {
      return (ActivityEdge)super.getElement();
   }
   
   /**
    * @see org.storydriven.modeling.editor.gef.properties.sections.ExpressionSection#getExpression()
    */
   @Override
   protected Expression getExpression()
   {
      return getElement().getGuardExpression();
   }


   /**
    * @see org.fujaba.commons.properties.section.AbstractTextSection#getTooltip()
    */
   @Override
   protected String getTooltip()
   {
      return "Guard Expression";
   }


   /**
    * @see org.fujaba.commons.properties.section.AbstractSection#getFeature()
    */
   @Override
   protected EStructuralFeature getFeature()
   {
      return ActivitiesPackage.eINSTANCE.getActivityEdge_GuardExpression();
   }


   /**
    * @see org.fujaba.commons.properties.section.AbstractSection#getLabelText()
    */
   @Override
   protected String getLabelText()
   {
      return "Guard Expression";
   }

}
